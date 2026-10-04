package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYI {
    private static int zzV4 = Integer.MIN_VALUE;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzV8;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private String zzc2;
    private boolean zzc5;
    private ArrayList<String> zznc;
    private int zzuG;

    public static class zzZ {
        private int zzTL = -1;
        private int zzV7;
        private zzZYI zzc1;

        public zzZ(zzZYI zzzyi) {
            this.zzc1 = zzzyi;
            this.zzV7 = zzzyi.zzV7;
        }

        private void zzCN() {
            if (this.zzTL == -1) {
                throw new IllegalStateException("An enumeration should be started before accessing current key or value.");
            }
        }

        private void zzCO() {
            if (this.zzV7 != this.zzc1.zzV7) {
                throw new IllegalStateException("The dictionary has been changed, the enumeration can not proceed.");
            }
        }

        public final boolean moveNext() {
            zzCO();
            do {
                int i = this.zzTL + 1;
                this.zzTL = i;
                if (i >= this.zzc1.zzZF) {
                    this.zzTL = -1;
                    return false;
                }
            } while (this.zzc1.zzVb[this.zzTL] < 0);
            return true;
        }

        public final int zzCL() {
            zzCN();
            return this.zzc1.zzV8[this.zzTL];
        }

        public final String zzr3() {
            zzCN();
            return (String) this.zzc1.zznc.get(this.zzTL);
        }
    }

    public zzZYI() {
        this(0);
    }

    private void initialize(int i) {
        int iZzV9 = zzAN.zzV9(i);
        int[] iArr = new int[iZzV9];
        this.zzVc = iArr;
        zzY(iArr);
        this.zzVb = new int[iZzV9];
        this.zzVa = new int[iZzV9];
        this.zznc = new ArrayList<>(iZzV9);
        for (int i2 = 0; i2 < iZzV9; i2++) {
            zzZQG.zzZ(this.zznc, (Object) null);
        }
        this.zzV8 = new int[iZzV9];
        this.zzV6 = -1;
    }

    public static boolean zzWm(int i) {
        return zzb(i, zzV4);
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
        int[] iArr4 = new int[iZzV9];
        zzZKV.zzZ(this.zzV8, 0, iArr4, 0, this.zzZF);
        this.zzV8 = iArr4;
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

    private static boolean zzb(int i, int i2) {
        return i == i2;
    }

    private boolean zzk(String str, String str2) {
        return this.zzc5 ? zzZYD.zzh(str, str2) : zzZKN.zzX(str, str2, zzZOF.ORDINAL$4894b8c8);
    }

    private zzZ zzr4() {
        return new zzZ(this);
    }

    public final void add(String str, int i) {
        zzZ(str, i, true);
    }

    public final boolean containsKey(String str) {
        return zzXt(str) >= 0;
    }

    public final int get(String str) {
        int iZzXt = zzXt(str);
        return iZzXt >= 0 ? this.zzV8[iZzXt] : zzV4;
    }

    public final int getCount() {
        return this.zzZF - this.zzV5;
    }

    public final void set(String str, int i) {
        zzZ(str, i, false);
    }

    public final boolean zzVA(int i) {
        for (int i2 = 0; i2 < this.zzZF; i2++) {
            if (this.zzVb[i2] >= 0 && zzb(this.zzV8[i2], i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzXn(String str) {
        zzXs(str);
        if (this.zzVc == null) {
            return false;
        }
        int iZzXr = zzXr(str);
        int[] iArr = this.zzVc;
        int length = iZzXr % iArr.length;
        int i = iArr[length];
        int i2 = -1;
        while (i >= 0) {
            if (this.zzVb[i] == iZzXr && zzk(this.zznc.get(i), str)) {
                if (i2 < 0) {
                    this.zzVc[length] = this.zzVa[i];
                } else {
                    int[] iArr2 = this.zzVa;
                    iArr2[i2] = iArr2[i];
                }
                this.zzVb[i] = -1;
                this.zzVa[i] = this.zzV6;
                this.zznc.set(i, this.zzc2);
                this.zzV8[i] = this.zzuG;
                this.zzV6 = i;
                this.zzV5++;
                this.zzV7++;
                return true;
            }
            i2 = i;
            i = this.zzVa[i];
        }
        return false;
    }

    public zzZYI(int i) {
        zzZ4.zzY(i, "capacity");
        if (i > 0) {
            initialize(i);
        }
    }

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }

    private void zzZ(String str, int i, boolean z) {
        int i2;
        zzXs(str);
        if (this.zzVc == null) {
            initialize(0);
        }
        int iZzXr = zzXr(str);
        int[] iArr = this.zzVc;
        int i3 = iArr[iZzXr % iArr.length];
        while (i3 >= 0) {
            if (this.zzVb[i3] == iZzXr && zzk(this.zznc.get(i3), str)) {
                if (z) {
                    throw new IllegalStateException("A value with the specified key has already been added.");
                }
                this.zzV8[i3] = i;
                this.zzV7++;
                return;
            }
            i3 = this.zzVa[i3];
        }
        int i4 = this.zzV5;
        if (i4 > 0) {
            i2 = this.zzV6;
            this.zzV6 = this.zzVa[i2];
            this.zzV5 = i4 - 1;
        } else {
            if (this.zzZF == this.zzVb.length) {
                zzWx();
            }
            i2 = this.zzZF;
            this.zzZF = i2 + 1;
        }
        int[] iArr2 = this.zzVc;
        int length = iZzXr % iArr2.length;
        this.zzVb[i2] = iZzXr;
        this.zzVa[i2] = iArr2[length];
        this.zznc.set(i2, str);
        this.zzV8[i2] = i;
        this.zzVc[length] = i2;
        this.zzV7++;
    }

    public zzZYI(zzZYI zzzyi) {
        this(zzzyi != null ? zzzyi.getCount() : 0);
        zzZ4.zzY((Object) zzzyi, "dictionary");
        zzZ zzzZzr4 = zzzyi.zzr4();
        while (zzzZzr4.moveNext()) {
            zzZ(zzzZzr4.zzr3(), zzzZzr4.zzCL(), true);
        }
    }

    public zzZYI(boolean z) {
        this();
        this.zzc5 = !z;
    }

    public zzZYI(int i, byte b) {
        this(i);
        this.zzc5 = true;
    }
}
