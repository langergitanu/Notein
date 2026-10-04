package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzDR {
    private int zzvN;
    private zzZG zzvn;
    private zzHS zzvo;
    private zzED zzvp;
    protected zzDZ zzvq;

    public zzDR(zzDZ zzdz, zzED zzed, zzHS zzhs, int i) {
        this.zzvq = zzdz;
        this.zzvp = zzed;
        this.zzvo = zzhs;
        this.zzvN = i;
    }

    private static zzPV zzY(zzED zzed) {
        return zzed.zzDJ() == 2 ? new zzPV(127, zzed.zzZy()) : zzed.zzZy();
    }

    public final int zzDA() {
        return this.zzvN;
    }

    public final zzZG zzDa() {
        zzHS zzhs = this.zzvo;
        return zzhs != null ? zzhs.zzN(zzDb()) : zzDb();
    }

    public final zzZG zzDb() {
        if (this.zzvn == null) {
            zzZG zzzg = new zzZG();
            this.zzvn = zzzg;
            zzzg.zzY(new zzOI(zzY(this.zzvp)));
        }
        return this.zzvn;
    }

    public final long zzDc() {
        float fZzDr = this.zzvp.zzDG() ? 1.0f : this.zzvq.zzDr();
        float fZzZ = (float) zzE0.zzZ((float) this.zzvp.getWidth(), this.zzvp.zzDF(), this.zzvN);
        float fZzZ2 = (float) zzE0.zzZ((float) this.zzvp.getHeight(), this.zzvp.zzDE(), this.zzvN);
        return this.zzvp.zzDG() ? zzZPW.zzG(fZzZ, fZzZ2) : zzZPW.zzG(fZzZ * fZzDr, fZzZ2 * fZzDr);
    }

    public final zzZG zzDd() {
        zzDZ zzdz = this.zzvq;
        return (zzdz == null || zzdz.getCount() == 0) ? new zzZG() : this.zzvq.getCount() == 1 ? zzDw() : zzDx();
    }

    public abstract zzZG zzDw();

    public abstract zzZG zzDx();
}
