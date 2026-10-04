package oO0Ooo0O;

import kotlin.coroutines.Continuation;
import oO000oo.C32132OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Ooo0O.C33408Oooo000;

/* JADX INFO: renamed from: oO0Ooo0O.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpRedirect$Plugin$install$1", m80623f = "HttpRedirect.kt", m80624l = {64, 69}, m80625m = "invokeSuspend")
public final class C33410Oooo00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33425OoooOo0, C32132OooO0Oo, Continuation<? super ooOOOOOo.OooO0OO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33425OoooOo0 f120788OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120789OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33408Oooo000 f120790OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C32132OooO0Oo f120791OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ oO000o0.OooO0o f120792OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33410Oooo00o(C33408Oooo000 c33408Oooo000, oO000o0.OooO0o oooO0o, Continuation<? super C33410Oooo00o> continuation) {
        super(3, continuation);
        this.f120790OooOoO = c33408Oooo000;
        this.f120792OooOoOO = oooO0o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33425OoooOo0 interfaceC33425OoooOo0, C32132OooO0Oo c32132OooO0Oo, Continuation<? super ooOOOOOo.OooO0OO> continuation) {
        C33410Oooo00o c33410Oooo00o = new C33410Oooo00o(this.f120790OooOoO, this.f120792OooOoOO, continuation);
        c33410Oooo00o.f120788OooOo = interfaceC33425OoooOo0;
        c33410Oooo00o.f120791OooOoO0 = c32132OooO0Oo;
        return c33410Oooo00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C32132OooO0Oo c32132OooO0Oo;
        InterfaceC33425OoooOo0 interfaceC33425OoooOo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120789OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33425OoooOo0 interfaceC33425OoooOo02 = this.f120788OooOo;
            c32132OooO0Oo = this.f120791OooOoO0;
            this.f120788OooOo = interfaceC33425OoooOo02;
            this.f120791OooOoO0 = c32132OooO0Oo;
            this.f120789OooOo0o = 1;
            Object objOooO00o = interfaceC33425OoooOo02.OooO00o(c32132OooO0Oo, this);
            if (objOooO00o != enumC32485OooO00o) {
                interfaceC33425OoooOo0 = interfaceC33425OoooOo02;
                obj = objOooO00o;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        c32132OooO0Oo = this.f120791OooOoO0;
        InterfaceC33425OoooOo0 interfaceC33425OoooOo03 = this.f120788OooOo;
        C32446OooOOOo.OooO0O0(obj);
        interfaceC33425OoooOo0 = interfaceC33425OoooOo03;
        C32132OooO0Oo c32132OooO0Oo2 = c32132OooO0Oo;
        ooOOOOOo.OooO0OO oooO0OO = (ooOOOOOo.OooO0OO) obj;
        this.f120790OooOoO.getClass();
        if (!C33407Oooo0.f120771OooO00o.contains(oooO0OO.OooO0Oo().getMethod())) {
            return oooO0OO;
        }
        C33408Oooo000.OooO0O0 oooO0O0 = C33408Oooo000.f120773OooO00o;
        this.f120788OooOo = null;
        this.f120791OooOoO0 = null;
        this.f120789OooOo0o = 2;
        Object objOooO0OO = C33408Oooo000.OooO0O0.OooO0OO(oooO0O0, interfaceC33425OoooOo0, c32132OooO0Oo2, oooO0OO, this.f120792OooOoOO, this);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
