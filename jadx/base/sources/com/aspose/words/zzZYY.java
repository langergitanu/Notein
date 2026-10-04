package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYY {
    private boolean zzYRN;
    private zzYMP zzYRO;
    private zzZN7 zzYRP;
    private zzYCW zzYRQ;
    private zzY8R zzYRR;
    private zzLS zzYRS;
    private Document zzZEY;

    public zzZYY(Document document, zzLS zzls, boolean z) {
        this.zzZEY = document;
        this.zzYRS = zzls;
        this.zzYRO = new zzYMN();
        this.zzYRP = new zzZN5(this.zzZEY.zzZqy(), z);
        this.zzYRR = new zzY8P(this.zzZEY, this.zzYRS, this.zzYRO, this.zzYRP, z);
        this.zzYRQ = new zzYCU(this.zzZEY, this.zzYRS);
        this.zzYRN = true;
    }

    private static int zz5(int i, boolean z) {
        if (z) {
            if (i == 0) {
                return 2;
            }
            if (i == 2) {
                return 0;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzV(Table table) throws Exception {
        int i = 0;
        int i2 = this.zzYRS.zzZUu().zzYr9.zzYr7 == 2 ? 2 : 0;
        zzPT zzptZzZUg = this.zzYRS.zzZUg();
        if (zzptZzZUg == null) {
            i = i2;
        } else if (!zzptZzZUg.zzZWj().zzP(zzL4.zzZmy)) {
            if (zzptZzZUg.zzZWj().zzP(zzL4.zzZmx)) {
                i = 2;
            } else if (zzptZzZUg.zzZWj().zzP(zzL4.zzZmw)) {
                i = 1;
            }
        }
        int iZz5 = zz5(i, table.getBidi());
        if (table.getAlignment() != iZz5) {
            table.setAlignment(iZz5);
        }
    }

    private static void zzY(zzPS zzps, Table table) throws Exception {
        double dZzSH = zzps.zzSH("border-spacing");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            dZzSH = 0.0d;
        }
        zzPT zzptZzSx = zzps.zzSx("border-collapse");
        boolean z = zzptZzSx == null || zzptZzSx.zzZWj().zzP(zzL4.zzZm0);
        if (!com.aspose.words.internal.zzAN.zzZD(dZzSH) || z) {
            table.setCellSpacing(dZzSH / 2.0d);
        }
    }

    public final void zzL(Paragraph paragraph) throws Exception {
        if (this.zzYRS.isEmpty()) {
            return;
        }
        this.zzYRS.zzZUU();
        zzZ(paragraph.getParagraphFormat());
        if (this.zzYRN) {
            paragraph.zzYp4();
        }
        this.zzYRS.zzZUS();
    }

    public final void zzW(Shape shape) throws Exception {
        zzR1.zzZ(this.zzYRS.zzZUC(), shape);
        Iterator<zzPT> it = this.zzYRS.zzZUC().iterator();
        while (it.hasNext()) {
            ((zzQ4) it.next()).zzW(shape);
        }
        zzMT.zzZ(this.zzYRS.zzZUC(), shape, this.zzYRS.zzZUx());
    }

    public final void zzX(Section section) {
        this.zzYRQ.zzB(section);
    }

    public final zzZLL zzYd(int i, int i2) {
        return this.zzYRS.zzYd(i, i2);
    }

    public final void zzZ(zzZAS zzzas, boolean z) {
        this.zzYRS.zzZ(zzzas, z);
    }

    public final zzZV8 zzZUA() {
        return this.zzYRS.zzZUA();
    }

    public final zzPS zzZUB() {
        return this.zzYRS.zzZUB();
    }

    public final zzPS zzZUC() {
        return this.zzYRS.zzZUC();
    }

    public final int zzZUF() {
        return this.zzYRS.zzZUF();
    }

    public final zzYB5 zzZUG() {
        return this.zzYRS.zzZUG();
    }

    public final int zzZUH() {
        return this.zzYRS.zzZUH();
    }

    public final String zzZUI() {
        return this.zzYRS.zzZUI();
    }

    public final int zzZUJ() {
        return this.zzYRS.zzZUJ();
    }

    public final boolean zzZUK() {
        return this.zzYRS.zzZUK();
    }

    public final boolean zzZUL() {
        return this.zzYRS.zzZUL();
    }

    public final boolean zzZUM() {
        return this.zzYRS.zzZUM();
    }

    public final boolean zzZUN() {
        return this.zzYRS.zzZUN();
    }

    public final boolean zzZUO() {
        return this.zzYRS.zzZUO();
    }

    public final com.aspose.words.internal.zzY5 zzZUP() {
        return this.zzYRS.zzZUP();
    }

    public final boolean zzZUQ() {
        return this.zzYRS.zzZUQ();
    }

    public final zzPS zzZUh() {
        return this.zzYRS.zzZUh();
    }

    public final int zzZUt() {
        return this.zzYRS.zzZUt();
    }

    public final boolean zzZUv() {
        return this.zzYRS.zzZUv();
    }

    public final zzZAS zzZUw() {
        return this.zzYRS.zzZUw();
    }

    public final zzQN zzZUx() {
        return this.zzYRS.zzZUx();
    }

    public final int zzZUy() {
        return this.zzYRS.zzZUy();
    }

    public final zzZV8 zzZUz() {
        return this.zzYRS.zzZUz();
    }

    public final void zzZVt() {
        this.zzYRS.zzZVt();
    }

    public final Style zzZpe() {
        return this.zzYRR.zzZpe();
    }

    public final boolean zzZpf() {
        int iZzZUt = this.zzYRS.zzZUt();
        return iZzZUt == 1 || iZzZUt == 3 || iZzZUt == 5 || iZzZUt == 7;
    }

    public final void zzZpg() {
        this.zzYRR.zzZpg();
    }

    public final void zzZph() throws Exception {
        this.zzYRR.zzZph();
    }

    public final void zzZpi() throws Exception {
        this.zzYRR.zzY2S();
        this.zzYRQ.zzYc8();
    }

    public final boolean zzh(int i, boolean z) {
        return this.zzYRS.zzh(i, z);
    }

    public final void zzX(Shape shape) throws Exception {
        if (this.zzYRS.isEmpty()) {
            return;
        }
        zzOX.zzW(this.zzYRS.zzZUC(), shape);
        zzOZ.zzW(this.zzYRS.zzZUC(), shape);
        zzOY.zzW(this.zzYRS.zzZUC(), shape);
        Iterator<zzPT> it = this.zzYRS.zzZUC().iterator();
        while (it.hasNext()) {
            ((zzQ4) it.next()).zzX(shape);
        }
    }

    public final void zzZ(Font font, Style style) throws Exception {
        if (this.zzYRS.isEmpty()) {
            return;
        }
        this.zzYRS.zzZUT();
        if (this.zzYRN) {
            zzYEF zzyef = new zzYEF();
            Font fontZzZ = Font.zzZ(zzyef, this.zzZEY);
            Style style2 = font.getStyle();
            if (style2.getStyleIdentifier() != 65) {
                fontZzZ.zzBl(style2.zzZ7j());
            }
            zzZ(fontZzZ);
            zzYEF zzyefZzl1 = style.zzl1(1);
            fontZzZ.getStyle().zzT(zzyefZzl1, 0);
            for (int i = 0; i < zzyef.getCount(); i++) {
                int iZzT3 = zzyef.zzT3(i);
                Object objZzPj = zzyefZzl1.zzPj(iZzT3);
                Object obj = zzyef.get(iZzT3);
                if (iZzT3 == 50 || objZzPj == null || !obj.equals(objZzPj)) {
                    font.zzZ7g().setRunAttr(iZzT3, obj);
                }
            }
        } else {
            zzZ(font);
        }
        this.zzYRS.zzZUS();
    }

    public zzZYY(Document document, int i, int i2, int i3, zzLS zzls, boolean z) {
        this.zzZEY = document;
        this.zzYRS = zzls;
        this.zzYRP = new zzZN6((i3 & 1) == 0, document.zzZqy());
        this.zzYRO = new zzYMO(z);
        this.zzYRR = new zzY8Q(this.zzZEY, this.zzYRS, i, i2, this.zzYRP, this.zzYRO);
        this.zzYRQ = new zzYCV(this.zzZEY, this.zzYRS);
        this.zzYRN = false;
    }

    public final void zzZ(Table table, zzRL zzrl, zzRL zzrl2) throws Exception {
        if (this.zzYRS.isEmpty()) {
            return;
        }
        Style styleZzkL = this.zzYRR.zzkL(3);
        if (styleZzkL != null) {
            Iterator<T> it = table.getRows().iterator();
            while (it.hasNext()) {
                ((Row) it.next()).zzZYf().zzQ(4005, Integer.valueOf(styleZzkL.zzZ7j()));
            }
        }
        if (styleZzkL != null && !styleZzkL.getBuiltIn()) {
            table.setStyleOptions(992);
        }
        table.setBidi(this.zzYRS.zzZUQ());
        zzV(table);
        zzY(this.zzYRS.zzZUC(), table);
        zzZ(this.zzYRS.zzZUC(), table);
        Iterator<zzPT> it2 = this.zzYRS.zzZUC().iterator();
        while (it2.hasNext()) {
            ((zzQ4) it2.next()).zzY(table);
        }
        zzKV.zzZ(this.zzYRS.zzZUC(), table, zzrl, zzrl2);
        zzZ(table, new zzRV(this.zzYRS.zzZUq().zzZjL()));
    }

    public final void zzZ(Document document, byte[] bArr) throws Exception {
        Iterator<zzPT> it = this.zzYRS.zzZUC().iterator();
        while (it.hasNext()) {
            ((zzQ4) it.next()).zzV(document);
        }
        zzZ(document, bArr, this.zzYRS.zzZUC().zzSx("background-image"));
    }

    private void zzZ(Font font) throws Exception {
        Style styleZzkL = this.zzYRR.zzkL(2);
        if (styleZzkL != null && !com.aspose.words.internal.zzZKO.zzA(font.getStyle(), styleZzkL)) {
            font.setStyle(styleZzkL);
        }
        this.zzYRP.zzZ(font, this.zzYRS);
    }

    private void zzZ(ParagraphFormat paragraphFormat) throws Exception {
        Style styleZzkL = this.zzYRR.zzkL(1);
        if (styleZzkL != null && !com.aspose.words.internal.zzZKO.zzA(paragraphFormat.getStyle(), styleZzkL)) {
            paragraphFormat.setStyle(styleZzkL);
        }
        this.zzYRO.zzZ(paragraphFormat, this.zzYRS);
    }

    private static void zzZ(Table table, zzRV zzrv) {
        Shading shading = new Shading();
        zzrv.zzY(shading);
        if (shading.isVisible()) {
            for (Row row : table.getRows()) {
                row.zzZYf().zzZ(shading.zzYbE());
                for (Cell cell : row.getCells()) {
                    if (!cell.zz6G().contains(3170)) {
                        cell.zz6G().zzZ(shading.zzYbE());
                    }
                }
            }
        }
    }

    private static void zzZ(Document document, byte[] bArr, zzPT zzpt) throws Exception {
        if (zzpt == null) {
            return;
        }
        zzpt.zzZWj().getCount();
        zzL4 zzl4ZzZVx = zzpt.zzZWj().zzZVx();
        if (zzl4ZzZVx.getValueType() == 6) {
            byte[] bArrZzYa = zzZGZ.zzYa(bArr);
            if (bArrZzYa != null) {
                if (document.getBackgroundShape() == null) {
                    document.setBackgroundShape(new Shape(document, 1));
                }
                document.getBackgroundShape().zzY9J().setImageBytes(bArrZzYa);
                document.getBackgroundShape().zzY9J().zzIc(2);
                return;
            }
            return;
        }
        if (zzl4ZzZVx.zzP(zzL4.zzZno)) {
            if (document.getBackgroundShape() == null || !document.getBackgroundShape().getFilled()) {
                document.zzO(null);
            }
        }
    }

    private static void zzZ(zzPS zzps, Table table) throws Exception {
        zzPT zzptZzSx = zzps.zzSx("margin-left");
        zzPT zzptZzSx2 = zzps.zzSx("margin-right");
        boolean z = zzptZzSx != null && zzptZzSx.zzZWj().zzP(zzL4.zzZng);
        boolean z2 = zzptZzSx2 != null && zzptZzSx2.zzZWj().zzP(zzL4.zzZng);
        if (z || z2) {
            table.setAlignment(zz5(z ? z2 ? 1 : 2 : 0, table.getBidi()));
        }
    }
}
