package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZ8 {
    public static void zzW(Table table) {
        if (!zzw(table) || table.getFirstRow() == null) {
            return;
        }
        zzY6Q zzy6qZz5 = zzY6Q.zz5(table);
        table.zzZYf().zzQ(5107, new zzY6S(zzy6qZz5.zzXYQ()));
        zzZ(table, zzy6qZz5);
    }

    private static void zzZ(Table table, zzY6Q zzy6q) {
        for (Row row : table.getRows()) {
            zzy6q.zzj(row);
            if (zzy6q.zzXYS() != row.zzZYf().zzYk9()) {
                if (zzy6q.zzXYS() != 0) {
                    row.zzZYf().zzph(zzy6q.zzXYS());
                } else {
                    row.zzZYf().remove(4250);
                }
            }
            if (zzy6q.zzYka() != row.zzZYf().zzYka()) {
                row.zzZYf().zzYka();
                row.zzZYf().zzQ(5104, Integer.valueOf(zzy6q.zzYka()));
            }
            for (Cell cell : row.getCells()) {
                int iZzXYT = zzy6q.zzXYT();
                if (iZzXYT == 0) {
                    cell.zz6G().getWidth();
                }
                cell.zz6G().zzOu(iZzXYT);
            }
            zzZ(row, zzy6q.zzXYR(), zzy6q.zzYk8());
        }
    }

    public static boolean zzw(Node node) {
        Document document = (Document) com.aspose.words.internal.zzZKW.zzZ(node.getDocument(), Document.class);
        if (document == null) {
            return false;
        }
        int originalLoadFormat = document.getOriginalLoadFormat();
        if (originalLoadFormat == 30) {
            return true;
        }
        switch (originalLoadFormat) {
        }
        return false;
    }

    private static void zzZ(Row row, int i, int i2) {
        zzY6G zzy6gZzZYf = row.zzZYf();
        if (i > 0) {
            zzy6gZzZYf.zzQ(5105, Integer.valueOf(Math.max(1, i2)));
            zzy6gZzZYf.zzYk7();
            zzy6gZzZYf.zzpf(i);
        } else {
            if (zzy6gZzZYf.zzYk8() != 0) {
                zzy6gZzZYf.zzQ(5105, 0);
            }
            if (zzy6gZzZYf.zzYk7() != 0) {
                zzy6gZzZYf.zzpf(0);
            }
        }
    }
}
