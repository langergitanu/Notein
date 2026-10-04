package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import androidx.core.view.GravityCompat;
import com.orion.notein.global.R;
import o000OO.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f63844OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f63845OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f63846OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f63847OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f63848OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f63849OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f63850OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f63851OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f63852OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f63853Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f63854Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f63855Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f63856Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public float f63857Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public float f63858Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f63859Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public float f63860Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f63861Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f63862Oooo0oo;

    private float getHorizontalOffset() {
        Float.isNaN(this.f63850OooOoo0);
        this.f63849OooOoo.length();
        throw null;
    }

    private float getVerticalOffset() {
        Float.isNaN(this.f63850OooOoo0);
        throw null;
    }

    private void setUpTheme(Context context) {
        context.getTheme().resolveAttribute(R.attr.colorPrimary, new TypedValue(), true);
        throw null;
    }

    @Override // o000OO.OooO0OO
    public final void OooO00o(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.f63855Oooo00O = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (f2 + 0.5f);
        int i6 = i4 - i5;
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
    }

    public final void OooO0O0() {
        Float.isNaN(this.f63860Oooo0o0);
        Float.isNaN(this.f63859Oooo0o);
        Float.isNaN(this.f63861Oooo0oO);
        Float.isNaN(this.f63862Oooo0oo);
        throw null;
    }

    public float getRound() {
        return this.f63846OooOoO;
    }

    public float getRoundPercent() {
        return this.f63847OooOoO0;
    }

    public float getScaleFromTextSize() {
        return this.f63850OooOoo0;
    }

    public float getTextBackgroundPanX() {
        return this.f63860Oooo0o0;
    }

    public float getTextBackgroundPanY() {
        return this.f63859Oooo0o;
    }

    public float getTextBackgroundRotate() {
        return this.f63862Oooo0oo;
    }

    public float getTextBackgroundZoom() {
        return this.f63861Oooo0oO;
    }

    public int getTextOutlineColor() {
        return this.f63845OooOo0o;
    }

    public float getTextPanX() {
        return this.f63857Oooo0O0;
    }

    public float getTextPanY() {
        return this.f63858Oooo0OO;
    }

    public float getTextureHeight() {
        return this.f63856Oooo00o;
    }

    public float getTextureWidth() {
        return this.f63853Oooo0;
    }

    public Typeface getTypeface() {
        throw null;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.f63850OooOoo0);
        float f = zIsNaN ? 1.0f : this.f63848OooOoOO / this.f63850OooOoo0;
        boolean z = this.f63844OooOo;
        if (z || !zIsNaN) {
            if (z || f != 1.0f) {
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f63850OooOoo0) ? 1.0f : this.f63848OooOoOO / this.f63850OooOoo0;
        super.onDraw(canvas);
        boolean z = this.f63844OooOo;
        if (!z && f == 1.0f) {
            canvas.drawText(this.f63849OooOoo, this.f63855Oooo00O + this.f63851OooOooO + getHorizontalOffset(), this.f63852OooOooo + getVerticalOffset(), null);
        } else {
            if (z) {
                throw null;
            }
            getHorizontalOffset();
            getVerticalOffset();
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f63851OooOooO = getPaddingLeft();
        getPaddingRight();
        this.f63852OooOooo = getPaddingTop();
        getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            this.f63849OooOoo.getClass();
            throw null;
        }
    }

    public void setGravity(int i) {
        if ((i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 0) {
            i |= GravityCompat.START;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f63854Oooo000) {
            invalidate();
        }
        this.f63854Oooo000 = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.f63858Oooo0OO = -1.0f;
        } else if (i2 != 80) {
            this.f63858Oooo0OO = 0.0f;
        } else {
            this.f63858Oooo0OO = 1.0f;
        }
        int i3 = i & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f63857Oooo0O0 = 0.0f;
                        return;
                    }
                }
            }
            this.f63857Oooo0O0 = 1.0f;
            return;
        }
        this.f63857Oooo0O0 = -1.0f;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f63846OooOoO = f;
            float f2 = this.f63847OooOoO0;
            this.f63847OooOoO0 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f63846OooOoO != f;
        this.f63846OooOoO = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            getWidth();
            getHeight();
            throw null;
        }
        setClipToOutline(false);
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f63847OooOoO0 != f;
        this.f63847OooOoO0 = f;
        if (f != 0.0f) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f63850OooOoo0 = f;
    }

    public void setText(CharSequence charSequence) {
        this.f63849OooOoo = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f63860Oooo0o0 = f;
        OooO0O0();
        throw null;
    }

    public void setTextBackgroundPanY(float f) {
        this.f63859Oooo0o = f;
        OooO0O0();
        throw null;
    }

    public void setTextBackgroundRotate(float f) {
        this.f63862Oooo0oo = f;
        OooO0O0();
        throw null;
    }

    public void setTextBackgroundZoom(float f) {
        this.f63861Oooo0oO = f;
        OooO0O0();
        throw null;
    }

    public void setTextFillColor(int i) {
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f63845OooOo0o = i;
        this.f63844OooOo = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f63844OooOo = true;
        if (Float.isNaN(f)) {
            this.f63844OooOo = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f63857Oooo0O0 = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f63858Oooo0OO = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f63848OooOoOO = f;
        Float.isNaN(this.f63850OooOoo0);
        throw null;
    }

    public void setTextureHeight(float f) {
        this.f63856Oooo00o = f;
        OooO0O0();
        throw null;
    }

    public void setTextureWidth(float f) {
        this.f63853Oooo0 = f;
        OooO0O0();
        throw null;
    }

    public void setTypeface(Typeface typeface) {
        throw null;
    }
}
