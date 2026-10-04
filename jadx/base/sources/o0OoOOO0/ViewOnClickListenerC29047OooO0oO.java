package o0OoOOO0;

import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment.OooO0O0;
import java.util.concurrent.CancellationException;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.o00000OO;

/* JADX INFO: renamed from: o0OoOOO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29047OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102883OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102884OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29047OooO0oO(Object obj, int i) {
        this.f102884OooOo0o = i;
        this.f102883OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f102884OooOo0o) {
            case 0:
                ((C29048OooO0oo) this.f102883OooOo).getClass();
                break;
            case 1:
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f102883OooOo;
                Integer num = (Integer) baseToolbarChildFragment.Oooo0OO().f73381Oooo00o.f121747OooOo0o.getValue();
                if (num != null) {
                    if (num.intValue() != 0) {
                        baseToolbarChildFragment.Oooo0OO().Oooo0(false);
                        baseToolbarChildFragment.Oooo0OO().Oooo00o(false);
                    } else {
                        baseToolbarChildFragment.Oooo0OO().Oooo0(false);
                        baseToolbarChildFragment.Oooo0OO().Oooo00o(true);
                    }
                    break;
                }
                break;
            case 2:
                o00000OO o00000oo2 = ((LabelContainerFragment) this.f102883OooOo).OooOoo().f77173OooooOo;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                break;
            default:
                FirebaseUserInfoFragment firebaseUserInfoFragment = (FirebaseUserInfoFragment) this.f102883OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = firebaseUserInfoFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, firebaseUserInfoFragment.new OooO0O0(null), 3);
                break;
        }
    }
}
