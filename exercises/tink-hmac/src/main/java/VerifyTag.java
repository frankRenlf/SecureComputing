import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;

import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.JsonKeysetReader;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.mac.MacConfig;

/**
 * Verifies an authentication tag for a given file, using the given key.
 */
public class VerifyTag {
  public static void main(String[] args) throws Exception {
    if (args.length != 3) {
      System.err.println("Usage: java VerifyTag <keyfile> <datafile> <tagfile>");
      System.exit(1);
    }

    // Configure Tink to use MAC primitives

    MacConfig.register();

    // Load key details from file specified on command line

    // Read data & tag from files specified on command line

    // Verify tag

  }
}
