package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11753hq;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class olk extends uaw {
    public olk(C11791os c11791os, ctu ctuVar, ChartDataWorksheet chartDataWorksheet) {
        super(c11791os, ctuVar);
        ykd.m73921k4(c11791os, chartDataWorksheet.m702to().m671h4().m70104ix(), chartDataWorksheet.m694du().m72410e0());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68657k4(ChartDataWorksheet chartDataWorksheet) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "worksheet".equals(m55443jd().mo65023fa())) {
                com.aspose.slides.internal.p332p7.m5j m5jVar = new com.aspose.slides.internal.p332p7.m5j(m55443jd());
                C11723d3 c11723d3M55338u4 = mo3471m9().m55338u4();
                C13686ji.m63323k4(chartDataWorksheet.m703x1(), m5jVar, mo3471m9());
                if (m5jVar.m36639bz() != null) {
                    for (com.aspose.slides.internal.p332p7.f2h f2hVar : m5jVar.m36639bz().m34472x1()) {
                        new l3s(c11723d3M55338u4.m55303k4(f2hVar.m31549k4()).m55296x1(), mo3471m9()).m64284k4(chartDataWorksheet);
                    }
                }
                voq voqVarM694du = chartDataWorksheet.m694du();
                voqVarM694du.m72427k4(m5jVar.m36647fa());
                voqVarM694du.m72421k4(m5jVar.m36688lr());
                voqVarM694du.m72467x1(m5jVar.m36638bv());
                voqVarM694du.m72449k4(m5jVar.m36648h4());
                voqVarM694du.m72448k4(m5jVar.m36690ne());
                voqVarM694du.m72445k4(m5jVar.m36695ts());
                voqVarM694du.m72431k4(m5jVar.m36700v4());
                voqVarM694du.m72434k4(m5jVar.m36687ks());
                voqVarM694du.m72438k4(m5jVar.m36709yj());
                voqVarM694du.m72435k4(m5jVar.m36649ix());
                voqVarM694du.m72444k4(m5jVar.m36686kk());
                voqVarM694du.m72418k4(m5jVar.m36702wy());
                voqVarM694du.m72424k4(m5jVar.m36636ar());
                voqVarM694du.m72420k4(m5jVar.m36696u4());
                voqVarM694du.m72441k4(m5jVar.m36708yd());
                voqVarM694du.m72433k4(m5jVar.m36635ak());
                voqVarM694du.m72468x1(m5jVar.m36643dq());
                voqVarM694du.m72432k4(m5jVar.m36693rv());
                voqVarM694du.m72447k4(m5jVar.m36641c6());
                voqVarM694du.m72417k4(m5jVar.m36701wl());
                voqVarM694du.m72446k4(m5jVar.m36692qq());
                voqVarM694du.m72437k4(m5jVar.m36706x6());
                voqVarM694du.m72429k4(m5jVar.m36707xk());
                voqVarM694du.m72443k4(m5jVar.m36699uz());
                voqVarM694du.m72419k4(m5jVar.m36650jd());
                voqVarM694du.m72425k4(m5jVar.m36697um());
                voqVarM694du.m72439k4(m5jVar.m36642ck());
                voqVarM694du.m72430k4(m5jVar.m36645dy());
                voqVarM694du.m72426k4(m5jVar.m36644du());
                voqVarM694du.m72428k4(m5jVar.m36703x1());
                voqVarM694du.m72440k4(m5jVar.m36640c5());
                voqVarM694du.m72416k4(m5jVar.m36694to());
                voqVarM694du.m72422k4(m5jVar.m36637b3());
                voqVarM694du.m72436k4(m5jVar.m36698up());
                voqVarM694du.m72442k4(m5jVar.m36646e0());
                voqVarM694du.m72423k4(m5jVar.m36691qm());
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68658x1(ChartDataWorksheet chartDataWorksheet) {
        IGenericEnumerator<T> it;
        int i;
        mo55332up();
        com.aspose.slides.internal.p332p7.m5j m5jVar = new com.aspose.slides.internal.p332p7.m5j();
        voq voqVarM694du = chartDataWorksheet.m694du();
        if (chartDataWorksheet.m703x1().m63041h4() > 0) {
            com.aspose.slides.internal.p332p7.iuf iufVarM36651k4 = m5jVar.m36651k4();
            IGenericEnumerator<kvj> it2 = chartDataWorksheet.m696k4().iterator();
            while (it2.hasNext()) {
                try {
                    kvj next = it2.next();
                    if (m68656k4(next)) {
                        C11791os c11791osM55394k4 = mo3468h4().mo4812qm().m55394k4("/xl/tables/table{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.olk.1
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return System.identityHashCode(olk.this.mo3468h4()) + "Aspose.Slides.XlsxSerialization.XlsxSerializationContext.GetNextTableFileNumber()";
                            }

                            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                            /* JADX INFO: renamed from: k4 */
                            public int mo5039k4() {
                                return olk.this.mo3468h4().m4814x1();
                            }
                        }, new C11753hq());
                        new l3s(c11791osM55394k4, mo3468h4()).m64285k4(next);
                        iufVarM36651k4.m34471k4().m31550k4(mo3467du().m55377up().m55311x1(c11791osM55394k4).m55289du());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
        }
        SortedList sortedList = new SortedList();
        IGenericEnumerator<SortedList<Long, SortedList<String, ChartDataCell>>> it3 = chartDataWorksheet.m703x1().f45335k4.getValues().iterator();
        while (it3.hasNext()) {
            try {
                IGenericEnumerator<SortedList<String, ChartDataCell>> it4 = it3.next().getValues().iterator();
                while (it4.hasNext()) {
                    try {
                        it = it4.next().getValues().iterator();
                        while (it.hasNext()) {
                            try {
                                ChartDataCell next2 = it.next();
                                if (!sortedList.containsKey(Integer.valueOf(next2.getRow() + 1))) {
                                    sortedList.addItem(Integer.valueOf(next2.getRow() + 1), new SortedList());
                                }
                                ((SortedList) sortedList.get_Item(Integer.valueOf(next2.getRow() + 1))).addItem(Integer.valueOf(next2.getColumn()), next2);
                            } finally {
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        it = sortedList.getKeys().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                Integer num = (Integer) C7019kk.m27464to(it.next(), Integer.TYPE);
                int iIntValue = num.intValue();
                com.aspose.slides.internal.p332p7.ipw ipwVarM38925k4 = m5jVar.m36689m9().m38925k4();
                ipwVarM38925k4.m34381k4(((long) iIntValue) & 4294967295L);
                if (((SortedList) sortedList.get_Item(num)).size() > 0 && ((ChartDataCell) ((SortedList) sortedList.get_Item(num)).getValues().get_Item(0)).isHidden()) {
                    ipwVarM38925k4.m34382k4(true);
                }
                IGenericEnumerator<T> it5 = ((SortedList) sortedList.get_Item(num)).getValues().iterator();
                while (it5.hasNext()) {
                    try {
                        C14209nz.m68287k4((ChartDataCell) it5.next(), ipwVarM38925k4.m34380k4(), mo3468h4());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                            it5.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                    it5.dispose();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m5jVar.m36664k4(voqVarM694du.m72414jd());
        m5jVar.m36657k4(voqVarM694du.m72403bv());
        m5jVar.m36704x1(voqVarM694du.m72401ar());
        if (voqVarM694du.m72408du() != null) {
            for (com.aspose.slides.internal.p332p7.rqx rqxVar : voqVarM694du.m72408du()) {
                m5jVar.m36672k4(rqxVar);
            }
        }
        if (voqVarM694du.m72456rv() != null) {
            for (com.aspose.slides.internal.p332p7.igr igrVar : voqVarM694du.m72456rv()) {
                m5jVar.m36662k4(igrVar);
            }
        }
        m5jVar.m36683k4(voqVarM694du.m72470xk());
        m5jVar.m36668k4(voqVarM694du.m72460um());
        m5jVar.m36671k4(voqVarM694du.m72461up());
        m5jVar.m36676k4(voqVarM694du.m72411fa());
        m5jVar.m36673k4(voqVarM694du.m72469x6());
        m5jVar.m36682k4(voqVarM694du.m72466x1());
        m5jVar.m36654k4(voqVarM694du.m72471yd());
        m5jVar.m36660k4(voqVarM694du.m72464wl());
        m5jVar.m36656k4(voqVarM694du.m72454ne());
        m5jVar.m36679k4(voqVarM694du.m72463v4());
        m5jVar.m36670k4(voqVarM694du.m72402b3());
        m5jVar.m36705x1(voqVarM694du.m72465wy());
        m5jVar.m36669k4(voqVarM694du.m72472yj());
        m5jVar.m36685k4(voqVarM694du.m72407dq());
        m5jVar.m36653k4(voqVarM694du.m72459u4());
        m5jVar.m36684k4(voqVarM694du.m72462uz());
        m5jVar.m36675k4(voqVarM694du.m72451ks());
        m5jVar.m36666k4(voqVarM694du.m72400ak());
        m5jVar.m36681k4(voqVarM694du.m72413ix());
        m5jVar.m36655k4(voqVarM694du.m72409dy());
        m5jVar.m36661k4(voqVarM694du.m72455qq());
        m5jVar.m36677k4(voqVarM694du.m72404c5());
        m5jVar.m36667k4(voqVarM694du.m72412h4());
        m5jVar.m36663k4(voqVarM694du.m72457to());
        m5jVar.m36665k4(voqVarM694du.m72415k4());
        m5jVar.m36678k4(voqVarM694du.m72453m9());
        m5jVar.m36652k4(voqVarM694du.m72450kk());
        m5jVar.m36658k4(voqVarM694du.m72452lr());
        m5jVar.m36674k4(voqVarM694du.m72406ck());
        m5jVar.m36680k4(voqVarM694du.m72405c6());
        m5jVar.m36659k4(voqVarM694du.m72458ts());
        m5jVar.mo6846k4(null, m55442ck(), "worksheet");
        mo55333yj();
    }

    public olk(C11791os c11791os, hxc hxcVar) {
        super(c11791os, hxcVar);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m68656k4(kvj kvjVar) {
        for (int iM64209x1 = kvjVar.m64209x1(); iM64209x1 <= kvjVar.m64204kk(); iM64209x1++) {
            if (iM64209x1 != kvjVar.m64209x1() && kvjVar.m64202k4().m703x1().m63051x1(kvjVar.m64207to(), iM64209x1).m566k4() != 3) {
                return false;
            }
        }
        return true;
    }
}
