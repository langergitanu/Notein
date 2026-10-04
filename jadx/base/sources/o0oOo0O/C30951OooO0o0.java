package o0oOo0O;

import com.orion.notein.domain.models.transactions.Coupon;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31034OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0oOo0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30951OooO0o0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f110612OooOo0o;

    /* JADX INFO: renamed from: o0oOo0O.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.coupon.UserCouponsViewModel$special$$inlined$map$2$2", m80623f = "UserCouponsViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f110613OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f110614OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f110614OooOo0o = obj;
            this.f110613OooOo |= Integer.MIN_VALUE;
            return C30951OooO0o0.this.emit(null, this);
        }
    }

    public C30951OooO0o0(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f110612OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) throws ParseException {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f110613OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f110613OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f110614OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f110613OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            ArrayList arrayList = new ArrayList();
            for (Coupon coupon : (List) obj) {
                C31034OooO0o c31034OooO0o = coupon.getStatus() != 0 ? null : new C31034OooO0o(coupon.getId(), coupon.getType(), coupon.getProductCode(), coupon.getValue(), coupon.getEffectAtMillis(), coupon.getExpireAtMillis());
                if (c31034OooO0o != null) {
                    arrayList.add(c31034OooO0o);
                }
            }
            oooO00o.f110613OooOo = 1;
            if (this.f110612OooOo0o.emit(arrayList, oooO00o) == enumC32485OooO00o) {
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
