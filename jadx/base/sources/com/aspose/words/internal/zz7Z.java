package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.words.ref.Ref;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
final class zz7Z {
    public static String getPrefix(String str) {
        Ref ref = new Ref(null);
        Ref ref2 = new Ref(null);
        zzZ(str, (Ref<String>) ref, (Ref<String>) ref2);
        String str2 = (String) ref.get();
        ref2.get();
        return str2;
    }

    public static void zzZ(String str, Ref<String> ref, Ref<String> ref2) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1 || iIndexOf == 0 || str.length() - 1 == iIndexOf) {
            ref.set(null);
            ref2.set(str);
        } else {
            ref.set(str.substring(0, iIndexOf));
            ref2.set(str.substring(iIndexOf + 1));
        }
    }

    public static IllegalArgumentException zzZ(String str, Object obj, String str2) {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str2, IOUtils.LINE_SEPARATOR_WINDOWS);
        sbOooO0OO.append(zzZKN.format("Actual value was {0}.", obj));
        return new IllegalArgumentException(o0Oo0oo.OooO0Oo(sbOooO0OO.toString(), "\r\nParameter name: ", str));
    }
}
