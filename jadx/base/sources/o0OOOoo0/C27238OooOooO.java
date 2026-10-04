package o0OOOoo0;

import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27238OooOooO extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 database) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(database, "database");
        database.oo0o0Oo("ALTER TABLE NoteMetaEntity ADD COLUMN using_own_pdf INTEGER NOT NULL DEFAULT 0");
        database.oo0o0Oo("ALTER TABLE NoteFileEntity ADD COLUMN using_own_pdf INTEGER NOT NULL DEFAULT 0");
    }
}
