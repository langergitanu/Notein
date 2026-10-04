package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27256OoooOo0 extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("ALTER TABLE NoteEntity ADD COLUMN user_id TEXT NOT NULL DEFAULT ''");
        database.oo0o0Oo("ALTER TABLE FolderEntity ADD COLUMN user_id TEXT NOT NULL DEFAULT ''");
    }
}
