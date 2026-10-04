package o0OoOoo0;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOoo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29243OooOOo0 implements OooO00o.InterfaceC19367OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public List<LatestOpenedNoteVO> f103705OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ LatestOpenedNoteTabFragment f103706OooO0O0;

    public C29243OooOOo0(LatestOpenedNoteTabFragment latestOpenedNoteTabFragment) {
        this.f103706OooO0O0 = latestOpenedNoteTabFragment;
    }

    @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
    public final void OooO00o() {
    }

    @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
    public final void OooO0O0() {
        List<LatestOpenedNoteVO> list = this.f103705OooO00o;
        if (list != null) {
            List<LatestOpenedNoteVO> list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((LatestOpenedNoteVO) it.next()).getNoteId());
            }
            C29250OooOoO0 c29250OooOoO0OooOoo0 = this.f103706OooO0O0.OooOoo0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29250OooOoO0OooOoo0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29244OooOOoo(c29250OooOoO0OooOoo0, arrayList, null), 2);
        }
        this.f103705OooO00o = null;
    }

    @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
    public final void onMove(int i, int i2) {
        List<LatestOpenedNoteVO> list = this.f103705OooO00o;
        LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = this.f103706OooO0O0;
        if (list == null || list.isEmpty()) {
            this.f103705OooO00o = oOo000Oo.OooOo.o0ooOO0((Iterable) latestOpenedNoteTabFragment.OooOoo0().f103732OooO.f121747OooOo0o.getValue());
        }
        if (i < i2) {
            while (i < i2) {
                List<LatestOpenedNoteVO> list2 = this.f103705OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(list2);
                int i3 = i + 1;
                Collections.swap(list2, i, i3);
                i = i3;
            }
        } else {
            int i4 = i2 + 1;
            if (i4 <= i) {
                while (true) {
                    List<LatestOpenedNoteVO> list3 = this.f103705OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(list3);
                    Collections.swap(list3, i, i - 1);
                    if (i == i4) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
        }
        C29226OooO00o c29226OooO00o = latestOpenedNoteTabFragment.f74471OooOooo;
        List<LatestOpenedNoteVO> list4 = this.f103705OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(list4);
        c29226OooO00o.OooO0OO(list4);
    }
}
