package o0O0o00;

import OooooO0.C21289OooO0o;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.OverScroller;
import androidx.core.util.Pair;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.editor.model.PagePart;
import com.orion.penkit.models.DrawResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import o0O0o00.AbstractC25969o00000Oo;
import o0O0o00.o000O000;
import o0O0oOO.C26111OooO0oO;
import o0O0oOO.C26112OooO0oo;
import o0O0oooo.C26395Oooo0o0;
import o0O0oooo.C26402Oooo0oO;
import o0oo0o.InterfaceC31284OooO0O0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o000O000 extends AbstractC22830OooO0Oo {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Object f88747OooOOOo = new Object();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ConcurrentHashMap<Point, Boolean> f88748OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f88749OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final RectF f88750OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final AtomicBoolean f88751OooOOOO;

    public class OooO00o extends AbstractC25969o00000Oo {
        public OooO00o(PDFView pDFView) {
            super(pDFView);
        }

        @Override // o0O0o00.AbstractC25969o00000Oo
        public final List<C25973o0000OOo> OooO00o() {
            o000O000 o000o0002 = o000O000.this;
            float zoom = o000o0002.f69108OooO00o.getZoom();
            if (zoom >= o000o0002.f69108OooO00o.getMinZoom() || Math.abs(zoom - o000o0002.f88749OooOOO) <= 0.01d) {
                return Collections.EMPTY_LIST;
            }
            o000o0002.f88749OooOOO = zoom;
            RectF rectFOooO0Oo = OooO0Oo();
            LinkedList<AbstractC25969o00000Oo.OooO0OO> linkedListOooO0o = OooO0o(rectFOooO0Oo.left, rectFOooO0Oo.top, rectFOooO0Oo.right, rectFOooO0Oo.bottom);
            ArrayList arrayList = new ArrayList();
            for (AbstractC25969o00000Oo.OooO0OO oooO0OO : linkedListOooO0o) {
                AbstractC25969o00000Oo.OooO00o oooO00o = oooO0OO.f88682OooO0O0;
                int i = oooO0OO.f88681OooO00o;
                AbstractC25969o00000Oo.OooO0O0 oooO0O0 = oooO0OO.f88683OooO0OO;
                int i2 = oooO0O0.f88679OooO00o;
                AbstractC25969o00000Oo.OooO0O0 oooO0O02 = oooO0OO.f88684OooO0Oo;
                arrayList.addAll(OooO0oO(i, i2, oooO0O02.f88679OooO00o, oooO0O0.f88680OooO0O0, oooO0O02.f88680OooO0O0, oooO00o.f88677OooO00o, oooO00o.f88678OooO0O0, false));
            }
            return arrayList;
        }

        @Override // o0O0o00.AbstractC25969o00000Oo
        public final List<C25973o0000OOo> OooO0O0(int i, int i2, int i3, float f, float f2, AtomicBoolean atomicBoolean) {
            float f3 = i3 * f;
            float f4 = i2 * f2;
            o000O000 o000o0002 = o000O000.this;
            RectF rectFOoooO = o000O000.OoooO(o000o0002);
            RectF rectF = new RectF(f3, f4, f3 + f, f4 + f2);
            if (!rectF.intersect(rectFOoooO)) {
                return Collections.EMPTY_LIST;
            }
            float f5 = 256;
            float fWidth = f5 * (rectF.width() / f);
            float fHeight = (rectF.height() / f2) * f5;
            if (fWidth > 0.0f && fHeight > 0.0f) {
                atomicBoolean.set(true);
                int i4 = this.f88674OooO0O0;
                PDFView pDFView = o000o0002.f69108OooO00o;
                if (!pDFView.f69165OooOoO.OooOOOO(rectF, i, i4)) {
                    boolean z = pDFView.f69198Oooooo;
                    return Collections.singletonList(new C25973o0000OOo(fWidth, fHeight, rectF, i, false, i4, pDFView.f69200OoooooO));
                }
            }
            return Collections.EMPTY_LIST;
        }

        @Override // o0O0o00.AbstractC25969o00000Oo
        public final List<C25973o0000OOo> OooO0OO(int i, int i2, int i3, int i4, int i5, float f, float f2) {
            return OooO0oO(i, i2, i3, i4, i5, f, f2, true);
        }

        @Override // o0O0o00.AbstractC25969o00000Oo
        public final LinkedList OooO0o(float f, float f2, float f3, float f4) {
            o000O000 o000o0002 = o000O000.this;
            RectF rectFOoooOOO = o000o0002.OoooOOO(o000o0002.f69108OooO00o.OooOo0O(1, 0));
            float fMax = Math.max(-f, rectFOoooOOO.left);
            float fMax2 = Math.max(-f2, rectFOoooOOO.top);
            float fMin = Math.min(-f3, rectFOoooOOO.right);
            float fMin2 = Math.min(-f4, rectFOoooOOO.bottom);
            LinkedList linkedList = new LinkedList();
            AbstractC25969o00000Oo.OooO0OO oooO0OO = new AbstractC25969o00000Oo.OooO0OO();
            OooO0o0(oooO0OO.f88682OooO0O0, oooO0OO.f88681OooO00o);
            C26112OooO0oo c26112OooO0ooOooOo0o = o000o0002.OooOo0o(oooO0OO.f88681OooO00o, o000o0002.f69108OooO00o.getZoom());
            AbstractC25969o00000Oo.OooO00o oooO00o = oooO0OO.f88682OooO0O0;
            float f5 = c26112OooO0ooOooOo0o.f89150OooO0O0 * oooO00o.f88678OooO0O0;
            float f6 = c26112OooO0ooOooOo0o.f89149OooO00o * oooO00o.f88677OooO00o;
            oooO0OO.f88683OooO0OO.f88679OooO00o = C21289OooO0o.OooO0o0(fMax2 / f5);
            oooO0OO.f88683OooO0OO.f88680OooO0O0 = C21289OooO0o.OooO0o0(fMax / f6);
            oooO0OO.f88684OooO0Oo.f88679OooO00o = C21289OooO0o.OooO0o0(fMin2 / f5);
            oooO0OO.f88684OooO0Oo.f88680OooO0O0 = C21289OooO0o.OooO0o0(fMin / f6);
            linkedList.add(oooO0OO);
            return linkedList;
        }

        public final List<C25973o0000OOo> OooO0oO(final int i, int i2, int i3, int i4, int i5, float f, float f2, boolean z) {
            int i6;
            o000O000 o000o0002 = o000O000.this;
            if (o000o0002.OooO0oo(i) < 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            final RectF rectFOoooO = o000O000.OoooO(o000o0002);
            C26112OooO0oo c26112OooO0ooOooOOo0 = o000o0002.f69108OooO00o.f69170OooOooO.OooOOo0(i);
            final float f3 = c26112OooO0ooOooOOo0.f89149OooO00o * 0.2f;
            final float f4 = c26112OooO0ooOooOOo0.f89150OooO0O0 * 0.2f;
            int i7 = 1;
            if (z) {
                for (int i8 = i2; i8 <= i3; i8++) {
                    for (int i9 = i4; i9 <= i5; i9++) {
                        int iFloor = (int) Math.floor(i9 * f);
                        int iFloor2 = (int) Math.floor(i8 * f2);
                        arrayList.add(new Rect(iFloor, iFloor2, iFloor + 1, iFloor2 + 1));
                    }
                }
                i6 = 1;
            } else {
                int iFloor3 = (int) Math.floor(i4 * f);
                int iFloor4 = (int) Math.floor(i2 * f2);
                int iFloor5 = (int) Math.floor((i5 * f) + f);
                int iFloor6 = (int) Math.floor((i3 * f2) + f2);
                int i10 = (iFloor5 - iFloor3) + 1;
                int i11 = 1 + (iFloor6 - iFloor4);
                arrayList.add(new Rect(iFloor3, iFloor4, iFloor3 + i10, iFloor6 + i11));
                i6 = i11;
                i7 = i10;
            }
            List list = (List) arrayList.stream().filter(new C25987o0000oo0()).distinct().sorted(new C25988o0000ooO()).collect(Collectors.toList());
            final ArrayList arrayList2 = new ArrayList();
            final int i12 = i7;
            final int i13 = i6;
            list.forEach(new Consumer() { // from class: o0O0o00.o000
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    boolean z2;
                    o000O000.OooO00o oooO00o = this.f88650OooOo0o;
                    oooO00o.getClass();
                    RectF rectF = new RectF((Rect) obj);
                    if (rectF.intersect(rectFOoooO)) {
                        float fWidth = (rectF.width() / i12) * f3;
                        float fHeight = (rectF.height() / i13) * f4;
                        o000O000 o000o0003 = o000O000.this;
                        C25911OooO0OO c25911OooO0OO = o000o0003.f69108OooO00o.f69165OooOoO;
                        int i14 = i;
                        synchronized (c25911OooO0OO.f88456OooO0OO) {
                            z2 = C25911OooO0OO.OooO0o0(i14, rectF, c25911OooO0OO.f88456OooO0OO) != null;
                        }
                        if (z2) {
                            return;
                        }
                        PDFView pDFView = o000o0003.f69108OooO00o;
                        boolean z3 = pDFView.f69198Oooooo;
                        arrayList2.add(new C25973o0000OOo(fWidth, fHeight, rectF, i14, true, 0, pDFView.f69200OoooooO));
                    }
                }
            });
            return arrayList2;
        }
    }

    public o000O000(PDFView pDFView, C26395Oooo0o0 c26395Oooo0o0, C26111OooO0oO c26111OooO0oO) {
        super(pDFView, c26395Oooo0o0);
        this.f88748OooOO0o = new ConcurrentHashMap<>();
        this.f88750OooOOO0 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f88749OooOOO = 0.0f;
        this.f88751OooOOOO = new AtomicBoolean(false);
        this.f69110OooO0OO = new OooO00o(this.f69108OooO00o);
        C26395Oooo0o0 c26395Oooo0o02 = this.f69109OooO0O0;
        int size = c26395Oooo0o02.f90560OooOO0.size();
        this.f69111OooO0Oo = size;
        if (size != 1) {
            throw new IllegalStateException("UnboundedNote must have only one page");
        }
        int iOooO0oo = OooO0oo(0);
        if (iOooO0oo >= 0) {
            C26111OooO0oO c26111OooO0oOOooOo0 = c26395Oooo0o02.OooOo0(iOooO0oo);
            if (c26111OooO0oOOooOo0.f89147OooO00o > this.f69114OooO0oO.f89147OooO00o) {
                this.f69114OooO0oO = c26111OooO0oOOooOo0;
            }
            if (c26111OooO0oOOooOo0.f89148OooO0O0 > this.f69115OooO0oo.f89148OooO0O0) {
                this.f69115OooO0oo = c26111OooO0oOOooOo0;
            }
            this.f69113OooO0o0.add(c26111OooO0oOOooOo0);
        }
        Oooo0O0(c26111OooO0oO);
        C26112OooO0oo c26112OooO0ooOooOOo0 = OooOOo0(0);
        C26112OooO0oo c26112OooO0ooOooOO0O = OooOO0O(0);
        c26395Oooo0o02.f90575OooOoO = c26112OooO0ooOooOO0O.f89149OooO00o / c26112OooO0ooOooOOo0.f89149OooO00o;
        this.f88750OooOOO0 = (RectF) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C26402Oooo0oO(c26395Oooo0o02, c26395Oooo0o02.f90560OooOO0.get(0), c26395Oooo0o02.OooOo00(0), null));
    }

    public static RectF OoooO(o000O000 o000o0002) {
        C26112OooO0oo c26112OooO0ooOooOO0O = o000o0002.OooOO0O(0);
        RectF rectFOoooOOO = o000o0002.OoooOOO(1.0f);
        float f = rectFOoooOOO.left;
        float f2 = c26112OooO0ooOooOO0O.f89149OooO00o;
        float f3 = rectFOoooOOO.top;
        float f4 = c26112OooO0ooOooOO0O.f89150OooO0O0;
        return new RectF(f / f2, f3 / f4, rectFOoooOOO.right / f2, rectFOoooOOO.bottom / f4);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void OooO(float f, float f2) {
        PDFView pDFView = this.f69108OooO00o;
        int currentXOffset = (int) pDFView.getCurrentXOffset();
        int currentYOffset = (int) pDFView.getCurrentYOffset();
        pDFView.getZoom();
        RectF rectFOoooOOo = OoooOOo(false);
        pDFView.f69167OooOoOO.OooO0OO(currentXOffset, currentYOffset, (int) f, (int) f2, (int) rectFOoooOOo.left, (int) rectFOoooOOo.right, (int) rectFOoooOOo.top, (int) rectFOoooOOo.bottom);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final boolean OooO00o(boolean z) {
        return z;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void OooO0O0(float f, float f2) {
        float fMax;
        float fMin;
        float fMax2;
        float fMax3;
        boolean z = Math.abs(f) < Math.abs(f2);
        PDFView pDFView = this.f69108OooO00o;
        int currentXOffset = (int) pDFView.getCurrentXOffset();
        int currentYOffset = (int) pDFView.getCurrentYOffset();
        pDFView.getZoom();
        RectF rectFOoooOOo = OoooOOo(false);
        if (z) {
            fMax2 = Math.max(rectFOoooOOo.left, Math.min(currentXOffset, rectFOoooOOo.right));
            float f3 = currentYOffset;
            fMax3 = Math.max(f3 - (pDFView.getHeight() / 2.0f), rectFOoooOOo.top);
            fMax = Math.min((pDFView.getHeight() / 2.0f) + f3, rectFOoooOOo.bottom);
            fMin = fMax2;
        } else {
            fMax = Math.max(rectFOoooOOo.top, Math.min(currentYOffset, rectFOoooOOo.bottom));
            float f4 = currentXOffset;
            float fMax4 = Math.max(f4 - (pDFView.getWidth() / 2.0f), rectFOoooOOo.left);
            fMin = Math.min((pDFView.getWidth() / 2.0f) + f4, rectFOoooOOo.right);
            fMax2 = fMax4;
            fMax3 = fMax;
        }
        pDFView.f69167OooOoOO.OooO0OO(currentXOffset, currentYOffset, (int) f, (int) f2, (int) fMax2, (int) fMin, (int) fMax3, (int) fMax);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final C26112OooO0oo OooOO0() {
        return OooOOo0(0);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final int OooOO0o(float f, PointF pointF) {
        return 0;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final Pair<Float, Float> OooOOO0(int i) {
        Float fValueOf = Float.valueOf(0.0f);
        return new Pair<>(fValueOf, fValueOf);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final RectF OooOOOO(float f) {
        return OoooOOo(false);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final Pair<Integer, Integer> OooOOOo(RectF rectF) {
        return new Pair<>(0, 0);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final RectF OooOOo(int i) {
        PDFView pDFView = this.f69108OooO00o;
        if (Float.isNaN(pDFView.OooOo0O(2, 0))) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float currentXOffset = pDFView.getCurrentXOffset();
        float currentYOffset = pDFView.getCurrentYOffset();
        return new RectF((int) ((-currentXOffset) * r8), (int) ((-currentYOffset) * r8), (int) ((-(currentXOffset - pDFView.getWidth())) * r8), (int) ((-(currentYOffset - pDFView.getHeight())) * r8));
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final Pair<Float, Float> OooOOoo(int i) {
        Float fValueOf = Float.valueOf(0.0f);
        return new Pair<>(fValueOf, fValueOf);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final float OooOo0(float f) {
        return OooOo0o(0, f).f89150OooO0O0;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final C26112OooO0oo OooOo00(int i) {
        RectF rectFOoooOOO = OoooOOO(1.0f);
        return new C26112OooO0oo(rectFOoooOOO.width(), rectFOoooOOO.height());
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final float OooOo0O(float f) {
        return OooOo0o(0, f).f89149OooO00o;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final List<PagePart> OooOoO(int i) {
        return new ArrayList(this.f69108OooO00o.f69165OooOoO.OooO());
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final List OooOoOO(final RectF rectF, final int i) {
        PDFView pDFView = this.f69108OooO00o;
        final float zoom = pDFView.getZoom();
        final C26112OooO0oo c26112OooO0ooOooOOo0 = OooOOo0(i);
        return (List) pDFView.f69165OooOoO.OooO().stream().filter(new Predicate() { // from class: o0O0o00.o0000oOo
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                PagePart pagePart = (PagePart) obj;
                if (pagePart.f69347OooO0O0 != i) {
                    return false;
                }
                RectF rectF2 = new RectF(pagePart.OooO0OO());
                float f = rectF2.left;
                C26112OooO0oo c26112OooO0oo = c26112OooO0ooOooOOo0;
                float f2 = c26112OooO0oo.f89149OooO00o;
                float f3 = zoom;
                float f4 = f2 * f3;
                rectF2.left = f * f4;
                float f5 = rectF2.top;
                float f6 = c26112OooO0oo.f89150OooO0O0 * f3;
                rectF2.top = f5 * f6;
                rectF2.right = f4 * rectF2.right;
                rectF2.bottom = f6 * rectF2.bottom;
                return RectF.intersects(rectF, rectF2);
            }
        }).collect(Collectors.toList());
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void OooOoo0() {
        synchronized (f88747OooOOOo) {
            try {
                C26395Oooo0o0 c26395Oooo0o0 = this.f69109OooO0O0;
                if (c26395Oooo0o0 != null) {
                    c26395Oooo0o0.OooOoo();
                    this.f88748OooOO0o.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f69108OooO00o.f69180Oooo0o0.OooO0O0(true, true);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final boolean OooOooO(int i, RectF rectF, boolean z, boolean z2) throws o0O0o00O.OooO00o {
        int iOooO0oo = OooO0oo(i);
        boolean z3 = false;
        if (iOooO0oo < 0) {
            return false;
        }
        RectF rectFO000oOoO = o000oOoO(iOooO0oo);
        synchronized (f88747OooOOOo) {
            try {
                int iFloor = (int) Math.floor(rectF.left);
                int iFloor2 = (int) Math.floor(rectF.top);
                int iFloor3 = (int) Math.floor(rectF.right);
                int iFloor4 = (int) Math.floor(rectF.bottom);
                for (int i2 = iFloor; i2 <= iFloor3; i2++) {
                    for (int i3 = iFloor2; i3 <= iFloor4; i3++) {
                        Point point = new Point(i2, i3);
                        if (!this.f88748OooOO0o.containsKey(point)) {
                            try {
                                RectF rectF2 = new RectF(rectFO000oOoO);
                                rectF2.offsetTo(i2 * rectFO000oOoO.width(), i3 * rectFO000oOoO.height());
                                C26395Oooo0o0 c26395Oooo0o0 = this.f69109OooO0O0;
                                synchronized (c26395Oooo0o0.f90577OooOoOO) {
                                    c26395Oooo0o0.Oooo00O(iOooO0oo, z, rectF2);
                                }
                                this.f88748OooOO0o.put(point, Boolean.TRUE);
                                z3 = true;
                            } catch (Exception e) {
                                this.f88748OooOO0o.put(point, Boolean.FALSE);
                                throw new o0O0o00O.OooO00o(e);
                            }
                        }
                    }
                }
                if (!z2) {
                    OoooOO0(new Point((iFloor3 + iFloor) / 2, (iFloor4 + iFloor2) / 2), iOooO0oo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void Oooo(int i, Point point, boolean z, boolean z2) {
        Point point2;
        PDFView pDFView = this.f69108OooO00o;
        if (z) {
            float fOooOo0O = 1.0f / pDFView.OooOo0O(1, i);
            point2 = new Point((int) (point.x - ((pDFView.getWidth() / 2.0f) * fOooOo0O)), (int) (point.y - ((pDFView.getHeight() / 2.0f) * fOooOo0O)));
        } else {
            point2 = new Point(point);
        }
        float fOooOo0O2 = pDFView.OooOo0O(1, i);
        pDFView.getZoom();
        RectF rectFOoooOOo = OoooOOo(true);
        pDFView.Oooo(Math.max(rectFOoooOOo.left, Math.min(rectFOoooOOo.right, (-point2.x) * fOooOo0O2)), Math.max(rectFOoooOOo.top, Math.min(rectFOoooOOo.bottom, (-point2.y) * fOooOo0O2)), true);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void Oooo0() {
        if (this.f88751OooOOOO.compareAndSet(true, false)) {
            this.f69108OooO00o.Oooo0oO();
        }
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final boolean Oooo00O(RectF rectF, int i) {
        if (OooO0oo(i) < 0) {
            return false;
        }
        int iFloor = (int) Math.floor(rectF.top);
        int iFloor2 = (int) Math.floor(rectF.right);
        int iFloor3 = (int) Math.floor(rectF.bottom);
        for (int iFloor4 = (int) Math.floor(rectF.left); iFloor4 <= iFloor2; iFloor4++) {
            for (int i2 = iFloor; i2 <= iFloor3; i2++) {
                if (!Boolean.TRUE.equals(this.f88748OooOO0o.get(new Point(iFloor4, i2)))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void Oooo00o() {
        PDFView pDFView = this.f69108OooO00o;
        pDFView.getZoom();
        RectF rectFOoooOOo = OoooOOo(true);
        int i = (int) rectFOoooOOo.left;
        int i2 = (int) rectFOoooOOo.right;
        int i3 = (int) rectFOoooOOo.top;
        int i4 = (int) rectFOoooOOo.bottom;
        C25909OooO00o c25909OooO00o = pDFView.f69167OooOoOO;
        c25909OooO00o.OooO0oO();
        c25909OooO00o.f88447OooO0o = true;
        boolean z = c25909OooO00o.f88446OooO0Oo;
        OverScroller overScroller = c25909OooO00o.f88445OooO0OO;
        if (z) {
            overScroller.springBack(overScroller.getCurrX(), overScroller.getCurrY(), i, i2, i3, i4);
        } else {
            PDFView pDFView2 = c25909OooO00o.f88443OooO00o;
            overScroller.springBack((int) pDFView2.getCurrentXOffset(), (int) pDFView2.getCurrentYOffset(), i, i2, i3, i4);
        }
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void Oooo0O0(C26111OooO0oO c26111OooO0oO) {
        synchronized (this) {
            this.f69112OooO0o.clear();
            C26111OooO0oO c26111OooO0oO2 = (C26111OooO0oO) this.f69113OooO0o0.get(0);
            this.f69112OooO0o.add(new C26112OooO0oo(c26111OooO0oO2.f89147OooO00o, c26111OooO0oO2.f89148OooO0O0));
            this.f69117OooOO0O.clear();
            this.f69117OooOO0O.add(Float.valueOf(0.0f));
        }
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void OoooO0(Integer num, DrawResult drawResult) {
        RectF rectF = new RectF(this.f88750OooOOO0);
        drawResult.getNewItemList().forEach(new Consumer() { // from class: o0O0o00.o0000oOO
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o000O000 o000o0002 = this.f88739OooOo0o;
                o000o0002.getClass();
                RectF boundingBox = ((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f);
                if (o000o0002.f88750OooOOO0.isEmpty()) {
                    o000o0002.f88750OooOOO0.set(boundingBox);
                    return;
                }
                RectF rectF2 = o000o0002.f88750OooOOO0;
                rectF2.top = Math.min(rectF2.top, boundingBox.top);
                RectF rectF3 = o000o0002.f88750OooOOO0;
                rectF3.left = Math.min(rectF3.left, boundingBox.left);
                RectF rectF4 = o000o0002.f88750OooOOO0;
                rectF4.right = Math.max(rectF4.right, boundingBox.right);
                RectF rectF5 = o000o0002.f88750OooOOO0;
                rectF5.bottom = Math.max(rectF5.bottom, boundingBox.bottom);
            }
        });
        if (!rectF.equals(this.f88750OooOOO0)) {
            this.f88751OooOOOO.set(true);
        }
        super.OoooO0(num, drawResult);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void OoooO00(int i, DrawResult drawResult, boolean z, String str) {
        RectF rectF = new RectF(this.f88750OooOOO0);
        drawResult.getNewItemList().forEach(new Consumer() { // from class: o0O0o00.o0000oO0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                o000O000 o000o0002 = this.f88738OooOo0o;
                o000o0002.getClass();
                RectF boundingBox = ((InterfaceC31284OooO0O0) obj).getBoundingBox(1.0f);
                if (o000o0002.f88750OooOOO0.isEmpty()) {
                    o000o0002.f88750OooOOO0.set(boundingBox);
                    return;
                }
                RectF rectF2 = o000o0002.f88750OooOOO0;
                rectF2.top = Math.min(rectF2.top, boundingBox.top);
                RectF rectF3 = o000o0002.f88750OooOOO0;
                rectF3.left = Math.min(rectF3.left, boundingBox.left);
                RectF rectF4 = o000o0002.f88750OooOOO0;
                rectF4.right = Math.max(rectF4.right, boundingBox.right);
                RectF rectF5 = o000o0002.f88750OooOOO0;
                rectF5.bottom = Math.max(rectF5.bottom, boundingBox.bottom);
            }
        });
        if (!rectF.equals(this.f88750OooOOO0)) {
            this.f88751OooOOOO.set(true);
        }
        this.f69109OooO0O0.OoooOOo(i, drawResult, z, str);
    }

    public final void OoooOO0(Point point, int i) {
        RectF rectFO000oOoO = o000oOoO(i);
        ConcurrentHashMap<Point, Boolean> concurrentHashMap = this.f88748OooOO0o;
        for (Point point2 : concurrentHashMap.keySet()) {
            if (Math.abs(point2.x - point.x) > 8 || Math.abs(point2.y - point.y) > 8) {
                RectF rectF = new RectF(rectFO000oOoO);
                rectF.offsetTo(rectFO000oOoO.width() * point2.x, rectFO000oOoO.height() * point2.y);
                this.f69109OooO0O0.OooOooO(rectF, 0);
                concurrentHashMap.remove(point2);
            }
        }
    }

    public final RectF OoooOOO(float f) {
        C26112OooO0oo c26112OooO0ooOooOO0O = OooOO0O(0);
        float f2 = c26112OooO0ooOooOO0O.f89149OooO00o;
        float f3 = 0.5f * f2;
        RectF rectF = new RectF(this.f88750OooOOO0);
        if (rectF.width() > 0.0f) {
            rectF.left -= f3;
            rectF.right += f3;
        }
        if (rectF.height() > 0.0f) {
            rectF.top -= f3;
            rectF.bottom += f3;
        }
        RectF rectF2 = new RectF(0.0f, 0.0f, f2, c26112OooO0ooOooOO0O.f89150OooO0O0);
        rectF2.union(rectF);
        return new RectF(rectF2.left * f, rectF2.top * f, rectF2.right * f, rectF2.bottom * f);
    }

    public final RectF OoooOOo(boolean z) {
        float fWidth;
        float fHeight;
        PDFView pDFView = this.f69108OooO00o;
        RectF rectFOoooOOO = OoooOOO(pDFView.OooOo0O(1, 0));
        if (z || !(pDFView.f69167OooOoOO.OooO0O0() || pDFView.f69167OooOoOO.f88447OooO0o || pDFView.f69169OooOoo0.f69071OooOOo)) {
            fWidth = 0.0f;
            fHeight = 0.0f;
        } else {
            fWidth = pDFView.getWidth() * 0.5f;
            fHeight = pDFView.getHeight() * 0.5f;
        }
        float width = pDFView.getWidth();
        float height = pDFView.getHeight();
        if (rectFOoooOOO.width() < width) {
            fWidth = (width - rectFOoooOOO.width()) * 0.5f;
        }
        if (rectFOoooOOO.height() < height) {
            fHeight = (height - rectFOoooOOO.height()) * 0.5f;
        }
        return new RectF((-(rectFOoooOOO.right - pDFView.getWidth())) - fWidth, (-(rectFOoooOOO.bottom - pDFView.getHeight())) - fHeight, (-rectFOoooOOO.left) + fWidth, (-rectFOoooOOO.top) + fHeight);
    }

    public final RectF o000oOoO(int i) {
        ArrayList arrayList = this.f69113OooO0o0;
        return new RectF(0.0f, 0.0f, ((C26111OooO0oO) arrayList.get(i)).f89147OooO00o, ((C26111OooO0oO) arrayList.get(i)).f89148OooO0O0);
    }
}
