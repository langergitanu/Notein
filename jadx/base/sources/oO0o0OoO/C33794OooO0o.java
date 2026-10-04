package oO0o0OoO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: renamed from: oO0o0OoO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m80623f = "ChannelFlow.kt", m80624l = {56}, m80625m = "invokeSuspend")
public final class C33794OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f121827OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121828OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC33796OooO0oO<Object> f121829OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33794OooO0o(AbstractC33796OooO0oO<Object> abstractC33796OooO0oO, Continuation<? super C33794OooO0o> continuation) {
        super(2, continuation);
        this.f121829OooOoO0 = abstractC33796OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33794OooO0o c33794OooO0o = new C33794OooO0o(this.f121829OooOoO0, continuation);
        c33794OooO0o.f121827OooOo = obj;
        return c33794OooO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<Object> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C33794OooO0o) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121828OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33712OooOo0O<? super Object> interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f121827OooOo;
            this.f121828OooOo0o = 1;
            if (this.f121829OooOoO0.OooO0O0(interfaceC33712OooOo0O, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
