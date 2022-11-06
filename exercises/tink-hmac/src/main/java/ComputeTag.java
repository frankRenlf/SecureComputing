import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.JsonKeysetReader;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.mac.MacConfig;

/**
 * Computes an authentication tag for the contents of a given file,
 * using the given key.
 */
public class ComputeTag {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.err.println("Usage: java ComputeTag <keyfile> <datafile> <tagfile>");
            System.exit(1);
        }

        // Configure Tink to use MAC primitives

        MacConfig.register();

        // Load key details from file specified on command line
        KeysetHandle key = CleartextKeysetHandle.read(
                JsonKeysetReader.withPath(args[0])
        );
        // Read data to be tagged from file specified on command line
        byte[] data = Files.readAllBytes(Paths.get(args[1]));
        // Compute tag for the data
        Mac primitive = key.getPrimitive(Mac.class);
        byte[] tag = primitive.computeMac(data);
        // Write tag to file specified on command line
        Files.write(Paths.get(args[2]), tag);
    }
}
