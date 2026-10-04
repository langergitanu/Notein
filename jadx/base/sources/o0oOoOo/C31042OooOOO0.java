package o0oOoOo;

import OooOoOO.C20519OooO0Oo;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.OooOO0O;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.transactions.google.GoogleBillingConstants;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import o0Oo0oOo.C28312OooO0oO;
import o0OoO000.C28546Oooo00O;
import o0Ooo0oo.C29449OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32447OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOoOo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31042OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Bundle f110825OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.android.billingclient.api.OooOO0O f110826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O.OooO00o f110827OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O.C22163OooO0Oo f110828OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f110829OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f110830OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ChronoUnit f110831OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f110832OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f110833OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C32447OooOOo f110834OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C32447OooOOo f110835OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C32447OooOOo f110836OooOO0o;

    /* JADX INFO: renamed from: o0oOoOo.OooOOO0$OooO00o */
    public static final class OooO00o {
        public static String OooO00o(com.android.billingclient.api.OooOO0O productDetails, OooOO0O.C22163OooO0Oo c22163OooO0Oo) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(productDetails, "productDetails");
            String str = c22163OooO0Oo != null ? c22163OooO0Oo.f66967OooO00o : null;
            String str2 = c22163OooO0Oo != null ? c22163OooO0Oo.f66968OooO0O0 : null;
            StringBuilder sb = new StringBuilder();
            sb.append(productDetails.f66947OooO0OO);
            sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            OooOO0.OooO0OO.OooO0o0(sb, productDetails.f66948OooO0Oo, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, str, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            sb.append(str2);
            return sb.toString();
        }

        public static C32443OooOOO OooO0O0(Period period) {
            if (period.getYears() > 0) {
                return new C32443OooOOO(Integer.valueOf(period.getYears()), ChronoUnit.YEARS);
            }
            if (period.getMonths() > 0) {
                return new C32443OooOOO(Integer.valueOf(period.getMonths()), ChronoUnit.MONTHS);
            }
            if (period.getDays() > 0) {
                return new C32443OooOOO(Integer.valueOf(period.getDays()), ChronoUnit.DAYS);
            }
            return null;
        }
    }

    public C31042OooOOO0(com.android.billingclient.api.OooOO0O oooOO0O, OooOO0O.OooO00o oooO00o, OooOO0O.C22163OooO0Oo c22163OooO0Oo, int i, ChronoUnit billingPeriodUnit, long j, String str, boolean z, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(billingPeriodUnit, "billingPeriodUnit");
        this.f110826OooO00o = oooOO0O;
        this.f110827OooO0O0 = oooO00o;
        this.f110828OooO0OO = c22163OooO0Oo;
        this.f110829OooO0Oo = i;
        this.f110831OooO0o0 = billingPeriodUnit;
        this.f110830OooO0o = j;
        this.f110832OooO0oO = str;
        this.f110833OooO0oo = z;
        this.f110825OooO = bundle;
        this.f110834OooOO0 = C20519OooO0Oo.OooO0OO(new o0OoO000.Oooo000(this, 1));
        this.f110835OooOO0O = C20519OooO0Oo.OooO0OO(new C28546Oooo00O(this, 3));
        this.f110836OooOO0o = C20519OooO0Oo.OooO0OO(new C29449OooOO0o(this, 1));
        C20519OooO0Oo.OooO0OO(new C28312OooO0oO(this, 2));
    }

    public static C31042OooOOO0 OooO00o(C31042OooOOO0 c31042OooOOO0, Bundle bundle) {
        com.android.billingclient.api.OooOO0O productDetails = c31042OooOOO0.f110826OooO00o;
        OooOO0O.OooO00o oooO00o = c31042OooOOO0.f110827OooO0O0;
        OooOO0O.C22163OooO0Oo c22163OooO0Oo = c31042OooOOO0.f110828OooO0OO;
        int i = c31042OooOOO0.f110829OooO0Oo;
        ChronoUnit billingPeriodUnit = c31042OooOOO0.f110831OooO0o0;
        long j = c31042OooOOO0.f110830OooO0o;
        String priceCurrencyCode = c31042OooOOO0.f110832OooO0oO;
        boolean z = c31042OooOOO0.f110833OooO0oo;
        c31042OooOOO0.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(productDetails, "productDetails");
        kotlin.jvm.internal.OooOOO0.OooO0oO(billingPeriodUnit, "billingPeriodUnit");
        kotlin.jvm.internal.OooOOO0.OooO0oO(priceCurrencyCode, "priceCurrencyCode");
        return new C31042OooOOO0(productDetails, oooO00o, c22163OooO0Oo, i, billingPeriodUnit, j, priceCurrencyCode, z, bundle);
    }

    public final String OooO0O0(Context context) {
        OooOO0O.C22163OooO0Oo c22163OooO0Oo;
        ArrayList arrayList;
        Object next;
        if (((Boolean) this.f110835OooOO0O.getValue()).booleanValue() && (c22163OooO0Oo = this.f110828OooO0OO) != null && (arrayList = c22163OooO0Oo.f66971OooO0o0) != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String str = (String) next;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                if (C33599OooOo0O.OooOoOO(str, GoogleBillingConstants.GOOGLE_TAG_PREFIX_DISCOUNT_TYPE, false)) {
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 != null) {
                if (str2.equals(GoogleBillingConstants.GOOGLE_TAG_DISCOUNT_TYPE_1)) {
                    OooOO0O.OooO0OO oooO0OO = c22163OooO0Oo.f66970OooO0Oo;
                    kotlin.jvm.internal.OooOOO0.OooO0o(oooO0OO, "getPricingPhases(...)");
                    try {
                        boolean zBooleanValue = ((Boolean) this.f110834OooOO0.getValue()).booleanValue();
                        ArrayList arrayList2 = oooO0OO.f66966OooO00o;
                        return (zBooleanValue ? (OooOO0O.OooO0O0) arrayList2.get(1) : (OooOO0O.OooO0O0) arrayList2.get(0)).f66961OooO00o;
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("GoogleProductVO");
                        c20358OooO00o.OooO0Oo(e, "Failed to get discount price", new Object[0]);
                    }
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("GoogleProductVO");
                    c20358OooO00o2.OooO0OO("Unsupported discount type: %s", str2);
                }
            }
        }
        return null;
    }

    public final String OooO0OO() {
        com.android.billingclient.api.OooOO0O oooOO0O = this.f110826OooO00o;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooOO0O.f66948OooO0Oo, "subs")) {
            return OooO00o.OooO00o(oooOO0O, this.f110828OooO0OO);
        }
        return oooOO0O.f66947OooO0OO + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + oooOO0O.f66948OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31042OooOOO0)) {
            return false;
        }
        C31042OooOOO0 c31042OooOOO0 = (C31042OooOOO0) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110826OooO00o, c31042OooOOO0.f110826OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110827OooO0O0, c31042OooOOO0.f110827OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110828OooO0OO, c31042OooOOO0.f110828OooO0OO) && this.f110829OooO0Oo == c31042OooOOO0.f110829OooO0Oo && this.f110831OooO0o0 == c31042OooOOO0.f110831OooO0o0 && this.f110830OooO0o == c31042OooOOO0.f110830OooO0o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110832OooO0oO, c31042OooOOO0.f110832OooO0oO) && this.f110833OooO0oo == c31042OooOOO0.f110833OooO0oo && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110825OooO, c31042OooOOO0.f110825OooO);
    }

    public final int hashCode() {
        int iHashCode = this.f110826OooO00o.f66945OooO00o.hashCode() * 31;
        OooOO0O.OooO00o oooO00o = this.f110827OooO0O0;
        int iHashCode2 = (iHashCode + (oooO00o == null ? 0 : oooO00o.hashCode())) * 31;
        OooOO0O.C22163OooO0Oo c22163OooO0Oo = this.f110828OooO0OO;
        int iOooO0O0 = o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20703o000000o.OooO0O0((this.f110831OooO0o0.hashCode() + C20785Oooo00o.OooO00o(this.f110829OooO0Oo, (iHashCode2 + (c22163OooO0Oo == null ? 0 : c22163OooO0Oo.hashCode())) * 31, 31)) * 31, 31, this.f110830OooO0o), 31, this.f110832OooO0oO), 31, this.f110833OooO0oo);
        Bundle bundle = this.f110825OooO;
        return iOooO0O0 + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return "GoogleProductVO(productDetails=" + this.f110826OooO00o + ", oneTimePurchaseOfferDetails=" + this.f110827OooO0O0 + ", subscriptionOfferDetails=" + this.f110828OooO0OO + ", billingPeriod=" + this.f110829OooO0Oo + ", billingPeriodUnit=" + this.f110831OooO0o0 + ", priceAmountMicros=" + this.f110830OooO0o + ", priceCurrencyCode=" + this.f110832OooO0oO + ", isSelected=" + this.f110833OooO0oo + ", extras=" + this.f110825OooO + ")";
    }
}
