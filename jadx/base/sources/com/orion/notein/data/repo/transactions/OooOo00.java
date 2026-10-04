package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.Purchase;
import com.aspose.words.EditingLanguage;
import com.orion.notein.data.repo.transactions.GoogleBillingDataSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$queryPurchaseRunnable$1$1", m80623f = "GoogleBillingDataSource.kt", m80624l = {1200, 1006, 1025, EditingLanguage.DANISH}, m80625m = "invokeSuspend")
public final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public GoogleBillingDataSource f70125OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f70126OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70127OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f70128OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(GoogleBillingDataSource googleBillingDataSource, Continuation<? super OooOo00> continuation) {
        super(2, continuation);
        this.f70127OooOoO = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo00(this.f70127OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[Catch: all -> 0x00b5, LOOP:0: B:36:0x009c->B:38:0x00a2, LOOP_END, TryCatch #0 {all -> 0x00b5, blocks: (B:31:0x006f, B:35:0x0083, B:36:0x009c, B:38:0x00a2, B:41:0x00b9, B:58:0x0110, B:44:0x00de, B:45:0x00e2, B:47:0x00e8, B:49:0x00f4, B:51:0x00fa, B:65:0x013a, B:27:0x005e), top: B:70:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:31:0x006f, B:35:0x0083, B:36:0x009c, B:38:0x00a2, B:41:0x00b9, B:58:0x0110, B:44:0x00de, B:45:0x00e2, B:47:0x00e8, B:49:0x00f4, B:51:0x00fa, B:65:0x013a, B:27:0x005e), top: B:70:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [oO0o0oOo.OooO00o] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        GoogleBillingDataSource googleBillingDataSource;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        GoogleBillingDataSource googleBillingDataSource2;
        List list;
        List list2;
        ArrayList<GoogleBillingDataSource.TinyPurchase> arrayList;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Map mapOooO0oo;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        ?? r0 = "inapp";
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70128OooOoO0;
        try {
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    googleBillingDataSource = this.f70127OooOoO;
                    interfaceC33895OooO00o = googleBillingDataSource.f70024OooO0o;
                    this.f70126OooOo0o = interfaceC33895OooO00o;
                    this.f70125OooOo = googleBillingDataSource;
                    this.f70128OooOoO0 = 1;
                    if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            interfaceC33895OooO00o2 = this.f70126OooOo0o;
                            C32446OooOOOo.OooO0O0(obj);
                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                            interfaceC33895OooO00o2.OooOOO0(null);
                            return c32460OooOooO;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC33895OooO00o3 = this.f70126OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                        interfaceC33895OooO00o3.OooOOO0(null);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    GoogleBillingDataSource googleBillingDataSource3 = this.f70125OooOo;
                    InterfaceC33895OooO00o interfaceC33895OooO00o4 = this.f70126OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        googleBillingDataSource2 = googleBillingDataSource3;
                        interfaceC33895OooO00o = interfaceC33895OooO00o4;
                        Map map = (Map) obj;
                        list = (List) map.get("subs");
                        list2 = (List) map.get("inapp");
                        if (list != null && list2 != null) {
                            ArrayList<Purchase> arrayListOooooOO = oOo000Oo.OooOo.OooooOO(list, list2);
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
                            for (Purchase purchase : arrayListOooooOO) {
                                GoogleBillingDataSource.TinyPurchase.INSTANCE.getClass();
                                arrayList.add(GoogleBillingDataSource.TinyPurchase.Companion.OooO00o(purchase));
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                            c20358OooO00o.OooO0o0("getTinyPurchasesFromPlayCache success. " + arrayList, new Object[0]);
                            if (arrayList.isEmpty()) {
                                for (GoogleBillingDataSource.TinyPurchase tinyPurchase : arrayList) {
                                    if (tinyPurchase.isPurchased() && tinyPurchase.isAcknowledged()) {
                                        this.f70126OooOo0o = interfaceC33895OooO00o;
                                        this.f70125OooOo = null;
                                        this.f70128OooOoO0 = 3;
                                        AbstractC24338OooO0o0.OooO00o<Long> oooO00o = GoogleBillingDataSource.f70016OooOoO0;
                                        if (googleBillingDataSource2.OooOOOO(arrayList, this) != enumC32485OooO00o) {
                                            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                                            C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                                            interfaceC33895OooO00o2.OooOOO0(null);
                                            return c32460OooOooO3;
                                        }
                                        return enumC32485OooO00o;
                                    }
                                }
                            }
                            mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO("inapp", list2), new C32443OooOOO("subs", list));
                            this.f70126OooOo0o = interfaceC33895OooO00o;
                            this.f70125OooOo = null;
                            this.f70128OooOoO0 = 4;
                            AbstractC24338OooO0o0.OooO00o<Long> oooO00o2 = GoogleBillingDataSource.f70016OooOoO0;
                            if (googleBillingDataSource2.OooOO0(mapOooO0oo, this) != enumC32485OooO00o) {
                                interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                                C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                                interfaceC33895OooO00o3.OooOOO0(null);
                                return C32460OooOooO.f116667OooO00o;
                            }
                            return enumC32485OooO00o;
                        }
                        C32460OooOooO c32460OooOooO4 = C32460OooOooO.f116667OooO00o;
                        interfaceC33895OooO00o.OooOOO0(null);
                        return c32460OooOooO4;
                    } catch (Throwable th) {
                        th = th;
                        r0 = interfaceC33895OooO00o4;
                        r0.OooOOO0(null);
                        throw th;
                    }
                }
                GoogleBillingDataSource googleBillingDataSource4 = this.f70125OooOo;
                InterfaceC33895OooO00o interfaceC33895OooO00o5 = this.f70126OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                googleBillingDataSource = googleBillingDataSource4;
                interfaceC33895OooO00o = interfaceC33895OooO00o5;
                this.f70126OooOo0o = interfaceC33895OooO00o;
                this.f70125OooOo = googleBillingDataSource;
                this.f70128OooOoO0 = 2;
                Serializable serializableOooOO0o = googleBillingDataSource.OooOO0o(this);
                if (serializableOooOO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                googleBillingDataSource2 = googleBillingDataSource;
                obj = serializableOooOO0o;
                Map map2 = (Map) obj;
                list = (List) map2.get("subs");
                list2 = (List) map2.get("inapp");
                if (list != null) {
                    ArrayList<Purchase> arrayListOooooOO2 = oOo000Oo.OooOo.OooooOO(list, list2);
                    arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO2, 10));
                    while (r9.hasNext()) {
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
                    c20358OooO00o2.OooO0o0("getTinyPurchasesFromPlayCache success. " + arrayList, new Object[0]);
                    if (arrayList.isEmpty()) {
                    }
                    mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO("inapp", list2), new C32443OooOOO("subs", list));
                    this.f70126OooOo0o = interfaceC33895OooO00o;
                    this.f70125OooOo = null;
                    this.f70128OooOoO0 = 4;
                    AbstractC24338OooO0o0.OooO00o<Long> oooO00o22 = GoogleBillingDataSource.f70016OooOoO0;
                    if (googleBillingDataSource2.OooOO0(mapOooO0oo, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                C32460OooOooO c32460OooOooO42 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o.OooOOO0(null);
                return c32460OooOooO42;
            } catch (Throwable th2) {
                th = th2;
                r0 = interfaceC33895OooO00o;
                r0.OooOOO0(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
