package com.aspose.words.internal;

import com.aspose.words.Cluster;
import com.aspose.words.Glyph;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz8N {
    private long zzDs;
    private boolean zzYS;
    private long zzYV;
    private ArrayList<zz8K> zzpe;
    private zzPM zzpf;
    private String zzpg;

    public zz8N(ArrayList<zz8K> arrayList, String str, zzPM zzpm, boolean z, long j, long j2) {
        this.zzpe = arrayList;
        this.zzpg = str;
        this.zzpf = zzpm;
        this.zzYS = z;
        this.zzDs = j;
        this.zzYV = j2;
    }

    public final long getSize() {
        return this.zzYV;
    }

    public final long zzJC() {
        return this.zzDs;
    }

    public final zz8N zzc(float f) {
        ArrayList arrayList = new ArrayList(this.zzpe.size());
        for (zz8K zz8k : this.zzpe) {
            Cluster[] clusterArr = new Cluster[zz8k.zzZh().length];
            for (int i = 0; i < zz8k.zzZh().length; i++) {
                Cluster cluster = zz8k.zzZh()[i];
                Glyph[] glyphArr = new Glyph[cluster.getGlyphs().length];
                for (int i2 = 0; i2 < cluster.getGlyphs().length; i2++) {
                    Glyph glyph = cluster.getGlyphs()[i2];
                    float width = glyph.getWidth(zz8k.zzZr().zzPl().zzpO(), zz8k.zzZr().zzPg()) * f;
                    glyphArr[i2] = zzZZF.zzZ(glyph.getGlyphIndex(), width, (short) zz8k.zzZr().zzQ(width));
                }
                clusterArr[i] = new Cluster(cluster.getCodepoints(), glyphArr);
            }
            zzZQG.zzZ((ArrayList<zz8K>) arrayList, new zz8K(zz8k.zzZr(), clusterArr, zz8k.zzZz(), zz8k.zzyq()));
        }
        return new zz8N(arrayList, this.zzpg, this.zzpf, this.zzYS, zzZPW.zzG(Float.intBitsToFloat((int) this.zzDs) * f, zzZPW.zzYz(this.zzDs)), zzZPW.zzG(Float.intBitsToFloat((int) this.zzYV) * f, zzZPW.zzYz(this.zzYV)));
    }

    public final boolean zzyB() {
        Iterator<zz8K> it = this.zzpe.iterator();
        while (it.hasNext()) {
            if (!it.next().zzyB()) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzyC() {
        Iterator<zz8K> it = this.zzpe.iterator();
        while (it.hasNext()) {
            if (!it.next().zzyC()) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList<zz8K> zzyD() {
        return this.zzpe;
    }

    public final String zzyE() {
        return this.zzpg;
    }
}
