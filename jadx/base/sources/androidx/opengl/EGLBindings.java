package androidx.opengl;

import android.hardware.HardwareBuffer;
import com.huawei.hms.network.embedded.C18437z2;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Landroidx/opengl/EGLBindings;", "", "<init>", "()V", "Companion", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class EGLBindings {

    @Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0087 ¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\nH\u0087 ¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b \u0010!J \u0010\"\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\"\u0010#J \u0010$\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u001bH\u0087 ¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001bH\u0087 ¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u001bH\u0087 ¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\u001bH\u0087 ¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u001bH\u0087 ¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u001bH\u0087 ¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\u001bH\u0087 ¢\u0006\u0004\b,\u0010&J\u0010\u0010-\u001a\u00020\u001bH\u0087 ¢\u0006\u0004\b-\u0010&J\u0010\u0010.\u001a\u00020\u001bH\u0087 ¢\u0006\u0004\b.\u0010&J\u0018\u00100\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b0\u00101¨\u00062"}, m80612d2 = {"Landroidx/opengl/EGLBindings$Companion;", "", "<init>", "()V", "", "eglDisplayPtr", "Landroid/hardware/HardwareBuffer;", "hardwareBuffer", "nCreateImageFromHardwareBuffer", "(JLandroid/hardware/HardwareBuffer;)J", "", "target", "eglImagePtr", "LoO00ooO/OooOooO;", "nImageTargetTexture2DOES", "(IJ)V", "syncPtr", "nDupNativeFenceFDANDROID", "(JJ)I", C18437z2.f56754h, "", "attrs", "nCreateSyncKHR", "(JI[I)J", "attrib", "result", "offset", "", "nGetSyncAttribKHR", "(JJI[II)Z", "flags", "timeout", "nClientWaitSyncKHR", "(JJIJ)I", "nDestroySyncKHR", "(JJ)Z", "nDestroyImageKHR", "nSupportsEglGetNativeClientBufferAndroid", "()Z", "nSupportsDupNativeFenceFDANDROID", "nSupportsEglCreateImageKHR", "nSupportsEglDestroyImageKHR", "nSupportsGlImageTargetTexture2DOES", "nSupportsEglCreateSyncKHR", "nSupportsEglGetSyncAttribKHR", "nSupportsEglClientWaitSyncKHR", "nSupportsEglDestroySyncKHR", "timeoutNanos", "nEqualToNativeForeverTimeout", "(J)Z", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public final int nClientWaitSyncKHR(long eglDisplayPtr, long syncPtr, int flags, long timeout) {
            return EGLBindings.nClientWaitSyncKHR(eglDisplayPtr, syncPtr, flags, timeout);
        }

        public final long nCreateImageFromHardwareBuffer(long eglDisplayPtr, HardwareBuffer hardwareBuffer) {
            return EGLBindings.nCreateImageFromHardwareBuffer(eglDisplayPtr, hardwareBuffer);
        }

        public final long nCreateSyncKHR(long eglDisplayPtr, int type, int[] attrs) {
            return EGLBindings.nCreateSyncKHR(eglDisplayPtr, type, attrs);
        }

        public final boolean nDestroyImageKHR(long eglDisplayPtr, long eglImagePtr) {
            return EGLBindings.nDestroyImageKHR(eglDisplayPtr, eglImagePtr);
        }

        public final boolean nDestroySyncKHR(long eglDisplayPtr, long syncPtr) {
            return EGLBindings.nDestroySyncKHR(eglDisplayPtr, syncPtr);
        }

        public final int nDupNativeFenceFDANDROID(long eglDisplayPtr, long syncPtr) {
            return EGLBindings.nDupNativeFenceFDANDROID(eglDisplayPtr, syncPtr);
        }

        public final boolean nEqualToNativeForeverTimeout(long timeoutNanos) {
            return EGLBindings.nEqualToNativeForeverTimeout(timeoutNanos);
        }

        public final boolean nGetSyncAttribKHR(long eglDisplayPtr, long syncPtr, int attrib, int[] result, int offset) {
            return EGLBindings.nGetSyncAttribKHR(eglDisplayPtr, syncPtr, attrib, result, offset);
        }

        public final void nImageTargetTexture2DOES(int target, long eglImagePtr) {
            EGLBindings.nImageTargetTexture2DOES(target, eglImagePtr);
        }

        public final boolean nSupportsDupNativeFenceFDANDROID() {
            return EGLBindings.nSupportsDupNativeFenceFDANDROID();
        }

        public final boolean nSupportsEglClientWaitSyncKHR() {
            return EGLBindings.nSupportsEglClientWaitSyncKHR();
        }

        public final boolean nSupportsEglCreateImageKHR() {
            return EGLBindings.nSupportsEglCreateImageKHR();
        }

        public final boolean nSupportsEglCreateSyncKHR() {
            return EGLBindings.nSupportsEglCreateSyncKHR();
        }

        public final boolean nSupportsEglDestroyImageKHR() {
            return EGLBindings.nSupportsEglDestroyImageKHR();
        }

        public final boolean nSupportsEglDestroySyncKHR() {
            return EGLBindings.nSupportsEglDestroySyncKHR();
        }

        public final boolean nSupportsEglGetNativeClientBufferAndroid() {
            return EGLBindings.nSupportsEglGetNativeClientBufferAndroid();
        }

        public final boolean nSupportsEglGetSyncAttribKHR() {
            return EGLBindings.nSupportsEglGetSyncAttribKHR();
        }

        public final boolean nSupportsGlImageTargetTexture2DOES() {
            return EGLBindings.nSupportsGlImageTargetTexture2DOES();
        }
    }

    static {
        new Companion();
        System.loadLibrary("graphics-core");
    }

    public static final native int nClientWaitSyncKHR(long j, long j2, int i, long j3);

    public static final native long nCreateImageFromHardwareBuffer(long j, HardwareBuffer hardwareBuffer);

    public static final native long nCreateSyncKHR(long j, int i, int[] iArr);

    public static final native boolean nDestroyImageKHR(long j, long j2);

    public static final native boolean nDestroySyncKHR(long j, long j2);

    public static final native int nDupNativeFenceFDANDROID(long j, long j2);

    public static final native boolean nEqualToNativeForeverTimeout(long j);

    public static final native boolean nGetSyncAttribKHR(long j, long j2, int i, int[] iArr, int i2);

    public static final native void nImageTargetTexture2DOES(int i, long j);

    public static final native boolean nSupportsDupNativeFenceFDANDROID();

    public static final native boolean nSupportsEglClientWaitSyncKHR();

    public static final native boolean nSupportsEglCreateImageKHR();

    public static final native boolean nSupportsEglCreateSyncKHR();

    public static final native boolean nSupportsEglDestroyImageKHR();

    public static final native boolean nSupportsEglDestroySyncKHR();

    public static final native boolean nSupportsEglGetNativeClientBufferAndroid();

    public static final native boolean nSupportsEglGetSyncAttribKHR();

    public static final native boolean nSupportsGlImageTargetTexture2DOES();
}
