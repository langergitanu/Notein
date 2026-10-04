package com.aspose.words.internal;

import com.aspose.words.Cluster;
import com.aspose.words.Glyph;

/* JADX INFO: loaded from: classes5.dex */
final class zz8K {
    private Cluster[] zzYR;
    private boolean zzYS;
    private zzPM zzYX;
    private float zzp6;

    public zz8K(zzPM zzpm, Cluster[] clusterArr, boolean z, float f) {
        this.zzYX = zzpm;
        this.zzYR = clusterArr;
        this.zzYS = z;
        this.zzp6 = f;
    }

    public final Cluster[] zzZh() {
        return this.zzYR;
    }

    public final zzPM zzZr() {
        return this.zzYX;
    }

    public final boolean zzZz() {
        return this.zzYS;
    }

    public final boolean zzyB() {
        for (Cluster cluster : this.zzYR) {
            for (Glyph glyph : cluster.getGlyphs()) {
                if (this.zzYX.zzPl().zzpP().zzSt(glyph.getGlyphIndex()).zzoZ() != glyph.getAdvance()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean zzyC() {
        for (Cluster cluster : this.zzYR) {
            if (cluster.getCodepoints().length != 1 || cluster.getGlyphs().length != 1) {
                return false;
            }
            if (this.zzYX.zzPl().zzpP().zzSx(cluster.getCodepoints()[0]).getGlyphIndex() != cluster.getGlyphs()[0].getGlyphIndex()) {
                return false;
            }
        }
        return true;
    }

    public final float zzyp() {
        float width = 0.0f;
        for (Cluster cluster : this.zzYR) {
            width += cluster.getWidth(this.zzYX.zzPl().zzpO(), this.zzYX.zzPg());
        }
        return width;
    }

    public final float zzyq() {
        return this.zzp6;
    }

    public zz8K(zzZZG zzzzg) {
        this(zzzzg.zzZr(), zzzzg.zzZh(), zzzzg.zzZz(), 0.0f);
    }
}
