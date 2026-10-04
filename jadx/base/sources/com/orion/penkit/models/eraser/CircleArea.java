package com.orion.penkit.models.eraser;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.facebook.common.callercontext.ContextChain;
import com.orion.penkit.models.PressurePointKt;
import com.orion.penkit.models.Segment;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0O00oo.OooOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0000H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0003H\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J$\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/penkit/models/eraser/CircleArea;", "Lcom/orion/penkit/models/eraser/ErasedArea;", "c", "Landroid/graphics/PointF;", "r", "", "<init>", "(Landroid/graphics/PointF;F)V", "getC", "()Landroid/graphics/PointF;", "getR", "()F", "intersects", "", "segment", "Lcom/orion/penkit/models/Segment;", DrawToolFactory.LASSO_TYPE_RECT, "", "circleArea", "isPointInsideArea", ContextChain.TAG_PRODUCT, "calculateAreaSegmentIntersections", "quickReject", "circleIntersectsRotatedRectangleAndroidMatrix", "circleCenter", "circleRadius", "rectPoints", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CircleArea extends ErasedArea {
    private final PointF c;
    private final float r;

    public CircleArea(PointF c, float f) {
        OooOOO0.OooO0oO(c, "c");
        this.c = c;
        this.r = f;
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public List<PointF> calculateAreaSegmentIntersections(Segment segment) {
        OooOOO0.OooO0oO(segment, "segment");
        return Segment.calculateIntersection$default(segment, this.c, this.r, null, null, 12, null);
    }

    public final boolean circleIntersectsRotatedRectangleAndroidMatrix(PointF circleCenter, float circleRadius, List<? extends PointF> rectPoints) {
        OooOOO0.OooO0oO(circleCenter, "circleCenter");
        OooOOO0.OooO0oO(rectPoints, "rectPoints");
        if (rectPoints.size() != 4) {
            return false;
        }
        float f = 2;
        PointF pointF = new PointF((rectPoints.get(0).x + rectPoints.get(2).x) / f, (rectPoints.get(0).y + rectPoints.get(2).y) / f);
        float f2 = -((float) Math.atan2(rectPoints.get(1).y - rectPoints.get(0).y, rectPoints.get(1).x - rectPoints.get(0).x));
        Matrix matrix = new Matrix();
        matrix.postTranslate(-pointF.x, -pointF.y);
        matrix.postRotate((float) Math.toDegrees(f2));
        float[] fArr = {circleCenter.x, circleCenter.y};
        matrix.mapPoints(fArr);
        PointF pointF2 = new PointF(fArr[0], fArr[1]);
        float fSqrt = ((float) Math.sqrt(Math.pow(rectPoints.get(1).y - rectPoints.get(0).y, 2.0d) + Math.pow(rectPoints.get(1).x - rectPoints.get(0).x, 2.0d))) / f;
        float fSqrt2 = ((float) Math.sqrt(Math.pow(rectPoints.get(3).y - rectPoints.get(0).y, 2.0d) + Math.pow(rectPoints.get(3).x - rectPoints.get(0).x, 2.0d))) / f;
        float fOooO0o0 = OooOO0.OooO0o0(pointF2.x, -fSqrt, fSqrt);
        float fOooO0o02 = OooOO0.OooO0o0(pointF2.y, -fSqrt2, fSqrt2);
        float f3 = pointF2.x - fOooO0o0;
        float f4 = pointF2.y - fOooO0o02;
        return (f4 * f4) + (f3 * f3) <= circleRadius * circleRadius;
    }

    public final PointF getC() {
        return this.c;
    }

    public final float getR() {
        return this.r;
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean intersects(Segment segment) {
        OooOOO0.OooO0oO(segment, "segment");
        return segment.intersects(this.c, this.r);
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean isPointInsideArea(PointF p) {
        OooOOO0.OooO0oO(p, "p");
        return PressurePointKt.isInsideCircle(p, this.c, this.r);
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean quickReject(Segment segment) {
        OooOOO0.OooO0oO(segment, "segment");
        return segment.isDistanceGreaterThan(this.c, this.r);
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean intersects(List<? extends PointF> rect) {
        OooOOO0.OooO0oO(rect, "rect");
        return circleIntersectsRotatedRectangleAndroidMatrix(this.c, this.r, rect);
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean intersects(CircleArea circleArea) {
        OooOOO0.OooO0oO(circleArea, "circleArea");
        return ((float) Math.sqrt(Math.pow((double) (this.c.y - circleArea.c.y), 2.0d) + Math.pow((double) (this.c.x - circleArea.c.x), 2.0d))) < this.r + circleArea.r;
    }
}
