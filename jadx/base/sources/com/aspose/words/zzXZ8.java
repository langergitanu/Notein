package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZ8 {
    public static String zzUS(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        while (i2 >= 0) {
            sb.append((char) ((i2 % 26) + 65));
            i2 = (i2 / 26) - 1;
        }
        StringBuilder sb2 = new StringBuilder(sb.length());
        for (int length = sb.length() - 1; length >= 0; length--) {
            sb2.append(sb.charAt(length));
        }
        return sb2.toString() + (i + 1);
    }
}
