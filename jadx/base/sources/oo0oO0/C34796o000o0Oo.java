package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.MaterialDownloadStateEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o000o0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34796o000o0Oo extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        MaterialDownloadStateEntity materialDownloadStateEntity = (MaterialDownloadStateEntity) obj;
        if (materialDownloadStateEntity.getMaterialId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, materialDownloadStateEntity.getMaterialId());
        }
        if (materialDownloadStateEntity.getMaterialType() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, materialDownloadStateEntity.getMaterialType());
        }
        if (materialDownloadStateEntity.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, materialDownloadStateEntity.getTitle());
        }
        if (materialDownloadStateEntity.getDownloadUrl() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, materialDownloadStateEntity.getDownloadUrl());
        }
        if (materialDownloadStateEntity.getLocalPath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, materialDownloadStateEntity.getLocalPath());
        }
        interfaceC24749OooO0Oo.OooO0o(6, materialDownloadStateEntity.getFileSize());
        interfaceC24749OooO0Oo.OooO0o(7, materialDownloadStateEntity.getDownloadedAt());
        interfaceC24749OooO0Oo.OooO0o(8, materialDownloadStateEntity.isAvailableOnServer() ? 1L : 0L);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `material_download_state` (`material_id`,`material_type`,`title`,`download_url`,`local_path`,`file_size`,`downloaded_at`,`is_available_on_server`) VALUES (?,?,?,?,?,?,?,?)";
    }
}
