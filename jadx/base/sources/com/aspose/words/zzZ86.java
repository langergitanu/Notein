package com.aspose.words;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ86 {
    private int zzYPq;
    private com.aspose.words.internal.zzZQH<Integer, String> zzYiO;
    private Node zzYiP;
    private long zzYiQ;
    private boolean zzYiR;
    private com.aspose.words.internal.zzD4 zzYiS;
    private com.aspose.words.internal.zzD4 zzYiT;
    private com.aspose.words.internal.zzD4 zzYiU;
    private com.aspose.words.internal.zzD4 zzYiV;
    private com.aspose.words.internal.zzD4 zzYiW;
    private com.aspose.words.internal.zzD5 zzYiX;
    private ImportFormatOptions zzYiY;
    private DocumentBase zzYiZ;
    private DocumentBase zzYj0;

    public zzZ86(StyleCollection styleCollection, StyleCollection styleCollection2) {
        this(styleCollection.getDocument(), styleCollection2.getDocument(), 1);
    }

    private void zzZ(Theme theme, Theme theme2) {
        if (com.aspose.words.internal.zzZKO.zzA(theme, theme2)) {
            return;
        }
        for (int i : zzYEF.zzXqa) {
            zzU1 zzu1ZzMW = zzU1.zzMW(i);
            if (!com.aspose.words.internal.zzZKN.equals(zzU1.zzZ(zzu1ZzMW, theme), zzU1.zzZ(zzU1.zzMW(i), theme2))) {
                this.zzYiO.set(Integer.valueOf(i), zzU1.zzZ(zzu1ZzMW, theme));
            }
        }
    }

    public final void zzM(zzYEF zzyef) {
        if (zzYVx()) {
            for (int i : zzYEF.zzXq6) {
                if (zzyef.contains(i)) {
                    zzU1 zzu1 = (zzU1) zzyef.get(i);
                    if (zzu1.zzZYI() && this.zzYiO.containsKey(Integer.valueOf(zzu1.zzZYJ()))) {
                        zzyef.zzQ(i, zzU1.zzSP(this.zzYiO.get(Integer.valueOf(zzu1.zzZYJ()))));
                    }
                }
            }
        }
        if (this.zzYiR) {
            if (!zzyef.contains(160)) {
                zzY5J.zzZ(zzyef, this.zzYiZ.zzZqI());
            }
            zzyef.remove(500);
        }
    }

    public final boolean zzR(Style style) {
        return this.zzYiX.get(style.zzZ7j()) != Integer.MIN_VALUE;
    }

    public final void zzXF(long j) {
        this.zzYiQ = j;
    }

    public final com.aspose.words.internal.zzD4 zzYVA() {
        return this.zzYiU;
    }

    public final com.aspose.words.internal.zzD4 zzYVB() {
        return this.zzYiV;
    }

    public final com.aspose.words.internal.zzD4 zzYVC() {
        return this.zzYiW;
    }

    public final com.aspose.words.internal.zzD5 zzYVD() {
        return this.zzYiX;
    }

    public final ListCollection zzYVE() {
        return this.zzYiZ.getLists();
    }

    public final ListCollection zzYVF() {
        return this.zzYj0.getLists();
    }

    public final StyleCollection zzYVG() {
        return this.zzYiZ.getStyles();
    }

    public final StyleCollection zzYVH() {
        return this.zzYj0.getStyles();
    }

    public final DocumentBase zzYVI() {
        return this.zzYiZ;
    }

    public final DocumentBase zzYVJ() {
        return this.zzYj0;
    }

    public final ImportFormatOptions zzYVu() {
        return this.zzYiY;
    }

    public final Node zzYVv() {
        return this.zzYiP;
    }

    public final boolean zzYVw() {
        return this.zzYiR;
    }

    public final boolean zzYVx() {
        return this.zzYiO.getCount() > 0;
    }

    public final com.aspose.words.internal.zzD4 zzYVy() {
        return this.zzYiS;
    }

    public final com.aspose.words.internal.zzD4 zzYVz() {
        return this.zzYiT;
    }

    public final void zzZ4(Node node) {
        this.zzYiP = node;
    }

    public final int zzZn1() {
        return this.zzYPq;
    }

    public final void zzyg(int i) {
        this.zzYPq = i;
    }

    public final boolean zzyh(int i) {
        return (this.zzYiY.getKeepSourceNumbering() || this.zzYiQ == ((long) i)) ? false : true;
    }

    public zzZ86(DocumentBase documentBase, DocumentBase documentBase2, int i) {
        this(documentBase, documentBase2, i, null);
    }

    public zzZ86(DocumentBase documentBase, DocumentBase documentBase2, int i, ImportFormatOptions importFormatOptions) {
        this(documentBase, documentBase2, i, importFormatOptions, null);
    }

    public zzZ86(DocumentBase documentBase, DocumentBase documentBase2, int i, ImportFormatOptions importFormatOptions, com.aspose.words.internal.zzD5 zzd5) {
        this.zzYiW = new com.aspose.words.internal.zzD4();
        this.zzYiV = new com.aspose.words.internal.zzD4();
        this.zzYiU = new com.aspose.words.internal.zzD4();
        this.zzYiT = new com.aspose.words.internal.zzD4();
        this.zzYiS = new com.aspose.words.internal.zzD4();
        this.zzYiQ = LocationRequestCompat.PASSIVE_INTERVAL;
        this.zzYiO = new com.aspose.words.internal.zzZQH<>();
        this.zzYj0 = documentBase;
        this.zzYiZ = documentBase2;
        this.zzYPq = i;
        this.zzYiY = importFormatOptions;
        if (importFormatOptions == null) {
            ImportFormatOptions importFormatOptions2 = new ImportFormatOptions();
            this.zzYiY = importFormatOptions2;
            importFormatOptions2.zzYVs();
        }
        this.zzYiX = zzd5 == null ? new com.aspose.words.internal.zzD5() : zzd5;
        if ((documentBase instanceof Document) || (documentBase2 instanceof Document)) {
            zzZ(documentBase.zzZqI(), documentBase2.zzZqI());
        }
        this.zzYiR = !Theme.zzX(documentBase.zzZqI(), documentBase2.zzZqI());
    }
}
