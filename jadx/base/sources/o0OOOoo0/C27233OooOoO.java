package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27233OooOoO extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "ALTER TABLE TextBoxEntity ADD COLUMN default_text_color INTEGER NOT NULL DEFAULT 4278190080", "ALTER TABLE FolderEntity ADD COLUMN cover_color INTEGER DEFAULT NULL", "ALTER TABLE ImageEntity ADD COLUMN fixed INTEGER NOT NULL DEFAULT(0)");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE NoteFileEntity ADD COLUMN last_history_version_id TEXT DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("CREATE TABLE IF NOT EXISTS `LocalNoteFileVersionEntity` (`id` TEXT NOT NULL, `edited_time` INTEGER NOT NULL, `last_history_version_id` TEXT, PRIMARY KEY(`id`))");
    }
}
