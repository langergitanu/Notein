package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.StickerCollectionEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O0000O extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34977o0O0000o f125601OooOo0o;

    public o0O0000O(C34977o0O0000o c34977o0O0000o) {
        this.f125601OooOo0o = c34977o0O0000o;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        StickerCollectionEntity stickerCollectionEntity = (StickerCollectionEntity) obj;
        if (stickerCollectionEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, stickerCollectionEntity.getId());
        }
        if (stickerCollectionEntity.getUserId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, stickerCollectionEntity.getUserId());
        }
        if (stickerCollectionEntity.getName() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, stickerCollectionEntity.getName());
        }
        String strStickersToString = this.f125601OooOo0o.f125604OooO0OO.stickersToString(stickerCollectionEntity.getChildren());
        if (strStickersToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, strStickersToString);
        }
        interfaceC24749OooO0Oo.OooO0o(5, stickerCollectionEntity.getBuiltIn() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(6, stickerCollectionEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(7, stickerCollectionEntity.getLastModificationTime());
        interfaceC24749OooO0Oo.OooO0o(8, stickerCollectionEntity.getSortKey());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `StickerCollectionEntity` (`id`,`user_id`,`name`,`children`,`built_in`,`creation_time`,`last_modification_time`,`sort_key`) VALUES (?,?,?,?,?,?,?,?)";
    }
}
