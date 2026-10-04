package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzJZ extends zzZWZ {
    short zzAE;
    short zzAF;
    short zzAG;
    short zzAH;
    short zzAI;
    zzK7 zzAJ;
    short zzAK;
    short zzAL;
    short zzAM;
    short zzAN;
    short zzAO;
    short zzAP;
    short zzAQ;
    short zzAR;
    byte[] zzAS;
    zzJG zzAT;
    zzJW zzAU;
    short zzAV;
    short zzAW;
    short zzAX;
    short zzAY;
    short zzAZ;
    short zzB0;
    short zzB1;
    short zzB2;
    short zzB3;
    short zzB4;
    short zzB5;
    short zzB6;
    short zzB7;
    short zzB8;
    short zzB9;
    short zzBa;

    public zzJZ(zzY0 zzy0) throws Exception {
        this.zzAJ = zzK7.zzBC;
        this.zzBa = zzy0.zzX9();
        this.zzB9 = zzy0.zzXa();
        this.zzB8 = zzy0.zzX9();
        this.zzB7 = zzy0.zzX9();
        this.zzB6 = zzy0.zzX9();
        this.zzB5 = zzy0.zzXa();
        this.zzB4 = zzy0.zzXa();
        this.zzB3 = zzy0.zzXa();
        this.zzB2 = zzy0.zzXa();
        this.zzB1 = zzy0.zzXa();
        this.zzB0 = zzy0.zzXa();
        this.zzAZ = zzy0.zzXa();
        this.zzAY = zzy0.zzXa();
        this.zzAX = zzy0.zzXa();
        this.zzAW = zzy0.zzXa();
        this.zzAV = zzy0.zzXa();
        this.zzAU = new zzJW(zzy0.zzn(10));
        this.zzAT = new zzJG(zzy0.zzXb(), zzy0.zzXb(), zzy0.zzXb(), zzy0.zzXb());
        this.zzAS = zzy0.zzn(4);
        this.zzAR = zzy0.zzX9();
        this.zzAQ = zzy0.zzX9();
        this.zzAP = zzy0.zzX9();
        this.zzAO = zzy0.zzXa();
        this.zzAN = zzy0.zzXa();
        this.zzAM = zzy0.zzXa();
        this.zzAL = zzy0.zzXa();
        short sZzXa = zzy0.zzXa();
        this.zzAK = sZzXa;
        if (this.zzAL + sZzXa == 0) {
            throw new IllegalStateException("Invalid font metrics.");
        }
        if ((this.zzBa & 65535) <= 0) {
            return;
        }
        this.zzAJ = new zzK7(zzy0.zzXb(), zzy0.zzXb());
        if ((this.zzBa & 65535) <= 1) {
            return;
        }
        this.zzAI = zzy0.zzXa();
        this.zzAH = zzy0.zzXa();
        this.zzAG = zzy0.zzX9();
        this.zzAF = zzy0.zzX9();
        this.zzAE = zzy0.zzX9();
    }

    public final int getStyle() {
        short s = this.zzAR;
        return ((s & 1) != 0 ? 2 : 0) | ((s & 2) != 0 ? 4 : 0) | ((s & 16) != 0 ? 8 : 0) | ((s & 32) != 0 ? 1 : 0);
    }

    public final void zzHN() {
        short s = this.zzAR;
        if ((65472 & s) != 0) {
            if ((this.zzBa & 65535) <= 1) {
                this.zzAR = (short) (s & 63);
            } else {
                this.zzBa = (short) 4;
            }
        }
    }

    public final boolean zzHO() {
        return this.zzBa == 0 && ((this.zzAR & 65535) >>> 8) == 177;
    }

    public final boolean zzHP() {
        return this.zzBa == 0 && ((this.zzAR & 65535) >>> 8) == 179;
    }

    public final boolean zzHQ() {
        return this.zzBa == 0 && ((this.zzAR & 65535) >>> 8) == 178;
    }

    public final boolean zzHR() {
        return zzXU.zzZ(this.zzAR, (short) 128);
    }

    @Override // com.aspose.words.internal.zzZWZ
    public final void zzX(zzXZ zzxz) throws Exception {
        zzxz.zzi(this.zzBa & 65535);
        zzxz.zzj(this.zzB9);
        zzxz.zzi(this.zzB8 & 65535);
        zzxz.zzi(this.zzB7 & 65535);
        zzxz.zzi(this.zzB6 & 65535);
        zzxz.zzj(this.zzB5);
        zzxz.zzj(this.zzB4);
        zzxz.zzj(this.zzB3);
        zzxz.zzj(this.zzB2);
        zzxz.zzj(this.zzB1);
        zzxz.zzj(this.zzB0);
        zzxz.zzj(this.zzAZ);
        zzxz.zzj(this.zzAY);
        zzxz.zzj(this.zzAX);
        zzxz.zzj(this.zzAW);
        zzxz.zzj(this.zzAV);
        zzxz.writeBytes(this.zzAU.getValues());
        zzxz.zzk(this.zzAT.zzIa());
        zzxz.zzk(this.zzAT.zzI9());
        zzxz.zzk(this.zzAT.zzHl());
        zzxz.zzk(this.zzAT.zzHk());
        zzxz.writeBytes(this.zzAS);
        zzxz.zzi(this.zzAR & 65535);
        zzxz.zzi(this.zzAQ & 65535);
        zzxz.zzi(this.zzAP & 65535);
        zzxz.zzj(this.zzAO);
        zzxz.zzj(this.zzAN);
        zzxz.zzj(this.zzAM);
        zzxz.zzj(this.zzAL);
        zzxz.zzj(this.zzAK);
        if ((this.zzBa & 65535) <= 0) {
            return;
        }
        zzxz.zzk(this.zzAJ.zzIa());
        zzxz.zzk(this.zzAJ.zzI9());
        if ((this.zzBa & 65535) <= 1) {
            return;
        }
        zzxz.zzj(this.zzAI);
        zzxz.zzj(this.zzAH);
        zzxz.zzi(this.zzAG & 65535);
        zzxz.zzi(this.zzAF & 65535);
        zzxz.zzi(this.zzAE & 65535);
    }
}
