package com.aspose.slides.internal.p258lv;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p420th.C10958h4;
import com.aspose.slides.internal.p420th.C10967qq;
import com.aspose.slides.internal.p456v5.C11604du;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6258x1 {

    /* JADX INFO: renamed from: c5 */
    private C6247ne f17742c5;

    /* JADX INFO: renamed from: ck */
    private C6249rv f17743ck;

    /* JADX INFO: renamed from: fa */
    private C9790ts f17746fa;

    /* JADX INFO: renamed from: jd */
    private int f17748jd;

    /* JADX INFO: renamed from: k4 */
    private C6244ks f17749k4;

    /* JADX INFO: renamed from: x1 */
    private C6242k4 f17753x1;

    /* JADX INFO: renamed from: kk */
    private short f17750kk = 300;

    /* JADX INFO: renamed from: to */
    private Dictionary<C9790ts, Short> f17752to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private Dictionary<Short, C6239h4> f17744du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private Dictionary<C14047bz, Short> f17747h4 = new Dictionary<>();

    /* JADX INFO: renamed from: m9 */
    private Dictionary<String, String> f17751m9 = new Dictionary<>();

    /* JADX INFO: renamed from: dy */
    private List<C6247ne> f17745dy = new List<>();

    public C6258x1(AbstractC3150x6 abstractC3150x6, C6244ks c6244ks) {
        this.f17753x1 = new C6242k4(abstractC3150x6);
        this.f17749k4 = c6244ks;
        this.f17743ck = new C6249rv(c6244ks.m25331to());
    }

    /* JADX INFO: renamed from: k4 */
    private String m25386k4(C12025x6 c12025x6) {
        return C14113y2.m67402k4("bookmark://internal?page={0}&x={1}&y={2}", Integer.valueOf(this.f17748jd), Integer.valueOf(C12566m9.m58636c5(c12025x6.m56897x1())), Integer.valueOf(C12566m9.m58636c5(c12025x6.m56895kk())));
    }

    /* JADX INFO: renamed from: c5 */
    public final C6249rv m25388c5() {
        return this.f17743ck;
    }

    /* JADX INFO: renamed from: du */
    public final IGenericList<C6247ne> m25389du() {
        return this.f17745dy;
    }

    /* JADX INFO: renamed from: dy */
    public final Dictionary<String, String> m25390dy() {
        return this.f17751m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final C6247ne m25391h4() {
        return this.f17742c5;
    }

    /* JADX INFO: renamed from: kk */
    public final C6239h4 m25400kk(C9790ts c9790ts) {
        short sM25405x1 = m25405x1(c9790ts);
        C6239h4[] c6239h4Arr = {null};
        boolean zTryGetValue = this.f17744du.tryGetValue(Short.valueOf(sM25405x1), c6239h4Arr);
        C6239h4 c6239h4 = c6239h4Arr[0];
        if (zTryGetValue) {
            return c6239h4;
        }
        C6239h4 c6239h42 = new C6239h4(c9790ts);
        c6239h42.m25265k4(" ");
        this.f17744du.set_Item(Short.valueOf(sM25405x1), c6239h42);
        return c6239h42;
    }

    /* JADX INFO: renamed from: m9 */
    public final C9790ts m25402m9() {
        return this.f17746fa;
    }

    /* JADX INFO: renamed from: to */
    public final C6242k4 m25403to() {
        return this.f17753x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final short m25404x1() {
        short s = (short) (this.f17750kk + 1);
        this.f17750kk = s;
        return s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25392k4() {
        C9790ts c9790tsMo48032k4 = C9763ck.m48030to().mo48032k4(this.f17749k4.m25333u4(), 0, "Arial");
        this.f17746fa = c9790tsMo48032k4;
        C6239h4 c6239h4M25400kk = m25400kk(c9790tsMo48032k4);
        m25387k4(this.f17749k4.m25336uz(), c6239h4M25400kk);
        m25387k4(this.f17749k4.m25337wl(), c6239h4M25400kk);
        m25387k4(this.f17749k4.m25329qq(), c6239h4M25400kk);
    }

    /* JADX INFO: renamed from: kk */
    public final C6244ks m25401kk() {
        return this.f17749k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final short m25405x1(C9790ts c9790ts) {
        Short[] shArr = {0};
        boolean zTryGetValue = this.f17752to.tryGetValue(c9790ts, shArr);
        short sShortValue = shArr[0].shortValue();
        if (zTryGetValue) {
            return sShortValue;
        }
        short sM25404x1 = m25404x1();
        this.f17752to.set_Item(c9790ts, Short.valueOf(sM25404x1));
        return sM25404x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m25387k4(Dictionary<String, String> dictionary, C6239h4 c6239h4) {
        Dictionary.Enumerator<String, String> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                c6239h4.m25265k4((String) it.next().getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final short m25406x1(byte[] bArr) {
        C14047bz c14047bzClone = C11604du.m54651k4(bArr).Clone();
        Short[] shArr = {0};
        boolean zTryGetValue = this.f17747h4.tryGetValue(c14047bzClone.Clone(), shArr);
        short sShortValue = shArr[0].shortValue();
        if (zTryGetValue) {
            return sShortValue;
        }
        short sM25404x1 = m25404x1();
        this.f17747h4.set_Item(c14047bzClone.Clone(), Short.valueOf(sM25404x1));
        return sM25404x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25393k4(C6245lr c6245lr) {
        this.f17742c5.m25355k4(c6245lr);
        this.f17745dy.addItem(this.f17742c5);
        this.f17748jd++;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25394k4(C10958h4 c10958h4) {
        String strM25386k4 = m25386k4(c10958h4.m52933k4().Clone());
        this.f17751m9.set_Item(c10958h4.m52936x1(), strM25386k4);
        int iM25308du = this.f17749k4.m25308du();
        if (iM25308du <= 0 || c10958h4.m52935kk()) {
            return;
        }
        this.f17743ck.m25361k4(iM25308du, c10958h4.m52936x1(), strM25386k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25395k4(C10967qq c10967qq) {
        String strM25386k4 = m25386k4(c10967qq.m53027k4().Clone());
        if (c10967qq.m53030x1() < this.f17749k4.m25323kk()) {
            this.f17743ck.m25361k4(c10967qq.m53030x1(), c10967qq.m53029kk(), strM25386k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25396k4(short s, C12015qq c12015qq) {
        this.f17742c5 = new C6247ne(this, s, c12015qq.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25397k4(boolean z) {
        if (z) {
            new C6246m9(this).m25348k4(this.f17746fa);
            new C6243kk(this).m25301k4();
            m25403to().m25283k4(1, 0);
        }
        for (int i = 0; i < this.f17745dy.size(); i++) {
            this.f17745dy.get_Item(i).m25354k4(i, z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25398k4(C9790ts c9790ts) {
        return this.f17752to.containsKey(c9790ts);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25399k4(byte[] bArr) {
        return this.f17747h4.containsKey(C11604du.m54651k4(bArr).Clone());
    }
}
