package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7644f8;
import com.aspose.slides.internal.p332p7.C7909i6;
import com.aspose.slides.internal.p332p7.C8210lt;
import com.aspose.slides.internal.p332p7.C8961uk;
import com.aspose.slides.internal.p332p7.C9063vs;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class rko {
    /* JADX INFO: renamed from: k4 */
    public static void m70154k4(Ink ink, oxb oxbVar, C7909i6 c7909i6) {
        if (c7909i6 == null) {
            return;
        }
        oxbVar.m68892k4(c7909i6.m33877k4());
        oxbVar.m68898x1(c7909i6.m33888x1());
        oxbVar.m68894kk(c7909i6.m33884kk());
        if (c7909i6.m33886m9() != null && c7909i6.m33886m9().length > 0) {
            for (C7909i6 c7909i62 : c7909i6.m33886m9()) {
                oxb oxbVar2 = new oxb();
                m70154k4(ink, oxbVar2, c7909i62);
                oxbVar.m68897x1().addItem(oxbVar2);
            }
        }
        if (c7909i6.m33875dy() != null && c7909i6.m33875dy().length > 0) {
            for (C8961uk c8961uk : c7909i6.m33875dy()) {
                InkTrace inkTrace = new InkTrace(ink);
                ib6.m7613k4(ink, inkTrace, c8961uk);
                oxbVar.m68891k4().addItem(inkTrace);
            }
        }
        if (c7909i6.m33876h4() != null && c7909i6.m33876h4().length > 0) {
            for (C7644f8 c7644f8 : c7909i6.m33876h4()) {
                ee1 ee1Var = new ee1();
                dj0.m5110k4(ink, ee1Var, c7644f8);
                oxbVar.m68890h4().addItem(ee1Var);
            }
        }
        if (c7909i6.m33874du() != null && c7909i6.m33874du().length > 0) {
            for (C9063vs c9063vs : c7909i6.m33874du()) {
                los losVar = new los();
                jsv.m63543k4(ink, losVar, c9063vs);
                oxbVar.m68895m9().addItem(losVar);
            }
        }
        if (c7909i6.m33887to() == null || c7909i6.m33887to().length <= 0) {
            return;
        }
        for (C8210lt c8210lt : c7909i6.m33887to()) {
            d7i d7iVar = new d7i();
            c7d.m4500k4(ink, d7iVar, c8210lt);
            oxbVar.m68889dy().addItem(d7iVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70155k4(oxb oxbVar, C7909i6 c7909i6) {
        List.Enumerator<los> it;
        List.Enumerator<d7i> it2;
        c7909i6.m33883k4(oxbVar.m68893kk());
        c7909i6.m33889x1(oxbVar.m68896to());
        c7909i6.m33885kk(oxbVar.m68888du());
        if (oxbVar.m68895m9() != null && oxbVar.m68895m9().size() > 0) {
            it = oxbVar.m68895m9().iterator();
            while (it.hasNext()) {
                try {
                    los next = it.next();
                    C9063vs c9063vs = new C9063vs();
                    jsv.m63544k4(next, c9063vs);
                    c7909i6.m33882k4(c9063vs);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (oxbVar.m68889dy() != null && oxbVar.m68889dy().size() > 0) {
            it2 = oxbVar.m68889dy().iterator();
            while (it2.hasNext()) {
                try {
                    d7i next2 = it2.next();
                    C8210lt c8210lt = new C8210lt();
                    c7d.m4501k4(next2, c8210lt);
                    c7909i6.m33880k4(c8210lt);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        if (oxbVar.m68891k4() != null && oxbVar.m68891k4().size() > 0) {
            it2 = oxbVar.m68891k4().iterator();
            while (it2.hasNext()) {
                try {
                    InkTrace next3 = it2.next();
                    C8961uk c8961uk = new C8961uk();
                    ib6.m7614k4(next3, c8961uk);
                    c7909i6.m33881k4(c8961uk);
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
        if (oxbVar.m68897x1() != null && oxbVar.m68897x1().size() > 0) {
            List.Enumerator<oxb> it3 = oxbVar.m68897x1().iterator();
            while (it3.hasNext()) {
                try {
                    oxb next4 = it3.next();
                    C7909i6 c7909i62 = new C7909i6();
                    m70155k4(next4, c7909i62);
                    c7909i6.m33879k4(c7909i62);
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
        if (oxbVar.m68890h4() == null || oxbVar.m68890h4().size() <= 0) {
            return;
        }
        it = oxbVar.m68890h4().iterator();
        while (it.hasNext()) {
            try {
                ee1 next5 = it.next();
                C7644f8 c7644f8 = new C7644f8();
                dj0.m5111k4(next5, c7644f8);
                c7909i6.m33878k4(c7644f8);
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
