package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.HyperLinkEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o0000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34761o0000o extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        HyperLinkEntity hyperLinkEntity = (HyperLinkEntity) obj;
        if (hyperLinkEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, hyperLinkEntity.getId());
        }
        if (hyperLinkEntity.getBoundsJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, hyperLinkEntity.getBoundsJson());
        }
        if (hyperLinkEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, hyperLinkEntity.getPageId());
        }
        interfaceC24749OooO0Oo.OooO0o(4, hyperLinkEntity.getType());
        if (hyperLinkEntity.getDestination() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, hyperLinkEntity.getDestination());
        }
        if (hyperLinkEntity.getExtras() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, hyperLinkEntity.getExtras());
        }
        interfaceC24749OooO0Oo.OooO0o(7, hyperLinkEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(8, hyperLinkEntity.getLastModificationTime());
        if (hyperLinkEntity.getLeft() == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(hyperLinkEntity.getLeft().floatValue(), 9);
        }
        if (hyperLinkEntity.getTop() == null) {
            interfaceC24749OooO0Oo.OooO0oO(10);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(hyperLinkEntity.getTop().floatValue(), 10);
        }
        if (hyperLinkEntity.getRight() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(hyperLinkEntity.getRight().floatValue(), 11);
        }
        if (hyperLinkEntity.getBottom() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.OooOOOO(hyperLinkEntity.getBottom().floatValue(), 12);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `HyperLinkEntity` (`id`,`bounds`,`page_id`,`type`,`destination`,`extras`,`creation_time`,`last_modification_time`,`left`,`top`,`right`,`bottom`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
