import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class basicCommands {

    public static void main(String[] args) throws IOException {
        List<String> BuiltIn = new ArrayList<>();
        BuiltIn.add("help");
        BuiltIn.add("showDir");




        File dir = new File(System.getProperty("user.home"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ProcessBuilder PB = new ProcessBuilder(BuiltIn);
        PB.directory(dir);

        String CommandLine;



        while (true) {


            System.out.print(dir + " Prompt$ ");
            CommandLine = br.readLine();
            String[] mycommands = CommandLine.split(" ");//stores all commands
            if (CommandLine.equals("")){
                continue;
            }
            try{
               // BuiltINs BuiltINsobject = new BuiltINs();
                //
                // BuiltINsobject.builtin();

                if(CommandLine.contains("quit")){
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



                PB.command(BuiltIn);
                PB.command(mycommands);
                // all commands typed will be
                Process pro = PB.start();
                BufferedReader bro = new BufferedReader(new InputStreamReader(pro.getInputStream()));

                String l;
                while ((l = bro.readLine()) != null) {
                    System.out.println(l);
                }
                bro.close();
            }
            catch (Exception l){
                System.out.println(l.getMessage());

            }

        }



    }
//BuiltIn Commands
    public void builtin()throws IOException {
        File dir2 = new File(System.getProperty("user.home"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String CommandLine;


        while (true) {


            System.out.print(dir2 + " Prompt$ ");
            CommandLine = br.readLine();

            if (CommandLine.equals("")) {
                continue;
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
                System.out.println(dir2);

            }

            if(CommandLine.contains("whoAmI")){
                String name;
                name = System.getProperty("user.name");
                System.out.println(name);
            }

            if(CommandLine.contains("cd")){

            }


        }


    }

}



