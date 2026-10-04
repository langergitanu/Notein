package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
final class zzYG3 {
    static boolean zzZD5 = false;
    private zzZ52 zzXtO;
    private boolean zzXtP;
    private boolean zzXtQ;
    private zzYEM zzXwl;
    private int zzY98;
    private int zzY99;

    public zzYG3(zzYEM zzyem) {
        this.zzXwl = zzyem;
    }

    private void zzH(zzYMX zzymx) throws Exception {
        if (FrameFormat.zzY(zzymx)) {
            if (zzymx.zzVE(1310)) {
                this.zzXwl.zzYfW().zzZ5("\\absw", zzymx.zzJ5());
            }
            if (zzymx.zzVE(1430)) {
                int iZzYpA = zzymx.zzYpA();
                if (iZzYpA == 0) {
                    this.zzXwl.zzYfW().zzZ5("\\absh", zzymx.zzJ4());
                } else if (iZzYpA != 1) {
                    this.zzXwl.zzYfW().zzZ5("\\absh", 0);
                } else {
                    this.zzXwl.zzYfW().zzZ5("\\absh", -zzymx.zzJ4());
                }
            }
        }
    }

    private void zzI(zzYMX zzymx) throws Exception {
        if (zzymx.zzVE(1302)) {
            this.zzXwl.zzYfW().zzZ5(zzymx.zzYpB() < 0 ? "\\posnegy" : "\\posy", zzymx.zzYpB());
        }
        if (!zzymx.zzVE(1300) || zzymx.zzYpE() == 0) {
            return;
        }
        this.zzXwl.zzYfW().zzCD(zzYG5.zzou(zzymx.zzYpE()));
    }

    private void zzJ(zzYMX zzymx) throws Exception {
        if (zzymx.zzVE(1292)) {
            this.zzXwl.zzYfW().zzZ5(zzymx.zzYpC() < 0 ? "\\posnegx" : "\\posx", zzymx.zzYpC());
        }
        if (!zzymx.zzVE(1290) || zzymx.zzYpH() == 0) {
            return;
        }
        this.zzXwl.zzYfW().zzCD(zzYG5.zzov(zzymx.zzYpH()));
    }

    private void zzK(zzYMX zzymx) throws Exception {
        zzJ(zzymx);
        zzI(zzymx);
    }

    private void zzL(zzYMX zzymx) throws Exception {
        zzZMK zzzmkZzYsN = zzymx.zzYsN();
        this.zzXwl.zzYfW().zzZ5("\\prauth", this.zzXwl.zzYgv().add(zzzmkZzYsN.getAuthor()));
        this.zzXwl.zzYfW().zzZ5("\\prdate", zzYEO.zzt(zzzmkZzYsN.zzZx()));
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYfW().zzCC("\\*\\oldpprops");
        this.zzXwl.zzYfW().zzCD("\\pard");
        zzX(zzymx, true, false);
        this.zzXwl.zzYfW().zzYj3();
    }

