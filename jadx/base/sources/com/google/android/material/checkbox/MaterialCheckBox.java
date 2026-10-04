package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.C21565OoooOO0;
import androidx.concurrent.futures.OooO00o;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.C22117OooO0Oo;
import androidx.vectordrawable.graphics.drawable.OooO0O0;
import androidx.vectordrawable.graphics.drawable.OooO0OO;
import com.google.android.material.C15966R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.microsoft.identity.common.java.WarningType;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int[][] CHECKBOX_STATES;
    private static final int[] ERROR_STATE_SET;
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    private boolean broadcasting;
    private Drawable buttonDrawable;
    private Drawable buttonIconDrawable;
    ColorStateList buttonIconTintList;
    private PorterDuff.Mode buttonIconTintMode;
    ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    private int[] currentStateChecked;
    private CharSequence customStateDescription;
    private CharSequence errorAccessibilityLabel;
    private boolean errorShown;
    private ColorStateList materialThemeColorsTintList;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private final LinkedHashSet<OnCheckedStateChangedListener> onCheckedStateChangedListeners;
    private final LinkedHashSet<OnErrorChangedListener> onErrorChangedListeners;
    private final OooO0OO transitionToUnchecked;
    private final OooO0O0 transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;
    private static final int DEF_STYLE_RES = C15966R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] INDETERMINATE_STATE_SET = {C15966R.attr.state_indeterminate};

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(MaterialCheckBox materialCheckBox, int i);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(MaterialCheckBox materialCheckBox, boolean z);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int checkedState;

        private String getCheckedStateString() {
            int i = this.checkedState;
            return i != 1 ? i != 2 ? WarningType.unchecked_warning : "indeterminate" : "checked";
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            return OooO00o.OooO0OO(sb, getCheckedStateString(), "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.checkedState));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.checkedState = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i = C15966R.attr.state_error;
        ERROR_STATE_SET = new int[]{i};
        CHECKBOX_STATES = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        FRAMEWORK_BUTTON_DRAWABLE_RES_ID = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", TelemetryEventStrings.C18741Os.OS_NAME);
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private String getButtonStateDescription() {
        int i = this.checkedState;
        return i == 1 ? getResources().getString(C15966R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(C15966R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(C15966R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int[][] iArr = CHECKBOX_STATES;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, C15966R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, C15966R.attr.colorError);
            int color3 = MaterialColors.getColor(this, C15966R.attr.colorSurface);
            int color4 = MaterialColors.getColor(this, C15966R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color3, color2, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[2] = MaterialColors.layer(color3, color4, 0.54f);
            iArr2[3] = MaterialColors.layer(color3, color4, 0.38f);
            iArr2[4] = MaterialColors.layer(color3, color4, 0.38f);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.buttonTintList;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private boolean isButtonDrawableLegacy(C21565OoooOO0 c21565OoooOO0) {
        return c21565OoooOO0.f63093OooO0O0.getResourceId(C15966R.styleable.MaterialCheckBox_android_button, 0) == FRAMEWORK_BUTTON_DRAWABLE_RES_ID && c21565OoooOO0.f63093OooO0O0.getResourceId(C15966R.styleable.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    private /* synthetic */ void lambda$new$0() {
        this.buttonIconDrawable.jumpToCurrentState();
    }

    private void refreshButtonDrawable() {
        this.buttonDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonDrawable, this.buttonTintList, CompoundButtonCompat.getButtonTintMode(this));
        this.buttonIconDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonIconDrawable, this.buttonIconTintList, this.buttonIconTintMode);
        setUpDefaultButtonDrawableAnimationIfNeeded();
        updateButtonTints();
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.buttonDrawable, this.buttonIconDrawable));
        refreshDrawableState();
    }

    private void setDefaultStateDescription() {
        if (Build.VERSION.SDK_INT < 30 || this.customStateDescription != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
        OooO0OO oooO0OO;
        C22117OooO0Oo c22117OooO0Oo;
        if (this.usingMaterialButtonDrawable) {
            OooO0OO oooO0OO2 = this.transitionToUnchecked;
            if (oooO0OO2 != null) {
                OooO0O0 oooO0O0 = this.transitionToUncheckedCallback;
                Drawable drawable = oooO0OO2.f66509OooOo0o;
                if (drawable != null) {
                    ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(oooO0O0.getPlatformCallback());
                }
                ArrayList<OooO0O0> arrayList = oooO0OO2.f66437OooOoOO;
                if (arrayList != null && oooO0O0 != null) {
                    arrayList.remove(oooO0O0);
                    if (oooO0OO2.f66437OooOoOO.size() == 0 && (c22117OooO0Oo = oooO0OO2.f66435OooOoO) != null) {
                        oooO0OO2.f66434OooOo.f66441OooO0O0.removeListener(c22117OooO0Oo);
                        oooO0OO2.f66435OooOoO = null;
                    }
                }
                OooO0OO oooO0OO3 = this.transitionToUnchecked;
                OooO0O0 oooO0O02 = this.transitionToUncheckedCallback;
                Drawable drawable2 = oooO0OO3.f66509OooOo0o;
                if (drawable2 != null) {
                    ((AnimatedVectorDrawable) drawable2).registerAnimationCallback(oooO0O02.getPlatformCallback());
                } else if (oooO0O02 != null) {
                    if (oooO0OO3.f66437OooOoOO == null) {
                        oooO0OO3.f66437OooOoOO = new ArrayList<>();
                    }
                    if (!oooO0OO3.f66437OooOoOO.contains(oooO0O02)) {
                        oooO0OO3.f66437OooOoOO.add(oooO0O02);
                        if (oooO0OO3.f66435OooOoO == null) {
                            oooO0OO3.f66435OooOoO = new C22117OooO0Oo(oooO0OO3);
                        }
                        oooO0OO3.f66434OooOo.f66441OooO0O0.addListener(oooO0OO3.f66435OooOoO);
                    }
                }
            }
            Drawable drawable3 = this.buttonDrawable;
            if (!(drawable3 instanceof AnimatedStateListDrawable) || (oooO0OO = this.transitionToUnchecked) == null) {
                return;
            }
            int i = C15966R.id.checked;
            int i2 = C15966R.id.unchecked;
            ((AnimatedStateListDrawable) drawable3).addTransition(i, i2, oooO0OO, false);
            ((AnimatedStateListDrawable) this.buttonDrawable).addTransition(C15966R.id.indeterminate, i2, this.transitionToUnchecked, false);
        }
    }

    private void updateButtonTints() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.buttonDrawable;
        if (drawable != null && (colorStateList2 = this.buttonTintList) != null) {
            DrawableCompat.setTintList(drawable, colorStateList2);
        }
        Drawable drawable2 = this.buttonIconDrawable;
        if (drawable2 == null || (colorStateList = this.buttonIconTintList) == null) {
            return;
        }
        DrawableCompat.setTintList(drawable2, colorStateList);
    }

    private void updateIconTintIfNeeded() {
    }

    public void addOnCheckedStateChangedListener(OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.add(onCheckedStateChangedListener);
    }

    public void addOnErrorChangedListener(OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.add(onErrorChangedListener);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.onCheckedStateChangedListeners.clear();
    }

    public void clearOnErrorChangedListeners() {
        this.onErrorChangedListeners.clear();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.buttonDrawable;
    }

    public Drawable getButtonIconDrawable() {
        return this.buttonIconDrawable;
    }

    public ColorStateList getButtonIconTintList() {
        return this.buttonIconTintList;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.buttonIconTintMode;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.buttonTintList;
    }

    public int getCheckedState() {
        return this.checkedState;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.errorAccessibilityLabel;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.centerIfNoTextEnabled;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.checkedState == 1;
    }

    public boolean isErrorShown() {
        return this.errorShown;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && this.buttonTintList == null && this.buttonIconTintList == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, INDETERMINATE_STATE_SET);
        }
        if (isErrorShown()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, ERROR_STATE_SET);
        }
        this.currentStateChecked = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        updateIconTintIfNeeded();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.centerIfNoTextEnabled || !TextUtils.isEmpty(getText()) || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (ViewUtils.isLayoutRtl(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            DrawableCompat.setHotspotBounds(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.errorAccessibilityLabel));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.checkedState);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checkedState = getCheckedState();
        return savedState;
    }

    public void removeOnCheckedStateChangedListener(OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.remove(onCheckedStateChangedListener);
    }

    public void removeOnErrorChangedListener(OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.remove(onErrorChangedListener);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(OooO.OooO00o.OooO0OO(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.buttonIconDrawable = drawable;
        refreshButtonDrawable();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(OooO.OooO00o.OooO0OO(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.buttonIconTintList == colorStateList) {
            return;
        }
        this.buttonIconTintList = colorStateList;
        refreshButtonDrawable();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.buttonIconTintMode == mode) {
            return;
        }
        this.buttonIconTintMode = mode;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.buttonTintList == colorStateList) {
            return;
        }
        this.buttonTintList = colorStateList;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        refreshButtonDrawable();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.centerIfNoTextEnabled = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.checkedState != i) {
            this.checkedState = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            setDefaultStateDescription();
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            LinkedHashSet<OnCheckedStateChangedListener> linkedHashSet = this.onCheckedStateChangedListeners;
            if (linkedHashSet != null) {
                Iterator<OnCheckedStateChangedListener> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onCheckedStateChangedListener(this, this.checkedState);
                }
            }
            if (this.checkedState != 2 && (onCheckedChangeListener = this.onCheckedChangeListener) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.broadcasting = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        updateIconTintIfNeeded();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.errorAccessibilityLabel = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.errorShown == z) {
            return;
        }
        this.errorShown = z;
        refreshDrawableState();
        Iterator<OnErrorChangedListener> it = this.onErrorChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onErrorChanged(this, this.errorShown);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.customStateDescription = charSequence;
        if (charSequence == null) {
            setDefaultStateDescription();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C15966R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.buttonDrawable = drawable;
        this.usingMaterialButtonDrawable = false;
        refreshButtonDrawable();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.onErrorChangedListeners = new LinkedHashSet<>();
        this.onCheckedStateChangedListeners = new LinkedHashSet<>();
        Context context2 = getContext();
        int i3 = C15966R.drawable.mtrl_checkbox_button_checked_unchecked;
        OooO0OO oooO0OO = new OooO0OO(context2);
        Drawable drawable = ResourcesCompat.getDrawable(context2.getResources(), i3, context2.getTheme());
        oooO0OO.f66509OooOo0o = drawable;
        drawable.setCallback(oooO0OO.f66438OooOoo0);
        new OooO0OO.C19044OooO0OO(oooO0OO.f66509OooOo0o.getConstantState());
        this.transitionToUnchecked = oooO0OO;
        this.transitionToUncheckedCallback = new OooO0O0() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // androidx.vectordrawable.graphics.drawable.OooO0O0
            public void onAnimationEnd(Drawable drawable2) {
                super.onAnimationEnd(drawable2);
                ColorStateList colorStateList = MaterialCheckBox.this.buttonTintList;
                if (colorStateList != null) {
                    DrawableCompat.setTintList(drawable2, colorStateList);
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.OooO0O0
            public void onAnimationStart(Drawable drawable2) {
                super.onAnimationStart(drawable2);
                MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                ColorStateList colorStateList = materialCheckBox.buttonTintList;
                if (colorStateList != null) {
                    DrawableCompat.setTint(drawable2, colorStateList.getColorForState(materialCheckBox.currentStateChecked, MaterialCheckBox.this.buttonTintList.getDefaultColor()));
                }
            }
        };
        Context context3 = getContext();
        this.buttonDrawable = CompoundButtonCompat.getButtonDrawable(this);
        this.buttonTintList = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C21565OoooOO0 c21565OoooOO0ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context3, attributeSet, C15966R.styleable.MaterialCheckBox, i, i2, new int[0]);
        this.buttonIconDrawable = c21565OoooOO0ObtainTintedStyledAttributes.OooO0O0(C15966R.styleable.MaterialCheckBox_buttonIcon);
        if (this.buttonDrawable != null && ThemeEnforcement.isMaterial3Theme(context3) && isButtonDrawableLegacy(c21565OoooOO0ObtainTintedStyledAttributes)) {
            super.setButtonDrawable((Drawable) null);
            this.buttonDrawable = OooO.OooO00o.OooO0OO(context3, C15966R.drawable.mtrl_checkbox_button);
            this.usingMaterialButtonDrawable = true;
            if (this.buttonIconDrawable == null) {
                this.buttonIconDrawable = OooO.OooO00o.OooO0OO(context3, C15966R.drawable.mtrl_checkbox_button_icon);
            }
        }
        this.buttonIconTintList = MaterialResources.getColorStateList(context3, c21565OoooOO0ObtainTintedStyledAttributes, C15966R.styleable.MaterialCheckBox_buttonIconTint);
        int i4 = C15966R.styleable.MaterialCheckBox_buttonIconTintMode;
        TypedArray typedArray = c21565OoooOO0ObtainTintedStyledAttributes.f63093OooO0O0;
        this.buttonIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(i4, -1), PorterDuff.Mode.SRC_IN);
        this.useMaterialThemeColors = typedArray.getBoolean(C15966R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.centerIfNoTextEnabled = typedArray.getBoolean(C15966R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.errorShown = typedArray.getBoolean(C15966R.styleable.MaterialCheckBox_errorShown, false);
        this.errorAccessibilityLabel = typedArray.getText(C15966R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        int i5 = C15966R.styleable.MaterialCheckBox_checkedState;
        if (typedArray.hasValue(i5)) {
            setCheckedState(typedArray.getInt(i5, 0));
        }
        c21565OoooOO0ObtainTintedStyledAttributes.OooO0oO();
        refreshButtonDrawable();
    }
}
