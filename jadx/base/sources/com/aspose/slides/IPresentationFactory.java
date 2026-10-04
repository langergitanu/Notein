package com.aspose.slides;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IPresentationFactory {
    IPresentation createPresentation();

    IPresentation createPresentation(ILoadOptions iLoadOptions);

    IPresentationInfo getPresentationInfo(InputStream inputStream);

    IPresentationInfo getPresentationInfo(String str);

    IPresentationText getPresentationText(InputStream inputStream, int i);

    IPresentationText getPresentationText(InputStream inputStream, int i, ILoadOptions iLoadOptions);

    IPresentationText getPresentationText(String str, int i);

    IPresentation readPresentation(InputStream inputStream);

    IPresentation readPresentation(InputStream inputStream, ILoadOptions iLoadOptions);

    IPresentation readPresentation(String str);

    IPresentation readPresentation(String str, ILoadOptions iLoadOptions);

    IPresentation readPresentation(byte[] bArr);

    IPresentation readPresentation(byte[] bArr, ILoadOptions iLoadOptions);
}
