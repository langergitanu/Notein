package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzUE {
    private boolean zzZuB;
    private zzXS zzZuC;
    private Table zzZuD;
    private ArrayList<zzYMR> zzZuE = new ArrayList<>();
    private zzXS zzZuF;
    private zzUE zzZuG;

    public zzUE(zzUE zzue, zzXS zzxs) {
        this.zzZuG = zzue;
        this.zzZuF = zzxs;
    }

    private zzXS zzN9(int i) {
        return this.zzZuE.get(i).zzXGE;
    }

    private Paragraph zzNa(int i) {
        return this.zzZuE.get(i).zzXGF;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148 A[EDGE_INSN: B:94:0x0148->B:77:0x0148 BREAK  A[LOOP:2: B:35:0x00ad->B:75:0x013f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZZd() throws Exception {
        boolean z;
        boolean z2;
        int i;
        if (this.zzZuF.isVisible()) {
            Paragraph paragraphZzNa = zzNa(0);
            zzXS zzxsZzN9 = zzN9(0);
            int i2 = 1;
            zzXS zzxsZzN92 = zzN9(this.zzZuE.size() - 1);
            boolean zIsVisible = zzxsZzN9.zzZBA.isVisible();
            double dZz83 = zzxsZzN9.zzZBC.zz83();
            double dZz832 = zzxsZzN92.zzZBA.zz83();
            double dZz833 = zIsVisible ? zzxsZzN9.zzZBA.zz83() - dZz83 : zzxsZzN9.zzZBA.zz83();
            zzXV zzxv = zIsVisible ? zzxsZzN9.zzZBA : null;
            int i3 = 0;
            while (true) {
                if (i3 >= this.zzZuE.size()) {
                    z = true;
                    break;
                } else {
                    if (i3 != this.zzZuE.size() - 1 && zzNa(i3).zzYB4() != zzNa(i3 + 1)) {
                        z = false;
                        break;
                    }
                    i3++;
                }
            }
            if (z) {
                for (int i4 = 1; i4 < this.zzZuE.size(); i4++) {
                    Paragraph paragraphZzNa2 = zzNa(i4);
                    if (paragraphZzNa2.getListFormat().getListId() != paragraphZzNa.getListFormat().getListId() || paragraphZzNa2.getListFormat().zzYON() != paragraphZzNa.getListFormat().zzYON()) {
                        z = false;
                        break;
                    }
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= this.zzZuE.size()) {
                        z2 = zIsVisible;
                        break;
                    }
                    zzXS zzxsZzN93 = zzN9(i5);
                    if (zzxsZzN93.zzZBC.isVisible() || zzxsZzN93.zzZBB.isVisible() || zzxsZzN93.zzZBz.isVisible()) {
                        break;
                    }
                    if (i5 == 0) {
                        i = i2;
                        z2 = zIsVisible;
                    } else {
                        if (i5 != this.zzZuE.size() - i2 && zIsVisible && (!zzxsZzN93.zzZBA.isVisible() || zzxv.getLineStyle() != zzxsZzN93.zzZBA.getLineStyle())) {
                            break;
                        }
                        double dZz834 = zzxsZzN93.zzZBC.zz83();
                        i = i2;
                        z2 = zIsVisible;
                        double dZz835 = zzxsZzN93.zzZBA.zz83();
                        if (i5 == this.zzZuE.size() - i) {
                            if (z2 && !com.aspose.words.internal.zzAN.zzL(dZz834, dZz83)) {
                                z = false;
                            }
                            if (!com.aspose.words.internal.zzAN.zzL(dZz835, dZz832)) {
                                z = false;
                            }
                            if (!z) {
                                break;
                            }
                        } else if (z2) {
                            if (!com.aspose.words.internal.zzAN.zzL(dZz834, dZz83)) {
                                z = false;
                            }
                            if (!com.aspose.words.internal.zzAN.zzL(dZz835, dZz833 + dZz83)) {
                            }
                            if (!z) {
                            }
                        } else {
                            if (!com.aspose.words.internal.zzAN.zzL(dZz835, dZz833)) {
                            }
                            if (!z) {
                            }
                        }
                    }
                    i5++;
                    i2 = i;
                    zIsVisible = z2;
                }
                z2 = zIsVisible;
                z = false;
                if (z) {
                    for (int i6 = 0; i6 < this.zzZuE.size(); i6++) {
                        ParagraphFormat paragraphFormat = zzNa(i6).getParagraphFormat();
                        if (z2) {
                            zzxv.zzQ(paragraphFormat.getBorders().getHorizontal());
                            paragraphFormat.getBorders().getHorizontal().zzZ4(dZz83);
                        }
                        this.zzZuF.zzZ(paragraphFormat.getBorders());
                        paragraphFormat.getBorders().getTop().zzZ4(dZz83);
                        paragraphFormat.getBorders().getBottom().zzZ4(dZz832);
                    }
                }
            }
        }
    }

    private void zzZZe() throws Exception {
        Paragraph paragraphZzNa = zzNa(0);
        if (!zzN9(0).isVisible() && (paragraphZzNa.getChildNodes(0, false).getCount() > 0 || !this.zzZuB)) {
            this.zzZuF.zzZ(paragraphZzNa.getParagraphFormat().getBorders());
            this.zzZuF.zzY(paragraphZzNa.getParagraphFormat().getBorders());
        }
        zzUE zzue = this.zzZuG;
        if (zzue != null) {
            zzue.zzZ((CompositeNode) paragraphZzNa, this.zzZuF);
        }
    }

    private void zzZZf() throws Exception {
        if (this.zzZuF.isVisible() && this.zzZuD.getPreferredWidth().equals(PreferredWidth.fromPercent(100.0d))) {
            if ((this.zzZuE.size() <= 0 || zzNa(0).zzYVe() == null) && !this.zzZuC.isVisible()) {
                for (int i = 0; i < this.zzZuD.getRows().getCount(); i++) {
                    this.zzZuF.zzZ(this.zzZuD.getRows().get(i).getRowFormat().getBorders());
                }
            }
        }
    }

    public final void zzZ(CompositeNode compositeNode, zzXS zzxs) {
        zzUE zzue = this;
        while (zzue != null && !zzue.zzZuF.zz7I()) {
            zzue = zzue.zzZuG;
        }
        if (zzue != null) {
            Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(compositeNode, Paragraph.class);
            if (paragraph != null) {
                zzue.zzZ(paragraph, zzxs);
                return;
            }
            Table table = (Table) com.aspose.words.internal.zzZKW.zzZ(compositeNode, Table.class);
            if (table != null) {
                zzue.zzZ(table, zzxs);
            }
        }
    }

    public final void zzZZg() throws Exception {
        if (this.zzZuF.zz7I()) {
            if (this.zzZuD == null && this.zzZuE.size() == 0) {
                return;
            }
            if (this.zzZuD != null && !this.zzZuB) {
                zzZZf();
            } else if (this.zzZuE.size() == 1) {
                zzZZe();
            } else {
                zzZZd();
            }
        }
    }

    private void zzZ(Paragraph paragraph, zzXS zzxs) {
        if (this.zzZuD != null) {
            return;
        }
        zzYMR zzymr = new zzYMR(paragraph, zzxs);
        int i = 0;
        while (i < this.zzZuE.size() && this.zzZuE.get(i).zzXGF != zzymr.zzXGF) {
            i++;
        }
        if (i < this.zzZuE.size()) {
            this.zzZuE.remove(i);
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZuE, zzymr);
    }

    private void zzZ(Table table, zzXS zzxs) {
        Table table2 = this.zzZuD;
        if (table2 == null) {
            this.zzZuD = table;
            this.zzZuC = zzxs;
        } else {
            if (this.zzZuB || table.zzYF(table2)) {
                return;
            }
            this.zzZuB = true;
        }
    }
}
