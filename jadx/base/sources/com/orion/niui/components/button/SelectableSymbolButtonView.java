package com.orion.niui.components.button;

import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oOoO.C24633OooO00o;
import o0O0oOoO.C26149OooO00o;
import o0O0oOoo.C26162OooOo0;
import o0O0oOoo.C26164OooOo0o;
import o0O0oOoo.EnumC26161OooOOoo;
import o0O0oOoo.OooO;
import o0ooOO0.o000O000;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J/\u0010$\u001a\u00020\u00042 \u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010'R+\u0010.\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u001aR/\u00103\u001a\u0004\u0018\u00010\u001b2\b\u0010(\u001a\u0004\u0018\u00010\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u001eR+\u00108\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u0010R+\u0010=\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010*\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\u0014R+\u0010B\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010*\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0006R+\u0010F\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010*\u001a\u0004\bD\u0010@\"\u0004\bE\u0010\u0006R/\u0010K\u001a\u0004\u0018\u00010\u00022\b\u0010(\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010*\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010!R+\u0010O\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010*\u001a\u0004\bM\u0010@\"\u0004\bN\u0010\u0006¨\u0006P"}, m80612d2 = {"Lcom/orion/niui/components/button/SelectableSymbolButtonView;", "Landroid/widget/FrameLayout;", "", "enabled", "LoO00ooO/OooOooO;", "setEnabled", "(Z)V", "selected", "setSelected", "Lo0O0oOoo/OooOo0;", "variant", "setVariant", "(Lo0O0oOoo/OooOo0;)V", "Lo0O0oOoo/OooO;", "baseStyle", "setBaseStyle", "(Lo0O0oOoo/OooO;)V", "Lo0O0oOoo/OooOOoo;", "selectionStyle", "setSelectionStyle", "(Lo0O0oOoo/OooOOoo;)V", "toggleOnClick", "setToggleOnClick", "", "iconRes", "setIcon", "(I)V", "", "description", "setContentDescriptionText", "(Ljava/lang/String;)V", "useDarkTheme", "setUseDarkTheme", "(Ljava/lang/Boolean;)V", "Lkotlin/Function3;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectionChangeListener", "(LoO0O000o/OooOOo0;)V", "getVariant", "()Lo0O0oOoo/OooOo0;", "<set-?>", "OooOo0o", "LOooo0oO/o00oO0O;", "getIconResState", "()I", "setIconResState", "iconResState", "OooOo", "getContentDescriptionState", "()Ljava/lang/String;", "setContentDescriptionState", "contentDescriptionState", "OooOoO0", "getBaseStyleState", "()Lo0O0oOoo/OooO;", "setBaseStyleState", "baseStyleState", "OooOoO", "getSelectionStyleState", "()Lo0O0oOoo/OooOOoo;", "setSelectionStyleState", "selectionStyleState", "OooOoOO", "getSelectedState", "()Z", "setSelectedState", "selectedState", "OooOoo0", "getEnabledState", "setEnabledState", "enabledState", "OooOoo", "getUseDarkThemeState", "()Ljava/lang/Boolean;", "setUseDarkThemeState", "useDarkThemeState", "OooOooO", "getToggleOnClickState", "setToggleOnClickState", "toggleOnClickState", "ni-ui-components_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SelectableSymbolButtonView extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69465OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69466OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69467OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69468OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69469OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69470OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69471OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69472OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public InterfaceC32510OooOOo0<? super SelectableSymbolButtonView, ? super Boolean, ? super Boolean, C32460OooOooO> f69473OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableSymbolButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        ComposeView composeView = new ComposeView(context);
        int i = R.drawable.ni_symbol_settings_outline;
        Integer numValueOf = Integer.valueOf(R.drawable.ni_symbol_settings_outline);
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f69466OooOo0o = C21105o000OoO.OooO0OO(numValueOf, o000o0o02);
        this.f69465OooOo = C21105o000OoO.OooO0OO(null, o000o0o02);
        OooO oooO = OooO.f89235OooOo0o;
        this.f69468OooOoO0 = C21105o000OoO.OooO0OO(oooO, o000o0o02);
        EnumC26161OooOOoo enumC26161OooOOoo = EnumC26161OooOOoo.f89287OooOo0o;
        this.f69467OooOoO = C21105o000OoO.OooO0OO(enumC26161OooOOoo, o000o0o02);
        this.f69469OooOoOO = C21105o000OoO.OooO0OO(Boolean.FALSE, o000o0o02);
        this.f69471OooOoo0 = C21105o000OoO.OooO0OO(Boolean.valueOf(isEnabled()), o000o0o02);
        this.f69470OooOoo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69472OooOooO = C21105o000OoO.OooO0OO(Boolean.TRUE, o000o0o02);
        setClickable(true);
        setFocusable(true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C26149OooO00o.f89228OooO0O0, 0, 0);
            OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.ni_symbol_settings_outline);
            Integer numValueOf2 = resourceId != 0 ? Integer.valueOf(resourceId) : null;
            setIconResState(numValueOf2 != null ? numValueOf2.intValue() : i);
            setContentDescriptionState(typedArrayObtainStyledAttributes.getString(1));
            setBaseStyleState(typedArrayObtainStyledAttributes.getInt(0, 0) == 1 ? OooO.f89234OooOo : oooO);
            setSelectionStyleState(typedArrayObtainStyledAttributes.getInt(4, 0) == 1 ? EnumC26161OooOOoo.f89286OooOo : enumC26161OooOOoo);
            setSelectedState(typedArrayObtainStyledAttributes.getBoolean(3, false));
            setToggleOnClickState(typedArrayObtainStyledAttributes.getBoolean(5, true));
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                setUseDarkThemeState(Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(6, false)));
            }
            typedArrayObtainStyledAttributes.recycle();
            super.setSelected(getSelectedState());
        }
        composeView.setViewCompositionStrategy(o000O000.OooO00o.f112848OooO00o);
        composeView.setContent(new C24633OooO00o(394224373, true, new C26164OooOo0o(this)));
        addView(composeView, new FrameLayout.LayoutParams(-2, -2));
    }

    public static final void OooO0oo(SelectableSymbolButtonView selectableSymbolButtonView) {
        boolean z;
        if (selectableSymbolButtonView.getToggleOnClickState() && selectableSymbolButtonView.getSelectedState() != (!selectableSymbolButtonView.getSelectedState())) {
            selectableSymbolButtonView.setSelectedState(z);
            super.setSelected(z);
            InterfaceC32510OooOOo0<? super SelectableSymbolButtonView, ? super Boolean, ? super Boolean, C32460OooOooO> interfaceC32510OooOOo0 = selectableSymbolButtonView.f69473OooOooo;
            if (interfaceC32510OooOOo0 != null) {
                interfaceC32510OooOOo0.invoke(selectableSymbolButtonView, Boolean.valueOf(z), Boolean.TRUE);
            }
        }
        selectableSymbolButtonView.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final OooO getBaseStyleState() {
        return (OooO) this.f69468OooOoO0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getContentDescriptionState() {
        return (String) this.f69465OooOo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabledState() {
        return ((Boolean) this.f69471OooOoo0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getIconResState() {
        return ((Number) this.f69466OooOo0o.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getSelectedState() {
        return ((Boolean) this.f69469OooOoOO.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC26161OooOOoo getSelectionStyleState() {
        return (EnumC26161OooOOoo) this.f69467OooOoO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getToggleOnClickState() {
        return ((Boolean) this.f69472OooOooO.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getUseDarkThemeState() {
        return (Boolean) this.f69470OooOoo.getValue();
    }

    private final void setBaseStyleState(OooO oooO) {
        this.f69468OooOoO0.setValue(oooO);
    }

    private final void setContentDescriptionState(String str) {
        this.f69465OooOo.setValue(str);
    }

    private final void setEnabledState(boolean z) {
        this.f69471OooOoo0.setValue(Boolean.valueOf(z));
    }

    private final void setIconResState(int i) {
        this.f69466OooOo0o.setValue(Integer.valueOf(i));
    }

    private final void setSelectedState(boolean z) {
        this.f69469OooOoOO.setValue(Boolean.valueOf(z));
    }

    private final void setSelectionStyleState(EnumC26161OooOOoo enumC26161OooOOoo) {
        this.f69467OooOoO.setValue(enumC26161OooOOoo);
    }

    private final void setToggleOnClickState(boolean z) {
        this.f69472OooOooO.setValue(Boolean.valueOf(z));
    }

    private final void setUseDarkThemeState(Boolean bool) {
        this.f69470OooOoo.setValue(bool);
    }

    public final C26162OooOo0 getVariant() {
        return new C26162OooOo0(getBaseStyleState(), getSelectionStyleState());
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return getSelectedState();
    }

    public final void setBaseStyle(OooO baseStyle) {
        OooOOO0.OooO0oO(baseStyle, "baseStyle");
        setBaseStyleState(baseStyle);
    }

    public final void setContentDescriptionText(String description) {
        setContentDescriptionState(description);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setEnabledState(enabled);
    }

    public final void setIcon(int iconRes) {
        setIconResState(iconRes);
    }

    public final void setOnSelectionChangeListener(InterfaceC32510OooOOo0<? super SelectableSymbolButtonView, ? super Boolean, ? super Boolean, C32460OooOooO> listener) {
        this.f69473OooOooo = listener;
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        if (getSelectedState() == selected) {
            return;
        }
        setSelectedState(selected);
        super.setSelected(selected);
        InterfaceC32510OooOOo0<? super SelectableSymbolButtonView, ? super Boolean, ? super Boolean, C32460OooOooO> interfaceC32510OooOOo0 = this.f69473OooOooo;
        if (interfaceC32510OooOOo0 != null) {
            interfaceC32510OooOOo0.invoke(this, Boolean.valueOf(selected), Boolean.FALSE);
        }
    }

    public final void setSelectionStyle(EnumC26161OooOOoo selectionStyle) {
        OooOOO0.OooO0oO(selectionStyle, "selectionStyle");
        setSelectionStyleState(selectionStyle);
    }

    public final void setToggleOnClick(boolean toggleOnClick) {
        setToggleOnClickState(toggleOnClick);
    }

    public final void setUseDarkTheme(Boolean useDarkTheme) {
        setUseDarkThemeState(useDarkTheme);
    }

    public final void setVariant(C26162OooOo0 variant) {
        OooOOO0.OooO0oO(variant, "variant");
        setBaseStyleState(variant.f89295OooO00o);
        setSelectionStyleState(variant.f89296OooO0O0);
    }
}
