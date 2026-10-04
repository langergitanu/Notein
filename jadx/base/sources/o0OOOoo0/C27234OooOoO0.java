package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27234OooOoO0 extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("CREATE TABLE IF NOT EXISTS ads (id INTEGER PRIMARY KEY NOT NULL,type INTEGER NOT NULL,image_url_en_US TEXT NOT NULL,image_url_zh_CN TEXT NOT NULL,image_url_zh_TW TEXT NOT NULL,target TEXT NOT NULL,visible INTEGER NOT NULL,ad_start_time INTEGER NOT NULL,ad_end_time INTEGER NOT NULL,ad_period INTEGER NOT NULL,create_time INTEGER NOT NULL,toast_time INTEGER NOT NULL)");
    }
}
