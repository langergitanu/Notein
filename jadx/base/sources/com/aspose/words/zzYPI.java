package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPI implements Iterable<zzYQ4> {
    private int zzXLL;
    private zzYP9 zzXLN;
    private int zzXLO;
    private zzYPO zzXRj;
    private int zzYlk;
    private zzYSL zzXLM = new zzYSL();
    private ArrayList<zzYQ4> zzZm = new ArrayList<>();

    public zzYPI(zzYPO zzypo) {
        this.zzXRj = zzypo;
    }

    private int zzV(zzYR0 zzyr0) {
        if (zzyr0 == null) {
            return 0;
        }
        int count = 0;
        int columnWidth = 0;
        for (zzYPE zzype : this.zzXLM) {
            if (zzype.getColumnWidth() == Integer.MIN_VALUE) {
                count++;
            } else {
                columnWidth += zzype.getColumnWidth();
            }
        }
        if (this.zzYlk > this.zzXLM.getCount()) {
            count += this.zzYlk - this.zzXLM.getCount();
        }
        if (count > 0) {
            return (this.zzXLL - columnWidth) / count;
        }
        return 0;
    }

    private int zzW(zzYR0 zzyr0) {
        int iZzr = zzyr0 != null ? com.aspose.words.internal.zzSA.zzr(zzyr0.zzYBx().getPageSetup().zzYRX()) : 0;
        if (!this.zzXLN.getPreferredWidth().isAuto()) {
            iZzr = this.zzXLN.getPreferredWidth().zzYmE();
        }
        if (!this.zzXLN.zzYtn() || !this.zzXLN.getPreferredWidth().isAuto()) {
            return iZzr;
        }
        zzYRF zzyrfZzYvC = this.zzXLN.zzYvQ().zzYvC();
        return (iZzr - com.aspose.words.internal.zzSA.zzu(zzyrfZzYvC.zzYvO())) - com.aspose.words.internal.zzSA.zzu(zzyrfZzYvC.zzYvN());
    }

    private void zzWu(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            zzrB(i).zzZ(new zzYTE());
        }
    }

    private void zzYYF() {
        for (int i = 0; i < this.zzZm.size(); i++) {
            zzYQ4 zzyq4ZzrB = zzrB(i);
            for (int i2 = 0; i2 < zzyq4ZzrB.getCount(); i2++) {
                zzYTE zzyteZzrL = zzyq4ZzrB.zzrL(i2);
                int iMin = Math.min(zzyteZzrL.getRowSpan(), this.zzZm.size() - i);
                if (iMin > 1) {
                    zzyteZzrL.setVerticalMerge(1);
                    for (int i3 = 1; i3 < iMin; i3++) {
                        int i4 = i + i3;
                        if (i2 + 1 > zzrB(i4).getCount()) {
                            zzWu(i4, (i2 - zzrB(i4).getCount()) + 1);
                        } else {
                            zzZ(i4, i2, new zzYTE());
                        }
                        this.zzYlk = Math.max(this.zzYlk, zzrB(i4).getCount());
                        zzYTE zzyteZzrL2 = zzrB(i4).zzrL(i2);
                        zzyteZzrL2.setVerticalMerge(2);
                        zzyteZzrL2.setHorizontalMerge(zzyteZzrL.getHorizontalMerge());
                    }
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<zzYQ4> iterator() {
        return this.zzZm.iterator();
    }

    public final int zzWv(int i, int i2) {
        zzYSL zzysl = this.zzXLM;
        if (zzysl == null) {
            return 0;
        }
        int iZzYwX = zzysl.zzYwX();
        int iZzYts = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            if (i4 >= this.zzXLM.getCount()) {
                break;
            }
            zzYPE zzypeZzsE = this.zzXLM.zzsE(i4);
            if (zzypeZzsE != null) {
                iZzYts += (zzypeZzsE.getColumnWidth() == Integer.MIN_VALUE && this.zzXLM.zzYwY()) ? (zzypeZzsE.zzYts() * this.zzXLL) / iZzYwX : zzypeZzsE.getColumnWidth() == Integer.MIN_VALUE ? this.zzXLO : zzypeZzsE.getColumnWidth();
            }
        }
        return iZzYts;
    }

    public final void zzX(zzYR0 zzyr0) {
        Iterator<zzYQ4> it = iterator();
        while (it.hasNext()) {
            this.zzYlk = Math.max(this.zzYlk, it.next().getCount());
        }
        this.zzXLL = zzW(zzyr0);
        this.zzXLO = zzV(zzyr0);
        zzYYF();
    }

    public final int zzYtt() {
        return this.zzXLO;
    }

    public final zzYSL zzYtu() {
        return this.zzXLM;
    }

    public final zzYP9 zzYtv() {
        return this.zzXLN;
    }

    public final boolean zzYtw() {
        zzYPE zzype = (zzYPE) this.zzXRj.zzYh(null, "table-column");
        boolean z = zzype != null && zzype.zzYtr() == 1;
        for (zzYPE zzype2 : this.zzXLM) {
            if (zzype2.zzYtr() == 0 || (!z && zzype2.zzYtr() == -1)) {
                return false;
            }
        }
        zzYPA zzypa = (zzYPA) this.zzXRj.zzYh(null, "table-row");
        boolean z2 = zzypa != null && zzypa.zzYtq() == 1;
        Iterator<zzYQ4> it = iterator();
        while (it.hasNext()) {
            zzYPA zzypaZzYuk = it.next().zzYuk();
            if ((zzypaZzYuk != null && zzypaZzYuk.zzYtq() == 0) || (!z2 && (zzypaZzYuk == null || zzypaZzYuk.zzYtq() == -1))) {
                return false;
            }
        }
        return true;
    }

    public final void zzZ(zzYQ4 zzyq4) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzyq4);
    }

    public final zzYQ4 zzrB(int i) {
        return this.zzZm.get(i);
    }

    private void zzZ(int i, int i2, zzYTE zzyte) {
        zzYQ4 zzyq4ZzrB = zzrB(i);
        if (this.zzYlk > zzyq4ZzrB.getCount()) {
            zzyq4ZzrB.zzZ((zzYTE) null);
        }
        int count = zzyq4ZzrB.getCount();
        int i3 = count - 1;
        int i4 = count - 2;
        while (i4 >= i2) {
            while (zzyq4ZzrB.zzrL(i4).getVerticalMerge() == 2) {
                i4--;
            }
            zzyq4ZzrB.zzZ(i3, zzyq4ZzrB.zzrL(i4));
            i3 = i4;
            i4--;
        }
        zzyq4ZzrB.zzZ(i2, zzyte);
    }

    public final void zzZ(zzYP9 zzyp9) {
        this.zzXLN = zzyp9;
    }
}
