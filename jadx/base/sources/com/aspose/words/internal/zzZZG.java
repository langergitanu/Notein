package com.aspose.words.internal;

import com.aspose.words.Cluster;
import com.aspose.words.Glyph;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZG {
    private Cluster[] zzYR;
    private boolean zzYS;
    private zzPM zzYX;
    private String zzZi;
    private int zzcO;
    private boolean zzcU;

    public zzZZG(String str, boolean z, zzPM zzpm, Cluster[] clusterArr, int i) {
        this.zzZi = str;
        this.zzYS = z;
        this.zzYX = zzpm;
        this.zzYR = clusterArr;
        this.zzcO = i;
        this.zzcU = zzZ(zzpm, clusterArr);
    }

    private static boolean zzZ(zzPM zzpm, Cluster[] clusterArr) {
        zzZX9 zzzx9ZzSu;
        for (Cluster cluster : clusterArr) {
            if (cluster.getCodepoints().length != 1 || cluster.getGlyphs().length != 1) {
                return false;
            }
            for (Glyph glyph : cluster.getGlyphs()) {
                if (glyph.getAdvanceOffset() != 0 || glyph.getAscenderOffset() != 0 || (zzzx9ZzSu = zzpm.zzPl().zzpP().zzSu(glyph.getGlyphIndex())) == null || zzzx9ZzSu.zzoZ() != glyph.getAdvance()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String getText() {
        return this.zzZi;
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

    public final int zzrs() {
        return this.zzcO;
    }

    public final boolean zzru() {
        return this.zzcU;
    }

    public final float zzyp() {
        float width = 0.0f;
        for (Cluster cluster : this.zzYR) {
            width += cluster.getWidth(this.zzYX.zzPl().zzpO(), this.zzYX.zzPg());
        }
        return width;
    }
}
