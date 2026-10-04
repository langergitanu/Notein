package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBQ {
    private HashMap<zzYAU, Cluster[]> zzXeH = new HashMap<>();
    private ITextShaperFactory zzYg5;

    public zzYBQ(ITextShaperFactory iTextShaperFactory) {
        this.zzYg5 = iTextShaperFactory;
    }

    public static float zzY(com.aspose.words.internal.zzPM zzpm, Cluster[] clusterArr) {
        float fZzZ = 0.0f;
        for (Cluster cluster : clusterArr) {
            fZzZ += zzZ(zzpm, cluster);
        }
        return fZzZ;
    }

    private static float zzZ(com.aspose.words.internal.zzPM zzpm, Cluster cluster) {
        float fZzPg = zzpm.zzPg();
        return cluster.getWidth(zzpm.zzPl().zzpO(), fZzPg) + ((zzpm.zzPj() ? com.aspose.words.internal.zzZXD.zzWP(zzpm.zzPh()) : 0.0f) * fZzPg);
    }

    private void zzZE(zzYAU zzyau) throws Exception {
        if (this.zzXeH.containsKey(zzyau)) {
            return;
        }
        for (Map.Entry<zzYAU, Cluster[]> entry : zzYBO.zzZ(zzyau, this.zzYg5).entrySet()) {
            zzYAU key = entry.getKey();
            Cluster[] value = entry.getValue();
            if (!this.zzXeH.containsKey(key)) {
                com.aspose.words.internal.zzZQF.zzY(this.zzXeH, key, value);
            }
        }
    }

    public final void zzJ(zzYAU zzyau, zzYAU zzyau2) {
        if ((this.zzXeH.containsKey(zzyau) || this.zzXeH.containsKey(zzyau2)) && this.zzXeH.containsKey(zzyau) == this.zzXeH.containsKey(zzyau2)) {
            if (this.zzXeH.containsKey(zzyau)) {
                this.zzXeH.containsKey(zzyau2);
            }
            Cluster[] clusterArr = this.zzXeH.get(zzyau);
            Cluster[] clusterArr2 = this.zzXeH.get(zzyau2);
            int length = clusterArr.length;
            int length2 = clusterArr2.length;
            Ref ref = new Ref(clusterArr);
            com.aspose.words.internal.zzZKV.zzZ(ref, length + length2);
            Cluster[] clusterArr3 = (Cluster[]) ref.get();
            com.aspose.words.internal.zzZKV.zzZ(clusterArr2, 0, clusterArr3, length, length2);
            this.zzXeH.put(zzyau, clusterArr3);
            com.aspose.words.internal.zzZQF.zzY(this.zzXeH, zzyau2);
        }
    }

    public final int zzQ(zzYAU zzyau) throws Exception {
        zzZE(zzyau);
        float fZzZ = 0.0f;
        for (Cluster cluster : this.zzXeH.get(zzyau)) {
            fZzZ += zzZ(zzyau.zzY6N().zzZr(), cluster);
        }
        return com.aspose.words.internal.zzSA.zzn(fZzZ);
    }

    public final void zzX(zzYAU zzyau, zzYAU zzyau2, int i) {
        if (this.zzXeH.containsKey(zzyau)) {
            Cluster[] clusterArr = this.zzXeH.get(zzyau);
            Cluster[] clusterArr2 = new Cluster[i];
            int length = clusterArr.length - i;
            Cluster[] clusterArr3 = new Cluster[clusterArr.length - i];
            com.aspose.words.internal.zzZKV.zzZ(clusterArr, 0, clusterArr2, 0, i);
            com.aspose.words.internal.zzZKV.zzZ(clusterArr, i, clusterArr3, 0, length);
            this.zzXeH.put(zzyau, clusterArr3);
            com.aspose.words.internal.zzZQF.zzY(this.zzXeH, zzyau2, clusterArr2);
        }
    }

    public final void zzZF(zzYAU zzyau) {
        com.aspose.words.internal.zzZQF.zzY(this.zzXeH, zzyau);
    }

    public final Cluster[] zzZG(zzYAU zzyau) throws Exception {
        zzZE(zzyau);
        return this.zzXeH.get(zzyau);
    }

    public final int zzZH(zzYAU zzyau) throws Exception {
        zzZE(zzyau);
        return this.zzXeH.get(zzyau).length;
    }

    public final int zzY(zzYAU zzyau, int i, int i2) throws Exception {
        zzZE(zzyau);
        Cluster[] clusterArr = this.zzXeH.get(zzyau);
        float fZzZ = 0.0f;
        while (i <= i2) {
            fZzZ += zzZ(zzyau.zzY6N().zzZr(), clusterArr[i]);
            i++;
        }
        return com.aspose.words.internal.zzSA.zzn(fZzZ);
    }

    public final int zzQ(zzYAU zzyau, int i) throws Exception {
        zzZE(zzyau);
        return com.aspose.words.internal.zzSA.zzn(zzZ(zzyau.zzY6N().zzZr(), this.zzXeH.get(zzyau)[i]));
    }
}
