package oO0Ooo0o;

import kotlin.coroutines.Continuation;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.C33201OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo0o.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$2", m80623f = "Logging.kt", m80624l = {201, 206, 207}, m80625m = "invokeSuspend")
public final class C33441OooOOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO>, C33201OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f120889OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33432OooO0Oo f120890OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33436OooO0oo f120891OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120892OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33441OooOOO0(C33436OooO0oo c33436OooO0oo, Continuation<? super C33441OooOOO0> continuation) {
        super(3, continuation);
        this.f120891OooOoO = c33436OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<C33201OooO0Oo, ooOOOOOo.OooO0OO> abstractC32246OooO0o0, C33201OooO0Oo c33201OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
        C33441OooOOO0 c33441OooOOO0 = new C33441OooOOO0(this.f120891OooOoO, continuation);
        c33441OooOOO0.f120892OooOoO0 = abstractC32246OooO0o0;
        return c33441OooOOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r9 == r0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oO00OOoO.OooO0o0] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C33432OooO0Oo c33432OooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r1 = this.f120889OooOo;
        C33436OooO0oo c33436OooO0oo = this.f120891OooOoO;
        try {
        } catch (Throwable th) {
            th = th;
            StringBuilder sb = new StringBuilder();
            C33432OooO0Oo c33432OooO0Oo2 = (C33432OooO0Oo) ((ooOOOOOo.OooO0OO) r1.f115817OooOo0o).getAttributes().OooO0o(C33442OooOOOO.f120893OooO00o);
            C33436OooO0oo.OooO0O0(c33436OooO0oo, sb, ((ooOOOOOo.OooO0OO) r1.f115817OooOo0o).OooO0Oo(), th);
            String string = sb.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "log.toString()");
            this.f120892OooOoO0 = th;
            this.f120890OooOo0o = c33432OooO0Oo2;
            this.f120889OooOo = 2;
            if (c33432OooO0Oo2.OooO0Oo(string, this) != enumC32485OooO00o) {
                c33432OooO0Oo = c33432OooO0Oo2;
            }
        }
        if (r1 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o0 = (AbstractC32246OooO0o0) this.f120892OooOoO0;
            if (c33436OooO0oo.f120869OooO0O0 == 5 || ((ooOOOOOo.OooO0OO) abstractC32246OooO0o0.f115817OooOo0o).getAttributes().OooO0O0(C33442OooOOOO.f120894OooO0O0)) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f120892OooOoO0 = abstractC32246OooO0o0;
            this.f120889OooOo = 1;
            Object objOooO0Oo = abstractC32246OooO0o0.OooO0Oo(this);
            r1 = abstractC32246OooO0o0;
        } else {
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.f120892OooOoO0;
                    C32446OooOOOo.OooO0O0(obj);
                    throw th2;
                }
                c33432OooO0Oo = this.f120890OooOo0o;
                Throwable th3 = (Throwable) this.f120892OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                th = th3;
                this.f120892OooOoO0 = th;
                this.f120890OooOo0o = null;
                this.f120889OooOo = 3;
                if (c33432OooO0Oo.OooO0O0(this) != enumC32485OooO00o) {
                    throw th;
                }
                return enumC32485OooO00o;
            }
            AbstractC32246OooO0o0 abstractC32246OooO0o02 = (AbstractC32246OooO0o0) this.f120892OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            r1 = abstractC32246OooO0o02;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
