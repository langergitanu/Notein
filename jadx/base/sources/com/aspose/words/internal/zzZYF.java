package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYF {
    private ArrayList<String> zzUY;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private boolean zzc5;
    private ArrayList<String> zznc;

    public static class zzZ {
        private int zzTL = -1;
        private int zzV7;
        private zzZYF zzbS;

        public zzZ(zzZYF zzzyf) {
            this.zzbS = zzzyf;
            this.zzV7 = zzzyf.zzV7;
        }

        private void zzCN() {
            if (this.zzTL == -1) {
                throw new IllegalStateException("An enumeration should be started before accessing current key or value.");
            }
        }

        private void zzCO() {
            if (this.zzV7 != this.zzbS.zzV7) {
                throw new IllegalStateException("The dictionary has been changed, the enumeration can not proceed.");
            }
        }

        public final boolean moveNext() {
            zzCO();
            do {
                int i = this.zzTL + 1;
                this.zzTL = i;
                if (i >= this.zzbS.zzZF) {
                    this.zzTL = -1;
                    return false;
                }
            } while (this.zzbS.zzVb[this.zzTL] < 0);
            return true;
        }

        public final String zzr0() {
            zzCN();
            return (String) this.zzbS.zzUY.get(this.zzTL);
        }

        public final String zzr3() {
            zzCN();
            return (String) this.zzbS.zznc.get(this.zzTL);
        }
    }

    public zzZYF() {
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
        this.zzUY = new ArrayList<>(iZzV9);
        for (int i3 = 0; i3 < iZzV9; i3++) {
            zzZQG.zzZ(this.zzUY, (Object) null);
        }
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
        for (int i2 = this.zzZF; i2 < iZzV9; i2++) {
            zzZQG.zzZ(this.zzUY, (Object) null);
        }
        for (int i3 = 0; i3 < this.zzZF; i3++) {
            int i4 = iArr2[i3] % iZzV9;
            iArr3[i3] = iArr[i4];
            iArr[i4] = i3;
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

    private static void zzY(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
    }

    private boolean zzk(String str, String str2) {
        return this.zzc5 ? zzZYD.zzh(str, str2) : zzZKN.zzX(str, str2, zzZOF.ORDINAL$4894b8c8);
    }

    public final void add(String str, String str2) {
        zzY(str, str2, true);
    }

    public final boolean containsKey(String str) {
        return zzXt(str) >= 0;
    }

    public final String get(String str) {
        int iZzXt = zzXt(str);
        if (iZzXt >= 0) {
            return this.zzUY.get(iZzXt);
        }
        return null;
    }

    public final int getCount() {
        return this.zzZF - this.zzV5;
    }

    public final void set(String str, String str2) {
        zzY(str, str2, false);
    }

    public final zzZ zzr1() {
        return new zzZ(this);
    }

    private zzZYF(byte b) {
        zzZ4.zzY(0, "capacity");
    }

    private void zzY(String str, String str2, boolean z) {
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
                if (!z) {
                    this.zzUY.set(i2, str2);
                    this.zzV7++;
                    return;
                }
                throw new IllegalStateException("A value with the specified key has already been added.");
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
        this.zzUY.set(i, str2);
        this.zzVc[length] = i;
        this.zzV7++;
    }

    public zzZYF(char c) {
        this();
        this.zzc5 = true;
    }
}
