package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Glyph {
    private int zz9F;
    private short zzYuA;
    private short zzYuB;
    private short zzYuz;

    public Glyph(int i, short s, short s2, short s3) {
        this.zz9F = i;
        setAdvance(s);
        this.zzYuA = s2;
        this.zzYuz = s3;
    }

    public Glyph deepClone() {
        return new Glyph(getGlyphIndex(), getAdvance(), getAdvanceOffset(), getAscenderOffset());
    }

    public short getAdvance() {
        return this.zzYuB;
    }

    public short getAdvanceOffset() {
        return this.zzYuA;
    }

    public short getAscenderOffset() {
        return this.zzYuz;
    }

    public int getGlyphIndex() {
        return this.zz9F;
    }

    public float getWidth(int i, float f) {
        return (getAdvance() * f) / i;
    }

    public void setAdvance(short s) {
        this.zzYuB = s;
    }
}
