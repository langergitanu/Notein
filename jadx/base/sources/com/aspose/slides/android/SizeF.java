package com.aspose.slides.android;

/* JADX INFO: loaded from: classes3.dex */
public class SizeF {

    /* JADX INFO: renamed from: k4 */
    private final float f3930k4;

    /* JADX INFO: renamed from: x1 */
    private final float f3931x1;

    public SizeF(float f, float f2) {
        this.f3930k4 = f;
        this.f3931x1 = f2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SizeF) {
            SizeF sizeF = (SizeF) obj;
            if (this.f3930k4 == sizeF.f3930k4 && this.f3931x1 == sizeF.f3931x1) {
                return true;
            }
        }
        return false;
    }

    public float getHeight() {
        return this.f3931x1;
    }

    public float getWidth() {
        return this.f3930k4;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f3930k4) ^ Float.floatToIntBits(this.f3931x1);
    }

    public String toString() {
        return this.f3930k4 + "x" + this.f3931x1;
    }
}
