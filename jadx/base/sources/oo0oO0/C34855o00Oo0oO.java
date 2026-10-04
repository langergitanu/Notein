package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.UpdateOfferStatusEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00Oo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34855o00Oo0oO extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `NoteinGoogleDeveloperOfferEntity` SET `id` = ?,`used` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        UpdateOfferStatusEntity updateOfferStatusEntity = (UpdateOfferStatusEntity) obj;
        if (updateOfferStatusEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, updateOfferStatusEntity.getId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, updateOfferStatusEntity.getUsed() ? 1L : 0L);
        if (updateOfferStatusEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, updateOfferStatusEntity.getId());
        }
    }
}
