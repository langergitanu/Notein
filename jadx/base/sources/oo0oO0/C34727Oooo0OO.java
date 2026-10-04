package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.AudioFileEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34727Oooo0OO extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
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
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `AudioFileEntity` (`id`,`file_path`,`audio_name`,`duration`,`play_speed`,`creation_time`,`last_modification_time`) VALUES (?,?,?,?,?,?,?)";
    }
}
