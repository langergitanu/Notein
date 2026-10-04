package ooOOoOOO;

import OoooooO.C21421OooO0oO;

/* JADX INFO: renamed from: ooOOoOOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35147OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f126203OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int OooO00o(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            throw new IllegalArgumentException(C21421OooO0oO.OooO00o("Unexpected hex digit: ", c));
        }
        return c - '7';
    }
}
