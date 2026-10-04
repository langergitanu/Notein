package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.p603ai.NoteAiContentEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o00O0000 extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `NoteAiContentEntity` SET `id` = ?,`summary_list` = ?,`saved_summary_index` = ?,`creation_time` = ?,`last_modification_time` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
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
        if (noteAiContentEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, noteAiContentEntity.getId());
        }
    }
}
