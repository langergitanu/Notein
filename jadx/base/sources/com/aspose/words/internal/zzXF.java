package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXF {
    private static String zzH(String str) {
        if (Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        if (str.length() == 1) {
            return str.toLowerCase();
        }
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }

    public static String zzI(String str) {
        return "Clone".equals(str) ? "deepClone" : "GetHashCode".equals(str) ? "hashCode" : "GetEnumerator".equals(str) ? "iterator" : "Equals".equals(str) ? "equals" : "ToString".equals(str) ? "toString" : zzH(str);
    }
}
