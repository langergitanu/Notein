package com.google.android.gms.internal.p624firebaseauthapi;

import OooOo.OooO00o;
import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22212OooOoO0;
import com.google.firebase.FirebaseApp;
import com.huawei.hms.network.base.util.HttpUtils;
import com.huawei.hms.network.embedded.C18241k5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zzagl {
    private static final Map<String, zzagk> zza = new OooO00o();
    private static final Map<String, List<WeakReference<zzagn>>> zzb = new OooO00o();

    private static String zza(String str, int i, boolean z) {
        return z ? C22212OooOoO0.OooO0OO(i, "http://[", str, "]:", "/") : C22212OooOoO0.OooO0OO(i, HttpUtils.HTTP_PREFIX, str, C18241k5.f55433h, "/");
    }

    public static String zzb(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return C21111o0ooOoO.OooO0Oo(zzagkVar != null ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(C18241k5.f55433h))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return C21111o0ooOoO.OooO0Oo(zzagkVar != null ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(C18241k5.f55433h))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        return C21111o0ooOoO.OooO0Oo(zzagkVar != null ? com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("", zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(C18241k5.f55433h))) : "https://", "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzagk zzagkVar;
        Map<String, zzagk> map = zza;
        synchronized (map) {
            zzagkVar = map.get(str);
        }
        if (zzagkVar != null) {
            return C21111o0ooOoO.OooO0Oo(zza(zzagkVar.zzb(), zzagkVar.zza(), zzagkVar.zzb().contains(C18241k5.f55433h)), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzagn zzagnVar) {
        Map<String, List<WeakReference<zzagn>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzagnVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzagnVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(FirebaseApp firebaseApp, String str, int i) {
        String apiKey = firebaseApp.getOptions().getApiKey();
        Map<String, zzagk> map = zza;
        synchronized (map) {
            map.put(apiKey, new zzagk(str, i));
        }
        Map<String, List<WeakReference<zzagn>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(apiKey)) {
                    Iterator<WeakReference<zzagn>> it = map2.get(apiKey).iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        zzagn zzagnVar = it.next().get();
                        if (zzagnVar != null) {
                            zzagnVar.zza();
                            z = true;
                        }
                    }
                    if (!z) {
                        zza.remove(apiKey);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(FirebaseApp firebaseApp) {
        return zza.containsKey(firebaseApp.getOptions().getApiKey());
    }
}
