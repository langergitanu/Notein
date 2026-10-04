package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class TableStyleOptions {
    public static final int COLUMN_BANDS = 1024;
    public static final int DEFAULT = 672;
    public static final int DEFAULT_2003 = 1536;
    public static final int FIRST_COLUMN = 128;
    public static final int FIRST_ROW = 32;
    public static final int LAST_COLUMN = 256;
    public static final int LAST_ROW = 64;
    public static final int NONE = 0;
    public static final int ROW_BANDS = 512;
    public static final int length = 9;

    private TableStyleOptions() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("FIRST_ROW".equals(str)) {
            return 32;
        }
        if ("LAST_ROW".equals(str)) {
            return 64;
        }
        if ("FIRST_COLUMN".equals(str)) {
            return 128;
        }
        if ("LAST_COLUMN".equals(str)) {
            return 256;
        }
        if ("ROW_BANDS".equals(str)) {
            return 512;
        }
        if ("COLUMN_BANDS".equals(str)) {
            return 1024;
        }
        if ("DEFAULT_2003".equals(str)) {
            return DEFAULT_2003;
        }
        if ("DEFAULT".equals(str)) {
            return DEFAULT;
        }
        throw new IllegalArgumentException("Unknown TableStyleOptions name.");
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
        return i != 0 ? i != 32 ? i != 64 ? i != 128 ? i != 256 ? i != 512 ? i != 672 ? i != 1024 ? i != 1536 ? "Unknown TableStyleOptions value." : "DEFAULT_2003" : "COLUMN_BANDS" : "DEFAULT" : "ROW_BANDS" : "LAST_COLUMN" : "FIRST_COLUMN" : "LAST_ROW" : "FIRST_ROW" : "NONE";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("NONE");
        if ((i & 32) == 32) {
            hashSet.add("FIRST_ROW");
        }
        if ((i & 64) == 64) {
            hashSet.add("LAST_ROW");
        }
        if ((i & 128) == 128) {
            hashSet.add("FIRST_COLUMN");
        }
        if ((i & 256) == 256) {
            hashSet.add("LAST_COLUMN");
        }
        if ((i & 512) == 512) {
            hashSet.add("ROW_BANDS");
        }
        if ((i & 1024) == 1024) {
            hashSet.add("COLUMN_BANDS");
        }
        if ((i & DEFAULT_2003) == 1536) {
            hashSet.add("DEFAULT_2003");
        }
        if ((i & DEFAULT) == 672) {
            hashSet.add("DEFAULT");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 32, 64, 128, 256, 512, 1024, DEFAULT_2003, DEFAULT};
    }

    public static String toString(int i) {
        return i != 0 ? i != 32 ? i != 64 ? i != 128 ? i != 256 ? i != 512 ? i != 672 ? i != 1024 ? i != 1536 ? toStringSet(i) : "Default2003" : "ColumnBands" : "Default" : "RowBands" : "LastColumn" : "FirstColumn" : "LastRow" : "FirstRow" : "None";
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
