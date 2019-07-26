package com.tumblr.jumblr.responses;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.tumblr.jumblr.types.Theme;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Theme in post in trail is possible to return
 * object or array ot theme, so make ThemeDeserializer for.
 */
public class ThemeDeserializer implements JsonDeserializer<List<Theme>> {

    @Override
    public List<Theme> deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) {
        List<Theme> list = new ArrayList<Theme>();

        if (je.isJsonArray()) {
            for (JsonElement e : je.getAsJsonArray()) {
                list.add((Theme) jdc.deserialize(e, Theme.class));
            }

        } else if (je.isJsonObject()) {
            list.add((Theme) jdc.deserialize(je, Theme.class));

        } else {
            throw new RuntimeException("Unexpected JSON type: " + je.getClass());
        }

        return list;
    }
}
