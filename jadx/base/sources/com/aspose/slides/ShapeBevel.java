package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ShapeBevel extends PVIObject implements IShapeBevel {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<r0b> f3340k4;

    /* JADX INFO: renamed from: to */
    private r0b f3341to;

    /* JADX INFO: renamed from: x1 */
    static final ShapeBevel f3339x1 = new ShapeBevel(true);

    /* JADX INFO: renamed from: kk */
    static final ShapeBevel f3338kk = new ShapeBevel(false);

    public ShapeBevel(InterfaceC14397rj interfaceC14397rj, boolean z) {
        super(interfaceC14397rj);
        this.f3340k4 = new AbstractC7018k4<r0b>() { // from class: com.aspose.slides.ShapeBevel.1
            {
                ShapeBevel.this.f3341to = new r0b() { // from class: com.aspose.slides.ShapeBevel.1.1
                    @Override // com.aspose.slides.r0b
                    /* JADX INFO: renamed from: k4 */
                    public void mo2605k4() {
                        for (r0b r0bVar : ((AbstractC7018k4) C06131.this).f19081x1) {
                            if (r0bVar != null) {
                                r0bVar.mo2605k4();
                            }
                        }
                    }
                };
            }
        };
        m2146wl();
        m2140k4(new cc9(z));
    }

    /* JADX INFO: renamed from: du */
    private void m2598du() {
        r0b r0bVar = this.f3341to;
        if (r0bVar == null || this.f3340k4.m27430k4()) {
            return;
        }
        r0bVar.mo2605k4();
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        throw new NotImplementedException("Can not create ShapeBevel object with lazy initialization, use instant constructor instead.");
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        ShapeBevel shapeBevel = (ShapeBevel) C7019kk.m27452k4(obj, ShapeBevel.class);
        if (shapeBevel == null) {
            return false;
        }
        if (m2138ix()) {
            return m2603x1().m4550x1(shapeBevel);
        }
        if (shapeBevel.m2138ix()) {
            return shapeBevel.m2603x1().m4550x1(this);
        }
        return true;
    }

    @Override // com.aspose.slides.IShapeBevel
    public final int getBevelType() {
        if (m2138ix()) {
            return m2603x1().m4546kk();
        }
        return -1;
    }

    @Override // com.aspose.slides.IShapeBevel
    public final double getHeight() {
        if (m2138ix()) {
            return m2603x1().m4548x1();
        }
        return Double.NaN;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m2603x1().m4540du();
        }
        return 1L;
    }

    @Override // com.aspose.slides.IShapeBevel
    public final double getWidth() {
        if (m2138ix()) {
            return m2603x1().m4541k4();
        }
        return Double.NaN;
    }

    @Override // com.aspose.slides.IShapeBevel
    public final void setBevelType(int i) {
        m2141k4((Integer) (-1), Integer.valueOf(i));
        if (m2138ix()) {
            m2603x1().m4543k4(i);
            m2598du();
        }
    }

    @Override // com.aspose.slides.IShapeBevel
    public final void setHeight(double d) {
        m2141k4(Double.valueOf(Double.NaN), Double.valueOf(d));
        if (m2138ix()) {
            m2603x1().m4549x1(d);
            m2598du();
        }
    }

    @Override // com.aspose.slides.IShapeBevel
    public final void setWidth(double d) {
        m2141k4(Double.valueOf(Double.NaN), Double.valueOf(d));
        if (m2138ix()) {
            m2603x1().m4542k4(d);
            m2598du();
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m2602to() {
        if (m2138ix()) {
            return m2603x1().m4547to();
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final cc9 m2603x1() {
        return (cc9) m2144u4();
    }

    public ShapeBevel(boolean z) {
        super(null);
        this.f3340k4 = new AbstractC7018k4<r0b>() { // from class: com.aspose.slides.ShapeBevel.1
            {
                ShapeBevel.this.f3341to = new r0b() { // from class: com.aspose.slides.ShapeBevel.1.1
                    @Override // com.aspose.slides.r0b
                    /* JADX INFO: renamed from: k4 */
                    public void mo2605k4() {
                        for (r0b r0bVar : ((AbstractC7018k4) C06131.this).f19081x1) {
                            if (r0bVar != null) {
                                r0bVar.mo2605k4();
                            }
                        }
                    }
                };
            }
        };
        m2146wl();
        m2140k4(new cc9(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m2600k4(IShapeBevel iShapeBevel) {
        if (m2138ix() || ((PVIObject) iShapeBevel).m2138ix()) {
            m2145uz();
            m2603x1().m4544k4((ShapeBevel) iShapeBevel);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2601k4(IShapeBevelEffectiveData iShapeBevelEffectiveData) {
        m2145uz();
        m2603x1().m4545k4((ofw) iShapeBevelEffectiveData);
    }
}
