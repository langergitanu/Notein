package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Cluster {
    private Glyph[] zzZvR;
    private int[] zzZvS;

    public Cluster(int[] iArr, Glyph[] glyphArr) {
        this.zzZvS = iArr;
        this.zzZvR = glyphArr;
    }

    public static String getString(Cluster[] clusterArr) {
        StringBuilder sb = new StringBuilder(clusterArr.length);
        for (Cluster cluster : clusterArr) {
            for (int i : cluster.getCodepoints()) {
                com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKU.zzS7(i));
            }
        }
        return sb.toString();
    }

    public Cluster deepClone() {
        int[] iArr = new int[getCodepoints().length];
        Glyph[] glyphArr = new Glyph[getGlyphs().length];
        System.arraycopy(getCodepoints(), 0, iArr, 0, getCodepoints().length);
        for (int i = 0; i < getGlyphs().length; i++) {
            glyphArr[i] = getGlyphs()[i].deepClone();
        }
        return new Cluster(iArr, glyphArr);
    }

    public int[] getCodepoints() {
        return this.zzZvS;
    }

    public int getCodepointsLength() {
        return getCodepoints().length;
    }

    public Glyph[] getGlyphs() {
        return this.zzZvR;
    }

    public float getWidth(int i, float f) {
        float width = 0.0f;
        for (Glyph glyph : getGlyphs()) {
            width += glyph.getWidth(i, f);
        }
        return width;
    }

    public String getString() {
        return getString(new Cluster[]{this});
    }
}
