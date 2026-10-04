package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.FolderEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o0000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34769o0000oo extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        FolderEntity folderEntity = (FolderEntity) obj;
        if (folderEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, folderEntity.getId());
        }
        if (folderEntity.getUserId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, folderEntity.getUserId());
        }
        if (folderEntity.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, folderEntity.getTitle());
        }
        if (folderEntity.getParentId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, folderEntity.getParentId());
        }
        if (folderEntity.getRecoverParentId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, folderEntity.getRecoverParentId());
        }
        interfaceC24749OooO0Oo.OooO0o(6, folderEntity.getFavorite() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(7, folderEntity.getInTrashBin() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(8, folderEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(9, folderEntity.getLastModificationTime());
        if (folderEntity.getTnPath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(10);
        } else {
            interfaceC24749OooO0Oo.o000000O(10, folderEntity.getTnPath());
        }
        if (folderEntity.getSortKey() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.OooO0o(11, folderEntity.getSortKey().intValue());
        }
        if (folderEntity.getCoverColor() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.OooO0o(12, folderEntity.getCoverColor().intValue());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `FolderEntity` (`id`,`user_id`,`title`,`parent_id`,`recover_parent_id`,`is_favorite`,`is_in_trash_bin`,`creation_time`,`last_modification_time`,`tn_path`,`sort_key`,`cover_color`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
