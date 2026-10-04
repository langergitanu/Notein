package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.t6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1647t6 {

    /* JADX INFO: renamed from: k4 */
    private static String[] f6329k4 = {"OS/2", "cmap", "glyf", "head", "hhea", "hmtx", "loca", "maxp", "name", "post"};

    /* JADX INFO: renamed from: kk */
    private void m8911kk(C1627f9 c1627f9) {
        if (C14044b3.m66437kk(c1627f9.m8776k4())) {
            c1627f9.m8778k4(1.0d);
        }
        c1627f9.m8779k4(f6329k4.length & 65535);
        c1627f9.m8784kk(C7019kk.m27457kk(Double.valueOf(C14116yg.m67490kk(C14116yg.m67511yj(c1627f9.m8788x1() & 65535) / C14116yg.m67511yj(2.0d))), 14));
        c1627f9.m8789x1(C7019kk.m27457kk(Double.valueOf(C14116yg.m67469du(2.0d, c1627f9.m8786to() & 65535) * 16.0d), 14));
        c1627f9.m8787to((((c1627f9.m8788x1() & 65535) * 16) - (c1627f9.m8783kk() & 65535)) & 65535);
        c1627f9.m8777k4("head").set_Item("checkSumAdjustment", 0L);
        c1627f9.m8777k4("head").set_Item("magickNumber", 1594834165L);
        C7019kk.m27469x1(c1627f9.m8777k4("head").get_Item("created"), String.class);
        C7019kk.m27469x1(c1627f9.m8777k4("head").get_Item("created"), String.class);
        C14084qq c14084qqClone = C14084qq.m67081jd().Clone();
        if (c1627f9.m8777k4("head").get_Item("created") == null) {
            c1627f9.m8777k4("head").set_Item("created", c14084qqClone.Clone());
        }
        if (c1627f9.m8777k4("head").get_Item("modified") == null) {
            c1627f9.m8777k4("head").set_Item("modified", c14084qqClone.Clone());
        }
        List list = new List();
        for (C1625dy c1625dy : c1627f9.m8785m9()) {
            c1625dy.m8764kk().sort();
            List.Enumerator<Integer> it = c1625dy.m8764kk().iterator();
            while (it.hasNext()) {
                try {
                    Integer num = (Integer) C7019kk.m27464to(it.next(), Integer.TYPE);
                    num.intValue();
                    if (list.indexOf(num) >= 0) {
                        throw new Exception("Unicode symbol repeat.");
                    }
                    list.addItem(num);
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private byte[] m8912to(C1627f9 c1627f9) {
        long j;
        long j2 = 4294967295L;
        long jM8788x1 = ((long) (((c1627f9.m8788x1() & 65535) * 16) + 12)) & 4294967295L;
        for (String str : f6329k4) {
            c1627f9.m8775h4().addItem(str, C1634k4.m8835k4(str, c1627f9.m8777k4(str)));
        }
        String[] strArr = f6329k4;
        int length = strArr.length;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        while (true) {
            j = j2;
            if (i >= length) {
                break;
            }
            String str2 = strArr[i];
            C1634k4 c1634k4 = c1627f9.m8775h4().get_Item(str2);
            c1634k4.m8839k4(jM8788x1);
            long jMo8701k4 = c1634k4.mo8701k4(c1627f9);
            if ("head".equals(str2)) {
                j4 = jM8788x1;
            }
            long j5 = jMo8701k4 & j;
            long j6 = (j5 % 4) & j;
            long j7 = j6 != j3 ? (j5 + ((4 - j6) & j)) & j : jMo8701k4;
            c1634k4.m8842kk(jMo8701k4);
            c1634k4.m8844to(j7);
            jM8788x1 = ((jM8788x1 & j) + (j7 & j)) & j;
            i++;
            j2 = j;
            j3 = 0;
        }
        byte[] bArr = new byte[(int) (jM8788x1 & j)];
        C1655vh c1655vh = new C1655vh(bArr, 0L);
        c1655vh.m8993k4(c1627f9.m8776k4());
        c1655vh.m8995k4(c1627f9.m8788x1());
        c1655vh.m8995k4(c1627f9.m8783kk());
        c1655vh.m8995k4(c1627f9.m8786to());
        c1655vh.m8995k4(c1627f9.m8774du());
        C1634k4.m8835k4("directory", (Dictionary<String, Object>) null).mo8702k4(c1655vh, c1627f9);
        Dictionary.ValueCollection.Enumerator<String, C1634k4> it = c1627f9.m8775h4().getValues().iterator();
        while (it.hasNext()) {
            try {
                C1634k4 next = it.next();
                long jM8988k4 = c1655vh.m8988k4();
                next.mo8702k4(c1655vh, c1627f9);
                if ((((next.m8843to() & j) % 4) & j) != 0) {
                    c1655vh.m9013x1((4 - (((next.m8843to() & j) % 4) & j)) & j);
                }
                next.m8846x1(C1656vj.m9015k4(bArr, jM8988k4, next.m8836du()));
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        Dictionary.ValueCollection.Enumerator<String, C1634k4> it2 = c1627f9.m8775h4().getValues().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            try {
                c1655vh.m9014x1(it2.next().m8841kk(), new C14093tq<>(Long.valueOf((i2 * 16) + 16)));
                i2++;
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        c1655vh.m9014x1(((((2981146554L - (C1656vj.m9015k4(bArr, 0L, 0L) & j)) & j) + 4294967296L) % 4294967296L) & j, new C14093tq<>(Long.valueOf((j4 & j) + 8)));
        return bArr;
    }

    /* JADX INFO: renamed from: x1 */
    private void m8913x1(C1627f9 c1627f9) {
        if (c1627f9.m8785m9().length == 0) {
            throw new Exception("Font doesn't contain glyphs.");
        }
        if (c1627f9.m8777k4("OS/2") == null || c1627f9.m8777k4("head") == null || c1627f9.m8777k4("name") == null) {
            throw new Exception("Font doesn't contain necessary tables.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m8914k4(C1627f9 c1627f9) {
        m8913x1(c1627f9);
        m8911kk(c1627f9);
        return m8912to(c1627f9);
    }
}
