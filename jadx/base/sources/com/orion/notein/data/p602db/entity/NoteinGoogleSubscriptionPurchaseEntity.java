package com.orion.notein.data.p602db.entity;

import OooOO0.OooO0OO;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.hihonor.honorid.core.data.TmemberRight;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006&"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NoteinGoogleSubscriptionPurchaseEntity;", "", "purchaseToken", "", TmemberRight.TAG_USERID, "lineItemsJson", "acknowledgementState", "subscriptionState", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPurchaseToken", "()Ljava/lang/String;", "setPurchaseToken", "(Ljava/lang/String;)V", "getUserId", "setUserId", "getLineItemsJson", "setLineItemsJson", "getAcknowledgementState", "setAcknowledgementState", "getSubscriptionState", "setSubscriptionState", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteinGoogleSubscriptionPurchaseEntity {
    private String acknowledgementState;
    private String lineItemsJson;
    private String purchaseToken;
    private String status;
    private String subscriptionState;
    private String userId;

    public NoteinGoogleSubscriptionPurchaseEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ NoteinGoogleSubscriptionPurchaseEntity copy$default(NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteinGoogleSubscriptionPurchaseEntity.purchaseToken;
        }
        if ((i & 2) != 0) {
            str2 = noteinGoogleSubscriptionPurchaseEntity.userId;
        }
        if ((i & 4) != 0) {
            str3 = noteinGoogleSubscriptionPurchaseEntity.lineItemsJson;
        }
        if ((i & 8) != 0) {
            str4 = noteinGoogleSubscriptionPurchaseEntity.acknowledgementState;
        }
        if ((i & 16) != 0) {
            str5 = noteinGoogleSubscriptionPurchaseEntity.subscriptionState;
        }
        if ((i & 32) != 0) {
            str6 = noteinGoogleSubscriptionPurchaseEntity.status;
        }
        String str7 = str5;
        String str8 = str6;
        return noteinGoogleSubscriptionPurchaseEntity.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLineItemsJson() {
        return this.lineItemsJson;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubscriptionState() {
        return this.subscriptionState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final NoteinGoogleSubscriptionPurchaseEntity copy(String purchaseToken, String userId, String lineItemsJson, String acknowledgementState, String subscriptionState, String status) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(lineItemsJson, "lineItemsJson");
        OooOOO0.OooO0oO(acknowledgementState, "acknowledgementState");
        OooOOO0.OooO0oO(subscriptionState, "subscriptionState");
        OooOOO0.OooO0oO(status, "status");
        return new NoteinGoogleSubscriptionPurchaseEntity(purchaseToken, userId, lineItemsJson, acknowledgementState, subscriptionState, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteinGoogleSubscriptionPurchaseEntity)) {
            return false;
        }
        NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity = (NoteinGoogleSubscriptionPurchaseEntity) other;
        return OooOOO0.OooO0O0(this.purchaseToken, noteinGoogleSubscriptionPurchaseEntity.purchaseToken) && OooOOO0.OooO0O0(this.userId, noteinGoogleSubscriptionPurchaseEntity.userId) && OooOOO0.OooO0O0(this.lineItemsJson, noteinGoogleSubscriptionPurchaseEntity.lineItemsJson) && OooOOO0.OooO0O0(this.acknowledgementState, noteinGoogleSubscriptionPurchaseEntity.acknowledgementState) && OooOOO0.OooO0O0(this.subscriptionState, noteinGoogleSubscriptionPurchaseEntity.subscriptionState) && OooOOO0.OooO0O0(this.status, noteinGoogleSubscriptionPurchaseEntity.status);
    }

    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    public final String getLineItemsJson() {
        return this.lineItemsJson;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubscriptionState() {
        return this.subscriptionState;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.status.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.purchaseToken.hashCode() * 31, 31, this.userId), 31, this.lineItemsJson), 31, this.acknowledgementState), 31, this.subscriptionState);
    }

    public final void setAcknowledgementState(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.acknowledgementState = str;
    }

    public final void setLineItemsJson(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.lineItemsJson = str;
    }

    public final void setPurchaseToken(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.purchaseToken = str;
    }

    public final void setStatus(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.status = str;
    }

    public final void setSubscriptionState(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.subscriptionState = str;
    }

    public final void setUserId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        String str = this.purchaseToken;
        String str2 = this.userId;
        String str3 = this.lineItemsJson;
        String str4 = this.acknowledgementState;
        String str5 = this.subscriptionState;
        String str6 = this.status;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteinGoogleSubscriptionPurchaseEntity(purchaseToken=", str, ", userId=", str2, ", lineItemsJson=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", acknowledgementState=", str4, ", subscriptionState=");
        return C21445Oooo.OooO0O0(sbOooO0O0, str5, ", status=", str6, ")");
    }

    public NoteinGoogleSubscriptionPurchaseEntity(String purchaseToken, String userId, String lineItemsJson, String acknowledgementState, String subscriptionState, String status) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(lineItemsJson, "lineItemsJson");
        OooOOO0.OooO0oO(acknowledgementState, "acknowledgementState");
        OooOOO0.OooO0oO(subscriptionState, "subscriptionState");
        OooOOO0.OooO0oO(status, "status");
        this.purchaseToken = purchaseToken;
        this.userId = userId;
        this.lineItemsJson = lineItemsJson;
        this.acknowledgementState = acknowledgementState;
        this.subscriptionState = subscriptionState;
        this.status = status;
    }

    public /* synthetic */ NoteinGoogleSubscriptionPurchaseEntity(String str, String str2, String str3, String str4, String str5, String str6, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
