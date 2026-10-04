package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBN implements com.aspose.words.internal.zzF8 {
    private ITextShaperFactory zzXeB;

    public zzYBN(ITextShaperFactory iTextShaperFactory) {
        this.zzXeB = iTextShaperFactory;
    }

    private static void zzX(com.aspose.words.internal.zzPM zzpm, Cluster[] clusterArr) {
        if (zzpm.zzPj()) {
            float fZzWP = com.aspose.words.internal.zzZXD.zzWP(zzpm.zzPh());
            if (com.aspose.words.internal.zzAN.zzf(fZzWP)) {
                return;
            }
            for (int i = 0; i < clusterArr.length; i++) {
                Cluster cluster = clusterArr[i];
                clusterArr[i] = com.aspose.words.internal.zzZZF.zzZ(zzpm, cluster, (zzpm.zzPg() * fZzWP) + cluster.getWidth(zzpm.zzPl().zzpO(), zzpm.zzPg()));
            }
        }
    }

    @Override // com.aspose.words.internal.zzF8
    public final Cluster[] zzZ(String str, com.aspose.words.internal.zzPM zzpm, boolean z, boolean z2) throws Exception {
        Cluster[] clusterArrZzZ = zzYBO.zzZ(str, zzpm, z, z2, this.zzXeB);
        zzX(zzpm, clusterArrZzZ);
        return clusterArrZzZ;
    }
}
