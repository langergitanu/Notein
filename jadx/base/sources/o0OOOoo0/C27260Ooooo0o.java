package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27260Ooooo0o extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `NotePlaceholderEntity` (`id` TEXT NOT NULL, `parent_id` TEXT, `title` TEXT NOT NULL, `creation_time` INTEGER NOT NULL, `file_path` TEXT, `state` INTEGER NOT NULL, `extras` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
