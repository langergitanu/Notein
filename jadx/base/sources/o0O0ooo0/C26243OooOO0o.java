package o0O0ooo0;

import Oooo0oO.o00oO0O;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0O0ooo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.niui.components.textinput.LabeledTextFieldKt$LabeledTextField$3$1", m80623f = "LabeledTextField.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26243OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00oO0O<Integer> f89677OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f89678OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26243OooOO0o(String str, o00oO0O<Integer> o00oo0o, Continuation<? super C26243OooOO0o> continuation) {
        super(2, continuation);
        this.f89678OooOo0o = str;
        this.f89677OooOo = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26243OooOO0o(this.f89678OooOo0o, this.f89677OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26243OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = this.f89678OooOo0o;
        if (str == null || C33599OooOo0O.Oooo0o0(str)) {
            this.f89677OooOo.setValue(0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
