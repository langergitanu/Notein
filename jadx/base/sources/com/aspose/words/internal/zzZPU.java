package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZPU implements Cloneable {
    int zz2n = -1;
    private boolean zz2m = false;
    int zz2l = -1;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static long zzS(int i, int i2, int i3, int i4) {
        if (i < 0 || i >= 24 || i2 < 0 || i2 >= 60 || i3 < 0 || i3 >= 60) {
            throw new IllegalArgumentException("ArgumentOutOfRange_BadHourMinuteSecond");
        }
        if (i4 < 0 || i4 >= 1000) {
            throw new IllegalArgumentException("ArgumentOutOfRange_Range");
        }
        return (((long) i4) * 10000) + zzZNF.zzE(i, i2, i3);
    }

    public int getID() {
        return -1;
    }

    public abstract int zzE(zzZQ9 zzzq9);

    public abstract int zzF(zzZQ9 zzzq9);

    public abstract int zzG(zzZQ9 zzzq9);

    public abstract int zzH(zzZQ9 zzzq9);

    public abstract int zzI(zzZQ9 zzzq9);

    public final zzZQ9 zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        try {
            return zzZ(i, i2, i3, i4, i5, i6, 0, i7);
        } catch (Exception unused) {
            return zzZQ9.zz35;
        }
    }

    public abstract zzZQ9 zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public abstract boolean zzZl(int i, int i2);

    public void zzki() {
        zzkl();
        this.zz2l = 2029;
    }

    public abstract int[] zzkj();

    public final int zzkk() {
        if (this.zz2n == -1) {
            switch (zzkn()) {
                case 0:
                    this.zz2n = 0;
                    break;
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    this.zz2n = 1;
                    break;
                case 3:
                    this.zz2n = 4;
                    break;
                default:
                    throw new IllegalArgumentException("BaseCalendarID");
            }
        }
        return this.zz2n;
    }

    public final void zzkl() {
        if (this.zz2m) {
            throw new IllegalStateException("InvalidOperation_ReadOnly");
        }
    }

    public final Object zzkm() {
        Object objMemberwiseClone = memberwiseClone();
        ((zzZPU) objMemberwiseClone).zz2m = false;
        return objMemberwiseClone;
    }

    public int zzkn() {
        return getID();
    }

    public zzZQ9 zzko() {
        return zzZQ9.zz34;
    }

    public zzZQ9 zzkp() {
        return zzZQ9.zz35;
    }
}
