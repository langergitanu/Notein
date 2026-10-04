package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes6.dex */
final class zzY23 {
    private static byte[] zzWVG = {31, -117, 8, 0, 0, 0, 0, 0, 2, 11};

    public static String zzO(double d, boolean z) {
        return z ? zzVX(d) : com.aspose.words.internal.zzJB.zzWF(com.aspose.words.internal.zzAN.zzZG(d));
    }

    private static String zzPy(boolean z) {
        return z ? "t" : "f";
    }

    public static String zzQ(com.aspose.words.internal.zzD3<Object> zzd3) {
        StringBuilder sb = new StringBuilder();
        for (int i = 129; i <= 132; i++) {
            Object obj = zzd3.get(i);
            if (obj != null) {
                com.aspose.words.internal.zzZNH.zzU(sb, zzVX(((double) ((Integer) obj).intValue()) / 12700.0d));
            }
            sb.append(',');
        }
        return com.aspose.words.internal.zzZKN.zzT(sb.toString(), ',');
    }

    public static String zzV(Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        return zzO(((Double) obj).doubleValue(), z);
    }

    private static String zzVW(double d) {
        if (d == 0.0d) {
            return "0";
        }
        return com.aspose.words.internal.zzJB.zzZT(d) + "mm";
    }

    private static String zzVX(double d) {
        if (com.aspose.words.internal.zzZKQ.zzS(d, 2) == 0.0d) {
            return "0";
        }
        if (d % 72.0d == 0.0d) {
            return com.aspose.words.internal.zzJB.zzZU(d / 72.0d) + BackupFile.EXTENSION_NOTEIN_FILE;
        }
        return com.aspose.words.internal.zzJB.zzZU(d) + TranslateLanguage.PORTUGUESE;
    }

