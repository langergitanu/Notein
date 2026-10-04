package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public MotionLayout f63863OooOo0o;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(null);
        if (this.f63863OooOo0o != null) {
            getWidth();
            getHeight();
            float f = this.f63863OooOo0o.f63675Oooo00o;
            throw null;
        }
        ViewParent parent = getParent();
        if (parent instanceof MotionLayout) {
            this.f63863OooOo0o = (MotionLayout) parent;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        charSequence.toString();
        requestLayout();
    }
}
