package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27226OooOOOo extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "ALTER TABLE UserEntity ADD COLUMN avatar TEXT DEFAULT NULL", "ALTER TABLE UserEntity ADD COLUMN creation_time TEXT DEFAULT NULL", "ALTER TABLE UserEntity ADD COLUMN membership INTEGER DEFAULT 0");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE UserEntity ADD COLUMN membership_start_time TEXT DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE UserEntity ADD COLUMN membership_end_time TEXT DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("create table if not exists `CouponEntity` (`id` TEXT not null, `uid` TEXT not null, `product_code` TEXT NOT NULL, `type` INTEGER NOT NULL, `value` INTEGER NOT NULL, `status` INTEGER not null, `effect_at` TEXT, `expire_at` TEXT NOT NULL, PRIMARY KEY(`id`))");
        interfaceC24756OooO0O0.oo0o0Oo("create table if not exists `NoteinMessageEntity` (`id` TEXT not null, `uid` TEXT, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `creation_time` TEXT NOT NULL, `type` INTEGER NOT NULL, `unread` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
