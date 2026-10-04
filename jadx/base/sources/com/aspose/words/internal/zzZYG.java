package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYG<TValue> {
    private ArrayList<TValue> zzUY;
    private int zzV5;
    private int zzV6;
    private int zzV7;
    private int[] zzVa;
    private int[] zzVb;
    private int[] zzVc;
    private int zzZF;
    private TValue zza;
    private zzZYG<TValue>.zzX zzbX;
    private zzZYG<TValue>.zzY zzbY;
    private String zzc2;
    private boolean zzc5;
    private ArrayList<String> zznc;

    public class zzX implements Iterable<TValue> {
        private zzZYG<TValue> zzUP;

        public class zzZ implements Iterator<TValue> {
            private zzZYG<TValue>.zzZ zzbV;

            public zzZ(zzZYG<TValue> zzzyg) {
                this.zzbV = zzzyg.zzr2();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.zzbV.moveNext();
            }

            @Override // java.util.Iterator
            public final TValue next() {
                return this.zzbV.zzCI();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public zzX(zzZYG<TValue> zzzyg) {
            this.zzUP = zzzyg;
        }

        @Override // java.lang.Iterable
        public final Iterator<TValue> iterator() {
            return new zzZ(this.zzUP);
        }
    }

    public class zzY implements Iterable<String> {
        private zzZYG<TValue> zzUP;

        public class zzZ implements Iterator<String> {
            private zzZYG<TValue>.zzZ zzbV;

            public zzZ(zzZYG<TValue> zzzyg) {
                this.zzbV = zzzyg.zzr2();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.zzbV.moveNext();
            }

            @Override // java.util.Iterator
            public final /* synthetic */ String next() {
                return this.zzbV.zzr3();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public zzY(zzZYG<TValue> zzzyg) {
            this.zzUP = zzzyg;
        }

        @Override // java.lang.Iterable
        public final Iterator<String> iterator() {
            return new zzZ(this.zzUP);
        }
    }

    public class zzZ {
        private int zzTL = -1;
        private zzZYG<TValue> zzUP;
        private int zzV7;

        public zzZ(zzZYG<TValue> zzzyg) {
            this.zzUP = zzzyg;
            this.zzV7 = ((zzZYG) zzzyg).zzV7;
        }

        private void zzCN() {
            if (this.zzTL == -1) {
                throw new IllegalStateException("An enumeration should be started before accessing current key or value.");
            }
        }

        private void zzCO() {
            if (this.zzV7 != ((zzZYG) this.zzUP).zzV7) {
                throw new IllegalStateException("The dictionary has been changed, the enumeration can not proceed.");
            }
        }

        public final boolean moveNext() {
            zzCO();
            do {
                int i = this.zzTL + 1;
                this.zzTL = i;
                if (i >= ((zzZYG) this.zzUP).zzZF) {
                    this.zzTL = -1;
                    return false;
                }
            } while (((zzZYG) this.zzUP).zzVb[this.zzTL] < 0);
            return true;
        }

        public final TValue zzCI() {
            zzCN();
            return (TValue) ((zzZYG) this.zzUP).zzUY.get(this.zzTL);
        }

        public final String zzr3() {
            zzCN();
            return (String) ((zzZYG) this.zzUP).zznc.get(this.zzTL);
        }
    }

    public zzZYG() {
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

    private void zzZ(String str, TValue tvalue, boolean z) {
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
                this.zzUY.set(i2, tvalue);
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
        this.zzUY.set(i, tvalue);
        this.zzVc[length] = i;
        this.zzV7++;
    }

    private boolean zzk(String str, String str2) {
        return this.zzc5 ? zzZYD.zzh(str, str2) : zzZKN.zzX(str, str2, zzZOF.ORDINAL$4894b8c8);
    }

    public final void clear() {
        if (this.zzZF == 0) {
            return;
        }
        zzY(this.zzVc);
        zzZKV.zzX(this.zzVb, 0, this.zzZF);
        zzZKV.zzX(this.zzVa, 0, this.zzZF);
        for (int i = 0; i < this.zzZF; i++) {
            this.zznc.set(i, null);
        }
        for (int i2 = 0; i2 < this.zzZF; i2++) {
            this.zzUY.set(i2, null);
        }
        this.zzV6 = -1;
        this.zzZF = 0;
        this.zzV5 = 0;
        this.zzV7++;
    }

    public final boolean containsKey(String str) {
        return zzXt(str) >= 0;
    }

    public final TValue get(String str) {
        int iZzXt = zzXt(str);
        if (iZzXt >= 0) {
            return this.zzUY.get(iZzXt);
        }
        return null;
    }

    public final int getCount() {
        return this.zzZF - this.zzV5;
    }

    public final void set(String str, TValue tvalue) {
        zzZ(str, tvalue, false);
    }

    public final Iterable<TValue> zzCJ() {
        zzZYG<TValue>.zzX zzx = this.zzbX;
        if (zzx != null) {
            return zzx;
        }
        zzZYG<TValue>.zzX zzx2 = new zzX(this);
        this.zzbX = zzx2;
        return zzx2;
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
                this.zzUY.set(i, this.zza);
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

    public final zzZYG<TValue>.zzZ zzr2() {
        return new zzZ(this);
    }

    public final Iterable<String> zzxs() {
        if (this.zzbY == null) {
            this.zzbY = new zzY(this);
        }
        return this.zzbY;
    }

    private zzZYG(int i) {
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

    public final void zzW(String str, TValue tvalue) {
        zzZ(str, tvalue, true);
    }

    public zzZYG(zzZYG<TValue> zzzyg) {
        this(zzzyg != null ? zzzyg.getCount() : 0);
        zzZ4.zzY((Object) zzzyg, "dictionary");
        zzZYG<TValue>.zzZ zzzZzr2 = zzzyg.zzr2();
        while (zzzZzr2.moveNext()) {
            zzZ(zzzZzr2.zzr3(), zzzZzr2.zzCI(), true);
        }
    }

    public zzZYG(boolean z) {
        this();
        this.zzc5 = !z;
    }

    public zzZYG(int i, byte b) {
        this(i);
        this.zzc5 = true;
    }
}
