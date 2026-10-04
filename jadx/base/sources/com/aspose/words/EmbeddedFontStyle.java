package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class EmbeddedFontStyle {
    public static final int BOLD = 1;
    public static final int BOLD_ITALIC = 3;
    public static final int ITALIC = 2;
    public static final int REGULAR = 0;
    public static final int length = 4;

    private EmbeddedFontStyle() {
    }

    public static int fromName(String str) {
        if ("REGULAR".equals(str)) {
            return 0;
        }
        if ("BOLD".equals(str)) {
            return 1;
        }
        if ("ITALIC".equals(str)) {
            return 2;
        }
        if ("BOLD_ITALIC".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown EmbeddedFontStyle name.");
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
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown EmbeddedFontStyle value." : "BOLD_ITALIC" : "ITALIC" : "BOLD" : "REGULAR";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("REGULAR");
        if ((i & 1) == 1) {
            hashSet.add("BOLD");
        }
        if ((i & 2) == 2) {
            hashSet.add("ITALIC");
        }
        if ((i & 3) == 3) {
            hashSet.add("BOLD_ITALIC");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? toStringSet(i) : "BoldItalic" : "Italic" : "Bold" : "Regular";
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
