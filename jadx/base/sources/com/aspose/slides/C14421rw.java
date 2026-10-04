package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.rw */
/* JADX INFO: loaded from: classes3.dex */
class C14421rw extends C13785ll {
    public C14421rw(C14787xi c14787xi) {
        super(c14787xi);
    }

    @Override // com.aspose.slides.C13785ll, com.aspose.slides.AbstractC14265p3
    /* JADX INFO: renamed from: c5 */
    public C14713vw mo4960c5(C14713vw c14713vw) {
        return new C14713vw(c14713vw.m72555k4() / ((AbstractC14763x3) this).f49904k4.size(), c14713vw.m72556x1() - m73034ne());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    @Override // com.aspose.slides.C13785ll
    /* JADX INFO: renamed from: ck */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12015qq mo64456ck(C14713vw c14713vw) {
        C12015qq c12015qqMo3034h4;
        C14713vw c14713vw2;
        C14713vw c14713vwMo4960c5 = mo4960c5(c14713vw);
        C14713vw c14713vw3 = new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr());
        C12015qq c12015qqClone = mo3034h4(new C14713vw(1000.0f, 1000.0f)).Clone();
        C12015qq c12015qq = new C12015qq();
        if (m73026k4().m73386h4() != 0) {
            if (m73026k4().m73386h4() == 30) {
                if (((double) c12015qqClone.m56699x1()) * 0.65d > c14713vwMo4960c5.m72555k4() * 1.5f) {
                    m73026k4().m73394k4(60);
                    return mo64456ck(c14713vw);
                }
                c14713vw2 = new C14713vw(1000.0f, 1000.0f);
                c12015qqMo3034h4 = mo3034h4(c14713vw2);
            } else if (m73026k4().m73386h4() == 60) {
                if (c12015qqClone.m56699x1() > c14713vwMo4960c5.m72555k4() * 1.71f) {
                    m73026k4().m73394k4(90);
                }
                c14713vw2 = new C14713vw(1000.0f, 1000.0f);
                c12015qqMo3034h4 = mo3034h4(c14713vw2);
            } else {
                if (c12015qqClone.m56699x1() > c14713vwMo4960c5.m72555k4() * 2.0f && m73026k4().m73376bv() + 1 < ((AbstractC14763x3) this).f49904k4.size()) {
                    m73026k4().m73388h4(m73026k4().m73376bv() + 1);
                    return mo64456ck(c14713vw);
                }
                c12015qqMo3034h4 = mo3034h4(c14713vw3);
            }
            c12015qqMo3034h4.CloneTo(c12015qq);
            if (m73026k4().m73386h4() != 0) {
            }
            return c12015qq;
        }
        if (!((C13785ll) this).f46038m9) {
            if (c12015qqClone.m56699x1() > c14713vwMo4960c5.m72555k4()) {
                ((C13785ll) this).f46038m9 = true;
                return mo64456ck(c14713vw);
            }
            c12015qqClone.CloneTo(c12015qq);
            if (m73026k4().m73386h4() != 0) {
            }
            return c12015qq;
        }
        if (c12015qqClone.m56699x1() * 0.73f > c14713vwMo4960c5.m72555k4()) {
            ((C13785ll) this).f46038m9 = false;
            m73026k4().m73394k4(30);
            return mo64456ck(c14713vw);
        }
        c12015qq = new C12015qq(c12015qqClone.m56699x1(), c12015qqClone.m56697kk() * 2.0f);
        if (m73026k4().m73386h4() != 0 || c12015qq.m56697kk() <= c14713vwMo4960c5.m72556x1()) {
            return c12015qq;
        }
        List.Enumerator<nxm> it = ((AbstractC14763x3) this).f49904k4.iterator();
        while (it.hasNext()) {
            try {
                m64458k4(it.next(), c14713vwMo4960c5);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        mo3034h4(c14713vw3).CloneTo(c12015qq);
        return c12015qq;
    }

    @Override // com.aspose.slides.AbstractC14265p3
    /* JADX INFO: renamed from: jd */
    public void mo68927jd(C14713vw c14713vw) {
        boolean zM27456k4;
        ((AbstractC14763x3) this).f49904k4.clear();
        if (m73026k4().m73423wy().m69834fa().getChartData().getSeries().get_Item(0).getType() == 76) {
            IGenericEnumerator<C0791b3> it = ((ChartSeries) m73026k4().m73423wy().m69834fa().getChartData().getSeries().get_Item(0)).m719c5().iterator();
            while (it.hasNext()) {
                try {
                    m73025k4((Object) it.next().m3946c5());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return;
            } else {
                return;
            }
        }
        if (m73026k4().m73423wy().m69834fa().getChartData().getSeries().get_Item(0).getType() == 79) {
            IChartCategoryCollection categories = m73026k4().m73423wy().m69834fa().getChartData().getCategories();
            if (categories.size() <= 0) {
                super.mo68927jd(c14713vw);
                return;
            }
            for (int i = 0; i < categories.size(); i++) {
                Object objM525kk = ((ChartCategory) categories.get_Item(i)).m525kk();
                if (objM525kk == null) {
                    objM525kk = C14057f9.m66591x1(i);
                }
                m73025k4(objM525kk);
            }
            return;
        }
        IChartCategoryCollection categories2 = m73026k4().m73423wy().m69834fa().getChartData().getCategories();
        if (categories2.size() <= 0) {
            super.mo68927jd(c14713vw);
            return;
        }
        List list = new List();
        IGenericEnumerator<IChartCategory> it2 = categories2.iterator();
        int i2 = 1;
        while (it2.hasNext()) {
            try {
                ChartCategory chartCategory = (ChartCategory) it2.next();
                String string = chartCategory.m525kk() != null ? chartCategory.m525kk().toString() : C14057f9.m66591x1(i2);
                if (!list.containsItem(string)) {
                    list.addItem(string);
                    m73025k4((Object) string);
                }
                i2++;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
    }
}
