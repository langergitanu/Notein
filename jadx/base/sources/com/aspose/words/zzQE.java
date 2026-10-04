package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzQE {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("activeborder", "activecaption", "captiontext", "appworkspace", "background", "buttonface", "threedface", "buttonhighlight", "buttonshadow", "threeddarkshadow", "threedhighlight", "threedlightshadow", "threedshadow", "buttontext", "graytext", "highlight", "highlighttext", "inactiveborder", "inactivecaption", "inactivecaptiontext", "infobackground", "infotext", "menu", "menutext", "scrollbar", "window", "windowframe", "windowtext");

    private static int zzI(double d, double d2, double d3) {
        return (int) Math.round(com.aspose.words.internal.zzAN.zzR(zzS(d, d2, d3) * 255.0d, 0.0d, 255.0d));
    }

    private static com.aspose.words.internal.zzPV zzJ(double d, double d2, double d3) {
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(d) / 60.0d;
        double dZzR = com.aspose.words.internal.zzAN.zzR(d2, 0.0d, 100.0d) / 100.0d;
        double dZzR2 = com.aspose.words.internal.zzAN.zzR(d3, 0.0d, 100.0d) / 100.0d;
        double d4 = dZzR2 <= 0.5d ? (dZzR + 1.0d) * dZzR2 : (dZzR2 + dZzR) - (dZzR * dZzR2);
        double d5 = (dZzR2 * 2.0d) - d4;
        return new com.aspose.words.internal.zzPV(zzI(d5, d4, dZzZJ + 2.0d), zzI(d5, d4, dZzZJ), zzI(d5, d4, dZzZJ - 2.0d));
    }

    private static double zzS(double d, double d2, double d3) {
        if (d3 < 0.0d) {
            d3 += 6.0d;
        }
        if (d3 > 6.0d) {
            d3 -= 6.0d;
        }
        double d4 = d3;
        return d4 < 1.0d ? C21532OooOOo.OooO0O0(d2, d, d4, d) : d4 < 3.0d ? d2 : d4 < 4.0d ? C21532OooOOo.OooO0O0(4.0d, d4, d2 - d, d) : d;
    }

    private static com.aspose.words.internal.zzPV zzSK(String str) {
        int i;
        int i2 = com.aspose.words.internal.zzZQ1.zz2p;
        switch (zzUR.zzTP(com.aspose.words.internal.zzZYD.zzXl(str))) {
            case 0:
                i = com.aspose.words.internal.zzZQ2.zz2L;
                break;
            case 1:
            case 2:
                i = com.aspose.words.internal.zzZQ2.zz2N;
                break;
            case 3:
                i = com.aspose.words.internal.zzZQ2.zz2H;
                break;
            case 4:
                i = com.aspose.words.internal.zzZQ2.zz2y;
                break;
            case 5:
            case 6:
                i = com.aspose.words.internal.zzZQ2.zz2y;
                break;
            case 7:
                i = com.aspose.words.internal.zzZQ2.zz2v;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                i = com.aspose.words.internal.zzZQ2.zz2u;
                break;
            case 13:
                i = com.aspose.words.internal.zzZQ2.zz2y;
                break;
            case 14:
                i = com.aspose.words.internal.zzZQ2.zz2z;
                break;
            case 15:
                i = com.aspose.words.internal.zzZQ2.zz2B;
                break;
            case 16:
                i = com.aspose.words.internal.zzZQ2.zz2A;
                break;
            case 17:
                i = com.aspose.words.internal.zzZQ2.zz2I;
                break;
            case 18:
                i = com.aspose.words.internal.zzZQ2.zz2K;
                break;
            case 19:
                i = com.aspose.words.internal.zzZQ2.zz2J;
                break;
            case 20:
                i = com.aspose.words.internal.zzZQ2.zz2w;
                break;
            case 21:
                i = com.aspose.words.internal.zzZQ2.zz2C;
                break;
            case 22:
                i = com.aspose.words.internal.zzZQ2.zz2E;
                break;
            case 23:
                i = com.aspose.words.internal.zzZQ2.zz2D;
                break;
            case 24:
                i = com.aspose.words.internal.zzZQ2.zz2s;
                break;
            case 25:
                i = com.aspose.words.internal.zzZQ2.zz2H;
                break;
            case 26:
                i = com.aspose.words.internal.zzZQ2.zz2G;
                break;
            case 27:
                i = com.aspose.words.internal.zzZQ2.zz2F;
                break;
            default:
                return com.aspose.words.internal.zzPV.zzHZ;
        }
        return com.aspose.words.internal.zzPV.zzYR(i);
    }

    public static zzQC zzSL(String str) {
        int i;
        int i2;
        int i3;
        if (str.length() != 3 && str.length() != 6) {
            return null;
        }
        if (str.length() == 3) {
            i2 = 8;
            i = 17;
        } else {
            i = 1;
            i2 = 4;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt >= '0' && cCharAt <= '9') {
                i3 = cCharAt - '0';
            } else if (cCharAt >= 'A' && cCharAt <= 'F') {
                i3 = cCharAt - '7';
            } else {
                if (cCharAt < 'a' || cCharAt > 'f') {
                    return null;
                }
                i3 = cCharAt - 'W';
            }
            i4 = (i4 << i2) | (i3 * i);
        }
        return new zzQC(new com.aspose.words.internal.zzPV(i4 + ViewCompat.MEASURED_STATE_MASK));
    }

    public static zzQC zzSM(String str) {
        String strZzXl = com.aspose.words.internal.zzZYD.zzXl(str);
        com.aspose.words.internal.zzPV zzpvZz4 = com.aspose.words.internal.zzPH.zz4(strZzXl);
        if (zzpvZz4.isEmpty()) {
            zzpvZz4 = zzSK(strZzXl);
        }
        if (zzpvZz4.isEmpty()) {
            return null;
        }
        return new zzQC(zzpvZz4);
    }

    public static zzQC zzY(zzLG zzlg) {
        double dZzZ = zzZ(zzlg, true);
        if (com.aspose.words.internal.zzAN.zzZC(dZzZ)) {
            return null;
        }
        double dZzZ2 = zzZ(zzlg, false);
        if (com.aspose.words.internal.zzAN.zzZC(dZzZ2)) {
            return null;
        }
        double dZzZ3 = zzZ(zzlg, false);
        if (!com.aspose.words.internal.zzAN.zzZC(dZzZ3) && zzlg.zzZU9().getType() == 19) {
            return new zzQC(zzJ(dZzZ, dZzZ2, dZzZ3));
        }
        return null;
    }

    public static zzQC zzZ(zzLG zzlg) {
        int iZzZG = 0;
        zzLH zzlh = null;
        for (int i = 0; i < 3; i++) {
            if (i > 0 && zzlg.zzZU9().getType() != 17) {
                return null;
            }
            zzLH zzlhZzZU9 = zzlg.zzZU9();
            if ((zzlhZzZU9.getType() != 9 && zzlhZzZU9.getType() != 10) || (zzlh != null && zzlhZzZU9.getType() != zzlh.getType())) {
                return null;
            }
            if (zzlh == null) {
                zzlh = zzlhZzZU9;
            }
            double value = ((zzNI) zzlhZzZU9).getValue();
            if (zzlhZzZU9.getType() == 10) {
                value *= 2.55d;
            }
            iZzZG = (iZzZG << 8) | com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzAN.zzR(value, 0.0d, 255.0d));
        }
        if (zzlg.zzZU9().getType() != 19) {
            return null;
        }
        return new zzQC(new com.aspose.words.internal.zzPV(iZzZG + ViewCompat.MEASURED_STATE_MASK));
    }

    private static double zzZ(zzLG zzlg, boolean z) {
        if (!z && zzlg.zzZU9().getType() != 17) {
            return -1.7976931348623157E308d;
        }
        zzLH zzlhZzZU9 = zzlg.zzZU9();
        if (zzlhZzZU9.getType() != (z ? 9 : 10)) {
            return -1.7976931348623157E308d;
        }
        return ((zzNI) zzlhZzZU9).getValue();
    }
}
