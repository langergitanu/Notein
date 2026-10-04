package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzY6 {
    private static boolean zzS(char c) {
        return c == 8234 || c == 8235 || c == 8237 || c == 8238 || c == 8236;
    }

    public static char zzT(String str, String str2) {
        return "dir".equals(str) ? "ltr".equals(str2) ? (char) 8234 : (char) 8235 : "ltr".equals(str2) ? (char) 8237 : (char) 8238;
    }

    public static String zzU(char c) {
        return (c == 8235 || c == 8238) ? "rtl" : "ltr";
    }

    public static String zzV(char c) {
        return (c == 8235 || c == 8234) ? "dir" : "bdo";
    }

    public static boolean zzT(char c) {
        return zzS(c) && c != 8236;
    }
}
