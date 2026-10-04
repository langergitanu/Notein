package oO0Ooo0O;

import kotlin.coroutines.Continuation;
import o0o00oOo.o0000O0O;
import oO000oo.C32132OooO0Oo;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: oO0Ooo0O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.HttpCallValidator$Companion$install$1", m80623f = "HttpCallValidator.kt", m80624l = {130, 133}, m80625m = "invokeSuspend")
public final class C33390OooOOOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f120711OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120712OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33393OooOOoo f120713OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f120714OooOoO0;

    /* JADX INFO: renamed from: oO0Ooo0O.OooOOOo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33393OooOOoo f120715OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C33393OooOOoo c33393OooOOoo) {
            super(0);
            this.f120715OooOo0o = c33393OooOOoo;
        }

        @Override // oO0O000o.OooO00o
        public final Boolean invoke() {
            return Boolean.valueOf(this.f120715OooOo0o.f120728OooO0OO);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33390OooOOOo(C33393OooOOoo c33393OooOOoo, Continuation<? super C33390OooOOOo> continuation) {
        super(3, continuation);
        this.f120713OooOoO = c33393OooOOoo;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C33390OooOOOo c33390OooOOOo = new C33390OooOOOo(this.f120713OooOoO, continuation);
        c33390OooOOOo.f120711OooOo = abstractC32246OooO0o0;
        c33390OooOOOo.f120714OooOoO0 = obj;
        return c33390OooOOOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oO00OOoO.OooO0o0] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r1 = this.f120712OooOo0o;
        C33393OooOOoo c33393OooOOoo = this.f120713OooOoO;
        try {
            if (r1 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC32246OooO0o0 abstractC32246OooO0o0 = (AbstractC32246OooO0o0) this.f120711OooOo;
                Object obj2 = this.f120714OooOoO0;
                ((C32132OooO0Oo) abstractC32246OooO0o0.f115817OooOo0o).f115207OooO0o.OooO0Oo(C33398OooOo0o.f120748OooO0O0, new OooO00o(c33393OooOOoo));
                this.f120711OooOo = abstractC32246OooO0o0;
                this.f120712OooOo0o = 1;
                Object objOooO0o0 = abstractC32246OooO0o0.OooO0o0(obj2, this);
                r1 = abstractC32246OooO0o0;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.f120711OooOo;
                    C32446OooOOOo.OooO0O0(obj);
                    throw th;
                }
                AbstractC32246OooO0o0 abstractC32246OooO0o02 = (AbstractC32246OooO0o0) this.f120711OooOo;
                C32446OooOOOo.OooO0O0(obj);
                r1 = abstractC32246OooO0o02;
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th2) {
            Throwable thOooO00o = o0000O0O.OooO00o(th2);
            C32132OooO0Oo c32132OooO0Oo = (C32132OooO0Oo) r1.f115817OooOo0o;
            InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = C33398OooOo0o.f120747OooO00o;
            C33397OooOo0O c33397OooOo0O = new C33397OooOo0O(c32132OooO0Oo);
            this.f120711OooOo = thOooO00o;
            this.f120712OooOo0o = 2;
            if (C33393OooOOoo.OooO00o(c33393OooOOoo, thOooO00o, c33397OooOo0O, this) != enumC32485OooO00o) {
                throw thOooO00o;
            }
        }
    }
}
