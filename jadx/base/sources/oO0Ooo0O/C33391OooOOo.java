package oO0Ooo0O;

import kotlin.coroutines.Continuation;
import oO000oo.C32132OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.AbstractC33200OooO0OO;

/* JADX INFO: renamed from: oO0Ooo0O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$3", m80623f = "HttpCallValidator.kt", m80624l = {151, 152}, m80625m = "invokeSuspend")
public final class C33391OooOOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33425OoooOo0, C32132OooO0Oo, Continuation<? super ooOOOOOo.OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f120716OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120717OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33393OooOOoo f120718OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C32132OooO0Oo f120719OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33391OooOOo(C33393OooOOoo c33393OooOOoo, Continuation<? super C33391OooOOo> continuation) {
        super(3, continuation);
        this.f120718OooOoO = c33393OooOOoo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33425OoooOo0 interfaceC33425OoooOo0, C32132OooO0Oo c32132OooO0Oo, Continuation<? super ooOOOOOo.OooO0OO> continuation) {
        C33391OooOOo c33391OooOOo = new C33391OooOOo(this.f120718OooOoO, continuation);
        c33391OooOOo.f120716OooOo = interfaceC33425OoooOo0;
        c33391OooOOo.f120719OooOoO0 = c32132OooO0Oo;
        return c33391OooOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120717OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33425OoooOo0 interfaceC33425OoooOo0 = (InterfaceC33425OoooOo0) this.f120716OooOo;
            C32132OooO0Oo c32132OooO0Oo = this.f120719OooOoO0;
            this.f120716OooOo = null;
            this.f120717OooOo0o = 1;
            obj = interfaceC33425OoooOo0.OooO00o(c32132OooO0Oo, this);
            if (obj != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ooOOOOOo.OooO0OO oooO0OO = (ooOOOOOo.OooO0OO) this.f120716OooOo;
            C32446OooOOOo.OooO0O0(obj);
            return oooO0OO;
        }
        C32446OooOOOo.OooO0O0(obj);
        ooOOOOOo.OooO0OO oooO0OO2 = (ooOOOOOo.OooO0OO) obj;
        AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o0 = oooO0OO2.OooO0o0();
        this.f120716OooOo = oooO0OO2;
        this.f120717OooOo0o = 2;
        return C33393OooOOoo.OooO0O0(this.f120718OooOoO, abstractC33200OooO0OOOooO0o0, this) == enumC32485OooO00o ? enumC32485OooO00o : oooO0OO2;
    }
}
