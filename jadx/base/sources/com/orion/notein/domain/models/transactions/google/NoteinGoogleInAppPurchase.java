package com.orion.notein.domain.models.transactions.google;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import Oooo0oO.C21036OooOOo0;
import android.os.Parcel;
import android.os.Parcelable;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.hihonor.honorid.core.data.TmemberRight;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002>?B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010!\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b,\u0010$JV\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u0010$J\u001a\u00103\u001a\u00020\u001a2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010&R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010&R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010$R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b;\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010&R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b=\u0010$¨\u0006@"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleInAppPurchase;", "Landroid/os/Parcelable;", "", "purchaseToken", "productId", TmemberRight.TAG_USERID, "", "acknowledgementState", "purchaseState", "status", "consumptionState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleInAppPurchase;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "", "isAcknowledged", "()Z", "isValid", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleInAppPurchase;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPurchaseToken", "getProductId", "getUserId", "I", "getAcknowledgementState", "getPurchaseState", "getStatus", "getConsumptionState", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteinGoogleInAppPurchase implements Parcelable {

    @SerializedName("acknowledgementState")
    private final int acknowledgementState;

    @SerializedName("consumptionState")
    private final int consumptionState;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("purchaseState")
    private final int purchaseState;

    @SerializedName("purchaseToken")
    private final String purchaseToken;

    @SerializedName("status")
    private final String status;

    @SerializedName(TmemberRight.TAG_USERID)
    private final String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<NoteinGoogleInAppPurchase> CREATOR = new Creator();

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleInAppPurchase$Companion;", "", "<init>", "()V", "Lcom/orion/notein/domain/models/transactions/google/ProductPurchase;", FirebaseAnalytics.Event.PURCHASE, "", TmemberRight.TAG_USERID, "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleInAppPurchase;", "fromProductPurchase", "(Lcom/orion/notein/domain/models/transactions/google/ProductPurchase;Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleInAppPurchase;", "LoO0o0ooO/OooO0OO;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final NoteinGoogleInAppPurchase fromProductPurchase(ProductPurchase purchase, String userId) {
            OooOOO0.OooO0oO(purchase, "purchase");
            OooOOO0.OooO0oO(userId, "userId");
            return new NoteinGoogleInAppPurchase(purchase.getPurchaseToken(), purchase.getProductId(), userId, purchase.getAcknowledgementState(), purchase.getPurchaseState(), "", purchase.getConsumptionState());
        }

        public final InterfaceC33911OooO0OO<NoteinGoogleInAppPurchase> serializer() {
            return NoteinGoogleInAppPurchase$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Creator implements Parcelable.Creator<NoteinGoogleInAppPurchase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NoteinGoogleInAppPurchase createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new NoteinGoogleInAppPurchase(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NoteinGoogleInAppPurchase[] newArray(int i) {
            return new NoteinGoogleInAppPurchase[i];
        }
    }

    public /* synthetic */ NoteinGoogleInAppPurchase(int i, String str, String str2, String str3, int i2, int i3, String str4, int i4, o000000O o000000o2) {
        if (127 != (i & 127)) {
            C24242OooOOo.OooO0O0(i, 127, NoteinGoogleInAppPurchase$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.purchaseToken = str;
        this.productId = str2;
        this.userId = str3;
        this.acknowledgementState = i2;
        this.purchaseState = i3;
        this.status = str4;
        this.consumptionState = i4;
    }

    public static /* synthetic */ NoteinGoogleInAppPurchase copy$default(NoteinGoogleInAppPurchase noteinGoogleInAppPurchase, String str, String str2, String str3, int i, int i2, String str4, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = noteinGoogleInAppPurchase.purchaseToken;
        }
        if ((i4 & 2) != 0) {
            str2 = noteinGoogleInAppPurchase.productId;
        }
        if ((i4 & 4) != 0) {
            str3 = noteinGoogleInAppPurchase.userId;
        }
        if ((i4 & 8) != 0) {
            i = noteinGoogleInAppPurchase.acknowledgementState;
        }
        if ((i4 & 16) != 0) {
            i2 = noteinGoogleInAppPurchase.purchaseState;
        }
        if ((i4 & 32) != 0) {
            str4 = noteinGoogleInAppPurchase.status;
        }
        if ((i4 & 64) != 0) {
            i3 = noteinGoogleInAppPurchase.consumptionState;
        }
        String str5 = str4;
        int i5 = i3;
        int i6 = i2;
        String str6 = str3;
        return noteinGoogleInAppPurchase.copy(str, str2, str6, i, i6, str5, i5);
    }

    public static final /* synthetic */ void write$Self$app_google_playRelease(NoteinGoogleInAppPurchase self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        output.OooOO0o(serialDesc, 0, self.purchaseToken);
        output.OooOO0o(serialDesc, 1, self.productId);
        output.OooOO0o(serialDesc, 2, self.userId);
        output.OooOoOO(3, self.acknowledgementState, serialDesc);
        output.OooOoOO(4, self.purchaseState, serialDesc);
        output.OooOO0o(serialDesc, 5, self.status);
        output.OooOoOO(6, self.consumptionState, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
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

    public final NoteinGoogleInAppPurchase copy(String purchaseToken, String productId, String userId, int acknowledgementState, int purchaseState, String status, int consumptionState) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(productId, "productId");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(status, "status");
        return new NoteinGoogleInAppPurchase(purchaseToken, productId, userId, acknowledgementState, purchaseState, status, consumptionState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteinGoogleInAppPurchase)) {
            return false;
        }
        NoteinGoogleInAppPurchase noteinGoogleInAppPurchase = (NoteinGoogleInAppPurchase) other;
        return OooOOO0.OooO0O0(this.purchaseToken, noteinGoogleInAppPurchase.purchaseToken) && OooOOO0.OooO0O0(this.productId, noteinGoogleInAppPurchase.productId) && OooOOO0.OooO0O0(this.userId, noteinGoogleInAppPurchase.userId) && this.acknowledgementState == noteinGoogleInAppPurchase.acknowledgementState && this.purchaseState == noteinGoogleInAppPurchase.purchaseState && OooOOO0.OooO0O0(this.status, noteinGoogleInAppPurchase.status) && this.consumptionState == noteinGoogleInAppPurchase.consumptionState;
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
        return Integer.hashCode(this.consumptionState) + OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.purchaseState, C20785Oooo00o.OooO00o(this.acknowledgementState, OooO00o.OooO0O0(OooO00o.OooO0O0(this.purchaseToken.hashCode() * 31, 31, this.productId), 31, this.userId), 31), 31), 31, this.status);
    }

    public final boolean isAcknowledged() {
        return this.acknowledgementState == 1;
    }

    public final boolean isValid() {
        return this.purchaseState == 0 && this.status.length() == 0;
    }

    public String toString() {
        String str = this.purchaseToken;
        String str2 = this.productId;
        String str3 = this.userId;
        int i = this.acknowledgementState;
        int i2 = this.purchaseState;
        String str4 = this.status;
        int i3 = this.consumptionState;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteinGoogleInAppPurchase(purchaseToken=", str, ", productId=", str2, ", userId=");
        OooOO0.OooO0O0.OooO0Oo(i, str3, ", acknowledgementState=", ", purchaseState=", sbOooO0O0);
        C21036OooOOo0.OooO0Oo(i2, ", status=", str4, ", consumptionState=", sbOooO0O0);
        return C21023OooO0Oo.OooO0OO(")", i3, sbOooO0O0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeString(this.purchaseToken);
        dest.writeString(this.productId);
        dest.writeString(this.userId);
        dest.writeInt(this.acknowledgementState);
        dest.writeInt(this.purchaseState);
        dest.writeString(this.status);
        dest.writeInt(this.consumptionState);
    }

    public NoteinGoogleInAppPurchase(String purchaseToken, String productId, String userId, int i, int i2, String status, int i3) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(productId, "productId");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(status, "status");
        this.purchaseToken = purchaseToken;
        this.productId = productId;
        this.userId = userId;
        this.acknowledgementState = i;
        this.purchaseState = i2;
        this.status = status;
        this.consumptionState = i3;
    }
}
