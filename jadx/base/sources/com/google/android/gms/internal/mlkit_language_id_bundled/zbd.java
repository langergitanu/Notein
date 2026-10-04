package com.google.android.gms.internal.mlkit_language_id_bundled;

import Oooo0oO.o0Oo0oo;
import androidx.core.database.OooO00o;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class zbd {
    public static String zba(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strOooO00o;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strOooO00o = CloudMetaExtra.DEFINE_NON_PARENT_ID;
            } else {
                try {
                    strOooO00o = obj.toString();
                } catch (Exception e) {
                    String strOooO0Oo = o0Oo0oo.OooO0Oo(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strOooO0Oo), (Throwable) e);
                    strOooO00o = OooO00o.OooO00o("<", strOooO0Oo, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strOooO00o;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
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
}
