package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz5S extends zz33 {
    private String mName;
    private zzPV zzYZ;
    private zzPV zzZ0;
    private boolean zzZ1;
    private zzZQ4 zzZL;
    private long zzZN;
    private int zzkO;
    protected zz2M zzkP;

    public zz5S(zz2M zz2m, zzZV zzzv) {
        super(zz2m.zzuN());
        this.zzZN = 0L;
        this.mName = zz2m.zzuN().zzJ(zzzv.getName(), zztR());
        this.zzZN = zzzv.zzZT();
        this.zzZ1 = zzzv.isEnabled();
        this.zzYZ = zzzv.zzZu();
        this.zzZ0 = zzzv.zzZt();
        this.zzkP = zz2m;
    }

    private static String zzY(zzPV zzpv, boolean z) {
        zz57 zz57VarZzu = zz57.zzu(zzpv);
        return zzZKN.format("{0} {1}", zz57VarZzu.zzw(zzpv), z ? zz57VarZzu.zzvN() : zz57VarZzu.zzvM());
    }

    private boolean zzwj() {
        return this.zzkO != 0;
    }

    public abstract int getFieldType();

    public final String getName() {
        return this.mName;
    }

    public abstract void zzX(zzFY zzfy) throws Exception;

    public final void zzX(zzZQ4 zzzq4) {
        this.zzZL = zzzq4;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Annot");
        zzfy.zzH("/Subtype", "/Widget");
        zzfy.zzZ("/P", this.zzkP);
        zzfy.zzH("/FT", zz4C.zzU3(getFieldType()));
        zzfy.zzM("/F", 4);
        zzfy.zzZ("/Rect", new zzZQ4(this.zzZL.zzZm(), this.zzkP.getHeight() - this.zzZL.zzZn(), this.zzZL.getWidth(), this.zzZL.getHeight()));
        this.zzkO |= zzwk();
        if (zzwj()) {
            zzfy.zzM("/Ff", this.zzkO);
        }
        zzfy.zzC("/T", this.mName);
        zzX(zzfy);
        zzfy.zzFc();
    }

    public final long zzZT() {
        return this.zzZN;
    }

    public final zzPV zzZt() {
        return this.zzZ0;
    }

    public final zzPV zzZu() {
        return this.zzYZ;
    }

    public final zzZQ4 zzZv() {
        return this.zzZL;
    }

    public final zz2M zzwi() {
        return this.zzkP;
    }

    public int zzwk() {
        return this.zzZ1 ? 0 : 1;
    }

    public static void zzY(zz4X zz4x, float f) throws Exception {
        zz4x.zzFh();
        zz4x.zzn(0.0f);
        zz4x.zzFh();
        zz4x.zzn(f);
        zz4x.zzXW(" Td ");
    }

    public final String zzZ(zzPM zzpm, zzPV zzpv) throws Exception {
        return zzZKN.format("{0} {1} {2} Tf ", zzY(zzpv, false), zzuN().zzvU().zzM(zzpm).zzF1(), zz1D.zzT(zzpm.zzPg(), 8));
    }

    public static void zzZ(zz4X zz4x, zzZQ4 zzzq4, zzPV zzpv, zzPV zzpv2) throws Exception {
        zzZ(zz4x, zzpv, false);
        zz4x.zzn(zzzq4.zzZm());
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzZo());
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzkw());
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzZn());
        zz4x.zzXW(" re f ");
        zzZ(zz4x, zzpv2, false);
        zz4x.zzn(zzzq4.zzZm() + 1.0f);
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzZo() + 1.0f);
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzkw() - 2.0f);
        zz4x.zzFh();
        zz4x.zzn(zzzq4.zzZn() - 2.0f);
        zz4x.zzXW(" re f ");
    }

    public static void zzZ(zz4X zz4x, zzPV zzpv, boolean z) throws Exception {
        zz4x.zzXV(zzY(zzpv, z));
    }

    public final zz3Q zzZ(zz4X zz4x, zzPM zzpm) throws Exception {
        zz3Q zz3qZzM = zzuN().zzvU().zzM(zzpm);
        zz4x.zzXW(zz3qZzM.zzF1());
        zz4x.zzFh();
        zz4x.zzn(zzpm.zzPg());
        zz4x.zzXW(" Tf ");
        return zz3qZzM;
    }

    public static void zzZ(zz4X zz4x, float f) throws Exception {
        zz4x.zzXW("1 0 0 1 2 ");
        zz4x.zzn(f);
        zz4x.zzXW(" Tm ");
    }

    public static void zzZ(zz4X zz4x, String str, zz3Q zz3q) throws Exception {
        zz3q.zzZ(str, zz4x);
        zz4x.zzXW(" Tj ");
    }
}
