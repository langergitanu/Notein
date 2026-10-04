package com.orion.niui.components.button;

import OooOo.C20496Oooo0o0;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.InterfaceC21033OooOOOO;
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
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24232OooO0o0;
import o000oOoO.C24633OooO00o;
import o0O0oOoO.C26149OooO00o;
import o0O0ooo.InterfaceC26230OooO0o0;
import o0ooOO0.o000O000;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001YJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010!\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b#\u0010 J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0016¢\u0006\u0004\b&\u0010\u0019J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010\u0019J/\u0010+\u001a\u00020\u00042 \u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,R+\u00102\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\fR+\u00107\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u0006R+\u0010;\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b9\u00105\"\u0004\b:\u0010\u0006R/\u0010@\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u001cR+\u0010D\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010/\u001a\u0004\bB\u00105\"\u0004\bC\u0010\u0006R/\u0010I\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010/\u001a\u0004\bF\u0010G\"\u0004\bH\u0010\u0014R/\u0010P\u001a\u0004\u0018\u00010J2\b\u0010-\u001a\u0004\u0018\u00010J8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010/\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR/\u0010T\u001a\u0004\u0018\u00010J2\b\u0010-\u001a\u0004\u0018\u00010J8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010/\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR+\u0010X\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010/\u001a\u0004\bV\u00105\"\u0004\bW\u0010\u0006¨\u0006Z"}, m80612d2 = {"Lcom/orion/niui/components/button/SelectableTextButtonView;", "Landroid/widget/FrameLayout;", "", "enabled", "LoO00ooO/OooOooO;", "setEnabled", "(Z)V", "selected", "setSelected", "", "text", "setText", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "toggleOnClick", "setToggleOnClick", "LOooooOO/Ooooo0o;", "color", "setAccentColor-Y2TPw74", "(LOooooOO/Ooooo0o;)V", "setAccentColor", "", "colorInt", "setAccentColorInt", "(I)V", "useDarkTheme", "setUseDarkTheme", "(Ljava/lang/Boolean;)V", "Lo0000Ooo/OooO0o0;", "minWidth", "setMinWidthDp-YLDhkOg", "(Lo0000Ooo/OooO0o0;)V", "setMinWidthDp", "maxWidth", "setMaxWidthDp-YLDhkOg", "setMaxWidthDp", "minWidthPx", "setMinWidthPx", "maxWidthPx", "setMaxWidthPx", "Lkotlin/Function3;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectionChangeListener", "(LoO0O000o/OooOOo0;)V", "<set-?>", "OooOo0o", "LOooo0oO/o00oO0O;", "getTextState", "setTextState", "textState", "OooOo", "getSelectedState", "()Z", "setSelectedState", "selectedState", "OooOoO0", "getEnabledState", "setEnabledState", "enabledState", "OooOoO", "getUseDarkThemeState", "()Ljava/lang/Boolean;", "setUseDarkThemeState", "useDarkThemeState", "OooOoOO", "getToggleOnClickState", "setToggleOnClickState", "toggleOnClickState", "OooOoo0", "getAccentColorState-QN2ZGVo", "()LOooooOO/Ooooo0o;", "setAccentColorState-Y2TPw74", "accentColorState", "", "OooOoo", "getMinWidthPxState", "()Ljava/lang/Float;", "setMinWidthPxState", "(Ljava/lang/Float;)V", "minWidthPxState", "OooOooO", "getMaxWidthPxState", "setMaxWidthPxState", "maxWidthPxState", "OooOooo", "getShouldFillMaxWidthState", "setShouldFillMaxWidthState", "shouldFillMaxWidthState", "OooO00o", "ni-ui-components_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SelectableTextButtonView extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69484OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69485OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69486OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69487OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69488OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69489OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69490OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69491OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69492OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public InterfaceC32510OooOOo0<? super SelectableTextButtonView, ? super Boolean, ? super Boolean, C32460OooOooO> f69493Oooo000;

    public static final class OooO00o implements InterfaceC26230OooO0o0 {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f69494OooOo0o;

        public OooO00o(long j) {
            this.f69494OooOo0o = j;
        }

        @Override // o0O0ooo.InterfaceC26230OooO0o0
        public final long OooO00o(InterfaceC21033OooOOOO interfaceC21033OooOOOO) {
            interfaceC21033OooOOOO.OooOo00(-267869331);
            interfaceC21033OooOOOO.OooOoo();
            return this.f69494OooOo0o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableTextButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        ComposeView composeView = new ComposeView(context);
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f69485OooOo0o = C21105o000OoO.OooO0OO("Selectable Text", o000o0o02);
        Boolean bool = Boolean.FALSE;
        this.f69484OooOo = C21105o000OoO.OooO0OO(bool, o000o0o02);
        this.f69487OooOoO0 = C21105o000OoO.OooO0OO(Boolean.valueOf(isEnabled()), o000o0o02);
        this.f69486OooOoO = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69488OooOoOO = C21105o000OoO.OooO0OO(Boolean.TRUE, o000o0o02);
        this.f69490OooOoo0 = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69489OooOoo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69491OooOooO = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69492OooOooo = C21105o000OoO.OooO0OO(bool, o000o0o02);
        setClickable(true);
        setFocusable(true);
        setClipChildren(false);
        setClipToPadding(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C26149OooO00o.f89229OooO0OO, 0, 0);
            OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = typedArrayObtainStyledAttributes.getString(4);
            setTextState(string != null ? string : "Selectable Text");
            setSelectedState(typedArrayObtainStyledAttributes.getBoolean(3, false));
            setToggleOnClickState(typedArrayObtainStyledAttributes.getBoolean(5, true));
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
                m80724setAccentColorStateY2TPw74(colorStateList != null ? new C21348Ooooo0o(C20496Oooo0o0.OooO0O0(colorStateList.getDefaultColor())) : null);
            }
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                setUseDarkThemeState(Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(6, false)));
            }
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                float dimension = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
                setMinWidthPxState(!Float.isNaN(dimension) ? Float.valueOf(dimension) : null);
            }
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                float dimension2 = typedArrayObtainStyledAttributes.getDimension(1, Float.NaN);
                setMaxWidthPxState(Float.isNaN(dimension2) ? null : Float.valueOf(dimension2));
            }
            typedArrayObtainStyledAttributes.recycle();
            super.setSelected(getSelectedState());
        }
        composeView.setViewCompositionStrategy(o000O000.OooO00o.f112848OooO00o);
        composeView.setContent(new C24633OooO00o(-1718231019, true, new com.orion.niui.components.button.OooO00o(this)));
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
    }

    public static final void OooO(SelectableTextButtonView selectableTextButtonView) {
        boolean z;
        if (selectableTextButtonView.getToggleOnClickState() && selectableTextButtonView.getSelectedState() != (!selectableTextButtonView.getSelectedState())) {
            selectableTextButtonView.setSelectedState(z);
            super.setSelected(z);
            InterfaceC32510OooOOo0<? super SelectableTextButtonView, ? super Boolean, ? super Boolean, C32460OooOooO> interfaceC32510OooOOo0 = selectableTextButtonView.f69493Oooo000;
            if (interfaceC32510OooOOo0 != null) {
                interfaceC32510OooOOo0.invoke(selectableTextButtonView, Boolean.valueOf(z), Boolean.TRUE);
            }
        }
        selectableTextButtonView.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getAccentColorState-QN2ZGVo, reason: not valid java name */
    public final C21348Ooooo0o m80723getAccentColorStateQN2ZGVo() {
        return (C21348Ooooo0o) this.f69490OooOoo0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabledState() {
        return ((Boolean) this.f69487OooOoO0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Float getMaxWidthPxState() {
        return (Float) this.f69491OooOooO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Float getMinWidthPxState() {
        return (Float) this.f69489OooOoo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSelectedState() {
        return ((Boolean) this.f69484OooOo.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShouldFillMaxWidthState() {
        return ((Boolean) this.f69492OooOooo.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getTextState() {
        return (String) this.f69485OooOo0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getToggleOnClickState() {
        return ((Boolean) this.f69488OooOoOO.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getUseDarkThemeState() {
        return (Boolean) this.f69486OooOoO.getValue();
    }

    /* JADX INFO: renamed from: setAccentColorState-Y2TPw74, reason: not valid java name */
    private final void m80724setAccentColorStateY2TPw74(C21348Ooooo0o c21348Ooooo0o) {
        this.f69490OooOoo0.setValue(c21348Ooooo0o);
    }

    private final void setEnabledState(boolean z) {
        this.f69487OooOoO0.setValue(Boolean.valueOf(z));
    }

    private final void setMaxWidthPxState(Float f) {
        this.f69491OooOooO.setValue(f);
    }

    private final void setMinWidthPxState(Float f) {
        this.f69489OooOoo.setValue(f);
    }

    private final void setSelectedState(boolean z) {
        this.f69484OooOo.setValue(Boolean.valueOf(z));
    }

    private final void setShouldFillMaxWidthState(boolean z) {
        this.f69492OooOooo.setValue(Boolean.valueOf(z));
    }

    private final void setTextState(String str) {
        this.f69485OooOo0o.setValue(str);
    }

    private final void setToggleOnClickState(boolean z) {
        this.f69488OooOoOO.setValue(Boolean.valueOf(z));
    }

    private final void setUseDarkThemeState(Boolean bool) {
        this.f69486OooOoO.setValue(bool);
    }

    public final String getText() {
        return getTextState();
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return getSelectedState();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setShouldFillMaxWidthState(View.MeasureSpec.getMode(i) == 1073741824 && getMaxWidthPxState() == null);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: setAccentColor-Y2TPw74, reason: not valid java name */
    public final void m80725setAccentColorY2TPw74(C21348Ooooo0o color) {
        m80724setAccentColorStateY2TPw74(color);
    }

    public final void setAccentColorInt(int colorInt) {
        m80724setAccentColorStateY2TPw74(new C21348Ooooo0o(C20496Oooo0o0.OooO0O0(colorInt)));
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setEnabledState(enabled);
    }

    /* JADX INFO: renamed from: setMaxWidthDp-YLDhkOg, reason: not valid java name */
    public final void m80726setMaxWidthDpYLDhkOg(C24232OooO0o0 maxWidth) {
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
    public final void m80727setMinWidthDpYLDhkOg(C24232OooO0o0 minWidth) {
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

    public final void setOnSelectionChangeListener(InterfaceC32510OooOOo0<? super SelectableTextButtonView, ? super Boolean, ? super Boolean, C32460OooOooO> listener) {
        this.f69493Oooo000 = listener;
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        if (getSelectedState() == selected) {
            return;
        }
        setSelectedState(selected);
        super.setSelected(selected);
        InterfaceC32510OooOOo0<? super SelectableTextButtonView, ? super Boolean, ? super Boolean, C32460OooOooO> interfaceC32510OooOOo0 = this.f69493Oooo000;
        if (interfaceC32510OooOOo0 != null) {
            interfaceC32510OooOOo0.invoke(this, Boolean.valueOf(selected), Boolean.FALSE);
        }
    }

    public final void setText(String text) {
        OooOOO0.OooO0oO(text, "text");
        setTextState(text);
    }

    public final void setToggleOnClick(boolean toggleOnClick) {
        setToggleOnClickState(toggleOnClick);
    }

    public final void setUseDarkTheme(Boolean useDarkTheme) {
        setUseDarkThemeState(useDarkTheme);
    }
}
