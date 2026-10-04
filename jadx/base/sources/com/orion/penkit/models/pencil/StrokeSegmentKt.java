package com.orion.penkit.models.pencil;

import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, m80612d2 = {"distanceTo", "", "Landroid/graphics/PointF;", "other", "ni-penkit_release"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StrokeSegmentKt {
    public static final float distanceTo(PointF pointF, PointF other) {
        OooOOO0.OooO0oO(pointF, "<this>");
        OooOOO0.OooO0oO(other, "other");
        float f = other.x - pointF.x;
        float f2 = other.y - pointF.y;
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }
}
