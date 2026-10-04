package com.aspose.words;

import com.aspose.words.internal.zzD3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class Table extends CompositeNode<Row> {
    private RowCollection zzX6W;
    private zzY6G zzZsO;

    public Table(DocumentBase documentBase) {
        super(documentBase);
    }

    private void zzBl(int i) throws Exception {
        zzZR(4005, Integer.valueOf(i));
    }

    private static int zzX(Cell cell, int i) {
        return ((Integer) cell.zz6G().zzVR(3030, i)).intValue();
    }

    private void zzXZX() {
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            Cell cell = null;
            for (Cell firstCell = firstRow.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                Object objZzPk = firstCell.zz6G().zzPk(3010);
                int iIntValue = objZzPk == null ? 0 : ((Integer) objZzPk).intValue();
                if (iIntValue <= 0) {
                    PreferredWidth preferredWidth = firstCell.getCellFormat().getPreferredWidth();
                    if (preferredWidth.isFixed()) {
                        iIntValue = preferredWidth.zzYmD();
                        firstCell.zz6G().setWidth(iIntValue);
                    }
                }
                if (iIntValue <= 0) {
                    iIntValue = firstCell.zz6G().zz5q() * StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                    firstCell.zz6G().setWidth(iIntValue);
                }
                int horizontalMerge = firstCell.zz6G().getHorizontalMerge();
                if (horizontalMerge != 0) {
                    if (horizontalMerge == 1) {
                        firstCell.zz6G().setPreferredWidth(PreferredWidth.zzpK(iIntValue));
                        cell = firstCell;
                    } else {
                        if (horizontalMerge != 2) {
                            throw new IllegalStateException("Unknown cell merge type.");
                        }
                        if (cell != null) {
                            cell.zz6G().setPreferredWidth(PreferredWidth.zzpK(cell.zz6G().getPreferredWidth().zzYmD() + iIntValue));
                            firstCell.zz6G().setPreferredWidth(PreferredWidth.AUTO);
                        } else {
                            firstCell.zz6G().setPreferredWidth(PreferredWidth.zzpK(iIntValue));
                        }
                    }
                } else {
                    firstCell.zz6G().setPreferredWidth(PreferredWidth.zzpK(iIntValue));
                }
                cell = null;
            }
        }
    }

    private void zzXZY() {
        if (zzZYf().zzXXf() != null) {
            zzZYf().remove(5106);
        }
    }

    private void zzY00() throws Exception {
        setAllowAutoFit(false);
        setPreferredWidth(PreferredWidth.AUTO);
        zzXZY();
        zzXZX();
        zzXZZ();
    }

    private void zzY01() throws Exception {
        setAllowAutoFit(true);
        zzZR(4230, PreferredWidth.fromPercent(100.0d));
        zzkj(3020);
        zzkk(4340);
        zzY0e();
    }

    private void zzY02() throws Exception {
        setAllowAutoFit(true);
        zzkk(4230);
        zzkj(3020);
        zzY0e();
    }

    private void zzY04() throws Exception {
        zzY6G zzy6gZzZYf = getFirstRow().zzZYf();
        zzZR(4160, 2);
        zzZR(4190, 0);
        zzZR(4210, 180);
        zzZR(4270, 180);
        zzZR(4350, Boolean.FALSE);
        int iIntValue = ((Integer) zzy6gZzZYf.zzPj(4010)).intValue();
        if (iIntValue == 2) {
            zzZR(4180, 3);
        } else if (iIntValue == 1) {
            zzZR(4180, 2);
        }
        zzkk(4010);
        if (zzy6gZzZYf.contains(4340)) {
            zzZR(4170, Integer.valueOf(((Integer) zzy6gZzZYf.zzPk(4340)).intValue() - 1));
        }
        zzkk(4340);
    }

    private void zzY05() throws Exception {
        int iIntValue = ((Integer) getFirstRow().zzZYf().zzPj(4180)).intValue();
        if (iIntValue == 3) {
            zzZR(4010, 2);
        } else if (iIntValue == 2) {
            zzZR(4010, 1);
        }
        zzkk(4170);
        zzkk(4160);
        zzkk(4150);
        zzkk(4190);
        zzkk(4210);
        zzkk(4270);
        zzkk(4350);
        zzkk(4180);
        zzkk(4200);
    }

    private void zzY06() throws Exception {
        if (isFloating()) {
            return;
        }
        setVerticalAnchor(2);
        setAbsoluteVerticalDistance(0.0d);
    }

    private void zzY09() {
        if (getLeftIndent() >= 0.0d) {
            return;
        }
        zzZYf().remove(4340);
        Iterator<T> it = getRows().iterator();
        while (it.hasNext()) {
            ((Row) it.next()).zzZYf().remove(4340);
        }
    }

    private void zzY0a() throws Exception {
        boolean allowAutoFit = ((Table) getAncestor(5)).getAllowAutoFit();
        if (allowAutoFit != getAllowAutoFit()) {
            setAllowAutoFit(allowAutoFit);
        }
    }

    private void zzZQ(int i, Object obj) throws Exception {
        if (getFirstRow() == null) {
            throw new IllegalStateException("Formatting cannot be applied because the table is empty. Add at least one row to the table first.");
        }
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            if (i == 4005) {
                zzm(firstRow);
            }
            if (!firstRow.zzZYf().zzVE(i)) {
                firstRow.zzZYf().zzQ(i, obj);
            }
        }
    }

    private Object zzki(int i) {
        Row firstRow = getFirstRow();
        return firstRow == null ? zzY6G.zzOt(i) : i == 4005 ? firstRow.zzZYf() != null ? Integer.valueOf(firstRow.zzZYf().zzZ7j()) : zzY6G.zzOt(4005) : firstRow.fetchRowAttr(i);
    }

    private void zzkj(int i) {
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            for (Cell firstCell = firstRow.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                firstCell.zz6G().remove(i);
            }
        }
    }

    private void zzkl(int i) {
        if (i == 0) {
            Row lastRow = getLastRow();
            if (lastRow != null) {
                for (Cell firstCell = lastRow.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                    firstCell.zz6G().remove(3130);
                }
                return;
            }
            return;
        }
        if (i == 1) {
            for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
                Cell firstCell2 = firstRow.getFirstCell();
                if (firstCell2 != null) {
                    firstCell2.zz6G().remove(3120);
                }
            }
            return;
        }
        if (i == 2) {
            for (Row firstRow2 = getFirstRow(); firstRow2 != null; firstRow2 = firstRow2.getNextRow()) {
                Cell lastCell = firstRow2.getLastCell();
                if (lastCell != null) {
                    lastCell.zz6G().remove(3140);
                }
            }
            return;
        }
        if (i == 3) {
            Row firstRow3 = getFirstRow();
            if (firstRow3 != null) {
                for (Cell firstCell3 = firstRow3.getFirstCell(); firstCell3 != null; firstCell3 = firstCell3.getNextCell()) {
                    firstCell3.zz6G().remove(3110);
                }
                return;
            }
            return;
        }
        if (i == 4) {
            for (Row firstRow4 = getFirstRow(); firstRow4 != null; firstRow4 = firstRow4.getNextRow()) {
                boolean zIsFirstRow = firstRow4.isFirstRow();
                boolean zIsLastRow = firstRow4.isLastRow();
                for (Cell firstCell4 = firstRow4.getFirstCell(); firstCell4 != null; firstCell4 = firstCell4.getNextCell()) {
                    if (!zIsFirstRow) {
                        firstCell4.zz6G().remove(3110);
                    }
                    if (!zIsLastRow) {
                        firstCell4.zz6G().remove(3130);
                    }
                }
            }
            return;
        }
        if (i != 5) {
            throw new IllegalArgumentException("Unexpected border type.");
        }
        for (Row firstRow5 = getFirstRow(); firstRow5 != null; firstRow5 = firstRow5.getNextRow()) {
            for (Cell firstCell5 = firstRow5.getFirstCell(); firstCell5 != null; firstCell5 = firstCell5.getNextCell()) {
                boolean zIsFirstCell = firstCell5.isFirstCell();
                boolean zIsLastCell = firstCell5.isLastCell();
                if (!zIsFirstCell) {
                    firstCell5.zz6G().remove(3120);
                }
                if (!zIsLastCell) {
                    firstCell5.zz6G().remove(3140);
                }
            }
        }
    }

    private void zzkm(int i) {
        if (getFirstRow() == null) {
            return;
        }
        zzY6Q zzy6q = new zzY6Q(this, i == 1);
        if (zzy6q.zz4O().length == 0) {
            return;
        }
        com.aspose.words.internal.zzD4 zzd4 = new com.aspose.words.internal.zzD4();
        com.aspose.words.internal.zzD3 zzd3 = new com.aspose.words.internal.zzD3();
        Row firstRow = getFirstRow();
        while (firstRow != null) {
            zzy6q.zzj(firstRow);
            com.aspose.words.internal.zzD4 zzd42 = new com.aspose.words.internal.zzD4();
            com.aspose.words.internal.zzD3 zzd32 = new com.aspose.words.internal.zzD3();
            int iZzYka = zzy6q.zzYka();
            for (Cell firstCell = firstRow.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                int iZzXYT = zzy6q.zzXYT();
                if (zzX(firstCell, i) != 0) {
                    int iZz5q = zzd4.get(iZzYka);
                    if (com.aspose.words.internal.zzD4.zzWm(iZz5q)) {
                        iZz5q = firstCell.zz6G().zz5q();
                    }
                    int iZz5q2 = zzd3.zzVE(iZzYka) ? ((Cell) zzd3.get(iZzYka)).zz6G().zz5q() : iZz5q;
                    if (iZz5q < iZzXYT && iZz5q2 < firstCell.zz6G().zz5q()) {
                        firstCell.zz6G().zzL(1, i);
                    }
                    if (firstRow.zzZYf().getHeightRule() == 2 && firstRow.getCells().getCount() == 1) {
                        zzn(firstRow);
                    }
                    zzd42.set(iZzYka, iZzXYT);
                    zzd32.set(iZzYka, firstCell);
                }
                iZzYka += firstCell.zz6G().zz5q();
            }
            zzD3.zzZ zzzZzCK = zzd32.zzCK();
            while (zzzZzCK.moveNext()) {
                Cell cell = (Cell) zzzZzCK.zzCI();
                if (zzX(cell, i) == 2 && zzd3.get(zzzZzCK.zzCM()) == null) {
                    cell.zz6G().zzL(1, i);
                }
            }
            zzD3.zzZ zzzZzCK2 = zzd3.zzCK();
            while (zzzZzCK2.moveNext()) {
                Cell cell2 = (Cell) zzzZzCK2.zzCI();
                if (zzX(cell2, i) == 1 && zzd32.get(zzzZzCK2.zzCM()) == null) {
                    cell2.zz6G().zzL(0, i);
                }
            }
            firstRow = firstRow.getNextRow();
            zzd4 = zzd42;
            zzd3 = zzd32;
        }
        for (Cell firstCell2 = getLastRow().getFirstCell(); firstCell2 != null; firstCell2 = firstCell2.getNextCell()) {
            if (zzX(firstCell2, i) == 1) {
                firstCell2.zz6G().zzL(0, i);
            }
        }
    }

    private void zzm(Row row) throws Exception {
        Object obj = row.zzZYf().get(4120);
        Object obj2 = row.zzZYf().get(4240);
        Object obj3 = row.zzZYf().get(4230);
        row.getRowFormat().clearFormatting();
        zzkj(3060);
        if (obj != null) {
            row.zzZYf().zzQ(4120, obj);
        }
        if (obj2 != null) {
            row.zzZYf().zzQ(4240, obj2);
        }
        if (obj3 != null) {
            row.zzZYf().zzQ(4230, obj3);
        }
    }

    private static void zzn(Row row) {
        row.zzZYf().zzQ(4120, new zzZKP(0, row.getFirstCell().getLastParagraph() != null ? (int) (row.getFirstCell().getLastParagraph().getParagraphBreakFont().getSize() * 23.0d) : StyleIdentifier.GRID_TABLE_4));
    }

    private static int zzo(Row row) {
        int iZz5q = 0;
        for (Cell firstCell = row.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
            iZz5q += firstCell.zz6G().zz5q();
        }
        return iZz5q;
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return acceptCore(documentVisitor);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptEnd(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitTableEnd(this);
    }

    @Override // com.aspose.words.CompositeNode
    public int acceptStart(DocumentVisitor documentVisitor) throws Exception {
        return documentVisitor.visitTableStart(this);
    }

    public void autoFit(int i) throws Exception {
        if (i == 0) {
            zzY02();
        } else if (i == 1) {
            zzY01();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown auto fit behavior.");
            }
            zzY00();
        }
    }

    public void clearBorders() {
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            firstRow.zzZYf().zz5D();
            for (Cell firstCell = firstRow.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                firstCell.zz6G().zz5D();
            }
        }
    }

    public void clearShading() {
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            firstRow.zzZYf().remove(4330);
            for (Cell firstCell = firstRow.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                firstCell.zz6G().remove(3170);
            }
        }
    }

    public void convertToHorizontallyMergedCells() {
        int i = 2;
        zzWF zzwf = new zzWF(this, 2);
        if (zzwf.getColumnCount() == 0) {
            return;
        }
        zzwf.zz4S();
        zzZYf().remove(5106);
        zzZYf().remove(5107);
        for (Row row : getRows()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = row.getCells().iterator();
            while (true) {
                int i2 = 0;
                int iZzBx = 1;
                if (!it.hasNext()) {
                    break;
                }
                Cell cell = (Cell) it.next();
                zzwf.zz4Q();
                while (true) {
                    if (i2 >= zzwf.getColumnCount()) {
                        break;
                    }
                    if (com.aspose.words.internal.zzZKO.zzA(cell, zzwf.zz4K().zz52())) {
                        iZzBx = zzwf.zz4K().zzBx();
                        break;
                    } else {
                        zzwf.zz4P();
                        i2++;
                    }
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Cell>) arrayList2, cell);
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(iZzBx));
            }
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                Cell cell2 = (Cell) arrayList2.get(i3);
                int iIntValue = ((Integer) arrayList.get(i3)).intValue();
                cell2.zz6G().remove(3900);
                if (iIntValue != 1 && (cell2.getNextCell() == null || ((Integer) cell2.getNextCell().zz6G().zzPj(3040)).intValue() != i)) {
                    cell2.zz6G().zzQ(3040, 1);
                    int i4 = 0;
                    while (i4 < iIntValue - 1) {
                        Cell cell3 = (Cell) cell2.deepClone(false);
                        int i5 = i;
                        cell3.zz6G().zzQ(3010, 0);
                        cell3.zz6G().zzQ(3020, PreferredWidth.fromPoints(0.0d));
                        cell3.zz6G().zzQ(3040, Integer.valueOf(i5));
                        cell3.appendChild(new Paragraph(cell3.getDocument()));
                        cell2.zzYD(cell3);
                        i4++;
                        i = i5;
                    }
                }
                i3++;
                i = i;
            }
            zzwf.zz4R();
        }
    }

    public void ensureMinimum() {
        Row firstRow = getFirstRow();
        if (firstRow == null) {
            firstRow = (Row) appendChild(new Row(getDocument()));
        }
        firstRow.ensureMinimum();
    }

    public double getAbsoluteHorizontalDistance() {
        return ((double) ((Integer) zzki(4170)).intValue()) / 20.0d;
    }

    public double getAbsoluteVerticalDistance() {
        return ((double) ((Integer) zzki(4190)).intValue()) / 20.0d;
    }

    public int getAlignment() {
        return ((Integer) zzki(4010)).intValue();
    }

    public boolean getAllowAutoFit() {
        return ((Boolean) zzki(4240)).booleanValue();
    }

    public boolean getAllowCellSpacing() {
        return getFirstRow().zzYkh();
    }

    public boolean getAllowOverlap() {
        return ((Boolean) zzki(4350)).booleanValue();
    }

    public boolean getBidi() {
        return ((Boolean) zzki(4380)).booleanValue();
    }

    public double getBottomPadding() {
        return ((double) ((Integer) zzki(4310)).intValue()) / 20.0d;
    }

    public double getCellSpacing() {
        return ((PreferredWidth) zzki(4290)).getValue();
    }

    public final int getColumnCount() {
        int iMax = 0;
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            iMax = Math.max(iMax, zzo(firstRow));
        }
        return iMax;
    }

    public String getDescription() {
        return (String) zzki(5010);
    }

    public double getDistanceBottom() {
        return ((double) ((Integer) zzki(4280)).intValue()) / 20.0d;
    }

    public double getDistanceLeft() {
        return ((double) ((Integer) zzki(4210)).intValue()) / 20.0d;
    }

    public double getDistanceRight() {
        return ((double) ((Integer) zzki(4270)).intValue()) / 20.0d;
    }

    public double getDistanceTop() {
        return ((double) ((Integer) zzki(4220)).intValue()) / 20.0d;
    }

    public Row getFirstRow() {
        return (Row) zzZYt();
    }

    public int getHorizontalAnchor() {
        return ((Integer) zzki(4150)).intValue();
    }

    public Row getLastRow() {
        return (Row) zzZYs();
    }

    public double getLeftIndent() {
        return ((double) ((Integer) zzki(4340)).intValue()) / 20.0d;
    }

    public double getLeftPadding() {
        return ((double) ((Integer) zzki(4020)).intValue()) / 20.0d;
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 5;
    }

    public PreferredWidth getPreferredWidth() {
        return (PreferredWidth) zzki(4230);
    }

    public int getRelativeHorizontalAlignment() {
        return ((Integer) zzki(4180)).intValue();
    }

    public int getRelativeVerticalAlignment() {
        return ((Integer) zzki(4200)).intValue();
    }

    public double getRightPadding() {
        return ((double) ((Integer) zzki(4320)).intValue()) / 20.0d;
    }

    public RowCollection getRows() {
        if (this.zzX6W == null) {
            this.zzX6W = new RowCollection(this);
        }
        return this.zzX6W;
    }

    public Style getStyle() {
        return getDocument().getStyles().zzVp(zzZ7j(), 11);
    }

    public int getStyleIdentifier() {
        return getStyle().getStyleIdentifier();
    }

    public String getStyleName() {
        return getStyle().getName();
    }

    public int getStyleOptions() {
        return ((Integer) zzki(4140)).intValue();
    }

    public int getTextWrapping() {
        return isFloating() ? 1 : 0;
    }

    public String getTitle() {
        return (String) zzki(5000);
    }

    public double getTopPadding() {
        return ((double) ((Integer) zzki(4300)).intValue()) / 20.0d;
    }

    public int getVerticalAnchor() {
        return ((Integer) zzki(4160)).intValue();
    }

    public final boolean isFloating() {
        return getRows().getCount() > 0 && getRows().get(0).zzZYf().isFloating();
    }

    public void setAbsoluteHorizontalDistance(double d) throws Exception {
        zzkk(4180);
        zzZR(4170, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setAbsoluteVerticalDistance(double d) throws Exception {
        zzkk(4200);
        zzZR(4190, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setAlignment(int i) throws Exception {
        zzZR(4010, Integer.valueOf(i));
    }

    public void setAllowAutoFit(boolean z) throws Exception {
        if (z != getAllowAutoFit()) {
            zzXZY();
        }
        zzZR(4240, Boolean.valueOf(z));
    }

    public void setAllowCellSpacing(boolean z) throws Exception {
        if (!z) {
            zzkk(4290);
        } else {
            if (getAllowCellSpacing()) {
                return;
            }
            zzZR(4290, PreferredWidth.zzpK(7));
        }
    }

    public void setBidi(boolean z) throws Exception {
        zzZR(4380, Boolean.valueOf(z));
    }

    public void setBorder(int i, int i2, double d, int i3, boolean z) throws Exception {
        if (z) {
            zzkl(i);
        }
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            Border byBorderType = firstRow.getRowFormat().getBorders().getByBorderType(i);
            byBorderType.setLineStyle(i2);
            byBorderType.setLineWidth(d);
            byBorderType.setColor(i3);
        }
    }

    public void setBorders(int i, double d, int i2) throws Exception {
        Iterator<T> it = zzY6G.zzZzU.getKeys().iterator();
        while (it.hasNext()) {
            setBorder(((Integer) it.next()).intValue(), i, d, i2, true);
        }
    }

    public void setBottomPadding(double d) throws Exception {
        zzZR(4310, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setCellSpacing(double d) throws Exception {
        zzZR(4290, PreferredWidth.zzWl(d));
    }

    public void setDescription(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzZR(5010, str);
    }

    public void setDistanceBottom(double d) throws Exception {
        com.aspose.words.internal.zzZ4.zzY(d, "value");
        zzZR(4280, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
        zzY06();
    }

    public void setDistanceLeft(double d) throws Exception {
        com.aspose.words.internal.zzZ4.zzY(d, "value");
        zzZR(4210, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
        zzY06();
    }

    public void setDistanceRight(double d) throws Exception {
        com.aspose.words.internal.zzZ4.zzY(d, "value");
        zzZR(4270, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
        zzY06();
    }

    public void setDistanceTop(double d) throws Exception {
        com.aspose.words.internal.zzZ4.zzY(d, "value");
        zzZR(4220, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
        zzY06();
    }

    public void setHorizontalAnchor(int i) throws Exception {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Parameter value outside of acceptable range.\r\nParameter name: HorizontalAnchor");
        }
        zzZR(4150, Integer.valueOf(i));
        zzZQ(4190, 0);
        zzZQ(4160, 2);
        zzZQ(4210, 180);
        zzZQ(4270, 180);
    }

    public void setLeftIndent(double d) throws Exception {
        if (!zzhk() || d >= 0.0d) {
            zzZR(4340, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
        }
    }

    public void setLeftPadding(double d) throws Exception {
        zzZR(4020, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setPreferredWidth(PreferredWidth preferredWidth) throws Exception {
        zzZR(4230, preferredWidth);
    }

    public void setRelativeHorizontalAlignment(int i) throws Exception {
        zzkk(4170);
        zzZR(4180, Integer.valueOf(i));
    }

    public void setRelativeVerticalAlignment(int i) throws Exception {
        zzkk(4190);
        zzZR(4200, Integer.valueOf(i));
    }

    public void setRightPadding(double d) throws Exception {
        zzZR(4320, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setShading(int i, int i2, int i3) {
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            Shading shading = firstRow.zzZYf().getShading();
            if (shading == null) {
                shading = new Shading();
                firstRow.zzZYf().zzZ(shading);
            }
            shading.setTexture(i);
            shading.setForegroundPatternColor(i2);
            shading.setBackgroundPatternColor(i3);
            for (Cell firstCell = firstRow.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
                Shading shading2 = firstCell.getCellFormat().getShading();
                shading2.setTexture(i);
                shading2.setForegroundPatternColor(i2);
                shading2.setBackgroundPatternColor(i3);
            }
        }
    }

    public void setStyle(Style style) throws Exception {
        if (style == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        if (style.getDocument() != getDocument()) {
            throw new IllegalArgumentException("This style belongs to a different document.");
        }
        if (style.getType() != 3) {
            throw new IllegalArgumentException("This style is not a table style.");
        }
        zzBl(style.zzZ7j());
    }

    public void setStyleIdentifier(int i) throws Exception {
        setStyle(getDocument().getStyles().zzkW(i));
    }

    public void setStyleName(String str) throws Exception {
        setStyle(getDocument().getStyles().zzAY(str));
    }

    public void setStyleOptions(int i) throws Exception {
        zzZR(4140, Integer.valueOf(i));
    }

    public void setTextWrapping(int i) throws Exception {
        if (i == 1) {
            zzY04();
        } else {
            zzY05();
        }
    }

    public void setTitle(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzZR(5000, str);
    }

    public void setTopPadding(double d) throws Exception {
        zzZR(4300, Integer.valueOf(com.aspose.words.internal.zzSA.zzr(d)));
    }

    public void setVerticalAnchor(int i) throws Exception {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Parameter value outside of acceptable range.\r\nParameter name: VerticalAnchor");
        }
        zzZR(4160, Integer.valueOf(i));
        zzZQ(4190, 0);
        zzZQ(4210, 180);
        zzZQ(4270, 180);
    }

    @Override // com.aspose.words.CompositeNode
    public final boolean zzT(Node node) {
        return zzYVU.zzXQ(node);
    }

    public final Cell zzVl(int i, int i2) {
        if (i2 >= 0) {
            try {
                if (i2 < getRows().getCount()) {
                    CellCollection cells = getRows().get(i2).getCells();
                    if (i >= 0 && i < cells.getCount()) {
                        return cells.get(i);
                    }
                    return null;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public final void zzXZZ() {
        if (!zzY6U.zzZ(zzZYf().zzXXf()) || zzZYf().zzPk(5103) == null) {
            zzY6Q zzy6q = new zzY6Q(this, false);
            zzY6Q zzy6q2 = new zzY6Q(this, true);
            zzZYf().zzQ(5103, new com.aspose.words.internal.zzDB(zzy6q.zz4O()));
            for (Row row : getRows()) {
                zzy6q.zzj(row);
                zzZ(row.zzZYf(), zzy6q);
                Iterator<T> it = row.getCells().iterator();
                while (it.hasNext()) {
                    ((Cell) it.next()).zz6G().zzQ(3900, Integer.valueOf(zzy6q.zzXYT()));
                }
            }
            if (com.aspose.words.internal.zzZ1.zzZ(zzy6q.zz4O(), zzy6q2.zz4O())) {
                zzZYf().remove(10010);
                return;
            }
            if (zzZYf().zzYsN() == null) {
                zzZYf().zzZ(new zzZMK(new zzY6G(), "", com.aspose.words.internal.zzZQ9.zz35));
            }
            zzZYf().zzXXb().zzQ(5103, new com.aspose.words.internal.zzDB(zzy6q2.zz4O()));
            for (Row row2 : getRows()) {
                zzY6G zzy6gZzXXb = row2.zzZYf().zzXXb();
                zzy6q2.zzj(row2);
                zzZ(zzy6gZzXXb, zzy6q2);
                Iterator<T> it2 = row2.getCells().iterator();
                while (it2.hasNext()) {
                    ((Cell) it2.next()).zz6G().zz5s().zzQ(3900, Integer.valueOf(zzy6q2.zzXYT()));
                }
            }
        }
    }

    public final int zzY03() {
        if (getRows().getCount() == 0) {
            return 0;
        }
        Iterator<T> it = getRows().iterator();
        int iMax = 0;
        while (it.hasNext()) {
            Iterator<T> it2 = ((Row) it.next()).getCells().iterator();
            int width = 0;
            while (it2.hasNext()) {
                width += ((Cell) it2.next()).zz6G().getWidth();
            }
            iMax = Math.max(iMax, width);
        }
        return iMax;
    }

    public final Row zzY07() {
        getParentNode();
        if (getAncestor(18) != null) {
            return null;
        }
        Row row = null;
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            if (row != null && (row.zzZYf().zzZ7j() != firstRow.zzZYf().zzZ7j() || !row.zzz(firstRow))) {
                return firstRow;
            }
            row = firstRow;
        }
        return null;
    }

    public final int zzY08() {
        int i = 0;
        for (Row firstRow = getFirstRow(); firstRow != null && firstRow.zzZYf().getHeadingFormat(); firstRow = firstRow.getNextRow()) {
            i++;
        }
        return i;
    }

    public final void zzY0b() throws Exception {
        if (!zzhk() || getFirstRow() == null) {
            return;
        }
        zzY0a();
        zzY09();
    }

    public final void zzY0c() {
        zzkm(0);
        if (zzYKU()) {
            zzkm(1);
        }
    }

    public final void zzY0d() {
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            Cell firstCell = firstRow.getFirstCell();
            Cell cell = null;
            while (firstCell != null) {
                int horizontalMerge = firstCell.zz6G().getHorizontalMerge();
                if (horizontalMerge == 0) {
                    cell = null;
                } else if (horizontalMerge == 1) {
                    firstCell.zz6G().setHorizontalMerge(0);
                    cell = firstCell;
                } else {
                    if (horizontalMerge != 2) {
                        throw new IllegalStateException("Unknown cell merge type.");
                    }
                    if (cell != null) {
                        cell.zz6G().setWidth(cell.zz6G().getWidth() + firstCell.zz6G().getWidth());
                        cell.zz6G().zzOu(cell.zz6G().zz5q() + firstCell.zz6G().zz5q());
                        if (firstCell.zz6G().getWidth() != 0 && cell.zz6G().getPreferredWidth().isFixed() && firstCell.zz6G().getPreferredWidth().isFixed()) {
                            cell.zz6G().setPreferredWidth(PreferredWidth.zzpK(firstCell.zz6G().getPreferredWidth().zzYmD() + cell.zz6G().getPreferredWidth().zzYmD()));
                            if (firstCell.zz6G().getPreferredWidth().zzYmD() > 0 && (zzZYf().zzXXf() == null || zzZYf().zzXXf().getState() != 1)) {
                                zzZNR.zzL(this);
                            }
                        }
                        if (firstCell.getNextCell() == null || firstCell.getNextCell().zz6G().getHorizontalMerge() != 2) {
                            Object objZzPk = firstCell.zz6G().zzPk(3140);
                            if (objZzPk != null) {
                                cell.zz6G().zzQ(3140, objZzPk);
                            } else {
                                cell.zz6G().remove(3140);
                            }
                        }
                        firstCell.remove();
                        firstCell = cell;
                    } else {
                        firstCell.zz6G().setHorizontalMerge(0);
                    }
                }
                firstCell = firstCell.getNextCell();
            }
        }
    }

    public final zzZ60 zzY0e() {
        return new zzY6M(this).zzXY3();
    }

    public final boolean zzY0f() {
        Iterator<T> it = getRows().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((Row) it.next()).getCells().iterator();
            if (it2.hasNext()) {
                it2.next();
                return true;
            }
        }
        return false;
    }

    public final boolean zzYKU() {
        for (Row row : getRows()) {
            if (row.zzZYf().hasRevisions()) {
                return true;
            }
            Iterator<T> it = row.getCells().iterator();
            while (it.hasNext()) {
                if (((Cell) it.next()).zz6G().hasRevisions()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.aspose.words.CompositeNode, com.aspose.words.Node
    public final Node zzZ(boolean z, zzZA5 zzza5) {
        Table table = (Table) super.zzZ(z, zzza5);
        zzY6G zzy6g = this.zzZsO;
        if (zzy6g != null) {
            table.zzZsO = (zzY6G) zzy6g.zzbn();
        }
        table.zzX6W = null;
        return table;
    }

    public final int zzZ7j() {
        return ((Integer) zzki(4005)).intValue();
    }

    public final void zzZR(int i, Object obj) throws Exception {
        if (getFirstRow() == null) {
            throw new IllegalStateException("Formatting cannot be applied because the table is empty. Add at least one row to the table first.");
        }
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            if (i == 4005) {
                zzm(firstRow);
            }
            firstRow.zzZYf().zzQ(i, obj);
        }
    }

    public final zzY6G zzZYf() {
        if (this.zzZsO == null) {
            this.zzZsO = new zzY6G();
        }
        return this.zzZsO;
    }

    public final int zzZrd() {
        Row firstRow = getFirstRow();
        if (firstRow == null) {
            return 0;
        }
        return firstRow.zzZYf().zzX(firstRow.getFirstCell().zz6G(), zzhk());
    }

    public final boolean zzhk() {
        return zzYBd() != null && zzYBd().getNodeType() == 7;
    }

    public final void zzkk(int i) {
        for (Row firstRow = getFirstRow(); firstRow != null; firstRow = firstRow.getNextRow()) {
            firstRow.zzZYf().remove(i);
        }
    }

    private static void zzZ(zzY6G zzy6g, zzY6Q zzy6q) {
        zzy6g.zzQ(5104, Integer.valueOf(zzy6q.zzYka()));
        zzy6g.zzQ(5105, Integer.valueOf(zzy6q.zzYk8()));
        zzy6g.zzph(zzy6q.zzXYS());
        zzy6g.zzpf(zzy6q.zzXYR());
    }
}
