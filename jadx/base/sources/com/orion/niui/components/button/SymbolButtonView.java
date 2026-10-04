package com.orion.niui.components.button;

import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oOoO.C24633OooO00o;
import o0O0oOoO.C26149OooO00o;
import o0O0oOoo.C26183OoooO00;
import o0O0oOoo.EnumC26180Oooo0oo;
import o0ooOO0.o000O000;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017R+\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0010R/\u0010#\u001a\u0004\u0018\u00010\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0014R+\u0010'\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\nR+\u0010,\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0006R/\u00101\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0017¨\u00062"}, m80612d2 = {"Lcom/orion/niui/components/button/SymbolButtonView;", "Landroid/widget/FrameLayout;", "", "enabled", "LoO00ooO/OooOooO;", "setEnabled", "(Z)V", "Lo0O0oOoo/Oooo0oo;", "variant", "setVariant", "(Lo0O0oOoo/Oooo0oo;)V", "getVariant", "()Lo0O0oOoo/Oooo0oo;", "", "iconRes", "setIcon", "(I)V", "", "description", "setSymbolContentDescription", "(Ljava/lang/String;)V", "useDarkTheme", "setUseDarkTheme", "(Ljava/lang/Boolean;)V", "<set-?>", "OooOo0o", "LOooo0oO/o00oO0O;", "getIconResState", "()I", "setIconResState", "iconResState", "OooOo", "getContentDescriptionState", "()Ljava/lang/String;", "setContentDescriptionState", "contentDescriptionState", "OooOoO0", "getVariantState", "setVariantState", "variantState", "OooOoO", "getEnabledState", "()Z", "setEnabledState", "enabledState", "OooOoOO", "getUseDarkThemeState", "()Ljava/lang/Boolean;", "setUseDarkThemeState", "useDarkThemeState", "ni-ui-components_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SymbolButtonView extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69495OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69496OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69497OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69498OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69499OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SymbolButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        ComposeView composeView = new ComposeView(context);
        int i = R.drawable.ni_symbol_settings_outline;
        Integer numValueOf = Integer.valueOf(R.drawable.ni_symbol_settings_outline);
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f69496OooOo0o = C21105o000OoO.OooO0OO(numValueOf, o000o0o02);
        this.f69495OooOo = C21105o000OoO.OooO0OO(null, o000o0o02);
        EnumC26180Oooo0oo enumC26180Oooo0oo = EnumC26180Oooo0oo.f89372OooOo;
        this.f69498OooOoO0 = C21105o000OoO.OooO0OO(enumC26180Oooo0oo, o000o0o02);
        this.f69497OooOoO = C21105o000OoO.OooO0OO(Boolean.valueOf(isEnabled()), o000o0o02);
        this.f69499OooOoOO = C21105o000OoO.OooO0OO(null, o000o0o02);
        setClickable(true);
        setFocusable(true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C26149OooO00o.f89231OooO0o, 0, 0);
            OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, R.drawable.ni_symbol_settings_outline);
            Integer numValueOf2 = resourceId != 0 ? Integer.valueOf(resourceId) : null;
            setIconResState(numValueOf2 != null ? numValueOf2.intValue() : i);
            setContentDescriptionState(typedArrayObtainStyledAttributes.getString(0));
            int i2 = typedArrayObtainStyledAttributes.getInt(3, 0);
            if (i2 == 1) {
                enumC26180Oooo0oo = EnumC26180Oooo0oo.f89373OooOo0o;
            } else if (i2 == 2) {
                enumC26180Oooo0oo = EnumC26180Oooo0oo.f89375OooOoO0;
            }
            setVariantState(enumC26180Oooo0oo);
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                setUseDarkThemeState(Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(2, false)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        composeView.setViewCompositionStrategy(o000O000.OooO00o.f112848OooO00o);
        composeView.setContent(new C24633OooO00o(1374544437, true, new C26183OoooO00(this)));
        addView(composeView, new FrameLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getContentDescriptionState() {
        return (String) this.f69495OooOo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabledState() {
        return ((Boolean) this.f69497OooOoO.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getIconResState() {
        return ((Number) this.f69496OooOo0o.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getUseDarkThemeState() {
        return (Boolean) this.f69499OooOoOO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC26180Oooo0oo getVariantState() {
        return (EnumC26180Oooo0oo) this.f69498OooOoO0.getValue();
    }

    private final void setContentDescriptionState(String str) {
        this.f69495OooOo.setValue(str);
    }

    private final void setEnabledState(boolean z) {
        this.f69497OooOoO.setValue(Boolean.valueOf(z));
    }

    private final void setIconResState(int i) {
        this.f69496OooOo0o.setValue(Integer.valueOf(i));
    }

    private final void setUseDarkThemeState(Boolean bool) {
        this.f69499OooOoOO.setValue(bool);
    }

    private final void setVariantState(EnumC26180Oooo0oo enumC26180Oooo0oo) {
        this.f69498OooOoO0.setValue(enumC26180Oooo0oo);
    }

    public final EnumC26180Oooo0oo getVariant() {
        return getVariantState();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setEnabledState(enabled);
    }

    public final void setIcon(int iconRes) {
        setIconResState(iconRes);
    }

    public final void setSymbolContentDescription(String description) {
        setContentDescriptionState(description);
    }

    public final void setUseDarkTheme(Boolean useDarkTheme) {
        setUseDarkThemeState(useDarkTheme);
    }

    public final void setVariant(EnumC26180Oooo0oo variant) {
        OooOOO0.OooO0oO(variant, "variant");
        setVariantState(variant);
    }
}
