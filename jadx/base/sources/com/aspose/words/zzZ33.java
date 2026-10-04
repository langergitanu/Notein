package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ33 extends zzZ3E {
    static zzZ39 zzY7C;
    private static int zzY7v;
    private static boolean zzY7w;
    private static int zzY7x = zzN(((Integer) zzYC3.zzOt(EditingLanguage.ARABIC_LIBYA)).intValue(), ((Integer) zzYC3.zzOt(4154)).intValue(), ((Boolean) zzYC3.zzOt(954)).booleanValue());
    private static boolean zzY7y = ((Boolean) zzYC3.zzOt(948)).booleanValue();
    private int zzY7A;
    private boolean zzY7B;
    private boolean zzY7z;
    private zzZ39 zzY8U;
    private int zzZ5p;

    static {
        zzY7w = ((Boolean) zzYC3.zzOt(944)).booleanValue();
        zzY7v = ((Integer) zzYC3.zzOt(136)).intValue();
        zzY7w = ((Boolean) zzYC3.zzOt(944)).booleanValue();
        zzY7v = ((Integer) zzYC3.zzOt(136)).intValue();
        zzZ39 zzz39 = new zzZ39(null, false);
        zzY7C = zzz39;
        zzz39.setWrapType(3);
        zzY7C.setLeft(com.aspose.words.internal.zzSA.zzn(0.0d));
        zzY7C.setTop(com.aspose.words.internal.zzSA.zzn(0.0d));
        zzY7C.zzwe(2);
        zzY7C.setHorizontalAlignment(0);
        zzY7C.setVerticalAlignment(0);
        zzY7C.zzwd(2);
        zzY7C.setAllowOverlap(true);
        zzY7C.zzYN9();
    }

    public zzZ33(zzX6 zzx6) {
        super(zzx6);
        this.zzZ5p = zzY7x;
        this.zzY7B = zzY7w;
        this.zzY7A = zzY7v;
        this.zzY8U = zzY7C;
        this.zzY7z = zzY7y;
    }

    public static int zzN(int i, int i2, boolean z) {
        if (i == 0) {
            return 0;
        }
        return Math.max(0, i2) + (z ? Integer.MIN_VALUE : 0) + 1;
    }

    public static zzZ33 zzZ(zzZ33 zzz33) {
        zzz33.zzZoP();
        return zzz33;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ33 zzz33 = (zzZ33) obj;
        return this.zzZ5p == zzz33.zzZ5p && this.zzY7B == zzz33.zzY7B && this.zzY7A == zzz33.zzY7A && this.zzY7z == zzz33.zzY7z && com.aspose.words.internal.zzZKO.equals(zzYLJ(), zzz33.zzYLJ());
    }

    public final int getZOrder() {
        return this.zzZ5p;
    }

    @Override // com.aspose.words.zzZ3E
    public final boolean isCached() {
        return true;
    }

    public final boolean isHorizontalRule() {
        return this.zzY7z;
    }

    public final void setZOrder(int i) {
        zzYN6();
        this.zzZ5p = i;
    }

    public final void zzTK(boolean z) {
        zzYN6();
        this.zzY7z = z;
    }

    public final void zzTL(boolean z) {
        zzYN6();
        this.zzY7B = z;
    }

    public final void zzW(zzZ39 zzz39) {
        zzYN6();
        this.zzY8U = zzz39;
    }

    public final int zzYL8() {
        return this.zzY7A;
    }

    public final boolean zzYL9() {
        return this.zzY7B;
    }

    public final zzZ39 zzYLJ() {
        if (this.zzY8U == null) {
            zzZ39 zzz39 = new zzZ39(zzZoP(), false);
            this.zzY8U = zzz39;
            zzz39.setWrapType(zzY7C.getWrapType());
            this.zzY8U.setLeft(zzY7C.getLeft());
            this.zzY8U.setTop(zzY7C.getTop());
            this.zzY8U.zzwe(zzY7C.zzYMf());
            this.zzY8U.setHorizontalAlignment(zzY7C.getHorizontalAlignment());
            this.zzY8U.setVerticalAlignment(zzY7C.getVerticalAlignment());
            this.zzY8U.zzwd(zzY7C.zzYMd());
        }
        return this.zzY8U;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzwB(this.zzZ5p);
        zzUC(this.zzY7B);
        zzwB(this.zzY7A);
        zzUC(this.zzY7z);
        zzZp(zzYLJ());
    }

    public final void zzvB(int i) {
        zzYN6();
        this.zzY7A = i;
    }
}
