package o0O0oooO;

import com.orion.notein.domain.models.NoteinFirebaseUser;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class o000Oo0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26320o0000OoO f90387OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f90388OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.UserViewModel$special$$inlined$map$11$2", m80623f = "UserViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f90389OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f90390OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f90390OooOo0o = obj;
            this.f90389OooOo |= Integer.MIN_VALUE;
            return o000Oo0.this.emit(null, this);
        }
    }

    public o000Oo0(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26320o0000OoO c26320o0000OoO) {
        this.f90388OooOo0o = interfaceC33723OooO0oO;
        this.f90387OooOo = c26320o0000OoO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        String id;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f90389OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f90389OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f90390OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f90389OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) obj;
            String strOooO00o = null;
            if (noteinFirebaseUser != null && (id = noteinFirebaseUser.getId()) != null) {
                try {
                    this.f90387OooOo.f90217OooOOo.getClass();
                    strOooO00o = o0OOo0o.o00000OO.OooO00o(id);
                } catch (IllegalArgumentException e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("UserViewModel");
                    c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to convert user ID to friendly format: ", e.getMessage()), new Object[0]);
                }
            }
            oooO00o.f90389OooOo = 1;
            if (this.f90388OooOo0o.emit(strOooO00o, oooO00o) == enumC32485OooO00o) {
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
