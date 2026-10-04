package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class FlipOrientation {
    public static final int BOTH = 3;
    public static final int HORIZONTAL = 1;
    public static final int NONE = 0;
    public static final int VERTICAL = 2;
    public static final int length = 4;

    private FlipOrientation() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("HORIZONTAL".equals(str)) {
            return 1;
        }
        if ("VERTICAL".equals(str)) {
            return 2;
        }
        if ("BOTH".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown FlipOrientation name.");
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
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown FlipOrientation value." : "BOTH" : "VERTICAL" : "HORIZONTAL" : "NONE";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("NONE");
        if ((i & 1) == 1) {
            hashSet.add("HORIZONTAL");
        }
        if ((i & 2) == 2) {
            hashSet.add("VERTICAL");
        }
        if ((i & 3) == 3) {
            hashSet.add("BOTH");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? toStringSet(i) : "Both" : "Vertical" : "Horizontal" : "None";
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
