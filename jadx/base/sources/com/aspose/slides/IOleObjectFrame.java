package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IOleObjectFrame extends IGraphicalObject {
    IOleEmbeddedDataInfo getEmbeddedData();

    String getEmbeddedFileLabel();

    String getEmbeddedFileName();

    String getLinkFileName();

    String getLinkPathLong();

    String getLinkPathRelative();

    String getObjectName();

    String getObjectProgId();

    IPictureFillFormat getSubstitutePictureFormat();

    String getSubstitutePictureTitle();

    boolean getUpdateAutomatic();

    boolean isObjectIcon();

    boolean isObjectLink();

    void setEmbeddedData(IOleEmbeddedDataInfo iOleEmbeddedDataInfo);

    void setLinkPathLong(String str);

    void setObjectIcon(boolean z);

    void setObjectName(String str);

    void setObjectProgId(String str);

    void setSubstitutePictureTitle(String str);

    void setUpdateAutomatic(boolean z);
}
