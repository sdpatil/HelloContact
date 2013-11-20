package com.spnotes.misc.com.spnotes.misc;

import com.spnotes.misc.Contact;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by gpzpati on 11/19/13.
 */
public class JSONTester {

    public static void main(String[] argv) throws Exception{
        Contact contact = new Contact();
        contact.setFirstName("Sachin");
        contact.setLastName("Tendulkar");

        ObjectMapper objectMapper = new ObjectMapper();

        Calendar cal = Calendar.getInstance();
        cal.set(1973,3,24);
        contact.setDateOfBirth(cal.getTime());

        System.out.println(objectMapper.writeValueAsString(contact));
        //objectMapper.writeValue(, contact);
    }
}
