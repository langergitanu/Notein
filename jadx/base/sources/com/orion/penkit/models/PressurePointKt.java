package com.orion.penkit.models;

import android.graphics.PointF;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¨\u0006\t"}, m80612d2 = {"isInsideCircle", "", "Landroid/graphics/PointF;", "center", "radius", "", "isInsideRectangle", DrawToolFactory.LASSO_TYPE_RECT, "", "ni-penkit_release"}, m80613k = 2, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PressurePointKt {
    public static final boolean isInsideCircle(PointF pointF, PointF center, float f) {
        OooOOO0.OooO0oO(pointF, "<this>");
        OooOOO0.OooO0oO(center, "center");
        float f2 = pointF.x - center.x;
        float f3 = pointF.y - center.y;
        return (f3 * f3) + (f2 * f2) <= f * f;
    }

    public static final boolean isInsideRectangle(PointF pointF, List<? extends PointF> rect) {
        OooOOO0.OooO0oO(pointF, "<this>");
        OooOOO0.OooO0oO(rect, "rect");
        if (rect.size() != 4) {
            throw new IllegalArgumentException("Rectangle must have exactly 4 vertices.");
        }
        int size = rect.size();
        int i = 0;
        while (i < size) {
            PointF pointF2 = rect.get(i);
            i++;
            PointF pointF3 = rect.get(i % rect.size());
            float f = pointF3.x;
            float f2 = pointF2.x;
            float f3 = f - f2;
            float f4 = pointF3.y;
            float f5 = pointF2.y;
            if (((pointF.y - f5) * f3) - ((f4 - f5) * (pointF.x - f2)) < 0.0f) {
                return false;
            }
        }
        return true;
    }
}
