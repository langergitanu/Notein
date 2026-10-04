package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.ImageEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o000O00 extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        ImageEntity imageEntity = (ImageEntity) obj;
        if (imageEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, imageEntity.getId());
        }
        if (imageEntity.getUri() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, imageEntity.getUri());
        }
        interfaceC24749OooO0Oo.OooO0o(3, imageEntity.getLayer());
        if (imageEntity.getLayerId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, imageEntity.getLayerId());
        }
        if (imageEntity.getBoundsJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, imageEntity.getBoundsJson());
        }
        interfaceC24749OooO0Oo.OooOOOO(imageEntity.getRotation(), 6);
        if (imageEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, imageEntity.getPageId());
        }
        interfaceC24749OooO0Oo.OooO0o(8, imageEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(9, imageEntity.getLastModificationTime());
        if (imageEntity.getLeft() == null) {
            interfaceC24749OooO0Oo.OooO0oO(10);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(imageEntity.getLeft().floatValue(), 10);
        }
        if (imageEntity.getTop() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(imageEntity.getTop().floatValue(), 11);
        }
        if (imageEntity.getRight() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(imageEntity.getRight().floatValue(), 12);
        }
        if (imageEntity.getBottom() == null) {
            interfaceC24749OooO0Oo.OooO0oO(13);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(imageEntity.getBottom().floatValue(), 13);
        }
        interfaceC24749OooO0Oo.OooO0o(14, imageEntity.getFixed() ? 1L : 0L);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR IGNORE INTO `ImageEntity` (`id`,`uri`,`layer`,`layer_id`,`bounds`,`rotation`,`page_id`,`creation_time`,`last_modification_time`,`left`,`top`,`right`,`bottom`,`fixed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
