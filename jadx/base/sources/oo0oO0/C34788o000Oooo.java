package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.LatestOpenedNoteEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o000Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34788o000Oooo extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        LatestOpenedNoteEntity latestOpenedNoteEntity = (LatestOpenedNoteEntity) obj;
        if (latestOpenedNoteEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, latestOpenedNoteEntity.getNoteId());
        }
        interfaceC24749OooO0Oo.OooO0o(2, latestOpenedNoteEntity.getIndex());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `LatestOpenedNoteEntity` (`note_id`,`index`) VALUES (?,?)";
    }
}
