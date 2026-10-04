package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ChartDataWorksheet extends DomObject<ChartDataWorksheetCollection> implements IChartDataWorksheet {

    /* JADX INFO: renamed from: c5 */
    private int f1431c5;

    /* JADX INFO: renamed from: du */
    private String f1432du;

    /* JADX INFO: renamed from: dy */
    private List<C0928e6> f1433dy;

    /* JADX INFO: renamed from: jd */
    private voq f1434jd;

    /* JADX INFO: renamed from: k4 */
    mm3 f1435k4;

    /* JADX INFO: renamed from: kk */
    private ecy f1436kk;

    /* JADX INFO: renamed from: m9 */
    private C13646iq f1437m9;

    /* JADX INFO: renamed from: to */
    private long f1438to;

    /* JADX INFO: renamed from: x1 */
    kqc f1439x1;

    public ChartDataWorksheet(ChartDataWorksheetCollection chartDataWorksheetCollection) {
        super(chartDataWorksheetCollection);
        this.f1432du = C18358t1.g.f56183c;
        this.f1433dy = new List<>();
        m693k4(new ecy(this));
        m692k4(chartDataWorksheetCollection, null, null);
    }

    /* JADX INFO: renamed from: du */
    public final voq m694du() {
        return this.f1434jd;
    }

    @Override // com.aspose.slides.IChartDataWorksheet
    public final int getIndex() {
        return this.f1431c5;
    }

    @Override // com.aspose.slides.IChartDataWorksheet
    public final String getName() {
        return this.f1432du;
    }

    /* JADX INFO: renamed from: h4 */
    public final ecy m695h4() {
        return this.f1436kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final kqc m696k4() {
        return this.f1439x1;
    }

    /* JADX INFO: renamed from: kk */
    public final long m701kk() {
        return this.f1438to;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public final ChartDataWorkbook m702to() {
        return ((ChartDataWorksheetCollection) this.f2127h4).m706x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final C13646iq m703x1() {
        return this.f1437m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m697k4(int i) {
        this.f1431c5 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m698k4(long j) {
        this.f1438to = j;
    }

    /* JADX INFO: renamed from: k4 */
    private void m692k4(ChartDataWorksheetCollection chartDataWorksheetCollection, ijq ijqVar, mco mcoVar) {
        this.f1437m9 = new C13646iq(this);
        this.f1439x1 = new kqc(this);
        this.f1434jd = new voq();
        if (ijqVar == null || mcoVar == null) {
            return;
        }
        m699k4(ijqVar, mcoVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m693k4(ecy ecyVar) {
        this.f1436kk = ecyVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m699k4(ijq ijqVar, mco mcoVar) {
        mm3 mm3Var = (mm3) ijqVar.getOwnerDocument();
        this.f1435k4 = mm3Var;
        ((agb) mm3Var).f3905k4.f46286x1 = this;
        dnf dnfVarM5196x1 = ijqVar.m5196x1("sheetData", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
        dnf dnfVarM5196x12 = ijqVar.m5196x1("cols", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
        if (dnfVarM5196x12 != null) {
            for (dnf dnfVar : dnfVarM5196x12.m5194k4("col", "http://schemas.openxmlformats.org/spreadsheetml/2006/main")) {
                this.f1433dy.addItem((C0928e6) dnfVar);
            }
        }
        if (dnfVarM5196x1 != null) {
            this.f1437m9.m63047k4(dnfVarM5196x1, this.f1433dy);
        }
        dnf dnfVarM5196x13 = this.f1435k4.m64923kk().m5196x1("tableParts", "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
        if (dnfVarM5196x13 != null) {
            for (dnf dnfVar2 : dnfVarM5196x13.m5194k4("tablePart", "http://schemas.openxmlformats.org/spreadsheetml/2006/main")) {
                String strM65912to = dnfVar2.m65912to("id", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
                IGenericEnumerator<gt9> it = ((agb) this.f1435k4).f3906x1.iterator();
                while (true) {
                    try {
                        if (!it.hasNext()) {
                            break;
                        }
                        gt9 next = it.next();
                        if ("http://schemas.openxmlformats.org/officeDocument/2006/relationships/table".equals(next.m6902kk()) && C14113y2.m67363du(strM65912to, next.m6904x1())) {
                            this.f1439x1.m64129k4(new kvj(this, (va3) m702to().f1423k4.f49334x1.get_Item(next.m6901k4()).f46285k4));
                            break;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m700k4(String str) {
        this.f1432du = str;
    }
}
