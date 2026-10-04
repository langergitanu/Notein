package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzN8 extends zz6 {
    private zzN7 zzEI;
    private int zzEo;
    private long zzEp;

    public zzN8(zzZOP zzzop, long j, float f, float f2) throws Exception {
        this(zzzop, j, f, f2, (byte) 0);
    }

    private void zzKv() throws Exception {
        zzN9 zzn9ZzKs = this.zzEI.zzKs();
        int i = this.zzEo - 1;
        this.zzEo = i;
        zzn9ZzKs.zzXd(i);
    }

    private void zzKz() throws Exception {
        this.zzEI.zzKs().zzKC();
        this.zzEI.zzKs().zzKB();
    }

    private void zzR(zzHU zzhu) throws Exception {
        if (zzZT.zzV(zzhu) || zzZT.zzU(zzhu)) {
            zzKv();
        }
    }

    private void zzS(zzHU zzhu) throws Exception {
        zzN9 zzn9ZzKs = this.zzEI.zzKs();
        int i = this.zzEo;
        this.zzEo = i + 1;
        zzn9ZzKs.zzXe(i);
        if (zzZT.zzV(zzhu)) {
            this.zzEI.zzKs().zzI(zzhu.zzZO());
        }
        if (zzZT.zzU(zzhu)) {
            this.zzEI.zzKs().zzXc(this.zzEI.zzKr().zzN(zzhu.zzZN()));
        }
    }

    private void zzT(zzHU zzhu) throws Exception {
        if (zzZT.zzV(zzhu) || zzZT.zzU(zzhu)) {
            zzS(zzhu);
        }
    }

    private void zzV(zzZU zzzu) throws Exception {
        this.zzEI.zzKs().zzI(zzzu.zzZs());
    }

    public final void zzG(zzPV zzpv) throws Exception {
        if (zzpv.zzPD() != 0) {
            this.zzEI.zzKs().zzH(zzpv);
        }
    }

    public final void zzKA() throws Exception {
        this.zzEI.zzKu().zzZ(this.zzEp, this.zzEI.getHorizontalResolution(), this.zzEI.getVerticalResolution());
        this.zzEI.zzKu().zzJ8();
        this.zzEI.zzKs().zzKF();
        zzKz();
    }

    public final void zzKw() throws Exception {
        this.zzEI.zzKs().zzXa(7);
    }

    public final void zzKx() throws Exception {
        this.zzEI.zzKs().zzXb(2);
    }

    public final void zzKy() throws Exception {
        this.zzEI.zzKs().zzKE();
        this.zzEI.zzKu().zzKD();
        this.zzEI.zzKu().zzKE();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) throws Exception {
        zzR(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        zzT(zzg);
    }

    private zzN8(zzZOP zzzop, long j, float f, float f2, byte b) throws Exception {
        this.zzEp = j;
        this.zzEI = new zzN7(zzzop, f, f2, null);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        if (zzPV.zzZ(zzzu.zzZy(), zzPV.zzHZ) && zzPV.zzZ(zzzu.zzZq(), zzPV.zzHZ)) {
            return;
        }
        zzS(zzzu);
        int iZzPk = zzzu.zzZr().zzPk();
        if (zzzu.zzZr().zzPi()) {
            zzV(zzzu);
            iZzPk &= -3;
        }
        int iZzZ = this.zzEI.zzKr().zzZ(zzzu.zzZr(), iZzPk);
        long jZzG = zzZPY.zzG(zzzu.zzZm(), zzzu.zzZo());
        if (!zzPV.zzZ(zzzu.zzZy(), zzPV.zzHZ)) {
            this.zzEI.zzKs().zzZ(iZzZ, zzzu.getText(), zzzu.zzZy(), jZzG, this.zzEI.zzKr().zzLB());
        }
        if (!zzPV.zzZ(zzzu.zzZq(), zzPV.zzHZ)) {
            this.zzEI.zz2("Rendering of Outlined and Embossed text is not supported upon exporting to EMF.");
        }
        zzKv();
    }

    public final void zzR(float f) throws Exception {
        this.zzEI.zzKs().zzT(f, f);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        zzZP zzzp2 = (zzZP) zzzp.zz1();
        zz3.zzZ(zzzp2, zzzp2.zzZb());
        zzEL zzelZzh = this.zzEI.zzKr().zzh(zzzp2.getImageBytes());
        zzEP zzepZzZd = zzzp2.zzZd();
        zzZQ4 zzzq4 = new zzZQ4(zzelZzh.zzWG().getLeft(), zzelZzh.zzWG().getTop(), zzelZzh.zzWG().getWidth(), zzelZzh.zzWG().getHeight());
        if (!zzEP.zzZ(zzepZzZd)) {
            zzzq4 = zzepZzZd.zzx(zzzq4);
        }
        this.zzEI.zzKs().zzY(zzelZzh.zzM4(), zzzq4, zzzp2.zzZj());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        zzT(zzzg);
        zzZQ4 zzzq4ZzS = zz6E.zzK(zzzg) ? zzP6.zzS(zzzg.zzZ0()) : zzZQ4.zz2T;
        int iZzN = this.zzEI.zzKr().zzN(zzzg.zzZ0());
        if (zzzg.zzZ1() != null) {
            if (zzzg.zzZ1().zzPH() == 0) {
                this.zzEI.zzKs().zzZ(iZzN, ((zzOI) zzzg.zzZ1()).zzZy());
            } else {
                this.zzEI.zzKs().zzk(iZzN, this.zzEI.zzKr().zzX(zzzg.zzZ1(), zzzq4ZzS));
            }
        }
        if (zzzg.zzZ2() != null) {
            this.zzEI.zzKs().zzl(iZzN, this.zzEI.zzKr().zzZ(zzzg.zzZ2(), zzzq4ZzS));
        }
        zzR(zzzg);
    }
}
