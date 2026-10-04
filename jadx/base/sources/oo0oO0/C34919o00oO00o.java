package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.PageLayerEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00oO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34919o00oO00o extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `PageLayerEntity` SET `id` = ?,`note_id` = ?,`visible` = ?,`extras` = ?,`name` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PageLayerEntity pageLayerEntity = (PageLayerEntity) obj;
        if (pageLayerEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, pageLayerEntity.getId());
        }
        if (pageLayerEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, pageLayerEntity.getNoteId());
        }
        interfaceC24749OooO0Oo.OooO0o(3, pageLayerEntity.getVisible() ? 1L : 0L);
        if (pageLayerEntity.getExtras() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, pageLayerEntity.getExtras());
        }
        if (pageLayerEntity.getName() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, pageLayerEntity.getName());
        }
        if (pageLayerEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, pageLayerEntity.getId());
        }
    }
}
