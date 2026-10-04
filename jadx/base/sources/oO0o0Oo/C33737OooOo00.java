package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OoO.C33808OooOo;

/* JADX INFO: renamed from: oO0o0Oo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33737OooOo00 implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f121604OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f121605OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OooOo00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m80623f = "Emitters.kt", m80624l = {112, 116}, m80625m = "collect")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121606OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121607OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public C33737OooOo00 f121608OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public InterfaceC33723OooO0oO f121610OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public C33808OooOo f121611OooOoo0;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121607OooOo0o = obj;
            this.f121606OooOo |= Integer.MIN_VALUE;
            return C33737OooOo00.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33737OooOo00(InterfaceC32508OooOOOo interfaceC32508OooOOOo, InterfaceC33721OooO0o interfaceC33721OooO0o) {
        this.f121605OooOo0o = (AbstractC32476OooO) interfaceC32508OooOOOo;
        this.f121604OooOo = interfaceC33721OooO0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r7.collect(r2, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) throws Throwable {
        OooO00o oooO00o;
        Throwable th;
        C33808OooOo c33808OooOo;
        C33737OooOo00 c33737OooOo00;
        InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121606OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121606OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj = oooO00o.f121607OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121606OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33808OooOo c33808OooOo2 = new C33808OooOo(interfaceC33723OooO0oO, oooO00o.getContext());
            try {
                ?? r2 = this.f121605OooOo0o;
                oooO00o.f121608OooOoO = this;
                oooO00o.f121610OooOoOO = interfaceC33723OooO0oO;
                oooO00o.f121611OooOoo0 = c33808OooOo2;
                oooO00o.f121606OooOo = 1;
                if (r2.invoke(c33808OooOo2, oooO00o) != enumC32485OooO00o) {
                    c33737OooOo00 = this;
                    interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                    c33808OooOo = c33808OooOo2;
                    c33808OooOo.releaseIntercepted();
                    InterfaceC33721OooO0o interfaceC33721OooO0o = c33737OooOo00.f121604OooOo;
                    oooO00o.f121608OooOoO = null;
                    oooO00o.f121610OooOoOO = null;
                    oooO00o.f121611OooOoo0 = null;
                    oooO00o.f121606OooOo = 2;
                }
                return enumC32485OooO00o;
            } catch (Throwable th2) {
                th = th2;
                c33808OooOo = c33808OooOo2;
                c33808OooOo.releaseIntercepted();
                throw th;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        c33808OooOo = oooO00o.f121611OooOoo0;
        interfaceC33723OooO0oO2 = oooO00o.f121610OooOoOO;
        c33737OooOo00 = oooO00o.f121608OooOoO;
        try {
            C32446OooOOOo.OooO0O0(obj);
            c33808OooOo.releaseIntercepted();
            InterfaceC33721OooO0o interfaceC33721OooO0o2 = c33737OooOo00.f121604OooOo;
            oooO00o.f121608OooOoO = null;
            oooO00o.f121610OooOoOO = null;
            oooO00o.f121611OooOoo0 = null;
            oooO00o.f121606OooOo = 2;
        } catch (Throwable th3) {
            th = th3;
            c33808OooOo.releaseIntercepted();
            throw th;
        }
    }
}
