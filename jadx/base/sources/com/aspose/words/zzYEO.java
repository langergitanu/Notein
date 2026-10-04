package com.aspose.words;

import androidx.core.app.FrameMetricsAggregator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEO {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzYNS = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXqR = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXqQ = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXqP = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXqO = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXqN = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXqM = new com.aspose.words.internal.zzZYJ();
    private static int[] zzXqL = {1240, 1250, 1270};

    static {
        zzYNS.zzH("\\ptabldot", 0);
        zzYNS.zzH("\\ptablminus", 1);
        zzYNS.zzH("\\ptablmdot", 2);
        zzYNS.zzH("\\ptablnone", 3);
        zzYNS.zzH("\\ptabluscore", 4);
        zzXqR.zzH("\\nowrap", 1);
        zzXqR.zzH("\\overlay", 3);
        zzXqR.zzH("\\wrapdefault", 0);
        zzXqR.zzH("\\wraparound", 2);
        zzXqR.zzH("\\wraptight", 4);
        zzXqR.zzH("\\wrapthrough", 5);
        zzXqQ.zzH("\\mdeg", 7);
        zzXqQ.zzH("\\mden", 11);
        zzXqQ.zzH("\\me", 8);
        zzXqQ.zzH("\\mlim", 16);
        zzXqQ.zzH("\\mfName", 14);
        zzXqQ.zzH("\\mnum", 12);
        zzXqQ.zzH("\\msub", 24);
        zzXqQ.zzH("\\msup", 25);
        zzXqP.zzH("\\mmmaintypecatalog", 8);
        zzXqP.zzH("\\mmmaintypeenvelopes", 4);
        zzXqP.zzH("\\mmmaintypelabels", 2);
        zzXqP.zzH("\\mmmaintypeletters", 1);
        zzXqP.zzH("\\mmmaintypeemail", 16);
        zzXqP.zzH("\\mmmaintypefax", 32);
        zzXqO.zzH("\\mmdatatypeaccess", 1);
        zzXqO.zzH("\\mmdatatypeexcel", 2);
        zzXqO.zzH("\\mmdatatypeqt", 3);
        zzXqO.zzH("\\mmdatatypeodbc", 4);
        zzXqO.zzH("\\mmdatatypeodso", 5);
        zzXqO.zzH("\\mmdatatypefile", 0);
        zzXqN.zzH("\\mmdestnewdoc", 0);
        zzXqN.zzH("\\mmdestprinter", 1);
        zzXqN.zzH("\\mmdestemail", 2);
        zzXqN.zzH("\\mmdestfax", 4);
        zzXqM.zzH("\\txbxtwno", 0);
        zzXqM.zzH("\\txbxtwalways", 1);
        zzXqM.zzH("\\txbxtwfirstlast", 2);
        zzXqM.zzH("\\txbxtwfirst", 3);
        zzXqM.zzH("\\txbxtwlast", 4);
        zzUR = new com.aspose.words.internal.zzZHW("tabqr", "tabqc", "tabql", "\\pmar", "\\pind", "\\mmfttypenull", "\\mmfttypedbcolumn", "\\mmfttypeaddress", "\\mmfttypesalutation", "\\mmfttypemapped", "\\mmfttypebarcode", "\\tscbandhorzodd", "\\tscbandvertodd", "\\tscbandhorzeven", "\\tscbandverteven", "\\tscfirstcol", "\\tscfirstrow", "\\tsclastcol", "\\tsclastrow", "\\tscnecell", "\\tscnwcell", "\\tscsecell", "\\tscswcell");
    }

    public static int zzBA(String str) {
        return zzXqO.zzG(str, -1);
    }

    public static int zzBB(String str) {
        return zzXqP.zzG(str, 0);
    }

    public static int zzBC(String str) {
        return zzXqR.zzXp(str);
    }

    public static int zzBD(String str) {
        if (str.length() < 5) {
            return 0;
        }
        return zzUR.zzTP(str.substring(0, 5)) != 3 ? 0 : 1;
    }

    public static int zzBE(String str) {
        if (str.length() < 5) {
            return 0;
        }
        int iZzTP = zzUR.zzTP(str.substring(5, str.length()));
        if (iZzTP != 0) {
            return iZzTP != 1 ? 0 : 1;
        }
        return 2;
    }

    public static int zzBF(String str) {
        return zzYNS.zzG(str, 3);
    }

    public static int zzBu(String str) {
        switch (zzUR.zzTP(str)) {
            case 11:
                return 5;
            case 12:
                return 6;
            case 13:
                return 7;
            case 14:
                return 8;
            case 15:
                return 2;
            case 16:
                return 1;
            case 17:
                return 4;
            case 18:
                return 3;
            case 19:
                return 10;
            case 20:
                return 9;
            case 21:
                return 12;
            case 22:
                return 11;
            default:
                return 0;
        }
    }

    public static int zzBv(String str) {
        return zzXqM.zzG(str, 0);
    }

    public static int zzBw(String str) {
        return "top".equals(str) ? 0 : 1;
    }

    public static int zzBx(String str) {
        return zzXqQ.zzG(str, 0);
    }

    public static int zzBy(String str) {
        return zzUR.zzTP(str) != 6 ? 1 : 0;
    }

    public static int zzBz(String str) {
        return zzXqN.zzG(str, 0);
    }

    public static int[] zzF(zzYMX zzymx) {
        return zzZ(zzymx, true);
    }

    public static void zzG(zzYMX zzymx) {
        if (!zzymx.contains(1470)) {
            zzymx.zzQ(1470, Boolean.FALSE);
        }
        zzZ(zzymx, false);
    }

    public static com.aspose.words.internal.zzZQ9 zzM4(int i) {
        if (i == 0) {
            return com.aspose.words.internal.zzZQ9.zz35;
        }
        return com.aspose.words.internal.zzR1.zzX(((i >> 20) & FrameMetricsAggregator.EVERY_DURATION) + 1900, (i >> 16) & 15, (i >> 11) & 31, (i >> 6) & 31, i & 63);
    }

    public static String zzVS(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, "\\p");
        com.aspose.words.internal.zzZNH.zzU(sb, i2 == 0 ? "ind" : "mar");
        if (i == 1) {
            com.aspose.words.internal.zzZNH.zzU(sb, "tabqc");
        } else if (i != 2) {
            com.aspose.words.internal.zzZNH.zzU(sb, "tabql");
        } else {
            com.aspose.words.internal.zzZNH.zzU(sb, "tabqr");
        }
        return sb.toString();
    }

    public static int zzWg(double d) {
        return (int) (d * 2.5483870967741935d);
    }

    public static int zzWh(double d) {
        return com.aspose.words.internal.zzSA.zzr(d / 4.0d);
    }

    public static int zzWi(double d) {
        return (int) (d * 10000.0d);
    }

    public static void zzX(zzYMX zzymx, zzYMX zzymx2) {
        if (zzymx.getListId() <= 0 || zzymx2.contains(EditingLanguage.KASHMIRI_ARABIC)) {
            return;
        }
        zzymx2.zzxC(0);
        zzymx.zzwa(0);
        zzymx.zzwb(0);
    }

    private static int[] zzZ(zzYMX zzymx, boolean z) {
        int[] iArr = new int[zzXqL.length];
        int i = 0;
        while (true) {
            int[] iArr2 = zzXqL;
            if (i >= iArr2.length) {
                return iArr;
            }
            int i2 = iArr2[i];
            if (!zzymx.zzVE(i2)) {
                iArr[i] = i2;
                zzymx.zzQ(i2, Boolean.valueOf(z));
            }
            i++;
        }
    }

    public static double zznA(int i) {
        return ((double) i) / 2.5483870967741935d;
    }

    public static String zznB(int i) {
        return zzYNS.zzO(i, "");
    }

    public static double zznC(int i) {
        return (((double) i) / 20.0d) * 4.0d;
    }

    public static double zznD(int i) {
        return ((double) i) / 10000.0d;
    }

    public static int zznm(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static zzZKP zznn(int i) {
        return i < 0 ? new zzZKP(1, -i) : i > 0 ? new zzZKP(0, i) : new zzZKP(2, 0);
    }

    public static String zzno(int i) {
        return zzXqM.getValue(i);
    }

    public static String zznp(int i) {
        return i == 0 ? "top" : "bot";
    }

    public static String zznq(int i) {
        return i != 0 ? "\\mmfttypenull" : "\\mmfttypedbcolumn";
    }

    public static String zznr(int i) {
        return zzXqN.getValue(i);
    }

    public static String zzns(int i) {
        return zzXqO.getValue(i);
    }

    public static String zznt(int i) {
        return zzXqP.getValue(i);
    }

    public static String zznu(int i) {
        return zzXqR.getValue(i);
    }

    public static boolean zznv(int i) {
        int i2 = i & 255;
        if (i2 == 30 || i2 == 57 || i2 == 87 || i2 == 78 || i2 == 79) {
            return true;
        }
        switch (i2) {
            case 69:
            case 70:
            case 71:
                return true;
            default:
                switch (i2) {
                    case 73:
                    case 74:
                    case 75:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public static boolean zznw(int i) {
        return zznx(i) || com.aspose.words.internal.zzBZ.zzZY(i, 1);
    }

    public static boolean zznx(int i) {
        return com.aspose.words.internal.zzBZ.zzZY(i, 13) || i == 1085;
    }

    public static int zzny(int i) {
        return i - 63;
    }

    public static int zznz(int i) {
        return i + 63;
    }

    public static int zzt(com.aspose.words.internal.zzZQ9 zzzq9) {
        if (zzzq9.getYear() < 1900) {
            return 0;
        }
        return (zzzq9.zzkS() << 29) | zzzq9.getMinute() | (zzzq9.getHour() << 6) | (zzzq9.getDay() << 11) | (zzzq9.getMonth() << 16) | ((zzzq9.getYear() - 1900) << 20);
    }

    public static void zzZ(zzYMX zzymx, int[] iArr) {
        for (int i : iArr) {
            zzymx.remove(i);
        }
    }
}
