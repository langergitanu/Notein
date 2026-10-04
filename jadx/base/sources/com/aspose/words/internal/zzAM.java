package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzAM {
    public static char zzV7(int i) {
        return (char) (i <= 9 ? i + 48 : i + 87);
    }

    public static int zzZO(long j) {
        if (j >= 10000000000L) {
            if (j < 100000000000L) {
                return 11;
            }
            if (j < 1000000000000L) {
                return 12;
            }
            if (j < 10000000000000L) {
                return 13;
            }
            if (j < 100000000000000L) {
                return 14;
            }
            if (j < 1000000000000000L) {
                return 15;
            }
            if (j < 10000000000000000L) {
                return 16;
            }
            if (j < 100000000000000000L) {
                return 17;
            }
            return j < 1000000000000000000L ? 18 : 20;
        }
        if (j < 10) {
            return 1;
        }
        if (j < 100) {
            return 2;
        }
        if (j < 1000) {
            return 3;
        }
        if (j < 10000) {
            return 4;
        }
        if (j < 100000) {
            return 5;
        }
        if (j < 1000000) {
            return 6;
        }
        if (j < 10000000) {
            return 7;
        }
        if (j < 100000000) {
            return 8;
        }
        return j < 1000000000 ? 9 : 10;
    }
}
