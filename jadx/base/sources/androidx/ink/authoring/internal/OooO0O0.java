package androidx.ink.authoring.internal;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.ink.authoring.InProgressShapesView;
import androidx.ink.geometry.MutableBox;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import o000O00O.C24390OooO0oO;
import o000O0oO.OooO0O0;
import o000O0oo.C24415OooO;
import o000O0oo.C24422OooO0oO;
import o000O0oo.C24423OooO0oo;
import o000O0oo.C24442Oooo00o;
import o000O0oo.OooOo;
import o000O0oo.RunnableC24432OooOo0O;
import o000O0oo.RunnableC24436OooOoOO;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0<ShapeSpecT, InProgressShapeT extends o000O0oO.OooO0O0<? super ShapeSpecT, ? extends CompletedShapeT>, CompletedShapeT> extends OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Paint f65183OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InProgressShapesView f65184OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0oO.OooOO0 f65185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f65186OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f65187OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f65188OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f65189OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final SurfaceView f65190OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f65191OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C21934OooO0Oo f65192OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C24422OooO0oO f65193OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO0OO f65194OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooOo f65195OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public RenderNode f65196OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Rect f65197OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Paint f65198OooOOo0;

    public interface OooO00o {

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public interface InterfaceC19022OooO00o {
            void OooO00o();

            void OooO0O0(Canvas canvas, int i, int i2);
        }

        void OooO00o(SurfaceView surfaceView, InterfaceC19022OooO00o interfaceC19022OooO00o);

        void OooO0O0();

        void release();
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19023OooO0O0 implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o000O00O.OooOOO0<C32460OooOooO> f65199OooO00o;

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0O0$OooO0O0$OooO00o */
        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO00o.InterfaceC19022OooO00o f65200OooO00o;

            public OooO00o(OooO00o.InterfaceC19022OooO00o interfaceC19022OooO00o) {
                this.f65200OooO00o = interfaceC19022OooO00o;
            }
        }

        @Override // androidx.ink.authoring.internal.OooO0O0.OooO00o
        public final void OooO00o(SurfaceView surfaceView, OooO00o.InterfaceC19022OooO00o callbackAdapter) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(surfaceView, "surfaceView");
            kotlin.jvm.internal.OooOOO0.OooO0oO(callbackAdapter, "callbackAdapter");
            this.f65199OooO00o = new o000O00O.OooOOO0<>(surfaceView, new OooO00o(callbackAdapter));
        }

        @Override // androidx.ink.authoring.internal.OooO0O0.OooO00o
        public final void OooO0O0() {
            o000O00O.OooOOO0<C32460OooOooO> oooOOO0 = this.f65199OooO00o;
            if (oooOOO0 != null) {
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                if (oooOOO0.f82337OooOO0O) {
                    Log.w("LowLatencyCanvas", "Attempt to render to front buffered layer when CanvasFrontBufferedRenderer has been released");
                    return;
                }
                o000O00O.OooOOO<C32460OooOooO> oooOOO = oooOOO0.f82336OooOO0;
                ReentrantLock reentrantLock = oooOOO.f82324OooO00o;
                reentrantLock.lock();
                try {
                    oooOOO.f82325OooO0O0.add(c32460OooOooO);
                    reentrantLock.unlock();
                    if (oooOOO0.f82341OooOOOO.get() != 0) {
                        return;
                    }
                    oooOOO0.OooO0O0();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }

        @Override // androidx.ink.authoring.internal.OooO0O0.OooO00o
        public final void release() {
            SurfaceHolder holder;
            o000O00O.OooOOO0<C32460OooOooO> oooOOO0 = this.f65199OooO00o;
            if (oooOOO0 != null && !oooOOO0.f82337OooOO0O) {
                SurfaceView surfaceView = oooOOO0.f82329OooO0O0;
                if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                    holder.removeCallback(oooOOO0.f82348OooOo0O);
                }
                oooOOO0.f82329OooO0O0 = null;
                oooOOO0.OooO0OO(new C24390OooO0oO(oooOOO0));
                oooOOO0.f82337OooOO0O = true;
            }
            this.f65199OooO00o = null;
        }
    }

    public OooO0O0() {
        throw null;
    }

    public OooO0O0(InProgressShapesView mainView, o000O0oO.OooOO0 renderer) {
        C19023OooO0O0 c19023OooO0O0 = new C19023OooO0O0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(mainView, "mainView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderer, "renderer");
        this.f65184OooO0OO = mainView;
        this.f65185OooO0Oo = renderer;
        this.f65187OooO0o0 = c19023OooO0O0;
        this.f65186OooO0o = true;
        this.f65188OooO0oO = true;
        this.f65189OooO0oo = true;
        Paint paint = new Paint();
        paint.setColor(0);
        BlendMode unused = BlendMode.CLEAR;
        paint.setBlendMode(BlendMode.CLEAR);
        this.f65183OooO = paint;
        SurfaceView surfaceView = new SurfaceView(mainView.getContext());
        surfaceView.setZOrderOnTop(true);
        surfaceView.getHolder().setFormat(-3);
        this.f65190OooOO0 = surfaceView;
        ViewOnAttachStateChangeListenerC21940OooO0o0 viewOnAttachStateChangeListenerC21940OooO0o0 = new ViewOnAttachStateChangeListenerC21940OooO0o0(this);
        this.f65191OooOO0O = new ConcurrentLinkedQueue<>();
        this.f65192OooOO0o = new C21934OooO0Oo();
        this.f65194OooOOO0 = new OooO0OO(this);
        this.f65193OooOOO = new C24422OooO0oO();
        this.f65195OooOOOO = new OooOo(mainView, surfaceView, new C24423OooO0oo(this), new C24415OooO(this, 0));
        Paint paint2 = new Paint();
        BlendMode unused2 = BlendMode.SRC;
        paint2.setBlendMode(BlendMode.SRC);
        paint2.setAntiAlias(false);
        paint2.setFilterBitmap(false);
        this.f65198OooOOo0 = paint2;
        this.f65197OooOOo = new Rect();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 33) {
            throw new IllegalStateException("CanvasInProgressStrokesRenderHelperV29 requires Android Q+. After Android T, use CanvasInProgressStrokesRenderHelperV33 instead.");
        }
        if (mainView.isAttachedToWindow()) {
            OooOOO0();
        }
        mainView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC21940OooO0o0);
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO(MutableBox modifiedRegionInMainView) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(modifiedRegionInMainView, "modifiedRegionInMainView");
        OooO0O0();
        OooO0O0();
        C21934OooO0Oo c21934OooO0Oo = this.f65192OooOO0o;
        if (!c21934OooO0Oo.f65202OooO00o) {
            throw new IllegalStateException("Can only prepare to render during Callback.onDraw.");
        }
        OooO0O0();
        Canvas canvas = c21934OooO0Oo.f65203OooO0O0;
        if (canvas == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.save();
        RenderNode renderNode = this.f65196OooOOOo;
        if (renderNode == null) {
            throw new IllegalStateException("Required value was null.");
        }
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        kotlin.jvm.internal.OooOOO0.OooO0o(recordingCanvasBeginRecording, "beginRecording(...)");
        recordingCanvasBeginRecording.save();
        OooO0O0();
        c21934OooO0Oo.f65204OooO0OO = recordingCanvasBeginRecording;
        Rect rect = this.f65197OooOOo;
        rect.set(((int) Math.floor(modifiedRegionInMainView.f65389OooO00o)) - 3, ((int) Math.floor(modifiedRegionInMainView.f65390OooO0O0)) - 3, ((int) Math.ceil(modifiedRegionInMainView.f65391OooO0OO)) + 3, ((int) Math.ceil(modifiedRegionInMainView.f65392OooO0Oo)) + 3);
        canvas.clipRect(rect);
        RenderNode renderNode2 = this.f65196OooOOOo;
        if (renderNode2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        renderNode2.setClipRect(rect);
        OooO0O0();
        Canvas canvas2 = c21934OooO0Oo.f65204OooO0OO;
        if (canvas2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO00o() {
        OooO0O0();
        OooO0O0();
        C21934OooO0Oo c21934OooO0Oo = this.f65192OooOO0o;
        if (!c21934OooO0Oo.f65202OooO00o) {
            throw new IllegalStateException("Can only finalize rendering during Callback.onDraw.");
        }
        OooO0O0();
        Canvas canvas = c21934OooO0Oo.f65203OooO0O0;
        if (canvas == null) {
            throw new IllegalStateException("Required value was null.");
        }
        RenderNode renderNode = this.f65196OooOOOo;
        if (renderNode == null) {
            throw new IllegalStateException("Required value was null.");
        }
        OooO0O0();
        Canvas canvas2 = c21934OooO0Oo.f65204OooO0OO;
        if (canvas2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Path path = this.f65339OooO0O0;
        if (path != null) {
            canvas2.drawPath(path, this.f65183OooO);
        }
        canvas2.restore();
        renderNode.endRecording();
        if (!renderNode.hasDisplayList()) {
            throw new IllegalStateException("Check failed.");
        }
        canvas.drawRenderNode(renderNode);
        renderNode.setClipRect(null);
        OooO0O0();
        c21934OooO0Oo.f65204OooO0OO = null;
        canvas.restore();
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO0O0() {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("Should not be running on the UI thread.");
        }
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO0OO(InProgressShapeT inProgressShape, Matrix strokeToMainViewTransform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressShape, "inProgressShape");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToMainViewTransform, "strokeToMainViewTransform");
        OooO0O0();
        OooO0O0();
        C21934OooO0Oo c21934OooO0Oo = this.f65192OooOO0o;
        if (!c21934OooO0Oo.f65202OooO00o) {
            throw new IllegalStateException("Can only render during Callback.onDraw.");
        }
        OooO0O0();
        Canvas canvas = c21934OooO0Oo.f65204OooO0OO;
        if (canvas == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iSave = canvas.save();
        canvas.concat(strokeToMainViewTransform);
        try {
            this.f65185OooO0Oo.OooO00o(canvas, inProgressShape, strokeToMainViewTransform);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO0Oo(RunnableC24436OooOoOO runnableC24436OooOoOO) {
        C24442Oooo00o.OooO00o();
        this.f65191OooOO0O.offer(runnableC24436OooOoOO);
        OooOO0();
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final boolean OooO0o() {
        return this.f65189OooO0oo;
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final boolean OooO0oO() {
        return this.f65186OooO0o;
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final boolean OooO0oo() {
        return this.f65188OooO0oO;
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooOO0() {
        this.f65187OooO0o0.OooO0O0();
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooOO0O(C32465OooO0O0 cohort) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cohort, "cohort");
        OooOo oooOo = this.f65195OooOOOO;
        oooOo.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(cohort, "cohort");
        oooOo.f82448OooO0OO.invoke(cohort);
        InProgressShapesView inProgressShapesView = oooOo.f82446OooO00o;
        SurfaceView surfaceView = oooOo.f82447OooO0O0;
        surfaceView.setTranslationX(inProgressShapesView.getResources().getDisplayMetrics().widthPixels * 2.0f);
        surfaceView.setTranslationY(inProgressShapesView.getResources().getDisplayMetrics().heightPixels * 2.0f);
        inProgressShapesView.invalidate();
        oooOo.f82450OooO0o = 0;
        oooOo.f82451OooO0o0.invoke(new RunnableC24432OooOo0O(oooOo));
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooOO0o() {
        OooO0O0();
        OooO0O0();
        C21934OooO0Oo c21934OooO0Oo = this.f65192OooOO0o;
        if (!c21934OooO0Oo.f65202OooO00o) {
            throw new IllegalStateException("Can only clear during Callback.onDraw.");
        }
        OooO0O0();
        Canvas canvas = c21934OooO0Oo.f65203OooO0O0;
        if (canvas == null) {
            throw new IllegalStateException("Required value was null.");
        }
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
    }

    public final void OooOOO0() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        SurfaceView surfaceView = this.f65190OooOO0;
        this.f65184OooO0OO.addView(surfaceView, layoutParams);
        this.f65187OooO0o0.OooO00o(surfaceView, this.f65194OooOOO0);
        if (!this.f65191OooOO0O.isEmpty()) {
            OooOO0();
        }
        this.f65195OooOOOO.getClass();
    }
}
