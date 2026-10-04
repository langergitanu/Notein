package OooOOOo;

import android.os.Bundle;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.biometric.C21592OooO0oO;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21996Oooo0OO;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import o000OOO.C24503OooOOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO implements InterfaceC21998Oooo0o0, o000OOO.OooO, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f58411OooOo0o;

    public /* synthetic */ OooO(Object obj) {
        this.f58411OooOo0o = obj;
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        C24503OooOOo c24503OooOOo = (C24503OooOOo) this.f58411OooOo0o;
        return d >= c24503OooOOo.f82864OooO0o0 ? Math.pow((c24503OooOOo.f82860OooO0O0 * d) + c24503OooOOo.f82861OooO0OO, c24503OooOOo.f82859OooO00o) : c24503OooOOo.f82862OooO0Oo * d;
    }

    @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
    public void OooO0O0(Object obj) {
        BiometricFragment biometricFragment = (BiometricFragment) this.f58411OooOo0o;
        if (((Boolean) obj).booleanValue()) {
            biometricFragment.OooOoO0(1);
            biometricFragment.dismiss();
            C21592OooO0oO c21592OooO0oO = biometricFragment.f63207OooOo0o;
            if (c21592OooO0oO.f63269OooOoO0 == null) {
                c21592OooO0oO.f63269OooOoO0 = new C21996Oooo0OO<>();
            }
            C21592OooO0oO.OooOO0(c21592OooO0oO.f63269OooOoO0, Boolean.FALSE);
        }
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        if (bundle.getBoolean("result")) {
            Log.d("FavoriteContainerFragment", "moveSuccess");
            ((FavoriteContainerFragment) this.f58411OooOo0o).OooOoo0().Oooo000(0);
        }
    }
}
