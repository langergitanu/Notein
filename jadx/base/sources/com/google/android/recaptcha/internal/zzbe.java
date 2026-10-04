package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return C34438OooOoo0.f123458OooOo0o;
        }
    }

    private static final Map zzb() {
        LinkedHashMap linkedHashMapOooO = C34444Oooo0O0.OooO(new C32443OooOOO(0, zzqi.NET_CAPABILITY_MMS), new C32443OooOOO(1, zzqi.NET_CAPABILITY_SUPL), new C32443OooOOO(2, zzqi.NET_CAPABILITY_DUN), new C32443OooOOO(3, zzqi.NET_CAPABILITY_FOTA), new C32443OooOOO(4, zzqi.NET_CAPABILITY_IMS), new C32443OooOOO(5, zzqi.NET_CAPABILITY_CBS), new C32443OooOOO(6, zzqi.NET_CAPABILITY_WIFI_P2P), new C32443OooOOO(7, zzqi.NET_CAPABILITY_IA), new C32443OooOOO(8, zzqi.NET_CAPABILITY_RCS), new C32443OooOOO(9, zzqi.NET_CAPABILITY_XCAP), new C32443OooOOO(10, zzqi.NET_CAPABILITY_EIMS), new C32443OooOOO(11, zzqi.NET_CAPABILITY_NOT_METERED), new C32443OooOOO(12, zzqi.NET_CAPABILITY_INTERNET), new C32443OooOOO(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new C32443OooOOO(14, zzqi.NET_CAPABILITY_TRUSTED), new C32443OooOOO(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i = Build.VERSION.SDK_INT;
        linkedHashMapOooO.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapOooO.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i >= 28) {
            linkedHashMapOooO.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapOooO.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            linkedHashMapOooO.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapOooO.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            linkedHashMapOooO.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            linkedHashMapOooO.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            linkedHashMapOooO.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapOooO.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            linkedHashMapOooO.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapOooO.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapOooO.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return linkedHashMapOooO;
    }
}
