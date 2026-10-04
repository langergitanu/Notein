package com.aspose.words;

import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz7G extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("custGeom", "prstGeom", "pathLst", "avLst", "gdLst", DrawToolFactory.LASSO_TYPE_RECT, "ahLst", "cxnLst", "cxn", "pos", "x", "y", "l", "t", "r", "b", "gd", "path", "ahPolar", "ahXY");
    private com.aspose.words.internal.zzIM<String> zzZ3z = new com.aspose.words.internal.zzIM<>();
    private zzYO3 zzZ88;
    private zzYU4 zzZ89;

    private zz7G(zzYU4 zzyu4, zzYO3 zzyo3) {
        this.zzZ89 = zzyu4;
        this.zzZ88 = zzyo3;
    }

    private boolean zzB(String str, boolean z) {
        boolean zZzXk = com.aspose.words.internal.zzZYD.zzXk(str);
        if (!zZzXk && z) {
            zzY1Z.zzZ(this.zzZ89.getWarningCallback(), 16777216, 2, "Node is unable to accept markup, markup ignored.");
            this.zzZ89.zzYyH();
        }
        return zZzXk;
    }

    public static zz7H zzOA(String str) {
        String str2;
        String strZzJC = new zzYKX().zzJC(str);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzJC)) {
            return null;
        }
        if (DrawToolFactory.LASSO_TYPE_RECT.equals(str)) {
            strZzJC = "<rect1" + strZzJC.substring(5, strZzJC.length() - 5) + "rect1>";
            str2 = "rect1";
        } else {
            str2 = str;
        }
        zz7G zz7g = new zz7G(new zzYU4(strZzJC, null), null);
        zz7H zz7h = new zz7H();
        zz7h.zzOB(str);
        zz7g.zzZ(str2, true, zz7h);
        return zz7h;
    }

    private void zzOz(String str) {
        if (this.zzZ88 == null || !zzYU4.zzGY(str)) {
            return;
        }
        this.zzZ88.zzYrc();
    }

    public static zz7H zzS(zzYU4 zzyu4, zzYO3 zzyo3) {
        return new zz7G(zzyu4, zzyo3).zzZAI();
    }

    private void zzU(zz7H zz7h) {
        while (this.zzZ89.zzQ("ahLst")) {
            int iZzTP = zzUR.zzTP(this.zzZ89.getLocalName());
            if (iZzTP == 18) {
                zzJL zzjl = new zzJL();
                zzjl.zzRL(this.zzZ89.zzV("gdRefAng", ""));
                zzjl.zzRK(this.zzZ89.zzV("gdRefR", ""));
                zz7h.zzZAM().add(zzjl);
            } else if (iZzTP != 19) {
                zz39.zzK(this.zzZ89);
            } else {
                zzJK zzjk = new zzJK();
                zzjk.zzRJ(this.zzZ89.zzV("gdRefX", ""));
                zzjk.zzRI(this.zzZ89.zzV("gdRefY", ""));
                zz7h.zzZAM().add(zzjk);
            }
        }
    }

    private void zzV(zz7H zz7h) {
        while (this.zzZ89.zzQ("pathLst")) {
            if (zzUR.zzTP(this.zzZ89.getLocalName()) != 17) {
                zz39.zzK(this.zzZ89);
            } else {
                zz7h.zzZ(zz43.zzR(this.zzZ89, this.zzZ88));
            }
        }
    }

    private void zzW(zz7H zz7h) {
        if (zz7h.zzZAJ().size() == 0) {
            return;
        }
        ArrayList<zzBG> arrayList = new ArrayList<>();
        for (zzBG zzbg : zz7h.zzZAJ()) {
            String string = zzbg.zzZFc().getString();
            zzJH zzjhZzZFb = zzbg.zzZFb();
            String string2 = zzjhZzZFb.zzZSp().getString();
            String string3 = zzjhZzZFb.zzZSo().getString();
            double dZzZs = com.aspose.words.internal.zzJB.zzZs(string2);
            double dZzZs2 = com.aspose.words.internal.zzJB.zzZs(string3);
            double dZzZs3 = com.aspose.words.internal.zzJB.zzZs(string);
            if ((!Double.isNaN(dZzZs) || this.zzZ3z.contains(string2)) && ((!Double.isNaN(dZzZs2) || this.zzZ3z.contains(string3)) && (!Double.isNaN(dZzZs3) || this.zzZ3z.contains(string)))) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzbg);
            } else {
                zzY1Z.zzZ(this.zzZ89.getWarningCallback(), 16777216, 2, "Node is unable to accept markup, markup ignored.");
            }
        }
        zz7h.zz3(arrayList);
    }

    private void zzX(zz7H zz7h) {
        String strZzV = this.zzZ89.zzV("ang", "");
        if (zzB(strZzV, true)) {
            zzBG zzbg = new zzBG(strZzV);
            while (this.zzZ89.zzQ("cxn")) {
                if (zzUR.zzTP(this.zzZ89.getLocalName()) != 9) {
                    zz39.zzK(this.zzZ89);
                } else {
                    zzZ(zzbg);
                }
            }
            if (zzbg.zzZFb() == null) {
                zzY1Z.zzZ(this.zzZ89.getWarningCallback(), 16777216, 2, "Node is unable to accept markup, markup ignored.");
            } else {
                zz7h.zzZAJ().add(zzbg);
            }
        }
    }

    private void zzY(zz7H zz7h) {
        while (this.zzZ89.zzQ("cxnLst")) {
            if (zzUR.zzTP(this.zzZ89.getLocalName()) != 8) {
                zz39.zzK(this.zzZ89);
            } else {
                zzX(zz7h);
            }
        }
    }

    private void zzZ(String str, boolean z, zz7H zz7h) {
        while (this.zzZ89.zzQ(str)) {
            switch (zzUR.zzTP(this.zzZ89.getLocalName())) {
                case 2:
                    zzV(zz7h);
                    break;
                case 3:
                    zzZ(zz7h.zzZAP(), z, this.zzZ89, this.zzZ3z);
                    break;
                case 4:
                    zzZ(zz7h, z);
                    break;
                case 5:
                    zz7h.zzZ(zzZAH());
                    break;
                case 6:
                    zzU(zz7h);
                    break;
                case 7:
                    zzY(zz7h);
                    break;
                default:
                    zz39.zzK(this.zzZ89);
                    break;
            }
        }
        zzW(zz7h);
    }

    private zz0Y zzZAH() {
        String value = "";
        String value2 = "";
        String value3 = value2;
        String value4 = value3;
        while (this.zzZ89.zzi()) {
            switch (zzUR.zzTP(this.zzZ89.getLocalName())) {
                case 12:
                    value = this.zzZ89.getValue();
                    zzOz(value);
                    break;
                case 13:
                    value2 = this.zzZ89.getValue();
                    zzOz(value2);
                    break;
                case 14:
                    value3 = this.zzZ89.getValue();
                    zzOz(value3);
                    break;
                case 15:
                    value4 = this.zzZ89.getValue();
                    zzOz(value4);
                    break;
            }
        }
        while (this.zzZ89.zzQ(DrawToolFactory.LASSO_TYPE_RECT)) {
            zz39.zzK(this.zzZ89);
        }
        return new zz0Y(value, value2, value3, value4);
    }

    private zz7H zzZAI() {
        int iZzTP = zzUR.zzTP(this.zzZ89.getLocalName());
        if (iZzTP == 0) {
            zz7H zz7h = new zz7H();
            zzZ("custGeom", false, zz7h);
            return zz7h;
        }
        if (iZzTP != 1) {
            zz39.zzK(this.zzZ89);
            return new zz7H();
        }
        zz7H zz7hZzOA = zzOA(this.zzZ89.zzV("prst", ""));
        if (zz7hZzOA == null) {
            return new zz7H();
        }
        zzZ("prstGeom", false, zz7hZzOA);
        return zz7hZzOA;
    }

    public static void zzY(zz6U zz6u, boolean z, zzYU4 zzyu4) {
        zzZ(zz6u, z, zzyu4, null);
    }

    private void zzZ(zzBG zzbg) {
        String value = "";
        String value2 = "";
        while (this.zzZ89.zzi()) {
            int iZzTP = zzUR.zzTP(this.zzZ89.getLocalName());
            if (iZzTP == 10) {
                value = this.zzZ89.getValue();
            } else if (iZzTP == 11) {
                value2 = this.zzZ89.getValue();
            }
        }
        if (zzB(value, false) && zzB(value2, false)) {
            zzbg.zzZ(new zzJH(value, value2));
        }
    }

    private void zzZ(zz7H zz7h, boolean z) {
        while (this.zzZ89.zzQ("gdLst")) {
            if (zzUR.zzTP(this.zzZ89.getLocalName()) != 16) {
                zz39.zzK(this.zzZ89);
            } else {
                zzZ(false, zz7h.zzZAP(), z, this.zzZ89, this.zzZ3z);
            }
        }
    }

    private static void zzZ(boolean z, zz6U zz6u, boolean z2, zzYU4 zzyu4, com.aspose.words.internal.zzIM<String> zzim) {
        String strZzV = zzyu4.zzV("name", "");
        String strZzV2 = zzyu4.zzV("fmla", "");
        if (com.aspose.words.internal.zzZKN.equals(strZzV2, "") || com.aspose.words.internal.zzZKN.equals(strZzV, "")) {
            return;
        }
        if (z) {
            zz6u.zzP(strZzV, strZzV2, z2);
        } else {
            zz6u.zzO(strZzV, strZzV2, z2);
        }
        if (zzim != null) {
            zzim.add(strZzV);
        }
    }

    public static void zzZ(zz6U zz6u, boolean z, zzYU4 zzyu4) {
        zzZ(false, zz6u, z, zzyu4, null);
    }

    private static void zzZ(zz6U zz6u, boolean z, zzYU4 zzyu4, com.aspose.words.internal.zzIM<String> zzim) {
        while (zzyu4.zzQ("avLst")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 16) {
                zz39.zzK(zzyu4);
            } else {
                zzZ(true, zz6u, z, zzyu4, zzim);
            }
        }
    }
}
