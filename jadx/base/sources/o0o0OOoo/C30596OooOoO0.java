package o0o0OOoo;

import androidx.lifecycle.o0OoOo0;
import com.android.billingclient.api.Purchase;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OOoo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$verifyPurchases$1", m80623f = "GooglePayViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30596OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30584OooOOOo f109479OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List<Purchase> f109480OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30596OooOoO0(List<? extends Purchase> list, C30584OooOOOo c30584OooOOOo, Continuation<? super C30596OooOoO0> continuation) {
        super(2, continuation);
        this.f109480OooOo0o = list;
        this.f109479OooOo = c30584OooOOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30596OooOoO0(this.f109480OooOo0o, this.f109479OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30596OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        for (Purchase purchase : this.f109480OooOo0o) {
            C30584OooOOOo c30584OooOOOo = this.f109479OooOo;
            c30584OooOOOo.getClass();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PayViewModel");
            c20358OooO00o.OooO0o0("acknowledgePurchase: " + purchase + ". purchaseState: " + purchase.OooO0O0() + ", isAcknowledged: " + purchase.OooO0Oo(), new Object[0]);
            List list = (List) c30584OooOOOo.f109411OooOOOo.getValue();
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (purchase.OooO00o().contains(((com.android.billingclient.api.OooOO0O) next).f66947OooO0OO)) {
                        break;
                    }
                }
                com.android.billingclient.api.OooOO0O oooOO0O = (com.android.billingclient.api.OooOO0O) next;
                str = oooOO0O != null ? oooOO0O.f66948OooO0Oo : null;
            }
            if (str == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("PayViewModel");
                c20358OooO00o2.OooO0OO("productType is null. " + purchase, new Object[0]);
            } else {
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30584OooOOOo), null, null, new C30589OooOOo0(c30584OooOOOo, purchase, str, null), 3);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
