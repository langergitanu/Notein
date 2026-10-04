package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27229OooOOoo extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `NoteMetaEntity` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `title` TEXT NOT NULL, `parent_id` TEXT, `recover_parent_id` TEXT, `is_favorite` INTEGER NOT NULL, `tn_path` TEXT NOT NULL, `is_in_trash_bin` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `sort_key` INTEGER, PRIMARY KEY(`id`))");
        database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `NoteFileEntity` (`id` TEXT NOT NULL, `note_id` TEXT, `template_id` TEXT, `folder_id` TEXT, `lastModification_time` INTEGER NOT NULL, `parent_id` TEXT, `favorite` INTEGER NOT NULL, `title` TEXT, `in_trash_bin` INTEGER NOT NULL, `file_name` TEXT NOT NULL, `mime_type` TEXT NOT NULL, `recycled_time` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, `edited_time` INTEGER NOT NULL, `size` INTEGER NOT NULL, `db_version` INTEGER NOT NULL, `sort_key` INTEGER, PRIMARY KEY(`id`))");
    }
}
