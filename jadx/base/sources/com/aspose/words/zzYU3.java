package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzYU3 {
    private static char[] zzXSm = {'#'};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("top", "bottom", "left", "start", "right", "end", "tl2br", "tr2bl", "insideH", "insideV");

    public static String zz7(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzWF(i));
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static int zzGL(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
                return 3110;
            case 1:
                return 3130;
            case 2:
            case 3:
                return 3120;
            case 4:
            case 5:
                return 3140;
            case 6:
                return 3150;
            case 7:
                return 3160;
            case 8:
                return 3200;
            case 9:
                return 3210;
            default:
                throw new IllegalStateException("Invalid border name.");
        }
    }

    public static boolean zzGM(String str) {
        return "on".equals(str) || "1".equals(str) || TelemetryEventStrings.Value.TRUE.equals(str) || "t".equals(str) || "off".equals(str) || "0".equals(str) || TelemetryEventStrings.Value.FALSE.equals(str) || "f".equals(str);
    }

    public static int zzGN(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return Integer.MIN_VALUE;
        }
        int length = str.length() - 1;
        while (length >= 0 && ((str.charAt(length) >= '0' && str.charAt(length) <= '9') || str.charAt(length) == '.')) {
            length--;
        }
        return com.aspose.words.internal.zzJB.zzZk(str.substring(length + 1));
    }

    public static int zzGO(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return 0;
        }
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, FilenameUtils.EXTENSION_SEPARATOR);
        return (com.aspose.words.internal.zzJB.zzZv(strArrZzR[0]) << 16) | (strArrZzR.length > 1 ? com.aspose.words.internal.zzJB.zzZv(strArrZzR[1]) : 0);
    }

    private static boolean zzGP(String str) {
        if (str.length() != 6) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!com.aspose.words.internal.zzZYD.isHexDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static com.aspose.words.internal.zzPV zzGQ(String str) {
        int iZzZe = com.aspose.words.internal.zzJB.zzZe(str);
        return new com.aspose.words.internal.zzPV((16711680 & iZzZe) >> 16, (65280 & iZzZe) >> 8, iZzZe & 255);
    }

    public static com.aspose.words.internal.zzPV zzGR(String str) {
        String lowerCase = str.toLowerCase();
        if ("auto".equals(lowerCase)) {
            return com.aspose.words.internal.zzPV.zzHZ;
        }
        String strZzV = com.aspose.words.internal.zzZKN.zzV(lowerCase, zzXSm);
        return zzGP(strZzV) ? zzGQ(strZzV) : com.aspose.words.internal.zzPH.zz4(strZzV);
    }

    public static byte[] zzGS(String str) {
        byte[] bArrZzXb = com.aspose.words.internal.zzZYD.zzXb(str);
        if (bArrZzXb.length == 10) {
            return bArrZzXb;
        }
        byte[] bArr = new byte[10];
        System.arraycopy(bArrZzXb, 0, bArr, 0, Math.min(10, bArrZzXb.length));
        return bArr;
    }

    public static int zzGT(String str) {
        if (str.length() > 8) {
            str = str.substring(str.length() - 8);
        }
        return com.aspose.words.internal.zzJB.zzZe(str);
    }

    public static int zzGU(String str) {
        return com.aspose.words.internal.zzJB.zzZe(str);
    }

    public static int zzGV(String str) {
        return com.aspose.words.internal.zzJB.zzZc(str);
    }

    public static String zzGW(String str) {
        for (int i = 0; i < 9; i++) {
            str = str.replace(Character.toString((char) i), zzsW(i));
        }
        return str;
    }

    public static double zzV(double d, int i, int i2) {
        return i != i2 ? (d / zzsT(i)) * zzsT(i2) : d;
    }

    public static void zzX(String str, byte[] bArr, int i) {
        int length = ((str.length() / 2) + i) - 1;
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = i2 + 2;
            bArr[length] = (byte) com.aspose.words.internal.zzJB.zzZe(str.substring(i2, i3));
            length--;
            i2 = i3;
        }
    }

    public static String zzXZ(byte[] bArr) {
        return com.aspose.words.internal.zzYV.zzZ(bArr, IOUtils.LINE_SEPARATOR_UNIX);
    }

    public static String zzZ(zzYTV zzytv) {
        char cCharAt;
        String numberFormat = zzytv.getNumberFormat();
        int[] iArrZzYyn = zzytv.zzYyn();
        int[] iArrZzYyo = zzytv.zzYyo();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < numberFormat.length()) {
            int i3 = i + 1;
            com.aspose.words.internal.zzZNH.zzU(sb, zzsW(numberFormat.charAt(i)));
            com.aspose.words.internal.zzZNH.zzU(sb, C18241k5.f55433h);
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzWF(iArrZzYyn[i2]));
            com.aspose.words.internal.zzZNH.zzU(sb, C18241k5.f55433h);
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzWF(iArrZzYyo[i2]));
            com.aspose.words.internal.zzZNH.zzU(sb, C18241k5.f55433h);
            if (i3 >= numberFormat.length() || (cCharAt = numberFormat.charAt(i3)) <= '\b') {
                i = i3;
            } else {
                sb.append(cCharAt);
                i += 2;
            }
            i2++;
        }
        return sb.toString();
    }

    public static String zzZR(ShapeBase shapeBase) {
        return com.aspose.words.internal.zzZKN.format("_x0000_{0}{1}", shapeBase.isInline() ? ContextChain.TAG_INFRA : "s", com.aspose.words.internal.zzJB.zz4(shapeBase.getId()));
    }

    public static String zzZS(com.aspose.words.internal.zzPV zzpv) {
        return zzpv.isEmpty() ? "auto" : com.aspose.words.internal.zzJB.zzWs(zzpv.toArgb()).substring(2);
    }

    public static String zzZl(Object obj) {
        if (obj instanceof Integer) {
            return com.aspose.words.internal.zzJB.zzWs(((Integer) obj).intValue());
        }
        return null;
    }

    public static String zzn(byte[] bArr, int i) {
        return com.aspose.words.internal.zzZYD.zzZ(bArr, i, 4, true);
    }

    private static double zzsT(int i) {
        switch (i) {
            case 1:
                return 0.08333333333333333d;
            case 2:
                return 1.0d;
            case 3:
                return 0.013888888888888888d;
            case 4:
                return 0.35277777777777775d;
            case 5:
                return 0.035277777777777776d;
            case 6:
                return 2.0d;
            case 7:
                return 20.0d;
            case 8:
                return 100.0d;
            case 9:
                return 12700.0d;
            default:
                throw new IllegalStateException("Unsupported units.");
        }
    }

    public static String zzsU(int i) {
        return com.aspose.words.internal.zzZKN.format("{0}.{1}", com.aspose.words.internal.zzJB.zzWF(i >> 16), com.aspose.words.internal.zzJB.zz4(i % 65536));
    }

    public static String zzsV(int i) {
        return com.aspose.words.internal.zzJB.zzWs(i);
    }

    private static String zzsW(int i) {
        return com.aspose.words.internal.zzZKN.format("%{0}", Integer.valueOf(i + 1));
    }

    public static void zzZ(zzYEF zzyef, int i, String str, boolean z) {
        zzU1 zzu1ZzSP;
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            if (z) {
                zzu1ZzSP = zzU1.zzMW(zzYUQ.zzHq(str));
            } else {
                zzu1ZzSP = zzU1.zzSP(str);
            }
            if (z && !zzu1ZzSP.zzZYI()) {
                zzu1ZzSP = (zzU1) zzyef.zzPi(i);
            }
            zzyef.zzQ(i, zzu1ZzSP);
        }
    }
}
