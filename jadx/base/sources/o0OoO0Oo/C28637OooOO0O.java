package o0OoO0Oo;

import com.orion.notein.data.repo.transactions.o000000O;
import com.orion.notein.domain.models.transactions.Product;
import com.orion.notein.domain.models.transactions.TransactionsProductResult;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OoO0Oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.membership.plan.MembershipPlanViewModel$rawProductsFlow$1", m80623f = "MembershipPlanViewModel.kt", m80624l = {37, 40}, m80625m = "invokeSuspend")
public final class C28637OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super List<? extends Product>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f101507OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101508OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28639OooOOO0 f101509OooOoO0;

    /* JADX INFO: renamed from: o0OoO0Oo.OooOO0O$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(((Product) t).getPosition()), Integer.valueOf(((Product) t2).getPosition()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28637OooOO0O(C28639OooOOO0 c28639OooOOO0, Continuation<? super C28637OooOO0O> continuation) {
        super(2, continuation);
        this.f101509OooOoO0 = c28639OooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28637OooOO0O c28637OooOO0O = new C28637OooOO0O(this.f101509OooOoO0, continuation);
        c28637OooOO0O.f101507OooOo = obj;
        return c28637OooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Product>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C28637OooOO0O) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101508OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f101507OooOo;
            o000000O o000000o2 = this.f101509OooOoO0.f101512OooO0Oo;
            this.f101507OooOo = interfaceC33723OooO0oO;
            this.f101508OooOo0o = 1;
            obj = o000000o2.OooO00o(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f101507OooOo;
        C32446OooOOOo.OooO0O0(obj);
        List listO00O0O = OooOo.o00O0O(((TransactionsProductResult) obj).getProductList(), new OooO00o());
        this.f101507OooOo = null;
        this.f101508OooOo0o = 2;
    }
}
