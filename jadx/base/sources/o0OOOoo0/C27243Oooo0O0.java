package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27243Oooo0O0 extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("ALTER TABLE NoteMetaEntity ADD COLUMN lock_added INTEGER NOT NULL DEFAULT 0");
        database.oo0o0Oo("ALTER TABLE NoteFileEntity ADD COLUMN lock_added INTEGER NOT NULL DEFAULT 0");
    }
}
