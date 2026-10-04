package com.aspose.words.internal;

import androidx.core.view.InputDeviceCompat;
import com.aspose.words.EditingLanguage;

/* JADX INFO: loaded from: classes5.dex */
final class zzNA {
    private boolean zzEs;
    private zzNJ zzEt;
    private int zzEu;
    private zzNX zzEv;
    private zzN6 zzFz;
    private zzZOP zzN5;

    public zzNA(zzN6 zzn6) {
        this.zzFz = zzn6;
        this.zzEv = new zzNX(zzn6);
        this.zzEt = new zzNJ(this.zzFz);
    }

    private void clear() throws Exception {
        this.zzFz.zzKn().zzMt().zzy(this.zzFz.zzKl().zzMV());
    }

    private int zzKG() {
        return !this.zzFz.zzKm().zzLm().zzXu(2) ? 2 : 3;
    }

    private void zzKH() throws Exception {
        this.zzFz.zzKn().zzMu().zzY(this.zzFz.zzKl().zzMQ(), zzKG());
    }

    private void zzKI() throws Exception {
        int iZzKG = zzKG();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        float fIntBitsToFloat2 = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(fIntBitsToFloat, fIntBitsToFloat2, 0);
        this.zzFz.zzKn().zzMu().zzY(zzp9, iZzKG);
    }

    private void zzKJ() throws Exception {
        this.zzFz.zzKn().zzMu().zzY(this.zzFz.zzKl().zzMQ(), 4);
    }

    private void zzKK() throws Exception {
        int iZzKG = zzKG();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        float fIntBitsToFloat2 = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        zzP9 zzp9 = new zzP9();
        zzp9.zzZ(fIntBitsToFloat, fIntBitsToFloat2, 0);
        this.zzFz.zzKn().zzMu().zzY(zzp9, iZzKG);
    }

    private void zzKL() throws Exception {
        int iZzKG = zzKG();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        zzP9 zzp9 = new zzP9();
        zzp9.zzX(fIntBitsToFloat, 0);
        this.zzFz.zzKn().zzMu().zzY(zzp9, iZzKG);
    }

    private void zzKM() throws Exception {
        this.zzFz.zzKn().zzMu().zzZ(zzO2.zzXD(this.zzFz.zzKm().zzLm().getValue()), Float.intBitsToFloat(this.zzFz.zzKl().zzXc()));
    }

