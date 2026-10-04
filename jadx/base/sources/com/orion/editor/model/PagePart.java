package com.orion.editor.model;

import OooOoO.C20509OooO0oo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Choreographer;
import androidx.transition.C22111OooOoo;
import com.orion.editor.model.PagePart;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;
import o000O00.OooO00o;
import o0O0o0o0.C26012OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class PagePart {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f69345OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f69347OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RectF f69348OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RectF f69349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f69350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RendererBackend f69351OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f69352OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f69353OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public volatile int f69354OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile Bitmap f69355OooOO0O;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f69346OooO00o = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AtomicBoolean f69356OooOO0o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final AtomicLong f69357OooOOO0 = new AtomicLong(0);

    /* JADX INFO: renamed from: com.orion.editor.model.PagePart$1 */
    public static /* synthetic */ class C188661 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f69358OooO00o;

        static {
            int[] iArr = new int[HwBackend.Kind.values().length];
            f69358OooO00o = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69358OooO00o[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final class HwBackend implements RendererBackend {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final Handler f69359OooOO0 = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final RenderNode f69362OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public C26012OooO00o f69364OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Rect f69366OooO0o0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Kind f69361OooO00o = Kind.f69370OooOo0o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicReference<Bitmap> f69363OooO0OO = new AtomicReference<>();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ReentrantReadWriteLock f69365OooO0o = new ReentrantReadWriteLock();

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final ReentrantReadWriteLock f69367OooO0oO = new ReentrantReadWriteLock();

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final Choreographer f69368OooO0oo = Choreographer.getInstance();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Kind {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final Kind f69369OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final Kind f69370OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final /* synthetic */ Kind[] f69371OooOoO0;

            static {
                Kind kind = new Kind("NONE", 0);
                f69370OooOo0o = kind;
                Kind kind2 = new Kind("SHARED", 1);
                f69369OooOo = kind2;
                f69371OooOoO0 = new Kind[]{kind, kind2, new Kind("INDEPENDENT", 2)};
            }

            public Kind() {
                throw null;
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) f69371OooOoO0.clone();
            }
        }

        public HwBackend(int i, int i2) {
            androidx.core.content.OooO00o.OooO0O0();
            RenderNode renderNodeOooO0O0 = C22111OooOoo.OooO0O0("PagePart_" + PagePart.this.f69346OooO00o);
            this.f69362OooO0O0 = renderNodeOooO0O0;
            renderNodeOooO0O0.setPosition(0, 0, i, i2);
        }

        @Override // com.orion.editor.model.PagePart.RendererBackend
        public final void OooO00o(Consumer<Canvas> consumer, boolean z) {
            o000O00.OooO00o oooO00o;
            int width;
            int height;
            ReentrantReadWriteLock reentrantReadWriteLock = this.f69365OooO0o;
            reentrantReadWriteLock.writeLock().lock();
            try {
                RecordingCanvas recordingCanvasBeginRecording = this.f69362OooO0O0.beginRecording();
                PagePart pagePart = PagePart.this;
                Bitmap bitmapWrapHardwareBuffer = null;
                if (z) {
                    OooO0O0(recordingCanvasBeginRecording, new RectF(0.0f, 0.0f, pagePart.f69350OooO0o, pagePart.f69352OooO0oO), null);
                }
                consumer.accept(recordingCanvasBeginRecording);
                this.f69362OooO0O0.endRecording();
                reentrantReadWriteLock.readLock().lock();
                reentrantReadWriteLock.writeLock().unlock();
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final AtomicReference atomicReference = new AtomicReference();
                try {
                    try {
                        width = this.f69362OooO0O0.getWidth();
                        height = this.f69362OooO0O0.getHeight();
                    } finally {
                        reentrantReadWriteLock.readLock().unlock();
                    }
                } catch (Exception e) {
                    e = e;
                    oooO00o = null;
                }
                if (width <= 0 || height <= 0) {
                    throw new IllegalArgumentException("Invalid dimensions provided, width and height must be > 0. width: " + width + " height: " + height);
                }
                oooO00o = new o000O00.OooO00o(width, height, 1, 1, 0, 2818L);
                try {
                    oooO00o.oo000o(this.f69362OooO0O0);
                    OooO00o.OooO0O0 oooO0O0OooO00o = oooO00o.OooO00o();
                    oooO0O0OooO00o.f82172OooO0OO = false;
                    oooO0O0OooO00o.OooO00o(new o0000OO0.OooO(), new androidx.core.util.Consumer() { // from class: com.orion.editor.model.OooO0o0
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) {
                            Handler handler = PagePart.HwBackend.f69359OooOO0;
                            atomicReference.set((OooO00o.OooO0OO) obj);
                            countDownLatch.countDown();
                        }
                    });
                    countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                } catch (Exception e2) {
                    e = e2;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PagePart");
                    c20358OooO00o.OooO0Oo(e, "Interrupted while waiting for render result of PagePart %s on page %d", pagePart.f69346OooO00o, Integer.valueOf(pagePart.f69347OooO0O0));
                }
                OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) atomicReference.get();
                if (oooO0OO != null) {
                    bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(oooO0OO.f82174OooO00o, ColorSpace.get(ColorSpace.Named.SRGB));
                }
                if (oooO00o == null || bitmapWrapHardwareBuffer == null || bitmapWrapHardwareBuffer.isRecycled()) {
                    if (oooO00o != null) {
                        oooO00o.close();
                        return;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PagePart");
                    c20358OooO00o2.OooOO0O("Failed to obtain RenderResult for PagePart %s on page %d", pagePart.f69346OooO00o, Integer.valueOf(pagePart.f69347OooO0O0));
                    return;
                }
                C26012OooO00o c26012OooO00o = new C26012OooO00o(oooO00o, 1);
                Rect rect = new Rect(0, 0, bitmapWrapHardwareBuffer.getWidth(), bitmapWrapHardwareBuffer.getHeight());
                ReentrantReadWriteLock reentrantReadWriteLock2 = this.f69367OooO0oO;
                reentrantReadWriteLock2.writeLock().lock();
                try {
                    if (pagePart.f69356OooOO0o.get()) {
                        c26012OooO00o.OooO00o();
                    } else {
                        OooO0Oo();
                        this.f69363OooO0OO.set(bitmapWrapHardwareBuffer);
                        this.f69361OooO00o = Kind.f69369OooOo;
                        this.f69366OooO0o0 = rect;
                        this.f69364OooO0Oo = c26012OooO00o;
                    }
                } finally {
                    reentrantReadWriteLock2.writeLock().unlock();
                }
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        }

        @Override // com.orion.editor.model.PagePart.RendererBackend
        public final void OooO0O0(Canvas canvas, RectF rectF, Paint paint) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f69367OooO0oO;
            reentrantReadWriteLock.readLock().lock();
            try {
                Bitmap bitmap = this.f69363OooO0OO.get();
                if (bitmap != null && !bitmap.isRecycled()) {
                    Rect rect = this.f69366OooO0o0;
                    if (rect == null) {
                        rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    }
                    if (canvas.isHardwareAccelerated()) {
                        canvas.drawBitmap(bitmap, rect, rectF, paint);
                    } else {
                        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                        canvas.drawBitmap(bitmapCopy, rect, rectF, paint);
                        if (bitmapCopy != bitmap) {
                            bitmapCopy.recycle();
                        }
                    }
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }

        @Override // com.orion.editor.model.PagePart.RendererBackend
        public final void OooO0OO(final Bitmap bitmap, final RectF rectF) {
            Runnable runnable = new Runnable() { // from class: com.orion.editor.model.OooO00o
                @Override // java.lang.Runnable
                public final void run() {
                    PagePart.HwBackend hwBackend = this.f69327OooOo0o;
                    Bitmap bitmap2 = hwBackend.f69363OooO0OO.get();
                    if (bitmap2 == null || bitmap2.isRecycled()) {
                        return;
                    }
                    Rect rect = hwBackend.f69366OooO0o0;
                    if (rect == null) {
                        rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                    }
                    Canvas canvas = new Canvas(bitmap);
                    try {
                        Bitmap.Config config = bitmap2.getConfig();
                        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                        RectF rectF2 = rectF;
                        if (config == config2) {
                            Bitmap bitmapCopy = bitmap2.copy(Bitmap.Config.ARGB_8888, false);
                            canvas.drawBitmap(bitmapCopy, rect, rectF2, (Paint) null);
                            if (bitmapCopy != bitmap2) {
                                bitmapCopy.recycle();
                            }
                        } else {
                            canvas.drawBitmap(bitmap2, rect, rectF2, (Paint) null);
                        }
                        canvas.setBitmap(null);
                    } catch (Throwable th) {
                        canvas.setBitmap(null);
                        throw th;
                    }
                }
            };
            ReentrantReadWriteLock reentrantReadWriteLock = this.f69367OooO0oO;
            reentrantReadWriteLock.readLock().lock();
            try {
                runnable.run();
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }

        public final void OooO0Oo() {
            Bitmap andSet = this.f69363OooO0OO.getAndSet(null);
            int iOrdinal = this.f69361OooO00o.ordinal();
            if (iOrdinal == 1) {
                C26012OooO00o c26012OooO00o = this.f69364OooO0Oo;
                if (c26012OooO00o != null) {
                    if (c26012OooO00o.OooO00o() && andSet != null && !andSet.isRecycled()) {
                        OooO0o0(andSet);
                    }
                    this.f69364OooO0Oo = null;
                }
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                if (andSet != null && !andSet.isRecycled()) {
                    OooO0o0(andSet);
                }
            }
            this.f69361OooO00o = Kind.f69370OooOo0o;
            this.f69366OooO0o0 = null;
        }

        public final void OooO0o0(final Bitmap bitmap) {
            if (bitmap.isRecycled()) {
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.orion.editor.model.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    Handler handler = PagePart.HwBackend.f69359OooOO0;
                    final PagePart.HwBackend hwBackend = this.f69330OooOo0o;
                    hwBackend.getClass();
                    final Bitmap bitmap2 = bitmap;
                    hwBackend.f69368OooO0oo.postFrameCallback(new Choreographer.FrameCallback() { // from class: com.orion.editor.model.OooO0OO
                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
                            Handler handler2 = PagePart.HwBackend.f69359OooOO0;
                            PagePart.HwBackend hwBackend2 = hwBackend;
                            hwBackend2.getClass();
                            final Bitmap bitmap3 = bitmap2;
                            hwBackend2.f69368OooO0oo.postFrameCallback(new Choreographer.FrameCallback() { // from class: com.orion.editor.model.OooO0Oo
                                @Override // android.view.Choreographer.FrameCallback
                                public final void doFrame(long j2) {
                                    Handler handler3 = PagePart.HwBackend.f69359OooOO0;
                                    bitmap3.recycle();
                                }
                            });
                        }
                    });
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                f69359OooOO0.post(runnable);
            }
        }

        @Override // com.orion.editor.model.PagePart.RendererBackend
        public final void recycle() {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f69365OooO0o;
            reentrantReadWriteLock.writeLock().lock();
            try {
                this.f69362OooO0O0.discardDisplayList();
                ReentrantReadWriteLock reentrantReadWriteLock2 = this.f69367OooO0oO;
                reentrantReadWriteLock2.writeLock().lock();
                try {
                    OooO0Oo();
                } finally {
                    reentrantReadWriteLock2.writeLock().unlock();
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    public interface RendererBackend {
        void OooO00o(Consumer<Canvas> consumer, boolean z);

        void OooO0O0(Canvas canvas, RectF rectF, Paint paint);

        void OooO0OO(Bitmap bitmap, RectF rectF);

        void recycle();
    }

    public final class SwBackend implements RendererBackend {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReference<Bitmap> f69372OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ConcurrentLinkedQueue<Bitmap> f69373OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ReentrantReadWriteLock f69374OooO0OO;

        public SwBackend(int i, int i2) {
            AtomicReference<Bitmap> atomicReference = new AtomicReference<>();
            this.f69372OooO00o = atomicReference;
            ConcurrentLinkedQueue<Bitmap> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
            this.f69373OooO0O0 = concurrentLinkedQueue;
            this.f69374OooO0OO = new ReentrantReadWriteLock();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            atomicReference.set(Bitmap.createBitmap(i, i2, config));
            concurrentLinkedQueue.add(Bitmap.createBitmap(i, i2, config));
        }

        @Override // com.orion.editor.model.PagePart.RendererBackend
        public final void OooO00o(Consumer<Canvas> consumer, boolean z) {
            final Bitmap bitmapPoll;
            Bitmap bitmap;
            PagePart pagePart = PagePart.this;
            boolean z2 = pagePart.f69356OooOO0o.get();
            ConcurrentLinkedQueue<Bitmap> concurrentLinkedQueue = this.f69373OooO0O0;
            if (z2) {
                bitmapPoll = null;
            } else {
                bitmapPoll = concurrentLinkedQueue.poll();
                if (bitmapPoll == null || bitmapPoll.isRecycled()) {
                    final AtomicReference atomicReference = new AtomicReference();
                    OooO0Oo(new Runnable() { // from class: com.orion.editor.model.OooO
                        @Override // java.lang.Runnable
                        public final void run() {
                            Bitmap bitmap2 = this.f69325OooOo0o.f69372OooO00o.get();
                            if (bitmap2 == null || bitmap2.isRecycled()) {
                                return;
                            }
                            atomicReference.set(new Size(bitmap2.getWidth(), bitmap2.getHeight()));
                        }
                    });
                    Size size = (Size) atomicReference.get();
                    int i = pagePart.f69347OooO0O0;
                    String str = pagePart.f69346OooO00o;
                    if (size == null || size.getWidth() <= 0 || size.getHeight() <= 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("PagePart");
                        c20358OooO00o.OooOO0O("Failed to obtain buffer for PagePart %s on page %d", str, Integer.valueOf(i));
                    } else {
                        try {
                            bitmapPoll = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
                        } catch (OutOfMemoryError e) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("PagePart");
                            c20358OooO00o2.OooO0Oo(e, "OutOfMemoryError while creating buffer for PagePart %s on page %d", str, Integer.valueOf(i));
                            bitmapPoll = null;
                        }
                    }
                    bitmapPoll = null;
                }
            }
            if (bitmapPoll == null) {
                return;
            }
            if (z) {
                OooO0Oo(new Runnable() { // from class: com.orion.editor.model.OooO0oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        Bitmap bitmap2 = this.f69344OooOo0o.f69372OooO00o.get();
                        if (bitmap2 == null || bitmap2.isRecycled()) {
                            return;
                        }
                        new Canvas(bitmapPoll).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    }
                });
            } else {
                bitmapPoll.eraseColor(0);
            }
            Canvas canvas = new Canvas(bitmapPoll);
            consumer.accept(canvas);
            canvas.setBitmap(null);
            ReentrantReadWriteLock reentrantReadWriteLock = this.f69374OooO0OO;
            reentrantReadWriteLock.writeLock().lock();
            loop0: while (true) {
                try {
                    AtomicReference<Bitmap> atomicReference2 = this.f69372OooO00o;
                    bitmap = atomicReference2.get();
                    while (!atomicReference2.compareAndSet(bitmap, bitmapPoll)) {
                        if (atomicReference2.get() != bitmap) {
                            break;
                        }
                    }
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            if (bitmap != null && !bitmap.isRecycled() && !pagePart.f69356OooOO0o.get()) {
                if (concurrentLinkedQueue.size() < 3) {
                    concurrentLinkedQueue.offer(bitmap);
                } else {
                    bitmap.recycle();
                }
            }
        }

        @Override // com.orion.editor.model.PagePart.RendererBackend
        public final void OooO0O0(final Canvas canvas, final RectF rectF, final Paint paint) {
            OooO0Oo(new Runnable() { // from class: com.orion.editor.model.OooO0o
                @Override // java.lang.Runnable
                public final void run() {
                    Canvas canvas2 = canvas;
                    RectF rectF2 = rectF;
                    Paint paint2 = paint;
                    PagePart.SwBackend swBackend = this.f69335OooOo0o;
                    PagePart pagePart = PagePart.this;
                    if (pagePart.f69356OooOO0o.get()) {
                        return;
                    }
                    try {
                        Bitmap bitmap = swBackend.f69372OooO00o.get();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            canvas2.drawBitmap(bitmap, (Rect) null, rectF2, paint2);
                        }
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("PagePart");
                        c20358OooO00o.OooO0Oo(e, "Error drawToCanvas %s on page %d", pagePart.f69346OooO00o, Integer.valueOf(pagePart.f69347OooO0O0));
                    }
                }
            });
        }

        @Override // com.orion.editor.model.PagePart.RendererBackend
        public final void OooO0OO(final Bitmap bitmap, final RectF rectF) {
            OooO0Oo(new Runnable() { // from class: com.orion.editor.model.OooO0oO
                @Override // java.lang.Runnable
                public final void run() {
                    RectF rectF2 = rectF;
                    PagePart.SwBackend swBackend = this.f69341OooOo0o;
                    PagePart pagePart = PagePart.this;
                    if (pagePart.f69356OooOO0o.get()) {
                        return;
                    }
                    Canvas canvas = new Canvas(bitmap);
                    try {
                        Bitmap bitmap2 = swBackend.f69372OooO00o.get();
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            canvas.drawBitmap(bitmap2, (Rect) null, rectF2, (Paint) null);
                        }
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("PagePart");
                        c20358OooO00o.OooO0Oo(e, "Error drawToBitmap %s on page %d", pagePart.f69346OooO00o, Integer.valueOf(pagePart.f69347OooO0O0));
                    } finally {
                        canvas.setBitmap(null);
                    }
                }
            });
        }

        public final void OooO0Oo(Runnable runnable) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f69374OooO0OO;
            reentrantReadWriteLock.readLock().lock();
            try {
                runnable.run();
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }

        @Override // com.orion.editor.model.PagePart.RendererBackend
        public final void recycle() {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f69374OooO0OO;
            reentrantReadWriteLock.writeLock().lock();
            try {
                Bitmap andSet = this.f69372OooO00o.getAndSet(null);
                if (andSet != null && !andSet.isRecycled()) {
                    andSet.recycle();
                }
                while (true) {
                    Bitmap bitmapPoll = this.f69373OooO0O0.poll();
                    if (bitmapPoll == null) {
                        return;
                    }
                    if (!bitmapPoll.isRecycled()) {
                        bitmapPoll.recycle();
                    }
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    public PagePart(int i, int i2, int i3, RectF rectF, RectF rectF2, boolean z, boolean z2, int i4, boolean z3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Width and height must be positive integers.");
        }
        this.f69347OooO0O0 = i;
        this.f69350OooO0o = i2;
        this.f69352OooO0oO = i3;
        this.f69348OooO0OO = rectF;
        this.f69349OooO0Oo = rectF2;
        this.f69353OooO0oo = z2;
        this.f69354OooOO0 = i4;
        this.f69345OooO = z;
        this.f69351OooO0o0 = z3 ? new HwBackend(i2, i3) : new SwBackend(i2, i3);
    }

    public final void OooO00o(Bitmap bitmap, RectF rectF) {
        if (this.f69356OooOO0o.get()) {
            return;
        }
        this.f69351OooO0o0.OooO0OO(bitmap, rectF);
    }

    public final void OooO0O0(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f69356OooOO0o.get()) {
            return;
        }
        this.f69351OooO0o0.OooO0O0(canvas, rectF, paint);
    }

    public final RectF OooO0OO() {
        return new RectF(this.f69349OooO0Oo);
    }

    public final RectF OooO0Oo() {
        return new RectF(this.f69348OooO0OO);
    }

    public final void OooO0o() {
        if (this.f69356OooOO0o.compareAndSet(false, true)) {
            this.f69351OooO0o0.recycle();
            this.f69355OooOO0O = null;
        }
    }

    public final void OooO0o0(Consumer<Canvas> consumer, boolean z) {
        if (this.f69356OooOO0o.get()) {
            return;
        }
        this.f69351OooO0o0.OooO00o(consumer, z);
    }

    public final void OooO0oO(Bitmap bitmap, Rect rect, C26012OooO00o c26012OooO00o) {
        RendererBackend rendererBackend = this.f69351OooO0o0;
        if (!(rendererBackend instanceof HwBackend)) {
            c26012OooO00o.OooO00o();
            return;
        }
        HwBackend hwBackend = (HwBackend) rendererBackend;
        ReentrantReadWriteLock reentrantReadWriteLock = hwBackend.f69367OooO0oO;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (PagePart.this.f69356OooOO0o.get()) {
                c26012OooO00o.OooO00o();
            } else {
                hwBackend.OooO0Oo();
                hwBackend.f69363OooO0OO.set(bitmap);
                hwBackend.f69361OooO00o = HwBackend.Kind.f69369OooOo;
                hwBackend.f69366OooO0o0 = rect;
                hwBackend.f69364OooO0Oo = c26012OooO00o;
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PagePart) {
            PagePart pagePart = (PagePart) obj;
            if (this.f69347OooO0O0 == pagePart.f69347OooO0O0) {
                if (this.f69348OooO0OO.equals(pagePart.OooO0Oo())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f69347OooO0O0) * 31;
        RectF rectF = this.f69348OooO0OO;
        return Float.hashCode(rectF.bottom) + C20509OooO0oo.OooO0OO(rectF.right, C20509OooO0oo.OooO0OO(rectF.top, C20509OooO0oo.OooO0OO(rectF.left, iHashCode, 31), 31), 31);
    }
}
