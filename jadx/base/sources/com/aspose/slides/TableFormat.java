package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class TableFormat extends DomObject<Table> implements ITableFormat, InterfaceC14376r6 {

    /* JADX INFO: renamed from: k4 */
    private IPresentationComponent f3497k4;

    /* JADX INFO: renamed from: kk */
    private final FillFormat f3498kk;

    /* JADX INFO: renamed from: to */
    private uit f3499to;

    /* JADX INFO: renamed from: x1 */
    private long f3500x1;

    public TableFormat(Table table) {
        super(table);
        this.f3498kk = new FillFormat(this);
    }

    /* JADX INFO: renamed from: kk */
    private float m2879kk() {
        IGenericEnumerator<IRow> it = m2881k4().getRows().iterator();
        C14093tq c14093tq = null;
        while (it.hasNext()) {
            try {
                IGenericEnumerator<ICell> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    try {
                        ICell next = it2.next();
                        if (C14093tq.m67295k4(c14093tq, null)) {
                            c14093tq = new C14093tq(Float.valueOf(next.getCellFormat().getTransparency()));
                        } else if (C14093tq.m67296x1(c14093tq, new C14093tq(Float.valueOf(next.getCellFormat().getTransparency())))) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return Float.NaN;
                        }
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
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (c14093tq.m67302x1()) {
            return ((Float) c14093tq.m67297k4()).floatValue();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: to */
    private void m2880to() {
        IGenericEnumerator<ICell> it = m2881k4().getRows().iterator();
        while (it.hasNext()) {
            try {
                it = it.next().iterator();
                while (it.hasNext()) {
                    try {
                        if (!((CellFormat) it.next().getCellFormat()).m498m9()) {
                            throw new InvalidOperationException("Transparency can only be set or retrieved when FillType is Solid for all cells.");
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
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.ITableFormat
    public final ITableFormatEffectiveData getEffective() {
        return m2882x1();
    }

    @Override // com.aspose.slides.ITableFormat
    public final IFillFormat getFillFormat() {
        return this.f3498kk;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f3497k4;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, (InterfaceC14397rj) this.f2127h4, iPresentationComponentArr);
            this.f3497k4 = iPresentationComponentArr[0];
        }
        return this.f3497k4;
    }

    @Override // com.aspose.slides.ITableFormat
    public final float getTransparency() {
        m2880to();
        return m2879kk();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return ((this.f3500x1 & 4294967295L) + (((Table) this.f2127h4).m2868ck().getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Table m2881k4() {
        return (Table) this.f2127h4;
    }

    @Override // com.aspose.slides.ITableFormat
    public final void setTransparency(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new ArgumentException("Value should be defined in the range [0..1].");
        }
        m2880to();
        m2878k4(f);
    }

    /* JADX INFO: renamed from: x1 */
    public final uit m2882x1() {
        if (this.f3499to == null) {
            this.f3499to = new uit(this);
        }
        this.f3499to.m4604k4(uit.class);
        return this.f3499to;
    }

    /* JADX INFO: renamed from: k4 */
    private void m2878k4(float f) {
        IGenericEnumerator<IRow> it = m2881k4().getRows().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<ICell> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().getCellFormat().setTransparency(f);
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
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }
}
