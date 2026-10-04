package com.aspose.words;

import com.aspose.slides.C22218Oooo;
import com.aspose.words.ref.Ref;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzNP {
    private HashMap<String, String> zzZpz = new HashMap<>();
    private com.aspose.words.internal.zzIM<String> zzZpy = new com.aspose.words.internal.zzIM<>();

    public final String zzZv(String str, String str2) {
        String str3 = this.zzZpz.get(str);
        com.aspose.words.internal.zzZQF.zzY(this.zzZpz, str);
        com.aspose.words.internal.zzZQF.zzY(this.zzZpz, str2, str3);
        return str3;
    }

    public final String zzZw(String str, String str2) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzZpz, str, ref);
        String str3 = (String) ref.get();
        if (zZzZ) {
            return str3;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(str2)) {
            str2 = "ns";
        }
        String string = str2;
        int i = 1;
        while (this.zzZpy.contains(string)) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str2);
            sbOooO0OO.append(com.aspose.words.internal.zzJB.zzWD(i));
            string = sbOooO0OO.toString();
            i++;
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzZpz, str, string);
        this.zzZpy.add(string);
        return string;
    }
}
