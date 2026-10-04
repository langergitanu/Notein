package androidx.graphics.surface;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.view.Surface;
import androidx.graphics.surface.SurfaceControlCompat;
import androidx.hardware.SyncFenceV19;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Landroidx/graphics/surface/JniBindings;", "", "<init>", "()V", "Companion", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class JniBindings {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Companion f65114OooO00o = new Companion();

    @Metadata(m80611d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0015\u0010\u0010J(\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0087 ¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001dH\u0087 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0087 ¢\u0006\u0004\b#\u0010$J2\u0010(\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020 H\u0087 ¢\u0006\u0004\b(\u0010)JH\u0010/\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\"H\u0087 ¢\u0006\u0004\b/\u00100J(\u00103\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0087 ¢\u0006\u0004\b3\u00104J(\u00106\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00105\u001a\u00020\"H\u0087 ¢\u0006\u0004\b6\u00107J*\u0010:\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u000108H\u0087 ¢\u0006\u0004\b:\u0010;J \u0010=\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b=\u0010>J(\u0010@\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u000201H\u0087 ¢\u0006\u0004\b@\u00104J(\u0010C\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010B\u001a\u00020AH\u0087 ¢\u0006\u0004\bC\u0010DJ@\u0010I\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\"2\u0006\u0010F\u001a\u00020\"2\u0006\u0010G\u001a\u00020\"2\u0006\u0010H\u001a\u00020\"H\u0087 ¢\u0006\u0004\bI\u0010JJ0\u0010M\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020AH\u0087 ¢\u0006\u0004\bM\u0010NJ0\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010O\u001a\u00020A2\u0006\u0010P\u001a\u00020AH\u0087 ¢\u0006\u0004\bQ\u0010NJ(\u0010R\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\"H\u0087 ¢\u0006\u0004\bR\u00107J(\u0010T\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\"H\u0087 ¢\u0006\u0004\bT\u00107J\u0010\u0010U\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u0006H\u0087 ¢\u0006\u0004\bW\u0010VJ\u0010\u0010Y\u001a\u00020XH\u0087 ¢\u0006\u0004\bY\u0010ZJ \u0010\\\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\\\u0010]J8\u0010a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010^\u001a\u00020A2\u0006\u0010_\u001a\u00020\"2\u0006\u0010`\u001a\u00020\"H\u0087 ¢\u0006\u0004\ba\u0010b¨\u0006c"}, m80612d2 = {"Landroidx/graphics/surface/JniBindings$Companion;", "", "<init>", "()V", "", "surfaceControl", "", "debugName", "nCreate", "(JLjava/lang/String;)J", "Landroid/view/Surface;", "surface", "nCreateFromSurface", "(Landroid/view/Surface;Ljava/lang/String;)J", "LoO00ooO/OooOooO;", "nRelease", "(J)V", "nTransactionCreate", "()J", "surfaceTransaction", "nTransactionDelete", "nTransactionApply", "newParent", "nTransactionReparent", "(JJJ)V", "Landroidx/graphics/surface/SurfaceControlCompat$TransactionCompletedListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "nTransactionSetOnComplete", "(JLandroidx/graphics/surface/SurfaceControlCompat$TransactionCompletedListener;)V", "Landroidx/graphics/surface/SurfaceControlCompat$TransactionCommittedListener;", "nTransactionSetOnCommit", "(JLandroidx/graphics/surface/SurfaceControlCompat$TransactionCommittedListener;)V", "Landroidx/hardware/SyncFenceV19;", "syncFence", "", "nDupFenceFd", "(Landroidx/hardware/SyncFenceV19;)I", "Landroid/hardware/HardwareBuffer;", "hardwareBuffer", "acquireFieldFd", "nSetBuffer", "(JJLandroid/hardware/HardwareBuffer;Landroidx/hardware/SyncFenceV19;)V", "bufferWidth", "bufferHeight", "dstWidth", "dstHeight", "transformation", "nSetGeometry", "(JJIIIII)V", "", "visibility", "nSetVisibility", "(JJB)V", "zOrder", "nSetZOrder", "(JJI)V", "Landroid/graphics/Rect;", DrawToolFactory.LASSO_TYPE_RECT, "nSetDamageRegion", "(JJLandroid/graphics/Rect;)V", "desiredPresentTime", "nSetDesiredPresentTime", "(JJ)V", "transparency", "nSetBufferTransparency", "", "alpha", "nSetBufferAlpha", "(JJF)V", "left", "top", "right", "bottom", "nSetCrop", "(JJIIII)V", "x", "y", "nSetPosition", "(JJFF)V", "scaleX", "scaleY", "nSetScale", "nSetBufferTransform", "dataSpace", "nSetDataSpace", "nGetSurfaceFlingerOrientation", "()Ljava/lang/String;", "nGetMinUiRotation", "", "nIsHwuiUsingVulkanRenderer", "()Z", "transactionStats", "nGetPreviousReleaseFenceFd", "(JJ)I", "frameRate", "compatibility", "changeFrameRateStrategy", "nSetFrameRate", "(JJFII)V", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public final long nCreate(long surfaceControl, String debugName) {
            return JniBindings.nCreate(surfaceControl, debugName);
        }

        public final long nCreateFromSurface(Surface surface, String debugName) {
            return JniBindings.nCreateFromSurface(surface, debugName);
        }

        public final int nDupFenceFd(SyncFenceV19 syncFence) {
            return JniBindings.nDupFenceFd(syncFence);
        }

        public final String nGetMinUiRotation() {
            return JniBindings.nGetMinUiRotation();
        }

        public final int nGetPreviousReleaseFenceFd(long surfaceControl, long transactionStats) {
            return JniBindings.nGetPreviousReleaseFenceFd(surfaceControl, transactionStats);
        }

        public final String nGetSurfaceFlingerOrientation() {
            return JniBindings.nGetSurfaceFlingerOrientation();
        }

        public final boolean nIsHwuiUsingVulkanRenderer() {
            return JniBindings.nIsHwuiUsingVulkanRenderer();
        }

        public final void nRelease(long surfaceControl) {
            JniBindings.nRelease(surfaceControl);
        }

        public final void nSetBuffer(long surfaceTransaction, long surfaceControl, HardwareBuffer hardwareBuffer, SyncFenceV19 acquireFieldFd) {
            JniBindings.nSetBuffer(surfaceTransaction, surfaceControl, hardwareBuffer, acquireFieldFd);
        }

        public final void nSetBufferAlpha(long surfaceTransaction, long surfaceControl, float alpha) {
            JniBindings.nSetBufferAlpha(surfaceTransaction, surfaceControl, alpha);
        }

        public final void nSetBufferTransform(long surfaceTransaction, long surfaceControl, int transformation) {
            JniBindings.nSetBufferTransform(surfaceTransaction, surfaceControl, transformation);
        }

        public final void nSetBufferTransparency(long surfaceTransaction, long surfaceControl, byte transparency) {
            JniBindings.nSetBufferTransparency(surfaceTransaction, surfaceControl, transparency);
        }

        public final void nSetCrop(long surfaceTransaction, long surfaceControl, int left, int top, int right, int bottom) {
            JniBindings.nSetCrop(surfaceTransaction, surfaceControl, left, top, right, bottom);
        }

        public final void nSetDamageRegion(long surfaceTransaction, long surfaceControl, Rect rect) {
            JniBindings.nSetDamageRegion(surfaceTransaction, surfaceControl, rect);
        }

        public final void nSetDataSpace(long surfaceTransaction, long surfaceControl, int dataSpace) {
            JniBindings.nSetDataSpace(surfaceTransaction, surfaceControl, dataSpace);
        }

        public final void nSetDesiredPresentTime(long surfaceTransaction, long desiredPresentTime) {
            JniBindings.nSetDesiredPresentTime(surfaceTransaction, desiredPresentTime);
        }

        public final void nSetFrameRate(long surfaceTransaction, long surfaceControl, float frameRate, int compatibility, int changeFrameRateStrategy) {
            JniBindings.nSetFrameRate(surfaceTransaction, surfaceControl, frameRate, compatibility, changeFrameRateStrategy);
        }

        public final void nSetGeometry(long surfaceTransaction, long surfaceControl, int bufferWidth, int bufferHeight, int dstWidth, int dstHeight, int transformation) {
            JniBindings.nSetGeometry(surfaceTransaction, surfaceControl, bufferWidth, bufferHeight, dstWidth, dstHeight, transformation);
        }

        public final void nSetPosition(long surfaceTransaction, long surfaceControl, float x, float y) {
            JniBindings.nSetPosition(surfaceTransaction, surfaceControl, x, y);
        }

        public final void nSetScale(long surfaceTransaction, long surfaceControl, float scaleX, float scaleY) {
            JniBindings.nSetScale(surfaceTransaction, surfaceControl, scaleX, scaleY);
        }

        public final void nSetVisibility(long surfaceTransaction, long surfaceControl, byte visibility) {
            JniBindings.nSetVisibility(surfaceTransaction, surfaceControl, visibility);
        }

        public final void nSetZOrder(long surfaceTransaction, long surfaceControl, int zOrder) {
            JniBindings.nSetZOrder(surfaceTransaction, surfaceControl, zOrder);
        }

        public final void nTransactionApply(long surfaceTransaction) {
            JniBindings.nTransactionApply(surfaceTransaction);
        }

        public final long nTransactionCreate() {
            return JniBindings.nTransactionCreate();
        }

        public final void nTransactionDelete(long surfaceTransaction) {
            JniBindings.nTransactionDelete(surfaceTransaction);
        }

        public final void nTransactionReparent(long surfaceTransaction, long surfaceControl, long newParent) {
            JniBindings.nTransactionReparent(surfaceTransaction, surfaceControl, newParent);
        }

        public final void nTransactionSetOnCommit(long surfaceTransaction, SurfaceControlCompat.TransactionCommittedListener listener) {
            JniBindings.nTransactionSetOnCommit(surfaceTransaction, listener);
        }

        public final void nTransactionSetOnComplete(long surfaceTransaction, SurfaceControlCompat.TransactionCompletedListener listener) {
            JniBindings.nTransactionSetOnComplete(surfaceTransaction, listener);
        }
    }

    static {
        System.loadLibrary("graphics-core");
    }

    public static final native long nCreate(long j, String str);

    public static final native long nCreateFromSurface(Surface surface, String str);

    public static final native int nDupFenceFd(SyncFenceV19 syncFenceV19);

    public static final native String nGetMinUiRotation();

    public static final native int nGetPreviousReleaseFenceFd(long j, long j2);

    public static final native String nGetSurfaceFlingerOrientation();

    public static final native boolean nIsHwuiUsingVulkanRenderer();

    public static final native void nRelease(long j);

    public static final native void nSetBuffer(long j, long j2, HardwareBuffer hardwareBuffer, SyncFenceV19 syncFenceV19);

    public static final native void nSetBufferAlpha(long j, long j2, float f);

    public static final native void nSetBufferTransform(long j, long j2, int i);

    public static final native void nSetBufferTransparency(long j, long j2, byte b);

    public static final native void nSetCrop(long j, long j2, int i, int i2, int i3, int i4);

    public static final native void nSetDamageRegion(long j, long j2, Rect rect);

    public static final native void nSetDataSpace(long j, long j2, int i);

    public static final native void nSetDesiredPresentTime(long j, long j2);

    public static final native void nSetFrameRate(long j, long j2, float f, int i, int i2);

    public static final native void nSetGeometry(long j, long j2, int i, int i2, int i3, int i4, int i5);

    public static final native void nSetPosition(long j, long j2, float f, float f2);

    public static final native void nSetScale(long j, long j2, float f, float f2);

    public static final native void nSetVisibility(long j, long j2, byte b);

    public static final native void nSetZOrder(long j, long j2, int i);

    public static final native void nTransactionApply(long j);

    public static final native long nTransactionCreate();

    public static final native void nTransactionDelete(long j);

    public static final native void nTransactionReparent(long j, long j2, long j3);

    public static final native void nTransactionSetOnCommit(long j, SurfaceControlCompat.TransactionCommittedListener transactionCommittedListener);

    public static final native void nTransactionSetOnComplete(long j, SurfaceControlCompat.TransactionCompletedListener transactionCompletedListener);
}
