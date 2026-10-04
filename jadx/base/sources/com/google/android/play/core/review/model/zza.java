package com.google.android.play.core.review.model;

import OooO0O0.OooO00o;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zza {
    private static final Map zza;
    private static final Map zzb;

    static {
        HashMap map = new HashMap();
        zza = map;
        HashMap map2 = new HashMap();
        zzb = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, CloudSyncError.CODE_INTERNAL);
    }

    public static String zza(int i) {
        Map map = zza;
        Integer numValueOf = Integer.valueOf(i);
        return !map.containsKey(numValueOf) ? "" : OooO00o.OooO0O0((String) map.get(numValueOf), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) zzb.get(numValueOf), ")");
    }
}
