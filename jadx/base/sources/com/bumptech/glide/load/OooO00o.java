package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.huawei.hms.network.embedded.C18240k4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o00OooOO.C25159OooO0oO;
import o00o000.OooOo;
import o00o0O0.C25308OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o {
    public static int OooO00o(ArrayList arrayList, InputStream inputStream, C25159OooO0oO c25159OooO0oO) throws IOException {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new OooOo(inputStream, c25159OooO0oO);
            }
            inputStream.mark(C18240k4.f55418l);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iOooO00o = ((ImageHeaderParser) arrayList.get(i)).OooO00o(inputStream, c25159OooO0oO);
                    if (iOooO00o != -1) {
                        return iOooO00o;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType OooO0O0(ArrayList arrayList, InputStream inputStream, C25159OooO0oO c25159OooO0oO) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new OooOo(inputStream, c25159OooO0oO);
        }
        inputStream.mark(C18240k4.f55418l);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeOooO0O0 = ((ImageHeaderParser) arrayList.get(i)).OooO0O0(inputStream);
                inputStream.reset();
                if (imageTypeOooO0O0 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeOooO0O0;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType OooO0OO(ArrayList arrayList, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeOooO0OO = ((ImageHeaderParser) arrayList.get(i)).OooO0OO(byteBuffer);
                AtomicReference<byte[]> atomicReference = C25308OooO00o.f86137OooO00o;
                if (imageTypeOooO0OO != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeOooO0OO;
                }
            } catch (Throwable th) {
                AtomicReference<byte[]> atomicReference2 = C25308OooO00o.f86137OooO00o;
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
