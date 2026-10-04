package com.orion.penkit.models.eraser;

import android.graphics.PointF;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.soloader.OooOo;
import com.orion.penkit.models.PressurePointKt;
import com.orion.penkit.models.Segment;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32444OooOOO0;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0017\u001a\u00020\u0010H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0016\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0010H\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m80612d2 = {"Lcom/orion/penkit/models/eraser/CapsuleArea;", "Lcom/orion/penkit/models/eraser/ErasedArea;", "c0", "Landroid/graphics/PointF;", "c1", "r", "", "<init>", "(Landroid/graphics/PointF;Landroid/graphics/PointF;F)V", "getC0", "()Landroid/graphics/PointF;", "getC1", "getR", "()F", "tangents", "", "Lcom/orion/penkit/models/Segment;", "calculateTangents", "calculateTangentRectangle", "isPointInsideArea", "", ContextChain.TAG_PRODUCT, "calculateAreaSegmentIntersections", "segment", "intersects", DrawToolFactory.LASSO_TYPE_RECT, "circleArea", "Lcom/orion/penkit/models/eraser/CircleArea;", "quickReject", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CapsuleArea extends ErasedArea {
    private final PointF c0;
    private final PointF c1;
    private final float r;
    private List<Segment> tangents;

    public CapsuleArea(PointF c0, PointF c1, float f) {
        OooOOO0.OooO0oO(c0, "c0");
        OooOOO0.OooO0oO(c1, "c1");
        this.c0 = c0;
        this.c1 = c1;
        this.r = f;
        this.tangents = C34434OooOoO.f123453OooOo0o;
        this.tangents = calculateTangents();
    }

    private final List<PointF> calculateTangentRectangle() {
        return C34429OooOOo0.OooOO0o(this.tangents.get(0).getStart(), this.tangents.get(0).getEnd(), this.tangents.get(1).getEnd(), this.tangents.get(1).getStart());
    }

    private final List<Segment> calculateTangents() {
        PointF pointF = this.c1;
        float f = pointF.x;
        PointF pointF2 = this.c0;
        float f2 = f - pointF2.x;
        float f3 = -(pointF.y - pointF2.y);
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
        float f4 = f3 / fSqrt;
        float f5 = f2 / fSqrt;
        PointF pointF3 = this.c0;
        float f6 = pointF3.x;
        float f7 = this.r;
        PointF pointF4 = new PointF(f6 - (f7 * f4), pointF3.y - (f7 * f5));
        PointF pointF5 = this.c1;
        float f8 = pointF5.x;
        float f9 = this.r;
        PointF pointF6 = new PointF(f8 - (f9 * f4), pointF5.y - (f9 * f5));
        PointF pointF7 = this.c0;
        float f10 = pointF7.x;
        float f11 = this.r;
        PointF pointF8 = new PointF((f11 * f4) + f10, (f11 * f5) + pointF7.y);
        PointF pointF9 = this.c1;
        float f12 = pointF9.x;
        float f13 = this.r;
        return C34429OooOOo0.OooOO0o(new Segment(pointF4, pointF6), new Segment(pointF8, new PointF((f4 * f13) + f12, (f13 * f5) + pointF9.y)));
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public List<PointF> calculateAreaSegmentIntersections(Segment segment) {
        OooOOO0.OooO0oO(segment, "segment");
        List<PointF> listCalculateIntersection = segment.calculateIntersection(this.c0, this.r, this.tangents.get(1).getStart(), this.tangents.get(0).getStart());
        List<PointF> listCalculateIntersection2 = segment.calculateIntersection(this.c1, this.r, this.tangents.get(0).getEnd(), this.tangents.get(1).getEnd());
        PointF pointFCalculateIntersection = segment.calculateIntersection(this.tangents.get(0));
        List listOooO0oO = C34434OooOoO.f123453OooOo0o;
        List listOooO0oO2 = pointFCalculateIntersection != null ? OooOo.OooO0oO(pointFCalculateIntersection) : listOooO0oO;
        PointF pointFCalculateIntersection2 = segment.calculateIntersection(this.tangents.get(1));
        if (pointFCalculateIntersection2 != null) {
            listOooO0oO = OooOo.OooO0oO(pointFCalculateIntersection2);
        }
        return oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO(listCalculateIntersection, listCalculateIntersection2), listOooO0oO2), listOooO0oO);
    }

    public final PointF getC0() {
        return this.c0;
    }

    public final PointF getC1() {
        return this.c1;
    }

    public final float getR() {
        return this.r;
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean intersects(Segment segment) {
        OooOOO0.OooO0oO(segment, "segment");
        return segment.intersects(calculateTangentRectangle()) || segment.intersects(this.c0, this.r) || segment.intersects(this.c1, this.r);
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean isPointInsideArea(PointF p) {
        OooOOO0.OooO0oO(p, "p");
        if (PressurePointKt.isInsideCircle(p, this.c0, this.r) || PressurePointKt.isInsideCircle(p, this.c1, this.r)) {
            return true;
        }
        return PressurePointKt.isInsideRectangle(p, calculateTangentRectangle());
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean quickReject(Segment segment) {
        OooOOO0.OooO0oO(segment, "segment");
        return segment.calculateIntersection(new Segment(this.c0, this.c1)) == null && segment.calculateIntersection(new Segment(this.tangents.get(0).midPoint(), this.tangents.get(1).midPoint())) == null;
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean intersects(List<? extends PointF> rect) {
        OooOOO0.OooO0oO(rect, "rect");
        throw new C32444OooOOO0("An operation is not implemented: Not yet implemented");
    }

    @Override // com.orion.penkit.models.eraser.ErasedArea
    public boolean intersects(CircleArea circleArea) {
        OooOOO0.OooO0oO(circleArea, "circleArea");
        if (circleArea.intersects(calculateTangentRectangle())) {
            return true;
        }
        return circleArea.intersects(new CircleArea(this.c0, this.r)) || circleArea.intersects(new CircleArea(this.c1, this.r));
    }
}
