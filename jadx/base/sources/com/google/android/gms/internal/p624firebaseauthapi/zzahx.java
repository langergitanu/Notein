package com.google.android.gms.internal.p624firebaseauthapi;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzahwVarZzb = zzb(str);
        return zzahwVarZzb.zza().longValue() - zzahwVarZzb.zzb().longValue();
    }

    private static zzahw zzb(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = zzt.zza(FilenameUtils.EXTENSION_SEPARATOR).zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(OooO00o.OooO00o("Invalid idToken ", str));
        }
        try {
            return zzahw.zza(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
