package o0o0OOoo;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.p607ui.pay.google.GooglePayDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0Oo00o.C28026OooO0OO;
import o0oOoOo.C31042OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0OOoo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$cancelSubscriptionAndUpgrade$1", m80623f = "GooglePayDialogFragment.kt", m80624l = {393}, m80625m = "invokeSuspend")
public final class C30574OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ GooglePayDialogFragment f109381OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109382OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C31042OooOOO0 f109383OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteinGoogleSubscriptionPurchase f109384OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30574OooO0o(GooglePayDialogFragment googlePayDialogFragment, NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase, C31042OooOOO0 c31042OooOOO0, Continuation<? super C30574OooO0o> continuation) {
        super(2, continuation);
        this.f109381OooOo = googlePayDialogFragment;
        this.f109384OooOoO0 = noteinGoogleSubscriptionPurchase;
        this.f109383OooOoO = c31042OooOOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30574OooO0o(this.f109381OooOo, this.f109384OooOoO0, this.f109383OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30574OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C27174OooO0O0 c27174OooO0O0;
        String productId;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109382OooOo0o;
        GooglePayDialogFragment googlePayDialogFragment = this.f109381OooOo;
        NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = this.f109384OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30584OooOOOo c30584OooOOOoOooo0 = googlePayDialogFragment.Oooo0();
            this.f109382OooOo0o = 1;
            if (((String) c30584OooOOOoOooo0.f109399OooO.getValue()) == null) {
                c27174OooO0O0 = new C27174OooO0O0(false, null, "199998", "User id is null", 2);
            } else {
                NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = (NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem) oOo000Oo.OooOo.Oooo(noteinGoogleSubscriptionPurchase.getLineItems());
                if (subscriptionPurchaseLineItem == null || (productId = subscriptionPurchaseLineItem.getProductId()) == null) {
                    c27174OooO0O0 = new C27174OooO0O0(false, null, "399999", "Product id is null", 2);
                } else {
                    obj = c30584OooOOOoOooo0.f109400OooO0Oo.OooO(productId, noteinGoogleSubscriptionPurchase.getPurchaseToken(), this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                }
            }
            obj = c27174OooO0O0;
            if (obj == enumC32485OooO00o) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) obj;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO00o(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "GooglePayDialogFragment", "cancelSubscription response: ", c27174OooO0O02), new Object[0]);
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O02.getErrorCode(), "0") && kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O02.OooO0O0(), Boolean.TRUE)) {
            googlePayDialogFragment.Oooo0().OooO0o(this.f109383OooOoO);
            return C32460OooOooO.f116667OooO00o;
        }
        if (!googlePayDialogFragment.Oooo0().f109418OooOo0O.get()) {
            List<NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem> lineItems = noteinGoogleSubscriptionPurchase.getLineItems();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(lineItems, 10));
            Iterator<T> it = lineItems.iterator();
            while (it.hasNext()) {
                arrayList.add(((NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem) it.next()).getProductId());
            }
            String str = (String) oOo000Oo.OooOo.Oooo(arrayList);
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(googlePayDialogFragment), str != null ? new C30581OooOOO(str) : new C30581OooOOO(null));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
