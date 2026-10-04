package o000Oo0O;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import com.orion.notein.p607ui.noteeditor.NoteLockedDialogFragment;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28959o00oOoO;
import o0OoO0oo.C28960o00oOoO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000Oo0O.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24529OooOo0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82978OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82979OooOo0o;

    public /* synthetic */ C24529OooOo0(Object obj, int i) {
        this.f82979OooOo0o = i;
        this.f82978OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f82979OooOo0o) {
            case 0:
                return new C24522OooO0oo(((C24531OooOo0o) this.f82978OooOo).f82982OooO0O0);
            default:
                NoteLockedDialogFragment noteLockedDialogFragment = (NoteLockedDialogFragment) this.f82978OooOo;
                Dialog dialog = noteLockedDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteLockedDialogFragment), new C28959o00oOoO(((C28960o00oOoO0) noteLockedDialogFragment.f73337OooOoOO.getValue()).f102614OooO00o));
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
