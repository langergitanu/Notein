package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.Purchase;
import com.orion.notein.data.p602db.entity.PlayPurchaseServerEntity;
import com.orion.notein.data.repo.transactions.GoogleBillingDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34449Oooo0oo;
import oo0oO0.InterfaceC34952o00oo0oO;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$queryLocalPurchaseTokens$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C22931OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends String>>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70110OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22931OooOOoo(GoogleBillingDataSource googleBillingDataSource, Continuation<? super C22931OooOOoo> continuation) {
        super(2, continuation);
        this.f70110OooOo0o = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22931OooOOoo(this.f70110OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends String>> continuation) {
        return ((C22931OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        GoogleBillingDataSource.TinyPurchase tinyPurchaseOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        GoogleBillingDataSource googleBillingDataSource = this.f70110OooOo0o;
        InterfaceC34952o00oo0oO interfaceC34952o00oo0oO = googleBillingDataSource.f70021OooO0O0;
        List<PlayPurchaseServerEntity> listOooO0O0 = interfaceC34952o00oo0oO.OooO0O0("inapp");
        List<PlayPurchaseServerEntity> listOooO0O02 = interfaceC34952o00oo0oO.OooO0O0("subs");
        Set setOooOO0 = (Set) ((AbstractC24338OooO0o0) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new OooOO0(googleBillingDataSource, null))).OooO0OO(GoogleBillingDataSource.f70017OooOoOO);
        if (setOooOO0 == null) {
            setOooOO0 = C34449Oooo0oo.OooOO0("");
        }
        try {
            Set<String> set = setOooOO0;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(set, 10));
            for (String str : set) {
                if (new JSONObject(str).optBoolean("isTiny")) {
                    tinyPurchaseOooO00o = (GoogleBillingDataSource.TinyPurchase) googleBillingDataSource.f70034OooOOOo.fromJson(str, GoogleBillingDataSource.TinyPurchase.class);
                } else {
                    GoogleBillingDataSource.TinyPurchase.Companion companion = GoogleBillingDataSource.TinyPurchase.INSTANCE;
                    Purchase purchase = new Purchase(str, "");
                    companion.getClass();
                    tinyPurchaseOooO00o = GoogleBillingDataSource.TinyPurchase.Companion.OooO00o(purchase);
                }
                arrayList.add(tinyPurchaseOooO00o);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o.OooO0OO("failed to parse json: " + setOooOO0 + ". " + e.getMessage(), new Object[0]);
            arrayList = C34434OooOoO.f123453OooOo0o;
        }
        C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
        List<PlayPurchaseServerEntity> list = listOooO0O0;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PlayPurchaseServerEntity) it.next()).getPurchaseToken());
        }
        c32465OooO0O0OooO0Oo.addAll(arrayList2);
        List<PlayPurchaseServerEntity> list2 = listOooO0O02;
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((PlayPurchaseServerEntity) it2.next()).getPurchaseToken());
        }
        c32465OooO0O0OooO0Oo.addAll(arrayList3);
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((GoogleBillingDataSource.TinyPurchase) it3.next()).getPurchaseToken());
        }
        c32465OooO0O0OooO0Oo.addAll(arrayList4);
        C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
        ArrayList arrayList5 = new ArrayList();
        ListIterator listIterator = c32465OooO0O0OooO0O0.listIterator(0);
        while (true) {
            C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
            if (!c20232OooO0O0.hasNext()) {
                return oOo000Oo.OooOo.Oooo0(arrayList5);
            }
            Object next = c20232OooO0O0.next();
            if (((String) next).length() > 0) {
                arrayList5.add(next);
            }
        }
    }
}
