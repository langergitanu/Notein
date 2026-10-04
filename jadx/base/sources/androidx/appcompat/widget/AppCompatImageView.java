package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements TintableBackgroundView, TintableImageSourceView {
    private final C21526OooO0Oo mBackgroundTintHelper;
    private boolean mHasLevel;
    private final OooOO0O mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C21526OooO0Oo c21526OooO0Oo = this.mBackgroundTintHelper;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO00o();
        }
        OooOO0O oooOO0O = this.mImageHelper;
        if (oooOO0O != null) {
            oooOO0O.OooO00o();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        C21526OooO0Oo c21526OooO0Oo = this.mBackgroundTintHelper;
        if (c21526OooO0Oo != null) {
            return c21526OooO0Oo.OooO0O0();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21526OooO0Oo c21526OooO0Oo = this.mBackgroundTintHelper;
        if (c21526OooO0Oo != null) {
            return c21526OooO0Oo.OooO0OO();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public ColorStateList getSupportImageTintList() {
        C21564OoooO0O c21564OoooO0O;
        OooOO0O oooOO0O = this.mImageHelper;
        if (oooOO0O == null || (c21564OoooO0O = oooOO0O.f62924OooO0O0) == null) {
            return null;
        }
        return c21564OoooO0O.f63088OooO00o;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public PorterDuff.Mode getSupportImageTintMode() {
        C21564OoooO0O c21564OoooO0O;
        OooOO0O oooOO0O = this.mImageHelper;
        if (oooOO0O == null || (c21564OoooO0O = oooOO0O.f62924OooO0O0) == null) {
            return null;
        }
        return c21564OoooO0O.f63089OooO0O0;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f62923OooO00o.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21526OooO0Oo c21526OooO0Oo = this.mBackgroundTintHelper;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21526OooO0Oo c21526OooO0Oo = this.mBackgroundTintHelper;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        OooOO0O oooOO0O = this.mImageHelper;
        if (oooOO0O != null) {
            oooOO0O.OooO00o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        OooOO0O oooOO0O = this.mImageHelper;
        if (oooOO0O != null && drawable != null && !this.mHasLevel) {
            oooOO0O.f62925OooO0OO = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        OooOO0O oooOO0O2 = this.mImageHelper;
        if (oooOO0O2 != null) {
            oooOO0O2.OooO00o();
            if (this.mHasLevel) {
                return;
            }
            OooOO0O oooOO0O3 = this.mImageHelper;
            ImageView imageView = oooOO0O3.f62923OooO00o;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(oooOO0O3.f62925OooO0OO);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        OooOO0O oooOO0O = this.mImageHelper;
        if (oooOO0O != null) {
            oooOO0O.OooO0OO(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        OooOO0O oooOO0O = this.mImageHelper;
        if (oooOO0O != null) {
            oooOO0O.OooO00o();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21526OooO0Oo c21526OooO0Oo = this.mBackgroundTintHelper;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0oo(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21526OooO0Oo c21526OooO0Oo = this.mBackgroundTintHelper;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO(mode);
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(ColorStateList colorStateList) {
        OooOO0O oooOO0O = this.mImageHelper;
        if (oooOO0O != null) {
            if (oooOO0O.f62924OooO0O0 == null) {
                oooOO0O.f62924OooO0O0 = new C21564OoooO0O();
            }
            C21564OoooO0O c21564OoooO0O = oooOO0O.f62924OooO0O0;
            c21564OoooO0O.f63088OooO00o = colorStateList;
            c21564OoooO0O.f63091OooO0Oo = true;
            oooOO0O.OooO00o();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        OooOO0O oooOO0O = this.mImageHelper;
        if (oooOO0O != null) {
            if (oooOO0O.f62924OooO0O0 == null) {
                oooOO0O.f62924OooO0O0 = new C21564OoooO0O();
            }
            C21564OoooO0O c21564OoooO0O = oooOO0O.f62924OooO0O0;
            c21564OoooO0O.f63089OooO0O0 = mode;
            c21564OoooO0O.f63090OooO0OO = true;
            oooOO0O.OooO00o();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C21562OoooO0.OooO00o(context);
        this.mHasLevel = false;
        C21549Oooo.OooO00o(getContext(), this);
        C21526OooO0Oo c21526OooO0Oo = new C21526OooO0Oo(this);
        this.mBackgroundTintHelper = c21526OooO0Oo;
        c21526OooO0Oo.OooO0Oo(attributeSet, i);
        OooOO0O oooOO0O = new OooOO0O(this);
        this.mImageHelper = oooOO0O;
        oooOO0O.OooO0O0(attributeSet, i);
    }
}
