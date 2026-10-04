package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27244Oooo0OO extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "ALTER TABLE NoteMetaEntity ADD COLUMN last_opened_time INTEGER NOT NULL DEFAULT 0", "ALTER TABLE CommentEntity ADD COLUMN sort_key INTEGER DEFAULT NULL", "ALTER TABLE OutlineEntity ADD COLUMN creation_time INTEGER NOT NULL DEFAULT 0");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE OutlineEntity ADD COLUMN last_modification_time INTEGER NOT NULL DEFAULT 0");
    }
}
