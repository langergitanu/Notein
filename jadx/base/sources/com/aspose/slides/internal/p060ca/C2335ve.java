package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ve */
/* JADX INFO: loaded from: classes3.dex */
class C2335ve {

    /* JADX INFO: renamed from: k4 */
    private static final String[] f8107k4 = {"ttcf", "cmap", "head", "hhea", "hmtx", "maxp", "name", "OS/2", "post", "cvt ", "fpgm", "glyf", "loca", "prep", "CFF ", "VORG", "EBDT", "EBLC", "EBSC", "BASE", "GDEF", "GPOS", "GSUB", "JSTF", "DSIG", "gasp", "hdmx", "kern", "LTSH", "PCLT", "VDMX", "vhea", "vmtx", "bsln", "feat", "lcar", "morx", "opbd", "prop", "Feat", "Glat", "Gloc", "Sile", "Silf", "bhed", "bdat", "bloc"};

    /* JADX INFO: renamed from: k4 */
    public static long m11557k4(String str) {
        if (str.length() != 4) {
            throw new ArgumentException("Length of tag must be 4", "tag");
        }
        byte[] bArrMo26677to = AbstractC6747ar.m26650yj().mo26677to(str);
        return C7019kk.m27435du(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArrMo26677to[3]), 6) | (C7019kk.m27462to(Byte.valueOf(bArrMo26677to[0]), 6) << 24) | (C7019kk.m27462to(Byte.valueOf(bArrMo26677to[1]), 6) << 16) | (C7019kk.m27462to(Byte.valueOf(bArrMo26677to[2]), 6) << 8)), 9);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m11559x1(String str) {
        for (String str2 : f8107k4) {
            if (C14113y2.m67363du(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m11558k4(long j) {
        String strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(new byte[]{C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) >> 24), 10) & 255), 10), C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) >> 16), 10) & 255), 10), C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) >> 8), 10) & 255), 10), C7019kk.m27442k4(Long.valueOf(C7019kk.m27435du(Long.valueOf(j), 10) & 255), 10)});
        m11559x1(strM26681x1);
        return strM26681x1;
    }
}
