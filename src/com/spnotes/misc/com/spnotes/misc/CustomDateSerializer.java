package com.spnotes.misc.com.spnotes.misc;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by gpzpati on 11/19/13.
 */
public class CustomDateSerializer  extends JsonSerializer<Date>{
    private static DateTimeFormatter formatter =
            DateTimeFormat.forPattern("dd-MMM-yyyy");
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException, JsonProcessingException {
        jsonGenerator.writeString(formatter.print(date.getTime()));

    }
}
