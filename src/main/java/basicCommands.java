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
        ProcessBuilder PB = new ProcessBuilder();
        String[] Pathnames = dir.list();

        while(true) {

                System.out.print(dir + " Prompt$ ");
                String Commandline = br.readLine();
                if (!Commandline.equals("")) {



                    if (Commandline.contains("ls")) {
                        for (String pathnames: Pathnames){
                            System.out.println(pathnames);
                        }
                    }

                    if (Commandline.contains("cat")) {
                    }
                }
            }
        }
    }

