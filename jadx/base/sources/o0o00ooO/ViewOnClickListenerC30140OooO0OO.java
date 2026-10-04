package o0o00ooO;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.OooOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabDocumentsFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import o0OoO000.ViewOnClickListenerC28568OooooOO;
import o0o0O00.C30207OooOo;
import o0o0O0oO.C30351Oooo0oO;
import o0o0O0oo.C30360OooO00o;
import o0o0Oo00.C30602OooO00o;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o00ooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30140OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f107283OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107284OooOo0o;

    public /* synthetic */ ViewOnClickListenerC30140OooO0OO(Object obj, int i) {
        this.f107284OooOo0o = i;
        this.f107283OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object next;
        Object obj = this.f107283OooOo;
        switch (this.f107284OooOo0o) {
            case 0:
                C30207OooOo.OooO00o oooO00o = ((FabDocumentsFragment) obj).f77466OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooO0O0();
                    return;
                }
                return;
            case 1:
                Object tag = view.getTag();
                OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                TrashBinListFragment trashBinListFragment = (TrashBinListFragment) obj;
                if (view.getId() == R.id.more) {
                    C30360OooO00o c30360OooO00o = trashBinListFragment.f78122Oooo00O;
                    if (c30360OooO00o != null) {
                        c30360OooO00o.OooO0OO(view, noteVO);
                        return;
                    } else {
                        OooOOO0.OooOOOO("noteItemMoreMenu");
                        throw null;
                    }
                }
                if (!noteVO.getInSelectMode()) {
                    if (noteVO.getType() != 1) {
                        return;
                    }
                    InterfaceC21987OooOoo viewLifecycleOwner = trashBinListFragment.getViewLifecycleOwner();
                    OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new TrashBinListFragment.OooO00o(trashBinListFragment, noteVO, null), 2);
                    return;
                }
                C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinListFragment.OooOoOO();
                int type = noteVO.getType();
                String id = noteVO.getId();
                String pageNoteId = noteVO.getPageNoteId();
                if (pageNoteId == null) {
                    pageNoteId = "";
                }
                OooOOO0.OooO0oO(id, "id");
                if (type != 2) {
                    C33781o00o0O c33781o00o0O = c30351Oooo0oOOooOoOO.f108247OooOoO0;
                    if (type != 0 && type == 1) {
                        c33781o00o0O = c30351Oooo0oOOooOoOO.f108246OooOoO;
                    }
                    HashSet hashSet = new HashSet((HashSet) c33781o00o0O.getValue());
                    if (hashSet.contains(id)) {
                        hashSet.remove(id);
                    } else {
                        hashSet.add(id);
                    }
                    c33781o00o0O.OooOO0(null, hashSet);
                    return;
                }
                C33781o00o0O c33781o00o0O2 = c30351Oooo0oOOooOoOO.f108250OooOoo0;
                HashSet hashSet2 = new HashSet((HashSet) c33781o00o0O2.getValue());
                Iterator it = hashSet2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        C32443OooOOO c32443OooOOO = (C32443OooOOO) next;
                        if (!OooOOO0.OooO0O0(c32443OooOOO.f116637OooOo, id) || !OooOOO0.OooO0O0(c32443OooOOO.f116638OooOo0o, id)) {
                        }
                    } else {
                        next = null;
                    }
                }
                C32443OooOOO c32443OooOOO2 = (C32443OooOOO) next;
                if (c32443OooOOO2 != null) {
                    hashSet2.remove(c32443OooOOO2);
                } else {
                    hashSet2.add(new C32443OooOOO(pageNoteId, id));
                }
                c33781o00o0O2.OooOO0(null, hashSet2);
                return;
            default:
                ViewOnClickListenerC28568OooooOO viewOnClickListenerC28568OooooOO = ((C30602OooO00o) obj).f109489OooO0O0;
                if (viewOnClickListenerC28568OooooOO != null) {
                    viewOnClickListenerC28568OooooOO.onClick(view);
                    return;
                }
                return;
        }
    }
}
