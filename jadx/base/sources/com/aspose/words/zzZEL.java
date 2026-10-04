package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEL {
    private boolean zzYl9;
    private boolean zzYla;
    private boolean zzYlb;
    private zzZJG zzYlc;
    private zzZFC zzYld;
    private zzRL zzYlg;
    private zzRL zzYlh;
    private boolean zzYli;
    private boolean zzYlj;
    private int zzYlk;
    private zzZYY zzYnb;
    private zzQQ zzYsS;
    private ArrayList<zzZFD> zzZEU = new ArrayList<>();
    private ArrayList<zzZEK> zzYlf = new ArrayList<>();
    private ArrayList<zzZJI> zzYle = new ArrayList<>();

    private zzZEL(zzZYY zzzyy, boolean z) {
        this.zzYnb = zzzyy;
        zzPS zzpsZzZUC = zzzyy.zzZUC();
        boolean z2 = false;
        this.zzYsS = zzQQ.zzZ(zzpsZzZUC, false);
        zzPT zzptZzSx = zzpsZzZUC.zzSx("border-collapse");
        if (zzptZzSx != null && zzptZzSx.zzZWj().zzP(zzL4.zzZm1)) {
            z2 = true;
        }
        this.zzYlj = z2;
        this.zzYl9 = z;
    }

    private void zzYYF() {
        int iZzYYI = zzYYI();
        for (int i = 0; i < iZzYYI; i++) {
            for (int i2 = 0; i2 < this.zzZEU.size(); i2++) {
                zzZFD zzzfdZzyW = zzyW(i2);
                if (zzzfdZzyW.zzYZk() > i) {
                    zzZJQ zzzjqZzz6 = zzzfdZzyW.zzz6(i);
                    int iMin = Math.min(zzzjqZzz6.getRowSpan() + i2, this.zzZEU.size());
                    for (int i3 = i2 + 1; i3 < iMin && zzyW(i3).zzYZl() == zzzfdZzyW.zzYZl(); i3++) {
                        zzzjqZzz6.setVerticalMerge(1);
                        if (i + 1 > zzyW(i3).zzYZk()) {
                            zzZ(i3, (i - zzyW(i3).zzYZk()) + 1, zzzjqZzz6.zzZ3X());
                        } else if (zzyW(i3).zzz6(i).getHorizontalMerge() != 2) {
                            zzZ(i3, i, new zzZJQ(zzzjqZzz6.zzZ3X()));
                        }
                        zzZJQ zzzjqZzz62 = zzyW(i3).zzz6(i);
                        zzzjqZzz62.setVerticalMerge(2);
                        zzzjqZzz62.zzY(zzzjqZzz6);
                        if (zzzjqZzz62.getHorizontalMerge() != 2) {
                            zzzjqZzz62.setHorizontalMerge(zzzjqZzz6.getHorizontalMerge());
                            zzzjqZzz62.zzZ(zzzjqZzz6.zzZ3W());
                        }
                    }
                }
            }
        }
    }

    private void zzYYG() {
        Iterator<zzZFD> it = this.zzZEU.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().zzYZn());
        }
        for (zzZFD zzzfd : this.zzZEU) {
            while (zzzfd.zzYZk() > iMax) {
                zzZJQ zzzjqZzZ3W = zzzfd.zzz6(zzzfd.zzYZk() - 1).zzZ3W();
                if (zzzjqZzZ3W != null && zzzjqZzZ3W.zzBx() > 1) {
                    zzzjqZzZ3W.zzOk(zzzjqZzZ3W.zzBx() - 1);
                }
                zzzfd.zzYZo();
            }
        }
    }

    private void zzYYH() {
        int iZzYYI = zzYYI();
        for (zzZFD zzzfd : this.zzZEU) {
            while (zzzfd.zzYZk() < iZzYYI) {
                zzzfd.zzX(new zzZJQ(zzQQ.zzZX8()));
            }
        }
    }

    private int zzYYI() {
        Iterator<zzZFD> it = this.zzZEU.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().zzYZk());
        }
        return iMax;
    }

    private void zzYYJ() {
        this.zzYlc = new zzZJG(this.zzYnb.zzZUC());
    }

    private zzZFD zzYYy() {
        return (zzZFD) C21505OooO0Oo.OooO00o(1, this.zzZEU);
    }

    public static zzZEL zzZ(zzZIG zzzig, zzZYY zzzyy, boolean z) {
        if (!"table".equals(zzzig.getName()) && zzzyy.zzZUt() != 5) {
            zzzyy.zzZUt();
        }
        zzZEL zzzel = new zzZEL(zzzyy, z);
        zzzel.zzm(zzzig);
        return zzzel;
    }

    private void zzg(zzZIG zzzig) {
        if ((this.zzYla && (this.zzYnb.zzZUt() == 8 || this.zzYnb.zzZUt() == 14 || this.zzYnb.zzZUt() == 11)) || "thead".equals(zzzig.getName()) || "tbody".equals(zzzig.getName()) || "tfoot".equals(zzzig.getName())) {
            this.zzYld = null;
            return;
        }
        if ((this.zzYla && this.zzYnb.zzZUt() == 9) || "colgroup".equals(zzzig.getName())) {
            if (this.zzYle.size() == 0 || ((zzZJI) C21505OooO0Oo.OooO00o(1, this.zzYle)).zzZ3Q() != this.zzYlc) {
                int iZzZQ = zzzig.zzZ2B().zzZQ("span", 1000);
                for (int i = 0; i < iZzZQ; i++) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzYle, new zzZJI(this.zzYlc.zzZWe(), this.zzYlc));
                }
            }
            this.zzYlc = null;
        }
    }

    private boolean zzh(zzZIG zzzig) {
        if (zzZ(zzzig, this.zzYnb.zzZUC())) {
            return false;
        }
        zzZFC zzzfc = this.zzYld;
        if (zzzfc == null && this.zzYl9) {
            zzzfc = new zzZFC(new zzZIG("tbody", false), new zzPS());
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZEU, new zzZFD(zzzig, this.zzYnb.zzZUC(), zzzfc));
        return true;
    }

    private void zzi(zzZIG zzzig) {
        zzPT zzptZzSx;
        String attributeValue = zzzig.zzZ2B().getAttributeValue("style", "");
        com.aspose.words.internal.zzZNR zzznr = new com.aspose.words.internal.zzZNR("width:0pt; height:\\d+(\\.\\d+)?pt; border:none");
        if ((com.aspose.words.internal.zzZKN.equals(zzzig.zzZ2F(), "") && zzznr.zzUV(attributeValue)) || this.zzZEU.size() == 0) {
            return;
        }
        int iZzZQ = zzzig.zzZ2B().zzZQ("colspan", 1000);
        int iZzZQ2 = zzzig.zzZ2B().zzZQ("rowspan", 65534);
        zzZJQ zzzjq = new zzZJQ(zzzig, zzQQ.zzZ(this.zzYnb.zzZUC(), true));
        zzzjq.zzOk(iZzZQ);
        zzzjq.zzzX(iZzZQ);
        zzzjq.zzOj(iZzZQ2);
        zzYYy().zzX(zzzjq);
        if (iZzZQ > 1) {
            zzzjq.setHorizontalMerge(1);
            for (int i = iZzZQ - 1; i > 0; i--) {
                zzZJQ zzzjq2 = new zzZJQ(zzzjq.zzZ3X());
                zzzjq2.setHorizontalMerge(2);
                zzzjq2.zzZ(zzzjq);
                zzzjq2.zzOk(i);
                zzzjq2.zzzX(i);
                zzzjq2.zzOj(iZzZQ2);
                zzYYy().zzX(zzzjq2);
            }
        }
        if (iZzZQ2 != 1 || (zzptZzSx = this.zzYnb.zzZUC().zzSx("height")) == null) {
            return;
        }
        double dZzW = zzL5.zzW(zzptZzSx.zzZWj());
        if (com.aspose.words.internal.zzAN.zzZC(dZzW) || dZzW <= zzYYy().zzYZm()) {
            return;
        }
        zzYYy().zzWW(dZzW);
    }

    private void zzj(zzZIG zzzig) {
        this.zzYld = new zzZFC(zzzig, this.zzYnb.zzZUC());
    }

    private boolean zzk(zzZIG zzzig) {
        if ((this.zzYla && this.zzYnb.zzZUt() == 12) || TranslateLanguage.TURKISH.equals(zzzig.getName())) {
            if (!TranslateLanguage.TURKISH.equals(zzzig.getName())) {
                zzj(zzzig);
            }
            return zzh(zzzig);
        }
        if ((this.zzYla && this.zzYnb.zzZUt() == 13) || "td".equals(zzzig.getName()) || TranslateLanguage.THAI.equals(zzzig.getName())) {
            if (this.zzYla && this.zzZEU.size() == 0 && (!"td".equals(zzzig.getName()) || !TranslateLanguage.THAI.equals(zzzig.getName()))) {
                zzj(zzzig);
                zzh(zzzig);
            }
            zzi(zzzig);
            return true;
        }
        if (this.zzYnb.zzZUt() == 5 || this.zzYnb.zzZUt() == 6 || "table".equals(zzzig.getName())) {
            if (this.zzYlb) {
                return false;
            }
            this.zzYlb = true;
            this.zzYla = !"table".equals(zzzig.getName());
            return true;
        }
        if ((this.zzYla && this.zzYnb.zzZUt() == 7) || "caption".equals(zzzig.getName())) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYlf, new zzZEK(zzzig, this.zzYnb.zzZUC()));
            return false;
        }
        if ((this.zzYla && (this.zzYnb.zzZUt() == 8 || this.zzYnb.zzZUt() == 14 || this.zzYnb.zzZUt() == 11)) || "thead".equals(zzzig.getName()) || "tbody".equals(zzzig.getName()) || "tfoot".equals(zzzig.getName())) {
            zzj(zzzig);
            return true;
        }
        if ((this.zzYla && this.zzYnb.zzZUt() == 9) || "colgroup".equals(zzzig.getName())) {
            zzYYJ();
            return true;
        }
        if ((this.zzYla && this.zzYnb.zzZUt() == 10) || "col".equals(zzzig.getName())) {
            if (this.zzYlc == null) {
                this.zzYlc = new zzZJG();
            }
            int iZzZQ = zzzig.zzZ2B().zzZQ("span", 1000);
            for (int i = 0; i < iZzZQ; i++) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzYle, new zzZJI(this.zzYnb.zzZUC(), this.zzYlc));
            }
        }
        return false;
    }

    private void zzl(zzZIG zzzig) {
        this.zzYnb.zzZ((zzZAS) zzzig, false);
        if (this.zzYnb.zzZUy() == 0 && zzk(zzzig)) {
            for (zzZG4 zzzg4 : zzzig.zzZ2C()) {
                if (zzzg4 instanceof zzZIG) {
                    zzl((zzZIG) zzzg4);
                }
            }
            zzg(zzzig);
        }
        this.zzYnb.zzZVt();
    }

    private void zzm(zzZIG zzzig) {
        this.zzYli = !"table".equals(zzzig.getName());
        zzl(zzzig);
        zzYYF();
        zzYYG();
        zzYYH();
        this.zzYlk = zzYYI();
    }

    public final int getColumnCount() {
        return this.zzYlk;
    }

    public final int getRowCount() {
        return this.zzZEU.size();
    }

    public final void zzX(zzRL zzrl) {
        this.zzYlg = zzrl;
    }

    public final void zzY(zzRL zzrl) {
        this.zzYlh = zzrl;
    }

    public final zzRL zzYYA() {
        return this.zzYlh;
    }

    public final boolean zzYYB() {
        return this.zzYli;
    }

    public final boolean zzYYC() {
        return this.zzYlj;
    }

    public final int zzYYD() {
        return this.zzYle.size();
    }

    public final int zzYYE() {
        return this.zzYlf.size();
    }

    public final zzRL zzYYz() {
        return this.zzYlg;
    }

    public final zzQQ zzZ3X() {
        return this.zzYsS;
    }

    public final zzZFD zzyW(int i) {
        return this.zzZEU.get(i);
    }

    public final zzZJI zzyX(int i) {
        return this.zzYle.get(i);
    }

    public final zzZEK zzyY(int i) {
        return this.zzYlf.get(i);
    }

    private void zzZ(int i, int i2, zzZJQ zzzjq) {
        zzZFD zzzfdZzyW = zzyW(i);
        zzzfdZzyW.zzX(null);
        int iZzYZk = zzzfdZzyW.zzYZk();
        int i3 = iZzYZk - 1;
        int i4 = iZzYZk - 2;
        while (i4 >= i2) {
            while (zzzfdZzyW.zzz6(i4).getVerticalMerge() != 0) {
                i4--;
                if (i4 < 0) {
                    zzzfdZzyW.zzYZo();
                    return;
                }
            }
            zzzfdZzyW.zzZ(i3, zzzfdZzyW.zzz6(i4));
            i3 = i4;
            i4--;
        }
        zzzfdZzyW.zzZ(i2, zzzjq);
    }

    private void zzZ(int i, int i2, zzQQ zzqq) {
        for (int i3 = 0; i3 < i2; i3++) {
            zzyW(i).zzX(new zzZJQ(zzqq));
        }
    }

    private static boolean zzZ(zzZIG zzzig, zzPS zzps) {
        zzPT zzptZzSx;
        if (!TranslateLanguage.TURKISH.equals(zzzig.getName()) || (zzptZzSx = zzps.zzSx("height")) == null || !com.aspose.words.internal.zzAN.zzZD(zzptZzSx.zzZWj().zzZVx().getDoubleValue()) || (zzzig.zzZ0d() != null && (!(zzzig.zzZ0d() instanceof zzZEC) || zzzig.zzZ0d().zzZ2D() || zzzig.zzZ0d().zzZ0d() != null))) {
            return false;
        }
        int i = 0;
        for (zzZG4 zzzg4 : zzzig.zzZ2C()) {
            if (zzzg4 instanceof zzZIG) {
                zzZIG zzzig2 = (zzZIG) zzzg4;
                if (!"td".equals(zzzig2.getName()) || zzzig2.zzZ2C().getCount() > 1) {
                    return false;
                }
                if (zzzig2.zzZ2C().getCount() == 1 && (!(zzzig2.zzZ2C().zzzd(0) instanceof zzZEC) || zzzig2.zzZ2C().zzzd(0).zzZ2D())) {
                    return false;
                }
                i++;
            } else if (zzzg4.zzZ2D()) {
                return false;
            }
        }
        return i > 0;
    }
}
