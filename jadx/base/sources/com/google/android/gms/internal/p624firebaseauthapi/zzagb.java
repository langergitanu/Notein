package com.google.android.gms.internal.p624firebaseauthapi;

import OooOo.OooO00o;
import android.app.Activity;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import com.huawei.hms.network.embedded.C18126c2;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class zzagb {
    private static final Map<String, zzagd> zza = new OooO00o();

    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, zzaff zzaffVar) {
        zza(str, zzaffVar);
        return new zzaga(onVerificationStateChangedCallbacks, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaff zzaffVar) {
        zza.put(str, new zzagd(zzaffVar, DefaultClock.getInstance().currentTimeMillis()));
    }

    public static boolean zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        Map<String, zzagd> map = zza;
        if (map.containsKey(str)) {
            zzagd zzagdVar = map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzagdVar.zzb < C18126c2.f54377z) {
                zzaff zzaffVar = zzagdVar.zza;
                if (zzaffVar == null) {
                    return true;
                }
                zzaffVar.zza(onVerificationStateChangedCallbacks, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
