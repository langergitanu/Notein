package o0O0oooO;

import android.content.Context;
import android.view.View;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.noteeditor.toolbar.ToolbarChildFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import o0OoO0oo.C28755o00000o0;
import o0o00Oo0.C29908OooO00o;
import o0oOoOoO.C31095OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0O0oooO.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26298OoooOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90133OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90134OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26298OoooOOO(Object obj, int i) {
        this.f90134OooOo0o = i;
        this.f90133OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f90134OooOo0o) {
            case 0:
                MainActivity.onCreate$lambda$9$lambda$7((MainActivity) this.f90133OooOo, view);
                break;
            case 1:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbar.vo.ToolbarItemVO");
                int i = ((C29908OooO00o) tag).f106114OooO00o;
                ToolbarChildFragment toolbarChildFragment = (ToolbarChildFragment) this.f90133OooOo;
                switch (i) {
                    case 100:
                        toolbarChildFragment.OoooO00();
                        break;
                    case 101:
                        toolbarChildFragment.o000oOoO();
                        break;
                    case 102:
                        toolbarChildFragment.Ooooo0o();
                        toolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                        C28755o00000o0 c28755o00000o0 = toolbarChildFragment.f76506o000oOoO;
                        if (c28755o00000o0 != null) {
                            c28755o00000o0.OooO0O0();
                        }
                        break;
                    case 103:
                        toolbarChildFragment.OoooO0();
                        break;
                }
                break;
            default:
                Context contextRequireContext = ((FirebaseUserInfoFragment) this.f90133OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31095OooO0O0(contextRequireContext, null), 3);
                break;
        }
    }
}
