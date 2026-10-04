package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class CommandEffect extends Behavior implements ICommandEffect {

    /* JADX INFO: renamed from: du */
    byte f2005du;

    /* JADX INFO: renamed from: h4 */
    String f2006h4;

    /* JADX INFO: renamed from: m9 */
    Shape f2007m9;

    public CommandEffect() {
        super(new C13717k8());
    }

    @Override // com.aspose.slides.ICommandEffect
    public final String getCommandString() {
        return this.f2006h4;
    }

    @Override // com.aspose.slides.ICommandEffect
    public final IShape getShapeTarget() {
        return this.f2007m9;
    }

    @Override // com.aspose.slides.ICommandEffect
    public final byte getType() {
        return this.f2005du;
    }

    @Override // com.aspose.slides.ICommandEffect
    public final void setCommandString(String str) {
        this.f2006h4 = str;
    }

    @Override // com.aspose.slides.ICommandEffect
    public final void setShapeTarget(IShape iShape) {
        this.f2007m9 = (Shape) iShape;
    }

    @Override // com.aspose.slides.ICommandEffect
    public final void setType(byte b) {
        this.f2005du = b;
    }

    @Override // com.aspose.slides.Behavior
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final C13717k8 mo424k4() {
        return (C13717k8) super.mo424k4();
    }
}
