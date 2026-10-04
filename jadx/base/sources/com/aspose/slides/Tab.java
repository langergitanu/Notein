package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: loaded from: classes3.dex */
public final class Tab extends PVIObject implements ITab {
    public Tab(double d, int i) {
        super(null);
        m2146wl();
        m2140k4(new ks4(d, i));
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        throw new NotImplementedException("Can not create Tab object with lazy initialization, use instant constructor instead.");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C14044b3.m66430k4(getPosition(), ((Tab) obj).getPosition());
    }

    @Override // com.aspose.slides.ITab
    public final int getAlignment() {
        if (m2138ix()) {
            return m2861x1().getAlignment();
        }
        return 0;
    }

    @Override // com.aspose.slides.ITab
    public final double getPosition() {
        if (m2138ix()) {
            return m2861x1().getPosition();
        }
        return 0.0d;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m2861x1().m64133k4();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2860k4(TabCollection tabCollection) {
        m2145uz();
        m2861x1().m64134k4(tabCollection);
    }

    @Override // com.aspose.slides.ITab
    public final void setAlignment(int i) {
        m2141k4((Integer) 0, Integer.valueOf(i));
        if (m2138ix()) {
            m2861x1().setAlignment(i);
        }
    }

    @Override // com.aspose.slides.ITab
    public final void setPosition(double d) {
        m2141k4(Double.valueOf(0.0d), Double.valueOf(d));
        if (!m2138ix() || m2861x1().getPosition() == d) {
            return;
        }
        TabCollection tabCollection = (TabCollection) getParent_Immediate();
        if (tabCollection != null) {
            tabCollection.m2863k4(d);
        }
        m2861x1().setPosition(d);
        if (tabCollection != null) {
            tabCollection.add(this);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final ks4 m2861x1() {
        return (ks4) m2144u4();
    }
}
