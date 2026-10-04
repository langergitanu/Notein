package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zz43 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(C18773h.f57233c, "w", "stroke", "extrusionOk", "close", "lnTo", "moveTo", "arcTo", "cubicBezTo", "quadBezTo", TranslateLanguage.PORTUGUESE);
    private zz45 zzZ0p = new zz45();
    private zzYO3 zzZ88;
    private zzYU4 zzZ89;

    private zz43(zzYU4 zzyu4, zzYO3 zzyo3) {
        this.zzZ89 = zzyu4;
        this.zzZ88 = zzyo3;
    }

    private void zzOz(String str) {
        if (this.zzZ88 == null || !zzYU4.zzGY(str)) {
            return;
        }
        this.zzZ88.zzYrc();
    }

    public static zz45 zzR(zzYU4 zzyu4, zzYO3 zzyo3) {
        if (!"path".equals(zzyu4.getLocalName())) {
            return null;
        }
        zz43 zz43Var = new zz43(zzyu4, zzyo3);
        zz43Var.zzZwU();
        return zz43Var.zzZ0p;
    }

    private zzZC4 zzZwN() {
        zz57 zz57Var = new zz57();
        while (true) {
            if (!this.zzZ89.zzQ("moveTo")) {
                break;
            }
            if (zzUR.zzTP(this.zzZ89.getLocalName()) == 10) {
                zz57Var.zzY(zzZwO());
                break;
            }
            zz39.zzK(this.zzZ89);
        }
        return zz57Var;
    }

    private zzJH zzZwO() {
        if (!TranslateLanguage.PORTUGUESE.equals(this.zzZ89.getLocalName())) {
            throw new IllegalStateException("Cannot read a point from the '{0}' tag. The 'pt' tag is required.");
        }
        String strZzV = this.zzZ89.zzV("x", "");
        zzOz(strZzV);
        String strZzV2 = this.zzZ89.zzV("y", "");
        zzOz(strZzV2);
        return new zzJH(strZzV, strZzV2);
    }

    private zzZC4 zzZwP() {
        zz5T zz5t = new zz5T();
        while (this.zzZ89.zzQ("lnTo")) {
            if (zzUR.zzTP(this.zzZ89.getLocalName()) != 10) {
                zz39.zzK(this.zzZ89);
            } else {
                zz5t.zzY(zzZwO());
            }
        }
        return zz5t;
    }

    private zzZC4 zzZwQ() {
        zzHJ zzhj = new zzHJ();
        String strZzV = this.zzZ89.zzV("hR", "");
        zzOz(strZzV);
        zzhj.zzZ(new zzJI(strZzV));
        String strZzV2 = this.zzZ89.zzV("wR", "");
        zzOz(strZzV2);
        zzhj.zzY(new zzJI(strZzV2));
        zzhj.zzZ(new zzJJ(this.zzZ89.zzV("stAng", "")));
        zzhj.zzY(new zzJJ(this.zzZ89.zzV("swAng", "")));
        return zzhj;
    }

    private zzZC4 zzZwR() {
        zzJH[] zzjhArr = new zzJH[3];
        int i = 0;
        while (this.zzZ89.zzQ("cubicBezTo")) {
            if (zzUR.zzTP(this.zzZ89.getLocalName()) != 10) {
                zz39.zzK(this.zzZ89);
            } else if (i < 3) {
                zzjhArr[i] = zzZwO();
                i++;
            } else {
                zz39.zzK(this.zzZ89);
            }
        }
        return new zzAZ(zzjhArr);
    }

    private zzZC4 zzZwS() {
        zzJH[] zzjhArr = new zzJH[2];
        int i = 0;
        while (this.zzZ89.zzQ("quadBezTo")) {
            if (zzUR.zzTP(this.zzZ89.getLocalName()) != 10) {
                zz39.zzK(this.zzZ89);
            } else if (i < 2) {
                zzjhArr[i] = zzZwO();
                i++;
            } else {
                zz39.zzK(this.zzZ89);
            }
        }
        return new zz3C(zzjhArr);
    }

    private int zzZwT() {
        return zz84.zzOV(this.zzZ89.zzV("fill", ""));
    }

    private void zzZwU() {
        this.zzZ0p.zzY1(zzZwT());
        while (this.zzZ89.zzi()) {
            int iZzTP = zzUR.zzTP(this.zzZ89.getLocalName());
            if (iZzTP == 0) {
                this.zzZ0p.setHeight(this.zzZ89.zz9());
            } else if (iZzTP == 1) {
                this.zzZ0p.setWidth(this.zzZ89.zz9());
            } else if (iZzTP == 2) {
                this.zzZ0p.zzWR(this.zzZ89.zz8());
            } else if (iZzTP != 3) {
                zz39.zzI(this.zzZ89);
            } else {
                this.zzZ0p.zzWQ(this.zzZ89.zz8());
            }
        }
        while (this.zzZ89.zzQ("path")) {
            switch (zzUR.zzTP(this.zzZ89.getLocalName())) {
                case 4:
                    this.zzZ0p.zzZ(new zzC4());
                    break;
                case 5:
                    this.zzZ0p.zzZ(zzZwP());
                    break;
                case 6:
                    this.zzZ0p.zzZ(zzZwN());
                    break;
                case 7:
                    this.zzZ0p.zzZ(zzZwQ());
                    break;
                case 8:
                    this.zzZ0p.zzZ(zzZwR());
                    break;
                case 9:
                    this.zzZ0p.zzZ(zzZwS());
                    break;
                default:
                    zz39.zzK(this.zzZ89);
                    break;
            }
        }
    }
}
