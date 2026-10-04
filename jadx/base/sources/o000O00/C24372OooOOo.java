package o000O00;

import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.HardwareBufferRenderer;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.hardware.SyncFence;
import android.os.Build;
import androidx.core.util.Consumer;
import androidx.core.view.ViewCompat;
import androidx.graphics.surface.JniBindings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import o000O00.C24372OooOOo;
import o000O00.OooO00o;
import o000OO0O.OooO00o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000O00.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24372OooOOo implements OooO00o.InterfaceC19613OooO00o {

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final ReentrantLock f82216Oooo00O = new ReentrantLock();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static C24378OooOoO0 f82217Oooo00o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f82218OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f82219OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final long f82220OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f82221OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24378OooOoO0 f82222OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final RenderNode f82223OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final o000OO0O.OooO00o<OooO00o> f82224OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public RenderNode f82225OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f82226OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public OooO00o f82227Oooo000;

    /* JADX INFO: renamed from: o000O00.OooOOo$OooO00o */
    public static final class OooO00o implements OooO00o.InterfaceC19618OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HardwareBuffer f82228OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HardwareBufferRenderer f82229OooO0O0;

        public OooO00o(HardwareBuffer hardwareBuffer, HardwareBufferRenderer hardwareBufferRenderer) {
            this.f82228OooO00o = hardwareBuffer;
            this.f82229OooO0O0 = hardwareBufferRenderer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82228OooO00o, oooO00o.f82228OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82229OooO0O0, oooO00o.f82229OooO0O0);
        }

        public final int hashCode() {
            return this.f82229OooO0O0.hashCode() + (this.f82228OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "HardwareBufferProvider(buffer=" + this.f82228OooO00o + ", renderer=" + this.f82229OooO0O0 + ')';
        }
    }

    public C24372OooOOo(int i, int i2, int i3, long j, int i4) {
        C24378OooOoO0 c24378OooOoO0;
        boolean zNIsHwuiUsingVulkanRenderer = JniBindings.f65114OooO00o.nIsHwuiUsingVulkanRenderer();
        if (Build.VERSION.SDK_INT == 34 && zNIsHwuiUsingVulkanRenderer) {
            ReentrantLock reentrantLock = f82216Oooo00O;
            reentrantLock.lock();
            try {
                c24378OooOoO0 = f82217Oooo00o;
                if (c24378OooOoO0 == null || !((androidx.hardware.OooO00o) c24378OooOoO0.f82246OooO00o).f65143OooO00o.get()) {
                    androidx.hardware.OooO00o oooO00o = new androidx.hardware.OooO00o();
                    AtomicBoolean atomicBoolean = oooO00o.f65143OooO00o;
                    if (!atomicBoolean.get()) {
                        if (oooO00o.f65146OooO0Oo.get() && oooO00o.f65148OooO0o0.f82381OooOoO0) {
                            oooO00o.f65148OooO0o0 = new o000O0Oo.OooO00o("fdcleanup");
                        }
                        o000O0Oo.OooO00o oooO00o2 = oooO00o.f65148OooO0o0;
                        if (!oooO00o2.f82381OooOoO0) {
                            androidx.core.widget.OooO00o runnable = oooO00o.f65149OooO0oO;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(runnable, "runnable");
                            oooO00o2.f82379OooOo.postDelayed(runnable, 1000L);
                        }
                        atomicBoolean.set(true);
                    }
                    C24378OooOoO0 c24378OooOoO02 = new C24378OooOoO0(oooO00o);
                    f82217Oooo00o = c24378OooOoO02;
                    c24378OooOoO0 = c24378OooOoO02;
                }
            } finally {
                reentrantLock.unlock();
            }
        } else {
            c24378OooOoO0 = null;
        }
        this.f82219OooOo0o = i;
        this.f82218OooOo = i2;
        this.f82221OooOoO0 = i3;
        this.f82220OooOoO = j;
        this.f82222OooOoOO = c24378OooOoO0;
        if (c24378OooOoO0 != null) {
            ((AtomicInteger) c24378OooOoO0.f82247OooO0O0).incrementAndGet();
        }
        this.f82224OooOoo0 = new o000OO0O.OooO00o<>(i4);
        RenderNode renderNodeOooO00o = com.huawei.hms.drive.OooO00o.OooO00o();
        renderNodeOooO00o.setPosition(0, 0, i, i2);
        renderNodeOooO00o.setClipToBounds(false);
        this.f82223OooOoo = renderNodeOooO00o;
    }

    @Override // o000O00.OooO00o.InterfaceC19613OooO00o
    public final void Oooooo0(HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO) {
        Object next;
        o000OO0O.OooO00o<OooO00o> oooO00o = this.f82224OooOoo0;
        oooO00o.getClass();
        ReentrantLock reentrantLock = oooO00o.f82801OooO0OO;
        reentrantLock.lock();
        ArrayList<OooO00o.C24491OooO0Oo<T>> arrayList = oooO00o.f82800OooO0O0;
        try {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((OooO00o.C24491OooO0Oo) next).f82807OooO00o.f82228OooO00o == hardwareBuffer) {
                        break;
                    }
                }
            }
            OooO00o.C24491OooO0Oo c24491OooO0Oo = (OooO00o.C24491OooO0Oo) next;
            if (c24491OooO0Oo != null) {
                if (!c24491OooO0Oo.f82809OooO0OO) {
                    if (c24491OooO0Oo.f82807OooO00o.f82228OooO00o.isClosed()) {
                        arrayList.remove(c24491OooO0Oo);
                    } else {
                        c24491OooO0Oo.f82808OooO0O0 = oooO0OO;
                        c24491OooO0Oo.f82809OooO0OO = true;
                        oooO00o.f82804OooO0o0++;
                    }
                }
                if (oooO00o.f82803OooO0o) {
                    hardwareBuffer.close();
                    if (oooO00o.f82804OooO0o0 == arrayList.size()) {
                        arrayList.clear();
                    }
                } else {
                    oooO00o.f82802OooO0Oo.signal();
                }
            } else if (!hardwareBuffer.isClosed()) {
                throw new IllegalArgumentException("No entry associated with this framebuffer instance. Was this frame buffer created from a different FrameBufferPool?");
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        o000OO0O.OooO00o<OooO00o> oooO00o = this.f82224OooOoo0;
        ReentrantLock reentrantLock = oooO00o.f82801OooO0OO;
        reentrantLock.lock();
        try {
            if (!oooO00o.f82803OooO0o) {
                ArrayList<OooO00o.C24491OooO0Oo<T>> arrayList = oooO00o.f82800OooO0O0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OooO00o.C24491OooO0Oo c24491OooO0Oo = (OooO00o.C24491OooO0Oo) it.next();
                    if (c24491OooO0Oo.f82809OooO0OO) {
                        o000OO0O.OooO0OO oooO0OO = c24491OooO0Oo.f82808OooO0O0;
                        if (oooO0OO != null) {
                            oooO0OO.OooO00o();
                            oooO0OO.close();
                        }
                        OooO00o oooO00o2 = c24491OooO0Oo.f82807OooO00o;
                        oooO00o2.f82229OooO0O0.close();
                        oooO00o2.f82228OooO00o.close();
                    }
                }
                if (oooO00o.f82804OooO0o0 == arrayList.size()) {
                    arrayList.clear();
                }
                oooO00o.f82803OooO0o = true;
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            reentrantLock.unlock();
            C24378OooOoO0 c24378OooOoO0 = this.f82222OooOoOO;
            if (c24378OooOoO0 != null && ((AtomicInteger) c24378OooOoO0.f82247OooO0O0).decrementAndGet() <= 0) {
                AtomicBoolean atomicBoolean = ((androidx.hardware.OooO00o) c24378OooOoO0.f82246OooO00o).f65143OooO00o;
                if (atomicBoolean.get()) {
                    atomicBoolean.set(false);
                }
            }
            OooO00o oooO00o3 = this.f82227Oooo000;
            if (oooO00o3 != null) {
                oooO00o3.f82229OooO0O0.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // o000O00.OooO00o.InterfaceC19613OooO00o
    public final boolean isClosed() {
        o000OO0O.OooO00o<OooO00o> oooO00o = this.f82224OooOoo0;
        ReentrantLock reentrantLock = oooO00o.f82801OooO0OO;
        reentrantLock.lock();
        try {
            return oooO00o.f82803OooO0o;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o000O00.OooO00o.InterfaceC19613OooO00o
    public final void o000O0o(OooO00o.OooO0O0 request, final Executor executor, final Consumer<OooO00o.OooO0OO> consumer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(request, "request");
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        RenderNode renderNode = this.f82225OooOooO;
        if ((!this.f82223OooOoo.hasDisplayList() || this.f82226OooOooo != request.f82172OooO0OO) && renderNode != null) {
            RecordingCanvas recordingCanvasBeginRecording = this.f82223OooOoo.beginRecording();
            kotlin.jvm.internal.OooOOO0.OooO0o(recordingCanvasBeginRecording, "mRootNode.beginRecording()");
            recordingCanvasBeginRecording.save();
            if (!request.f82172OooO0OO) {
                BlendMode unused = BlendMode.CLEAR;
                recordingCanvasBeginRecording.drawColor(ViewCompat.MEASURED_STATE_MASK, BlendMode.CLEAR);
            }
            recordingCanvasBeginRecording.drawRenderNode(renderNode);
            recordingCanvasBeginRecording.restore();
            this.f82223OooOoo.endRecording();
            this.f82226OooOooo = request.f82172OooO0OO;
        }
        final RenderNode renderNode2 = this.f82223OooOoo;
        final ColorSpace colorSpace = request.f82170OooO00o;
        final int i = request.f82171OooO0O0;
        executor.execute(new Runnable() { // from class: o000O00.OooOOOO
            /* JADX WARN: Type inference failed for: r1v3, types: [o000O00.OooOOOo] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // java.lang.Runnable
            public final void run() {
                RenderNode renderNode3 = renderNode2;
                C24372OooOOo this$0 = this.f82209OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                kotlin.jvm.internal.OooOOO0.OooO0oO(renderNode3, "$renderNode");
                Executor executor2 = executor;
                kotlin.jvm.internal.OooOOO0.OooO0oO(executor2, "$executor");
                ColorSpace colorSpace2 = colorSpace;
                kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace2, "$colorSpace");
                final Consumer consumer2 = consumer;
                if (this$0.isClosed()) {
                    return;
                }
                o000OO0O.OooO00o<C24372OooOOo.OooO00o> oooO00o = this$0.f82224OooOoo0;
                ReentrantLock reentrantLock = oooO00o.f82801OooO0OO;
                reentrantLock.lock();
                try {
                    OooO00o.InterfaceC19618OooO00o interfaceC19618OooO00oOooO00o = o000OO0O.OooO00o.OooO00o(oooO00o);
                    if (interfaceC19618OooO00oOooO00o == null) {
                        HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(this$0.f82219OooOo0o, this$0.f82218OooOo, this$0.f82221OooOoO0, 1, this$0.f82220OooOoO);
                        kotlin.jvm.internal.OooOOO0.OooO0o(hardwareBufferCreate, "create(\n                …     mUsage\n            )");
                        com.google.android.material.color.OooO0O0.OooO00o();
                        C24372OooOOo.OooO00o oooO00o2 = new C24372OooOOo.OooO00o(hardwareBufferCreate, com.google.android.material.color.OooO00o.OooO0O0(hardwareBufferCreate));
                        boolean z = oooO00o.f82799OooO00o == 1;
                        if (z) {
                            oooO00o.f82804OooO0o0++;
                        }
                        oooO00o.f82800OooO0O0.add((OooO00o.C24491OooO0Oo<T>) new OooO00o.C24491OooO0Oo(oooO00o2, z));
                        interfaceC19618OooO00oOooO00o = oooO00o2;
                    }
                    reentrantLock.unlock();
                    final C24372OooOOo.OooO00o oooO00o3 = (C24372OooOOo.OooO00o) interfaceC19618OooO00oOooO00o;
                    this$0.f82227Oooo000 = oooO00o3;
                    HardwareBufferRenderer hardwareBufferRenderer = oooO00o3.f82229OooO0O0;
                    hardwareBufferRenderer.setLightSourceAlpha(0.0f, 0.0f);
                    hardwareBufferRenderer.setLightSourceGeometry(0.0f, 0.0f, 0.0f, 0.0f);
                    hardwareBufferRenderer.setContentRoot(renderNode3);
                    HardwareBufferRenderer.RenderRequest renderRequestObtainRenderRequest = hardwareBufferRenderer.obtainRenderRequest();
                    renderRequestObtainRenderRequest.setColorSpace(colorSpace2);
                    renderRequestObtainRenderRequest.setBufferTransform(i);
                    renderRequestObtainRenderRequest.draw(executor2, new java.util.function.Consumer() { // from class: o000O00.OooOOOo
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            HardwareBufferRenderer.RenderResult renderResult = (HardwareBufferRenderer.RenderResult) obj;
                            Consumer consumer3 = consumer2;
                            C24372OooOOo.OooO00o oooO00o4 = oooO00o3;
                            SyncFence fence = renderResult.getFence();
                            kotlin.jvm.internal.OooOOO0.OooO0o(fence, "result.fence");
                            o000OO0O.OooO0OO oooO0OO = new o000OO0O.OooO0OO(fence);
                            renderResult.getStatus();
                            consumer3.accept(new OooO00o.OooO0OO(oooO00o4.f82228OooO00o, oooO0OO));
                        }
                    });
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        });
    }

    @Override // o000O00.OooO00o.InterfaceC19613OooO00o
    public final void oo000o(RenderNode renderNode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderNode, "renderNode");
        this.f82225OooOooO = renderNode;
        this.f82223OooOoo.discardDisplayList();
    }
}
