package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8151l1;
import com.aspose.slides.internal.p332p7.C8655r6;
import com.aspose.slides.internal.p407st.AbstractC10739yw;
import com.aspose.slides.internal.p407st.C10355ai;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10711xc;
import com.aspose.slides.internal.p407st.C10749ze;
import com.aspose.slides.internal.p456v5.C11610to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ls7 extends C0969ey {
    /* JADX INFO: renamed from: k4 */
    public static void m64551k4(mqt mqtVar) {
        C10609qn c10609qn;
        C10711xc c10711xcM72326up = mqtVar.mo64936jd().m1858kk().mo1638uz().m72326up();
        if (c10711xcM72326up != null) {
            C10711xc c10711xcMo50863m9 = mqtVar.m72000ix().mo50863m9();
            IGenericEnumerator<AbstractC10739yw> it = c10711xcM72326up.m51976x1().iterator();
            while (it.hasNext()) {
                try {
                    c10711xcMo50863m9.m51976x1().m50930x1(it.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            C10462h9 c10462h9M72000ix = ((uz3) C7019kk.m27452k4((Object) mqtVar.m74354fa().get_Item(0), uz3.class)).m72000ix();
            c10462h9M72000ix.mo50864to().m52036k4(75);
            if (c10462h9M72000ix.m50880ck() != null) {
                c10462h9M72000ix.m50513yj().removeItem(c10462h9M72000ix.m50880ck());
            }
            List.Enumerator<au9> it2 = mqtVar.m74354fa().iterator();
            while (it2.hasNext()) {
                try {
                    uz3 uz3Var = (uz3) it2.next();
                    C10462h9 c10462h9M72000ix2 = uz3Var.m72000ix();
                    if (c10462h9M72000ix2 != null) {
                        if (c10462h9M72000ix2.mo50864to().m52025c5() == 20) {
                            c10462h9M72000ix2.mo50864to().m52036k4(32);
                        }
                        if (c10462h9M72000ix2.mo50864to().m52025c5() == 0 && (c10609qn = (C10609qn) C7019kk.m27452k4((Object) c10711xcM72326up.m51976x1().m50923k4(1280), C10609qn.class)) != null) {
                            int iM51597ar = (int) c10609qn.m51597ar();
                            if (iM51597ar == 4) {
                                c10462h9M72000ix2.mo50864to().m52036k4(8);
                            } else if (iM51597ar == 6) {
                                c10462h9M72000ix2.mo50864to().m52036k4(23);
                            }
                        }
                        C10711xc c10711xcM72326up2 = uz3Var.mo64936jd().mo1638uz().m72326up();
                        if (c10711xcM72326up2 != null) {
                            C10711xc c10711xcMo50863m92 = uz3Var.m72000ix().mo50863m9();
                            IGenericEnumerator<AbstractC10739yw> it3 = c10711xcM72326up2.m51976x1().iterator();
                            while (it3.hasNext()) {
                                try {
                                    c10711xcMo50863m92.m51976x1().m50930x1(it3.next());
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
                        } else {
                            continue;
                        }
                    }
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    throw th2;
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m64552x1(qah qahVar) {
        int i;
        g9n g9nVar = (g9n) qahVar.m69481du();
        LegacyDiagram legacyDiagramM6459dy = g9nVar.m6459dy();
        tbp tbpVar = new tbp();
        tbp tbpVar2 = new tbp();
        C1258im c1258im = new C1258im();
        tbp[] tbpVarArr = {tbpVar};
        tbp[] tbpVarArr2 = {tbpVar2};
        C1258im[] c1258imArr = {c1258im};
        xbk.m73301k4(g9nVar.m70644kk(), tbpVarArr, tbpVarArr2, c1258imArr);
        tbpVarArr[0].CloneTo(tbpVar);
        tbpVarArr2[0].CloneTo(tbpVar2);
        c1258imArr[0].CloneTo(c1258im);
        legacyDiagramM6459dy.mo2564k4(tbpVar.Clone(), tbpVar2.Clone(), c1258im.Clone());
        legacyDiagramM6459dy.mo272to().m69040k4(qahVar.m69479c5());
        C14281ph.m69049k4(qahVar);
        GroupShape groupShapeM1858kk = legacyDiagramM6459dy.m1858kk();
        groupShapeM1858kk.m2592x1(legacyDiagramM6459dy.m2594xw());
        xbk.m73300k4(groupShapeM1858kk, g9nVar.m70644kk());
        List.Enumerator<qah> it = g9nVar.m70642h4().iterator();
        while (true) {
            try {
                i = 8;
                if (!it.hasNext()) {
                    break;
                }
                qah next = it.next();
                if (next.m69482dy() == 3) {
                    AutoShape autoShapeM2615fa = ((ShapeCollection) groupShapeM1858kk.getShapes()).m2615fa();
                    next.m69481du().m70143k4(autoShapeM2615fa);
                    C1252ii.m7636k4(next);
                    autoShapeM2615fa.mo1638uz().m72315k4(next.m69489kk().mo50859du());
                    autoShapeM2615fa.mo1638uz().m72322k4(next.m69489kk().mo50863m9());
                    if (C7019kk.m27469x1(next.m69489kk(), C10462h9.class)) {
                        autoShapeM2615fa.mo1638uz().m72317k4(((C10462h9) next.m69489kk()).m50880ck());
                    }
                } else if (next.m69482dy() == 8) {
                    Connector connectorM2644rv = ((ShapeCollection) groupShapeM1858kk.getShapes()).m2644rv();
                    next.m69481du().m70143k4(connectorM2644rv);
                    C13644io.m63019k4(next);
                    connectorM2644rv.mo1638uz().m72315k4(next.m69489kk().mo50859du());
                }
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
        C10711xc c10711xcMo50863m9 = qahVar.m69489kk().mo50863m9();
        groupShapeM1858kk.mo272to().m69040k4(qahVar.m69479c5());
        C10355ai c10355ai = (C10355ai) C7019kk.m27452k4((Object) qahVar.m69489kk().mo50859du().m51263x1().m50923k4(896), C10355ai.class);
        if (c10355ai != null && c10355ai.mo50423x1().length > 0) {
            groupShapeM1858kk.setName(k3x.m63620k4(c10355ai.mo50423x1()));
        }
        C10355ai c10355ai2 = (C10355ai) C7019kk.m27452k4((Object) qahVar.m69489kk().mo50859du().m51263x1().m50923k4(896), C10355ai.class);
        if (c10355ai2 != null) {
            groupShapeM1858kk.setAlternativeText(k3x.m63620k4(c10355ai2.mo50423x1()));
        }
        groupShapeM1858kk.mo1638uz().m72322k4(c10711xcMo50863m9);
        groupShapeM1858kk.mo1638uz().m72315k4(qahVar.m69489kk().mo50859du());
        Dictionary dictionary = new Dictionary();
        IGenericEnumerator<IShape> it2 = groupShapeM1858kk.getShapes().iterator();
        while (it2.hasNext()) {
            try {
                Shape shape = (Shape) it2.next();
                byte[] bArrM26683x1 = AbstractC6747ar.m26643rv().m26683x1(C14113y2.m67365dy(shape.getName()));
                if (bArrM26683x1.length > 0) {
                    AbstractC14092to.m67248to(AbstractC14092to.m67208k4((Object) bArrM26683x1));
                    long jM54691k4 = C11610to.m54691k4(bArrM26683x1);
                    if (!dictionary.containsKey(Long.valueOf(jM54691k4))) {
                        dictionary.addItem(Long.valueOf(jM54691k4), Long.valueOf(shape.mo272to().m69039ix()));
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        C8655r6 c8655r6 = new C8655r6();
        c8655r6.m39896k4(2);
        C10749ze c10749ze = (C10749ze) C7019kk.m27452k4((Object) c10711xcMo50863m9.m51976x1().m50923k4(1284), C10749ze.class);
        int i2 = 0;
        while (i2 < (c10749ze.m52134to() & 65535)) {
            byte[] bArrM52133kk = c10749ze.m52133kk(i2);
            long jM13253to = C3110yd.m13253to(bArrM52133kk, 0) & 4294967295L;
            long jM13253to2 = C3110yd.m13253to(bArrM52133kk, 4) & 4294967295L;
            long jM13253to3 = C3110yd.m13253to(bArrM52133kk, i);
            long j = jM13253to3 & 4294967295L;
            if (dictionary.containsKey(Long.valueOf(jM13253to)) && dictionary.containsKey(Long.valueOf(jM13253to2))) {
                C8151l1 c8151l1M39895k4 = c8655r6.m39895k4();
                c8151l1M39895k4.m35817k4(2);
                c8151l1M39895k4.m35818k4(C14113y2.m67408k4("#_s", C14114y9.m67465x1(((Long) dictionary.get_Item(Long.valueOf(jM13253to))).longValue())));
                c8151l1M39895k4.m35821x1(C14113y2.m67408k4("#_s", C14114y9.m67465x1(((Long) dictionary.get_Item(Long.valueOf(jM13253to2))).longValue())));
                if ((jM13253to3 & 4294967295L) > 0) {
                    c8151l1M39895k4.m35819kk(C14113y2.m67408k4("#_s", C14114y9.m67465x1(((Long) dictionary.get_Item(Long.valueOf(j))).longValue())));
                }
            }
            i2++;
            i = 8;
        }
        if (c8655r6.m39897x1() == null || c8655r6.m39897x1().length < 1) {
            qahVar.m69491m9().remove(legacyDiagramM6459dy);
        } else {
            legacyDiagramM6459dy.mo272to().m68094k4(c8655r6);
        }
    }
}
