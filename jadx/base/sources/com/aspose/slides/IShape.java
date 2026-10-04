package com.aspose.slides;

import android.graphics.Bitmap;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IShape extends IHyperlinkContainer, ISlideComponent {
    IPlaceholder addPlaceholder(IPlaceholder iPlaceholder);

    String getAlternativeText();

    String getAlternativeTextTitle();

    IShape getBasePlaceholder();

    byte getBlackWhiteMode();

    int getConnectionSiteCount();

    ICustomData getCustomData();

    IEffectFormat getEffectFormat();

    IFillFormat getFillFormat();

    IShapeFrame getFrame();

    float getHeight();

    boolean getHidden();

    IImage getImage();

    IImage getImage(int i, float f, float f2);

    ILineFormat getLineFormat();

    String getName();

    long getOfficeInteropShapeId();

    IGroupShape getParentGroup();

    IPlaceholder getPlaceholder();

    IShapeFrame getRawFrame();

    float getRotation();

    IBaseShapeLock getShapeLock();

    IThreeDFormat getThreeDFormat();

    @Deprecated
    Bitmap getThumbnail();

    @Deprecated
    Bitmap getThumbnail(int i, float f, float f2);

    long getUniqueId();

    float getWidth();

    float getX();

    float getY();

    int getZOrderPosition();

    boolean isDecorative();

    boolean isGrouped();

    boolean isTextHolder();

    void removePlaceholder();

    void setAlternativeText(String str);

    void setAlternativeTextTitle(String str);

    void setBlackWhiteMode(byte b);

    void setDecorative(boolean z);

    void setFrame(IShapeFrame iShapeFrame);

    void setHeight(float f);

    void setHidden(boolean z);

    void setName(String str);

    void setRawFrame(IShapeFrame iShapeFrame);

    void setRotation(float f);

    void setWidth(float f);

    void setX(float f);

    void setY(float f);

    void writeAsSvg(OutputStream outputStream);

    void writeAsSvg(OutputStream outputStream, ISVGOptions iSVGOptions);
}
