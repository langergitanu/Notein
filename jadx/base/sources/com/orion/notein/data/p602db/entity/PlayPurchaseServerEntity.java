package com.orion.notein.data.p602db.entity;

import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/data/db/entity/PlayPurchaseServerEntity;", "", "purchaseToken", "", "productType", "productId", "originalJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPurchaseToken", "()Ljava/lang/String;", "getProductType", "getProductId", "getOriginalJson", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PlayPurchaseServerEntity {
    private final String originalJson;
    private final String productId;
    private final String productType;
    private final String purchaseToken;

    public PlayPurchaseServerEntity(String purchaseToken, String productType, String str, String originalJson) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(productType, "productType");
        OooOOO0.OooO0oO(originalJson, "originalJson");
        this.purchaseToken = purchaseToken;
        this.productType = productType;
        this.productId = str;
        this.originalJson = originalJson;
    }

    public static /* synthetic */ PlayPurchaseServerEntity copy$default(PlayPurchaseServerEntity playPurchaseServerEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playPurchaseServerEntity.purchaseToken;
        }
        if ((i & 2) != 0) {
            str2 = playPurchaseServerEntity.productType;
        }
        if ((i & 4) != 0) {
            str3 = playPurchaseServerEntity.productId;
        }
        if ((i & 8) != 0) {
            str4 = playPurchaseServerEntity.originalJson;
        }
        return playPurchaseServerEntity.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOriginalJson() {
        return this.originalJson;
    }

    public final PlayPurchaseServerEntity copy(String purchaseToken, String productType, String productId, String originalJson) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(productType, "productType");
        OooOOO0.OooO0oO(originalJson, "originalJson");
        return new PlayPurchaseServerEntity(purchaseToken, productType, productId, originalJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayPurchaseServerEntity)) {
            return false;
        }
        PlayPurchaseServerEntity playPurchaseServerEntity = (PlayPurchaseServerEntity) other;
        return OooOOO0.OooO0O0(this.purchaseToken, playPurchaseServerEntity.purchaseToken) && OooOOO0.OooO0O0(this.productType, playPurchaseServerEntity.productType) && OooOOO0.OooO0O0(this.productId, playPurchaseServerEntity.productId) && OooOOO0.OooO0O0(this.originalJson, playPurchaseServerEntity.originalJson);
    }

    public final String getOriginalJson() {
        return this.originalJson;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.purchaseToken.hashCode() * 31, 31, this.productType);
        String str = this.productId;
        return this.originalJson.hashCode() + ((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.purchaseToken;
        String str2 = this.productType;
        return C21445Oooo.OooO0O0(OooO0o.OooO0O0("PlayPurchaseServerEntity(purchaseToken=", str, ", productType=", str2, ", productId="), this.productId, ", originalJson=", this.originalJson, ")");
    }
}
