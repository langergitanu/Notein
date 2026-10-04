package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import com.orion.notein.data.p602db.entity.TextBoxEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: oo0oO0.o00OO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34838o00OO0oO extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125327OooOo0o;

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        switch (this.f125327OooOo0o) {
            case 0:
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
                break;
            default:
                TextBoxEntity textBoxEntity = (TextBoxEntity) obj;
                if (textBoxEntity.getId() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(1);
                } else {
                    interfaceC24749OooO0Oo.o000000O(1, textBoxEntity.getId());
                }
                if (textBoxEntity.getPageId() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(2);
                } else {
                    interfaceC24749OooO0Oo.o000000O(2, textBoxEntity.getPageId());
                }
                if (textBoxEntity.getText() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(3);
                } else {
                    interfaceC24749OooO0Oo.o000000O(3, textBoxEntity.getText());
                }
                interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getTextSize(), 4);
                interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getBoxWidth(), 5);
                interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getBoxHeight(), 6);
                interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getLineHeight(), 7);
                interfaceC24749OooO0Oo.OooO0o(8, textBoxEntity.getBackgroundColor());
                if (textBoxEntity.getBoundsJson() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(9);
                } else {
                    interfaceC24749OooO0Oo.o000000O(9, textBoxEntity.getBoundsJson());
                }
                interfaceC24749OooO0Oo.OooO0o(10, textBoxEntity.getLayer());
                if (textBoxEntity.getLayerId() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(11);
                } else {
                    interfaceC24749OooO0Oo.o000000O(11, textBoxEntity.getLayerId());
                }
                interfaceC24749OooO0Oo.OooO0o(12, textBoxEntity.getDefaultTextColor());
                interfaceC24749OooO0Oo.OooO0o(13, textBoxEntity.getCreationTime());
                if (textBoxEntity.getLocalTransformJson() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(14);
                } else {
                    interfaceC24749OooO0Oo.o000000O(14, textBoxEntity.getLocalTransformJson());
                }
                if (textBoxEntity.getLeft() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(15);
                } else {
                    interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getLeft().floatValue(), 15);
                }
                if (textBoxEntity.getTop() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(16);
                } else {
                    interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getTop().floatValue(), 16);
                }
                if (textBoxEntity.getRight() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(17);
                } else {
                    interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getRight().floatValue(), 17);
                }
                if (textBoxEntity.getBottom() != null) {
                    interfaceC24749OooO0Oo.OooOOOO(textBoxEntity.getBottom().floatValue(), 18);
                } else {
                    interfaceC24749OooO0Oo.OooO0oO(18);
                }
                break;
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        switch (this.f125327OooOo0o) {
            case 0:
                return "INSERT OR REPLACE INTO `NoteMetaEntity` (`id`,`user_id`,`title`,`parent_id`,`recover_parent_id`,`is_favorite`,`tn_path`,`tn_width`,`tn_height`,`is_in_trash_bin`,`creation_time`,`last_modification_time`,`sort_key`,`pdf_info_id`,`total_pages_count`,`unbounded_note`,`using_own_pdf`,`lock_added`,`last_opened_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `TextBoxEntity` (`id`,`page_id`,`text`,`text_size`,`box_width`,`box_height`,`line_height`,`background_color`,`bounds`,`layer`,`layer_id`,`default_text_color`,`creation_time`,`local_transform_json`,`left`,`top`,`right`,`bottom`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
