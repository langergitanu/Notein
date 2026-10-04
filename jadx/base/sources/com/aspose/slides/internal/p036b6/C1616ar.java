package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C1616ar extends C1634k4 {
    public C1616ar() {
        super("directory");
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public long mo8701k4(C1627f9 c1627f9) {
        return ((long) ((c1627f9.m8788x1() & 65535) * 16)) & 4294967295L;
    }

    public C1616ar(long j) {
        super("directory", j, 0L, 0L);
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public Dictionary<String, Object> mo8703k4(C1636kp c1636kp, C1627f9 c1627f9) {
        C1636kp c1636kp2 = c1636kp;
        Dictionary<String, C1634k4> dictionary = new Dictionary<>();
        int iM8788x1 = c1627f9.m8788x1();
        long j = this.f6313x1;
        long j2 = (iM8788x1 & 65535) * 16;
        while (true) {
            long j3 = j & 4294967295L;
            if (j3 >= (j2 & 4294967295L)) {
                c1627f9.m8780k4(dictionary);
                return null;
            }
            String strM67440x1 = C14113y2.m67440x1(c1636kp2.m8878x1(j, 4L));
            dictionary.addItem(strM67440x1, C1634k4.m8834k4(c1636kp2, c1627f9, strM67440x1, c1636kp2.m8875to(new C14093tq<>(Long.valueOf(8 + j3))), c1636kp2.m8875to(new C14093tq<>(Long.valueOf(12 + j3))), c1636kp2.m8875to(new C14093tq<>(Long.valueOf(4 + j3)))));
            j = (j3 + 16) & 4294967295L;
            c1636kp2 = c1636kp;
        }
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public void mo8702k4(C1655vh c1655vh, C1627f9 c1627f9) {
        Dictionary.ValueCollection.Enumerator<String, C1634k4> it = c1627f9.m8775h4().getValues().iterator();
        while (it.hasNext()) {
            try {
                C1634k4 next = it.next();
                c1655vh.m9003k4(C14113y2.m67443x1(C14113y2.m67408k4(next.m8838k4(), "     "), 0, 4));
                c1655vh.m8999k4(next.m8841kk());
                c1655vh.m8999k4(next.m8845x1());
                c1655vh.m8999k4(next.m8843to());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
