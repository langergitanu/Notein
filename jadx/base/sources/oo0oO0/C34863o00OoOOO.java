package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NoteinGoogleInAppPurchaseEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00OoOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34863o00OoOOO extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteinGoogleInAppPurchaseEntity noteinGoogleInAppPurchaseEntity = (NoteinGoogleInAppPurchaseEntity) obj;
        if (noteinGoogleInAppPurchaseEntity.getPurchaseToken() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteinGoogleInAppPurchaseEntity.getPurchaseToken());
        }
        if (noteinGoogleInAppPurchaseEntity.getUserId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteinGoogleInAppPurchaseEntity.getUserId());
        }
        if (noteinGoogleInAppPurchaseEntity.getProductId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, noteinGoogleInAppPurchaseEntity.getProductId());
        }
        interfaceC24749OooO0Oo.OooO0o(4, noteinGoogleInAppPurchaseEntity.getAcknowledgementState());
        interfaceC24749OooO0Oo.OooO0o(5, noteinGoogleInAppPurchaseEntity.getPurchaseState());
        if (noteinGoogleInAppPurchaseEntity.getStatus() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, noteinGoogleInAppPurchaseEntity.getStatus());
        }
        interfaceC24749OooO0Oo.OooO0o(7, noteinGoogleInAppPurchaseEntity.getConsumptionState());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteinGoogleInAppPurchaseEntity` (`purchase_token`,`user_id`,`product_id`,`acknowledgement_state`,`purchase_state`,`status`,`consumption_state`) VALUES (?,?,?,?,?,?,?)";
    }
}
