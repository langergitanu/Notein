package oO0Ooo0O;

import kotlin.coroutines.Continuation;
import o0o00oOo.o0000O0O;
import oO000oo.InterfaceC32130OooO0O0;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.C33201OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$2", m80623f = "HttpCallValidator.kt", m80624l = {142, 145}, m80625m = "invokeSuspend")
public final class C33392OooOOo0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO>, C33201OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f120720OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120721OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33393OooOOoo f120722OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ C33201OooO0Oo f120723OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33392OooOOo0(C33393OooOOoo c33393OooOOoo, Continuation<? super C33392OooOOo0> continuation) {
        super(3, continuation);
        this.f120722OooOoO = c33393OooOOoo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO> abstractC32246OooO0o0, C33201OooO0Oo c33201OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
        C33392OooOOo0 c33392OooOOo0 = new C33392OooOOo0(this.f120722OooOoO, continuation);
        c33392OooOOo0.f120720OooOo = abstractC32246OooO0o0;
        c33392OooOOo0.f120723OooOoO0 = c33201OooO0Oo;
        return c33392OooOOo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r5 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oO00OOoO.OooO0o0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r1 = this.f120721OooOo0o;
        try {
            if (r1 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC32246OooO0o0 abstractC32246OooO0o0 = (AbstractC32246OooO0o0) this.f120720OooOo;
                C33201OooO0Oo c33201OooO0Oo = this.f120723OooOoO0;
                this.f120720OooOo = abstractC32246OooO0o0;
                this.f120721OooOo0o = 1;
                Object objOooO0o0 = abstractC32246OooO0o0.OooO0o0(c33201OooO0Oo, this);
                r1 = abstractC32246OooO0o0;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.f120720OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                    throw th;
                }
                AbstractC32246OooO0o0 abstractC32246OooO0o02 = (AbstractC32246OooO0o0) this.f120720OooOo;
                C32446OooOOOo.OooO0O0(obj);
                r1 = abstractC32246OooO0o02;
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th2) {
            Throwable thOooO00o = o0000O0O.OooO00o(th2);
            InterfaceC32130OooO0O0 interfaceC32130OooO0O0OooO0Oo = ((ooOOOOOo.OooO0OO) r1.f115817OooOo0o).OooO0Oo();
            this.f120720OooOo = thOooO00o;
            this.f120721OooOo0o = 2;
            if (C33393OooOOoo.OooO00o(this.f120722OooOoO, thOooO00o, interfaceC32130OooO0O0OooO0Oo, this) != enumC32485OooO00o) {
                throw thOooO00o;
            }
        }
    }
}
