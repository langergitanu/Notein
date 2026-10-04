package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00OO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34839o00OO0oo extends AbstractC21138OooO0oo {
    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `NoteMetaEntity` SET `id` = ?,`user_id` = ?,`title` = ?,`parent_id` = ?,`recover_parent_id` = ?,`is_favorite` = ?,`tn_path` = ?,`tn_width` = ?,`tn_height` = ?,`is_in_trash_bin` = ?,`creation_time` = ?,`last_modification_time` = ?,`sort_key` = ?,`pdf_info_id` = ?,`total_pages_count` = ?,`unbounded_note` = ?,`using_own_pdf` = ?,`lock_added` = ?,`last_opened_time` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteMetaEntity noteMetaEntity = (NoteMetaEntity) obj;
        if (noteMetaEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteMetaEntity.getId());
        }
        if (noteMetaEntity.getUserId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteMetaEntity.getUserId());
        }
        if (noteMetaEntity.getTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, noteMetaEntity.getTitle());
        }
        if (noteMetaEntity.getParentId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, noteMetaEntity.getParentId());
        }
        if (noteMetaEntity.getRecoverParentId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, noteMetaEntity.getRecoverParentId());
        }
        interfaceC24749OooO0Oo.OooO0o(6, noteMetaEntity.getFavorite() ? 1L : 0L);
        if (noteMetaEntity.getTnPath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, noteMetaEntity.getTnPath());
        }
        interfaceC24749OooO0Oo.OooO0o(8, noteMetaEntity.getTnWidth());
        interfaceC24749OooO0Oo.OooO0o(9, noteMetaEntity.getTnHeight());
        interfaceC24749OooO0Oo.OooO0o(10, noteMetaEntity.getInTrashBin() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(11, noteMetaEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(12, noteMetaEntity.getLastModificationTime());
        if (noteMetaEntity.getSortKey() == null) {
            interfaceC24749OooO0Oo.OooO0oO(13);
        } else {
            interfaceC24749OooO0Oo.OooO0o(13, noteMetaEntity.getSortKey().intValue());
        }
        if (noteMetaEntity.getPdfInfoId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(14);
        } else {
            interfaceC24749OooO0Oo.o000000O(14, noteMetaEntity.getPdfInfoId());
        }
        interfaceC24749OooO0Oo.OooO0o(15, noteMetaEntity.getTotalPagesCount());
        interfaceC24749OooO0Oo.OooO0o(16, noteMetaEntity.getUnboundedNote() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(17, noteMetaEntity.getUsingOwnPdf() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(18, noteMetaEntity.getLockAdded() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(19, noteMetaEntity.getLastOpenedTime());
        if (noteMetaEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(20);
        } else {
            interfaceC24749OooO0Oo.o000000O(20, noteMetaEntity.getId());
        }
    }
}
