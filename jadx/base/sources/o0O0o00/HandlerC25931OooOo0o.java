package o0O0o00;

import Oooo0.C20855OooooOO;
import OooooOO.C21296OooO00o;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Looper;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.editor.model.PagePart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import o000O00.OooO00o;
import o0O0o00.C25911OooO0OO;
import o0O0o00.HandlerC25931OooOo0o;
import o0O0o0o0.C26012OooO00o;
import o0O0oOO.C26110OooO0o0;
import o0O0oOO.C26112OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o00.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class HandlerC25931OooOo0o extends o0000O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0000OOO f88530OooO0oO;

    /* JADX INFO: renamed from: o0O0o00.OooOo0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f88531OooO00o = new ArrayList(16);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f88532OooO0O0 = new ArrayList(16);
    }

    /* JADX INFO: renamed from: o0O0o00.OooOo0o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final RenderNode f88533OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final RectF f88534OooO0O0;

        public OooO0O0(RenderNode renderNode, RectF rectF) {
            this.f88533OooO00o = renderNode;
            this.f88534OooO0O0 = rectF;
        }
    }

    public HandlerC25931OooOo0o(PDFView pDFView, Looper looper) {
        super(pDFView, looper);
        this.f88530OooO0oO = new o0000OOO();
    }

    public final void OooO(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f88530OooO0oO.f88702OooO00o.release(((OooO0O0) it.next()).f88533OooO00o);
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
                    Consumer<Canvas> consumer = new Consumer() { // from class: o0O0o00.OooOOOo
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
        return true;
    }

    public final void OooOO0(ArrayList arrayList, final boolean z) {
        Iterator it;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        OooO00o oooO00o = new OooO00o();
        HashMap map = new HashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o00000OO o00000oo2 = (o00000OO) it2.next();
            map.merge(o00000oo2.f88668OooO00o.f69346OooO00o, o00000oo2, new C25924OooOOo());
        }
        Iterator it3 = new ArrayList(map.values()).iterator();
        while (true) {
            int i = 0;
            if (!it3.hasNext()) {
                if (!oooO00o.f88531OooO00o.isEmpty()) {
                    arrayList2.add(oooO00o);
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    final OooO00o oooO00o2 = (OooO00o) it4.next();
                    AbstractC22830OooO0Oo abstractC22830OooO0OoOooO0Oo = OooO0Oo();
                    if (abstractC22830OooO0OoOooO0Oo != null) {
                        C25911OooO0OO c25911OooO0OOOooO0OO = OooO0OO();
                        if (c25911OooO0OOOooO0OO == null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("HwBatchRenderHandler");
                            c20358OooO00o.OooO0OO("CacheManager is null, cannot post updates", new Object[i]);
                            it = it4;
                        } else {
                            System.nanoTime();
                            int iMax = i;
                            int iMax2 = iMax;
                            for (Rect rect : oooO00o2.f88532OooO0O0) {
                                iMax = Math.max(iMax, rect.right);
                                iMax2 = Math.max(iMax2, rect.bottom);
                            }
                            RenderNode renderNodeOooO00o = C25922OooOOOO.OooO00o();
                            renderNodeOooO00o.setPosition(0, 0, iMax, iMax2);
                            RecordingCanvas recordingCanvasBeginRecording = renderNodeOooO00o.beginRecording();
                            final ArrayList arrayList3 = new ArrayList();
                            int i2 = i;
                            while (i2 < oooO00o2.f88531OooO00o.size()) {
                                try {
                                    Rect rect2 = (Rect) oooO00o2.f88532OooO0O0.get(i2);
                                    o00000OO o00000oo3 = (o00000OO) oooO00o2.f88531OooO00o.get(i2);
                                    RenderNode renderNodeOooO00o2 = this.f88530OooO0oO.OooO00o(rect2.width(), rect2.height());
                                    RectF rectF = new RectF(rect2);
                                    arrayList3.add(new OooO0O0(renderNodeOooO00o2, rectF));
                                    try {
                                        Iterator it5 = it4;
                                        abstractC22830OooO0OoOooO0Oo.Oooo0OO(o00000oo3.f88668OooO00o, o00000oo3.OooO00o(), o00000oo3.f88670OooO0OO, renderNodeOooO00o2.beginRecording(), 15);
                                        renderNodeOooO00o2.endRecording();
                                        recordingCanvasBeginRecording.save();
                                        recordingCanvasBeginRecording.translate(rectF.left, rectF.top);
                                        recordingCanvasBeginRecording.drawRenderNode(renderNodeOooO00o2);
                                        recordingCanvasBeginRecording.restore();
                                        i2++;
                                        it4 = it5;
                                    } catch (Throwable th) {
                                        renderNodeOooO00o2.endRecording();
                                        throw th;
                                    }
                                } finally {
                                    renderNodeOooO00o.endRecording();
                                }
                            }
                            it = it4;
                            renderNodeOooO00o.endRecording();
                            System.nanoTime();
                            if (iMax <= 0 || iMax2 <= 0) {
                                throw new IllegalArgumentException(C20855OooooOO.OooO0OO(iMax, iMax2, "Invalid dimensions provided, width and height must be > 0. width: ", " height: "));
                            }
                            final o000O00.OooO00o oooO00o3 = new o000O00.OooO00o(iMax, iMax2, 1, 1, 0, 2818L);
                            oooO00o3.oo000o(renderNodeOooO00o);
                            final ArrayList arrayList4 = new ArrayList(oooO00o2.f88531OooO00o.size());
                            final ArrayList arrayList5 = new ArrayList(oooO00o2.f88531OooO00o.size());
                            if (z) {
                                ArrayList arrayList6 = new ArrayList();
                                ArrayList arrayList7 = new ArrayList();
                                for (int i3 = 0; i3 < oooO00o2.f88531OooO00o.size(); i3++) {
                                    PagePart pagePart = ((o00000OO) oooO00o2.f88531OooO00o.get(i3)).f88668OooO00o;
                                    if (pagePart.f69353OooO0oo) {
                                        arrayList7.add(pagePart);
                                    } else {
                                        arrayList6.add(pagePart);
                                    }
                                }
                                ArrayList arrayList8 = new ArrayList();
                                synchronized (c25911OooO0OOOooO0OO.f88460OooO0oO) {
                                    try {
                                        Iterator it6 = arrayList6.iterator();
                                        while (it6.hasNext()) {
                                            arrayList8.add(c25911OooO0OOOooO0OO.OooOOO0((PagePart) it6.next()));
                                        }
                                    } finally {
                                    }
                                }
                                arrayList4.addAll(arrayList8);
                                ArrayList arrayList9 = new ArrayList();
                                synchronized (c25911OooO0OOOooO0OO.f88460OooO0oO) {
                                    try {
                                        Iterator it7 = arrayList7.iterator();
                                        while (it7.hasNext()) {
                                            arrayList9.add(c25911OooO0OOOooO0OO.OooOOO((PagePart) it7.next()));
                                        }
                                    } finally {
                                    }
                                }
                                arrayList5.addAll(arrayList9);
                            }
                            final AtomicReference atomicReference = new AtomicReference();
                            oooO00o3.OooO00o().OooO00o(new o0000OO0.OooO(), new androidx.core.util.Consumer() { // from class: o0O0o00.OooOOoo
                                @Override // androidx.core.util.Consumer
                                public final void accept(Object obj) {
                                    final HandlerC25931OooOo0o handlerC25931OooOo0o = this.f88491OooOo0o;
                                    handlerC25931OooOo0o.getClass();
                                    final AtomicReference atomicReference2 = atomicReference;
                                    atomicReference2.set((OooO00o.OooO0OO) obj);
                                    final PDFView pDFView = handlerC25931OooOo0o.f88694OooO0O0.get();
                                    final C25911OooO0OO c25911OooO0OOOooO0OO2 = handlerC25931OooOo0o.OooO0OO();
                                    if (pDFView == null || c25911OooO0OOOooO0OO2 == null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("HwBatchRenderHandler");
                                        c20358OooO00o2.OooO0OO("PDFView or CacheManager is null, cannot post updates", new Object[0]);
                                    } else {
                                        final o000O00.OooO00o oooO00o4 = oooO00o3;
                                        final ArrayList arrayList10 = arrayList4;
                                        final ArrayList arrayList11 = arrayList5;
                                        final HandlerC25931OooOo0o.OooO00o oooO00o5 = oooO00o2;
                                        final boolean z2 = z;
                                        pDFView.post(new Runnable() { // from class: o0O0o00.OooOo0O
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                PagePart pagePart2;
                                                PagePart pagePart3;
                                                PagePart pagePart4;
                                                HandlerC25931OooOo0o handlerC25931OooOo0o2 = handlerC25931OooOo0o;
                                                AtomicReference atomicReference3 = atomicReference2;
                                                o000O00.OooO00o oooO00o6 = oooO00o4;
                                                C25911OooO0OO c25911OooO0OO = c25911OooO0OOOooO0OO2;
                                                ArrayList arrayList12 = arrayList10;
                                                ArrayList arrayList13 = arrayList11;
                                                HandlerC25931OooOo0o.OooO00o oooO00o7 = oooO00o5;
                                                boolean z3 = z2;
                                                PDFView pDFView2 = pDFView;
                                                handlerC25931OooOo0o2.getClass();
                                                OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) atomicReference3.get();
                                                Bitmap bitmapWrapHardwareBuffer = oooO0OO != null ? Bitmap.wrapHardwareBuffer(oooO0OO.f82174OooO00o, ColorSpace.get(ColorSpace.Named.SRGB)) : null;
                                                if (bitmapWrapHardwareBuffer == null) {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o3.OooOOO0("HwBatchRenderHandler");
                                                    c20358OooO00o3.OooO0OO("Failed to obtain shared bitmap from renderer", new Object[0]);
                                                    oooO00o6.close();
                                                    if (!arrayList12.isEmpty()) {
                                                        synchronized (c25911OooO0OO.f88460OooO0oO) {
                                                            try {
                                                                Iterator it8 = arrayList12.iterator();
                                                                while (it8.hasNext()) {
                                                                    C25911OooO0OO.OooO0O0 oooO0O0 = (C25911OooO0OO.OooO0O0) c25911OooO0OO.f88457OooO0Oo.remove((String) it8.next());
                                                                    if (oooO0O0 != null && (pagePart4 = oooO0O0.f88462OooO00o) != null && !oooO0O0.f88464OooO0OO) {
                                                                        pagePart4.OooO0o();
                                                                        oooO0O0.f88464OooO0OO = true;
                                                                    }
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (arrayList13.isEmpty()) {
                                                        return;
                                                    }
                                                    synchronized (c25911OooO0OO.f88460OooO0oO) {
                                                        try {
                                                            Iterator it9 = arrayList13.iterator();
                                                            while (it9.hasNext()) {
                                                                C25911OooO0OO.OooO0O0 oooO0O02 = (C25911OooO0OO.OooO0O0) c25911OooO0OO.f88459OooO0o0.remove((String) it9.next());
                                                                if (oooO0O02 != null && (pagePart3 = oooO0O02.f88462OooO00o) != null && !oooO0O02.f88464OooO0OO) {
                                                                    pagePart3.OooO0o();
                                                                    oooO0O02.f88464OooO0OO = true;
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    return;
                                                }
                                                C26012OooO00o c26012OooO00o = new C26012OooO00o(oooO00o6, oooO00o7.f88531OooO00o.size());
                                                for (int i4 = 0; i4 < oooO00o7.f88531OooO00o.size(); i4++) {
                                                    o00000OO o00000oo4 = (o00000OO) oooO00o7.f88531OooO00o.get(i4);
                                                    if (z3 || o00000oo4.f88672OooO0o0 || o00000oo4.f88671OooO0Oo >= o00000oo4.f88668OooO00o.f69357OooOOO0.get()) {
                                                        o00000oo4.f88668OooO00o.OooO0oO(bitmapWrapHardwareBuffer, (Rect) oooO00o7.f88532OooO0O0.get(i4), c26012OooO00o);
                                                    } else {
                                                        c26012OooO00o.OooO00o();
                                                    }
                                                }
                                                if (!arrayList12.isEmpty()) {
                                                    ArrayList arrayList14 = new ArrayList();
                                                    ArrayList<PagePart> arrayList15 = new ArrayList();
                                                    synchronized (c25911OooO0OO.f88460OooO0oO) {
                                                        try {
                                                            Iterator it10 = arrayList12.iterator();
                                                            while (it10.hasNext()) {
                                                                C25911OooO0OO.OooO0O0 oooO0O03 = (C25911OooO0OO.OooO0O0) c25911OooO0OO.f88457OooO0Oo.remove((String) it10.next());
                                                                if (oooO0O03 != null && (pagePart2 = oooO0O03.f88462OooO00o) != null && !oooO0O03.f88464OooO0OO) {
                                                                    if (oooO0O03.f88465OooO0Oo) {
                                                                        arrayList15.add(pagePart2);
                                                                    } else {
                                                                        arrayList14.add(pagePart2);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    if (!arrayList14.isEmpty()) {
                                                        c25911OooO0OO.OooO00o(arrayList14);
                                                    }
                                                    if (!arrayList15.isEmpty()) {
                                                        synchronized (c25911OooO0OO.f88458OooO0o) {
                                                            try {
                                                                c25911OooO0OO.OooOO0(arrayList15.size());
                                                                for (PagePart pagePart5 : arrayList15) {
                                                                    PagePart pagePartOooO0o = C25911OooO0OO.OooO0o(pagePart5, c25911OooO0OO.f88454OooO00o);
                                                                    if (pagePartOooO0o != null) {
                                                                        c25911OooO0OO.f88454OooO00o.remove(pagePartOooO0o);
                                                                        pagePartOooO0o.OooO0o();
                                                                    }
                                                                    PagePart pagePartOooO0o2 = C25911OooO0OO.OooO0o(pagePart5, c25911OooO0OO.f88455OooO0O0);
                                                                    if (pagePartOooO0o2 != null) {
                                                                        c25911OooO0OO.f88455OooO0O0.remove(pagePartOooO0o2);
                                                                        pagePartOooO0o2.OooO0o();
                                                                    }
                                                                    c25911OooO0OO.f88454OooO00o.add(pagePart5);
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                }
                                                c25911OooO0OO.OooO0Oo(arrayList13);
                                                if (z3) {
                                                    pDFView2.OoooO0O();
                                                } else {
                                                    if (pDFView2.f69173Oooo0.get()) {
                                                        return;
                                                    }
                                                    pDFView2.invalidate();
                                                }
                                            }
                                        });
                                    }
                                    handlerC25931OooOo0o.OooO(arrayList3);
                                }
                            });
                            System.nanoTime();
                        }
                    } else {
                        it = it4;
                    }
                    it4 = it;
                    i = 0;
                }
                return;
            }
            o00000OO o00000oo4 = (o00000OO) it3.next();
            if (oooO00o.f88531OooO00o.size() == 16) {
                arrayList2.add(oooO00o);
                oooO00o = new OooO00o();
            }
            ArrayList arrayList10 = oooO00o.f88531OooO00o;
            if (arrayList10.size() == 16) {
                throw new IllegalStateException("Batch is full, cannot add more tasks");
            }
            arrayList10.add(o00000oo4);
            ArrayList arrayList11 = oooO00o.f88532OooO0O0;
            Rect rect3 = arrayList11.isEmpty() ? null : (Rect) C21505OooO0Oo.OooO00o(1, arrayList11);
            int i4 = rect3 == null ? 0 : rect3.right + 1;
            PagePart pagePart2 = o00000oo4.f88668OooO00o;
            arrayList11.add(new Rect(i4, 0, pagePart2.f69350OooO0o + i4, pagePart2.f69352OooO0oO));
        }
    }

    public final void OooOO0O(ArrayList arrayList, boolean z) throws Throwable {
        int i;
        ArrayList arrayList2;
        OooO00o.OooO0O0 oooO0O0OooO00o;
        o0000OO0.OooO oooO;
        androidx.core.util.Consumer<OooO00o.OooO0OO> consumer;
        PagePart pagePart;
        RectF rectF;
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        int i2;
        float f;
        C26112OooO0oo c26112OooO0oo;
        RenderNode renderNode;
        o0000OOO o0000ooo;
        final AbstractC22830OooO0Oo abstractC22830OooO0OoOooO0Oo = OooO0Oo();
        if (abstractC22830OooO0OoOooO0Oo == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final o00000OO o00000oo2 = (o00000OO) it.next();
            final PagePart pagePart2 = o00000oo2.f88668OooO00o;
            C26112OooO0oo c26112OooO0ooOooOO0O = abstractC22830OooO0OoOooO0Oo.OooOO0O(pagePart2.f69347OooO0O0);
            RectF rectFOooO0OO = pagePart2.OooO0OO();
            RectF rectFOooO00o = o00000oo2.OooO00o();
            RectF rectF2 = !rectFOooO00o.isEmpty() ? new RectF(rectFOooO00o) : null;
            float f2 = rectFOooO0OO.left;
            float f3 = c26112OooO0ooOooOO0O.f89149OooO00o;
            float f4 = rectFOooO0OO.top;
            float f5 = c26112OooO0ooOooOO0O.f89150OooO0O0;
            RectF rectF3 = new RectF(f2 * f3, f4 * f5, rectFOooO0OO.right * f3, rectFOooO0OO.bottom * f5);
            boolean z2 = !o00000oo2.OooO00o().isEmpty();
            if (!z || !o00000oo2.f88670OooO0OO) {
                pagePart2.OooO0o0(new Consumer() { // from class: o0O0o00.OooOOo0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Canvas canvas = (Canvas) obj;
                        o00000OO o00000oo3 = o00000oo2;
                        abstractC22830OooO0OoOooO0Oo.Oooo0OO(pagePart2, o00000oo3.OooO00o(), o00000oo3.f88670OooO0OO, canvas, 9);
                    }
                }, z2);
            }
            if ((rectF2 == null || rectF2.isEmpty()) && rectF3.isEmpty()) {
                OooO0o0(Collections.singletonList(pagePart2), false);
            } else {
                final ArrayList<OooO0O0> arrayList3 = new ArrayList();
                RectF rectF4 = (rectF2 == null || rectF2.isEmpty()) ? rectF3 : rectF2;
                float fWidth = rectF3.width();
                float fHeight = rectF3.height();
                if (fWidth > 0.0f && fHeight > 0.0f) {
                    C26112OooO0oo c26112OooO0ooOooOO0O2 = abstractC22830OooO0OoOooO0Oo.OooOO0O(pagePart2.f69347OooO0O0);
                    float f6 = pagePart2.f69350OooO0o / fWidth;
                    float f7 = pagePart2.f69352OooO0oO / fHeight;
                    if (f6 > 0.0f && f7 > 0.0f) {
                        int i3 = 64;
                        float f8 = 64;
                        float f9 = f8 / f6;
                        float f10 = f8 / f7;
                        float f11 = rectF4.top;
                        while (f11 < rectF4.bottom) {
                            float f12 = rectF4.left;
                            while (f12 < rectF4.right) {
                                float f13 = f11 + f10;
                                float f14 = f12 + f9;
                                if (f14 <= f12 || f13 <= f11) {
                                    pagePart = pagePart2;
                                    rectF = rectF4;
                                    abstractC22830OooO0Oo = abstractC22830OooO0OoOooO0Oo;
                                    i2 = i3;
                                    f = f11;
                                    c26112OooO0oo = c26112OooO0ooOooOO0O2;
                                } else {
                                    RectF rectF5 = new RectF(f12, f11, f14, f13);
                                    o0000OOO o0000ooo2 = this.f88530OooO0oO;
                                    RenderNode renderNodeOooO00o = o0000ooo2.OooO00o(i3, i3);
                                    RecordingCanvas recordingCanvasBeginRecording = renderNodeOooO00o.beginRecording();
                                    try {
                                        float f15 = rectF5.left;
                                        float f16 = c26112OooO0ooOooOO0O2.f89149OooO00o;
                                        rectF = rectF4;
                                        float f17 = rectF5.top;
                                        float f18 = c26112OooO0ooOooOO0O2.f89150OooO0O0;
                                        AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = abstractC22830OooO0OoOooO0Oo;
                                        RectF rectF6 = new RectF(f15 / f16, f17 / f18, rectF5.right / f16, rectF5.bottom / f18);
                                        int i4 = pagePart2.f69347OooO0O0;
                                        pagePart = pagePart2;
                                        o0000ooo = o0000ooo2;
                                        f = f11;
                                        c26112OooO0oo = c26112OooO0ooOooOO0O2;
                                        i2 = 64;
                                        try {
                                            abstractC22830OooO0Oo2.Oooo0o(i4, renderNodeOooO00o.getWidth(), renderNodeOooO00o.getHeight(), rectF6, recordingCanvasBeginRecording);
                                            abstractC22830OooO0Oo = abstractC22830OooO0Oo2;
                                            renderNodeOooO00o.endRecording();
                                            float f19 = rectF5.left;
                                            float f20 = rectF3.left;
                                            float f21 = rectF5.top;
                                            float f22 = rectF3.top;
                                            arrayList3.add(new OooO0O0(renderNodeOooO00o, new RectF((f19 - f20) * f6, (f21 - f22) * f7, (rectF5.right - f20) * f6, (rectF5.bottom - f22) * f7)));
                                        } catch (Throwable th) {
                                            th = th;
                                            renderNode = renderNodeOooO00o;
                                            renderNode.endRecording();
                                            o0000ooo.f88702OooO00o.release(renderNode);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        renderNode = renderNodeOooO00o;
                                        o0000ooo = o0000ooo2;
                                    }
                                }
                                c26112OooO0ooOooOO0O2 = c26112OooO0oo;
                                f12 = f14;
                                f11 = f;
                                pagePart2 = pagePart;
                                i3 = i2;
                                rectF4 = rectF;
                                abstractC22830OooO0OoOooO0Oo = abstractC22830OooO0Oo;
                            }
                            f11 += f10;
                            rectF4 = rectF4;
                        }
                    }
                }
                PagePart pagePart3 = pagePart2;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo3 = abstractC22830OooO0OoOooO0Oo;
                if (arrayList3.isEmpty()) {
                    OooO0o0(Collections.singletonList(pagePart3), false);
                } else if (!arrayList3.isEmpty()) {
                    PagePart pagePart4 = o00000oo2.f88668OooO00o;
                    int i5 = pagePart4.f69350OooO0o;
                    if (i5 <= 0 || (i = pagePart4.f69352OooO0oO) <= 0) {
                        OooO(arrayList3);
                        OooO0o0(Collections.singletonList(pagePart4), false);
                    } else {
                        RenderNode renderNodeOooO0O0 = C21296OooO00o.OooO0O0();
                        renderNodeOooO0O0.setPosition(0, 0, i5, i);
                        RecordingCanvas recordingCanvasBeginRecording2 = renderNodeOooO0O0.beginRecording();
                        try {
                            pagePart4.OooO0O0(recordingCanvasBeginRecording2, new RectF(0.0f, 0.0f, i5, i), null);
                            for (OooO0O0 oooO0O0 : arrayList3) {
                                RectF rectF7 = oooO0O0.f88534OooO0O0;
                                recordingCanvasBeginRecording2.save();
                                recordingCanvasBeginRecording2.clipRect(rectF7);
                                recordingCanvasBeginRecording2.translate(rectF7.left, rectF7.top);
                                recordingCanvasBeginRecording2.drawRenderNode(oooO0O0.f88533OooO00o);
                                recordingCanvasBeginRecording2.restore();
                            }
                            renderNodeOooO0O0.endRecording();
                            if (i5 <= 0 || i <= 0) {
                                throw new IllegalArgumentException("Invalid dimensions provided, width and height must be > 0. width: " + i5 + " height: " + i);
                            }
                            try {
                                final o000O00.OooO00o oooO00o = new o000O00.OooO00o(i5, i, 1, 1, 0, 2818L);
                                oooO00o.oo000o(renderNodeOooO0O0);
                                final AtomicReference atomicReference = new AtomicReference();
                                try {
                                    oooO0O0OooO00o = oooO00o.OooO00o();
                                    oooO = new o0000OO0.OooO();
                                    try {
                                        consumer = new androidx.core.util.Consumer() { // from class: o0O0o00.OooOo00
                                            @Override // androidx.core.util.Consumer
                                            public final void accept(Object obj) {
                                                final HandlerC25931OooOo0o handlerC25931OooOo0o = this;
                                                handlerC25931OooOo0o.getClass();
                                                final AtomicReference atomicReference2 = atomicReference;
                                                atomicReference2.set((OooO00o.OooO0OO) obj);
                                                PDFView pDFView = handlerC25931OooOo0o.f88694OooO0O0.get();
                                                final o000O00.OooO00o oooO00o2 = oooO00o;
                                                final ArrayList arrayList4 = arrayList3;
                                                if (pDFView == null) {
                                                    try {
                                                        oooO00o2.close();
                                                        return;
                                                    } finally {
                                                    }
                                                }
                                                final o00000OO o00000oo3 = o00000oo2;
                                                if (pDFView.post(new Runnable() { // from class: o0O0o00.OooOo0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        Bitmap bitmapWrapHardwareBuffer;
                                                        AtomicReference atomicReference3 = atomicReference2;
                                                        o000O00.OooO00o oooO00o3 = oooO00o2;
                                                        ArrayList arrayList5 = arrayList4;
                                                        o00000OO o00000oo4 = o00000oo3;
                                                        HandlerC25931OooOo0o handlerC25931OooOo0o2 = handlerC25931OooOo0o;
                                                        handlerC25931OooOo0o2.getClass();
                                                        OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) atomicReference3.get();
                                                        if (oooO0OO == null) {
                                                            bitmapWrapHardwareBuffer = null;
                                                        } else {
                                                            bitmapWrapHardwareBuffer = Bitmap.wrapHardwareBuffer(oooO0OO.f82174OooO00o, ColorSpace.get(ColorSpace.Named.SRGB));
                                                        }
                                                        if (bitmapWrapHardwareBuffer == null) {
                                                            try {
                                                                oooO00o3.close();
                                                            } finally {
                                                                handlerC25931OooOo0o2.OooO(arrayList5);
                                                            }
                                                        } else {
                                                            Rect rect = new Rect(0, 0, bitmapWrapHardwareBuffer.getWidth(), bitmapWrapHardwareBuffer.getHeight());
                                                            C26012OooO00o c26012OooO00o = new C26012OooO00o(oooO00o3, 1);
                                                            PagePart pagePart5 = o00000oo4.f88668OooO00o;
                                                            pagePart5.OooO0oO(bitmapWrapHardwareBuffer, rect, c26012OooO00o);
                                                            C26110OooO0o0.OooO0O0();
                                                            handlerC25931OooOo0o2.OooO0o0(Collections.singletonList(pagePart5), false);
                                                        }
                                                    }
                                                })) {
                                                    return;
                                                }
                                                try {
                                                    oooO00o2.close();
                                                } finally {
                                                }
                                            }
                                        };
                                        arrayList2 = arrayList3;
                                        oooO00o = oooO00o;
                                    } catch (Exception e) {
                                        e = e;
                                        arrayList2 = arrayList3;
                                        oooO00o = oooO00o;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    arrayList2 = arrayList3;
                                }
                                try {
                                    oooO0O0OooO00o.OooO00o(oooO, consumer);
                                } catch (Exception e3) {
                                    e = e3;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("HwBatchRenderHandler");
                                    c20358OooO00o.OooO0Oo(e, "Failed to schedule drawAsync for thumbnail batch", new Object[0]);
                                    try {
                                        oooO00o.close();
                                    } finally {
                                        OooO(arrayList2);
                                    }
                                }
                            } catch (Exception e4) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("HwBatchRenderHandler");
                                c20358OooO00o2.OooO0Oo(e4, "Failed to create renderer for thumbnail batch", new Object[0]);
                                OooO(arrayList3);
                                OooO0o0(Collections.singletonList(pagePart4), false);
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o22.OooOOO0("HwBatchRenderHandler");
                            c20358OooO00o22.OooO0Oo(e4, "Failed to create renderer for thumbnail batch", new Object[0]);
                            OooO(arrayList3);
                            OooO0o0(Collections.singletonList(pagePart4), false);
                        } catch (Throwable th3) {
                            renderNodeOooO0O0.endRecording();
                            throw th3;
                        }
                    }
                }
                abstractC22830OooO0OoOooO0Oo = abstractC22830OooO0Oo3;
            }
        }
    }
}
