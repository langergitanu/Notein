package com.aspose.words.internal;

import java.io.Reader;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFD {
    public static zzZF9 zzZ(zzZHC zzzhc, zzZF1 zzzf1, String str, zzZFE zzzfe, String str2, zzZF7 zzzf7, Reader reader) {
        zzZF9 zzzf9 = new zzZF9(zzzhc, zzzf1, str, str2, zzzf7, reader, true);
        if (zzzfe != null) {
            zzzf9.zzZS(zzzfe.zzXNv(), zzzfe.zzXNu(), -zzzfe.zzXNt());
        }
        return zzzf9;
    }

    public static zzZFM zzZ(zzZHC zzzhc, zzZFE zzzfe, zzZF7 zzzf7, Reader reader, boolean z) {
        URL urlZzXPr = zzzhc.zzXPr();
        if (urlZzXPr != null) {
            zzzf7 = zzZF7.zzX(urlZzXPr);
        }
        zzZFM zzzfm = new zzZFM(zzzhc, null, zzzf7, reader, z);
        if (zzzfe != null) {
            zzzfm.zzZS(zzzfe.zzXNv(), zzzfe.zzXNu(), -zzzfe.zzXNt());
        }
        return zzzfm;
    }

    public static zzZF1 zzZ(zzZF1 zzzf1, String str, char[] cArr, int i, zzZQY zzzqy) {
        return new zzZFK(zzzf1, str, cArr, 0, i, zzzqy, zzZF7.zzZ(zzzqy.getSystemId(), null));
    }
}
