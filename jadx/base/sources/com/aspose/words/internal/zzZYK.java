package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYK {
    private static char zzuK = 65535;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private boolean zzc5;
    private ArrayList<String> zznc;
    private char[] zzuL;

    public zzZYK() {
        this((byte) 0);
    }

    private void initialize(int i) {
        int iZzV9 = zzAN.zzV9(0);
        int[] iArr = new int[iZzV9];
        this.zzVc = iArr;
        zzY(iArr);
        this.zzVb = new int[iZzV9];
        this.zzVa = new int[iZzV9];
        this.zznc = new ArrayList<>(iZzV9);
        for (int i2 = 0; i2 < iZzV9; i2++) {
            zzZQG.zzZ(this.zznc, (Object) null);
        }
        this.zzuL = new char[iZzV9];
        this.zzV6 = -1;
    }

    private void zzWx() {
        int iZzV9 = zzAN.zzV9(this.zzZF * 2);
        int[] iArr = new int[iZzV9];
        zzY(iArr);
        int[] iArr2 = new int[iZzV9];
        zzZKV.zzZ(this.zzVb, 0, iArr2, 0, this.zzZF);
        int[] iArr3 = new int[iZzV9];
        for (int i = this.zzZF; i < iZzV9; i++) {
            zzZQG.zzZ(this.zznc, (Object) null);
        }
        char[] cArr = new char[iZzV9];
        zzZKV.zzZ(this.zzuL, 0, cArr, 0, this.zzZF);
        this.zzuL = cArr;
        for (int i2 = 0; i2 < this.zzZF; i2++) {
            int i3 = iArr2[i2] % iZzV9;
            iArr3[i2] = iArr[i3];
            iArr[i3] = i2;
        }
        this.zzVc = iArr;
        this.zzVb = iArr2;
        this.zzVa = iArr3;
    }

    private int zzXr(String str) {
        return (this.zzc5 ? zzIO.zzZ5(str) : str.hashCode()) & Integer.MAX_VALUE;
    }

    private static void zzXs(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: key");
        }
    }

    private int zzXt(String str) {
        zzXs(str);
        if (this.zzVc == null) {
            return -1;
        }
        int iZzXr = zzXr(str);
        int[] iArr = this.zzVc;
        int i = iArr[iZzXr % iArr.length];
        while (i >= 0) {
            if (this.zzVb[i] == iZzXr && zzk(this.zznc.get(i), str)) {
                return i;
            }
            i = this.zzVa[i];
        }
        return -1;
    }

    private static boolean zzY(char c, char c2) {
        return c == c2;
    }

    private void zzZ(String str, char c, boolean z) {
        int i;
        zzXs(str);
        if (this.zzVc == null) {
            initialize(0);
        }
        int iZzXr = zzXr(str);
        int[] iArr = this.zzVc;
        int i2 = iArr[iZzXr % iArr.length];
        while (i2 >= 0) {
            if (this.zzVb[i2] == iZzXr && zzk(this.zznc.get(i2), str)) {
                if (z) {
                    throw new IllegalStateException("A value with the specified key has already been added.");
                }
                this.zzuL[i2] = c;
                this.zzV7++;
                return;
            }
            i2 = this.zzVa[i2];
        }
        int i3 = this.zzV5;
        if (i3 > 0) {
            i = this.zzV6;
            this.zzV6 = this.zzVa[i];
            this.zzV5 = i3 - 1;
        } else {
            if (this.zzZF == this.zzVb.length) {
                zzWx();
            }
            i = this.zzZF;
            this.zzZF = i + 1;
        }
        int[] iArr2 = this.zzVc;
        int length = iZzXr % iArr2.length;
        this.zzVb[i] = iZzXr;
        this.zzVa[i] = iArr2[length];
        this.zznc.set(i, str);
        this.zzuL[i] = c;
        this.zzVc[length] = i;
        this.zzV7++;
    }

    private boolean zzk(String str, String str2) {
        return this.zzc5 ? zzZYD.zzh(str, str2) : zzZKN.zzX(str, str2, zzZOF.ORDINAL$4894b8c8);
    }

    public static boolean zzx(char c) {
        return zzY(c, zzuK);
    }

    public final void zzX(String str, char c) {
        zzZ(str, c, false);
    }

    public final char zzXq(String str) {
        int iZzXt = zzXt(str);
        return iZzXt >= 0 ? this.zzuL[iZzXt] : zzuK;
    }

    private zzZYK(byte b) {
        zzZ4.zzY(0, "capacity");
    }

    public final void zzY(String str, char c) {
        zzZ(str, c, true);
    }

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }
}
