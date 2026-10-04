package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10386c9;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10543mi;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10715xl;
import com.aspose.slides.internal.p407st.C10724y1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.zv */
/* JADX INFO: loaded from: classes3.dex */
class C14916zv extends k3x {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m74841k4(m4c m4cVar) {
        List list = new List();
        IGenericEnumerator<qah> it = m4cVar.m64736uz().iterator();
        while (it.hasNext()) {
            try {
                qah next = it.next();
                next.m69493to().m64712du().m3186k4(m4cVar.m64712du().m3196v4());
                if (next.m69492rv()) {
                    jax.m63269k4(next);
                    sil silVar = (sil) C7019kk.m27452k4((Object) next.m69481du(), sil.class);
                    if (silVar != null && silVar.m70153yj() != null && next.m69482dy() == 1) {
                        list.insertItem(0, next);
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List.Enumerator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                qah qahVar = (qah) it2.next();
                m4cVar.m64712du().m71955yj().throwIfInterruptionRequested();
                GroupShape groupShape = (GroupShape) C7019kk.m27452k4((Object) qahVar.m69481du().m70148u4(), GroupShape.class);
                if (groupShape != null) {
                    xbk.m73300k4(groupShape, qahVar.m69489kk());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74842k4(qah qahVar) {
        GroupShape groupShapeM70646to = ((sil) qahVar.m69481du()).m70646to();
        k3x.m63633to(qahVar);
        hi8.m7176k4(qahVar);
        if (groupShapeM70646to.getPlaceholder() != null) {
            if ((groupShapeM70646to.getPlaceholder().getType() == 8 && ((int) groupShapeM70646to.getPlaceholder().getIndex()) == -1) || groupShapeM70646to.getPlaceholder().getType() == 4 || groupShapeM70646to.getPlaceholder().getType() == 5 || groupShapeM70646to.getPlaceholder().getType() == 6) {
                groupShapeM70646to.removePlaceholder();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0207 A[PHI: r2 r5 r6 r10 r12
      0x0207: PHI (r2v12 double) = (r2v8 double), (r2v16 double) binds: [B:66:0x0244, B:57:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r5v10 com.aspose.slides.internal.st.y1) = (r5v7 com.aspose.slides.internal.st.y1), (r5v12 com.aspose.slides.internal.st.y1) binds: [B:66:0x0244, B:57:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r6v10 double) = (r6v7 double), (r6v13 double) binds: [B:66:0x0244, B:57:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r10v4 double) = (r10v2 double), (r10v6 double) binds: [B:66:0x0244, B:57:0x0204] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r12v3 double) = (r12v1 double), (r12v4 double) binds: [B:66:0x0244, B:57:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m74843k4(z9q z9qVar) {
        double x;
        double y;
        double width;
        double height;
        C10724y1 c10724y1Mo50864to;
        AbstractC10571o4 abstractC10571o4;
        double d;
        double d2;
        double d3;
        double d4;
        GroupShape groupShape = (GroupShape) C7019kk.m27452k4((Object) z9qVar.m72003ne(), GroupShape.class);
        if (groupShape == null) {
            groupShape = (GroupShape) z9qVar.mo64936jd();
        }
        C10462h9 c10462h9M72000ix = z9qVar.m72000ix();
        C10543mi c10543miMo50865x1 = c10462h9M72000ix.mo50865x1();
        tbp tbpVarClone = groupShape.m1649kk().Clone();
        tbp tbpVarClone2 = groupShape.m1652to().Clone();
        c10543miMo50865x1.m51288k4(OooO00o.OooO00o(tbpVarClone.f49090k4, 12700.0d, 14));
        c10543miMo50865x1.m51295x1(OooO00o.OooO00o(tbpVarClone.f49091x1, 12700.0d, 14));
        c10543miMo50865x1.m51291kk(OooO00o.OooO00o(tbpVarClone2.f49090k4, 12700.0d, 14));
        c10543miMo50865x1.m51293to(OooO00o.OooO00o(tbpVarClone2.f49091x1, 12700.0d, 14));
        C10534m3 c10534m3Mo50859du = c10462h9M72000ix.mo50859du();
        float fM67988kk = groupShape.mo1214P_().m67988kk();
        if (C14116yg.m67480k4(fM67988kk) > 1.0E-6d) {
            c10534m3Mo50859du.m51263x1().m50930x1(new C10609qn(4, false, ((((((C7019kk.m27435du(Float.valueOf(180.0f + fM67988kk), 13) & 4294967295L) % 360) & 4294967295L) - 180) & 4294967295L) << 16) & 4294967295L));
        }
        k3x.m63634to(z9qVar);
        k3x.m63616du(z9qVar);
        C14281ph.m69050k4(z9qVar);
        C10724y1 c10724y1Mo50864to2 = c10462h9M72000ix.mo50864to();
        c10724y1Mo50864to2.m52035jd(true);
        c10724y1Mo50864to2.m52046x1(!z9qVar.m74358up() && groupShape.isGrouped());
        tbp tbpVarClone3 = groupShape.m2575sv().Clone();
        if (c10724y1Mo50864to2.m52040kk()) {
            if ((fM67988kk < 45.0f || fM67988kk >= 135.0f) && (fM67988kk < 225.0f || fM67988kk >= 315.0f)) {
                d = groupShape.mo1214P_().m67982k4().f49090k4 * 12700.0d;
                d2 = groupShape.mo1214P_().m67982k4().f49091x1 * 12700.0d;
                double d5 = tbpVarClone3.f49090k4 * 12700.0d;
                d3 = tbpVarClone3.f49091x1 * 12700.0d;
                c10462h9M72000ix.mo50864to().m52041m9(groupShape.mo1214P_().m67989to() == 1);
                c10462h9M72000ix.mo50864to().m52030dy(groupShape.mo1214P_().m67980du() == 1);
                d4 = d5;
            } else {
                d = (groupShape.mo1214P_().m67982k4().f49090k4 - ((tbpVarClone3.f49091x1 - tbpVarClone3.f49090k4) / 2.0d)) * 12700.0d;
                double d6 = groupShape.mo1214P_().m67982k4().f49091x1;
                double d7 = tbpVarClone3.f49090k4;
                double d8 = tbpVarClone3.f49091x1;
                d2 = (d6 - ((d7 - d8) / 2.0d)) * 12700.0d;
                d4 = d8 * 12700.0d;
                d3 = d7 * 12700.0d;
                c10462h9M72000ix.mo50864to().m52041m9(groupShape.mo1214P_().m67980du() == 1);
                c10462h9M72000ix.mo50864to().m52030dy(groupShape.mo1214P_().m67989to() == 1);
            }
            C10715xl c10715xl = new C10715xl();
            c10715xl.m51980k4(new C12014ne(OooO.OooO00o(d, 14), OooO.OooO00o(d2, 14), OooO.OooO00o(d4, 14), OooO.OooO00o(d3, 14)));
            abstractC10571o4 = c10715xl;
        } else if ((fM67988kk < 45.0f || fM67988kk >= 135.0f) && (fM67988kk < 225.0f || fM67988kk >= 315.0f)) {
            x = groupShape.getX() * 8.0f;
            y = groupShape.getY() * 8.0f;
            width = groupShape.getWidth() * 8.0f;
            height = groupShape.getHeight() * 8.0f;
            c10462h9M72000ix.mo50864to().m52041m9(groupShape.mo1214P_().m67989to() == 1);
            c10724y1Mo50864to = c10462h9M72000ix.mo50864to();
            if (groupShape.mo1214P_().m67980du() != 1) {
                z = false;
            }
            c10724y1Mo50864to.m52030dy(z);
            C10386c9 c10386c9 = new C10386c9();
            c10386c9.m50546k4(new C12014ne(OooO.OooO00o(x, 14), OooO.OooO00o(y, 14), OooO.OooO00o(width, 14), OooO.OooO00o(height, 14)));
            abstractC10571o4 = c10386c9;
        } else {
            x = (groupShape.getX() - ((groupShape.getHeight() - groupShape.getWidth()) / 2.0f)) * 8.0f;
            y = (groupShape.getY() - ((groupShape.getWidth() - groupShape.getHeight()) / 2.0f)) * 8.0f;
            width = groupShape.getHeight() * 8.0f;
            height = groupShape.getWidth() * 8.0f;
            c10462h9M72000ix.mo50864to().m52041m9(groupShape.mo1214P_().m67980du() == 1);
            c10724y1Mo50864to = c10462h9M72000ix.mo50864to();
            if (groupShape.mo1214P_().m67989to() != 1) {
            }
            c10724y1Mo50864to.m52030dy(z);
            C10386c9 c10386c92 = new C10386c9();
            c10386c92.m50546k4(new C12014ne(OooO.OooO00o(x, 14), OooO.OooO00o(y, 14), OooO.OooO00o(width, 14), OooO.OooO00o(height, 14)));
            abstractC10571o4 = c10386c92;
        }
        c10462h9M72000ix.m50507k4(abstractC10571o4);
        blo.m4257k4(z9qVar);
    }
}
