package com.orion.notein.domain.models.transactions.google;

import OooOO0.OooO0OO;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.aspose.words.TableStyleOptions;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002FGBw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0080\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u001a\u0010+\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b;\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b>\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b?\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010\u001aR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00106\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010CR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00106\u001a\u0004\bD\u0010\u001a\"\u0004\bE\u0010C¨\u0006H"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/ProductPurchase;", "", "", "kind", "purchaseTimeMillis", "", "purchaseState", "consumptionState", "developerPayload", "orderId", "acknowledgementState", FirebaseAnalytics.Param.QUANTITY, "regionCode", "purchaseToken", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LoO0oO00/o000000O;)V", "", "isAcknowledged", "()Z", "isPurchased", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/ProductPurchase;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/ProductPurchase;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Ljava/lang/String;", "getKind", "getPurchaseTimeMillis", "I", "getPurchaseState", "getConsumptionState", "getDeveloperPayload", "getOrderId", "getAcknowledgementState", "getQuantity", "getRegionCode", "getPurchaseToken", "setPurchaseToken", "(Ljava/lang/String;)V", "getProductId", "setProductId", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ProductPurchase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ProductPurchase EMPTY = new ProductPurchase("", "", 1, 0, (String) null, "", 0, 1, "", (String) null, (String) null, TableStyleOptions.DEFAULT_2003, (C24018OooO0oo) null);
    private final int acknowledgementState;
    private final int consumptionState;
    private final String developerPayload;
    private final String kind;
    private final String orderId;
    private String productId;
    private final int purchaseState;
    private final String purchaseTimeMillis;
    private String purchaseToken;
    private final int quantity;
    private final String regionCode;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/ProductPurchase$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/ProductPurchase;", "serializer", "()LoO0o0ooO/OooO0OO;", "EMPTY", "Lcom/orion/notein/domain/models/transactions/google/ProductPurchase;", "getEMPTY", "()Lcom/orion/notein/domain/models/transactions/google/ProductPurchase;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final ProductPurchase getEMPTY() {
            return ProductPurchase.EMPTY;
        }

        public final InterfaceC33911OooO0OO<ProductPurchase> serializer() {
            return ProductPurchase$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProductPurchase() {
        this((String) null, (String) null, 0, 0, (String) null, (String) null, 0, 0, (String) null, (String) null, (String) null, 2047, (C24018OooO0oo) null);
    }

    public static /* synthetic */ ProductPurchase copy$default(ProductPurchase productPurchase, String str, String str2, int i, int i2, String str3, String str4, int i3, int i4, String str5, String str6, String str7, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = productPurchase.kind;
        }
        if ((i5 & 2) != 0) {
            str2 = productPurchase.purchaseTimeMillis;
        }
        if ((i5 & 4) != 0) {
            i = productPurchase.purchaseState;
        }
        if ((i5 & 8) != 0) {
            i2 = productPurchase.consumptionState;
        }
        if ((i5 & 16) != 0) {
            str3 = productPurchase.developerPayload;
        }
        if ((i5 & 32) != 0) {
            str4 = productPurchase.orderId;
        }
        if ((i5 & 64) != 0) {
            i3 = productPurchase.acknowledgementState;
        }
        if ((i5 & 128) != 0) {
            i4 = productPurchase.quantity;
        }
        if ((i5 & 256) != 0) {
            str5 = productPurchase.regionCode;
        }
        if ((i5 & 512) != 0) {
            str6 = productPurchase.purchaseToken;
        }
        if ((i5 & 1024) != 0) {
            str7 = productPurchase.productId;
        }
        String str8 = str6;
        String str9 = str7;
        int i6 = i4;
        String str10 = str5;
        String str11 = str4;
        int i7 = i3;
        String str12 = str3;
        int i8 = i;
        return productPurchase.copy(str, str2, i8, i2, str12, str11, i7, i6, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$app_google_playRelease(ProductPurchase self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.kind, "")) {
            output.OooOO0o(serialDesc, 0, self.kind);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.purchaseTimeMillis, "")) {
            output.OooOO0o(serialDesc, 1, self.purchaseTimeMillis);
        }
        if (output.OooOoO0(serialDesc) || self.purchaseState != 1) {
            output.OooOoOO(2, self.purchaseState, serialDesc);
        }
        if (output.OooOoO0(serialDesc) || self.consumptionState != 0) {
            output.OooOoOO(3, self.consumptionState, serialDesc);
        }
        if (output.OooOoO0(serialDesc) || self.developerPayload != null) {
            output.OooOo(serialDesc, 4, o00000OO.f122230OooO00o, self.developerPayload);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.orderId, "")) {
            output.OooOO0o(serialDesc, 5, self.orderId);
        }
        if (output.OooOoO0(serialDesc) || self.acknowledgementState != 0) {
            output.OooOoOO(6, self.acknowledgementState, serialDesc);
        }
        if (output.OooOoO0(serialDesc) || self.quantity != 1) {
            output.OooOoOO(7, self.quantity, serialDesc);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.regionCode, "")) {
            output.OooOO0o(serialDesc, 8, self.regionCode);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.purchaseToken, "")) {
            output.OooOO0o(serialDesc, 9, self.purchaseToken);
        }
        if (!output.OooOoO0(serialDesc) && OooOOO0.OooO0O0(self.productId, "")) {
            return;
        }
        output.OooOO0o(serialDesc, 10, self.productId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPurchaseState() {
        return this.purchaseState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getConsumptionState() {
        return this.consumptionState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    public final ProductPurchase copy(String kind, String purchaseTimeMillis, int purchaseState, int consumptionState, String developerPayload, String orderId, int acknowledgementState, int quantity, String regionCode, String purchaseToken, String productId) {
        OooOOO0.OooO0oO(kind, "kind");
        OooOOO0.OooO0oO(purchaseTimeMillis, "purchaseTimeMillis");
        OooOOO0.OooO0oO(orderId, "orderId");
        OooOOO0.OooO0oO(regionCode, "regionCode");
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(productId, "productId");
        return new ProductPurchase(kind, purchaseTimeMillis, purchaseState, consumptionState, developerPayload, orderId, acknowledgementState, quantity, regionCode, purchaseToken, productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPurchase)) {
            return false;
        }
        ProductPurchase productPurchase = (ProductPurchase) other;
        return OooOOO0.OooO0O0(this.kind, productPurchase.kind) && OooOOO0.OooO0O0(this.purchaseTimeMillis, productPurchase.purchaseTimeMillis) && this.purchaseState == productPurchase.purchaseState && this.consumptionState == productPurchase.consumptionState && OooOOO0.OooO0O0(this.developerPayload, productPurchase.developerPayload) && OooOOO0.OooO0O0(this.orderId, productPurchase.orderId) && this.acknowledgementState == productPurchase.acknowledgementState && this.quantity == productPurchase.quantity && OooOOO0.OooO0O0(this.regionCode, productPurchase.regionCode) && OooOOO0.OooO0O0(this.purchaseToken, productPurchase.purchaseToken) && OooOOO0.OooO0O0(this.productId, productPurchase.productId);
    }

    public final int getAcknowledgementState() {
        return this.acknowledgementState;
    }

    public final int getConsumptionState() {
        return this.consumptionState;
    }

    public final String getDeveloperPayload() {
        return this.developerPayload;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    public final String getPurchaseTimeMillis() {
        return this.purchaseTimeMillis;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.consumptionState, C20785Oooo00o.OooO00o(this.purchaseState, OooO00o.OooO0O0(this.kind.hashCode() * 31, 31, this.purchaseTimeMillis), 31), 31);
        String str = this.developerPayload;
        return this.productId.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.quantity, C20785Oooo00o.OooO00o(this.acknowledgementState, OooO00o.OooO0O0((iOooO00o + (str == null ? 0 : str.hashCode())) * 31, 31, this.orderId), 31), 31), 31, this.regionCode), 31, this.purchaseToken);
    }

    public final boolean isAcknowledged() {
        return this.acknowledgementState == 1;
    }

    public final boolean isPurchased() {
        return this.purchaseState == 0;
    }

    public final void setProductId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.productId = str;
    }

    public final void setPurchaseToken(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.purchaseToken = str;
    }

    public String toString() {
        String str = this.kind;
        String str2 = this.purchaseTimeMillis;
        int i = this.purchaseState;
        int i2 = this.consumptionState;
        String str3 = this.developerPayload;
        String str4 = this.orderId;
        int i3 = this.acknowledgementState;
        int i4 = this.quantity;
        String str5 = this.regionCode;
        String str6 = this.purchaseToken;
        String str7 = this.productId;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("ProductPurchase(kind=", str, ", purchaseTimeMillis=", str2, ", purchaseState=");
        C24472OooOoo.OooO0O0(sbOooO0O0, ", consumptionState=", ", developerPayload=", i, i2);
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", orderId=", str4, ", acknowledgementState=");
        C24472OooOoo.OooO0O0(sbOooO0O0, ", quantity=", ", regionCode=", i3, i4);
        OooO0OO.OooO0o0(sbOooO0O0, str5, ", purchaseToken=", str6, ", productId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str7, ")");
    }

    public /* synthetic */ ProductPurchase(int i, String str, String str2, int i2, int i3, String str3, String str4, int i4, int i5, String str5, String str6, String str7, o000000O o000000o2) {
        if ((i & 1) == 0) {
            this.kind = "";
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.purchaseTimeMillis = "";
        } else {
            this.purchaseTimeMillis = str2;
        }
        if ((i & 4) == 0) {
            this.purchaseState = 1;
        } else {
            this.purchaseState = i2;
        }
        if ((i & 8) == 0) {
            this.consumptionState = 0;
        } else {
            this.consumptionState = i3;
        }
        if ((i & 16) == 0) {
            this.developerPayload = null;
        } else {
            this.developerPayload = str3;
        }
        if ((i & 32) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str4;
        }
        if ((i & 64) == 0) {
            this.acknowledgementState = 0;
        } else {
            this.acknowledgementState = i4;
        }
        if ((i & 128) == 0) {
            this.quantity = 1;
        } else {
            this.quantity = i5;
        }
        if ((i & 256) == 0) {
            this.regionCode = "";
        } else {
            this.regionCode = str5;
        }
        if ((i & 512) == 0) {
            this.purchaseToken = "";
        } else {
            this.purchaseToken = str6;
        }
        if ((i & 1024) == 0) {
            this.productId = "";
        } else {
            this.productId = str7;
        }
    }

    public ProductPurchase(String kind, String purchaseTimeMillis, int i, int i2, String str, String orderId, int i3, int i4, String regionCode, String purchaseToken, String productId) {
        OooOOO0.OooO0oO(kind, "kind");
        OooOOO0.OooO0oO(purchaseTimeMillis, "purchaseTimeMillis");
        OooOOO0.OooO0oO(orderId, "orderId");
        OooOOO0.OooO0oO(regionCode, "regionCode");
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(productId, "productId");
        this.kind = kind;
        this.purchaseTimeMillis = purchaseTimeMillis;
        this.purchaseState = i;
        this.consumptionState = i2;
        this.developerPayload = str;
        this.orderId = orderId;
        this.acknowledgementState = i3;
        this.quantity = i4;
        this.regionCode = regionCode;
        this.purchaseToken = purchaseToken;
        this.productId = productId;
    }

    public /* synthetic */ ProductPurchase(String str, String str2, int i, int i2, String str3, String str4, int i3, int i4, String str5, String str6, String str7, int i5, C24018OooO0oo c24018OooO0oo) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? 1 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? null : str3, (i5 & 32) != 0 ? "" : str4, (i5 & 64) == 0 ? i3 : 0, (i5 & 128) == 0 ? i4 : 1, (i5 & 256) != 0 ? "" : str5, (i5 & 512) != 0 ? "" : str6, (i5 & 1024) != 0 ? "" : str7);
    }
}
