package Respaldo.Restauración;

import java.io.InputStream;

/**
 *
 * @author jaime
 */
public class Error extends Thread {
          private final InputStream is;
	
          public Error(InputStream is) {
                    this.is = is;
          }
	
            public void run() {
                    try {
                            byte[] buffer = new byte[1000];
                            int leido = is.read(buffer);
                            while (leido > 0) {
                                    String texto = new String(buffer, 0, leido);
                                    System.out.print(texto);
                                    leido = is.read(buffer);
                            }
                            } catch (Exception e) {
                            System.err.println(e.toString());
                    }
            }
}
