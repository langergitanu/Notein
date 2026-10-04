package oO0Ooo0O;

import kotlin.coroutines.Continuation;
import oO000oo.C32132OooO0Oo;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: oO0Ooo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.BodyProgress$handle$1", m80623f = "BodyProgress.kt", m80624l = {38}, m80625m = "invokeSuspend")
public final class C33377OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f120677OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120678OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120679OooOoO0;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C33377OooO0O0 c33377OooO0O0 = new C33377OooO0O0(3, continuation);
        c33377OooO0O0.f120677OooOo = abstractC32246OooO0o0;
        c33377OooO0O0.f120679OooOoO0 = obj;
        return c33377OooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120678OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o0 = this.f120677OooOo;
            Object obj2 = this.f120679OooOoO0;
            InterfaceC32510OooOOo0 interfaceC32510OooOOo0 = (InterfaceC32510OooOOo0) ((C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o).f115207OooO0o.OooO0OO(C33379OooO0Oo.f120683OooO00o);
            if (interfaceC32510OooOOo0 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
            oO000o0o.OooO0O0 oooO0O0 = new oO000o0o.OooO0O0((oO00O0oO.OooO0OO) obj2, ((C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o).f115208OooO0o0, interfaceC32510OooOOo0);
            this.f120677OooOo = null;
            this.f120678OooOo0o = 1;
            if (abstractC32246OooO0o0.OooO0o0(oooO0O0, this) == enumC32485OooO00o) {
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
