package com.aspose.words;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class ConditionalStyleCollection implements Iterable<ConditionalStyle> {
    private static int zzZsI = 12;
    private TableStyle zzZsM;
    private com.aspose.words.internal.zzD3<ConditionalStyle> zzqv = new com.aspose.words.internal.zzD3<>();

    public static final class zzZ implements Iterator<ConditionalStyle> {
        private int zzTL = -1;
        private ConditionalStyleCollection zzZsH;

        public zzZ(ConditionalStyleCollection conditionalStyleCollection) {
            this.zzZsH = conditionalStyleCollection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzZY8, reason: merged with bridge method [inline-methods] */
        public ConditionalStyle next() {
            try {
                return this.zzZsH.get(this.zzTL);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.zzTL >= this.zzZsH.getCount() - 1) {
                return false;
            }
            this.zzTL++;
            return true;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ConditionalStyleCollection(TableStyle tableStyle) {
        this.zzZsM = tableStyle;
    }

    private static int zzMK(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public final void clear() {
        this.zzqv.clear();
    }

    public final void clearFormatting() {
        ConditionalStyle conditionalStyle = this.zzqv.get(0);
        ConditionalStyle conditionalStyle2 = this.zzqv.get(13);
        this.zzqv.clear();
        if (conditionalStyle != null) {
            this.zzqv.add(0, conditionalStyle);
        }
        if (conditionalStyle2 != null) {
            this.zzqv.add(13, conditionalStyle2);
        }
    }

    public final ConditionalStyle get(int i) {
        return getByConditionalStyleType(ConditionalStyleType.getValues()[i]);
    }

    public final ConditionalStyle getBottomLeftCell() {
        return getByConditionalStyleType(10);
    }

    public final ConditionalStyle getBottomRightCell() {
        return getByConditionalStyleType(11);
    }

    public final ConditionalStyle getByConditionalStyleType(int i) {
        return zzMJ(zzMK(i));
    }

    public final int getCount() {
        return zzZsI;
    }

    public final ConditionalStyle getEvenColumnBanding() {
        return getByConditionalStyleType(7);
    }

    public final ConditionalStyle getEvenRowBanding() {
        return getByConditionalStyleType(6);
    }

    public final ConditionalStyle getFirstColumn() {
        return getByConditionalStyleType(1);
    }

    public final ConditionalStyle getFirstRow() {
        return getByConditionalStyleType(0);
    }

    public final ConditionalStyle getLastColumn() {
        return getByConditionalStyleType(3);
    }

    public final ConditionalStyle getLastRow() {
        return getByConditionalStyleType(2);
    }

    public final ConditionalStyle getOddColumnBanding() {
        return getByConditionalStyleType(5);
    }

    public final ConditionalStyle getOddRowBanding() {
        return getByConditionalStyleType(4);
    }

    public final ConditionalStyle getTopLeftCell() {
        return getByConditionalStyleType(8);
    }

    public final ConditionalStyle getTopRightCell() {
        return getByConditionalStyleType(9);
    }

    @Override // java.lang.Iterable
    public final Iterator<ConditionalStyle> iterator() {
        return new zzZ(this);
    }

    public final ConditionalStyle zzMJ(int i) {
        if (this.zzqv.zzVE(i)) {
            return this.zzqv.get(i);
        }
        ConditionalStyle conditionalStyle = new ConditionalStyle(i, this.zzZsM);
        this.zzqv.add(i, conditionalStyle);
        return conditionalStyle;
    }

    public final boolean zzML(int i) {
        return zzMM(zzMK(i));
    }

    public final boolean zzMM(int i) {
        return this.zzqv.zzVE(i);
    }

    public final void zzY(ConditionalStyle conditionalStyle) {
        this.zzqv.add(conditionalStyle.zzZYk(), conditionalStyle);
        conditionalStyle.zzZ(this.zzZsM);
    }

    public final Collection<ConditionalStyle> zzZY9() {
        return com.aspose.words.internal.zzZQG.zzT(this.zzqv.zzCJ());
    }
}
