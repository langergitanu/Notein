package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: renamed from: o0OOOoo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27232OooOo0o extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "ALTER TABLE NoteMetaEntity ADD COLUMN unbounded_note INTEGER NOT NULL DEFAULT(0)", "ALTER TABLE NoteEntity ADD COLUMN unbounded_note INTEGER NOT NULL DEFAULT(0)", "ALTER TABLE PageEntity ADD COLUMN unbounded INTEGER NOT NULL DEFAULT 0");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE StrokeEntity ADD COLUMN 'left' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE StrokeEntity ADD COLUMN 'right' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE StrokeEntity ADD COLUMN 'top' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE StrokeEntity ADD COLUMN 'bottom' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE TextBoxEntity ADD COLUMN 'left' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE TextBoxEntity ADD COLUMN 'right' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE TextBoxEntity ADD COLUMN 'top' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE TextBoxEntity ADD COLUMN 'bottom' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE ImageEntity ADD COLUMN 'left' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE ImageEntity ADD COLUMN 'right' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE ImageEntity ADD COLUMN 'top' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE ImageEntity ADD COLUMN 'bottom' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE ShapeEntity ADD COLUMN 'left' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE ShapeEntity ADD COLUMN 'right' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE ShapeEntity ADD COLUMN 'top' REAL DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE ShapeEntity ADD COLUMN 'bottom' REAL DEFAULT NULL");
    }
}
