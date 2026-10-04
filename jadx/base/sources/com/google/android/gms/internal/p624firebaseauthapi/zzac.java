package com.google.android.gms.internal.p624firebaseauthapi;

import Oooo0oO.o0Oo0oo;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class zzac {
    public static String zza(String str) {
        return zzp.zzb(str);
    }

    public static String zzb(String str) {
        return zzp.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzp.zzd(str);
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                objArr[i2] = zza(objArr[i2]);
            }
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i3)) != -1) {
            sb.append((CharSequence) strValueOf, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i3, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String zza(Object obj) {
        if (obj == null) {
            return CloudMetaExtra.DEFINE_NON_PARENT_ID;
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strOooO0Oo = o0Oo0oo.OooO0Oo(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", OooO00o.OooO00o("Exception during lenientFormat for ", strOooO0Oo), (Throwable) e);
            return androidx.core.database.OooO00o.OooO00o("<", strOooO0Oo, " threw ", e.getClass().getName(), ">");
        }
    }
}
