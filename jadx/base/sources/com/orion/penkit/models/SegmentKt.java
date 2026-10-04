package com.orion.penkit.models;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¨\u0006\u000e"}, m80612d2 = {"getPolygonAxes", "", "Landroid/graphics/PointF;", "projectPolygon", "Lcom/orion/penkit/models/Projection;", "axis", "polygon", "projectSegment", "segment", "Lcom/orion/penkit/models/Segment;", "projectionsOverlap", "", "proj1", "proj2", "ni-penkit_release"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SegmentKt {
    public static final List<PointF> getPolygonAxes(List<? extends PointF> list) {
        OooOOO0.OooO0oO(list, "<this>");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            PointF pointF = list.get(i);
            i++;
            PointF pointF2 = list.get(i % list.size());
            PointF pointF3 = new PointF(pointF2.x - pointF.x, pointF2.y - pointF.y);
            PointF pointF4 = new PointF(-pointF3.y, pointF3.x);
            float fHypot = (float) Math.hypot(pointF4.x, pointF4.y);
            arrayList.add(new PointF(pointF4.x / fHypot, pointF4.y / fHypot));
        }
        return arrayList;
    }

    public static final Projection projectPolygon(PointF axis, List<? extends PointF> polygon) {
        OooOOO0.OooO0oO(axis, "axis");
        OooOOO0.OooO0oO(polygon, "polygon");
        float f = Float.POSITIVE_INFINITY;
        float f2 = Float.NEGATIVE_INFINITY;
        for (PointF pointF : polygon) {
            float f3 = (pointF.y * axis.y) + (pointF.x * axis.x);
            if (f3 < f) {
                f = f3;
            }
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return new Projection(f, f2);
    }

    public static final Projection projectSegment(PointF axis, Segment segment) {
        Float fValueOf;
        OooOOO0.OooO0oO(axis, "axis");
        OooOOO0.OooO0oO(segment, "segment");
        List listOooOO0o = C34429OooOOo0.OooOO0o(Float.valueOf((segment.getStart().y * axis.y) + (segment.getStart().x * axis.x)), Float.valueOf((segment.getEnd().y * axis.y) + (segment.getEnd().x * axis.x)));
        Iterator it = listOooOO0o.iterator();
        Float fValueOf2 = null;
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        OooOOO0.OooO0Oo(fValueOf);
        float fFloatValue2 = fValueOf.floatValue();
        Iterator it2 = listOooOO0o.iterator();
        if (it2.hasNext()) {
            float fFloatValue3 = ((Number) it2.next()).floatValue();
            while (it2.hasNext()) {
                fFloatValue3 = Math.max(fFloatValue3, ((Number) it2.next()).floatValue());
            }
            fValueOf2 = Float.valueOf(fFloatValue3);
        }
        OooOOO0.OooO0Oo(fValueOf2);
        return new Projection(fFloatValue2, fValueOf2.floatValue());
    }

    public static final boolean projectionsOverlap(Projection proj1, Projection proj2) {
        OooOOO0.OooO0oO(proj1, "proj1");
        OooOOO0.OooO0oO(proj2, "proj2");
        return proj1.getMax() >= proj2.getMin() && proj2.getMax() >= proj1.getMin();
    }
}
