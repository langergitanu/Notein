package com.aspose.slides;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IShapeCollection extends IGenericCollection<IShape> {
    IAudioFrame addAudioFrameCD(float f, float f2, float f3, float f4);

    IAudioFrame addAudioFrameEmbedded(float f, float f2, float f3, float f4, IAudio iAudio);

    IAudioFrame addAudioFrameEmbedded(float f, float f2, float f3, float f4, InputStream inputStream);

    IAudioFrame addAudioFrameLinked(float f, float f2, float f3, float f4, String str);

    IAutoShape addAutoShape(int i, float f, float f2, float f3, float f4);

    IAutoShape addAutoShape(int i, float f, float f2, float f3, float f4, boolean z);

    IChart addChart(int i, float f, float f2, float f3, float f4);

    IChart addChart(int i, float f, float f2, float f3, float f4, boolean z);

    IShape addClone(IShape iShape);

    IShape addClone(IShape iShape, float f, float f2);

    IShape addClone(IShape iShape, float f, float f2, float f3, float f4);

    IConnector addConnector(int i, float f, float f2, float f3, float f4);

    IConnector addConnector(int i, float f, float f2, float f3, float f4, boolean z);

    IGroupShape addGroupShape();

    IGroupShape addGroupShape(ISvgImage iSvgImage, float f, float f2, float f3, float f4);

    IAutoShape addMathShape(float f, float f2, float f3, float f4);

    IOleObjectFrame addOleObjectFrame(float f, float f2, float f3, float f4, IOleEmbeddedDataInfo iOleEmbeddedDataInfo);

    IOleObjectFrame addOleObjectFrame(float f, float f2, float f3, float f4, String str, String str2);

    IPictureFrame addPictureFrame(int i, float f, float f2, float f3, float f4, IPPImage iPPImage);

    ISectionZoomFrame addSectionZoomFrame(float f, float f2, float f3, float f4, ISection iSection);

    ISectionZoomFrame addSectionZoomFrame(float f, float f2, float f3, float f4, ISection iSection, IPPImage iPPImage);

    ISmartArt addSmartArt(float f, float f2, float f3, float f4, int i);

    ISummaryZoomFrame addSummaryZoomFrame(float f, float f2, float f3, float f4);

    ITable addTable(float f, float f2, double[] dArr, double[] dArr2);

    IVideoFrame addVideoFrame(float f, float f2, float f3, float f4, IVideo iVideo);

    IVideoFrame addVideoFrame(float f, float f2, float f3, float f4, String str);

    IZoomFrame addZoomFrame(float f, float f2, float f3, float f4, ISlide iSlide);

    IZoomFrame addZoomFrame(float f, float f2, float f3, float f4, ISlide iSlide, IPPImage iPPImage);

    void clear();

    IGroupShape getParentGroup();

    IShape get_Item(int i);

    int indexOf(IShape iShape);

    IAudioFrame insertAudioFrameCD(int i, float f, float f2, float f3, float f4);

    IAudioFrame insertAudioFrameEmbedded(int i, float f, float f2, float f3, float f4, IAudio iAudio);

    IAudioFrame insertAudioFrameEmbedded(int i, float f, float f2, float f3, float f4, InputStream inputStream);

    IAudioFrame insertAudioFrameLinked(int i, float f, float f2, float f3, float f4, String str);

    IAutoShape insertAutoShape(int i, int i2, float f, float f2, float f3, float f4);

    IAutoShape insertAutoShape(int i, int i2, float f, float f2, float f3, float f4, boolean z);

    IChart insertChart(int i, float f, float f2, float f3, float f4, int i2);

    IChart insertChart(int i, float f, float f2, float f3, float f4, int i2, boolean z);

    IShape insertClone(int i, IShape iShape);

    IShape insertClone(int i, IShape iShape, float f, float f2);

    IShape insertClone(int i, IShape iShape, float f, float f2, float f3, float f4);

    IConnector insertConnector(int i, int i2, float f, float f2, float f3, float f4);

    IConnector insertConnector(int i, int i2, float f, float f2, float f3, float f4, boolean z);

    IGroupShape insertGroupShape(int i);

    IOleObjectFrame insertOleObjectFrame(int i, float f, float f2, float f3, float f4, IOleEmbeddedDataInfo iOleEmbeddedDataInfo);

    IOleObjectFrame insertOleObjectFrame(int i, float f, float f2, float f3, float f4, String str, String str2);

    IPictureFrame insertPictureFrame(int i, int i2, float f, float f2, float f3, float f4, IPPImage iPPImage);

    ISectionZoomFrame insertSectionZoomFrame(int i, float f, float f2, float f3, float f4, ISection iSection);

    ISectionZoomFrame insertSectionZoomFrame(int i, float f, float f2, float f3, float f4, ISection iSection, IPPImage iPPImage);

    ISummaryZoomFrame insertSummaryZoomFrame(int i, float f, float f2, float f3, float f4);

    ITable insertTable(int i, float f, float f2, double[] dArr, double[] dArr2);

    IVideoFrame insertVideoFrame(int i, float f, float f2, float f3, float f4, String str);

    IZoomFrame insertZoomFrame(int i, float f, float f2, float f3, float f4, ISlide iSlide);

    IZoomFrame insertZoomFrame(int i, float f, float f2, float f3, float f4, ISlide iSlide, IPPImage iPPImage);

    void remove(IShape iShape);

    void removeAt(int i);

    void reorder(int i, IShape iShape);

    void reorder(int i, IShape... iShapeArr);

    IShape[] toArray();

    IShape[] toArray(int i, int i2);
}
