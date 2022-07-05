package nivel1.ejercicio3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> capitalCities = readCountries();
        String name;
        String capitalCountryUser;
        int points = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre para empezar a jugar:");
        name = sc.nextLine();
        List<String> ListofCountries = new ArrayList<>(capitalCities.keySet());
        //i need to convert the keyset into arraylist in order to be able to get an INDEX. SETS DONT HAVE INDEX
        for (int i = 0; i < 10; i++) {
            //Mathrandom gives a double between 0.0 and 1.0, so we need to cast to integer the right part.
            int countryIndex = (int) (ListofCountries.size() * Math.random());
            String countryName = ListofCountries.get(countryIndex);
            System.out.println("Debes adivinar la capital del pais " + countryName + " :");
            capitalCountryUser = sc.nextLine();

//map.get(key) will bring the value(capital is an object of class String)
            if (capitalCities.get(countryName).equals(capitalCountryUser)) {
                points++;
            }
        }
        System.out.println("Hola " + name + " has sumado " + points + " puntos.");
        writetoFile(name,points); //doesn't have a return(void)

    }

    public static Map<String, String> readCountries() throws IOException {
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("countries.txt");
        //search the file of name countries.txt among all the files in the project and store it in inputStream variable.
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);
        String readLine = br.readLine();
        //stream, way of reading data, reading until it ends. Look at the definition of readLine()
        Map<String, String> capitalCities = new HashMap<String, String>();
        //variable can be Map but object needs to know if it is a hashmap
        //doesn't care about the order
        while (readLine != null) {
            //null because String is a class, and every variable of class type can be null when there is no object.
            //at the end of the txt there is no more lines to read, therefore no more objects, then becomes null

//the first readLine is outside of the loop so its the first one to be split. Then will check condition not null and use the readLine()
            //at the bottom
            String[] parts = readLine.split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            capitalCities.put(part1, part2);
            readLine = br.readLine();
            //at the end of the loop will read the line, and go to the while to see if it is null and continue

        }
        return capitalCities;

    }

    //para ser method put ()
    public static File createFile() {
        File file = new File("Clasificacion.txt");
        try {
            file.createNewFile();
            //if I could try to create a file and there is no space on the disk for ex.
        } catch (IOException e) {
            System.out.println("An error occurred.");


        }
        return file;
    }

    public static void writetoFile(String name, int points) {
        try {
            FileWriter myWriter = new FileWriter("Clasificacion.txt");
            myWriter.write(name+" "+points+"\n");
            myWriter.close();
            System.out.println("Nombre y puntaje añadidos a la clasificacion.");
        } catch (IOException e) {
            System.out.println("An error occurred.");


        }
    }
}