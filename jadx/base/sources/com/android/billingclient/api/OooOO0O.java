package com.android.billingclient.api;

import OoooooO.C21445Oooo;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f66944OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f66945OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final JSONObject f66946OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f66947OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f66948OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f66949OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f66950OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f66951OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f66952OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f66953OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f66954OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f66955OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f66956OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f66957OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f66958OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f66959OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final C22188OoooO f66960OooO0oO;

        public OooO00o(JSONObject jSONObject) throws JSONException {
            this.f66954OooO00o = jSONObject.optString("formattedPrice");
            this.f66955OooO0O0 = jSONObject.optLong("priceAmountMicros");
            this.f66956OooO0OO = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            C22188OoooO c22188OoooO = null;
            this.f66957OooO0Oo = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f66959OooO0o0 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    this.f66959OooO0o0.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObjectOptJSONObject.has("percentageDiscount")) {
                    jSONObjectOptJSONObject.optInt("percentageDiscount");
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("discountAmount");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.optString("formattedDiscountAmount");
                    jSONObjectOptJSONObject2.optLong("discountAmountMicros");
                    jSONObjectOptJSONObject2.optString("discountAmountCurrencyCode");
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject3 != null) {
                if (jSONObjectOptJSONObject3.has("startTimeMillis")) {
                    jSONObjectOptJSONObject3.optLong("startTimeMillis");
                }
                if (jSONObjectOptJSONObject3.has("endTimeMillis")) {
                    jSONObjectOptJSONObject3.optLong("endTimeMillis");
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getInt("maximumQuantity");
                jSONObjectOptJSONObject4.getInt("remainingQuantity");
            }
            this.f66958OooO0o = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject5.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject6 != null) {
                jSONObjectOptJSONObject6.getString("rentalPeriod");
                jSONObjectOptJSONObject6.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("autoPayDetails");
            if (jSONObjectOptJSONObject7 != null) {
                c22188OoooO = new C22188OoooO();
                jSONObjectOptJSONObject7.getString(C18437z2.f56754h);
            }
            this.f66960OooO0oO = c22188OoooO;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                JSONObject jSONObjectOptJSONObject8 = jSONArrayOptJSONArray2.optJSONObject(i2);
                if (jSONObjectOptJSONObject8 != null) {
                    arrayList.add(new OooO0O0(jSONObjectOptJSONObject8));
                }
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f66961OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f66962OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f66963OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f66964OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f66965OooO0o0;

        public OooO0O0(JSONObject jSONObject) {
            this.f66964OooO0Oo = jSONObject.optString("billingPeriod");
            this.f66963OooO0OO = jSONObject.optString("priceCurrencyCode");
            this.f66961OooO00o = jSONObject.optString("formattedPrice");
            this.f66962OooO0O0 = jSONObject.optLong("priceAmountMicros");
            this.f66965OooO0o0 = jSONObject.optInt("recurrenceMode");
            jSONObject.optInt("billingCycleCount");
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f66966OooO00o;

        public OooO0OO(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new OooO0O0(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f66966OooO00o = arrayList;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.OooOO0O$OooO0Oo, reason: case insensitive filesystem */
    public static final class C22163OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f66967OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f66968OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f66969OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f66970OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f66971OooO0o0;

        public C22163OooO0Oo(JSONObject jSONObject) throws JSONException {
            this.f66967OooO00o = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f66968OooO0O0 = true == strOptString.isEmpty() ? null : strOptString;
            this.f66969OooO0OO = jSONObject.getString("offerIdToken");
            this.f66970OooO0Oo = new OooO0OO(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("commitmentPaymentsCount");
                jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString(NoteMeta.PROPERTY_TITLE);
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    jSONObjectOptJSONObject3.optString("billingPeriod");
                    jSONObjectOptJSONObject3.optString("priceCurrencyCode");
                    jSONObjectOptJSONObject3.optString("formattedPrice");
                    jSONObjectOptJSONObject3.optLong("priceAmountMicros");
                    jSONObjectOptJSONObject3.optInt("recurrenceMode");
                    jSONObjectOptJSONObject3.optInt("billingCycleCount");
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
            }
            this.f66971OooO0o0 = arrayList;
        }
    }

    public OooOO0O(String str) throws JSONException {
        this.f66945OooO00o = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f66946OooO0O0 = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f66947OooO0OO = strOptString;
        String strOptString2 = jSONObject.optString(C18437z2.f56754h);
        this.f66948OooO0Oo = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f66950OooO0o0 = jSONObject.optString(NoteMeta.PROPERTY_TITLE);
        jSONObject.optString("name");
        this.f66949OooO0o = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f66951OooO0oO = jSONObject.optString("skuDetailsToken");
        this.f66952OooO0oo = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(new C22163OooO0Oo(jSONArrayOptJSONArray.getJSONObject(i)));
            }
            this.f66944OooO = arrayList;
        } else {
            this.f66944OooO = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f66946OooO0O0.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f66946OooO0O0.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList2.add(new OooO00o(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
            this.f66953OooOO0 = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f66953OooOO0 = null;
        } else {
            arrayList2.add(new OooO00o(jSONObjectOptJSONObject));
            this.f66953OooOO0 = arrayList2;
        }
    }

    public final OooO00o OooO00o() {
        ArrayList arrayList = this.f66953OooOO0;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (OooO00o) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOO0O) {
            return TextUtils.equals(this.f66945OooO00o, ((OooOO0O) obj).f66945OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f66945OooO00o.hashCode();
    }

    public final String toString() {
        String string = this.f66946OooO0O0.toString();
        String strValueOf = String.valueOf(this.f66944OooO);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        OooOO0.OooO0OO.OooO0o0(sb, this.f66945OooO00o, "', parsedJson=", string, ", productId='");
        sb.append(this.f66947OooO0OO);
        sb.append("', productType='");
        sb.append(this.f66948OooO0Oo);
        sb.append("', title='");
        sb.append(this.f66950OooO0o0);
        sb.append("', productDetailsToken='");
        return C21445Oooo.OooO0O0(sb, this.f66951OooO0oO, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
