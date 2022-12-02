/*
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.nio.file.Paths;
import java.util.LinkedList;

public class data_manager {
    public static void main(String[] args) {
/* Make linked list of guests and add guests
        LinkedList<CustomerInfo> guestList = new LinkedList<CustomerInfo>();
        guestList.add(new CustomerInfo("Naruto","Uzumaki","123","Visa"));
        guestList.add(new CustomerInfo("Sasuke","Uchiha","432","cash"));
        guestList.add(new CustomerInfo("Sakura","Haruno","1241","coin"));
*//*
        try {

            ObjectMapper mapper = new ObjectMapper();
*/
  /* To write to json file
            mapper.writerWithDefaultPrettyPrinter().writeValue(Paths.get("GuestList.json").toFile(), guestList);
*/
/* To read from json file. Can print full list, guest in list, or item in guest
            LinkedList<CustomerInfo> guestList= mapper.readValue(Paths.get("GuestList.json").toFile(), new TypeReference<LinkedList<CustomerInfo>>(){});

            System.out.println(guestList.get(0).getFullName());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}

*/