package com.orion.notein.data.repo.transactions;

import android.os.Build;
import android.os.Handler;
import androidx.fragment.app.C21904OooOoo0;
import com.android.billingclient.api.C22159OooO0Oo;
import com.android.billingclient.api.C22162OooO0oo;
import com.android.billingclient.api.OooOOO;
import com.aspose.words.StyleIdentifier;
import com.google.android.gms.internal.play_billing.zzbt;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$fetchProductDetails$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_1, StyleIdentifier.GRID_TABLE_2_ACCENT_2, 1197, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
public final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<com.android.billingclient.api.OooOO0O>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70046OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70047OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f70048OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<String> f70049OooOoO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C33614OooOOO0 f70050OooO00o;

        public OooO00o(C33614OooOOO0 c33614OooOOO0) {
            this.f70050OooO00o = c33614OooOOO0;
        }

        public final void OooO00o(C22162OooO0oo result, com.android.billingclient.api.OooOOOO oooOOOO) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
            this.f70050OooO00o.resumeWith(new C32443OooOOO(result, oooOOOO));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(GoogleBillingDataSource googleBillingDataSource, List list, String str, Continuation continuation) {
        super(2, continuation);
        this.f70046OooOo = googleBillingDataSource;
        this.f70049OooOoO0 = list;
        this.f70048OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO(this.f70046OooOo, this.f70049OooOoO0, this.f70048OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<com.android.billingclient.api.OooOO0O>> continuation) {
        return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01de A[RETURN] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C22162OooO0oo c22162OooO0oo;
        int i = 0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f70047OooOo0o;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (this.f70046OooOo.f70039OooOo0.OooOOOo()) {
                List<String> list = this.f70049OooOoO0;
                String str = this.f70048OooOoO;
                C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                for (String str2 : list) {
                    OooOOO.OooO0O0.OooO00o oooO00o = new OooOOO.OooO0O0.OooO00o();
                    oooO00o.f66978OooO00o = str2;
                    oooO00o.f66979OooO0O0 = str;
                    if ("first_party".equals(str)) {
                        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                    }
                    if (oooO00o.f66978OooO00o == null) {
                        throw new IllegalArgumentException("Product id must be provided.");
                    }
                    c32465OooO0O0OooO0Oo.add(new OooOOO.OooO0O0(oooO00o));
                }
                C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                OooOOO.OooO00o oooO00o2 = new OooOOO.OooO00o();
                if (c32465OooO0O0OooO0O0 == null || c32465OooO0O0OooO0O0.isEmpty()) {
                    throw new IllegalArgumentException("Product list cannot be empty.");
                }
                HashSet hashSet = new HashSet();
                ListIterator listIterator = c32465OooO0O0OooO0O0.listIterator(0);
                while (true) {
                    C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                    if (!c20232OooO0O0.hasNext()) {
                        break;
                    }
                    OooOOO.OooO0O0 oooO0O0 = (OooOOO.OooO0O0) c20232OooO0O0.next();
                    if (!"play_pass_subs".equals(oooO0O0.f66977OooO0O0)) {
                        hashSet.add(oooO0O0.f66977OooO0O0);
                    }
                }
                if (hashSet.size() > 1) {
                    throw new IllegalArgumentException("All products should be of the same product type.");
                }
                oooO00o2.f66975OooO00o = zzbt.zzj(c32465OooO0O0OooO0O0);
                GoogleBillingDataSource googleBillingDataSource = this.f70046OooOo;
                this.f70047OooOo0o = 3;
                C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(this));
                c33614OooOOO0.OooOOoo();
                C22159OooO0Oo c22159OooO0Oo = googleBillingDataSource.f70039OooOo0;
                if (oooO00o2.f66975OooO00o == null) {
                    throw new IllegalArgumentException("Product list must be set to a non empty list.");
                }
                c22159OooO0Oo.OooO0Oo(new com.android.billingclient.api.OooOOO(oooO00o2), new OooO00o(c33614OooOOO0));
                obj = c33614OooOOO0.OooOOo();
                EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                if (obj != enumC32485OooO00o) {
                }
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                c20358OooO00o.OooO0OO("queryProductDetails: BillingClient is not ready", new Object[0]);
                if (Build.VERSION.SDK_INT >= 29) {
                    GoogleBillingDataSource googleBillingDataSource2 = this.f70046OooOo;
                    if (!googleBillingDataSource2.f70019OooO.hasCallbacks(googleBillingDataSource2.f70042OooOo0o)) {
                        GoogleBillingDataSource googleBillingDataSource3 = this.f70046OooOo;
                        Handler handler = googleBillingDataSource3.f70019OooO;
                        RunnableC22939OooOoo0 runnableC22939OooOoo0 = googleBillingDataSource3.f70042OooOo0o;
                        handler.removeCallbacks(runnableC22939OooOoo0);
                        c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                        c20358OooO00o.OooO0o0("retryBillingConnectionInstantly", new Object[0]);
                        handler.postDelayed(runnableC22939OooOoo0, googleBillingDataSource3.f70030OooOO0o);
                    }
                }
                GoogleBillingDataSource googleBillingDataSource4 = this.f70046OooOo;
                synchronized (googleBillingDataSource4.f70027OooO0oo) {
                    c22162OooO0oo = googleBillingDataSource4.f70027OooO0oo;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c22162OooO0oo, this.f70046OooOo.f70026OooO0oO)) {
                    GoogleBillingDataSource googleBillingDataSource5 = this.f70046OooOo;
                    this.f70047OooOo0o = 1;
                    if (GoogleBillingDataSource.OooO0Oo(googleBillingDataSource5, 100, "BillingClient is not ready. Please try again later.", this) != enumC32485OooO00o) {
                        return null;
                    }
                } else {
                    GoogleBillingDataSource googleBillingDataSource6 = this.f70046OooOo;
                    int i3 = c22162OooO0oo.f66936OooO00o;
                    String str3 = c22162OooO0oo.f66938OooO0OO;
                    kotlin.jvm.internal.OooOOO0.OooO0o(str3, "getDebugMessage(...)");
                    this.f70047OooOo0o = 2;
                    if (GoogleBillingDataSource.OooO0Oo(googleBillingDataSource6, i3, str3, this) == enumC32485OooO00o) {
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(obj);
            return null;
        }
        if (i2 == 2) {
            C32446OooOOOo.OooO0O0(obj);
            return null;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return null;
        }
        C32446OooOOOo.OooO0O0(obj);
        C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
        A a = c32443OooOOO.f116638OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o(a, "component1(...)");
        C22162OooO0oo c22162OooO0oo2 = (C22162OooO0oo) a;
        B b = c32443OooOOO.f116637OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0o(b, "component2(...)");
        com.android.billingclient.api.OooOOOO oooOOOO = (com.android.billingclient.api.OooOOOO) b;
        AbstractCollection abstractCollection = oooOOOO.f66980OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0o(abstractCollection, "getProductDetailsList(...)");
        AbstractCollection abstractCollection2 = oooOOOO.f66981OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0o(abstractCollection2, "getUnfetchedProductList(...)");
        if (!abstractCollection2.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o2.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("fetchProductDetails: unfetched products: ", oOo000Oo.OooOo.o000oOoO(abstractCollection2, null, null, null, new C22926OooO0oo(i), 31)), new Object[0]);
        }
        int i4 = c22162OooO0oo2.f66936OooO00o;
        String str4 = c22162OooO0oo2.f66938OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0o(str4, "getDebugMessage(...)");
        if (i4 == 0) {
            if (!abstractCollection.isEmpty()) {
                return abstractCollection;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o3.OooO0OO("onProductDetailsResponse: Found null or empty ProductDetails. Check to see if the Products you requested are correctly published in the Google Play Console. productId: " + this.f70049OooOoO0 + ", productType: " + this.f70048OooOoO, new Object[0]);
            return null;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o4, "GoogleBillingDataSource", "queryAndProductDetails error: ", i4, ", ");
        sbOooO00o.append(str4);
        c20358OooO00o4.OooO0OO(sbOooO00o.toString(), new Object[0]);
        GoogleBillingDataSource googleBillingDataSource7 = this.f70046OooOo;
        this.f70047OooOo0o = 4;
        if (GoogleBillingDataSource.OooO0Oo(googleBillingDataSource7, i4, str4, this) == enumC32485OooO00o) {
            return enumC32485OooO00o;
        }
    }
}
