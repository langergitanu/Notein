package oO000o0;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO000oo.C32132OooO0Oo;
import oO00OOoO.AbstractC32246OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0Oo0Oo.C33199OooO0O0;

/* JADX INFO: renamed from: oO000o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.HttpClient$2", m80623f = "HttpClient.kt", m80624l = {144, 146}, m80625m = "invokeSuspend")
public final class C32089OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<AbstractC32246OooO0o0<Object, C32132OooO0Oo>, Object, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC32246OooO0o0 f114941OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f114942OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f114943OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f114944OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32089OooO0O0(OooO0o oooO0o, Continuation<? super C32089OooO0O0> continuation) {
        super(3, continuation);
        this.f114943OooOoO = oooO0o;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(AbstractC32246OooO0o0<Object, C32132OooO0Oo> abstractC32246OooO0o0, Object obj, Continuation<? super C32460OooOooO> continuation) {
        C32089OooO0O0 c32089OooO0O0 = new C32089OooO0O0(this.f114943OooOoO, continuation);
        c32089OooO0O0.f114941OooOo = abstractC32246OooO0o0;
        c32089OooO0O0.f114944OooOoO0 = obj;
        return c32089OooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r3.OooO0o0(r1, r8) == r0) goto L18;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        AbstractC32246OooO0o0 abstractC32246OooO0o0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f114942OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC32246OooO0o0 abstractC32246OooO0o02 = this.f114941OooOo;
            obj2 = this.f114944OooOoO0;
            if (!(obj2 instanceof ooOOOOOo.OooO0OO)) {
                throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + C24035Oooo00o.f80943OooO00o.OooO0O0(obj2.getClass()) + ").").toString());
            }
            C33199OooO0O0 c33199OooO0O0 = this.f114943OooOoO.f114957OooOooO;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            AbstractC33200OooO0OO abstractC33200OooO0OOOooO0o0 = ((ooOOOOOo.OooO0OO) obj2).OooO0o0();
            this.f114941OooOo = abstractC32246OooO0o02;
            this.f114944OooOoO0 = obj2;
            this.f114942OooOo0o = 1;
            Object objOooO00o = c33199OooO0O0.OooO00o(c32460OooOooO, abstractC33200OooO0OOOooO0o0, this);
            if (objOooO00o != enumC32485OooO00o) {
                abstractC32246OooO0o0 = abstractC32246OooO0o02;
                obj = objOooO00o;
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        obj2 = this.f114944OooOoO0;
        abstractC32246OooO0o0 = this.f114941OooOo;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC33200OooO0OO response = (AbstractC33200OooO0OO) obj;
        ooOOOOOo.OooO0OO oooO0OO = (ooOOOOOo.OooO0OO) obj2;
        oooO0OO.getClass();
        OooOOO0.OooO0oO(response, "response");
        oooO0OO.f125914OooOoO0 = response;
        this.f114941OooOo = null;
        this.f114944OooOoO0 = null;
        this.f114942OooOo0o = 2;
    }
}
