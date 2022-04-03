import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;



public class basicCommands {

    public static void main(String[] args) throws IOException {



        File dir = new File(System.getProperty("user.home"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ProcessBuilder PB = new ProcessBuilder();
        PB.directory(dir);

        String CommandLine;


        while (true) {


            System.out.print(dir + " Prompt$ ");
            CommandLine = br.readLine();
            String[] mycommands = CommandLine.split(" ");//stores all commands
            if (CommandLine.equals("")) {// so it can continue when the user press enter
                continue;
            }
            try {


                if (CommandLine.contains("quit")) {
                    System.exit(0);

                }
                if (CommandLine.contains("help")) {
                    System.out.println("ls --List the current directory \n");
                    System.out.println("mkdir --Creates a new directory\n ");
                    System.out.println("rmdir --Removes a directory\n ");
                    System.out.println("ps -Report a snapshot of the current processes \n");
                    System.out.println("which --List the current directory \n");
                    System.out.println("mv --Lists the current directory \n");
                    System.out.println("help --shows the commands\n");
                    System.out.println("showDir --Show the current directory \n");
                    System.out.println("whoAmI -Shows the current username \n");
                    System.out.println("move --Copy file from src to target \n");
                    System.out.println("cd --Change the current directory \n");
                }
                if (CommandLine.contains("showDir")) {
                    File current = new File(System.getProperty("user.dir"));
                    PB.directory(current);
                    System.out.println(current);


                }
                if(CommandLine.contains("move")){
                    File mv = new File("/Users/ziadahmed/System-software/src/main/java");

                    // renaming the file and moving it to a new location
                    if(mv.renameTo
                            (new File("/Users/ziadahmed/System-software/target")))
                    {

                        mv.delete();
                        System.out.println("File moved successfully");
                    }
                    else
                    {
                        System.out.println("Failed to move the file");
                    }


                }

                if (CommandLine.contains("whoAmI")) {

                    String name;
                    name = System.getProperty("user.name");
                    System.out.println(name);
                }





                PB.command(mycommands);
                // all commands typed will be stored in an array
                Process pro = PB.start();
                BufferedReader bro = new BufferedReader(new InputStreamReader(pro.getInputStream()));

                String l;
                while ((l = bro.readLine()) != null) {
                    System.out.println(l);
                }

                bro.close();
            } catch (Exception l) {
                System.out.println(l.getMessage());

            }

        }


    }
}
