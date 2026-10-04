package com.aspose.slides.android;

/* JADX INFO: loaded from: classes3.dex */
public class Size {

    /* JADX INFO: renamed from: k4 */
    private final int f3928k4;

    /* JADX INFO: renamed from: x1 */
    private final int f3929x1;

    public Size(int i, int i2) {
        this.f3928k4 = i;
        this.f3929x1 = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f3928k4 == size.f3928k4 && this.f3929x1 == size.f3929x1) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f3929x1;
    }

    public int getWidth() {
        return this.f3928k4;
    }

    public int hashCode() {
        int i = this.f3929x1;
        int i2 = this.f3928k4;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f3928k4 + "x" + this.f3929x1;
    }
}
