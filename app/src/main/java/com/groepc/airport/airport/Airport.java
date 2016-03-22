package com.groepc.airport.airport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class Airport {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<AirportItem> ITEMS = new ArrayList<AirportItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, AirportItem> ITEM_MAP = new HashMap<String, AirportItem>();

    private static final int COUNT = 25;


    public static void addItem(String id, String content, String details) {
        AirportItem item = new AirportItem(id, content, details);
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class AirportItem {

        public final String id;
        public final String content;
        public final String details;

        public AirportItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }

    }
}