    private void zzX(zzYMX zzymx, boolean z, boolean z2) throws Exception {
        this.zzXtQ = z2;
        this.zzXtP = false;
        this.zzY99 = 0;
        this.zzY98 = 0;
        this.zzXtO = new zzZ52(0, 2);
        int[] iArrZzF = zzYEO.zzF(zzymx);
        int iIntValue = 4;
        int iZzqE = 0;
        for (int i = 0; i < zzymx.getCount(); i++) {
            int iZzT3 = zzymx.zzT3(i);
            if (!this.zzXtQ || zzor(iZzT3)) {
                Object objZzVY = zzymx.zzVY(i);
                switch (iZzT3) {
                    case 1000:
                        if (z) {
                            this.zzXwl.zzYfW().zzZ5("\\s", ((Integer) objZzVY).intValue());
                        }
                        break;
                    case PointerIconCompat.TYPE_GRAB /* 1020 */:
                        iZzqE = ((Integer) objZzVY).intValue();
                        break;
                    case 1022:
                        if (((Boolean) objZzVY).booleanValue()) {
                            this.zzXwl.zzYfW().zzCD("\\contextualspace");
                        }
                        break;
                    case EditingLanguage.DANISH /* 1030 */:
                        this.zzXwl.zzYfW().zz7("\\sbys", ((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                        this.zzXwl.zzYfW().zz7("\\keep", ((Boolean) objZzVY).booleanValue());
                        break;
                    case 1050:
                        this.zzXwl.zzYfW().zz7("\\keepn", ((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.SLOVENIAN /* 1060 */:
                        this.zzXwl.zzYfW().zz7("\\pagebb", ((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.SORBIAN /* 1070 */:
                        this.zzXwl.zzYfW().zz7("\\nocwrap", !((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.FAEROESE /* 1080 */:
                        this.zzXwl.zzYfW().zz7("\\nowwrap", !((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.TURKMEN /* 1090 */:
                        this.zzXwl.zzYfW().zz7("\\nooverflow", !((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.MALAYALAM /* 1100 */:
                        this.zzXwl.zzYfW().zz7("\\toplinepunct", ((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.GALICIAN /* 1110 */:
                        this.zzXwl.zzYfW().zzZ5("\\ilvl", ((Integer) objZzVY).intValue());
                        break;
                    case EditingLanguage.KASHMIRI_ARABIC /* 1120 */:
                        this.zzXwl.zzYfW().zzt("\\ls", ((Integer) objZzVY).intValue(), 0);
                        break;
                    case EditingLanguage.DIVEHI /* 1125 */:
                        zzX((zzYTV) objZzVY);
                        break;
                    case EditingLanguage.YORUBA /* 1130 */:
                        this.zzXwl.zzYfW().zz7("\\noline", ((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.GUARANI /* 1140 */:
                        zzX((TabStopCollection) objZzVY);
                        break;
                    case EditingLanguage.PAPIAMENTU /* 1145 */:
                        this.zzXwl.zzYfW().zz7("\\indmirror", ((Boolean) objZzVY).booleanValue());
                        break;
                    case EditingLanguage.BRETON /* 1150 */:
                        this.zzY98 = ((Integer) objZzVY).intValue();
                        break;
                    case EditingLanguage.CORSICAN /* 1155 */:
                        this.zzXwl.zzYfW().zzZ5("\\curi", ((Integer) objZzVY).intValue());
                        break;
                    case 1160:
                        this.zzY99 = ((Integer) objZzVY).intValue();
                        break;
                    case 1165:
                        this.zzXwl.zzYfW().zzZ5("\\culi", ((Integer) objZzVY).intValue());
                        break;
                    case EditingLanguage.CENTRAL_KURDISH_IRAQ /* 1170 */:
                        this.zzXwl.zzYfW().zzZ5("\\fi", ((Integer) objZzVY).intValue());
                        break;
                    case 1175:
                        this.zzXwl.zzYfW().zzZ5("\\cufi", ((Integer) objZzVY).intValue());
                        break;
                    case 1200:
                        this.zzXwl.zzYfW().zzZ5("\\sb", ((Integer) objZzVY).intValue());
                        break;
                    case 1205:
                        this.zzXwl.zzYfW().zzZ5("\\lisb", ((Integer) objZzVY).intValue());
                        break;
                    case 1210:
                        this.zzXwl.zzYfW().zz5("\\sbauto", ((Boolean) objZzVY).booleanValue());
                        break;
                    case 1220:
                        this.zzXwl.zzYfW().zzZ5("\\sa", ((Integer) objZzVY).intValue());
                        break;
                    case 1225:
                        this.zzXwl.zzYfW().zzZ5("\\lisa", ((Integer) objZzVY).intValue());
                        break;
                    case 1230:
                        this.zzXwl.zzYfW().zz5("\\saauto", ((Boolean) objZzVY).booleanValue());
                        break;
                    case 1240:
                        this.zzXwl.zzYfW().zz7("\\aspalpha", ((Boolean) objZzVY).booleanValue());
                        break;
                    case 1250:
                        this.zzXwl.zzYfW().zz7("\\aspnum", ((Boolean) objZzVY).booleanValue());
                        break;
                    case 1260:
                        this.zzXwl.zzYfW().zz7("\\nosnaplinegrid", !((Boolean) objZzVY).booleanValue());
                        break;
                    case 1270:
                        this.zzXwl.zzYfW().zz7("\\adjustright", ((Boolean) objZzVY).booleanValue());
                        break;
                    case 1280:
                        this.zzXwl.zzYfW().zzZ5("\\outlinelevel", com.aspose.words.internal.zzZQB.zz2(objZzVY));
                        break;
                    case 1290:
                    case 1292:
                    case 1300:
                    case 1302:
                    case 1310:
                    case 1430:
                    case 10010:
                        break;
                    case 1320:
                        int iZzYpz = zzymx.zzYpz();
                        if (iZzYpz != 2) {
                            this.zzXwl.zzYfW().zzCD(zzYG5.zzox(iZzYpz));
                        }
                        break;
                    case 1330:
                        this.zzXwl.zzYfW().zzCD(zzYG5.zzow(zzymx.zzYpy()));
                        break;
                    case 1340:
                        if (FrameFormat.zzY(zzymx)) {
                            this.zzXwl.zzYfW().zzCD(zzYEO.zznu(((Integer) objZzVY).intValue()));
                        }
                        break;
                    case 1350:
                        this.zzXwl.zzYfW().zzCD("\\brdrt");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                        break;
                    case 1360:
                        this.zzXwl.zzYfW().zzCD("\\brdrl");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                        break;
                    case 1370:
                        this.zzXwl.zzYfW().zzCD("\\brdrb");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                        break;
                    case 1380:
                        this.zzXwl.zzYfW().zzCD("\\brdrr");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                        break;
                    case 1390:
                        this.zzXwl.zzYfW().zzCD("\\brdrbtw");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                        break;
                    case 1400:
                        this.zzXwl.zzYfW().zzCD("\\brdrbar");
                        zzYI0.zzZ(this.zzXwl, (Border) objZzVY);
                        break;
                    case 1410:
                        this.zzXwl.zzYfW().zz6("\\hyphpar", !((Boolean) objZzVY).booleanValue());
                        break;
                    case 1440:
                        this.zzXwl.zzYfW().zzt("\\dropcapt", com.aspose.words.internal.zzZQB.zz2(objZzVY), 0);
                        break;
                    case 1450:
                        this.zzXwl.zzYfW().zzZ5("\\dropcapli", ((Integer) objZzVY).intValue());
                        break;
                    case 1460:
                        Shading shading = (Shading) objZzVY;
                        zzYFH.zzZ(this.zzXwl, shading, "\\shading", "\\cbpat", "\\cfpat", zzYG5.zzoB(shading.getTexture()));
                        break;
                    case 1470:
                        if (((Boolean) objZzVY).booleanValue()) {
                            this.zzXwl.zzYfW().zz7("\\widctlpar", true);
                        } else {
                            this.zzXwl.zzYfW().zz7("\\nowidctlpar", true);
                        }
                        break;
                    case 1480:
                        if (FrameFormat.zzY(zzymx)) {
                            this.zzXwl.zzYfW().zzCD(zzYG5.zzot(((Integer) objZzVY).intValue()));
                        }
                        break;
                    case 1490:
                        if (FrameFormat.zzY(zzymx)) {
                            this.zzXwl.zzYfW().zzZ5("\\dfrmtxty", ((Integer) objZzVY).intValue());
                        }
                        break;
                    case ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED /* 1500 */:
                        if (FrameFormat.zzY(zzymx)) {
                            this.zzXwl.zzYfW().zzZ5("\\dfrmtxtx", ((Integer) objZzVY).intValue());
                        }
                        break;
                    case 1510:
                        iIntValue = ((Integer) objZzVY).intValue();
                        break;
                    case 1520:
                        if (FrameFormat.zzY(zzymx)) {
                            this.zzXwl.zzYfW().zz5("\\abslock", ((Boolean) objZzVY).booleanValue());
                        }
                        break;
                    case 1560:
                        this.zzXtP = ((Boolean) objZzVY).booleanValue();
                        break;
                    case 1580:
                        this.zzXwl.zzYfW().zzZ5("\\pararsid", ((Integer) objZzVY).intValue());
                        break;
                    case 1585:
                        this.zzXwl.zzYfW().zzZ5("\\ipgp", this.zzXwl.getDocument().zzZq2().indexOfKey(((Integer) objZzVY).intValue()) + 1);
                        break;
                    case 1590:
                        this.zzXwl.zzYfW().zzCD(zzYEO.zzno(((Integer) objZzVY).intValue()));
                        break;
                    case 1650:
                        this.zzXtO = (zzZ52) objZzVY;
                        break;
                    case 1660:
                        this.zzXwl.zzYfW().zz5("\\absnoovrlp", ((Boolean) objZzVY).booleanValue());
                        break;
                    default:
                        if (zzZD5) {
                            com.aspose.words.internal.zzZKN.format("Unhandled paragraph attribute: {0}", Integer.valueOf(iZzT3));
                        }
                        break;
                }
            }
        }
        if (!z2 && !this.zzXwl.zzYen().getExportCompactSize()) {
            this.zzXwl.zzYfW().zzCD(this.zzXtP ? "\\rtlpar" : "\\ltrpar");
        }
        zzYgU();
        if (!z2) {
            if (zzymx.getBidi()) {
                iZzqE = zzYMX.zzqE(iZzqE);
            }
            this.zzXwl.zzYfW().zzCD(zzYG5.zzoA(iZzqE));
            this.zzXwl.zzYfW().zzCD(zzYG5.zzoy(iIntValue));
            zzYpd();
            zzK(zzymx);
            zzH(zzymx);
        }
        zzYEO.zzZ(zzymx, iArrZzF);
    }

    private void zzYgU() throws Exception {
        this.zzXwl.zzYfW().zzZ5("\\li", this.zzXtP ? this.zzY98 : this.zzY99);
        this.zzXwl.zzYfW().zzZ5("\\lin", this.zzY99);
        if (this.zzXtQ) {
            return;
        }
        this.zzXwl.zzYfW().zzZ5("\\ri", this.zzXtP ? this.zzY99 : this.zzY98);
        this.zzXwl.zzYfW().zzZ5("\\rin", this.zzY98);
    }

    private void zzYpd() throws Exception {
        if (this.zzXtO.getValue() == 0) {
            return;
        }
        int iZzZ4A = this.zzXtO.zzZ4A();
        if (iZzZ4A == 1) {
            this.zzXwl.zzYfW().zzZ5("\\sl", -this.zzXtO.getValue());
            this.zzXwl.zzYfW().zzCD("\\slmult0");
        } else if (iZzZ4A != 2) {
            this.zzXwl.zzYfW().zzZ5("\\sl", this.zzXtO.getValue());
            this.zzXwl.zzYfW().zzCD("\\slmult0");
        } else {
            this.zzXwl.zzYfW().zzZ5("\\sl", this.zzXtO.getValue());
            this.zzXwl.zzYfW().zzCD("\\slmult1");
        }
    }

    private static boolean zzor(int i) {
        return i == 1140 || i == 1160 || i == 1170;
    }

    public final void zzY(zzYMX zzymx, boolean z, boolean z2) throws Exception {
        if (!zzymx.zz6D()) {
            zzX(zzymx, z, z2);
            return;
        }
        zzYMX zzymx2 = (zzYMX) zzymx.zzbn();
        zzymx2.zzYpN();
        zzX(zzymx2, z, z2);
        zzL(zzymx);
    }

    private void zzX(TabStopCollection tabStopCollection) throws Exception {
        for (int i = 0; i < tabStopCollection.getCount(); i++) {
            TabStop tabStop = tabStopCollection.get(i);
            int alignment = tabStop.getAlignment();
            if (alignment == 1) {
                this.zzXwl.zzYfW().zzCD("\\tqc");
            } else if (alignment == 2) {
                this.zzXwl.zzYfW().zzCD("\\tqr");
            } else if (alignment == 3) {
                this.zzXwl.zzYfW().zzCD("\\tqdec");
            }
            this.zzXwl.zzYfW().zz7("\\jclisttab", this.zzXtQ);
            this.zzXwl.zzYfW().zzCD(zzYG5.zzoz(tabStop.getLeader()));
            this.zzXwl.zzYfW().zzZ5(tabStop.getAlignment() == 4 ? "\\tb" : "\\tx", tabStop.zzY0E());
        }
    }

    private void zzX(zzYTV zzytv) throws Exception {
        if (zzytv == null) {
            return;
        }
        this.zzXwl.zzYfW().zzZ5("\\pnrauth", this.zzXwl.zzYgv().add(zzytv.getAuthor()));
        this.zzXwl.zzYfW().zzZ5("\\pnrdate", zzYEO.zzt(zzytv.zzZx()));
        if (zzytv.zzYyr()) {
            this.zzXwl.zzYfW().zzCD("\\pnrnot1");
            return;
        }
        if (zzytv.zzYys()) {
            this.zzXwl.zzYfW().zzCD("\\pnrstart0");
            this.zzXwl.zzYfW().zzZ5("\\pnrxst", zzytv.getNumberFormat().length() & 255);
            this.zzXwl.zzYfW().zzZ5("\\pnrxst", (zzytv.getNumberFormat().length() >> 8) & 255);
            byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(zzytv.getNumberFormat());
            for (byte b : bytes) {
                this.zzXwl.zzYfW().zzZ5("\\pnrxst", b & 255);
            }
            this.zzXwl.zzYfW().zzZ5("\\pnrstop", bytes.length + 2);
            this.zzXwl.zzYfW().zzCD("\\pnrstart1");
            for (int i = 0; i < 9; i++) {
                this.zzXwl.zzYfW().zzZ5("\\pnrrgb", zzytv.zzYyp()[i] & 255);
            }
            this.zzXwl.zzYfW().zzZ5("\\pnrstop", 9);
            this.zzXwl.zzYfW().zzCD("\\pnrstart2");
            for (int i2 = 0; i2 < 9; i2++) {
                int i3 = zzytv.zzYyo()[i2];
                this.zzXwl.zzYfW().zzZ5("\\pnrnfc", i3 & 255);
                this.zzXwl.zzYfW().zzZ5("\\pnrnfc", (i3 >> 8) & 255);
            }
            this.zzXwl.zzYfW().zzZ5("\\pnrstop", 18);
            this.zzXwl.zzYfW().zzCD("\\pnrstart3");
            for (int i4 = 0; i4 < 9; i4++) {
                int i5 = zzytv.zzYyn()[i4];
                this.zzXwl.zzYfW().zzZ5("\\pnrpnbr", i5 & 255);
                this.zzXwl.zzYfW().zzZ5("\\pnrpnbr", (i5 >> 8) & 255);
                this.zzXwl.zzYfW().zzZ5("\\pnrpnbr", (i5 >> 16) & 255);
                this.zzXwl.zzYfW().zzZ5("\\pnrpnbr", (i5 >> 24) & 255);
            }
            this.zzXwl.zzYfW().zzZ5("\\pnrstop", 36);
        }
    }
}
