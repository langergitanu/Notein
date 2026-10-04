package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.Purchase;
import com.orion.notein.data.repo.transactions.GoogleBillingDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34449Oooo0oo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$getCachedPurchasesAsync$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {200}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends GoogleBillingDataSource.TinyPurchase>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70079OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70080OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(GoogleBillingDataSource googleBillingDataSource, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f70079OooOo = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0O(this.f70079OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends GoogleBillingDataSource.TinyPurchase>> continuation) {
        return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        GoogleBillingDataSource.TinyPurchase tinyPurchaseOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70080OooOo0o;
        GoogleBillingDataSource googleBillingDataSource = this.f70079OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = googleBillingDataSource.f70023OooO0Oo.getData();
            this.f70080OooOo0o = 1;
            obj = C25252OooO0Oo.OooOOo(data, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Set setOooOO0 = (Set) ((AbstractC24338OooO0o0) obj).OooO0OO(GoogleBillingDataSource.f70017OooOoOO);
        if (setOooOO0 == null) {
            setOooOO0 = C34449Oooo0oo.OooOO0("");
        }
        try {
            Set<String> set = setOooOO0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(set, 10));
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
            return arrayList;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o.OooO0OO("failed to parse json: " + setOooOO0 + ". " + e.getMessage(), new Object[0]);
            return C34434OooOoO.f123453OooOo0o;
        }
    }
}
