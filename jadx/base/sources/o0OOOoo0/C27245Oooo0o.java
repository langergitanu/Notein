package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27245Oooo0o extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "ALTER TABLE NoteFileEntity ADD COLUMN sync_type INTEGER NOT NULL DEFAULT 0", "ALTER TABLE NoteFileEntity ADD COLUMN extra TEXT DEFAULT NULL", "ALTER TABLE LocalNoteFileVersionEntity ADD COLUMN sync_type INTEGER NOT NULL DEFAULT 0");
    }
}
