package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzN6 {
    private zzND zzEK;
    private zzO2 zzEM;
    private zzN1 zzEd;
    private zzNW zzEe;
    private zzNA zzEf;
    private zzA1 zzEg;
    private zzO3 zzEh;
    private boolean zzFH;
    private zzNB zzFr;
    private zzNI zzFt;

    public zzN6(zzA1 zza1) {
        this.zzEg = zza1;
        zzO2 zzo2 = new zzO2(zza1.zzAg().zzR1());
        this.zzEM = zzo2;
        this.zzFr = new zzNB(zzo2);
        this.zzFt = new zzNI(this);
        this.zzEK = new zzND(this);
        this.zzEe = new zzNW(this);
        this.zzEh = new zzO3(this);
        this.zzEf = new zzNA(this);
        this.zzEd = new zzN1();
    }

    public final void zz1(String str) {
        this.zzEg.zzI().zzZ(2, 3, str);
        this.zzFH = true;
    }

    public final zzN1 zzKi() {
        return this.zzEd;
    }

    public final zzND zzKj() {
        return this.zzEK;
    }

    public final zzNI zzKk() {
        return this.zzFt;
    }

    public final zzO2 zzKl() {
        return this.zzEM;
    }

    public final zzNB zzKm() {
        return this.zzFr;
    }

    public final zzNW zzKn() {
        return this.zzEe;
    }

    public final zzNA zzKo() {
        return this.zzEf;
    }

    public final zzA1 zzKp() {
        return this.zzEg;
    }

    public final zzO3 zzKq() {
        return this.zzEh;
    }

    public final boolean zzML() {
        return this.zzFH;
    }

    public final zzF8 zzMj() {
        return this.zzEg.zzAt().zzFF();
    }

    public final void zzXG(int i) {
        this.zzEg.zzI().zzZ(2, 3, "Record with '{0}' type is not supported.", Integer.valueOf(i));
    }
}
