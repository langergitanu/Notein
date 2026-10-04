package androidx.appcompat.widget;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CheckedTextViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements TintableCheckedTextView, TintableBackgroundView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C21526OooO0Oo f62818OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21527OooO0o0 f62819OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO f62820OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C21534OooOOoo f62821OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        C21562OoooO0.OooO00o(context);
        C21549Oooo.OooO00o(getContext(), this);
        C21534OooOOoo c21534OooOOoo = new C21534OooOOoo(this);
        this.f62821OooOoO0 = c21534OooOOoo;
        c21534OooOOoo.OooO0o(attributeSet, R.attr.checkedTextViewStyle);
        c21534OooOOoo.OooO0O0();
        C21526OooO0Oo c21526OooO0Oo = new C21526OooO0Oo(this);
        this.f62818OooOo = c21526OooO0Oo;
        c21526OooO0Oo.OooO0Oo(attributeSet, R.attr.checkedTextViewStyle);
        this.f62819OooOo0o = new C21527OooO0o0(this);
        Context context2 = getContext();
        int[] iArr = C20441OooO00o.f58289OooOO0o;
        C21565OoooOO0 c21565OoooOO0OooO0o = C21565OoooOO0.OooO0o(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = c21565OoooOO0OooO0o.f63093OooO0O0;
        ViewCompat.saveAttributeDataForStyleable(this, getContext(), iArr, attributeSet, c21565OoooOO0OooO0o.f63093OooO0O0, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(OooO.OooO00o.OooO0OO(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(OooO.OooO00o.OooO0OO(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(OooO.OooO00o.OooO0OO(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                CheckedTextViewCompat.setCheckMarkTintList(this, c21565OoooOO0OooO0o.OooO00o(2));
            }
            if (typedArray.hasValue(3)) {
                CheckedTextViewCompat.setCheckMarkTintMode(this, C21545OooOooO.OooO0OO(typedArray.getInt(3, -1), null));
            }
            c21565OoooOO0OooO0o.OooO0oO();
            getEmojiTextViewHelper().OooO0OO(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            c21565OoooOO0OooO0o.OooO0oO();
            throw th;
        }
    }

    private OooO getEmojiTextViewHelper() {
        if (this.f62820OooOoO == null) {
            this.f62820OooOoO = new OooO(this);
        }
        return this.f62820OooOoO;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C21534OooOOoo c21534OooOOoo = this.f62821OooOoO0;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
        C21526OooO0Oo c21526OooO0Oo = this.f62818OooOo;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO00o();
        }
        C21527OooO0o0 c21527OooO0o0 = this.f62819OooOo0o;
        if (c21527OooO0o0 != null) {
            c21527OooO0o0.OooO00o();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.TintableBackgroundView
    public ColorStateList getSupportBackgroundTintList() {
        C21526OooO0Oo c21526OooO0Oo = this.f62818OooOo;
        if (c21526OooO0Oo != null) {
            return c21526OooO0Oo.OooO0O0();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C21526OooO0Oo c21526OooO0Oo = this.f62818OooOo;
        if (c21526OooO0Oo != null) {
            return c21526OooO0Oo.OooO0OO();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public ColorStateList getSupportCheckMarkTintList() {
        C21527OooO0o0 c21527OooO0o0 = this.f62819OooOo0o;
        if (c21527OooO0o0 != null) {
            return c21527OooO0o0.f62905OooO0O0;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C21527OooO0o0 c21527OooO0o0 = this.f62819OooOo0o;
        if (c21527OooO0o0 != null) {
            return c21527OooO0o0.f62906OooO0OO;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f62821OooOoO0.OooO0Oo();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f62821OooOoO0.OooO0o0();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        OooOO0.OooO00o(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C21526OooO0Oo c21526OooO0Oo = this.f62818OooOo;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0o0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C21526OooO0Oo c21526OooO0Oo = this.f62818OooOo;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0o(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C21527OooO0o0 c21527OooO0o0 = this.f62819OooOo0o;
        if (c21527OooO0o0 != null) {
            if (c21527OooO0o0.f62908OooO0o) {
                c21527OooO0o0.f62908OooO0o = false;
            } else {
                c21527OooO0o0.f62908OooO0o = true;
                c21527OooO0o0.OooO00o();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C21534OooOOoo c21534OooOOoo = this.f62821OooOoO0;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C21534OooOOoo c21534OooOOoo = this.f62821OooOoO0;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0o0(z);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C21526OooO0Oo c21526OooO0Oo = this.f62818OooOo;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO0oo(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C21526OooO0Oo c21526OooO0Oo = this.f62818OooOo;
        if (c21526OooO0Oo != null) {
            c21526OooO0Oo.OooO(mode);
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C21527OooO0o0 c21527OooO0o0 = this.f62819OooOo0o;
        if (c21527OooO0o0 != null) {
            c21527OooO0o0.f62905OooO0O0 = colorStateList;
            c21527OooO0o0.f62907OooO0Oo = true;
            c21527OooO0o0.OooO00o();
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C21527OooO0o0 c21527OooO0o0 = this.f62819OooOo0o;
        if (c21527OooO0o0 != null) {
            c21527OooO0o0.f62906OooO0OO = mode;
            c21527OooO0o0.f62909OooO0o0 = true;
            c21527OooO0o0.OooO00o();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C21534OooOOoo c21534OooOOoo = this.f62821OooOoO0;
        c21534OooOOoo.OooOO0O(colorStateList);
        c21534OooOOoo.OooO0O0();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C21534OooOOoo c21534OooOOoo = this.f62821OooOoO0;
        c21534OooOOoo.OooOO0o(mode);
        c21534OooOOoo.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C21534OooOOoo c21534OooOOoo = this.f62821OooOoO0;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0oO(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(OooO.OooO00o.OooO0OO(getContext(), i));
    }
}
