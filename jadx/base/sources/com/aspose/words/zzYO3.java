package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYO3 implements Cloneable {
    private boolean zzXIF;
    private int zzXIG;
    private boolean zzXIH;
    private int zzjZ = 0;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int zzD2(String str) {
        int iZzZv = com.aspose.words.internal.zzJB.zzZv(str);
        switch (iZzZv) {
            case 11:
            case 12:
            case 14:
            case 15:
                return iZzZv;
            case 13:
            default:
                return 0;
        }
    }

    public static void zzY(Document document, int i) {
        if (document.zzZqn() == null) {
            document.zzZ(new zzYO3());
        }
        document.zzZqn().zzqU(i);
    }

    private boolean zzYr7() {
        return this.zzXIG >= 14;
    }

    public static int zzZ(zzYO3 zzyo3, OoxmlSaveOptions ooxmlSaveOptions) {
        if (ooxmlSaveOptions == null) {
            if (zzyo3 == null) {
                return 0;
            }
            return zzyo3.zzjZ;
        }
        int iZzYr3 = (ooxmlSaveOptions.zzYqW() || zzyo3 == null) ? ooxmlSaveOptions.zzYr3() : zzyo3.zzjZ;
        if (zzyo3 == null || (!(zzyo3.zzXIH || zzyo3.zzYr7()) || iZzYr3 > 0)) {
            return iZzYr3;
        }
        return 1;
    }

    public static void zzd(Document document) {
        if (document.zzZqn() == null) {
            document.zzZ(new zzYO3());
        }
        document.zzZqn().zzYr8();
    }

    public static void zze(Document document) {
        if (document.zzZqn() == null) {
            document.zzZ(new zzYO3());
        }
        document.zzZqn().zzYr6();
    }

    public final int getCompliance() {
        return this.zzjZ;
    }

    public final void zzYr4() {
        this.zzXIF = true;
    }

    public final boolean zzYr5() {
        return this.zzXIF;
    }

    public final void zzYr6() {
        if (this.zzXIG < 14) {
            this.zzXIG = 14;
        }
        zzYrc();
    }

    public final void zzYr8() {
        this.zzXIH = true;
        zzYrc();
    }

    public final boolean zzYr9() {
        return this.zzjZ == 2;
    }

    public final void zzYra() {
        this.zzjZ = 1;
    }

    public final void zzYrb() {
        if (this.zzjZ < 2) {
            this.zzjZ = 2;
        }
    }

    public final void zzYrc() {
        if (this.zzjZ <= 0) {
            this.zzjZ = 1;
        }
    }

    public final zzYO3 zzYrd() {
        return (zzYO3) memberwiseClone();
    }

    public final int zzZlO() {
        return this.zzXIG;
    }

    public final void zzqU(int i) {
        if (this.zzXIG >= i) {
            return;
        }
        this.zzXIG = i;
        if (zzYr7()) {
            zzYrc();
        }
    }
}
