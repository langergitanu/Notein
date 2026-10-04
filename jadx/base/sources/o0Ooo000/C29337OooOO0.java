package o0Ooo000;

import androidx.lifecycle.C22026ooOO;
import com.orion.notein.data.p602db.entity.CommentUpdateQuoteEntity;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionFragment;
import java.util.List;
import java.util.Set;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34449Oooo0oo;
import oo0oO0.C34750Ooooooo;

/* JADX INFO: renamed from: o0Ooo000.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29337OooOO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f104058OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104059OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f104060OooOoO0;

    public /* synthetic */ C29337OooOO0(int i, Object obj, Object obj2) {
        this.f104059OooOo0o = i;
        this.f104058OooOo = obj;
        this.f104060OooOoO0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f104059OooOo0o) {
            case 0:
                C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(c32443OooOOO, "<destruct>");
                int iIntValue = ((Number) c32443OooOOO.f116637OooOo).intValue();
                List<T> list = ((C29328OooO) this.f104058OooOo).f66021OooO00o.f65811OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
                NoteTreeInfo noteTreeInfo = (NoteTreeInfo) oOo000Oo.OooOo.OoooO00(iIntValue, list);
                C29343OooOOOo.OooO00o("Clicked pos: " + iIntValue + ", item: " + noteTreeInfo + ".");
                if (noteTreeInfo != null) {
                    boolean zIsFolder = noteTreeInfo.isFolder();
                    C22026ooOO c22026ooOO = ((NoteTreeSelectionFragment) this.f104060OooOoO0).f74652OooOooO;
                    if (zIsFolder) {
                        C29355OooOoo c29355OooOoo = (C29355OooOoo) c22026ooOO.getValue();
                        String folderId = noteTreeInfo.getNoteId();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(folderId, "folderId");
                        C29343OooOOOo.OooO00o("setSelectedFolder, folderId: " + folderId + ".");
                        C33781o00o0O c33781o00o0O = c29355OooOoo.f104110OooO0o;
                        Set set = (Set) c33781o00o0O.getValue();
                        c33781o00o0O.OooOO0(null, set.contains(folderId) ? C34449Oooo0oo.OooO0o(set, folderId) : C34449Oooo0oo.OooO(set, folderId));
                    } else {
                        C29355OooOoo c29355OooOoo2 = (C29355OooOoo) c22026ooOO.getValue();
                        String noteId = noteTreeInfo.getNoteId();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                        C29343OooOOOo.OooO00o("setSelectedNote, noteId: " + noteId + ".");
                        C33781o00o0O c33781o00o0O2 = c29355OooOoo2.f104112OooO0oO;
                        c33781o00o0O2.getClass();
                        c33781o00o0O2.OooOO0(null, noteId);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            case 1:
                ((C34750Ooooooo) this.f104058OooOo).f125095OooO0o0.OoooOOO((InterfaceC24747OooO0O0) obj, (CommentUpdateQuoteEntity[]) this.f104060OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM drive_snapshot_cache WHERE id = ? AND drive_id = ?");
                String str = (String) this.f104058OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    String str2 = (String) this.f104060OooOoO0;
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(2);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(2, str2);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
