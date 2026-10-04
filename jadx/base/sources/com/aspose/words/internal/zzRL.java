package com.aspose.words.internal;

import com.aspose.words.Glyph;

/* JADX INFO: loaded from: classes5.dex */
class zzRL extends Glyph {
    private float zzN6;

    public zzRL(int i, float f, short s) {
        this(i, f, s, (short) 0, (short) 0);
    }

    @Override // com.aspose.words.Glyph
    public Glyph deepClone() {
        return new zzRL(getGlyphIndex(), this.zzN6, getAdvance(), getAdvanceOffset(), getAscenderOffset());
    }

    @Override // com.aspose.words.Glyph
    public float getWidth(int i, float f) {
        return this.zzN6;
    }

    public final float zzRa() {
        return this.zzN6;
    }

    public zzRL(int i, float f, short s, short s2, short s3) {
        super(i, s, s2, s3);
        this.zzN6 = f;
    }
}
