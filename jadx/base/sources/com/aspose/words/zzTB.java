package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzTB {
    private zzZ5E zzZsk = new zzZ5E();
    private boolean zzZsl;
    private int zzZsm;
    private zzTC zzZsn;
    private boolean zzZso;
    private int zzZsp;
    private zzTC zzZsq;

    private void zzZXA() throws Exception {
        zzYIA zzyia = (zzYIA) this.zzZsn;
        zzTC zztc = this.zzZsq;
        int iZzW = zzYI6.zzW((zzYIA) zztc, this.zzZsm - zztc.getY(), this.zzZsl);
        this.zzZsp = iZzW;
        if (this.zzZsq != zzyia && iZzW == 1) {
            this.zzZsp = 3;
        }
        if (zzyia.zza7().zzZYM() || this.zzZsp != 5) {
            return;
        }
        for (zzWV zzwv = (zzWV) ((zzYIC) zzyia.zza9()).zzZXZ(); zzwv != null && !zzwv.zzYTn(); zzwv = (zzWV) zzwv.zzYTp()) {
            for (zzWT zzwtZz6t = zzwv.zz6t(); zzwtZz6t != null; zzwtZz6t = (zzWT) zzwtZz6t.zzYo1()) {
                zzY5N zzy5nZzYG = zzwtZz6t.zzYG(false);
                if (zzy5nZzYG != null && zzy5nZzYG.zzXVS().getCount() > 0) {
                    zzy5nZzYG.zzYQ(zzy5nZzYG.zzXVS().zzBz(zzy5nZzYG.zzXVR()).zzZ90());
                }
            }
        }
    }

    private void zzZXB() throws Exception {
        zzYIA zzyia = (zzYIA) this.zzZsn;
        this.zzZsq = zzyia;
        zzYI9 zzyi9ZzB = zzYI9.zzB(zzyia);
        if (zzyi9ZzB.zzYjx()) {
            this.zzZsp = 9;
            return;
        }
        this.zzZsm = Math.min(this.zzZsm, zzyi9ZzB.zzYjw());
        if (zzyia.zza7().zzZYM() && zzyia.zzZXN() == null) {
            while (this.zzZsq.getY() > this.zzZsm && !((zzYIA) this.zzZsq).zzYjH()) {
                this.zzZsq = this.zzZsq.zzZXJ();
            }
        }
        this.zzZso = true;
    }

    private void zzZXC() throws Exception {
        zzZ55 zzz55 = (zzZ55) this.zzZsn;
        this.zzZsk.zzZ(zzz55, this.zzZsm, zzZ51.zzX(zzz55, this.zzZsl));
        this.zzZsq = this.zzZsk.zzYQZ();
        if (this.zzZsk.zzZXF() != 0) {
            this.zzZsp = this.zzZsk.zzZXF();
        } else if (zzz55.isActive()) {
            this.zzZso = true;
        } else {
            this.zzZsp = 0;
        }
    }

    private void zzZXz() throws Exception {
        zzTC zztc = this.zzZsq;
        this.zzZsp = zzZ51.zzX((zzZ55) zztc, this.zzZsm - zztc.getY(), this.zzZsl);
    }

    public final zzTB zzY(zzTC zztc, int i, boolean z) throws Exception {
        this.zzZsn = zztc;
        this.zzZsm = i;
        this.zzZsl = z;
        this.zzZsp = 0;
        this.zzZsq = null;
        this.zzZso = false;
        if (zztc instanceof zzZ55) {
            zzZXC();
            return this;
        }
        zzZXB();
        return this;
    }

    public final void zzZ(zzTC zztc, int i, boolean z) throws Exception {
        zzY(zztc, i, z);
        if (this.zzZso) {
            zzZXD();
        }
    }

    public final void zzZXD() throws Exception {
        if (this.zzZso) {
            if (this.zzZsn instanceof zzZ55) {
                zzZXz();
            } else {
                zzZXA();
            }
            this.zzZso = false;
        }
    }

    public final boolean zzZXE() {
        return this.zzZso;
    }

    public final int zzZXF() {
        return this.zzZsp;
    }

    public final zzTC zzZXG() {
        return this.zzZsq;
    }
}
