package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class GraphicalObject extends Shape implements IGraphicalObject {
    public GraphicalObject(InterfaceC14397rj interfaceC14397rj) {
        this(interfaceC14397rj, new C13722kb(), new C13815lz());
    }

    /* JADX INFO: renamed from: k4 */
    public static GraphicalObject m1636k4(InterfaceC14397rj interfaceC14397rj) {
        GraphicalObject graphicalObject = new GraphicalObject(interfaceC14397rj);
        graphicalObject.m2560k4((er8) null);
        return graphicalObject;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: fa */
    public boolean mo278fa() {
        return true;
    }

    @Override // com.aspose.slides.IGraphicalObject
    public final IGraphicalObjectLock getGraphicalObjectLock() {
        return (IGraphicalObjectLock) super.getShapeLock();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public C13815lz mo1638uz() {
        return (C13815lz) super.mo1638uz();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: x6, reason: merged with bridge method [inline-methods] */
    public C13722kb mo272to() {
        return (C13722kb) super.mo272to();
    }

    public GraphicalObject(InterfaceC14397rj interfaceC14397rj, C13722kb c13722kb) {
        this(interfaceC14397rj, c13722kb, new C13815lz());
    }

    public GraphicalObject(InterfaceC14397rj interfaceC14397rj, C13722kb c13722kb, C13815lz c13815lz) {
        super(interfaceC14397rj, c13722kb, c13815lz, new GraphicalObjectLock());
        m2562k4(new nd1());
    }
}
