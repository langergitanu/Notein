package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class ixg extends AbstractC14770x9 {

    /* JADX INFO: renamed from: kk */
    AbstractC14763x3 f45392kk;

    /* JADX INFO: renamed from: x1 */
    AbstractC14763x3 f45394x1;

    /* JADX INFO: renamed from: to */
    private List<AbstractC14770x9> f45393to = new List<>();

    /* JADX INFO: renamed from: k4 */
    List<fml> f45391k4 = new List<>();

    public ixg(AbstractC14763x3 abstractC14763x3, AbstractC14763x3 abstractC14763x32) {
        this.f45392kk = abstractC14763x32;
        this.f45394x1 = abstractC14763x3;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: U_ */
    public void mo5524U_() {
        if (mo3221T_()) {
            for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
                abstractC14770x9.mo5524U_();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63150k4(ChartSeries chartSeries) {
        for (int i = 0; i < this.f45391k4.get_Item(0).f5072x1.size(); i++) {
            if (chartSeries.m736up()) {
                C14399rl c14399rl = new C14399rl(this.f45391k4.get_Item(0).m6220yj(), m63152k4(i), this.f45394x1);
                this.f45393to.addItem(c14399rl);
                m73215k4(c14399rl);
            }
            if (chartSeries.m740yj()) {
                C0742ad c0742ad = new C0742ad(this.f45391k4.get_Item(0).m6220yj(), m63152k4(i));
                this.f45393to.addItem(c0742ad);
                m73215k4(c0742ad);
            }
            if (chartSeries.hasUpDownBars()) {
                nky nkyVar = new nky(this.f45391k4.get_Item(0).m6220yj(), m63152k4(i), this.f45392kk);
                this.f45393to.addItem(nkyVar);
                m73215k4(nkyVar);
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m63153m9() {
        List.Enumerator<fml> it = this.f45391k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m6212jd();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        List.Enumerator<AbstractC14770x9> it = this.f45391k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f45393to.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63154x1(double[] dArr, double[] dArr2) {
        this.f45391k4.get_Item(0).m6215kk(dArr, dArr2);
        if (this.f45391k4.size() > 1) {
            double d = 0.0d;
            double d2 = 0.0d;
            for (int i = 1; i < this.f45391k4.size(); i++) {
                if (this.f45391k4.get_Item(i).f5072x1.size() != 0) {
                    double[] dArr3 = {d};
                    double[] dArr4 = {d2};
                    this.f45391k4.get_Item(i).m6215kk(dArr3, dArr4);
                    double d3 = dArr3[0];
                    double d4 = dArr4[0];
                    if (d3 < dArr[0]) {
                        dArr[0] = d3;
                    }
                    if (d4 > dArr2[0]) {
                        dArr2[0] = d4;
                    }
                    d = d3;
                    d2 = d4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m63151k4(double[] dArr, double[] dArr2) {
        double d = 0.0d;
        if (ChartTypeCharacterizer.m768up(this.f45391k4.get_Item(0).m6220yj().m64945h4().getType()) || this.f45391k4.get_Item(0).f5072x1.size() != 0) {
            this.f45391k4.get_Item(0).m6219x1(dArr, dArr2);
        } else {
            dArr[0] = 0.0d;
            dArr2[0] = 0.0d;
        }
        if (this.f45391k4.size() > 1) {
            double d2 = 0.0d;
            for (int i = 1; i < this.f45391k4.size(); i++) {
                if (ChartTypeCharacterizer.m768up(this.f45391k4.get_Item(i).m6220yj().m64945h4().getType())) {
                    if (this.f45391k4.get_Item(i).m6220yj().m64945h4().m719c5().m72973k4() != 0) {
                        double[] dArr3 = {d};
                        double[] dArr4 = {d2};
                        this.f45391k4.get_Item(i).m6219x1(dArr3, dArr4);
                        double d3 = dArr3[0];
                        double d4 = dArr4[0];
                        if (d3 < dArr[0]) {
                            dArr[0] = d3;
                        }
                        if (d4 > dArr2[0]) {
                            dArr2[0] = d4;
                        }
                        d = d3;
                        d2 = d4;
                    }
                } else if (this.f45391k4.get_Item(i).f5072x1.size() == 0 || this.f45391k4.get_Item(i).m6218up()) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC1164gw[] m63152k4(int i) {
        List list = new List();
        for (int i2 = 0; i2 < this.f45391k4.size(); i2++) {
            if (i < this.f45391k4.get_Item(i2).f5072x1.size()) {
                list.addItem(this.f45391k4.get_Item(i2).f5072x1.get_Item(i));
            }
        }
        return (AbstractC1164gw[]) list.toArray(new AbstractC1164gw[0]);
    }
}
