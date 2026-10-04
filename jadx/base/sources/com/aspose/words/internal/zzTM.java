package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzTM {
    private zzPV zzRe;
    private zzPV zzRf;

    public zzTM(zzPV zzpv, int i) {
        if (zzpv == null || zzpv.isEmpty()) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: center");
        }
        this.zzRf = new zzPV(Math.max(zzpv.zzPC() - i, 0), Math.max(zzpv.zzPB() - i, 0), Math.max(zzpv.zzPA() - i, 0));
        this.zzRe = new zzPV(Math.min(zzpv.zzPC() + i, 255), Math.min(zzpv.zzPB() + i, 255), Math.min(zzpv.zzPA() + i, 255));
    }

    public final boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzTM.class) {
            return false;
        }
        zzTM zztm = (zzTM) obj;
        return zzPV.zzZ(this.zzRf, zztm.zzRf) && zzPV.zzZ(this.zzRe, zztm.zzRe);
    }

    public final int hashCode() {
        return (this.zzRf.hashCode() * 397) ^ this.zzRe.hashCode();
    }

    public final boolean zzT(zzPV zzpv) {
        return zzV(zzpv.zzPC(), zzpv.zzPB(), zzpv.zzPA());
    }

    public final zzPV zzTR() {
        return this.zzRe;
    }

    public final zzPV zzTS() {
        return this.zzRf;
    }

    public final boolean zzV(int i, int i2, int i3) {
        return i >= this.zzRf.zzPC() && i <= this.zzRe.zzPC() && i2 >= this.zzRf.zzPB() && i2 <= this.zzRe.zzPB() && i3 >= this.zzRf.zzPA() && i3 <= this.zzRe.zzPA();
    }

    public zzTM(zzPV zzpv, zzPV zzpv2) {
        if (zzpv != null && !zzpv.isEmpty()) {
            if (zzpv2 != null && !zzpv2.isEmpty()) {
                this.zzRf = zzpv;
                this.zzRe = zzpv2;
                return;
            }
            throw new NullPointerException("Value cannot be null.\r\nParameter name: highColor");
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: lowColor");
    }
}
