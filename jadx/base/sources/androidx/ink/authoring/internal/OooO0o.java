package androidx.ink.authoring.internal;

import Oooo0.C20855OooooOO;
import Oooo0.C20856OooooOo;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C21650OooOoO;
import androidx.core.util.Consumer;
import androidx.graphics.surface.OooO00o;
import androidx.graphics.surface.OooO0o;
import androidx.graphics.surface.SurfaceControlCompat;
import androidx.ink.authoring.InProgressShapesView;
import androidx.ink.authoring.internal.OooO0o;
import androidx.ink.geometry.MutableBox;
import androidx.transition.C22111OooOoo;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o000O00.OooO00o;
import o000O0oO.OooO0O0;
import o000O0oo.C24425OooOO0O;
import o000O0oo.C24426OooOO0o;
import o000O0oo.C24427OooOOOo;
import o000O0oo.C24442Oooo00o;
import o000O0oo.OooOo00;
import o000O0oo.RunnableC24428OooOOo;
import o000O0oo.RunnableC24436OooOoOO;
import oO00ooO.InterfaceC32437OooO0o0;
import oO00ooOO.C32465OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<ShapeSpecT, InProgressShapeT extends o000O0oO.OooO0O0<? super ShapeSpecT, ? extends CompletedShapeT>, CompletedShapeT> extends OooOOO<ShapeSpecT, InProgressShapeT, CompletedShapeT> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f65205OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InProgressShapesView f65206OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0oO.OooOO0 f65207OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oO0O000o.OooO00o<InterfaceExecutorC21935OooO0Oo> f65208OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceExecutorC21935OooO0Oo f65209OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f65210OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f65211OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final SurfaceView f65212OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o f65213OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AtomicInteger f65214OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C24426OooOO0o f65215OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final SurfaceHolderCallback2C21942OooO0oo f65216OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Paint f65217OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Paint f65218OooOOOo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f65219OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f65220OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f65221OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f65222OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Integer f65223OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f65224OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Integer f65225OooO0oO;

        public OooO00o(int i, int i2, int i3) {
            this.f65219OooO00o = i;
            this.f65220OooO0O0 = i2;
            this.f65221OooO0OO = i3;
            if (i3 == 4 || i3 == 7) {
                this.f65223OooO0o = Integer.valueOf(i3);
                this.f65225OooO0oO = i3 == 4 ? 7 : 4;
                this.f65222OooO0Oo = i2;
                this.f65224OooO0o0 = i;
            } else {
                if (i3 == 0 || i3 == 3) {
                    this.f65223OooO0o = Integer.valueOf(i3);
                    this.f65225OooO0oO = Integer.valueOf(i3);
                } else {
                    this.f65223OooO0o = null;
                    this.f65225OooO0oO = null;
                }
                this.f65222OooO0Oo = i;
                this.f65224OooO0o0 = i2;
            }
            if ((this.f65223OooO0o == null) != (this.f65225OooO0oO == null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SurfaceControlCompat f65226OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O00.OooO00o f65227OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final RenderNode f65228OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final RenderNode f65229OooO0Oo;

        public OooO0O0(SurfaceControlCompat surfaceControlCompat, o000O00.OooO00o oooO00o, RenderNode renderNode, RenderNode renderNode2) {
            this.f65226OooO00o = surfaceControlCompat;
            this.f65227OooO0O0 = oooO00o;
            this.f65228OooO0OO = renderNode;
            this.f65229OooO0Oo = renderNode2;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f65230OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0O0 f65231OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f65232OooO0OO;

        public OooO0OO(OooO0O0 oooO0O0, OooO0O0 oooO0O02, boolean z) {
            this.f65230OooO00o = oooO0O0;
            this.f65231OooO0O0 = oooO0O02;
            this.f65232OooO0OO = z;
            if (oooO0O0.equals(oooO0O02)) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceExecutorC21935OooO0Oo extends Executor {
        boolean OooOOoo();

        void o0000Oo0(OooOo00 oooOo00);

        void shutdown();
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o$OooO0o, reason: collision with other inner class name */
    public final class C19024OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f65234OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceExecutorC21935OooO0Oo f65235OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final AtomicBoolean f65236OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicReference<OooO0OO> f65237OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C21937OooO0o0 f65238OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicInteger f65239OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final C24427OooOOOo f65240OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final RunnableC24428OooOOo f65241OooO0oo;

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o$OooO0o$OooO00o */
        public static final class OooO00o implements SurfaceControlCompat.TransactionCommittedListener {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o f65242OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65243OooO0O0;

            public OooO00o(OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o, OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o) {
                this.f65242OooO00o = c19024OooO0o;
                this.f65243OooO0O0 = oooO0o;
            }

            @Override // androidx.graphics.surface.SurfaceControlCompat.TransactionCommittedListener
            public final void onTransactionCommitted() {
                OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o = this.f65242OooO00o;
                if (c19024OooO0o.f65236OooO0OO.get()) {
                    return;
                }
                if (this.f65243OooO0O0.f65214OooOO0o.getAndUpdate(new o000O0oo.OooOOO0()) > 0) {
                    c19024OooO0o.OooO0Oo();
                }
                c19024OooO0o.OooO0o0();
            }
        }

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o$OooO0o$OooO0O0 */
        public static final class OooO0O0 implements SurfaceControlCompat.TransactionCommittedListener {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o f65244OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65245OooO0O0;

            public OooO0O0(OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o, OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o) {
                this.f65244OooO00o = c19024OooO0o;
                this.f65245OooO0O0 = oooO0o;
            }

            @Override // androidx.graphics.surface.SurfaceControlCompat.TransactionCommittedListener
            public final void onTransactionCommitted() {
                if (this.f65244OooO00o.f65236OooO0OO.get()) {
                    return;
                }
                this.f65245OooO0O0.f65206OooO0OO.invalidate();
            }
        }

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o$OooO0o$OooO0OO */
        public static final class OooO0OO implements SurfaceControlCompat.TransactionCommittedListener {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f65246OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65247OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final /* synthetic */ OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o f65248OooO0OO;

            public OooO0OO(OooO0OO oooO0OO, C19024OooO0o c19024OooO0o, OooO0o oooO0o) {
                this.f65246OooO00o = oooO0OO;
                this.f65247OooO0O0 = oooO0o;
                this.f65248OooO0OO = c19024OooO0o;
            }

            @Override // androidx.graphics.surface.SurfaceControlCompat.TransactionCommittedListener
            public final void onTransactionCommitted() {
                OooO0OO oooO0OO = this.f65246OooO00o;
                OooO0O0 oooO0O0 = oooO0OO.f65230OooO00o;
                oooO0O0.f65227OooO0O0.close();
                oooO0O0.f65228OooO0OO.discardDisplayList();
                oooO0O0.f65229OooO0Oo.discardDisplayList();
                oooO0O0.f65226OooO00o.f65140OooO00o.release();
                OooO0O0 oooO0O02 = oooO0OO.f65231OooO0O0;
                oooO0O02.f65227OooO0O0.close();
                oooO0O02.f65228OooO0OO.discardDisplayList();
                oooO0O02.f65229OooO0Oo.discardDisplayList();
                oooO0O02.f65226OooO00o.f65140OooO00o.release();
                this.f65247OooO0O0.f65206OooO0OO.postInvalidate();
                this.f65248OooO0OO.f65235OooO0O0.shutdown();
            }
        }

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o$OooO0o$OooO0Oo, reason: case insensitive filesystem */
        public static final class C21936OooO0Oo implements SurfaceControlCompat.TransactionCommittedListener {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o f65249OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f65250OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final /* synthetic */ OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> f65251OooO0OO;

            public C21936OooO0Oo(OooO0OO oooO0OO, C19024OooO0o c19024OooO0o, OooO0o oooO0o) {
                this.f65249OooO00o = c19024OooO0o;
                this.f65250OooO0O0 = oooO0OO;
                this.f65251OooO0OO = oooO0o;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
            
                r0 = (androidx.ink.authoring.internal.OooOO0) r6.f65251OooO0OO.OooO0o0();
                r1 = r0.f65275OooOOO.f65337OooO0oo.f65292OooO00o.getAndSet(null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            
                if (r1 != null) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
            
                r1.countDown();
                r0.OooOOOo();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
            
                return;
             */
            @Override // androidx.graphics.surface.SurfaceControlCompat.TransactionCommittedListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onTransactionCommitted() {
                OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o = this.f65249OooO00o;
                if (!c19024OooO0o.f65236OooO0OO.get()) {
                    OooO0OO oooO0OO = this.f65250OooO0O0;
                    OooO0OO oooO0OO2 = new OooO0OO(oooO0OO.f65230OooO00o, oooO0OO.f65231OooO0O0, true);
                    AtomicReference<OooO0OO> atomicReference = c19024OooO0o.f65237OooO0Oo;
                    while (true) {
                        if (atomicReference.compareAndSet(oooO0OO, oooO0OO2)) {
                            break;
                        } else if (atomicReference.get() != oooO0OO) {
                            if (!c19024OooO0o.f65236OooO0OO.get()) {
                                throw new IllegalStateException("Buffers state should not change during a handoff on the render thread unless the view is discarded.");
                            }
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o$OooO0o$OooO0o0, reason: case insensitive filesystem */
        public static final class C21937OooO0o0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public OooO0O0 f65252OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public Canvas f65253OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final Rect f65254OooO0OO = new Rect();

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Canvas f65255OooO0Oo;
        }

        public C19024OooO0o(OooO00o oooO00o) {
            this.f65234OooO00o = oooO00o;
            InterfaceExecutorC21935OooO0Oo interfaceExecutorC21935OooO0OoInvoke = OooO0o.this.f65208OooO0o.invoke();
            this.f65235OooO0O0 = interfaceExecutorC21935OooO0OoInvoke;
            this.f65236OooO0OO = new AtomicBoolean(false);
            this.f65237OooO0Oo = new AtomicReference<>();
            this.f65239OooO0o0 = new AtomicInteger(1);
            this.f65238OooO0o = new C21937OooO0o0();
            this.f65240OooO0oO = new C24427OooOOOo(this, 0);
            C24442Oooo00o.OooO00o();
            final OooO0O0 OooO0O02 = OooO0O0(1);
            final OooO0OO oooO0OO = new OooO0OO(OooO0O02, OooO0O0(2), false);
            ((OooOO0) OooO0o.this.OooO0o0()).OooOOOO();
            OooO00o.OooO0O0 oooO0O0OooO00o = OooO0O02.f65227OooO0O0.OooO00o();
            oooO0O0OooO00o.f82172OooO0OO = true;
            Integer num = oooO00o.f65223OooO0o;
            if (num != null) {
                oooO0O0OooO00o.OooO0O0(num.intValue());
            }
            oooO0O0OooO00o.OooO00o(interfaceExecutorC21935OooO0OoInvoke, new Consumer() { // from class: o000O0oo.OooOOo0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    OooO00o.OooO0OO renderResult = (OooO00o.OooO0OO) obj;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(renderResult, "renderResult");
                    OooO0o.C19024OooO0o c19024OooO0o = this.f82440OooOo0o;
                    if (c19024OooO0o.f65237OooO0Oo.getAndSet(oooO0OO) != null) {
                        throw new IllegalStateException("BuffersState was not null when initializing the first viewport.");
                    }
                    boolean z = c19024OooO0o.f65236OooO0OO.get();
                    OooO0o.InterfaceExecutorC21935OooO0Oo interfaceExecutorC21935OooO0Oo = c19024OooO0o.f65235OooO0O0;
                    if (!z) {
                        SurfaceControlCompat.OooO00o oooO00o2 = new SurfaceControlCompat.OooO00o();
                        c19024OooO0o.OooO0o(oooO00o2, OooO0O02, renderResult.f82174OooO00o, renderResult.f82175OooO0O0);
                        androidx.ink.authoring.internal.OooO0o oooO0o = oooO0o;
                        oooO00o2.OooO00o(interfaceExecutorC21935OooO0Oo, new OooO0o.C19024OooO0o.OooO00o(c19024OooO0o, oooO0o));
                        oooO00o2.OooO00o(oooO0o.f65209OooO0o0, new OooO0o.C19024OooO0o.OooO0O0(c19024OooO0o, oooO0o));
                        oooO00o2.commit();
                        return;
                    }
                    OooO0o.OooO0OO andSet = c19024OooO0o.f65237OooO0Oo.getAndSet(null);
                    if (andSet != null) {
                        OooO0o.OooO0O0 oooO0O0 = andSet.f65230OooO00o;
                        oooO0O0.f65227OooO0O0.close();
                        oooO0O0.f65228OooO0OO.discardDisplayList();
                        oooO0O0.f65229OooO0Oo.discardDisplayList();
                        oooO0O0.f65226OooO00o.f65140OooO00o.release();
                        OooO0o.OooO0O0 oooO0O02 = andSet.f65231OooO0O0;
                        oooO0O02.f65227OooO0O0.close();
                        oooO0O02.f65228OooO0OO.discardDisplayList();
                        oooO0O02.f65229OooO0Oo.discardDisplayList();
                        oooO0O02.f65226OooO00o.f65140OooO00o.release();
                        interfaceExecutorC21935OooO0Oo.shutdown();
                    }
                }
            });
            this.f65241OooO0oo = new RunnableC24428OooOOo(this, 0);
        }

        public final void OooO00o() {
            if (this.f65235OooO0O0.OooOOoo()) {
                return;
            }
            throw new IllegalStateException(("Should be running on render thread, but actually running on " + Thread.currentThread() + ".").toString());
        }

        public final OooO0O0 OooO0O0(int i) {
            long j = HardwareBuffer.isSupported(1, 1, 1, 1, 4294970112L) ? 4294970112L : 2864L;
            OooO00o oooO00o = this.f65234OooO00o;
            int i2 = oooO00o.f65222OooO0Oo;
            int i3 = oooO00o.f65224OooO0o0;
            if (i2 <= 0 || i3 <= 0) {
                throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i2, i3, "Invalid dimensions provided, width and height must be > 0. width: ", " height: "));
            }
            o000O00.OooO00o oooO00o2 = new o000O00.OooO00o(i2, i3, 1, 1, 0, j | 2816);
            String name = C21650OooOoO.OooO00o(i, "-CanvasInProgressStrokesRenderHelperV33");
            RenderNode renderNodeOooO0O0 = C22111OooOoo.OooO0O0(name + "-OffScreen");
            renderNodeOooO0O0.setPosition(0, 0, oooO00o.f65219OooO00o, oooO00o.f65220OooO0O0);
            renderNodeOooO0O0.setHasOverlappingRendering(true);
            OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o = OooO0o.this;
            renderNodeOooO0O0.setUseCompositingLayer(true, oooO0o.f65218OooOOOo);
            RenderNode renderNodeOooO0O02 = C22111OooOoo.OooO0O0(name + "-Front");
            renderNodeOooO0O02.setPosition(0, 0, oooO00o.f65219OooO00o, oooO00o.f65220OooO0O0);
            oooO00o2.oo000o(renderNodeOooO0O02);
            int i4 = Build.VERSION.SDK_INT;
            OooO0o.OooO00o oooO00o3 = androidx.graphics.surface.OooO0o.f65129OooO00o;
            OooO00o.InterfaceC19018OooO00o interfaceC19018OooO00oOooO0O0 = i4 >= 33 ? oooO00o3.OooO0O0() : oooO00o3.OooO00o();
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            interfaceC19018OooO00oOooO0O0.setName(name);
            SurfaceView surfaceView = oooO0o.f65212OooOO0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(surfaceView, "surfaceView");
            interfaceC19018OooO00oOooO0O0.OooO00o(surfaceView);
            return new OooO0O0(new SurfaceControlCompat(interfaceC19018OooO00oOooO0O0.build()), oooO00o2, renderNodeOooO0O02, renderNodeOooO0O0);
        }

        public final void OooO0OO() {
            OooO0OO andSet;
            C24442Oooo00o.OooO00o();
            if (this.f65236OooO0OO.getAndSet(true) || (andSet = this.f65237OooO0Oo.getAndSet(null)) == null) {
                return;
            }
            SurfaceControlCompat.OooO00o oooO00o = new SurfaceControlCompat.OooO00o();
            OooO0oO(oooO00o, andSet.f65230OooO00o);
            OooO0oO(oooO00o, andSet.f65231OooO0O0);
            oooO00o.OooO00o(this.f65235OooO0O0, new OooO0OO(andSet, this, OooO0o.this));
            oooO00o.commit();
        }

        public final void OooO0Oo() {
            OooO00o();
            OooO0OO oooO0OO = this.f65237OooO0Oo.get();
            AtomicBoolean atomicBoolean = this.f65236OooO0OO;
            boolean z = atomicBoolean.get();
            OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o = OooO0o.this;
            if (!z && oooO0OO != null) {
                C21937OooO0o0 c21937OooO0o0 = this.f65238OooO0o;
                if (c21937OooO0o0.f65252OooO00o == null) {
                    OooO0O0 oooO0O0 = oooO0OO.f65230OooO00o;
                    c21937OooO0o0.f65252OooO00o = oooO0O0;
                    RenderNode renderNode = oooO0O0.f65228OooO0OO;
                    RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
                    kotlin.jvm.internal.OooOOO0.OooO0o(recordingCanvasBeginRecording, "beginRecording(...)");
                    int saveCount = recordingCanvasBeginRecording.getSaveCount();
                    c21937OooO0o0.f65253OooO0O0 = recordingCanvasBeginRecording;
                    ((OooOO0) oooO0o.OooO0o0()).OooOO0O();
                    c21937OooO0o0.f65253OooO0O0 = null;
                    ((OooOO0) oooO0o.OooO0o0()).OooOO0o();
                    if (!atomicBoolean.get() && recordingCanvasBeginRecording.getSaveCount() != saveCount) {
                        throw new IllegalStateException(C20856OooooOo.OooO0O0("Unbalanced saves and restores. Expected save count of ", saveCount, ", got ", ".", recordingCanvasBeginRecording.getSaveCount()).toString());
                    }
                    renderNode.endRecording();
                    OooO00o.OooO0O0 oooO0O0OooO00o = oooO0O0.f65227OooO0O0.OooO00o();
                    oooO0O0OooO00o.f82172OooO0OO = true;
                    Integer num = this.f65234OooO00o.f65223OooO0o;
                    if (num != null) {
                        oooO0O0OooO00o.OooO0O0(num.intValue());
                    }
                    oooO0O0OooO00o.OooO00o(this.f65235OooO0O0, new C21939OooO0oO(this.f65240OooO0oO));
                    return;
                }
            }
            oooO0o.f65214OooOO0o.getAndIncrement();
        }

        public final void OooO0o(SurfaceControlCompat.OooO00o oooO00o, OooO0O0 oooO0O0, HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO) {
            SurfaceControlCompat surfaceControlCompat = oooO0O0.f65226OooO00o;
            oooO00o.OooOOo0(surfaceControlCompat, true);
            oooO00o.OooO0OO(surfaceControlCompat, hardwareBuffer, oooO0OO, null);
            int andIncrement = this.f65239OooO0o0.getAndIncrement();
            OooO00o.OooO0O0 oooO0O02 = oooO00o.f65141OooOo;
            androidx.graphics.surface.OooO00o oooO00o2 = surfaceControlCompat.f65140OooO00o;
            oooO0O02.o00Ooo(oooO00o2, andIncrement);
            if (Build.VERSION.SDK_INT >= 30) {
                oooO0O02.o0000OO(oooO00o2);
            }
            oooO0O02.OooOoo0(oooO00o2);
            Integer num = this.f65234OooO00o.f65225OooO0oO;
            if (num != null) {
                oooO00o.OooOOO0(surfaceControlCompat, num.intValue());
            }
        }

        public final void OooO0o0() {
            OooO00o();
            final OooO0OO oooO0OO = this.f65237OooO0Oo.get();
            if (oooO0OO == null) {
                return;
            }
            if (oooO0OO.f65232OooO0OO) {
                throw new IllegalStateException("This should only be called once, after the inactive buffer has been hidden.");
            }
            OooO0O0 oooO0O0 = oooO0OO.f65231OooO0O0;
            RenderNode renderNode = oooO0O0.f65228OooO0OO;
            RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
            BlendMode unused = BlendMode.CLEAR;
            recordingCanvasBeginRecording.drawColor(0, BlendMode.CLEAR);
            renderNode.endRecording();
            OooO00o.OooO0O0 oooO0O0OooO00o = oooO0O0.f65227OooO0O0.OooO00o();
            oooO0O0OooO00o.f82172OooO0OO = true;
            Integer num = this.f65234OooO00o.f65223OooO0o;
            if (num != null) {
                oooO0O0OooO00o.OooO0O0(num.intValue());
            }
            final OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o = OooO0o.this;
            oooO0O0OooO00o.OooO00o(this.f65235OooO0O0, new Consumer() { // from class: o000O0oo.OooOOoo
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    OooO00o.OooO0OO renderResult = (OooO00o.OooO0OO) obj;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(renderResult, "renderResult");
                    OooO0o.C19024OooO0o c19024OooO0o = this;
                    if (c19024OooO0o.f65236OooO0OO.get()) {
                        return;
                    }
                    SurfaceControlCompat.OooO00o oooO00o = new SurfaceControlCompat.OooO00o();
                    OooO0o.OooO0OO oooO0OO2 = oooO0OO;
                    c19024OooO0o.OooO0o(oooO00o, oooO0OO2.f65231OooO0O0, renderResult.f82174OooO00o, renderResult.f82175OooO0O0);
                    oooO00o.OooO00o(c19024OooO0o.f65235OooO0O0, new OooO0o.C19024OooO0o.C21936OooO0Oo(oooO0OO2, c19024OooO0o, oooO0o));
                    oooO00o.commit();
                }
            });
        }

        public final void OooO0oO(SurfaceControlCompat.OooO00o oooO00o, OooO0O0 oooO0O0) {
            SurfaceControlCompat surfaceControlCompat = oooO0O0.f65226OooO00o;
            oooO00o.OooOOo0(surfaceControlCompat, false);
            oooO00o.OooO0OO(surfaceControlCompat, null, null, null);
            OooO00o.OooO0O0 oooO0O02 = oooO00o.f65141OooOo;
            androidx.graphics.surface.OooO00o oooO00o2 = surfaceControlCompat.f65140OooO00o;
            oooO0O02.o00Ooo(oooO00o2, 0);
            if (Build.VERSION.SDK_INT >= 30) {
                oooO0O02.o00ooo(oooO00o2);
            }
            oooO0O02.OooOoo0(oooO00o2);
            if (this.f65234OooO00o.f65225OooO0oO != null) {
                oooO00o.OooOOO0(surfaceControlCompat, 0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o$OooO0o0, reason: case insensitive filesystem */
    public static final class C21938OooO0o0 implements InterfaceExecutorC21935OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Handler f65256OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Thread f65257OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final AtomicBoolean f65258OooOoO0 = new AtomicBoolean(false);

        public C21938OooO0o0(Thread thread, Handler handler) {
            this.f65257OooOo0o = thread;
            this.f65256OooOo = handler;
        }

        @Override // androidx.ink.authoring.internal.OooO0o.InterfaceExecutorC21935OooO0Oo
        public final boolean OooOOoo() {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(Thread.currentThread(), this.f65257OooOo0o);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable command) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(command, "command");
            this.f65256OooOo.post(command);
        }

        @Override // androidx.ink.authoring.internal.OooO0o.InterfaceExecutorC21935OooO0Oo
        public final void o0000Oo0(OooOo00 oooOo00) {
            TimeUnit delayTimeUnit = TimeUnit.MILLISECONDS;
            kotlin.jvm.internal.OooOOO0.OooO0oO(delayTimeUnit, "delayTimeUnit");
            this.f65256OooOo.postDelayed(oooOo00, delayTimeUnit.toMillis(500L));
        }

        @Override // androidx.ink.authoring.internal.OooO0o.InterfaceExecutorC21935OooO0Oo
        public final void shutdown() {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f65257OooOo0o, Looper.getMainLooper().getThread())) {
                throw new IllegalStateException("Check failed.");
            }
            this.f65258OooOoO0.getAndSet(true);
            this.f65256OooOo.getLooper().quitSafely();
        }
    }

    /* JADX INFO: renamed from: androidx.ink.authoring.internal.OooO0o$OooO0oO, reason: case insensitive filesystem */
    public static final class C21939OooO0oO implements Consumer, kotlin.jvm.internal.OooO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24427OooOOOo f65259OooOo0o;

        public C21939OooO0oO(C24427OooOOOo function) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(function, "function");
            this.f65259OooOo0o = function;
        }

        @Override // androidx.core.util.Consumer
        public final /* synthetic */ void accept(Object obj) {
            this.f65259OooOo0o.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Consumer) || !(obj instanceof kotlin.jvm.internal.OooO)) {
                return false;
            }
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f65259OooOo0o, ((kotlin.jvm.internal.OooO) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.OooO
        public final InterfaceC32437OooO0o0<?> getFunctionDelegate() {
            return this.f65259OooOo0o;
        }

        public final int hashCode() {
            return this.f65259OooOo0o.hashCode();
        }
    }

    public OooO0o(InProgressShapesView mainView, o000O0oO.OooOO0 renderer) {
        Looper mainLooper = Looper.getMainLooper();
        Thread thread = mainLooper.getThread();
        kotlin.jvm.internal.OooOOO0.OooO0o(thread, "getThread(...)");
        C21938OooO0o0 c21938OooO0o0 = new C21938OooO0o0(thread, new Handler(mainLooper));
        C24425OooOO0O c24425OooOO0O = new C24425OooOO0O();
        kotlin.jvm.internal.OooOOO0.OooO0oO(mainView, "mainView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderer, "renderer");
        this.f65206OooO0OO = mainView;
        this.f65207OooO0Oo = renderer;
        this.f65209OooO0o0 = c21938OooO0o0;
        this.f65208OooO0o = c24425OooOO0O;
        this.f65210OooO0oO = true;
        this.f65211OooO0oo = true;
        this.f65205OooO = true;
        SurfaceView surfaceView = new SurfaceView(mainView.getContext());
        surfaceView.setZOrderOnTop(true);
        surfaceView.getHolder().setFormat(-3);
        this.f65212OooOO0 = surfaceView;
        this.f65214OooOO0o = new AtomicInteger(0);
        View.OnAttachStateChangeListener oooO = new OooO(this);
        SurfaceHolderCallback2C21942OooO0oo surfaceHolderCallback2C21942OooO0oo = new SurfaceHolderCallback2C21942OooO0oo(this);
        this.f65216OooOOO0 = surfaceHolderCallback2C21942OooO0oo;
        this.f65215OooOOO = new C24426OooOO0o();
        Paint paint = new Paint();
        paint.setColor(0);
        BlendMode unused = BlendMode.CLEAR;
        paint.setBlendMode(BlendMode.CLEAR);
        this.f65217OooOOOO = paint;
        Paint paint2 = new Paint();
        BlendMode unused2 = BlendMode.SRC;
        paint2.setBlendMode(BlendMode.SRC);
        paint2.setAntiAlias(false);
        paint2.setFilterBitmap(false);
        this.f65218OooOOOo = paint2;
        if (Build.VERSION.SDK_INT < 33) {
            throw new IllegalStateException("CanvasInProgressStrokesRenderHelperV33 requires Android T+.");
        }
        if (mainView.isAttachedToWindow()) {
            mainView.addView(surfaceView, new ViewGroup.LayoutParams(-1, -1));
            surfaceView.getHolder().addCallback(surfaceHolderCallback2C21942OooO0oo);
        }
        mainView.addOnAttachStateChangeListener(oooO);
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO(MutableBox modifiedRegionInMainView) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(modifiedRegionInMainView, "modifiedRegionInMainView");
        OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o = this.f65213OooOO0O;
        if (c19024OooO0o != null) {
            C19024OooO0o.C21937OooO0o0 c21937OooO0o0 = c19024OooO0o.f65238OooO0o;
            OooO0O0 oooO0O0 = c21937OooO0o0.f65252OooO00o;
            if (oooO0O0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            RenderNode renderNode = oooO0O0.f65228OooO0OO;
            Canvas canvas = c21937OooO0o0.f65253OooO0O0;
            if (canvas == null) {
                throw new IllegalStateException("Required value was null.");
            }
            canvas.save();
            OooO0O0 oooO0O02 = c21937OooO0o0.f65252OooO00o;
            if (oooO0O02 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            RenderNode renderNode2 = oooO0O02.f65229OooO0Oo;
            RecordingCanvas recordingCanvasBeginRecording = renderNode2.beginRecording();
            kotlin.jvm.internal.OooOOO0.OooO0o(recordingCanvasBeginRecording, "beginRecording(...)");
            recordingCanvasBeginRecording.save();
            c21937OooO0o0.f65255OooO0Oo = recordingCanvasBeginRecording;
            Rect rect = c21937OooO0o0.f65254OooO0OO;
            rect.set(((int) Math.floor(modifiedRegionInMainView.f65389OooO00o)) - 3, ((int) Math.floor(modifiedRegionInMainView.f65390OooO0O0)) - 3, ((int) Math.ceil(modifiedRegionInMainView.f65391OooO0OO)) + 3, ((int) Math.ceil(modifiedRegionInMainView.f65392OooO0Oo)) + 3);
            renderNode.setClipRect(rect);
            renderNode2.setClipRect(rect);
            BlendMode unused = BlendMode.CLEAR;
            recordingCanvasBeginRecording.drawColor(0, BlendMode.CLEAR);
        }
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO00o() {
        OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o = this.f65213OooOO0O;
        if (c19024OooO0o != null) {
            C19024OooO0o.C21937OooO0o0 c21937OooO0o0 = c19024OooO0o.f65238OooO0o;
            OooO0O0 oooO0O0 = c21937OooO0o0.f65252OooO00o;
            if (oooO0O0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            RenderNode renderNode = oooO0O0.f65228OooO0OO;
            Canvas canvas = c21937OooO0o0.f65253OooO0O0;
            if (canvas == null) {
                throw new IllegalStateException("Required value was null.");
            }
            RenderNode renderNode2 = oooO0O0.f65229OooO0Oo;
            Canvas canvas2 = c21937OooO0o0.f65255OooO0Oo;
            if (canvas2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o = OooO0o.this;
            Path path = oooO0o.f65339OooO0O0;
            if (path != null) {
                canvas2.drawPath(path, oooO0o.f65217OooOOOO);
            }
            canvas2.restore();
            renderNode2.endRecording();
            if (!renderNode2.hasDisplayList()) {
                throw new IllegalStateException("Check failed.");
            }
            canvas.drawRenderNode(renderNode2);
            renderNode2.setClipRect(null);
            renderNode.setClipRect(null);
            c21937OooO0o0.f65255OooO0Oo = null;
            canvas.restore();
        }
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO0O0() {
        OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o = this.f65213OooOO0O;
        if (c19024OooO0o != null) {
            c19024OooO0o.OooO00o();
        }
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO0OO(InProgressShapeT inProgressShape, Matrix strokeToMainViewTransform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inProgressShape, "inProgressShape");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeToMainViewTransform, "strokeToMainViewTransform");
        OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o = this.f65213OooOO0O;
        if (c19024OooO0o != null) {
            Canvas canvas = c19024OooO0o.f65238OooO0o.f65255OooO0Oo;
            if (canvas == null) {
                throw new IllegalStateException("Required value was null.");
            }
            OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o = OooO0o.this;
            int iSave = canvas.save();
            canvas.concat(strokeToMainViewTransform);
            try {
                oooO0o.f65207OooO0Oo.OooO00o(canvas, inProgressShape, strokeToMainViewTransform);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooO0Oo(RunnableC24436OooOoOO runnableC24436OooOoOO) {
        C24442Oooo00o.OooO00o();
        OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o = this.f65213OooOO0O;
        if (c19024OooO0o == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C24442Oooo00o.OooO00o();
        c19024OooO0o.f65235OooO0O0.execute(runnableC24436OooOoOO);
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final boolean OooO0o() {
        return this.f65205OooO;
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final boolean OooO0oO() {
        return this.f65210OooO0oO;
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final boolean OooO0oo() {
        return this.f65211OooO0oo;
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooOO0() {
        OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o = this.f65213OooOO0O;
        if (c19024OooO0o == null) {
            this.f65214OooOO0o.getAndIncrement();
            return;
        }
        C24442Oooo00o.OooO00o();
        c19024OooO0o.f65235OooO0O0.execute(c19024OooO0o.f65241OooO0oo);
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooOO0O(C32465OooO0O0 cohort) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cohort, "cohort");
        OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT>.C19024OooO0o c19024OooO0o = this.f65213OooOO0O;
        if (c19024OooO0o != null) {
            C24442Oooo00o.OooO00o();
            AtomicReference<OooO0OO> atomicReference = c19024OooO0o.f65237OooO0Oo;
            OooO0OO oooO0OO = atomicReference.get();
            if (oooO0OO == null) {
                return;
            }
            if (!oooO0OO.f65232OooO0OO) {
                throw new IllegalStateException("Handoffs should be paused until the inactive buffer is ready again.");
            }
            OooO0o<ShapeSpecT, InProgressShapeT, CompletedShapeT> oooO0o = OooO0o.this;
            AttachedSurfaceControl rootSurfaceControl = oooO0o.f65206OooO0OO.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ((OooOO0) oooO0o.OooO0o0()).OooOOOO();
            OooO0O0 oooO0O0 = oooO0OO.f65230OooO00o;
            SurfaceControlCompat surfaceControlCompat = oooO0O0.f65226OooO00o;
            new HashMap();
            int i = Build.VERSION.SDK_INT;
            OooO0o.OooO00o oooO00o = androidx.graphics.surface.OooO0o.f65129OooO00o;
            OooO00o.OooO0O0 oooO0O0OooO0Oo = i >= 33 ? oooO00o.OooO0Oo() : oooO00o.OooO0OO();
            androidx.graphics.surface.OooO00o oooO00o2 = surfaceControlCompat.f65140OooO00o;
            oooO0O0OooO0Oo.OoooOoo(oooO00o2, false);
            oooO0O0OooO0Oo.o000OO(oooO00o2, null, null, null);
            C21941OooO0oO c21941OooO0oO = new C21941OooO0oO(c19024OooO0o);
            InterfaceExecutorC21935OooO0Oo executor = c19024OooO0o.f65235OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
            oooO0O0OooO0Oo.o000O0O(executor, c21941OooO0oO);
            oooO0O0OooO0Oo.o0000o0o(rootSurfaceControl);
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(atomicReference.getAndSet(new OooO0OO(oooO0OO.f65231OooO0O0, oooO0O0, false)), oooO0OO)) {
                throw new IllegalStateException("Buffers state should not change during a handoff on the UI thread.");
            }
            oooO0o.f65206OooO0OO.invalidate();
            ((OooOO0) oooO0o.OooO0o0()).OooOOO0(cohort);
            ((OooOO0) oooO0o.OooO0o0()).OooOOO();
        }
    }

    @Override // androidx.ink.authoring.internal.OooOOO
    public final void OooOO0o() {
    }
}
