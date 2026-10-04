package OooOOOo;

import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.biometric.C21592OooO0oO;
import androidx.lifecycle.C21996Oooo0OO;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import com.orion.notein.global.R;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import o000OOO.C24498OooO0o0;
import o000OOO.C24503OooOOo;
import oO00o00o.InterfaceC32332OooO0Oo;

/* JADX INFO: renamed from: OooOOOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20453OooO0oO implements InterfaceC21998Oooo0o0, InterfaceC32332OooO0Oo, ObjectConstructor, o000OOO.OooO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f58421OooOo0o;

    public /* synthetic */ C20453OooO0oO(Object obj) {
        this.f58421OooOo0o = obj;
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        float[] fArr = C24498OooO0o0.f82829OooO00o;
        return C24498OooO0o0.OooO00o((C24503OooOOo) this.f58421OooOo0o, d);
    }

    @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
    public void OooO0O0(Object obj) {
        final BiometricFragment biometricFragment = (BiometricFragment) this.f58421OooOo0o;
        if (((Boolean) obj).booleanValue()) {
            if (biometricFragment.OooOoo0()) {
                biometricFragment.Oooo00O(biometricFragment.getString(R.string.fingerprint_not_recognized));
            }
            C21592OooO0oO c21592OooO0oO = biometricFragment.f63207OooOo0o;
            if (c21592OooO0oO.f63256OooOOO) {
                Executor oooO0O0 = c21592OooO0oO.f63248OooO0Oo;
                if (oooO0O0 == null) {
                    oooO0O0 = new C21592OooO0oO.OooO0O0();
                }
                oooO0O0.execute(new Runnable() { // from class: OooOOOo.OooOO0O
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21592OooO0oO c21592OooO0oO2 = biometricFragment.f63207OooOo0o;
                        if (c21592OooO0oO2.f63250OooO0o0 == null) {
                            c21592OooO0oO2.f63250OooO0o0 = new androidx.biometric.OooO0o();
                        }
                        c21592OooO0oO2.f63250OooO0o0.OooO0O0();
                    }
                });
            } else {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            }
            C21592OooO0oO c21592OooO0oO2 = biometricFragment.f63207OooOo0o;
            if (c21592OooO0oO2.f63266OooOo0O == null) {
                c21592OooO0oO2.f63266OooOo0O = new C21996Oooo0OO<>();
            }
            C21592OooO0oO.OooOO0(c21592OooO0oO2.f63266OooOo0O, Boolean.FALSE);
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        return ConstructorConstructor.lambda$newDefaultConstructor$8((Constructor) this.f58421OooOo0o);
    }

    @Override // oO00o00o.InterfaceC32332OooO0Oo
    public boolean test(Object obj) {
        return ((CampaignCacheClient) this.f58421OooOo0o).isResponseValid((FetchEligibleCampaignsResponse) obj);
    }
}
