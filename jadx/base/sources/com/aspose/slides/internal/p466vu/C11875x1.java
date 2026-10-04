package com.aspose.slides.internal.p466vu;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.vu.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11875x1 {
    /* JADX INFO: renamed from: k4 */
    public static void m55456k4(AbstractC3150x6 abstractC3150x6, OutputStream outputStream) {
        m55457k4(abstractC3150x6, outputStream, 0L);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55457k4(AbstractC3150x6 abstractC3150x6, OutputStream outputStream, long j) {
        if (abstractC3150x6 == null) {
            throw new NullPointerException("srcStream");
        }
        if (outputStream == null) {
            throw new NullPointerException("dstStream");
        }
        long position = abstractC3150x6.getPosition();
        abstractC3150x6.setPosition(j);
        byte[] bArr = new byte[65536];
        while (true) {
            int i = abstractC3150x6.read(bArr, 0, 65536);
            if (i == 0) {
                abstractC3150x6.setPosition(position);
                return;
            } else {
                try {
                    outputStream.write(bArr, 0, i);
                } catch (IOException e) {
                    throw new com.aspose.slides.exceptions.IOException("exception", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55458k4(AbstractC11874k4 abstractC11874k4) {
        abstractC11874k4.m55455k4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55459k4(InputStream inputStream, C3152yj c3152yj) {
        if (inputStream == null) {
            throw new NullPointerException("srcStream");
        }
        if (c3152yj == null) {
            throw new NullPointerException("srcStream");
        }
        byte[] bArr = new byte[65536];
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 65536);
                if (i <= 0) {
                    c3152yj.setPosition(0L);
                    return;
                }
                c3152yj.write(bArr, 0, i);
            } catch (IOException e) {
                throw new com.aspose.slides.exceptions.IOException("exception", e);
            }
        }
    }
}
