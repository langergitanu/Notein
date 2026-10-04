package o0o00oO0;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.about.UserAboutDialogFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.user.UserInfoFragment;
import com.orion.notein.p607ui.widget.EdgeFragment;
import o0Oo00o.C28026OooO0OO;
import o0o00o0.C29936OooO0oO;
import o0o0O00.C30185OooO00o;
import o0o0O00.C30186OooO0O0;
import o0o0O00.C30189OooO0o;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o00oO0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30011Oooo0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f106652OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f106653OooOo0o;

    public /* synthetic */ ViewOnClickListenerC30011Oooo0OO(Object obj, int i) {
        this.f106653OooOo0o = i;
        this.f106652OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f106652OooOo;
        switch (this.f106653OooOo0o) {
            case 0:
                C30012Oooo0o c30012Oooo0o = (C30012Oooo0o) obj;
                if (!view.isActivated()) {
                    C29936OooO0oO c29936OooO0oO = c30012Oooo0o.f106668Oooo0OO;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO0OO(4);
                    }
                } else {
                    C29936OooO0oO c29936OooO0oO2 = c30012Oooo0o.f106668Oooo0OO;
                    if (c29936OooO0oO2 != null) {
                        c29936OooO0oO2.OooO0oo(4);
                    }
                }
                break;
            case 1:
                C30189OooO0o c30189OooO0o = ((C30185OooO00o) obj).f107468OooO0O0;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = c30189OooO0o.f107496OooO0O0;
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) oooO0OO.f77161OoooO00.getValue()).f116638OooOo0o;
                NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) oooO0OO.f77161OoooO00.getValue()).f116637OooOo;
                EdgeFragment edgeFragment = c30189OooO0o.f107495OooO00o;
                if (noteVO != null) {
                    InterfaceC21987OooOoo viewLifecycleOwner = edgeFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30186OooO0O0(c30189OooO0o, noteVO2, null), 2);
                } else {
                    C21030OooOO0o.OooO0OO(edgeFragment).OooOOo0();
                }
                break;
            default:
                UserInfoFragment userInfoFragment = (UserInfoFragment) obj;
                Context contextRequireContext = userInfoFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                if (!o0oo000O.OooOO0O.OooO00o(contextRequireContext)) {
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(userInfoFragment), R.id.aboutFragment, null);
                } else {
                    new UserAboutDialogFragment().show(userInfoFragment.getParentFragmentManager(), "UserAboutDialogFragment");
                }
                break;
        }
    }
}
