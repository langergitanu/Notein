package com.orion.niui.components.dropdown;

import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oOoO.C24633OooO00o;
import o0O0oOoO.C26149OooO00o;
import o0O0oo0.C26209OooOo0;
import o0O0oo0.OooOOOO;
import o0ooOO0.o000O000;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u00042\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR7\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000bR/\u0010%\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u000fR/\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u000fR+\u0010.\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0006R+\u00102\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010,\"\u0004\b1\u0010\u0006R/\u00107\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u0016¨\u00068"}, m80612d2 = {"Lcom/orion/niui/components/dropdown/SingleSelectDropdownView;", "Landroid/widget/FrameLayout;", "", "enabled", "LoO00ooO/OooOooO;", "setEnabled", "(Z)V", "", "Lo0O0oo0/OooOOOO;", "options", "setOptions", "(Ljava/util/List;)V", "", "optionId", "setSelectedOptionId", "(Ljava/lang/String;)V", "getSelectedOptionId", "()Ljava/lang/String;", "placeholder", "setPlaceholder", "useDarkTheme", "setUseDarkTheme", "(Ljava/lang/Boolean;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnOptionSelectedListener", "(LoO0O000o/OooOO0o;)V", "<set-?>", "OooOo0o", "LOooo0oO/o00oO0O;", "getOptionsState", "()Ljava/util/List;", "setOptionsState", "optionsState", "OooOo", "getSelectedIdState", "setSelectedIdState", "selectedIdState", "OooOoO0", "getPlaceholderState", "setPlaceholderState", "placeholderState", "OooOoO", "getEnabledState", "()Z", "setEnabledState", "enabledState", "OooOoOO", "getExpandedState", "setExpandedState", "expandedState", "OooOoo0", "getUseDarkThemeState", "()Ljava/lang/Boolean;", "setUseDarkThemeState", "useDarkThemeState", "ni-ui-components_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SingleSelectDropdownView extends FrameLayout {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final List<OooOOOO> f69510OooOooO = C34429OooOOo0.OooOO0o(new OooOOOO("default_1", "Option 1"), new OooOOOO("default_2", "Option 2"));

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69511OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69512OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69513OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69514OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69515OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super OooOOOO, C32460OooOooO> f69516OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69517OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleSelectDropdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        ComposeView composeView = new ComposeView(context);
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f69512OooOo0o = C21105o000OoO.OooO0OO(f69510OooOooO, o000o0o02);
        this.f69511OooOo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69514OooOoO0 = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69513OooOoO = C21105o000OoO.OooO0OO(Boolean.valueOf(isEnabled()), o000o0o02);
        this.f69515OooOoOO = C21105o000OoO.OooO0OO(Boolean.FALSE, o000o0o02);
        this.f69517OooOoo0 = C21105o000OoO.OooO0OO(null, o000o0o02);
        setClickable(true);
        setFocusable(true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C26149OooO00o.f89230OooO0Oo, 0, 0);
            OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setPlaceholderState(typedArrayObtainStyledAttributes.getString(0));
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                setUseDarkThemeState(Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(1, false)));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        composeView.setViewCompositionStrategy(o000O000.OooO00o.f112848OooO00o);
        composeView.setContent(new C24633OooO00o(-1985715178, true, new C26209OooOo0(this)));
        addView(composeView, new FrameLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabledState() {
        return ((Boolean) this.f69513OooOoO.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getExpandedState() {
        return ((Boolean) this.f69515OooOoOO.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OooOOOO> getOptionsState() {
        return (List) this.f69512OooOo0o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getPlaceholderState() {
        return (String) this.f69514OooOoO0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getSelectedIdState() {
        return (String) this.f69511OooOo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getUseDarkThemeState() {
        return (Boolean) this.f69517OooOoo0.getValue();
    }

    private final void setEnabledState(boolean z) {
        this.f69513OooOoO.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setExpandedState(boolean z) {
        this.f69515OooOoOO.setValue(Boolean.valueOf(z));
    }

    private final void setOptionsState(List<OooOOOO> list) {
        this.f69512OooOo0o.setValue(list);
    }

    private final void setPlaceholderState(String str) {
        this.f69514OooOoO0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedIdState(String str) {
        this.f69511OooOo.setValue(str);
    }

    private final void setUseDarkThemeState(Boolean bool) {
        this.f69517OooOoo0.setValue(bool);
    }

    public final void OooO() {
        setExpandedState(true);
    }

    public final String getSelectedOptionId() {
        return getSelectedIdState();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setEnabledState(enabled);
    }

    public final void setOnOptionSelectedListener(InterfaceC32507OooOO0o<? super OooOOOO, C32460OooOooO> listener) {
        this.f69516OooOoo = listener;
    }

    public final void setOptions(List<OooOOOO> options) {
        OooOOO0.OooO0oO(options, "options");
        setOptionsState(options);
        List<OooOOOO> list = options;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (OooOOO0.OooO0O0(((OooOOOO) it.next()).f89518OooO00o, getSelectedIdState())) {
                    return;
                }
            }
        }
        setSelectedIdState(null);
    }

    public final void setPlaceholder(String placeholder) {
        setPlaceholderState(placeholder);
    }

    public final void setSelectedOptionId(String optionId) {
        setSelectedIdState(optionId);
    }

    public final void setUseDarkTheme(Boolean useDarkTheme) {
        setUseDarkThemeState(useDarkTheme);
    }
}
