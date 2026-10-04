package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class GroupShapeLock extends BaseShapeLock implements IGroupShapeLock {

    /* JADX INFO: renamed from: k4 */
    private static final int f2432k4 = BaseShapeLock.m372k4(0, 12, 1, 2, 3, 4, 5);

    public GroupShapeLock() {
        super(f2432k4);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public boolean getAspectRatioLocked() {
        return m375k4((byte) 3);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public boolean getGroupingLocked() {
        return m375k4((byte) 0);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public boolean getPositionLocked() {
        return m375k4((byte) 4);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public boolean getRotationLocked() {
        return m375k4((byte) 2);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public boolean getSelectLocked() {
        return m375k4((byte) 1);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public boolean getSizeLocked() {
        return m375k4((byte) 5);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public boolean getUngroupingLocked() {
        return m375k4((byte) 12);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public void setAspectRatioLocked(boolean z) {
        m374k4((byte) 3, z);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public void setGroupingLocked(boolean z) {
        m374k4((byte) 0, z);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public void setPositionLocked(boolean z) {
        m374k4((byte) 4, z);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public void setRotationLocked(boolean z) {
        m374k4((byte) 2, z);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public void setSelectLocked(boolean z) {
        m374k4((byte) 1, z);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public void setSizeLocked(boolean z) {
        m374k4((byte) 5, z);
    }

    @Override // com.aspose.slides.IGroupShapeLock
    public void setUngroupingLocked(boolean z) {
        m374k4((byte) 12, z);
    }
}
