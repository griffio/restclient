package griffio.gson;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.nio.charset.Charset;

class JsonResource {

  static String fixture(String filename) throws IOException {
    return fixture(filename, Charsets.UTF_8);
  }

  private static String fixture(String filename, Charset charset) throws IOException {
    return Resources.toString(Resources.getResource(filename), charset).trim();
  }
}
