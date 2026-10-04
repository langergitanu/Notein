package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27246Oooo0o0 extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `StickerEntity` (`id` TEXT NOT NULL, `parent_id` TEXT NOT NULL, `path` TEXT NOT NULL, `last_used_time` INTEGER NOT NULL, `built_in` INTEGER NOT NULL, `svg_aspect_ratio` REAL NOT NULL, PRIMARY KEY(`id`))");
        database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `StickerCollectionEntity` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `name` TEXT NOT NULL, `children` TEXT NOT NULL, `built_in` INTEGER NOT NULL, `creation_time` INTEGER NOT NULL, `last_modification_time` INTEGER NOT NULL, `sort_key` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
