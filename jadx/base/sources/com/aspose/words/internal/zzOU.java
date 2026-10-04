package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOU implements Cloneable {
    private int zzGk;
    private zzPF zzGl;
    private int zzGm;
    private float zzGn;
    private int zzGo;
    private int zzGp;
    private float zzGq;
    private float[] zzGr;
    private float zzHi;
    private float[] zzMN;
    private int zzMO;
    private int zzMP;
    private int zzUG;
    private zzPY zzYr;
    private static float[] zzGw = {3.0f, 1.0f};
    private static float[] zzGv = {3.0f, 1.0f, 1.0f, 1.0f};
    private static float[] zzGu = {3.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
    private static float[] zzGt = {1.0f, 1.0f};
    private static float[] zzGs = new float[0];

    public zzOU() {
        float[] fArr = zzGs;
        this.zzGr = fArr;
        this.zzMO = 0;
        this.zzMN = fArr;
        this.zzMP = 0;
        this.zzGp = 0;
        this.zzGo = 0;
        this.zzGn = 10.0f;
        this.zzGm = 0;
        this.zzHi = 1.0f;
        this.zzGl = new zzPF();
        this.zzGk = 0;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean zzU(float[] fArr) {
        if (fArr == null || fArr.length <= 1) {
            return false;
        }
        for (float f : fArr) {
            if (f <= 0.0f) {
                return false;
            }
        }
        return true;
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    public final int getDashStyle() {
        return this.zzMP;
    }

    public final int getEndCap() {
        return this.zzGp;
    }

    public final float getWidth() {
        return this.zzHi;
    }

    public final void setAlignment(int i) {
        this.zzUG = i;
    }

    public final void setDashStyle(int i) {
        this.zzMP = i;
        if (i == 0) {
            this.zzMN = zzGs;
            return;
        }
        if (i == 1) {
            this.zzMN = zzGw;
            return;
        }
        if (i == 2) {
            this.zzMN = zzGt;
            return;
        }
        if (i == 3) {
            this.zzMN = zzGv;
        } else if (i == 4) {
            this.zzMN = zzGu;
        } else if (i != 5) {
            throw new IllegalArgumentException("Unknown dash style.");
        }
    }

    public final void setEndCap(int i) {
        this.zzGp = i;
    }

    public final void setWidth(float f) {
        this.zzHi = f;
    }

    public final void zzA(float f) {
        this.zzGn = f;
    }

    public final float[] zzNG() {
        return this.zzGr;
    }

    public final float[] zzNH() {
        return this.zzMN;
    }

    public final int zzNI() {
        return this.zzGk;
    }

    public final int zzNJ() {
        return this.zzMO;
    }

    public final float zzNK() {
        return this.zzGq;
    }

    public final float zzNL() {
        return this.zzGn;
    }

    public final int zzNM() {
        return this.zzGo;
    }

    public final int zzNN() {
        return this.zzGm;
    }

    public final zzPF zzNO() {
        return this.zzGl;
    }

    public final zzOU zzNP() {
        return (zzOU) memberwiseClone();
    }

    public final zzOU zzNQ() {
        zzOU zzou = (zzOU) memberwiseClone();
        zzPY zzpy = this.zzYr;
        if (zzpy != null) {
            zzou.zzYr = zzpy.zzPI();
        }
        return zzou;
    }

    public final void zzV(float[] fArr) {
        if (fArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzGr = fArr;
    }

    public final void zzW(float[] fArr) {
        if (fArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzMN = fArr;
        this.zzMP = 5;
    }

    public final void zzXU(int i) {
        this.zzGk = i;
    }

    public final void zzXV(int i) {
        this.zzMO = i;
    }

    public final void zzXW(int i) {
        this.zzGo = i;
    }

    public final void zzXX(int i) {
        this.zzGm = i;
    }

    public final void zzY(zzPY zzpy) {
        this.zzYr = zzpy;
    }

    public final zzPY zzZ1() {
        return this.zzYr;
    }

    public final void zzz(float f) {
        this.zzGq = f;
    }

    public zzOU(zzPV zzpv) {
        this(zzpv, 1.0f);
    }

    public zzOU(zzPV zzpv, float f) {
        this(new zzOI(zzpv), f);
    }

    public zzOU(zzPY zzpy) {
        this(zzpy, 1.0f);
    }

    public zzOU(zzPY zzpy, float f) {
        float[] fArr = zzGs;
        this.zzGr = fArr;
        this.zzMO = 0;
        this.zzMN = fArr;
        this.zzMP = 0;
        this.zzGp = 0;
        this.zzGo = 0;
        this.zzGn = 10.0f;
        this.zzGm = 0;
        this.zzHi = 1.0f;
        this.zzGl = new zzPF();
        this.zzGk = 0;
        if (zzpy != null) {
            this.zzYr = zzpy;
            this.zzHi = f;
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: brush");
    }
}
