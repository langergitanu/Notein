package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o00OooOO.C25159OooO0oO;

/* JADX INFO: loaded from: classes5.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final boolean f67192OooOo0o;

        ImageType(boolean z) {
            this.f67192OooOo0o = z;
        }

        public boolean hasAlpha() {
            return this.f67192OooOo0o;
        }

        public boolean isWebp() {
            int i = OooO00o.f67193OooO00o[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f67193OooO00o;

        static {
            int[] iArr = new int[ImageType.values().length];
            f67193OooO00o = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67193OooO00o[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67193OooO00o[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    int OooO00o(InputStream inputStream, C25159OooO0oO c25159OooO0oO) throws IOException;

    ImageType OooO0O0(InputStream inputStream) throws IOException;

    ImageType OooO0OO(ByteBuffer byteBuffer) throws IOException;

    int OooO0Oo(ByteBuffer byteBuffer, C25159OooO0oO c25159OooO0oO) throws IOException;
}
