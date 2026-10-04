package com.aspose.words;

import com.orion.notein.domain.models.transactions.TransactionsConstants;

/* JADX INFO: loaded from: classes6.dex */
final class zzY35 {
    private static com.aspose.words.internal.zzZNR zzWZC = new com.aspose.words.internal.zzZNR("^((([a-z]+) ([a-z]+)\\((\\d+)\\))|([0-9a-f]{6})|(([a-z]+).*)|(#([0-9a-f]{6}).*)|(#([0-9a-f]{3}).*)|(#[0-9a-f]))$", 66);
    private static com.aspose.words.internal.zzZNR zzWZB = new com.aspose.words.internal.zzZNR("(rgb\\(|,)(\\b[\\d]+)", 66);
    private static com.aspose.words.internal.zzZNR zzWZA = new com.aspose.words.internal.zzZNR("(darken\\(|lighten\\()(\\b[\\d]+)", 66);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("fill", "lineOrFill", "line", "shadow", "darken", "lighten", "add");

    public static String zzZ(com.aspose.words.internal.zzPV zzpv, boolean z, boolean z2) {
        if (zzpv.isEmpty()) {
            return "this";
        }
        if (zzpv.zzPD() != 239) {
            String strZzZF = zzY34.zzZF(zzpv);
            if (!"".equals(strZzZF)) {
                return strZzZF;
            }
            if (z && zzpv.zzPD() == 255 && zzjb(zzpv.zzPC()) && zzjb(zzpv.zzPB()) && zzjb(zzpv.zzPA())) {
                return com.aspose.words.internal.zzZKN.format("#{0}{1}{2}", com.aspose.words.internal.zzJB.zzWx(zzpv.zzPC() % 16), com.aspose.words.internal.zzJB.zzWx(zzpv.zzPB() % 16), com.aspose.words.internal.zzJB.zzWx(zzpv.zzPA() % 16));
            }
            String str = com.aspose.words.internal.zzZKN.format("#{0}{1}{2}", com.aspose.words.internal.zzJB.zzWv(zzpv.zzPC()), com.aspose.words.internal.zzJB.zzWv(zzpv.zzPB()), com.aspose.words.internal.zzJB.zzWv(zzpv.zzPA()));
            return z2 ? str.toUpperCase() : str;
        }
        StringBuilder sb = new StringBuilder();
        if (zzpv.zzPC() >= 240) {
            switch (zzpv.zzPC()) {
                case 240:
                    com.aspose.words.internal.zzZNH.zzU(sb, "fill ");
                    break;
                case 241:
                    com.aspose.words.internal.zzZNH.zzU(sb, "lineOrFill ");
                    break;
                case 242:
                    com.aspose.words.internal.zzZNH.zzU(sb, "line ");
                    break;
                case 243:
                    com.aspose.words.internal.zzZNH.zzU(sb, "shadow ");
                    break;
                default:
                    return null;
            }
            int iZzPB = zzpv.zzPB();
            if (iZzPB == 1) {
                com.aspose.words.internal.zzZNH.zzU(sb, "darken");
            } else if (iZzPB == 2) {
                com.aspose.words.internal.zzZNH.zzU(sb, "lighten");
            } else {
                if (iZzPB != 3) {
                    return null;
                }
                com.aspose.words.internal.zzZNH.zzU(sb, "add");
            }
            com.aspose.words.internal.zzZNH.zzZ(sb, "({0})", Integer.valueOf(zzpv.zzPA()));
        } else {
            if (zzpv.zzPC() != 17) {
                return null;
            }
            com.aspose.words.internal.zzZNH.zzU(sb, "window");
        }
        return sb.toString();
    }

    public static String zzf(com.aspose.words.internal.zzPV zzpv) {
        return zzZ(zzpv, true, false);
    }

    private static boolean zzjb(int i) {
        return i / 16 == i % 16;
    }

    private static String zzzV(String str) {
        return com.aspose.words.internal.zzZKN.format("Unknown color type encountered during WordML import - {0}.", str);
    }

