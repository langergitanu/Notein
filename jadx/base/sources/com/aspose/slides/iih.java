package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7214a5;
import com.aspose.slides.internal.p332p7.C7218a7;
import com.aspose.slides.internal.p332p7.C7251ai;
import com.aspose.slides.internal.p332p7.C7355bw;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7508ds;
import com.aspose.slides.internal.p332p7.C7644f8;
import com.aspose.slides.internal.p332p7.C7909i6;
import com.aspose.slides.internal.p332p7.C8153l2;
import com.aspose.slides.internal.p332p7.C8512pc;
import com.aspose.slides.internal.p332p7.C8743s6;
import com.aspose.slides.internal.p332p7.C8925u7;
import com.aspose.slides.internal.p332p7.C8961uk;
import com.aspose.slides.internal.p332p7.C9340z3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class iih {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5714k4 = new C7017h4("brush", "canvas", "canvasTransform", "context", "inkSource", "mapping", "timestamp", "trace", "traceFormat", "traceGroup", "traceView");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.aspose.slides.cow] */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.aspose.slides.oxb] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.aspose.slides.ee1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.aspose.slides.InkBrush] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.aspose.slides.vwy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.aspose.slides.n4m] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.aspose.slides.bfl] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.aspose.slides.y1b] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.aspose.slides.zh8] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.aspose.slides.pm8] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.aspose.slides.InkTrace] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7638k4(Ink ink, vkh vkhVar, C7214a5 c7214a5) {
        ?? inkBrush;
        com.aspose.slides.Collections.Generic.IGenericCollection iGenericCollectionM72341k4;
        if (c7214a5 == null) {
            return;
        }
        List.Enumerator<C7394ca> it = c7214a5.m27943k4().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f5714k4.m27428k4(next.m29539k4())) {
                    case 0:
                        inkBrush = new InkBrush();
                        b3x.m3990k4(ink, inkBrush, (C7218a7) C7019kk.m27452k4(next.m29541kk(), C7218a7.class));
                        iGenericCollectionM72341k4 = vkhVar.m72341k4();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 1:
                        inkBrush = new vwy();
                        ofu.m68514k4(ink, inkBrush, (C7508ds) C7019kk.m27452k4(next.m29541kk(), C7508ds.class));
                        iGenericCollectionM72341k4 = vkhVar.m72345x1();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 2:
                        inkBrush = new n4m();
                        qe8.m69553k4(ink, inkBrush, (C8153l2) C7019kk.m27452k4(next.m29541kk(), C8153l2.class));
                        iGenericCollectionM72341k4 = vkhVar.m72342kk();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 3:
                        inkBrush = new bfl();
                        f9m.m6055k4(ink, inkBrush, (C8512pc) C7019kk.m27452k4(next.m29541kk(), C8512pc.class));
                        iGenericCollectionM72341k4 = vkhVar.m72344to();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 4:
                        inkBrush = new y1b();
                        x6h.m73148k4(ink, inkBrush, (C7355bw) C7019kk.m27452k4(next.m29541kk(), C7355bw.class));
                        iGenericCollectionM72341k4 = vkhVar.m72337du();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 5:
                        inkBrush = new zh8();
                        pxh.m69326k4(ink, inkBrush, (C8743s6) C7019kk.m27452k4(next.m29541kk(), C8743s6.class));
                        iGenericCollectionM72341k4 = vkhVar.m72339h4();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 6:
                        inkBrush = new pm8();
                        eu1.m5724k4(ink, inkBrush, (C8925u7) C7019kk.m27452k4(next.m29541kk(), C8925u7.class));
                        iGenericCollectionM72341k4 = vkhVar.m72343m9();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 7:
                        inkBrush = new InkTrace(ink);
                        ib6.m7613k4(ink, inkBrush, (C8961uk) C7019kk.m27452k4(next.m29541kk(), C8961uk.class));
                        iGenericCollectionM72341k4 = vkhVar.m72338dy();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 8:
                        inkBrush = new cow();
                        emp.m5601k4(ink, inkBrush, (C9340z3) C7019kk.m27452k4(next.m29541kk(), C9340z3.class));
                        iGenericCollectionM72341k4 = vkhVar.m72335c5();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 9:
                        inkBrush = new oxb();
                        rko.m70154k4(ink, inkBrush, (C7909i6) C7019kk.m27452k4(next.m29541kk(), C7909i6.class));
                        iGenericCollectionM72341k4 = vkhVar.m72340jd();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    case 10:
                        inkBrush = new ee1();
                        dj0.m5110k4(ink, inkBrush, (C7644f8) C7019kk.m27452k4(next.m29541kk(), C7644f8.class));
                        iGenericCollectionM72341k4 = vkhVar.m72336ck();
                        continue;
                        iGenericCollectionM72341k4.addItem(inkBrush);
                        break;
                    default:
                        throw new NotImplementedException();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                }
                throw th;
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            throw th;
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7639k4(C7251ai c7251ai, vkh vkhVar, C7214a5 c7214a5) {
        List.Enumerator<n4m> it;
        List.Enumerator<vwy> it2;
        if (vkhVar.m72345x1().size() > 0) {
            it2 = vkhVar.m72345x1().iterator();
            while (it2.hasNext()) {
                try {
                    vwy next = it2.next();
                    C7508ds c7508ds = new C7508ds();
                    ofu.m68515k4(next, c7508ds);
                    c7214a5.m27944k4(new C7394ca("canvas", c7508ds));
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        if (vkhVar.m72342kk().size() > 0) {
            it = vkhVar.m72342kk().iterator();
            while (it.hasNext()) {
                try {
                    n4m next2 = it.next();
                    C8153l2 c8153l2 = new C8153l2();
                    qe8.m69554k4(next2, c8153l2);
                    c7214a5.m27944k4(new C7394ca("canvasTransform", c8153l2));
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (vkhVar.m72344to().size() > 0) {
            List.Enumerator<bfl> it3 = vkhVar.m72344to().iterator();
            while (it3.hasNext()) {
                try {
                    bfl next3 = it3.next();
                    C8512pc c8512pc = new C8512pc();
                    f9m.m6056k4(next3, c8512pc);
                    c7214a5.m27944k4(new C7394ca("context", c8512pc));
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
        if (vkhVar.m72341k4().size() > 0) {
            List.Enumerator<InkBrush> it4 = vkhVar.m72341k4().iterator();
            while (it4.hasNext()) {
                try {
                    InkBrush next4 = it4.next();
                    C7218a7 c7218a7 = new C7218a7();
                    b3x.m3991k4(next4, c7218a7);
                    c7214a5.m27944k4(new C7394ca("brush", c7218a7));
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
        if (vkhVar.m72337du().size() > 0) {
            it2 = vkhVar.m72337du().iterator();
            while (it2.hasNext()) {
                try {
                    y1b next5 = it2.next();
                    C7355bw c7355bw = new C7355bw();
                    x6h.m73149k4(next5, c7355bw);
                    c7214a5.m27944k4(new C7394ca("inkSource", c7355bw));
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
        if (vkhVar.m72339h4().size() > 0) {
            List.Enumerator<zh8> it5 = vkhVar.m72339h4().iterator();
            while (it5.hasNext()) {
                try {
                    zh8 next6 = it5.next();
                    C8743s6 c8743s6 = new C8743s6();
                    pxh.m69327k4(next6, c8743s6);
                    c7214a5.m27944k4(new C7394ca("mapping", c8743s6));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                        it5.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                it5.dispose();
            }
        }
        if (vkhVar.m72343m9().size() > 0) {
            List.Enumerator<pm8> it6 = vkhVar.m72343m9().iterator();
            while (it6.hasNext()) {
                try {
                    pm8 next7 = it6.next();
                    C8925u7 c8925u7 = new C8925u7();
                    eu1.m5725k4(next7, c8925u7);
                    c7214a5.m27944k4(new C7394ca("timestamp", c8925u7));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                        it6.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                it6.dispose();
            }
        }
        if (vkhVar.m72338dy().size() > 0) {
            List.Enumerator<InkTrace> it7 = vkhVar.m72338dy().iterator();
            while (it7.hasNext()) {
                try {
                    InkTrace next8 = it7.next();
                    C8961uk c8961uk = new C8961uk();
                    ib6.m7614k4(next8, c8961uk);
                    c7214a5.m27944k4(new C7394ca("trace", c8961uk));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it7, (Class<IDisposable>) IDisposable.class)) {
                        it7.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it7, (Class<IDisposable>) IDisposable.class)) {
                it7.dispose();
            }
        }
        if (vkhVar.m72340jd().size() > 0) {
            List.Enumerator<oxb> it8 = vkhVar.m72340jd().iterator();
            while (it8.hasNext()) {
                try {
                    oxb next9 = it8.next();
                    C7909i6 c7909i6 = new C7909i6();
                    rko.m70155k4(next9, c7909i6);
                    c7214a5.m27944k4(new C7394ca("traceGroup", c7909i6));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it8, (Class<IDisposable>) IDisposable.class)) {
                        it8.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it8, (Class<IDisposable>) IDisposable.class)) {
                it8.dispose();
            }
        }
        if (vkhVar.m72335c5().size() > 0) {
            it = vkhVar.m72335c5().iterator();
            while (it.hasNext()) {
                try {
                    cow next10 = it.next();
                    C9340z3 c9340z3 = new C9340z3();
                    emp.m5602k4(next10, c9340z3);
                    c7214a5.m27944k4(new C7394ca("traceFormat", c9340z3));
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
        if (vkhVar.m72336ck().size() > 0) {
            List.Enumerator<ee1> it9 = vkhVar.m72336ck().iterator();
            while (it9.hasNext()) {
                try {
                    ee1 next11 = it9.next();
                    C7644f8 c7644f8 = new C7644f8();
                    dj0.m5111k4(next11, c7644f8);
                    c7214a5.m27944k4(new C7394ca("traceView", c7644f8));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it9, (Class<IDisposable>) IDisposable.class)) {
                        it9.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it9, (Class<IDisposable>) IDisposable.class)) {
                it9.dispose();
            }
        }
    }
}
