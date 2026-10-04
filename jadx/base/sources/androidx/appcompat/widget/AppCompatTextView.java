package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.C21533OooOOo0;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView {
    private final C21526OooO0Oo mBackgroundTintHelper;
    private OooO mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;
    private OooO00o mSuperCaller;
    private final C21533OooOOo0 mTextClassifierHelper;
    private final C21534OooOOoo mTextHelper;

    public interface OooO00o {
        void OooO00o(int i);

        void OooO0O0(int i);

        void OooO0OO(int i, float f);
    }

    public class OooO0O0 implements OooO00o {
        public OooO0O0() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO00o
        public void OooO00o(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO00o
        public void OooO0O0(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO00o
        public void OooO0OO(int i, float f) {
        }
    }

    public class OooO0OO extends OooO0O0 {
        public OooO0OO() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO0O0, androidx.appcompat.widget.AppCompatTextView.OooO00o
        public final void OooO00o(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO0O0, androidx.appcompat.widget.AppCompatTextView.OooO00o
        public final void OooO0O0(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatTextView$OooO0Oo, reason: case insensitive filesystem */
    public class C21525OooO0Oo extends OooO0OO {
        public C21525OooO0Oo() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.OooO0O0, androidx.appcompat.widget.AppCompatTextView.OooO00o
        public final void OooO0OO(int i, float f) {
            AppCompatTextView.super.setLineHeight(i, f);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                TextViewCompat.setPrecomputedText(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private OooO getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new OooO(this);
        }
        return this.mEmojiTextViewHelper;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.getFirstBaselineToTopHeight(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.getLastBaselineToBottomHeight(this);
    }

    public OooO00o getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new C21525OooO0Oo();
            } else if (i >= 28) {
                this.mSuperCaller = new OooO0OO();
            } else {
                this.mSuperCaller = new OooO0O0();
            }
        }
        return this.mSuperCaller;
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
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
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

    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return TextViewCompat.getTextMetricsParams(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().OooO0O0();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, getText());
        }
        OooOO0.OooO00o(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
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
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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
        getEmojiTextViewHelper().OooO0o0(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooO00o(i);
        } else {
            TextViewCompat.setFirstBaselineToTopHeight(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooO0O0(i);
        } else {
            TextViewCompat.setLastBaselineToBottomHeight(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        TextViewCompat.setLineHeight(this, i);
    }

    public void setPrecomputedText(PrecomputedTextCompat precomputedTextCompat) {
        TextViewCompat.setPrecomputedText(this, precomputedTextCompat);
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

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PrecomputedTextCompat.Params params) {
        TextViewCompat.setTextMetricsParams(this, params);
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

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceCreate = (typeface == null || i <= 0) ? null : TypefaceCompat.create(getContext(), typeface, i);
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().OooO0OO(i, f);
        } else {
            TextViewCompat.setLineHeight(this, i, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C21562OoooO0.OooO00o(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C21549Oooo.OooO00o(getContext(), this);
        C21526OooO0Oo c21526OooO0Oo = new C21526OooO0Oo(this);
        this.mBackgroundTintHelper = c21526OooO0Oo;
        c21526OooO0Oo.OooO0Oo(attributeSet, i);
        C21534OooOOoo c21534OooOOoo = new C21534OooOOoo(this);
        this.mTextHelper = c21534OooOOoo;
        c21534OooOOoo.OooO0o(attributeSet, i);
        c21534OooOOoo.OooO0O0();
        this.mTextClassifierHelper = new C21533OooOOo0(this);
        getEmojiTextViewHelper().OooO0OO(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? OooO.OooO00o.OooO0OO(context, i) : null, i2 != 0 ? OooO.OooO00o.OooO0OO(context, i2) : null, i3 != 0 ? OooO.OooO00o.OooO0OO(context, i3) : null, i4 != 0 ? OooO.OooO00o.OooO0OO(context, i4) : null);
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? OooO.OooO00o.OooO0OO(context, i) : null, i2 != 0 ? OooO.OooO00o.OooO0OO(context, i2) : null, i3 != 0 ? OooO.OooO00o.OooO0OO(context, i3) : null, i4 != 0 ? OooO.OooO00o.OooO0OO(context, i4) : null);
        C21534OooOOoo c21534OooOOoo = this.mTextHelper;
        if (c21534OooOOoo != null) {
            c21534OooOOoo.OooO0O0();
        }
    }
}
