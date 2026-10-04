package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11743fj;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class pjq extends uaw {
    public pjq(C11791os c11791os, ctu ctuVar) {
        super(c11791os, ctuVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69118k4(ChartDataWorkbook chartDataWorkbook) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "workbook".equals(m55443jd().mo65023fa())) {
                com.aspose.slides.internal.p332p7.smo smoVar = new com.aspose.slides.internal.p332p7.smo(m55443jd());
                if (smoVar.m41152c5() != null) {
                    for (com.aspose.slides.internal.p332p7.k3d k3dVar : smoVar.m41152c5().m39631k4()) {
                        chartDataWorkbook.m681k4(k3dVar.m35112k4(), k3dVar.m35113x1());
                    }
                }
                C11723d3 c11723d3M55338u4 = mo3471m9().m55338u4();
                for (com.aspose.slides.internal.p332p7.pbm pbmVar : smoVar.m41157h4().m45585x1()) {
                    C11791os c11791osM55296x1 = c11723d3M55338u4.m55303k4(pbmVar.m38797kk()).m55296x1();
                    c11791osM55296x1.m55421k4(mo3471m9().m7325kk().m62579k4(c11791osM55296x1.m55416dy()));
                    olk olkVar = new olk(c11791osM55296x1, mo3471m9());
                    try {
                        ChartDataWorksheet chartDataWorksheetM704k4 = ((ChartDataWorksheetCollection) chartDataWorkbook.getWorksheets()).m704k4();
                        chartDataWorksheetM704k4.m698k4(pbmVar.m38798x1());
                        chartDataWorksheetM704k4.m700k4(pbmVar.m38794k4());
                        olkVar.m68657k4(chartDataWorksheetM704k4);
                        mo3471m9().m7323k4().addItem(c11791osM55296x1.m55427x1(), chartDataWorksheetM704k4);
                        olkVar.dispose();
                    } catch (Throwable th) {
                        olkVar.dispose();
                        throw th;
                    }
                }
                rhq rhqVarM671h4 = chartDataWorkbook.m671h4();
                rhqVarM671h4.m70122k4(smoVar.m41154du());
                rhqVarM671h4.m70109k4(smoVar.m41159jd());
                rhqVarM671h4.m70114k4(smoVar.m41156fa());
                rhqVarM671h4.m70115k4(smoVar.m41152c5());
                rhqVarM671h4.m70118k4(smoVar.m41155dy());
                rhqVarM671h4.m70124k4(smoVar.m41187x6());
                rhqVarM671h4.m70116k4(smoVar.m41186x1());
                rhqVarM671h4.m70117k4(smoVar.m41160k4());
                rhqVarM671h4.m70121k4(smoVar.m41181m9());
                rhqVarM671h4.m70108k4(smoVar.m41153ck());
                rhqVarM671h4.m70123k4(smoVar.m41185up());
                rhqVarM671h4.m70119k4(smoVar.m41188yj());
                rhqVarM671h4.m70113k4(smoVar.m41180ks());
                rhqVarM671h4.m70120k4(smoVar.m41182ne());
                rhqVarM671h4.m70110k4(smoVar.m41183rv());
                rhqVarM671h4.m70107k4(smoVar.m41179kk());
                rhqVarM671h4.m70112k4(smoVar.m41184to());
                rhqVarM671h4.m70111k4(smoVar.m41158ix());
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69119x1(ChartDataWorkbook chartDataWorkbook) {
        mo55332up();
        com.aspose.slides.internal.p332p7.smo smoVar = new com.aspose.slides.internal.p332p7.smo();
        IGenericEnumerator<IChartDataWorksheet> it = chartDataWorkbook.getWorksheets().iterator();
        long j = 1;
        while (it.hasNext()) {
            try {
                ChartDataWorksheet chartDataWorksheet = (ChartDataWorksheet) it.next();
                C11791os c11791osM55394k4 = mo3468h4().mo4812qm().m55394k4("/xl/worksheets/sheet{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.pjq.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(pjq.this.mo3468h4()) + "Aspose.Slides.XlsxSerialization.XlsxSerializationContext.GetNextSheetFileNumber()";
                    }

                    @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                    /* JADX INFO: renamed from: k4 */
                    public int mo5039k4() {
                        return pjq.this.mo3468h4().m4811kk();
                    }
                }, new C11743fj());
                new olk(c11791osM55394k4, mo3468h4(), chartDataWorksheet).m68658x1(chartDataWorksheet);
                C11709bg c11709bgM55311x1 = mo3467du().m55377up().m55311x1(c11791osM55394k4);
                com.aspose.slides.internal.p332p7.pbm pbmVarM45584k4 = smoVar.m41157h4().m45584k4();
                pbmVarM45584k4.m38799x1(c11709bgM55311x1.m55289du());
                long j2 = j + 1;
                pbmVarM45584k4.m38795k4(j);
                pbmVarM45584k4.m38796k4(chartDataWorksheet.getName());
                j = j2;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        rhq rhqVarM671h4 = chartDataWorkbook.m671h4();
        smoVar.m41177k4(rhqVarM671h4.m70100du());
        smoVar.m41164k4(rhqVarM671h4.m70098c5());
        smoVar.m41169k4(rhqVarM671h4.m70099ck());
        smoVar.m41170k4(rhqVarM671h4.m70101dy());
        smoVar.m41173k4(rhqVarM671h4.m70127m9());
        if (rhqVarM671h4.m70129rv() != null) {
            for (com.aspose.slides.internal.p332p7.blo bloVar : rhqVarM671h4.m70129rv()) {
                smoVar.m41162k4(bloVar);
            }
        }
        smoVar.m41171k4(rhqVarM671h4.m70134x1());
        smoVar.m41172k4(rhqVarM671h4.m70106k4());
        smoVar.m41176k4(rhqVarM671h4.m70103h4());
        smoVar.m41163k4(rhqVarM671h4.m70105jd());
        smoVar.m41178k4(rhqVarM671h4.m70102fa());
        smoVar.m41174k4(rhqVarM671h4.m70132up());
        smoVar.m41168k4(rhqVarM671h4.m70136yj());
        smoVar.m41175k4(rhqVarM671h4.m70135x6());
        smoVar.m41165k4(rhqVarM671h4.m70126ks());
        smoVar.m41161k4(rhqVarM671h4.m70125kk());
        smoVar.m41167k4(rhqVarM671h4.m70130to());
        smoVar.m41166k4(rhqVarM671h4.m70128ne());
        smoVar.mo6846k4(null, m55442ck(), "workbook");
        mo55333yj();
    }

    public pjq(C11791os c11791os, hxc hxcVar) {
        super(c11791os, hxcVar);
    }
}
