package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements TintableBackgroundView, TintableCompoundDrawablesView {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};
    private final C21529OooO0oo mAppCompatEmojiEditTextHelper;
    private final C21526OooO0Oo mBackgroundTintHelper;
    private final C21534OooOOoo mTextHelper;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
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

    public void initEmojiKeyListener(C21529OooO0oo c21529OooO0oo) {
        KeyListener keyListener = getKeyListener();
        c21529OooO0oo.getClass();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerOooO00o = c21529OooO0oo.OooO00o(keyListener);
        if (keyListenerOooO00o == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerOooO00o);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.f62920OooO0O0.f82382OooO00o.f82384OooO0O0.f82403OooOoO0;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        OooOO0.OooO00o(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.mAppCompatEmojiEditTextHelper.OooO0OO(inputConnectionOnCreateInputConnection, editorInfo);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(OooO.OooO00o.OooO0OO(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.OooO00o(keyListener));
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

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.orion.notein.global.R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C21562OoooO0.OooO00o(context);
        C21549Oooo.OooO00o(getContext(), this);
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(getContext(), attributeSet, TINT_ATTRS, i, 0);
        if (c21565OoooOO0OooO0o.f63093OooO0O0.hasValue(0)) {
            setDropDownBackgroundDrawable(c21565OoooOO0OooO0o.OooO0O0(0));
        }
        c21565OoooOO0OooO0o.OooO0oO();
        C21526OooO0Oo c21526OooO0Oo = new C21526OooO0Oo(this);
        this.mBackgroundTintHelper = c21526OooO0Oo;
        c21526OooO0Oo.OooO0Oo(attributeSet, i);
        C21534OooOOoo c21534OooOOoo = new C21534OooOOoo(this);
        this.mTextHelper = c21534OooOOoo;
        c21534OooOOoo.OooO0o(attributeSet, i);
        c21534OooOOoo.OooO0O0();
        C21529OooO0oo c21529OooO0oo = new C21529OooO0oo(this);
        this.mAppCompatEmojiEditTextHelper = c21529OooO0oo;
        c21529OooO0oo.OooO0O0(attributeSet, i);
        initEmojiKeyListener(c21529OooO0oo);
    }
}
