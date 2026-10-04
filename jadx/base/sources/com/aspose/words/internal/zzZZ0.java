package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZ0 {
    private zzY0 zzTA;
    private zzZYT<zzZYZ> zzcl;
    private zzZZ1 zzcm;

    public zzZZ0(zzZOP zzzop) {
        this.zzTA = new zzY0(zzzop);
    }

    public final void zzLh() throws Exception {
        if (!zzri()) {
            throw new IllegalStateException("The sfnt file is not valid.");
        }
    }

    public final byte[] zzXw(String str) throws Exception {
        zzXx(str);
        return this.zzTA.zzn((int) (((long) ((zzZYZ) zzQW.zzZ((zzZYT) this.zzcl, str)).zzci) & 4294967295L));
    }

    public final void zzXx(String str) throws Exception {
        zzZYZ zzzyz = (zzZYZ) zzQW.zzZ((zzZYT) this.zzcl, str);
        if (zzzyz == null) {
            throw new IllegalStateException(zzZKN.format("Cannot find table '{0}' in the font file.", str));
        }
        this.zzTA.zzq().zzH(((long) zzzyz.zzdZ) & 4294967295L);
    }

    public final zzZOP zzq() {
        return this.zzTA.zzq();
    }

    public final zzZYT<zzZYZ> zzrf() {
        return this.zzcl;
    }

    public final zzZZ1 zzrg() {
        return this.zzcm;
    }

    public final zzY0 zzrh() {
        return this.zzTA;
    }

    public final boolean zzri() throws Exception {
        zzZZ1 zzzz1Zzv = zzZZ1.zzv(this.zzTA);
        this.zzcm = zzzz1Zzv;
        if (!zzzz1Zzv.isValid()) {
            return false;
        }
        this.zzcl = new zzZYT<>();
        for (int i = 0; i < (this.zzcm.zzrj() & 65535); i++) {
            zzZYZ zzzyzZzu = zzZYZ.zzu(this.zzTA);
            this.zzcl.zzB(zzzyzZzu.zzck, zzzyzZzu);
        }
        return true;
    }
}
