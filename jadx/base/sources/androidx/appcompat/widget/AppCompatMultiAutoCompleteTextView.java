package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements TintableBackgroundView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final int[] f62823OooOoO = {R.attr.popupBackground};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C21534OooOOoo f62824OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21526OooO0Oo f62825OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C21529OooO0oo f62826OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.orion.notein.global.R.attr.autoCompleteTextViewStyle);
        C21562OoooO0.OooO00o(context);
        C21549Oooo.OooO00o(getContext(), this);
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(getContext(), attributeSet, f62823OooOoO, com.orion.notein.global.R.attr.autoCompleteTextViewStyle, 0);
        if (c21565OoooOO0OooO0o.f63093OooO0O0.hasValue(0)) {
            setDropDownBackgroundDrawable(c21565OoooOO0OooO0o.OooO0O0(0));
        }
        c21565OoooOO0OooO0o.OooO0oO();
        C21526OooO0Oo c21526OooO0Oo = new C21526OooO0Oo(this);
        this.f62825OooOo0o = c21526OooO0Oo;
        c21526OooO0Oo.OooO0Oo(attributeSet, com.orion.notein.global.R.attr.autoCompleteTextViewStyle);
        C21534OooOOoo c21534OooOOoo = new C21534OooOOoo(this);
        this.f62824OooOo = c21534OooOOoo;
        c21534OooOOoo.OooO0o(attributeSet, com.orion.notein.global.R.attr.autoCompleteTextViewStyle);
        c21534OooOOoo.OooO0O0();
        C21529OooO0oo c21529OooO0oo = new C21529OooO0oo(this);
        this.f62826OooOoO0 = c21529OooO0oo;
        c21529OooO0oo.OooO0O0(attributeSet, com.orion.notein.global.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
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

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C21526OooO0Oo c21526OooO0Oo = this.f62825OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO00o();
        }
        C21534OooOOoo c21534OooOOoo = this.f62824OooOo;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        C21526OooO0Oo c21526OooO0Oo = this.f62825OooOo0o;
        if (c21526OooO0Oo != null) {
            return c21526OooO0Oo.OooO0O0();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21526OooO0Oo c21526OooO0Oo = this.f62825OooOo0o;
        if (c21526OooO0Oo != null) {
            return c21526OooO0Oo.OooO0OO();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f62824OooOo.OooO0Oo();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f62824OooOo.OooO0o0();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        OooOO0.OooO00o(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f62826OooOoO0.OooO0OO(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21526OooO0Oo c21526OooO0Oo = this.f62825OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21526OooO0Oo c21526OooO0Oo = this.f62825OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0o(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C21534OooOOoo c21534OooOOoo = this.f62824OooOo;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C21534OooOOoo c21534OooOOoo = this.f62824OooOo;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(OooO.OooO00o.OooO0OO(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f62826OooOoO0.OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f62826OooOoO0.OooO00o(keyListener));
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21526OooO0Oo c21526OooO0Oo = this.f62825OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0oo(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21526OooO0Oo c21526OooO0Oo = this.f62825OooOo0o;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C21534OooOOoo c21534OooOOoo = this.f62824OooOo;
        c21534OooOOoo.OooOO0O(colorStateList);
        c21534OooOOoo.OooO0O0();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C21534OooOOoo c21534OooOOoo = this.f62824OooOo;
        c21534OooOOoo.OooOO0o(mode);
        c21534OooOOoo.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C21534OooOOoo c21534OooOOoo = this.f62824OooOo;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0oO(context, i);
        }
    }
}
