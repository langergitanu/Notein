package com.google.firebase.auth.internal;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p624firebaseauthapi.zzaao;
import com.google.firebase.auth.GetTokenResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbi {
    private static final Logger zza = new Logger("GetTokenResultFactory", new String[0]);

    public static GetTokenResult zza(String str) {
        Map map;
        try {
            map = zzbh.zza(str);
        } catch (zzaao e) {
            zza.m74919e("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        return new GetTokenResult(str, map);
    }
}