    private void zzKN() throws Exception {
        int iZzM4 = this.zzFz.zzKm().zzLm().zzM4();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(zzXf(this.zzFz.zzKl().zzXc()), iZzM4, (zzNX) null));
    }

    private void zzKO() throws Exception {
        this.zzEv.zzMw();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(zzXf(this.zzFz.zzKl().zzXc()), Integer.MAX_VALUE, this.zzEv));
    }

    private void zzKP() throws Exception {
        this.zzEv.zzMw();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(this.zzFz.zzKj().zzV(this.zzFz.zzKl().zzXc(), this.zzFz.zzKm().zzLm().zzM2(), this.zzFz.zzKm().zzLm().zzM1()), true, Integer.MAX_VALUE, this.zzEv));
    }

    private void zzKQ() throws Exception {
        int iZzM4 = this.zzFz.zzKm().zzLm().zzM4();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(this.zzFz.zzKj().zzV(this.zzFz.zzKl().zzXc(), this.zzFz.zzKm().zzLm().zzM2(), this.zzFz.zzKm().zzLm().zzM1()), this.zzFz.zzKm().zzLm().zzXu(2), iZzM4, (zzNX) null));
    }

    private void zzKR() throws Exception {
        this.zzEv.zzMw();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(this.zzFz.zzKm().zzLm().zzM4(), Integer.MAX_VALUE, this.zzEv));
    }

    private void zzKS() throws Exception {
        int iZzXc = this.zzFz.zzKl().zzXc();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(this.zzFz.zzKm().zzLm().zzM4(), iZzXc, (zzNX) null));
    }

    private void zzKT() throws Exception {
        this.zzEv.zzMw();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(zzL0(), Integer.MAX_VALUE, this.zzEv));
    }

    private void zzKU() throws Exception {
        int iZzM4 = this.zzFz.zzKm().zzLm().zzM4();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(zzL0(), iZzM4, (zzNX) null));
    }

    private void zzKV() throws Exception {
        int iZzM4 = this.zzFz.zzKm().zzLm().zzM4();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        float fIntBitsToFloat2 = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(zzL0(), fIntBitsToFloat, fIntBitsToFloat2, iZzM4, (zzNX) null));
    }

    private void zzKW() throws Exception {
        this.zzEv.zzMw();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        float fIntBitsToFloat2 = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(zzL0(), fIntBitsToFloat, fIntBitsToFloat2, Integer.MAX_VALUE, this.zzEv));
    }

    private void zzKX() throws Exception {
        boolean zZzXu = this.zzFz.zzKm().zzLm().zzXu(2);
        this.zzEv.zzMw();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        zzZL zzzlZzZ = this.zzFz.zzKq().zzZ(this.zzFz.zzKj().zzV(this.zzFz.zzKl().zzXc(), this.zzFz.zzKm().zzLm().zzM2(), this.zzFz.zzKm().zzLm().zzM1()), fIntBitsToFloat, Integer.MAX_VALUE, this.zzEv);
        zzZG zzzg = (zzZG) zzZKW.zzZ(zzzlZzZ, zzZG.class);
        if (zzzg != null) {
            zzzg.zzZ0().zzY1(zZzXu ? 1 : 0);
        }
        this.zzFz.zzKn().zzMt().zzN(zzzlZzZ);
    }

    private void zzKY() throws Exception {
        int iZzM4 = this.zzFz.zzKm().zzLm().zzM4();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(this.zzFz.zzKj().zzV(this.zzFz.zzKl().zzXc(), this.zzFz.zzKm().zzLm().zzM2(), this.zzFz.zzKm().zzLm().zzM1()), fIntBitsToFloat, iZzM4, (zzNX) null));
    }

    private void zzKZ() throws Exception {
        int iZzM4 = this.zzFz.zzKm().zzLm().zzM4();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        int iZzXc = this.zzFz.zzKl().zzXc();
        int iZzXc2 = this.zzFz.zzKl().zzXc();
        int iZzXc3 = this.zzFz.zzKl().zzXc();
        if (iZzXc + iZzXc2 + 1 > iZzXc3) {
            return;
        }
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(this.zzFz.zzKj().zzV(iZzXc3, false, this.zzFz.zzKm().zzLm().zzM1()), iZzXc, iZzXc2, fIntBitsToFloat, iZzM4));
    }

    private zzZQ4 zzL0() throws Exception {
        return zzb(this.zzFz.zzKm().zzLm().zzM1());
    }

    private void zzL1() throws Exception {
        int iZzM4 = this.zzFz.zzKm().zzLm().zzM4();
        float fIntBitsToFloat = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        float fIntBitsToFloat2 = Float.intBitsToFloat(this.zzFz.zzKl().zzXc());
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(zzL0(), fIntBitsToFloat, fIntBitsToFloat2, iZzM4));
    }

    private void zzL2() throws Exception {
        int iZzM4 = this.zzFz.zzKm().zzLm().zzM4();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzY(this.zzFz.zzKj().zzV(this.zzFz.zzKl().zzXc(), this.zzFz.zzKm().zzLm().zzM2(), this.zzFz.zzKm().zzLm().zzM1()), iZzM4));
    }

    private void zzL3() throws Exception {
        zzNN zznnZzXo = this.zzFz.zzKk().zzXo(this.zzFz.zzKm().zzLm().zzM4());
        if (zznnZzXo == null) {
            return;
        }
        zzPM zzpmZzZ = zznnZzXo.zzZ(this.zzFz);
        this.zzEv.zzMw();
        int iZzXc = this.zzFz.zzKl().zzXc();
        boolean z = this.zzFz.zzKl().zzXc() > 0;
        int iZzXc2 = this.zzFz.zzKl().zzXc();
        this.zzFz.zzKn().zzMt().zzN(zzO3.zzZ((iZzXc & 1) != 0 ? this.zzFz.zzKl().zzXN(iZzXc2) : zzZ(zzpmZzZ, this.zzFz.zzKl().zzXP(iZzXc2)), zzpmZzZ, this.zzFz.zzKl().zzXL(iZzXc2), this.zzEv, iZzXc, z ? this.zzFz.zzKl().zzMQ() : new zzP9()));
    }

    private void zzL4() throws Exception {
        this.zzEv.zzMw();
        int iZzXc = this.zzFz.zzKl().zzXc();
        int iZzXc2 = this.zzFz.zzKl().zzXc();
        zzZQ4 zzzq4ZzMX = this.zzFz.zzKl().zzMX();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(this.zzFz.zzKl().zzXN(iZzXc2), zzzq4ZzMX, iZzXc, this.zzEv, this.zzFz.zzKm().zzLm().zzM4()));
    }

    private void zzL5() throws Exception {
        int iZzn = this.zzFz.zzKm().zzLm().zzn(8, 15);
        this.zzEv.zzMw();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(iZzn, this.zzEv));
    }

    private void zzL6() throws Exception {
        zzNM zznmZzXm = zzXm(this.zzFz.zzKm().zzLm().zzM4());
        if (zznmZzXm == null) {
            return;
        }
        this.zzFz.zzKl().zzXc();
        int iZzMG = this.zzFz.zzKl().zzMG();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(zznmZzXm, this.zzFz.zzKl().zzMX(), iZzMG, this.zzFz.zzKj().zzV(this.zzFz.zzKl().zzXc(), this.zzFz.zzKm().zzLm().zzM2(), this.zzFz.zzKm().zzLm().zzM1())));
    }

    private void zzL7() throws Exception {
        zzNM zznmZzXm = zzXm(this.zzFz.zzKm().zzLm().zzM4());
        if (zznmZzXm == null) {
            return;
        }
        this.zzFz.zzKl().zzXc();
        int iZzMG = this.zzFz.zzKl().zzMG();
        this.zzFz.zzKn().zzMt().zzN(this.zzFz.zzKq().zzZ(zznmZzXm, this.zzFz.zzKl().zzMX(), iZzMG, zzL0()));
    }

    private void zzL8() throws Exception {
        this.zzFz.zzKn().zzY(this.zzFz.zzKl().zzMX(), this.zzFz.zzKm().zzLm().zzn(4, 7));
    }

    private void zzL9() throws Exception {
        this.zzFz.zzKn().zzp(this.zzFz.zzKm().zzLm().zzn(8, 15), this.zzFz.zzKm().zzLm().zzn(4, 7));
    }

    private void zzLa() throws Exception {
        this.zzFz.zzKn().zzo(this.zzFz.zzKm().zzLm().zzn(8, 15), this.zzFz.zzKm().zzLm().zzn(4, 7));
    }

    private void zzLb() throws Exception {
        this.zzFz.zzKn().zzh(zzZPW.zzG(Float.intBitsToFloat(this.zzFz.zzKl().zzXc()), Float.intBitsToFloat(this.zzFz.zzKl().zzXc())));
    }

    private void zzLc() throws Exception {
        this.zzFz.zzKn().zzXA(this.zzFz.zzKl().zzXc());
    }

    private void zzLd() throws Exception {
        this.zzFz.zzKn().restore(this.zzFz.zzKl().zzXc());
    }

    private void zzLe() throws Exception {
        zzZQ4 zzzq4ZzMX = this.zzFz.zzKl().zzMX();
        zzZQ4 zzzq4ZzMX2 = this.zzFz.zzKl().zzMX();
        this.zzFz.zzKn().zzZ(this.zzFz.zzKl().zzXc(), zzzq4ZzMX2, zzzq4ZzMX);
    }

    private void zzLf() throws Exception {
        this.zzFz.zzKn().zzXz(this.zzFz.zzKl().zzXc());
    }

    private void zzLg() throws Exception {
        this.zzFz.zzKn().zzXy(this.zzFz.zzKl().zzXc());
    }

    private void zzLh() throws Exception {
        this.zzFz.zzKl().zzXc();
        this.zzFz.zzKl().zzXc();
        this.zzFz.zzKi().zz1(this.zzFz.zzKl().zzXc());
        this.zzFz.zzKi().zz0(this.zzFz.zzKl().zzXc());
    }

    private boolean zzLi() throws Exception {
        int iZzXc = this.zzFz.zzKl().zzXc();
        if (iZzXc < 4 || 726027589 != this.zzFz.zzKl().zzXc()) {
            return false;
        }
        zzZOP zzzopZzq = this.zzFz.zzKl().zzq();
        this.zzN5 = zzzopZzq;
        int position = (int) ((zzzopZzq.getPosition() + ((long) iZzXc)) - 4);
        this.zzEu = position;
        if (position <= this.zzN5.getLength()) {
            return true;
        }
        this.zzEu = (int) this.zzN5.getLength();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean zzMO() throws Exception {
        switch (this.zzFz.zzKm().zzLl()) {
            case EditingLanguage.ARABIC_QATAR /* 16385 */:
                zzLh();
                return true;
            case InputDeviceCompat.SOURCE_STYLUS /* 16386 */:
                return false;
            case 16387:
            case 16389:
            case 16390:
            case 16391:
            case 16413:
            case 16414:
            case 16415:
            case 16416:
            case 16417:
            case 16418:
            case 16419:
            case 16420:
            case 16440:
            case 16441:
            case 16442:
                return true;
            case 16388:
                this.zzEs = true;
                return true;
            case 16392:
                this.zzEt.zzLW();
                return true;
            case EditingLanguage.ENGLISH_INDIA /* 16393 */:
                clear();
                return true;
            case EditingLanguage.SPANISH_BOLIVIA /* 16394 */:
                zzKO();
                return true;
            case 16395:
                zzKN();
                return true;
            case 16396:
                zzKP();
                return true;
            case 16397:
                zzKQ();
                return true;
            case 16398:
                zzKT();
                return true;
            case 16399:
                zzKU();
                return true;
            case 16400:
                zzKW();
                return true;
            case 16401:
                zzKV();
                return true;
            case 16402:
                zzL1();
                return true;
            case 16403:
                zzL5();
                return true;
            case 16404:
                zzKR();
                return true;
            case 16405:
                zzKS();
                return true;
            case 16406:
                zzKX();
                return true;
            case 16407:
                zzKY();
                return true;
            case 16408:
                zzKZ();
                return true;
            case 16409:
                zzL2();
                return true;
            case 16410:
                zzL7();
                return true;
            case 16411:
                zzL6();
                return true;
            case 16412:
                zzL4();
                return true;
            case 16421:
                zzLc();
                return true;
            case 16422:
                zzLd();
                return true;
            case 16423:
                zzLe();
                return true;
            case 16424:
                zzLf();
                return true;
            case 16425:
                zzLg();
                return true;
            case 16426:
                zzKJ();
                return true;
            case 16427:
                this.zzFz.zzKn().zzMu().zzY(null, 1);
                return true;
            case 16428:
                zzKH();
                return true;
            case 16429:
                zzKI();
                return true;
            case 16430:
                zzKK();
                return true;
            case 16431:
                zzKL();
                return true;
            case 16432:
                zzKM();
                return true;
            case 16433:
                this.zzFz.zzKn().zzMv();
                return true;
            case 16434:
                zzL8();
                return true;
            case 16435:
                zzL9();
                return true;
            case 16436:
                zzLa();
                return true;
            case 16437:
                zzLb();
                return true;
            case 16438:
                zzL3();
                return true;
            case 16439:
            default:
                zzN6 zzn6 = this.zzFz;
                zzn6.zzXG(zzn6.zzKm().zzLl());
                return true;
        }
    }

    private zzZQ4[] zzXf(int i) throws Exception {
        zzZQ4[] zzzq4Arr = new zzZQ4[i];
        for (int i2 = 0; i2 < i; i2++) {
            zzzq4Arr[i2] = zzb(this.zzFz.zzKm().zzLm().zzM1());
        }
        return zzzq4Arr;
    }

    private zzNM zzXm(int i) {
        return this.zzFz.zzKk().zzXm(i);
    }

    private static String zzZ(zzPM zzpm, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            zzZNH.zzU(sb, zzZVS.zzS7(zzpm.zzPl().zzpP().zzSt(i).zzZD()));
        }
        return sb.toString();
    }

    private zzZQ4 zzb(boolean z) throws Exception {
        if (!z) {
            return this.zzFz.zzKl().zzMX();
        }
        return new zzZQ4(this.zzFz.zzKl().zzXa(), this.zzFz.zzKl().zzXa(), this.zzFz.zzKl().zzXa(), this.zzFz.zzKl().zzXa());
    }

    public final boolean zzLj() {
        return this.zzEs;
    }

    public final void zzc(boolean z) throws Exception {
        if (zzLi()) {
            this.zzEs = false;
            while (this.zzN5.getPosition() < this.zzEu) {
                if ((this.zzFz.zzML() && z) || this.zzN5.getPosition() + 8 > this.zzN5.getLength()) {
                    return;
                }
                this.zzFz.zzKm().zzLo();
                if (this.zzFz.zzKm().zzLk() < 8 || !zzMO()) {
                    return;
                } else {
                    this.zzFz.zzKm().zzLn();
                }
            }
        }
    }
}
