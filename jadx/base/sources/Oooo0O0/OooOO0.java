package Oooo0O0;

import OooooOO.C21325OooOooo;
import OooooOO.C21329Oooo00O;
import Oooooo0.C21397OooO00o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C21329Oooo00O f60342OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static C21325OooOooo f60343OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static C21397OooO00o f60344OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f60345OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f60346OooO0o0 = 0;

    public static final void OooO00o(Fragment fragment) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fragment, "<this>");
        Fragment fragmentOooOooo = fragment.getChildFragmentManager().OooOooo("LockNoteFragment");
        if (fragmentOooOooo != null && fragmentOooOooo.isAdded()) {
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager);
            oooO00o.OooOOO0(fragmentOooOooo);
            oooO00o.OooOO0O();
        }
    }

    public static final double OooO0O0(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }
}
