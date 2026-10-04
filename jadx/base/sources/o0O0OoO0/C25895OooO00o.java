package o0O0OoO0;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.oplus.ipemanager.sdk.ISDKAidlCallback;
import com.oplus.ipemanager.sdk.ISdkAidlInterface;
import com.oplus.ipemanager.sdk.IpeFeature;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o0O0OoO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25895OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C25895OooO00o f88411OooO0Oo = new C25895OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ISdkAidlInterface f88412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C19730OooO00o f88413OooO0O0 = new C19730OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f88414OooO0OO = new OooO0O0();

    /* JADX INFO: renamed from: o0O0OoO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19730OooO00o implements IBinder.DeathRecipient {
        public C19730OooO00o() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            Log.e("PencilManager", "ISdkAidlInterface dead!!!");
            C25895OooO00o c25895OooO00o = C25895OooO00o.this;
            c25895OooO00o.f88412OooO00o = null;
            c25895OooO00o.getClass();
        }
    }

    /* JADX INFO: renamed from: o0O0OoO0.OooO00o$OooO0O0 */
    public class OooO0O0 extends ISDKAidlCallback.AbstractBinderC18813a {
        public OooO0O0() {
        }

        @Override // com.oplus.ipemanager.sdk.ISDKAidlCallback
        public final void onConnectionChanged(int i) throws RemoteException {
            Log.d("PencilManager", "onConnectionChanged  state = ".concat(String.valueOf(i)));
            C25895OooO00o.this.getClass();
        }

        @Override // com.oplus.ipemanager.sdk.ISDKAidlCallback
        public final void onDemoModeEnableChange(boolean z) throws RemoteException {
            Log.d("PencilManager", "onDemoModeEnableChange, enable = ".concat(String.valueOf(z)));
            C25895OooO00o.this.getClass();
        }

        @Override // com.oplus.ipemanager.sdk.ISDKAidlCallback
        public final void onFunctionFeedbackStateChange(boolean z) throws RemoteException {
            Log.d("PencilManager", "onFunctionFeedbackStateChange, enable = ".concat(String.valueOf(z)));
            C25895OooO00o.this.getClass();
        }

        @Override // com.oplus.ipemanager.sdk.ISDKAidlCallback
        public final void onVibrationSwitchStateChange(boolean z) throws RemoteException {
            Log.d("PencilManager", "onVibrationSwitchStateChange  isOpen = ".concat(String.valueOf(z)));
            C25895OooO00o.this.getClass();
        }
    }

    public final List<IpeFeature> OooO00o() {
        Log.d("PencilManager", "getSupportFeatures");
        ISdkAidlInterface iSdkAidlInterface = this.f88412OooO00o;
        if (iSdkAidlInterface == null) {
            Log.e("PencilManager", "getSupportFeatures error, interface is null");
            return new ArrayList();
        }
        try {
            return iSdkAidlInterface.getSupportFeatures();
        } catch (RemoteException e) {
            Log.e("PencilManager", "getSupportFeatures error = ".concat(String.valueOf(e)));
            return null;
        }
    }

    public final void OooO0O0(OooO0o oooO0o) {
        Log.d("PencilManager", "setVibrationType ".concat(String.valueOf(oooO0o)));
        if (this.f88412OooO00o == null) {
            return;
        }
        try {
            int iOrdinal = oooO0o.ordinal();
            if (iOrdinal == 0) {
                this.f88412OooO00o.setVibrationType(0);
                return;
            }
            if (iOrdinal == 1) {
                this.f88412OooO00o.setVibrationType(1);
            } else if (iOrdinal == 2) {
                this.f88412OooO00o.setVibrationType(2);
            } else {
                if (iOrdinal != 3) {
                    return;
                }
                this.f88412OooO00o.setVibrationType(3);
            }
        } catch (RemoteException e) {
            Log.e("PencilManager", "setVibrationType, error = ".concat(String.valueOf(e)));
        }
    }
}
