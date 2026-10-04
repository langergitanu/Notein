package o0o00oOo;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.p607ui.notelist.NoteListFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import io.ktor.utils.p616io.C23968Oooo00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28037OooO0OO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0o00oOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30038OooOO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f106808OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteListFragment f106809OooOo0o;

    public /* synthetic */ C30038OooOO0o(NoteListFragment noteListFragment, String str) {
        this.f106809OooOo0o = noteListFragment;
        this.f106808OooOo = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        o000o0O0.OooOo oooOoOooO00o;
        NoteListFragment noteListFragment = this.f106809OooOo0o;
        boolean z = noteListFragment.getParentFragment() instanceof NoteListContainerFragment;
        String str = this.f106808OooOo;
        if (z) {
            NoteVO noteVO = (NoteVO) ((C32443OooOOO) noteListFragment.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
            oooOoOooO00o = C23968Oooo00o.OooO0o0(28, str, noteVO != null ? noteVO.getId() : null, null);
        } else {
            NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) noteListFragment.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
            oooOoOooO00o = C28037OooO0OO.OooO00o(str, noteVO2 != null ? noteVO2.getId() : null);
        }
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListFragment), oooOoOooO00o);
        return C32460OooOooO.f116667OooO00o;
    }
}
