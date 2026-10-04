package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzYR {
    private static char[] zzZDs = "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray();

    public static String zzC(long j, int i) {
        StringBuilder sb = new StringBuilder();
        do {
            char[] cArr = zzZDs;
            sb.insert(0, cArr[(int) (j % ((long) cArr.length))]);
            j /= (long) zzZDs.length;
        } while (j > 0);
        while (sb.length() < i) {
            sb.insert(0, '0');
        }
        return sb.toString();
    }

    public static boolean zzZ(String str, RefInt refInt) {
        refInt.set(0);
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            int iZzZu = zzZu(str.charAt(i));
            if (iZzZu == -1) {
                return false;
            }
            j = (j * 32) + ((long) iZzZu);
            if (j > 2147483647L) {
                return false;
            }
        }
        refInt.set((int) j);
        return true;
    }

    private static int zzZu(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c < 'A' || c > 'V') {
            return -1;
        }
        return c - '7';
    }
}
