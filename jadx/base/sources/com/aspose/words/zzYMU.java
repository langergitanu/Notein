package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.FirebaseError;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMU extends zzYL1 {
    private static int[] zzXGP;
    private static com.aspose.words.internal.zzD5 zzXGS;
    private boolean zzXGQ;
    private zzYMT zzXGR;

    static {
        com.aspose.words.internal.zzD5 zzd5 = new com.aspose.words.internal.zzD5();
        zzXGS = zzd5;
        zzXGP = new int[]{1174, 1172, 1288, 1522};
        zzd5.zz2(17496, 1205);
        zzXGS.zz2(17497, 1225);
        zzXGS.zz2(FirebaseError.ERROR_NO_SIGNED_IN_USER, 1175);
        zzXGS.zz2(17494, 1165);
        zzXGS.zz2(17493, EditingLanguage.CORSICAN);
    }

    public zzYMU(zzZZ2 zzzz2) throws Exception {
        super(zzzz2);
    }

    private void zz2(int i, int i2, int i3) throws Exception {
        if (this.zzXGQ) {
            i2 = i3;
        }
        this.zzZzR.zzVA(i2, i);
    }

    private void zzYpc() throws Exception {
        zzYTV zzytvZzYpK = ((zzYMX) this.zzZF0).zzYpK();
        if (zzytvZzYpK == null) {
            return;
        }
        if (zzytvZzYpK.zzYyr()) {
            this.zzZzR.zzZe(9283, true);
        }
        if (zzytvZzYpK.isActive()) {
            this.zzZzR.zzJ((short) -14779);
            this.zzZzR.writeByte(UnsignedBytes.MAX_POWER_OF_TWO);
            this.zzZzR.zzq().getPosition();
            this.zzZzR.writeByte(zzytvZzYpK.zzYyq() ? (byte) 1 : (byte) 0);
            this.zzZzR.writeByte((byte) 0);
            this.zzZzR.zzK((short) this.zzYTI.zzCK(zzytvZzYpK.getAuthor()));
            zzKE.zzZ(zzytvZzYpK.zzZx(), this.zzZzR);
            for (int i = 0; i < 9; i++) {
                this.zzZzR.writeByte(zzytvZzYpK.zzYyp()[i]);
            }
            for (int i2 = 0; i2 < 9; i2++) {
                this.zzZzR.writeByte((byte) zzytvZzYpK.zzYyo()[i2]);
            }
            this.zzZzR.zzK((short) 0);
            for (int i3 = 0; i3 < 9; i3++) {
                this.zzZzR.zzl(zzytvZzYpK.zzYyn()[i3]);
            }
            zzZZQ.zzZ(zzytvZzYpK.getNumberFormat(), this.zzZzR, 64);
            this.zzZzR.zzq().getPosition();
        }
    }

    private void zzYpd() throws Exception {
        if (this.zzZF0.zzVE(1650)) {
            zzZ52 zzz52 = (zzZ52) this.zzZF0.zzPj(1650);
            int value = zzz52.zzZ4A() == 1 ? -zzz52.getValue() : zzz52.getValue();
            this.zzZzR.zzJ((short) 25618);
            this.zzZzR.zzK((short) value);
            this.zzZzR.zzK((short) (zzz52.zzZ4A() != 2 ? 0 : 1));
        }
    }

    private boolean zzc(int i, Object obj) throws Exception {
        int iZzVB = zzXGS.zzVB(i);
        if (iZzVB == Integer.MIN_VALUE) {
            return false;
        }
        zz4(iZzVB, (Integer) obj);
        return true;
    }

    private void zzqz(int i) throws Exception {
        if (this.zzXGQ) {
            i = zzYMX.zzqE(i);
        }
        this.zzZzR.zzVB(9219, i);
    }

    public final byte[] zzY(TableStyle tableStyle) throws Exception {
        this.zzZzR.zzq().zzH(0L);
        this.zzZF0 = tableStyle.zzZYj();
        zzYpe();
        for (ConditionalStyle conditionalStyle : tableStyle.getConditionalStyles().zzZY9()) {
            if (conditionalStyle.zzZYi()) {
                long jZzW8 = zzW8(50790, conditionalStyle.zzZYk());
                this.zzZF0 = conditionalStyle.zzZYj();
                zzYpe();
                zzXq(jZzW8);
            }
        }
        return zzYmM();
    }

    @Override // com.aspose.words.zzYL1
    public final void zzYpe() throws Exception {
        zz3(zzXGP);
        for (int i = 0; i < this.zzZF0.getCount(); i++) {
            int iZzT3 = this.zzZF0.zzT3(i);
            Object objZzVY = this.zzZF0.zzVY(i);
            zzpL(iZzT3);
            switch (iZzT3) {
                case 1000:
                    if (zzYmI() && zzY0C.zzhF(((Integer) objZzVY).intValue())) {
                        zz4(17920, objZzVY);
                    }
                    break;
                case PointerIconCompat.TYPE_GRAB /* 1020 */:
                    zzqz(((Integer) objZzVY).intValue());
                    break;
                case EditingLanguage.DANISH /* 1030 */:
                    zz7(9220, objZzVY);
                    break;
                case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                    zz7(9221, objZzVY);
                    break;
                case 1050:
                    zz7(9222, objZzVY);
                    break;
                case EditingLanguage.SLOVENIAN /* 1060 */:
                    zz7(9223, objZzVY);
                    break;
                case EditingLanguage.SORBIAN /* 1070 */:
                    zz7(9267, objZzVY);
                    break;
                case EditingLanguage.FAEROESE /* 1080 */:
                    zz7(9268, objZzVY);
                    break;
                case EditingLanguage.TURKMEN /* 1090 */:
                    zz7(9269, objZzVY);
                    break;
                case EditingLanguage.MALAYALAM /* 1100 */:
                    zz7(9270, objZzVY);
                    break;
                case EditingLanguage.GALICIAN /* 1110 */:
                    zz6(9738, objZzVY);
                    break;
                case EditingLanguage.KASHMIRI_ARABIC /* 1120 */:
                    zz4(17931, objZzVY);
                    break;
                case EditingLanguage.DIVEHI /* 1125 */:
                    zzYpc();
                    break;
                case EditingLanguage.YORUBA /* 1130 */:
                    zz7(9228, objZzVY);
                    break;
                case EditingLanguage.GUARANI /* 1140 */:
                    TabStopCollection tabStops = ((zzYMX) this.zzZF0).getTabStops();
                    if (tabStops != null && !tabStops.zzY0s()) {
                        zzY75.zzZ(tabStops, this.zzZzR);
                    }
                    break;
                case EditingLanguage.PAPIAMENTU /* 1145 */:
                    zz7(9328, (Boolean) objZzVY);
                    break;
                case EditingLanguage.BRETON /* 1150 */:
                    zz2(((Integer) objZzVY).intValue(), 33806, 33807);
                    break;
                case 1160:
                    zz2(((Integer) objZzVY).intValue(), 33807, 33806);
                    break;
                case EditingLanguage.CENTRAL_KURDISH_IRAQ /* 1170 */:
                    zz4(33809, objZzVY);
                    break;
                case 1200:
                    zz4(42003, objZzVY);
                    break;
                case 1210:
                    zz7(9307, objZzVY);
                    break;
                case 1220:
                    zz4(42004, objZzVY);
                    break;
                case 1230:
                    zz7(9308, objZzVY);
                    break;
                case 1240:
                    zz7(9271, objZzVY);
                    break;
                case 1250:
                    zz7(9272, objZzVY);
                    break;
                case 1260:
                    zz7(9287, objZzVY);
                    break;
                case 1270:
                    zz7(9288, objZzVY);
                    break;
                case 1280:
                    zz6(9792, objZzVY);
                    break;
                case 1350:
                    zz0(25636, objZzVY);
                    break;
                case 1360:
                    zz0(25637, objZzVY);
                    break;
                case 1370:
                    zz0(25638, objZzVY);
                    break;
                case 1380:
                    zz0(25639, objZzVY);
                    break;
                case 1390:
                    zz0(25640, objZzVY);
                    break;
                case 1400:
                    zz0(26153, objZzVY);
                    break;
                case 1410:
                    zz7(9258, objZzVY);
                    break;
                case 1430:
                    zzZKP zzzkp = (zzZKP) objZzVY;
                    int value = zzzkp.getValue();
                    if (zzzkp.zzZ4A() == 0) {
                        value |= 32768;
                    }
                    this.zzZzR.zzVA(17451, value);
                    break;
                case 1440:
                    this.zzZzR.zzVA(17452, ((Integer) this.zzZF0.zzPj(1440)).intValue() | (((Integer) this.zzZF0.zzPj(1450)).intValue() << 3));
                    break;
                case 1460:
                    if (((Shading) objZzVY).getTexture() != 65535) {
                        zzZY(17453, objZzVY);
                    }
                    break;
                case 1470:
                    zz7(9265, objZzVY);
                    break;
                case 1480:
                    zz4(17466, objZzVY);
                    break;
                case 1490:
                    zz4(33838, objZzVY);
                    break;
                case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                    zz4(33839, objZzVY);
                    break;
                case 1510:
                    zz4(17465, objZzVY);
                    break;
                case 1520:
                    zz7(9264, objZzVY);
                    break;
                case 1560:
                    zz7(9281, (Boolean) objZzVY);
                    break;
                case 1585:
                    zz3(25701, objZzVY);
                    break;
                case 1590:
                    zz6(9329, (Integer) objZzVY);
                    break;
                case 1660:
                    zz7(9314, objZzVY);
                    break;
                default:
                    zzc(iZzT3, objZzVY);
                    break;
            }
        }
        zzYmH();
        zzYMT zzymt = this.zzXGR;
        if (zzymt != null) {
            boolean z = zzymt.zzXGM;
            if (z) {
                this.zzZzR.zzZe(9291, z);
            }
            boolean z2 = this.zzXGR.zzXGN;
            if (z2) {
                this.zzZzR.zzZe(9292, z2);
            }
            if (this.zzXGR.zzXGL != 0) {
                this.zzZzR.zzZe(9238, true);
            }
            boolean z3 = this.zzXGR.zzXGO;
            if (z3) {
                this.zzZzR.zzZe(9239, z3);
            }
            int i2 = this.zzXGR.zzXGL;
            if (i2 != 0) {
                this.zzZzR.zzVy(26185, i2);
            }
        }
        zzWe(33885, EditingLanguage.BRETON);
        zzWe(33886, 1160);
        zzWe(33888, EditingLanguage.CENTRAL_KURDISH_IRAQ);
        zzWf(9313, PointerIconCompat.TYPE_GRAB);
        zzWh(9325, 1022);
        zzWc(25703, 1580);
        zzW7(50799, 9828);
    }

    public final zzYNJ zzZ(zzYMX zzymx, zzYMT zzymt, boolean z) throws Exception {
        this.zzXGQ = z;
        this.zzXGR = zzymt;
        return new zzYNJ(zzymx.zzZ7j(), zzT(zzymx));
    }

    @Override // com.aspose.words.zzYL1
    public final void zzqA(int i) throws Exception {
        if (i == 1172) {
            TabStopCollection tabStops = ((zzYMX) this.zzZF0).getTabStops();
            if (tabStops == null || !tabStops.zzY0s()) {
                return;
            }
            zzY75.zzZ(tabStops, this.zzZzR);
            return;
        }
        if (i == 1174) {
            zzYpd();
            return;
        }
        if (i == 1288) {
            zzYmK();
            zzYmJ();
            zzWe(33818, 1310);
            zz0(9755, 1320, 1330);
            zzWf(9251, 1340);
            return;
        }
        if (i != 1522) {
            throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Invalid block key {0}.", Integer.valueOf(i)));
        }
        if (((zzYMX) this.zzZF0).getShading().getTexture() != 65535) {
            zzW9(50765, 1460);
        }
        zzWa(50766, 1350);
        zzWa(50767, 1360);
        zzWa(50768, 1370);
        zzWa(50769, 1380);
        zzWa(50770, 1390);
    }
}
