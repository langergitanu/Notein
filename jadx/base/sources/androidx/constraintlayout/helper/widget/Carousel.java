package androidx.constraintlayout.helper.widget;

import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {

    public interface OooO00o {
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return 0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            throw null;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    public void setAdapter(OooO00o oooO00o) {
    }

    public void setInfinite(boolean z) {
    }
}
