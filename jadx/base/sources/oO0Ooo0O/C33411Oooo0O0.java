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
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.InterfaceC33623OooOo0O;
import oO0o0OO.InterfaceC33672o00ooo;
import oOO00OOo.InterfaceC34352OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0Ooo0O.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpRequestLifecycle$Plugin$install$1", m80623f = "HttpRequestLifecycle.kt", m80624l = {38}, m80625m = "invokeSuspend")
public final class C33411Oooo0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f120793OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120794OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ oO000o0.OooO0o f120795OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33411Oooo0O0(oO000o0.OooO0o oooO0o, Continuation<? super C33411Oooo0O0> continuation) {
        super(3, continuation);
        this.f120795OooOoO0 = oooO0o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C33411Oooo0O0 c33411Oooo0O0 = new C33411Oooo0O0(this.f120795OooOoO0, continuation);
        c33411Oooo0O0.f120793OooOo = abstractC32246OooO0o0;
        return c33411Oooo0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        InterfaceC33623OooOo0O interfaceC33623OooOo0O;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120794OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33623OooOo0O = (InterfaceC33623OooOo0O) this.f120793OooOo;
            try {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33623OooOo0O.complete();
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                th = th;
                try {
                    interfaceC33623OooOo0O.OooO00o(th);
                    throw th;
                } catch (Throwable th2) {
                    interfaceC33623OooOo0O.complete();
                    throw th2;
                }
            }
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC32246OooO0o0 abstractC32246OooO0o0 = (AbstractC32246OooO0o0) this.f120793OooOo;
        C33664o00000Oo c33664o00000Oo = new C33664o00000Oo(((C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o).f115208OooO0o0);
        InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = this.f120795OooOoO0.f114952OooOoO.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C33413Oooo0o.f120798OooO00o;
        c33664o00000Oo.invokeOnCompletion(new C33414Oooo0o0(((InterfaceC33672o00ooo) oooO0O0).invokeOnCompletion(new oO00O.Oooo000(c33664o00000Oo, 1))));
        try {
            C32132OooO0Oo c32132OooO0Oo = (C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o;
            c32132OooO0Oo.getClass();
            c32132OooO0Oo.f115208OooO0o0 = c33664o00000Oo;
            this.f120793OooOo = c33664o00000Oo;
            this.f120794OooOo0o = 1;
            if (abstractC32246OooO0o0.OooO0Oo(this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            interfaceC33623OooOo0O = c33664o00000Oo;
            interfaceC33623OooOo0O.complete();
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th3) {
            th = th3;
            interfaceC33623OooOo0O = c33664o00000Oo;
            interfaceC33623OooOo0O.OooO00o(th);
            throw th;
        }
    }
}
