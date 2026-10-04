package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzI4 extends zzZV6 {
    private zzB5 zzxf;
    private zzIA zzxg;
    private zzIC zzxx;

    public zzI4(zzZOP zzzop, zzI6 zzi6) throws Exception {
        this(new zzP(zzzop, zzHZ.zzY(zzi6.zzQZ()), zzi6.getPrettyFormat()), zzi6);
    }

    private zzZP zzW(zzZP zzzp) throws Exception {
        zzG zzg = (zzG) zzZKW.zzZ(zzzp.zzZ5(), zzG.class);
        if (zzg != null && zzg.zzZO() != null) {
            zzg = (zzG) zzg.zz1();
            zzg.zzW((zzP9) null);
        }
        if (zzzp.zzZa() || zzzp.getImageType() != 6 || zzg == null || !zzZT.zzU(zzg)) {
            return zzzp;
        }
        zzZQ4 zzzq4ZzS = zzP6.zzS(zzg.zzZN());
        return new zzZP(zzzq4ZzS.zzZE(), zzzq4ZzS.getSize(), zzE.zzZ(zzg, zzzq4ZzS, 512.0f, this.zzxx.zzGh().zzwx().zzFE()));
    }

    @Override // com.aspose.words.internal.zzZV6
    public final void zzFY() {
        if (this.zzxf != null) {
            zzIA zzia = new zzIA();
            this.zzxg = zzia;
            this.zzxf.zzZ(zzia);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZN zzzn) {
        zzIA zzia = this.zzxg;
        if (zzia != null) {
            this.zzxx.zzZ3(zzia.zzWk(zzzn.getId()));
        }
    }

    private zzI4(zzP zzp, zzI6 zzi6) {
        this(new zzIC(zzp, zzi6));
    }

    private zzI4(zzIC zzic) {
        super(zzic, new zzIB(zzic));
        this.zzxx = zzic;
    }

    @Override // com.aspose.words.internal.zzZV6, com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        zzZP zzzpZzW = zzW(zzzp);
        if (zzn4().zznh().zzwy().zzAs()) {
            long jZzZT = zzzpZzW.zzZT();
            long size = zzzpZzW.getSize();
            zzZOR zzzor = new zzZOR();
            zzZY3 zzzy3ZzE = this.zzxx.zzE(zzzor);
            zzZH zzzh = new zzZH(Float.intBitsToFloat((int) zzzpZzW.getSize()), zzZPW.zzYz(zzzpZzW.getSize()));
            zzG zzg = new zzG();
            zzzy3ZzE.startDocument();
            zzzy3ZzE.zzZ(zzzh);
            zzzy3ZzE.zzZ(zzg);
            zzZP zzzpZzZ = zzZO.zzZ(zzzpZzW, zzzy3ZzE, zzv2(), zzn2().zzYP());
            zzzy3ZzE.zzY(zzg);
            zzzy3ZzE.zzY(zzzh);
            zzzy3ZzE.endDocument();
            zzI5 zzi5 = (zzI5) zzn3().zznc();
            if (zzzpZzZ != null) {
                zzi5.zzX(zzzpZzZ);
                return;
            } else {
                zzzor.zzH(0L);
                zzi5.zzZ((zzZOP) zzzor, jZzZT, size, true);
                return;
            }
        }
        super.zzZ(zzzpZzW);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zz9 zz9Var) throws Exception {
        zzn3().zznc().zzY(zz9Var);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzC zzc) throws Exception {
        zzn3().zznc().zzY(zzc);
    }

    public final void zzZ(zzB5 zzb5) {
        this.zzxf = zzb5;
    }
}
