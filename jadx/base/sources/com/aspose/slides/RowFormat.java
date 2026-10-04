package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class RowFormat extends DomObject<Row> implements IRowFormat, InterfaceC14376r6 {

    /* JADX INFO: renamed from: k4 */
    private IPresentationComponent f3255k4;

    /* JADX INFO: renamed from: kk */
    private swa f3256kk;

    /* JADX INFO: renamed from: x1 */
    private final long f3257x1;

    public RowFormat(Row row) {
        super(row);
        this.f3257x1 = 1L;
    }

    @Override // com.aspose.slides.IRowFormat
    public final IRowFormatEffectiveData getEffective() {
        return m2503kk();
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f3255k4;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, (InterfaceC14397rj) this.f2127h4, iPresentationComponentArr);
            this.f3255k4 = iPresentationComponentArr[0];
        }
        return this.f3255k4;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return ((this.f3257x1 & 4294967295L) + (m2504x1().m2868ck().getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Row m2502k4() {
        return (Row) this.f2127h4;
    }

    /* JADX INFO: renamed from: kk */
    public final swa m2503kk() {
        if (this.f3256kk == null) {
            this.f3256kk = new swa(this);
        }
        this.f3256kk.m4604k4(swa.class);
        return this.f3256kk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final Table m2504x1() {
        return ((Row) this.f2127h4).mo485k4();
    }
}
