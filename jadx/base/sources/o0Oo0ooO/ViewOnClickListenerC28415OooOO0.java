package o0Oo0ooO;

import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.label.OooO0OO;
import com.orion.notein.p607ui.user.UserInfoFragment;
import o0OoO000.ViewOnClickListenerC28588o0000o0o;
import o0o0O00.C30185OooO00o;
import o0o0O00.C30188OooO0Oo;
import o0o0O00.C30189OooO0o;
import o0o0OO0o.C30453OooO0O0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0ooO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28415OooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100722OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100723OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28415OooOO0(Object obj, int i) {
        this.f100723OooOo0o = i;
        this.f100722OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100723OooOo0o) {
            case 0:
                OooO0OO.InterfaceC19211OooO0OO interfaceC19211OooO0OO = ((com.orion.notein.p607ui.label.OooO0OO) this.f100722OooOo).f71972OooO0O0;
                if (interfaceC19211OooO0OO != null) {
                    interfaceC19211OooO0OO.OooO0O0();
                }
                break;
            case 1:
                C30189OooO0o c30189OooO0o = ((C30185OooO00o) this.f100722OooOo).f107468OooO0O0;
                InterfaceC21987OooOoo viewLifecycleOwner = c30189OooO0o.f107495OooO00o.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30188OooO0Oo(c30189OooO0o, null), 3);
                break;
            case 2:
                ViewOnClickListenerC28588o0000o0o viewOnClickListenerC28588o0000o0o = ((C30453OooO0O0) this.f100722OooOo).f108745OooO0O0;
                if (viewOnClickListenerC28588o0000o0o != null) {
                    viewOnClickListenerC28588o0000o0o.onClick(view);
                }
                break;
            default:
                ActivityC21897OooOo0 activity = ((UserInfoFragment) this.f100722OooOo).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.openMembershipPlans();
                }
                break;
        }
    }
}
