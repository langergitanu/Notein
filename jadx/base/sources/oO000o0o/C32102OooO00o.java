package oO000o0o;

import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.o000OOo;
import kotlin.coroutines.Continuation;
import oO00O0oO.OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO000o0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.content.ObservableContent$content$1", m80623f = "ObservableContent.kt", m80624l = {36}, m80625m = "invokeSuspend")
public final class C32102OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f115076OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f115077OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f115078OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32102OooO00o(OooO0OO oooO0OO, Continuation<? super C32102OooO00o> continuation) {
        super(2, continuation);
        this.f115078OooOoO0 = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32102OooO00o c32102OooO00o = new C32102OooO00o(this.f115078OooOoO0, continuation);
        c32102OooO00o.f115076OooOo = obj;
        return c32102OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
        return ((C32102OooO00o) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115077OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000OOo o000ooo2 = (o000OOo) this.f115076OooOo;
            OooO0OO.OooO0Oo oooO0Oo = (OooO0OO.OooO0Oo) this.f115078OooOoO0;
            InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO = o000ooo2.OooO0OO();
            this.f115077OooOo0o = 1;
            if (oooO0Oo.OooO0o0(interfaceC23967Oooo00OOooO0OO, this) == enumC32485OooO00o) {
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
