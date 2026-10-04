package com.aspose.slides;

import android.graphics.Bitmap;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IImageCollection extends IGenericCollection<IPPImage> {
    @Deprecated
    IPPImage addImage(Bitmap bitmap);

    IPPImage addImage(IImage iImage);

    IPPImage addImage(IPPImage iPPImage);

    IPPImage addImage(ISvgImage iSvgImage);

    IPPImage addImage(InputStream inputStream);

    IPPImage addImage(InputStream inputStream, int i);

    IPPImage addImage(byte[] bArr);

    IPPImage get_Item(int i);
}
