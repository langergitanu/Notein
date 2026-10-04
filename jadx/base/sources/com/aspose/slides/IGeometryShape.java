package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IGeometryShape extends IShape {
    IShapeElement[] createShapeElements();

    IAdjustValueCollection getAdjustments();

    IGeometryPath[] getGeometryPaths();

    IShapeStyle getShapeStyle();

    int getShapeType();

    void setGeometryPath(IGeometryPath iGeometryPath);

    void setGeometryPaths(IGeometryPath[] iGeometryPathArr);

    void setShapeType(int i);
}
