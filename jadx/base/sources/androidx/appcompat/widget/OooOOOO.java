package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f62929OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AppCompatSeekBar f62930OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ColorStateList f62931OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Drawable f62932OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public PorterDuff.Mode f62933OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f62934OooO0oo;

    public OooOOOO(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f62931OooO0o = null;
        this.f62933OooO0oO = null;
        this.f62934OooO0oo = false;
        this.f62929OooO = false;
        this.f62930OooO0Oo = appCompatSeekBar;
    }

    @Override // androidx.appcompat.widget.OooOOO0
    public final void OooO00o(AttributeSet attributeSet, int i) {
        super.OooO00o(attributeSet, R.attr.seekBarStyle);
        AppCompatSeekBar appCompatSeekBar = this.f62930OooO0Oo;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = C20441OooO00o.f58285OooO0oO;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        ViewCompat.saveAttributeDataForStyleable(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, c21565OoooOO0OooO0o.f63093OooO0O0, R.attr.seekBarStyle, 0);
        Drawable drawableOooO0OO = c21565OoooOO0OooO0o.OooO0OO(0);
        if (drawableOooO0OO != null) {
            appCompatSeekBar.setThumb(drawableOooO0OO);
        }
        Drawable drawableOooO0O0 = c21565OoooOO0OooO0o.OooO0O0(1);
        Drawable drawable = this.f62932OooO0o0;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f62932OooO0o0 = drawableOooO0O0;
        if (drawableOooO0O0 != null) {
            drawableOooO0O0.setCallback(appCompatSeekBar);
            DrawableCompat.setLayoutDirection(drawableOooO0O0, appCompatSeekBar.getLayoutDirection());
            if (drawableOooO0O0.isStateful()) {
                drawableOooO0O0.setState(appCompatSeekBar.getDrawableState());
            }
            OooO0OO();
        }
        appCompatSeekBar.invalidate();
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        if (typedArray.hasValue(3)) {
            this.f62933OooO0oO = C21545OooOooO.OooO0OO(typedArray.getInt(3, -1), this.f62933OooO0oO);
            this.f62929OooO = true;
        }
        if (typedArray.hasValue(2)) {
            this.f62931OooO0o = c21565OoooOO0OooO0o.OooO00o(2);
            this.f62934OooO0oo = true;
        }
        c21565OoooOO0OooO0o.OooO0oO();
        OooO0OO();
    }

    public final void OooO0OO() {
        Drawable drawable = this.f62932OooO0o0;
        if (drawable != null) {
            if (this.f62934OooO0oo || this.f62929OooO) {
                Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
                this.f62932OooO0o0 = drawableWrap;
                if (this.f62934OooO0oo) {
                    DrawableCompat.setTintList(drawableWrap, this.f62931OooO0o);
                }
                if (this.f62929OooO) {
                    DrawableCompat.setTintMode(this.f62932OooO0o0, this.f62933OooO0oO);
                }
                if (this.f62932OooO0o0.isStateful()) {
                    this.f62932OooO0o0.setState(this.f62930OooO0Oo.getDrawableState());
                }
            }
        }
    }

    public final void OooO0Oo(Canvas canvas) {
        if (this.f62932OooO0o0 != null) {
            int max = this.f62930OooO0Oo.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f62932OooO0o0.getIntrinsicWidth();
                int intrinsicHeight = this.f62932OooO0o0.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f62932OooO0o0.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f62932OooO0o0.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
