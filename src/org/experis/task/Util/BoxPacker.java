package org.experis.task.Util;

import org.experis.task.Box;
import org.experis.task.Packable;

public class BoxPacker {
    public static String getPackedBox(Box<? extends Packable> box) {
        String packableName = box.getItem().getName();
        return getWrappedBox(packableName);
    }

    public static String getWrappedBox(String itemName) {
        StringBuilder sb = new StringBuilder();
        int boxWidth = itemName.length();

        for (int i = 0; i < 3; i++) {
            sb.append("[--");
            if (i == 1) sb.append(' ');
            for (int j = 0; j < boxWidth; j++) {
                if (i == 0) {
                    sb.append("-");
                } else if (i == 1) {
                    sb.append(itemName.toUpperCase().toCharArray()[j]);
                } else {
                    sb.append("-");
                }
            }
            if (i == 1) sb.append(" --] \n");
            else sb.append("----] \n");
        }

        return sb.toString();
    }
}
