package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz38 {
    private zz50 zzjH;

    public zz38(zz50 zz50Var) {
        this.zzjH = zz50Var;
    }

    private void zzX(zzOU zzou, int i) {
        boolean z = true;
        boolean z2 = (zzX.zzY(zzou.zzNN(), i) && zzX.zzY(zzou.getEndCap(), i)) ? false : true;
        if (zzou.getDashStyle() != 0) {
            if (!z2 && zzX.zzX(zzou.zzNJ(), i)) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            this.zzjH.zzuN().zz2("Styles of line start, end or dash caps are unsupported and have been changed.");
        }
    }

    private void zzZ(zzPY zzpy, boolean z) throws Exception {
        zzPV zzpvZzZy = zzPV.zzKa;
        if (zzpy.zzPH() == 5) {
            zzP0 zzp0 = (zzP0) zzpy;
            if (zzp0.zzOP() != null && zzp0.zzOP().length > 0) {
                zzpvZzZy = zzp0.zzOP()[0].zzZy();
            }
        }
        zzOI zzoi = new zzOI(zzpvZzZy);
        this.zzjH.zzuN().zz2("Can't use specified brush. Using solid brush instead.");
        zzZ(zzoi, z);
    }

    public final void zzY(zzOU zzou, zzZQ4 zzzq4) throws Exception {
        zzY(zzou.zzZ1(), true, zzzq4);
        this.zzjH.zzvi().zz0(zzou.getWidth());
        int iZzZ = zzX.zzZ(zzou);
        this.zzjH.zzvi().zzTQ(iZzZ);
        zzX(zzou, iZzZ);
        this.zzjH.zzvi().zzTP(zzX.zzY(zzou));
        this.zzjH.zzvi().zzZZ(zzou.zzNM() == 3 ? zzou.zzNL() : 10.0f);
        if (zzou.getDashStyle() == 0) {
            this.zzjH.zzvi().zztW();
        } else {
            this.zzjH.zzvi().zzZ(zzX.zzZ(zzou, iZzZ != 0), zzou.zzNK());
        }
        if (zzJ6.zzT(zzou.zzNG())) {
            this.zzjH.zzuN().zz2("Compound lines are not supported. Using solid line instead.");
        }
    }

    private void zzZ(zzOI zzoi, boolean z) throws Exception {
        zzPV zzpvZzZy = zzoi.zzZy();
        if (!this.zzjH.zzuN().zzv7().zzvH() && zzoi.zzZy().zzPD() < 255) {
            zzpvZzZy = zzPS.zzY(zzpvZzZy, zzPV.zzI5);
            this.zzjH.zzuN().zz2("Transparency does not conforms with PDF/A standard. Transparent brush has been made opaque.");
        }
        this.zzjH.zzvi().zzZ(zzpvZzZy, z);
    }

    public final void zzZ(byte[] bArr, zzZQ4 zzzq4, zzEP zzep) throws Exception {
        zzZ(bArr, new zzP9(zzzq4.getWidth(), 0.0f, 0.0f, -zzzq4.getHeight(), zzzq4.getX(), zzzq4.getHeight() + zzzq4.getY()), zzep, this.zzjH.zzvi().zztV().zzua());
    }

    public final void zzY(zzPY zzpy, boolean z, zzZQ4 zzzq4) throws Exception {
        if (zzpy.zzPH() != 0) {
            zz2F zz2fZzZ = this.zzjH.zzvk().zzZ(zzpy, zzzq4, this.zzjH.zzvi().zztV());
            if (zz2fZzZ != null) {
                this.zzjH.zzvi().zzR(zz2fZzZ.zzF1(), z);
                if (zz2fZzZ.zzu1() != null) {
                    this.zzjH.zzvi().zzY(zz2fZzZ.zzu1());
                    return;
                }
                return;
            }
            zzZ(zzpy, z);
            return;
        }
        zzZ((zzOI) zzpy, z);
    }

    public final void zzZ(byte[] bArr, zzP9 zzp9, zzEP zzep, zzP9 zzp92) throws Exception {
        zzP9 zzp9ZzOh = zzp92.zzOh();
        zzp9ZzOh.zzZ(zzp9, 0);
        this.zzjH.zzvi().zztZ();
        this.zzjH.zzvi().zzz(zzp9);
        this.zzjH.zzvi().zztX();
        zz34 zz34VarZzU = this.zzjH.zzvk().zzU(bArr, zzep);
        zz34VarZzU.zzZ(zzp9ZzOh);
        this.zzjH.zzvl().zzp("{0} Do", zz34VarZzU.zzF1());
        this.zzjH.zzvi().zztY();
    }
}
