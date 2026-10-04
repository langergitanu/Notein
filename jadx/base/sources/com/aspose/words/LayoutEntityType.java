package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class LayoutEntityType {
    public static final int CELL = 16;
    public static final int COLUMN = 2;
    public static final int COMMENT = 4096;
    public static final int ENDNOTE = 512;
    public static final int FOOTNOTE = 256;
    public static final int HEADER_FOOTER = 1024;
    public static final int LINE = 32;
    public static final int NONE = 0;
    public static final int NOTE = 16384;
    public static final int NOTE_SEPARATOR = 8192;
    public static final int PAGE = 1;
    public static final int ROW = 8;
    public static final int SPAN = 64;
    public static final int TEXT_BOX = 2048;
    public static final int length = 14;

    private LayoutEntityType() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("PAGE".equals(str)) {
            return 1;
        }
        if ("COLUMN".equals(str)) {
            return 2;
        }
        if ("ROW".equals(str)) {
            return 8;
        }
        if ("CELL".equals(str)) {
            return 16;
        }
        if ("LINE".equals(str)) {
            return 32;
        }
        if ("SPAN".equals(str)) {
            return 64;
        }
        if ("FOOTNOTE".equals(str)) {
            return 256;
        }
        if ("ENDNOTE".equals(str)) {
            return 512;
        }
        if ("NOTE".equals(str)) {
            return 16384;
        }
        if ("HEADER_FOOTER".equals(str)) {
            return 1024;
        }
        if ("TEXT_BOX".equals(str)) {
            return 2048;
        }
        if ("COMMENT".equals(str)) {
            return 4096;
        }
        if ("NOTE_SEPARATOR".equals(str)) {
            return 8192;
        }
        throw new IllegalArgumentException("Unknown LayoutEntityType name.");
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
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "PAGE";
        }
        if (i == 2) {
            return "COLUMN";
        }
        switch (i) {
            case 8:
                return "ROW";
            case 16:
                return "CELL";
            case 32:
                return "LINE";
            case 64:
                return "SPAN";
            case 256:
                return "FOOTNOTE";
            case 512:
                return "ENDNOTE";
            case 1024:
                return "HEADER_FOOTER";
            case 2048:
                return "TEXT_BOX";
            case 4096:
                return "COMMENT";
            case 8192:
                return "NOTE_SEPARATOR";
            case 16384:
                return "NOTE";
            default:
                return "Unknown LayoutEntityType value.";
        }
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("NONE");
        if ((i & 1) == 1) {
            hashSet.add("PAGE");
        }
        if ((i & 2) == 2) {
            hashSet.add("COLUMN");
        }
        if ((i & 8) == 8) {
            hashSet.add("ROW");
        }
        if ((i & 16) == 16) {
            hashSet.add("CELL");
        }
        if ((i & 32) == 32) {
            hashSet.add("LINE");
        }
        if ((i & 64) == 64) {
            hashSet.add("SPAN");
        }
        if ((i & 256) == 256) {
            hashSet.add("FOOTNOTE");
        }
        if ((i & 512) == 512) {
            hashSet.add("ENDNOTE");
        }
        if ((i & 16384) == 16384) {
            hashSet.add("NOTE");
        }
        if ((i & 1024) == 1024) {
            hashSet.add("HEADER_FOOTER");
        }
        if ((i & 2048) == 2048) {
            hashSet.add("TEXT_BOX");
        }
        if ((i & 4096) == 4096) {
            hashSet.add("COMMENT");
        }
        if ((i & 8192) == 8192) {
            hashSet.add("NOTE_SEPARATOR");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 8, 16, 32, 64, 256, 512, 16384, 1024, 2048, 4096, 8192};
    }

    public static String toString(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Page";
        }
        if (i == 2) {
            return "Column";
        }
        switch (i) {
            case 8:
                return "Row";
            case 16:
                return "Cell";
            case 32:
                return "Line";
            case 64:
                return "Span";
            case 256:
                return "Footnote";
            case 512:
                return "Endnote";
            case 1024:
                return "HeaderFooter";
            case 2048:
                return "TextBox";
            case 4096:
                return "Comment";
            case 8192:
                return "NoteSeparator";
            case 16384:
                return "Note";
            default:
                return toStringSet(i);
        }
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
