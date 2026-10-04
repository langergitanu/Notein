package OooOOOo;

import androidx.biometric.BiometricFragment;
import androidx.biometric.C21590OooO0o0;
import androidx.biometric.C21592OooO0oO;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f58414OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f58415OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f58416OooOoO0;

    public /* synthetic */ OooO0O0(int i, Object obj, Object obj2) {
        this.f58415OooOo0o = i;
        this.f58414OooOo = obj;
        this.f58416OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f58415OooOo0o) {
            case 0:
                C21592OooO0oO c21592OooO0oO = ((BiometricFragment) this.f58414OooOo).f63207OooOo0o;
                if (c21592OooO0oO.f63250OooO0o0 == null) {
                    c21592OooO0oO.f63250OooO0o0 = new androidx.biometric.OooO0o();
                }
                c21592OooO0oO.f63250OooO0o0.OooO0OO((C21590OooO0o0.OooO0O0) this.f58416OooOoO0);
                break;
            default:
                ((AbtIntegrationHelper) this.f58414OooOo).lambda$updateRunningExperiments$0((ArrayList) this.f58416OooOoO0);
                break;
        }
    }
}
