package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4J implements Cloneable, Comparable<zzZ4J> {
    private String mName;
    private int zzYCU;
    private int zzYcA;
    private ListLevelCollection zzYcB;
    private int zzYcC;
    private int zzYcM;
    private boolean zzYcz;
    private DocumentBase zzZCL;

    public zzZ4J(DocumentBase documentBase) {
        this.zzYCU = 1;
        this.zzYcA = 12;
        this.zzZCL = documentBase;
        this.zzYcB = new ListLevelCollection();
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
    public int compareTo(zzZ4J zzz4j) {
        return com.aspose.words.internal.zzZKR.zzZ7(this.zzYcM, zzz4j.zzYcM);
    }

    public final DocumentBase getDocument() {
        return this.zzZCL;
    }

    public final ListLevelCollection getListLevels() {
        return (isListStyleReference() && this.zzYcB.getCount() == 0) ? zzYOS().zzYcB : this.zzYcB;
    }

    public final String getName() {
        return this.mName;
    }

    public final Style getStyle() {
        Style styleZzZ8;
        int i = this.zzYcA;
        if (i == 12287 || i == 12 || (styleZzZ8 = this.zzZCL.getStyles().zzZ8(this.zzYcA, true)) == null || styleZzZ8.getType() != 4) {
            return null;
        }
        return styleZzZ8;
    }

    public final int hashCode() {
        int iZzYY = (((this.zzYCU * 397) ^ com.aspose.words.internal.zzZKP.zzYY(isListStyleDefinition())) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(isListStyleReference());
        Iterator<ListLevel> it = this.zzYcB.iterator();
        while (it.hasNext()) {
            iZzYY = (iZzYY * 397) ^ it.next().hashCode();
        }
        return iZzYY;
    }

    public final boolean isListStyleDefinition() {
        Style style = getStyle();
        return style != null && style.getList().zzYPa() == this;
    }

    public final boolean isListStyleReference() {
        Style style = getStyle();
        return (style == null || style.getList().zzYPa() == this) ? false : true;
    }

    public final boolean isRestartAtEachSection() {
        return this.zzYcz;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final zzZ4J zzX(DocumentBase documentBase, int i) {
        zzZ4J zzz4j = (zzZ4J) memberwiseClone();
        zzz4j.zzZCL = documentBase;
        zzz4j.zzYcM = i;
        zzz4j.zzYcB = this.zzYcB.zzz(documentBase);
        return zzz4j;
    }

    public final int zzYOO() {
        return this.zzYcA;
    }

    public final ListLevelCollection zzYOP() {
        return this.zzYcB;
    }

    public final int zzYOQ() {
        return this.zzYcC;
    }

    public final int zzYOR() {
        return this.zzYCU;
    }

    public final zzZ4J zzYOS() {
        zzZ4J zzz4jZzYPa = this;
        while (zzz4jZzYPa.isListStyleReference()) {
            zzz4jZzYPa = zzz4jZzYPa.getStyle().getList().zzYPa();
        }
        return zzz4jZzYPa.zzYcB.getCount() > 0 ? zzz4jZzYPa : zzz4jZzYPa.zzZCL.getStyles().zzZ8(12, false).getList().zzYPa();
    }

    public final void zzYOT() {
        this.zzYcB = new ListLevelCollection(this.zzZCL, this.zzYCU);
    }

    public final int zzYP8() {
        return this.zzYcM;
    }

    public final boolean zzZ(zzZ4J zzz4j, com.aspose.words.internal.zzIM<com.aspose.words.internal.zz6R> zzim) {
        if (zzz4j == null || this.zzYCU != zzz4j.zzYCU || this.zzYcB.getCount() != zzz4j.zzYcB.getCount() || isListStyleDefinition() != zzz4j.isListStyleDefinition() || isListStyleReference() != zzz4j.isListStyleReference()) {
            return false;
        }
        Style style = getStyle();
        if (style != null && !style.zzZ(zzz4j.getStyle(), zzim)) {
            return false;
        }
        for (int i = 0; i < this.zzYcB.getCount(); i++) {
            if (!this.zzYcB.get(i).zzZ(zzz4j.zzYcB.get(i), zzim)) {
                return false;
            }
        }
        return true;
    }

    public final void zzxB(int i) {
        this.zzYcM = i;
    }

    public final void zzxh(int i) {
        this.zzYcA = i;
        if (i == 12287) {
            this.zzYcA = 12;
        }
    }

    public final void zzxi(int i) {
        this.zzYcC = i;
    }

    public final void zzxj(int i) {
        this.zzYCU = i;
    }

    public final void isRestartAtEachSection(boolean z) {
        this.zzYcz = z;
    }

    public zzZ4J(DocumentBase documentBase, int i, int i2, int i3) {
        this.zzYcA = 12;
        this.zzZCL = documentBase;
        this.zzYcM = i;
        this.zzYCU = i2;
        this.zzYcC = i3;
        this.zzYcB = new ListLevelCollection(documentBase, i2);
    }

    public final zzYTV zzZ(int i, zzZV7 zzzv7) {
        if (i >= this.zzYcB.getCount()) {
            return null;
        }
        zzYTV zzytv = new zzYTV();
        zzytv.setAuthor(zzzv7.getAuthor());
        zzytv.zz4(zzzv7.zzZx());
        zzytv.zzSt(true);
        zzytv.setNumberFormat(this.zzYcB.get(i).getNumberFormat());
        for (int i2 = 0; i2 <= i; i2++) {
            ListLevel listLevel = this.zzYcB.get(i2);
            zzytv.zzYyo()[i2] = listLevel.getNumberStyle();
            zzytv.zzYyn()[i2] = listLevel.getStartAt();
        }
        return zzytv;
    }
}
