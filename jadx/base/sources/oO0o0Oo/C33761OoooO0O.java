package oO0o0Oo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33761OoooO0O<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooOo00 f121724OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<Object> f121725OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO<Object> f121726OooOoO0;

    /* JADX INFO: renamed from: oO0o0Oo.OoooO0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", m80623f = "Transform.kt", m80624l = {105, 106}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C24034Oooo00O f121727OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33761OoooO0O f121728OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C33761OoooO0O<T> f121729OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f121730OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f121731OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(C33761OoooO0O<? super T> c33761OoooO0O, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f121729OooOoO = c33761OoooO0O;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121730OooOoO0 = obj;
            this.f121731OooOoOO |= Integer.MIN_VALUE;
            return this.f121729OooOoO.emit(null, this);
        }
    }

    public C33761OoooO0O(C24034Oooo00O c24034Oooo00O, com.orion.notein.p607ui.noteeditor.OooOo00 oooOo00, InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f121725OooOo0o = c24034Oooo00O;
        this.f121724OooOo = oooOo00;
        this.f121726OooOoO0 = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        C24034Oooo00O<Object> c24034Oooo00O;
        C33761OoooO0O<T> c33761OoooO0O;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121731OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121731OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        }
        T t2 = (T) oooO00o.f121730OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121731OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(t2);
            C24034Oooo00O<Object> c24034Oooo00O2 = this.f121725OooOo0o;
            Object obj = c24034Oooo00O2.f80942OooOo0o;
            oooO00o.f121728OooOo0o = this;
            oooO00o.f121727OooOo = c24034Oooo00O2;
            oooO00o.f121731OooOoOO = 1;
            Object objInvoke = this.f121724OooOo.invoke(obj, t, oooO00o);
            if (objInvoke != enumC32485OooO00o) {
                t2 = (T) objInvoke;
                c24034Oooo00O = c24034Oooo00O2;
                c33761OoooO0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(t2);
            return C32460OooOooO.f116667OooO00o;
        }
        c24034Oooo00O = oooO00o.f121727OooOo;
        c33761OoooO0O = oooO00o.f121728OooOo0o;
        C32446OooOOOo.OooO0O0(t2);
        c24034Oooo00O.f80942OooOo0o = t2;
        InterfaceC33723OooO0oO<Object> interfaceC33723OooO0oO = c33761OoooO0O.f121726OooOoO0;
        Object obj2 = c33761OoooO0O.f121725OooOo0o.f80942OooOo0o;
        oooO00o.f121728OooOo0o = null;
        oooO00o.f121727OooOo = null;
        oooO00o.f121731OooOoOO = 2;
    }
}
