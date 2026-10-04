package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10386c9;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class zsn extends sil {

    /* JADX INFO: renamed from: du */
    private SortedList<Integer, Object> f50722du;

    /* JADX INFO: renamed from: dy */
    private int f50723dy;

    /* JADX INFO: renamed from: h4 */
    private SortedList<Integer, Object> f50724h4;

    /* JADX INFO: renamed from: kk */
    private boolean f50725kk;

    /* JADX INFO: renamed from: m9 */
    private int f50726m9;

    /* JADX INFO: renamed from: to */
    private C14093tq<C12014ne> f50727to;

    public zsn(qah qahVar) {
        super(qahVar);
        this.f50725kk = true;
        this.f50727to = new C14093tq<>();
        this.f50722du = new SortedList<>();
        this.f50724h4 = new SortedList<>();
        this.f50726m9 = 0;
        this.f50723dy = 0;
    }

    /* JADX INFO: renamed from: v4 */
    private void m74797v4() {
        List.Enumerator<qah> it = m70642h4().iterator();
        int iM56669jd = Integer.MIN_VALUE;
        int iM56664ck = Integer.MIN_VALUE;
        while (it.hasNext()) {
            try {
                qah next = it.next();
                xwz xwzVar = (xwz) next.m69481du();
                if (((C10462h9) C7019kk.m27452k4((Object) next.m69489kk(), C10462h9.class)) != null) {
                    C12014ne c12014neClone = xwzVar.m73612x1().Clone();
                    if (next.m69482dy() == 5) {
                        this.f50722du.set_Item(Integer.valueOf(c12014neClone.m56669jd()), null);
                        this.f50724h4.set_Item(Integer.valueOf(c12014neClone.m56664ck()), null);
                        if (c12014neClone.m56669jd() + c12014neClone.m56663c5() > iM56669jd) {
                            iM56669jd = c12014neClone.m56669jd() + c12014neClone.m56663c5();
                        }
                        if (c12014neClone.m56664ck() + c12014neClone.m56683x1() > iM56664ck) {
                            iM56664ck = c12014neClone.m56664ck() + c12014neClone.m56683x1();
                        }
                    }
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
        if (!this.f50727to.m67302x1()) {
            this.f50727to = new C14093tq<>(new C12014ne(this.f50722du.getKeys().get_Item(0).intValue(), this.f50724h4.getKeys().get_Item(0).intValue(), iM56669jd - this.f50722du.getKeys().get_Item(0).intValue(), iM56664ck - this.f50724h4.getKeys().get_Item(0).intValue()));
        }
        this.f50726m9 = this.f50722du.size();
        this.f50723dy = this.f50724h4.size();
        this.f50722du.set_Item(Integer.valueOf(iM56669jd), null);
        this.f50724h4.set_Item(Integer.valueOf(iM56664ck), null);
    }

    /* JADX INFO: renamed from: ar */
    public final int m74798ar() {
        return this.f50726m9;
    }

    /* JADX INFO: renamed from: bv */
    public final C12014ne m74799bv() {
        return this.f50727to.m67302x1() ? this.f50727to.m67297k4() : new C12014ne();
    }

    @Override // com.aspose.slides.ri7
    /* JADX INFO: renamed from: c5 */
    public void mo6946c5() {
        C14093tq<C12014ne> c14093tq;
        C10462h9 c10462h9M70140fa = m70140fa();
        if (c10462h9M70140fa == null) {
            this.f50725kk = false;
        } else {
            if (c10462h9M70140fa.mo50865x1() == null) {
                this.f50725kk = false;
            }
            if (c10462h9M70140fa.mo50858c5() == null) {
                if (c10462h9M70140fa.mo50860dy() != null) {
                    C12014ne c12014neClone = c10462h9M70140fa.mo50860dy().m51979h4().Clone();
                    C10386c9 c10386c9Mo50858c5 = m70153yj().m70644kk().mo50858c5();
                    if (c10386c9Mo50858c5 != null) {
                        C12014ne c12014neClone2 = c10386c9Mo50858c5.m50544h4().Clone();
                        if (c12014neClone2.m56663c5() <= c12014neClone.m56663c5()) {
                            c12014neClone.m56676kk(c12014neClone2.m56669jd());
                        }
                        if (c12014neClone2.m56683x1() <= c12014neClone.m56683x1()) {
                            c12014neClone.m56682to(c12014neClone2.m56664ck());
                        }
                    }
                    c14093tq = new C14093tq<>(c12014neClone.Clone());
                }
                this.f50725kk = false;
            } else {
                c14093tq = new C14093tq<>(c10462h9M70140fa.mo50858c5().m50544h4().Clone());
            }
            this.f50727to = c14093tq;
        }
        if (this.f50725kk) {
            m74797v4();
        }
    }

    /* JADX INFO: renamed from: dy */
    public final Table m74800dy() {
        return (Table) this.f48599x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m74801k4(int i) {
        if (i < 0 || i > this.f50726m9 - 1) {
            return -1;
        }
        int i2 = i + 1;
        return this.f50722du.size() == i2 ? this.f50722du.getKeys().get_Item(i).intValue() : this.f50722du.getKeys().get_Item(i2).intValue() - this.f50722du.getKeys().get_Item(i).intValue();
    }

    /* JADX INFO: renamed from: um */
    public final int m74804um() {
        return this.f50723dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m74805x1(int i) {
        if (i < 0 || i > this.f50723dy - 1) {
            return -1;
        }
        int i2 = i + 1;
        return this.f50724h4.size() == i2 ? this.f50724h4.getKeys().get_Item(i).intValue() : this.f50724h4.getKeys().get_Item(i2).intValue() - this.f50724h4.getKeys().get_Item(i).intValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12014ne m74802k4(C12014ne c12014ne) {
        int iIndexOfKey = this.f50722du.indexOfKey(Integer.valueOf(c12014ne.m56669jd()));
        int iIndexOfKey2 = this.f50724h4.indexOfKey(Integer.valueOf(c12014ne.m56664ck()));
        int iM56663c5 = c12014ne.m56663c5() + c12014ne.m56669jd();
        int iM56683x1 = c12014ne.m56683x1() + c12014ne.m56664ck();
        int i = 0;
        int i2 = 0;
        while (this.f50722du.getKeys().get_Item(iIndexOfKey + i2).intValue() < iM56663c5) {
            i2++;
        }
        while (this.f50724h4.getKeys().get_Item(iIndexOfKey2 + i).intValue() < iM56683x1) {
            i++;
        }
        return new C12014ne(iIndexOfKey, iIndexOfKey2, i2, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74803k4(Table table) {
        m70139ck();
        this.f48599x1 = table;
    }
}
