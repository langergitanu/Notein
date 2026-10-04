package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class HtmlInsertOptions {
    public static final int NONE = 0;
    public static final int PRESERVE_BLOCKS = 4;
    public static final int REMOVE_LAST_EMPTY_PARAGRAPH = 2;
    public static final int USE_BUILDER_FORMATTING = 1;
    public static final int length = 4;

    private HtmlInsertOptions() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("USE_BUILDER_FORMATTING".equals(str)) {
            return 1;
        }
        if ("REMOVE_LAST_EMPTY_PARAGRAPH".equals(str)) {
            return 2;
        }
        if ("PRESERVE_BLOCKS".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown HtmlInsertOptions name.");
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
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? "Unknown HtmlInsertOptions value." : "PRESERVE_BLOCKS" : "REMOVE_LAST_EMPTY_PARAGRAPH" : "USE_BUILDER_FORMATTING" : "NONE";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("NONE");
        if ((i & 1) == 1) {
            hashSet.add("USE_BUILDER_FORMATTING");
        }
        if ((i & 2) == 2) {
            hashSet.add("REMOVE_LAST_EMPTY_PARAGRAPH");
        }
        if ((i & 4) == 4) {
            hashSet.add("PRESERVE_BLOCKS");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? toStringSet(i) : "PreserveBlocks" : "RemoveLastEmptyParagraph" : "UseBuilderFormatting" : "None";
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
