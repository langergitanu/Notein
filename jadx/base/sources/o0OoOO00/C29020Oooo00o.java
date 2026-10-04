package o0OoOO00;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoOO00.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29020Oooo00o<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102817OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f102818OooOo0o;

    /* JADX INFO: renamed from: o0OoOO00.Oooo00o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$special$$inlined$map$1$2", m80623f = "AddPageViewModel.kt", m80624l = {51, 50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f102819OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f102820OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public InterfaceC33723OooO0oO f102822OooOoO0;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f102820OooOo0o = obj;
            this.f102819OooOo |= Integer.MIN_VALUE;
            return C29020Oooo00o.this.emit(null, this);
        }
    }

    public C29020Oooo00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO) {
        this.f102818OooOo0o = interfaceC33723OooO0oO;
        this.f102817OooOo = oooO0OO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f102819OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f102819OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objOooOoO0 = oooO00o.f102820OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f102819OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOoO0);
            C27449o00O0OoO c27449o00O0OoO = this.f102817OooOo.f73852OooO0Oo;
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f102818OooOo0o;
            oooO00o.f102822OooOoO0 = interfaceC33723OooO0oO2;
            oooO00o.f102819OooOo = 1;
            objOooOoO0 = c27449o00O0OoO.OooOoO0((String) obj, oooO00o);
            if (objOooOoO0 != obj2) {
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOoO0);
            return C32460OooOooO.f116667OooO00o;
        }
        InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = oooO00o.f102822OooOoO0;
        C32446OooOOOo.OooO0O0(objOooOoO0);
        interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooOoO0);
        oooO00o.f102822OooOoO0 = null;
        oooO00o.f102819OooOo = 2;
    }
}
