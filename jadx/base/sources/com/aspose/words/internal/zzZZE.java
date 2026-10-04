package com.aspose.words.internal;

import com.aspose.slides.C22218Oooo;
import com.aspose.slides.OooOOO;
import com.aspose.slides.PatternStyle;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZE {
    private static volatile String zzcN;

    public static class zzY {
        private String mName;
        private zzY zzcL;

        public zzY(String str) {
            this.mName = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getPath() {
            if (this.zzcL == null) {
                return "/" + this.mName;
            }
            return this.zzcL.getPath() + IOUtils.DIR_SEPARATOR_UNIX + this.mName;
        }

        public final zzY zzrq() {
            return this.zzcL;
        }
    }

    public static class zzZ {
        private zzY zzcM;

        public zzZ(String str) {
            if (zzZKN.zzU3(str)) {
                this.zzcM = new zzY("");
                return;
            }
            String[] strArrSplit = str.split("\\.");
            zzY zzy = new zzY(strArrSplit[strArrSplit.length - 1]);
            this.zzcM = zzy;
            for (int length = strArrSplit.length - 2; length >= 0; length--) {
                zzy.zzcL = new zzY(strArrSplit[length]);
                zzy = zzy.zzcL;
            }
        }

        public final zzY zzrr() {
            return this.zzcM;
        }
    }

    private static InputStream zzU(String str, Class cls) {
        if (zzcN != null) {
            return cls.getResourceAsStream(zzcN + str);
        }
        for (zzY zzyZzrr = new zzZ(cls.getPackage().getName()).zzrr(); zzyZzrr != null; zzyZzrr = zzyZzrr.zzrq()) {
            String str2 = zzyZzrr.getPath() + new String(new byte[]{PatternStyle.Shingle, 114, 101, 115, 111, 117, 114, 99, 101, 115, PatternStyle.Shingle});
            InputStream resourceAsStream = cls.getResourceAsStream(str2 + str);
            if (resourceAsStream != null) {
                zzcN = str2;
                return resourceAsStream;
            }
        }
        return null;
    }

    public static InputStream zzV(String str, Class cls) {
        String strZzXz = zzXz(str);
        InputStream inputStreamZzU = zzU(strZzXz, cls);
        if (inputStreamZzU != null) {
            return inputStreamZzU;
        }
        InputStream inputStreamZzU2 = zzU(zzXy(strZzXz), zzZXR.class);
        if (inputStreamZzU2 != null) {
            return inputStreamZzU2;
        }
        throw new IllegalStateException(OooOOO.OooO0O0(new StringBuilder(), "Resurce not found ", str, "."));
    }

    public static zzZOP zzW(String str, Class cls) {
        try {
            InputStream inputStreamZzV = zzV(str, cls);
            zzZOR zzzor = new zzZOR();
            try {
                zzZKB.zzZ(inputStreamZzV, zzzor);
                inputStreamZzV.close();
                zzzor.zzH(0L);
                return zzzor;
            } catch (Throwable th) {
                inputStreamZzV.close();
                throw th;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String zzXy(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        int iLastIndexOf2 = str.lastIndexOf(46, iLastIndexOf - 1);
        if (iLastIndexOf < 0 || iLastIndexOf2 < 0) {
            return null;
        }
        return androidx.concurrent.futures.OooO0O0.OooO00o(str, iLastIndexOf, C22218Oooo.OooO0OO(zzZKN.zzZ(str.substring(0, iLastIndexOf), FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX)));
    }

    private static String zzXz(String str) {
        String str2 = new String(new byte[]{PatternStyle.Divot, 82, 101, 115, 111, 117, 114, 99, 101, 115, PatternStyle.Divot});
        int iIndexOf = str.indexOf(str2);
        return iIndexOf > 0 ? str.substring(str2.length() + iIndexOf) : str;
    }
}
