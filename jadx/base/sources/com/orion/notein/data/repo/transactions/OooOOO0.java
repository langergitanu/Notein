package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.repo.transactions.GoogleBillingDataSource;
import com.orion.notein.domain.models.transactions.google.ProductPurchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$inAppPurchasesFromServer$1", m80623f = "GoogleBillingDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends ProductPurchase>, List<? extends GoogleBillingDataSource.TinyPurchase>, Continuation<? super List<? extends ProductPurchase>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f70088OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f70089OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends ProductPurchase> list, List<? extends GoogleBillingDataSource.TinyPurchase> list2, Continuation<? super List<? extends ProductPurchase>> continuation) {
        OooOOO0 oooOOO0 = new OooOOO0(3, continuation);
        oooOOO0.f70089OooOo0o = list;
        oooOOO0.f70088OooOo = list2;
        return oooOOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f70089OooOo0o;
        List list2 = this.f70088OooOo;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("GoogleBillingDataSource");
        c20358OooO00o.OooO0o0("inAppPurchasesFromServer: cache = " + list + ", purchases = " + list2, new Object[0]);
        List list3 = list;
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list3, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (Object obj2 : list3) {
            linkedHashMap.put(((ProductPurchase) obj2).getPurchaseToken(), obj2);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            GoogleBillingDataSource.TinyPurchase tinyPurchase = (GoogleBillingDataSource.TinyPurchase) obj3;
            if (tinyPurchase.isPurchased() && tinyPurchase.isAcknowledged()) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ProductPurchase productPurchase = (ProductPurchase) linkedHashMap.get(((GoogleBillingDataSource.TinyPurchase) it.next()).getPurchaseToken());
            if (productPurchase != null) {
                arrayList2.add(productPurchase);
            }
        }
        return arrayList2;
    }
}
