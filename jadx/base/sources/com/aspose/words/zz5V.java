package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz5V {
    private int mLength = 1;
    private int zzL4 = 0;
    private int zzVL = 1;

    private static int zzHO(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: size");
    }

    private static int zzHP(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: size");
    }

    private static int zzHQ(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: type");
                    }
                }
            }
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zz5V zz5v = (zz5V) obj;
        return zz5v.zzL4 == this.zzL4 && zz5v.mLength == this.mLength && zz5v.zzVL == this.zzVL;
    }

    public final int getLength() {
        return this.mLength;
    }

    public final int getType() {
        return this.zzL4;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public int hashCode() {
        return (this.zzL4 ^ this.mLength) ^ this.zzVL;
    }

    public final void setLength(int i) {
        this.mLength = i;
    }

    public final void setType(int i) {
        this.zzL4 = i;
    }

    public final void setWidth(int i) {
        this.zzVL = i;
    }

    public final void zzZ(zz5V zz5v) {
        zz5v.mLength = this.mLength;
        zz5v.zzVL = this.zzVL;
        zz5v.zzL4 = this.zzL4;
    }

    public final com.aspose.words.internal.zzPD zzZyJ() {
        com.aspose.words.internal.zzPD zzpd = new com.aspose.words.internal.zzPD();
        zzpd.setType(zzHQ(this.zzL4));
        zzpd.setLength(zzHP(this.mLength));
        zzpd.setWidth(zzHO(this.zzVL));
        return zzpd;
    }
}
