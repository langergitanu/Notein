package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: loaded from: classes3.dex */
public final class Field extends DomObject<Portion> implements IField {

    /* JADX INFO: renamed from: k4 */
    private IFieldType f2238k4;

    /* JADX INFO: renamed from: x1 */
    private C13684jg f2239x1;

    public Field(Portion portion, Field field) {
        super(portion);
        this.f2239x1 = new C13684jg();
        m1442k4(new ParagraphFormat(this));
        m1441k4(field);
    }

    /* JADX INFO: renamed from: to */
    private ParagraphFormat m1443to() {
        return (ParagraphFormat) m1444k4().m63301k4();
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        TParent tparent = this.f2127h4;
        if (tparent != 0) {
            return ((IPortion) tparent).getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        TParent tparent = this.f2127h4;
        if (tparent != 0) {
            return ((IPortion) tparent).getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.IField
    public final IFieldType getType() {
        return this.f2238k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13684jg m1444k4() {
        return this.f2239x1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public final Portion m1446kk() {
        return (Portion) this.f2127h4;
    }

    @Override // com.aspose.slides.IField
    public final void setType(IFieldType iFieldType) {
        this.f2238k4 = iFieldType;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14047bz m1447x1() {
        return m1444k4().m63304x1();
    }

    public Field(Portion portion, FieldType fieldType) {
        super(portion);
        this.f2239x1 = new C13684jg();
        this.f2238k4 = fieldType;
        m1445k4(C14047bz.m66536x1().Clone());
        m1442k4(new ParagraphFormat(this));
    }

    /* JADX INFO: renamed from: k4 */
    private void m1441k4(Field field) {
        this.f2238k4 = field.f2238k4;
        m1443to().m2196k4(field.m1443to());
        m1445k4(C14047bz.m66536x1().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m1442k4(ParagraphFormat paragraphFormat) {
        m1444k4().m63302k4(paragraphFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1445k4(C14047bz c14047bz) {
        m1444k4().m63303k4(c14047bz.Clone());
    }
}
