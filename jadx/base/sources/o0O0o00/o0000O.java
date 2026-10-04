package o0O0o00;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.color.utilities.C22360OooO0oo;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.editor.model.PagePart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import o0O0o00.AbstractC25969o00000Oo;
import o0O0o00.C25911OooO0OO;
import o0O0oOO.C26110OooO0o0;
import o0O0oOO.C26112OooO0oo;
import o0O0oooo.C26384OooOoo0;
import o0O0oooo.C26395Oooo0o0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oooOO0.InterfaceC35202OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class o0000O extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f88693OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final WeakReference<PDFView> f88694OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f88695OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashSet f88696OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ConcurrentHashMap f88697OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ConcurrentHashMap f88698OooO0o0;

    public static class OooO00o implements Comparator<o00000OO> {
        @Override // java.util.Comparator
        public final int compare(o00000OO o00000oo2, o00000OO o00000oo3) {
            o00000OO o00000oo4 = o00000oo2;
            o00000OO o00000oo5 = o00000oo3;
            if (o00000oo4 == null && o00000oo5 == null) {
                return 0;
            }
            if (o00000oo4 == null) {
                return 1;
            }
            if (o00000oo5 == null) {
                return -1;
            }
            int iCompare = Integer.compare(o00000oo4.f88668OooO00o.f69354OooOO0, o00000oo5.f88668OooO00o.f69354OooOO0);
            return iCompare != 0 ? iCompare : Long.compare(o00000oo4.f88671OooO0Oo, o00000oo5.f88671OooO0Oo);
        }
    }

    public o0000O(PDFView pDFView, Looper looper) {
        super(looper);
        this.f88693OooO00o = 0L;
        this.f88696OooO0Oo = new LinkedHashSet();
        this.f88698OooO0o0 = new ConcurrentHashMap();
        this.f88697OooO0o = new ConcurrentHashMap();
        this.f88694OooO0O0 = new WeakReference<>(pDFView);
        this.f88695OooO0OO = 16L;
        sendEmptyMessage(3);
    }

    public static void OooO0o(o00000OO o00000oo2) {
        AtomicLong atomicLong;
        long j;
        long j2 = o00000oo2.f88671OooO0Oo;
        do {
            atomicLong = o00000oo2.f88668OooO00o.f69357OooOOO0;
            j = atomicLong.get();
            if (j2 <= j) {
                return;
            }
        } while (!atomicLong.compareAndSet(j, j2));
    }

    public final void OooO00o(List<String> list, List<Integer> list2) {
        ArrayList arrayList;
        AbstractC22830OooO0Oo abstractC22830OooO0OoOooO0Oo = OooO0Oo();
        if (abstractC22830OooO0OoOooO0Oo == null) {
            return;
        }
        C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0OoOooO0Oo.f69109OooO0O0;
        if (c26395Oooo0o0 == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            if (list.size() != list2.size()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteInCore");
                c20358OooO00o.OooO0OO("applyDisplayItemEffect: displayItemIdList.size != displayItemTypeList.size", new Object[0]);
            } else {
                synchronized (c26395Oooo0o0.f90559OooO0oo) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : list) {
                            int i2 = i + 1;
                            if (i < 0) {
                                C34429OooOOo0.OooOOo();
                                throw null;
                            }
                            String str = (String) obj;
                            Integer numValueOf = Integer.valueOf(list2.get(i).intValue());
                            Object arrayList3 = linkedHashMap.get(numValueOf);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList3);
                            }
                            ((List) arrayList3).add(str);
                            i = i2;
                        }
                        Set setKeySet = linkedHashMap.keySet();
                        Set<Integer> setKeySet2 = c26395Oooo0o0.f90578OooOoo.keySet();
                        kotlin.jvm.internal.OooOOO0.OooO0o(setKeySet2, "<get-keys>(...)");
                        Iterator it = C34449Oooo0oo.OooO0oo(setKeySet, setKeySet2).iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            HashSet<String> hashSet = c26395Oooo0o0.f90578OooOoo.get(Integer.valueOf(iIntValue));
                            Set setO0OO00O = hashSet != null ? oOo000Oo.OooOo.o0OO00O(hashSet) : C34438OooOoo0.f123458OooOo0o;
                            List list3 = (List) linkedHashMap.get(Integer.valueOf(iIntValue));
                            Set setO0OO00O2 = list3 != null ? oOo000Oo.OooOo.o0OO00O(list3) : C34438OooOoo0.f123458OooOo0o;
                            LinkedHashSet linkedHashSetOooO0oo = C34449Oooo0oo.OooO0oo(C34449Oooo0oo.OooO0oO(setO0OO00O2, setO0OO00O), C34449Oooo0oo.OooO0oO(setO0OO00O, setO0OO00O2));
                            if (!linkedHashSetOooO0oo.isEmpty()) {
                                arrayList2.addAll(linkedHashSetOooO0oo);
                            }
                        }
                        c26395Oooo0o0.f90578OooOoo.clear();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            c26395Oooo0o0.f90578OooOoo.put(Integer.valueOf(((Number) entry.getKey()).intValue()), oOo000Oo.OooOo.o00oO0o((List) entry.getValue()));
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sendMessage(obtainMessage(101, arrayList));
    }

    public final PagePart OooO0O0(C25973o0000OOo c25973o0000OOo, PDFView pDFView) throws o0O0o00O.OooO00o {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        float f;
        float f2;
        InterfaceC35202OooO00o interfaceC35202OooO00o;
        if (!pDFView.f69173Oooo0.get() && (abstractC22830OooO0Oo = pDFView.f69170OooOooO) != null) {
            int i = c25973o0000OOo.f88706OooO0Oo;
            boolean z = pDFView.f69186OoooO0O;
            RectF rectF = c25973o0000OOo.f88705OooO0OO;
            boolean z2 = c25973o0000OOo.f88708OooO0o0;
            boolean zOooOooO = abstractC22830OooO0Oo.OooOooO(i, rectF, z, z2);
            int i2 = c25973o0000OOo.f88706OooO0Oo;
            if (zOooOooO && (interfaceC35202OooO00o = pDFView.f69191OoooOoO) != null && pDFView.f69193Ooooo00) {
                interfaceC35202OooO00o.OooO0o(i2);
            }
            if (!abstractC22830OooO0Oo.Oooo00O(rectF, i2)) {
                float f3 = c25973o0000OOo.f88703OooO00o;
                float f4 = c25973o0000OOo.f88704OooO0O0;
                if (z2) {
                    f = f3;
                    f2 = f4;
                } else {
                    float f5 = 1;
                    f = f3 + f5;
                    f2 = f5 + f4;
                }
                boolean z3 = abstractC22830OooO0Oo instanceof o000O000;
                float f6 = ((f - f3) / 2.0f) / f3;
                float f7 = ((f2 - f4) / 2.0f) / f4;
                float f8 = rectF.left;
                float f9 = rectF.top;
                float f10 = rectF.right;
                float f11 = rectF.bottom;
                float f12 = (f10 - f8) * f6;
                float f13 = (f11 - f9) * f7;
                RectF rectF2 = new RectF(f8 - f12, f9 - f13, f10 + f12, f11 + f13);
                if (!z3) {
                    rectF2.left = Math.max(0.0f, rectF2.left);
                    rectF2.top = Math.max(0.0f, rectF2.top);
                    rectF2.right = Math.min(1.0f, rectF2.right);
                    rectF2.bottom = Math.min(1.0f, rectF2.bottom);
                }
                C26112OooO0oo c26112OooO0ooOooOO0O = abstractC22830OooO0Oo.OooOO0O(i2);
                float fWidth = rectF.width();
                float f14 = c26112OooO0ooOooOO0O.f89149OooO00o;
                float fHeight = rectF.height();
                float f15 = c26112OooO0ooOooOO0O.f89150OooO0O0;
                new RectF(0.0f, 0.0f, fWidth * f14, fHeight * f15).offset(rectF.left * f14, rectF.top * f15);
                int iRound = Math.round(f);
                int iRound2 = Math.round(f2);
                if (iRound > 0 && iRound2 > 0) {
                    return new PagePart(c25973o0000OOo.f88706OooO0Oo, iRound, iRound2, c25973o0000OOo.f88705OooO0OO, rectF2, c25973o0000OOo.f88709OooO0oO, c25973o0000OOo.f88708OooO0o0, c25973o0000OOo.f88707OooO0o, OooO0oo());
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("RenderHandler");
                c20358OooO00o.OooO0OO("Invalid PagePart size: %dx%d for page %d", Integer.valueOf(iRound), Integer.valueOf(iRound2), Integer.valueOf(i2));
                return null;
            }
        }
        return null;
    }

    public final C25911OooO0OO OooO0OO() {
        PDFView pDFView = this.f88694OooO0O0.get();
        if (pDFView != null && !pDFView.f69173Oooo0.get()) {
            return pDFView.f69165OooOoO;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("RenderHandler");
        c20358OooO00o.OooOO0O("getCacheManager called on a recycled PDFView or null reference", new Object[0]);
        return null;
    }

    public final AbstractC22830OooO0Oo OooO0Oo() {
        PDFView pDFView = this.f88694OooO0O0.get();
        if (pDFView != null && !pDFView.f69173Oooo0.get()) {
            return pDFView.f69170OooOooO;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("RenderHandler");
        c20358OooO00o.OooOO0O("getPdfFile called on a recycled PDFView or null reference", new Object[0]);
        return null;
    }

    public final void OooO0o0(List<PagePart> list, boolean z) {
        final PDFView pDFView = this.f88694OooO0O0.get();
        if (pDFView == null || pDFView.f69173Oooo0.get()) {
            return;
        }
        if (!z) {
            pDFView.post(new Runnable() { // from class: o0O0o00.o000OO
                @Override // java.lang.Runnable
                public final void run() {
                    PDFView pDFView2 = pDFView;
                    if (pDFView2.f69173Oooo0.get()) {
                        return;
                    }
                    pDFView2.invalidate();
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (PagePart pagePart : list) {
            if (pagePart.f69353OooO0oo) {
                arrayList2.add(pagePart);
            } else {
                arrayList.add(pagePart);
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        C25911OooO0OO c25911OooO0OO = pDFView.f69165OooOoO;
        if (!zIsEmpty) {
            c25911OooO0OO.OooO0O0(arrayList2);
        }
        if (!arrayList.isEmpty()) {
            c25911OooO0OO.OooO00o(arrayList);
        }
        pDFView.post(new Runnable() { // from class: o0O0o00.o0000O0O
            @Override // java.lang.Runnable
            public final void run() {
                pDFView.OoooO0O();
            }
        });
    }

    public abstract void OooO0oO(List<o00000OO> list, boolean z);

    public abstract boolean OooO0oo();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.os.Handler, o0O0o00.o0000O] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        ?? arrayList;
        List<PagePart> list;
        int i = message.what;
        boolean z2 = true;
        boolean z3 = false;
        if (i == 1) {
            int i2 = message.arg1;
            PDFView pDFView = this.f88694OooO0O0.get();
            if (pDFView == null || pDFView.f69173Oooo0.get()) {
                return;
            }
            C25911OooO0OO c25911OooO0OO = pDFView.f69165OooOoO;
            if ((i2 & 1) != 0) {
                synchronized (c25911OooO0OO.f88458OooO0o) {
                    c25911OooO0OO.f88454OooO00o.addAll(c25911OooO0OO.f88455OooO0O0);
                    c25911OooO0OO.f88455OooO0O0.clear();
                }
                synchronized (c25911OooO0OO.f88460OooO0oO) {
                    try {
                        for (C25911OooO0OO.OooO0O0 oooO0O0 : c25911OooO0OO.f88457OooO0Oo.values()) {
                            if (!oooO0O0.f88464OooO0OO && oooO0O0.f88462OooO00o != null) {
                                oooO0O0.f88465OooO0Oo = true;
                            }
                        }
                    } finally {
                    }
                }
            }
            if ((i2 & 2) != 0) {
                c25911OooO0OO.OooOO0O();
            }
            if ((i2 & 4) != 0) {
                c25911OooO0OO.OooOO0o();
            }
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
            if (abstractC22830OooO0Oo == null) {
                return;
            }
            AbstractC25969o00000Oo abstractC25969o00000Oo = abstractC22830OooO0Oo.f69110OooO0OO;
            RectF rectFOooO0Oo = abstractC25969o00000Oo.OooO0Oo();
            LinkedList<AbstractC25969o00000Oo.OooO0OO> linkedListOooO0o = abstractC25969o00000Oo.OooO0o(rectFOooO0Oo.left, rectFOooO0Oo.top, rectFOooO0Oo.right, rectFOooO0Oo.bottom);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC25969o00000Oo.OooO0OO oooO0OO : linkedListOooO0o) {
                AbstractC25969o00000Oo.OooO00o oooO00o = oooO0OO.f88682OooO0O0;
                int i3 = oooO0OO.f88681OooO00o;
                AbstractC25969o00000Oo.OooO0O0 oooO0O02 = oooO0OO.f88683OooO0OO;
                int i4 = oooO0O02.f88679OooO00o;
                AbstractC25969o00000Oo.OooO0O0 oooO0O03 = oooO0OO.f88684OooO0Oo;
                arrayList3.addAll(abstractC25969o00000Oo.OooO0OO(i3, i4, oooO0O03.f88679OooO00o, oooO0O02.f88680OooO0O0, oooO0O03.f88680OooO0O0, oooO00o.f88677OooO00o, oooO00o.f88678OooO0O0));
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.addAll(arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            abstractC25969o00000Oo.f88674OooO0O0 = 1;
            int i5 = abstractC25969o00000Oo.f88676OooO0Oo.get();
            int i6 = 0;
            for (AbstractC25969o00000Oo.OooO0OO oooO0OO2 : linkedListOooO0o) {
                if (i6 >= i5) {
                    break;
                }
                AbstractC25969o00000Oo.OooO00o oooO00o2 = oooO0OO2.f88682OooO0O0;
                int i7 = i5 - i6;
                int i8 = oooO0OO2.f88681OooO00o;
                AbstractC25969o00000Oo.OooO0O0 oooO0O04 = oooO0OO2.f88683OooO0OO;
                int i9 = oooO0O04.f88679OooO00o;
                AbstractC25969o00000Oo.OooO0O0 oooO0O05 = oooO0OO2.f88684OooO0Oo;
                int i10 = oooO0O05.f88679OooO00o;
                int i11 = oooO0O04.f88680OooO0O0;
                int i12 = oooO0O05.f88680OooO0O0;
                float f = oooO00o2.f88677OooO00o;
                float f2 = oooO00o2.f88678OooO0O0;
                boolean z4 = z2;
                ArrayList arrayList5 = new ArrayList();
                ?? r18 = z3;
                while (true) {
                    if (i9 <= i10) {
                        int i13 = i8;
                        int i14 = i11;
                        ?? r182 = r18;
                        while (i14 <= i12) {
                            int i15 = i10;
                            AtomicBoolean atomicBoolean = new AtomicBoolean(z3);
                            int i16 = i13;
                            int i17 = i12;
                            int i18 = i9;
                            float f3 = f2;
                            arrayList5.addAll(abstractC25969o00000Oo.OooO0O0(i16, i18, i14, f, f3, atomicBoolean));
                            ?? r183 = r182;
                            if (atomicBoolean.get()) {
                                abstractC25969o00000Oo.f88674OooO0O0++;
                                r183 = r182 + 1;
                            }
                            ?? r4 = r183;
                            if (r4 >= i7) {
                                r18 = r4 == true ? 1 : 0;
                                break;
                            }
                            i14++;
                            i13 = i16;
                            i12 = i17;
                            i9 = i18;
                            f2 = f3;
                            r182 = r4 == true ? 1 : 0;
                            i10 = i15;
                            z3 = false;
                        }
                        i8 = i13;
                        f2 = f2;
                        i12 = i12;
                        i9++;
                        z3 = false;
                        r18 = r182;
                    }
                }
                i6 += r18;
                arrayList4.addAll(arrayList5);
                z2 = z4;
                z3 = false;
            }
            if (!arrayList4.isEmpty()) {
                arrayList2.addAll(arrayList4);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.f88696OooO0Oo.clear();
            this.f88696OooO0Oo.addAll(arrayList2);
            return;
        }
        if (i == 2) {
            o00000OO o00000oo2 = (o00000OO) message.obj;
            PagePart pagePart = o00000oo2.f88668OooO00o;
            if (pagePart.f69356OooOO0o.get()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("RenderHandler");
                c20358OooO00o.OooO00o("Skipping recycled PagePart: %s", pagePart.f69346OooO00o);
                return;
            }
            String str = o00000oo2.f88668OooO00o.f69346OooO00o;
            ConcurrentHashMap concurrentHashMap = pagePart.f69353OooO0oo ? this.f88697OooO0o : this.f88698OooO0o0;
            o00000OO o00000oo3 = (o00000OO) concurrentHashMap.get(str);
            if (o00000oo3 != null) {
                o00000oo3.OooO0O0(o00000oo2);
                OooO0o(o00000oo3);
                return;
            } else {
                concurrentHashMap.put(str, o00000oo2);
                OooO0o(o00000oo2);
                return;
            }
        }
        if (i == 3) {
            PDFView pDFView2 = this.f88694OooO0O0.get();
            if (pDFView2 == null || pDFView2.f69173Oooo0.get()) {
                return;
            }
            LinkedHashSet linkedHashSet = this.f88696OooO0Oo;
            if (linkedHashSet.isEmpty()) {
                z = false;
            } else {
                if (pDFView2.f69170OooOooO == null || linkedHashSet.isEmpty()) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList(linkedHashSet.size());
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        try {
                            PagePart pagePartOooO0O0 = OooO0O0((C25973o0000OOo) it.next(), pDFView2);
                            if (pagePartOooO0O0 != null) {
                                arrayList.add(new o00000OO(pagePartOooO0O0, new RectF(), false, false));
                            }
                        } catch (o0O0o00O.OooO00o e) {
                            C34406OooO00o.f123390OooO00o.OooO0Oo(e, "Failed to create tile", new Object[0]);
                        }
                    }
                }
                C26110OooO0o0.OooO0O0();
                OooO0oO(arrayList, true);
                linkedHashSet.clear();
                z = true;
            }
            ConcurrentHashMap concurrentHashMap2 = this.f88698OooO0o0;
            Collection collectionValues = concurrentHashMap2.values();
            List list2 = collectionValues.isEmpty() ? Collections.EMPTY_LIST : (List) collectionValues.stream().filter(new o0000O0()).sorted(new OooO00o()).collect(Collectors.toList());
            boolean z5 = z;
            if (!list2.isEmpty()) {
                OooO0oO(new ArrayList(list2), false);
                concurrentHashMap2.clear();
                z5 = true;
            }
            if (z5) {
                this.f88693OooO00o = 0L;
            } else {
                this.f88693OooO00o++;
            }
            ConcurrentHashMap concurrentHashMap3 = this.f88697OooO0o;
            if (!concurrentHashMap3.isEmpty() && this.f88693OooO00o >= 60 && !concurrentHashMap3.isEmpty()) {
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = concurrentHashMap3.values().iterator();
                int i19 = 0;
                while (it2.hasNext()) {
                    arrayList6.add((o00000OO) it2.next());
                    i19++;
                    if (i19 >= 2) {
                        break;
                    }
                }
                OooO0oO(arrayList6, false);
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    concurrentHashMap3.remove(((o00000OO) it3.next()).f88668OooO00o.f69346OooO00o);
                }
                this.f88693OooO00o = 0L;
            }
            sendEmptyMessageDelayed(3, this.f88695OooO0OO);
            return;
        }
        if (i == 100) {
            AbstractC22830OooO0Oo abstractC22830OooO0OoOooO0Oo = OooO0Oo();
            if (abstractC22830OooO0OoOooO0Oo == null) {
                return;
            }
            this.f88696OooO0Oo.addAll(abstractC22830OooO0OoOooO0Oo.f69110OooO0OO.OooO00o());
            return;
        }
        if (i != 101) {
            super.handleMessage(message);
            return;
        }
        List list3 = (List) message.obj;
        AbstractC22830OooO0Oo abstractC22830OooO0OoOooO0Oo2 = OooO0Oo();
        if (abstractC22830OooO0OoOooO0Oo2 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("RenderHandler");
            c20358OooO00o2.OooO0OO("NoteFile is null, cannot handle alpha effect task", new Object[0]);
            return;
        }
        C25911OooO0OO c25911OooO0OOOooO0OO = OooO0OO();
        if (c25911OooO0OOOooO0OO == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("RenderHandler");
            c20358OooO00o3.OooO0OO("CacheManager is null, cannot handle alpha effect task", new Object[0]);
            return;
        }
        HashSet hashSet = new HashSet(list3);
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayListOooO0oo = c25911OooO0OOOooO0OO.OooO0oo();
        HashMap map = new HashMap();
        for (int i20 = 0; i20 < arrayListOooO0oo.size(); i20++) {
            PagePart pagePart2 = (PagePart) arrayListOooO0oo.get(i20);
            if (!pagePart2.f69353OooO0oo) {
                ((List) map.computeIfAbsent(Integer.valueOf(pagePart2.f69347OooO0O0), new C22360OooO0oo(1))).add(pagePart2);
            }
        }
        for (Integer num : map.keySet()) {
            int iIntValue = num.intValue();
            C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0OoOooO0Oo2.f69109OooO0O0;
            c26395Oooo0o0.getClass();
            ArrayList arrayListOooOOO = c26395Oooo0o0.OooOOO(num.intValue(), new C26384OooOoo0(c26395Oooo0o0, hashSet, 0));
            if (!arrayListOooOOO.isEmpty() && (list = (List) map.get(num)) != null && !list.isEmpty()) {
                InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
                RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(1.0f, arrayListOooOOO);
                if (rectFOooO00o != null) {
                    C26112OooO0oo c26112OooO0ooOooOO0O = abstractC22830OooO0OoOooO0Oo2.OooOO0O(iIntValue);
                    float f4 = rectFOooO00o.left;
                    float f5 = c26112OooO0ooOooOO0O.f89149OooO00o;
                    float f6 = rectFOooO00o.top;
                    float f7 = c26112OooO0ooOooOO0O.f89150OooO0O0;
                    RectF rectF = new RectF(f4 / f5, f6 / f7, rectFOooO00o.right / f5, rectFOooO00o.bottom / f7);
                    for (PagePart pagePart3 : list) {
                        if (RectF.intersects(rectF, pagePart3.OooO0OO())) {
                            arrayList7.add(pagePart3);
                        }
                    }
                }
            }
        }
        RectF rectF2 = new RectF();
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            o00000OO o00000oo4 = new o00000OO((PagePart) it4.next(), rectF2, true, false);
            this.f88698OooO0o0.put(o00000oo4.f88668OooO00o.f69346OooO00o, o00000oo4);
            OooO0o(o00000oo4);
        }
    }
}
