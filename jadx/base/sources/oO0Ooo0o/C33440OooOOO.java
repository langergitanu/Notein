package oO0Ooo0o;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import kotlin.coroutines.Continuation;
import oO00O0o0.C32183OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO0Ooo0o.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.logging.Logging$setupResponseLogging$observer$1", m80623f = "Logging.kt", m80624l = {222, 225, 226, 225, 226, 225, 226}, m80625m = "invokeSuspend")
public final class C33440OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC33200OooO0OO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f120885OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public StringBuilder f120886OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33436OooO0oo f120887OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120888OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33440OooOOO(C33436OooO0oo c33436OooO0oo, Continuation<? super C33440OooOOO> continuation) {
        super(2, continuation);
        this.f120887OooOoO = c33436OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33440OooOOO c33440OooOOO = new C33440OooOOO(this.f120887OooOoO, continuation);
        c33440OooOOO.f120888OooOoO0 = obj;
        return c33440OooOOO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC33200OooO0OO abstractC33200OooO0OO, Continuation<? super C32460OooOooO> continuation) {
        return ((C33440OooOOO) create(abstractC33200OooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r1.OooO0O0(r9) != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
    
        if (r1.OooO0O0(r9) != r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7 A[PHI: r1
      0x00c7: PHI (r1v15 oO0Ooo0o.OooO0Oo) = (r1v11 oO0Ooo0o.OooO0Oo), (r1v17 oO0Ooo0o.OooO0Oo) binds: [B:29:0x00c4, B:14:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0 A[PHI: r1
      0x00f0: PHI (r1v18 oO0Ooo0o.OooO0Oo) = (r1v10 oO0Ooo0o.OooO0Oo), (r1v20 oO0Ooo0o.OooO0Oo) binds: [B:35:0x00ed, B:12:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C33432OooO0Oo c33432OooO0Oo;
        StringBuilder sb;
        String string;
        String string2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (this.f120885OooOo) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                AbstractC33200OooO0OO abstractC33200OooO0OO = (AbstractC33200OooO0OO) this.f120888OooOoO0;
                if (this.f120887OooOoO.f120869OooO0O0 == 5 || abstractC33200OooO0OO.OooO00o().getAttributes().OooO0O0(C33442OooOOOO.f120894OooO0O0)) {
                    return C32460OooOooO.f116667OooO00o;
                }
                c33432OooO0Oo = (C33432OooO0Oo) abstractC33200OooO0OO.OooO00o().getAttributes().OooO0o(C33442OooOOOO.f120893OooO00o);
                sb = new StringBuilder();
                try {
                    C32183OooO0Oo c32183OooO0OoOooO00o = oO00O0o0.OooOo00.OooO00o(abstractC33200OooO0OO);
                    InterfaceC23986Ooooo0o interfaceC23986Ooooo0oOooO0O0 = abstractC33200OooO0OO.OooO0O0();
                    this.f120888OooOoO0 = c33432OooO0Oo;
                    this.f120886OooOo0o = sb;
                    this.f120885OooOo = 1;
                    if (C33444OooOOo.OooO0OO(sb, c32183OooO0OoOooO00o, interfaceC23986Ooooo0oOooO0O0, this) != enumC32485OooO00o) {
                        String string3 = sb.toString();
                        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "log.toString()");
                        string2 = C33599OooOo0O.Oooooo0(string3).toString();
                        this.f120888OooOoO0 = c33432OooO0Oo;
                        this.f120886OooOo0o = null;
                        this.f120885OooOo = 2;
                        if (c33432OooO0Oo.OooO0OO(string2, this) != enumC32485OooO00o) {
                            this.f120888OooOoO0 = null;
                            this.f120885OooOo = 3;
                        }
                    }
                    break;
                } catch (Throwable unused) {
                    String string4 = sb.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string4, "log.toString()");
                    string = C33599OooOo0O.Oooooo0(string4).toString();
                    this.f120888OooOoO0 = c33432OooO0Oo;
                    this.f120886OooOo0o = null;
                    this.f120885OooOo = 4;
                    if (c33432OooO0Oo.OooO0OO(string, this) != enumC32485OooO00o) {
                        this.f120888OooOoO0 = null;
                        this.f120885OooOo = 5;
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                StringBuilder sb2 = this.f120886OooOo0o;
                C33432OooO0Oo c33432OooO0Oo2 = (C33432OooO0Oo) this.f120888OooOoO0;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    sb = sb2;
                    c33432OooO0Oo = c33432OooO0Oo2;
                    String string32 = sb.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string32, "log.toString()");
                    string2 = C33599OooOo0O.Oooooo0(string32).toString();
                    this.f120888OooOoO0 = c33432OooO0Oo;
                    this.f120886OooOo0o = null;
                    this.f120885OooOo = 2;
                    if (c33432OooO0Oo.OooO0OO(string2, this) != enumC32485OooO00o) {
                    }
                } catch (Throwable unused2) {
                    sb = sb2;
                    c33432OooO0Oo = c33432OooO0Oo2;
                    String string42 = sb.toString();
                    kotlin.jvm.internal.OooOOO0.OooO0o(string42, "log.toString()");
                    string = C33599OooOo0O.Oooooo0(string42).toString();
                    this.f120888OooOoO0 = c33432OooO0Oo;
                    this.f120886OooOo0o = null;
                    this.f120885OooOo = 4;
                    if (c33432OooO0Oo.OooO0OO(string, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            case 2:
                c33432OooO0Oo = (C33432OooO0Oo) this.f120888OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                this.f120888OooOoO0 = null;
                this.f120885OooOo = 3;
                break;
            case 3:
            case 5:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                c33432OooO0Oo = (C33432OooO0Oo) this.f120888OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                this.f120888OooOoO0 = null;
                this.f120885OooOo = 5;
                break;
            case 6:
                Throwable th = (Throwable) this.f120886OooOo0o;
                C33432OooO0Oo c33432OooO0Oo3 = (C33432OooO0Oo) this.f120888OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                this.f120888OooOoO0 = th;
                this.f120886OooOo0o = null;
                this.f120885OooOo = 7;
                if (c33432OooO0Oo3.OooO0O0(this) != enumC32485OooO00o) {
                    throw th;
                }
                return enumC32485OooO00o;
            case 7:
                Throwable th2 = (Throwable) this.f120888OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                throw th2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
