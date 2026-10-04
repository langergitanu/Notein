package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.CreativeLibrarySearchFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: renamed from: o0Oo0oOo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28343Oooo0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f100489OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100490OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28343Oooo0o(Fragment fragment, int i) {
        this.f100490OooOo0o = i;
        this.f100489OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100490OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((CreativeLibrarySearchFragment) this.f100489OooOo).OooOOOo();
                break;
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((FirebaseUserLoginFragment) this.f100489OooOo), new C24564OooO00o(R.id.f57941xefb6245));
                break;
        }
    }
}
