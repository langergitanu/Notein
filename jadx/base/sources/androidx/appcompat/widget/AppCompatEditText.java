package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.widget.C21533OooOOo0;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.orion.notein.global.R;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements TintableBackgroundView, OnReceiveContentViewBehavior, TintableCompoundDrawablesView {
    private final C21529OooO0oo mAppCompatEmojiEditTextHelper;
    private final C21526OooO0Oo mBackgroundTintHelper;
    private final TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;
    private OooO00o mSuperCaller;
    private final C21533OooOOo0 mTextClassifierHelper;
    private final C21534OooOOoo mTextHelper;

    public class OooO00o {
        public OooO00o() {
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private OooO00o getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new OooO00o();
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C21533OooOOo0 c21533OooOOo0;
        if (Build.VERSION.SDK_INT >= 28 || (c21533OooOOo0 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = c21533OooOOo0.f62938OooO0O0;
        return textClassifier == null ? C21533OooOOo0.OooO00o.OooO00o(c21533OooOOo0.f62937OooO00o) : textClassifier;
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
        String[] onReceiveContentMimeTypes;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, getText());
        }
        OooOO0.OooO00o(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (onReceiveContentMimeTypes = ViewCompat.getOnReceiveContentMimeTypes(this)) != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, onReceiveContentMimeTypes);
            inputConnectionOnCreateInputConnection = InputConnectionCompat.createWrapper(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.OooO0OO(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zOooO00o = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ViewCompat.getOnReceiveContentMimeTypes(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zOooO00o = OooOOO.OooO00o(dragEvent, this, activity);
            }
        }
        if (zOooO00o) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.OnReceiveContentViewBehavior
    public ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
        return this.mDefaultOnReceiveContentListener.onReceiveContent(this, contentInfoCompat);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT >= 31 || ViewCompat.getOnReceiveContentMimeTypes(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ViewCompat.performReceiveContent(this, new ContentInfoCompat.Builder(primaryClip, 1).setFlags(i == 16908322 ? 0 : 1).build());
        }
        return true;
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C21533OooOOo0 c21533OooOOo0;
        if (Build.VERSION.SDK_INT >= 28 || (c21533OooOOo0 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c21533OooOOo0.f62938OooO0O0 = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
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
        this.mTextClassifierHelper = new C21533OooOOo0(this);
        this.mDefaultOnReceiveContentListener = new TextViewOnReceiveContentListener();
        C21529OooO0oo c21529OooO0oo = new C21529OooO0oo(this);
        this.mAppCompatEmojiEditTextHelper = c21529OooO0oo;
        c21529OooO0oo.OooO0O0(attributeSet, i);
        initEmojiKeyListener(c21529OooO0oo);
    }
}
