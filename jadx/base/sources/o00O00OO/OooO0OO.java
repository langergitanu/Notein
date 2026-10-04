package o00O00OO;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends FragmentManager.AbstractC21880OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Fragment f84110OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f84111OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f84112OooO0OO;

    public OooO0OO(OooO0O0 oooO0O0, Fragment fragment, FrameLayout frameLayout) {
        this.f84112OooO0OO = oooO0O0;
        this.f84110OooO00o = fragment;
        this.f84111OooO0O0 = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC21880OooOO0o
    public final void OooO0O0(FragmentManager fragmentManager, Fragment fragment, View view) {
        if (fragment == this.f84110OooO00o) {
            fragmentManager.o00O0O(this);
            this.f84112OooO0OO.getClass();
            OooO0O0.OooO0OO(view, this.f84111OooO0O0);
        }
    }
}
