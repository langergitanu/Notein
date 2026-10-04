package com.orion.notein.data.p602db.entity;

import OooOO0.OooO0O0;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.C21036OooOOo0;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.hihonor.honorid.core.data.TmemberRight;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0019¨\u0006'"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/NoteinGoogleInAppPurchaseEntity;", "", "purchaseToken", "", TmemberRight.TAG_USERID, "productId", "acknowledgementState", "", "purchaseState", "status", "consumptionState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V", "getPurchaseToken", "()Ljava/lang/String;", "getUserId", "getProductId", "getAcknowledgementState", "()I", "getPurchaseState", "getStatus", "setStatus", "(Ljava/lang/String;)V", "getConsumptionState", "setConsumptionState", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteinGoogleInAppPurchaseEntity {
    private final int acknowledgementState;
    private int consumptionState;
    private final String productId;
    private final int purchaseState;
    private final String purchaseToken;
    private String status;
    private final String userId;

    public NoteinGoogleInAppPurchaseEntity(String purchaseToken, String userId, String productId, int i, int i2, String status, int i3) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(productId, "productId");
        OooOOO0.OooO0oO(status, "status");
        this.purchaseToken = purchaseToken;
        this.userId = userId;
        this.productId = productId;
        this.acknowledgementState = i;
        this.purchaseState = i2;
        this.status = status;
        this.consumptionState = i3;
    }

    public static /* synthetic */ NoteinGoogleInAppPurchaseEntity copy$default(NoteinGoogleInAppPurchaseEntity noteinGoogleInAppPurchaseEntity, String str, String str2, String str3, int i, int i2, String str4, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = noteinGoogleInAppPurchaseEntity.purchaseToken;
        }
        if ((i4 & 2) != 0) {
            str2 = noteinGoogleInAppPurchaseEntity.userId;
        }
        if ((i4 & 4) != 0) {
            str3 = noteinGoogleInAppPurchaseEntity.productId;
        }
        if ((i4 & 8) != 0) {
            i = noteinGoogleInAppPurchaseEntity.acknowledgementState;
        }
        if ((i4 & 16) != 0) {
            i2 = noteinGoogleInAppPurchaseEntity.purchaseState;
        }
        if ((i4 & 32) != 0) {
            str4 = noteinGoogleInAppPurchaseEntity.status;
        }
        if ((i4 & 64) != 0) {
            i3 = noteinGoogleInAppPurchaseEntity.consumptionState;
        }
        String str5 = str4;
        int i5 = i3;
        int i6 = i2;
        String str6 = str3;
        return noteinGoogleInAppPurchaseEntity.copy(str, str2, str6, i, i6, str5, i5);
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
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPurchaseState() {
        return this.purchaseState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getConsumptionState() {
        return this.consumptionState;
    }

    public final NoteinGoogleInAppPurchaseEntity copy(String purchaseToken, String userId, String productId, int acknowledgementState, int purchaseState, String status, int consumptionState) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(productId, "productId");
        OooOOO0.OooO0oO(status, "status");
        return new NoteinGoogleInAppPurchaseEntity(purchaseToken, userId, productId, acknowledgementState, purchaseState, status, consumptionState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteinGoogleInAppPurchaseEntity)) {
            return false;
        }
        NoteinGoogleInAppPurchaseEntity noteinGoogleInAppPurchaseEntity = (NoteinGoogleInAppPurchaseEntity) other;
        return OooOOO0.OooO0O0(this.purchaseToken, noteinGoogleInAppPurchaseEntity.purchaseToken) && OooOOO0.OooO0O0(this.userId, noteinGoogleInAppPurchaseEntity.userId) && OooOOO0.OooO0O0(this.productId, noteinGoogleInAppPurchaseEntity.productId) && this.acknowledgementState == noteinGoogleInAppPurchaseEntity.acknowledgementState && this.purchaseState == noteinGoogleInAppPurchaseEntity.purchaseState && OooOOO0.OooO0O0(this.status, noteinGoogleInAppPurchaseEntity.status) && this.consumptionState == noteinGoogleInAppPurchaseEntity.consumptionState;
    }

    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    public final int getConsumptionState() {
        return this.consumptionState;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Integer.hashCode(this.consumptionState) + OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.purchaseState, C20785Oooo00o.OooO00o(this.acknowledgementState, OooO00o.OooO0O0(OooO00o.OooO0O0(this.purchaseToken.hashCode() * 31, 31, this.userId), 31, this.productId), 31), 31), 31, this.status);
    }

    public final void setConsumptionState(int i) {
        this.consumptionState = i;
    }

    public final void setStatus(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.status = str;
    }

    public String toString() {
        String str = this.purchaseToken;
        String str2 = this.userId;
        String str3 = this.productId;
        int i = this.acknowledgementState;
        int i2 = this.purchaseState;
        String str4 = this.status;
        int i3 = this.consumptionState;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteinGoogleInAppPurchaseEntity(purchaseToken=", str, ", userId=", str2, ", productId=");
        OooO0O0.OooO0Oo(i, str3, ", acknowledgementState=", ", purchaseState=", sbOooO0O0);
        C21036OooOOo0.OooO0Oo(i2, ", status=", str4, ", consumptionState=", sbOooO0O0);
        return C21023OooO0Oo.OooO0OO(")", i3, sbOooO0O0);
    }

    public /* synthetic */ NoteinGoogleInAppPurchaseEntity(String str, String str2, String str3, int i, int i2, String str4, int i3, int i4, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, i, i2, (i4 & 32) != 0 ? "" : str4, i3);
    }
}
