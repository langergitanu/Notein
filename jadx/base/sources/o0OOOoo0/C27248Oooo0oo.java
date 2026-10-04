package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27248Oooo0oo extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `item_label_cross_ref` (\n    `labelId` INTEGER NOT NULL,\n    `itemType` INTEGER NOT NULL,\n    `itemId` TEXT NOT NULL,\n    `extraInfo` TEXT NOT NULL,\n    `createdTime` INTEGER NOT NULL,\n    `modifiedTime` INTEGER NOT NULL,\n    PRIMARY KEY(`labelId`, `itemId`, `itemType`, `extraInfo`)\n)");
        database.oo0o0Oo("CREATE TABLE IF NOT EXISTS `labels` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    `name` TEXT NOT NULL,\n    `color` INTEGER NOT NULL,\n    `createdTime` INTEGER NOT NULL,\n    `modifiedTime` INTEGER NOT NULL,\n    `index` REAL NOT NULL DEFAULT 1000.0\n)");
    }
}
