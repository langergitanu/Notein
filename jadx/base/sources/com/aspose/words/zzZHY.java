package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHY {
    private boolean zzYqA;

    public final void zzX(String str, String str2, zzPS zzps) {
        if (this.zzYqA || "http://www.w3.org/2000/svg".equals(str2)) {
            return;
        }
        if (("div".equals(str) || "span".equals(str) || "input".equals(str) || "select".equals(str)) && zzps.zzZy(RequestParameters.POSITION, "absolute")) {
            if (zzps.zzSx("top") == null && zzps.zzSx("right") == null && zzps.zzSx("bottom") == null && zzps.zzSx("left") == null) {
                return;
            }
            this.zzYqA = true;
        }
    }

    public final boolean zzZ2a() {
        return this.zzYqA;
    }
}
