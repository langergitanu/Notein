package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.p603ai.NoteAiContentEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o00 extends AbstractC20449OooO0Oo {
    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteAiContentEntity noteAiContentEntity = (NoteAiContentEntity) obj;
        if (noteAiContentEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteAiContentEntity.getId());
        }
        if (noteAiContentEntity.getSummaryIdListJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteAiContentEntity.getSummaryIdListJson());
        }
        interfaceC24749OooO0Oo.OooO0o(3, noteAiContentEntity.getSavedSummaryIndex());
        interfaceC24749OooO0Oo.OooO0o(4, noteAiContentEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(5, noteAiContentEntity.getLastModificationTime());
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteAiContentEntity` (`id`,`summary_list`,`saved_summary_index`,`creation_time`,`last_modification_time`) VALUES (?,?,?,?,?)";
    }
}
