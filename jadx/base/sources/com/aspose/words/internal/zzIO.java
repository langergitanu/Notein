package com.aspose.words.internal;

import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes5.dex */
public final class zzIO {
    private static char toUpperCase(char c) {
        return c <= 127 ? (c < 'a' || c > 'z') ? c : (char) (c ^ ControlChar.SPACE_CHAR) : Character.toUpperCase(c);
    }

    public static int zzZ5(String str) {
        int upperCase = 0;
        for (int i = 0; i < str.length(); i++) {
            upperCase = (upperCase * 31) + toUpperCase(str.charAt(i));
        }
        return upperCase;
    }
}
