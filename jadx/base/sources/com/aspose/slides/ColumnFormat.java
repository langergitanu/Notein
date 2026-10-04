package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class ColumnFormat extends DomObject<Column> implements IColumnFormat, InterfaceC14376r6 {

    /* JADX INFO: renamed from: k4 */
    private IPresentationComponent f2002k4;

    /* JADX INFO: renamed from: kk */
    private C13765l7 f2003kk;

    /* JADX INFO: renamed from: x1 */
    private long f2004x1;

    public ColumnFormat(Column column) {
        super(column);
        this.f2004x1 = 1L;
    }

    @Override // com.aspose.slides.IColumnFormat
    public final IColumnFormatEffectiveData getEffective() {
        return m1160kk();
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f2002k4;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, (InterfaceC14397rj) this.f2127h4, iPresentationComponentArr);
            this.f2002k4 = iPresentationComponentArr[0];
        }
        return this.f2002k4;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return ((this.f2004x1 & 4294967295L) + (m1161x1().m2868ck().getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Column m1159k4() {
        return (Column) this.f2127h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13765l7 m1160kk() {
        if (this.f2003kk == null) {
            this.f2003kk = new C13765l7(this);
        }
        this.f2003kk.m4604k4(C13765l7.class);
        return this.f2003kk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final Table m1161x1() {
        return ((Column) this.f2127h4).mo485k4();
    }
}
