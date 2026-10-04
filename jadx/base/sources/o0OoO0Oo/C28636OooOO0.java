package o0OoO0Oo;

import com.orion.notein.data.repo.transactions.o000000O;
import com.orion.notein.domain.models.transactions.PurchaseHintCollection;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoO0Oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.membership.plan.MembershipPlanViewModel$purchaseHintCollection$1", m80623f = "MembershipPlanViewModel.kt", m80624l = {109, 113}, m80625m = "invokeSuspend")
public final class C28636OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super PurchaseHintCollection>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f101504OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101505OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28639OooOOO0 f101506OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28636OooOO0(C28639OooOOO0 c28639OooOOO0, Continuation<? super C28636OooOO0> continuation) {
        super(2, continuation);
        this.f101506OooOoO0 = c28639OooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28636OooOO0 c28636OooOO0 = new C28636OooOO0(this.f101506OooOoO0, continuation);
        c28636OooOO0.f101504OooOo = obj;
        return c28636OooOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super PurchaseHintCollection> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C28636OooOO0) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [oO0o0Oo.OooO0oO] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PurchaseHintCollection purchaseHintCollection;
        ?? r1;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r12 = this.f101505OooOo0o;
        try {
        } catch (Exception unused) {
            purchaseHintCollection = new PurchaseHintCollection(null, null, 3, null);
            r1 = r12;
        }
        if (r12 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f101504OooOo;
            o000000O o000000o2 = this.f101506OooOoO0.f101512OooO0Oo;
            this.f101504OooOo = interfaceC33723OooO0oO;
            this.f101505OooOo0o = 1;
            obj = o000000o2.OooO0O0(this);
            r12 = interfaceC33723OooO0oO;
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            InterfaceC33723OooO0oO interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f101504OooOo;
            C32446OooOOOo.OooO0O0(obj);
            r12 = interfaceC33723OooO0oO2;
        }
        purchaseHintCollection = (PurchaseHintCollection) obj;
        r1 = r12;
        this.f101504OooOo = null;
        this.f101505OooOo0o = 2;
    }
}
