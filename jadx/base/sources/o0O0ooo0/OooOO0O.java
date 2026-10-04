package o0O0ooo0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.niui.components.textinput.LabeledTextFieldKt$LabeledTextField$2$1", m80623f = "LabeledTextField.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f89674OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Integer f89675OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<String, C32460OooOooO> f89676OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(Integer num, String str, InterfaceC32507OooOO0o<? super String, C32460OooOooO> interfaceC32507OooOO0o, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f89675OooOo0o = num;
        this.f89674OooOo = str;
        this.f89676OooOoO0 = interfaceC32507OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0O(this.f89675OooOo0o, this.f89674OooOo, this.f89676OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Integer num = this.f89675OooOo0o;
        if (num != null) {
            String str = this.f89674OooOo;
            if (str.length() > num.intValue()) {
                this.f89676OooOoO0.invoke(C33600OooOo0o.o0OoOo0(num.intValue(), str));
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
