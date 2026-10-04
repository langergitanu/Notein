package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.cache.UpdateTextCacheCreationTimeEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o0000OOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34756o0000OOo extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `HandWritingTextCacheEntity` SET `page_id` = ?,`page_grid_x` = ?,`page_grid_y` = ?,`creation_time` = ? WHERE `page_id` = ? AND `page_grid_x` = ? AND `page_grid_y` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        UpdateTextCacheCreationTimeEntity updateTextCacheCreationTimeEntity = (UpdateTextCacheCreationTimeEntity) obj;
        if (updateTextCacheCreationTimeEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, updateTextCacheCreationTimeEntity.getPageId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, updateTextCacheCreationTimeEntity.getPageGridX());
        interfaceC24749OooO0Oo.OooO0o(3, updateTextCacheCreationTimeEntity.getPageGridY());
        interfaceC24749OooO0Oo.OooO0o(4, updateTextCacheCreationTimeEntity.getCreationTime());
        if (updateTextCacheCreationTimeEntity.getPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, updateTextCacheCreationTimeEntity.getPageId());
        }
        interfaceC24749OooO0Oo.OooO0o(6, updateTextCacheCreationTimeEntity.getPageGridX());
        interfaceC24749OooO0Oo.OooO0o(7, updateTextCacheCreationTimeEntity.getPageGridY());
    }
}
