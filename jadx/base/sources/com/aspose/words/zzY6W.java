package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6W extends DocumentVisitor {
    private boolean zz8U;
    private int zzU8;
    private boolean zzX6A;
    private boolean zzX6B;
    private boolean zzX6C;
    private boolean zzX6D;
    private boolean zzX6E;
    private boolean zzX6F;
    private int zzX6G;
    private int zzX6H;
    private ConditionalStyle[] zzX6I;
    private zzYEF zzX6J;
    private zzYMX zzX6K;
    private zzWP zzX6L;
    private zzY6G zzX6M;
    private zzY6G zzX6N;
    private boolean zzX6m;
    private boolean zzX6p;
    private boolean zzX6q;
    private boolean zzX6r;
    private boolean zzX6s;
    private boolean zzX6t;
    private boolean zzX6u;
    private boolean zzX6v;
    private boolean zzX6w;
    private boolean zzX6x;
    private boolean zzX6y;
    private boolean zzX6z;
    private int zzXLP;
    private boolean zzXrK;
    private Theme zzYTf;
    private Table zzZzY;
    private static int[] zzX6P = {3900, 3010};
    private static int[] zzX6O = {5104, 4250, 5105, 4260};
    private static int zzX6g = 14;
    private int zzX6o = 1;
    private boolean zzX6n = false;
    private zzV6 zzX6l = new zzV6();
    private zzV8 zzX6k = new zzV8();
    private zzV7 zzX6j = new zzV7();
    private zzV5 zzX6i = new zzV5();
    private ArrayList<Node> zzX6h = new ArrayList<>();

    private static boolean zzVj(int i, int i2) {
        return (((i / i2) * i2) + i2) - 1 == i;
    }

    private static boolean zzVk(int i, int i2) {
        return (i / i2) * i2 == i;
    }

    private int zzXZv() {
        return this.zzX6D ? this.zzXLP - 1 : this.zzXLP;
    }

    private int zzXZw() {
        return (this.zzX6F || this.zzX6z) ? this.zzU8 - this.zzX6o : this.zzU8;
    }

    private static Object[] zzY(WordAttrCollection wordAttrCollection, int[] iArr) {
        Object[] objArr = new Object[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            objArr[i] = wordAttrCollection.zzPk(iArr[i]);
        }
        return objArr;
    }

    private void zzY4(Paragraph paragraph) throws Exception {
        zzYEF zzyef = (zzYEF) paragraph.getDocument().getStyles().zzY37().zzbn();
        zzyef.zzbl();
        this.zzX6J.zzY(zzyef);
        this.zzX6i.zzZ(this, zzyef);
        paragraph.zzYp5().zzR((WordAttrCollection) paragraph.zzYp5().zzbn());
        zzZ7R.zzZ(paragraph, zzyef, !paragraph.zzYp5().zz6D() ? 72 : 64);
        if (zzyef.zz6D()) {
            zzYEF zzyef2 = (zzYEF) zzyef.zzYsN().zzZ6C();
            zzZ7R.zzZ(paragraph, zzyef2, 72);
            zzyef2.zzX(paragraph.zzYp5());
            zzyef2.zzbm();
        }
        paragraph.zzC(zzyef);
    }

    private void zzY5(Paragraph paragraph) throws Exception {
        zzYMX zzymx = new zzYMX();
        this.zzX6K.zzY(zzymx);
        this.zzX6j.zzZ(this, zzymx);
        paragraph.zzZYj().zzR((WordAttrCollection) paragraph.zzZYj().zzbn());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Paragraph>) this.zzX6h, paragraph);
        paragraph.zzY(zzymx, 0);
        paragraph.zzZ(zzymx);
    }

    private static void zzZ(WordAttrCollection wordAttrCollection, Object[] objArr, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            Object obj = objArr[i];
            if (obj != null) {
                wordAttrCollection.zzQ(i2, obj);
            }
        }
    }

    private void zzkh(int i) {
        boolean z = (i & 32) != 0;
        this.zzX6F = z;
        boolean z2 = (i & 64) != 0;
        this.zzX6E = z2;
        boolean z3 = (i & 128) != 0;
        this.zzX6D = z3;
        boolean z4 = (i & 256) != 0;
        this.zzX6C = z4;
        this.zzX6B = (i & 512) != 0 && this.zzX6H > 0;
        this.zzX6A = (i & 1024) != 0 && this.zzX6G > 0;
        this.zzX6y = z && z3;
        this.zzX6x = z && z4;
        this.zzX6w = z2 && z3;
        this.zzX6v = z2 && z4;
        if (this.zzZzY.getDocument().zzYBa().getCompatibilityOptions().getUseWord2002TableStyleRules()) {
            this.zzX6y = false;
        }
        boolean z5 = this.zzX6F;
        ConditionalStyle[] conditionalStyleArr = this.zzX6I;
        this.zzX6F = z5 & (conditionalStyleArr[1] != null);
        this.zzX6E &= conditionalStyleArr[3] != null;
        this.zzX6D &= conditionalStyleArr[2] != null;
        this.zzX6C &= conditionalStyleArr[4] != null;
    }

    private void zzy(Run run) throws Exception {
        zzYEF zzyef = (zzYEF) run.getDocument().getStyles().zzY37().zzbn();
        zzyef.zzbl();
        this.zzX6J.zzY(zzyef);
        this.zzX6i.zzZ(this, zzyef);
        run.zzZYh().zzR((WordAttrCollection) run.zzZYh().zzbn());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Run>) this.zzX6h, run);
        int i = this.zzX6m ? 68 : 64;
        if (!run.zzZYh().zz6D()) {
            i |= 8;
        }
        zzZ7R.zzZ(run, zzyef, i);
        if (zzyef.zz6D()) {
            zzYEF zzyef2 = (zzYEF) zzyef.zzYsN().zzZ6C();
            zzZ7R.zzZ(run, zzyef2, i | 8);
            zzyef2.zzX(run.zzZYh());
            zzyef2.zzbm();
        }
        run.zzZ(zzyef);
    }

    public final boolean isFirstRow() {
        return this.zz8U;
    }

    public final boolean isLastRow() {
        return this.zzXrK;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellEnd(Cell cell) {
        this.zzXLP++;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) throws Exception {
        this.zzX6s = cell.isFirstCell();
        this.zzX6r = cell.isLastCell();
        if (this.zzX6A) {
            this.zzX6q = zzVk(zzXZv(), this.zzX6G);
            this.zzX6p = zzVj(zzXZv(), this.zzX6G);
        }
        zzWP zzwp = new zzWP();
        this.zzX6L.zzY((zzZS) zzwp);
        this.zzX6k.zzZ(this, zzwp);
        cell.zz6G().zzY((zzZS) zzwp);
        zzwp.zzR((WordAttrCollection) cell.zz6G().zzbn());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Cell>) this.zzX6h, cell);
        cell.zzZ(zzwp);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        if (fieldEnd.getFieldType() == 13) {
            this.zzX6m = false;
        }
        return super.visitFieldEnd(fieldEnd);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) throws Exception {
        if (fieldStart.getFieldType() == 13) {
            this.zzX6m = true;
        }
        return super.visitFieldStart(fieldStart);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        if (paragraph.zzYBd().getNodeType() != 7) {
            return 1;
        }
        zzY5(paragraph);
        zzY4(paragraph);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowEnd(Row row) {
        this.zzU8++;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) throws Exception {
        this.zz8U = !this.zzX6n && (((Boolean) row.fetchRowAttr(4040)).booleanValue() || row.isFirstRow());
        this.zzXrK = row.isLastRow();
        boolean z = this.zz8U;
        if (!z) {
            this.zzX6n = true;
        }
        if (z) {
            this.zzX6o = this.zzU8 + 1;
        }
        if (this.zzX6B) {
            this.zzX6u = zzVk(zzXZw(), this.zzX6H);
            this.zzX6t = zzVj(zzXZw(), this.zzX6H);
        }
        this.zzXLP = 0;
        this.zzX6s = false;
        this.zzX6r = false;
        zzY6G zzy6g = new zzY6G();
        this.zzX6N.zzY(zzy6g);
        this.zzX6M.zzY(zzy6g);
        this.zzX6l.zzZ(this, zzy6g);
        zzy6g.remove(4520);
        row.zzZYf().zzY(zzy6g);
        zzy6g.zzR((WordAttrCollection) row.zzZYf().zzbn());
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Row>) this.zzX6h, row);
        row.zzZ(zzy6g);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        zzy(run);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) {
        Row firstRow;
        TableStyle tableStyle;
        this.zzX6o = 1;
        this.zzX6n = false;
        if (table != this.zzZzY || (firstRow = table.getFirstRow()) == null || (tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(firstRow.getDocument().getStyles().zzVp(firstRow.zzZYf().zzZ7j(), 11), TableStyle.class)) == null) {
            return 1;
        }
        this.zzX6N = tableStyle.zzXWU();
        this.zzX6M = tableStyle.zzXWT();
        this.zzX6L = tableStyle.zzXWS();
        this.zzX6K = tableStyle.zzqw(0);
        this.zzX6J = tableStyle.zzl1(0);
        ArrayList<Integer> arrayList = new ArrayList();
        for (TableStyle tableStyle2 = tableStyle; tableStyle2 != null; tableStyle2 = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(tableStyle2.zzY3j(), TableStyle.class)) {
            for (ConditionalStyle conditionalStyle : tableStyle2.getConditionalStyles().zzZY9()) {
                if (!arrayList.contains(Integer.valueOf(conditionalStyle.zzZYk()))) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(conditionalStyle.zzZYk()));
                }
            }
        }
        this.zzX6I = new ConditionalStyle[zzX6g];
        for (Integer num : arrayList) {
            this.zzX6I[num.intValue()] = tableStyle.zzjP(num.intValue());
        }
        this.zzX6H = this.zzX6N.zzXXt();
        this.zzX6G = this.zzX6N.zzXXs();
        this.zzX6z = firstRow.zzYki() && this.zzX6I[1] != null;
        zzkh(firstRow.zzZYf().getStyleOptions());
        this.zzU8 = 0;
        return 0;
    }

    public final void zz6(Table table) throws Exception {
        this.zzZzY = table;
        this.zzYTf = table.getDocument().zzZqI();
        table.accept(this);
    }

    public final boolean zzXZA() {
        return this.zzX6q;
    }

    public final boolean zzXZB() {
        return this.zzX6t;
    }

    public final boolean zzXZC() {
        return this.zzX6u;
    }

    public final boolean zzXZD() {
        return this.zzX6r;
    }

    public final boolean zzXZE() {
        return this.zzX6s;
    }

    public final boolean zzXZF() {
        return this.zzX6v && this.zzXrK && this.zzX6r;
    }

    public final boolean zzXZG() {
        return this.zzX6w && this.zzXrK && this.zzX6s;
    }

    public final boolean zzXZH() {
        return this.zzX6x && this.zz8U && this.zzX6r;
    }

    public final boolean zzXZI() {
        return this.zzX6y && this.zz8U && this.zzX6s;
    }

    public final boolean zzXZJ() {
        return (!this.zzX6A || zzXZO() || zzXZN()) ? false : true;
    }

    public final boolean zzXZK() {
        return (!this.zzX6B || zzXZM() || zzXZL()) ? false : true;
    }

    public final boolean zzXZL() {
        return this.zzX6E && this.zzXrK;
    }

    public final boolean zzXZM() {
        return this.zzX6F && this.zz8U;
    }

    public final boolean zzXZN() {
        return this.zzX6C && this.zzX6r;
    }

    public final boolean zzXZO() {
        return this.zzX6D && this.zzX6s;
    }

    public final void zzXZP() {
        for (Node node : this.zzX6h) {
            int nodeType = node.getNodeType();
            if (nodeType == 6) {
                Row row = (Row) node;
                zzY6G zzy6g = (zzY6G) row.zzZYf().zzXS2().zzbn();
                Object[] objArrZzY = zzY(row.zzZYf(), zzX6O);
                row.zzZ(zzy6g);
                zzZ(row.zzZYf(), objArrZzY, zzX6O);
            } else if (nodeType == 7) {
                Cell cell = (Cell) node;
                zzWP zzwp = (zzWP) cell.zz6G().zzXS2().zzbn();
                Object[] objArrZzY2 = zzY(cell.zz6G(), zzX6P);
                cell.zzZ(zzwp);
                zzZ(cell.zz6G(), objArrZzY2, zzX6P);
            } else if (nodeType == 8) {
                Paragraph paragraph = (Paragraph) node;
                paragraph.zzZ((zzYMX) paragraph.zzZYj().zzXS2().zzbn());
                paragraph.zzC((zzYEF) paragraph.zzYp5().zzXS2().zzbn());
            } else if (nodeType == 21) {
                Run run = (Run) node;
                run.zzZ((zzYEF) run.zzZYh().zzXS2().zzbn());
            }
        }
        this.zzX6h.clear();
    }

    public final int zzXZt() {
        return com.aspose.words.internal.zzAN.zzZP((long) (zzXZv() / this.zzX6G)) ? 8 : 6;
    }

    public final int zzXZu() {
        return com.aspose.words.internal.zzAN.zzZP((long) (zzXZw() / this.zzX6H)) ? 7 : 5;
    }

    public final int zzXZx() {
        return this.zzX6G;
    }

    public final int zzXZy() {
        return this.zzX6H;
    }

    public final boolean zzXZz() {
        return this.zzX6p;
    }

    public final ConditionalStyle zzkg(int i) {
        return this.zzX6I[i];
    }
}
