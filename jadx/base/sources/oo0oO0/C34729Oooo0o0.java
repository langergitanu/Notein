package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NoteAudioFileIdsFieldEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34729Oooo0o0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34731Oooo0oo f125052OooOo0o;

    public C34729Oooo0o0(C34731Oooo0oo c34731Oooo0oo) {
        this.f125052OooOo0o = c34731Oooo0oo;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteAudioFileIdsFieldEntity noteAudioFileIdsFieldEntity = (NoteAudioFileIdsFieldEntity) obj;
        if (noteAudioFileIdsFieldEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteAudioFileIdsFieldEntity.getId());
        }
        if (noteAudioFileIdsFieldEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteAudioFileIdsFieldEntity.getNoteId());
        }
        String strChildrenToString = this.f125052OooOo0o.f125058OooO0o0.childrenToString(noteAudioFileIdsFieldEntity.getFileIds());
        if (strChildrenToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, strChildrenToString);
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteAudioFileIdsFieldEntity` (`id`,`note_id`,`audio_file_ids`) VALUES (?,?,?)";
    }
}
