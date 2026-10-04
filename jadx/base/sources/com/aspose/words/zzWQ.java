package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWQ implements Cloneable {
    private int mColumnIndex;
    private int zzU8;
    private Table zzZzY;
    private static com.aspose.words.internal.zzZNR zzZzX = new com.aspose.words.internal.zzZNR("^([A-Z]{1,2})?(\\d{1,5})?$", 66);
    private static com.aspose.words.internal.zzZNR zzZzW = new com.aspose.words.internal.zzZNR("^R(\\d{1,5})C(\\d{1,5})$", 66);

    private zzWQ(Table table, int i, int i2) {
        this.zzZzY = table;
        this.mColumnIndex = i;
        this.zzU8 = i2;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean zzOw(int i) {
        return i >= 0 && i < this.zzZzY.getRows().getCount();
    }

    private static zzWQ zzY(Table table, String str, int i) {
        com.aspose.words.internal.zzZNT zzzntZzUX = zzZzX.zzUX(str);
        if (!zzzntZzUX.zzhL()) {
            return null;
        }
        com.aspose.words.internal.zzZNV zzznvZzQx = zzzntZzUX.zzhJ().zzQx(1);
        com.aspose.words.internal.zzZNV zzznvZzQx2 = zzzntZzUX.zzhJ().zzQx(2);
        if (!zzznvZzQx.zzhL()) {
            zzznvZzQx2.zzhL();
        }
        if (zzznvZzQx.zzhL() && zzznvZzQx2.zzhL()) {
            com.aspose.words.internal.zz7I zz7iZzZn = com.aspose.words.internal.zzJB.zzZn(zzznvZzQx2.getValue());
            if (zz7iZzZn.hasValue()) {
                return new zzWQ(table, zzYTW.zzYg(zzznvZzQx.getValue()), zz7iZzZn.getValue() - 1);
            }
            return null;
        }
        if (zzznvZzQx.zzhL()) {
            return new zzWQ(table, zzYTW.zzYg(zzznvZzQx.getValue()), i);
        }
        com.aspose.words.internal.zz7I zz7iZzZn2 = com.aspose.words.internal.zzJB.zzZn(zzznvZzQx2.getValue());
        if (zz7iZzZn2.hasValue()) {
            return new zzWQ(table, i, zz7iZzZn2.getValue() - 1);
        }
        return null;
    }

    private boolean zzYy(int i, int i2) {
        return zzOw(i) && i2 >= 0 && i2 < this.zzZzY.getRows().get(i).getCells().getCount();
    }

    public static zzWQ zzZ(Table table, String str, int i) {
        return zzY(table, str, i) != null ? zzY(table, str, i) : zzZ(table, str);
    }

    public final int getColumnIndex() {
        return this.mColumnIndex;
    }

    public final int getRowIndex() {
        return this.zzU8;
    }

    public final boolean isValid() {
        return zzYy(this.zzU8, this.mColumnIndex);
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("{0}{1}", zzYTW.zzUy(this.mColumnIndex) != null ? zzYTW.zzUy(this.mColumnIndex) : "!Invalid column name.", Integer.valueOf(this.zzU8 + 1));
    }

    public final boolean zz5E() {
        return this.zzU8 == this.zzZzY.getRows().getCount() - 1;
    }

    public final boolean zz5F() {
        return this.mColumnIndex == this.zzZzY.getRows().get(this.zzU8).getCells().getCount() - 1;
    }

    public final boolean zz5G() {
        return this.zzU8 == 0;
    }

    public final boolean zz5H() {
        return this.mColumnIndex == 0;
    }

    public final zzWQ zz5I() {
        return (zzWQ) memberwiseClone();
    }

    public final Cell zz6C() {
        return this.zzZzY.zzVl(this.mColumnIndex, this.zzU8);
    }

    public final void zzOv(int i) {
        this.mColumnIndex = 0;
    }

    public final boolean zzOx(int i) {
        if (this.mColumnIndex < 0) {
            return false;
        }
        int i2 = this.zzU8 + i;
        boolean zZzOw = zzOw(i2);
        if (zZzOw) {
            this.zzU8 = i2;
        }
        return zZzOw;
    }

    public final boolean zzOy(int i) {
        try {
            int i2 = this.mColumnIndex;
            if (i2 < 0) {
                return false;
            }
            int i3 = i2 + i;
            boolean zZzYy = zzYy(this.zzU8, i3);
            if (!zZzYy) {
                return zZzYy;
            }
            this.mColumnIndex = i3;
            return zZzYy;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static zzWQ zzZ(Table table, String str) {
        com.aspose.words.internal.zzZNT zzzntZzUX = zzZzW.zzUX(str);
        if (!zzzntZzUX.zzhL()) {
            return null;
        }
        com.aspose.words.internal.zzZNV zzznvZzQx = zzzntZzUX.zzhJ().zzQx(1);
        com.aspose.words.internal.zzZNV zzznvZzQx2 = zzzntZzUX.zzhJ().zzQx(2);
        com.aspose.words.internal.zz7I zz7iZzZn = com.aspose.words.internal.zzJB.zzZn(zzznvZzQx.getValue());
        com.aspose.words.internal.zz7I zz7iZzZn2 = com.aspose.words.internal.zzJB.zzZn(zzznvZzQx2.getValue());
        if (!zz7iZzZn.hasValue() || !zz7iZzZn2.hasValue() || zz7iZzZn.getValue() == 0 || zz7iZzZn2.getValue() == 0) {
            return null;
        }
        return new zzWQ(table, zz7iZzZn2.getValue() - 1, zz7iZzZn.getValue() - 1);
    }

    public zzWQ(Cell cell) {
        this(cell.getParentRow().getParentTable(), cell.getColumnIndex(), cell.getRowIndex());
    }

    public static boolean zzZ(zzWQ zzwq, zzWQ zzwq2) {
        return zzwq.mColumnIndex == zzwq2.mColumnIndex && zzwq.zzU8 == zzwq2.zzU8;
    }
}
