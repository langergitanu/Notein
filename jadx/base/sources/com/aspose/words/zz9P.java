package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz9P {
    private zz8Z zzZ7J;

    public zz9P(zz8Z zz8z) {
        this.zzZ7J = zz8z;
    }

    public static int zzPJ(String str) {
        if (com.aspose.words.internal.zzJB.zzZ7(str)) {
            return com.aspose.words.internal.zzJB.parseInt(str);
        }
        if (com.aspose.words.internal.zzJB.zzZa(str)) {
            return com.aspose.words.internal.zzJB.zzZb(str) ? 1 : 0;
        }
        if (zz9Z.zzQf(str)) {
            return zz9Z.zzQg(str);
        }
        if (zz9Z.zzQd(str)) {
            return zz9Z.zzQe(str);
        }
        if (zz9Z.zzQb(str)) {
            return zz9Z.zzQc(str);
        }
        if (zz9Z.zzQ9(str)) {
            return zz9Z.zzQa(str);
        }
        if (zz9Z.zzQ7(str)) {
            return zz9Z.zzQ8(str);
        }
        throw new IllegalStateException("Unexpected function value.");
    }

    private zz9Y zzY(int i, int i2, zz6C zz6c, zz93 zz93Var, zz60 zz60Var) {
        switch (i) {
            case 0:
                return new zz9X(this.zzZ7J.zzZEk(), zz93Var, zz6c);
            case 1:
                return new zz9V(this.zzZ7J.zzZEk(), zz93Var, zz6c);
            case 2:
                return new zz9U(this.zzZ7J.zzZEk(), zz93Var, zz6c);
            case 3:
                return new zz9T(this.zzZ7J.zzZEk(), zz93Var, zz6c);
            case 4:
                return new zz9R(this.zzZ7J.zzZEk(), zz93Var, zz6c);
            case 5:
                return new zz9Q(this.zzZ7J.zzZEk(), zz93Var, zz6c);
            case 6:
                return new zz9O(this.zzZ7J.zzZEk(), zz93Var, zz6c);
            case 7:
                return new zz9N(i2, zz60Var);
            default:
                throw new IllegalStateException("Unexpected function type.");
        }
    }

    public static boolean zzk(int i, int i2, int i3) {
        if (i == 0) {
            return i2 == i3;
        }
        if (i == 1) {
            return i2 > i3;
        }
        if (i == 2) {
            return i2 >= i3;
        }
        if (i == 3) {
            return i2 < i3;
        }
        if (i == 4) {
            return i2 <= i3;
        }
        if (i == 5) {
            return i2 != i3;
        }
        throw new IllegalStateException("Unexpected function operator.");
    }

    public final int zzZ(int i, int i2, zz6C zz6c, zz93 zz93Var, zz60 zz60Var) {
        return zzY(i, i2, zz6c, zz93Var, zz60Var).zzZEb();
    }
}
