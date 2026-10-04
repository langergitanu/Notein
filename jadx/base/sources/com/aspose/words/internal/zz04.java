package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz04 {
    private zz09 zzdB;
    private zz06 zzdK;

    public zz04(zz06 zz06Var) {
        this.zzdK = zz06Var;
    }

    private zz09 zzs0() {
        if (this.zzdB == null) {
            this.zzdB = new zz09(this.zzdK);
        }
        return this.zzdB;
    }

    public final void zzI(zzZU zzzu) throws Exception {
        zzP9 zzp9ZzOh = zzzu.zzZO() != null ? zzzu.zzZO().zzOh() : new zzP9();
        if (zzzu.zzZr().zzPi()) {
            zzp9ZzOh.zzZ(zzzu.zzZs(), 0);
        }
        if (!zzp9ZzOh.isIdentity()) {
            this.zzdK.zzs2().zzw(zzp9ZzOh);
        }
        if (zzZT.zzU(zzzu)) {
            this.zzdK.zzs2().zzC(zzzu.zzZN());
        }
        this.zzdK.zzs2().zzXH(zzZKN.format("/AW{0}", this.zzdK.zzQ(zzzu.zzZr().zzPl()).getName()));
        this.zzdK.zzs2().zzZU(zzzu.zzZr().zzPg());
        this.zzdK.zzs2().zzFh();
        this.zzdK.zzs2().zzXB("selectfont");
        this.zzdK.zzs2().zzQ("{0} {1} moveto", zzJB.zzr(Float.intBitsToFloat((int) zzzu.zzZT())), zzJB.zzr(zzZPY.zzYC(zzzu.zzZT())));
        zzP9 zzp9 = new zzP9();
        zzp9.zzZ(1.0f, -1.0f, 0);
        this.zzdK.zzs2().zzw(zzp9);
        this.zzdK.zzs2().zzm("{0} setrgbcolor", zzZZX.zzt(zzzu.zzZy()));
    }

    public final void zzS(zzPY zzpy, zzZQ4 zzzq4) throws Exception {
        if (zzpy == null || zzpy.isEmpty()) {
            return;
        }
        this.zzdK.zzs2().zzXB("gsave");
        zzs0().zzT(zzpy, zzzq4);
        this.zzdK.zzs2().zzXB("fill");
        this.zzdK.zzs2().zzXB("grestore");
    }

    public final void zzX(zzOU zzou, zzZQ4 zzzq4) throws Exception {
        if (zzou == null || zzou.zzZ1() == null || zzou.zzZ1().isEmpty()) {
            return;
        }
        this.zzdK.zzs2().zzXB("gsave");
        zzs0().zzT(zzou.zzZ1(), zzzq4);
        this.zzdK.zzs2().zzm("{0} setlinewidth", zzJB.zzt(zzou.getWidth()));
        int iZzZ = zzX.zzZ(zzou);
        this.zzdK.zzs2().zzm("{0} setlinecap", Integer.toString(iZzZ));
        this.zzdK.zzs2().zzm("{0} setlinejoin", Integer.toString(zzX.zzY(zzou)));
        if (zzou.zzNM() == 3) {
            this.zzdK.zzs2().zzm("{0} setmiterlimit", zzJB.zzt(zzou.zzNL()));
        }
        if (zzou.getDashStyle() != 0) {
            this.zzdK.zzs2().zzS(zzX.zzZ(zzou, iZzZ != 0));
            this.zzdK.zzs2().zzFh();
            this.zzdK.zzs2().zzZU(zzou.zzNK());
            this.zzdK.zzs2().zzFh();
            this.zzdK.zzs2().zzXB("setdash");
        }
        this.zzdK.zzs2().zzXB("stroke");
        this.zzdK.zzs2().zzXB("grestore");
    }
}
