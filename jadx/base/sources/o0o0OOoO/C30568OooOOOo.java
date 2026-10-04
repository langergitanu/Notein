package o0o0OOoO;

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

/* JADX INFO: renamed from: o0o0OOoO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel$verifyPurchases$1", m80623f = "AiQuotaPayViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30568OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30558OooO0oo f109370OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ List<Purchase> f109371OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30568OooOOOo(List<? extends Purchase> list, C30558OooO0oo c30558OooO0oo, Continuation<? super C30568OooOOOo> continuation) {
        super(2, continuation);
        this.f109371OooOo0o = list;
        this.f109370OooOo = c30558OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30568OooOOOo(this.f109371OooOo0o, this.f109370OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30568OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
        for (Purchase purchase : this.f109371OooOo0o) {
            C30558OooO0oo c30558OooO0oo = this.f109370OooOo;
            c30558OooO0oo.getClass();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
            c20358OooO00o.OooO0o0("acknowledgePurchase: " + purchase + ". purchaseState: " + purchase.OooO0O0() + ", isAcknowledged: " + purchase.OooO0Oo(), new Object[0]);
            List list = (List) c30558OooO0oo.f109308OooOOOo.getValue();
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
                c20358OooO00o2.OooOOO0("AiQuotaPayViewModel");
                c20358OooO00o2.OooO0OO("productType is null. " + purchase, new Object[0]);
            } else {
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30558OooO0oo), null, null, new C30550OooO(c30558OooO0oo, purchase, str, null), 3);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
