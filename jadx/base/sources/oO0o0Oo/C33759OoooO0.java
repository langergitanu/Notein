package oO0o0Oo;

import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OoO0oo.C28944o00oO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33759OoooO0 implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28944o00oO00o f121708OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo.OooO0O0 f121709OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooOo00 f121710OooOoO0;

    /* JADX INFO: renamed from: oO0o0Oo.OoooO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", m80623f = "Transform.kt", m80624l = {110, 111}, m80625m = "collect")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121711OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f121712OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public C33759OoooO0 f121713OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public InterfaceC33723OooO0oO f121715OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public C24034Oooo00O f121716OooOoo0;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f121712OooOo0o = obj;
            this.f121711OooOo |= Integer.MIN_VALUE;
            return C33759OoooO0.this.collect(null, this);
        }
    }

    public C33759OoooO0(C23344OooOOo.OooO0O0 oooO0O0, C28944o00oO00o c28944o00oO00o, com.orion.notein.p607ui.noteeditor.OooOo00 oooOo00) {
        this.f121709OooOo0o = oooO0O0;
        this.f121708OooOo = c28944o00oO00o;
        this.f121710OooOoO0 = oooOo00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r8.collect(r5, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.orion.notein.ui.noteeditor.OooOOo$OooO0O0, java.lang.Object] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        C33759OoooO0 c33759OoooO0;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        C24034Oooo00O c24034Oooo00O;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f121711OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f121711OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj = oooO00o.f121712OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f121711OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
            ?? r2 = this.f121709OooOo0o;
            c24034Oooo00O2.f80942OooOo0o = r2;
            oooO00o.f121713OooOoO = this;
            oooO00o.f121715OooOoOO = interfaceC33723OooO0oO;
            oooO00o.f121716OooOoo0 = c24034Oooo00O2;
            oooO00o.f121711OooOo = 1;
            if (interfaceC33723OooO0oO.emit(r2, oooO00o) != enumC32485OooO00o) {
                c33759OoooO0 = this;
                interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                c24034Oooo00O = c24034Oooo00O2;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        c24034Oooo00O = oooO00o.f121716OooOoo0;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = oooO00o.f121715OooOoOO;
        c33759OoooO0 = oooO00o.f121713OooOoO;
        C32446OooOOOo.OooO0O0(obj);
        interfaceC33723OooO0oO2 = interfaceC33723OooO0oO3;
        C28944o00oO00o c28944o00oO00o = c33759OoooO0.f121708OooOo;
        C33761OoooO0O c33761OoooO0O = new C33761OoooO0O(c24034Oooo00O, c33759OoooO0.f121710OooOoO0, interfaceC33723OooO0oO2);
        oooO00o.f121713OooOoO = null;
        oooO00o.f121715OooOoOO = null;
        oooO00o.f121716OooOoo0 = null;
        oooO00o.f121711OooOo = 2;
    }
}
