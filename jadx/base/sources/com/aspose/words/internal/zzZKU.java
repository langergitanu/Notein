package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKU {
    public static boolean zzG(char c) {
        if (c <= 255 && (c == ' ' || ((c >= '\t' && c <= '\r') || c == 160 || c == 133))) {
            return true;
        }
        switch (Character.getType(c)) {
        }
        return true;
    }

    public static boolean zzP(char c) {
        if (c == 182) {
            return false;
        }
        int type = Character.getType(c);
        if (type == 29 || type == 30) {
            return true;
        }
        switch (type) {
        }
        return false;
    }

    public static String zzS7(int i) {
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException("Parameter name: utf32Char");
        }
        if (i < 65536 || i > 1114111) {
            return zzZKN.zzS((char) i, 1);
        }
        int i2 = i - 65536;
        return new String(new char[]{(char) ((i2 / 1024) + 55296), (char) ((i2 % 1024) + 56320)});
    }

    public static char zzZJ(char c) {
        return c == 181 ? c : Character.toLowerCase(c);
    }

    public static char zzZK(char c) {
        return c == 181 ? c : Character.toUpperCase(c);
    }
}
