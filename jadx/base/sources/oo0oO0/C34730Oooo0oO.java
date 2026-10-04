package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.AudioFileEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34730Oooo0oO extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `AudioFileEntity` SET `id` = ?,`file_path` = ?,`audio_name` = ?,`duration` = ?,`play_speed` = ?,`creation_time` = ?,`last_modification_time` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        AudioFileEntity audioFileEntity = (AudioFileEntity) obj;
        if (audioFileEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, audioFileEntity.getId());
        }
        if (audioFileEntity.getFilePath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, audioFileEntity.getFilePath());
        }
        if (audioFileEntity.getAudioName() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, audioFileEntity.getAudioName());
        }
        interfaceC24749OooO0Oo.OooO0o(4, audioFileEntity.getDuration());
        interfaceC24749OooO0Oo.OooOOOO(audioFileEntity.getPlaySpeed(), 5);
        interfaceC24749OooO0Oo.OooO0o(6, audioFileEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(7, audioFileEntity.getLastModificationTime());
        if (audioFileEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, audioFileEntity.getId());
        }
    }
}
