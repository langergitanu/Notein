package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBR extends zzJR {
    private zzYBQ zzXeI;

    public zzYBR(ITextShaperFactory iTextShaperFactory) {
        this.zzXeI = new zzYBQ(iTextShaperFactory);
    }

    private boolean zzZI(zzYAU zzyau) throws Exception {
        return this.zzXeI.zzZG(zzyau).length == 0;
    }

    private Cluster[] zzZJ(zzYAU zzyau) throws Exception {
        int iZzY7f = zzyau.zzY7f();
        Cluster[] clusterArrZzZG = this.zzXeI.zzZG(zzyau);
        if (iZzY7f == 0) {
            return clusterArrZzZG;
        }
        int iZzpO = (int) (((iZzY7f / 1000.0f) * zzyau.zzY6N().zzZr().zzPl().zzpO()) / zzyau.zzY6N().zzZr().zzPg());
        Cluster[] clusterArr = new Cluster[clusterArrZzZG.length];
        for (int i = 0; i < clusterArrZzZG.length; i++) {
            Cluster clusterDeepClone = clusterArrZzZG[i].deepClone();
            int length = clusterDeepClone.getGlyphs().length - 1;
            clusterDeepClone.getGlyphs()[length].setAdvance((short) (clusterDeepClone.getGlyphs()[length].getAdvance() + iZzpO));
            clusterArr[i] = clusterDeepClone;
        }
        return clusterArr;
    }

    private static void zzZK(zzYAU zzyau) throws Exception {
        if (zzyau == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: span");
        }
        if (!zzyau.zzY6g()) {
            throw new IllegalStateException("span is not shapeable");
        }
    }

    @Override // com.aspose.words.zzJR
    public final Cluster[] zzO(zzYAU zzyau) throws Exception {
        return zzZJ(zzyau);
    }

    @Override // com.aspose.words.zzJR
    public final void zzP(zzYAU zzyau) {
        this.zzXeI.zzZF(zzyau);
    }

    @Override // com.aspose.words.zzJR
    public final int zzQ(zzYAU zzyau) throws Exception {
        zzZK(zzyau);
        return this.zzXeI.zzQ(zzyau);
    }

    @Override // com.aspose.words.zzJR
    public final char zzW(zzYAU zzyau, int i) throws Exception {
        Cluster[] clusterArrZzZG = this.zzXeI.zzZG(zzyau);
        if (clusterArrZzZG.length == 0) {
            return (char) 0;
        }
        return com.aspose.words.internal.zzZVS.zzS7(clusterArrZzZG[i].getCodepoints()[0]).charAt(0);
    }

    @Override // com.aspose.words.zzJR
    public final int zzX(zzYAU zzyau, int i) throws Exception {
        zzZK(zzyau);
        if (zzZI(zzyau)) {
            return 0;
        }
        return this.zzXeI.zzQ(zzyau, i);
    }

    @Override // com.aspose.words.zzJR
    public final int zzY(zzY9S zzy9s) throws Exception {
        zzZK(zzy9s);
        return this.zzXeI.zzZH(zzy9s);
    }

    @Override // com.aspose.words.zzJR
    public final int zzZ(zzY9S zzy9s, int i, int i2) throws Exception {
        zzZK(zzy9s);
        if (zzZI(zzy9s)) {
            return 0;
        }
        return this.zzXeI.zzY(zzy9s, i, i2);
    }

    @Override // com.aspose.words.zzJR
    public final void zzZ(zzY9W zzy9w, zzY9W zzy9w2, int i) throws Exception {
        this.zzXeI.zzX(zzy9w, zzy9w2, i);
        zzy9w.setLength(zzy9w.getLength() - i);
    }

    @Override // com.aspose.words.zzJR
    public final void zzZ(zzY9S zzy9s, zzY9S zzy9s2, int i) throws Exception {
        this.zzXeI.zzX(zzy9s, zzy9s2, i);
        zzy9s.setText(Cluster.getString(this.zzXeI.zzZG(zzy9s)));
        zzy9s2.setText(Cluster.getString(this.zzXeI.zzZG(zzy9s2)));
    }

    @Override // com.aspose.words.zzJR
    public final void zzZ(zzY9S zzy9s, zzY9S zzy9s2) throws Exception {
        this.zzXeI.zzJ(zzy9s, zzy9s2);
        zzy9s.setText(zzy9s.getText() + zzy9s2.getText());
    }

    @Override // com.aspose.words.zzJR
    public final void zzZ(zzY9W zzy9w, zzY9W zzy9w2) throws Exception {
        this.zzXeI.zzJ(zzy9w, zzy9w2);
        zzy9w.setLength(zzy9w.getLength() + zzy9w2.getLength());
    }
}
