package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class ConnectorLock extends BaseShapeLock implements IConnectorLock {

    /* JADX INFO: renamed from: k4 */
    private static final int f2052k4 = BaseShapeLock.m372k4(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

    public ConnectorLock() {
        super(f2052k4);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getAdjustHandlesLocked() {
        return m375k4((byte) 7);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getArrowheadsLocked() {
        return m375k4((byte) 8);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getAspectRatioLocked() {
        return m375k4((byte) 3);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getEditPointsLocked() {
        return m375k4((byte) 6);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getGroupingLocked() {
        return m375k4((byte) 0);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getPositionMove() {
        return m375k4((byte) 4);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getRotateLocked() {
        return m375k4((byte) 2);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getSelectLocked() {
        return m375k4((byte) 1);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getShapeTypeLocked() {
        return m375k4((byte) 9);
    }

    @Override // com.aspose.slides.IConnectorLock
    public boolean getSizeLocked() {
        return m375k4((byte) 5);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setAdjustHandlesLocked(boolean z) {
        m374k4((byte) 7, z);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setArrowheadsLocked(boolean z) {
        m374k4((byte) 8, z);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setAspectRatioLocked(boolean z) {
        m374k4((byte) 3, z);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setEditPointsLocked(boolean z) {
        m374k4((byte) 6, z);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setGroupingLocked(boolean z) {
        m374k4((byte) 0, z);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setPositionMove(boolean z) {
        m374k4((byte) 4, z);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setRotateLocked(boolean z) {
        m374k4((byte) 2, z);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setSelectLocked(boolean z) {
        m374k4((byte) 1, z);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setShapeTypeLocked(boolean z) {
        m374k4((byte) 9, z);
    }

    @Override // com.aspose.slides.IConnectorLock
    public void setSizeLocked(boolean z) {
        m374k4((byte) 5, z);
    }
}
