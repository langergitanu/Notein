package oO0o0OoO;

import kotlin.coroutines.Continuation;
import o00o00Oo.C25256OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33710OooOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: oO0o0OoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m80623f = "ChannelFlow.kt", m80624l = {119}, m80625m = "invokeSuspend")
public final class C33795OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f121830OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f121831OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC33796OooO0oO<Object> f121832OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO<Object> f121833OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33795OooO0o0(InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO, AbstractC33796OooO0oO<Object> abstractC33796OooO0oO, Continuation<? super C33795OooO0o0> continuation) {
        super(2, continuation);
        this.f121833OooOoO0 = interfaceC33723OooO0oO;
        this.f121832OooOoO = abstractC33796OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33795OooO0o0 c33795OooO0o0 = new C33795OooO0o0(this.f121833OooOoO0, this.f121832OooOoO, continuation);
        c33795OooO0o0.f121830OooOo = obj;
        return c33795OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C33795OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f121831OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33710OooOo0 c33710OooOo0OooO0oo = this.f121832OooOoO.OooO0oo((InterfaceC33636Oooo00o) this.f121830OooOo);
            this.f121831OooOo0o = 1;
            Object objOooO0o0 = C25256OooO00o.OooO0o0(this.f121833OooOoO0, c33710OooOo0OooO0oo, true, this);
            if (objOooO0o0 != obj2) {
                objOooO0o0 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o0 == obj2) {
                return obj2;
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
