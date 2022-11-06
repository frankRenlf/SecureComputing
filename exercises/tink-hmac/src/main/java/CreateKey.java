import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.JsonKeysetWriter;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.KeyTemplates;
import com.google.crypto.tink.mac.MacConfig;

/**
 * Creates an HMAC key.
 */
public class CreateKey {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage: java CreateKey <filename>");
            System.exit(1);
        }

        // Configure Tink to use MAC primitives

        MacConfig.register();

        // Get key material suitable for use with HMAC-SHA-256

        KeysetHandle key = KeysetHandle.generateNew(KeyTemplates.get("HMAC_SHA256_256BITTAG"));

        // Write key details to specified output file

        CleartextKeysetHandle.write(key, JsonKeysetWriter.withPath(args[0]));
    }
}
