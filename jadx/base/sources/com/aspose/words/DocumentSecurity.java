package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class DocumentSecurity {
    public static final int NONE = 0;
    public static final int PASSWORD_PROTECTED = 1;
    public static final int READ_ONLY_ENFORCED = 4;
    public static final int READ_ONLY_EXCEPT_ANNOTATIONS = 8;
    public static final int READ_ONLY_RECOMMENDED = 2;
    public static final int length = 5;

    private DocumentSecurity() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("PASSWORD_PROTECTED".equals(str)) {
            return 1;
        }
        if ("READ_ONLY_RECOMMENDED".equals(str)) {
            return 2;
        }
        if ("READ_ONLY_ENFORCED".equals(str)) {
            return 4;
        }
        if ("READ_ONLY_EXCEPT_ANNOTATIONS".equals(str)) {
            return 8;
        }
        throw new IllegalArgumentException("Unknown DocumentSecurity name.");
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
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? "Unknown DocumentSecurity value." : "READ_ONLY_EXCEPT_ANNOTATIONS" : "READ_ONLY_ENFORCED" : "READ_ONLY_RECOMMENDED" : "PASSWORD_PROTECTED" : "NONE";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("NONE");
        if ((i & 1) == 1) {
            hashSet.add("PASSWORD_PROTECTED");
        }
        if ((i & 2) == 2) {
            hashSet.add("READ_ONLY_RECOMMENDED");
        }
        if ((i & 4) == 4) {
            hashSet.add("READ_ONLY_ENFORCED");
        }
        if ((i & 8) == 8) {
            hashSet.add("READ_ONLY_EXCEPT_ANNOTATIONS");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 4, 8};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? toStringSet(i) : "ReadOnlyExceptAnnotations" : "ReadOnlyEnforced" : "ReadOnlyRecommended" : "PasswordProtected" : "None";
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
