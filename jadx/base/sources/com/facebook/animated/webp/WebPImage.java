package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.OooO0OO;
import java.nio.ByteBuffer;
import o00oOoo0.C25627OooO0O0;
import o00oOoo0.InterfaceC25628OooO0OO;
import o00oOooo.InterfaceC25633OooO0O0;
import o00oo0O.C25651OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class WebPImage implements InterfaceC25628OooO0OO, InterfaceC25633OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Bitmap.Config f67231OooO00o = null;
    private long mNativeContext;

    public WebPImage() {
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // o00oOoo0.InterfaceC25628OooO0OO
    public final int[] OooO() {
        return nativeGetFrameDurations();
    }

    @Override // o00oOoo0.InterfaceC25628OooO0OO
    public final int OooO00o() {
        return nativeGetLoopCount();
    }

    @Override // o00oOoo0.InterfaceC25628OooO0OO
    public final int OooO0O0() {
        return nativeGetFrameCount();
    }

    @Override // o00oOooo.InterfaceC25633OooO0O0
    public final WebPImage OooO0OO(ByteBuffer byteBuffer, C25651OooO00o c25651OooO00o) {
        OooO0OO.OooO00o();
        byteBuffer.rewind();
        WebPImage webPImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (c25651OooO00o != null) {
            webPImageNativeCreateFromDirectByteBuffer.f67231OooO00o = c25651OooO00o.f87564OooO0O0;
        }
        return webPImageNativeCreateFromDirectByteBuffer;
    }

    @Override // o00oOooo.InterfaceC25633OooO0O0
    public final WebPImage OooO0Oo(long j, int i, C25651OooO00o c25651OooO00o) {
        OooO0OO.OooO00o();
        if (!(j != 0)) {
            throw new IllegalArgumentException();
        }
        WebPImage webPImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        if (c25651OooO00o != null) {
            webPImageNativeCreateFromNativeMemory.f67231OooO00o = c25651OooO00o.f87564OooO0O0;
        }
        return webPImageNativeCreateFromNativeMemory;
    }

    @Override // o00oOoo0.InterfaceC25628OooO0OO
    public final WebPFrame OooO0o(int i) {
        return nativeGetFrame(i);
    }

    @Override // o00oOoo0.InterfaceC25628OooO0OO
    public final int OooO0o0() {
        return nativeGetSizeInBytes();
    }

    @Override // o00oOoo0.InterfaceC25628OooO0OO
    public final C25627OooO0O0 OooO0oO(int i) {
        WebPFrame webPFrameNativeGetFrame = nativeGetFrame(i);
        try {
            C25627OooO0O0 c25627OooO0O0 = new C25627OooO0O0(webPFrameNativeGetFrame.OooO0Oo(), webPFrameNativeGetFrame.OooO0o0(), webPFrameNativeGetFrame.OooO0OO(), webPFrameNativeGetFrame.OooO0O0(), webPFrameNativeGetFrame.OooO0o() ? C25627OooO0O0.OooO00o.f87468OooOo0o : C25627OooO0O0.OooO00o.f87467OooOo, webPFrameNativeGetFrame.OooO0oo() ? C25627OooO0O0.EnumC19713OooO0O0.f87470OooOo : C25627OooO0O0.EnumC19713OooO0O0.f87471OooOo0o);
            webPFrameNativeGetFrame.OooO00o();
            return c25627OooO0O0;
        } catch (Throwable th) {
            webPFrameNativeGetFrame.OooO00o();
            throw th;
        }
    }

    @Override // o00oOoo0.InterfaceC25628OooO0OO
    public final Bitmap.Config OooO0oo() {
        return this.f67231OooO00o;
    }

    public final void finalize() {
        nativeFinalize();
    }

    @Override // o00oOoo0.InterfaceC25628OooO0OO
    public final int getHeight() {
        return nativeGetHeight();
    }

    @Override // o00oOoo0.InterfaceC25628OooO0OO
    public final int getWidth() {
        return nativeGetWidth();
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }
}
