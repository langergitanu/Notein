package com.aspose.slides.internal.p356qb;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C9816ck {

    /* JADX INFO: renamed from: h4 */
    private C9825m9 f35556h4;

    /* JADX INFO: renamed from: m9 */
    private C9819fa f35559m9;

    /* JADX INFO: renamed from: k4 */
    private C9828x1 f35557k4 = null;

    /* JADX INFO: renamed from: x1 */
    private C9829yj f35561x1 = null;

    /* JADX INFO: renamed from: kk */
    private C9824ks f35558kk = null;

    /* JADX INFO: renamed from: to */
    private InterfaceC9821jd f35560to = null;

    /* JADX INFO: renamed from: du */
    private List<C9827up> f35555du = null;

    public C9816ck() {
        C9825m9 c9825m9 = new C9825m9();
        this.f35556h4 = c9825m9;
        c9825m9.m48440k4(new C9815c5("Root Entry"));
    }

    /* JADX INFO: renamed from: du */
    private void m48346du() {
        C9828x1 c9828x1 = new C9828x1();
        this.f35557k4 = c9828x1;
        c9828x1.m48456k4((short) -2);
        this.f35557k4.m48465x1(4096);
        this.f35557k4.m48467x1((short) 512);
        this.f35557k4.m48460kk((short) 64);
    }

    /* JADX INFO: renamed from: kk */
    private void m48355kk() {
        List<AbstractC9818dy> listM48439k4 = this.f35556h4.m48439k4();
        for (int i = 0; i < listM48439k4.size(); i++) {
            if (C7019kk.m27469x1(listM48439k4.get_Item(i), C9820h4.class)) {
                C9820h4 c9820h4 = (C9820h4) listM48439k4.get_Item(i);
                c9820h4.m48378k4(((long) c9820h4.m48375fa()) < this.f35557k4.m48449du() ? this.f35558kk.m48420kk(c9820h4.m48412x1(this.f35557k4.m48464x1())) : this.f35561x1.m48473kk(c9820h4.m48412x1(this.f35557k4.m48452k4())));
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m48356to() {
        this.f35561x1 = new C9829yj(this.f35557k4.m48452k4());
        this.f35559m9 = new C9819fa(this.f35557k4.m48452k4());
        this.f35558kk = new C9824ks(this.f35557k4.m48464x1());
        this.f35561x1.m48471k4(this.f35559m9);
        this.f35559m9.m48398k4(this.f35561x1);
    }

    /* JADX INFO: renamed from: x1 */
    private void m48357x1() {
        this.f35557k4.m48466x1(this.f35561x1.m48473kk(this.f35558kk.mo48395k4(this.f35557k4.m48452k4())));
    }

    /* JADX INFO: renamed from: k4 */
    public final C9815c5 m48360k4() {
        return this.f35556h4.m48442kk();
    }

    public C9816ck(AbstractC3150x6 abstractC3150x6) {
        m48361k4(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    private C9820h4 m48347k4(List<AbstractC9818dy> list) {
        List<C9820h4> list2 = new List<>();
        for (int i = 0; i < list.size(); i++) {
            if (C7019kk.m27469x1(list.get_Item(i), C9820h4.class)) {
                C9820h4 c9820h4 = (C9820h4) list.get_Item(i);
                if (c9820h4.m48375fa() < this.f35557k4.m48449du()) {
                    list2.addItem(c9820h4);
                }
            }
        }
        C9820h4 c9820h4M48348k4 = m48348k4(list2, this.f35558kk, this.f35557k4);
        this.f35556h4.m48442kk().m48378k4(this.f35561x1.m48473kk(c9820h4M48348k4.m48412x1(this.f35557k4.m48452k4())));
        this.f35556h4.m48442kk().m48387to(c9820h4M48348k4.m48375fa());
        return c9820h4M48348k4;
    }

    /* JADX INFO: renamed from: x1 */
    private void m48358x1(SortedList<Long, C9827up> sortedList) {
        long[] jArrM48399to = this.f35559m9.m48399to();
        List<C9827up> listMo48401x1 = this.f35561x1.mo48401x1(this.f35557k4.m48452k4());
        for (int i = 0; i < listMo48401x1.size(); i++) {
            sortedList.addItem(Long.valueOf(jArrM48399to[i]), listMo48401x1.get_Item(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C9820h4 m48348k4(List<C9820h4> list, C9824ks c9824ks, C9828x1 c9828x1) {
        C9820h4 c9820h4 = new C9820h4();
        SortedList sortedList = new SortedList();
        for (int i = 0; i < list.size(); i++) {
            C9820h4 c9820h42 = list.get_Item(i);
            List<C9827up> listM48406k4 = c9820h42.m48406k4(c9828x1.m48464x1());
            long[] jArrM48416k4 = c9824ks.m48416k4(c9820h42.m48386to());
            for (int i2 = 0; i2 < listM48406k4.size(); i2++) {
                sortedList.addItem(Long.valueOf(jArrM48416k4[i2]), listM48406k4.get_Item(i2));
            }
        }
        IGenericEnumerator<T> it = sortedList.getValues().iterator();
        while (it.hasNext()) {
            try {
                c9820h4.m48409k4(((C9827up) it.next()).m48445k4());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c9820h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48362x1(AbstractC3150x6 abstractC3150x6) {
        m48346du();
        m48356to();
        m48355kk();
        m48357x1();
        List<AbstractC9818dy> listM48439k4 = this.f35556h4.m48439k4();
        C9820h4 c9820h4M48347k4 = m48347k4(listM48439k4);
        C9820h4 c9820h4M48444x1 = this.f35556h4.m48444x1();
        m48353k4(c9820h4M48444x1);
        C9828x1 c9828x1 = this.f35557k4;
        c9828x1.m48453k4(this.f35561x1.mo48395k4(c9828x1.m48452k4()));
        C9828x1 c9828x12 = this.f35557k4;
        c9828x12.m48458kk(this.f35558kk.mo48395k4(c9828x12.m48452k4()));
        this.f35557k4.m48459kk(this.f35559m9.m48393du() & 4294967295L);
        C9828x1 c9828x13 = this.f35557k4;
        c9828x13.m48463to(this.f35559m9.mo48395k4(c9828x13.m48452k4()));
        this.f35557k4.m48455k4(abstractC3150x6);
        SortedList<Long, C9827up> sortedList = new SortedList<>();
        m48352k4(abstractC3150x6, sortedList);
        m48358x1(sortedList);
        m48351k4(sortedList);
        m48359x1(c9820h4M48347k4, sortedList);
        m48354k4(c9820h4M48444x1, sortedList);
        m48350k4(listM48439k4, sortedList);
        IGenericEnumerator<C9827up> it = sortedList.getValues().iterator();
        while (it.hasNext()) {
            try {
                C9827up next = it.next();
                abstractC3150x6.write(next.m48445k4(), 0, next.m48445k4().length);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48349k4(long j) {
        C9820h4 c9820h4 = new C9820h4(j, this.f35561x1, this.f35560to);
        this.f35555du = new List<>();
        int iM48464x1 = this.f35557k4.m48464x1();
        for (int i = 0; i < c9820h4.m48410k4().length; i += iM48464x1) {
            byte[] bArr = new byte[iM48464x1];
            System.arraycopy(c9820h4.m48410k4(), i, bArr, 0, iM48464x1);
            this.f35555du.addItem(new C9827up(bArr));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m48359x1(C9820h4 c9820h4, SortedList<Long, C9827up> sortedList) {
        List<C9827up> listM48406k4 = c9820h4.m48406k4(this.f35557k4.m48452k4());
        long[] jArrM48416k4 = this.f35561x1.m48416k4(this.f35556h4.m48442kk().m48386to());
        for (int i = 0; i < listM48406k4.size(); i++) {
            sortedList.addItem(Long.valueOf(jArrM48416k4[i]), listM48406k4.get_Item(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48350k4(List<AbstractC9818dy> list, SortedList<Long, C9827up> sortedList) {
        for (int i = 0; i < list.size(); i++) {
            if (C7019kk.m27469x1(list.get_Item(i), C9820h4.class)) {
                C9820h4 c9820h4 = (C9820h4) list.get_Item(i);
                if (c9820h4.m48375fa() >= this.f35557k4.m48449du()) {
                    List<C9827up> listM48406k4 = c9820h4.m48406k4(this.f35557k4.m48452k4());
                    long[] jArrM48416k4 = this.f35561x1.m48416k4(c9820h4.m48386to());
                    for (int i2 = 0; i2 < listM48406k4.size(); i2++) {
                        sortedList.addItem(Long.valueOf(jArrM48416k4[i2]), listM48406k4.get_Item(i2));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48351k4(SortedList<Long, C9827up> sortedList) {
        List<C9827up> listMo48401x1 = this.f35558kk.mo48401x1(this.f35557k4.m48452k4());
        long[] jArrM48416k4 = this.f35561x1.m48416k4(this.f35557k4.m48451h4());
        for (int i = 0; i < jArrM48416k4.length; i++) {
            sortedList.addItem(Long.valueOf(jArrM48416k4[i]), listMo48401x1.get_Item(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48361k4(AbstractC3150x6 abstractC3150x6) {
        C9817du c9817du = new C9817du(abstractC3150x6);
        this.f35560to = c9817du;
        this.f35557k4 = c9817du.mo48369k4();
        this.f35561x1 = this.f35560to.mo48370x1();
        C9825m9 c9825m9 = new C9825m9();
        this.f35556h4 = c9825m9;
        long jM48443x1 = c9825m9.m48443x1(this.f35560to);
        if (this.f35557k4.m48461m9() > 0 && (this.f35557k4.m48451h4() & 4294967295L) != 4294967295L && (this.f35557k4.m48451h4() & 4294967295L) != 4294967294L && (jM48443x1 & 4294967295L) != 4294967294L && this.f35557k4.m48461m9() > 0) {
            C9824ks c9824ks = new C9824ks(this.f35557k4.m48464x1());
            this.f35558kk = c9824ks;
            c9824ks.m48419k4(this.f35557k4.m48451h4(), this.f35561x1, this.f35560to);
            m48349k4(jM48443x1);
        }
        this.f35556h4.m48441k4(this.f35560to);
        List<AbstractC9818dy> listM48439k4 = this.f35556h4.m48439k4();
        for (int i = 0; i < listM48439k4.size(); i++) {
            AbstractC9818dy abstractC9818dy = listM48439k4.get_Item(i);
            if (C7019kk.m27469x1(abstractC9818dy, C9820h4.class)) {
                C9820h4 c9820h4 = (C9820h4) abstractC9818dy;
                if (c9820h4.m48375fa() < this.f35557k4.m48449du()) {
                    c9820h4.m48407k4(c9820h4.m48386to(), this.f35558kk, this.f35555du);
                } else {
                    c9820h4.m48408k4(c9820h4.m48386to(), this.f35561x1, this.f35560to);
                }
            }
        }
        this.f35560to = null;
        this.f35555du = null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m48352k4(AbstractC3150x6 abstractC3150x6, SortedList<Long, C9827up> sortedList) {
        abstractC3150x6.write(this.f35559m9.m48394h4(), 0, this.f35559m9.m48394h4().length);
        List<C9827up> listMo48401x1 = this.f35559m9.mo48401x1(this.f35557k4.m48452k4());
        long[] jArrM48470h4 = this.f35561x1.m48470h4();
        if (listMo48401x1.size() > 0) {
            C9827up c9827up = listMo48401x1.get_Item(0);
            sortedList.addItem(Long.valueOf(jArrM48470h4[0]), listMo48401x1.get_Item(0));
            int iM48452k4 = this.f35557k4.m48452k4();
            for (int i = 1; i < listMo48401x1.size(); i++) {
                sortedList.addItem(Long.valueOf(jArrM48470h4[i]), listMo48401x1.get_Item(i));
                c9827up = listMo48401x1.get_Item(i);
            }
            c9827up.m48445k4()[iM48452k4 - 4] = -2;
            c9827up.m48445k4()[iM48452k4 - 3] = -1;
            c9827up.m48445k4()[iM48452k4 - 2] = -1;
            c9827up.m48445k4()[iM48452k4 - 1] = -1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m48353k4(C9820h4 c9820h4) {
        long jM48473kk = this.f35561x1.m48473kk(c9820h4.m48412x1(this.f35557k4.m48452k4()));
        this.f35557k4.m48454k4(jM48473kk);
        c9820h4.m48378k4(jM48473kk);
    }

    /* JADX INFO: renamed from: k4 */
    private void m48354k4(C9820h4 c9820h4, SortedList<Long, C9827up> sortedList) {
        List<C9827up> listM48406k4 = c9820h4.m48406k4(this.f35557k4.m48452k4());
        long[] jArrM48416k4 = this.f35561x1.m48416k4(c9820h4.m48386to());
        for (int i = 0; i < listM48406k4.size(); i++) {
            sortedList.addItem(Long.valueOf(jArrM48416k4[i]), listM48406k4.get_Item(i));
        }
    }
}
