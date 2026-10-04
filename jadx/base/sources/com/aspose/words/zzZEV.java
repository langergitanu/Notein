package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEV {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("-aw-start", "-aw-match-parent", "-aw-center");
    private boolean zzYlx;
    private int zzYly;
    private ArrayList<zzZAS> zzYlz = new ArrayList<>();
    private boolean zzYm6;
    private zzMJ zzZop;

    public zzZEV(zzZET zzzet, HtmlSaveOptions htmlSaveOptions) {
        this.zzYm6 = htmlSaveOptions.getExportRelativeFontSize();
        this.zzZop = new zzQH(htmlSaveOptions.zzYZ1() == 0 ? 2 : 0).zzX(zzzet.zzZVv());
    }

    private static boolean zzL(zzZAS zzzas) {
        return "a".equals(zzzas.zzZTQ()) && com.aspose.words.internal.zzZYD.zzXk(zzzas.zzKM("href"));
    }

    private static double zzR(zzPT zzpt) {
        if (zzpt != null) {
            zzpt.zzZWj().zzZVx().getValueType();
        }
        if (zzpt != null) {
            return zzL5.zzL(zzpt.zzZWj().zzZVx());
        }
        return 12.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzS(zzMP zzmp) {
        double doubleValue;
        if (zzmp == null) {
            return false;
        }
        if (zzmp.getCount() <= 0) {
            doubleValue = -1.7976931348623157E308d;
        } else {
            int valueType = zzmp.zzZVx().getValueType();
            if (valueType == 3) {
                doubleValue = ((zzNH) zzmp.zzZVx()).getDoubleValue();
            } else if (valueType == 4) {
                doubleValue = ((zzOI) zzmp.zzZVx()).getDoubleValue();
            } else if (valueType == 5) {
                doubleValue = ((zzMU) zzmp.zzZVx()).getDoubleValue();
            }
        }
        return com.aspose.words.internal.zzAN.zzZD(doubleValue);
    }

    private void zzT(zzZDN zzzdn) {
        zzZDN[] zzzdnArrZzYXh = zzzdn.zzYXh();
        int i = 0;
        while (i < zzzdnArrZzYXh.length && i < this.zzYlz.size() && com.aspose.words.internal.zzZKO.zzA(zzzdnArrZzYXh[i], this.zzYlz.get(i))) {
            i++;
        }
        while (this.zzYlz.size() > i) {
            zzZVt();
        }
        while (i < zzzdnArrZzYXh.length) {
            zzV(zzzdnArrZzYXh[i], null);
            i++;
        }
    }

    private void zzV(zzZAS zzzas, zzPS zzps) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYlz, zzzas);
        this.zzZop.zzZ(zzzas, zzps);
        if (zzL(zzzas)) {
            this.zzYly++;
        }
        zzYYQ();
    }

    private void zzY(zzPR zzpr, zzPS zzps) {
        zzZ(zzpr, zzps, "border-top-style", "border-top-width", "border-top-color");
        zzZ(zzpr, zzps, "border-right-style", "border-right-width", "border-right-color");
        zzZ(zzpr, zzps, "border-bottom-style", "border-bottom-width", "border-bottom-color");
        zzZ(zzpr, zzps, "border-left-style", "border-left-width", "border-left-color");
    }

    private void zzYYQ() {
        boolean z = true;
        zzZAS zzzas = this.zzYlz.size() > 0 ? (zzZAS) C21505OooO0Oo.OooO00o(1, this.zzYlz) : null;
        if (zzzas == null || !"img".equals(zzzas.zzZTQ()) || (this.zzYly <= 0 && zzzas.zzKM("usemap") == null)) {
            z = false;
        }
        this.zzYlx = z;
    }

    private void zzZVt() {
        this.zzYlz.size();
        int size = this.zzYlz.size() - 1;
        if (zzL(this.zzYlz.get(size))) {
            this.zzYly--;
        }
        this.zzYlz.remove(size);
        this.zzZop.zzZVt();
        zzYYQ();
    }

    public final zzPS zzZ(zzZDN zzzdn, zzLU zzlu) {
        zzPT zzptZzSx;
        if (zzlu == null) {
            return zzPS.zzZqo;
        }
        zzPS zzpsZzZWe = zzlu.zzZWe();
        zzzdn.zzYXj().zzJH("style");
        zzT(zzzdn);
        zzPS zzpsZzZWe2 = this.zzZop.zzZWe();
        zzV(zzzdn, null);
        zzPS zzpsZzZWe3 = this.zzZop.zzZWe();
        zzZVt();
        zzV(zzzdn, zzpsZzZWe);
        zzPS zzpsZzZWe4 = this.zzZop.zzZWe();
        zzPR zzpr = new zzPR();
        for (zzPT zzpt : zzpsZzZWe4) {
            zzMS zzmsZzSk = zzMR.zzSk(zzpt.zzZWo());
            boolean z = false;
            if (zzmsZzSk instanceof zzOP) {
                zzPT zzptZzSx2 = zzpsZzZWe3.zzSx(zzpt.zzZWo());
                boolean zZzZ = zzZ(zzpt.zzZWj(), zzptZzSx2 != null ? zzptZzSx2.zzZWj() : zzmsZzSk.zzZW0(), zzpsZzZWe2, zzpsZzZWe4);
                if (!zZzZ || ((!"font-size".equals(zzpt.zzZWo()) && !"font-family".equals(zzpt.zzZWo())) || !zzpsZzZWe3.zzSz(zzpt.zzZWo()))) {
                    z = zZzZ;
                }
            }
            if (!z) {
                zzMP zzmpZzZ = zzZ(zzpt.zzZWj(), zzpsZzZWe2, zzpsZzZWe4);
                zzPT zzptZzSx3 = zzmpZzZ.zzX(zzpt.zzZWj()) ? zzpsZzZWe.zzSx(zzpt.zzZWo()) : new zzM3(zzpt.zzZWo(), zzmpZzZ);
                if (zzptZzSx3 != null) {
                    zzpr.zzY(zzptZzSx3);
                }
            }
        }
        if (("ins".equals(zzzdn.getName()) || "del".equals(zzzdn.getName())) && (zzptZzSx = zzpsZzZWe4.zzSx("text-decoration")) != null && zzptZzSx.zzZWj().zzX(zzLL.zzZo5) && zzpr.zzSx("text-decoration") == null) {
            zzpr.zzY(new zzM3("text-decoration", zzLL.zzZo5));
        }
        if ("table".equals(zzzdn.getName())) {
            zzpr.zzW(zzpsZzZWe4.zzSx("border-top-color"));
            zzpr.zzW(zzpsZzZWe4.zzSx("border-right-color"));
            zzpr.zzW(zzpsZzZWe4.zzSx("border-bottom-color"));
            zzpr.zzW(zzpsZzZWe4.zzSx("border-left-color"));
        }
        zzZ(zzzdn, zzpr, zzpsZzZWe3);
        zzY(zzzdn, zzpr, zzpsZzZWe4);
        zzZ(zzpr, zzpsZzZWe4, zzpsZzZWe2);
        zzY(zzpr, zzpsZzZWe4);
        zzzdn.zzYXj().zzJH("style");
        zzZVt();
        return zzpr.zzZWe();
    }

    private static void zzY(zzZDN zzzdn, zzPR zzpr, zzPS zzps) {
        if (TranslateLanguage.CROATIAN.equals(zzzdn.getName())) {
            zzPT zzptZzSx = zzps.zzSx("text-align");
            if (zzptZzSx != null && zzpr.zzSx("text-align") == null && !zzptZzSx.zzZWj().zzP(zzL4.zzZmA) && !zzptZzSx.zzZWj().zzP(zzL4.zzZmy) && !zzptZzSx.zzZWj().zzP(zzL4.zzZmx) && !zzptZzSx.zzZWj().zzP(zzL4.zzZmw) && !zzptZzSx.zzZWj().zzP(zzL4.zzZmz)) {
                zzpr.zzY(zzptZzSx);
            }
            if (zzps.zzSx("border-top-style").zzZWj().zzP(zzL4.zzZlv)) {
                if (zzpr.zzSx("color") == null) {
                    zzPT zzptZzSx2 = zzps.zzSx("color");
                    if (zzptZzSx2 == null) {
                        zzptZzSx2 = new zzM3("color", new zzQC(com.aspose.words.internal.zzPV.zzJu), (byte) 0);
                    }
                    zzpr.zzY(zzptZzSx2);
                }
                if (zzpr.zzSx("background-color") == null) {
                    zzPT zzptZzSx3 = zzps.zzSx("background-color");
                    if (zzptZzSx3 == null) {
                        zzptZzSx3 = new zzM3("background-color", new zzQC(com.aspose.words.internal.zzPV.zzJu), (byte) 0);
                    }
                    zzpr.zzY(zzptZzSx3);
                }
            }
        }
    }

    private void zzZ(zzPR zzpr, zzPS zzps, String str, String str2, String str3) {
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx == null || zzptZzSx.zzZWj().zzZVx().zzP(zzL4.zzZno)) {
            zzpr.remove(str2);
            zzpr.remove(str3);
            if (this.zzYlx) {
                if (zzptZzSx == null) {
                    zzptZzSx = new zzM3(str, zzL4.zzZno, (byte) 0);
                }
                zzpr.zzV(zzptZzSx);
            }
        }
    }

    private static void zzZ(zzZDN zzzdn, zzPR zzpr, zzPS zzps) {
        if (zzZIZ.zzT(zzzdn) && !TranslateLanguage.CROATIAN.equals(zzzdn.getName())) {
            zzPT zzptZzSx = zzps.zzSx("writing-mode");
            boolean z = zzptZzSx != null && (zzptZzSx.zzZWj().zzP(zzL4.zzZlC) || zzptZzSx.zzZWj().zzP(zzL4.zzZlD));
            zzOI zzoi = new zzOI(0.0d, 4);
            if (z) {
                if (zzpr.zzSx("margin-left") == null && zzps.zzSx("margin-left") == null) {
                    zzpr.zzY(new zzM3("margin-left", zzoi, (byte) 0));
                }
                if (zzpr.zzSx("margin-right") == null && zzps.zzSx("margin-right") == null) {
                    zzpr.zzY(new zzM3("margin-right", zzoi, (byte) 0));
                }
            } else {
                if (zzpr.zzSx("margin-top") == null && zzps.zzSx("margin-top") == null) {
                    zzpr.zzY(new zzM3("margin-top", zzoi, (byte) 0));
                }
                if (zzpr.zzSx("margin-bottom") == null && zzps.zzSx("margin-bottom") == null) {
                    zzpr.zzY(new zzM3("margin-bottom", zzoi, (byte) 0));
                }
            }
        }
        if ("ol".equals(zzzdn.getName()) || "ul".equals(zzzdn.getName())) {
            zzOI zzoi2 = new zzOI(0.0d, 4);
            if (zzpr.zzSx("margin-left") == null && zzps.zzSx("margin-left") == null) {
                zzpr.zzY(new zzM3("margin-left", zzoi2, (byte) 0));
            }
            if (zzpr.zzSx("margin-right") == null && zzps.zzSx("margin-right") == null) {
                zzpr.zzY(new zzM3("margin-right", zzoi2, (byte) 0));
            }
        }
    }

    private void zzZ(zzPR zzpr, zzPS zzps, zzPS zzps2) {
        if (!this.zzYm6 || zzpr.zzSx("font-size") == null) {
            return;
        }
        double dZzZ = zzZ(zzps.zzSx("font-size"), zzps2.zzSx("font-size"));
        if (com.aspose.words.internal.zzAN.zzZC(dZzZ)) {
            return;
        }
        if (com.aspose.words.internal.zzAN.zzQ(dZzZ, 1.0d, 0.01d)) {
            zzpr.remove("font-size");
        } else {
            zzpr.zzV(new zzM3("font-size", new zzMP(new zzOI(dZzZ, 7))));
        }
    }

    private static double zzZ(zzPT zzpt, zzPT zzpt2) {
        double dZzR = zzR(zzpt);
        double dZzR2 = zzR(zzpt2);
        if (com.aspose.words.internal.zzAN.zzZC(dZzR) || com.aspose.words.internal.zzAN.zzZC(dZzR2) || com.aspose.words.internal.zzAN.zzZD(dZzR2)) {
            return -1.7976931348623157E308d;
        }
        return dZzR / dZzR2;
    }

    private static boolean zzZ(zzMP zzmp, zzMP zzmp2, zzPS zzps, zzPS zzps2) {
        zzMP zzmpZzZ = zzZ(zzmp, zzps, zzps2);
        zzMP zzmpZzZ2 = zzZ(zzmp2, zzps, zzps2);
        if (zzmpZzZ.zzX(zzmpZzZ2)) {
            return true;
        }
        return zzS(zzmpZzZ) && zzS(zzmpZzZ2);
    }

    private static zzMP zzZ(zzMP zzmp, zzPS zzps, zzPS zzps2) {
        if (zzmp == null || zzmp.getCount() != 1 || zzmp.zzZVx().getValueType() != 0) {
            return zzmp;
        }
        int iZzTP = zzUR.zzTP((String) zzmp.zzZVx().getValue());
        if (iZzTP == 0) {
            return zzL5.zzMe(zzL5.zzM(zzps2));
        }
        if (iZzTP != 1) {
            return iZzTP != 2 ? zzmp : new zzMP(new zzL2(zzL4.zzZmF));
        }
        return zzL5.zzMe(zzL5.zzM(zzps));
    }
}
