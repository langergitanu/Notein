package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYQ {
    private static com.aspose.words.internal.zzZNR zzXYw = new com.aspose.words.internal.zzZNR("\\r?\\n\\r?\\n|$", 0);
    private static com.aspose.words.internal.zzZNR zzXYv = new com.aspose.words.internal.zzZNR("\\r?\\n(?=\\S)", 0);
    private static com.aspose.words.internal.zzZNR zzXYu = new com.aspose.words.internal.zzZNR("\\s*:\\s*", 0);
    private static com.aspose.words.internal.zzZNR zzXYt = new com.aspose.words.internal.zzZNR("\\r?\\n[ \\t]", 0);
    private static com.aspose.words.internal.zzZNR zzXYs = new com.aspose.words.internal.zzZNR("\\s+[/\\\\]\\s*|[/\\\\]\\s+", 0);
    private static com.aspose.words.internal.zzZNR zzXYr = new com.aspose.words.internal.zzZNR("\\A([^\\s;]+)\\s*;?\\s*", 0);
    private static com.aspose.words.internal.zzZNR zzXYq = new com.aspose.words.internal.zzZNR("([^\\s=]+)\\s*=\\s*(?:\"([^\"]+)\\s*|(?:(?:[^\"\\s]*\\s*\")([^\"]*)\"|([^\"\\s;]+)))\"?\\s*;?\\s*");
    private static com.aspose.words.internal.zzZNR zzXYp = new com.aspose.words.internal.zzZNR("\\s*=\\?([^\\s\\(\\)<>@,;:\"/\\[\\]\\?\\.=]+)\\?([QqBb])\\?([^\\s\\?]*)\\?=\\s*", 0);
    private static com.aspose.words.internal.zzZNR zzXYo = new com.aspose.words.internal.zzZNR("=([0-9A-F]{2})", 0);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("content-type", "content-transfer-encoding", "content-id", "content-location", "content-disposition", "boundary", "charset", C18437z2.f56754h, "name", "start", "related", "alternative", "signed", "attachment", "filename");

    private static String zzHQ(String str) throws Exception {
        String strZzZS = zzXYs.zzZS(str, "/");
        com.aspose.words.internal.zzZNT zzzntZzUX = zzXYp.zzUX(strZzZS);
        if (!zzzntZzUX.zzhL()) {
            return zzXYo.zzZS(strZzZS, "%$1");
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        do {
            sb.append((CharSequence) strZzZS, index, (zzzntZzUX.getIndex() - index) + index);
            boolean z = true;
            String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(zzzntZzUX.zzhJ().zzQx(1).getValue());
            String strOooO00o = OooO0O0.OooO00o(zzzntZzUX, 2);
            if (!"B".equals(strOooO00o) && !"b".equals(strOooO00o)) {
                z = false;
            }
            com.aspose.words.internal.zzZNH.zzU(sb, zzL(OooO0O0.OooO00o(zzzntZzUX, 3), strZzU2, z));
            index = zzzntZzUX.getIndex() + zzzntZzUX.getLength();
            zzzntZzUX = zzXYp.zzt(strZzZS, index);
        } while (zzzntZzUX.zzhL());
        sb.append((CharSequence) strZzZS, index, (strZzZS.length() - index) + index);
        return sb.toString();
    }

    private static int zzHR(String str) {
        if (!com.aspose.words.internal.zzZKN.zzS(str, "multipart/", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return 0;
        }
        switch (zzUR.zzTP(str.substring(10))) {
            case 10:
                return 1;
            case 11:
                return 2;
            case 12:
                return 4;
            default:
                return 3;
        }
    }

    private static String zzHS(String str) {
        return !com.aspose.words.internal.zzZYD.zzXk(str) ? "" : (str.charAt(0) == '<' && androidx.core.content.OooO0O0.OooO00o(1, str) == '>') ? androidx.core.content.OooO0OO.OooO00o(1, 1, str) : com.aspose.words.internal.zzZKN.zzTX(str);
    }

    private static String zzL(String str, String str2, boolean z) throws Exception {
        com.aspose.words.internal.zzZO0 zzzo0ZzI4 = zzYYS.zzI4(str2);
        if (zzzo0ZzI4 == null) {
            return "";
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        if (z) {
            zzYYS.zzY(zzzor, str, 0, str.length());
        } else {
            zzYYS.zzZ(zzzor, str, 0, str.length());
        }
        zzzor.zzH(0L);
        return new com.aspose.words.internal.zzZOO(zzzor, zzzo0ZzI4).zziv();
    }

    private static String zzW(com.aspose.words.internal.zzZNT zzznt) {
        int[] iArr = {2, 3, 4};
        for (int i = 0; i < 3; i++) {
            com.aspose.words.internal.zzZNV zzznvZzQx = zzznt.zzhJ().zzQx(iArr[i]);
            if (zzznvZzQx.zzhL()) {
                return zzznvZzQx.getValue();
            }
        }
        throw new zzYYP("Malformed MIME heading value.");
    }

    public static zzYYR zzX(String str, int i, int i2, boolean z) throws Exception {
        String message;
        boolean z2;
        boolean z3 = false;
        if (i2 == 0 || (i < str.length() && (str.charAt(i) == '\r' || str.charAt(i) == '\n'))) {
            zzYYR zzyyr = new zzYYR(0);
            zzyyr.zzSM(true);
            return zzyyr;
        }
        com.aspose.words.internal.zzZNT zzzntZzU = zzXYw.zzU(str, i, i2);
        int length = (zzzntZzU.getLength() + zzzntZzU.getIndex()) - i;
        zzYYR zzyyr2 = new zzYYR(length);
        String[] strArrSplit = zzXYv.split(com.aspose.words.internal.zzZKN.zzTX(str.substring(i, length + i)));
        int length2 = strArrSplit.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            message = "";
            if (i3 >= length2) {
                z2 = true;
                break;
            }
            String[] strArrSplit2 = zzXYu.split(strArrSplit[i3], 2);
            if (strArrSplit2.length != 1) {
                if (strArrSplit2.length < 2) {
                    break;
                }
                try {
                    if (zzZ(strArrSplit2[0], strArrSplit2[1], zzyyr2)) {
                        i4++;
                    }
                } catch (zzYYP e) {
                    message = e.getMessage();
                }
            }
            i3++;
        }
        z2 = false;
        if (!z2 && z) {
            throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unexpected format of MIME heading. ", message));
        }
        if (z2 && i4 > 0) {
            z3 = true;
        }
        zzyyr2.zzSM(z3);
        return zzyyr2;
    }

    private static void zzY(String str, zzYYR zzyyr) throws Exception {
        com.aspose.words.internal.zzZNT zzzntZzUX = zzXYr.zzUX(str);
        if (zzzntZzUX.zzhL()) {
            if (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzntZzUX.zzhJ().zzQx(1).getValue())) != 13) {
                zzyyr.zzHU("inline");
            } else {
                zzyyr.zzHU("attachment");
            }
            int length = zzzntZzUX.getLength();
            com.aspose.words.internal.zzZNT zzzntZzt = zzXYq.zzt(str, length);
            while (zzzntZzt.zzhL()) {
                if (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzntZzt.zzhJ().zzQx(1).getValue())) == 14) {
                    zzyyr.zzHV(zzHQ(zzW(zzzntZzt)));
                }
                length += zzzntZzt.getLength();
                zzzntZzt = zzXYq.zzt(str, length);
            }
        }
    }

    private static boolean zzZ(String str, String str2, zzYYR zzyyr) throws Exception {
        String strZzZS = zzXYt.zzZS(str2, " ");
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 0) {
            zzZ(strZzZS, zzyyr);
            return true;
        }
        if (iZzTP == 1) {
            zzyyr.zzHZ(com.aspose.words.internal.zzZKN.zzU2(strZzZS));
            return true;
        }
        if (iZzTP == 2) {
            zzyyr.zzHY(zzHS(strZzZS));
            return true;
        }
        if (iZzTP != 3) {
            if (iZzTP != 4) {
                return false;
            }
            zzY(strZzZS, zzyyr);
            zzyyr.zzYD5();
            return true;
        }
        if (strZzZS.length() > 1 && strZzZS.charAt(0) == '\"' && androidx.core.content.OooO0O0.OooO00o(1, strZzZS) == '\"') {
            strZzZS = androidx.core.content.OooO0OO.OooO00o(1, 1, strZzZS);
        }
        zzyyr.zzHX(zzHQ(strZzZS));
        zzyyr.zzHW(strZzZS);
        return true;
    }

    private static void zzZ(String str, zzYYR zzyyr) {
        com.aspose.words.internal.zzZNT zzzntZzUX = zzXYr.zzUX(str);
        if (zzzntZzUX.zzhL()) {
            zzyyr.setContentType(com.aspose.words.internal.zzZKN.zzU2(zzzntZzUX.zzhJ().zzQx(1).getValue()));
            zzyyr.zzub(zzHR(zzyyr.getContentType()));
            int length = zzzntZzUX.getLength();
            com.aspose.words.internal.zzZNT zzzntZzt = zzXYq.zzt(str, length);
            while (zzzntZzt.zzhL()) {
                switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzntZzt.zzhJ().zzQx(1).getValue()))) {
                    case 5:
                        zzyyr.zzI3(zzW(zzzntZzt));
                        break;
                    case 6:
                        zzyyr.zzI2(com.aspose.words.internal.zzZKN.zzU2(zzW(zzzntZzt)));
                        break;
                    case 7:
                        zzyyr.zzI1(com.aspose.words.internal.zzZKN.zzU2(zzW(zzzntZzt)));
                        break;
                    case 8:
                        zzyyr.zzI0(com.aspose.words.internal.zzZKN.zzU2(zzW(zzzntZzt)));
                        break;
                    case 9:
                        zzyyr.zzHT(zzHS(com.aspose.words.internal.zzZKN.zzU2(zzW(zzzntZzt))));
                        break;
                }
                length += zzzntZzt.getLength();
                zzzntZzt = zzXYq.zzt(str, length);
            }
            if (zzyyr.zzYDg().length() == 0 && zzyyr.zzYDh() != 0) {
                throw new zzYYP("Boundary is missing in MIME heading with multipart Content-Type.");
            }
            return;
        }
        throw new zzYYP("Bad Content-Type declaration.");
    }
}
