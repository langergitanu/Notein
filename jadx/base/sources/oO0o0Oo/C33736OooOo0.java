package oO0o0Oo;

import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: oO0o0Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33736OooOo0 implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f121597OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f121598OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OooOo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m80623f = "Errors.kt", m80624l = {109, 110}, m80625m = "collect")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121599OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121600OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public C33736OooOo0 f121601OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public InterfaceC33723OooO0oO f121603OooOoOO;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121600OooOo0o = obj;
            this.f121599OooOo |= Integer.MIN_VALUE;
            return C33736OooOo0.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33736OooOo0(InterfaceC33721OooO0o interfaceC33721OooO0o, InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
        this.f121598OooOo0o = interfaceC33721OooO0o;
        this.f121597OooOo = (AbstractC32476OooO) interfaceC32510OooOOo0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r2.invoke(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        OooO00o oooO00o;
        C33736OooOo0 c33736OooOo0;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121599OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121599OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objOooO0o = oooO00o.f121600OooOo0o;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121599OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            oooO00o.f121601OooOoO = this;
            oooO00o.f121603OooOoOO = interfaceC33723OooO0oO;
            oooO00o.f121599OooOo = 1;
            objOooO0o = C25252OooO0Oo.OooO0o(this.f121598OooOo0o, interfaceC33723OooO0oO, oooO00o);
            if (objOooO0o != obj) {
                c33736OooOo0 = this;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC33723OooO0oO = oooO00o.f121603OooOoOO;
        c33736OooOo0 = oooO00o.f121601OooOoO;
        C32446OooOOOo.OooO0O0(objOooO0o);
        Throwable th = (Throwable) objOooO0o;
        if (th != null) {
            ?? r2 = c33736OooOo0.f121597OooOo;
            oooO00o.f121601OooOoO = null;
            oooO00o.f121603OooOoOO = null;
            oooO00o.f121599OooOo = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
