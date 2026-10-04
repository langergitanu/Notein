package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.DownloadedMaterialEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34893o00o0O extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        DownloadedMaterialEntity downloadedMaterialEntity = (DownloadedMaterialEntity) obj;
        if (downloadedMaterialEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, downloadedMaterialEntity.getId());
        }
        if (downloadedMaterialEntity.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, downloadedMaterialEntity.getTitle());
        }
        if (downloadedMaterialEntity.getType() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, downloadedMaterialEntity.getType());
        }
        if (downloadedMaterialEntity.getSubtype() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, downloadedMaterialEntity.getSubtype());
        }
        if (downloadedMaterialEntity.getCoverUrl() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, downloadedMaterialEntity.getCoverUrl());
        }
        if (downloadedMaterialEntity.getPreviewUrl() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, downloadedMaterialEntity.getPreviewUrl());
        }
        if (downloadedMaterialEntity.getDescription() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, downloadedMaterialEntity.getDescription());
        }
        if (downloadedMaterialEntity.getEntitlement() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, downloadedMaterialEntity.getEntitlement());
        }
        if (downloadedMaterialEntity.getDownloadUrl() == null) {
            interfaceC24749OooO0Oo.OooO0oO(9);
        } else {
            interfaceC24749OooO0Oo.o000000O(9, downloadedMaterialEntity.getDownloadUrl());
        }
        if (downloadedMaterialEntity.getFileSize() == null) {
            interfaceC24749OooO0Oo.OooO0oO(10);
        } else {
            interfaceC24749OooO0Oo.OooO0o(10, downloadedMaterialEntity.getFileSize().longValue());
        }
        if (downloadedMaterialEntity.getAuthorId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.o000000O(11, downloadedMaterialEntity.getAuthorId());
        }
        if (downloadedMaterialEntity.getAuthorName() == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.o000000O(12, downloadedMaterialEntity.getAuthorName());
        }
        if (downloadedMaterialEntity.getAuthorDescription() == null) {
            interfaceC24749OooO0Oo.OooO0oO(13);
        } else {
            interfaceC24749OooO0Oo.o000000O(13, downloadedMaterialEntity.getAuthorDescription());
        }
        if (downloadedMaterialEntity.getAuthorAvatarUrl() == null) {
            interfaceC24749OooO0Oo.OooO0oO(14);
        } else {
            interfaceC24749OooO0Oo.o000000O(14, downloadedMaterialEntity.getAuthorAvatarUrl());
        }
        if (downloadedMaterialEntity.getSpecJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(15);
        } else {
            interfaceC24749OooO0Oo.o000000O(15, downloadedMaterialEntity.getSpecJson());
        }
        if (downloadedMaterialEntity.getVersion() == null) {
            interfaceC24749OooO0Oo.OooO0oO(16);
        } else {
            interfaceC24749OooO0Oo.OooO0o(16, downloadedMaterialEntity.getVersion().intValue());
        }
        interfaceC24749OooO0Oo.OooO0o(17, downloadedMaterialEntity.getSavedAt());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `downloaded_material` (`id`,`title`,`type`,`subtype`,`cover_url`,`preview_url`,`description`,`entitlement`,`download_url`,`file_size`,`author_id`,`author_name`,`author_description`,`author_avatar_url`,`spec_json`,`version`,`saved_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
