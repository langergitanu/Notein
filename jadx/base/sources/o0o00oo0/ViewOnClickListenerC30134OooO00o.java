package o0o00oo0;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.notelist.about.AboutFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.p607ui.widget.EdgeFragment;
import kotlin.jvm.internal.OooOOO0;
import o0o0O0o.C30294OooO0OO;
import o0o0O0oO.C30351Oooo0oO;
import o0o0O0oO.C30352Oooo0oo;
import o0oOoOoO.C31096OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o00oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30134OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ EdgeFragment f107274OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107275OooOo0o;

    public /* synthetic */ ViewOnClickListenerC30134OooO00o(EdgeFragment edgeFragment, int i) {
        this.f107275OooOo0o = i;
        this.f107274OooOo = edgeFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EdgeFragment edgeFragment = this.f107274OooOo;
        switch (this.f107275OooOo0o) {
            case 0:
                Context contextRequireContext = ((AboutFragment) edgeFragment).requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31096OooO0OO(contextRequireContext, null), 3);
                return;
            default:
                TrashBinContainerFragment trashBinContainerFragment = (TrashBinContainerFragment) edgeFragment;
                C30294OooO0OO c30294OooO0OO = trashBinContainerFragment.f78086OoooOO0;
                if (c30294OooO0OO == null) {
                    OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                c30294OooO0OO.OooO00o();
                Object tag = view.getTag();
                OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.SortKeyVO");
                C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
                com.orion.notein.p607ui.p609vo.OooO00o key = ((SortKeyVO) tag).getKey();
                OooOOO0.OooO0oO(key, "key");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30351Oooo0oOOooOoOO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30352Oooo0oo(c30351Oooo0oOOooOoOO, key, null), 2);
                return;
        }
    }
}
