package o0OO00oo;

import kotlin.jvm.internal.OooOOO0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OO00oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26693OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C19807OooO00o f92191OooO00o = new C19807OooO00o(50, 51);

    /* JADX INFO: renamed from: o0OO00oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19807OooO00o extends AbstractC24732OooO00o {
        @Override // o000ooO0.AbstractC24732OooO00o
        public final void OooO00o(InterfaceC24756OooO0O0 database) {
            OooOOO0.OooO0oO(database, "database");
            database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `material_download_state` (\n  `material_id` TEXT NOT NULL PRIMARY KEY,\n  `material_type` TEXT NOT NULL,\n  `title` TEXT NOT NULL,\n  `download_url` TEXT NOT NULL,\n  `local_path` TEXT NOT NULL,\n  `file_size` INTEGER NOT NULL,\n  `downloaded_at` INTEGER NOT NULL,\n  `is_available_on_server` INTEGER NOT NULL\n)");
            database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `downloaded_material` (\n  `id` TEXT NOT NULL PRIMARY KEY,\n  `title` TEXT NOT NULL,\n  `type` TEXT NOT NULL,\n  `subtype` TEXT,\n  `cover_url` TEXT NOT NULL,\n  `preview_url` TEXT,\n  `description` TEXT,\n  `entitlement` TEXT NOT NULL,\n  `download_url` TEXT,\n  `file_size` INTEGER,\n  `author_id` TEXT,\n  `author_name` TEXT NOT NULL,\n  `author_description` TEXT,\n  `author_avatar_url` TEXT,\n  `spec_json` TEXT,\n  `version` INTEGER,\n  `saved_at` INTEGER NOT NULL\n)");
        }
    }
}
