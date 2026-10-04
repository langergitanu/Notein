package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPC {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("table-column", "table-columns", "table-row", "table-rows", "table-header-rows", "dde-source", "forms", "desc", "named-expressions", "scenario", "shapes", "table-column-group", "table-header-columns", "table-row-group", "table-source", NoteMeta.PROPERTY_TITLE, "soft-page-break", "style-name", "name", "is-sub-table", "print", "print-ranges", "protected", "protection-key", "protection-key-digest-algorithm", "template-name", "use-banding-columns-styles", "use-banding-rows-styles", "use-first-column-styles", "use-first-row-styles", "use-last-column-styles", "use-last-row-styles", "id", "page", "column");

    public static void zzV(zzYQ7 zzyq7, CompositeNode compositeNode) throws Exception {
        zzYPI zzypi = new zzYPI(zzyq7.zzYuS());
        zzX(zzyq7, zzypi);
        if (zzypi.zzYtv() == null) {
            zzypi.zzZ(new zzYP9());
        }
        zzZ(zzyq7, zzypi);
        zzY(compositeNode, zzypi.zzYtv().zzXLD);
        if (compositeNode.zzZYq() instanceof Table) {
            Paragraph paragraph = new Paragraph(zzyq7.getDocument());
            paragraph.zzYp5().zzZ(zzZU.zzZF6);
            compositeNode.appendChild(paragraph);
        }
        compositeNode.appendChild(zzW(zzyq7, zzypi));
        zzY(compositeNode, zzypi.zzYtv().zzXLC);
        zzZ(zzyq7, compositeNode, zzypi.zzYtv());
    }

    private static Table zzW(zzYQ7 zzyq7, zzYPI zzypi) throws Exception {
        zzypi.zzX(zzYP5.zzZ(zzyq7.zzYuR(), zzyq7.zzYuN()));
        Table table = new Table(zzyq7.getDocument());
        zzYP9 zzyp9ZzYtv = zzypi.zzYtv();
        Iterator<zzYQ4> it = zzypi.iterator();
        while (it.hasNext()) {
            zzZ(zzypi, it.next(), table);
        }
        if (table.getRows().getCount() == 0) {
            return table;
        }
        if ("rl-tb".equals(zzyp9ZzYtv.zzYtp())) {
            table.setBidi(true);
        } else if ("lr-tb".equals(zzyp9ZzYtv.zzYtp())) {
            table.setBidi(false);
        }
        table.setAlignment(zzyp9ZzYtv.zzYto());
        table.setPreferredWidth(zzyp9ZzYtv.getPreferredWidth());
        boolean zZzYtw = zzypi.zzYtw();
        if (table.getAllowAutoFit() != zZzYtw) {
            table.setAllowAutoFit(zZzYtw);
        }
        table.zzZYf().zzQ(5107, zzY(zzypi));
        return table;
    }

    private static void zzX(zzYQ7 zzyq7, zzYPI zzypi) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 17:
                    zzypi.zzZ((zzYP9) zzyq7.zzYuS().zzY(zzYOU.zzDr(zzyq9ZzYuT.getValue()), "table", zzyq7.zzYuO(), true));
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                    zzyq7.zzZ(256, false, "table:table");
                    break;
                default:
                    zzyq7.zzYi("table:table", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYSL zzysl) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("table-columns")) {
            if ("table-column".equals(zzyq9ZzYuT.getLocalName())) {
                zzYPF.zzZ(zzyq7, zzysl);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYPI zzypi) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("table")) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                    zzYPF.zzZ(zzyq7, zzypi.zzYtu());
                    break;
                case 1:
                    zzY(zzyq7, zzypi.zzYtu());
                    break;
                case 2:
                    zzYPB.zzV(zzyq7, zzypi);
                    break;
                case 3:
                case 4:
                    zzY(zzyq7, zzypi);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    zzyq7.zzZ(1, true, "table:table");
                    break;
                default:
                    zzyq9ZzYuT.zzk();
                    break;
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYPI zzypi) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String localName = zzyq9ZzYuT.getLocalName();
        String prefix = zzyq9ZzYuT.getPrefix();
        while (zzyq9ZzYuT.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 2) {
                zzYPB.zzZ(zzyq7, zzypi, "table-header-rows".equals(localName));
            } else if (iZzTP != 16) {
                zzyq9ZzYuT.zzk();
            } else {
                zzyq7.zzZ(1, true, com.aspose.words.internal.zzZKN.format("{0}:{1}", prefix, localName));
            }
        }
    }

    private static void zzX(CompositeNode compositeNode, String str) {
        if (compositeNode.hasChildNodes()) {
            Paragraph paragraph = new Paragraph(compositeNode.getDocument());
            paragraph.zzYp5().zzZ(zzZU.zzZF6);
            paragraph.appendChild(new Run(compositeNode.getDocument(), str));
            compositeNode.appendChild(paragraph);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYP9 zzyp9) {
        Body body = (Body) com.aspose.words.internal.zzZKW.zzZ(compositeNode, Body.class);
        if (zzX(body)) {
            Iterator<T> it = zzYP5.zzZ(zzyq7.zzYuR(), zzyp9.zzYu6()).zzYBx().getHeadersFooters().iterator();
            while (it.hasNext()) {
                body.getParentSection().getHeadersFooters().add(((HeaderFooter) it.next()).deepClone(true));
            }
        }
    }

    private static boolean zzX(Body body) {
        return (body == null || body.getParentSection() == null || body.getParentSection().getHeadersFooters().getCount() != 0) ? false : true;
    }

    private static zzY6S zzY(zzYPI zzypi) {
        int columnWidth;
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB(zzypi.zzYtu().getCount());
        for (zzYPE zzype : zzypi.zzYtu()) {
            if (zzype.getColumnWidth() == Integer.MIN_VALUE) {
                columnWidth = zzypi.zzYtt();
            } else {
                columnWidth = zzype.getColumnWidth();
            }
            zzdb.add(columnWidth);
        }
        return new zzY6S(zzdb);
    }

    private static void zzZ(zzYPI zzypi, zzYQ4 zzyq4, Table table) {
        Row row;
        Cell cell = new Cell(table.getDocument());
        if (table.getFirstRow() != null) {
            Row lastRow = table.getLastRow();
            row = lastRow;
            cell = lastRow.getFirstCell();
        } else {
            row = null;
        }
        table.appendChild(new Row(table.getDocument(), zzyq4.zzZYf()));
        Cell cellZzZ = cell;
        for (int i = 0; i < zzyq4.getCount(); i++) {
            cellZzZ = zzZ(zzypi, table, zzyq4, i, cellZzZ, row);
        }
        if (zzyq4.zzrL(0).getVerticalMerge() == 2 && row != null) {
            table.getLastRow().zzZYf().zzwa(row.zzZYf().zzYM7());
        }
        for (int i2 = 1; i2 < zzyq4.zzYum(); i2++) {
            table.appendChild(table.getLastRow().deepClone(true));
        }
    }

    private static void zzY(CompositeNode compositeNode, String str) {
        compositeNode.getDocument();
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 33) {
            zzX(compositeNode, ControlChar.PAGE_BREAK);
        } else {
            if (iZzTP != 34) {
                return;
            }
            zzX(compositeNode, ControlChar.COLUMN_BREAK);
        }
    }

    private static Cell zzZ(zzYPI zzypi, Table table, zzYQ4 zzyq4, int i, Cell cell, Row row) {
        zzYTE zzyteZzrL = zzyq4.zzrL(i);
        if (zzyteZzrL.zz6C() == null) {
            if (zzZ(zzyteZzrL, row, i)) {
                zzyteZzrL.zzA((Cell) row.getCells().get(i).deepClone(false));
                zzyteZzrL.zz6C().zz6G().zzZ(PreferredWidth.zzpK(row.getCells().get(i).zz6G().getWidth()));
            } else {
                zzyteZzrL.zzA((Cell) cell.deepClone(false));
            }
            if (zzyteZzrL.getHorizontalMerge() == 2) {
                zzyteZzrL.zz6C().zz6G().zzZ(PreferredWidth.zzpK(0));
            }
        } else if (zzyteZzrL.getHorizontalMerge() != 2) {
            zzyteZzrL.zz6C().zz6G().zzZ(PreferredWidth.zzpK(zzypi.zzWv(zzyteZzrL.zzBx(), i)));
        }
        zzyteZzrL.zz6C().zz6G().setHorizontalMerge(zzyteZzrL.getHorizontalMerge());
        zzyteZzrL.zz6C().zz6G().setVerticalMerge(zzyteZzrL.getVerticalMerge());
        table.getLastRow().getCells().add(zzyteZzrL.zz6C());
        return zzyteZzrL.zz6C();
    }

    private static boolean zzZ(zzYTE zzyte, Row row, int i) {
        return (zzyte.getVerticalMerge() != 2 || row == null || row.getCells().get(i) == null) ? false : true;
    }
}
