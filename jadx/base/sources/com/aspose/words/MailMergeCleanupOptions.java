package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class MailMergeCleanupOptions {
    public static final int NONE = 0;
    public static final int REMOVE_CONTAINING_FIELDS = 8;
    public static final int REMOVE_EMPTY_PARAGRAPHS = 1;
    public static final int REMOVE_EMPTY_TABLE_ROWS = 32;
    public static final int REMOVE_STATIC_FIELDS = 16;
    public static final int REMOVE_UNUSED_FIELDS = 4;
    public static final int REMOVE_UNUSED_REGIONS = 2;
    public static final int length = 7;

    private MailMergeCleanupOptions() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("REMOVE_EMPTY_PARAGRAPHS".equals(str)) {
            return 1;
        }
        if ("REMOVE_UNUSED_REGIONS".equals(str)) {
            return 2;
        }
        if ("REMOVE_UNUSED_FIELDS".equals(str)) {
            return 4;
        }
        if ("REMOVE_CONTAINING_FIELDS".equals(str)) {
            return 8;
        }
        if ("REMOVE_STATIC_FIELDS".equals(str)) {
            return 16;
        }
        if ("REMOVE_EMPTY_TABLE_ROWS".equals(str)) {
            return 32;
        }
        throw new IllegalArgumentException("Unknown MailMergeCleanupOptions name.");
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
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? "Unknown MailMergeCleanupOptions value." : "REMOVE_EMPTY_TABLE_ROWS" : "REMOVE_STATIC_FIELDS" : "REMOVE_CONTAINING_FIELDS" : "REMOVE_UNUSED_FIELDS" : "REMOVE_UNUSED_REGIONS" : "REMOVE_EMPTY_PARAGRAPHS" : "NONE";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("NONE");
        if ((i & 1) == 1) {
            hashSet.add("REMOVE_EMPTY_PARAGRAPHS");
        }
        if ((i & 2) == 2) {
            hashSet.add("REMOVE_UNUSED_REGIONS");
        }
        if ((i & 4) == 4) {
            hashSet.add("REMOVE_UNUSED_FIELDS");
        }
        if ((i & 8) == 8) {
            hashSet.add("REMOVE_CONTAINING_FIELDS");
        }
        if ((i & 16) == 16) {
            hashSet.add("REMOVE_STATIC_FIELDS");
        }
        if ((i & 32) == 32) {
            hashSet.add("REMOVE_EMPTY_TABLE_ROWS");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 4, 8, 16, 32};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? toStringSet(i) : "RemoveEmptyTableRows" : "RemoveStaticFields" : "RemoveContainingFields" : "RemoveUnusedFields" : "RemoveUnusedRegions" : "RemoveEmptyParagraphs" : "None";
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
