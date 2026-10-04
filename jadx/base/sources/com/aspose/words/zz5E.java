package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz5E extends zz8E {
    private double zzZ1g;
    private double zzZ1h;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz5E zz5e = (zz5E) obj;
        return com.aspose.words.internal.zzAN.zzL(zz5e.zzZ1h, this.zzZ1h) && com.aspose.words.internal.zzAN.zzL(zz5e.zzZ1g, this.zzZ1g);
    }

    public final double getBrightness() {
        return this.zzZ1h;
    }

    public final double getContrast() {
        return this.zzZ1g;
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 15;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        return (super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ1h)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZ1g);
    }

    public final void setBrightness(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzZ1h = d;
    }

    public final void setContrast(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzZ1g = d;
    }
}
