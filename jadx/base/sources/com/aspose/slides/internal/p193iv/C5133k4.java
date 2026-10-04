package com.aspose.slides.internal.p193iv;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.iv.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5133k4 {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC3150x6 m21997k4(String str) {
        return m21998k4("resources", str);
    }

    /* JADX INFO: renamed from: kk */
    public static C14047bz m22000kk(String str, String str2) {
        return new C14047bz(m22001x1(str, str2));
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m22001x1(String str, String str2) {
        return m21999k4(m21998k4(str, str2));
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3150x6 m21998k4(String str, String str2) {
        InputStream inputStream = null;
        try {
            InputStream resourceAsStream = C5133k4.class.getResourceAsStream(str.replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + IOUtils.DIR_SEPARATOR_UNIX + str2);
            if (resourceAsStream == null) {
                resourceAsStream = C5133k4.class.getResourceAsStream("/com/aspose/slides/" + str.replace(FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + IOUtils.DIR_SEPARATOR_UNIX + str2);
                if (resourceAsStream == null && resourceAsStream == null) {
                    throw new IllegalStateException(C14113y2.m67402k4("Resource file {0} not found in assembly.", str2));
                }
            }
            AbstractC3150x6 abstractC3150x6FromJava = AbstractC3150x6.fromJava(resourceAsStream);
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                    return abstractC3150x6FromJava;
                } catch (IOException e) {
                    C3085sv.m13082k4(e);
                }
            }
            return abstractC3150x6FromJava;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    C3085sv.m13082k4(e2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m21999k4(AbstractC3150x6 abstractC3150x6) {
        byte[] bArr = new byte[16384];
        C3152yj c3152yj = new C3152yj();
        while (true) {
            try {
                int i = abstractC3150x6.read(bArr, 0, 16384);
                if (i <= 0) {
                    byte[] array = c3152yj.toArray();
                    c3152yj.dispose();
                    return array;
                }
                c3152yj.write(bArr, 0, i);
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
    }
}
