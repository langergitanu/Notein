package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class DocumentSplitCriteria {
    public static final int COLUMN_BREAK = 2;
    public static final int HEADING_PARAGRAPH = 8;
    public static final int NONE = 0;
    public static final int PAGE_BREAK = 1;
    public static final int SECTION_BREAK = 4;
    public static final int length = 5;

    private DocumentSplitCriteria() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("PAGE_BREAK".equals(str)) {
            return 1;
        }
        if ("COLUMN_BREAK".equals(str)) {
            return 2;
        }
        if ("SECTION_BREAK".equals(str)) {
            return 4;
        }
        if ("HEADING_PARAGRAPH".equals(str)) {
            return 8;
        }
        throw new IllegalArgumentException("Unknown DocumentSplitCriteria name.");
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
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? "Unknown DocumentSplitCriteria value." : "HEADING_PARAGRAPH" : "SECTION_BREAK" : "COLUMN_BREAK" : "PAGE_BREAK" : "NONE";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("NONE");
        if ((i & 1) == 1) {
            hashSet.add("PAGE_BREAK");
        }
        if ((i & 2) == 2) {
            hashSet.add("COLUMN_BREAK");
        }
        if ((i & 4) == 4) {
            hashSet.add("SECTION_BREAK");
        }
        if ((i & 8) == 8) {
            hashSet.add("HEADING_PARAGRAPH");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 4, 8};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? toStringSet(i) : "HeadingParagraph" : "SectionBreak" : "ColumnBreak" : "PageBreak" : "None";
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
