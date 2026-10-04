package com.orion.niui.components.textinput;

import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oOoO.C24633OooO00o;
import o0O0oOoO.C26149OooO00o;
import o0O0ooo0.C26250OooOo0o;
import o0O0ooo0.EnumC26248OooOo0;
import o0O0ooo0.OooOo00;
import o0ooOO0.o000O000;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.OooO00o;
import oO0o0O0o.C33600OooOo0o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b6\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u0006J\u0017\u0010\u001a\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u001d\u0010\u001d\u001a\u00020\u00042\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\u00042\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00042\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b¢\u0006\u0004\b\"\u0010\u001eJ#\u0010$\u001a\u00020\u00042\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f¢\u0006\u0004\b$\u0010!J\u0017\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020#H\u0016¢\u0006\u0004\b-\u0010.R/\u00105\u001a\u0004\u0018\u00010\u00152\b\u0010/\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u00104R+\u00109\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u00104R/\u0010=\u001a\u0004\u0018\u00010\u00152\b\u0010/\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u00101\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u00104R+\u0010B\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00101\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\fR+\u0010F\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u00101\u001a\u0004\bD\u0010\u0012\"\u0004\bE\u0010\u0010R/\u0010J\u001a\u0004\u0018\u00010\u00152\b\u0010/\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u00101\u001a\u0004\bH\u0010\u0017\"\u0004\bI\u00104R/\u0010N\u001a\u0004\u0018\u00010\u00152\b\u0010/\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u00101\u001a\u0004\bL\u0010\u0017\"\u0004\bM\u00104R;\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bO\u00101\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010\u001eR/\u0010X\u001a\u0004\u0018\u00010#2\b\u0010/\u001a\u0004\u0018\u00010#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bT\u00101\u001a\u0004\bU\u0010V\"\u0004\bW\u0010'R/\u0010]\u001a\u0004\u0018\u00010(2\b\u0010/\u001a\u0004\u0018\u00010(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bY\u00101\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010+¨\u0006^"}, m80612d2 = {"Lcom/orion/niui/components/textinput/LabeledTextFieldView;", "Landroid/widget/FrameLayout;", "", Constants.ScionAnalytics.PARAM_LABEL, "LoO00ooO/OooOooO;", "setLabel", "(Ljava/lang/CharSequence;)V", "supportingText", "setSupportingText", "Lo0O0ooo0/OooOo00;", "mode", "setMode", "(Lo0O0ooo0/OooOo00;)V", "Lo0O0ooo0/OooOo0;", "state", "setState", "(Lo0O0ooo0/OooOo0;)V", "getState", "()Lo0O0ooo0/OooOo0;", "text", "setText", "", "getText", "()Ljava/lang/String;", "countryCode", "setCountryCode", "setTrailingText", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTrailingTextClickListener", "(LoO0O000o/OooO00o;)V", "Lkotlin/Function1;", "setOnValueChangeListener", "(LoO0O000o/OooOO0o;)V", "setOnCountryCodeClickListener", "", "setOnInputFocusChangeListener", "useDarkTheme", "setUseDarkTheme", "(Ljava/lang/Boolean;)V", "", "maxLength", "setMaxLength", "(Ljava/lang/Integer;)V", "enabled", "setEnabled", "(Z)V", "<set-?>", "OooOo0o", "LOooo0oO/o00oO0O;", "getLabelState", "setLabelState", "(Ljava/lang/String;)V", "labelState", "OooOo", "getValueState", "setValueState", "valueState", "OooOoO0", "getSupportingTextState", "setSupportingTextState", "supportingTextState", "OooOoO", "getModeState", "()Lo0O0ooo0/OooOo00;", "setModeState", "modeState", "OooOoOO", "getStateState", "setStateState", "stateState", "OooOoo0", "getCountryCodeState", "setCountryCodeState", "countryCodeState", "OooOoo", "getTrailingTextState", "setTrailingTextState", "trailingTextState", "OooOooO", "getTrailingTextClickListener", "()LoO0O000o/OooO00o;", "setTrailingTextClickListener", "trailingTextClickListener", "OooOooo", "getUseDarkThemeState", "()Ljava/lang/Boolean;", "setUseDarkThemeState", "useDarkThemeState", "Oooo000", "getMaxLengthState", "()Ljava/lang/Integer;", "setMaxLengthState", "maxLengthState", "ni-ui-components_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LabeledTextFieldView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f69528Oooo0O0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69529OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69530OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69531OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69532OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69533OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69534OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69535OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69536OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69537OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> f69538Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f69539Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super String, C32460OooOooO> f69540Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public OooO00o<C32460OooOooO> f69541Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabeledTextFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        ComposeView composeView = new ComposeView(context);
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        Integer num = null;
        this.f69530OooOo0o = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69529OooOo = C21105o000OoO.OooO0OO("", o000o0o02);
        this.f69532OooOoO0 = C21105o000OoO.OooO0OO(null, o000o0o02);
        OooOo00 oooOo00 = OooOo00.f89699OooOo0o;
        this.f69531OooOoO = C21105o000OoO.OooO0OO(oooOo00, o000o0o02);
        EnumC26248OooOo0 enumC26248OooOo0 = EnumC26248OooOo0.f89694OooOo0o;
        this.f69533OooOoOO = C21105o000OoO.OooO0OO(enumC26248OooOo0, o000o0o02);
        this.f69535OooOoo0 = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69534OooOoo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69536OooOooO = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69537OooOooo = C21105o000OoO.OooO0OO(null, o000o0o02);
        this.f69539Oooo000 = C21105o000OoO.OooO0OO(null, o000o0o02);
        setFocusable(true);
        setClickable(true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C26149OooO00o.f89227OooO00o, 0, 0);
            OooOOO0.OooO0o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setLabelState(typedArrayObtainStyledAttributes.getString(1));
            setSupportingTextState(typedArrayObtainStyledAttributes.getString(5));
            String string = typedArrayObtainStyledAttributes.getString(6);
            String str = string != null ? string : "";
            setTrailingTextState(typedArrayObtainStyledAttributes.getString(7));
            int i = typedArrayObtainStyledAttributes.getInt(3, 0);
            if (i == 1) {
                oooOo00 = OooOo00.f89698OooOo;
            } else if (i == 2) {
                oooOo00 = OooOo00.f89701OooOoO0;
            } else if (i == 3) {
                oooOo00 = OooOo00.f89700OooOoO;
            }
            setModeState(oooOo00);
            int i2 = typedArrayObtainStyledAttributes.getInt(4, 0);
            if (i2 == 1) {
                enumC26248OooOo0 = EnumC26248OooOo0.f89693OooOo;
            } else if (i2 == 2) {
                enumC26248OooOo0 = EnumC26248OooOo0.f89696OooOoO0;
            } else if (i2 == 3) {
                enumC26248OooOo0 = EnumC26248OooOo0.f89695OooOoO;
            }
            setStateState(enumC26248OooOo0);
            setCountryCodeState(typedArrayObtainStyledAttributes.getString(0));
            if (typedArrayObtainStyledAttributes.hasValue(8)) {
                setUseDarkThemeState(Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(8, false)));
            }
            TypedArray typedArray = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes : null;
            if (typedArray != null) {
                int i3 = typedArray.getInt(2, -1);
                Integer numValueOf = Integer.valueOf(i3);
                if (i3 > 0) {
                    num = numValueOf;
                }
            }
            setMaxLengthState(num);
            typedArrayObtainStyledAttributes.recycle();
            setValueState(OooOO0o(str));
            super.setEnabled(getStateState() != EnumC26248OooOo0.f89695OooOoO);
        }
        composeView.setViewCompositionStrategy(o000O000.OooO00o.f112848OooO00o);
        composeView.setContent(new C24633OooO00o(-179702520, true, new C26250OooOo0o(this)));
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getCountryCodeState() {
        return (String) this.f69535OooOoo0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getLabelState() {
        return (String) this.f69530OooOo0o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getMaxLengthState() {
        return (Integer) this.f69539Oooo000.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final OooOo00 getModeState() {
        return (OooOo00) this.f69531OooOoO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC26248OooOo0 getStateState() {
        return (EnumC26248OooOo0) this.f69533OooOoOO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getSupportingTextState() {
        return (String) this.f69532OooOoO0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OooO00o<C32460OooOooO> getTrailingTextClickListener() {
        return (OooO00o) this.f69536OooOooO.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getTrailingTextState() {
        return (String) this.f69534OooOoo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Boolean getUseDarkThemeState() {
        return (Boolean) this.f69537OooOooo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final String getValueState() {
        return (String) this.f69529OooOo.getValue();
    }

    private final void setCountryCodeState(String str) {
        this.f69535OooOoo0.setValue(str);
    }

    private final void setLabelState(String str) {
        this.f69530OooOo0o.setValue(str);
    }

    private final void setMaxLengthState(Integer num) {
        this.f69539Oooo000.setValue(num);
    }

    private final void setModeState(OooOo00 oooOo00) {
        this.f69531OooOoO.setValue(oooOo00);
    }

    private final void setStateState(EnumC26248OooOo0 enumC26248OooOo0) {
        this.f69533OooOoOO.setValue(enumC26248OooOo0);
    }

    private final void setSupportingTextState(String str) {
        this.f69532OooOoO0.setValue(str);
    }

    private final void setTrailingTextClickListener(OooO00o<C32460OooOooO> oooO00o) {
        this.f69536OooOooO.setValue(oooO00o);
    }

    private final void setTrailingTextState(String str) {
        this.f69534OooOoo.setValue(str);
    }

    private final void setUseDarkThemeState(Boolean bool) {
        this.f69537OooOooo.setValue(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValueState(String str) {
        this.f69529OooOo.setValue(str);
    }

    public final String OooOO0o(String str) {
        Integer maxLengthState = getMaxLengthState();
        return (maxLengthState == null || maxLengthState.intValue() <= 0) ? str : C33600OooOo0o.o0OoOo0(maxLengthState.intValue(), str);
    }

    public final EnumC26248OooOo0 getState() {
        return getStateState();
    }

    public final String getText() {
        return getValueState();
    }

    public final void setCountryCode(CharSequence countryCode) {
        setCountryCodeState(countryCode != null ? countryCode.toString() : null);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!enabled) {
            setStateState(EnumC26248OooOo0.f89695OooOoO);
        } else if (getStateState() == EnumC26248OooOo0.f89695OooOoO) {
            setStateState(EnumC26248OooOo0.f89694OooOo0o);
        }
    }

    public final void setLabel(CharSequence label) {
        setLabelState(label != null ? label.toString() : null);
    }

    public final void setMaxLength(Integer maxLength) {
        if (maxLength == null || maxLength.intValue() <= 0) {
            maxLength = null;
        }
        if (OooOOO0.OooO0O0(getMaxLengthState(), maxLength)) {
            return;
        }
        setMaxLengthState(maxLength);
        String strOooOO0o = OooOO0o(getValueState());
        if (OooOOO0.OooO0O0(strOooOO0o, getValueState())) {
            return;
        }
        setValueState(strOooOO0o);
        InterfaceC32507OooOO0o<? super String, C32460OooOooO> interfaceC32507OooOO0o = this.f69540Oooo00O;
        if (interfaceC32507OooOO0o != null) {
            interfaceC32507OooOO0o.invoke(strOooOO0o);
        }
    }

    public final void setMode(OooOo00 mode) {
        OooOOO0.OooO0oO(mode, "mode");
        setModeState(mode);
    }

    public final void setOnCountryCodeClickListener(OooO00o<C32460OooOooO> listener) {
        this.f69541Oooo00o = listener;
    }

    public final void setOnInputFocusChangeListener(InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> listener) {
        this.f69538Oooo0 = listener;
    }

    public final void setOnTrailingTextClickListener(OooO00o<C32460OooOooO> listener) {
        setTrailingTextClickListener(listener);
    }

    public final void setOnValueChangeListener(InterfaceC32507OooOO0o<? super String, C32460OooOooO> listener) {
        this.f69540Oooo00O = listener;
    }

    public final void setState(EnumC26248OooOo0 state) {
        OooOOO0.OooO0oO(state, "state");
        setStateState(state);
        super.setEnabled(state != EnumC26248OooOo0.f89695OooOoO);
    }

    public final void setSupportingText(CharSequence supportingText) {
        setSupportingTextState(supportingText != null ? supportingText.toString() : null);
    }

    public final void setText(CharSequence text) {
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        setValueState(OooOO0o(string));
    }

    public final void setTrailingText(CharSequence text) {
        setTrailingTextState(text != null ? text.toString() : null);
    }

    public final void setUseDarkTheme(Boolean useDarkTheme) {
        setUseDarkThemeState(useDarkTheme);
    }
}
