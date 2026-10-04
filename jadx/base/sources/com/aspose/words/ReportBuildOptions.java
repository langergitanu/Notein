package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ReportBuildOptions {
    public static final int ALLOW_MISSING_MEMBERS = 1;
    public static final int INLINE_ERROR_MESSAGES = 4;
    public static final int NONE = 0;
    public static final int REMOVE_EMPTY_PARAGRAPHS = 2;
    public static final int RESPECT_JPEG_EXIF_ORIENTATION = 16;
    public static final int UPDATE_FIELDS_SYNTAX_AWARE = 32;
    public static final int USE_LEGACY_HEADER_FOOTER_VISITING = 8;
    public static final int length = 7;

    private ReportBuildOptions() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("ALLOW_MISSING_MEMBERS".equals(str)) {
            return 1;
        }
        if ("REMOVE_EMPTY_PARAGRAPHS".equals(str)) {
            return 2;
        }
        if ("INLINE_ERROR_MESSAGES".equals(str)) {
            return 4;
        }
        if ("USE_LEGACY_HEADER_FOOTER_VISITING".equals(str)) {
            return 8;
        }
        if ("RESPECT_JPEG_EXIF_ORIENTATION".equals(str)) {
            return 16;
        }
        if ("UPDATE_FIELDS_SYNTAX_AWARE".equals(str)) {
            return 32;
        }
        throw new IllegalArgumentException("Unknown ReportBuildOptions name.");
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
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? "Unknown ReportBuildOptions value." : "UPDATE_FIELDS_SYNTAX_AWARE" : "RESPECT_JPEG_EXIF_ORIENTATION" : "USE_LEGACY_HEADER_FOOTER_VISITING" : "INLINE_ERROR_MESSAGES" : "REMOVE_EMPTY_PARAGRAPHS" : "ALLOW_MISSING_MEMBERS" : "NONE";
    }

    public static Set<String> getNames(int i) {
        HashSet hashSet = new HashSet();
        hashSet.add("NONE");
        if ((i & 1) == 1) {
            hashSet.add("ALLOW_MISSING_MEMBERS");
        }
        if ((i & 2) == 2) {
            hashSet.add("REMOVE_EMPTY_PARAGRAPHS");
        }
        if ((i & 4) == 4) {
            hashSet.add("INLINE_ERROR_MESSAGES");
        }
        if ((i & 8) == 8) {
            hashSet.add("USE_LEGACY_HEADER_FOOTER_VISITING");
        }
        if ((i & 16) == 16) {
            hashSet.add("RESPECT_JPEG_EXIF_ORIENTATION");
        }
        if ((i & 32) == 32) {
            hashSet.add("UPDATE_FIELDS_SYNTAX_AWARE");
        }
        return hashSet;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 4, 8, 16, 32};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? toStringSet(i) : "UpdateFieldsSyntaxAware" : "RespectJpegExifOrientation" : "UseLegacyHeaderFooterVisiting" : "InlineErrorMessages" : "RemoveEmptyParagraphs" : "AllowMissingMembers" : "None";
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
