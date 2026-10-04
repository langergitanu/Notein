package com.aspose.slides.internal.p397sd;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p284mx.C6619kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p558zz.C13641m9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10220jd {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, C13641m9> f36623k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final C10215ck f36624x1 = new C10215ck();

    /* JADX INFO: renamed from: k4 */
    public static int m50054k4(int i) {
        int i2 = i | (i >> 1);
        int i3 = i2 | (i2 >> 2);
        int i4 = i3 | (i3 >> 4);
        int i5 = i4 | (i4 >> 8);
        int i6 = i5 | (i5 >> 16);
        return i6 - ((int) ((((long) i6) & 4294967295L) >> 1));
    }

    /* JADX INFO: renamed from: kk */
    private static int m50056kk(int i) {
        return m50054k4(i);
    }

    /* JADX INFO: renamed from: to */
    private static int m50057to(int i) {
        return 31 - m50058x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m50058x1(int i) {
        int i2;
        if (i == 0) {
            return 32;
        }
        if (((int) ((((long) i) & 4294967295L) >> 16)) == 0) {
            i <<= 16;
            i2 = 17;
        } else {
            i2 = 1;
        }
        if (((int) ((((long) i) & 4294967295L) >> 24)) == 0) {
            i2 += 8;
            i <<= 8;
        }
        if (((int) ((((long) i) & 4294967295L) >> 28)) == 0) {
            i2 += 4;
            i <<= 4;
        }
        if (((int) ((((long) i) & 4294967295L) >> 30)) == 0) {
            i2 += 2;
            i <<= 2;
        }
        return i2 - ((int) ((((long) i) & 4294967295L) >> 31));
    }

    /* JADX INFO: renamed from: x1 */
    private static void m50059x1(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10215ck m50060k4() {
        return this.f36624x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50061k4(int i, C13641m9 c13641m9) {
        this.f36623k4.addItem(Integer.valueOf(i), c13641m9);
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m50063x1() {
        Class cls;
        m50061k4(C6619kk.f18329kk, this.f36624x1.m50018k4());
        List list = new List();
        Dictionary.KeyCollection.Enumerator<Integer, C13641m9> it = this.f36623k4.getKeys().iterator();
        while (true) {
            try {
                boolean zHasNext = it.hasNext();
                cls = Integer.TYPE;
                if (!zHasNext) {
                    break;
                }
                Integer num = (Integer) C7019kk.m27464to(it.next(), cls);
                num.intValue();
                list.addItem(num);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        list.sort();
        int size = this.f36623k4.size();
        int i = 12;
        int i2 = (size * 16) + 12;
        Dictionary.Enumerator<Integer, C13641m9> it2 = this.f36623k4.iterator();
        int iM63014k4 = i2;
        while (it2.hasNext()) {
            try {
                KeyValuePair next = it2.next();
                if (((C13641m9) next.getValue()) != null) {
                    iM63014k4 += (((C13641m9) next.getValue()).m63014k4() + 3) & (-4);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        byte[] bArr = new byte[iM63014k4];
        m50059x1(bArr, 0, 65536);
        m50055k4(bArr, 4, size);
        int iM50056kk = m50056kk(size);
        m50055k4(bArr, 6, iM50056kk * 16);
        m50055k4(bArr, 8, m50057to(iM50056kk));
        m50055k4(bArr, 10, (size - iM50056kk) * 16);
        List.Enumerator it3 = list.iterator();
        while (it3.hasNext()) {
            try {
                Integer num2 = (Integer) C7019kk.m27464to(it3.next(), cls);
                int iIntValue = num2.intValue();
                C13641m9[] c13641m9Arr = {null};
                this.f36623k4.tryGetValue(num2, c13641m9Arr);
                C13641m9 c13641m9 = c13641m9Arr[0];
                m50059x1(bArr, i, iIntValue);
                m50059x1(bArr, i + 4, 0);
                if (c13641m9 == null) {
                    m50059x1(bArr, i + 8, 0);
                    m50059x1(bArr, i + 12, 0);
                } else {
                    m50059x1(bArr, i + 8, i2);
                    int iM63014k42 = c13641m9.m63014k4();
                    m50059x1(bArr, i + 12, iM63014k42);
                    c13641m9.m63001k4(0, bArr, i2, iM63014k42);
                    i2 += (iM63014k42 + 3) & (-4);
                }
                i += 16;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50062k4(int i, byte[] bArr) {
        m50061k4(i, C13641m9.m62992k4(bArr));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m50055k4(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 8);
        bArr[i + 1] = (byte) i2;
    }
}
