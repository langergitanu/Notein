package Oooo0;

import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0o0Oo.C34680OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<o00000.Oooo0, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<o00000.Oooo0> f59766OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<String, C32460OooOooO> f59767OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<String> f59768OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO(InterfaceC32507OooOO0o<? super String, C32460OooOooO> interfaceC32507OooOO0o, Oooo0oO.o00oO0O<o00000.Oooo0> o00oo0o, Oooo0oO.o00oO0O<String> o00oo0o2) {
        super(1);
        this.f59767OooOo0o = interfaceC32507OooOO0o;
        this.f59766OooOo = o00oo0o;
        this.f59768OooOoO0 = o00oo0o2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(o00000.Oooo0 oooo0) {
        o00000.Oooo0 newTextFieldValueState = oooo0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(newTextFieldValueState, "newTextFieldValueState");
        this.f59766OooOo.setValue(newTextFieldValueState);
        Oooo0oO.o00oO0O<String> o00oo0o = this.f59768OooOoO0;
        String value = o00oo0o.getValue();
        C34680OooO0O0 c34680OooO0O0 = newTextFieldValueState.f81083OooO00o;
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(value, c34680OooO0O0.f124887OooOo0o);
        String str = c34680OooO0O0.f124887OooOo0o;
        o00oo0o.setValue(str);
        if (!zOooO0O0) {
            this.f59767OooOo0o.invoke(str);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
