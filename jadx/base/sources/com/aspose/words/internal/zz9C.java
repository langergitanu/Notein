package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9C implements zzGA {
    private boolean zzqD;
    private int zzqu;
    private zzD3<zzGB> zzqv = new zzD3<>();

    public zz9C(boolean z) {
        this.zzqD = z;
    }

    private void zzA(zzPV zzpv) {
        zzY(zzPV.zzZ(zzpv, zzPV.zzHZ) ? zz8U.zzz5() : zz8U.zzz(zzpv));
    }

    private void zzB(zzPV zzpv) {
        zzY(zzpv.isEmpty() ? new zz9T() : new zz9P(zzpv));
    }

    private void zzYp(String str) {
        zz8W zz8w = new zz8W(this.zzqD);
        zz8w.zzYn(str);
        zzY(zz8w);
    }

    private void zzzL() {
        zzY(new zz8X());
    }

    private int zzzM() {
        for (int i = 0; i < this.zzqv.getCount(); i++) {
            if (!this.zzqv.zzVE(i)) {
                throw new IllegalStateException("WMF Objects find slot error");
            }
            if (this.zzqv.get(i) == null) {
                return i;
            }
        }
        return this.zzqv.getCount();
    }

    public final void delete(int i) {
        if (!this.zzqD) {
            this.zzqv.set(i, null);
        } else {
            if ((i & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                return;
            }
            this.zzqv.zzVG(i);
        }
    }

    public final void zzUP(int i) {
        for (int i2 = 0; (((long) i2) & 4294967295L) < i; i2++) {
            zzD3<zzGB> zzd3 = this.zzqv;
            int i3 = this.zzqu;
            this.zzqu = i3 + 1;
            zzd3.set(i3, null);
        }
    }

    @Override // com.aspose.words.internal.zzGA
    public final zzGB zzWd(int i) {
        return this.zzqv.get(i);
    }

    public final void zzY(zzGB zzgb) {
        int iZzzM;
        if (this.zzqD) {
            if (this.zzqv.getCount() <= 19) {
                int i = this.zzqu;
                this.zzqu = i + 1;
                iZzzM = i | Integer.MIN_VALUE;
                zzgb.zzWe(iZzzM);
            } else {
                iZzzM = zzgb.getHandle();
            }
        } else if (zzgb == null) {
            return;
        } else {
            iZzzM = zzzM();
        }
        this.zzqv.set(iZzzM, zzgb);
    }

    public final void zzzK() {
        zzB(zzPV.zzI5);
        zzB(zzPV.zzKa);
        zzB(zzPV.zzJu);
        zzB(new zzPV(64, 64, 64));
        zzB(zzPV.zzKa);
        zzB(zzPV.zzHZ);
        zzA(zzPV.zzI5);
        zzA(zzPV.zzKa);
        zzA(zzPV.zzHZ);
        zzA(zzPV.zzHZ);
        zzYp("Microsoft Sans Serif");
        zzYp("Courier New");
        zzYp("Microsoft Sans Serif");
        zzYp("Tahoma");
        zzYp("Microsoft Sans Serif");
        zzY(new zz8V());
        zzYp("Microsoft Sans Serif");
        zzYp("Microsoft Sans Serif");
        zzzL();
        zzzL();
    }
}
