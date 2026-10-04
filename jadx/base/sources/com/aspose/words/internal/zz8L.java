package com.aspose.words.internal;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.Cluster;
import com.aspose.words.Glyph;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz8L {
    private zzZZI zzXg;
    private float zzp9;
    private zz0Q zzpa;
    private ArrayList<zz8K> zzpe;

    public static class zzZ {
        private boolean zzp7;
        private int zzp8;
        private zz0Q zzpa;

        public zzZ(zz0Q zz0q, int i, boolean z, Cluster[] clusterArr) {
            this.zzpa = zz0q;
            this.zzp7 = z;
            this.zzp8 = z ? zzZ(i, clusterArr) : i;
        }

        private static int zzZ(int i, Cluster[] clusterArr) {
            int codepointsLength = 0;
            for (Cluster cluster : clusterArr) {
                codepointsLength += cluster.getCodepointsLength();
            }
            return (i + codepointsLength) - 1;
        }

        public final long zzyr() {
            long j = this.zzpa.get(this.zzp8);
            this.zzp8 += this.zzp7 ? -1 : 1;
            return j;
        }
    }

    private static long zzR(ArrayList<zz8K> arrayList) {
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        float fZzyp = 0.0f;
        float fZzyq = 0.0f;
        for (zz8K zz8k : arrayList) {
            fZzyp += zz8k.zzyp();
            fZzyq += zz8k.zzyq();
            fMax = Math.max(fMax, fZzyp);
            fMax2 = Math.max(fMax2, fZzyq);
        }
        return zzZPW.zzG(fMax, fMax2);
    }

    private static long zzS(zz0Q zz0q) {
        float fMax = 0.0f;
        float fIntBitsToFloat = 0.0f;
        float fZzYC = 0.0f;
        float fMax2 = 0.0f;
        for (int i = 0; i < zz0q.getCount(); i++) {
            fIntBitsToFloat += Float.intBitsToFloat((int) zz0q.get(i));
            fZzYC += zzZPY.zzYC(zz0q.get(i));
            fMax = Math.max(fMax, fIntBitsToFloat);
            fMax2 = Math.max(fMax2, fZzYC);
        }
        return zzZPW.zzG(fMax, fMax2);
    }

    private static boolean zzUK(int i) {
        if (i < 0 || i > 31) {
            return i >= 127 && i <= 159;
        }
        return true;
    }

    private float zzY(zzZZG zzzzg, float f) {
        ArrayList arrayList = new ArrayList(zzzzg.zzZh().length);
        zz0Q zz0q = this.zzpa;
        zzZ zzz = zz0q != null ? new zzZ(zz0q, zzzzg.zzrs(), zzzzg.zzZz(), zzzzg.zzZh()) : null;
        Cluster[] clusterArrZzZh = zzzzg.zzZh();
        int length = clusterArrZzZh.length;
        float f2 = 0.0f;
        int i = 0;
        while (i < length) {
            Cluster cluster = clusterArrZzZh[i];
            long jZzZ = zzZ(zzz, cluster, zzzzg.zzZr());
            float fZzYC = zzZPY.zzYC(jZzZ);
            zzZQG.zzZ((ArrayList<Cluster>) arrayList, zzZZF.zzZ(zzzzg.zzZr(), cluster, Float.intBitsToFloat((int) jZzZ)));
            if (!zzAN.zzf(fZzYC)) {
                zzZQG.zzZ(this.zzpe, new zz8K(zzzzg.zzZr(), (Cluster[]) arrayList.toArray(new Cluster[0]), zzzzg.zzZz(), f));
                arrayList.clear();
                f = fZzYC;
            }
            i++;
            f2 = fZzYC;
        }
        if (arrayList.size() > 0) {
            zzZQG.zzZ(this.zzpe, new zz8K(zzzzg.zzZr(), (Cluster[]) arrayList.toArray(new Cluster[0]), zzzzg.zzZz(), f));
        }
        return f2;
    }

    private static String zzYk(String str) {
        StringBuilder sb = new StringBuilder();
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            int iIntValue = ((Integer) itOooO00o.next()).intValue();
            zzZNH.zzU(sb, zzUK(iIntValue) ? " " : zzZVS.zzS7(iIntValue));
        }
        return sb.toString();
    }

    public static zz8N zzZ(int[] iArr, zz0Q zz0q, zzPM zzpm) {
        if (iArr.length == 0) {
            return new zz8N(new ArrayList(), "", zzpm, false, 0L, 0L);
        }
        zz8L zz8l = new zz8L();
        zz8l.zzpa = zz0q;
        zz8l.zzp9 = 0.0f;
        zz8l.zzXg = zzZ(iArr, zzpm);
        zz8l.zzys();
        return zz8l.zzyt();
    }

    private void zzys() {
        this.zzpe = new ArrayList<>(this.zzXg.zzyD().size());
        if (this.zzpa == null && zzAN.zzf(this.zzp9)) {
            Iterator<zzZZG> it = this.zzXg.zzyD().iterator();
            while (it.hasNext()) {
                zzZQG.zzZ(this.zzpe, new zz8K(it.next()));
            }
        } else {
            float fZzZ = 0.0f;
            for (zzZZG zzzzg : this.zzXg.zzyD()) {
                fZzZ = zzZ(zzzzg) ? zzZ(zzzzg, fZzZ) : zzY(zzzzg, fZzZ);
            }
        }
    }

    private zz8N zzyt() {
        zz0Q zz0q = this.zzpa;
        long jZzS = zz0q != null ? zzS(zz0q) : zzR(this.zzpe);
        return new zz8N(this.zzpe, this.zzXg.zzyE(), this.zzXg.zzrv(), this.zzXg.zzZz(), jZzS, zzZ(jZzS, this.zzXg.zzrv()));
    }

    public static zz8N zzZ(String str, boolean z, boolean z2, zz0Q zz0q, float f, zzPM zzpm, zzGQ zzgq, zzF8 zzf8) throws Exception {
        String strZzYk = zzYk(str);
        if (!zzZYD.zzXk(strZzYk)) {
            return new zz8N(new ArrayList(), strZzYk, zzpm, z, 0L, 0L);
        }
        zz8L zz8l = new zz8L();
        zz8l.zzpa = zz0q;
        zz8l.zzp9 = f;
        zz8l.zzXg = zzZZH.zzZ(zzpm, strZzYk, z, z2, zzgq, zzf8);
        zz8l.zzys();
        return zz8l.zzyt();
    }

    private static zzZZI zzZ(int[] iArr, zzPM zzpm) {
        zzZX5 zzzx5ZzpP = zzpm.zzPl().zzpP();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            zzZX9 zzzx9ZzSt = zzzx5ZzpP.zzSt(i);
            int iZzZD = zzzx9ZzSt.zzZD();
            if (iZzZD == 0) {
                iZzZD = 63;
            }
            zzZNH.zzU(sb, zzZVS.zzS7(iZzZD));
            zzZQG.zzZ((ArrayList<Cluster>) arrayList, new Cluster(new int[]{iZzZD}, new Glyph[]{new Glyph(zzzx9ZzSt.getGlyphIndex(), (short) zzzx9ZzSt.zzoZ(), (short) 0, (short) 0)}));
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new zzZZG(sb.toString(), false, zzpm, (Cluster[]) arrayList.toArray(new Cluster[0]), 0));
        return new zzZZI(sb.toString(), zzpm, false, arrayList2);
    }

    private static boolean zzZ(zzZZG zzzzg) {
        return zzZVS.zzS3(zzZVS.zzWK(zzzzg.getText())[0]);
    }

    private float zzZ(zzZZG zzzzg, float f) {
        ArrayList arrayListZzV = zzZQG.zzV(zzzzg.zzZh());
        zz0Q zz0q = this.zzpa;
        zzZ zzz = zz0q != null ? new zzZ(zz0q, zzzzg.zzrs(), zzzzg.zzZz(), zzzzg.zzZh()) : null;
        float fIntBitsToFloat = 0.0f;
        float fZzZ = 0.0f;
        float fZzYC = 0.0f;
        for (Cluster cluster : zzzzg.zzZh()) {
            long jZzZ = zzZ(zzz, cluster, zzzzg.zzZr());
            fIntBitsToFloat += Float.intBitsToFloat((int) jZzZ);
            fZzYC += zzZPY.zzYC(jZzZ);
            fZzZ += zzZ(cluster, zzzzg.zzZr());
        }
        float f2 = fIntBitsToFloat - fZzZ;
        if (!zzAN.zzf(f2)) {
            Cluster cluster2 = (Cluster) C21505OooO0Oo.OooO00o(1, arrayListZzV);
            arrayListZzV.set(arrayListZzV.size() - 1, zzZZF.zzZ(zzzzg.zzZr(), cluster2, zzZ(cluster2, zzzzg.zzZr()) + f2));
        }
        zzZQG.zzZ(this.zzpe, new zz8K(zzzzg.zzZr(), (Cluster[]) arrayListZzV.toArray(new Cluster[0]), zzzzg.zzZz(), f));
        return fZzYC;
    }

    private long zzZ(zzZ zzz, Cluster cluster, zzPM zzpm) {
        if (zzz == null) {
            return zzZPY.zzG(zzZ(cluster, zzpm) + this.zzp9, 0.0f);
        }
        long jZzG = zzZPY.zzG(this.zzp9, 0.0f);
        for (int i = 0; i < cluster.getCodepoints().length; i++) {
            long jZzyr = zzz.zzyr();
            jZzG = C22243OooO0Oo.OooO00o(zzZPY.zzYC(jZzG), Float.intBitsToFloat((int) jZzyr) + Float.intBitsToFloat((int) jZzG), jZzyr);
        }
        return jZzG;
    }

    private static float zzZ(Cluster cluster, zzPM zzpm) {
        return cluster.getWidth(zzpm.zzPl().zzpO(), zzpm.zzPg());
    }

    private static long zzZ(long j, zzPM zzpm) {
        return zzZPW.zzG(Float.intBitsToFloat((int) j), zzpm.zzPf() + zzZPW.zzYz(j));
    }
}
