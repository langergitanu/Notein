package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ31 extends zzZ3E {
    private int zzY6E;
    private int[] zzY6F;
    private int[] zzY6G;
    private int[] zzY6H;
    private static int[] zzY6K = new int[0];
    private static int[] zzY6J = new int[0];
    private static int[] zzY6I = new int[0];

    public zzZ31(zzX6 zzx6, boolean z) {
        super(zzx6);
        this.zzY6H = zzY6K;
        this.zzY6G = zzY6J;
        this.zzY6F = zzY6I;
        this.zzY6E = -1;
        if (z) {
            zzYN9();
        }
    }

    public static zzZ31 zzY(zzZ31 zzz31) {
        if (zzz31 == null) {
            zzz31 = new zzZ31(null, true);
        }
        if (zzz31.zzZoP() == null || zzz31.isCached()) {
            return zzz31;
        }
        zzZ31 zzz312 = (zzZ31) com.aspose.words.internal.zzQW.zzZ((Map<zzZ31, TValue>) zzz31.zzZoP().zzZAz, zzz31);
        if (zzz312 != null) {
            return zzz312;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz31.zzZoP().zzZAz, zzz31, zzz31);
        return zzz31;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ31 zzz31 = (zzZ31) obj;
        return this.zzY6E == zzz31.zzY6E && com.aspose.words.internal.zzZ1.zzZ(this.zzY6H, zzz31.zzY6H) && zzZ3E.zzY(this.zzY6G, zzz31.zzY6G) && zzZ3E.zzX(this.zzY6F, zzz31.zzY6F);
    }

    public final int getCount() {
        return zzYKy().length;
    }

    public final int[] zzYKA() {
        if (this.zzY6G == null) {
            this.zzY6G = new int[0];
        }
        return this.zzY6G;
    }

    public final boolean zzYKw() {
        return this.zzY6E >= 0;
    }

    public final int zzYKx() {
        return this.zzY6E;
    }

    public final int[] zzYKy() {
        if (this.zzY6H == null) {
            this.zzY6H = new int[0];
        }
        return this.zzY6H;
    }

    public final int[] zzYKz() {
        if (this.zzY6F == null) {
            this.zzY6F = new int[0];
        }
        return this.zzY6F;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzj(this.zzY6H);
        zzl(this.zzY6G);
        zzk(this.zzY6F);
        zzwB(this.zzY6E);
    }

    public final void zzf(int[] iArr) {
        zzYN6();
        this.zzY6H = iArr;
    }

    public final void zzg(int[] iArr) {
        zzYN6();
        this.zzY6F = iArr;
    }

    public final void zzh(int[] iArr) {
        zzYN6();
        this.zzY6G = iArr;
    }

    public final void zzvo(int i) {
        zzYN6();
        this.zzY6E = i;
    }
}
