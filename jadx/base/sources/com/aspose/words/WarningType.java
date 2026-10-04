package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class WarningType {
    public static final int DATA_LOSS = 1;
    public static final int DATA_LOSS_CATEGORY = 255;
    public static final int FONT_EMBEDDING = 262144;
    public static final int FONT_SUBSTITUTION = 131072;
    public static final int HINT = 268435456;
    public static final int MAJOR_FORMATTING_LOSS = 256;
    public static final int MAJOR_FORMATTING_LOSS_CATEGORY = 65280;
    public static final int MINOR_FORMATTING_LOSS = 65536;
    public static final int MINOR_FORMATTING_LOSS_CATEGORY = 16711680;
    public static final int UNEXPECTED_CONTENT = 16777216;
    public static final int UNEXPECTED_CONTENT_CATEGORY = 251658240;
    public static final int length = 11;

    private WarningType() {
    }

    public static int fromName(String str) {
        if ("DATA_LOSS_CATEGORY".equals(str)) {
            return 255;
        }
        if ("DATA_LOSS".equals(str)) {
            return 1;
        }
        if ("MAJOR_FORMATTING_LOSS_CATEGORY".equals(str)) {
            return 65280;
        }
        if ("MAJOR_FORMATTING_LOSS".equals(str)) {
            return 256;
        }
        if ("MINOR_FORMATTING_LOSS_CATEGORY".equals(str)) {
            return MINOR_FORMATTING_LOSS_CATEGORY;
        }
        if ("MINOR_FORMATTING_LOSS".equals(str)) {
            return 65536;
        }
        if ("FONT_SUBSTITUTION".equals(str)) {
            return 131072;
        }
        if ("FONT_EMBEDDING".equals(str)) {
            return 262144;
        }
        if ("UNEXPECTED_CONTENT_CATEGORY".equals(str)) {
            return UNEXPECTED_CONTENT_CATEGORY;
        }
        if ("UNEXPECTED_CONTENT".equals(str)) {
            return 16777216;
        }
        if ("HINT".equals(str)) {
            return HINT;
        }
        throw new IllegalArgumentException("Unknown WarningType name.");
    }

    public static int fromNames(Set<String> set) {
        Iterator<String> it = set.iterator();
        int iFromName = 0;
        while (it.hasNext()) {
            iFromName |= fromName(it.next());
        }
        return iFromName;
    }

    public static String getName(int i) {
        return i != 1 ? i != 65280 ? i != 65536 ? i != 131072 ? i != 262144 ? i != 16711680 ? i != 16777216 ? i != 251658240 ? i != 268435456 ? i != 255 ? i != 256 ? "Unknown WarningType value." : "MAJOR_FORMATTING_LOSS" : "DATA_LOSS_CATEGORY" : "HINT" : "UNEXPECTED_CONTENT_CATEGORY" : "UNEXPECTED_CONTENT" : "MINOR_FORMATTING_LOSS_CATEGORY" : "FONT_EMBEDDING" : "FONT_SUBSTITUTION" : "MINOR_FORMATTING_LOSS" : "MAJOR_FORMATTING_LOSS_CATEGORY" : "DATA_LOSS";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        if ((i & 255) == 255) {
            hashSet.add("DATA_LOSS_CATEGORY");
        }
        if ((i & 1) == 1) {
            hashSet.add("DATA_LOSS");
        }
        if ((i & 65280) == 65280) {
            hashSet.add("MAJOR_FORMATTING_LOSS_CATEGORY");
        }
        if ((i & 256) == 256) {
            hashSet.add("MAJOR_FORMATTING_LOSS");
        }
        if ((i & MINOR_FORMATTING_LOSS_CATEGORY) == 16711680) {
            hashSet.add("MINOR_FORMATTING_LOSS_CATEGORY");
        }
        if ((i & 65536) == 65536) {
            hashSet.add("MINOR_FORMATTING_LOSS");
        }
        if ((i & 131072) == 131072) {
            hashSet.add("FONT_SUBSTITUTION");
        }
        if ((i & 262144) == 262144) {
            hashSet.add("FONT_EMBEDDING");
        }
        if ((i & UNEXPECTED_CONTENT_CATEGORY) == 251658240) {
            hashSet.add("UNEXPECTED_CONTENT_CATEGORY");
        }
        if ((i & 16777216) == 16777216) {
            hashSet.add("UNEXPECTED_CONTENT");
        }
        if ((i & HINT) == 268435456) {
            hashSet.add("HINT");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{255, 1, 65280, 256, MINOR_FORMATTING_LOSS_CATEGORY, 65536, 131072, 262144, UNEXPECTED_CONTENT_CATEGORY, 16777216, HINT};
    }

    public static String toString(int i) {
        return i != 1 ? i != 65280 ? i != 65536 ? i != 131072 ? i != 262144 ? i != 16711680 ? i != 16777216 ? i != 251658240 ? i != 268435456 ? i != 255 ? i != 256 ? toStringSet(i) : "MajorFormattingLoss" : "DataLossCategory" : "Hint" : "UnexpectedContentCategory" : "UnexpectedContent" : "MinorFormattingLossCategory" : "FontEmbedding" : "FontSubstitution" : "MinorFormattingLoss" : "MajorFormattingLossCategory" : "DataLoss";
    }

    public static String toStringSet(int i) {
        String string = "";
        String str = "";
        for (int i2 : getValues()) {
            if (i2 != 0 && (i2 & i) == i2) {
                StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(string, str);
                sbOooO0OO.append(toString(i2));
                string = sbOooO0OO.toString();
                str = ", ";
            }
        }
        return string;
    }
}
