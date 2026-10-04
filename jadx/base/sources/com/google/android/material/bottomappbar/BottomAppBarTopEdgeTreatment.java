package com.google.android.material.bottomappbar;

import Oooo0o0.C21009OooOooO;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* JADX INFO: loaded from: classes7.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f, float f2, float f3) {
        this.fabMargin = f;
        this.roundedCornerRadius = f2;
        setCradleVerticalOffset(f3);
        this.horizontalOffset = 0.0f;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, ShapePath shapePath) {
        float f4;
        float f5;
        float f6 = this.fabDiameter;
        if (f6 == 0.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float fOooO00o = C21009OooOooO.OooO00o(this.fabMargin, 2.0f, f6, 2.0f);
        float f7 = f3 * this.roundedCornerRadius;
        float f8 = f2 + this.horizontalOffset;
        float fOooO0O0 = OooOO0.OooO0OO.OooO0O0(1.0f, f3, fOooO00o, this.cradleVerticalOffset * f3);
        if (fOooO0O0 / fOooO00o >= 1.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f9 = this.fabCornerSize;
        float f10 = f9 * f3;
        boolean z = f9 == -1.0f || Math.abs((f9 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = fOooO0O0;
            f5 = 0.0f;
        } else {
            f5 = ROUNDED_CORNER_FAB_OFFSET;
            f4 = 0.0f;
        }
        float f11 = fOooO00o + f7;
        float f12 = f4 + f7;
        float fSqrt = (float) Math.sqrt((f11 * f11) - (f12 * f12));
        float f13 = f8 - fSqrt;
        float f14 = f8 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f12));
        float f15 = (90.0f - degrees) + f5;
        shapePath.lineTo(f13, 0.0f);
        float f16 = f13 - f7;
        float f17 = f13 + f7;
        float f18 = f7 * 2.0f;
        shapePath.addArc(f16, 0.0f, f17, f18, 270.0f, degrees);
        if (z) {
            shapePath.addArc(f8 - fOooO00o, (-fOooO00o) - f4, f8 + fOooO00o, fOooO00o - f4, 180.0f - f15, (f15 * 2.0f) - 180.0f);
        } else {
            float f19 = this.fabMargin;
            float f20 = f10 * 2.0f;
            float f21 = f19 + f20;
            float f22 = f8 - fOooO00o;
            shapePath.addArc(f22, -(f10 + f19), f21 + f22, f19 + f10, 180.0f - f15, ((f15 * 2.0f) - 180.0f) / 2.0f);
            float f23 = f8 + fOooO00o;
            float f24 = this.fabMargin;
            shapePath.lineTo(f23 - ((f24 / 2.0f) + f10), f24 + f10);
            float f25 = this.fabMargin;
            shapePath.addArc(f23 - (f20 + f25), -(f10 + f25), f23, f25 + f10, 90.0f, f15 - 90.0f);
        }
        shapePath.addArc(f14 - f7, 0.0f, f14 + f7, f18, 270.0f - degrees, degrees);
        shapePath.lineTo(f, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setCradleVerticalOffset(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f;
    }

    public void setFabCornerSize(float f) {
        this.fabCornerSize = f;
    }

    public void setFabCradleMargin(float f) {
        this.fabMargin = f;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        this.roundedCornerRadius = f;
    }

    public void setFabDiameter(float f) {
        this.fabDiameter = f;
    }

    public void setHorizontalOffset(float f) {
        this.horizontalOffset = f;
    }
}
