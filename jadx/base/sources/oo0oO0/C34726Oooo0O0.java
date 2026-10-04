package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.AudioSyncRecordEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34726Oooo0O0 extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        AudioSyncRecordEntity audioSyncRecordEntity = (AudioSyncRecordEntity) obj;
        if (audioSyncRecordEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, audioSyncRecordEntity.getId());
        }
        if (audioSyncRecordEntity.getAudioId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, audioSyncRecordEntity.getAudioId());
        }
        interfaceC24749OooO0Oo.OooO0o(3, audioSyncRecordEntity.getAudioPosition());
        if (audioSyncRecordEntity.getDisplayItemId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, audioSyncRecordEntity.getDisplayItemId());
        }
        interfaceC24749OooO0Oo.OooO0o(5, audioSyncRecordEntity.getDisplayItemType());
        interfaceC24749OooO0Oo.OooO0o(6, audioSyncRecordEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(7, audioSyncRecordEntity.getLastModificationTime());
        interfaceC24749OooO0Oo.OooO0o(8, audioSyncRecordEntity.getDeleted() ? 1L : 0L);
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `AudioSyncRecordEntity` (`id`,`audio_id`,`audio_position`,`display_item_id`,`display_item_type`,`creation_time`,`last_modification_time`,`deleted`) VALUES (?,?,?,?,?,?,?,?)";
    }
}
