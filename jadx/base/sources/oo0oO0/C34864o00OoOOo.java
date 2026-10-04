package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NoteinGoogleSubscriptionPurchaseEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00OoOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34864o00OoOOo extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity = (NoteinGoogleSubscriptionPurchaseEntity) obj;
        if (noteinGoogleSubscriptionPurchaseEntity.getPurchaseToken() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteinGoogleSubscriptionPurchaseEntity.getPurchaseToken());
        }
        if (noteinGoogleSubscriptionPurchaseEntity.getUserId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteinGoogleSubscriptionPurchaseEntity.getUserId());
        }
        if (noteinGoogleSubscriptionPurchaseEntity.getLineItemsJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, noteinGoogleSubscriptionPurchaseEntity.getLineItemsJson());
        }
        if (noteinGoogleSubscriptionPurchaseEntity.getAcknowledgementState() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, noteinGoogleSubscriptionPurchaseEntity.getAcknowledgementState());
        }
        if (noteinGoogleSubscriptionPurchaseEntity.getSubscriptionState() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, noteinGoogleSubscriptionPurchaseEntity.getSubscriptionState());
        }
        if (noteinGoogleSubscriptionPurchaseEntity.getStatus() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, noteinGoogleSubscriptionPurchaseEntity.getStatus());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteinGoogleSubscriptionPurchaseEntity` (`purchase_token`,`user_id`,`line_items_json`,`acknowledgement_state`,`subscription_state`,`status`) VALUES (?,?,?,?,?,?)";
    }
}
