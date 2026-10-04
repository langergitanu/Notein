package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27223OooOO0o extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("create table if not exists `ColorSetEntity` (`id` TEXT not null, `name` TEXT not null, `colors` TEXT not null,`bg_color` INTEGER NOT NULL, `fg_color` INTEGER NOT NULL, `type` INTEGER NOT NULL,`creation_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
