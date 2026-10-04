package OooOOOo;

import androidx.biometric.BiometricFragment;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import com.orion.editor.PDFView;
import o000OOO.C24503OooOOo;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements InterfaceC21998Oooo0o0, InterfaceC32330OooO0O0, ObjectConstructor, o000OOO.OooO, PDFView.InterfaceC22835OooO0oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f58419OooOo0o;

    public /* synthetic */ OooO0o(Object obj) {
        this.f58419OooOo0o = obj;
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        C24503OooOOo c24503OooOOo = (C24503OooOOo) this.f58419OooOo0o;
        double d2 = c24503OooOOo.f82860OooO0O0;
        double d3 = c24503OooOOo.f82864OooO0o0;
        double d4 = c24503OooOOo.f82862OooO0Oo;
        return d >= d3 * d4 ? (Math.pow(d - c24503OooOOo.f82863OooO0o, 1.0d / c24503OooOOo.f82859OooO00o) - c24503OooOOo.f82861OooO0OO) / d2 : (d - c24503OooOOo.f82865OooO0oO) / d4;
    }

    @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
    public void OooO0O0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        BiometricFragment biometricFragment = (BiometricFragment) this.f58419OooOo0o;
        if (charSequence == null) {
            biometricFragment.getClass();
            return;
        }
        if (biometricFragment.OooOoo0()) {
            biometricFragment.Oooo00O(charSequence);
        }
        biometricFragment.f63207OooOo0o.OooO0o(null);
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        ((CampaignCacheClient) this.f58419OooOo0o).lambda$get$2((FetchEligibleCampaignsResponse) obj);
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultConstructor$7((String) this.f58419OooOo0o);
    }
}
