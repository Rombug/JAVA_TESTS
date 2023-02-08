package lt.code.academy;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String,String> myMap = new HashMap<String,String>();

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        Scanner sc = new Scanner(System.in);

        File file = new File("users.json");
        if (!file.exists()){
            file.createNewFile();
        }

        mapper.writeValue(file,sc);

        User readValue = mapper.readValue(file, User.class);
        System.out.println(readValue);
        System.out.println("Iveskite varda");
        String firstName = sc.next();
        myMap.put("firstName",firstName);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Iveskite pavarde");
        String lastName = sc1.next();
        myMap.put("lastName",lastName);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Iveskite asmens koda");
        String ak = sc2.next();
        myMap.put("Asmens kodas", ak);

    }

}
