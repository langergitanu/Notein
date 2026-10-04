package o0O0oooO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.export.AddWaterMarkFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import java.util.List;
import o0oOoOoO.C31099OooO0o0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0O0oooO.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26299OoooOOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90135OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90136OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26299OoooOOo(Object obj, int i) {
        this.f90136OooOo0o = i;
        this.f90135OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f90135OooOo;
        switch (this.f90136OooOo0o) {
            case 0:
                MainActivity.onCreate$lambda$9$lambda$8((MainActivity) obj, view);
                break;
            case 1:
                List<Integer> list = AddWaterMarkFragment.f71503Oooo000;
                C21030OooOO0o.OooO0OO((AddWaterMarkFragment) obj).OooOOo0();
                break;
            default:
                Context contextRequireContext = ((FirebaseUserInfoFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                break;
        }
    }
}
