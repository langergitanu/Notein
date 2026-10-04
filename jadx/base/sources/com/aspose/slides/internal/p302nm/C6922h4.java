package com.aspose.slides.internal.p302nm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p138fu.C4124fa;
import com.aspose.slides.internal.p138fu.C4127k4;
import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p472w8.C11894ck;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nm.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6922h4 {

    /* JADX INFO: renamed from: k4 */
    private static final byte[] f18863k4;

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<String, byte[]> f18865x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static final Object f18864kk = new Object();

    static {
        AbstractC3150x6 abstractC3150x6M16496k4 = C4124fa.m16496k4("/Aspose/Foundation/Resources/HatchMasks.dat");
        try {
            byte[] bArr = new byte[(int) abstractC3150x6M16496k4.getLength()];
            f18863k4 = bArr;
            abstractC3150x6M16496k4.read(bArr, 0, bArr.length);
            abstractC3150x6M16496k4.dispose();
        } catch (Throwable th) {
            if (abstractC3150x6M16496k4 != null) {
                abstractC3150x6M16496k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m27133k4(C4316du c4316du) {
        Dictionary<String, byte[]> dictionary;
        byte[] bArr;
        byte[] bArrM27135x1;
        String strM27134kk = m27134kk(c4316du);
        Object obj = f18864kk;
        synchronized (obj) {
            byte[][] bArr2 = {null};
            dictionary = f18865x1;
            dictionary.tryGetValue(strM27134kk, bArr2);
            bArr = bArr2[0];
        }
        if (bArr != null) {
            return bArr;
        }
        synchronized (obj) {
            try {
                byte[][] bArr3 = {bArr};
                boolean zTryGetValue = dictionary.tryGetValue(strM27134kk, bArr3);
                bArrM27135x1 = bArr3[0];
                if (!zTryGetValue) {
                    bArrM27135x1 = m27135x1(c4316du);
                    dictionary.set_Item(strM27134kk, bArrM27135x1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrM27135x1;
    }

    /* JADX INFO: renamed from: kk */
    private static String m27134kk(C4316du c4316du) {
        return C14113y2.m67402k4("{0}{1:X}{2:X}", C14042ak.m66410k4(C11894ck.class, c4316du.m17317x1()), Integer.valueOf(c4316du.m17316to().m23103m9()), Integer.valueOf(c4316du.m17315kk().m23103m9()));
    }

    /* JADX INFO: renamed from: x1 */
    private static byte[] m27135x1(C4316du c4316du) {
        byte[] bArr = new byte[8];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) f18863k4), c4316du.m17317x1() * 8, AbstractC14092to.m67208k4((Object) bArr), 0, 8);
        C4127k4 c4127k4 = new C4127k4(8, 8);
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                try {
                    c4127k4.m16540k4(i2, 7 - i, ((bArr[i] & 255) & (128 >> i2)) > 0 ? c4316du.m17315kk() : c4316du.m17316to());
                } catch (Throwable th) {
                    c4127k4.dispose();
                    throw th;
                }
            }
        }
        C3152yj c3152yj = new C3152yj();
        c4127k4.m16541k4(c3152yj, 5);
        byte[] bArrM58632x1 = C12565ks.m58632x1(c3152yj);
        c4127k4.dispose();
        return bArrM58632x1;
    }
}
