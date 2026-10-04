package com.aspose.slides;

import android.graphics.Bitmap;
import com.aspose.slides.android.Size;
import com.aspose.slides.p559ms.System.IDisposable;
import java.io.OutputStream;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public interface IPresentation extends IPresentationComponent, IDisposable {
    ICustomXmlPart[] getAllCustomXmlParts();

    IAudioCollection getAudios();

    ICommentAuthorCollection getCommentAuthors();

    Date getCurrentDateTime();

    ICustomData getCustomData();

    ITextStyle getDefaultTextStyle();

    IDigitalSignatureCollection getDigitalSignatures();

    IDocumentProperties getDocumentProperties();

    int getFirstSlideNumber();

    IFontsManager getFontsManager();

    IPresentationHeaderFooterManager getHeaderFooterManager();

    IHyperlinkQueries getHyperlinkQueries();

    IImageCollection getImages();

    IImage[] getImages(IRenderingOptions iRenderingOptions);

    IImage[] getImages(IRenderingOptions iRenderingOptions, float f, float f2);

    IImage[] getImages(IRenderingOptions iRenderingOptions, Size size);

    IImage[] getImages(IRenderingOptions iRenderingOptions, int[] iArr);

    IImage[] getImages(IRenderingOptions iRenderingOptions, int[] iArr, float f, float f2);

    IImage[] getImages(IRenderingOptions iRenderingOptions, int[] iArr, Size size);

    IGlobalLayoutSlideCollection getLayoutSlides();

    IMasterHandoutSlideManager getMasterHandoutSlideManager();

    IMasterNotesSlideManager getMasterNotesSlideManager();

    IMasterTheme getMasterTheme();

    IMasterSlideCollection getMasters();

    INotesSize getNotesSize();

    IProtectionManager getProtectionManager();

    ISectionCollection getSections();

    IBaseSlide getSlideById(long j);

    ISlideSize getSlideSize();

    ISlideCollection getSlides();

    int getSourceFormat();

    @Deprecated
    Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions);

    @Deprecated
    Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, float f, float f2);

    @Deprecated
    Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, Size size);

    @Deprecated
    Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, int[] iArr);

    @Deprecated
    Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, int[] iArr, float f, float f2);

    @Deprecated
    Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, int[] iArr, Size size);

    IVbaProject getVbaProject();

    IVideoCollection getVideos();

    IViewProperties getViewProperties();

    void highlightRegex(Pattern pattern, Integer num, IFindResultCallback iFindResultCallback);

    void highlightText(String str, Integer num);

    void highlightText(String str, Integer num, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback);

    void joinPortionsWithSameFormatting();

    void replaceRegex(Pattern pattern, String str, IFindResultCallback iFindResultCallback);

    void replaceText(String str, String str2, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback);

    void save(IXamlOptions iXamlOptions);

    void save(OutputStream outputStream, int i);

    void save(OutputStream outputStream, int i, ISaveOptions iSaveOptions);

    void save(OutputStream outputStream, int[] iArr, int i);

    void save(OutputStream outputStream, int[] iArr, int i, ISaveOptions iSaveOptions);

    void save(String str, int i);

    void save(String str, int i, ISaveOptions iSaveOptions);

    void save(String str, int[] iArr, int i);

    void save(String str, int[] iArr, int i, ISaveOptions iSaveOptions);

    void setCurrentDateTime(Date date);

    void setFirstSlideNumber(int i);

    void setVbaProject(IVbaProject iVbaProject);
}
