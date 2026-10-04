package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ls */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC13808ls extends fml {

    /* JADX INFO: renamed from: k4 */
    protected List<zqt> f46087k4;

    public AbstractC13808ls(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
        this.f46087k4 = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final float m64545c5() {
        return m6220yj().m64945h4().getOverlap() / 100.0f;
    }

    /* JADX INFO: renamed from: du */
    public final void m64546du() {
        List.Enumerator<zqt> it = this.f46087k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m74769to();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    public final float m64547dy() {
        return m6220yj().m64945h4().getGapWidth() / 100.0f;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m64548h4() {
        if (((fml) this).f5072x1.size() <= 0 || !m6220yj().m64945h4().hasSeriesLines()) {
            return;
        }
        for (int i = 0; i < ((fml) this).f5072x1.size() - 1; i++) {
            if (!((fml) this).f5072x1.get_Item(i).m6926yj().m4983dy()) {
                int i2 = i + 1;
                while (true) {
                    if (i2 >= ((fml) this).f5072x1.size()) {
                        break;
                    }
                    if (!((fml) this).f5072x1.get_Item(i2).m6926yj().m4983dy()) {
                        zqt zqtVar = new zqt((AbstractC14557tg) ((fml) this).f5072x1.get_Item(i), (AbstractC14557tg) ((fml) this).f5072x1.get_Item(i2));
                        this.f46087k4.addItem(zqtVar);
                        m73215k4(zqtVar);
                        break;
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m64549kk(C14713vw c14713vw) {
        List.Enumerator<C14177nd> it = ((fml) this).f5069kk.iterator();
        while (it.hasNext()) {
            try {
                C14177nd next = it.next();
                next.m73210fa(next.m67979yj());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<klm> it2 = ((fml) this).f5071to.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        List.Enumerator<zsm> it3 = this.f46087k4.iterator();
        while (it3.hasNext()) {
            try {
                it3.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        it3 = ((fml) this).f5065du.iterator();
        while (it3.hasNext()) {
            try {
                it3.next().m73210fa(c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        m6211h4(c14713vw);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m64550m9() {
        for (int i = 0; i < ((fml) this).f5071to.size(); i++) {
            klm klmVar = ((fml) this).f5071to.get_Item(i);
            C14610tz c14610tz = (C14610tz) ((fml) this).f5069kk.get_Item(i);
            AbstractC14557tg abstractC14557tg = (AbstractC14557tg) c14610tz.m71462to();
            C12025x6 c12025x6Clone = abstractC14557tg.mo3520k4((C14177nd) c14610tz).Clone();
            if (!klmVar.m63973k4(c14610tz.m73209e0().Clone(), new C12025x6[]{c12025x6Clone}, (c14610tz.m73227xk() > c12025x6Clone.m56897x1() || c14610tz.m73227xk() + c14610tz.m73225wy() < c12025x6Clone.m56897x1()) ? c14610tz.m67973ne() : c14610tz.m67965ix()) || c14610tz.m73209e0().m56569kk(abstractC14557tg.m73209e0().Clone()) || (c14610tz.m67962c5() == 0.0f && c14610tz.m67966jd() == 0.0f)) {
                klmVar.m63972k4(false);
            } else {
                klmVar.m63972k4(true);
            }
            klmVar.m73220ss();
        }
    }
}
