package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.PlayPurchaseServerEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34942o00oo extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PlayPurchaseServerEntity playPurchaseServerEntity = (PlayPurchaseServerEntity) obj;
        if (playPurchaseServerEntity.getPurchaseToken() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, playPurchaseServerEntity.getPurchaseToken());
        }
        if (playPurchaseServerEntity.getProductType() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, playPurchaseServerEntity.getProductType());
        }
        if (playPurchaseServerEntity.getProductId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, playPurchaseServerEntity.getProductId());
        }
        if (playPurchaseServerEntity.getOriginalJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, playPurchaseServerEntity.getOriginalJson());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `PlayPurchaseServerEntity` (`purchase_token`,`product_type`,`product_id`,`original_json`) VALUES (?,?,?,?)";
    }
}
