package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p088dn.C3193du;
import com.huawei.hms.network.embedded.C18293o1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.fa */
/* JADX INFO: loaded from: classes5.dex */
public class C14058fa {
    /* JADX INFO: renamed from: k4 */
    public static void m66593k4(AbstractC14092to abstractC14092to, int i, AbstractC14092to abstractC14092to2, int i2, int i3) {
        m66594k4(AbstractC14092to.m67212k4(abstractC14092to), i, AbstractC14092to.m67212k4(abstractC14092to2), i2, i3);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m66601x1(Object obj, int i, Object obj2, int i2, int i3) {
        if (obj == null) {
            throw new ArgumentNullException("src");
        }
        if (obj2 == null) {
            throw new ArgumentNullException("dst");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("srcOffset", "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("dstOffset", "Non-negative number required.");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66594k4(Object obj, int i, Object obj2, int i2, int i3) {
        m66601x1(obj, i, obj2, i2, i3);
        C3193du.k4 k4VarM13754k4 = C3193du.m13754k4(C3193du.m13756k4(obj));
        C3193du.k4 k4VarM13754k42 = C3193du.m13754k4(C3193du.m13756k4(obj2));
        int iM13753k4 = C3193du.m13753k4(k4VarM13754k4);
        int iM13753k42 = C3193du.m13753k4(k4VarM13754k42);
        if (k4VarM13754k4.equals(k4VarM13754k42)) {
            if (k4VarM13754k4.equals(C3193du.k4.ByteObject) || k4VarM13754k4.equals(C3193du.k4.BytePrimitive)) {
                m66595k4(obj, i, obj2, i2, i3, iM13753k4);
                return;
            } else if (i % iM13753k4 == 0 && i2 % iM13753k42 == 0 && i3 % iM13753k4 == 0 && i3 % iM13753k42 == 0) {
                m66595k4(obj, i, obj2, i2, i3, iM13753k4);
                return;
            }
        }
        C3193du c3193duM13755k4 = C3193du.m13755k4(obj, i, i3, k4VarM13754k4, iM13753k4);
        C3193du c3193duM13755k42 = C3193du.m13755k4(obj2, i2, i3, k4VarM13754k42, iM13753k42);
        ByteBuffer byteBufferM13762x1 = c3193duM13755k4.m13762x1();
        ByteBuffer byteBufferM13762x12 = c3193duM13755k42.m13762x1();
        byteBufferM13762x12.position(i2 - c3193duM13755k42.m13760kk());
        byteBufferM13762x1.position(i - c3193duM13755k4.m13760kk());
        for (int i4 = 0; i4 < i3; i4++) {
            byteBufferM13762x12.put(byteBufferM13762x1.get());
        }
        c3193duM13755k42.m13759k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m66595k4(Object obj, int i, Object obj2, int i2, int i3, int i4) {
        C3193du.m13757k4(obj, i, i3, i4);
        C3193du.m13757k4(obj2, i2, i3, i4);
        System.arraycopy(obj, i / i4, obj2, i2 / i4, i3 / i4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66596k4(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        m66601x1(bArr, i, bArr2, i2, i3);
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66597k4(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        m66601x1(bArr, i, iArr, i2, i3);
        ByteBuffer.wrap(bArr, i, bArr.length).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().get(iArr, i2, i3 / 4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66598k4(char[] cArr, int i, char[] cArr2, int i2, int i3) {
        m66601x1(cArr, i, cArr2, i2, i3);
        System.arraycopy(cArr, i / 2, cArr2, i2 / 2, i3 / 2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66599k4(int[] iArr, int i, byte[] bArr, int i2, int i3) {
        ByteBuffer.wrap(bArr, i2, i3).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().put(iArr, i, iArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66600k4(short[] sArr, int i, byte[] bArr, int i2, int i3) {
        m66601x1(sArr, i, bArr, i2, i3);
        ByteBuffer.wrap(bArr, i2, i3).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(sArr, i, sArr.length);
    }
}
