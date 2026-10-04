package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNH {
    private long zzEJ;
    private zzND zzEK;
    private zzNL zzEL;
    private zzO2 zzEM;
    private zzN6 zzFz;

    public zzNH(zzZOP zzzop, zzN6 zzn6) throws Exception {
        this.zzFz = zzn6;
        zzO2 zzo2 = new zzO2(zzzop);
        this.zzEM = zzo2;
        this.zzEL = new zzNL(zzo2, this.zzFz);
        this.zzEK = new zzND(this.zzEM, this.zzFz);
        this.zzEJ = zzzop.getLength();
    }

    private zzOI zzLE() throws Exception {
        return new zzOI(this.zzEM.zzMV());
    }

    private zzPK zzLF() throws Exception {
        return new zzPK(this.zzEM.zzXc(), this.zzEM.zzMV(), this.zzEM.zzMV());
    }

    private zzPI[] zzLG() throws Exception {
        int iZzXc = this.zzEM.zzXc();
        zzPI[] zzpiArr = new zzPI[iZzXc];
        for (int i = 0; i < iZzXc; i++) {
            zzpiArr[i] = new zzPI();
        }
        for (int i2 = 0; i2 < iZzXc; i2++) {
            zzpiArr[i2].zzO(Float.intBitsToFloat(this.zzEM.zzXc()));
        }
        for (int i3 = 0; i3 < iZzXc; i3++) {
            zzpiArr[i3].zzY(this.zzEM.zzMV());
        }
        return zzpiArr;
    }

    private void zzLH() throws Exception {
        this.zzEM.zzXc();
        this.zzEM.zzXc();
        this.zzEM.zzXc();
    }

    private zzPY zzLI() throws Exception {
        int iZzXc = this.zzEM.zzXc();
        int iZzXc2 = this.zzEM.zzXc();
        zzPV zzpvZzMV = this.zzEM.zzMV();
        long jZzN0 = this.zzEM.zzN0();
        int iZzXc3 = this.zzEM.zzXc();
        zzPV[] zzpvArr = new zzPV[iZzXc3];
        for (int i = 0; i < iZzXc3; i++) {
            zzpvArr[i] = this.zzEM.zzMV();
        }
        zzP0 zzp0 = new zzP0(zzXl(iZzXc), jZzN0);
        zzp0.zzY(zzpvArr);
        zzp0.zzJ(zzpvZzMV);
        zzZ(iZzXc, zzp0);
        if ((iZzXc & 64) != 0) {
            zzLH();
        }
        zzp0.zzXR(iZzXc2);
        if (zzp0.zzNS()) {
            return zzp0;
        }
        return null;
    }

    private zzPY zzLJ() throws Exception {
        int iZzXc = this.zzEM.zzXc();
        int iZzXc2 = this.zzEM.zzXc();
        zzZQ4 zzzq4ZzMX = this.zzEM.zzMX();
        zzPV zzpvZzMV = this.zzEM.zzMV();
        zzPV zzpvZzMV2 = this.zzEM.zzMV();
        this.zzEM.zzXc();
        this.zzEM.zzXc();
        zzPA zzpa = new zzPA(zzzq4ZzMX, zzpvZzMV, zzpvZzMV2);
        zzZ(iZzXc, zzpa);
        zzpa.zzXR(iZzXc2);
        return (iZzXc & 128) != 0 ? zzXH.zzW(zzpa) : zzpa;
    }

    private float[] zzLK() throws Exception {
        return this.zzEM.zzXO(this.zzEM.zzXc());
    }

    private float[] zzLL() throws Exception {
        return this.zzEM.zzXO(this.zzEM.zzXc());
    }

    private zzNC zzLM() throws Exception {
        int iZzXc = this.zzEM.zzXc();
        int iZzMG = this.zzEM.zzMG();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzEM.zzXc());
        zzOU zzou = new zzOU();
        zzou.setWidth((float) this.zzFz.zzKi().zzY(fIntBitsToFloat, iZzMG));
        if ((iZzXc & 1) != 0) {
            this.zzEM.zzMQ();
        }
        if ((iZzXc & 2) != 0) {
            zzou.zzNO().setWidth(fIntBitsToFloat);
            zzO5.zzZ(zzou, this.zzEM.zzXc(), true);
        }
        if ((iZzXc & 4) != 0) {
            zzou.zzNO().setWidth(fIntBitsToFloat);
            zzO5.zzZ(zzou, this.zzEM.zzXc(), false);
        }
        if ((iZzXc & 8) != 0) {
            zzou.zzXW(this.zzEM.zzXc());
        }
        if ((iZzXc & 16) != 0) {
            zzou.zzA(Float.intBitsToFloat(this.zzEM.zzXc()));
        }
        if ((iZzXc & 32) != 0) {
            zzou.setDashStyle(this.zzEM.zzXc());
        }
        if ((iZzXc & 64) != 0) {
            zzou.zzXV(this.zzEM.zzXc());
        }
        if ((iZzXc & 128) != 0) {
            zzou.zzz(Float.intBitsToFloat(this.zzEM.zzXc()));
        }
        if ((iZzXc & 256) != 0) {
            zzou.zzW(zzLK());
            if (!zzOU.zzU(zzou.zzNH())) {
                zzou.setDashStyle(0);
            }
        }
        if ((iZzXc & 512) != 0) {
            zzou.setAlignment(this.zzEM.zzXc());
        }
        if ((iZzXc & 1024) != 0) {
            zzou.zzV(zzLL());
        }
        boolean z = (iZzXc & 2048) != 0 ? !zzX(zzou.zzNO().zzOB()) : false;
        if ((iZzXc & 4096) != 0) {
            z = !zzX(zzou.zzNO().zzOA());
        }
        return new zzNC(zzou, z);
    }

    private zzON zzLN() throws Exception {
        int iZzXc = this.zzEM.zzXc();
        if (iZzXc == 1) {
            return zzLN().zzZ(zzLN());
        }
        if (iZzXc == 2) {
            return zzLN().zzY(zzLN());
        }
        if (iZzXc == 3) {
            return zzLN().zzX(zzLN());
        }
        if (iZzXc == 4) {
            return zzLN().zzW(zzLN());
        }
        if (iZzXc == 5) {
            return zzLN().zzV(zzLN());
        }
        switch (iZzXc) {
            case 268435457:
                this.zzEM.zzXc();
                break;
        }
        return zzOK.zzNg();
    }

    private void zzW(zzPD zzpd) throws Exception {
        zzP8 zzp8ZzLS;
        zzP8 zzp8ZzLS2;
        int iZzXc = this.zzEM.zzXc();
        this.zzEM.zzXc();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzEM.zzXc());
        int iZzXc2 = this.zzEM.zzXc();
        int iZzXc3 = this.zzEM.zzXc();
        int iZzXc4 = this.zzEM.zzXc();
        float fIntBitsToFloat2 = Float.intBitsToFloat(this.zzEM.zzXc());
        float fIntBitsToFloat3 = Float.intBitsToFloat(this.zzEM.zzXc());
        this.zzEM.zzN0();
        this.zzEM.zzN0();
        if ((iZzXc & 1) != 0) {
            this.zzEM.zzXc();
            zzp8ZzLS = this.zzEK.zzLS();
        } else {
            zzp8ZzLS = null;
        }
        if ((iZzXc & 2) != 0) {
            this.zzEM.zzXc();
            zzp8ZzLS2 = this.zzEK.zzLS();
        } else {
            zzp8ZzLS2 = null;
        }
        zzP8 zzp8 = (zzp8ZzLS2 == null || zzp8ZzLS == null) ? zzp8ZzLS : null;
        boolean z = zzp8 != null;
        if (z) {
            zzp8ZzLS2 = zzp8;
        }
        zzP7 zzp7 = new zzP7(zzp8ZzLS2, z);
        zzp7.zzD(fIntBitsToFloat);
        zzp7.zzS(fIntBitsToFloat3);
        zzp7.zzY0(iZzXc2);
        zzp7.zzXZ(iZzXc3);
        zzp7.zzXY(iZzXc4);
        zzp7.zzC(fIntBitsToFloat2);
        zzpd.zzZ(zzp7);
    }

    private boolean zzX(zzPD zzpd) throws Exception {
        int iZzXc = this.zzEM.zzXc();
        long position = this.zzEM.zzq().getPosition();
        this.zzEM.zzXc();
        int iZzXc2 = this.zzEM.zzXc();
        boolean z = true;
        if (iZzXc2 == 0) {
            zzW(zzpd);
        } else {
            if (iZzXc2 != 1) {
                throw new IllegalStateException("Unexpected line cap type.");
            }
            z = false;
        }
        this.zzEM.zzq().zzH(position + ((long) iZzXc));
        return z;
    }

    private zzP8 zzXl(int i) throws Exception {
        if ((i & 1) == 0) {
            return this.zzEK.zzLv();
        }
        int iZzXc = this.zzEM.zzXc();
        long position = this.zzEM.zzq().getPosition();
        zzP8 zzp8ZzLS = this.zzEK.zzLS();
        this.zzEM.zzq().zzH(position + ((long) iZzXc));
        return zzp8ZzLS;
    }

    private void zzZ(int i, zzPL zzpl) throws Exception {
        if ((i & 2) != 0) {
            zzpl.zzL(this.zzEM.zzMQ());
        }
        if ((i & 4) != 0) {
            zzpl.zzY(zzLG());
            return;
        }
        if ((i & 8) == 0 && (i & 16) == 0) {
            return;
        }
        int iZzXc = this.zzEM.zzXc();
        zzpl.zzY(new float[iZzXc]);
        zzpl.zzZ(new float[iZzXc]);
        for (int i2 = 0; i2 < iZzXc; i2++) {
            zzpl.zzOO()[i2] = Float.intBitsToFloat(this.zzEM.zzXc());
        }
        for (int i3 = 0; i3 < iZzXc; i3++) {
            zzpl.zzON()[i3] = Float.intBitsToFloat(this.zzEM.zzXc());
        }
    }

    private zzOH zzd(long j) throws Exception {
        boolean z = (this.zzEM.zzXc() & 2) != 0;
        int iZzXc = this.zzEM.zzXc();
        zzP9 zzp9ZzMQ = z ? this.zzEM.zzMQ() : null;
        zzOH zzoh = new zzOH(this.zzEL.zzg(j).getBytes(), iZzXc);
        zzoh.zzL(zzp9ZzMQ);
        return zzoh;
    }

    public final zzON zzLO() throws Exception {
        this.zzEM.zzXc();
        this.zzEM.zzXc();
        return zzLN();
    }

    public final zzNN zzLP() throws Exception {
        this.zzEM.zzXc();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzEM.zzXc());
        int iZzMG = this.zzEM.zzMG();
        int iZzXc = this.zzEM.zzXc();
        this.zzEM.zzXc();
        return new zzNN(fIntBitsToFloat, iZzMG, iZzXc, zzZVS.zzWI(this.zzEM.zzXN(this.zzEM.zzXc())), this.zzFz);
    }

    public final zzN3 zzLQ() throws Exception {
        return zzN3.zzX(this.zzEM);
    }

    public final zzNM zzLR() throws Exception {
        return this.zzEL.zzg(this.zzEJ);
    }

    public final zzP8 zzLS() throws Exception {
        return this.zzEK.zzLS();
    }

    public final zzNC zzLT() throws Exception {
        this.zzEM.zzXc();
        this.zzEM.zzXc();
        zzNC zzncZzLM = zzLM();
        zzncZzLM.zzLs().zzY(zzLU());
        return zzncZzLM;
    }

    public final zzPY zzLU() throws Exception {
        this.zzEM.zzXc();
        int iZzXc = this.zzEM.zzXc();
        if (iZzXc == 0) {
            return zzLE();
        }
        if (iZzXc == 1) {
            return zzLF();
        }
        if (iZzXc == 2) {
            return zzd(this.zzEJ);
        }
        if (iZzXc == 3) {
            return zzLI();
        }
        if (iZzXc == 4) {
            return zzLJ();
        }
        throw new IllegalArgumentException();
    }
}
