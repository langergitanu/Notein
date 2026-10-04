package com.orion.notein.domain.models.transactions.google;

import OooO.OooO00o;
import OooOoOO.C20519OooO0Oo;
import OoooooO.C21445Oooo;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.os.LocaleListCompat;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.util.OooOOO;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0O.C27279OooO00o;
import o0OOo0O.C27280OooO0O0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 =2\u00020\u0001:\u0003=>?B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0012J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010#R\u001b\u00106\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\rR\u001d\u00109\u001a\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u0010\u0010R\u001d\u0010<\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u0010\u0012¨\u0006@"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership;", "", "", CommonConstant.KEY_UID, "", "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleInAppPurchase;", "inAppPurchases", "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase;", "subsPurchases", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership$MembershipType;", "initMembershipType", "()Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership$MembershipType;", "Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership$SubscriptionType;", "initSubscriptionType", "()Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership$SubscriptionType;", "initSubscriptionExpiryDate", "()Ljava/lang/String;", FirebaseAnalytics.Event.PURCHASE, "Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$SubscriptionPurchaseLineItem;", "getValidSubsLineItem", "(Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase;)Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase$SubscriptionPurchaseLineItem;", "rfc3339Time", "formatDateStringToCurrentLocale", "(Ljava/lang/String;)Ljava/lang/String;", "", "hasEverPurchasedVip", "()Z", "getFirstActiveInAppPurchase", "()Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleInAppPurchase;", "getFirstActiveSubsPurchase", "()Lcom/orion/notein/domain/models/transactions/google/NoteinGoogleSubscriptionPurchase;", "component1", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUid", "Ljava/util/List;", "getInAppPurchases", "getSubsPurchases", "membershipType$delegate", "LoO00ooO/OooOO0;", "getMembershipType", "membershipType", "subscriptionType$delegate", "getSubscriptionType", "subscriptionType", "subscriptionExpiryDate$delegate", "getSubscriptionExpiryDate", "subscriptionExpiryDate", "Companion", "MembershipType", "SubscriptionType", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class FirebaseUserMembership {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FirebaseUserMembership GUEST;
    private static final String TAG = "FirebaseUserMembership";
    private final List<NoteinGoogleInAppPurchase> inAppPurchases;

    /* JADX INFO: renamed from: membershipType$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 membershipType;
    private final List<NoteinGoogleSubscriptionPurchase> subsPurchases;

    /* JADX INFO: renamed from: subscriptionExpiryDate$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 subscriptionExpiryDate;

    /* JADX INFO: renamed from: subscriptionType$delegate, reason: from kotlin metadata */
    private final InterfaceC32440OooOO0 subscriptionType;
    private final String uid;

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership$Companion;", "", "<init>", "()V", "TAG", "", "GUEST", "Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership;", "getGUEST", "()Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final FirebaseUserMembership getGUEST() {
            return FirebaseUserMembership.GUEST;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership$MembershipType;", "", "<init>", "(Ljava/lang/String;I)V", "FREE", "SUBSCRIPTION", "LIFE_TIME", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class MembershipType {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ MembershipType[] $VALUES;
        public static final MembershipType FREE = new MembershipType("FREE", 0);
        public static final MembershipType SUBSCRIPTION = new MembershipType("SUBSCRIPTION", 1);
        public static final MembershipType LIFE_TIME = new MembershipType("LIFE_TIME", 2);

        private static final /* synthetic */ MembershipType[] $values() {
            return new MembershipType[]{FREE, SUBSCRIPTION, LIFE_TIME};
        }

        static {
            MembershipType[] membershipTypeArr$values = $values();
            $VALUES = membershipTypeArr$values;
            $ENTRIES = OooO00o.OooO0O0(membershipTypeArr$values);
        }

        private MembershipType(String str, int i) {
        }

        public static InterfaceC34452OooO00o<MembershipType> getEntries() {
            return $ENTRIES;
        }

        public static MembershipType valueOf(String str) {
            return (MembershipType) Enum.valueOf(MembershipType.class, str);
        }

        public static MembershipType[] values() {
            return (MembershipType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/google/FirebaseUserMembership$SubscriptionType;", "", "<init>", "(Ljava/lang/String;I)V", "MONTHLY", "YEARLY", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class SubscriptionType {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ SubscriptionType[] $VALUES;
        public static final SubscriptionType MONTHLY = new SubscriptionType("MONTHLY", 0);
        public static final SubscriptionType YEARLY = new SubscriptionType("YEARLY", 1);

        private static final /* synthetic */ SubscriptionType[] $values() {
            return new SubscriptionType[]{MONTHLY, YEARLY};
        }

        static {
            SubscriptionType[] subscriptionTypeArr$values = $values();
            $VALUES = subscriptionTypeArr$values;
            $ENTRIES = OooO00o.OooO0O0(subscriptionTypeArr$values);
        }

        private SubscriptionType(String str, int i) {
        }

        public static InterfaceC34452OooO00o<SubscriptionType> getEntries() {
            return $ENTRIES;
        }

        public static SubscriptionType valueOf(String str) {
            return (SubscriptionType) Enum.valueOf(SubscriptionType.class, str);
        }

        public static SubscriptionType[] values() {
            return (SubscriptionType[]) $VALUES.clone();
        }
    }

    static {
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        GUEST = new FirebaseUserMembership("guest", c34434OooOoO, c34434OooOoO);
    }

    public FirebaseUserMembership(String uid, List<NoteinGoogleInAppPurchase> inAppPurchases, List<NoteinGoogleSubscriptionPurchase> subsPurchases) {
        OooOOO0.OooO0oO(uid, "uid");
        OooOOO0.OooO0oO(inAppPurchases, "inAppPurchases");
        OooOOO0.OooO0oO(subsPurchases, "subsPurchases");
        this.uid = uid;
        this.inAppPurchases = inAppPurchases;
        this.subsPurchases = subsPurchases;
        int i = 0;
        this.membershipType = C20519OooO0Oo.OooO0OO(new C27279OooO00o(this, i));
        this.subscriptionType = C20519OooO0Oo.OooO0OO(new C27280OooO0O0(this, i));
        this.subscriptionExpiryDate = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0OOo0O.OooO0OO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return this.f95074OooOo0o.initSubscriptionExpiryDate();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FirebaseUserMembership copy$default(FirebaseUserMembership firebaseUserMembership, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firebaseUserMembership.uid;
        }
        if ((i & 2) != 0) {
            list = firebaseUserMembership.inAppPurchases;
        }
        if ((i & 4) != 0) {
            list2 = firebaseUserMembership.subsPurchases;
        }
        return firebaseUserMembership.copy(str, list, list2);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.time.LocalDateTime] */
    private final String formatDateStringToCurrentLocale(String rfc3339Time) {
        try {
            ?? localDateTime = ZonedDateTime.parse(rfc3339Time).toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            LocaleListCompat localeListCompatOooO0o = AbstractC21486OooOO0o.OooO0o();
            OooOOO0.OooO0o(localeListCompatOooO0o, "getApplicationLocales(...)");
            return localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(!localeListCompatOooO0o.isEmpty() ? localeListCompatOooO0o.get(0) : Locale.getDefault()));
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO0OO(C22237OooO0o0.OooO00o("Failed to parse expiryTime: ", rfc3339Time, ". ", C32435OooO0Oo.OooO0O0(e)), new Object[0]);
            return null;
        }
    }

    private final NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem getValidSubsLineItem(NoteinGoogleSubscriptionPurchase purchase) {
        Object next;
        Iterator<T> it = purchase.getLineItems().iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem subscriptionPurchaseLineItem = (NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem) next;
            if (OooOOO0.OooO0O0(subscriptionPurchaseLineItem.getProductId(), GoogleBillingConstants.GOOGLE_VIP_BASIC_SUB)) {
                List<String> offerTags = subscriptionPurchaseLineItem.getOfferDetails().getOfferTags();
                boolean z = offerTags instanceof Collection;
                if (!z || !offerTags.isEmpty()) {
                    Iterator<T> it2 = offerTags.iterator();
                    while (it2.hasNext()) {
                        if (C33599OooOo0O.OooOoOO((String) it2.next(), "year", true)) {
                            break loop0;
                        }
                    }
                }
                if (!z || !offerTags.isEmpty()) {
                    Iterator<T> it3 = offerTags.iterator();
                    while (it3.hasNext()) {
                        if (C33599OooOo0O.OooOoOO((String) it3.next(), "month", true)) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MembershipType initMembershipType() {
        return getFirstActiveInAppPurchase() != null ? MembershipType.LIFE_TIME : getFirstActiveSubsPurchase() != null ? MembershipType.SUBSCRIPTION : MembershipType.FREE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String initSubscriptionExpiryDate() {
        NoteinGoogleSubscriptionPurchase firstActiveSubsPurchase = getFirstActiveSubsPurchase();
        if (firstActiveSubsPurchase == null) {
            return null;
        }
        NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem validSubsLineItem = getValidSubsLineItem(firstActiveSubsPurchase);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0(TAG);
        c20358OooO00o.OooO0o0("validLineItem: " + validSubsLineItem, new Object[0]);
        if (validSubsLineItem != null) {
            return formatDateStringToCurrentLocale(validSubsLineItem.getExpiryTime());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubscriptionType initSubscriptionType() {
        NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem validSubsLineItem;
        NoteinGoogleSubscriptionPurchase firstActiveSubsPurchase = getFirstActiveSubsPurchase();
        if (firstActiveSubsPurchase == null || (validSubsLineItem = getValidSubsLineItem(firstActiveSubsPurchase)) == null) {
            return null;
        }
        List<String> offerTags = validSubsLineItem.getOfferDetails().getOfferTags();
        boolean z = offerTags instanceof Collection;
        if (!z || !offerTags.isEmpty()) {
            Iterator<T> it = offerTags.iterator();
            while (it.hasNext()) {
                if (C33599OooOo0O.OooOoOO((String) it.next(), "year", true)) {
                    return SubscriptionType.YEARLY;
                }
            }
        }
        if (!z || !offerTags.isEmpty()) {
            Iterator<T> it2 = offerTags.iterator();
            while (it2.hasNext()) {
                if (C33599OooOo0O.OooOoOO((String) it2.next(), "month", true)) {
                    return SubscriptionType.MONTHLY;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    public final List<NoteinGoogleInAppPurchase> component2() {
        return this.inAppPurchases;
    }

    public final List<NoteinGoogleSubscriptionPurchase> component3() {
        return this.subsPurchases;
    }

    public final FirebaseUserMembership copy(String uid, List<NoteinGoogleInAppPurchase> inAppPurchases, List<NoteinGoogleSubscriptionPurchase> subsPurchases) {
        OooOOO0.OooO0oO(uid, "uid");
        OooOOO0.OooO0oO(inAppPurchases, "inAppPurchases");
        OooOOO0.OooO0oO(subsPurchases, "subsPurchases");
        return new FirebaseUserMembership(uid, inAppPurchases, subsPurchases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirebaseUserMembership)) {
            return false;
        }
        FirebaseUserMembership firebaseUserMembership = (FirebaseUserMembership) other;
        return OooOOO0.OooO0O0(this.uid, firebaseUserMembership.uid) && OooOOO0.OooO0O0(this.inAppPurchases, firebaseUserMembership.inAppPurchases) && OooOOO0.OooO0O0(this.subsPurchases, firebaseUserMembership.subsPurchases);
    }

    public final NoteinGoogleInAppPurchase getFirstActiveInAppPurchase() {
        Object next;
        List<NoteinGoogleInAppPurchase> list = this.inAppPurchases;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (OooOOO0.OooO0O0(((NoteinGoogleInAppPurchase) obj).getProductId(), GoogleBillingConstants.GOOGLE_VIP_BASIC_IN_APP)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            NoteinGoogleInAppPurchase noteinGoogleInAppPurchase = (NoteinGoogleInAppPurchase) next;
            if (noteinGoogleInAppPurchase.isValid() && noteinGoogleInAppPurchase.isAcknowledged()) {
                break;
            }
        }
        return (NoteinGoogleInAppPurchase) next;
    }

    public final NoteinGoogleSubscriptionPurchase getFirstActiveSubsPurchase() {
        Object next;
        List<NoteinGoogleSubscriptionPurchase> list = this.subsPurchases;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            List<NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem> lineItems = ((NoteinGoogleSubscriptionPurchase) obj).getLineItems();
            if (!(lineItems instanceof Collection) || !lineItems.isEmpty()) {
                Iterator<T> it = lineItems.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (OooOOO0.OooO0O0(((NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem) it.next()).getProductId(), GoogleBillingConstants.GOOGLE_VIP_BASIC_SUB)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = (NoteinGoogleSubscriptionPurchase) next;
            if (noteinGoogleSubscriptionPurchase.isValid() && noteinGoogleSubscriptionPurchase.isAcknowledged()) {
                break;
            }
        }
        return (NoteinGoogleSubscriptionPurchase) next;
    }

    public final List<NoteinGoogleInAppPurchase> getInAppPurchases() {
        return this.inAppPurchases;
    }

    public final MembershipType getMembershipType() {
        return (MembershipType) this.membershipType.getValue();
    }

    public final List<NoteinGoogleSubscriptionPurchase> getSubsPurchases() {
        return this.subsPurchases;
    }

    public final String getSubscriptionExpiryDate() {
        return (String) this.subscriptionExpiryDate.getValue();
    }

    public final SubscriptionType getSubscriptionType() {
        return (SubscriptionType) this.subscriptionType.getValue();
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean hasEverPurchasedVip() {
        boolean z;
        boolean z2;
        List<NoteinGoogleInAppPurchase> list = this.inAppPurchases;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (OooOOO0.OooO0O0(((NoteinGoogleInAppPurchase) it.next()).getProductId(), GoogleBillingConstants.GOOGLE_VIP_BASIC_IN_APP)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<NoteinGoogleSubscriptionPurchase> list2 = this.subsPurchases;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z2 = false;
        } else {
            Iterator<T> it2 = list2.iterator();
            loop0: while (it2.hasNext()) {
                List<NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem> lineItems = ((NoteinGoogleSubscriptionPurchase) it2.next()).getLineItems();
                if (!(lineItems instanceof Collection) || !lineItems.isEmpty()) {
                    Iterator<T> it3 = lineItems.iterator();
                    while (it3.hasNext()) {
                        if (OooOOO0.OooO0O0(((NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem) it3.next()).getProductId(), GoogleBillingConstants.GOOGLE_VIP_BASIC_SUB)) {
                            z2 = true;
                            break loop0;
                        }
                    }
                }
            }
            z2 = false;
        }
        return z || z2;
    }

    public int hashCode() {
        return this.subsPurchases.hashCode() + C21445Oooo.OooO00o(this.inAppPurchases, this.uid.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.uid;
        List<NoteinGoogleInAppPurchase> list = this.inAppPurchases;
        List<NoteinGoogleSubscriptionPurchase> list2 = this.subsPurchases;
        StringBuilder sb = new StringBuilder("FirebaseUserMembership(uid=");
        sb.append(str);
        sb.append(", inAppPurchases=");
        sb.append(list);
        sb.append(", subsPurchases=");
        return OooOOO.OooO0O0(")", sb, list2);
    }
}
