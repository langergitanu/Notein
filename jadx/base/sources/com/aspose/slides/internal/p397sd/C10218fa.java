package com.aspose.slides.internal.p397sd;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p107eg.C3684du;
import com.aspose.slides.internal.p107eg.C3691to;
import com.aspose.slides.internal.p116ev.C3801kk;
import com.aspose.slides.internal.p275mi.C6393m9;
import com.aspose.slides.internal.p284mx.C6618k4;
import com.aspose.slides.internal.p284mx.C6619kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p558zz.C13641m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C10218fa {

    /* JADX INFO: renamed from: k4 */
    private static final List<Integer> f36622k4 = m50049k4();

    /* JADX INFO: renamed from: k4 */
    private static List<Integer> m50049k4() {
        List<Integer> list = new List<>();
        list.addItem(Integer.valueOf(C6619kk.f18351wy));
        list.addItem(Integer.valueOf(C6619kk.f18322fa));
        list.addItem(Integer.valueOf(C6619kk.f18327jd));
        list.addItem(Integer.valueOf(C6619kk.f18346up));
        list.addItem(Integer.valueOf(C6619kk.f18348v4));
        list.addItem(Integer.valueOf(C6619kk.f18329kk));
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m50050k4(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m50052k4(C6618k4 c6618k4) {
        if (c6618k4.m26396x1(C6619kk.f18322fa) == null || c6618k4.m26396x1(C6619kk.f18346up) == null) {
            return null;
        }
        C10220jd c10220jd = new C10220jd();
        Dictionary.Enumerator<Integer, C6393m9> it = c6618k4.m26394to().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                Integer num = (Integer) next.getKey();
                int iIntValue = num.intValue();
                if (!f36622k4.containsItem(num)) {
                    c10220jd.m50061k4(iIntValue, ((C6393m9) next.getValue()).m26239k4());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c10220jd.m50060k4().m50019k4((C3691to) c6618k4.m26396x1(C6619kk.f18329kk));
        C10216du c10216du = new C10216du();
        c10216du.m50030k4(c6618k4);
        c10220jd.m50062k4(C6619kk.f18322fa, c10216du.m50031k4());
        c10220jd.m50061k4(C6619kk.f18346up, (C13641m9) null);
        int i = C6619kk.f18327jd;
        C3801kk c3801kk = (C3801kk) c6618k4.m26396x1(i);
        if (c3801kk != null) {
            C10225x1 c10225x1 = new C10225x1();
            c10225x1.m50085k4(c3801kk);
            c10220jd.m50062k4(i, c10225x1.m50086k4());
        }
        int i2 = C6619kk.f18348v4;
        if (((C3684du) c6618k4.m26396x1(i2)) != null) {
            c10220jd.m50061k4(i2, new C10219h4().m50053k4(c6618k4));
        }
        return m50051k4(c10220jd.m50063x1(), c10216du.m50033x1(), c10216du.m50032kk());
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m50051k4(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int iM50034k4 = C10217dy.m50034k4() + C14116yg.m67483k4(bArr.length, C14116yg.m67483k4(bArr2.length, bArr3.length));
        byte[] bArrM50040k4 = C10217dy.m50040k4(bArr);
        byte[] bArrM50040k42 = C10217dy.m50040k4(bArr2);
        byte[] bArrM50040k43 = C10217dy.m50040k4(bArr3);
        byte[] bArr4 = new byte[bArrM50040k4.length + 10 + bArrM50040k42.length + bArrM50040k43.length];
        bArr4[0] = 3;
        m50050k4(bArr4, iM50034k4, 1);
        int length = bArrM50040k4.length + 10;
        int length2 = bArrM50040k42.length + length;
        m50050k4(bArr4, length, 4);
        m50050k4(bArr4, length2, 7);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM50040k4), 0, AbstractC14092to.m67208k4((Object) bArr4), 10, bArrM50040k4.length);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM50040k42), 0, AbstractC14092to.m67208k4((Object) bArr4), length, bArrM50040k42.length);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM50040k43), 0, AbstractC14092to.m67208k4((Object) bArr4), length2, bArrM50040k43.length);
        return bArr4;
    }
}
