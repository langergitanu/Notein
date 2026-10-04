package com.google.firebase.vertexai.type;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenInlineImage;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "mimeType", "", "([BLjava/lang/String;)V", "getData", "()[B", "getMimeType", "()Ljava/lang/String;", "asBitmap", "Landroid/graphics/Bitmap;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagenInlineImage {
    private final byte[] data;
    private final String mimeType;

    public ImagenInlineImage(byte[] data, String mimeType) {
        OooOOO0.OooO0oO(data, "data");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        this.data = data;
        this.mimeType = mimeType;
    }

    public final Bitmap asBitmap() {
        byte[] bArrDecode = Base64.decode(this.data, 2);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        OooOOO0.OooO0o(bitmapDecodeByteArray, "decodeByteArray(data, 0, data.size)");
        return bitmapDecodeByteArray;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final String getMimeType() {
        return this.mimeType;
    }
}
