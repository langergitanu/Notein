package o0oOo00;

import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27321Oooo0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30938OooOOo f110552OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f110553OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditViewModel$special$$inlined$map$1$2", m80623f = "StickerCollectionEditViewModel.kt", m80624l = {51, 50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f110554OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f110555OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public InterfaceC33723OooO0oO f110557OooOoO0;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f110555OooOo0o = obj;
            this.f110554OooOo |= Integer.MIN_VALUE;
            return OooOOO0.this.emit(null, this);
        }
    }

    public OooOOO0(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30938OooOOo c30938OooOOo) {
        this.f110553OooOo0o = interfaceC33723OooO0oO;
        this.f110552OooOo = c30938OooOOo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L22;
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
            int i = oooO00o.f110554OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f110554OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objOooO = oooO00o.f110555OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f110554OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO);
            C30938OooOOo c30938OooOOo = this.f110552OooOo;
            InterfaceC27321Oooo0o interfaceC27321Oooo0o = c30938OooOOo.f110575OooO0o0;
            String strOooO0Oo = c30938OooOOo.f110574OooO0o.OooO0Oo();
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = this.f110553OooOo0o;
            oooO00o.f110557OooOoO0 = interfaceC33723OooO0oO2;
            oooO00o.f110554OooOo = 1;
            objOooO = interfaceC27321Oooo0o.OooO((String) obj, strOooO0Oo, oooO00o);
            if (objOooO != obj2) {
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO);
            return C32460OooOooO.f116667OooO00o;
        }
        InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = oooO00o.f110557OooOoO0;
        C32446OooOOOo.OooO0O0(objOooO);
        interfaceC33723OooO0oO = interfaceC33723OooO0oO3;
        oooO00o.f110557OooOoO0 = null;
        oooO00o.f110554OooOo = 2;
    }
}
