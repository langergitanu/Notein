package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZM extends DocumentVisitor {
    private com.aspose.words.internal.zzDB zzWTb;
    private int zzYlk = 1;

    private static int zzc(Row row) {
        int iZz5q = 0;
        for (Cell firstCell = row.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
            iZz5q += firstCell.zz6G().zz5q();
        }
        return iZz5q;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) {
        if (table.getFirstRow() == null) {
            return 1;
        }
        zzY6U zzy6uZzXXf = table.zzZYf().zzXXf();
        com.aspose.words.internal.zzDB zzdbZzXZp = (zzy6uZzXXf == null || zzy6uZzXXf.getState() != 2) ? (com.aspose.words.internal.zzDB) table.zzZYf().zzPk(5103) : zzy6uZzXXf.zzXZp();
        int count = zzdbZzXZp != null ? zzdbZzXZp.getCount() : zzc(table.getFirstRow());
        if (count > this.zzYlk) {
            this.zzYlk = count;
            this.zzWTb = zzdbZzXZp;
        }
        return 1;
    }

    public final double[] zzA(Iterable<Node> iterable) throws Exception {
        Section section = null;
        for (Node node : iterable) {
            node.accept(this);
            if (section == null) {
                section = (Section) node.getParentNode();
            }
        }
        double dZzYRX = section.getPageSetup().zzYRX();
        int i = 0;
        if (this.zzWTb == null) {
            int i2 = this.zzYlk;
            double[] dArr = new double[i2];
            double d = dZzYRX / ((double) i2);
            while (i < this.zzYlk) {
                dArr[i] = d;
                i++;
            }
            return dArr;
        }
        ArrayList arrayList = new ArrayList(this.zzWTb.getCount() + 1);
        double d2 = 0.0d;
        for (int i3 = 0; i3 < this.zzWTb.getCount(); i3++) {
            double d3 = ((double) this.zzWTb.get(i3)) / 20.0d;
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Double>) arrayList, Double.valueOf(d3));
            d2 += d3;
        }
        if (d2 / dZzYRX < 0.95d) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<Double>) arrayList, Double.valueOf(dZzYRX - d2));
        }
        double[] dArr2 = new double[arrayList.size()];
        while (i < arrayList.size()) {
            dArr2[i] = ((Double) arrayList.get(i)).doubleValue();
            i++;
        }
        return dArr2;
    }
}
