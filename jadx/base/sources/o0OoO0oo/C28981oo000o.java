package o0OoO0oo;

import androidx.fragment.app.Fragment;
import com.orion.notein.data.p602db.entity.cache.PageGridModificationRecordEntity;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import java.util.ArrayList;
import o000ooo.InterfaceC24747OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oo0oO0.C34901o00o0Oo;

/* JADX INFO: renamed from: o0OoO0oo.oo000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28981oo000o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102691OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102692OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f102693OooOoO0;

    public /* synthetic */ C28981oo000o(int i, Object obj, Object obj2) {
        this.f102692OooOo0o = i;
        this.f102691OooOo = obj;
        this.f102693OooOoO0 = obj2;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f102692OooOo0o) {
            case 0:
                Fragment it = (Fragment) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f102691OooOo;
                androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
                C28947o00oO0o c28947o00oO0o = new C28947o00oO0o(noteEditorContainerFragment);
                C33609OooO0oo.OooO0OO(oooOoOooO00o, null, null, new C28714OooOooo((ArrayList) this.f102693OooOoO0, (LockNoteFragment) it, c28947o00oO0o, null), 3);
                break;
            default:
                ((C34901o00o0Oo) this.f102691OooOo).f125443OooO0O0.OooOoo0((InterfaceC24747OooO0O0) obj, (PageGridModificationRecordEntity[]) this.f102693OooOoO0);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
