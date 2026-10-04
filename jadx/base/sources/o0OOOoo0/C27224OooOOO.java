package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27224OooOOO extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("create table if not exists `ShapeEntity` (`id` TEXT not null, `page_id` TEXT NOT NULL, `color` INTEGER NOT NULL, `width` REAL NOT NULL, `points` TEXT not null, `type` INTEGER NOT NULL,`blend_mode` INTEGER NOT NULL,`creation_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
