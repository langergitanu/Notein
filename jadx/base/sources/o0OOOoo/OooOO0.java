package o0OOOoo;

import kotlin.coroutines.Continuation;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26556o000Ooo;
import o0OO00o0.C26577o000oo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.config.StylusConfigProviderImpl$handleXiaomiConfig$mode$1", m80623f = "StylusConfigProviderImpl.kt", m80624l = {96}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f95040OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95041OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooOOO0 oooOOO0, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f95040OooOo = oooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0(this.f95040OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95041OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26577o000oo0O c26577o000oo0O = this.f95040OooOo.f95053OooO00o;
        String str = OooOOO0.f95050OooO0Oo.f81922OooO00o;
        this.f95041OooOo0o = 1;
        Object objOooOOo = C25252OooO0Oo.OooOOo(new C26556o000Ooo(c26577o000oo0O.f91598OooO00o.getData(), C24340OooO0oo.OooO0o0(str)), this);
        return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
    }
}
