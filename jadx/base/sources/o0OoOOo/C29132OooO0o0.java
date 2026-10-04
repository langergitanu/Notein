package o0OoOOo;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.p609vo.PenVO;
import java.util.Iterator;
import java.util.List;
import o0O0oooo.C26367OooOO0o;
import o0Ooo0oo.C29564o0OoOo0;
import o0o00o0O.C29951OooO0oO;
import oO00ooO.C32460OooOooO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0OO.C33609OooO0oo;
import oO0oO00.o00Ooo;

/* JADX INFO: renamed from: o0OoOOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29132OooO0o0 implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103257OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103258OooOo0o;

    public /* synthetic */ C29132OooO0o0(Object obj, int i) {
        this.f103258OooOo0o = i;
        this.f103257OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object next;
        switch (this.f103258OooOo0o) {
            case 0:
                Fragment fragmentRequireParentFragment = ((AudioBarChildFragment) this.f103257OooOo).requireParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            case 1:
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.f103257OooOo;
                C29951OooO0oO c29951OooO0oO = penBarChildFragment.f75293o0000O0O;
                if (c29951OooO0oO == null || !c29951OooO0oO.OooO00o()) {
                    RecyclerView recyclerView = penBarChildFragment.f75260OoooO;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenColorList");
                        throw null;
                    }
                    if (!recyclerView.isShown()) {
                        Iterable iterable = penBarChildFragment.f75308o00oO0o.f66021OooO00o.f65811OooO0o;
                        kotlin.jvm.internal.OooOOO0.OooO0o(iterable, "getCurrentList(...)");
                        List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(iterable);
                        Iterator it = listO0ooOO0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((PenVO) next).getType() == 4) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        PenVO penVO = (PenVO) next;
                        if (penVO != null && penVO.getSelected()) {
                            Iterator it2 = listO0ooOO0.iterator();
                            int i = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i = -1;
                                } else if (((PenVO) it2.next()).getType() != 4) {
                                    i++;
                                }
                            }
                            if (i > -1) {
                                RecyclerView recyclerView2 = penBarChildFragment.f75249Oooo;
                                if (recyclerView2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvPenList");
                                    throw null;
                                }
                                recyclerView2.smoothScrollToPosition(i);
                            }
                            InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                            if (interfaceC21987OooOoo == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                                throw null;
                            }
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(interfaceC21987OooOoo), null, null, new C29564o0OoOo0(penBarChildFragment, listO0ooOO0, null), 3);
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                return oO0o.OooOO0O.OooO0OO("kotlin.Unit", OooOOO0.C33535OooO0Oo.f121135OooO00o, new InterfaceC33531OooO0o0[0], new C26367OooOO0o((o00Ooo) this.f103257OooOo, 1));
        }
    }
}
