package com.aspose.words.internal;

import com.aspose.words.Cluster;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz8M {
    private long zzCG;
    private int zzDh;
    private float zzDi;
    private float zzDj;
    private zzP8 zzZC;
    private boolean zzpb;
    private zz8N zzpc;
    private zzGC zzpd;

    public zz8M(zzGC zzgc, zz8N zz8n, long j, int i, float f, float f2, boolean z, zzP8 zzp8) {
        this.zzpd = zzgc;
        this.zzpc = zz8n;
        this.zzCG = j;
        this.zzDh = i;
        this.zzpb = z;
        this.zzZC = zzp8;
        this.zzDj = f;
        this.zzDi = f2;
        if (zzAN.zzf(f)) {
            this.zzDj = 1.0f;
        }
        if (zzAN.zzf(this.zzDi)) {
            this.zzDi = 1.0f;
        }
        this.zzpc = zzyy();
    }

    private static void zzY(zzGC zzgc, zzG zzg, long j) throws Exception {
        if (zzgc.zzOK().zzPD() == 0) {
            return;
        }
        zzZG zzzgZzZ = zzZ(zzgc, j);
        zzzgZzZ.zzY(new zzOI(zzgc.zzOK()));
        zzg.zzX(zzzgZzZ);
    }

    public static zz8M zzZ(zzG9 zzg9, zz8N zz8n, long j, boolean z, zzP8 zzp8) {
        float fZzOf = zzg9.zzMK().zzFt().zzMq().zzOf();
        float fZzOc = zzg9.zzMK().zzFt().zzMq().zzOc();
        if (!zzg9.zzKp().zzAg().zzyW() || zzg9.zzMK().zzFs().getWidth() != 0) {
            fZzOf = zzZKQ.zzZN(fZzOf);
            fZzOc = zzZKQ.zzZN(fZzOc);
        }
        return new zz8M(zzg9.zzMK(), zz8n, j, 1, fZzOf, fZzOc, z, zzp8);
    }

    private zzP9 zzyu() throws Exception {
        return this.zzpd.zzZ(this.zzCG, this.zzpc.getSize(), this.zzDh, this.zzDj, this.zzDi);
    }

    private ArrayList<zzZU> zzyw() {
        boolean z = (this.zzpc.zzyC() && this.zzpc.zzyB()) ? false : true;
        ArrayList<zzZU> arrayList = new ArrayList<>();
        long jZzG = 0;
        for (zz8K zz8k : this.zzpc.zzyD()) {
            long jZzG2 = zzZPY.zzG(Float.intBitsToFloat((int) jZzG), zzZPY.zzYC(jZzG) + zz8k.zzyq());
            float fZzyp = zz8k.zzyp();
            zzZQG.zzZ(arrayList, new zzZU(zz8k.zzZr(), this.zzpd.zzJb(), zzPV.zzHZ, jZzG2, Cluster.getString(zz8k.zzZh()), zzZPW.zzG(fZzyp, zz8k.zzZr().zzPf()), 0.0f, zz8k.zzZz(), z ? zz8k.zzZh() : null));
            jZzG = zzZPY.zzG(Float.intBitsToFloat((int) jZzG2) + fZzyp, zzZPY.zzYC(jZzG2));
        }
        return arrayList;
    }

    private Iterable<zzZU> zzyx() throws Exception {
        boolean z;
        Cluster[] clusterArr;
        if (!zzZYD.zzXk(zzZKN.zzTX(this.zzpc.zzyE()))) {
            return new ArrayList();
        }
        if (!this.zzpd.zzZ(this.zzDh, this.zzDj, this.zzDi)) {
            return zzyw();
        }
        boolean zZzyC = this.zzpc.zzyC();
        ArrayList arrayList = new ArrayList();
        long jZzG = 0;
        for (zz8K zz8k : this.zzpc.zzyD()) {
            jZzG = zzZPY.zzG(Float.intBitsToFloat((int) jZzG), zzZPY.zzYC(jZzG) + zz8k.zzyq());
            Cluster[] clusterArrZzZh = zz8k.zzZh();
            int length = clusterArrZzZh.length;
            int i = 0;
            while (i < length) {
                Cluster cluster = clusterArrZzZh[i];
                float width = cluster.getWidth(zz8k.zzZr().zzPl().zzpO(), zz8k.zzZr().zzPg());
                zzPM zzpmZzZr = zz8k.zzZr();
                zzPV zzpvZzJb = this.zzpd.zzJb();
                zzPV zzpv = zzPV.zzHZ;
                String string = Cluster.getString(new Cluster[]{cluster});
                long jZzG2 = zzZPW.zzG(width, zz8k.zzZr().zzPf());
                if (zZzyC) {
                    z = zZzyC;
                    clusterArr = null;
                } else {
                    z = zZzyC;
                    clusterArr = new Cluster[]{cluster};
                }
                zzZU zzzu = new zzZU(zzpmZzZr, zzpvZzJb, zzpv, 0L, string, jZzG2, 0.0f, false, clusterArr);
                zzzu.zzW(this.zzpd.zzZ(this.zzDh, this.zzDj, this.zzDi, zzUX.zzZb(cluster.getCodepoints()[0])));
                int i2 = (int) jZzG;
                zzzu.zzZO().zzY(Float.intBitsToFloat(i2), zzZPY.zzYC(jZzG), 1);
                zzZQG.zzZ((ArrayList<zzZU>) arrayList, zzzu);
                jZzG = zzZPY.zzG(Float.intBitsToFloat(i2) + width, zzZPY.zzYC(jZzG));
                i++;
                zZzyC = z;
            }
        }
        return arrayList;
    }

    private zz8N zzyy() {
        if (this.zzpb || !this.zzpd.zzFs().zzz9()) {
            return this.zzpc;
        }
        float fAbs = Math.abs(this.zzDi / this.zzDj);
        return zzAN.zzY(fAbs, 1.0f, 0.05f) ? this.zzpc : this.zzpc.zzc(fAbs);
    }

    public final long[] zzyA() throws Exception {
        long size = this.zzpc.getSize();
        zzP9 zzp9ZzZ = this.zzpd.zzZ(this.zzCG, this.zzpc.getSize(), this.zzDh, this.zzDj, this.zzDi);
        int i = (int) size;
        long[] jArr = {zzZPY.zzG(0.0f, 0.0f), zzZPY.zzG(Float.intBitsToFloat(i), 0.0f), zzZPY.zzG(0.0f, zzZPW.zzYz(size)), zzZPY.zzG(Float.intBitsToFloat(i), zzZPW.zzYz(size))};
        zzp9ZzZ.zzZ(jArr);
        return jArr;
    }

    public final zzG zzyv() throws Exception {
        zzP9 zzp9Zzyu = zzyu();
        zzP8 zzp8 = this.zzZC;
        if (zzp8 != null) {
            zzp8.zzY(this.zzpd.zzFt().zzMq());
        }
        zzG zzg = new zzG();
        zzg.zzZ(this.zzZC);
        zzG zzg2 = new zzG();
        zzg2.zzW(zzp9Zzyu);
        zzg.zzX((zzZL) zzg2);
        zzY(this.zzpd, zzg2, this.zzpc.getSize());
        zzg2.zzZ(zzyx());
        zzZ(this.zzpd, zzg2, this.zzpc.zzJC());
        return zzg;
    }

    public final Iterable<zzP8> zzyz() throws Exception {
        zzP9 zzp9ZzZ = this.zzpd.zzZ(this.zzCG, this.zzpc.getSize(), this.zzDh, this.zzDj, this.zzDi);
        ArrayList arrayList = new ArrayList();
        zzUW zzuw = new zzUW(this.zzpd.zzZr(), this.zzpc.zzyE(), false, false);
        for (zzZU zzzu : zzyx()) {
            zzP8 zzp8ZzZ9 = zzuw.zzZ9(zzZVS.zzA(zzzu.getText(), 0));
            if (zzp8ZzZ9 != null) {
                zzP9 zzp9ZzOh = zzp9ZzZ.zzOh();
                if (zzzu.zzZO() != null) {
                    zzp9ZzOh.zzZ(zzzu.zzZO(), 0);
                }
                zzp8ZzZ9.zzY(zzp9ZzOh);
                zzZQG.zzZ((ArrayList<zzP8>) arrayList, zzp8ZzZ9);
            }
        }
        return arrayList;
    }

    private static void zzZ(zzGC zzgc, zzG zzg, long j) throws Exception {
        float fZzPg = zzgc.zzZr().zzPg();
        if (zzgc.zzFs().getUnderline()) {
            zzZG zzzgZzZ = zzZG.zzZ(0L, zzZPY.zzG(Float.intBitsToFloat((int) j), 0.0f));
            zzzgZzZ.zzX(new zzOU(zzgc.zzJb(), fZzPg * 0.05f));
            zzg.zzX(zzzgZzZ);
        }
        if (zzgc.zzFs().zzz6()) {
            float f = (-0.28f) * fZzPg;
            zzZG zzzgZzZ2 = zzZG.zzZ(zzZPY.zzG(0.0f, f), zzZPY.zzG(Float.intBitsToFloat((int) j), f));
            zzzgZzZ2.zzX(new zzOU(zzgc.zzJb(), fZzPg * 0.05f));
            zzg.zzX(zzzgZzZ2);
        }
    }

    private static zzZG zzZ(zzGC zzgc, long j) throws Exception {
        return zzZG.zzW(new zzZQ4(zzZPY.zzG(Float.intBitsToFloat(0), zzZPY.zzYC(0L) - zzgc.zzZr().getAscentPoints()), j));
    }
}
