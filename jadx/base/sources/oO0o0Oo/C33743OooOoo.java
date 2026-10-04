package oO0o0Oo;

import kotlin.coroutines.Continuation;
import o0000o0O.C24255OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OoO.C33790OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33743OooOoo implements InterfaceC33723OooO0oO<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f121635OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24255OooOOOo.OooO0O0 f121636OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OooOoo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", m80623f = "Limit.kt", m80624l = {131, 132}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f121637OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33743OooOoo f121638OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f121640OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public Object f121641OooOoOO;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121637OooOo = obj;
            this.f121640OooOoO0 |= Integer.MIN_VALUE;
            return C33743OooOoo.this.emit(null, this);
        }
    }

    public C33743OooOoo(C24255OooOOOo.OooO0O0 oooO0O0, InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f121636OooOo0o = oooO0O0;
        this.f121635OooOo = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        Object obj2;
        Object obj3;
        C33743OooOoo c33743OooOoo;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121640OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121640OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj4 = oooO00o.f121637OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121640OooOoO0;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj4);
            oooO00o.f121638OooOo0o = this;
            oooO00o.f121641OooOoOO = obj;
            oooO00o.f121640OooOoO0 = 1;
            Object objInvoke = this.f121636OooOo0o.invoke(obj, oooO00o);
            if (objInvoke != enumC32485OooO00o) {
                obj2 = objInvoke;
                obj3 = obj;
                c33743OooOoo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33743OooOoo = oooO00o.f121638OooOo0o;
            C32446OooOOOo.OooO0O0(obj4);
            if (z) {
                throw new C33790OooO00o(c33743OooOoo);
            }
            return C32460OooOooO.f116667OooO00o;
        }
        Object obj5 = oooO00o.f121641OooOoOO;
        C33743OooOoo c33743OooOoo2 = oooO00o.f121638OooOo0o;
        C32446OooOOOo.OooO0O0(obj4);
        obj3 = obj5;
        c33743OooOoo = c33743OooOoo2;
        obj2 = obj4;
        if (((Boolean) obj2).booleanValue()) {
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = c33743OooOoo.f121635OooOo;
            oooO00o.f121638OooOo0o = c33743OooOoo;
            oooO00o.f121641OooOoOO = null;
            oooO00o.f121640OooOoO0 = 2;
        } else {
            z = false;
        }
        if (z) {
        }
    }
}
