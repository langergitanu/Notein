package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJY {
    private zzZK1 zzYte;
    private Paragraph zzYtf;
    private boolean zzZ5I;
    private boolean zzZr1;
    private DocumentBuilder zzZwh;
    private static int[] zzYtg = {2, 4, 6, 8, 12, 18, 24, 36, 48};
    private static int[] zzYt9 = {3, 2, 0, 1};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("body", "blockquote");
    private com.aspose.words.internal.zzZQC<zzZK1> zzYtd = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<zzRV> zzYtc = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzD3<Object> zzYtb = new com.aspose.words.internal.zzD3<>();
    private com.aspose.words.internal.zzIM<Paragraph> zzYta = new com.aspose.words.internal.zzIM<>();

    public zzZJY(boolean z, boolean z2) {
        this.zzZ5I = z;
        this.zzZr1 = z2;
    }

    private com.aspose.words.internal.zzD7 zzA(Table table) {
        com.aspose.words.internal.zzD7 zzd7 = new com.aspose.words.internal.zzD7();
        int iZzYps = table.getFirstRow() != null ? table.getFirstRow().zzZYf().zzYps() : 0;
        while (true) {
            zzZK1 zzzk1ZzA5 = zzA5(iZzYps);
            if (zzzk1ZzA5 == null) {
                return zzd7;
            }
            zzd7.zzVF(iZzYps);
            iZzYps = zzzk1ZzA5.getParentId();
        }
    }

    private zzZK1 zzA5(int i) {
        if (i == 0) {
            return null;
        }
        zzZK1 zzzk1ZzA8 = zzA8(i);
        if (zzzk1ZzA8 != null) {
            return zzzk1ZzA8;
        }
        for (zzZK1 zzzk1 : this.zzYtd) {
            if (zzzk1.getId() == i) {
                return zzzk1;
            }
        }
        return null;
    }

    private zzZK1 zzA8(int i) {
        return this.zzZwh.getDocument().zzZq2().zzA8(i);
    }

    private static int zzL2(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            return iZzTP != 1 ? 0 : 1;
        }
        return 2;
    }

    private void zzU(zzZK1 zzzk1) {
        this.zzZwh.getDocument().zzZq2().zzZ(zzzk1);
    }

    private boolean zzV(String str, zzPS zzps) {
        return !this.zzZ5I && zzL5.zzZ(str, zzps, this.zzZr1);
    }

    private static double zzWZ(double d) {
        double d2;
        int iZzs = com.aspose.words.internal.zzSA.zzs(d);
        int i = 0;
        int i2 = zzYtg[0];
        if (iZzs > i2) {
            while (true) {
                int[] iArr = zzYtg;
                if (i >= iArr.length - 1) {
                    d2 = iArr[iArr.length - 1];
                    break;
                }
                int i3 = iArr[i];
                i++;
                if (iZzs < (iArr[i] + i3) / 2) {
                    d2 = i3;
                    break;
                }
            }
        } else {
            d2 = i2;
        }
        return d2 / 8.0d;
    }

    private boolean zzY(Table table, Table table2) {
        com.aspose.words.internal.zzD7 zzd7ZzA = zzA(table);
        com.aspose.words.internal.zzD7 zzd7ZzA2 = zzA(table2);
        if (zzd7ZzA.getCount() == 0 && zzd7ZzA2.getCount() == 0) {
            return true;
        }
        return zzd7ZzA2.getCount() > zzd7ZzA.getCount() || (zzd7ZzA2.getCount() == zzd7ZzA.getCount() && (zzd7ZzA.getCount() > 0 && zzd7ZzA2.getCount() > 0 && zzd7ZzA.zzCR() == zzd7ZzA2.zzCR()));
    }

    private zzZK1 zzZ48() {
        zzZK1 zzzk1Pop = this.zzYtd.pop();
        this.zzYtc.pop();
        return zzzk1Pop;
    }

    private boolean zzZ49() {
        Paragraph paragraph = this.zzYtf;
        if (paragraph != null && paragraph.zzZYj().zzYps() != 0) {
            zzZK1 zzzk1ZzA8 = zzA8(this.zzYtf.zzZYj().zzYps());
            while (zzzk1ZzA8 != null) {
                if (zzzk1ZzA8.zzZ4j() == 2) {
                    return true;
                }
                zzzk1ZzA8 = zzA8(zzzk1ZzA8.getParentId());
            }
        }
        return false;
    }

    private int zzZ4a() {
        while (true) {
            int iAbs = Math.abs(com.aspose.words.internal.zzZZS.zzY(new Object[0]).hashCode());
            if (iAbs != 0 && !this.zzYtb.zzVE(iAbs)) {
                this.zzYtb.add(iAbs, null);
                return iAbs;
            }
        }
    }

    private zzZK1 zzZ4b() {
        return new zzZK1(zzZ4a());
    }

    private boolean zzZ4c() {
        return this.zzZwh.getCurrentParagraph().zzYoV() && this.zzZwh.getCurrentParagraph().getParentStory() != null && this.zzZwh.getCurrentParagraph().getParentStory().getNodeType() == 3 && this.zzZwh.getCurrentParagraph().getParentStory().getCount() == 1;
    }

    private boolean zzZ4d() {
        return this.zzYtd.size() > 0;
    }

    private void zzf(Paragraph paragraph) {
        this.zzYtc.size();
        this.zzYtc.peek().zzY(paragraph.getParagraphFormat().getShading());
    }

    public final void zzB(Table table) {
        Table table2;
        if (table == null || (table2 = (Table) com.aspose.words.internal.zzZKW.zzZ(table.zzYB9(), Table.class)) == null || !zzY(table2, table)) {
            return;
        }
        Paragraph paragraph = new Paragraph(this.zzZwh.getDocument());
        paragraph.zzYp5().zzZ(zzZU.zzZF6);
        table2.zzYD(paragraph);
        int iZzYps = table.getFirstRow() != null ? table.getFirstRow().zzZYf().zzYps() : 0;
        if (iZzYps != 0) {
            paragraph.zzZYj().zzqF(iZzYps);
        }
    }

    public final void zzC(Table table) {
        if (this.zzZ5I || !zzZ4d() || table.getFirstRow() == null) {
            return;
        }
        zzZK1 zzzk1Peek = this.zzYtd.peek();
        Iterator<T> it = table.getRows().iterator();
        while (it.hasNext()) {
            ((Row) it.next()).zzZYf().zzqF(zzzk1Peek.getId());
        }
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(table.getNextSibling(), Paragraph.class);
        if (paragraph != null) {
            zzZ(paragraph, zzzk1Peek, false);
        }
    }

    public final void zzT(DocumentBuilder documentBuilder) {
        this.zzZwh = documentBuilder;
        documentBuilder.getCurrentParagraph();
        Paragraph currentParagraph = this.zzZwh.getCurrentParagraph();
        boolean zZzZ4c = zzZ4c();
        if (zZzZ4c && currentParagraph.getParentSection() == this.zzZwh.getDocument().getFirstSection() && !this.zzZr1) {
            return;
        }
        this.zzYtf = currentParagraph;
        if (this.zzZ5I) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.zzYtf.getDocument().zzZq2().getCount(); i++) {
            this.zzYtb.add(this.zzZwh.getDocument().zzZq2().zzA7(i).getId(), null);
        }
        if (!this.zzZr1) {
            this.zzYte = zzZ4b();
            if (this.zzYtf.getCount() == 0 && this.zzYtf.getParentStory() != null && this.zzYtf.getParentStory().getNodeType() == 4 && this.zzYtf.getParentStory().getCount() == 1) {
                z = true;
            }
            if (this.zzYtf.isInCell() || zZzZ4c || z) {
                this.zzYte.zzA9(2);
            } else {
                this.zzYte.setParentId(this.zzYtf.zzZYj().zzYps());
            }
            if (this.zzZwh.isAtStartOfParagraph()) {
                this.zzYtf.zzZYj().zzqF(this.zzYte.getId());
            }
        }
        if (this.zzZr1) {
            this.zzYtf = null;
        } else {
            zzZ(this.zzYte, new zzRV((zzPT) null));
        }
    }

    public final void zzVv(boolean z) {
        Paragraph paragraph;
        zzZK1 zzzk1 = this.zzYte;
        if (zzzk1 != null && !this.zzZr1) {
            zzU(zzzk1);
            this.zzYte = null;
        }
        Paragraph currentParagraph = this.zzZwh.getCurrentParagraph();
        if (currentParagraph.isInCell() || currentParagraph == (paragraph = this.zzYtf)) {
            return;
        }
        if (this.zzZ5I && paragraph != null && paragraph.zzZYj().zzYps() != 0) {
            currentParagraph.zzZYj().zzqF(this.zzYtf.zzZYj().zzYps());
        }
        if (this.zzZ5I) {
            return;
        }
        if (!zzZ4d()) {
            currentParagraph.zzZYj().remove(1585);
        } else {
            zzZ(currentParagraph, this.zzYtd.peek(), z);
            zzf(currentParagraph);
        }
    }

    public final boolean zzZ(String str, zzPS zzps, int i) {
        if (!zzV(str, zzps)) {
            return false;
        }
        zzZK1 zzzk1ZzZ4b = zzZ4b();
        zzzk1ZzZ4b.zzA9(zzL2(str));
        if (zzZ4d()) {
            zzZK1 zzzk1Peek = this.zzYtd.peek();
            zzzk1ZzZ4b.setParentId(zzzk1Peek.getId());
            if (zzzk1ZzZ4b.zzZ4j() == 2) {
                zzzk1ZzZ4b.setParentId(zzzk1Peek.getParentId());
                zzZ48();
                this.zzYte = null;
                if (zzZ49()) {
                    zzzk1ZzZ4b.zzA9(0);
                }
            }
        }
        zzZ(zzzk1ZzZ4b, new zzRV(zzps));
        zzZ(zzps, zzzk1ZzZ4b.zzZYj());
        zzY(zzps, zzzk1ZzZ4b.zzZYj());
        if (i == 1) {
            this.zzZwh.getCurrentParagraph().zzZYj().zzqF(zzzk1ZzZ4b.getId());
            if (this.zzYtf == this.zzZwh.getCurrentParagraph()) {
                this.zzYtf = null;
            }
        }
        return true;
    }

    public final void zzg(Paragraph paragraph) {
        if (this.zzZ5I) {
            return;
        }
        this.zzYta.add(paragraph);
    }

    private void zzV(zzZK1 zzzk1) {
        if (zzzk1.getParentId() != 0) {
            for (zzZK1 zzzk12 : this.zzYtd) {
                if (zzA8(zzzk12.getId()) == null) {
                    zzU(zzzk12);
                }
                if (zzzk12.getParentId() == 0) {
                    return;
                }
            }
        }
    }

    private static void zzY(zzPS zzps, zzYMX zzymx) {
        zzZ(zzps, "margin-left", 1592, zzymx);
        zzZ(zzps, "margin-right", 1593, zzymx);
        zzZ(zzps, "margin-top", 1594, zzymx);
        zzZ(zzps, "margin-bottom", 1595, zzymx);
    }

    public final void zzZ(String str, zzPS zzps, zzZK3 zzzk3) {
        if (zzV(str, zzps)) {
            zzZ4d();
            zzZK1 zzzk1ZzZ48 = zzZ48();
            boolean z = false;
            for (Paragraph currentParagraph = this.zzZwh.getCurrentParagraph(); currentParagraph.zzZYj().zzYps() == zzzk1ZzZ48.getId(); currentParagraph = (Paragraph) currentParagraph.getPreviousSibling()) {
                if (currentParagraph.zzYoV() && zzzk3.isEmpty() && ((currentParagraph.getPreviousSibling() == null || currentParagraph.getPreviousSibling().getNodeType() != 5) && !this.zzYta.contains(currentParagraph))) {
                    currentParagraph.zzZYj().remove(1585);
                } else {
                    z = true;
                }
                if (currentParagraph.getPreviousSibling() == null || currentParagraph.getPreviousSibling().getNodeType() != 8) {
                    break;
                }
            }
            if (z) {
                zzU(zzzk1ZzZ48);
                if (zzzk1ZzZ48.getParentId() != 0) {
                    zzV(zzzk1ZzZ48);
                }
            }
        }
    }

    private static void zzZ(Paragraph paragraph, zzZK1 zzzk1, boolean z) {
        paragraph.zzZYj().zzQ(1585, Integer.valueOf(zzzk1.getId()));
        if (z) {
            paragraph.zzZYj().remove(1360);
            paragraph.zzZYj().remove(1380);
            paragraph.zzZYj().remove(1350);
            paragraph.zzZYj().remove(1370);
            paragraph.zzZYj().remove(1160);
            paragraph.zzZYj().remove(EditingLanguage.BRETON);
            if (paragraph.isListItem()) {
                return;
            }
            paragraph.zzZYj().remove(1200);
            paragraph.zzZYj().remove(1220);
        }
    }

    private static void zzZ(zzPS zzps, zzYMX zzymx) {
        for (int i : zzYt9) {
            zzZ(zzps, zzymx, i);
        }
    }

    private static void zzZ(zzPS zzps, zzYMX zzymx, int i) {
        String str;
        zzRL zzrlZzZ = zzRL.zzZ(zzps, i);
        if (zzrlZzZ.getLineStyle() != 0 && !com.aspose.words.internal.zzPV.zzZ(zzrlZzZ.zz8Q(), com.aspose.words.internal.zzPV.zzI0)) {
            zzZ(zzps, zzymx, zzrlZzZ, i);
            return;
        }
        if (i == 0) {
            str = "border-bottom-color";
        } else if (i == 1) {
            str = "border-left-color";
        } else if (i == 2) {
            str = "border-right-color";
        } else if (i != 3) {
            return;
        } else {
            str = "border-top-color";
        }
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx != null) {
            zzMP zzmpZzZWj = zzptZzSx.zzZWj();
            if (zzmpZzZWj.zzZVx().getValueType() == 2) {
                com.aspose.words.internal.zzPV zzpvZzZWw = ((zzQC) zzmpZzZWj.zzZVx()).zzZWw();
                Border border = new Border();
                border.zzm(zzpvZzZWw);
                zzZ(zzymx, border, i);
            }
        }
    }

    private static void zzZ(zzYMX zzymx, Border border, int i) {
        if (i == 0) {
            zzymx.zzQ(1370, border);
            return;
        }
        if (i == 1) {
            zzymx.zzQ(1360, border);
        } else if (i == 2) {
            zzymx.zzQ(1380, border);
        } else {
            if (i != 3) {
                return;
            }
            zzymx.zzQ(1350, border);
        }
    }

    private static void zzZ(zzPS zzps, zzYMX zzymx, zzRL zzrl, int i) {
        Border borderZz5z;
        String str;
        zzPT zzptZzSx;
        if (i == 0) {
            borderZz5z = zzymx.zz5z();
            str = "padding-bottom";
        } else if (i == 1) {
            borderZz5z = zzymx.zz5y();
            str = "padding-left";
        } else if (i == 2) {
            borderZz5z = zzymx.zz5x();
            str = "padding-right";
        } else {
            if (i != 3) {
                return;
            }
            borderZz5z = zzymx.zz5A();
            str = "padding-top";
        }
        if (Border.zzZCe.equals(borderZz5z)) {
            borderZz5z = new Border();
            zzZ(zzymx, borderZz5z, i);
        }
        borderZz5z.zzOV(zzrl.getLineStyle());
        borderZz5z.zzm(zzrl.zz8Q());
        borderZz5z.zzZ5(zzWZ(zzrl.getLineWidth()));
        if (borderZz5z.getLineStyle() == 0 || (zzptZzSx = zzps.zzSx(str)) == null) {
            return;
        }
        if (zzptZzSx.zzZWj().zzZVx().getValueType() == 4) {
            borderZz5z.zzZ4((int) Math.round(((zzOI) r3.zzZVx()).zzZVW()));
        }
    }

    private static void zzZ(zzPS zzps, String str, int i, zzYMX zzymx) {
        double dZzr;
        if ("auto".equals(zzps.zzSF(str))) {
            dZzr = 0.0d;
        } else {
            double dZzSH = zzps.zzSH(str);
            if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
                dZzr = Math.min(500.0d, zzps.zzSC(str));
            } else {
                dZzr = com.aspose.words.internal.zzSA.zzr(dZzSH);
            }
        }
        if (com.aspose.words.internal.zzAN.zzZC(dZzr)) {
            return;
        }
        boolean z = ("margin-top".equals(str) || "margin-bottom".equals(str)) ? false : true;
        if (com.aspose.words.internal.zzAN.zzJ(dZzr, 0.0d) || z) {
            zzymx.zzQ(i, Integer.valueOf(Math.min(("margin-left".equals(str) || "margin-right".equals(str)) ? 21600 : 18928, com.aspose.words.internal.zzAN.zzZG(dZzr))));
        }
    }

    private void zzZ(zzZK1 zzzk1, zzRV zzrv) {
        this.zzYtd.push(zzzk1);
        this.zzYtc.push(zzrv);
    }
}
