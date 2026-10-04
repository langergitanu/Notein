package com.aspose.words;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6M {
    private boolean zzX55;
    private ArrayList<Table> zzX56;
    private double zzX57;
    private double zzX58;
    private double zzX59;
    private double zzX5a;
    private int zzX5b;
    private int zzX5c;
    private int zzX5d;
    private double zzX5e;
    private ArrayList<zzYAR> zzX5f;
    private zzYML zzX5g;
    private zzZ60 zzX5h;
    private double zzX5i;
    private double zzX5j;
    private boolean zzX5k;
    private zzV2[] zzX5l;
    private double zzX5m;
    private Cell zzX5n;
    private Cell zzX5o;
    private double zzXcw;
    private boolean zzYud;
    private Table zzZzY;

    public zzY6M(Table table) {
        this.zzX5k = true;
        if (table.getParentNode() == null) {
            throw new IllegalStateException("The table must be in the document tree before it can be updated.");
        }
        this.zzZzY = table;
    }

    public static double zzG(CompositeNode compositeNode) {
        Section lastSection = (Section) compositeNode.getAncestor(2);
        int nodeType = compositeNode.getNodeType();
        if (nodeType == 3) {
            return zzz(lastSection);
        }
        if (nodeType != 4) {
            if (nodeType == 7) {
                return ((Cell) compositeNode).getCellFormat().getWidth();
            }
            if (nodeType == 37) {
                if (compositeNode instanceof zzZMS) {
                    return compositeNode.zzYBb().getFirstSection().getPageSetup().zzYRX();
                }
                throw new IllegalStateException("Unexpected table container.");
            }
            switch (nodeType) {
                case 18:
                    Shape shape = (Shape) compositeNode;
                    zzYCG zzycg = new zzYCG(shape);
                    CompositeNode compositeNodeZzWk = zzycg.zzNa() == 2 ? zzWk(shape) : null;
                    if (compositeNodeZzWk != null) {
                        return zzG(compositeNodeZzWk);
                    }
                    double width = shape.getWidth() - zzycg.zzYax();
                    Stroke stroke = shape.getStroke();
                    if (stroke.getOn()) {
                        width -= stroke.getWeight();
                    }
                    return (!(shape.getDocument() != null && shape.getDocument().zzZpV().zzYVg.zzZYM()) || (shape.getAncestor(7) != null)) ? width + 0.75d : width;
                case 19:
                    break;
                case 20:
                    if (((Footnote) compositeNode).getFootnoteType() == 1 && lastSection.getPageSetup().getEndnoteOptions().getPosition() == 3) {
                        lastSection = lastSection.zzYBb().getLastSection();
                    }
                    return lastSection.getPageSetup().zzYRX();
                default:
                    throw new IllegalStateException("Unexpected table container.");
            }
        }
        return lastSection.getPageSetup().zzYRX();
    }

    private double zzV(Cell cell, int i) {
        int horizontalMerge = cell.getCellFormat().getHorizontalMerge();
        if (horizontalMerge == 0 || horizontalMerge == 1) {
            return zzVb(i, zzZSF.zzT(cell));
        }
        if (horizontalMerge == 2) {
            return 0.0d;
        }
        throw new IllegalStateException("Unknown cell merge.");
    }

    private double zzVb(int i, int i2) {
        int iMax = Math.max(i, 0);
        int iMin = Math.min(i2 + iMax, this.zzX5l.length);
        double dZz0J = 0.0d;
        while (iMax < iMin) {
            dZz0J += this.zzX5l[iMax].zz0J();
            iMax++;
        }
        return dZz0J;
    }

    private void zzW(Cell cell, int i) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzX5f, new zzYAR(cell, i));
    }

    private static CompositeNode zzWk(Node node) {
        CompositeNode parentNode = node.getParentNode();
        while (parentNode != null && parentNode.getNodeType() != 3 && parentNode.getNodeType() != 4) {
            parentNode = parentNode.getParentNode();
        }
        return parentNode;
    }

    private void zzX(zzYAM zzyam) {
        if (zzyam.zzY5M().getMin() > zzyam.zzY5L().getMin()) {
            if (zzyam.zzY5U()) {
                for (int iZzY5X = zzyam.zzY5X(); iZzY5X < zzyam.zzY5W() && zzyam.zzY5N() > 0.0d; iZzY5X++) {
                    zzV2 zzv2 = this.zzX5l[iZzY5X];
                    double dMax = Math.max(zzv2.zz0K().getMin(), (zzv2.getPreferredWidth().getValue() * zzyam.zzY5M().getMin()) / zzyam.zzY5N());
                    zzyam.zzW7(zzyam.zzY5N() - zzv2.getPreferredWidth().getValue());
                    zzyam.zzY5M().zzZO(zzyam.zzY5M().getMin() - dMax);
                    zzv2.zz0K().zzZO(dMax);
                }
                return;
            }
            double min = zzyam.zzY5L().getMin();
            double max = zzyam.zzY5L().getMax();
            for (int iZzY5X2 = zzyam.zzY5X(); iZzY5X2 < zzyam.zzY5W() && max > 0.0d; iZzY5X2++) {
                zzV2 zzv22 = this.zzX5l[iZzY5X2];
                if (zzv22.getPreferredWidth().isFixed() && zzyam.zzY5Q() && zzyam.zzY5N() <= zzyam.zzY5M().getMin()) {
                    double dMax2 = Math.max(zzv22.zz0K().getMin(), zzv22.getPreferredWidth().getValue());
                    zzyam.zzW7(zzyam.zzY5N() - zzv22.getPreferredWidth().getValue());
                    min -= zzv22.zz0K().getMin();
                    max -= zzv22.zz0K().getMax();
                    zzyam.zzY5M().zzZO(zzyam.zzY5M().getMin() - dMax2);
                    zzv22.zz0K().zzZO(dMax2);
                }
            }
            for (int iZzY5X3 = zzyam.zzY5X(); iZzY5X3 < zzyam.zzY5W() && min < zzyam.zzY5M().getMin() && max > 0.0d; iZzY5X3++) {
                zzV2 zzv23 = this.zzX5l[iZzY5X3];
                if (!zzv23.getPreferredWidth().isFixed() || !zzyam.zzY5Q() || zzyam.zzY5N() > zzyam.zzY5M().getMin()) {
                    double dMin = Math.min(Math.max(zzv23.zz0K().getMin(), (zzyam.zzY5M().getMin() * zzv23.zz0K().getMax()) / max), (zzyam.zzY5M().getMin() - min) + zzv23.zz0K().getMin());
                    min -= zzv23.zz0K().getMin();
                    max -= zzv23.zz0K().getMax();
                    zzyam.zzY5M().zzZO(zzyam.zzY5M().getMin() - dMin);
                    zzv23.zz0K().zzZO(dMin);
                }
            }
        }
    }

    private void zzXXG() {
        for (int i = 0; i < this.zzX56.size(); i++) {
            this.zzX56.get(i).zzY0e();
        }
    }

    private void zzXXH() {
        for (int i = 0; i < this.zzZzY.getRows().getCount(); i++) {
            for (int i2 = 0; i2 < this.zzX5l.length; i2++) {
                Cell cellZzW = zzW(this.zzZzY, i2, i);
                if (cellZzW != null) {
                    cellZzW.zz6G().setWidth(com.aspose.words.internal.zzSA.zzr(Math.min(zzV(cellZzW, i2), 1584.0d)));
                }
            }
        }
    }

    private void zzXXI() {
        int i = 0;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzV2 zzv2 = zzv2Arr[i];
            zzv2.zzZ2(((double) com.aspose.words.internal.zzSA.zzr(zzv2.zz0J())) / 20.0d);
            i++;
        }
    }

    private void zzXXJ() {
        if (this.zzX5e < 0.0d) {
            double dZz0J = 0.0d;
            for (int length = this.zzX5l.length - 1; length >= 0; length--) {
                zzV2 zzv2 = this.zzX5l[length];
                if (zzv2.zz0L().zzYmB()) {
                    dZz0J += zzv2.zz0J() - zzv2.zz0K().getMin();
                }
            }
            for (int length2 = this.zzX5l.length - 1; length2 >= 0 && dZz0J > 0.0d; length2--) {
                zzV2 zzv22 = this.zzX5l[length2];
                if (zzv22.zz0L().zzYmB()) {
                    double dZz0J2 = zzv22.zz0J() - zzv22.zz0K().getMin();
                    double d = (this.zzX5e * dZz0J2) / dZz0J;
                    zzv22.zzZ2(zzv22.zz0J() + d);
                    double d2 = this.zzX5e - d;
                    this.zzX5e = d2;
                    dZz0J -= dZz0J2;
                    if (d2 >= 0.0d) {
                        return;
                    }
                }
            }
        }
    }

    private void zzXXK() {
        if (this.zzX5e < 0.0d) {
            double dZz0J = 0.0d;
            for (int length = this.zzX5l.length - 1; length >= 0; length--) {
                zzV2 zzv2 = this.zzX5l[length];
                if (zzv2.zz0L().isFixed()) {
                    dZz0J += zzv2.zz0J() - zzv2.zz0K().getMin();
                }
            }
            for (int length2 = this.zzX5l.length - 1; length2 >= 0 && dZz0J > 0.0d; length2--) {
                zzV2 zzv22 = this.zzX5l[length2];
                if (zzv22.zz0L().isFixed()) {
                    double dZz0J2 = zzv22.zz0J() - zzv22.zz0K().getMin();
                    double d = (this.zzX5e * dZz0J2) / dZz0J;
                    zzv22.zzZ2(zzv22.zz0J() + d);
                    double d2 = this.zzX5e - d;
                    this.zzX5e = d2;
                    dZz0J -= dZz0J2;
                    if (d2 >= 0.0d) {
                        return;
                    }
                }
            }
        }
    }

    private void zzXXL() {
        if (this.zzX5e < 0.0d) {
            double dZz0J = 0.0d;
            for (int length = this.zzX5l.length - 1; length >= 0; length--) {
                zzV2 zzv2 = this.zzX5l[length];
                if (zzv2.zz0L().isAuto()) {
                    dZz0J += zzv2.zz0J() - zzv2.zz0K().getMin();
                }
            }
            for (int length2 = this.zzX5l.length - 1; length2 >= 0 && dZz0J > 0.0d; length2--) {
                zzV2 zzv22 = this.zzX5l[length2];
                if (zzv22.zz0L().isAuto()) {
                    double dZz0J2 = zzv22.zz0J() - zzv22.zz0K().getMin();
                    double d = (this.zzX5e * dZz0J2) / dZz0J;
                    zzv22.zzZ2(zzv22.zz0J() + d);
                    double d2 = this.zzX5e - d;
                    this.zzX5e = d2;
                    dZz0J -= dZz0J2;
                    if (d2 >= 0.0d) {
                        return;
                    }
                }
            }
        }
    }

    private void zzXXM() {
        if (this.zzX5e <= 0.0d) {
            return;
        }
        int length = this.zzX5l.length;
        int i = length;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return;
            }
            double d = this.zzX5e;
            double d2 = d / ((double) i);
            this.zzX5e = d - d2;
            i--;
            zzV2 zzv2 = this.zzX5l[i2];
            zzv2.zzZ2(zzv2.zz0J() + d2);
            length = i2;
        }
    }

    private void zzXXN() {
        if (this.zzX5e <= 0.0d || this.zzX5c <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzV2 zzv2 = zzv2Arr[i];
            if (zzv2.zz0L().isFixed()) {
                double max = this.zzX5e * zzv2.zz0K().getMax();
                double d = this.zzX58;
                double d2 = max / d;
                this.zzX5e -= d2;
                this.zzX58 = d - zzv2.zz0K().getMax();
                zzv2.zzZ2(zzv2.zz0J() + d2);
            }
            i++;
        }
    }

    private void zzXXO() {
        if (this.zzX5e <= 0.0d || !this.zzYud || this.zzXcw >= 100.0d) {
            return;
        }
        int i = 0;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzV2 zzv2 = zzv2Arr[i];
            PreferredWidth preferredWidthZz0L = zzv2.zz0L();
            if (preferredWidthZz0L.zzYmB()) {
                double value = preferredWidthZz0L.getValue() * this.zzX5e;
                double d = this.zzXcw;
                double d2 = value / d;
                this.zzX5e -= d2;
                this.zzXcw = d - preferredWidthZz0L.getValue();
                zzv2.zzZ2(zzv2.zz0J() + d2);
                if (this.zzX5e == 0.0d || this.zzXcw == 0.0d) {
                    return;
                }
            }
            i++;
        }
    }

    private void zzXXP() {
        double d = this.zzX5e;
        if (d <= 0.0d || this.zzX5d <= 0) {
            return;
        }
        this.zzX5e = d + this.zzX5a;
        int i = 0;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzV2 zzv2 = zzv2Arr[i];
            if (zzv2.zz0L().isAuto() && this.zzX59 != 0.0d) {
                double dMax = Math.max(zzv2.zz0J(), (this.zzX5e * zzv2.zz0K().getMax()) / this.zzX59);
                this.zzX5e -= dMax;
                this.zzX59 -= zzv2.zz0K().getMax();
                zzv2.zzZ2(dMax);
            }
            i++;
        }
    }

    private void zzXXQ() {
        if (this.zzX5e <= 0.0d) {
            return;
        }
        int i = 0;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzV2 zzv2 = zzv2Arr[i];
            PreferredWidth preferredWidthZz0L = zzv2.zz0L();
            if (preferredWidthZz0L.isFixed() && preferredWidthZz0L.getValue() > zzv2.zz0J()) {
                this.zzX5e = (zzv2.zz0J() - preferredWidthZz0L.getValue()) + this.zzX5e;
                zzv2.zzZ2(preferredWidthZz0L.getValue());
            }
            i++;
        }
    }

    private void zzXXR() {
        if (this.zzX5e <= 0.0d || this.zzX5b <= 0) {
            return;
        }
        double dZzP = this.zzX5i - zzZSF.zzP(this.zzZzY);
        int i = 0;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzV2 zzv2 = zzv2Arr[i];
            PreferredWidth preferredWidthZz0L = zzv2.zz0L();
            if (preferredWidthZz0L.zzYmB()) {
                double dMax = Math.max(zzv2.zz0K().getMin(), (preferredWidthZz0L.getValue() * dZzP) / 100.0d);
                this.zzX5e = (zzv2.zz0J() - dMax) + this.zzX5e;
                zzv2.zzZ2(dMax);
            }
            i++;
        }
    }

    private void zzXXS() {
        this.zzX5e = this.zzX5i - zzZSF.zzP(this.zzZzY);
        int i = 0;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzV2 zzv2 = zzv2Arr[i];
            zzv2.zz0K().zzZN(Math.max(zzv2.zz0K().getMin(), zzv2.zz0K().getMax()));
            zzv2.zzZ2(zzv2.zz0K().getMin());
            this.zzX5e -= zzv2.zz0K().getMin();
            int type = zzv2.zz0L().getType();
            if (type == 1) {
                this.zzX5d++;
                this.zzX5a += zzv2.zz0K().getMin();
                this.zzX59 += zzv2.zz0K().getMax();
            } else if (type == 2) {
                this.zzX5b++;
                this.zzXcw = zzv2.zz0L().getValue() + this.zzXcw;
            } else if (type == 3) {
                this.zzX5c++;
                this.zzX58 += zzv2.zz0K().getMax();
            }
            i++;
        }
    }

    private void zzXXT() {
        zzXXS();
        zzXXR();
        zzXXQ();
        zzXXP();
        zzXXO();
        zzXXN();
        zzXXM();
        if (this.zzX5e < 0.0d) {
            zzXXL();
            zzXXK();
            zzXXJ();
        }
        zzXXI();
    }

    private void zzXXU() {
        PreferredWidth preferredWidth = this.zzZzY.getPreferredWidth();
        int type = preferredWidth.getType();
        if (type == 1) {
            this.zzX57 = Math.min(this.zzX5j, this.zzX5h.getMax());
        } else if (type != 2) {
            if (type != 3) {
                throw new IllegalStateException("Unknown length type.");
            }
            if (preferredWidth.zzYmC()) {
                this.zzX57 = preferredWidth.getValue();
            } else {
                this.zzX57 = Math.min(this.zzX5j, this.zzX5h.getMax());
            }
        } else if (preferredWidth.zzYmC()) {
            this.zzX57 = (preferredWidth.getValue() * this.zzX5j) / 100.0d;
        } else {
            this.zzX57 = Math.min(this.zzX5j, this.zzX5h.getMax());
        }
        this.zzX5i = Math.max(this.zzX57, this.zzX5h.getMin());
    }

    private void zzXXV() {
        double dZzG = zzG(this.zzZzY.zzYBd()) - this.zzZzY.getLeftIndent();
        this.zzX5j = dZzG;
        this.zzX5j = Math.min(dZzG, 6000.0d);
    }

    private boolean zzXXW() {
        Table parentTable = this.zzZzY;
        boolean z = true;
        while (parentTable != null) {
            PreferredWidth preferredWidth = parentTable.getPreferredWidth();
            if (!preferredWidth.isFixed()) {
                CompositeNode parentNode = this.zzZzY.getParentNode();
                while (parentNode != null && parentNode.getNodeType() != 7) {
                    parentNode = parentNode.getParentNode();
                }
                if (parentNode != null && parentNode.getNodeType() == 7) {
                    Cell cell = (Cell) parentNode;
                    if (!cell.getCellFormat().getPreferredWidth().isFixed()) {
                        if (preferredWidth.zzYmB() || zzZSF.zzT(cell) > 1 || cell.getParentRow().getParentTable().getPreferredWidth().isAuto()) {
                            parentTable = null;
                            z = false;
                        } else {
                            parentTable = cell.getParentRow().getParentTable();
                        }
                    }
                }
            }
            parentTable = null;
        }
        return z;
    }

    private void zzXXX() {
        double max = 0.0d;
        double d = 100.0d;
        int i = 0;
        double dMax = 0.0d;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                break;
            }
            zzV2 zzv2 = zzv2Arr[i];
            zzZ60 zzz60 = this.zzX5h;
            zzz60.zzZO(zzz60.getMin() + zzv2.zz0K().getMin());
            zzZ60 zzz602 = this.zzX5h;
            zzz602.zzZN(zzz602.getMax() + zzv2.zz0K().getMax());
            if (zzv2.zz0L().zzYmB()) {
                double dMin = Math.min(zzv2.zz0L().getValue(), d);
                d -= dMin;
                dMax = Math.max(dMax, (zzv2.zz0K().getMax() * 100.0d) / Math.max(dMin, 1.0d));
            } else {
                max += zzv2.zz0K().getMax();
            }
            i++;
        }
        if (zzXXW()) {
            double dMax2 = ((max * 100.0d) + 50.0d) / Math.max(d, 1.0d);
            zzZ60 zzz603 = this.zzX5h;
            zzz603.zzZN(Math.max(zzz603.getMax(), dMax2));
            zzZ60 zzz604 = this.zzX5h;
            zzz604.zzZN(Math.max(zzz604.getMax(), dMax));
        }
        zzZ60 zzz605 = this.zzX5h;
        zzz605.zzZN(Math.max(zzz605.getMax(), this.zzX5m));
        double dZzP = zzZSF.zzP(this.zzZzY);
        zzZ60 zzz606 = this.zzX5h;
        zzz606.zzZO(zzz606.getMin() + dZzP);
        zzZ60 zzz607 = this.zzX5h;
        zzz607.zzZN(zzz607.getMax() + dZzP);
        if (this.zzZzY.getPreferredWidth().isFixed() && this.zzZzY.getPreferredWidth().zzYmC()) {
            zzZ60 zzz608 = this.zzX5h;
            zzz608.zzZO(Math.max(zzz608.getMin(), this.zzZzY.getPreferredWidth().getValue()));
            zzZ60 zzz609 = this.zzX5h;
            zzz609.zzZN(zzz609.getMin());
        }
        zzZ60 zzz6010 = this.zzX5h;
        zzz6010.zzZO(Math.min(zzz6010.getMin(), 1584.0d));
        zzZ60 zzz6011 = this.zzX5h;
        zzz6011.zzZN(Math.min(zzz6011.getMax(), 1584.0d));
    }

    private void zzXXY() {
        this.zzX5m = 0.0d;
        Collections.sort(this.zzX5f, new zzYAO());
        int i = 0;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzv2Arr[i].zz0N();
            i++;
        }
    }

    private void zzXXZ() {
        zzXXY();
        for (int i = 0; i < this.zzX5f.size(); i++) {
            zzYAM zzyam = new zzYAM();
            zzYAR zzyar = this.zzX5f.get(i);
            Cell cellZz6C = zzyar.zz6C();
            zzyam.zzlK(zzyar.zzY66());
            zzyam.zzlM(zzyar.getColumnIndex());
            zzyam.zzlL(zzyam.zzY5X());
            zzyam.zzU(cellZz6C.getCellFormat().getPreferredWidth());
            if (!zzyam.zzY5V().zzYmC()) {
                zzyam.zzU(PreferredWidth.AUTO);
            }
            zzyam.zzX(zzn(cellZz6C));
            zzyam.zzY5M().zzZO(this.zzZzY.getCellSpacing() + zzyam.zzY5M().getMin());
            zzyam.zzY5M().zzZN(this.zzZzY.getCellSpacing() + zzyam.zzY5M().getMax());
            zzyam.zzW(new zzZ60());
            zzZ(zzyam);
            zzY(zzyam);
            zzX(zzyam);
            zzW(zzyam);
        }
    }

    private void zzXY0() {
        int i = 0;
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzV2 zzv2 = zzv2Arr[i];
            for (int i2 = 0; i2 < this.zzZzY.getRows().getCount(); i2++) {
                Cell cellZzW = zzW(this.zzZzY, i, i2);
                if (cellZzW != null) {
                    CellFormat cellFormat = cellZzW.getCellFormat();
                    if (cellFormat.getVerticalMerge() == 2) {
                        continue;
                    } else {
                        int horizontalMerge = cellFormat.getHorizontalMerge();
                        if (horizontalMerge == 0 || horizontalMerge == 1) {
                            zzv2.zz0I();
                            if (zzZSF.zzT(cellZzW) > 1) {
                                zzW(cellZzW, i);
                            } else {
                                zzZ(cellZzW, zzv2);
                            }
                        } else if (horizontalMerge != 2) {
                            throw new IllegalStateException("Unknown cell merge.");
                        }
                    }
                }
            }
            if (zzv2.getPreferredWidth().isFixed() && zzv2.zz0M().getMax() > zzv2.getPreferredWidth().getValue() && this.zzX5o != this.zzX5n) {
                zzv2.setPreferredWidth(PreferredWidth.AUTO);
                this.zzX5o = null;
            }
            zzv2.zz0M().zzZN(Math.max(zzv2.zz0M().getMin(), zzv2.zz0M().getMax()));
            i++;
        }
    }

    private void zzXY1() {
        this.zzX5g = new zzYML();
        this.zzX5f = new ArrayList<>();
        this.zzX56 = new ArrayList<>();
        this.zzX5o = null;
        this.zzX5n = null;
        int i = 0;
        this.zzYud = false;
        this.zzX5h = new zzZ60();
        this.zzX5d = 0;
        this.zzX5c = 0;
        this.zzX5b = 0;
        this.zzX5l = new zzV2[this.zzZzY.getColumnCount()];
        while (true) {
            zzV2[] zzv2Arr = this.zzX5l;
            if (i >= zzv2Arr.length) {
                return;
            }
            zzv2Arr[i] = new zzV2();
            i++;
        }
    }

    private void zzXY2() {
        if (this.zzX5k) {
            zzXY1();
            zzXY0();
            zzXXZ();
            zzXXX();
            this.zzX5k = false;
        }
    }

    private void zzY(zzYAM zzyam) {
        if (zzyam.zzY5V().zzYmB()) {
            if (zzyam.zzY5O() > zzyam.zzY5V().getValue() || zzyam.zzY5S()) {
                zzyam.zzU(PreferredWidth.AUTO);
                return;
            }
            this.zzX5m = Math.max(this.zzX5m, (Math.max(zzyam.zzY5L().getMax(), zzyam.zzY5M().getMax()) * 100.0d) / zzyam.zzY5V().getValue());
            double value = zzyam.zzY5V().getValue() - zzyam.zzY5O();
            double max = 0.0d;
            for (int iZzY5X = zzyam.zzY5X(); iZzY5X < zzyam.zzY5W(); iZzY5X++) {
                zzV2 zzv2 = this.zzX5l[iZzY5X];
                if (!zzv2.getPreferredWidth().zzYmB()) {
                    max += zzv2.zz0K().getMax();
                }
            }
            for (int iZzY5X2 = zzyam.zzY5X(); iZzY5X2 < zzyam.zzY5W() && max > 0.0d; iZzY5X2++) {
                zzV2 zzv22 = this.zzX5l[iZzY5X2];
                if (!zzv22.getPreferredWidth().zzYmB()) {
                    int max2 = (int) ((zzv22.zz0K().getMax() * value) / max);
                    max -= zzv22.zz0K().getMax();
                    double d = max2;
                    value -= d;
                    if (max2 > 0) {
                        zzv22.zzX(PreferredWidth.zzWm(d));
                    } else {
                        zzv22.zzX(PreferredWidth.AUTO);
                    }
                }
            }
        }
    }

    private void zzZ(Cell cell, zzV2 zzv2) {
        zzZ60 zzz60Zzn = zzn(cell);
        if (zzz60Zzn.getMax() > zzv2.zz0M().getMax()) {
            this.zzX5n = cell;
        }
        zzv2.zz0M().zzZ(zzz60Zzn);
        PreferredWidth preferredWidth = cell.getCellFormat().getPreferredWidth();
        int type = preferredWidth.getType();
        if (type == 2) {
            this.zzYud = true;
            if (preferredWidth.zzYmC()) {
                if (!zzv2.getPreferredWidth().zzYmB() || preferredWidth.getValue() > zzv2.getPreferredWidth().getValue()) {
                    zzv2.setPreferredWidth(PreferredWidth.zzWm(preferredWidth.getValue()));
                    return;
                }
                return;
            }
            return;
        }
        if (type == 3 && preferredWidth.zzYmC() && !zzv2.getPreferredWidth().zzYmB()) {
            double rightPadding = cell.getCellFormat().getRightPadding() + cell.getCellFormat().getLeftPadding() + preferredWidth.getValue();
            if (!zzv2.getPreferredWidth().isFixed()) {
                zzv2.setPreferredWidth(PreferredWidth.zzWl(rightPadding));
                this.zzX5o = cell;
            } else if (rightPadding > zzv2.getPreferredWidth().getValue() || (rightPadding > zzv2.getPreferredWidth().getValue() && cell == this.zzX5n)) {
                zzv2.setPreferredWidth(PreferredWidth.zzWl(rightPadding));
                this.zzX5o = cell;
            }
        }
    }

    private zzZ60 zzn(Cell cell) {
        zzZ60 zzz60 = new zzZ60();
        Iterator<T> it = cell.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zzY((Node) it.next(), zzz60);
        }
        zzz60.zzZN(Math.max(zzz60.getMin(), zzz60.getMax()));
        PreferredWidth preferredWidth = cell.getCellFormat().getPreferredWidth();
        if (preferredWidth.isFixed() && preferredWidth.zzYmC()) {
            zzz60.zzZN(Math.max(zzz60.getMin(), preferredWidth.getValue()));
        }
        zzz60.add(zzZSF.zzZ(cell));
        return zzz60;
    }

    private static double zzz(Section section) {
        PageSetup pageSetup = section.getPageSetup();
        Document documentZzYBa = section.zzYBa();
        boolean zZzZ = zzYN9.zzZ(section.zzYvR(), documentZzYBa.zzZpV(), documentZzYBa.getFirstSection().zzYvR().getOrientation());
        double dZzQX = ((double) section.zzYvR().zzQX(zZzZ)) / 20.0d;
        TextColumnCollection textColumns = pageSetup.getTextColumns();
        if (textColumns != null && textColumns.getCount() > 0) {
            if (section.zzYvR().zzYcp()) {
                return ((double) (section.zzYvR().zzQY(zZzZ) / textColumns.getCount())) / 20.0d;
            }
            for (int i = 0; i < textColumns.getCount(); i++) {
                double width = textColumns.get(i).getWidth();
                if (width < dZzQX) {
                    dZzQX = width;
                }
            }
        }
        return dZzQX;
    }

    public final zzZ60 zzXY3() {
        zzXY2();
        if (this.zzZzY.getAllowAutoFit()) {
            zzXXV();
            zzXXU();
            zzXXT();
            zzXXH();
        }
        if (!this.zzX55) {
            zzXXG();
        }
        return this.zzX5h;
    }

    private void zzW(zzYAM zzyam) {
        if (zzyam.zzY5V().zzYmB()) {
            for (int iZzY5X = zzyam.zzY5X(); iZzY5X < zzyam.zzY5W(); iZzY5X++) {
                zzV2 zzv2 = this.zzX5l[iZzY5X];
                zzv2.zz0M().zzZN(Math.max(zzv2.zz0M().getMin(), zzv2.zz0M().getMax()));
            }
            return;
        }
        if (zzyam.zzY5M().getMax() > zzyam.zzY5L().getMax()) {
            for (int iZzY5X2 = zzyam.zzY5X(); iZzY5X2 < zzyam.zzY5W() && zzyam.zzY5L().getMax() > 0.0d; iZzY5X2++) {
                zzV2 zzv22 = this.zzX5l[iZzY5X2];
                double dMax = Math.max(zzv22.zz0K().getMax(), (zzyam.zzY5M().getMax() * zzv22.zz0K().getMax()) / zzyam.zzY5L().getMax());
                zzyam.zzY5L().zzZN(zzyam.zzY5L().getMax() - zzv22.zz0K().getMax());
                zzyam.zzY5M().zzZN(zzyam.zzY5M().getMax() - dMax);
                zzv22.zz0K().zzZN(dMax);
            }
        }
    }

    private zzY6M(Table table, byte b) {
        this(table);
        this.zzX55 = true;
    }

    private static Cell zzW(Table table, int i, int i2) {
        if (i2 >= 0) {
            try {
                if (i2 >= table.getRows().getCount() || i < 0) {
                    return null;
                }
                int iZz5q = 0;
                for (Cell cell : table.getRows().get(i2).getCells()) {
                    if (iZz5q == i) {
                        return cell;
                    }
                    if (iZz5q >= i) {
                        break;
                    }
                    iZz5q += cell.zz6G().zz5q();
                }
                return null;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    private void zzY(Node node, zzZ60 zzz60) {
        int nodeType = node.getNodeType();
        if (nodeType == 5) {
            Table table = (Table) node;
            zzz60.zzZ(new zzY6M(table, (byte) 0).zzXY3());
            com.aspose.words.internal.zzZQG.zzZ(this.zzX56, table);
        } else if (nodeType != 8) {
            if (nodeType != 28) {
                return;
            }
            CompositeNode compositeNode = (CompositeNode) node;
            for (Node nodeZzZYv = compositeNode.zzZYv(); nodeZzZYv != null && nodeZzZYv.zzYF(compositeNode); nodeZzZYv = nodeZzZYv.zzYB7()) {
                zzY(nodeZzZYv, zzz60);
            }
        } else {
            zzz60.zzZ(this.zzX5g.zzYv((Paragraph) node));
        }
    }

    private void zzZ(zzYAM zzyam) {
        while (zzyam.zzY5W() < this.zzX5l.length && zzyam.zzY66() > 0) {
            zzV2 zzv2 = this.zzX5l[zzyam.zzY5W()];
            int type = zzv2.getPreferredWidth().getType();
            if (type == 1) {
                zzyam.zzY5P();
                zzyam.zzY5T();
                zzyam.zzY5R();
                zzv2.zzX(PreferredWidth.AUTO);
            } else if (type == 2) {
                zzyam.zzW8(zzv2.getPreferredWidth().getValue() + zzyam.zzY5O());
                zzyam.zzY5T();
            } else if (type == 3) {
                if (zzv2.getPreferredWidth().zzYmC()) {
                    zzyam.zzW7(zzv2.getPreferredWidth().getValue() + zzyam.zzY5N());
                    zzyam.zzY5R();
                } else {
                    zzyam.zzY5P();
                    zzyam.zzY5T();
                    zzyam.zzY5R();
                    zzv2.zzX(PreferredWidth.AUTO);
                }
            } else {
                throw new IllegalStateException("Unknown length type.");
            }
            zzyam.zzY5L().zzZO(zzyam.zzY5L().getMin() + zzv2.zz0K().getMin());
            zzyam.zzY5L().zzZN(zzyam.zzY5L().getMax() + zzv2.zz0K().getMax());
            zzyam.zzY5M().zzZO(zzyam.zzY5M().getMin() - this.zzZzY.getCellSpacing());
            zzyam.zzY5M().zzZN(zzyam.zzY5M().getMax() - this.zzZzY.getCellSpacing());
            zzyam.zzlK(zzyam.zzY66() - 1);
            zzyam.zzlL(zzyam.zzY5W() + 1);
        }
    }
}
