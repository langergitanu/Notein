package oO0o0Oo;

import kotlin.coroutines.Continuation;
import o0000o0O.C24255OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OoO.C33790OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33744OooOoo0 implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24255OooOOOo.OooO0O0 f121642OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33737OooOo00 f121643OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OooOoo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m80623f = "Limit.kt", m80624l = {120}, m80625m = "collect")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121644OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121645OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public C33743OooOoo f121646OooOoO;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121645OooOo0o = obj;
            this.f121644OooOo |= Integer.MIN_VALUE;
            return C33744OooOoo0.this.collect(null, this);
        }
    }

    public C33744OooOoo0(C33737OooOo00 c33737OooOo00, C24255OooOOOo.OooO0O0 oooO0O0) {
        this.f121643OooOo0o = c33737OooOo00;
        this.f121642OooOo = oooO0O0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        C33743OooOoo c33743OooOoo;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121644OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121644OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj = oooO00o.f121645OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121644OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33737OooOo00 c33737OooOo00 = this.f121643OooOo0o;
            C33743OooOoo c33743OooOoo2 = new C33743OooOoo(this.f121642OooOo, interfaceC33723OooO0oO);
            try {
                oooO00o.f121646OooOoO = c33743OooOoo2;
                oooO00o.f121644OooOo = 1;
                if (c33737OooOo00.collect(c33743OooOoo2, oooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } catch (C33790OooO00o e) {
                e = e;
                c33743OooOoo = c33743OooOoo2;
                if (e.f121821OooOo0o != c33743OooOoo) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33743OooOoo = oooO00o.f121646OooOoO;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (C33790OooO00o e2) {
                e = e2;
                if (e.f121821OooOo0o != c33743OooOoo) {
                    throw e;
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
