package com.orion.notein.domain.models.transactions.google;

import OoooooO.C21445Oooo;
import android.os.Parcel;
import android.os.Parcelable;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.hihonor.honorid.core.data.TmemberRight;
import com.orion.notein.domain.models.transactions.google.SubscriptionPurchaseV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0004HIGJBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 JR\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010 J\u0010\u0010*\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u001a\u0010-\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00106\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b4\u00105R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010 \"\u0004\b9\u0010:R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u00107\u001a\u0004\b;\u0010 \"\u0004\b<\u0010:R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010#\"\u0004\b?\u0010@R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u00107\u001a\u0004\bA\u0010 \"\u0004\bB\u0010:R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\bC\u0010 \"\u0004\bD\u0010:R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u00107\u001a\u0004\bE\u0010 \"\u0004\bF\u0010:¨\u0006K"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase;", "Landroid/os/Parcelable;", "", "purchaseToken", TmemberRight.TAG_USERID, "", "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$SubscriptionPurchaseLineItem;", "lineItems", "acknowledgementState", "subscriptionState", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LoO0oO00/o000000O;)V", "", "isAcknowledged", "()Z", "isCanceled", "isValid", "Landroid/os/Parcel;", "dest", "flags", "LoO00ooO/OooOooO;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Ljava/lang/String;", "getPurchaseToken", "setPurchaseToken", "(Ljava/lang/String;)V", "getUserId", "setUserId", "Ljava/util/List;", "getLineItems", "setLineItems", "(Ljava/util/List;)V", "getAcknowledgementState", "setAcknowledgementState", "getSubscriptionState", "setSubscriptionState", "getStatus", "setStatus", "Companion", "SubscriptionPurchaseLineItem", "OfferDetails", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NoteinGoogleSubscriptionPurchase implements Parcelable {

    @SerializedName("acknowledgementState")
    private String acknowledgementState;

    @SerializedName("lineItems")
    private List<SubscriptionPurchaseLineItem> lineItems;

    @SerializedName("purchaseToken")
    private String purchaseToken;

    @SerializedName("status")
    private String status;

    @SerializedName("subscriptionState")
    private String subscriptionState;

    @SerializedName(TmemberRight.TAG_USERID)
    private String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<NoteinGoogleSubscriptionPurchase> CREATOR = new Creator();
    private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, null, new C33938OooO0o0(C18895x1e689bed.INSTANCE), null, null, null};

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$Companion;", "", "<init>", "()V", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2;", FirebaseAnalytics.Event.PURCHASE, "", TmemberRight.TAG_USERID, "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase;", "fromSubscriptionPurchaseV2", "(Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2;Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase;", "LoO0o0ooO/OooO0OO;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final NoteinGoogleSubscriptionPurchase fromSubscriptionPurchaseV2(SubscriptionPurchaseV2 purchase, String userId) {
            OooOOO0.OooO0oO(purchase, "purchase");
            OooOOO0.OooO0oO(userId, "userId");
            String purchaseToken = purchase.getPurchaseToken();
            List<SubscriptionPurchaseV2.SubscriptionPurchaseLineItem> lineItems = purchase.getLineItems();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(lineItems, 10));
            for (SubscriptionPurchaseV2.SubscriptionPurchaseLineItem subscriptionPurchaseLineItem : lineItems) {
                arrayList.add(new SubscriptionPurchaseLineItem(subscriptionPurchaseLineItem.getProductId(), subscriptionPurchaseLineItem.getExpiryTime(), new OfferDetails(subscriptionPurchaseLineItem.getOfferDetails().getOfferTags(), subscriptionPurchaseLineItem.getOfferDetails().getBasePlanId(), subscriptionPurchaseLineItem.getOfferDetails().getOfferId())));
            }
            return new NoteinGoogleSubscriptionPurchase(purchaseToken, userId, arrayList, purchase.getAcknowledgementState().name(), purchase.getSubscriptionState().name(), "");
        }

        public final InterfaceC33911OooO0OO<NoteinGoogleSubscriptionPurchase> serializer() {
            return NoteinGoogleSubscriptionPurchase$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Creator implements Parcelable.Creator<NoteinGoogleSubscriptionPurchase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NoteinGoogleSubscriptionPurchase createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SubscriptionPurchaseLineItem.CREATOR.createFromParcel(parcel));
            }
            return new NoteinGoogleSubscriptionPurchase(string, string2, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NoteinGoogleSubscriptionPurchase[] newArray(int i) {
            return new NoteinGoogleSubscriptionPurchase[i];
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000212B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010!J6\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010!¨\u00063"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;", "Landroid/os/Parcelable;", "", "", "offerTags", "basePlanId", "offerId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOfferTags", "Ljava/lang/String;", "getBasePlanId", "getOfferId", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class OfferDetails implements Parcelable {

        @SerializedName("basePlanId")
        private final String basePlanId;

        @SerializedName("offerId")
        private final String offerId;

        @SerializedName("offerTags")
        private final List<String> offerTags;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<OfferDetails> CREATOR = new Creator();
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {new C33938OooO0o0(o00000OO.f122230OooO00o), null, null};
        private static final OfferDetails EMPTY = new OfferDetails((List) null, (String) null, (String) null, 7, (C24018OooO0oo) null);

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;", "serializer", "()LoO0o0ooO/OooO0OO;", "EMPTY", "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;", "getEMPTY", "()Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final OfferDetails getEMPTY() {
                return OfferDetails.EMPTY;
            }

            public final InterfaceC33911OooO0OO<OfferDetails> serializer() {
                return NoteinGoogleSubscriptionPurchase$OfferDetails$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Creator implements Parcelable.Creator<OfferDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OfferDetails createFromParcel(Parcel parcel) {
                OooOOO0.OooO0oO(parcel, "parcel");
                return new OfferDetails(parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OfferDetails[] newArray(int i) {
                return new OfferDetails[i];
            }
        }

        public OfferDetails() {
            this((List) null, (String) null, (String) null, 7, (C24018OooO0oo) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OfferDetails copy$default(OfferDetails offerDetails, List list, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = offerDetails.offerTags;
            }
            if ((i & 2) != 0) {
                str = offerDetails.basePlanId;
            }
            if ((i & 4) != 0) {
                str2 = offerDetails.offerId;
            }
            return offerDetails.copy(list, str, str2);
        }

        public static final /* synthetic */ void write$Self$app_google_playRelease(OfferDetails self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
            if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.offerTags, C34434OooOoO.f123453OooOo0o)) {
                output.OooOoo0(serialDesc, 0, interfaceC33911OooO0OOArr[0], self.offerTags);
            }
            if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.basePlanId, "")) {
                output.OooOO0o(serialDesc, 1, self.basePlanId);
            }
            if (!output.OooOoO0(serialDesc) && self.offerId == null) {
                return;
            }
            output.OooOo(serialDesc, 2, o00000OO.f122230OooO00o, self.offerId);
        }

        public final List<String> component1() {
            return this.offerTags;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getBasePlanId() {
            return this.basePlanId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        public final OfferDetails copy(List<String> offerTags, String basePlanId, String offerId) {
            OooOOO0.OooO0oO(offerTags, "offerTags");
            OooOOO0.OooO0oO(basePlanId, "basePlanId");
            return new OfferDetails(offerTags, basePlanId, offerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfferDetails)) {
                return false;
            }
            OfferDetails offerDetails = (OfferDetails) other;
            return OooOOO0.OooO0O0(this.offerTags, offerDetails.offerTags) && OooOOO0.OooO0O0(this.basePlanId, offerDetails.basePlanId) && OooOOO0.OooO0O0(this.offerId, offerDetails.offerId);
        }

        public final String getBasePlanId() {
            return this.basePlanId;
        }

        public final String getOfferId() {
            return this.offerId;
        }

        public final List<String> getOfferTags() {
            return this.offerTags;
        }

        public int hashCode() {
            int iOooO0O0 = OooO00o.OooO0O0(this.offerTags.hashCode() * 31, 31, this.basePlanId);
            String str = this.offerId;
            return iOooO0O0 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            List<String> list = this.offerTags;
            String str = this.basePlanId;
            String str2 = this.offerId;
            StringBuilder sb = new StringBuilder("OfferDetails(offerTags=");
            sb.append(list);
            sb.append(", basePlanId=");
            sb.append(str);
            sb.append(", offerId=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            OooOOO0.OooO0oO(dest, "dest");
            dest.writeStringList(this.offerTags);
            dest.writeString(this.basePlanId);
            dest.writeString(this.offerId);
        }

        public /* synthetic */ OfferDetails(int i, List list, String str, String str2, o000000O o000000o2) {
            this.offerTags = (i & 1) == 0 ? C34434OooOoO.f123453OooOo0o : list;
            if ((i & 2) == 0) {
                this.basePlanId = "";
            } else {
                this.basePlanId = str;
            }
            if ((i & 4) == 0) {
                this.offerId = null;
            } else {
                this.offerId = str2;
            }
        }

        public OfferDetails(List<String> offerTags, String basePlanId, String str) {
            OooOOO0.OooO0oO(offerTags, "offerTags");
            OooOOO0.OooO0oO(basePlanId, "basePlanId");
            this.offerTags = offerTags;
            this.basePlanId = basePlanId;
            this.offerId = str;
        }

        public /* synthetic */ OfferDetails(List list, String str, String str2, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? C34434OooOoO.f123453OooOo0o : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2);
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J.\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\"¨\u00063"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$SubscriptionPurchaseLineItem;", "Landroid/os/Parcelable;", "", "productId", "expiryTime", "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;", "offerDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$SubscriptionPurchaseLineItem;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;)Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$SubscriptionPurchaseLineItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getExpiryTime", "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$OfferDetails;", "getOfferDetails", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class SubscriptionPurchaseLineItem implements Parcelable {

        @SerializedName("expiryTime")
        private final String expiryTime;

        @SerializedName("offerDetails")
        private final OfferDetails offerDetails;

        @SerializedName("productId")
        private final String productId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<SubscriptionPurchaseLineItem> CREATOR = new Creator();

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$SubscriptionPurchaseLineItem$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$SubscriptionPurchaseLineItem;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC33911OooO0OO<SubscriptionPurchaseLineItem> serializer() {
                return C18895x1e689bed.INSTANCE;
            }

            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }
        }

        @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Creator implements Parcelable.Creator<SubscriptionPurchaseLineItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubscriptionPurchaseLineItem createFromParcel(Parcel parcel) {
                OooOOO0.OooO0oO(parcel, "parcel");
                return new SubscriptionPurchaseLineItem(parcel.readString(), parcel.readString(), OfferDetails.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubscriptionPurchaseLineItem[] newArray(int i) {
                return new SubscriptionPurchaseLineItem[i];
            }
        }

        public SubscriptionPurchaseLineItem() {
            this((String) null, (String) null, (OfferDetails) null, 7, (C24018OooO0oo) null);
        }

        public static /* synthetic */ SubscriptionPurchaseLineItem copy$default(SubscriptionPurchaseLineItem subscriptionPurchaseLineItem, String str, String str2, OfferDetails offerDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscriptionPurchaseLineItem.productId;
            }
            if ((i & 2) != 0) {
                str2 = subscriptionPurchaseLineItem.expiryTime;
            }
            if ((i & 4) != 0) {
                offerDetails = subscriptionPurchaseLineItem.offerDetails;
            }
            return subscriptionPurchaseLineItem.copy(str, str2, offerDetails);
        }

        public static final /* synthetic */ void write$Self$app_google_playRelease(SubscriptionPurchaseLineItem self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.productId, "")) {
                output.OooOO0o(serialDesc, 0, self.productId);
            }
            if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.expiryTime, "")) {
                output.OooOO0o(serialDesc, 1, self.expiryTime);
            }
            if (!output.OooOoO0(serialDesc) && OooOOO0.OooO0O0(self.offerDetails, OfferDetails.INSTANCE.getEMPTY())) {
                return;
            }
            output.OooOoo0(serialDesc, 2, NoteinGoogleSubscriptionPurchase$OfferDetails$$serializer.INSTANCE, self.offerDetails);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getExpiryTime() {
            return this.expiryTime;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final OfferDetails getOfferDetails() {
            return this.offerDetails;
        }

        public final SubscriptionPurchaseLineItem copy(String productId, String expiryTime, OfferDetails offerDetails) {
            OooOOO0.OooO0oO(productId, "productId");
            OooOOO0.OooO0oO(expiryTime, "expiryTime");
            OooOOO0.OooO0oO(offerDetails, "offerDetails");
            return new SubscriptionPurchaseLineItem(productId, expiryTime, offerDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubscriptionPurchaseLineItem)) {
                return false;
            }
            SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = (SubscriptionPurchaseLineItem) other;
            return OooOOO0.OooO0O0(this.productId, subscriptionPurchaseLineItem.productId) && OooOOO0.OooO0O0(this.expiryTime, subscriptionPurchaseLineItem.expiryTime) && OooOOO0.OooO0O0(this.offerDetails, subscriptionPurchaseLineItem.offerDetails);
        }

        public final String getExpiryTime() {
            return this.expiryTime;
        }

        public final OfferDetails getOfferDetails() {
            return this.offerDetails;
        }

        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.offerDetails.hashCode() + OooO00o.OooO0O0(this.productId.hashCode() * 31, 31, this.expiryTime);
        }

        public String toString() {
            String str = this.productId;
            String str2 = this.expiryTime;
            OfferDetails offerDetails = this.offerDetails;
            StringBuilder sbOooO0O0 = OooO0o.OooO0O0("SubscriptionPurchaseLineItem(productId=", str, ", expiryTime=", str2, ", offerDetails=");
            sbOooO0O0.append(offerDetails);
            sbOooO0O0.append(")");
            return sbOooO0O0.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            OooOOO0.OooO0oO(dest, "dest");
            dest.writeString(this.productId);
            dest.writeString(this.expiryTime);
            this.offerDetails.writeToParcel(dest, flags);
        }

        public /* synthetic */ SubscriptionPurchaseLineItem(int i, String str, String str2, OfferDetails offerDetails, o000000O o000000o2) {
            if ((i & 1) == 0) {
                this.productId = "";
            } else {
                this.productId = str;
            }
            if ((i & 2) == 0) {
                this.expiryTime = "";
            } else {
                this.expiryTime = str2;
            }
            if ((i & 4) == 0) {
                this.offerDetails = OfferDetails.INSTANCE.getEMPTY();
            } else {
                this.offerDetails = offerDetails;
            }
        }

        public SubscriptionPurchaseLineItem(String productId, String expiryTime, OfferDetails offerDetails) {
            OooOOO0.OooO0oO(productId, "productId");
            OooOOO0.OooO0oO(expiryTime, "expiryTime");
            OooOOO0.OooO0oO(offerDetails, "offerDetails");
            this.productId = productId;
            this.expiryTime = expiryTime;
            this.offerDetails = offerDetails;
        }

        public /* synthetic */ SubscriptionPurchaseLineItem(String str, String str2, OfferDetails offerDetails, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? OfferDetails.INSTANCE.getEMPTY() : offerDetails);
        }
    }

    public NoteinGoogleSubscriptionPurchase() {
        this((String) null, (String) null, (List) null, (String) null, (String) null, (String) null, 63, (C24018OooO0oo) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoteinGoogleSubscriptionPurchase copy$default(NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase, String str, String str2, List list, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noteinGoogleSubscriptionPurchase.purchaseToken;
        }
        if ((i & 2) != 0) {
            str2 = noteinGoogleSubscriptionPurchase.userId;
        }
        if ((i & 4) != 0) {
            list = noteinGoogleSubscriptionPurchase.lineItems;
        }
        if ((i & 8) != 0) {
            str3 = noteinGoogleSubscriptionPurchase.acknowledgementState;
        }
        if ((i & 16) != 0) {
            str4 = noteinGoogleSubscriptionPurchase.subscriptionState;
        }
        if ((i & 32) != 0) {
            str5 = noteinGoogleSubscriptionPurchase.status;
        }
        String str6 = str4;
        String str7 = str5;
        return noteinGoogleSubscriptionPurchase.copy(str, str2, list, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$app_google_playRelease(NoteinGoogleSubscriptionPurchase self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.purchaseToken, "")) {
            output.OooOO0o(serialDesc, 0, self.purchaseToken);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.userId, "")) {
            output.OooOO0o(serialDesc, 1, self.userId);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.lineItems, C34434OooOoO.f123453OooOo0o)) {
            output.OooOoo0(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.lineItems);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.acknowledgementState, "")) {
            output.OooOO0o(serialDesc, 3, self.acknowledgementState);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.subscriptionState, "")) {
            output.OooOO0o(serialDesc, 4, self.subscriptionState);
        }
        if (!output.OooOoO0(serialDesc) && OooOOO0.OooO0O0(self.status, "")) {
            return;
        }
        output.OooOO0o(serialDesc, 5, self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final List<SubscriptionPurchaseLineItem> component3() {
        return this.lineItems;
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

    public final NoteinGoogleSubscriptionPurchase copy(String purchaseToken, String userId, List<SubscriptionPurchaseLineItem> lineItems, String acknowledgementState, String subscriptionState, String status) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(lineItems, "lineItems");
        OooOOO0.OooO0oO(acknowledgementState, "acknowledgementState");
        OooOOO0.OooO0oO(subscriptionState, "subscriptionState");
        OooOOO0.OooO0oO(status, "status");
        return new NoteinGoogleSubscriptionPurchase(purchaseToken, userId, lineItems, acknowledgementState, subscriptionState, status);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoteinGoogleSubscriptionPurchase)) {
            return false;
        }
        NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = (NoteinGoogleSubscriptionPurchase) other;
        return OooOOO0.OooO0O0(this.purchaseToken, noteinGoogleSubscriptionPurchase.purchaseToken) && OooOOO0.OooO0O0(this.userId, noteinGoogleSubscriptionPurchase.userId) && OooOOO0.OooO0O0(this.lineItems, noteinGoogleSubscriptionPurchase.lineItems) && OooOOO0.OooO0O0(this.acknowledgementState, noteinGoogleSubscriptionPurchase.acknowledgementState) && OooOOO0.OooO0O0(this.subscriptionState, noteinGoogleSubscriptionPurchase.subscriptionState) && OooOOO0.OooO0O0(this.status, noteinGoogleSubscriptionPurchase.status);
    }

    public final String getAcknowledgementState() {
        return this.acknowledgementState;
    }

    public final List<SubscriptionPurchaseLineItem> getLineItems() {
        return this.lineItems;
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
        return this.status.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(C21445Oooo.OooO00o(this.lineItems, OooO00o.OooO0O0(this.purchaseToken.hashCode() * 31, 31, this.userId), 31), 31, this.acknowledgementState), 31, this.subscriptionState);
    }

    public final boolean isAcknowledged() {
        return OooOOO0.OooO0O0(this.acknowledgementState, "ACKNOWLEDGEMENT_STATE_ACKNOWLEDGED");
    }

    public final boolean isCanceled() {
        return OooOOO0.OooO0O0(this.subscriptionState, "SUBSCRIPTION_STATE_CANCELED");
    }

    public final boolean isValid() {
        if (this.status.length() > 0) {
            return false;
        }
        return OooOOO0.OooO0O0(this.subscriptionState, "SUBSCRIPTION_STATE_ACTIVE") || OooOOO0.OooO0O0(this.subscriptionState, "SUBSCRIPTION_STATE_IN_GRACE_PERIOD") || OooOOO0.OooO0O0(this.subscriptionState, "SUBSCRIPTION_STATE_CANCELED");
    }

    public final void setAcknowledgementState(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.acknowledgementState = str;
    }

    public final void setLineItems(List<SubscriptionPurchaseLineItem> list) {
        OooOOO0.OooO0oO(list, "<set-?>");
        this.lineItems = list;
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
        List<SubscriptionPurchaseLineItem> list = this.lineItems;
        String str3 = this.acknowledgementState;
        String str4 = this.subscriptionState;
        String str5 = this.status;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NoteinGoogleSubscriptionPurchase(purchaseToken=", str, ", userId=", str2, ", lineItems=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", acknowledgementState=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", subscriptionState=");
        return C21445Oooo.OooO0O0(sbOooO0O0, str4, ", status=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeString(this.purchaseToken);
        dest.writeString(this.userId);
        List<SubscriptionPurchaseLineItem> list = this.lineItems;
        dest.writeInt(list.size());
        Iterator<SubscriptionPurchaseLineItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.acknowledgementState);
        dest.writeString(this.subscriptionState);
        dest.writeString(this.status);
    }

    public /* synthetic */ NoteinGoogleSubscriptionPurchase(int i, String str, String str2, List list, String str3, String str4, String str5, o000000O o000000o2) {
        if ((i & 1) == 0) {
            this.purchaseToken = "";
        } else {
            this.purchaseToken = str;
        }
        if ((i & 2) == 0) {
            this.userId = "";
        } else {
            this.userId = str2;
        }
        if ((i & 4) == 0) {
            this.lineItems = C34434OooOoO.f123453OooOo0o;
        } else {
            this.lineItems = list;
        }
        if ((i & 8) == 0) {
            this.acknowledgementState = "";
        } else {
            this.acknowledgementState = str3;
        }
        if ((i & 16) == 0) {
            this.subscriptionState = "";
        } else {
            this.subscriptionState = str4;
        }
        if ((i & 32) == 0) {
            this.status = "";
        } else {
            this.status = str5;
        }
    }

    public NoteinGoogleSubscriptionPurchase(String purchaseToken, String userId, List<SubscriptionPurchaseLineItem> lineItems, String acknowledgementState, String subscriptionState, String status) {
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(lineItems, "lineItems");
        OooOOO0.OooO0oO(acknowledgementState, "acknowledgementState");
        OooOOO0.OooO0oO(subscriptionState, "subscriptionState");
        OooOOO0.OooO0oO(status, "status");
        this.purchaseToken = purchaseToken;
        this.userId = userId;
        this.lineItems = lineItems;
        this.acknowledgementState = acknowledgementState;
        this.subscriptionState = subscriptionState;
        this.status = status;
    }

    public /* synthetic */ NoteinGoogleSubscriptionPurchase(String str, String str2, List list, String str3, String str4, String str5, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C34434OooOoO.f123453OooOo0o : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}
