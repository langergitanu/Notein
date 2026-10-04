package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements TintableCompoundButton, TintableBackgroundView, TintableCompoundDrawablesView {
    private OooO mAppCompatEmojiTextHelper;
    private final C21526OooO0Oo mBackgroundTintHelper;
    private final OooO0o mCompoundButtonHelper;
    private final C21534OooOOoo mTextHelper;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    private OooO getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new OooO(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C21526OooO0Oo c21526OooO0Oo = this.mBackgroundTintHelper;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO00o();
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
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

    @Override // androidx.core.widget.TintableCompoundButton
    public ColorStateList getSupportButtonTintList() {
        OooO0o oooO0o = this.mCompoundButtonHelper;
        if (oooO0o != null) {
            return oooO0o.f62899OooO0O0;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public PorterDuff.Mode getSupportButtonTintMode() {
        OooO0o oooO0o = this.mCompoundButtonHelper;
        if (oooO0o != null) {
            return oooO0o.f62900OooO0OO;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.OooO0Oo();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.OooO0o0();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().OooO0O0();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0Oo(z);
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        OooO0o oooO0o = this.mCompoundButtonHelper;
        if (oooO0o != null) {
            if (oooO0o.f62902OooO0o) {
                oooO0o.f62902OooO0o = false;
            } else {
                oooO0o.f62902OooO0o = true;
                oooO0o.OooO00o();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0o0(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
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

    @Override // androidx.core.widget.TintableCompoundButton
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        OooO0o oooO0o = this.mCompoundButtonHelper;
        if (oooO0o != null) {
            oooO0o.f62899OooO0O0 = colorStateList;
            oooO0o.f62901OooO0Oo = true;
            oooO0o.OooO00o();
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        OooO0o oooO0o = this.mCompoundButtonHelper;
        if (oooO0o != null) {
            oooO0o.f62900OooO0OO = mode;
            oooO0o.f62903OooO0o0 = true;
            oooO0o.OooO00o();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.OooOO0O(colorStateList);
        this.mTextHelper.OooO0O0();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.OooOO0o(mode);
        this.mTextHelper.OooO0O0();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C21562OoooO0.OooO00o(context);
        C21549Oooo.OooO00o(getContext(), this);
        OooO0o oooO0o = new OooO0o(this);
        this.mCompoundButtonHelper = oooO0o;
        oooO0o.OooO0O0(attributeSet, i);
        C21526OooO0Oo c21526OooO0Oo = new C21526OooO0Oo(this);
        this.mBackgroundTintHelper = c21526OooO0Oo;
        c21526OooO0Oo.OooO0Oo(attributeSet, i);
        C21534OooOOoo c21534OooOOoo = new C21534OooOOoo(this);
        this.mTextHelper = c21534OooOOoo;
        c21534OooOOoo.OooO0o(attributeSet, i);
        getEmojiTextViewHelper().OooO0OO(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(OooO.OooO00o.OooO0OO(getContext(), i));
    }
}
