package oo0oO0;

import Oooo0oo.AbstractC21138OooO0oo;
import com.orion.notein.data.p602db.entity.NoteContentEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00O0OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34822o00O0OoO extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C34826o00O0o00 f125282OooO00o;

    public C34822o00O0OoO(C34826o00O0o00 c34826o00O0o00) {
        this.f125282OooO00o = c34826o00O0o00;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final String Oooo() {
        return "UPDATE OR ABORT `NoteContentEntity` SET `id` = ?,`page_list` = ?,`page_layer_list` = ?,`outline_list` = ?,`default_page_id` = ?,`pdf_info_id` = ?,`saved_page_index` = ?,`activated_page_layer_id` = ?,`zoom` = ?,`unbounded_page_offset_x` = ?,`unbounded_page_offset_y` = ?,`page_offset_json` = ?,`unbounded_note` = ?,`creation_time` = ?,`last_modification_time` = ?,`extras` = ? WHERE `id` = ?";
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final void Oooo0OO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        NoteContentEntity noteContentEntity = (NoteContentEntity) obj;
        if (noteContentEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(1);
        } else {
            interfaceC24749OooO0Oo.o000000O(1, noteContentEntity.getId());
        }
        if (noteContentEntity.getPageListJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(2);
        } else {
            interfaceC24749OooO0Oo.o000000O(2, noteContentEntity.getPageListJson());
        }
        if (noteContentEntity.getPageLayerListJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(3);
        } else {
            interfaceC24749OooO0Oo.o000000O(3, noteContentEntity.getPageLayerListJson());
        }
        C34826o00O0o00 c34826o00O0o00 = this.f125282OooO00o;
        String strOutlineListToString = c34826o00O0o00.f125287OooO0OO.outlineListToString(noteContentEntity.getOutlines());
        if (strOutlineListToString == null) {
            interfaceC24749OooO0Oo.OooO0oO(4);
        } else {
            interfaceC24749OooO0Oo.o000000O(4, strOutlineListToString);
        }
        if (noteContentEntity.getDefaultPageId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(5);
        } else {
            interfaceC24749OooO0Oo.o000000O(5, noteContentEntity.getDefaultPageId());
        }
        if (noteContentEntity.getPdfInfoId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(6);
        } else {
            interfaceC24749OooO0Oo.o000000O(6, noteContentEntity.getPdfInfoId());
        }
        interfaceC24749OooO0Oo.OooO0o(7, noteContentEntity.getSavedPageIndex());
        if (noteContentEntity.getActivatedPageLayerId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(8);
        } else {
            interfaceC24749OooO0Oo.o000000O(8, noteContentEntity.getActivatedPageLayerId());
        }
        interfaceC24749OooO0Oo.OooOOOO(noteContentEntity.getZoom(), 9);
        interfaceC24749OooO0Oo.OooOOOO(noteContentEntity.getUnboundedPageOffsetX(), 10);
        interfaceC24749OooO0Oo.OooOOOO(noteContentEntity.getUnboundedPageOffsetY(), 11);
        String json = c34826o00O0o00.f125287OooO0OO.toJson(noteContentEntity.getPageOffSet());
        if (json == null) {
            interfaceC24749OooO0Oo.OooO0oO(12);
        } else {
            interfaceC24749OooO0Oo.o000000O(12, json);
        }
        interfaceC24749OooO0Oo.OooO0o(13, noteContentEntity.getUnboundedNote() ? 1L : 0L);
        interfaceC24749OooO0Oo.OooO0o(14, noteContentEntity.getCreationTime());
        interfaceC24749OooO0Oo.OooO0o(15, noteContentEntity.getLastModificationTime());
        if (noteContentEntity.getExtrasJson() == null) {
            interfaceC24749OooO0Oo.OooO0oO(16);
        } else {
            interfaceC24749OooO0Oo.o000000O(16, noteContentEntity.getExtrasJson());
        }
        if (noteContentEntity.getId() == null) {
            interfaceC24749OooO0Oo.OooO0oO(17);
        } else {
            interfaceC24749OooO0Oo.o000000O(17, noteContentEntity.getId());
        }
    }
}
