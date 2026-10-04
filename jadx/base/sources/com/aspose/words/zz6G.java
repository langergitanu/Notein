package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6G {
    private double zzXA;
    private double zzXy;
    private int zzZ2J;
    private boolean zzZ2K;
    private boolean zzZ2L;
    private float zzZ2M;
    private int zzZ2N;
    private float zzZ2O;
    private boolean zzZ2P;
    private boolean zzZ2Q;
    private Shape zzZ2R;

    private static boolean zzI3(int i) {
        if (i == 19 || i == 185 || i == 186) {
            return true;
        }
        switch (i) {
            case 85:
            case 86:
            case 87:
            case 88:
                return true;
            default:
                return false;
        }
    }

    public static boolean zzI4(int i) {
        return i == 20 || i == 32 || i == 222;
    }

    public static boolean zzI5(int i) {
        return i == 3 || i == 23 || i == 57 || i == 63 || i == 96 || i == 120 || i == 123 || i == 124;
    }

    public static boolean zzI6(int i) {
        if (i == 87 || i == 88 || i == 110 || i == 111 || i == 121 || i == 122 || i == 127 || i == 128) {
            return true;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                switch (i) {
                    case 12:
                    case 18:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 56:
                    case 92:
                    case 114:
                    case 130:
                    case 134:
                    case 187:
                        return true;
                    default:
                        switch (i) {
                            case 58:
                            case 59:
                            case 60:
                                return true;
                            default:
                                switch (i) {
                                    case 71:
                                    case 72:
                                    case 73:
                                        return true;
                                    default:
                                        switch (i) {
                                            case 117:
                                            case 118:
                                            case 119:
                                                return true;
                                            default:
                                                switch (i) {
                                                    case 177:
                                                    case 178:
                                                    case 179:
                                                    case 180:
                                                    case 181:
                                                        return true;
                                                    default:
                                                        return false;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public final double getHeight() {
        return this.zzXA;
    }

    public final Shape getShape() {
        return this.zzZ2R;
    }

    public final double getWidth() {
        return this.zzXy;
    }

    public final int getWrapType() {
        return this.zzZ2N;
    }

    public final void setHeight(double d) {
        this.zzXA = d;
    }

    public final void setShape(Shape shape) {
        this.zzZ2R = shape;
    }

    public final void setWidth(double d) {
        this.zzXy = d;
    }

    public final void setWrapType(int i) {
        this.zzZ2N = i;
    }

    public final void zzI2(int i) {
        this.zzZ2J = i;
    }

    public final boolean zzSq() {
        return this.zzZ2P;
    }

    public final void zzXd(boolean z) {
        this.zzZ2K = z;
    }

    public final void zzXe(boolean z) {
        this.zzZ2L = z;
    }

    public final void zzXf(boolean z) {
        this.zzZ2P = z;
    }

    public final void zzXg(boolean z) {
        this.zzZ2Q = z;
    }

    public final void zzYU(float f) {
        this.zzZ2M = f;
    }

    public final void zzYV(float f) {
        this.zzZ2O = f;
    }

    public final boolean zzZzJ() {
        return zzI3(this.zzZ2J);
    }

    public final boolean zzZzK() {
        return this.zzZ2K;
    }

    public final int zzZzL() {
        return this.zzZ2J;
    }

    public final boolean zzZzM() {
        return this.zzZ2L;
    }

    public final float zzZzN() {
        return this.zzZ2M;
    }

    public final float zzZzO() {
        return this.zzZ2O;
    }

    public final boolean zzZzP() {
        return this.zzZ2Q;
    }
}
