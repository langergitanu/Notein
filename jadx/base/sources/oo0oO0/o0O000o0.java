package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.StickerEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O000o0 extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        StickerEntity stickerEntity = (StickerEntity) obj;
        if (stickerEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, stickerEntity.getId());
        }
        if (stickerEntity.getParentId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, stickerEntity.getParentId());
        }
        if (stickerEntity.getPath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, stickerEntity.getPath());
        }
        interfaceC24749OooO0Oo.OooO0o(4, stickerEntity.getLastUsedTime());
        interfaceC24749OooO0Oo.OooO0o(5, stickerEntity.getBuiltIn() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooOOOO(stickerEntity.getSvgAspectRatio(), 6);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `StickerEntity` (`id`,`parent_id`,`path`,`last_used_time`,`built_in`,`svg_aspect_ratio`) VALUES (?,?,?,?,?,?)";
    }
}
