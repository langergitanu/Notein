package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NoteinGoogleDeveloperOfferEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00Oo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34853o00Oo0o extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteinGoogleDeveloperOfferEntity noteinGoogleDeveloperOfferEntity = (NoteinGoogleDeveloperOfferEntity) obj;
        if (noteinGoogleDeveloperOfferEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteinGoogleDeveloperOfferEntity.getId());
        }
        if (noteinGoogleDeveloperOfferEntity.getUserId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteinGoogleDeveloperOfferEntity.getUserId());
        }
        if (noteinGoogleDeveloperOfferEntity.getProductId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, noteinGoogleDeveloperOfferEntity.getProductId());
        }
        if (noteinGoogleDeveloperOfferEntity.getBasePlanId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, noteinGoogleDeveloperOfferEntity.getBasePlanId());
        }
        if (noteinGoogleDeveloperOfferEntity.getOfferId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, noteinGoogleDeveloperOfferEntity.getOfferId());
        }
        interfaceC24749OooO0Oo.OooO0o(6, noteinGoogleDeveloperOfferEntity.getCreatedAt());
        interfaceC24749OooO0Oo.OooO0o(7, noteinGoogleDeveloperOfferEntity.getExpireAt());
        interfaceC24749OooO0Oo.OooO0o(8, noteinGoogleDeveloperOfferEntity.getUsed() ? 1L : 0L);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteinGoogleDeveloperOfferEntity` (`id`,`user_id`,`product_id`,`base_plan_id`,`offer_id`,`created_at`,`expire_at`,`used`) VALUES (?,?,?,?,?,?,?,?)";
    }
}
