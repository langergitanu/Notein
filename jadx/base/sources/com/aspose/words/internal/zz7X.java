package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz7X implements zzG1, zzG2, zzGN {
    private boolean zzC5;
    private int zzDt;
    private zzYW zzLS;
    private zzGX zzLT;
    private zzFS zzUa;
    private zzG3 zzoa;
    private zzQY zzob;
    private zzZZ9 zzoc;
    private ArrayList<zz6R> zzod = new ArrayList<>();
    private zzFH zzoe;

    public static class zzX implements zzFJ {
        private zz7X zzo8;

        public zzX(zz7X zz7x) {
            this.zzo8 = zz7x;
        }

        @Override // com.aspose.words.internal.zzFJ
        public final void zzEH() {
            this.zzo8.zzxU();
        }
    }

    public static class zzY implements zzFK {
        private zz7X zzo8;

        public zzY(zz7X zz7x) {
            this.zzo8 = zz7x;
        }

        @Override // com.aspose.words.internal.zzFK
        public final void zzZ(zzZWX zzzwx, Object obj) {
            this.zzo8.zzY(zzzwx, obj);
        }
    }

    public static class zzZ {
        private boolean zzC5;
        private zzYW zzLS;
        private Object zzo9;
        private zzZZ9 zzoc;

        public zzZ(zzYW zzyw, Object obj, boolean z, zzZZ9 zzzz9) {
            this.zzLS = zzyw;
            this.zzo9 = obj;
            this.zzC5 = z;
            this.zzoc = zzzz9;
        }

        public final boolean zzIo() {
            return this.zzC5;
        }

        public final zzZZ9 zzxP() {
            return this.zzoc;
        }

        public final zzYW zzxR() {
            return this.zzLS;
        }

        public final Object zzxX() {
            return this.zzo9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzY(zzZWX zzzwx, Object obj) {
        this.zzDt = 2;
        this.zzob.zzZ(zzzwx);
        this.zzoa = this.zzob;
        this.zzLT.zz8(false);
        this.zzoe.zzZ(zzzwx, obj, new zzX(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zzxU() {
        this.zzob.zzQN();
        this.zzDt = 0;
    }

    private void zzxW() throws Exception {
        for (zz6R zz6r : this.zzod) {
            this.zzUa.zzK(zz6r.getFirst(), zz6r.zzwW());
        }
        this.zzod.clear();
    }

    public final int getMode() {
        return this.zzDt;
    }

    public final void zzF(Object obj, Object obj2) {
        zzZQG.zzZ(this.zzod, new zz6R(obj, obj2));
    }

    @Override // com.aspose.words.internal.zzGN
    public final String zzI(String str, String str2) {
        return zzQ(str, str2);
    }

    public final void zzIC() {
        this.zzLT.zzIC();
    }

    @Override // com.aspose.words.internal.zzG1
    public final Object zzIK() {
        return new zzZ(this.zzLS, this.zzLT.zzIK(), this.zzC5, this.zzoc);
    }

    public abstract String zzQ(String str, String str2);

    public final boolean zzQL() {
        return this.zzoa.zzQL();
    }

    public abstract void zzTj() throws Exception;

    public abstract String zzZ(String str, Class cls);

    public final void zzq(Object obj) {
        this.zzLT.zzH(obj);
    }

    public final zzG3 zzxQ() {
        return this.zzoa;
    }

    public final zzYW zzxR() {
        return this.zzLS;
    }

    public final zzFS zzxS() {
        return this.zzUa;
    }

    public final zzFH zzxT() {
        return this.zzoe;
    }

    public final void zzxV() {
        this.zzDt = 1;
        this.zzoa = new zzZWW(this.zzUa, new zzY(this));
        this.zzLT.zz8(true);
    }

    public final Object zzxX() {
        return this.zzLT.zzIK();
    }

    public final zzZVN zzxY() throws Exception {
        return this.zzLT.zzX(this.zzoe, ']');
    }

    public final zzJC zzxZ() throws Exception {
        return this.zzLT.zzY(this.zzoe, ']');
    }

    public final zzH0 zzy0() throws Exception {
        return this.zzLT.zzZ(this.zzoe, ']');
    }

    @Override // com.aspose.words.internal.zzG2
    public final zzFI zzZ(zzGX zzgx, zzFH zzfh, zzFS zzfs, zzYW zzyw, boolean z) throws Exception {
        return zzZ(zzgx, zzfh, zzfs, zzyw, z, new zzZZ9(), true);
    }

    @Override // com.aspose.words.internal.zzG2
    public final zzFI zzZ(zzGX zzgx, zzFH zzfh, zzFS zzfs, Object obj) throws Exception {
        zzZ zzz = (zzZ) zzZKW.zzZ(obj, zzZ.class);
        zzZZ9 zzzz9ZzxP = zzz.zzxP();
        if (zzzz9ZzxP.zzrm().contains(zzfs.zzEN())) {
            return null;
        }
        zzgx.zzH(zzz.zzxX());
        return zzZ(zzgx, zzfh, zzfs, zzz.zzxR(), zzz.zzIo(), zzzz9ZzxP, false);
    }

    private zzFI zzZ(zzGX zzgx, zzFH zzfh, zzFS zzfs, zzYW zzyw, boolean z, zzZZ9 zzzz9, boolean z2) throws Exception {
        this.zzLT = zzgx;
        this.zzoe = zzfh;
        this.zzUa = zzfs;
        this.zzLS = zzyw;
        this.zzC5 = z;
        this.zzoc = zzzz9;
        zzZWS zzzws = new zzZWS(zzzz9, z2);
        zzQY zzqy = new zzQY(zzzws, zzgx, zzfs, zzyw, this, this);
        this.zzob = zzqy;
        this.zzoa = zzqy;
        this.zzod.clear();
        try {
            zzTj();
            zzxW();
            if (this.zzDt == 0 && this.zzob.zzQK()) {
                return zzzws;
            }
            throw new IllegalStateException("Unexpected end of template.");
        } catch (zzCW e) {
            if (this.zzC5) {
                this.zzUa.zzT(this.zzoe.zzt(e.zzCA()).zzEX(), zzZKN.format(" Error! {0} ", e.getMessage()));
                this.zzoc.zzrm().add(this.zzUa.zzEN());
                return null;
            }
            throw new IllegalStateException(zzZ(e.getMessage(), e.zzCz()));
        }
    }
}
