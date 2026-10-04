package o0Ooo0oo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.notelist.about.AboutFragment;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28767o0000Oo0;
import o0Ooo0oO.C29423OooO00o;
import o0Ooo0oO.C29434OooO0oO;
import o0o00o0O.C29947OooO0OO;
import o0oOoOoO.C31100OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Ooo0oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29448OooOO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f104505OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104506OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29448OooOO0O(Fragment fragment, int i) {
        this.f104506OooOo0o = i;
        this.f104505OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C29947OooO0OO c29947OooO0OO;
        Fragment fragment = this.f104505OooOo;
        switch (this.f104506OooOo0o) {
            case 0:
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) fragment;
                C29947OooO0OO c29947OooO0OO2 = penBarChildFragment.o0000O0;
                if (c29947OooO0OO2 != null && c29947OooO0OO2.OooO00o() && (c29947OooO0OO = penBarChildFragment.o0000O0) != null) {
                    c29947OooO0OO.dismiss();
                }
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(penBarChildFragment), new C28767o0000Oo0());
                break;
            case 1:
                Context contextRequireContext = ((AboutFragment) fragment).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31100OooO0oO(contextRequireContext, null), 3);
                break;
            default:
                C29423OooO00o c29423OooO00oOooOooO = ((PagePaddingFragment) fragment).OooOooO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c29423OooO00oOooOooO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29434OooO0oO(c29423OooO00oOooOooO, null), 2);
                break;
        }
    }
}
