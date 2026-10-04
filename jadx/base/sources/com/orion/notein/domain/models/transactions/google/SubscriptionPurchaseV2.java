package com.orion.notein.domain.models.transactions.google;

import OooO.OooO00o;
import OooOoOO.C20519OooO0Oo;
import OooOoo.C20593OooO0Oo;
import OoooooO.C21445Oooo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.words.StyleIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o00Oo0oO.C25050OooO0O0;
import o0OOo0O.C27282OooO0Oo;
import o0OOo0O.C27283OooO0o0;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C33940OooO0oo;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 O2\u00020\u0001:\tOPQRSTUVWBi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010$Jr\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010$J\u0010\u00103\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b3\u0010\"J\u001a\u00106\u001a\u00020\u00172\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010?\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bB\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010'R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bE\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010*R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bH\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bI\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010.R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010@\u001a\u0004\bL\u0010$\"\u0004\bM\u0010N¨\u0006X"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2;", "Landroid/os/Parcelable;", "", "kind", "regionCode", "", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionPurchaseLineItem;", "lineItems", "startTime", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionState;", "subscriptionState", "latestOrderId", "linkedPurchaseToken", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AcknowledgementState;", "acknowledgementState", "purchaseToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionState;Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AcknowledgementState;Ljava/lang/String;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionState;Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AcknowledgementState;Ljava/lang/String;LoO0oO00/o000000O;)V", "", "isAcknowledged", "()Z", "isPurchased", "Landroid/os/Parcel;", "dest", "flags", "LoO00ooO/OooOooO;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionState;", "component6", "component7", "component8", "()Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AcknowledgementState;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionState;Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AcknowledgementState;Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Ljava/lang/String;", "getKind", "getRegionCode", "Ljava/util/List;", "getLineItems", "getStartTime", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionState;", "getSubscriptionState", "getLatestOrderId", "getLinkedPurchaseToken", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AcknowledgementState;", "getAcknowledgementState", "getPurchaseToken", "setPurchaseToken", "(Ljava/lang/String;)V", "Companion", "SubscriptionPurchaseLineItem", "AutoRenewingPlan", "PrepaidPlan", "OfferDetails", "DeferredItemReplacement", "AcknowledgementState", "SubscriptionState", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SubscriptionPurchaseV2 implements Parcelable {
    private final AcknowledgementState acknowledgementState;
    private final String kind;
    private final String latestOrderId;
    private final List<SubscriptionPurchaseLineItem> lineItems;
    private final String linkedPurchaseToken;
    private String purchaseToken;
    private final String regionCode;
    private final String startTime;
    private final SubscriptionState subscriptionState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<SubscriptionPurchaseV2> CREATOR = new Creator();
    private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {null, null, new C33938OooO0o0(SubscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer.INSTANCE), null, SubscriptionState.INSTANCE.serializer(), null, null, AcknowledgementState.INSTANCE.serializer(), null};
    private static final SubscriptionPurchaseV2 EMPTY = new SubscriptionPurchaseV2("", "", C34434OooOoO.f123453OooOo0o, "", SubscriptionState.SUBSCRIPTION_STATE_UNSPECIFIED, "", (String) null, AcknowledgementState.ACKNOWLEDGEMENT_STATE_UNSPECIFIED, (String) null, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6, (C24018OooO0oo) null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AcknowledgementState;", "", "<init>", "(Ljava/lang/String;I)V", "ACKNOWLEDGEMENT_STATE_UNSPECIFIED", "ACKNOWLEDGEMENT_STATE_PENDING", "ACKNOWLEDGEMENT_STATE_ACKNOWLEDGED", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class AcknowledgementState {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ AcknowledgementState[] $VALUES;
        private static final InterfaceC32440OooOO0<InterfaceC33911OooO0OO<Object>> $cachedSerializer$delegate;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AcknowledgementState ACKNOWLEDGEMENT_STATE_UNSPECIFIED = new AcknowledgementState("ACKNOWLEDGEMENT_STATE_UNSPECIFIED", 0);
        public static final AcknowledgementState ACKNOWLEDGEMENT_STATE_PENDING = new AcknowledgementState("ACKNOWLEDGEMENT_STATE_PENDING", 1);
        public static final AcknowledgementState ACKNOWLEDGEMENT_STATE_ACKNOWLEDGED = new AcknowledgementState("ACKNOWLEDGEMENT_STATE_ACKNOWLEDGED", 2);

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AcknowledgementState$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AcknowledgementState;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ InterfaceC33911OooO0OO get$cachedSerializer() {
                return (InterfaceC33911OooO0OO) AcknowledgementState.$cachedSerializer$delegate.getValue();
            }

            public final InterfaceC33911OooO0OO<AcknowledgementState> serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }
        }

        private static final /* synthetic */ AcknowledgementState[] $values() {
            return new AcknowledgementState[]{ACKNOWLEDGEMENT_STATE_UNSPECIFIED, ACKNOWLEDGEMENT_STATE_PENDING, ACKNOWLEDGEMENT_STATE_ACKNOWLEDGED};
        }

        static {
            AcknowledgementState[] acknowledgementStateArr$values = $values();
            $VALUES = acknowledgementStateArr$values;
            $ENTRIES = OooO00o.OooO0O0(acknowledgementStateArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new C27282OooO0Oo());
        }

        private AcknowledgementState(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC33911OooO0OO _init_$_anonymous_() {
            return C25050OooO0O0.OooO0Oo("com.orion.notein.domain.models.transactions.google.SubscriptionPurchaseV2.AcknowledgementState", values());
        }

        public static InterfaceC34452OooO00o<AcknowledgementState> getEntries() {
            return $ENTRIES;
        }

        public static AcknowledgementState valueOf(String str) {
            return (AcknowledgementState) Enum.valueOf(AcknowledgementState.class, str);
        }

        public static AcknowledgementState[] values() {
            return (AcknowledgementState[]) $VALUES.clone();
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010 ¨\u0006/"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;", "Landroid/os/Parcelable;", "", "autoRenewEnabled", "", "priceChangeDetails", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoRenewEnabled", "Ljava/lang/String;", "getPriceChangeDetails", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class AutoRenewingPlan implements Parcelable {
        private final Boolean autoRenewEnabled;
        private final String priceChangeDetails;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<AutoRenewingPlan> CREATOR = new Creator();

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC33911OooO0OO<AutoRenewingPlan> serializer() {
                return SubscriptionPurchaseV2$AutoRenewingPlan$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }
        }

        @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoRenewingPlan> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoRenewingPlan createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                OooOOO0.OooO0oO(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AutoRenewingPlan(boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoRenewingPlan[] newArray(int i) {
                return new AutoRenewingPlan[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoRenewingPlan() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (C24018OooO0oo) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AutoRenewingPlan copy$default(AutoRenewingPlan autoRenewingPlan, Boolean bool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = autoRenewingPlan.autoRenewEnabled;
            }
            if ((i & 2) != 0) {
                str = autoRenewingPlan.priceChangeDetails;
            }
            return autoRenewingPlan.copy(bool, str);
        }

        public static final /* synthetic */ void write$Self$app_google_playRelease(AutoRenewingPlan self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.autoRenewEnabled, Boolean.FALSE)) {
                output.OooOo(serialDesc, 0, C33940OooO0oo.f122144OooO00o, self.autoRenewEnabled);
            }
            if (!output.OooOoO0(serialDesc) && self.priceChangeDetails == null) {
                return;
            }
            output.OooOo(serialDesc, 1, o00000OO.f122230OooO00o, self.priceChangeDetails);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPriceChangeDetails() {
            return this.priceChangeDetails;
        }

        public final AutoRenewingPlan copy(Boolean autoRenewEnabled, String priceChangeDetails) {
            return new AutoRenewingPlan(autoRenewEnabled, priceChangeDetails);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoRenewingPlan)) {
                return false;
            }
            AutoRenewingPlan autoRenewingPlan = (AutoRenewingPlan) other;
            return OooOOO0.OooO0O0(this.autoRenewEnabled, autoRenewingPlan.autoRenewEnabled) && OooOOO0.OooO0O0(this.priceChangeDetails, autoRenewingPlan.priceChangeDetails);
        }

        public final Boolean getAutoRenewEnabled() {
            return this.autoRenewEnabled;
        }

        public final String getPriceChangeDetails() {
            return this.priceChangeDetails;
        }

        public int hashCode() {
            Boolean bool = this.autoRenewEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.priceChangeDetails;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "AutoRenewingPlan(autoRenewEnabled=" + this.autoRenewEnabled + ", priceChangeDetails=" + this.priceChangeDetails + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v4, types: [int] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            ?? BooleanValue;
            OooOOO0.OooO0oO(dest, "dest");
            Boolean bool = this.autoRenewEnabled;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                dest.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            dest.writeInt(BooleanValue);
            dest.writeString(this.priceChangeDetails);
        }

        public /* synthetic */ AutoRenewingPlan(int i, Boolean bool, String str, o000000O o000000o2) {
            this.autoRenewEnabled = (i & 1) == 0 ? Boolean.FALSE : bool;
            if ((i & 2) == 0) {
                this.priceChangeDetails = null;
            } else {
                this.priceChangeDetails = str;
            }
        }

        public AutoRenewingPlan(Boolean bool, String str) {
            this.autoRenewEnabled = bool;
            this.priceChangeDetails = str;
        }

        public /* synthetic */ AutoRenewingPlan(Boolean bool, String str, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2;", "serializer", "()LoO0o0ooO/OooO0OO;", "EMPTY", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2;", "getEMPTY", "()Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final SubscriptionPurchaseV2 getEMPTY() {
            return SubscriptionPurchaseV2.EMPTY;
        }

        public final InterfaceC33911OooO0OO<SubscriptionPurchaseV2> serializer() {
            return SubscriptionPurchaseV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Creator implements Parcelable.Creator<SubscriptionPurchaseV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionPurchaseV2 createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SubscriptionPurchaseLineItem.CREATOR.createFromParcel(parcel));
            }
            return new SubscriptionPurchaseV2(string, string2, arrayList, parcel.readString(), SubscriptionState.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), AcknowledgementState.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubscriptionPurchaseV2[] newArray(int i) {
            return new SubscriptionPurchaseV2[i];
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001c¨\u0006*"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;", "Landroid/os/Parcelable;", "", "productId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class DeferredItemReplacement implements Parcelable {
        private final String productId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<DeferredItemReplacement> CREATOR = new Creator();

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC33911OooO0OO<DeferredItemReplacement> serializer() {
                return SubscriptionPurchaseV2$DeferredItemReplacement$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }
        }

        @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Creator implements Parcelable.Creator<DeferredItemReplacement> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeferredItemReplacement createFromParcel(Parcel parcel) {
                OooOOO0.OooO0oO(parcel, "parcel");
                return new DeferredItemReplacement(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeferredItemReplacement[] newArray(int i) {
                return new DeferredItemReplacement[i];
            }
        }

        public /* synthetic */ DeferredItemReplacement(int i, String str, o000000O o000000o2) {
            if (1 == (i & 1)) {
                this.productId = str;
            } else {
                C24242OooOOo.OooO0O0(i, 1, SubscriptionPurchaseV2$DeferredItemReplacement$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ DeferredItemReplacement copy$default(DeferredItemReplacement deferredItemReplacement, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deferredItemReplacement.productId;
            }
            return deferredItemReplacement.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        public final DeferredItemReplacement copy(String productId) {
            OooOOO0.OooO0oO(productId, "productId");
            return new DeferredItemReplacement(productId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeferredItemReplacement) && OooOOO0.OooO0O0(this.productId, ((DeferredItemReplacement) other).productId);
        }

        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productId.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("DeferredItemReplacement(productId=", this.productId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            OooOOO0.OooO0oO(dest, "dest");
            dest.writeString(this.productId);
        }

        public DeferredItemReplacement(String productId) {
            OooOOO0.OooO0oO(productId, "productId");
            this.productId = productId;
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000212B-\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010!J6\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010!¨\u00063"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;", "Landroid/os/Parcelable;", "", "", "offerTags", "basePlanId", "offerId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOfferTags", "Ljava/lang/String;", "getBasePlanId", "getOfferId", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class OfferDetails implements Parcelable {
        private final String basePlanId;
        private final String offerId;
        private final List<String> offerTags;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<OfferDetails> CREATOR = new Creator();
        private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {new C33938OooO0o0(o00000OO.f122230OooO00o), null, null};
        private static final OfferDetails EMPTY = new OfferDetails((List) null, (String) null, (String) null, 7, (C24018OooO0oo) null);

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;", "serializer", "()LoO0o0ooO/OooO0OO;", "EMPTY", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;", "getEMPTY", "()Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final OfferDetails getEMPTY() {
                return OfferDetails.EMPTY;
            }

            public final InterfaceC33911OooO0OO<OfferDetails> serializer() {
                return SubscriptionPurchaseV2$OfferDetails$$serializer.INSTANCE;
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
            int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.offerTags.hashCode() * 31, 31, this.basePlanId);
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
    @Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001c¨\u0006*"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;", "Landroid/os/Parcelable;", "", "allowExtendAfterTime", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAllowExtendAfterTime", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class PrepaidPlan implements Parcelable {
        private final String allowExtendAfterTime;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<PrepaidPlan> CREATOR = new Creator();

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC33911OooO0OO<PrepaidPlan> serializer() {
                return SubscriptionPurchaseV2$PrepaidPlan$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }
        }

        @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Creator implements Parcelable.Creator<PrepaidPlan> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrepaidPlan createFromParcel(Parcel parcel) {
                OooOOO0.OooO0oO(parcel, "parcel");
                return new PrepaidPlan(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrepaidPlan[] newArray(int i) {
                return new PrepaidPlan[i];
            }
        }

        public /* synthetic */ PrepaidPlan(int i, String str, o000000O o000000o2) {
            if (1 == (i & 1)) {
                this.allowExtendAfterTime = str;
            } else {
                C24242OooOOo.OooO0O0(i, 1, SubscriptionPurchaseV2$PrepaidPlan$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ PrepaidPlan copy$default(PrepaidPlan prepaidPlan, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = prepaidPlan.allowExtendAfterTime;
            }
            return prepaidPlan.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAllowExtendAfterTime() {
            return this.allowExtendAfterTime;
        }

        public final PrepaidPlan copy(String allowExtendAfterTime) {
            OooOOO0.OooO0oO(allowExtendAfterTime, "allowExtendAfterTime");
            return new PrepaidPlan(allowExtendAfterTime);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PrepaidPlan) && OooOOO0.OooO0O0(this.allowExtendAfterTime, ((PrepaidPlan) other).allowExtendAfterTime);
        }

        public final String getAllowExtendAfterTime() {
            return this.allowExtendAfterTime;
        }

        public int hashCode() {
            return this.allowExtendAfterTime.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("PrepaidPlan(allowExtendAfterTime=", this.allowExtendAfterTime, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            OooOOO0.OooO0oO(dest, "dest");
            dest.writeString(this.allowExtendAfterTime);
        }

        public PrepaidPlan(String allowExtendAfterTime) {
            OooOOO0.OooO0oO(allowExtendAfterTime, "allowExtendAfterTime");
            this.allowExtendAfterTime = allowExtendAfterTime;
        }
    }

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.JR\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u0010#J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010.¨\u0006E"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionPurchaseLineItem;", "Landroid/os/Parcelable;", "", "productId", "expiryTime", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;", "autoRenewingPlan", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;", "prepaidPlan", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;", "offerDetails", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;", "deferredItemReplacement", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionPurchaseLineItem;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;", "component4", "()Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;", "component5", "()Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;", "component6", "()Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;)Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionPurchaseLineItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getExpiryTime", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$AutoRenewingPlan;", "getAutoRenewingPlan", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$PrepaidPlan;", "getPrepaidPlan", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$OfferDetails;", "getOfferDetails", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$DeferredItemReplacement;", "getDeferredItemReplacement", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class SubscriptionPurchaseLineItem implements Parcelable {
        private final AutoRenewingPlan autoRenewingPlan;
        private final DeferredItemReplacement deferredItemReplacement;
        private final String expiryTime;
        private final OfferDetails offerDetails;
        private final PrepaidPlan prepaidPlan;
        private final String productId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<SubscriptionPurchaseLineItem> CREATOR = new Creator();

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionPurchaseLineItem$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionPurchaseLineItem;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final InterfaceC33911OooO0OO<SubscriptionPurchaseLineItem> serializer() {
                return SubscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer.INSTANCE;
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
                return new SubscriptionPurchaseLineItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AutoRenewingPlan.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PrepaidPlan.CREATOR.createFromParcel(parcel), OfferDetails.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DeferredItemReplacement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubscriptionPurchaseLineItem[] newArray(int i) {
                return new SubscriptionPurchaseLineItem[i];
            }
        }

        public SubscriptionPurchaseLineItem() {
            this((String) null, (String) null, (AutoRenewingPlan) null, (PrepaidPlan) null, (OfferDetails) null, (DeferredItemReplacement) null, 63, (C24018OooO0oo) null);
        }

        public static /* synthetic */ SubscriptionPurchaseLineItem copy$default(SubscriptionPurchaseLineItem subscriptionPurchaseLineItem, String str, String str2, AutoRenewingPlan autoRenewingPlan, PrepaidPlan prepaidPlan, OfferDetails offerDetails, DeferredItemReplacement deferredItemReplacement, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscriptionPurchaseLineItem.productId;
            }
            if ((i & 2) != 0) {
                str2 = subscriptionPurchaseLineItem.expiryTime;
            }
            if ((i & 4) != 0) {
                autoRenewingPlan = subscriptionPurchaseLineItem.autoRenewingPlan;
            }
            if ((i & 8) != 0) {
                prepaidPlan = subscriptionPurchaseLineItem.prepaidPlan;
            }
            if ((i & 16) != 0) {
                offerDetails = subscriptionPurchaseLineItem.offerDetails;
            }
            if ((i & 32) != 0) {
                deferredItemReplacement = subscriptionPurchaseLineItem.deferredItemReplacement;
            }
            OfferDetails offerDetails2 = offerDetails;
            DeferredItemReplacement deferredItemReplacement2 = deferredItemReplacement;
            return subscriptionPurchaseLineItem.copy(str, str2, autoRenewingPlan, prepaidPlan, offerDetails2, deferredItemReplacement2);
        }

        public static final /* synthetic */ void write$Self$app_google_playRelease(SubscriptionPurchaseLineItem self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.productId, "")) {
                output.OooOO0o(serialDesc, 0, self.productId);
            }
            if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.expiryTime, "")) {
                output.OooOO0o(serialDesc, 1, self.expiryTime);
            }
            if (output.OooOoO0(serialDesc) || self.autoRenewingPlan != null) {
                output.OooOo(serialDesc, 2, SubscriptionPurchaseV2$AutoRenewingPlan$$serializer.INSTANCE, self.autoRenewingPlan);
            }
            if (output.OooOoO0(serialDesc) || self.prepaidPlan != null) {
                output.OooOo(serialDesc, 3, SubscriptionPurchaseV2$PrepaidPlan$$serializer.INSTANCE, self.prepaidPlan);
            }
            if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.offerDetails, OfferDetails.INSTANCE.getEMPTY())) {
                output.OooOoo0(serialDesc, 4, SubscriptionPurchaseV2$OfferDetails$$serializer.INSTANCE, self.offerDetails);
            }
            if (!output.OooOoO0(serialDesc) && self.deferredItemReplacement == null) {
                return;
            }
            output.OooOo(serialDesc, 5, SubscriptionPurchaseV2$DeferredItemReplacement$$serializer.INSTANCE, self.deferredItemReplacement);
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
        public final AutoRenewingPlan getAutoRenewingPlan() {
            return this.autoRenewingPlan;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final PrepaidPlan getPrepaidPlan() {
            return this.prepaidPlan;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final OfferDetails getOfferDetails() {
            return this.offerDetails;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final DeferredItemReplacement getDeferredItemReplacement() {
            return this.deferredItemReplacement;
        }

        public final SubscriptionPurchaseLineItem copy(String productId, String expiryTime, AutoRenewingPlan autoRenewingPlan, PrepaidPlan prepaidPlan, OfferDetails offerDetails, DeferredItemReplacement deferredItemReplacement) {
            OooOOO0.OooO0oO(productId, "productId");
            OooOOO0.OooO0oO(expiryTime, "expiryTime");
            OooOOO0.OooO0oO(offerDetails, "offerDetails");
            return new SubscriptionPurchaseLineItem(productId, expiryTime, autoRenewingPlan, prepaidPlan, offerDetails, deferredItemReplacement);
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
            return OooOOO0.OooO0O0(this.productId, subscriptionPurchaseLineItem.productId) && OooOOO0.OooO0O0(this.expiryTime, subscriptionPurchaseLineItem.expiryTime) && OooOOO0.OooO0O0(this.autoRenewingPlan, subscriptionPurchaseLineItem.autoRenewingPlan) && OooOOO0.OooO0O0(this.prepaidPlan, subscriptionPurchaseLineItem.prepaidPlan) && OooOOO0.OooO0O0(this.offerDetails, subscriptionPurchaseLineItem.offerDetails) && OooOOO0.OooO0O0(this.deferredItemReplacement, subscriptionPurchaseLineItem.deferredItemReplacement);
        }

        public final AutoRenewingPlan getAutoRenewingPlan() {
            return this.autoRenewingPlan;
        }

        public final DeferredItemReplacement getDeferredItemReplacement() {
            return this.deferredItemReplacement;
        }

        public final String getExpiryTime() {
            return this.expiryTime;
        }

        public final OfferDetails getOfferDetails() {
            return this.offerDetails;
        }

        public final PrepaidPlan getPrepaidPlan() {
            return this.prepaidPlan;
        }

        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.productId.hashCode() * 31, 31, this.expiryTime);
            AutoRenewingPlan autoRenewingPlan = this.autoRenewingPlan;
            int iHashCode = (iOooO0O0 + (autoRenewingPlan == null ? 0 : autoRenewingPlan.hashCode())) * 31;
            PrepaidPlan prepaidPlan = this.prepaidPlan;
            int iHashCode2 = (this.offerDetails.hashCode() + ((iHashCode + (prepaidPlan == null ? 0 : prepaidPlan.hashCode())) * 31)) * 31;
            DeferredItemReplacement deferredItemReplacement = this.deferredItemReplacement;
            return iHashCode2 + (deferredItemReplacement != null ? deferredItemReplacement.hashCode() : 0);
        }

        public String toString() {
            String str = this.productId;
            String str2 = this.expiryTime;
            AutoRenewingPlan autoRenewingPlan = this.autoRenewingPlan;
            PrepaidPlan prepaidPlan = this.prepaidPlan;
            OfferDetails offerDetails = this.offerDetails;
            DeferredItemReplacement deferredItemReplacement = this.deferredItemReplacement;
            StringBuilder sbOooO0O0 = OooO0o.OooO0O0("SubscriptionPurchaseLineItem(productId=", str, ", expiryTime=", str2, ", autoRenewingPlan=");
            sbOooO0O0.append(autoRenewingPlan);
            sbOooO0O0.append(", prepaidPlan=");
            sbOooO0O0.append(prepaidPlan);
            sbOooO0O0.append(", offerDetails=");
            sbOooO0O0.append(offerDetails);
            sbOooO0O0.append(", deferredItemReplacement=");
            sbOooO0O0.append(deferredItemReplacement);
            sbOooO0O0.append(")");
            return sbOooO0O0.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            OooOOO0.OooO0oO(dest, "dest");
            dest.writeString(this.productId);
            dest.writeString(this.expiryTime);
            AutoRenewingPlan autoRenewingPlan = this.autoRenewingPlan;
            if (autoRenewingPlan == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                autoRenewingPlan.writeToParcel(dest, flags);
            }
            PrepaidPlan prepaidPlan = this.prepaidPlan;
            if (prepaidPlan == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                prepaidPlan.writeToParcel(dest, flags);
            }
            this.offerDetails.writeToParcel(dest, flags);
            DeferredItemReplacement deferredItemReplacement = this.deferredItemReplacement;
            if (deferredItemReplacement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                deferredItemReplacement.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ SubscriptionPurchaseLineItem(int i, String str, String str2, AutoRenewingPlan autoRenewingPlan, PrepaidPlan prepaidPlan, OfferDetails offerDetails, DeferredItemReplacement deferredItemReplacement, o000000O o000000o2) {
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
                this.autoRenewingPlan = null;
            } else {
                this.autoRenewingPlan = autoRenewingPlan;
            }
            if ((i & 8) == 0) {
                this.prepaidPlan = null;
            } else {
                this.prepaidPlan = prepaidPlan;
            }
            if ((i & 16) == 0) {
                this.offerDetails = OfferDetails.INSTANCE.getEMPTY();
            } else {
                this.offerDetails = offerDetails;
            }
            if ((i & 32) == 0) {
                this.deferredItemReplacement = null;
            } else {
                this.deferredItemReplacement = deferredItemReplacement;
            }
        }

        public SubscriptionPurchaseLineItem(String productId, String expiryTime, AutoRenewingPlan autoRenewingPlan, PrepaidPlan prepaidPlan, OfferDetails offerDetails, DeferredItemReplacement deferredItemReplacement) {
            OooOOO0.OooO0oO(productId, "productId");
            OooOOO0.OooO0oO(expiryTime, "expiryTime");
            OooOOO0.OooO0oO(offerDetails, "offerDetails");
            this.productId = productId;
            this.expiryTime = expiryTime;
            this.autoRenewingPlan = autoRenewingPlan;
            this.prepaidPlan = prepaidPlan;
            this.offerDetails = offerDetails;
            this.deferredItemReplacement = deferredItemReplacement;
        }

        public /* synthetic */ SubscriptionPurchaseLineItem(String str, String str2, AutoRenewingPlan autoRenewingPlan, PrepaidPlan prepaidPlan, OfferDetails offerDetails, DeferredItemReplacement deferredItemReplacement, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : autoRenewingPlan, (i & 8) != 0 ? null : prepaidPlan, (i & 16) != 0 ? OfferDetails.INSTANCE.getEMPTY() : offerDetails, (i & 32) != 0 ? null : deferredItemReplacement);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionState;", "", "<init>", "(Ljava/lang/String;I)V", "SUBSCRIPTION_STATE_UNSPECIFIED", "SUBSCRIPTION_STATE_PENDING", "SUBSCRIPTION_STATE_ACTIVE", "SUBSCRIPTION_STATE_PAUSED", "SUBSCRIPTION_STATE_IN_GRACE_PERIOD", "SUBSCRIPTION_STATE_ON_HOLD", "SUBSCRIPTION_STATE_CANCELED", "SUBSCRIPTION_STATE_EXPIRED", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class SubscriptionState {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ SubscriptionState[] $VALUES;
        private static final InterfaceC32440OooOO0<InterfaceC33911OooO0OO<Object>> $cachedSerializer$delegate;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SubscriptionState SUBSCRIPTION_STATE_UNSPECIFIED = new SubscriptionState("SUBSCRIPTION_STATE_UNSPECIFIED", 0);
        public static final SubscriptionState SUBSCRIPTION_STATE_PENDING = new SubscriptionState("SUBSCRIPTION_STATE_PENDING", 1);
        public static final SubscriptionState SUBSCRIPTION_STATE_ACTIVE = new SubscriptionState("SUBSCRIPTION_STATE_ACTIVE", 2);
        public static final SubscriptionState SUBSCRIPTION_STATE_PAUSED = new SubscriptionState("SUBSCRIPTION_STATE_PAUSED", 3);
        public static final SubscriptionState SUBSCRIPTION_STATE_IN_GRACE_PERIOD = new SubscriptionState("SUBSCRIPTION_STATE_IN_GRACE_PERIOD", 4);
        public static final SubscriptionState SUBSCRIPTION_STATE_ON_HOLD = new SubscriptionState("SUBSCRIPTION_STATE_ON_HOLD", 5);
        public static final SubscriptionState SUBSCRIPTION_STATE_CANCELED = new SubscriptionState("SUBSCRIPTION_STATE_CANCELED", 6);
        public static final SubscriptionState SUBSCRIPTION_STATE_EXPIRED = new SubscriptionState("SUBSCRIPTION_STATE_EXPIRED", 7);

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionState$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionState;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ InterfaceC33911OooO0OO get$cachedSerializer() {
                return (InterfaceC33911OooO0OO) SubscriptionState.$cachedSerializer$delegate.getValue();
            }

            public final InterfaceC33911OooO0OO<SubscriptionState> serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }
        }

        private static final /* synthetic */ SubscriptionState[] $values() {
            return new SubscriptionState[]{SUBSCRIPTION_STATE_UNSPECIFIED, SUBSCRIPTION_STATE_PENDING, SUBSCRIPTION_STATE_ACTIVE, SUBSCRIPTION_STATE_PAUSED, SUBSCRIPTION_STATE_IN_GRACE_PERIOD, SUBSCRIPTION_STATE_ON_HOLD, SUBSCRIPTION_STATE_CANCELED, SUBSCRIPTION_STATE_EXPIRED};
        }

        static {
            SubscriptionState[] subscriptionStateArr$values = $values();
            $VALUES = subscriptionStateArr$values;
            $ENTRIES = OooO00o.OooO0O0(subscriptionStateArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new C27283OooO0o0());
        }

        private SubscriptionState(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC33911OooO0OO _init_$_anonymous_() {
            return C25050OooO0O0.OooO0Oo("com.orion.notein.domain.models.transactions.google.SubscriptionPurchaseV2.SubscriptionState", values());
        }

        public static InterfaceC34452OooO00o<SubscriptionState> getEntries() {
            return $ENTRIES;
        }

        public static SubscriptionState valueOf(String str) {
            return (SubscriptionState) Enum.valueOf(SubscriptionState.class, str);
        }

        public static SubscriptionState[] values() {
            return (SubscriptionState[]) $VALUES.clone();
        }
    }

    public SubscriptionPurchaseV2() {
        this((String) null, (String) null, (List) null, (String) null, (SubscriptionState) null, (String) null, (String) null, (AcknowledgementState) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (C24018OooO0oo) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionPurchaseV2 copy$default(SubscriptionPurchaseV2 subscriptionPurchaseV2, String str, String str2, List list, String str3, SubscriptionState subscriptionState, String str4, String str5, AcknowledgementState acknowledgementState, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = subscriptionPurchaseV2.kind;
        }
        if ((i & 2) != 0) {
            str2 = subscriptionPurchaseV2.regionCode;
        }
        if ((i & 4) != 0) {
            list = subscriptionPurchaseV2.lineItems;
        }
        if ((i & 8) != 0) {
            str3 = subscriptionPurchaseV2.startTime;
        }
        if ((i & 16) != 0) {
            subscriptionState = subscriptionPurchaseV2.subscriptionState;
        }
        if ((i & 32) != 0) {
            str4 = subscriptionPurchaseV2.latestOrderId;
        }
        if ((i & 64) != 0) {
            str5 = subscriptionPurchaseV2.linkedPurchaseToken;
        }
        if ((i & 128) != 0) {
            acknowledgementState = subscriptionPurchaseV2.acknowledgementState;
        }
        if ((i & 256) != 0) {
            str6 = subscriptionPurchaseV2.purchaseToken;
        }
        AcknowledgementState acknowledgementState2 = acknowledgementState;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        SubscriptionState subscriptionState2 = subscriptionState;
        List list2 = list;
        return subscriptionPurchaseV2.copy(str, str2, list2, str3, subscriptionState2, str8, str9, acknowledgementState2, str7);
    }

    public static final /* synthetic */ void write$Self$app_google_playRelease(SubscriptionPurchaseV2 self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        InterfaceC33911OooO0OO<Object>[] interfaceC33911OooO0OOArr = $childSerializers;
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.kind, "")) {
            output.OooOO0o(serialDesc, 0, self.kind);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.regionCode, "")) {
            output.OooOO0o(serialDesc, 1, self.regionCode);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.lineItems, C34434OooOoO.f123453OooOo0o)) {
            output.OooOoo0(serialDesc, 2, interfaceC33911OooO0OOArr[2], self.lineItems);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.startTime, "")) {
            output.OooOO0o(serialDesc, 3, self.startTime);
        }
        if (output.OooOoO0(serialDesc) || self.subscriptionState != SubscriptionState.SUBSCRIPTION_STATE_UNSPECIFIED) {
            output.OooOoo0(serialDesc, 4, interfaceC33911OooO0OOArr[4], self.subscriptionState);
        }
        if (output.OooOoO0(serialDesc) || !OooOOO0.OooO0O0(self.latestOrderId, "")) {
            output.OooOO0o(serialDesc, 5, self.latestOrderId);
        }
        if (output.OooOoO0(serialDesc) || self.linkedPurchaseToken != null) {
            output.OooOo(serialDesc, 6, o00000OO.f122230OooO00o, self.linkedPurchaseToken);
        }
        if (output.OooOoO0(serialDesc) || self.acknowledgementState != AcknowledgementState.ACKNOWLEDGEMENT_STATE_UNSPECIFIED) {
            output.OooOoo0(serialDesc, 7, interfaceC33911OooO0OOArr[7], self.acknowledgementState);
        }
        if (!output.OooOoO0(serialDesc) && OooOOO0.OooO0O0(self.purchaseToken, "")) {
            return;
        }
        output.OooOO0o(serialDesc, 8, self.purchaseToken);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    public final List<SubscriptionPurchaseLineItem> component3() {
        return this.lineItems;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SubscriptionState getSubscriptionState() {
        return this.subscriptionState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLatestOrderId() {
        return this.latestOrderId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLinkedPurchaseToken() {
        return this.linkedPurchaseToken;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AcknowledgementState getAcknowledgementState() {
        return this.acknowledgementState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final SubscriptionPurchaseV2 copy(String kind, String regionCode, List<SubscriptionPurchaseLineItem> lineItems, String startTime, SubscriptionState subscriptionState, String latestOrderId, String linkedPurchaseToken, AcknowledgementState acknowledgementState, String purchaseToken) {
        OooOOO0.OooO0oO(kind, "kind");
        OooOOO0.OooO0oO(regionCode, "regionCode");
        OooOOO0.OooO0oO(lineItems, "lineItems");
        OooOOO0.OooO0oO(startTime, "startTime");
        OooOOO0.OooO0oO(subscriptionState, "subscriptionState");
        OooOOO0.OooO0oO(latestOrderId, "latestOrderId");
        OooOOO0.OooO0oO(acknowledgementState, "acknowledgementState");
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        return new SubscriptionPurchaseV2(kind, regionCode, lineItems, startTime, subscriptionState, latestOrderId, linkedPurchaseToken, acknowledgementState, purchaseToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPurchaseV2)) {
            return false;
        }
        SubscriptionPurchaseV2 subscriptionPurchaseV2 = (SubscriptionPurchaseV2) other;
        return OooOOO0.OooO0O0(this.kind, subscriptionPurchaseV2.kind) && OooOOO0.OooO0O0(this.regionCode, subscriptionPurchaseV2.regionCode) && OooOOO0.OooO0O0(this.lineItems, subscriptionPurchaseV2.lineItems) && OooOOO0.OooO0O0(this.startTime, subscriptionPurchaseV2.startTime) && this.subscriptionState == subscriptionPurchaseV2.subscriptionState && OooOOO0.OooO0O0(this.latestOrderId, subscriptionPurchaseV2.latestOrderId) && OooOOO0.OooO0O0(this.linkedPurchaseToken, subscriptionPurchaseV2.linkedPurchaseToken) && this.acknowledgementState == subscriptionPurchaseV2.acknowledgementState && OooOOO0.OooO0O0(this.purchaseToken, subscriptionPurchaseV2.purchaseToken);
    }

    public final AcknowledgementState getAcknowledgementState() {
        return this.acknowledgementState;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLatestOrderId() {
        return this.latestOrderId;
    }

    public final List<SubscriptionPurchaseLineItem> getLineItems() {
        return this.lineItems;
    }

    public final String getLinkedPurchaseToken() {
        return this.linkedPurchaseToken;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final SubscriptionState getSubscriptionState() {
        return this.subscriptionState;
    }

    public int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.subscriptionState.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C21445Oooo.OooO00o(this.lineItems, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.kind.hashCode() * 31, 31, this.regionCode), 31), 31, this.startTime)) * 31, 31, this.latestOrderId);
        String str = this.linkedPurchaseToken;
        return this.purchaseToken.hashCode() + ((this.acknowledgementState.hashCode() + ((iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final boolean isAcknowledged() {
        return this.acknowledgementState == AcknowledgementState.ACKNOWLEDGEMENT_STATE_ACKNOWLEDGED;
    }

    public final boolean isPurchased() {
        SubscriptionState subscriptionState = this.subscriptionState;
        return subscriptionState == SubscriptionState.SUBSCRIPTION_STATE_ACTIVE || subscriptionState == SubscriptionState.SUBSCRIPTION_STATE_IN_GRACE_PERIOD || subscriptionState == SubscriptionState.SUBSCRIPTION_STATE_CANCELED;
    }

    public final void setPurchaseToken(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.purchaseToken = str;
    }

    public String toString() {
        String str = this.kind;
        String str2 = this.regionCode;
        List<SubscriptionPurchaseLineItem> list = this.lineItems;
        String str3 = this.startTime;
        SubscriptionState subscriptionState = this.subscriptionState;
        String str4 = this.latestOrderId;
        String str5 = this.linkedPurchaseToken;
        AcknowledgementState acknowledgementState = this.acknowledgementState;
        String str6 = this.purchaseToken;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("SubscriptionPurchaseV2(kind=", str, ", regionCode=", str2, ", lineItems=");
        sbOooO0O0.append(list);
        sbOooO0O0.append(", startTime=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", subscriptionState=");
        sbOooO0O0.append(subscriptionState);
        sbOooO0O0.append(", latestOrderId=");
        sbOooO0O0.append(str4);
        sbOooO0O0.append(", linkedPurchaseToken=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(", acknowledgementState=");
        sbOooO0O0.append(acknowledgementState);
        sbOooO0O0.append(", purchaseToken=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeString(this.kind);
        dest.writeString(this.regionCode);
        List<SubscriptionPurchaseLineItem> list = this.lineItems;
        dest.writeInt(list.size());
        Iterator<SubscriptionPurchaseLineItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.startTime);
        dest.writeString(this.subscriptionState.name());
        dest.writeString(this.latestOrderId);
        dest.writeString(this.linkedPurchaseToken);
        dest.writeString(this.acknowledgementState.name());
        dest.writeString(this.purchaseToken);
    }

    public /* synthetic */ SubscriptionPurchaseV2(int i, String str, String str2, List list, String str3, SubscriptionState subscriptionState, String str4, String str5, AcknowledgementState acknowledgementState, String str6, o000000O o000000o2) {
        if ((i & 1) == 0) {
            this.kind = "";
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.regionCode = "";
        } else {
            this.regionCode = str2;
        }
        if ((i & 4) == 0) {
            this.lineItems = C34434OooOoO.f123453OooOo0o;
        } else {
            this.lineItems = list;
        }
        if ((i & 8) == 0) {
            this.startTime = "";
        } else {
            this.startTime = str3;
        }
        if ((i & 16) == 0) {
            this.subscriptionState = SubscriptionState.SUBSCRIPTION_STATE_UNSPECIFIED;
        } else {
            this.subscriptionState = subscriptionState;
        }
        if ((i & 32) == 0) {
            this.latestOrderId = "";
        } else {
            this.latestOrderId = str4;
        }
        if ((i & 64) == 0) {
            this.linkedPurchaseToken = null;
        } else {
            this.linkedPurchaseToken = str5;
        }
        if ((i & 128) == 0) {
            this.acknowledgementState = AcknowledgementState.ACKNOWLEDGEMENT_STATE_UNSPECIFIED;
        } else {
            this.acknowledgementState = acknowledgementState;
        }
        if ((i & 256) == 0) {
            this.purchaseToken = "";
        } else {
            this.purchaseToken = str6;
        }
    }

    public SubscriptionPurchaseV2(String kind, String regionCode, List<SubscriptionPurchaseLineItem> lineItems, String startTime, SubscriptionState subscriptionState, String latestOrderId, String str, AcknowledgementState acknowledgementState, String purchaseToken) {
        OooOOO0.OooO0oO(kind, "kind");
        OooOOO0.OooO0oO(regionCode, "regionCode");
        OooOOO0.OooO0oO(lineItems, "lineItems");
        OooOOO0.OooO0oO(startTime, "startTime");
        OooOOO0.OooO0oO(subscriptionState, "subscriptionState");
        OooOOO0.OooO0oO(latestOrderId, "latestOrderId");
        OooOOO0.OooO0oO(acknowledgementState, "acknowledgementState");
        OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
        this.kind = kind;
        this.regionCode = regionCode;
        this.lineItems = lineItems;
        this.startTime = startTime;
        this.subscriptionState = subscriptionState;
        this.latestOrderId = latestOrderId;
        this.linkedPurchaseToken = str;
        this.acknowledgementState = acknowledgementState;
        this.purchaseToken = purchaseToken;
    }

    public /* synthetic */ SubscriptionPurchaseV2(String str, String str2, List list, String str3, SubscriptionState subscriptionState, String str4, String str5, AcknowledgementState acknowledgementState, String str6, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C34434OooOoO.f123453OooOo0o : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? SubscriptionState.SUBSCRIPTION_STATE_UNSPECIFIED : subscriptionState, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? AcknowledgementState.ACKNOWLEDGEMENT_STATE_UNSPECIFIED : acknowledgementState, (i & 256) != 0 ? "" : str6);
    }
}
