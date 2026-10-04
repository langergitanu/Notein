package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO0o0Oo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33760OoooO00<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f121717OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f121718OooOo0o;

    /* JADX INFO: renamed from: oO0o0Oo.OoooO00$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m80623f = "Transform.kt", m80624l = {50, 51}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121719OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121720OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Object f121721OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public InterfaceC33723OooO0oO f121723OooOoOO;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121720OooOo0o = obj;
            this.f121719OooOo |= Integer.MIN_VALUE;
            return C33760OoooO00.this.emit(null, this);
        }
    }

    public C33760OoooO00(InterfaceC33723OooO0oO interfaceC33723OooO0oO, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        this.f121718OooOo0o = interfaceC33723OooO0oO;
        this.f121717OooOo = interfaceC32508OooOOOo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r6.emit(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, oO0O000o.OooOOOo] */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        Object obj;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121719OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121719OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f121720OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121719OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            oooO00o.f121721OooOoO = t;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f121718OooOo0o;
            oooO00o.f121723OooOoOO = interfaceC33723OooO0oO2;
            oooO00o.f121719OooOo = 1;
            if (this.f121717OooOo.invoke(t, oooO00o) != enumC32485OooO00o) {
                obj = t;
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
            return C32460OooOooO.f116667OooO00o;
        }
        InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = oooO00o.f121723OooOoOO;
        obj = oooO00o.f121721OooOoO;
        C32446OooOOOo.OooO0O0(obj2);
        interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
        oooO00o.f121721OooOoO = null;
        oooO00o.f121723OooOoOO = null;
        oooO00o.f121719OooOo = 2;
    }
}
