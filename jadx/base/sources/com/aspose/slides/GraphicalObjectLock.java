package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class GraphicalObjectLock extends BaseShapeLock implements IGraphicalObjectLock {

    /* JADX INFO: renamed from: k4 */
    private static final int f2427k4 = BaseShapeLock.m372k4(0, 13, 1, 3, 4, 5);

    public GraphicalObjectLock() {
        super(f2427k4);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public boolean getAspectRatioLocked() {
        return m375k4((byte) 3);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public boolean getDrilldownLocked() {
        return m375k4((byte) 13);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public boolean getGroupingLocked() {
        return m375k4((byte) 0);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public boolean getPositionLocked() {
        return m375k4((byte) 4);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public boolean getSelectLocked() {
        return m375k4((byte) 1);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public boolean getSizeLocked() {
        return m375k4((byte) 5);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public void setAspectRatioLocked(boolean z) {
        m374k4((byte) 3, z);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public void setDrilldownLocked(boolean z) {
        m374k4((byte) 13, z);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public void setGroupingLocked(boolean z) {
        m374k4((byte) 0, z);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public void setPositionLocked(boolean z) {
        m374k4((byte) 4, z);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public void setSelectLocked(boolean z) {
        m374k4((byte) 1, z);
    }

    @Override // com.aspose.slides.IGraphicalObjectLock
    public void setSizeLocked(boolean z) {
        m374k4((byte) 5, z);
    }
}
