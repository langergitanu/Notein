package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3D extends zzZ3E {
    static zzZ3D zzYaA;
    private static int zzYaB = com.aspose.words.internal.zzSA.zzn(1.45d);
    private boolean zzYaw;
    private boolean zzYax;
    private boolean zzYay;
    private boolean zzYaz;
    private boolean zzZCh;
    private int zzZCp;
    private com.aspose.words.internal.zzPV zzZf;
    private float zzZif;
    private float zzhB;

    static {
        zzZ3D zzz3dZzZ = zzZ(null, 0.0f, 0, com.aspose.words.internal.zzPV.zzHZ, 0.0f, false, false);
        zzYaA = zzz3dZzZ;
        zzz3dZzZ.zzUy(false);
        zzYaA.zzYN9();
    }

    public zzZ3D(zzX6 zzx6) {
        super(zzx6);
        this.zzZf = com.aspose.words.internal.zzPV.zzHZ;
        this.zzZCp = 0;
    }

    private float zz8S() {
        return Border.zzT(this.zzZCp, this.zzhB);
    }

    public static zzZ3D zzW(zzZ3D zzz3d) {
        if (zzz3d == null) {
            return new zzZ3D(null);
        }
        zzZ3D zzz3d2 = new zzZ3D(zzz3d.zzZoP());
        zzz3d2.zzY(zzz3d.zzZf);
        zzz3d2.zz2(zzz3d.zzhB);
        zzz3d2.setLineStyle(zzz3d.zzZCp);
        zzz3d2.zzUA(zzz3d.zzYaz);
        zzz3d2.zzUz(zzz3d.zzYay);
        zzz3d2.zzYs(zzz3d.zzZif);
        zzz3d2.zzUy(zzz3d.zzYax);
        zzz3d2.zzUB(zzz3d.zzYaw);
        return zzz3d2;
    }

    public static zzZ3D zzX(zzZ3D zzz3d) {
        if (zzz3d == null) {
            throw new IllegalArgumentException("src");
        }
        if (zzz3d.zzZoP() == null || zzz3d.isCached()) {
            return zzz3d;
        }
        zzZ3D zzz3d2 = (zzZ3D) com.aspose.words.internal.zzQW.zzZ((Map<zzZ3D, TValue>) zzz3d.zzZoP().zzZAB, zzz3d);
        if (zzz3d2 != null) {
            return zzz3d2;
        }
        com.aspose.words.internal.zzZQF.zzY(zzz3d.zzZoP().zzZAB, zzz3d, zzz3d);
        return zzz3d;
    }

    public static int zzYN2() {
        return zzYaB;
    }

    public static zzZ3D zzZ(zzX6 zzx6, float f, int i, com.aspose.words.internal.zzPV zzpv, float f2, boolean z, boolean z2) {
        return zzZ(zzx6, f, i, zzpv, f2, z, z2, false, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!zzZq(obj)) {
            return false;
        }
        zzZ3D zzz3d = (zzZ3D) obj;
        return this.zzhB == zzz3d.zzhB && this.zzZCp == zzz3d.zzZCp && com.aspose.words.internal.zzZKO.equals(this.zzZf, zzz3d.zzZf) && this.zzYaw == zzz3d.zzYaw && this.zzYaz == zzz3d.zzYaz && this.zzYay == zzz3d.zzYay && this.zzZif == zzz3d.zzZif && this.zzZCh == zzz3d.zzZCh && this.zzYax == zzz3d.zzYax;
    }

    public final int getLineStyle() {
        return this.zzZCp;
    }

    public final boolean isAmbient() {
        return this.zzYax;
    }

    public final boolean isFrame() {
        return this.zzYay;
    }

    public final boolean isVisible() {
        return Border.zzX(this.zzZCp, this.zzhB, this.zzZif);
    }

    public final void setLineStyle(int i) {
        zzYN6();
        this.zzZCp = i;
    }

    public final void zz2(float f) {
        zzYN6();
        this.zzhB = f;
    }

    public final boolean zz8F() {
        return this.zzZCh;
    }

    public final void zzUA(boolean z) {
        zzYN6();
        this.zzYaz = z;
    }

    public final void zzUB(boolean z) {
        zzYN6();
        this.zzYaw = z;
    }

    public final void zzUy(boolean z) {
        zzYN6();
        this.zzYax = z;
    }

    public final void zzUz(boolean z) {
        zzYN6();
        this.zzYay = z;
    }

    public final void zzY(com.aspose.words.internal.zzPV zzpv) {
        zzYN6();
        this.zzZf = zzpv.zzPF();
    }

    public final void zzYN(boolean z) {
        zzYN6();
        this.zzZCh = z;
    }

    public final int zzYN3() {
        if (!isVisible()) {
            return 0;
        }
        int iZzn = com.aspose.words.internal.zzSA.zzn(zz8S());
        if (this.zzYaz) {
            iZzn *= 2;
        }
        return com.aspose.words.internal.zzSA.zzn(this.zzZif) + iZzn;
    }

    public final boolean zzYN4() {
        return this.zzYaz;
    }

    public final boolean zzYN5() {
        return this.zzYaw;
    }

    @Override // com.aspose.words.zzZ3E
    public final void zzYN8() {
        zzUC(this.zzYaz);
        zzUC(this.zzYay);
        zzUC(this.zzYax);
        zzZY(this.zzZf);
        zzUC(this.zzYaw);
        zzwB(this.zzZCp);
        zzYt(this.zzhB);
        zzYt(this.zzZif);
        zzUC(this.zzZCh);
    }

    public final void zzYs(float f) {
        zzYN6();
        this.zzZif = f;
    }

    public final float zzZSd() {
        return this.zzZif;
    }

    public final com.aspose.words.internal.zzPV zzZy() {
        return this.zzZf;
    }

    public final float zzu4() {
        return this.zzhB;
    }

    public static zzZ3D zzZ(zzX6 zzx6, float f, int i, com.aspose.words.internal.zzPV zzpv, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        zzZ3D zzz3d = new zzZ3D(zzx6);
        zzz3d.zz2(f);
        zzz3d.setLineStyle(i);
        zzz3d.zzY(zzpv);
        zzz3d.zzYs(f2);
        zzz3d.zzUA(z);
        zzz3d.zzUz(z2);
        zzz3d.zzYN(z3);
        zzz3d.zzUB(z4);
        return zzX(zzz3d);
    }
}
