package o0OoO0Oo;

import com.orion.notein.domain.models.transactions.Product;
import com.orion.notein.domain.models.transactions.PurchaseHintCollection;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OoO0Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.membership.plan.MembershipPlanViewModel$hints$1", m80623f = "MembershipPlanViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28635OooO0oo extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends Product>, Integer, PurchaseHintCollection, Continuation<? super List<? extends String>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f101501OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f101502OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ PurchaseHintCollection f101503OooOoO0;

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends Product> list, Integer num, PurchaseHintCollection purchaseHintCollection, Continuation<? super List<? extends String>> continuation) {
        int iIntValue = num.intValue();
        C28635OooO0oo c28635OooO0oo = new C28635OooO0oo(4, continuation);
        c28635OooO0oo.f101502OooOo0o = list;
        c28635OooO0oo.f101501OooOo = iIntValue;
        c28635OooO0oo.f101503OooOoO0 = purchaseHintCollection;
        return c28635OooO0oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f101502OooOo0o;
        int i = this.f101501OooOo;
        PurchaseHintCollection purchaseHintCollection = this.f101503OooOoO0;
        List<String> generalHints = purchaseHintCollection.getGeneralHints();
        Product product = (Product) OooOo.OoooO00(i, list);
        String id = product != null ? product.getId() : null;
        List<String> list2 = id != null ? purchaseHintCollection.getCommodityHints().get(id) : null;
        if (list2 == null) {
            list2 = C34434OooOoO.f123453OooOo0o;
        }
        return OooOo.OooooOO(generalHints, list2);
    }
}
