package com.orion.niui.components.listitems;

import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oOoO.C24633OooO00o;
import o0O0oOoO.C26149OooO00o;
import o0O0oo.OooO0o;
import o0ooOO0.o000O000;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00042\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u00020\u00042 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR+\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010+\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0014R+\u0010/\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b-\u0010)\"\u0004\b.\u0010\u0014R/\u00104\u001a\u0004\u0018\u00010\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010!\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0019R/\u00108\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010!\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%R/\u0010=\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010!\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\u000fR/\u0010A\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010!\u001a\u0004\b?\u0010#\"\u0004\b@\u0010%R+\u0010E\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010!\u001a\u0004\bC\u0010)\"\u0004\bD\u0010\u0014¨\u0006F"}, m80612d2 = {"Lcom/orion/niui/components/listitems/SwitchListItemView;", "Landroid/widget/FrameLayout;", "", NoteMeta.PROPERTY_TITLE, "LoO00ooO/OooOooO;", "setTitle", "(Ljava/lang/CharSequence;)V", "", "titleRes", "(I)V", "description", "setDescription", "descriptionRes", "iconRes", "setIcon", "(Ljava/lang/Integer;)V", "setIconContentDescription", "", "checked", "setChecked", "(Z)V", "enabled", "setEnabled", "useDarkTheme", "setUseDarkTheme", "(Ljava/lang/Boolean;)V", "Lkotlin/Function3;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckedChangeListener", "(LoO0O000o/OooOOo0;)V", "", "<set-?>", "OooOo0o", "LOooo0oO/o00oO0O;", "getTitleState", "()Ljava/lang/String;", "setTitleState", "(Ljava/lang/String;)V", "titleState", "OooOo", "getCheckedState", "()Z", "setCheckedState", "checkedState", "OooOoO0", "getEnabledState", "setEnabledState", "enabledState", "OooOoO", "getUseDarkThemeState", "()Ljava/lang/Boolean;", "setUseDarkThemeState", "useDarkThemeState", "OooOoOO", "getDescriptionState", "setDescriptionState", "descriptionState", "OooOoo0", "getIconResState", "()Ljava/lang/Integer;", "setIconResState", "iconResState", "OooOoo", "getIconContentDescriptionState", "setIconContentDescriptionState", "iconContentDescriptionState", "OooOooO", "getToggleableState", "setToggleableState", "toggleableState", "ni-ui-components_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SwitchListItemView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final /* synthetic */ int f69518Oooo000 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69519OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69520OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69521OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69522OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69523OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69524OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69525OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69526OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public InterfaceC32510OooOOo0<? super SwitchListItemView, ? super Boolean, ? super Boolean, C32460OooOooO> f69527OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        ComposeView composeView = new ComposeView(context);
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f69520OooOo0o = C21105o000OoO.OooO0OO("", o000o0o02);
        Boolean bool = Boolean.FALSE;
        this.f69519OooOo = C21105o000OoO.OooO0OO(bool, o000o0o02);
        this.f69522OooOoO0 = C21105o000OoO.OooO0OO(Boolean.valueOf(isEnabled()), o000o0o02);
        this.f69521OooOoO = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69523OooOoOO = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69525OooOoo0 = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69524OooOoo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69526OooOooO = C21105o000OoO.OooO0OO(bool, o000o0o02);
        setSaveEnabled(false);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C26149OooO00o.f89232OooO0o0, 0, 0);
            OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = typedArrayObtainStyledAttributes.getString(5);
            setTitleState(string != null ? string : "");
            setCheckedState(typedArrayObtainStyledAttributes.getBoolean(0, false));
            setDescriptionState(typedArrayObtainStyledAttributes.getString(1));
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
            setIconResState(resourceId != 0 ? Integer.valueOf(resourceId) : null);
            setIconContentDescriptionState(typedArrayObtainStyledAttributes.getString(4));
            if (typedArrayObtainStyledAttributes.hasValue(2)) {
                setEnabledState(typedArrayObtainStyledAttributes.getBoolean(2, true));
            }
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                setUseDarkThemeState(Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(6, false)));
            }
            typedArrayObtainStyledAttributes.recycle();
            super.setEnabled(getEnabledState());
        }
        composeView.setViewCompositionStrategy(o000O000.OooO00o.f112848OooO00o);
        composeView.setContent(new C24633OooO00o(595160685, true, new OooO0o(this)));
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getCheckedState() {
        return ((Boolean) this.f69519OooOo.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getDescriptionState() {
        return (String) this.f69523OooOoOO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabledState() {
        return ((Boolean) this.f69522OooOoO0.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getIconContentDescriptionState() {
        return (String) this.f69524OooOoo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getIconResState() {
        return (Integer) this.f69525OooOoo0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getTitleState() {
        return (String) this.f69520OooOo0o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getToggleableState() {
        return ((Boolean) this.f69526OooOooO.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getUseDarkThemeState() {
        return (Boolean) this.f69521OooOoO.getValue();
    }

    private final void setCheckedState(boolean z) {
        this.f69519OooOo.setValue(Boolean.valueOf(z));
    }

    private final void setDescriptionState(String str) {
        this.f69523OooOoOO.setValue(str);
    }

    private final void setEnabledState(boolean z) {
        this.f69522OooOoO0.setValue(Boolean.valueOf(z));
    }

    private final void setIconContentDescriptionState(String str) {
        this.f69524OooOoo.setValue(str);
    }

    private final void setIconResState(Integer num) {
        this.f69525OooOoo0.setValue(num);
    }

    private final void setTitleState(String str) {
        this.f69520OooOo0o.setValue(str);
    }

    private final void setToggleableState(boolean z) {
        this.f69526OooOooO.setValue(Boolean.valueOf(z));
    }

    private final void setUseDarkThemeState(Boolean bool) {
        this.f69521OooOoO.setValue(bool);
    }

    public final boolean OooO() {
        return getCheckedState();
    }

    public final void OooOO0(boolean z, boolean z2) {
        InterfaceC32510OooOOo0<? super SwitchListItemView, ? super Boolean, ? super Boolean, C32460OooOooO> interfaceC32510OooOOo0;
        if (getCheckedState() == z) {
            return;
        }
        setCheckedState(z);
        if (!z2 || (interfaceC32510OooOOo0 = this.f69527OooOooo) == null) {
            return;
        }
        interfaceC32510OooOOo0.invoke(this, Boolean.valueOf(z), Boolean.TRUE);
    }

    public final void setChecked(boolean checked) {
        OooOO0(checked, false);
    }

    public final void setDescription(CharSequence description) {
        setDescriptionState(description != null ? description.toString() : null);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setEnabledState(enabled);
    }

    public final void setIcon(Integer iconRes) {
        setIconResState(iconRes);
    }

    public final void setIconContentDescription(CharSequence description) {
        setIconContentDescriptionState(description != null ? description.toString() : null);
    }

    public final void setOnCheckedChangeListener(InterfaceC32510OooOOo0<? super SwitchListItemView, ? super Boolean, ? super Boolean, C32460OooOooO> listener) {
        this.f69527OooOooo = listener;
        setToggleableState(listener != null);
        setClickable(false);
        setFocusable(false);
    }

    public final void setTitle(CharSequence title) {
        OooOOO0.OooO0oO(title, "title");
        setTitleState(title.toString());
    }

    public final void setUseDarkTheme(Boolean useDarkTheme) {
        setUseDarkThemeState(useDarkTheme);
    }

    public final void setDescription(int descriptionRes) {
        setDescriptionState(getContext().getString(descriptionRes));
    }

    public final void setIconContentDescription(int descriptionRes) {
        setIconContentDescriptionState(getContext().getString(descriptionRes));
    }

    public final void setTitle(int titleRes) {
        setTitleState(getContext().getString(titleRes));
    }
}
