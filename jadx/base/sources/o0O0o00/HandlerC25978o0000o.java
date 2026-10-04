package o0O0o00;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Looper;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.editor.model.PagePart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import o000O00.OooO00o;
import o0O0o0o0.C26012OooO00o;
import o0O0oOO.C26112OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o00.o0000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class HandlerC25978o0000o extends o0000O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f88718OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000OOO f88719OooO0oo;

    /* JADX INFO: renamed from: o0O0o00.o0000o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final RenderNode f88720OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final RectF f88721OooO0O0;

        public OooO00o(RenderNode renderNode, RectF rectF) {
            this.f88720OooO00o = renderNode;
            this.f88721OooO0O0 = rectF;
        }
    }

    public HandlerC25978o0000o(PDFView pDFView, Looper looper, boolean z) {
        super(pDFView, looper);
        this.f88719OooO0oo = new o0000OOO();
        this.f88718OooO0oO = z;
    }

    public final void OooO(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f88719OooO0oo.f88702OooO00o.release(((OooO00o) it.next()).f88720OooO00o);
        }
        arrayList.clear();
    }

    @Override // o0O0o00.o0000O
    public final void OooO0oO(List<o00000OO> list, boolean z) throws Throwable {
        if (list.isEmpty()) {
            return;
        }
        System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList<o00000OO> arrayList2 = new ArrayList();
        for (o00000OO o00000oo2 : list) {
            if (o00000oo2.f88668OooO00o.f69353OooO0oo) {
                arrayList2.add(o00000oo2);
            } else {
                arrayList.add(o00000oo2);
            }
        }
        if (z) {
            final AbstractC22830OooO0Oo abstractC22830OooO0OoOooO0Oo = OooO0Oo();
            if (abstractC22830OooO0OoOooO0Oo != null) {
                for (final o00000OO o00000oo3 : arrayList2) {
                    Consumer<Canvas> consumer = new Consumer() { // from class: o0O0o00.o0000OoO
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            Canvas canvas = (Canvas) obj;
                            o00000OO o00000oo4 = o00000oo3;
                            abstractC22830OooO0OoOooO0Oo.Oooo0OO(o00000oo4.f88668OooO00o, o00000oo4.OooO00o(), o00000oo4.f88670OooO0OO, canvas, 9);
                        }
                    };
                    boolean z2 = !o00000oo3.OooO00o().isEmpty();
                    PagePart pagePart = o00000oo3.f88668OooO00o;
                    pagePart.OooO0o0(consumer, z2);
                    OooO0o0(Collections.singletonList(pagePart), true);
                }
            }
            OooOO0(arrayList, true);
            ArrayList arrayList3 = new ArrayList();
            for (o00000OO o00000oo4 : arrayList2) {
                arrayList3.add(new o00000OO(o00000oo4.f88668OooO00o, o00000oo4.OooO00o(), true, o00000oo4.f88672OooO0o0));
            }
            OooOO0O(arrayList3, true);
        } else {
            OooOO0(arrayList, false);
            OooOO0O(arrayList2, false);
        }
        System.currentTimeMillis();
    }

    @Override // o0O0o00.o0000O
    public final boolean OooO0oo() {
        return this.f88718OooO0oO;
    }

    public final void OooOO0(ArrayList arrayList, boolean z) {
        final AbstractC22830OooO0Oo abstractC22830OooO0OoOooO0Oo = OooO0Oo();
        if (abstractC22830OooO0OoOooO0Oo == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final o00000OO o00000oo2 = (o00000OO) it.next();
            Consumer<Canvas> consumer = new Consumer() { // from class: o0O0o00.o0000Oo0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Canvas canvas = (Canvas) obj;
                    o00000OO o00000oo3 = o00000oo2;
                    abstractC22830OooO0OoOooO0Oo.Oooo0OO(o00000oo3.f88668OooO00o, o00000oo3.OooO00o(), o00000oo3.f88670OooO0OO, canvas, 15);
                }
            };
            boolean z2 = !o00000oo2.OooO00o().isEmpty();
            PagePart pagePart = o00000oo2.f88668OooO00o;
            pagePart.OooO0o0(consumer, z2);
            OooO0o0(Collections.singletonList(pagePart), z);
        }
    }

    public final void OooOO0O(ArrayList arrayList, boolean z) throws Throwable {
        int i;
        RectF rectF;
        float f;
        int i2;
        C26112OooO0oo c26112OooO0oo;
        float f2;
        o0000OOO o0000ooo;
        RectF rectF2;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        final AbstractC22830OooO0Oo abstractC22830OooO0OoOooO0Oo = OooO0Oo();
        if (abstractC22830OooO0OoOooO0Oo == null) {
            return;
        }
        boolean z2 = this.f88718OooO0oO;
        if (!z2) {
            OooOO0o(arrayList, abstractC22830OooO0OoOooO0Oo);
            return;
        }
        if (!z2) {
            OooOO0o(arrayList, abstractC22830OooO0OoOooO0Oo);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final o00000OO o00000oo2 = (o00000OO) it.next();
            final PagePart pagePart = o00000oo2.f88668OooO00o;
            boolean z3 = !o00000oo2.OooO00o().isEmpty();
            C26112OooO0oo c26112OooO0ooOooOO0O = abstractC22830OooO0OoOooO0Oo.OooOO0O(pagePart.f69347OooO0O0);
            RectF rectFOooO0OO = pagePart.OooO0OO();
            RectF rectFOooO00o = o00000oo2.OooO00o();
            RectF rectF3 = !rectFOooO00o.isEmpty() ? new RectF(rectFOooO00o) : null;
            float f3 = rectFOooO0OO.left;
            float f4 = c26112OooO0ooOooOO0O.f89149OooO00o;
            float f5 = rectFOooO0OO.top;
            float f6 = c26112OooO0ooOooOO0O.f89150OooO0O0;
            RectF rectF4 = new RectF(f3 * f4, f5 * f6, rectFOooO0OO.right * f4, rectFOooO0OO.bottom * f6);
            if (!z || !o00000oo2.f88670OooO0OO) {
                pagePart.OooO0o0(new Consumer() { // from class: o0O0o00.o0000Oo
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Canvas canvas = (Canvas) obj;
                        o00000OO o00000oo3 = o00000oo2;
                        abstractC22830OooO0OoOooO0Oo.Oooo0OO(pagePart, o00000oo3.OooO00o(), o00000oo3.f88670OooO0OO, canvas, 9);
                    }
                }, z3);
            }
            if ((rectF3 == null || rectF3.isEmpty()) && rectF4.isEmpty()) {
                OooO0o0(Collections.singletonList(pagePart), false);
            } else {
                final ArrayList<OooO00o> arrayList2 = new ArrayList();
                RectF rectF5 = (rectF3 == null || rectF3.isEmpty()) ? rectF4 : rectF3;
                float fWidth = rectF4.width();
                float fHeight = rectF4.height();
                if (fWidth > 0.0f && fHeight > 0.0f) {
                    C26112OooO0oo c26112OooO0ooOooOO0O2 = abstractC22830OooO0OoOooO0Oo.OooOO0O(pagePart.f69347OooO0O0);
                    float f7 = pagePart.f69350OooO0o / fWidth;
                    float f8 = pagePart.f69352OooO0oO / fHeight;
                    if (f7 > 0.0f && f8 > 0.0f) {
                        int i3 = 64;
                        float f9 = 64;
                        float f10 = f9 / f7;
                        float f11 = f9 / f8;
                        float f12 = rectF5.top;
                        while (f12 < rectF5.bottom) {
                            float f13 = rectF5.left;
                            while (f13 < rectF5.right) {
                                float f14 = f12 + f11;
                                float f15 = f13 + f10;
                                if (f15 <= f13 || f14 <= f12) {
                                    rectF = rectF5;
                                    f = f7;
                                    i2 = i3;
                                    c26112OooO0oo = c26112OooO0ooOooOO0O2;
                                    f2 = f12;
                                } else {
                                    RectF rectF6 = new RectF(f13, f12, f15, f14);
                                    o0000OOO o0000ooo2 = this.f88719OooO0oo;
                                    RenderNode renderNodeOooO00o = o0000ooo2.OooO00o(i3, i3);
                                    RecordingCanvas recordingCanvasBeginRecording = renderNodeOooO00o.beginRecording();
                                    f2 = f12;
                                    try {
                                        float f16 = rectF6.left;
                                        rectF = rectF5;
                                        float f17 = c26112OooO0ooOooOO0O2.f89149OooO00o;
                                        float f18 = f16 / f17;
                                        float f19 = rectF6.top;
                                        float f20 = c26112OooO0ooOooOO0O2.f89150OooO0O0;
                                        f = f7;
                                        abstractC22830OooO0Oo = abstractC22830OooO0OoOooO0Oo;
                                        rectF2 = new RectF(f18, f19 / f20, rectF6.right / f17, rectF6.bottom / f20);
                                        o0000ooo = o0000ooo2;
                                    } catch (Throwable th) {
                                        th = th;
                                        o0000ooo = o0000ooo2;
                                    }
                                    try {
                                        c26112OooO0oo = c26112OooO0ooOooOO0O2;
                                        abstractC22830OooO0OoOooO0Oo = abstractC22830OooO0Oo;
                                        i2 = 64;
                                        abstractC22830OooO0OoOooO0Oo.Oooo0o(pagePart.f69347OooO0O0, renderNodeOooO00o.getWidth(), renderNodeOooO00o.getHeight(), rectF2, recordingCanvasBeginRecording);
                                        renderNodeOooO00o.endRecording();
                                        float f21 = rectF6.left;
                                        float f22 = rectF4.left;
                                        float f23 = rectF6.top;
                                        float f24 = rectF4.top;
                                        arrayList2.add(new OooO00o(renderNodeOooO00o, new RectF((f21 - f22) * f, (f23 - f24) * f8, (rectF6.right - f22) * f, (rectF6.bottom - f24) * f8)));
                                    } catch (Throwable th2) {
                                        th = th2;
                                        renderNodeOooO00o.endRecording();
                                        o0000ooo.f88702OooO00o.release(renderNodeOooO00o);
                                        throw th;
                                    }
                                }
                                c26112OooO0ooOooOO0O2 = c26112OooO0oo;
                                f13 = f15;
                                f12 = f2;
                                i3 = i2;
                                rectF5 = rectF;
                                f7 = f;
                            }
                            f12 += f11;
                            f7 = f7;
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    OooO0o0(Collections.singletonList(pagePart), false);
                } else if (arrayList2.isEmpty()) {
                    continue;
                } else {
                    PagePart pagePart2 = o00000oo2.f88668OooO00o;
                    int i4 = pagePart2.f69350OooO0o;
                    if (i4 <= 0 || (i = pagePart2.f69352OooO0oO) <= 0) {
                        OooO(arrayList2);
                        OooO0o0(Collections.singletonList(pagePart2), false);
                    } else {
                        RenderNode renderNode = new RenderNode("ThumbnailBatchRoot");
                        renderNode.setPosition(0, 0, i4, i);
                        RecordingCanvas recordingCanvasBeginRecording2 = renderNode.beginRecording();
                        try {
                            pagePart2.OooO0O0(recordingCanvasBeginRecording2, new RectF(0.0f, 0.0f, i4, i), null);
                            for (OooO00o oooO00o : arrayList2) {
                                RectF rectF7 = oooO00o.f88721OooO0O0;
                                recordingCanvasBeginRecording2.save();
                                recordingCanvasBeginRecording2.clipRect(rectF7);
                                recordingCanvasBeginRecording2.translate(rectF7.left, rectF7.top);
                                recordingCanvasBeginRecording2.drawRenderNode(oooO00o.f88720OooO00o);
                                recordingCanvasBeginRecording2.restore();
                            }
                            renderNode.endRecording();
                            if (i4 <= 0 || i <= 0) {
                                throw new IllegalArgumentException("Invalid dimensions provided, width and height must be > 0. width: " + i4 + " height: " + i);
                            }
                            try {
                                final o000O00.OooO00o oooO00o2 = new o000O00.OooO00o(i4, i, 1, 1, 0, 2818L);
                                oooO00o2.oo000o(renderNode);
                                final AtomicReference atomicReference = new AtomicReference();
                                try {
                                    oooO00o2.OooO00o().OooO00o(new o0000OO0.OooO(), new androidx.core.util.Consumer() { // from class: o0O0o00.o0000o0O
                                        @Override // androidx.core.util.Consumer
                                        public final void accept(Object obj) {
                                            final HandlerC25978o0000o handlerC25978o0000o = this;
                                            handlerC25978o0000o.getClass();
                                            final AtomicReference atomicReference2 = atomicReference;
                                            atomicReference2.set((OooO00o.OooO0OO) obj);
                                            PDFView pDFView = handlerC25978o0000o.f88694OooO0O0.get();
                                            final o000O00.OooO00o oooO00o3 = oooO00o2;
                                            final ArrayList arrayList3 = arrayList2;
                                            if (pDFView == null) {
                                                try {
                                                    oooO00o3.close();
                                                    return;
                                                } finally {
                                                }
                                            }
                                            final o00000OO o00000oo3 = o00000oo2;
                                            if (pDFView.post(new Runnable() { // from class: o0O0o00.o0000o0o
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Bitmap bitmapWrapHardwareBuffer;
                                                    HandlerC25978o0000o handlerC25978o0000o2 = handlerC25978o0000o;
                                                    handlerC25978o0000o2.getClass();
                                                    OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) atomicReference2.get();
                                                    if (oooO0OO == null) {
                                                        bitmapWrapHardwareBuffer = null;
                                                    } else {
                                                        bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(oooO0OO.f82174OooO00o, ColorSpace.get(ColorSpace.Named.SRGB));
                                                    }
                                                    o000O00.OooO00o oooO00o4 = oooO00o3;
                                                    ArrayList arrayList4 = arrayList3;
                                                    if (bitmapWrapHardwareBuffer == null) {
                                                        try {
                                                            oooO00o4.close();
                                                        } finally {
                                                            handlerC25978o0000o2.OooO(arrayList4);
                                                        }
                                                    } else {
                                                        o00000OO o00000oo4 = o00000oo3;
                                                        Rect rect = new Rect(0, 0, bitmapWrapHardwareBuffer.getWidth(), bitmapWrapHardwareBuffer.getHeight());
                                                        C26012OooO00o c26012OooO00o = new C26012OooO00o(oooO00o4, 1);
                                                        PagePart pagePart3 = o00000oo4.f88668OooO00o;
                                                        pagePart3.OooO0oO(bitmapWrapHardwareBuffer, rect, c26012OooO00o);
                                                        handlerC25978o0000o2.OooO0o0(Collections.singletonList(pagePart3), false);
                                                    }
                                                }
                                            })) {
                                                return;
                                            }
                                            try {
                                                oooO00o3.close();
                                            } finally {
                                            }
                                        }
                                    });
                                } catch (Exception e) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("HwSingleRenderHandler");
                                    c20358OooO00o.OooO0Oo(e, "Failed to schedule drawAsync for thumbnail batch", new Object[0]);
                                    try {
                                        oooO00o2.close();
                                    } finally {
                                        OooO(arrayList2);
                                    }
                                }
                            } catch (Exception e2) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("HwSingleRenderHandler");
                                c20358OooO00o2.OooO0Oo(e2, "Failed to create renderer for thumbnail batch", new Object[0]);
                                OooO(arrayList2);
                                OooO0o0(Collections.singletonList(pagePart2), false);
                            }
                        } catch (Throwable th3) {
                            renderNode.endRecording();
                            throw th3;
                        }
                    }
                }
            }
        }
    }

    public final void OooOO0o(ArrayList arrayList, final AbstractC22830OooO0Oo abstractC22830OooO0Oo) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final o00000OO o00000oo2 = (o00000OO) it.next();
            RectF rectF = new RectF();
            boolean zIsEmpty = o00000oo2.OooO00o().isEmpty();
            boolean z = !zIsEmpty;
            PagePart pagePart = o00000oo2.f88668OooO00o;
            if (zIsEmpty) {
                C26112OooO0oo c26112OooO0ooOooOO0O = abstractC22830OooO0Oo.OooOO0O(pagePart.f69347OooO0O0);
                RectF rectFOooO0OO = pagePart.OooO0OO();
                float f = rectFOooO0OO.left;
                float f2 = c26112OooO0ooOooOO0O.f89149OooO00o;
                float f3 = rectFOooO0OO.top;
                float f4 = c26112OooO0ooOooOO0O.f89150OooO0O0;
                rectF.set(f * f2, f3 * f4, rectFOooO0OO.right * f2, rectFOooO0OO.bottom * f4);
            } else {
                rectF.set(o00000oo2.OooO00o());
            }
            pagePart.OooO0o0(new Consumer() { // from class: o0O0o00.o0000o0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Canvas canvas = (Canvas) obj;
                    o00000OO o00000oo3 = o00000oo2;
                    PagePart pagePart2 = o00000oo3.f88668OooO00o;
                    RectF rectFOooO00o = o00000oo3.OooO00o();
                    boolean z2 = o00000oo3.f88670OooO0OO;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = abstractC22830OooO0Oo;
                    abstractC22830OooO0Oo2.getClass();
                    abstractC22830OooO0Oo2.Oooo0OO(pagePart2, rectFOooO00o, z2, canvas, 15);
                }
            }, z);
            OooO0o0(Collections.singletonList(pagePart), false);
        }
    }
}
