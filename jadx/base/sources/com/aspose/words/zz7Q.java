package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz7Q {
    private com.aspose.words.internal.zzZQ4 zzZ3N;
    private zz2O zzZ3O;
    private Shading zzZ3P;
    private com.aspose.words.internal.zzP5[] zzZ3Q;
    private zz50 zzZ5y;
    private float zzZ3S = 0.0f;
    private float zzZ3R = 0.0f;

    public zz7Q(zz2O zz2o, zz50 zz50Var, com.aspose.words.internal.zzP5[] zzp5Arr, Shading shading) {
        this.zzZ3O = zz2o;
        this.zzZ5y = zz50Var;
        this.zzZ3Q = zzp5Arr;
        this.zzZ3P = shading;
    }

    private void zzZ(Paragraph paragraph, int[] iArr, com.aspose.words.internal.zzG zzg) throws Exception {
        if (paragraph.hasChildNodes()) {
            ArrayList<com.aspose.words.internal.zzZL> arrayListZzZ = zz1Y.zzZ(paragraph, this.zzZ3P, iArr);
            com.aspose.words.internal.zzZQ4[] zzzq4Arr = new com.aspose.words.internal.zzZQ4[arrayListZzZ.size()];
            int size = arrayListZzZ.size();
            com.aspose.words.internal.zzG[] zzgArr = new com.aspose.words.internal.zzG[size];
            for (int i = 0; i < arrayListZzZ.size(); i++) {
                com.aspose.words.internal.zzZL zzzl = arrayListZzZ.get(i);
                com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
                zzg2.zzX(zzzl);
                com.aspose.words.internal.zzG zzgZzZ = zzYM9.zzZ(zzg2, this.zzZ5y.zzZIB().getDocument().zzZqy(), null);
                zzgArr[i] = zzgZzZ;
                com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzgZzZ);
                if (zzzq4ZzZ.getWidth() > this.zzZ3S) {
                    this.zzZ3S = zzzq4ZzZ.getWidth();
                }
                zzzq4Arr[i] = zzzq4ZzZ;
            }
            for (int i2 = 0; i2 < size; i2++) {
                com.aspose.words.internal.zzG zzg3 = zzgArr[i2];
                com.aspose.words.internal.zzZQ4 zzzq4 = zzzq4Arr[i2];
                int alignment = paragraph.zzZYj().getAlignment();
                float width = alignment != 0 ? alignment != 2 ? (this.zzZ3S - zzzq4.getWidth()) * 0.5f : this.zzZ3S - zzzq4.getWidth() : 0.0f;
                com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
                zzp9.zzY(width - zzzq4.getX(), this.zzZ3R - zzzq4.getY(), 0);
                zzg3.zzW(zzp9);
                com.aspose.words.internal.zzD.zzZ(zzg3, true, false, false);
                zzg.zzX((com.aspose.words.internal.zzZL) zzg3);
                this.zzZ3R = zzzq4.getHeight() + this.zzZ3R;
            }
        }
    }

    public final com.aspose.words.internal.zzZQ4 zzZB0() {
        return this.zzZ3N;
    }

    public final com.aspose.words.internal.zzG zzZB1() throws Exception {
        float fZzT = (float) (((double) com.aspose.words.internal.zzP3.zzT(this.zzZ3Q[0])) / 12700.0d);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        int[] iArr = {825, 830, 815, 810, 820, 140, 80, 300};
        this.zzZ3R = 0.0f;
        this.zzZ3S = fZzT;
        for (Node node : this.zzZ3O.zzZyb().getChildNodes(0, false)) {
            if (node.getNodeType() == 8) {
                zzZ((Paragraph) node, iArr, zzg);
            }
        }
        this.zzZ3N = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, com.aspose.words.internal.zzSA.zzp(this.zzZ3S), com.aspose.words.internal.zzSA.zzp(this.zzZ3R));
        new com.aspose.words.internal.zzZE().zzZ(zzg, 1, 12700);
        return zzg;
    }
}
