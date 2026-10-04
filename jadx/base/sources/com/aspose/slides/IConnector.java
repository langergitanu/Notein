package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IConnector extends IGeometryShape {
    IConnectorLock getConnectorLock();

    IShape getEndShapeConnectedTo();

    long getEndShapeConnectionSiteIndex();

    @Override // com.aspose.slides.IShape
    IConnectorLock getShapeLock();

    IShape getStartShapeConnectedTo();

    long getStartShapeConnectionSiteIndex();

    void reroute();

    void setEndShapeConnectedTo(IShape iShape);

    void setEndShapeConnectionSiteIndex(long j);

    void setStartShapeConnectedTo(IShape iShape);

    void setStartShapeConnectionSiteIndex(long j);
}
