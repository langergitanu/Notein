package com.google.android.recaptcha.internal;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfu {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        Iterator it = C33599OooOo0O.o000oOoO(str, new char[]{FilenameUtils.EXTENSION_SEPARATOR}).iterator();
        String strConcat = "";
        while (it.hasNext()) {
            String strConcat2 = strConcat.concat(String.valueOf((String) it.next()));
            if (set.contains(strConcat2)) {
                return true;
            }
            strConcat = strConcat2.concat(".");
        }
        return false;
    }

    public final void zza(zzrv zzrvVar) {
        this.zza = OooOo.o0OO00O(zzrvVar.zzf().zzi());
        this.zzb = OooOo.o0OO00O(zzrvVar.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        }
        if (set.isEmpty()) {
            return true;
        }
        Set set2 = this.zzb;
        OooOOO0.OooO0o0(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        if (zzc(str, set2)) {
            return false;
        }
        return zzc(str, set);
    }
}
