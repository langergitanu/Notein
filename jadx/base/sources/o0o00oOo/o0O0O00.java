package o0o00oOo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class o0O0O00<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f107113OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$special$$inlined$map$3$2", m80623f = "NoteListViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f107114OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f107115OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f107115OooOo0o = obj;
            this.f107114OooOo |= Integer.MIN_VALUE;
            return o0O0O00.this.emit(null, this);
        }
    }

    public o0O0O00(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f107113OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        com.orion.notein.p607ui.p609vo.OooO00o oooO00oValueOf;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f107114OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f107114OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f107115OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f107114OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            try {
                String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95008OooO0oO);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                oooO00oValueOf = com.orion.notein.p607ui.p609vo.OooO00o.valueOf(str);
            } catch (Exception unused) {
                oooO00oValueOf = com.orion.notein.p607ui.p609vo.OooO00o.f80085OooOoO;
            }
            oooO00o.f107114OooOo = 1;
            if (this.f107113OooOo0o.emit(oooO00oValueOf, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
