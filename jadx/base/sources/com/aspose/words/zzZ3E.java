package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ3E {
    private int zzV1;
    private boolean zzYaC;
    private zzX6 zzZEX;

    public zzZ3E(zzX6 zzx6) {
        this.zzZEX = zzx6;
    }

    public static boolean zzX(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean zzY(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        for (int i = 0; i < tArr.length; i++) {
            if (!com.aspose.words.internal.zzZKO.equals(tArr[i], tArr2[i])) {
                return false;
            }
        }
        return true;
    }

    private void zzYN7() {
        int i = this.zzV1;
        int i2 = i + (i << 10);
        this.zzV1 = i2 ^ (i2 >> 6);
    }

    public int hashCode() {
        zzYN9();
        return this.zzV1;
    }

    public boolean isCached() {
        return this.zzYaC;
    }

    public final <T> void zzR(T[] tArr) {
        if (tArr == null) {
            return;
        }
        for (T t : tArr) {
            zzZp(t);
        }
    }

    public final void zzUC(boolean z) {
        zzwA(com.aspose.words.internal.zzZKP.zzYY(z));
    }

    public final void zzYN6() {
        if (this.zzYaC) {
            throw new IllegalStateException("This instance is cached and cannot be modified.");
        }
    }

    public abstract void zzYN8();

    public final void zzYN9() {
        if (this.zzYaC) {
            return;
        }
        this.zzYaC = true;
        this.zzV1 = 0;
        zzYN8();
        int i = this.zzV1;
        int i2 = i + (i << 3);
        int i3 = i2 ^ (i2 >> 11);
        this.zzV1 = i3 + (i3 << 15);
    }

    public final void zzYt(float f) {
        zzwA(Float.floatToIntBits(f));
    }

    public final void zzZY(com.aspose.words.internal.zzPV zzpv) {
        if (zzpv == null) {
            return;
        }
        zzwA(zzpv.hashCode());
    }

    public final zzX6 zzZoP() {
        return this.zzZEX;
    }

    public final <T> void zzZp(T t) {
        if (t == null) {
            return;
        }
        t.getClass().isPrimitive();
        zzwA(t.hashCode());
    }

    public final boolean zzZq(Object obj) {
        return obj != null && getClass() == obj.getClass() && hashCode() == obj.hashCode();
    }

    public final void zzj(int[] iArr) {
        if (iArr == null) {
            return;
        }
        for (int i : iArr) {
            zzwA(i);
        }
    }

    public final void zzk(int[] iArr) {
        if (iArr == null) {
            return;
        }
        for (int i : iArr) {
            zzwA(i);
        }
    }

    public final void zzl(int[] iArr) {
        if (iArr == null) {
            return;
        }
        for (int i : iArr) {
            zzwA(i);
        }
    }

    public final void zzwA(int i) {
        this.zzV1 += i;
        zzYN7();
    }

    public final void zzwB(int i) {
        zzwA(i);
    }

    public static boolean zzY(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
