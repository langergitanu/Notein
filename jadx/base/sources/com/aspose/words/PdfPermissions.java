package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfPermissions {
    public static final int ALLOW_ALL = 65535;
    public static final int CONTENT_COPY = 16;
    public static final int CONTENT_COPY_FOR_ACCESSIBILITY = 512;
    public static final int DISALLOW_ALL = 0;
    public static final int DOCUMENT_ASSEMBLY = 1024;
    public static final int FILL_IN = 256;
    public static final int HIGH_RESOLUTION_PRINTING = 2052;
    public static final int MODIFY_ANNOTATIONS = 32;
    public static final int MODIFY_CONTENTS = 8;
    public static final int PRINTING = 4;
    public static final int length = 10;

    private PdfPermissions() {
    }

    public static int fromName(String str) {
        if ("DISALLOW_ALL".equals(str)) {
            return 0;
        }
        if ("ALLOW_ALL".equals(str)) {
            return 65535;
        }
        if ("CONTENT_COPY".equals(str)) {
            return 16;
        }
        if ("CONTENT_COPY_FOR_ACCESSIBILITY".equals(str)) {
            return 512;
        }
        if ("MODIFY_CONTENTS".equals(str)) {
            return 8;
        }
        if ("MODIFY_ANNOTATIONS".equals(str)) {
            return 32;
        }
        if ("FILL_IN".equals(str)) {
            return 256;
        }
        if ("DOCUMENT_ASSEMBLY".equals(str)) {
            return 1024;
        }
        if ("PRINTING".equals(str)) {
            return 4;
        }
        if ("HIGH_RESOLUTION_PRINTING".equals(str)) {
            return 2052;
        }
        throw new IllegalArgumentException("Unknown PdfPermissions name.");
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
        return i != 0 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? i != 256 ? i != 512 ? i != 1024 ? i != 2052 ? i != 65535 ? "Unknown PdfPermissions value." : "ALLOW_ALL" : "HIGH_RESOLUTION_PRINTING" : "DOCUMENT_ASSEMBLY" : "CONTENT_COPY_FOR_ACCESSIBILITY" : "FILL_IN" : "MODIFY_ANNOTATIONS" : "CONTENT_COPY" : "MODIFY_CONTENTS" : "PRINTING" : "DISALLOW_ALL";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("DISALLOW_ALL");
        if ((i & 65535) == 65535) {
            hashSet.add("ALLOW_ALL");
        }
        if ((i & 16) == 16) {
            hashSet.add("CONTENT_COPY");
        }
        if ((i & 512) == 512) {
            hashSet.add("CONTENT_COPY_FOR_ACCESSIBILITY");
        }
        if ((i & 8) == 8) {
            hashSet.add("MODIFY_CONTENTS");
        }
        if ((i & 32) == 32) {
            hashSet.add("MODIFY_ANNOTATIONS");
        }
        if ((i & 256) == 256) {
            hashSet.add("FILL_IN");
        }
        if ((i & 1024) == 1024) {
            hashSet.add("DOCUMENT_ASSEMBLY");
        }
        if ((i & 4) == 4) {
            hashSet.add("PRINTING");
        }
        if ((i & 2052) == 2052) {
            hashSet.add("HIGH_RESOLUTION_PRINTING");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 65535, 16, 512, 8, 32, 256, 1024, 4, 2052};
    }

    public static String toString(int i) {
        return i != 0 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? i != 256 ? i != 512 ? i != 1024 ? i != 2052 ? i != 65535 ? toStringSet(i) : "AllowAll" : "HighResolutionPrinting" : "DocumentAssembly" : "ContentCopyForAccessibility" : "FillIn" : "ModifyAnnotations" : "ContentCopy" : "ModifyContents" : "Printing" : "DisallowAll";
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
