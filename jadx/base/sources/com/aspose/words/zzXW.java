package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;
import com.aspose.words.ref.RefBoolean;

/* JADX INFO: loaded from: classes6.dex */
final class zzXW {
    private int zzZBS;
    private int zzZBT;
    private int zzZBU;
    private zzXW zzZBV;
    private zzXW zzZBW;
    private zzXW zzZBX;
    private zzXW zzZBY;
    private Border zzZBZ;
    private Border zzZC0;
    private Border zzZC1;
    private Border zzZC2;
    private long zzZr = 0;

    public final zzXW zz85() {
        zzXW zzxw = this;
        while (true) {
            zzXW zzxw2 = zzxw.zzZBY;
            if (zzxw2 == null) {
                return zzxw;
            }
            zzxw = zzxw2;
        }
    }

    public final boolean zz86() {
        return (this.zzZBT & 8) != 0;
    }

    public final boolean zz87() {
        return (this.zzZBT & 4) != 0;
    }

    public final boolean zz88() {
        return (this.zzZBT & 2) != 0;
    }

    public final boolean zz89() {
        return (this.zzZBT & 1) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final int zz8a() {
        if (!zz8b()) {
            return 0;
        }
        ?? Zz89 = zz89();
        int i = Zz89;
        if (zz88()) {
            i = Zz89 + 1;
        }
        int i2 = i;
        if (zz87()) {
            i2 = i + 1;
        }
        return zz86() ? i2 + 1 : i2;
    }

    public final boolean zz8b() {
        int i = this.zzZBU;
        return i == 1 || i == 2;
    }

    public final boolean zz8c() {
        return this.zzZBU == 4;
    }

    public final boolean zz8d() {
        return this.zzZBU == 3;
    }

    public final boolean zz8e() {
        return this.zzZBU == 2;
    }

    public final zzXW zz8f() {
        return this.zzZBV;
    }

    public final zzXW zz8g() {
        return this.zzZBX;
    }

    public final zzXW zz8h() {
        return this.zzZBY;
    }

    public final zzXW zz8i() {
        if (zz8q() || zz8s()) {
            return null;
        }
        zzXW zzxw = this;
        while (zzxw != null && !zzxw.zz8q()) {
            int i = zzxw.zzZBS;
            if (i != 1 && i != 2) {
                break;
            }
            zzxw = zzxw.zzZBV;
        }
        zzXW zzxwZzU = zzU(zzxw);
        return zzxwZzU != null ? zzxwZzU.zzZBV : zzxwZzU;
    }

    public final zzXW zz8j() {
        if (zz8r() || zz8s()) {
            return null;
        }
        zzXW zzxw = this.zzZBW;
        while (zzxw != null && !zzxw.zz8r()) {
            int i = zzxw.zzZBS;
            if (i != 3 && i != 2) {
                break;
            }
            zzxw = zzxw.zzZBW;
        }
        return zzU(zzxw);
    }

    public final Border zz8k() {
        int i;
        return (zz8q() || zz8s() || (i = this.zzZBS) == 3 || i == 2) ? Border.zzZCe : this.zzZBZ;
    }

    public final Border zz8l() {
        int i;
        return (zz8r() || zz8s() || (i = this.zzZBW.zzZBS) == 1 || i == 2) ? Border.zzZCe : this.zzZC0;
    }

    public final Border zz8m() {
        return zz8q() ? Border.zzZCe : this.zzZBV.zz8n();
    }

    public final Border zz8n() {
        return zz8r() ? Border.zzZCe : this.zzZC1;
    }

    public final Border zz8o() {
        return zz8s() ? Border.zzZCe : this.zzZBX.zz8p();
    }

    public final Border zz8p() {
        return zz8t() ? Border.zzZCe : this.zzZC2;
    }

    public final boolean zz8q() {
        return this.zzZBV == null;
    }

    public final boolean zz8r() {
        return this.zzZBW == null;
    }

    public final boolean zz8s() {
        return this.zzZBX == null;
    }

    public final boolean zz8t() {
        return this.zzZBY == null;
    }

    public final void zz8x() {
        boolean z;
        this.zzZBT = 0;
        RefBoolean refBoolean = new RefBoolean(false);
        boolean zZzZ = zz8p().zzZ(zz8n(), refBoolean);
        boolean z2 = refBoolean.get();
        if (zZzZ) {
            this.zzZBT |= 5;
            z = z2;
        } else {
            z = false;
        }
        refBoolean.set(z2);
        boolean zZzZ2 = zz8n().zzZ(zz8o(), refBoolean);
        boolean z3 = refBoolean.get();
        if (zZzZ2) {
            this.zzZBT |= 6;
            z = z3;
        }
        refBoolean.set(z3);
        boolean zZzZ3 = zz8o().zzZ(zz8m(), refBoolean);
        boolean z4 = refBoolean.get();
        if (zZzZ3) {
            this.zzZBT |= 10;
            z = z4;
        }
        refBoolean.set(z4);
        boolean zZzZ4 = zz8m().zzZ(zz8p(), refBoolean);
        boolean z5 = refBoolean.get();
        if (zZzZ4) {
            this.zzZBT |= 9;
            z = z5;
        }
        if (this.zzZBT != 0) {
            this.zzZBU = z ? 2 : 1;
            return;
        }
        if (!zz8p().zzY(zz8o())) {
            if (zz8n().zzY(zz8m())) {
                this.zzZBU = 4;
                return;
            } else {
                this.zzZBU = 0;
                return;
            }
        }
        this.zzZBU = 3;
        if (zz8n().zzY(zz8m()) && zz8n().getLineStyle() == zz8p().getLineStyle() && zz8n().zz8S() > zz8p().zz8S()) {
            this.zzZBU = 4;
        }
    }

    public final void zzA(long j) {
        this.zzZr = j;
    }

    public final void zzF(float f, float f2) {
        this.zzZr = C22243OooO0Oo.OooO00o(f2, Float.intBitsToFloat((int) this.zzZr) + 0.0f, this.zzZr);
    }

    public final void zzOM(int i) {
        this.zzZBS = i;
    }

    public final void zzR(Border border) {
        this.zzZBZ = border;
    }

    public final void zzS(Border border) {
        this.zzZC0 = border;
    }

    public final void zzT(Border border) {
        this.zzZC1 = border;
    }

    public final void zzU(Border border) {
        this.zzZC2 = border;
    }

    public final void zzV(zzXW zzxw) {
        this.zzZBV = zzxw;
    }

    public final void zzW(zzXW zzxw) {
        this.zzZBW = zzxw;
    }

    public final void zzX(zzXW zzxw) {
        this.zzZBX = zzxw;
    }

    public final void zzY(zzXW zzxw) {
        this.zzZBY = zzxw;
    }

    public final long zzZE() {
        return this.zzZr;
    }

    public final zzXW zzZF(float f) {
        if (!zz8t()) {
            return this.zzZBY.zzZG(f);
        }
        if (f >= Float.intBitsToFloat((int) this.zzZr)) {
            return null;
        }
        zzXW zzxw = new zzXW();
        zzxw.zzZr = com.aspose.words.internal.zzZPY.zzG(f, com.aspose.words.internal.zzZPY.zzYC(this.zzZr));
        this.zzZBY = zzxw;
        zzxw.zzZBX = this;
        return zzxw;
    }

    public final zzXW zzZG(float f) {
        zzXW zzxw = this.zzZBX;
        if (Float.intBitsToFloat((int) this.zzZr) >= f) {
            return null;
        }
        if (!zz8s() && f >= Float.intBitsToFloat((int) zzxw.zzZr)) {
            return null;
        }
        zzXW zzxw2 = new zzXW();
        zzxw2.zzZr = com.aspose.words.internal.zzZPY.zzG(f, com.aspose.words.internal.zzZPY.zzYC(this.zzZr));
        this.zzZBX = zzxw2;
        zzxw2.zzZBY = this;
        if (zzxw != null) {
            zzxw2.zzZBX = zzxw;
            zzxw.zzZBY = zzxw2;
        }
        return zzxw2;
    }

    private static zzXW zzU(zzXW zzxw) {
        if (zzxw != null) {
            while (true) {
                zzXW zzxw2 = zzxw.zzZBX;
                if (zzxw2 == null) {
                    break;
                }
                if (zzxw2.zzZBV != null) {
                    return zzxw2;
                }
                zzxw = zzxw2;
            }
        }
        return zzxw;
    }
}
