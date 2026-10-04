package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import java.util.List;
import o0o0000o.C29727OooO00o;
import o0o0O0oO.C30344Oooo000;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class oo0oOO0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102707OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102708OooOo0o;

    public /* synthetic */ oo0oOO0(Object obj, int i) {
        this.f102708OooOo0o = i;
        this.f102707OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f102708OooOo0o) {
            case 0:
                NoteEditorFragment noteEditorFragment = (NoteEditorFragment) this.f102707OooOo;
                C29727OooO00o c29727OooO00o = noteEditorFragment.f73065ooOO;
                c29727OooO00o.f105416OooO0OO = null;
                c29727OooO00o.f105417OooO0Oo = 0.0f;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorFragment");
                c20358OooO00o.OooO00o("Ruler gesture end -> visible=%s center=(%.1f, %.1f) angle=%.3f length=%.1f", Boolean.valueOf(noteEditorFragment.f73032Ooooooo.f105431OooO00o), Float.valueOf(noteEditorFragment.f73032Ooooooo.f105432OooO0O0.x), Float.valueOf(noteEditorFragment.f73032Ooooooo.f105432OooO0O0.y), Float.valueOf(noteEditorFragment.f73032Ooooooo.f105434OooO0Oo), Float.valueOf(noteEditorFragment.f73032Ooooooo.f105433OooO0OO));
                String strOooo = noteEditorFragment.Oooo();
                if (strOooo != null) {
                    noteEditorFragment.OoooO0().OoooOO0(strOooo, noteEditorFragment.f73032Ooooooo);
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                return oOo000Oo.OooOo.o000oOoO((List) this.f102707OooOo, null, null, null, C30344Oooo000.OooO00o.f108201OooOo0o, 31);
        }
    }
}
