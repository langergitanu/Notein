package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f63967OooOo0o;

    public Guideline(Context context) {
        super(context);
        this.f63967OooOo0o = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f63967OooOo0o = z;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        if (this.f63967OooOo0o && oooO00o.f63877OooO00o == i) {
            return;
        }
        oooO00o.f63877OooO00o = i;
        setLayoutParams(oooO00o);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        if (this.f63967OooOo0o && oooO00o.f63878OooO0O0 == i) {
            return;
        }
        oooO00o.f63878OooO0O0 = i;
        setLayoutParams(oooO00o);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) getLayoutParams();
        if (this.f63967OooOo0o && oooO00o.f63879OooO0OO == f) {
            return;
        }
        oooO00o.f63879OooO0OO = f;
        setLayoutParams(oooO00o);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f63967OooOo0o = true;
        super.setVisibility(8);
    }
}
