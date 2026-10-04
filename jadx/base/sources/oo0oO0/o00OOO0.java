package oo0oO0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.orion.notein.data.p602db.entity.NotePdfLostInfoEntity;
import com.orion.notein.data.p602db.entity.ToolBoxInfoEntity;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o00OOO0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f125331OooOo0o;

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooO(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, Object obj) {
        switch (this.f125331OooOo0o) {
            case 0:
                NotePdfLostInfoEntity notePdfLostInfoEntity = (NotePdfLostInfoEntity) obj;
                if (notePdfLostInfoEntity.getId() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(1);
                } else {
                    interfaceC24749OooO0Oo.o000000O(1, notePdfLostInfoEntity.getId());
                }
                if (notePdfLostInfoEntity.getSrcNoteId() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(2);
                } else {
                    interfaceC24749OooO0Oo.o000000O(2, notePdfLostInfoEntity.getSrcNoteId());
                }
                interfaceC24749OooO0Oo.OooO0o(3, notePdfLostInfoEntity.getCreationTime());
                if (notePdfLostInfoEntity.getPdfFileName() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(4);
                } else {
                    interfaceC24749OooO0Oo.o000000O(4, notePdfLostInfoEntity.getPdfFileName());
                }
                interfaceC24749OooO0Oo.OooO0o(5, notePdfLostInfoEntity.getDbVersion());
                interfaceC24749OooO0Oo.OooO0o(6, notePdfLostInfoEntity.getContentDBVersion());
                break;
            default:
                ToolBoxInfoEntity toolBoxInfoEntity = (ToolBoxInfoEntity) obj;
                if (toolBoxInfoEntity.getId() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(1);
                } else {
                    interfaceC24749OooO0Oo.o000000O(1, toolBoxInfoEntity.getId());
                }
                if (toolBoxInfoEntity.getNoteId() == null) {
                    interfaceC24749OooO0Oo.OooO0oO(2);
                } else {
                    interfaceC24749OooO0Oo.o000000O(2, toolBoxInfoEntity.getNoteId());
                }
                interfaceC24749OooO0Oo.OooO0o(3, toolBoxInfoEntity.getPos());
                break;
        }
    }

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final String OooOO0o() {
        switch (this.f125331OooOo0o) {
            case 0:
                return "INSERT OR REPLACE INTO `NotePdfLostInfoEntity` (`id`,`src_note_id`,`creation_time`,`pdf_file_name`,`db_version`,`content_db_version`) VALUES (?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `ToolBoxInfoEntity` (`id`,`note_id`,`pos`) VALUES (?,?,?)";
        }
    }
}
