package com.orion.notein.domain.models.transactions.google;

import com.orion.notein.domain.models.transactions.google.SubscriptionPurchaseV2;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33927OooOo00;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.C34002o0ooOoO;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO00o;
import oO0oO000.OooO0O0;
import oO0oO000.OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m80612d2 = {"com/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2.SubscriptionPurchaseLineItem.$serializer", "LoO0oO00/Oooo0OO;", "Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionPurchaseLineItem;", "<init>", "()V", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionPurchaseLineItem;)V", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Lcom/orion/notein/domain/models/transactions/google/SubscriptionPurchaseV2$SubscriptionPurchaseLineItem;", "", "LoO0o0ooO/OooO0OO;", "childSerializers", "()[LoO0o0ooO/OooO0OO;", "LoO0o/OooO0o0;", "descriptor", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public /* synthetic */ class SubscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer implements InterfaceC33966Oooo0OO<SubscriptionPurchaseV2.SubscriptionPurchaseLineItem> {
    public static final SubscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer INSTANCE;
    private static final InterfaceC33531OooO0o0 descriptor;

    static {
        SubscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer subscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer = new SubscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer();
        INSTANCE = subscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer;
        C34001o0ooOO0 c34001o0ooOO0 = new C34001o0ooOO0("com.orion.notein.domain.models.transactions.google.SubscriptionPurchaseV2.SubscriptionPurchaseLineItem", subscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer, 6);
        c34001o0ooOO0.OooOO0("productId", true);
        c34001o0ooOO0.OooOO0("expiryTime", true);
        c34001o0ooOO0.OooOO0("autoRenewingPlan", true);
        c34001o0ooOO0.OooOO0("prepaidPlan", true);
        c34001o0ooOO0.OooOO0("offerDetails", true);
        c34001o0ooOO0.OooOO0("deferredItemReplacement", true);
        descriptor = c34001o0ooOO0;
    }

    private SubscriptionPurchaseV2$SubscriptionPurchaseLineItem$$serializer() {
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public final InterfaceC33911OooO0OO<?>[] childSerializers() {
        InterfaceC33911OooO0OO<?> interfaceC33911OooO0OOOooO0OO = C33928OooO00o.OooO0OO(SubscriptionPurchaseV2$AutoRenewingPlan$$serializer.INSTANCE);
        InterfaceC33911OooO0OO<?> interfaceC33911OooO0OOOooO0OO2 = C33928OooO00o.OooO0OO(SubscriptionPurchaseV2$PrepaidPlan$$serializer.INSTANCE);
        InterfaceC33911OooO0OO<?> interfaceC33911OooO0OOOooO0OO3 = C33928OooO00o.OooO0OO(SubscriptionPurchaseV2$DeferredItemReplacement$$serializer.INSTANCE);
        o00000OO o00000oo2 = o00000OO.f122230OooO00o;
        return new InterfaceC33911OooO0OO[]{o00000oo2, o00000oo2, interfaceC33911OooO0OOOooO0OO, interfaceC33911OooO0OOOooO0OO2, SubscriptionPurchaseV2$OfferDetails$$serializer.INSTANCE, interfaceC33911OooO0OOOooO0OO3};
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final SubscriptionPurchaseV2.SubscriptionPurchaseLineItem deserialize(OooO0OO decoder) {
        OooOOO0.OooO0oO(decoder, "decoder");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        OooO00o OooO00o2 = decoder.OooO00o(interfaceC33531OooO0o0);
        int i = 0;
        String strOooo0 = null;
        String strOooo02 = null;
        SubscriptionPurchaseV2.AutoRenewingPlan autoRenewingPlan = null;
        SubscriptionPurchaseV2.PrepaidPlan prepaidPlan = null;
        SubscriptionPurchaseV2.OfferDetails offerDetails = null;
        SubscriptionPurchaseV2.DeferredItemReplacement deferredItemReplacement = null;
        boolean z = true;
        while (z) {
            int iOooOo0o = OooO00o2.OooOo0o(interfaceC33531OooO0o0);
            switch (iOooOo0o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strOooo0 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 0);
                    i |= 1;
                    break;
                case 1:
                    strOooo02 = OooO00o2.Oooo0(interfaceC33531OooO0o0, 1);
                    i |= 2;
                    break;
                case 2:
                    autoRenewingPlan = (SubscriptionPurchaseV2.AutoRenewingPlan) OooO00o2.OooOOO(interfaceC33531OooO0o0, 2, SubscriptionPurchaseV2$AutoRenewingPlan$$serializer.INSTANCE, autoRenewingPlan);
                    i |= 4;
                    break;
                case 3:
                    prepaidPlan = (SubscriptionPurchaseV2.PrepaidPlan) OooO00o2.OooOOO(interfaceC33531OooO0o0, 3, SubscriptionPurchaseV2$PrepaidPlan$$serializer.INSTANCE, prepaidPlan);
                    i |= 8;
                    break;
                case 4:
                    offerDetails = (SubscriptionPurchaseV2.OfferDetails) OooO00o2.OooOOO0(interfaceC33531OooO0o0, 4, SubscriptionPurchaseV2$OfferDetails$$serializer.INSTANCE, offerDetails);
                    i |= 16;
                    break;
                case 5:
                    deferredItemReplacement = (SubscriptionPurchaseV2.DeferredItemReplacement) OooO00o2.OooOOO(interfaceC33531OooO0o0, 5, SubscriptionPurchaseV2$DeferredItemReplacement$$serializer.INSTANCE, deferredItemReplacement);
                    i |= 32;
                    break;
                default:
                    throw new C33927OooOo00(iOooOo0o);
            }
        }
        OooO00o2.OooO0O0(interfaceC33531OooO0o0);
        return new SubscriptionPurchaseV2.SubscriptionPurchaseLineItem(i, strOooo0, strOooo02, autoRenewingPlan, prepaidPlan, offerDetails, deferredItemReplacement, (o000000O) null);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, SubscriptionPurchaseV2.SubscriptionPurchaseLineItem value) {
        OooOOO0.OooO0oO(encoder, "encoder");
        OooOOO0.OooO0oO(value, "value");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = descriptor;
        OooO0O0 oooO0O0OooO00o = encoder.OooO00o(interfaceC33531OooO0o0);
        SubscriptionPurchaseV2.SubscriptionPurchaseLineItem.write$Self$app_google_playRelease(value, oooO0O0OooO00o, interfaceC33531OooO0o0);
        oooO0O0OooO00o.OooO0O0(interfaceC33531OooO0o0);
    }

    @Override // oO0oO00.InterfaceC33966Oooo0OO
    public InterfaceC33911OooO0OO<?>[] typeParametersSerializers() {
        return C34002o0ooOoO.f122290OooO00o;
    }
}
