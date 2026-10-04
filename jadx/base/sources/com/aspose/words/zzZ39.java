package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ39 extends zzZ3E {
    private int mVerticalAlignment;
    private int zzVL;
    private int zzVN;
    private int zzY9e;
    private boolean zzY9f;
    private int zzY9g;
    private int zzY9h;
    private int zzY9i;
    private int zzY9j;
    private int zzY9k;
    private int zzY9l;
    private int zzZ2N;
    private int zzZim;
    private int zzvP;
    private int zzw9;
    private int zzwa;

    public zzZ39(zzX6 zzx6, boolean z) {
        super(zzx6);
        if (z) {
            zzYN9();
        }
    }

    public static int zzWN(int i, int i2) {
        if (i2 == 2) {
            return 0;
        }
        int iMax = Math.max(0, i);
        if (i2 == 0) {
            iMax = -iMax;
        }
        return iMax * 50;
    }

    public static zzZ39 zzX(zzZ39 zzz39) {
        if (zzz39 == null) {
            zzz39 = new zzZ39(null, true);
        }
        if (zzz39.zzZoP() == null || zzz39.isCached()) {
            return zzz39;
        }
        if (zzz39.equals(zzZ37.zzY8m)) {
            return zzZ37.zzY8m;
        }
        if (zzz39.equals(zzZ30.zzY7C)) {
            return zzZ30.zzY7C;
        }
        if (zzz39.equals(zzZ33.zzY7C)) {
            return zzZ33.zzY7C;
        }
        zzZ39 zzz392 = (zzZ39) com.aspose.words.internal.zzQW.zzZ((Map<zzZ39, TValue>) zzz39.zzZoP().zzZAD, zzz39);
        if (zzz392 != null) {
            return zzz392;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz39.zzZoP().zzZAD, zzz39, zzz39);
        return zzz39;
    }

    public static zzZ39 zzZo(Object obj) {
        zzY6N zzy6n = (zzY6N) com.aspose.words.internal.zzZKW.zzZ(obj, zzY6N.class);
        if (zzy6n != null) {
            return zzy6n.zzY6a().zzYLJ();
        }
        zzYMM zzymm = (zzYMM) com.aspose.words.internal.zzZKW.zzZ(obj, zzYMM.class);
        if (zzymm != null) {
            return ((zzZ37) zzymm.zzYTt()).zzTV(true);
        }
        zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(obj, zzY9X.class);
        if (zzy9x != null) {
            return zzy9x.zzY6M().zzYLJ();
        }
        zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(obj, zzZ55.class);
        if (zzz55 != null) {
            return ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzTV(true);
        }
        zzYIA zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(obj, zzYIA.class);
        if (zzyia != null) {
            return ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzY6a().zzYLJ();
        }
        throw new IllegalArgumentException("Cannot get floater properties from the specified reference object.\r\nParameter name: anchor");
    }

    public static boolean zzwc(int i) {
        return i == 1 || i == 2 || i == 4 || i == 5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ39 zzz39 = (zzZ39) obj;
        return this.zzwa == zzz39.zzwa && this.zzw9 == zzz39.zzw9 && this.zzVL == zzz39.zzVL && this.zzVN == zzz39.zzVN && this.zzY9l == zzz39.zzY9l && this.zzY9k == zzz39.zzY9k && this.zzY9j == zzz39.zzY9j && this.zzY9i == zzz39.zzY9i && this.zzZim == zzz39.zzZim && this.zzY9g == zzz39.zzY9g && this.mVerticalAlignment == zzz39.mVerticalAlignment && this.zzY9h == zzz39.zzY9h && this.zzZ2N == zzz39.zzZ2N && this.zzvP == zzz39.zzvP && this.zzY9f == zzz39.zzY9f && this.zzY9e == zzz39.zzY9e;
    }

    public final boolean getAllowOverlap() {
        return this.zzY9f;
    }

    public final int getHeight() {
        return this.zzVN;
    }

    public final int getHorizontalAlignment() {
        return this.zzZim;
    }

    public final int getLeft() {
        return this.zzwa;
    }

    public final int getOrientation() {
        return this.zzvP;
    }

    public final int getTop() {
        return this.zzw9;
    }

    public final int getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final int getWrapSide() {
        return this.zzY9e;
    }

    public final int getWrapType() {
        return this.zzZ2N;
    }

    public final boolean isFloating() {
        return this.zzZ2N != 0;
    }

    public final void setAllowOverlap(boolean z) {
        zzYN6();
        this.zzY9f = z;
    }

    public final void setHeight(int i) {
        zzYN6();
        this.zzVN = i;
    }

    public final void setHorizontalAlignment(int i) {
        zzYN6();
        this.zzZim = i;
    }

    public final void setLeft(int i) {
        zzYN6();
        this.zzwa = i;
    }

    public final void setOrientation(int i) {
        zzYN6();
        this.zzvP = i;
    }

    public final void setTop(int i) {
        zzYN6();
        this.zzw9 = i;
    }

    public final void setVerticalAlignment(int i) {
        zzYN6();
        this.mVerticalAlignment = i;
    }

    public final void setWidth(int i) {
        zzYN6();
        this.zzVL = i;
    }

    public final void setWrapSide(int i) {
        zzYN6();
        this.zzY9e = i;
    }

    public final void setWrapType(int i) {
        zzYN6();
        this.zzZ2N = i;
    }

    public final boolean zz6c() {
        int i = this.zzvP;
        return i == 1 || i == 3 || i == 5;
    }

    public final boolean zzYMb() {
        return zzwc(this.zzZ2N);
    }

    public final boolean zzYMc() {
        int i = this.zzY9h;
        return i == 2 || i == 3;
    }

    public final int zzYMd() {
        return this.zzY9h;
    }

    public final boolean zzYMe() {
        int i = this.mVerticalAlignment;
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    public final int zzYMf() {
        return this.zzY9g;
    }

    public final boolean zzYMg() {
        int i = this.zzZ2N;
        return i == 4 || i == 5;
    }

    public final int zzYMh() {
        return this.zzY9i;
    }

    public final int zzYMi() {
        return this.zzY9j;
    }

    public final int zzYMj() {
        return this.zzY9k;
    }

    public final int zzYMk() {
        return this.zzY9l;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzwB(this.zzwa);
        zzwB(this.zzw9);
        zzwB(this.zzVL);
        zzwB(this.zzVN);
        zzwB(this.zzY9l);
        zzwB(this.zzY9k);
        zzwB(this.zzY9j);
        zzwB(this.zzY9i);
        zzwB(this.zzZim);
        zzwB(this.zzY9g);
        zzwB(this.mVerticalAlignment);
        zzwB(this.zzY9h);
        zzwB(this.zzZ2N);
        zzwB(this.zzvP);
        zzUC(this.zzY9f);
        zzwB(this.zzY9e);
    }

    public final void zzwd(int i) {
        zzYN6();
        this.zzY9h = i;
    }

    public final void zzwe(int i) {
        zzYN6();
        this.zzY9g = i;
    }

    public final void zzwf(int i) {
        zzYN6();
        this.zzY9i = i;
    }

    public final void zzwg(int i) {
        zzYN6();
        this.zzY9j = i;
    }

    public final void zzwh(int i) {
        zzYN6();
        this.zzY9k = i;
    }

    public final void zzwi(int i) {
        zzYN6();
        this.zzY9l = i;
    }
}
