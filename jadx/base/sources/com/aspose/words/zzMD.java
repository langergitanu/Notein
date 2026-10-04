package com.aspose.words;

import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzMD {
    private static HashMap<String, Boolean> zzZoK;

    static {
        zzZoK = new HashMap<>();
        String[] strArr = {"accept", "accept-charset", "align", "alink", "axis", "bgcolor", "charset", "checked", "clear", "codetype", "color", "compact", "declare", "defer", "dir", "disabled", "enctype", OptionalModuleUtils.FACE, "frame", "hreflang", "http-equiv", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "language", "link", "media", "method", "multiple", "nohref", "noresize", "noshade", "nowrap", "readonly", "rel", "rev", "rules", "scope", "scrolling", "selected", "shape", "target", "text", C18437z2.f56754h, "valign", "valuetype", "vlink"};
        zzZoK = new HashMap<>();
        for (int i = 0; i < 45; i++) {
            com.aspose.words.internal.zzZQF.zzY(zzZoK, strArr[i], Boolean.FALSE);
        }
    }

    public static boolean zzSf(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXm(str);
        return zzZoK.containsKey(str);
    }

    public static zzQ5 zzSg(String str) {
        return new zzQ5(zzSi(str), new zzMM(1, "before"));
    }

    public static zzQG zzSh(String str) {
        return new zzQG(str);
    }

    public static zzLA zzSi(String str) {
        return new zzLA(zzNQ.zzZpB, str);
    }

    public abstract zzMC zzMv(int i);

    public int zzZWt() {
        return 0;
    }

    public abstract String zzZXr();

    public abstract zzMA zzZXs();

    public final String zzZXt() {
        String strZzZXr = zzZXr();
        com.aspose.words.internal.zzZYD.zzXk(strZzZXr);
        return strZzZXr;
    }

    public abstract String zzZXu();
}
