package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class kqc implements IGenericEnumerable<kvj> {

    /* JADX INFO: renamed from: kk */
    private final ChartDataWorksheet f45842kk;

    /* JADX INFO: renamed from: k4 */
    private String f45841k4 = C14113y2.m67408k4("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><table xmlns=\"http://schemas.openxmlformats.org/spreadsheetml/2006/main\" totalsRowShown=\"0\">", "<tableColumns/><tableStyleInfo showFirstColumn=\"0\" showLastColumn=\"0\" showRowStripes=\"1\" showColumnStripes=\"0\" /></table>");

    /* JADX INFO: renamed from: x1 */
    private final List<kvj> f45843x1 = new List<>();

    public kqc(ChartDataWorksheet chartDataWorksheet) {
        this.f45842kk = chartDataWorksheet;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<kvj> iterator() {
        return this.f45843x1.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final kvj m64128k4() {
        kvj kvjVar = new kvj(this.f45842kk);
        long size = ((long) this.f45843x1.size()) & 4294967295L;
        boolean z = true;
        while (true) {
            boolean z2 = false;
            if (!z) {
                kvjVar.m64201h4().m70313x1(C14113y2.m67408k4("Table", C14114y9.m67465x1(size)));
                kvjVar.m64201h4().m70290k4(C14113y2.m67408k4("Table", C14114y9.m67465x1(size)));
                kvjVar.m64201h4().m70284k4(size);
                kvjVar.m64201h4().m70289k4(new com.aspose.slides.internal.p332p7.wsf());
                kvjVar.m64201h4().m70287k4(new com.aspose.slides.internal.p332p7.knz());
                kvjVar.m64201h4().m70266ar().m35572k4((byte) 0);
                kvjVar.m64201h4().m70266ar().m35575x1((byte) 0);
                kvjVar.m64201h4().m70266ar().m35573kk((byte) 1);
                kvjVar.m64201h4().m70266ar().m35574to((byte) 0);
                this.f45843x1.addItem(kvjVar);
                return kvjVar;
            }
            size++;
            List.Enumerator<kvj> it = this.f45843x1.iterator();
            while (it.hasNext()) {
                try {
                    kvj next = it.next();
                    if (C14113y2.m67363du(next.m64201h4().m70292kk(), C14113y2.m67408k4("Table", C14114y9.m67465x1(size))) || C14113y2.m67363du(next.m64201h4().m70311x1(), C14113y2.m67408k4("Table", C14114y9.m67465x1(size))) || next.m64201h4().m70282k4() == size) {
                        z2 = true;
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            z = z2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64129k4(kvj kvjVar) {
        this.f45843x1.addItem(kvjVar);
    }
}
