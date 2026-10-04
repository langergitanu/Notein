package androidx.viewpager.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f66511OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f66512OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f66513OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f66514OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f66515OooOooO;

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void OooO0O0(float f) {
        getHeight();
        throw null;
    }

    public boolean getDrawFullUnderline() {
        return this.f66512OooOoOO;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), 0);
    }

    public int getTabIndicatorColor() {
        return this.f66511OooOoO;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getHeight();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f66514OooOoo0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f66513OooOoo = x;
            this.f66515OooOooO = y;
            this.f66514OooOoo0 = false;
            return true;
        }
        if (action == 1) {
            throw null;
        }
        if (action == 2) {
            float f = 0;
            if (Math.abs(x - this.f66513OooOoo) > f || Math.abs(y - this.f66515OooOooO) > f) {
                this.f66514OooOoo0 = true;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
    }

    public void setDrawFullUnderline(boolean z) {
        this.f66512OooOoOO = z;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < 0) {
            i4 = 0;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(int i) {
        this.f66511OooOoO = i;
        throw null;
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i) {
        if (i < 0) {
            i = 0;
        }
        super.setTextSpacing(i);
    }
}
