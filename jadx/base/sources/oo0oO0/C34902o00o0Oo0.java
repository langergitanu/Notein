package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.cache.PageGridModificationRecordEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00o0Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34902o00o0Oo0 extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PageGridModificationRecordEntity pageGridModificationRecordEntity = (PageGridModificationRecordEntity) obj;
        if (pageGridModificationRecordEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, pageGridModificationRecordEntity.getPageId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, pageGridModificationRecordEntity.getPageGridX());
        interfaceC24749OooO0Oo.OooO0o(3, pageGridModificationRecordEntity.getPageGridY());
        interfaceC24749OooO0Oo.OooO0o(4, pageGridModificationRecordEntity.getLastModificationTime());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `PageGridModificationRecordEntity` (`page_id`,`page_grid_x`,`page_grid_y`,`last_modification_time`) VALUES (?,?,?,?)";
    }
}
