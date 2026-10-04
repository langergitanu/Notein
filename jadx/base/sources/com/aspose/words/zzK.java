package com.aspose.words;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes6.dex */
final class zzK {
    boolean zzZG4;
    boolean zzZG5;
    boolean zzZG6;
    boolean zzZG7;
    boolean zzZG8;
    boolean zzZG9;
    boolean zzZGa;
    boolean zzZGb;
    boolean zzZGc;
    int zzZGd;
    int zzZGe;
    int zzZGf;
    byte zzZGg;
    byte zzZGh;
    byte zzZGi;
    byte zzZGj;
    int zzZGk;
    int zzZGl;
    int zzZGm;

    public zzK(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzZGj = zzzox.zzX6();
        this.zzZGi = zzzox.zzX6();
        this.zzZGh = zzzox.zzX6();
        byte bZzX6 = zzzox.zzX6();
        this.zzZGm = bZzX6 & 3;
        this.zzZGc = (bZzX6 & 4) != 0;
        this.zzZGb = (bZzX6 & 8) != 0;
        this.zzZGa = (bZzX6 & 16) != 0;
        this.zzZG9 = (bZzX6 & 32) != 0;
        this.zzZG8 = (bZzX6 & SignedBytes.MAX_POWER_OF_TWO) != 0;
        this.zzZG7 = (bZzX6 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        byte bZzX62 = zzzox.zzX6();
        this.zzZG5 = (bZzX62 & 1) != 0;
        this.zzZG6 = (bZzX62 & 2) != 0;
        this.zzZG4 = (bZzX62 & 4) != 0;
        this.zzZGg = zzzox.zzX6();
        this.zzZGf = zzzox.zzXa();
        this.zzZGe = zzzox.zzXa();
        this.zzZGd = zzzox.zzXa();
        this.zzZGl = zzzox.zzXa();
        this.zzZGk = zzzox.zzXa();
    }
}
