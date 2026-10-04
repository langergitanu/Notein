package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NoteContentEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class oo0oOO0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C34826o00O0o00 f125679OooOo0o;

    public oo0oOO0(C34826o00O0o00 c34826o00O0o00) {
        this.f125679OooOo0o = c34826o00O0o00;
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
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
        C34826o00O0o00 c34826o00O0o00 = this.f125679OooOo0o;
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
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        return "INSERT OR REPLACE INTO `NoteContentEntity` (`id`,`page_list`,`page_layer_list`,`outline_list`,`default_page_id`,`pdf_info_id`,`saved_page_index`,`activated_page_layer_id`,`zoom`,`unbounded_page_offset_x`,`unbounded_page_offset_y`,`page_offset_json`,`unbounded_note`,`creation_time`,`last_modification_time`,`extras`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
