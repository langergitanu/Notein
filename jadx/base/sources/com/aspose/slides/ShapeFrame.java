package com.aspose.slides;

import android.graphics.RectF;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
public class ShapeFrame implements IShapeFrame {

    /* JADX INFO: renamed from: du */
    private float f3356du;

    /* JADX INFO: renamed from: h4 */
    private byte f3357h4;

    /* JADX INFO: renamed from: k4 */
    private float f3358k4;

    /* JADX INFO: renamed from: kk */
    private float f3359kk;

    /* JADX INFO: renamed from: m9 */
    private byte f3360m9;

    /* JADX INFO: renamed from: to */
    private float f3361to;

    /* JADX INFO: renamed from: x1 */
    private float f3362x1;

    public ShapeFrame() {
    }

    /* JADX INFO: renamed from: k4 */
    public static float m2658k4(double d) {
        if (d < 0.0d) {
            d += (C14116yg.m67490kk((-d) / 360.0d) * 360.0d) + 360.0d;
        }
        return (float) (d % 360.0d);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.aspose.slides.IGenericCloneable
    public final IShapeFrame cloneT() {
        return new ShapeFrame(this.f3358k4, this.f3362x1, this.f3359kk, this.f3361to, this.f3357h4, this.f3360m9, this.f3356du);
    }

    public final Object deepClone() {
        return cloneT();
    }

    public final boolean equals(ShapeFrame shapeFrame) {
        if (this.f3357h4 == shapeFrame.f3357h4 && this.f3360m9 == shapeFrame.f3360m9) {
            return ((double) (C14116yg.m67480k4(m2658k4((double) this.f3356du) - m2658k4((double) shapeFrame.f3356du)) + (C14116yg.m67480k4(this.f3361to - shapeFrame.f3361to) + (C14116yg.m67480k4(this.f3359kk - shapeFrame.f3359kk) + (C14116yg.m67480k4(this.f3362x1 - shapeFrame.f3362x1) + C14116yg.m67480k4(this.f3358k4 - shapeFrame.f3358k4)))))) < 0.001d;
        }
        return false;
    }

    @Override // com.aspose.slides.IShapeFrame
    public final float getCenterX() {
        return (this.f3359kk / 2.0f) + this.f3358k4;
    }

    @Override // com.aspose.slides.IShapeFrame
    public final float getCenterY() {
        return (this.f3361to / 2.0f) + this.f3362x1;
    }

    @Override // com.aspose.slides.IShapeFrame
    public final byte getFlipH() {
        return this.f3357h4;
    }

    @Override // com.aspose.slides.IShapeFrame
    public final byte getFlipV() {
        return this.f3360m9;
    }

    @Override // com.aspose.slides.IShapeFrame
    public final float getHeight() {
        return this.f3361to;
    }

    @Override // com.aspose.slides.IShapeFrame
    public final RectF getRectangle() {
        return (RectF) C12007ix.m56540h4(m2660k4());
    }

    @Override // com.aspose.slides.IShapeFrame
    public final float getRotation() {
        return this.f3356du;
    }

    @Override // com.aspose.slides.IShapeFrame
    public final float getWidth() {
        return this.f3359kk;
    }

    @Override // com.aspose.slides.IShapeFrame
    public final float getX() {
        return this.f3358k4;
    }

    @Override // com.aspose.slides.IShapeFrame
    public final float getY() {
        return this.f3362x1;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f3358k4), Float.valueOf(this.f3362x1), Float.valueOf(this.f3359kk), Float.valueOf(this.f3361to), Float.valueOf(this.f3356du), Byte.valueOf(this.f3357h4), Byte.valueOf(this.f3360m9));
    }

    public ShapeFrame(double d, double d2, double d3, double d4, byte b, byte b2, float f) {
        m2659k4((float) d, (float) d2, (float) d3, (float) d4, b, b2, f);
    }

    public boolean equals(Object obj) {
        ShapeFrame shapeFrame = (ShapeFrame) C7019kk.m27452k4(obj, ShapeFrame.class);
        if (shapeFrame != null) {
            return equals(shapeFrame);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public C12007ix m2660k4() {
        return new C12007ix(this.f3358k4, this.f3362x1, this.f3359kk, this.f3361to);
    }

    public ShapeFrame(float f, float f2, float f3, float f4, byte b, byte b2, float f5) {
        m2659k4(f, f2, f3, f4, b, b2, f5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m2659k4(float f, float f2, float f3, float f4, byte b, byte b2, float f5) {
        this.f3358k4 = f;
        this.f3362x1 = f2;
        this.f3359kk = f3;
        this.f3361to = f4;
        this.f3356du = f5;
        this.f3357h4 = b;
        this.f3360m9 = b2;
    }
}
