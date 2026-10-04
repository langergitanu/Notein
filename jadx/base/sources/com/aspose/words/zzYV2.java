package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYV2 {
    protected zzYV1 zzXTz;

    public final void zzG(zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        int depth = zzyu4ZzZsD.zz6().getDepth();
        com.aspose.words.internal.zzZL1 zzzl1Zz6 = zzyu4ZzZsD.zz6();
        while (true) {
            if (!zzyu4ZzZsD.zzQ(localName) && (zzzl1Zz6.getDepth() == depth || !zzZ(zzzl1Zz6, localName, depth))) {
                return;
            } else {
                this.zzXTz.zzF(zzyvb);
            }
        }
    }

    public abstract void zzY(zzYVB zzyvb) throws Exception;

    public final void zzZ(zzYV1 zzyv1) {
        this.zzXTz = zzyv1;
    }

    private static boolean zzZ(com.aspose.words.internal.zzZL1 zzzl1, String str, int i) {
        zzzl1.zzj();
        while (zzzl1.read()) {
            int nodeType = zzzl1.getNodeType();
            if (nodeType == 1) {
                return true;
            }
            if (nodeType == 2 && com.aspose.words.internal.zzZKN.equals(zzzl1.getLocalName(), str) && zzzl1.getDepth() == i) {
                return false;
            }
        }
        return false;
    }
}
