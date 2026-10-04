package o000O00;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.HardwareRenderer;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.C21540OooOoO;
import androidx.core.internal.view.SupportMenu;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import com.huawei.hms.framework.common.C22824OooO0o0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.C24034Oooo00O;
import o000O00.OooO00o;
import o000O00.OooO0o;
import o000OO0O.C24494OooO0oO;
import o000OO0O.InterfaceC24492OooO0Oo;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements OooO00o.InterfaceC19613OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f82182OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f82183OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final long f82184OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f82185OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f82186OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public OooO0O0 f82187OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f82188OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ImageReader f82189OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public HardwareRenderer f82190OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Matrix f82191Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final RenderNode f82192Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public RenderNode f82193Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f82194Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f82195Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final ReentrantLock f82196Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final HashMap<HardwareBuffer, Image> f82197Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Condition f82198Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final AtomicBoolean f82199Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final AtomicBoolean f82181Oooo0oo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final AtomicBoolean f82180Oooo = new AtomicBoolean(false);

    public static final class OooO00o {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static OooO0O0 OooO00o(int i) throws InterruptedException {
            if (i == 1) {
                Log.v("BufferRendererV29", "Explicit usage of double buffered redraw strategy with force clear");
                return new OooO0OO(true);
            }
            if (i == 2) {
                Log.v("BufferRendererV29", "Explicit usage of single buffered preservation strategy");
                return new C24366OooO0Oo();
            }
            if (!OooO0o.f82181Oooo0oo.getAndSet(true)) {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Paint paint = new Paint();
                RenderNode renderNodeOooO0O0 = C21540OooOoO.OooO0O0();
                renderNodeOooO0O0.setPosition(0, 0, 2, 2);
                o000O00.OooO00o oooO00o = new o000O00.OooO00o(2, 2, 1, 1, 2, 2816L);
                oooO00o.oo000o(renderNodeOooO0O0);
                AtomicBoolean atomicBoolean = OooO0o.f82180Oooo;
                RecordingCanvas recordingCanvasBeginRecording = renderNodeOooO0O0.beginRecording();
                kotlin.jvm.internal.OooOOO0.OooO0o(recordingCanvasBeginRecording, "renderNode.beginRecording()");
                BlendMode unused = BlendMode.CLEAR;
                recordingCanvasBeginRecording.drawColor(ViewCompat.MEASURED_STATE_MASK, BlendMode.CLEAR);
                paint.setColor(-16711936);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                recordingCanvasBeginRecording.drawRect(0.0f, 0.0f, 1.0f, 2.0f, paint);
                renderNodeOooO0O0.endRecording();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                OooO00o.OooO0O0 oooO0O0OooO00o = oooO00o.OooO00o();
                oooO0O0OooO00o.f82172OooO0OO = true;
                kotlin.jvm.internal.OooOOO0.OooO0o(executor, "executor");
                oooO0O0OooO00o.OooO00o(executor, new Consumer() { // from class: o000O00O.OooOOo0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        CountDownLatch firstRenderLatch = countDownLatch;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(firstRenderLatch, "$firstRenderLatch");
                        firstRenderLatch.countDown();
                    }
                });
                countDownLatch.await();
                RecordingCanvas recordingCanvasBeginRecording2 = renderNodeOooO0O0.beginRecording();
                kotlin.jvm.internal.OooOOO0.OooO0o(recordingCanvasBeginRecording2, "renderNode.beginRecording()");
                paint.setColor(-16776961);
                recordingCanvasBeginRecording2.drawRect(1.0f, 0.0f, 2.0f, 2.0f, paint);
                BlendMode unused2 = BlendMode.DST_OVER;
                recordingCanvasBeginRecording2.drawColor(SupportMenu.CATEGORY_MASK, BlendMode.DST_OVER);
                renderNodeOooO0O0.endRecording();
                final C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                OooO00o.OooO0O0 oooO0O0OooO00o2 = oooO00o.OooO00o();
                oooO0O0OooO00o2.f82172OooO0OO = true;
                oooO0O0OooO00o2.OooO00o(executor, new Consumer() { // from class: o000O00O.OooOOOo
                    /* JADX WARN: Type inference failed for: r4v3, types: [T, android.graphics.Bitmap] */
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) obj;
                        C24034Oooo00O c24034Oooo00O2 = c24034Oooo00O;
                        CountDownLatch countDownLatch3 = countDownLatch2;
                        o000OO0O.OooO0OO oooO0OO2 = oooO0OO.f82175OooO0O0;
                        if (oooO0OO2 != null) {
                            oooO0OO2.OooO00o();
                        }
                        c24034Oooo00O2.f80942OooOo0o = Bitmap.wrapHardwareBuffer(oooO0OO.f82174OooO00o, o000O00.OooO00o.f82167OooOoO0);
                        countDownLatch3.countDown();
                    }
                });
                countDownLatch2.await();
                Bitmap bitmap = (Bitmap) c24034Oooo00O.f80942OooOo0o;
                if (bitmap != null) {
                    Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                    boolean z = bitmapCopy.getPixel(0, 0) == -16711936 && bitmapCopy.getPixel(1, 1) == -16776961;
                    atomicBoolean.set(z);
                    executor.shutdownNow();
                    oooO00o.close();
                    renderNodeOooO0O0.discardDisplayList();
                }
            }
            if (OooO0o.f82180Oooo.get()) {
                Log.v("BufferRendererV29", "Device supports persisted canvas optimizations");
                return new C24366OooO0Oo();
            }
            Log.w("BufferRendererV29", "Warning, device DOES NOT support persisted canvas optimizations.");
            return new OooO0OO(false);
        }
    }

    public interface OooO0O0 {
        int OooO00o();

        void OooO0O0(Canvas canvas);

        void OooO0OO(HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO);
    }

    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f82200OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public HardwareBuffer f82201OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o000OO0O.OooO0OO f82202OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Paint f82203OooO0Oo;

        public OooO0OO(boolean z) {
            this.f82200OooO00o = z;
            Paint paint = new Paint();
            BlendMode unused = BlendMode.SRC;
            paint.setBlendMode(BlendMode.SRC);
            paint.setAntiAlias(false);
            paint.setFilterBitmap(false);
            this.f82203OooO0Oo = paint;
        }

        @Override // o000O00.OooO0o.OooO0O0
        public final int OooO00o() {
            return 2;
        }

        @Override // o000O00.OooO0o.OooO0O0
        public final void OooO0O0(Canvas canvas) {
            if (this.f82200OooO00o) {
                BlendMode unused = BlendMode.CLEAR;
                canvas.drawColor(ViewCompat.MEASURED_STATE_MASK, BlendMode.CLEAR);
            }
            HardwareBuffer hardwareBuffer = this.f82201OooO0O0;
            if (hardwareBuffer != null) {
                o000OO0O.OooO0OO oooO0OO = this.f82202OooO0OO;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o();
                }
                Bitmap bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, o000O00.OooO00o.f82167OooOoO0);
                if (bitmapWrapHardwareBuffer != null) {
                    canvas.save();
                    canvas.drawBitmap(bitmapWrapHardwareBuffer, 0.0f, 0.0f, this.f82203OooO0Oo);
                    canvas.restore();
                }
            }
        }

        @Override // o000O00.OooO0o.OooO0O0
        public final void OooO0OO(HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO) {
            this.f82201OooO0O0 = hardwareBuffer;
            this.f82202OooO0OO = oooO0OO;
        }
    }

    /* JADX INFO: renamed from: o000O00.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C24366OooO0Oo implements OooO0O0 {
        @Override // o000O00.OooO0o.OooO0O0
        public final int OooO00o() {
            return 1;
        }

        @Override // o000O00.OooO0o.OooO0O0
        public final void OooO0O0(Canvas canvas) {
        }

        @Override // o000O00.OooO0o.OooO0O0
        public final void OooO0OO(HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO) {
        }
    }

    public OooO0o(int i, int i2, int i3, int i4, int i5, long j) {
        this.f82183OooOo0o = i;
        this.f82182OooOo = i2;
        this.f82185OooOoO0 = i3;
        this.f82184OooOoO = j;
        this.f82186OooOoOO = i4;
        this.f82188OooOoo0 = i5;
        RenderNode renderNodeOooO00o = com.huawei.hms.drive.OooO00o.OooO00o();
        renderNodeOooO00o.setPosition(0, 0, i, i2);
        renderNodeOooO00o.setClipToBounds(false);
        this.f82192Oooo000 = renderNodeOooO00o;
        this.f82194Oooo00o = -1;
        this.f82191Oooo0 = new Matrix();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f82196Oooo0OO = reentrantLock;
        this.f82198Oooo0o0 = reentrantLock.newCondition();
        this.f82197Oooo0o = new HashMap<>();
        this.f82199Oooo0oO = new AtomicBoolean(false);
    }

    public static void OooO0OO(Image image) throws IOException {
        o000OO0O.OooO0OO oooO0OO;
        if (Build.VERSION.SDK_INT >= 33) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(image, "image");
            SyncFence fence = image.getFence();
            kotlin.jvm.internal.OooOOO0.OooO0o(fence, "image.fence");
            oooO0OO = new o000OO0O.OooO0OO(fence);
        } else {
            oooO0OO = null;
        }
        if (oooO0OO != null) {
            oooO0OO.OooO00o();
            oooO0OO.close();
        }
        image.close();
    }

    public final void OooO00o() {
        ReentrantLock reentrantLock = this.f82196Oooo0OO;
        reentrantLock.lock();
        HashMap<HardwareBuffer, Image> map = this.f82197Oooo0o;
        try {
            for (Map.Entry<HardwareBuffer, Image> entry : map.entrySet()) {
                entry.getKey().close();
                OooO0OO(entry.getValue());
            }
            map.clear();
            this.f82198Oooo0o0.signal();
            ImageReader imageReader = this.f82189OooOooO;
            if (imageReader != null) {
                imageReader.close();
            }
            this.f82189OooOooO = null;
            HardwareRenderer hardwareRenderer = this.f82190OooOooo;
            if (hardwareRenderer != null) {
                hardwareRenderer.stop();
                hardwareRenderer.destroy();
            }
            this.f82190OooOooo = null;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // o000O00.OooO00o.InterfaceC19613OooO00o
    public final void Oooooo0(HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO) {
        ReentrantLock reentrantLock = this.f82196Oooo0OO;
        reentrantLock.lock();
        try {
            Image imageRemove = this.f82197Oooo0o.remove(hardwareBuffer);
            if (imageRemove != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    if (oooO0OO != null) {
                        InterfaceC24492OooO0Oo interfaceC24492OooO0Oo = oooO0OO.f82811OooOo0o;
                        if (interfaceC24492OooO0Oo instanceof C24494OooO0oO) {
                            imageRemove.setFence(((C24494OooO0oO) interfaceC24492OooO0Oo).f82812OooOo0o);
                        }
                    }
                    imageRemove.close();
                } else {
                    OooO0OO(imageRemove);
                }
            }
            this.f82198Oooo0o0.signal();
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        OooO00o();
        this.f82192Oooo000.discardDisplayList();
        this.f82199Oooo0oO.set(true);
    }

    @Override // o000O00.OooO00o.InterfaceC19613OooO00o
    public final boolean isClosed() {
        return this.f82199Oooo0oO.get();
    }

    @Override // o000O00.OooO00o.InterfaceC19613OooO00o
    public final void o000O0o(OooO00o.OooO0O0 request, final Executor executor, final Consumer<OooO00o.OooO0OO> consumer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        int i = request.f82171OooO0O0;
        RenderNode renderNode = this.f82193Oooo00O;
        boolean z = request.f82172OooO0OO || this.f82195Oooo0O0;
        if ((!this.f82192Oooo000.hasDisplayList() || i != this.f82194Oooo00o || z) && renderNode != null) {
            this.f82194Oooo00o = i;
            float f = this.f82183OooOo0o;
            float f2 = this.f82182OooOo;
            Matrix matrix = this.f82191Oooo0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(matrix, "matrix");
            if (i == 3) {
                matrix.reset();
                matrix.setRotate(180.0f);
                matrix.postTranslate(f, f2);
            } else if (i == 4) {
                matrix.reset();
                matrix.setRotate(90.0f);
                matrix.postTranslate(f, 0.0f);
            } else if (i != 7) {
                matrix.reset();
            } else {
                matrix.reset();
                matrix.setRotate(270.0f);
                matrix.postTranslate(0.0f, f2);
            }
            boolean z2 = request.f82172OooO0OO;
            RecordingCanvas recordingCanvasBeginRecording = this.f82192Oooo000.beginRecording();
            kotlin.jvm.internal.OooOOO0.OooO0o(recordingCanvasBeginRecording, "mRootRenderNode.beginRecording()");
            if (z2) {
                ReentrantLock reentrantLock = this.f82196Oooo0OO;
                reentrantLock.lock();
                try {
                    OooO0O0 oooO0O0 = this.f82187OooOoo;
                    if (oooO0O0 != null) {
                        oooO0O0.OooO0O0(recordingCanvasBeginRecording);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                BlendMode unused = BlendMode.CLEAR;
                recordingCanvasBeginRecording.drawColor(ViewCompat.MEASURED_STATE_MASK, BlendMode.CLEAR);
            }
            recordingCanvasBeginRecording.save();
            recordingCanvasBeginRecording.concat(matrix);
            recordingCanvasBeginRecording.drawRenderNode(renderNode);
            recordingCanvasBeginRecording.restore();
            this.f82192Oooo000.endRecording();
            this.f82195Oooo0O0 = z2;
        }
        final boolean z3 = request.f82172OooO0OO;
        executor.execute(new Runnable() { // from class: o000O00.OooO0Oo
            /* JADX WARN: Type inference failed for: r7v1, types: [o000O00.OooO0o0] */
            @Override // java.lang.Runnable
            public final void run() {
                final OooO0o this$0 = this.f82177OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                Executor executor2 = executor;
                kotlin.jvm.internal.OooOOO0.OooO0oO(executor2, "$executor");
                final Consumer consumer2 = consumer;
                if (this$0.f82199Oooo0oO.get()) {
                    return;
                }
                ReentrantLock reentrantLock2 = this$0.f82196Oooo0OO;
                reentrantLock2.lock();
                try {
                    final OooO0o.OooO0O0 oooO0O0OooO00o = this$0.f82187OooOoo;
                    boolean z4 = z3;
                    int iOooO00o = this$0.f82186OooOoOO;
                    if (z4 && iOooO00o == 1 && oooO0O0OooO00o == null) {
                        this$0.OooO00o();
                        AtomicBoolean atomicBoolean = OooO0o.f82181Oooo0oo;
                        oooO0O0OooO00o = OooO0o.OooO00o.OooO00o(this$0.f82188OooOoo0);
                        this$0.f82187OooOoo = oooO0O0OooO00o;
                    }
                    ImageReader imageReaderNewInstance = this$0.f82189OooOooO;
                    if (imageReaderNewInstance == null) {
                        if (iOooO00o == 1 && oooO0O0OooO00o != null) {
                            iOooO00o = oooO0O0OooO00o.OooO00o();
                        }
                        int i2 = iOooO00o;
                        imageReaderNewInstance = ImageReader.newInstance(this$0.f82183OooOo0o, this$0.f82182OooOo, this$0.f82185OooOoO0, i2, this$0.f82184OooOoO);
                        kotlin.jvm.internal.OooOOO0.OooO0o(imageReaderNewInstance, "newInstance(\n           …         mUsage\n        )");
                        this$0.f82189OooOooO = imageReaderNewInstance;
                    }
                    HardwareRenderer hardwareRendererOooO00o = this$0.f82190OooOooo;
                    if (hardwareRendererOooO00o == null) {
                        hardwareRendererOooO00o = C22824OooO0o0.OooO00o();
                        hardwareRendererOooO00o.setOpaque(true);
                        hardwareRendererOooO00o.setContentRoot(this$0.f82192Oooo000);
                        hardwareRendererOooO00o.setSurface(imageReaderNewInstance.getSurface());
                        hardwareRendererOooO00o.start();
                        this$0.f82190OooOooo = hardwareRendererOooO00o;
                    }
                    hardwareRendererOooO00o.setLightSourceAlpha(0.0f, 0.0f);
                    hardwareRendererOooO00o.setLightSourceGeometry(0.0f, 0.0f, 0.0f, 0.0f);
                    final C24033OooOooo c24033OooOooo = new C24033OooOooo();
                    HardwareRenderer.FrameRenderRequest frameCommitCallback = hardwareRendererOooO00o.createRenderRequest().setFrameCommitCallback(executor2, new Runnable() { // from class: o000O00.OooO0o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            HashMap<HardwareBuffer, Image> map;
                            o000OO0O.OooO0OO oooO0OO;
                            OooO0o this$02 = this$0;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(this$02, "this$0");
                            Consumer consumer3 = consumer2;
                            C24033OooOooo c24033OooOooo2 = c24033OooOooo;
                            ReentrantLock reentrantLock3 = this$02.f82196Oooo0OO;
                            reentrantLock3.lock();
                            try {
                                ImageReader imageReader = this$02.f82189OooOooO;
                                if (imageReader == null) {
                                    reentrantLock3.unlock();
                                    return;
                                }
                                while (true) {
                                    map = this$02.f82197Oooo0o;
                                    if (map.size() < imageReader.getMaxImages()) {
                                        break;
                                    } else {
                                        this$02.f82198Oooo0o0.await();
                                    }
                                }
                                Image imageAcquireNextImage = imageReader.acquireNextImage();
                                if (imageAcquireNextImage != null) {
                                    HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                                    if (hardwareBuffer != null) {
                                        Image imagePut = map.put(hardwareBuffer, imageAcquireNextImage);
                                        if (imagePut != null) {
                                            OooO0o.OooO0OO(imagePut);
                                        }
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            SyncFence fence = imageAcquireNextImage.getFence();
                                            kotlin.jvm.internal.OooOOO0.OooO0o(fence, "image.fence");
                                            oooO0OO = new o000OO0O.OooO0OO(fence);
                                        } else {
                                            oooO0OO = null;
                                        }
                                        OooO0o.OooO0O0 oooO0O02 = oooO0O0OooO00o;
                                        if (oooO0O02 != null) {
                                            oooO0O02.OooO0OO(hardwareBuffer, oooO0OO);
                                        }
                                        if (c24033OooOooo2.f80940OooOo0o != 0) {
                                        }
                                        consumer3.accept(new OooO00o.OooO0OO(hardwareBuffer, oooO0OO));
                                        if (this$02.f82186OooOoOO == 1) {
                                            this$02.Oooooo0(hardwareBuffer, oooO0OO);
                                        }
                                        if (imageReader.getMaxImages() == 1) {
                                            this$02.Oooooo0(hardwareBuffer, oooO0OO);
                                        }
                                    } else {
                                        OooO0o.OooO0OO(imageAcquireNextImage);
                                    }
                                }
                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                reentrantLock3.unlock();
                            } catch (Throwable th) {
                                reentrantLock3.unlock();
                                throw th;
                            }
                        }
                    });
                    kotlin.jvm.internal.OooOOO0.OooO0o(frameCommitCallback, "createRenderRequest().se…      }\n                }");
                    c24033OooOooo.f80940OooOo0o = frameCommitCallback.syncAndDraw();
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    reentrantLock2.unlock();
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
        });
    }

    @Override // o000O00.OooO00o.InterfaceC19613OooO00o
    public final void oo000o(RenderNode renderNode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderNode, "renderNode");
        this.f82193Oooo00O = renderNode;
        this.f82192Oooo000.discardDisplayList();
    }
}
