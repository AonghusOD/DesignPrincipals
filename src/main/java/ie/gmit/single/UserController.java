package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserController {

    //Handles incoming JSON requests that work on User resource/entity

        //Store used by controller
        private Validate validUser = new Validate();
        private Database dbStore = new Database();

        //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

            if(!validUser.checkUserDetails(user)) {
                return "ERROR";
            }
            dbStore.addDB(user);
            return "SUCCESS";

        }




 }

