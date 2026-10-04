package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class GradientStopCollection extends PVIObject implements IGradientStopCollection {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC1155go> f2419k4;

    /* JADX INFO: renamed from: kk */
    private List<IGradientStop> f2420kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC1155go f2421x1;

    public GradientStopCollection(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2419k4 = new AbstractC7018k4<AbstractC1155go>() { // from class: com.aspose.slides.GradientStopCollection.1
            {
                GradientStopCollection.this.f2421x1 = new AbstractC1155go() { // from class: com.aspose.slides.GradientStopCollection.1.1
                    @Override // com.aspose.slides.AbstractC1155go
                    /* JADX INFO: renamed from: k4 */
                    public void mo1617k4() {
                        for (AbstractC1155go abstractC1155go : ((AbstractC7018k4) C04391.this).f19081x1) {
                            if (abstractC1155go != null) {
                                abstractC1155go.mo1617k4();
                            }
                        }
                    }
                };
            }
        };
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C14484t3(this.f2420kk);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2420kk = new List<>();
    }

    @Override // com.aspose.slides.IGradientStopCollection
    public final IGradientStop add(float f, Integer num) {
        return m1625k4(f, C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.IGradientStopCollection
    public final IGradientStop addPresetColor(float f, int i) {
        m2145uz();
        GradientStop gradientStop = new GradientStop(this, f, i);
        m1629x1().m70930k4(gradientStop);
        m1627m9();
        return gradientStop;
    }

    @Override // com.aspose.slides.IGradientStopCollection
    public final IGradientStop addSchemeColor(float f, int i) {
        m2145uz();
        GradientStop gradientStop = new GradientStop(this, f, i, true);
        m1629x1().m70930k4(gradientStop);
        m1627m9();
        return gradientStop;
    }

    @Override // com.aspose.slides.IGradientStopCollection
    public final void clear() {
        if (m2138ix()) {
            m1629x1().m70927k4();
            m1627m9();
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        m2146wl();
        this.f2420kk.copyTo(abstractC14092to, i);
    }

    /* JADX INFO: renamed from: du */
    public final IGradientStop m1622du() {
        m2145uz();
        GradientStop gradientStop = new GradientStop(this);
        m1629x1().m70930k4(gradientStop);
        return gradientStop;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1629x1().m70931kk();
        }
        return 1L;
    }

    @Override // com.aspose.slides.IGradientStopCollection
    public final IGradientStop get_Item(int i) {
        m2146wl();
        return this.f2420kk.get_Item(i);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m1623h4() {
        if (m2138ix()) {
            m1629x1().m70932x1();
        }
    }

    @Override // com.aspose.slides.IGradientStopCollection
    public final void insert(int i, float f, Integer num) {
        m1626k4(i, f, C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.IGradientStopCollection
    public final void insertPresetColor(int i, float f, int i2) {
        m2145uz();
        m1629x1().m70929k4(i, new GradientStop(this, f, i2));
        m1627m9();
    }

    @Override // com.aspose.slides.IGradientStopCollection
    public final void insertSchemeColor(int i, float f, int i2) {
        m2145uz();
        m1629x1().m70929k4(i, new GradientStop(this, f, i2, true));
        m1627m9();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IGradientStop> iterator() {
        m2146wl();
        return this.f2420kk.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IGradientStop> iteratorJava() {
        m2146wl();
        return this.f2420kk.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final GradientStop m1624k4(float f) {
        if (!m2138ix()) {
            return null;
        }
        m2146wl();
        List.Enumerator<IGradientStop> it = this.f2420kk.iterator();
        while (it.hasNext()) {
            try {
                GradientStop gradientStop = (GradientStop) it.next();
                if (f == gradientStop.getPosition()) {
                    return gradientStop;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m1627m9() {
        AbstractC1155go abstractC1155go = this.f2421x1;
        if (abstractC1155go == null || this.f2419k4.m27430k4()) {
            return;
        }
        abstractC1155go.mo1617k4();
    }

    @Override // com.aspose.slides.IGradientStopCollection
    public final void removeAt(int i) {
        if (!m2138ix()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        m1629x1().m70928k4(i);
        m1627m9();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        m2146wl();
        return this.f2420kk.size();
    }

    /* JADX INFO: renamed from: to */
    public final IGradientStop m1628to() {
        m2145uz();
        GradientStop gradientStop = new GradientStop(this);
        m1629x1().m70930k4(gradientStop);
        m1627m9();
        return gradientStop;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14484t3 m1629x1() {
        return (C14484t3) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public IGradientStop m1625k4(float f, C12003du c12003du) {
        m2145uz();
        GradientStop gradientStop = new GradientStop(this, f, c12003du.Clone());
        m1629x1().m70930k4(gradientStop);
        m1627m9();
        return gradientStop;
    }

    /* JADX INFO: renamed from: k4 */
    public void m1626k4(int i, float f, C12003du c12003du) {
        m2145uz();
        m1629x1().m70929k4(i, new GradientStop(this, f, c12003du.Clone()));
        m1627m9();
    }
}
