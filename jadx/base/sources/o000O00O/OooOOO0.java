package o000O00O;

import Oooo0.C20855OooooOO;
import android.graphics.ColorSpace;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.opengl.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.core.util.Consumer;
import androidx.graphics.surface.JniBindings;
import androidx.graphics.surface.OooO00o;
import androidx.graphics.surface.OooO0o;
import androidx.graphics.surface.SurfaceControlCompat;
import androidx.ink.authoring.internal.OooO0O0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C24034Oooo00O;
import o000O00.OooO00o;
import o000O00O.C24398OooOo0O;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public SurfaceControlCompat f82327OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f82328OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SurfaceView f82329OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0O0.C19023OooO0O0.OooO00o f82330OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0Oo.OooO00o f82331OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000O00.OooO00o f82332OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public RenderNode f82333OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C24394OooOOo<T> f82334OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public SurfaceControlCompat f82335OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOOO<T> f82336OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f82337OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AtomicBoolean f82338OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public volatile o000OO0O.OooO0OO f82339OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public HardwareBuffer f82340OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final AtomicInteger f82341OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ColorSpace f82342OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f82343OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f82344OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f82345OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o000O00O.OooO00o f82346OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f82347OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final OooO0o f82348OooOo0O;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooOOO0<T> f82349OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ SurfaceControlCompat f82350OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ C24034Oooo00O<C24394OooOOo<T>> f82351OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SurfaceControlCompat f82352OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f82353OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f82354OooO0o0;

        public OooO00o(OooOOO0<T> oooOOO0, SurfaceControlCompat surfaceControlCompat, C24034Oooo00O<C24394OooOOo<T>> c24034Oooo00O, SurfaceControlCompat surfaceControlCompat2, int i, int i2) {
            this.f82349OooO00o = oooOOO0;
            this.f82350OooO0O0 = surfaceControlCompat;
            this.f82351OooO0OO = c24034Oooo00O;
            this.f82352OooO0Oo = surfaceControlCompat2;
            this.f82354OooO0o0 = i;
            this.f82353OooO0o = i2;
        }
    }

    public OooOOO0(SurfaceView surfaceView, OooO0O0.C19023OooO0O0.OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(surfaceView, "surfaceView");
        this.f82328OooO00o = 1;
        this.f82331OooO0Oo = new o000O0Oo.OooO00o("CanvasRenderThread");
        this.f82336OooOO0 = new OooOOO<>();
        this.f82338OooOO0o = new AtomicBoolean(true);
        this.f82341OooOOOO = new AtomicInteger(0);
        this.f82342OooOOOo = o000O00.OooO00o.f82167OooOoO0;
        this.f82344OooOOo0 = -1;
        this.f82343OooOOo = -1;
        this.f82345OooOOoo = -1;
        this.f82347OooOo00 = -1;
        this.f82346OooOo0 = new o000O00O.OooO00o();
        OooO0o oooO0o = new OooO0o(this);
        this.f82348OooOo0O = oooO0o;
        this.f82329OooO0O0 = surfaceView;
        this.f82330OooO0OO = oooO00o;
        surfaceView.getHolder().addCallback(oooO0o);
        SurfaceHolder holder = surfaceView.getHolder();
        if (holder.getSurface() == null || !holder.getSurface().isValid()) {
            return;
        }
        OooO0o0(surfaceView, surfaceView.getWidth(), surfaceView.getHeight());
        OooO0Oo(this, null, 3);
    }

    public static void OooO0Oo(OooOOO0 oooOOO0, Runnable runnable, int i) {
        List list = Collections.EMPTY_LIST;
        kotlin.jvm.internal.OooOOO0.OooO0o(list, "emptyList()");
        List list2 = list;
        if ((i & 2) != 0) {
            runnable = null;
        }
        oooOOO0.getClass();
        if (oooOOO0.f82337OooOO0O) {
            Log.w("LowLatencyCanvas", "Attempt to render to the multi buffered layer when CanvasFrontBufferedRenderer has been released");
            return;
        }
        OooOOO<T> oooOOO = oooOOO0.f82336OooOO0;
        oooOOO.getClass();
        ReentrantLock reentrantLock = oooOOO.f82324OooO00o;
        reentrantLock.lock();
        try {
            oooOOO.f82325OooO0O0.addAll(list2);
            reentrantLock.unlock();
            oooOOO0.OooO00o(runnable);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void OooO00o(final Runnable runnable) {
        if (this.f82337OooOO0O) {
            Log.w("LowLatencyCanvas", "Attempt to render to the multi buffered layer when CanvasFrontBufferedRenderer has been released");
            return;
        }
        C24394OooOOo<T> c24394OooOOo = this.f82334OooO0oO;
        if (c24394OooOOo != null) {
            c24394OooOOo.f82362OooO0o.OooO00o();
        } else {
            c24394OooOOo = null;
        }
        final C24394OooOOo<T> c24394OooOOo2 = c24394OooOOo;
        OooOOO<T> oooOOO = this.f82336OooOO0;
        ReentrantLock reentrantLock = oooOOO.f82324OooO00o;
        reentrantLock.lock();
        try {
            final ArrayList<T> arrayList = oooOOO.f82325OooO0O0;
            oooOOO.f82325OooO0O0 = new ArrayList<>();
            oooOOO.f82326OooO0OO = 0;
            reentrantLock.unlock();
            final int i = this.f82343OooOOo;
            final int i2 = this.f82345OooOOoo;
            final SurfaceControlCompat surfaceControlCompat = this.f82335OooO0oo;
            final SurfaceControlCompat surfaceControlCompat2 = this.f82327OooO;
            final o000O00.OooO00o oooO00o = this.f82332OooO0o;
            final int i3 = this.f82344OooOOo0;
            final int i4 = this.f82347OooOo00;
            final ColorSpace colorSpace = this.f82342OooOOOo;
            this.f82331OooO0Oo.execute(new Runnable(this, arrayList, colorSpace, i, i2, i4, surfaceControlCompat, surfaceControlCompat2, c24394OooOOo2, i3, runnable) { // from class: o000O00O.OooO0Oo

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ OooOOO0 f82294OooOo;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public final /* synthetic */ ColorSpace f82296OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ ArrayList f82297OooOoO0;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public final /* synthetic */ int f82298OooOoOO;

                /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
                public final /* synthetic */ SurfaceControlCompat f82299OooOoo;

                /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
                public final /* synthetic */ SurfaceControlCompat f82300OooOoo0;

                /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
                public final /* synthetic */ C24394OooOOo f82301OooOooO;

                /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
                public final /* synthetic */ int f82302OooOooo;

                /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
                public final /* synthetic */ Runnable f82303Oooo000;

                {
                    this.f82298OooOoOO = i4;
                    this.f82300OooOoo0 = surfaceControlCompat;
                    this.f82299OooOoo = surfaceControlCompat2;
                    this.f82301OooOooO = c24394OooOOo2;
                    this.f82302OooOooo = i3;
                    this.f82303Oooo000 = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final OooOOO0 this$0 = this.f82294OooOo;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                    ArrayList params = this.f82297OooOoO0;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(params, "$params");
                    ColorSpace targetColorSpace = this.f82296OooOoO;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(targetColorSpace, "$targetColorSpace");
                    final o000O00.OooO00o oooO00o2 = this.f82295OooOo0o;
                    if (oooO00o2 != null) {
                        RenderNode renderNode = this$0.f82333OooO0o0;
                        if (renderNode != null) {
                            kotlin.jvm.internal.OooOOO0.OooO0o(renderNode.beginRecording(), "renderNode.beginRecording()");
                            renderNode.endRecording();
                        }
                        params.clear();
                        OooO00o.OooO0O0 oooO0O0OooO00o = oooO00o2.OooO00o();
                        int i5 = this.f82298OooOoOO;
                        if (i5 != -1) {
                            oooO0O0OooO00o.OooO0O0(i5);
                        }
                        oooO0O0OooO00o.f82170OooO00o = targetColorSpace;
                        final int i6 = this.f82302OooOooo;
                        final Runnable runnable2 = this.f82303Oooo000;
                        final SurfaceControlCompat surfaceControlCompat3 = this.f82300OooOoo0;
                        final SurfaceControlCompat surfaceControlCompat4 = this.f82299OooOoo;
                        final C24394OooOOo c24394OooOOo3 = this.f82301OooOooO;
                        oooO0O0OooO00o.OooO00o(this$0.f82331OooO0Oo, new Consumer() { // from class: o000O00O.OooO0o0
                            @Override // androidx.core.util.Consumer
                            public final void accept(Object obj) {
                                SurfaceControlCompat surfaceControlCompat5;
                                OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) obj;
                                OooOOO0 this$02 = this$0;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(this$02, "this$0");
                                HardwareBuffer hardwareBuffer = oooO0OO.f82174OooO00o;
                                o000O00.OooO00o multiBufferedCanvasRenderer = oooO00o2;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(multiBufferedCanvasRenderer, "multiBufferedCanvasRenderer");
                                SurfaceControlCompat surfaceControlCompat6 = surfaceControlCompat3;
                                if (surfaceControlCompat6 != null && surfaceControlCompat6.f65140OooO00o.isValid() && (surfaceControlCompat5 = surfaceControlCompat4) != null && surfaceControlCompat5.f65140OooO00o.isValid()) {
                                    this$02.f82340OooOOO0 = hardwareBuffer;
                                    C24394OooOOo c24394OooOOo4 = c24394OooOOo3;
                                    if (c24394OooOOo4 != null) {
                                        c24394OooOOo4.f82364OooO0oO.set(false);
                                    }
                                    SurfaceControlCompat.OooO00o oooO00o3 = new SurfaceControlCompat.OooO00o();
                                    oooO00o3.OooOOo0(surfaceControlCompat6, false);
                                    oooO00o3.OooO0OO(surfaceControlCompat6, null, null, null);
                                    oooO00o3.OooOOo0(surfaceControlCompat5, true);
                                    oooO00o3.OooO0OO(surfaceControlCompat5, hardwareBuffer, oooO0OO.f82175OooO0O0, new OooOO0O(this$02, multiBufferedCanvasRenderer, hardwareBuffer));
                                    int i7 = i6;
                                    if (i7 != -1) {
                                        oooO00o3.OooOOO0(surfaceControlCompat5, i7);
                                    }
                                    oooO00o3.commit();
                                }
                                Runnable runnable3 = runnable2;
                                if (runnable3 != null) {
                                    runnable3.run();
                                }
                            }
                        });
                    }
                }
            });
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void OooO0O0() {
        OooOOO<T> oooOOO = this.f82336OooOO0;
        ReentrantLock reentrantLock = oooOOO.f82324OooO00o;
        reentrantLock.lock();
        while (oooOOO.f82326OooO0OO < oooOOO.f82325OooO0O0.size()) {
            try {
                ArrayList<T> arrayList = oooOOO.f82325OooO0O0;
                int i = oooOOO.f82326OooO0OO;
                oooOOO.f82326OooO0OO = i + 1;
                T t = arrayList.get(i);
                C24394OooOOo<T> c24394OooOOo = this.f82334OooO0oO;
                if (c24394OooOOo != null) {
                    c24394OooOOo.OooO00o(t);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        reentrantLock.unlock();
    }

    public final void OooO0OO(final C24390OooO0oO c24390OooO0oO) {
        C24394OooOOo<T> c24394OooOOo = this.f82334OooO0oO;
        if (c24394OooOOo == null) {
            if (c24390OooO0oO != null) {
                this.f82331OooO0Oo.execute(new Runnable() { // from class: o000O00O.OooO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        c24390OooO0oO.invoke();
                    }
                });
                return;
            }
            return;
        }
        SurfaceControlCompat surfaceControlCompat = this.f82335OooO0oo;
        SurfaceControlCompat surfaceControlCompat2 = this.f82327OooO;
        o000O00.OooO00o oooO00o = this.f82332OooO0o;
        RenderNode renderNode = this.f82333OooO0o0;
        this.f82335OooO0oo = null;
        this.f82327OooO = null;
        this.f82334OooO0oO = null;
        this.f82332OooO0o = null;
        this.f82333OooO0o0 = null;
        this.f82343OooOOo = -1;
        this.f82345OooOOoo = -1;
        this.f82347OooOo00 = -1;
        final C24398OooOo0O c24398OooOo0O = new C24398OooOo0O(new C24391OooO0oo(this, surfaceControlCompat, surfaceControlCompat2, oooO00o, renderNode, c24390OooO0oO), c24394OooOOo);
        final o000O00.OooOo oooOo = c24394OooOOo.f82362OooO0o;
        AtomicBoolean atomicBoolean = oooOo.f82238OooO0oo;
        if (atomicBoolean.get()) {
            return;
        }
        oooOo.OooO00o();
        Runnable runnable = new Runnable() { // from class: o000O00.OooOo0o
            @Override // java.lang.Runnable
            public final void run() {
                OooOo this$0 = oooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                this$0.f82237OooO0oO = c24398OooOo0O;
                if (this$0.f82235OooO0o || !this$0.f82236OooO0o0.isEmpty()) {
                    return;
                }
                C24398OooOo0O c24398OooOo0O2 = this$0.f82237OooO0oO;
                if (c24398OooOo0O2 != null) {
                    c24398OooOo0O2.invoke();
                }
                this$0.f82237OooO0oO = null;
            }
        };
        o000O0Oo.OooO00o oooO00o2 = oooOo.f82231OooO00o;
        oooO00o2.getClass();
        oooO00o2.f82379OooOo.post(runnable);
        atomicBoolean.set(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, o000O00O.OooOOo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0o0(SurfaceView surfaceView, int i, int i2) {
        int iOooO00o;
        Integer numValueOf;
        int i3;
        int i4;
        int i5;
        SurfaceControlCompat.OooO00o oooO00o;
        int i6;
        int i7;
        kotlin.jvm.internal.OooOOO0.OooO0oO(surfaceView, "surfaceView");
        if (i <= 0 || i2 <= 0) {
            Log.w("LowLatencyCanvas", "Invalid dimensions provided, width and height must be > 0. width: " + i + " height: " + i2);
            return;
        }
        this.f82346OooOo0.getClass();
        int i8 = -1;
        if (Build.VERSION.SDK_INT >= 32) {
            iOooO00o = C24401OooOoO0.f82375OooO00o.OooO00o(surfaceView);
        } else {
            try {
                Display display = surfaceView.getDisplay();
                numValueOf = display != null ? Integer.valueOf(display.getRotation()) : null;
            } catch (Exception e) {
                Log.w("TRANSFORM_HINT_RESOLVER", "Unable to obtain current display orientation", e);
            }
            if (numValueOf != null) {
                JniBindings.Companion companion = JniBindings.f65114OooO00o;
                String strNGetSurfaceFlingerOrientation = companion.nGetSurfaceFlingerOrientation();
                int iOooO0O0 = !C33599OooOo0O.Oooo0o0(strNGetSurfaceFlingerOrientation) ? o000O00O.OooO00o.OooO0O0(numValueOf.intValue(), strNGetSurfaceFlingerOrientation) : o000O00O.OooO00o.OooO00o(numValueOf.intValue(), companion.nGetMinUiRotation());
                Log.v("TRANSFORM_HINT_RESOLVER", "Obtained transform: " + iOooO0O0);
                iOooO00o = iOooO0O0;
            } else {
                Log.w("TRANSFORM_HINT_RESOLVER", "Unable to obtain current display rotation");
                iOooO00o = -1;
            }
        }
        if ((this.f82347OooOo00 == iOooO00o && this.f82343OooOOo == i && this.f82345OooOOoo == i2) || this.f82337OooOO0O) {
            return;
        }
        OooO0OO(null);
        float[] fArr = new float[16];
        if (iOooO00o == 0) {
            i8 = 0;
        } else if (iOooO00o == 7) {
            i8 = 4;
        } else if (iOooO00o == 3) {
            i8 = 3;
        } else if (iOooO00o == 4) {
            i8 = 7;
        }
        float f = i;
        float f2 = i2;
        if (i8 != 0) {
            if (i8 == 7) {
                Matrix.setRotateM(fArr, 0, 90.0f, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(fArr, 0, 0.0f, -f2, 0.0f);
            } else if (i8 == 3) {
                Matrix.setRotateM(fArr, 0, 180.0f, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(fArr, 0, -f, -f2, 0.0f);
            } else if (i8 != 4) {
                Matrix.setIdentityM(fArr, 0);
            } else {
                Matrix.setRotateM(fArr, 0, -90.0f, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(fArr, 0, -f, 0.0f, 0.0f);
            }
            i3 = i;
            i4 = i2;
            i5 = Build.VERSION.SDK_INT;
            OooO0o.OooO00o oooO00o2 = androidx.graphics.surface.OooO0o.f65129OooO00o;
            OooO00o.InterfaceC19018OooO00o interfaceC19018OooO00oOooO0O0 = i5 < 33 ? oooO00o2.OooO0O0() : oooO00o2.OooO00o();
            interfaceC19018OooO00oOooO0O0.OooO00o(surfaceView);
            interfaceC19018OooO00oOooO0O0.setName("MultiBufferedLayer");
            androidx.graphics.surface.OooO00o oooO00oBuild = interfaceC19018OooO00oOooO0O0.build();
            SurfaceControlCompat surfaceControlCompat = new SurfaceControlCompat(oooO00oBuild);
            HashMap map = new HashMap();
            OooO00o.OooO0O0 oooO0O0OooO0Oo = i5 < 33 ? oooO00o2.OooO0Oo() : oooO00o2.OooO0OO();
            oooO0O0OooO0Oo.OoooOoo(oooO00oBuild, true);
            map.clear();
            oooO0O0OooO0Oo.commit();
            OooO00o.InterfaceC19018OooO00o interfaceC19018OooO00oOooO0O02 = i5 < 33 ? oooO00o2.OooO0O0() : oooO00o2.OooO00o();
            interfaceC19018OooO00oOooO0O02.OooO0O0(surfaceControlCompat);
            interfaceC19018OooO00oOooO0O02.setName("FrontBufferedLayer");
            androidx.graphics.surface.OooO00o oooO00oBuild2 = interfaceC19018OooO00oOooO0O02.build();
            SurfaceControlCompat surfaceControlCompat2 = new SurfaceControlCompat(oooO00oBuild2);
            if (i5 < 30) {
                SurfaceControlCompat.OooO00o oooO00o3 = new SurfaceControlCompat.OooO00o();
                if (i5 >= 30) {
                    oooO00o3.f65141OooOo.o0000OO(oooO00oBuild2);
                }
                oooO00o = oooO00o3;
            } else {
                oooO00o = null;
            }
            if (oooO00o != null) {
                oooO00o.commit();
            }
            C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
            int i9 = iOooO00o;
            int i10 = i8;
            OooO00o oooO00o4 = new OooO00o(this, surfaceControlCompat2, c24034Oooo00O, surfaceControlCompat, i9, i10);
            i6 = i3;
            i7 = i4;
            ?? r12 = (T) new C24394OooOOo(i, i2, i7, i6, this.f82328OooO00o, i9, this.f82331OooO0Oo, oooO00o4);
            ColorSpace colorSpace = this.f82342OooOOOo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "<set-?>");
            r12.f82366OooOO0 = colorSpace;
            c24034Oooo00O.f80942OooOo0o = r12;
            RenderNode renderNodeOooO00o = OooO0O0.OooO00o();
            renderNodeOooO00o.setPosition(0, 0, i, i2);
            if (i7 > 0 || i6 <= 0) {
                throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i7, i6, "Invalid dimensions provided, width and height must be > 0. width: ", " height: "));
            }
            o000O00.OooO00o oooO00o5 = new o000O00.OooO00o(i7, i6, this.f82328OooO00o, 3, 0, 2816L);
            oooO00o5.oo000o(renderNodeOooO00o);
            this.f82332OooO0o = oooO00o5;
            this.f82333OooO0o0 = renderNodeOooO00o;
            this.f82335OooO0oo = surfaceControlCompat2;
            this.f82334OooO0oO = (C24394OooOOo) c24034Oooo00O.f80942OooOo0o;
            this.f82327OooO = surfaceControlCompat;
            this.f82347OooOo00 = i9;
            this.f82343OooOOo = i;
            this.f82345OooOOoo = i2;
            this.f82344OooOOo0 = i10;
            return;
        }
        Matrix.setIdentityM(fArr, 0);
        i4 = i;
        i3 = i2;
        i5 = Build.VERSION.SDK_INT;
        OooO0o.OooO00o oooO00o22 = androidx.graphics.surface.OooO0o.f65129OooO00o;
        if (i5 < 33) {
        }
        interfaceC19018OooO00oOooO0O0.OooO00o(surfaceView);
        interfaceC19018OooO00oOooO0O0.setName("MultiBufferedLayer");
        androidx.graphics.surface.OooO00o oooO00oBuild3 = interfaceC19018OooO00oOooO0O0.build();
        SurfaceControlCompat surfaceControlCompat3 = new SurfaceControlCompat(oooO00oBuild3);
        HashMap map2 = new HashMap();
        if (i5 < 33) {
        }
        oooO0O0OooO0Oo.OoooOoo(oooO00oBuild3, true);
        map2.clear();
        oooO0O0OooO0Oo.commit();
        if (i5 < 33) {
        }
        interfaceC19018OooO00oOooO0O02.OooO0O0(surfaceControlCompat3);
        interfaceC19018OooO00oOooO0O02.setName("FrontBufferedLayer");
        androidx.graphics.surface.OooO00o oooO00oBuild22 = interfaceC19018OooO00oOooO0O02.build();
        SurfaceControlCompat surfaceControlCompat22 = new SurfaceControlCompat(oooO00oBuild22);
        if (i5 < 30) {
        }
        if (oooO00o != null) {
        }
        C24034Oooo00O c24034Oooo00O2 = new C24034Oooo00O();
        int i92 = iOooO00o;
        int i102 = i8;
        OooO00o oooO00o42 = new OooO00o(this, surfaceControlCompat22, c24034Oooo00O2, surfaceControlCompat3, i92, i102);
        i6 = i3;
        i7 = i4;
        ?? r122 = (T) new C24394OooOOo(i, i2, i7, i6, this.f82328OooO00o, i92, this.f82331OooO0Oo, oooO00o42);
        ColorSpace colorSpace2 = this.f82342OooOOOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace2, "<set-?>");
        r122.f82366OooOO0 = colorSpace2;
        c24034Oooo00O2.f80942OooOo0o = r122;
        RenderNode renderNodeOooO00o2 = OooO0O0.OooO00o();
        renderNodeOooO00o2.setPosition(0, 0, i, i2);
        if (i7 > 0) {
        }
        throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i7, i6, "Invalid dimensions provided, width and height must be > 0. width: ", " height: "));
    }
}
