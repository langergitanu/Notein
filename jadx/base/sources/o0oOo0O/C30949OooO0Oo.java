package o0oOo0O;

import com.orion.notein.data.repo.transactions.C22941OooOooo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0oOo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30949OooO0Oo<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30950OooO0o f110604OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f110605OooOo0o;

    /* JADX INFO: renamed from: o0oOo0O.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.coupon.UserCouponsViewModel$special$$inlined$map$1$2", m80623f = "UserCouponsViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f110606OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f110607OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f110607OooOo0o = obj;
            this.f110606OooOo |= Integer.MIN_VALUE;
            return C30949OooO0Oo.this.emit(null, this);
        }
    }

    public C30949OooO0Oo(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30950OooO0o c30950OooO0o) {
        this.f110605OooOo0o = interfaceC33723OooO0oO;
        this.f110604OooOo = c30950OooO0o;
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
            int i = oooO00o.f110606OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f110606OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f110607OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f110606OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            String uid = (String) obj;
            o0OO0o.OooO0OO oooO0OO = this.f110604OooOo.f110609OooO0Oo;
            oooO0OO.getClass();
            OooOOO0.OooO0oO(uid, "uid");
            o0OO0o.OooO0O0 oooO0O0 = (o0OO0o.OooO0O0) oooO0OO.f92717OooO00o;
            C22941OooOooo c22941OooOooo = new C22941OooOooo(oooO0O0.f92715OooO00o.OooO00o(uid), oooO0O0, 1);
            oooO00o.f110606OooOo = 1;
            if (this.f110605OooOo0o.emit(c22941OooOooo, oooO00o) == enumC32485OooO00o) {
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
