package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.cache.HandWritingTextCacheEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o0000OOO extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        HandWritingTextCacheEntity handWritingTextCacheEntity = (HandWritingTextCacheEntity) obj;
        if (handWritingTextCacheEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, handWritingTextCacheEntity.getPageId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, handWritingTextCacheEntity.getPageGridX());
        interfaceC24749OooO0Oo.OooO0o(3, handWritingTextCacheEntity.getPageGridY());
        interfaceC24749OooO0Oo.OooO0o(4, handWritingTextCacheEntity.getTrajectoryHash());
        interfaceC24749OooO0Oo.OooO0o(5, handWritingTextCacheEntity.getCreationTime());
        if (handWritingTextCacheEntity.getText() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, handWritingTextCacheEntity.getText());
        }
        if (handWritingTextCacheEntity.getElementsJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, handWritingTextCacheEntity.getElementsJson());
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `HandWritingTextCacheEntity` (`page_id`,`page_grid_x`,`page_grid_y`,`trajectory_hash`,`creation_time`,`text`,`elements_json`) VALUES (?,?,?,?,?,?,?)";
    }
}
