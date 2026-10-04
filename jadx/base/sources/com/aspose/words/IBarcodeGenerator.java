package com.aspose.words;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public interface IBarcodeGenerator {
    Bitmap getBarcodeImage(BarcodeParameters barcodeParameters) throws Exception;

    Bitmap getOldBarcodeImage(BarcodeParameters barcodeParameters) throws Exception;
}
