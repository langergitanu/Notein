package o0O0ooo0;

import Oooo0oO.o00oO0O;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.niui.components.textinput.LabeledTextFieldKt$LabeledTextField$1$1", m80623f = "LabeledTextField.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f89672OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<Boolean, C32460OooOooO> f89673OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(InterfaceC32507OooOO0o interfaceC32507OooOO0o, o00oO0O o00oo0o, Continuation continuation) {
        super(2, continuation);
        this.f89673OooOo0o = interfaceC32507OooOO0o;
        this.f89672OooOo = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0(this.f89673OooOo0o, this.f89672OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC32507OooOO0o<Boolean, C32460OooOooO> interfaceC32507OooOO0o = this.f89673OooOo0o;
        if (interfaceC32507OooOO0o != null) {
            Boolean bool = (Boolean) this.f89672OooOo.getValue();
            bool.booleanValue();
            interfaceC32507OooOO0o.invoke(bool);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
