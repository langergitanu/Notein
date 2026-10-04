package oO0Ooo0o;

import kotlin.coroutines.Continuation;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.AbstractC33200OooO0OO;

/* JADX INFO: renamed from: oO0Ooo0o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$1", m80623f = "Logging.kt", m80624l = {184, 191, 191}, m80625m = "invokeSuspend")
public final class C33439OooOO0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<AbstractC33200OooO0OO, C32460OooOooO>, AbstractC33200OooO0OO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f120880OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public StringBuilder f120881OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f120882OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120883OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C33436OooO0oo f120884OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33439OooOO0o(C33436OooO0oo c33436OooO0oo, Continuation<? super C33439OooOO0o> continuation) {
        super(3, continuation);
        this.f120884OooOoOO = c33436OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<AbstractC33200OooO0OO, C32460OooOooO> abstractC32246OooO0o0, AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super C32460OooOooO> continuation) {
        C33439OooOO0o c33439OooOO0o = new C33439OooOO0o(this.f120884OooOoOO, continuation);
        c33439OooOO0o.f120883OooOoO0 = abstractC32246OooO0o0;
        c33439OooOO0o.f120882OooOoO = abstractC33200OooO0OO;
        return c33439OooOO0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r8.OooO0O0(r13) == r0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        AbstractC33200OooO0OO abstractC33200OooO0OO;
        C33432OooO0Oo c33432OooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        StringBuilder sb = this.f120880OooOo;
        boolean z = true;
        C33436OooO0oo c33436OooO0oo = this.f120884OooOoOO;
        try {
            if (sb == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC32246OooO0o0 abstractC32246OooO0o0 = (AbstractC32246OooO0o0) this.f120883OooOoO0;
                abstractC33200OooO0OO = (AbstractC33200OooO0OO) this.f120882OooOoO;
                if (c33436OooO0oo.f120869OooO0O0 == 5 || abstractC33200OooO0OO.OooO00o().getAttributes().OooO0O0(C33442OooOOOO.f120894OooO0O0)) {
                    return C32460OooOooO.f116667OooO00o;
                }
                c33432OooO0Oo = (C33432OooO0Oo) abstractC33200OooO0OO.OooO00o().getAttributes().OooO0o(C33442OooOOOO.f120893OooO00o);
                StringBuilder sb2 = new StringBuilder();
                C33444OooOOo.OooO0Oo(sb2, abstractC33200OooO0OO.OooO00o().OooO0o0(), c33436OooO0oo.f120869OooO0O0, c33436OooO0oo.f120871OooO0Oo);
                Object objOooO0O0 = abstractC32246OooO0o0.OooO0O0();
                this.f120883OooOoO0 = abstractC33200OooO0OO;
                this.f120882OooOoO = c33432OooO0Oo;
                this.f120881OooOo0o = sb2;
                this.f120880OooOo = 1;
                sb = sb2;
                if (abstractC32246OooO0o0.OooO0o0(objOooO0O0, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (sb != 1) {
                if (sb == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (sb != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) this.f120883OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                throw th;
            }
            StringBuilder sb3 = this.f120881OooOo0o;
            c33432OooO0Oo = (C33432OooO0Oo) this.f120882OooOoO;
            abstractC33200OooO0OO = (AbstractC33200OooO0OO) this.f120883OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            sb = sb3;
            String string = sb.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "header.toString()");
            c33432OooO0Oo.OooO0o0(string);
            if (!C33434OooO0o0.OooO00o(c33436OooO0oo.f120869OooO0O0)) {
                this.f120883OooOoO0 = null;
                this.f120882OooOoO = null;
                this.f120881OooOo0o = null;
                this.f120880OooOo = 2;
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th2) {
            try {
                C33436OooO0oo.OooO0O0(c33436OooO0oo, sb, abstractC33200OooO0OO.OooO00o().OooO0Oo(), th2);
                try {
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    String string2 = sb.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "header.toString()");
                    c33432OooO0Oo.OooO0o0(string2);
                    if (!z && C33434OooO0o0.OooO00o(c33436OooO0oo.f120869OooO0O0)) {
                        throw th;
                    }
                    this.f120883OooOoO0 = th;
                    this.f120882OooOoO = null;
                    this.f120881OooOo0o = null;
                    this.f120880OooOo = 3;
                    if (c33432OooO0Oo.OooO0O0(this) != enumC32485OooO00o) {
                        th = th;
                        throw th;
                    }
                    return enumC32485OooO00o;
                }
            } catch (Throwable th4) {
                th = th4;
                z = false;
            }
        }
    }
}
