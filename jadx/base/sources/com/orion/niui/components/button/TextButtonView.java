package com.orion.niui.components.button;

import OooOo.C20496Oooo0o0;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import OooooOO.C21348Ooooo0o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.android.billingclient.api.C22189OoooO0;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24232OooO0o0;
import o000oOoO.C24633OooO00o;
import o0O0oOoO.C26149OooO00o;
import o0O0oOoo.C26190OoooOoo;
import o0O0oOoo.EnumC26187OoooOOo;
import o0ooOO0.o000O000;
import oo0o0Oo.C34698OooOo00;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b#\u0010 J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0016¢\u0006\u0004\b&\u0010\u0019J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010\u0019J\u0017\u0010+\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b*\u0010 J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0016¢\u0006\u0004\b-\u0010\u0019J\u0017\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101R+\u00108\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\nR+\u0010<\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u0010\u0010\"\u0004\b;\u0010\u000eR/\u0010A\u001a\u0004\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00104\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0014R+\u0010F\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bB\u00104\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\u0006R/\u0010K\u001a\u0004\u0018\u00010\u00022\b\u00102\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u00104\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u001cR+\u0010O\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u00104\u001a\u0004\bM\u0010D\"\u0004\bN\u0010\u0006R/\u0010V\u001a\u0004\u0018\u00010P2\b\u00102\u001a\u0004\u0018\u00010P8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u00104\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR/\u0010Z\u001a\u0004\u0018\u00010P2\b\u00102\u001a\u0004\u0018\u00010P8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bW\u00104\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR/\u0010^\u001a\u0004\u0018\u00010P2\b\u00102\u001a\u0004\u0018\u00010P8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b[\u00104\u001a\u0004\b\\\u0010S\"\u0004\b]\u0010UR/\u0010c\u001a\u0004\u0018\u00010.2\b\u00102\u001a\u0004\u0018\u00010.8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b_\u00104\u001a\u0004\b`\u0010a\"\u0004\bb\u00101¨\u0006d"}, m80612d2 = {"Lcom/orion/niui/components/button/TextButtonView;", "Landroid/widget/FrameLayout;", "", "enabled", "LoO00ooO/OooOooO;", "setEnabled", "(Z)V", "", "text", "setText", "(Ljava/lang/String;)V", "Lo0O0oOoo/OoooOOo;", "variant", "setVariant", "(Lo0O0oOoo/OoooOOo;)V", "getVariant", "()Lo0O0oOoo/OoooOOo;", "LOooooOO/Ooooo0o;", "color", "setAccentColor-Y2TPw74", "(LOooooOO/Ooooo0o;)V", "setAccentColor", "", "colorInt", "setAccentColorInt", "(I)V", "useDarkTheme", "setUseDarkTheme", "(Ljava/lang/Boolean;)V", "Lo0000Ooo/OooO0o0;", "minWidth", "setMinWidthDp-YLDhkOg", "(Lo0000Ooo/OooO0o0;)V", "setMinWidthDp", "maxWidth", "setMaxWidthDp-YLDhkOg", "setMaxWidthDp", "minWidthPx", "setMinWidthPx", "maxWidthPx", "setMaxWidthPx", "height", "setHeightDp-YLDhkOg", "setHeightDp", "heightPx", "setHeightPx", "Loo0o0Oo/OooOo00;", "textStyle", "setTextStyle", "(Loo0o0Oo/OooOo00;)V", "<set-?>", "OooOo0o", "LOooo0oO/o00oO0O;", "getTextState", "()Ljava/lang/String;", "setTextState", "textState", "OooOo", "getVariantState", "setVariantState", "variantState", "OooOoO0", "getAccentColorState-QN2ZGVo", "()LOooooOO/Ooooo0o;", "setAccentColorState-Y2TPw74", "accentColorState", "OooOoO", "getEnabledState", "()Z", "setEnabledState", "enabledState", "OooOoOO", "getUseDarkThemeState", "()Ljava/lang/Boolean;", "setUseDarkThemeState", "useDarkThemeState", "OooOoo0", "getShouldFillMaxWidthState", "setShouldFillMaxWidthState", "shouldFillMaxWidthState", "", "OooOoo", "getMinWidthPxState", "()Ljava/lang/Float;", "setMinWidthPxState", "(Ljava/lang/Float;)V", "minWidthPxState", "OooOooO", "getMaxWidthPxState", "setMaxWidthPxState", "maxWidthPxState", "OooOooo", "getHeightPxState", "setHeightPxState", "heightPxState", "Oooo000", "getTextStyleState", "()Loo0o0Oo/OooOo00;", "setTextStyleState", "textStyleState", "ni-ui-components_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextButtonView extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69500OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69501OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69502OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69503OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69504OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69505OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69506OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69507OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69508OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69509Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        ComposeView composeView = new ComposeView(context);
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f69501OooOo0o = C21105o000OoO.OooO0OO("Text Button", o000o0o02);
        EnumC26187OoooOOo enumC26187OoooOOo = EnumC26187OoooOOo.f89408OooOo0o;
        this.f69500OooOo = C21105o000OoO.OooO0OO(enumC26187OoooOOo, o000o0o02);
        this.f69503OooOoO0 = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69502OooOoO = C21105o000OoO.OooO0OO(Boolean.valueOf(isEnabled()), o000o0o02);
        this.f69504OooOoOO = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69506OooOoo0 = C21105o000OoO.OooO0OO(Boolean.FALSE, o000o0o02);
        this.f69505OooOoo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69507OooOooO = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69508OooOooo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69509Oooo000 = C21105o000OoO.OooO0OO(null, o000o0o02);
        setClickable(true);
        setFocusable(true);
        setClipChildren(false);
        setClipToPadding(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C26149OooO00o.f89233OooO0oO, 0, 0);
            OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = typedArrayObtainStyledAttributes.getString(5);
            setTextState(string != null ? string : "Text Button");
            int i = typedArrayObtainStyledAttributes.getInt(7, 0);
            if (i == 1) {
                enumC26187OoooOOo = EnumC26187OoooOOo.f89407OooOo;
            } else if (i == 2) {
                enumC26187OoooOOo = EnumC26187OoooOOo.f89410OooOoO0;
            } else if (i == 3) {
                enumC26187OoooOOo = EnumC26187OoooOOo.f89409OooOoO;
            }
            setVariantState(enumC26187OoooOOo);
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
                m80729setAccentColorStateY2TPw74(colorStateList != null ? new C21348Ooooo0o(C20496Oooo0o0.OooO0O0(colorStateList.getDefaultColor())) : null);
            }
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                setUseDarkThemeState(Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(6, false)));
            }
            if (typedArrayObtainStyledAttributes.hasValue(4)) {
                float dimension = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
                setMinWidthPxState(!Float.isNaN(dimension) ? Float.valueOf(dimension) : null);
            }
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                float dimension2 = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
                setMaxWidthPxState(!Float.isNaN(dimension2) ? Float.valueOf(dimension2) : null);
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                float dimension3 = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
                setHeightPxState(Float.isNaN(dimension3) ? null : Float.valueOf(dimension3));
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                float dimension4 = typedArrayObtainStyledAttributes.getDimension(1, Float.NaN);
                if (!Float.isNaN(dimension4)) {
                    setTextStyleState(new C34698OooOo00(0L, C22189OoooO0.OooO0o0(dimension4 / getResources().getDisplayMetrics().scaledDensity, 4294967296L), null, null, 0L, 0L, 4194301));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        composeView.setViewCompositionStrategy(o000O000.OooO00o.f112848OooO00o);
        composeView.setContent(new C24633OooO00o(-1442033643, true, new C26190OoooOoo(this)));
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getAccentColorState-QN2ZGVo, reason: not valid java name */
    public final C21348Ooooo0o m80728getAccentColorStateQN2ZGVo() {
        return (C21348Ooooo0o) this.f69503OooOoO0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabledState() {
        return ((Boolean) this.f69502OooOoO.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Float getHeightPxState() {
        return (Float) this.f69508OooOooo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Float getMaxWidthPxState() {
        return (Float) this.f69507OooOooO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Float getMinWidthPxState() {
        return (Float) this.f69505OooOoo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShouldFillMaxWidthState() {
        return ((Boolean) this.f69506OooOoo0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getTextState() {
        return (String) this.f69501OooOo0o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final C34698OooOo00 getTextStyleState() {
        return (C34698OooOo00) this.f69509Oooo000.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getUseDarkThemeState() {
        return (Boolean) this.f69504OooOoOO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC26187OoooOOo getVariantState() {
        return (EnumC26187OoooOOo) this.f69500OooOo.getValue();
    }

    /* JADX INFO: renamed from: setAccentColorState-Y2TPw74, reason: not valid java name */
    private final void m80729setAccentColorStateY2TPw74(C21348Ooooo0o c21348Ooooo0o) {
        this.f69503OooOoO0.setValue(c21348Ooooo0o);
    }

    private final void setEnabledState(boolean z) {
        this.f69502OooOoO.setValue(Boolean.valueOf(z));
    }

    private final void setHeightPxState(Float f) {
        this.f69508OooOooo.setValue(f);
    }

    private final void setMaxWidthPxState(Float f) {
        this.f69507OooOooO.setValue(f);
    }

    private final void setMinWidthPxState(Float f) {
        this.f69505OooOoo.setValue(f);
    }

    private final void setShouldFillMaxWidthState(boolean z) {
        this.f69506OooOoo0.setValue(Boolean.valueOf(z));
    }

    private final void setTextState(String str) {
        this.f69501OooOo0o.setValue(str);
    }

    private final void setTextStyleState(C34698OooOo00 c34698OooOo00) {
        this.f69509Oooo000.setValue(c34698OooOo00);
    }

    private final void setUseDarkThemeState(Boolean bool) {
        this.f69504OooOoOO.setValue(bool);
    }

    private final void setVariantState(EnumC26187OoooOOo enumC26187OoooOOo) {
        this.f69500OooOo.setValue(enumC26187OoooOOo);
    }

    public final EnumC26187OoooOOo getVariant() {
        return getVariantState();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setShouldFillMaxWidthState(View.MeasureSpec.getMode(i) == 1073741824 && getMaxWidthPxState() == null);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: setAccentColor-Y2TPw74, reason: not valid java name */
    public final void m80730setAccentColorY2TPw74(C21348Ooooo0o color) {
        m80729setAccentColorStateY2TPw74(color);
    }

    public final void setAccentColorInt(int colorInt) {
        m80729setAccentColorStateY2TPw74(new C21348Ooooo0o(C20496Oooo0o0.OooO0O0(colorInt)));
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setEnabledState(enabled);
    }

    /* JADX INFO: renamed from: setHeightDp-YLDhkOg, reason: not valid java name */
    public final void m80731setHeightDpYLDhkOg(C24232OooO0o0 height) {
        Float fValueOf;
        if (height != null) {
            fValueOf = Float.valueOf(height.f81479OooOo0o * getResources().getDisplayMetrics().density);
        } else {
            fValueOf = null;
        }
        setHeightPxState(fValueOf);
        requestLayout();
    }

    public final void setHeightPx(int heightPx) {
        setHeightPxState(Float.valueOf(heightPx));
        requestLayout();
    }

    /* JADX INFO: renamed from: setMaxWidthDp-YLDhkOg, reason: not valid java name */
    public final void m80732setMaxWidthDpYLDhkOg(C24232OooO0o0 maxWidth) {
        Float fValueOf;
        if (maxWidth != null) {
            fValueOf = Float.valueOf(maxWidth.f81479OooOo0o * getResources().getDisplayMetrics().density);
        } else {
            fValueOf = null;
        }
        setMaxWidthPxState(fValueOf);
        requestLayout();
    }

    public final void setMaxWidthPx(int maxWidthPx) {
        setMaxWidthPxState(Float.valueOf(maxWidthPx));
        requestLayout();
    }

    /* JADX INFO: renamed from: setMinWidthDp-YLDhkOg, reason: not valid java name */
    public final void m80733setMinWidthDpYLDhkOg(C24232OooO0o0 minWidth) {
        Float fValueOf;
        if (minWidth != null) {
            fValueOf = Float.valueOf(minWidth.f81479OooOo0o * getResources().getDisplayMetrics().density);
        } else {
            fValueOf = null;
        }
        setMinWidthPxState(fValueOf);
        requestLayout();
    }

    public final void setMinWidthPx(int minWidthPx) {
        setMinWidthPxState(Float.valueOf(minWidthPx));
        requestLayout();
    }

    public final void setText(String text) {
        OooOOO0.OooO0oO(text, "text");
        setTextState(text);
    }

    public final void setTextStyle(C34698OooOo00 textStyle) {
        setTextStyleState(textStyle);
        requestLayout();
    }

    public final void setUseDarkTheme(Boolean useDarkTheme) {
        setUseDarkThemeState(useDarkTheme);
    }

    public final void setVariant(EnumC26187OoooOOo variant) {
        OooOOO0.OooO0oO(variant, "variant");
        setVariantState(variant);
    }
}
