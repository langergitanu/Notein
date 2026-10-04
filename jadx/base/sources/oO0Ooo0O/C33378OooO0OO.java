package oO0Ooo0O;

import OooOooO.C20741OooOOoo;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00OO0o0.C24999OooO0OO;
import oO00O0o0.C32190OooOOo0;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0Ooo0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.BodyProgress$handle$2", m80623f = "BodyProgress.kt", m80624l = {45}, m80625m = "invokeSuspend")
public final class C33378OooO0OO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<AbstractC33200OooO0OO, C32460OooOooO>, AbstractC33200OooO0OO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f120680OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120681OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ AbstractC33200OooO0OO f120682OooOoO0;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<AbstractC33200OooO0OO, C32460OooOooO> abstractC32246OooO0o0, AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super C32460OooOooO> continuation) {
        C33378OooO0OO c33378OooO0OO = new C33378OooO0OO(3, continuation);
        c33378OooO0OO.f120680OooOo = abstractC32246OooO0o0;
        c33378OooO0OO.f120682OooOoO0 = abstractC33200OooO0OO;
        return c33378OooO0OO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120681OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o0 = this.f120680OooOo;
            AbstractC33200OooO0OO abstractC33200OooO0OO = this.f120682OooOoO0;
            InterfaceC32510OooOOo0 interfaceC32510OooOOo0 = (InterfaceC32510OooOOo0) abstractC33200OooO0OO.OooO00o().OooO0Oo().getAttributes().OooO0OO(C33379OooO0Oo.f120684OooO0O0);
            if (interfaceC32510OooOOo0 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            InterfaceC23986Ooooo0o interfaceC23986Ooooo0oOooO0O0 = abstractC33200OooO0OO.OooO0O0();
            InterfaceC34415OooO0oo interfaceC34415OooO0ooOooOOO0 = abstractC33200OooO0OO.OooOOO0();
            oO00O0o0.OooOO0O headers = abstractC33200OooO0OO.getHeaders();
            List<String> list = C32190OooOOo0.f115537OooO00o;
            String str = headers.get("Content-Length");
            AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o0 = C24999OooO0OO.OooO0o(abstractC33200OooO0OO.OooO00o(), C20741OooOOoo.OooO0oo(interfaceC23986Ooooo0oOooO0O0, interfaceC34415OooO0ooOooOOO0, str != null ? Long.valueOf(Long.parseLong(str)) : null, interfaceC32510OooOOo0)).OooO0o0();
            this.f120680OooOo = null;
            this.f120681OooOo0o = 1;
            if (abstractC32246OooO0o0.OooO0o0(abstractC33200OooO0OOOooO0o0, this) == enumC32485OooO00o) {
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