    public static int zzzW(String str) {
        com.aspose.words.internal.zzZNT zzzntZzUX = zzWZA.zzUX(str);
        String strOooO00o = OooO0O0.OooO00o(zzzntZzUX, 1);
        int i = com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(strOooO00o, "lighten", i)) {
            return Integer.parseInt(zzzntZzUX.zzhJ().zzQx(2).getValue());
        }
        if (com.aspose.words.internal.zzZKN.zzS(zzzntZzUX.zzhJ().zzQx(1).getValue(), "darken", i)) {
            return -Integer.parseInt(zzzntZzUX.zzhJ().zzQx(2).getValue());
        }
        return 0;
    }

    public static com.aspose.words.internal.zzPV zzzX(String str) {
        com.aspose.words.internal.zzZNS zzznsZzUW = zzWZB.zzUW(str);
        if (zzznsZzUW.getCount() == 3 && zzznsZzUW.zzQw(0).zzhJ().zzQx(1).getValue().contains("rgb")) {
            return com.aspose.words.internal.zzPV.zzS(Integer.parseInt(zzznsZzUW.zzQw(0).zzhJ().zzQx(2).getValue()), Integer.parseInt(zzznsZzUW.zzQw(1).zzhJ().zzQx(2).getValue()), Integer.parseInt(zzznsZzUW.zzQw(2).zzhJ().zzQx(2).getValue()));
        }
        return null;
    }

    public static com.aspose.words.internal.zzPV zzzY(String str) {
        int i;
        com.aspose.words.internal.zzZNT zzzntZzUX = zzWZC.zzUX(str);
        int i2 = 2;
        String strOooO00o = OooO0O0.OooO00o(zzzntZzUX, 2);
        String strOooO00o2 = OooO0O0.OooO00o(zzzntZzUX, 8);
        String strOooO00o3 = OooO0O0.OooO00o(zzzntZzUX, 6);
        String strOooO00o4 = OooO0O0.OooO00o(zzzntZzUX, 10);
        String strOooO00o5 = OooO0O0.OooO00o(zzzntZzUX, 12);
        String strOooO00o6 = OooO0O0.OooO00o(zzzntZzUX, 13);
        if (com.aspose.words.internal.zzZYD.zzXk(strOooO00o)) {
            com.aspose.words.internal.zzZHW zzzhw = zzUR;
            int iZzTP = zzzhw.zzTP(zzzntZzUX.zzhJ().zzQx(3).getValue());
            if (iZzTP == 0) {
                i = 240;
            } else if (iZzTP == 1) {
                i = 241;
            } else if (iZzTP == 2) {
                i = 242;
            } else {
                if (iZzTP != 3) {
                    throw new IllegalStateException(zzzV(str));
                }
                i = 243;
            }
            int iZzTP2 = zzzhw.zzTP(zzzntZzUX.zzhJ().zzQx(4).getValue());
            if (iZzTP2 == 4) {
                i2 = 1;
            } else if (iZzTP2 != 5) {
                if (iZzTP2 != 6) {
                    throw new IllegalStateException(zzzV(str));
                }
                i2 = 3;
            }
            return new com.aspose.words.internal.zzPV(239, i, i2, com.aspose.words.internal.zzJB.parseInt(zzzntZzUX.zzhJ().zzQx(5).getValue()));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strOooO00o2)) {
            return "window".equals(strOooO00o2) ? com.aspose.words.internal.zzPV.zzI1 : "windowText".equals(strOooO00o2) ? com.aspose.words.internal.zzPV.zzKa : "this".equals(strOooO00o2) ? com.aspose.words.internal.zzPV.zzHZ : zzY34.zzzU(strOooO00o2);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strOooO00o3)) {
            return zzYU3.zzGR(strOooO00o3);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strOooO00o4)) {
            return zzYU3.zzGR(strOooO00o4);
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(strOooO00o5)) {
            if (!com.aspose.words.internal.zzZYD.zzXk(strOooO00o6)) {
                throw new IllegalStateException(zzzV(str));
            }
            StringBuilder sb = new StringBuilder(6);
            com.aspose.words.internal.zzZNH.zzU(sb, TransactionsConstants.API_RESULT_SUCCESS);
            sb.append(strOooO00o6.charAt(1));
            sb.append(strOooO00o6.charAt(1));
            return zzYU3.zzGR(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(6);
        for (int i3 = 0; i3 < strOooO00o5.length(); i3++) {
            char cCharAt = strOooO00o5.charAt(i3);
            sb2.append(cCharAt);
            sb2.append(cCharAt);
        }
        return zzYU3.zzGR(sb2.toString());
    }
}
