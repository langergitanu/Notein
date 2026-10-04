package oO0o0OoO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: oO0o0OoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m80623f = "ChannelFlow.kt", m80624l = {148}, m80625m = "invokeSuspend")
public final class C33797OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<Object>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f121837OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121838OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractC33789OooO<Object, Object> f121839OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33797OooO0oo(AbstractC33789OooO<Object, Object> abstractC33789OooO, Continuation<? super C33797OooO0oo> continuation) {
        super(2, continuation);
        this.f121839OooOoO0 = abstractC33789OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33797OooO0oo c33797OooO0oo = new C33797OooO0oo(this.f121839OooOoO0, continuation);
        c33797OooO0oo.f121837OooOo = obj;
        return c33797OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C33797OooO0oo) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121838OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f121837OooOo;
            this.f121838OooOo0o = 1;
            if (this.f121839OooOoO0.OooO(interfaceC33723OooO0oO, this) == enumC32485OooO00o) {
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
