package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27241Oooo00O extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "ALTER TABLE StrokeEntity ADD COLUMN layer_id TEXT NOT NULL DEFAULT 'default'", "ALTER TABLE ImageEntity ADD COLUMN layer_id TEXT NOT NULL DEFAULT 'default'", "ALTER TABLE TextBoxEntity ADD COLUMN layer_id TEXT NOT NULL DEFAULT 'default'");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE TextBoxEntity ADD COLUMN creation_time INTEGER NOT NULL DEFAULT 0");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE ShapeEntity ADD COLUMN layer_id TEXT NOT NULL  DEFAULT 'default'");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE QuoteEntity ADD COLUMN layer_id TEXT NOT NULL  DEFAULT 'default'");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE NoteEntity ADD COLUMN page_layer_list TEXT DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE NoteEntity ADD COLUMN activated_page_layer_id TEXT NOT NULL DEFAULT 'default'");
    }
}
