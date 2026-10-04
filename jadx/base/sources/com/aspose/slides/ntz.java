package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7214a5;
import com.aspose.slides.internal.p332p7.C7251ai;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7644f8;
import com.aspose.slides.internal.p332p7.C7909i6;
import com.aspose.slides.internal.p332p7.C8210lt;
import com.aspose.slides.internal.p332p7.C8512pc;
import com.aspose.slides.internal.p332p7.C8961uk;
import com.aspose.slides.internal.p332p7.C9063vs;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ntz {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f47614k4 = new C7017h4("definitions", "context", "trace", "traceGroup", "traceView", "annotation", "annotationXML");

    /* JADX INFO: renamed from: k4 */
    public static void m68210k4(Ink ink, C7251ai c7251ai) {
        com.aspose.slides.Collections.Generic.IGenericCollection iGenericCollectionM1770ck;
        Object obj;
        if (c7251ai == null) {
            return;
        }
        List.Enumerator<C7394ca> it = c7251ai.m28261k4().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f47614k4.m27428k4(next.m29539k4())) {
                    case 0:
                        vkh vkhVar = new vkh();
                        iih.m7638k4(ink, vkhVar, (C7214a5) C7019kk.m27452k4(next.m29541kk(), C7214a5.class));
                        iGenericCollectionM1770ck = ink.m1770ck();
                        obj = vkhVar;
                        iGenericCollectionM1770ck.addItem(obj);
                        break;
                    case 1:
                        throw new NotImplementedException("context");
                    case 2:
                        InkTrace inkTrace = new InkTrace(ink);
                        ib6.m7613k4(ink, inkTrace, (C8961uk) C7019kk.m27452k4(next.m29541kk(), C8961uk.class));
                        iGenericCollectionM1770ck = ink.m1771k4();
                        obj = inkTrace;
                        iGenericCollectionM1770ck.addItem(obj);
                        break;
                    case 3:
                        oxb oxbVar = new oxb();
                        rko.m70154k4(ink, oxbVar, (C7909i6) C7019kk.m27452k4(next.m29541kk(), C7909i6.class));
                        iGenericCollectionM1770ck = ink.m1773kk();
                        obj = oxbVar;
                        iGenericCollectionM1770ck.addItem(obj);
                        break;
                    case 4:
                        ee1 ee1Var = new ee1();
                        dj0.m5110k4(ink, ee1Var, (C7644f8) C7019kk.m27452k4(next.m29541kk(), C7644f8.class));
                        iGenericCollectionM1770ck = ink.m1778yj();
                        obj = ee1Var;
                        iGenericCollectionM1770ck.addItem(obj);
                        break;
                    case 5:
                        los losVar = new los();
                        jsv.m63543k4(ink, losVar, (C9063vs) C7019kk.m27452k4(next.m29541kk(), C9063vs.class));
                        if (!C14113y2.m67411k4(losVar.m64493k4())) {
                            iGenericCollectionM1770ck = ink.m1774rv();
                            obj = losVar;
                            iGenericCollectionM1770ck.addItem(obj);
                        }
                        break;
                    case 6:
                        d7i d7iVar = new d7i();
                        c7d.m4500k4(ink, d7iVar, (C8210lt) C7019kk.m27452k4(next.m29541kk(), C8210lt.class));
                        iGenericCollectionM1770ck = ink.m1777wl();
                        obj = d7iVar;
                        iGenericCollectionM1770ck.addItem(obj);
                        break;
                    default:
                        throw new NotImplementedException();
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
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68211k4(Ink ink, C7251ai c7251ai, u8s u8sVar) {
        List.Enumerator<vkh> it;
        List.Enumerator<los> it2;
        if (ink.m1774rv().size() > 0) {
            it2 = ink.m1774rv().iterator();
            while (it2.hasNext()) {
                try {
                    los next = it2.next();
                    C9063vs c9063vs = new C9063vs();
                    jsv.m63544k4(next, c9063vs);
                    c7251ai.m28262k4(new C7394ca("annotation", c9063vs));
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        if (ink.m1770ck().size() > 0) {
            it = ink.m1770ck().iterator();
            while (it.hasNext()) {
                try {
                    vkh next2 = it.next();
                    C7214a5 c7214a5 = new C7214a5();
                    iih.m7639k4(c7251ai, next2, c7214a5);
                    c7251ai.m28262k4(new C7394ca("definitions", c7214a5));
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (ink.m1776up() != null) {
            C8512pc c8512pc = new C8512pc();
            f9m.m6056k4(ink.m1776up(), c8512pc);
            c7251ai.m28262k4(new C7394ca("context", c8512pc));
        }
        if (ink.m1771k4().size() > 0) {
            it2 = ink.m1771k4().iterator();
            while (it2.hasNext()) {
                try {
                    InkTrace next3 = it2.next();
                    C8961uk c8961uk = new C8961uk();
                    ib6.m7614k4(next3, c8961uk);
                    c7251ai.m28262k4(new C7394ca("trace", c8961uk));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        if (ink.m1773kk().size() > 0) {
            List.Enumerator<oxb> it3 = ink.m1773kk().iterator();
            while (it3.hasNext()) {
                try {
                    oxb next4 = it3.next();
                    C7909i6 c7909i6 = new C7909i6();
                    rko.m70155k4(next4, c7909i6);
                    c7251ai.m28262k4(new C7394ca("traceGroup", c7909i6));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                it3.dispose();
            }
        }
        if (ink.m1778yj().size() > 0) {
            List.Enumerator<ee1> it4 = ink.m1778yj().iterator();
            while (it4.hasNext()) {
                try {
                    ee1 next5 = it4.next();
                    C7644f8 c7644f8 = new C7644f8();
                    dj0.m5111k4(next5, c7644f8);
                    c7251ai.m28262k4(new C7394ca("traceView", c7644f8));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                        it4.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                it4.dispose();
            }
        }
        if (ink.m1777wl().size() > 0) {
            it = ink.m1777wl().iterator();
            while (it.hasNext()) {
                try {
                    d7i next6 = it.next();
                    C8210lt c8210lt = new C8210lt();
                    c7d.m4501k4(next6, c8210lt);
                    c7251ai.m28262k4(new C7394ca("annotationXML", c8210lt));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }
}
