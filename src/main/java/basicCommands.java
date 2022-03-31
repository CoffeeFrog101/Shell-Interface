import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicCommands {
    public basicCommands() {
    }

    public static void main(String[] args) throws IOException {
        File dir = new File(System.getProperty("user.home"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        new ProcessBuilder(new String[0]);
        String[] Pathnames = dir.list();

        while(true) {

                System.out.print(dir + " Prompt$ ");
                String Commandline = br.readLine();
                if (!Commandline.equals("")) {
                    if (Commandline.contains("ls")) {
                        String[] var6 = Pathnames;
                        int var7 = Pathnames.length;

                        for(int var8 = 0; var8 < var7; ++var8) {
                            String pathnames = var6[var8];
                            System.out.println(pathnames);
                        }
                    }

                    if (Commandline.contains("cat")) {
                    }
                }
            }
        }
    }