    public static String zzW(Object obj, boolean z) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue != z) {
            return zzPy(zBooleanValue);
        }
        return null;
    }

    public static String zzX(zzYM2 zzym2) {
        if (!zzym2.zzYnC()) {
            return com.aspose.words.internal.zzJB.zzWF(zzym2.getValue());
        }
        return "@" + com.aspose.words.internal.zzJB.zzWF(zzym2.getValue());
    }

    private static boolean zzXB(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (bArr[i] != zzWVG[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] zzXC(byte[] bArr) throws Exception {
        return zzXB(bArr) ? com.aspose.words.internal.zzZRV.zzZ(new com.aspose.words.internal.zzZOR(bArr, 10, bArr.length - 10), 0, 0) : bArr;
    }

    public static byte[] zzXD(byte[] bArr) throws Exception {
        int i = 0;
        byte[] bArrZzD = com.aspose.words.internal.zzZRV.zzD(bArr, 0);
        int length = bArrZzD.length;
        byte[] bArr2 = zzWVG;
        byte[] bArr3 = new byte[length + bArr2.length];
        System.arraycopy(bArrZzD, 0, bArr3, bArr2.length, bArrZzD.length);
        while (true) {
            byte[] bArr4 = zzWVG;
            if (i >= bArr4.length) {
                return bArr3;
            }
            bArr3[i] = bArr4[i];
            i++;
        }
    }

    public static byte[] zzXE(byte[] bArr) throws Exception {
        byte[] bArrZzXC = zzXC(bArr);
        int length = bArrZzXC.length - 512;
        byte[] bArr2 = new byte[length];
        com.aspose.words.internal.zzZKV.zzZ(bArrZzXC, 512, bArr2, 0, length);
        return bArr2;
    }

    public static byte[] zzXF(byte[] bArr) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzor);
        for (int i = 0; i < 11; i++) {
            zzzow.writeByte((byte) "MSOFFICE9.0".charAt(i));
        }
        zzzow.zzk(bArr.length);
        com.aspose.words.internal.zzEG zzegZzZx = com.aspose.words.internal.zzEF.zzZx(bArr);
        zzzow.zzl(zzegZzZx.getLeft());
        zzzow.zzl(zzegZzZx.getTop());
        zzzow.zzl(zzegZzZx.getRight());
        zzzow.zzl(zzegZzZx.getBottom());
        zzzow.zzl(zzegZzZx.zzDQ());
        zzzow.zzl(zzegZzZx.zzDP());
        zzzow.zzk(0);
        zzzow.zzJ((short) -512);
        for (int i2 = 0; i2 < 467; i2++) {
            zzzow.writeByte((byte) 0);
        }
        zzzow.writeBytes(bArr);
        return zzXD(zzzor.zzWy());
    }

    public static String zzXZ(ShapeBase shapeBase) {
        return com.aspose.words.internal.zzZYD.zzXk(shapeBase.getName()) ? shapeBase.getName() : zzYU3.zzZR(shapeBase);
    }

    public static String zzXc(long j) {
        return com.aspose.words.internal.zzZKN.format("{0},{1}", com.aspose.words.internal.zzJB.zzWF((int) j), com.aspose.words.internal.zzJB.zzWF((int) (j >> 32)));
    }

    public static String zzYL(Object obj) {
        com.aspose.words.internal.zzPV zzpv = (com.aspose.words.internal.zzPV) obj;
        return zzpv.isEmpty() ? "" : com.aspose.words.internal.zzZKN.format("rgb({0},{1},{2})", Integer.valueOf(zzpv.zzPC()), Integer.valueOf(zzpv.zzPB()), Integer.valueOf(zzpv.zzPA()));
    }

    public static String zzYM(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue == 0) {
            return "";
        }
        return com.aspose.words.internal.zzZKN.format(iIntValue > 0 ? "lighten({0})" : "darken({0})", Integer.valueOf(Math.abs(iIntValue)));
    }

    public static String zzYN(Object obj) {
        if (obj == null) {
            return null;
        }
        return zzPy(((Boolean) obj).booleanValue());
    }

    public static String zzYO(Object obj) {
        if (obj == null) {
            return null;
        }
        return zzZ1(((Integer) obj).intValue(), true);
    }

    public static String zzZ(zzZLE[] zzzleArr, zzZ8U zzz8u) {
        StringBuilder sb = new StringBuilder();
        for (zzZLE zzzle : zzzleArr) {
            int i = zzzle.zzZfb;
            com.aspose.words.internal.zzPV zzpv = zzzle.zzYuy;
            if (i == 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format("{0} {1};", 0, zzz8u.zzf(zzpv)));
            } else if (i == zzzleArr.length - 1) {
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format("{0} {1};", 1, zzz8u.zzf(zzpv)));
            } else {
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format("{0} {1};", zzZ1(i, true), zzz8u.zzf(zzpv)));
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    public static boolean zzZ0(int i, boolean z) {
        if (i != 0) {
            switch (i) {
                default:
                    switch (i) {
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                        case 140:
                        case 141:
                        case 142:
                        case 143:
                        case 144:
                        case 145:
                        case 146:
                        case 147:
                        case 148:
                        case 149:
                        case 150:
                        case 151:
                        case 152:
                        case 153:
                        case 154:
                        case 155:
                        case 156:
                        case 157:
                        case 158:
                        case 159:
                        case 160:
                        case 161:
                        case 162:
                        case 163:
                        case 164:
                        case 165:
                        case 166:
                        case 167:
                        case 168:
                        case 169:
                        case 170:
                        case 171:
                        case 172:
                        case 173:
                        case 174:
                        case 175:
                            break;
                        default:
                            return false;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    return z;
            }
        }
        return z;
    }

    public static String zzZ1(int i, boolean z) {
        if (i == 0) {
            return "0";
        }
        if (i % 16384 == 0) {
            return com.aspose.words.internal.zzJB.zzZU(((double) i) / 65536.0d);
        }
        if (!z) {
            return Integer.toString(i);
        }
        return Integer.toString(i) + "f";
    }

    public static String zzic(int i) {
        return com.aspose.words.internal.zzJB.zzZX(((double) i) / 1.6777216E7d);
    }

    public static String zzid(int i) {
        if (i == 0) {
            return "0";
        }
        return com.aspose.words.internal.zzJB.zzWF(i) + "%";
    }

    public static String zzie(int i) {
        double d = ((double) i) / 65536.0d;
        if (d == com.aspose.words.internal.zzZKQ.zzZa(d)) {
            return com.aspose.words.internal.zzJB.zzWF((int) d);
        }
        return com.aspose.words.internal.zzJB.zzWF(i) + "fd";
    }

    public static String zzif(int i) {
        return zzZ1(i, true);
    }

    public static String zzig(int i) {
        return zzVW(((double) i) / 36000.00000000001d);
    }

    public static String zzih(int i) {
        return zzVX(((double) i) / 12700.0d);
    }

    public static int zzyW(String str) {
        return new com.aspose.words.internal.zzS3().zzG(com.aspose.words.internal.zzZO0.zzhU().getBytes(com.aspose.words.internal.zzZKN.zzS(str, '#')));
    }

    public static int zzyX(String str) {
        return com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzJB.parseDouble(str) * 1.6777216E7d);
    }

    public static int[] zzyY(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ',');
        int[] iArr = new int[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            iArr[i] = (int) com.aspose.words.internal.zzZKQ.zzZa(com.aspose.words.internal.zzJB.parseDouble(strArrZzR[i]));
        }
        return iArr;
    }

    public static String zzW(double d, double d2, boolean z) {
        return com.aspose.words.internal.zzZKN.format("{0},{1}", zzO(d, z), zzO(d2, z));
    }

    public static double[] zzX(ShapeBase shapeBase, double d, double d2, double d3, double d4) {
        zzYM5[] zzym5Arr = (zzYM5[]) shapeBase.fetchShapeAttr(StyleIdentifier.LIST_TABLE_4);
        if (zzym5Arr != null && zzym5Arr.length >= 2) {
            double d5 = zzym5Arr[0].zzYnG().getValue() > 0 ? d2 + d3 : d2;
            double d6 = zzym5Arr[0].zzYnF().getValue() > 0 ? d + d4 : d;
            double d7 = zzym5Arr[1].zzYnG().getValue() > 0 ? d2 + d3 : d2;
            if (zzym5Arr[1].zzYnF().getValue() > 0) {
                d += d4;
            }
            return new double[]{d5, d6, d7, d};
        }
        return new double[0];
    }

    public static String zzZ(Border border, zzZ8U zzz8u) {
        if (border != null && border.isVisible()) {
            return zzz8u.zzf(border.zz8Q());
        }
        return "";
    }

    public static String zzZ(zzYM5[] zzym5Arr, char c, char c2) {
        StringBuilder sb = new StringBuilder();
        for (zzYM5 zzym5 : zzym5Arr) {
            com.aspose.words.internal.zzZNH.zzU(sb, zzX(zzym5.zzYnG()));
            sb.append(c);
            com.aspose.words.internal.zzZNH.zzU(sb, zzX(zzym5.zzYnF()));
            sb.append(c2);
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
