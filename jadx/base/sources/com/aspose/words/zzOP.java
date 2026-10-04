package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzOP extends zzMS {
    private zzMP zzZpU;

    public zzOP(String str, boolean z, zzMP zzmp) {
        super(str, z);
        this.zzZpU = zzmp;
    }

    public static zzMP zzX(zzMP zzmp, zzQK zzqk) {
        if (zzmp.getCount() != 1 || zzmp.zzZVx().getValueType() != 4) {
            return zzmp;
        }
        zzOI zzoi = (zzOI) zzmp.zzZVx();
        if (!zzoi.isRelative()) {
            return zzmp;
        }
        double dZzZ = zzL5.zzZ(zzoi, zzqk.zzZWF(), zzqk.zzZWE());
        return !com.aspose.words.internal.zzAN.zzL(dZzZ, -1.7976931348623157E308d) ? new zzMP(new zzOI(dZzZ, 4)) : zzmp;
    }

    @Override // com.aspose.words.zzMS
    public final zzPS zzY(zzL2 zzl2, boolean z, boolean z2) {
        zzPT zzptZzX = zzX(zzl2, z, z2);
        if (zzptZzX != null) {
            return new zzPS(zzptZzX);
        }
        return null;
    }

    public final zzPT zzYc(boolean z) {
        if (this.zzZpU != null) {
            return new zzM3(getName(), this.zzZpU, z);
        }
        return null;
    }

    public zzPT zzYi(boolean z) {
        return new zzM3(getName(), new zzMP(zzL4.zzZnn), z);
    }

    public abstract zzMP zzZ(zzL2 zzl2, boolean z);

    public zzMP zzZ(zzMP zzmp, zzQK zzqk) {
        return zzX(zzmp, zzqk);
    }

    public abstract zzPT zzZ(zzL2 zzl2, int i, boolean z, boolean z2, RefInt refInt);

    @Override // com.aspose.words.zzMS
    public final zzMP zzZW0() {
        return this.zzZpU;
    }

    @Override // com.aspose.words.zzMS
    public final zzMP zzY(zzMP zzmp, zzQK zzqk) {
        zzMP zzmp2;
        if (zzmp.getCount() > 0 && zzmp.zzZVy() && (zzmp2 = this.zzZpU) != null) {
            zzmp = zzmp2;
        }
        return zzZ(zzmp, zzqk);
    }

    public final zzPT zzX(zzL2 zzl2, boolean z, boolean z2) {
        zzMP zzmpZzZ;
        if (zzl2.getCount() == 1 && zzl2.zzMl(0).zzP(zzL4.zzZnn)) {
            zzmpZzZ = new zzMP(zzL4.zzZnn);
        } else if (zzl2.getCount() == 1 && zzl2.zzMl(0).zzP(zzL4.zzZnm)) {
            zzmpZzZ = new zzMP(zzL4.zzZnm);
        } else {
            zzmpZzZ = zzZ(zzl2, z2);
        }
        if (zzmpZzZ != null) {
            return new zzM3(getName(), zzmpZzZ, z);
        }
        return null;
    }
}
