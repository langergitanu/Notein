package com.aspose.words.internal;

import com.aspose.words.Cluster;
import com.aspose.words.Glyph;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZF {
    public static Cluster zzZ(zzPM zzpm, Cluster cluster, float f) {
        float width = cluster.getWidth(zzpm.zzPl().zzpO(), zzpm.zzPg());
        int length = cluster.getGlyphs().length;
        Glyph[] glyphArr = new Glyph[length];
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (i >= i2) {
                Glyph glyph = cluster.getGlyphs()[i2];
                float width2 = glyph.getWidth(zzpm.zzPl().zzpO(), zzpm.zzPg()) + (f - width);
                glyphArr[i2] = zzZ(glyph.getGlyphIndex(), width2, (short) zzpm.zzQ(width2), glyph.getAdvanceOffset(), glyph.getAscenderOffset());
                return new Cluster(cluster.getCodepoints(), glyphArr);
            }
            glyphArr[i] = cluster.getGlyphs()[i];
            i++;
        }
    }

    public static Glyph zzZ(int i, float f, short s) {
        return new zzRL(i, f, s);
    }

    private static Glyph zzZ(int i, float f, short s, short s2, short s3) {
        return new zzRL(i, f, s, s2, s3);
    }
}
