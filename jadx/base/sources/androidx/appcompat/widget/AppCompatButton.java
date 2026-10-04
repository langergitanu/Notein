package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView {
    private OooO mAppCompatEmojiTextHelper;
    private final C21526OooO0Oo mBackgroundTintHelper;
    private final C21534OooOOoo mTextHelper;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    private OooO getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new OooO(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMaxTextSize() {
        if (C21572Ooooo0o.f63120OooO0OO) {
            return super.getAutoSizeMaxTextSize();
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            return Math.round(c21534OooOOoo.f62939OooO.f62964OooO0o0);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMinTextSize() {
        if (C21572Ooooo0o.f63120OooO0OO) {
            return super.getAutoSizeMinTextSize();
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            return Math.round(c21534OooOOoo.f62939OooO.f62962OooO0Oo);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeStepGranularity() {
        if (C21572Ooooo0o.f63120OooO0OO) {
            return super.getAutoSizeStepGranularity();
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            return Math.round(c21534OooOOoo.f62939OooO.f62961OooO0OO);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C21572Ooooo0o.f63120OooO0OO) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        return c21534OooOOoo != null ? c21534OooOOoo.f62939OooO.f62963OooO0o : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeTextType() {
        if (C21572Ooooo0o.f63120OooO0OO) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            return c21534OooOOoo.f62939OooO.f62959OooO00o;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo == null || C21572Ooooo0o.f63120OooO0OO) {
            return;
        }
        c21534OooOOoo.f62939OooO.OooO00o();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo == null || C21572Ooooo0o.f63120OooO0OO || !c21534OooOOoo.f62939OooO.OooO0o()) {
            return;
        }
        this.mTextHelper.f62939OooO.OooO00o();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C21572Ooooo0o.f63120OooO0OO) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0oo(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C21572Ooooo0o.f63120OooO0OO) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO(iArr, i);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C21572Ooooo0o.f63120OooO0OO) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooOO0(i);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0o0(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.f62940OooO00o.setAllCaps(z);
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0oO(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = C21572Ooooo0o.f63120OooO0OO;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo == null || z) {
            return;
        }
        C21536OooOo0 c21536OooOo0 = c21534OooOOoo.f62939OooO;
        if (c21536OooOo0.OooO0o()) {
            return;
        }
        c21536OooOo0.OooO0oO(i, f);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C21562OoooO0.OooO00o(context);
        C21549Oooo.OooO00o(getContext(), this);
        C21526OooO0Oo c21526OooO0Oo = new C21526OooO0Oo(this);
        this.mBackgroundTintHelper = c21526OooO0Oo;
        c21526OooO0Oo.OooO0Oo(attributeSet, i);
        C21534OooOOoo c21534OooOOoo = new C21534OooOOoo(this);
        this.mTextHelper = c21534OooOOoo;
        c21534OooOOoo.OooO0o(attributeSet, i);
        c21534OooOOoo.OooO0O0();
        getEmojiTextViewHelper().OooO0OO(attributeSet, i);
    }
}
