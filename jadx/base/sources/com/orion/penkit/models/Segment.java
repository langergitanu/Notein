package com.orion.penkit.models;

import OooOoO.C20504OooO0O0;
import OooOoO.C20509OooO0oo;
import Oooo0o0.C21009OooOooO;
import android.graphics.PointF;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.soloader.OooOo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0O00oo.OooOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0000J4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002J\u000e\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u001d\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006-"}, m80612d2 = {"Lcom/orion/penkit/models/Segment;", "", "start", "Landroid/graphics/PointF;", "end", "<init>", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)V", "getStart", "()Landroid/graphics/PointF;", "setStart", "(Landroid/graphics/PointF;)V", "getEnd", "setEnd", "midPoint", "isDistanceGreaterThan", "", ContextChain.TAG_PRODUCT, "r", "", "intersects", DrawToolFactory.LASSO_TYPE_RECT, "", "c", "calculateIntersection", "segment", "isAngleBetween", "target", "", "angle1", "angle2", "normalizeAngle", "angle", "closestPointOnSegmentToPoint", "point", "getSegmentAxes", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Segment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private PointF end;
    private PointF start;

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m80612d2 = {"Lcom/orion/penkit/models/Segment$Companion;", "", "<init>", "()V", "isParallel", "", "segment1", "Lcom/orion/penkit/models/Segment;", "segment2", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final boolean isParallel(Segment segment1, Segment segment2) {
            OooOOO0.OooO0oO(segment1, "segment1");
            OooOOO0.OooO0oO(segment2, "segment2");
            float f = segment1.getEnd().x - segment1.getStart().x;
            float f2 = segment2.getEnd().x - segment2.getStart().x;
            if (f == 0.0f && f2 == 0.0f) {
                return true;
            }
            return (f == 0.0f || f2 == 0.0f || ((double) Math.abs(((segment1.getEnd().y - segment1.getStart().y) / f) - ((segment2.getEnd().y - segment2.getStart().y) / f2))) >= 0.01d) ? false : true;
        }

        private Companion() {
        }
    }

    public Segment(PointF start, PointF end) {
        OooOOO0.OooO0oO(start, "start");
        OooOOO0.OooO0oO(end, "end");
        this.start = start;
        this.end = end;
    }

    public static /* synthetic */ List calculateIntersection$default(Segment segment, PointF pointF, float f, PointF pointF2, PointF pointF3, int i, Object obj) {
        if ((i & 4) != 0) {
            pointF2 = null;
        }
        if ((i & 8) != 0) {
            pointF3 = null;
        }
        return segment.calculateIntersection(pointF, f, pointF2, pointF3);
    }

    public static /* synthetic */ Segment copy$default(Segment segment, PointF pointF, PointF pointF2, int i, Object obj) {
        if ((i & 1) != 0) {
            pointF = segment.start;
        }
        if ((i & 2) != 0) {
            pointF2 = segment.end;
        }
        return segment.copy(pointF, pointF2);
    }

    private final boolean isAngleBetween(double target, double angle1, double angle2) {
        double dNormalizeAngle = normalizeAngle(target);
        double dNormalizeAngle2 = normalizeAngle(angle1);
        double dNormalizeAngle3 = normalizeAngle(angle2);
        return dNormalizeAngle2 <= dNormalizeAngle3 ? dNormalizeAngle >= dNormalizeAngle2 && dNormalizeAngle <= dNormalizeAngle3 : dNormalizeAngle >= dNormalizeAngle2 || dNormalizeAngle <= dNormalizeAngle3;
    }

    private final double normalizeAngle(double angle) {
        return ((angle % 6.283185307179586d) + 6.283185307179586d) % 6.283185307179586d;
    }

    public final PointF calculateIntersection(Segment segment) {
        OooOOO0.OooO0oO(segment, "segment");
        PointF pointF = this.start;
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = this.end;
        float f3 = pointF2.x;
        float f4 = pointF2.y;
        PointF pointF3 = segment.start;
        float f5 = pointF3.x;
        float f6 = pointF3.y;
        PointF pointF4 = segment.end;
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = pointF4.x - f5;
        float f10 = pointF4.y - f6;
        float f11 = (f7 * f10) - (f9 * f8);
        if (f11 == 0.0f) {
            return null;
        }
        float f12 = f5 - f;
        float f13 = f6 - f2;
        float fOooO0O0 = C20509OooO0oo.OooO0O0(f13, f9, f10 * f12, f11);
        float fOooO0O02 = C20509OooO0oo.OooO0O0(f13, f7, f12 * f8, f11);
        double d = fOooO0O0;
        if (0.0d <= d && d <= 1.0d) {
            double d2 = fOooO0O02;
            if (0.0d <= d2 && d2 <= 1.0d) {
                return new PointF((f7 * fOooO0O0) + f, (fOooO0O0 * f8) + f2);
            }
        }
        return null;
    }

    public final PointF closestPointOnSegmentToPoint(PointF point) {
        OooOOO0.OooO0oO(point, "point");
        PointF pointF = this.end;
        float f = pointF.x;
        PointF pointF2 = this.start;
        float f2 = pointF2.x;
        float f3 = f - f2;
        float f4 = pointF.y;
        float f5 = pointF2.y;
        float f6 = f4 - f5;
        float f7 = (f6 * f6) + (f3 * f3);
        if (f7 == 0.0f) {
            return pointF2;
        }
        float fOooO0o0 = OooOO0.OooO0o0((((point.y - f5) * f6) + ((point.x - f2) * f3)) / f7, 0.0f, 1.0f);
        PointF pointF3 = this.start;
        return new PointF((f3 * fOooO0o0) + pointF3.x, (fOooO0o0 * f6) + pointF3.y);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PointF getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PointF getEnd() {
        return this.end;
    }

    public final Segment copy(PointF start, PointF end) {
        OooOOO0.OooO0oO(start, "start");
        OooOOO0.OooO0oO(end, "end");
        return new Segment(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return OooOOO0.OooO0O0(this.start, segment.start) && OooOOO0.OooO0O0(this.end, segment.end);
    }

    public final PointF getEnd() {
        return this.end;
    }

    public final List<PointF> getSegmentAxes() {
        PointF pointF = this.end;
        float f = pointF.x;
        PointF pointF2 = this.start;
        PointF pointF3 = new PointF(-(pointF.y - pointF2.y), f - pointF2.x);
        float fHypot = (float) Math.hypot(pointF3.x, pointF3.y);
        return OooOo.OooO0oO(new PointF(pointF3.x / fHypot, pointF3.y / fHypot));
    }

    public final PointF getStart() {
        return this.start;
    }

    public int hashCode() {
        return this.end.hashCode() + (this.start.hashCode() * 31);
    }

    public final boolean intersects(List<? extends PointF> rect) {
        OooOOO0.OooO0oO(rect, "rect");
        for (PointF pointF : oOo000Oo.OooOo.OooooOO(SegmentKt.getPolygonAxes(rect), getSegmentAxes())) {
            if (!SegmentKt.projectionsOverlap(SegmentKt.projectPolygon(pointF, rect), SegmentKt.projectSegment(pointF, this))) {
                return false;
            }
        }
        return true;
    }

    public final boolean isDistanceGreaterThan(PointF p, float r) {
        float fOooO0O0;
        OooOOO0.OooO0oO(p, "p");
        PointF pointF = this.end;
        float f = pointF.x;
        PointF pointF2 = this.start;
        float f2 = pointF2.x;
        float f3 = f - f2;
        float f4 = pointF.y;
        float f5 = pointF2.y;
        float f6 = f4 - f5;
        float f7 = p.x;
        float f8 = f7 - f2;
        float f9 = p.y;
        float f10 = f9 - f5;
        float fOooO00o = C21009OooOooO.OooO00o(f10, f6, f8 * f3, (f6 * f6) + (f3 * f3));
        double d = fOooO00o;
        if (d < 0.0d) {
            fOooO0O0 = (f10 * f10) + (f8 * f8);
        } else if (d > 1.0d) {
            fOooO0O0 = OooOO0.OooO0OO.OooO0O0(f9, f4, f9 - f4, (f7 - f) * (f7 - f));
        } else {
            float f11 = (f3 * fOooO00o) + f2;
            float f12 = (fOooO00o * f6) + f5;
            fOooO0O0 = OooOO0.OooO0OO.OooO0O0(f9, f12, f9 - f12, (f7 - f11) * (f7 - f11));
        }
        return fOooO0O0 >= r * r;
    }

    public final PointF midPoint() {
        PointF pointF = this.start;
        float f = pointF.x;
        PointF pointF2 = this.end;
        float f2 = 2;
        return new PointF((f + pointF2.x) / f2, (pointF.y + pointF2.y) / f2);
    }

    public final void setEnd(PointF pointF) {
        OooOOO0.OooO0oO(pointF, "<set-?>");
        this.end = pointF;
    }

    public final void setStart(PointF pointF) {
        OooOOO0.OooO0oO(pointF, "<set-?>");
        this.start = pointF;
    }

    public String toString() {
        return "Segment(start=" + this.start + ", end=" + this.end + ")";
    }

    public final boolean intersects(PointF c, float r) {
        OooOOO0.OooO0oO(c, "c");
        PointF pointFClosestPointOnSegmentToPoint = closestPointOnSegmentToPoint(c);
        float f = pointFClosestPointOnSegmentToPoint.x - c.x;
        float f2 = pointFClosestPointOnSegmentToPoint.y - c.y;
        return (f2 * f2) + (f * f) <= r * r;
    }

    public final List<PointF> calculateIntersection(PointF c, float r, PointF start, PointF end) {
        PointF pointF = start;
        PointF pointF2 = end;
        OooOOO0.OooO0oO(c, "c");
        ArrayList arrayList = new ArrayList();
        PointF pointF3 = this.start;
        float f = pointF3.x;
        float f2 = pointF3.y;
        PointF pointF4 = this.end;
        float f3 = pointF4.x;
        float f4 = pointF4.y;
        float f5 = c.x;
        float f6 = f3 - f;
        float f7 = f4 - f2;
        float f8 = f - f5;
        float f9 = f2 - c.y;
        float f10 = (f7 * f7) + (f6 * f6);
        float f11 = 2;
        float fOooO0O0 = C20504OooO0O0.OooO0O0(f9, f7, f8 * f6, f11);
        float f12 = (fOooO0O0 * fOooO0O0) - ((4 * f10) * (((f9 * f9) + (f8 * f8)) - (r * r)));
        if (f12 >= 0.0f) {
            float f13 = -fOooO0O0;
            double d = f12;
            float f14 = f11 * f10;
            Iterator it = C34429OooOOo0.OooOO0o(Float.valueOf((((float) Math.sqrt(d)) + f13) / f14), Float.valueOf((f13 - ((float) Math.sqrt(d))) / f14)).iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                double d2 = fFloatValue;
                if (0.0d <= d2 && d2 <= 1.0d) {
                    float f15 = (fFloatValue * f6) + f;
                    float f16 = (fFloatValue * f7) + f2;
                    double dAtan2 = (float) Math.atan2(f16 - r13, f15 - f5);
                    if (pointF != null && pointF2 != null) {
                        if (isAngleBetween(dAtan2, (float) Math.atan2(pointF.y - r13, pointF.x - f5), (float) Math.atan2(pointF2.y - r13, pointF2.x - f5))) {
                            arrayList.add(new PointF(f15, f16));
                        }
                    } else {
                        arrayList.add(new PointF(f15, f16));
                    }
                }
                pointF = start;
                pointF2 = end;
            }
        }
        return arrayList;
    }
}
