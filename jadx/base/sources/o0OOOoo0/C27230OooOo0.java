package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27230OooOo0 extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "ALTER TABLE NoteMetaEntity ADD COLUMN pdf_info_id TEXT DEFAULT NULL", "ALTER TABLE NoteMetaEntity ADD COLUMN total_pages_count INTEGER NOT NULL DEFAULT(0)", "ALTER TABLE NoteMetaEntity ADD COLUMN tn_width INTEGER NOT NULL DEFAULT(0)");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE NoteMetaEntity ADD COLUMN tn_height INTEGER NOT NULL DEFAULT(0)");
    }
}
