package o0OoO0oo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.view.View;
import com.google.android.material.internal.ManufacturerUtils;

/* JADX INFO: renamed from: o0OoO0oo.o00oOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28957o00oOo0O extends View.DragShadowBuilder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28957o00oOo0O(View v) {
        super(v);
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        canvas.save();
        getView().draw(canvas);
        canvas.drawColor(Color.parseColor("#66CCCCCC"));
        canvas.restore();
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point size, Point touch) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(size, "size");
        kotlin.jvm.internal.OooOOO0.OooO0oO(touch, "touch");
        int width = getView().getWidth();
        int height = getView().getHeight();
        size.set(width, height);
        if (ManufacturerUtils.isSamsungDevice()) {
            touch.set(width / 2, height / 2);
        } else {
            touch.set(0, 0);
        }
    }
}
