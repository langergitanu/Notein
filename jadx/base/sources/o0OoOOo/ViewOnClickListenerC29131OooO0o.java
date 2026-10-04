package o0OoOOo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.pay.google.GooglePayDialogFragment;
import o0Oo0o00.ViewOnClickListenerC28154OooO0oO;
import o0OoOo.C29194OooO00o;
import o0o00.C29720OooO0O0;
import o0o00OOo.C29891OooO0o0;
import o0o00Oo.C29907OooOo0;

/* JADX INFO: renamed from: o0OoOOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29131OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103255OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103256OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29131OooO0o(Object obj, int i) {
        this.f103256OooOo0o = i;
        this.f103255OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103256OooOo0o) {
            case 0:
                AudioBarChildFragment audioBarChildFragment = (AudioBarChildFragment) this.f103255OooOo;
                if (((C29194OooO00o) audioBarChildFragment.OooOoo0().f74239OooOo00.f121747OooOo0o.getValue()) != null) {
                    audioBarChildFragment.OooOoo0().OooOooO(r0.f103546OooO0OO - 15000);
                    break;
                }
                break;
            case 1:
                C29891OooO0o0.OooO00o oooO00o = ((C29720OooO0O0) this.f103255OooOo).f105375OooO0O0;
                if (oooO00o != null) {
                    oooO00o.onClick(view);
                }
                break;
            case 2:
                ViewOnClickListenerC28154OooO0oO viewOnClickListenerC28154OooO0oO = ((C29907OooOo0) this.f103255OooOo).f106110OooO0O0;
                if (viewOnClickListenerC28154OooO0oO != null) {
                    viewOnClickListenerC28154OooO0oO.onClick(view);
                }
                break;
            default:
                C21030OooOO0o.OooO0OO((GooglePayDialogFragment) this.f103255OooOo).OooOOo0();
                break;
        }
    }
}
