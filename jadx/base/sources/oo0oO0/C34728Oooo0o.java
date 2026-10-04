package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.AudioSyncRecordDisplayItemIdEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34728Oooo0o extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `AudioSyncRecordEntity` SET `id` = ?,`display_item_id` = ?,`last_modification_time` = ?,`deleted` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        AudioSyncRecordDisplayItemIdEntity audioSyncRecordDisplayItemIdEntity = (AudioSyncRecordDisplayItemIdEntity) obj;
        if (audioSyncRecordDisplayItemIdEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, audioSyncRecordDisplayItemIdEntity.getId());
        }
        if (audioSyncRecordDisplayItemIdEntity.getDisplayItemId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, audioSyncRecordDisplayItemIdEntity.getDisplayItemId());
        }
        interfaceC24749OooO0Oo.OooO0o(3, audioSyncRecordDisplayItemIdEntity.getLastModificationTime());
        interfaceC24749OooO0Oo.OooO0o(4, audioSyncRecordDisplayItemIdEntity.getDeleted() ? 1L : 0L);
        if (audioSyncRecordDisplayItemIdEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, audioSyncRecordDisplayItemIdEntity.getId());
        }
    }
}
