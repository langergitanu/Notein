package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZXD implements zzH4 {
    private static zz7E<String> zz9N;
    private zzZYE zz4 = new zzZYE("");
    private float zz9O;
    private float zz9P;
    private float zz9Q;
    private float zz9R;
    private float zz9S;
    private float zz9T;
    private zzZXH zzA4;
    private boolean zzHI;

    static {
        zz7E<String> zz7e = new zz7E<>();
        zz9N = zz7e;
        zz7e.zzY("FangSong", 0.004d);
        zz9N.zzY("KaiTi", 0.004d);
        zz9N.zzY("MS Gothic", 0.004d);
        zz9N.zzY("MS Mincho", 0.004d);
        zz9N.zzY("MS PGothic", 0.004d);
        zz9N.zzY("MS PMincho", 0.004d);
        zz9N.zzY("MS UI Gothic", 0.004d);
        zz9N.zzY("NSimSun", 0.004d);
        zz9N.zzY("SimHei", 0.004d);
        zz9N.zzY("SimSun", 0.004d);
        zz9N.zzY("SimSun-ExtB", 0.004d);
        zz9N.zzY("Lucida Console", 8.0E-4d);
    }

    public zzZXD(zzZXH zzzxh, float f, boolean z, boolean z2, boolean z3) {
        this.zzA4 = zzzxh;
        this.zz9O = z ? zzWP(zzzxh.zzPh()) : 0.0f;
        float fZzHV = zzzxh.zzHV();
        float fZzHU = zzzxh.zzHU();
        float fZzHT = zzzxh.zzHT();
        this.zzHI = z3;
        if (z3) {
            float fZzS = zzS(fZzHT - (fZzHV + fZzHU), this.zzA4.zzpO());
            fZzHV = zzS(fZzHV, this.zzA4.zzpO());
            fZzHU = zzS(fZzHU, this.zzA4.zzpO());
            fZzHT = fZzHV + fZzHU + fZzS;
        }
        zzU(fZzHV, fZzHU, f);
        if (z2 && zzzxh.zzI7()) {
            zzV(fZzHV, fZzHU, f);
        } else {
            zzY(fZzHV, fZzHU, fZzHT, f);
        }
    }

    private static float zzS(float f, int i) {
        return (((float) zzZKQ.zzR((f * 1000.0f) / r4, 0)) * i) / 1000.0f;
    }

    private void zzU(float f, float f2, float f3) {
        setAscentRawPoints(this.zzA4.zzJ(f, f3));
        setDescentRawPoints(this.zzA4.zzJ(f2, f3));
    }

    private void zzV(float f, float f2, float f3) {
        float fZzpO = f + (((int) ((f + f2) - this.zzA4.zzpO())) / 2);
        float f4 = f2 + (r1 - r2);
        float fMax = fZzpO + f4 + Math.max(((int) (((double) r0) * 0.3d)) - r1, 0);
        float f5 = (int) (2.0f * f4);
        if (f5 + fZzpO <= fMax) {
            f4 = f5;
        }
        zzY(fZzpO, f4, fMax, f3);
    }

    public static float zzWP(String str) {
        if (zz9N.containsKey(str)) {
            return (float) zz9N.zzm(str);
        }
        return 0.0f;
    }

    private void zzY(float f, float f2, float f3, float f4) {
        setAscentPoints(this.zzA4.zzJ(f, f4));
        setDescentPoints(this.zzA4.zzJ(f2, f4));
        setLineSpacingPoints(this.zzA4.zzJ(f3, f4));
    }

    public static float zzZ(float f, int i, float f2) {
        return ((int) (((((float) zzZKQ.zzR((f * 1000.0f) / i, 0)) * f2) / 1000.0f) * 4096.0f)) / 4096.0f;
    }

    @Override // com.aspose.words.internal.zzH4
    public float getAscentPoints() {
        return this.zz9T;
    }

    @Override // com.aspose.words.internal.zzH4
    public float getAscentRawPoints() {
        return this.zz9Q;
    }

    @Override // com.aspose.words.internal.zzH4
    public float getCharWidthPoints(int i, float f) {
        return (f * this.zz9O) + zzV(i, f);
    }

    @Override // com.aspose.words.internal.zzH4
    public float getDescentPoints() {
        return this.zz9S;
    }

    @Override // com.aspose.words.internal.zzH4
    public float getDescentRawPoints() {
        return this.zz9P;
    }

    @Override // com.aspose.words.internal.zzH4
    public float getLineSpacingPoints() {
        return this.zz9R;
    }

    @Override // com.aspose.words.internal.zzH4
    public float getRawCharWidthPoints(int i, float f) {
        return zzV(i, f);
    }

    @Override // com.aspose.words.internal.zzH4
    public float getTextWidthPoints(String str, float f) {
        this.zz4.setText(str);
        Iterator<Integer> it = this.zz4.iterator();
        float charWidthPoints = 0.0f;
        while (it.hasNext()) {
            charWidthPoints += getCharWidthPoints(it.next().intValue(), f);
        }
        return charWidthPoints;
    }

    @Override // com.aspose.words.internal.zzH4
    public void setAscentPoints(float f) {
        this.zz9T = f;
    }

    @Override // com.aspose.words.internal.zzH4
    public void setAscentRawPoints(float f) {
        this.zz9Q = f;
    }

    @Override // com.aspose.words.internal.zzH4
    public void setDescentPoints(float f) {
        this.zz9S = f;
    }

    @Override // com.aspose.words.internal.zzH4
    public void setDescentRawPoints(float f) {
        this.zz9P = f;
    }

    @Override // com.aspose.words.internal.zzH4
    public void setLineSpacingPoints(float f) {
        this.zz9R = f;
    }

    public abstract float zzV(int i, float f);

    public final boolean zzp7() {
        return this.zzHI;
    }

    public final zzZXH zzp8() {
        return this.zzA4;
    }
}
