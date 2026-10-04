package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.FirebaseError;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMV extends zzYL2 implements zzZ97 {
    private static com.aspose.words.internal.zzD5 zzXGS;
    private zzYMT zzXGR;
    private zzY9J zzXH2;

    static {
        com.aspose.words.internal.zzD5 zzd5 = new com.aspose.words.internal.zzD5();
        zzXGS = zzd5;
        zzd5.zz2(17496, 1205);
        zzXGS.zz2(17497, 1225);
        zzXGS.zz2(FirebaseError.ERROR_NO_SIGNED_IN_USER, 1175);
        zzXGS.zz2(17494, 1165);
        zzXGS.zz2(17493, EditingLanguage.CORSICAN);
    }

    public zzYMV(zzZZB zzzzb) throws Exception {
        super(zzzzb);
        this.zzXH2 = new zzY9J(this, zzzzb.zzYUt, zzzzb.zzYUr);
    }

    private void zzWo(int i, int i2) {
        if (zzYMX.zzWp(i2, 10)) {
            ((zzYMX) this.zzZF0).set(i, Integer.valueOf(i2));
        } else {
            zzY("Invalid indent value {0} read, ignore.", Integer.valueOf(i2));
        }
    }

    private void zzY(zzYTV zzytv, int i) throws Exception {
        if (i != 128) {
            zzU("Invalid number revision length.", new Object[0]);
        }
        zzytv.zzSt((this.zzW6.readByte() & 255) != 0);
        this.zzW6.readByte();
        zzytv.setAuthor(zzYmN().zzYUs.zzpy(this.zzW6.zzXa()));
        zzytv.zz4(zzKE.zzM4(this.zzW6.zzXc()));
        for (int i2 = 0; i2 < 9; i2++) {
            zzytv.zzYyp()[i2] = this.zzW6.readByte();
        }
        for (int i3 = 0; i3 < 9; i3++) {
            zzytv.zzYyo()[i3] = this.zzW6.readByte() & 255;
        }
        this.zzW6.zzXa();
        for (int i4 = 0; i4 < 9; i4++) {
            zzytv.zzYyn()[i4] = this.zzW6.zzXc();
        }
        zzytv.setNumberFormat(zzZZR.zzS(this.zzW6, i - 64));
    }

    public static void zzYpf() {
    }

    private void zzqB(int i) throws Exception {
        int iIntValue = ((Integer) this.zzZF0.zzPj(i)).intValue() + this.zzW6.zzXa();
        WordAttrCollection wordAttrCollection = this.zzZF0;
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        wordAttrCollection.zzQ(i, Integer.valueOf(iIntValue));
    }

    public final void zzZ(zzYNJ zzynj, zzYMX zzymx, zzYMT zzymt) throws Exception {
        zzymx.zzBl(zzynj.zzZ7j());
        zzZ(zzynj.getData(), zzymx, zzymt);
        zzYL2.zzU(zzymx);
    }

    public final void zzZ(byte[] bArr, zzYMX zzymx, zzYMT zzymt) throws Exception {
        if (zzYmN().zzZrB()) {
            return;
        }
        zzZ(zzymx, zzymt);
        this.zzXH2.zzXK(bArr);
    }

    public final void zzZ(byte[] bArr, TableStyle tableStyle) throws Exception {
        this.zzYED = tableStyle;
        this.zzZF0 = tableStyle.zzZYj();
        this.zzXH2.zzXK(bArr);
    }

    public final void zzZ(zzYMX zzymx, zzYMT zzymt) {
        this.zzZF0 = zzymx;
        this.zzXGR = zzymt;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.aspose.words.zzZ97
    public final boolean zzZ(int i, int i2, int i3, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (i2 != 1) {
            return true;
        }
        this.zzW6 = zzzox;
        if (zzYmN().zzZrB() && !zzYL2.zzpP(i)) {
            return true;
        }
        int i4 = 0;
        if (i != 9238) {
            if (i == 9239) {
                zzYMT zzymt = this.zzXGR;
                if (zzymt != null) {
                    zzymt.zzXGO = this.zzW6.readByte() == 1;
                }
            } else if (i == 9264) {
                this.zzZF0.zzQ(1520, Boolean.valueOf(this.zzW6.readByte() == 1));
            } else if (i == 9265) {
                this.zzZF0.zzQ(1470, Boolean.valueOf(this.zzW6.readByte() == 1));
            } else if (i == 9283) {
                ((zzYMX) this.zzZF0).zzYpi();
                ((zzYMX) this.zzZF0).zzYpK().zzSu(zzzox.readByte() != 0);
            } else if (i == 9284) {
                zzT("Paragraph formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
            } else if (i == 9287) {
                this.zzZF0.zzQ(1260, Boolean.valueOf(this.zzW6.readByte() == 1));
            } else if (i == 9288) {
                this.zzZF0.zzQ(1270, Boolean.valueOf(this.zzW6.readByte() == 1));
            } else if (i == 9291) {
                zzYMT zzymt2 = this.zzXGR;
                if (zzymt2 != null) {
                    zzymt2.zzXGM = this.zzW6.readByte() == 1;
                }
            } else if (i == 9292) {
                zzYMT zzymt3 = this.zzXGR;
                if (zzymt3 != null) {
                    zzymt3.zzXGN = this.zzW6.readByte() == 1;
                }
            } else if (i == 9307) {
                this.zzZF0.zzQ(1210, Boolean.valueOf(this.zzW6.readByte() == 1));
            } else if (i == 9308) {
                this.zzZF0.zzQ(1230, Boolean.valueOf(this.zzW6.readByte() == 1));
            } else if (i == 9313) {
                this.zzZF0.zzQ(PointerIconCompat.TYPE_GRAB, Integer.valueOf(this.zzW6.readByte() & 255));
                this.zzZF0.remove(1610);
            } else if (i != 9314) {
                switch (i) {
                    case 38:
                        zzWj(1350, 1);
                        break;
                    case 39:
                        zzWj(1360, 1);
                        break;
                    case 40:
                        zzWj(1370, 1);
                        break;
                    case 41:
                        zzWj(1380, 1);
                        break;
                    case 42:
                        zzWj(1390, 1);
                        break;
                    case 43:
                        zzWj(1400, 1);
                        break;
                    case 64:
                    case 9281:
                        ((zzYMX) this.zzZF0).setBidi(this.zzW6.readByte() == 1);
                        break;
                    case 9228:
                        this.zzZF0.zzQ(EditingLanguage.YORUBA, Boolean.valueOf(this.zzW6.readByte() == 1));
                        break;
                    case 9251:
                        this.zzZF0.zzQ(1340, Integer.valueOf(this.zzW6.readByte() & 255));
                        break;
                    case 9258:
                        this.zzZF0.zzQ(1410, Boolean.valueOf(this.zzW6.readByte() == 1));
                        break;
                    case 9325:
                        this.zzZF0.zzQ(1022, Boolean.valueOf(this.zzW6.readByte() == 1));
                        break;
                    case 9328:
                        this.zzZF0.zzQ(EditingLanguage.PAPIAMENTU, Boolean.valueOf(this.zzW6.readByte() == 1));
                        break;
                    case 9329:
                        this.zzZF0.zzQ(1590, Integer.valueOf(this.zzW6.readByte() & 255));
                        break;
                    case 9727:
                        if (zzZRA.zzDL(zzYmN().zzYUr)) {
                            ((zzYMX) this.zzZF0).zzQ(1642, Integer.valueOf(zzzox.readByte() & 255));
                        }
                        break;
                    case 9730:
                        zzT("Paragraph formatting modifier 0x{0:x4} is not supported for DOC format by Aspose.Words.", Integer.valueOf(i));
                        break;
                    case 9738:
                        this.zzZF0.zzQ(EditingLanguage.GALICIAN, Integer.valueOf(this.zzW6.readByte() & 255));
                        break;
                    case 9755:
                        zzWi(1320, 1330);
                        break;
                    case 9792:
                        this.zzZF0.zzQ(1280, Integer.valueOf(this.zzW6.readByte() & 255));
                        break;
                    case 9828:
                        if (this.zzW6.readBoolean() && this.zzZF0.zzYsN() != null) {
                            this.zzZF0 = this.zzZF0.zzYsN().zzZ6C();
                        }
                        break;
                    case 17451:
                        short sZzXa = this.zzW6.zzXa();
                        if (sZzXa > 0) {
                            this.zzZF0.zzQ(1430, new zzZKP(1, sZzXa));
                        } else if (sZzXa < 0) {
                            this.zzZF0.zzQ(1430, new zzZKP(0, sZzXa & Short.MAX_VALUE));
                        } else {
                            this.zzZF0.zzQ(1430, new zzZKP(2, 0));
                        }
                        break;
                    case 17452:
                        short sZzXa2 = this.zzW6.zzXa();
                        this.zzZF0.zzQ(1440, Integer.valueOf(sZzXa2 & 7));
                        this.zzZF0.zzQ(1450, Integer.valueOf((sZzXa2 & 248) >> 3));
                        break;
                    case 17453:
                        zzpO(1460);
                        break;
                    case 17465:
                        this.zzZF0.zzQ(1510, Integer.valueOf(this.zzW6.zzX9() & 65535));
                        break;
                    case 17466:
                        this.zzZF0.zzQ(1480, Integer.valueOf(this.zzW6.zzXa()));
                        break;
                    case 17920:
                        short sZzXa3 = this.zzW6.zzXa();
                        if (zzY0C.zzhF(sZzXa3)) {
                            ((zzYMX) this.zzZF0).zzBl(sZzXa3);
                        }
                        break;
                    case 17931:
                        short sZzXa4 = this.zzW6.zzXa();
                        this.zzZF0.zzQ(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(sZzXa4 != 2047 ? sZzXa4 : (short) 0));
                        break;
                    case 17936:
                        zzqB(1620);
                        break;
                    case 17948:
                        zzWj(1350, 0);
                        break;
                    case 17949:
                        zzWj(1360, 0);
                        break;
                    case 17950:
                        zzWj(1370, 0);
                        break;
                    case 17951:
                        zzWj(1380, 0);
                        break;
                    case 17952:
                        zzWj(1390, 0);
                        break;
                    case 17953:
                        zzWj(1400, 0);
                        break;
                    case 18015:
                        zzqB(1160);
                        break;
                    case 25618:
                        short sZzXa5 = this.zzW6.zzXa();
                        boolean z = this.zzW6.zzXa() != 0;
                        if (sZzXa5 < 0) {
                            i4 = 1;
                        } else if (z) {
                            i4 = 2;
                        }
                        this.zzZF0.zzQ(1650, new zzZ52(Math.abs((int) sZzXa5), i4));
                        break;
                    case 25636:
                        zzWj(1350, 2);
                        break;
                    case 25637:
                        zzWj(1360, 2);
                        break;
                    case 25638:
                        zzWj(1370, 2);
                        break;
                    case 25639:
                        zzWj(1380, 2);
                        break;
                    case 25640:
                        zzWj(1390, 2);
                        break;
                    case 25701:
                        this.zzZF0.zzQ(1585, Integer.valueOf(this.zzW6.zzXc()));
                        break;
                    case 25703:
                        this.zzZF0.zzQ(1580, Integer.valueOf(this.zzW6.zzXc()));
                        break;
                    case 25707:
                    case 50796:
                        break;
                    case 26153:
                        zzWj(1400, 2);
                        break;
                    case 26185:
                        zzYMT zzymt4 = this.zzXGR;
                        if (zzymt4 != null) {
                            zzymt4.zzXGL = this.zzW6.zzXc();
                            zzYMT zzymt5 = this.zzXGR;
                            int i5 = zzymt5.zzXGL;
                            if (i5 < 0 || i5 > 1000) {
                                zzymt5.zzXGL = 1;
                            }
                        }
                        break;
                    case 33806:
                        this.zzZF0.zzQ(1630, Integer.valueOf(this.zzW6.zzXa()));
                        break;
                    case 33807:
                        zzWo(1620, this.zzW6.zzXa());
                        break;
                    case 33809:
                        zzWo(1640, this.zzW6.zzXa());
                        break;
                    case 33816:
                        zzYmQ();
                        break;
                    case 33817:
                        zzYmP();
                        break;
                    case 33818:
                        this.zzZF0.zzQ(1310, Integer.valueOf(this.zzW6.zzXa()));
                        break;
                    case 33838:
                        this.zzZF0.zzQ(1490, Integer.valueOf(this.zzW6.zzXa()));
                        break;
                    case 33839:
                        this.zzZF0.zzQ(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, Integer.valueOf(this.zzW6.zzXa()));
                        break;
                    case 33885:
                        this.zzZF0.zzQ(EditingLanguage.BRETON, Integer.valueOf(this.zzW6.zzXa()));
                        break;
                    case 33886:
                        zzWo(1160, this.zzW6.zzXa());
                        break;
                    case 33888:
                        zzWo(EditingLanguage.CENTRAL_KURDISH_IRAQ, this.zzW6.zzXa());
                        break;
                    case 42003:
                        this.zzZF0.zzQ(1200, Integer.valueOf(this.zzW6.zzXa()));
                        break;
                    case 42004:
                        this.zzZF0.zzQ(1220, Integer.valueOf(this.zzW6.zzXa()));
                        break;
                    case 50689:
                        if (i3 != 0) {
                            zzzox.readByte();
                            int iZzX9 = zzzox.zzX9() & 65535;
                            int iZzX92 = zzzox.zzX9() & 65535;
                            int i6 = (iZzX92 - iZzX9) + 1;
                            int[] iArr = new int[i6];
                            for (int i7 = 0; i7 < i6; i7++) {
                                iArr[i7] = zzzox.zzX9() & 65535;
                            }
                            if (((zzYMX) this.zzZF0).zzZ7j() > iZzX9 && ((zzYMX) this.zzZF0).zzZ7j() <= iZzX92) {
                                WordAttrCollection wordAttrCollection = this.zzZF0;
                                ((zzYMX) wordAttrCollection).zzBl(iArr[((zzYMX) wordAttrCollection).zzZ7j() - iZzX9]);
                            }
                        }
                        break;
                    case 50701:
                    case 50709:
                        if (((zzYMX) this.zzZF0).getTabStops() == null) {
                            ((zzYMX) this.zzZF0).zzY(new TabStopCollection());
                        }
                        int position = (int) this.zzW6.zzq().getPosition();
                        zzY75.zzZ(this.zzW6, ((zzYMX) this.zzZF0).getTabStops(), i == 50709, getWarningCallback());
                        long j = position + i3;
                        if (j != this.zzW6.zzq().getPosition()) {
                            zzU("Invalid tab stop data, ignored.", new Object[0]);
                            this.zzW6.zzq().zzH(j);
                        }
                        break;
                    case 50750:
                        if (zzZRA.zzDL(zzYmN().zzYUr)) {
                            ((zzYMX) this.zzZF0).zzQ(1641, new zzL(zzzox));
                        }
                        break;
                    case 50757:
                        ((zzYMX) this.zzZF0).zzYpi();
                        zzY(((zzYMX) this.zzZF0).zzYpK(), i3);
                        break;
                    case 50765:
                        zzpN(1460);
                        break;
                    case 50766:
                        zzWj(1350, 3);
                        break;
                    case 50767:
                        zzWj(1360, 3);
                        break;
                    case 50768:
                        zzWj(1370, 3);
                        break;
                    case 50769:
                        zzWj(1380, 3);
                        break;
                    case 50770:
                        zzWj(1390, 3);
                        break;
                    case 50771:
                        zzWj(1400, 3);
                        break;
                    case 50790:
                        zzZ(this, zzzox, i3, 1);
                        break;
                    case 50799:
                        zzY((WordAttrCollection) new zzYMX(), false);
                        break;
                    default:
                        switch (i) {
                            case 9219:
                                if (!this.zzZF0.contains(PointerIconCompat.TYPE_GRAB) && zzYmN().zzYUr <= 217) {
                                    this.zzZF0.zzQ(1610, Integer.valueOf(this.zzW6.readByte() & 255));
                                }
                                break;
                            case 9220:
                                this.zzZF0.zzQ(EditingLanguage.DANISH, Boolean.valueOf(this.zzW6.readByte() == 1));
                                break;
                            case 9221:
                                this.zzZF0.zzQ(EditingLanguage.ITALIAN_ITALY, Boolean.valueOf(this.zzW6.readByte() == 1));
                                break;
                            case 9222:
                                this.zzZF0.zzQ(1050, Boolean.valueOf(this.zzW6.readByte() == 1));
                                break;
                            case 9223:
                                this.zzZF0.zzQ(EditingLanguage.SLOVENIAN, Boolean.valueOf(this.zzW6.readByte() == 1));
                                break;
                            default:
                                switch (i) {
                                    case 9267:
                                        this.zzZF0.zzQ(EditingLanguage.SORBIAN, Boolean.valueOf(this.zzW6.readByte() == 1));
                                        break;
                                    case 9268:
                                        this.zzZF0.zzQ(EditingLanguage.FAEROESE, Boolean.valueOf(this.zzW6.readByte() == 1));
                                        break;
                                    case 9269:
                                        this.zzZF0.zzQ(EditingLanguage.TURKMEN, Boolean.valueOf(this.zzW6.readByte() == 1));
                                        break;
                                    case 9270:
                                        this.zzZF0.zzQ(EditingLanguage.MALAYALAM, Boolean.valueOf(this.zzW6.readByte() == 1));
                                        break;
                                    case 9271:
                                        this.zzZF0.zzQ(1240, Boolean.valueOf(this.zzW6.readByte() == 1));
                                        break;
                                    case 9272:
                                        this.zzZF0.zzQ(1250, Boolean.valueOf(this.zzW6.readByte() == 1));
                                        break;
                                    default:
                                        boolean zZzZ = zzZ(i, zzzox);
                                        if (!zZzZ && i != 0) {
                                            zzY("Unknown formatting modifier 0x{0:x4} occurred while reading DOC file.", Integer.valueOf(i));
                                        }
                                        return zZzZ;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.zzZF0.zzQ(1660, Boolean.valueOf(this.zzW6.readByte() == 1));
            }
        } else if (this.zzXGR != null) {
            boolean z2 = this.zzW6.readByte() == 1;
            if (zzZRA.zzDL(zzYmN().zzYUr)) {
                z2 = true;
            }
            if (z2) {
                zzYMT zzymt6 = this.zzXGR;
                if (zzymt6.zzXGL == 0) {
                    zzymt6.zzXGL = 1;
                }
            }
        }
        return true;
    }

    private boolean zzZ(int i, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        int iZzVC = zzXGS.zzVC(i);
        if (iZzVC == Integer.MIN_VALUE) {
            return false;
        }
        ((zzYMX) this.zzZF0).zzQ(iZzVC, Integer.valueOf(zzzox.zzXa()));
        return true;
    }
}
