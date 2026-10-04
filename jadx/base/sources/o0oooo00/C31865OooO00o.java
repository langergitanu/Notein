package o0oooo00;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import o0oooOo.AbstractActivityC31852OooO0O0;
import o0oooo0.C31864OooO0O0;
import o0oooo0.InterfaceC31863OooO00o;

/* JADX INFO: renamed from: o0oooo00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31865OooO00o implements InterfaceC31863OooO00o {
    @Override // o0oooo0.InterfaceC31863OooO00o
    public final String OooO00o(AbstractActivityC31852OooO0O0 abstractActivityC31852OooO0O0) throws C31864OooO0O0 {
        String deviceId = ((TelephonyManager) abstractActivityC31852OooO0O0.getSystemService("phone")).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            throw new C31864OooO0O0("get a empty device id");
        }
        return deviceId;
    }
}
