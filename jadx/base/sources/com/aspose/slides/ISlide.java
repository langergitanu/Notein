package com.aspose.slides;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.aspose.slides.android.Size;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface ISlide extends IBaseSlide, IOverrideThemeable {
    ISlideHeaderFooterManager getHeaderFooterManager();

    boolean getHidden();

    IImage getImage();

    IImage getImage(float f, float f2);

    IImage getImage(IRenderingOptions iRenderingOptions);

    IImage getImage(IRenderingOptions iRenderingOptions, float f, float f2);

    IImage getImage(IRenderingOptions iRenderingOptions, Size size);

    IImage getImage(ITiffOptions iTiffOptions);

    IImage getImage(Size size);

    ILayoutSlide getLayoutSlide();

    INotesSlideManager getNotesSlideManager();

    IComment[] getSlideComments(ICommentAuthor iCommentAuthor);

    int getSlideNumber();

    @Deprecated
    Bitmap getThumbnail();

    @Deprecated
    Bitmap getThumbnail(float f, float f2);

    @Deprecated
    Bitmap getThumbnail(IRenderingOptions iRenderingOptions);

    @Deprecated
    Bitmap getThumbnail(IRenderingOptions iRenderingOptions, float f, float f2);

    @Deprecated
    Bitmap getThumbnail(IRenderingOptions iRenderingOptions, Size size);

    @Deprecated
    Bitmap getThumbnail(ITiffOptions iTiffOptions);

    @Deprecated
    Bitmap getThumbnail(Size size);

    void remove();

    @Deprecated
    void renderToGraphics(IRenderingOptions iRenderingOptions, Canvas canvas);

    @Deprecated
    void renderToGraphics(IRenderingOptions iRenderingOptions, Canvas canvas, float f, float f2);

    @Deprecated
    void renderToGraphics(IRenderingOptions iRenderingOptions, Canvas canvas, Size size);

    void reset();

    void setHidden(boolean z);

    void setLayoutSlide(ILayoutSlide iLayoutSlide);

    void setSlideNumber(int i);

    void writeAsSvg(OutputStream outputStream);

    void writeAsSvg(OutputStream outputStream, ISVGOptions iSVGOptions);
}
