package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.models.page.PaperOrientation;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00o0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34894o00o0O0 extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C34897o00o0OO f125430OooO00o;

    public C34894o00o0O0(C34897o00o0OO c34897o00o0OO) {
        this.f125430OooO00o = c34897o00o0OO;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `PageEntity` SET `id` = ?,`note_id` = ?,`paper_spec` = ?,`page_orientation` = ?,`paper_theme` = ?,`padding_color` = ?,`paper_padding` = ?,`padding_style_json` = ?,`creation_time` = ?,`last_modification_time` = ?,`tn_path` = ?,`unbounded` = ?,`source` = ?,`recover_note_id` = ?,`recover_note_title` = ?,`recover_index` = ?,`is_in_trash_bin` = ?,`history_page_id_list` = ?,`rotation_direction_index` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        PageEntity pageEntity = (PageEntity) obj;
        if (pageEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, pageEntity.getId());
        }
        if (pageEntity.getNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, pageEntity.getNoteId());
        }
        if (pageEntity.getPaperSpecJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, pageEntity.getPaperSpecJson());
        }
        PaperOrientation paperOrientation = pageEntity.getPaperOrientation();
        C34897o00o0OO c34897o00o0OO = this.f125430OooO00o;
        interfaceC24749OooO0Oo.o000000O(4, C34897o00o0OO.OooOOO0(c34897o00o0OO, paperOrientation));
        if (pageEntity.getPaperThemeJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, pageEntity.getPaperThemeJson());
        }
        interfaceC24749OooO0Oo.OooO0o(6, pageEntity.getPaddingColor());
        if (pageEntity.getPaperPaddingJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(7);
        } else {
            interfaceC24749OooO0Oo.o000000O(7, pageEntity.getPaperPaddingJson());
        }
        if (pageEntity.getPaddingStyleJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, pageEntity.getPaddingStyleJson());
        }
        interfaceC24749OooO0Oo.OooO0o(9, pageEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(10, pageEntity.getLastModificationTime());
        if (pageEntity.getTnPath() == null) {
            interfaceC24749OooO0Oo.OooO0oO(11);
        } else {
            interfaceC24749OooO0Oo.o000000O(11, pageEntity.getTnPath());
        }
        interfaceC24749OooO0Oo.OooO0o(12, pageEntity.getUnbounded() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(13, pageEntity.getSource());
        if (pageEntity.getRecoverNoteId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(14);
        } else {
            interfaceC24749OooO0Oo.o000000O(14, pageEntity.getRecoverNoteId());
        }
        if (pageEntity.getRecoverNoteTitle() == null) {
            interfaceC24749OooO0Oo.OooO0oO(15);
        } else {
            interfaceC24749OooO0Oo.o000000O(15, pageEntity.getRecoverNoteTitle());
        }
        interfaceC24749OooO0Oo.OooO0o(16, pageEntity.getRecoverIndex());
        interfaceC24749OooO0Oo.OooO0o(17, pageEntity.getInTrashBin() ? 1L : 0L);
        String strChildrenToString = c34897o00o0OO.f125434OooO0OO.childrenToString(pageEntity.getHistoryPageIdList());
        if (strChildrenToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(18);
        } else {
            interfaceC24749OooO0Oo.o000000O(18, strChildrenToString);
        }
        interfaceC24749OooO0Oo.OooO0o(19, pageEntity.getRotationDirectionIndex());
        if (pageEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(20);
        } else {
            interfaceC24749OooO0Oo.o000000O(20, pageEntity.getId());
        }
    }
}
