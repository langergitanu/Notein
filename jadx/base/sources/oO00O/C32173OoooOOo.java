package oO00O;

import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.o000OOo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO00O.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.network.tls.TLSSocket$attachForReading$1", m80623f = "TLSClientSessionJvm.kt", m80624l = {42}, m80625m = "invokeSuspend")
public final class C32173OoooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f115430OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f115431OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C32171OoooOO0 f115432OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32173OoooOOo(C32171OoooOO0 c32171OoooOO0, Continuation<? super C32173OoooOOo> continuation) {
        super(2, continuation);
        this.f115432OooOoO0 = c32171OoooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C32173OoooOOo c32173OoooOOo = new C32173OoooOOo(this.f115432OooOoO0, continuation);
        c32173OoooOOo.f115430OooOo = obj;
        return c32173OoooOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
        return ((C32173OoooOOo) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115431OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO = ((o000OOo) this.f115430OooOo).OooO0OO();
            this.f115431OooOo0o = 1;
            if (C32171OoooOO0.OooOooo(this.f115432OooOoO0, interfaceC23967Oooo00OOooO0OO, this) == enumC32485OooO00o) {
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
