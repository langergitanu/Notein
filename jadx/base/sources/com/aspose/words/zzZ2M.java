package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2M {
    public static String zzIN(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\t' || cCharAt == '`' || cCharAt == ' ' || cCharAt == '!') {
                sb.append('_');
            } else if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static boolean zzZ(zzZAF zzzaf, String str, Ref<Object> ref) throws Exception {
        return zzzaf.zzZ(zzzaf.zzMq(str), ref);
    }

    public static String zzZx(String str, int i) {
        return i == -1 ? str : str.substring(i + 1);
    }

    public static String zzZy(String str, int i) {
        return str.substring(0, i);
    }

    public static int zzZz(String str, int i) {
        return str.indexOf(46, i + 1);
    }

    public static boolean zzZ(zzZAF zzzaf, int i) throws Exception {
        return i >= 0 && i < zzzaf.getFieldCount();
    }
}
