package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2C extends zz2F {
    private zzPL zzgf;
    private zz1J zzgg;

    public zz2C(zz4W zz4w, String str, zzOH zzoh, zzZQ4 zzzq4, zzPL zzpl, zz3A zz3a) throws Exception {
        this(zz4w, str, zzoh, zzzq4, zz3a);
        this.zzgf = zzpl;
    }

    private static zzP9 zzU(zzEG zzeg) {
        return new zzP9(-zzeg.getWidth(), 0.0f, 0.0f, zzeg.getHeight(), zzeg.getWidth() * 2, zzeg.getHeight());
    }

    private static zzP9 zzV(zzEG zzeg) {
        return new zzP9(zzeg.getWidth(), 0.0f, 0.0f, zzeg.getHeight(), 0.0f, zzeg.getHeight());
    }

    private static zzP9 zzW(zzEG zzeg) {
        return new zzP9(-zzeg.getWidth(), 0.0f, 0.0f, -zzeg.getHeight(), zzeg.getWidth() * 2, zzeg.getHeight());
    }

    private static zzP9 zzX(zzEG zzeg) {
        return new zzP9(zzeg.getWidth(), 0.0f, 0.0f, -zzeg.getHeight(), 0.0f, zzeg.getHeight());
    }

    private void zzY(zzOH zzoh, zzP9 zzp9) throws Exception {
        this.zzgg.zzvj().zzZ(zzoh.getImageBytes(), zzp9, null, this.zzgg.zzNb());
    }

    private static long zzZ(zzOH zzoh, zzEG zzeg, zzZQ4 zzzq4) {
        int iZzNa = zzoh.zzNa();
        if (iZzNa == 0) {
            return zzeg.getSize();
        }
        if (iZzNa == 1) {
            return zzZPX.zzZm(zzeg.getWidth() * 2, zzeg.getHeight());
        }
        if (iZzNa == 2) {
            return zzZPX.zzZm(zzeg.getWidth(), zzeg.getHeight() * 2);
        }
        if (iZzNa == 3) {
            return zzZPX.zzZm(zzeg.getWidth() * 2, zzeg.getHeight() * 2);
        }
        if (iZzNa == 4) {
            return zzZ(zzoh, zzzq4, zzeg);
        }
        throw new IllegalStateException("Not supported brush wrap mode.");
    }

    @Override // com.aspose.words.internal.zzFW
    public final String zzF0() {
        return this.zzgg.zzF0();
    }

    @Override // com.aspose.words.internal.zz2F
    public final zz3D zzu1() {
        return null;
    }

    @Override // com.aspose.words.internal.zz2F
    public final void zzY(zzFX zzfx) throws Exception {
        this.zzgg.zzY(zzfx);
    }

    public zz2C(zz4W zz4w, String str, zzOH zzoh, zzZQ4 zzzq4, zz3A zz3a) throws Exception {
        super(zz4w, str);
        zzEG zzegZzZT = zzEF.zzZT(zzoh.getImageBytes());
        this.zzgg = new zz1J(zz4w, zz2F.zzZ((zzOG) zzoh, zz3a), zzZ(zzoh, zzegZzZT, zzzq4));
        zzZ(zzoh, zzegZzZT);
    }

    private static long zzZ(zzOH zzoh, zzZQ4 zzzq4, zzEG zzeg) {
        zzZQ4 zzzq4ZzU = zzJ6.zzU(zzoh.zzNb().zzOo().zzN(zzzq4));
        return zzZPX.zzZm((int) (Math.max(zzzq4ZzU.zzZm() < 0.0f ? (-zzzq4ZzU.zzZm()) + zzeg.getWidth() : zzzq4ZzU.zzZm(), zzzq4ZzU.zzkw()) + 5.0f), (int) (Math.max(zzzq4ZzU.zzZo() < 0.0f ? (-zzzq4ZzU.zzZo()) + zzeg.getHeight() : zzzq4ZzU.zzZo(), zzzq4ZzU.zzZn()) + 5.0f));
    }

    private void zzZ(zzOH zzoh, zzEG zzeg) throws Exception {
        int iZzNa = zzoh.zzNa();
        if (iZzNa != 0) {
            if (iZzNa == 1) {
                zzY(zzoh, zzX(zzeg));
                zzY(zzoh, zzW(zzeg));
                return;
            }
            if (iZzNa == 2) {
                zzY(zzoh, zzX(zzeg));
                zzY(zzoh, zzV(zzeg));
                return;
            } else {
                if (iZzNa == 3) {
                    zzY(zzoh, zzX(zzeg));
                    zzY(zzoh, zzW(zzeg));
                    zzY(zzoh, zzV(zzeg));
                    zzY(zzoh, zzU(zzeg));
                    return;
                }
                if (iZzNa != 4) {
                    throw new IllegalStateException("Not supported brush wrap mode.");
                }
            }
        }
        zzY(zzoh, zzX(zzeg));
    }

    @Override // com.aspose.words.internal.zz2F
    public final boolean zzZ(zzPY zzpy, zz3A zz3a) {
        if (this.zzgf == null || zzpy.zzPH() != this.zzgf.zzPH()) {
            return false;
        }
        zzPL zzpl = (zzPL) zzpy;
        if (zzP9.zzY(zz2F.zzZ((zzOG) zzpl, zz3a), this.zzgg.zzNb())) {
            return zzPX.zzZ(this.zzgf, zzpl);
        }
        return false;
    }
}
