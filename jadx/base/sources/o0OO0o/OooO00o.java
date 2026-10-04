package o0OO0o;

import com.orion.notein.data.p602db.entity.CouponEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f92710OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f92711OooOo0o;

    /* JADX INFO: renamed from: o0OO0o.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.coupon.CouponLocalDataSource$getCouponsByUser$$inlined$map$1$2", m80623f = "CouponLocalDataSource.kt", m80624l = {50}, m80625m = "emit")
    public static final class C19816OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f92712OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f92713OooOo0o;

        public C19816OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f92713OooOo0o = obj;
            this.f92712OooOo |= Integer.MIN_VALUE;
            return OooO00o.this.emit(null, this);
        }
    }

    public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, OooO0O0 oooO0O0) {
        this.f92711OooOo0o = interfaceC33723OooO0oO;
        this.f92710OooOo = oooO0O0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C19816OooO00o c19816OooO00o;
        if (continuation instanceof C19816OooO00o) {
            c19816OooO00o = (C19816OooO00o) continuation;
            int i = c19816OooO00o.f92712OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c19816OooO00o.f92712OooOo = i - Integer.MIN_VALUE;
            } else {
                c19816OooO00o = new C19816OooO00o(continuation);
            }
        }
        Object obj2 = c19816OooO00o.f92713OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c19816OooO00o.f92712OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.f92710OooOo.f92716OooO0O0.toCoupon((CouponEntity) it.next()));
            }
            c19816OooO00o.f92712OooOo = 1;
            if (this.f92711OooOo0o.emit(arrayList, c19816OooO00o) == enumC32485OooO00o) {
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
