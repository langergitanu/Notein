package o0oOOoo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0oOOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30859OooO0OO<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30861OooO0o0 f110317OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f110318OooOo0o;

    /* JADX INFO: renamed from: o0oOOoo.OooO0OO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.viewmodel.GlobalSettingsFastTranslationViewModel$special$$inlined$map$1$2", m80623f = "GlobalSettingsFastTranslationViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f110319OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f110320OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f110320OooOo0o = obj;
            this.f110319OooOo |= Integer.MIN_VALUE;
            return C30859OooO0OO.this.emit(null, this);
        }
    }

    public C30859OooO0OO(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30861OooO0o0 c30861OooO0o0) {
        this.f110318OooOo0o = interfaceC33723OooO0oO;
        this.f110317OooOo = c30861OooO0o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f110319OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f110319OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f110320OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f110319OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            String str = (String) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95015OooOOOO);
            if (str == null) {
                str = this.f110317OooOo.f110327OooO0o;
            }
            oooO00o.f110319OooOo = 1;
            if (this.f110318OooOo0o.emit(str, oooO00o) == enumC32485OooO00o) {
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
