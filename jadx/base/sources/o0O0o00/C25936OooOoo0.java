package o0O0o00;

import OooO0o.C20424OooO0Oo;
import Oooo0.C20857Oooooo;
import OooooO0.C21289OooO0o;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.util.Pair;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.editor.model.PagePart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import o0O0o00.AbstractC25969o00000Oo;
import o0O0oOO.C26109OooO0o;
import o0O0oOO.C26111OooO0oO;
import o0O0oOO.C26112OooO0oo;
import o0O0oOO.EnumC26104OooO;
import o0O0oOO.EnumC26107OooO0OO;
import o0O0oooo.C26395Oooo0o0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o00.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25936OooOoo0 extends AbstractC22830OooO0Oo {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final Object f88570OooOo00 = new Object();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f88571OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList f88572OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f88573OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f88574OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final EnumC26107OooO0OO f88575OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f88576OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f88577OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f88578OooOOoo;

    /* JADX INFO: renamed from: o0O0o00.OooOoo0$OooO00o */
    public class OooO00o extends AbstractC25969o00000Oo {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final RectF f88580OooO0o0;

        public OooO00o(PDFView pDFView) {
            super(pDFView);
            this.f88580OooO0o0 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }

        @Override // o0O0o00.AbstractC25969o00000Oo
        public final List<C25973o0000OOo> OooO0O0(int i, int i2, int i3, float f, float f2, AtomicBoolean atomicBoolean) {
            float f3 = i3 * f;
            float f4 = i2 * f2;
            float f5 = f3 + f > 1.0f ? 1.0f - f3 : f;
            float f6 = f4 + f2 > 1.0f ? 1.0f - f4 : f2;
            RectF rectF = new RectF(f3, f4, f3 + f5, f4 + f6);
            float f7 = 256;
            float f8 = f7 * (f5 / f);
            float f9 = (f6 / f2) * f7;
            if (f8 > 0.0f && f9 > 0.0f) {
                atomicBoolean.set(true);
                int i4 = this.f88674OooO0O0;
                C25936OooOoo0 c25936OooOoo0 = C25936OooOoo0.this;
                if (!c25936OooOoo0.f69108OooO00o.f69165OooOoO.OooOOOO(rectF, i, i4)) {
                    PDFView pDFView = c25936OooOoo0.f69108OooO00o;
                    boolean z = pDFView.f69198Oooooo;
                    return Collections.singletonList(new C25973o0000OOo(f8, f9, rectF, i, false, i4, pDFView.f69200OoooooO));
                }
            }
            return Collections.EMPTY_LIST;
        }

        @Override // o0O0o00.AbstractC25969o00000Oo
        public final List<C25973o0000OOo> OooO0OO(int i, int i2, int i3, int i4, int i5, float f, float f2) {
            boolean z;
            C25936OooOoo0 c25936OooOoo0 = C25936OooOoo0.this;
            C26112OooO0oo c26112OooO0ooOooOOo0 = c25936OooOoo0.f69108OooO00o.f69170OooOooO.OooOOo0(i);
            float f3 = c26112OooO0ooOooOOo0.f89149OooO00o * 0.3f;
            float f4 = c26112OooO0ooOooOOo0.f89150OooO0O0 * 0.3f;
            C25911OooO0OO c25911OooO0OO = c25936OooOoo0.f69108OooO00o.f69165OooOoO;
            RectF rectF = this.f88580OooO0o0;
            synchronized (c25911OooO0OO.f88456OooO0OO) {
                z = C25911OooO0OO.OooO0o0(i, rectF, c25911OooO0OO.f88456OooO0OO) != null;
            }
            if (z) {
                return Collections.EMPTY_LIST;
            }
            PDFView pDFView = c25936OooOoo0.f69108OooO00o;
            boolean z2 = pDFView.f69198Oooooo;
            return Collections.singletonList(new C25973o0000OOo(f3, f4, rectF, i, true, 0, pDFView.f69200OoooooO));
        }

        @Override // o0O0o00.AbstractC25969o00000Oo
        public final LinkedList OooO0o(float f, float f2, float f3, float f4) {
            float f5;
            float fOoooOo0;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            OooO00o oooO00o = this;
            float f12 = 0.0f;
            float f13 = -(f > 0.0f ? 0.0f : f);
            float f14 = -(f2 > 0.0f ? 0.0f : f2);
            float f15 = -(f3 > 0.0f ? 0.0f : f3);
            float f16 = -(f4 > 0.0f ? 0.0f : f4);
            C25936OooOoo0 c25936OooOoo0 = C25936OooOoo0.this;
            boolean z = c25936OooOoo0.f88574OooOOOO;
            float f17 = z ? f14 : f13;
            float f18 = z ? f16 : f15;
            PDFView pDFView = c25936OooOoo0.f69108OooO00o;
            int iOoooOOO = c25936OooOoo0.OoooOOO(f17, pDFView.getZoom());
            int iOoooOOO2 = c25936OooOoo0.OoooOOO(f18, pDFView.getZoom());
            int i = 1;
            int i2 = (iOoooOOO2 - iOoooOOO) + 1;
            LinkedList linkedList = new LinkedList();
            int i3 = iOoooOOO;
            while (i3 <= iOoooOOO2) {
                AbstractC25969o00000Oo.OooO0OO oooO0OO = new AbstractC25969o00000Oo.OooO0OO();
                oooO0OO.f88681OooO00o = i3;
                boolean z2 = c25936OooOoo0.f88574OooOOOO;
                if (i3 != iOoooOOO) {
                    f5 = f12;
                    if (i3 == iOoooOOO2) {
                        float fOoooOo02 = c25936OooOoo0.OoooOo0(i3, pDFView.getZoom());
                        if (z2) {
                            f9 = fOoooOo02;
                            fOoooOo02 = f13;
                        } else {
                            f9 = f14;
                        }
                        fOoooOo0 = fOoooOo02;
                        f8 = f16;
                        f7 = f9;
                    } else {
                        fOoooOo0 = c25936OooOoo0.OoooOo0(i3, pDFView.getZoom());
                        C26112OooO0oo c26112OooO0ooOooOo0o = pDFView.f69170OooOooO.OooOo0o(i3, pDFView.getZoom());
                        if (z2) {
                            float f19 = fOoooOo0 + c26112OooO0ooOooOo0o.f89150OooO0O0;
                            f7 = fOoooOo0;
                            fOoooOo0 = f13;
                            f8 = f19;
                        } else {
                            f6 = fOoooOo0 + c26112OooO0ooOooOo0o.f89149OooO00o;
                            f7 = f14;
                            f8 = f16;
                        }
                    }
                    f6 = f15;
                } else if (i2 == i) {
                    f5 = f12;
                    fOoooOo0 = f13;
                    f7 = f14;
                    f6 = f15;
                    f8 = f16;
                } else {
                    f5 = f12;
                    float fOoooOo03 = c25936OooOoo0.OoooOo0(i3, pDFView.getZoom());
                    C26112OooO0oo c26112OooO0ooOooOo0o2 = pDFView.f69170OooOooO.OooOo0o(i3, pDFView.getZoom());
                    if (z2) {
                        f11 = fOoooOo03 + c26112OooO0ooOooOo0o2.f89150OooO0O0;
                        f10 = f15;
                    } else {
                        f10 = fOoooOo03 + c26112OooO0ooOooOo0o2.f89149OooO00o;
                        f11 = f16;
                    }
                    fOoooOo0 = f13;
                    f7 = f14;
                    f8 = f11;
                    f6 = f10;
                }
                float f20 = f13;
                oooO00o.OooO0o0(oooO0OO.f88682OooO0O0, oooO0OO.f88681OooO00o);
                C26112OooO0oo c26112OooO0ooOooOo0o3 = pDFView.f69170OooOooO.OooOo0o(oooO0OO.f88681OooO00o, pDFView.getZoom());
                AbstractC25969o00000Oo.OooO00o oooO00o2 = oooO0OO.f88682OooO0O0;
                float f21 = c26112OooO0ooOooOo0o3.f89150OooO0O0 * oooO00o2.f88678OooO0O0;
                float f22 = c26112OooO0ooOooOo0o3.f89149OooO00o * oooO00o2.f88677OooO00o;
                float fOoooOoO = c25936OooOoo0.OoooOoO(i3, pDFView.getZoom());
                if (z2) {
                    oooO0OO.f88683OooO0OO.f88679OooO00o = C21289OooO0o.OooO0o0(Math.abs(f7 - c25936OooOoo0.OoooOo0(oooO0OO.f88681OooO00o, pDFView.getZoom())) / f21);
                    AbstractC25969o00000Oo.OooO0O0 oooO0O0 = oooO0OO.f88683OooO0OO;
                    float f23 = fOoooOo0 - fOoooOoO;
                    if (f23 < f5) {
                        f23 = f5;
                    }
                    oooO0O0.f88680OooO0O0 = C21289OooO0o.OooO0o0(f23 / f22);
                    oooO0OO.f88684OooO0Oo.f88679OooO00o = C21289OooO0o.OooO0O0(Math.abs(f8 - c25936OooOoo0.OoooOo0(oooO0OO.f88681OooO00o, pDFView.getZoom())) / f21);
                    AbstractC25969o00000Oo.OooO0O0 oooO0O02 = oooO0OO.f88684OooO0Oo;
                    float f24 = f6 - fOoooOoO;
                    if (f24 < f5) {
                        f24 = f5;
                    }
                    oooO0O02.f88680OooO0O0 = C21289OooO0o.OooO0o0(f24 / f22);
                } else {
                    oooO0OO.f88683OooO0OO.f88680OooO0O0 = C21289OooO0o.OooO0o0(Math.abs(fOoooOo0 - c25936OooOoo0.OoooOo0(oooO0OO.f88681OooO00o, pDFView.getZoom())) / f22);
                    AbstractC25969o00000Oo.OooO0O0 oooO0O03 = oooO0OO.f88683OooO0OO;
                    float f25 = f7 - fOoooOoO;
                    if (f25 < f5) {
                        f25 = f5;
                    }
                    oooO0O03.f88679OooO00o = C21289OooO0o.OooO0o0(f25 / f21);
                    oooO0OO.f88684OooO0Oo.f88680OooO0O0 = C21289OooO0o.OooO0o0(Math.abs(f6 - c25936OooOoo0.OoooOo0(oooO0OO.f88681OooO00o, pDFView.getZoom())) / f22);
                    AbstractC25969o00000Oo.OooO0O0 oooO0O04 = oooO0OO.f88684OooO0Oo;
                    float f26 = f8 - fOoooOoO;
                    if (f26 < f5) {
                        f26 = f5;
                    }
                    oooO0O04.f88679OooO00o = C21289OooO0o.OooO0o0(f26 / f21);
                }
                linkedList.add(oooO0OO);
                i3++;
                oooO00o = this;
                f12 = f5;
                f13 = f20;
                i = 1;
            }
            return linkedList;
        }
    }

    public C25936OooOoo0(PDFView pDFView, C26395Oooo0o0 c26395Oooo0o0, EnumC26107OooO0OO enumC26107OooO0OO, C26111OooO0oO c26111OooO0oO, boolean z, int i, boolean z2, boolean z3) {
        super(pDFView, c26395Oooo0o0);
        this.f88572OooOOO = new ArrayList();
        this.f88576OooOOo = 0.0f;
        this.f88578OooOOoo = -1;
        this.f88574OooOOOO = z;
        this.f88575OooOOOo = enumC26107OooO0OO;
        this.f88573OooOOO0 = i;
        this.f88571OooOO0o = z2;
        this.f88577OooOOo0 = z3;
        this.f69110OooO0OO = new OooO00o(this.f69108OooO00o);
        C26395Oooo0o0 c26395Oooo0o02 = this.f69109OooO0O0;
        this.f69111OooO0Oo = c26395Oooo0o02.f90560OooOO0.size();
        for (int i2 = 0; i2 < this.f69111OooO0Oo; i2++) {
            int iOooO0oo = OooO0oo(i2);
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
        }
        Oooo0O0(c26111OooO0oO);
        C26112OooO0oo c26112OooO0ooOooOOo0 = OooOOo0(0);
        c26395Oooo0o02.f90575OooOoO = OooOO0O(0).f89149OooO00o / c26112OooO0ooOooOOo0.f89149OooO00o;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void OooO(float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        PDFView pDFView = this.f69108OooO00o;
        int currentXOffset = (int) pDFView.getCurrentXOffset();
        int currentYOffset = (int) pDFView.getCurrentYOffset();
        int width = pDFView.getWidth();
        int height = pDFView.getHeight();
        float zoom = pDFView.getZoom();
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        if (pDFView.f69254o000OOo0) {
            float f7 = width;
            f5 = f7 * 0.8f;
            f3 = (f7 * 0.2f) + (-OooOo0O(zoom));
            float f8 = height;
            f6 = 0.8f * f8;
            f4 = (f8 * 0.2f) + (-OooOo0(zoom));
        } else {
            if (this.f88574OooOOOO) {
                f3 = -((abstractC22830OooO0Oo.OooOO0().f89149OooO00o * pDFView.f69176Oooo00o) - pDFView.getWidth());
                f4 = -((this.f88576OooOOo * pDFView.getZoom()) - pDFView.getHeight());
            } else {
                f3 = -((this.f88576OooOOo * pDFView.getZoom()) - pDFView.getWidth());
                f4 = -((abstractC22830OooO0Oo.OooOO0().f89150OooO0O0 * pDFView.f69176Oooo00o) - pDFView.getHeight());
            }
            f5 = 0.0f;
            f6 = 0.0f;
        }
        pDFView.f69167OooOoOO.OooO0OO(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f3, (int) f5, (int) f4, (int) f6);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void OooO0O0(float f, float f2) {
        float f3;
        float height;
        float f4;
        PDFView pDFView = this.f69108OooO00o;
        int currentXOffset = (int) pDFView.getCurrentXOffset();
        int currentYOffset = (int) pDFView.getCurrentYOffset();
        int width = pDFView.getWidth();
        int height2 = pDFView.getHeight();
        float zoom = pDFView.getZoom();
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        float f5 = -OoooOo0(pDFView.getCurrentPage(), pDFView.getZoom());
        float fOoooOOo = f5 - OoooOOo(pDFView.getCurrentPage(), pDFView.getZoom());
        float f6 = 0.0f;
        if (this.f88574OooOOOO) {
            if (pDFView.f69254o000OOo0) {
                float f7 = width;
                f6 = f7 * 0.8f;
                f4 = (f7 * 0.2f) + (-OooOo0O(zoom));
            } else {
                f4 = -((abstractC22830OooO0Oo.OooOO0().f89149OooO00o * pDFView.f69176Oooo00o) - pDFView.getWidth());
            }
            height = fOoooOOo + pDFView.getHeight();
            float f8 = f6;
            f6 = f5;
            f5 = f8;
        } else {
            if (pDFView.f69254o000OOo0) {
                float f9 = height2;
                f6 = f9 * 0.8f;
                f3 = (f9 * 0.2f) + (-OooOo0(zoom));
            } else {
                f3 = -((abstractC22830OooO0Oo.OooOO0().f89150OooO0O0 * pDFView.f69176Oooo00o) - pDFView.getHeight());
            }
            float width2 = pDFView.getWidth() + fOoooOOo;
            height = f3;
            f4 = width2;
        }
        pDFView.f69167OooOoOO.OooO0OO(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f4, (int) f5, (int) height, (int) f6);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final boolean OooO0Oo(int i) {
        PDFView pDFView = this.f69108OooO00o;
        float zoom = pDFView.getZoom();
        if (this.f88574OooOOOO) {
            if (i < 0 && pDFView.getCurrentXOffset() < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (zoom * OooOO0().f89149OooO00o) + pDFView.getCurrentXOffset() > ((float) pDFView.getWidth());
            }
            return false;
        }
        if (i < 0 && pDFView.getCurrentXOffset() < 0.0f) {
            return true;
        }
        if (i > 0) {
            return (this.f88576OooOOo * zoom) + pDFView.getCurrentXOffset() > ((float) pDFView.getWidth());
        }
        return false;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final Pair<Float, Float> OooO0o(float f, float f2) {
        boolean z = this.f88574OooOOOO;
        PDFView pDFView = this.f69108OooO00o;
        if (!z) {
            return new Pair<>(Float.valueOf(((this.f88576OooOOo * f2) - pDFView.getWidth()) * (-f)), Float.valueOf(pDFView.getCurrentYOffset()));
        }
        return new Pair<>(Float.valueOf(pDFView.getCurrentXOffset()), Float.valueOf(((this.f88576OooOOo * f2) - pDFView.getHeight()) * (-f)));
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final boolean OooO0o0(int i) {
        PDFView pDFView = this.f69108OooO00o;
        float zoom = pDFView.getZoom();
        if (this.f88574OooOOOO) {
            if (i < 0 && pDFView.getCurrentYOffset() < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (this.f88576OooOOo * zoom) + pDFView.getCurrentYOffset() > ((float) pDFView.getHeight());
            }
            return false;
        }
        if (i < 0 && pDFView.getCurrentYOffset() < 0.0f) {
            return true;
        }
        if (i > 0) {
            return (zoom * OooOO0().f89150OooO0O0) + pDFView.getCurrentYOffset() > ((float) pDFView.getHeight());
        }
        return false;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final boolean OooO0oO() {
        boolean z = this.f88574OooOOOO;
        PDFView pDFView = this.f69108OooO00o;
        return z ? OooOo0(1.0f) < ((float) pDFView.getHeight()) : OooOo0O(1.0f) < ((float) pDFView.getWidth());
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final C26112OooO0oo OooOO0() {
        return this.f88574OooOOOO ? this.f69116OooOO0 : this.f69107OooO;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final int OooOO0o(float f, PointF pointF) {
        PDFView pDFView = this.f69108OooO00o;
        return this.f88574OooOOOO ? OoooOOO((-pDFView.getCurrentYOffset()) + pointF.y, f) : OoooOOO((-pDFView.getCurrentXOffset()) + pointF.x, f);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final Pair<Float, Float> OooOOO0(int i) {
        float f;
        float fOoooOo0;
        float zoom = this.f69108OooO00o.getZoom();
        if (this.f88574OooOOOO) {
            f = ((OooOO0().f89149OooO00o - OooOOo0(i).f89149OooO00o) * zoom) / 2.0f;
            fOoooOo0 = OoooOo0(i, zoom);
        } else {
            float f2 = OooOO0().f89150OooO0O0;
            C26112OooO0oo c26112OooO0ooOooOOo0 = OooOOo0(i);
            float fOoooOo02 = OoooOo0(i, zoom);
            float f3 = ((f2 - c26112OooO0ooOooOOo0.f89150OooO0O0) * zoom) / 2.0f;
            f = fOoooOo02;
            fOoooOo0 = f3;
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(fOoooOo0));
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final RectF OooOOOO(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        PDFView pDFView = this.f69108OooO00o;
        int width = pDFView.getWidth();
        int height = pDFView.getHeight();
        if (pDFView.f69254o000OOo0) {
            float f8 = width;
            f5 = f8 * 0.8f;
            f7 = (f8 * 0.2f) + (-OooOo0O(f));
            float f9 = height;
            f4 = 0.8f * f9;
            f6 = (f9 * 0.2f) + (-OooOo0(f));
        } else if (this.f88574OooOOOO) {
            float f10 = OooOO0().f89149OooO00o * f;
            if (f10 < pDFView.getWidth()) {
                f7 = (width / 2.0f) - (f10 / 2.0f);
                f5 = f7;
            } else {
                f7 = width - f10;
                f5 = 0.0f;
            }
            float f11 = this.f88576OooOOo * f;
            float f12 = height;
            if (f11 < f12) {
                f4 = (f12 - f11) / 2.0f;
                f6 = f4;
            } else {
                f6 = f12 - f11;
                f4 = 0.0f;
            }
        } else {
            float f13 = OooOO0().f89150OooO0O0 * f;
            float f14 = height;
            if (f13 < f14) {
                f3 = (f14 / 2.0f) - (f13 / 2.0f);
                f2 = f3;
            } else {
                f2 = f14 - f13;
                f3 = 0.0f;
            }
            float f15 = this.f88576OooOOo * f;
            float f16 = width;
            if (f15 < f16) {
                f5 = (f16 - f15) / 2.0f;
                f4 = f3;
                f6 = f2;
                f7 = f5;
            } else {
                float f17 = f16 - f15;
                f4 = f3;
                f5 = 0.0f;
                f6 = f2;
                f7 = f17;
            }
        }
        return new RectF(f7, f6, f5, f4);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final Pair<Integer, Integer> OooOOOo(RectF rectF) {
        int iOoooOOO;
        int iOoooOOO2;
        PDFView pDFView = this.f69108OooO00o;
        float f = (-pDFView.getCurrentYOffset()) + rectF.top;
        float f2 = (-pDFView.getCurrentYOffset()) + rectF.bottom;
        float f3 = (-pDFView.getCurrentXOffset()) + rectF.left;
        float f4 = (-pDFView.getCurrentXOffset()) + rectF.right;
        if (this.f88574OooOOOO) {
            iOoooOOO = OoooOOO(f, pDFView.getZoom());
            iOoooOOO2 = OoooOOO(f2, pDFView.getZoom());
        } else {
            iOoooOOO = OoooOOO(f3, pDFView.getZoom());
            iOoooOOO2 = OoooOOO(f4, pDFView.getZoom());
        }
        return new Pair<>(Integer.valueOf(iOoooOOO), Integer.valueOf(iOoooOOO2));
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final RectF OooOOo(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        PDFView pDFView = this.f69108OooO00o;
        float fOooOo0O = pDFView.OooOo0O(2, i);
        if (Float.isNaN(fOooOo0O)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("LinearNoteFile");
            c20358OooO00o.OooO0OO("page=%d  zoomToPage=NaN  (page未渲染)", Integer.valueOf(i));
            return null;
        }
        float currentXOffset = pDFView.getCurrentXOffset();
        float currentYOffset = pDFView.getCurrentYOffset();
        float fOoooOo0 = OoooOo0(i, pDFView.getZoom());
        float fOoooOoO = OoooOoO(i, pDFView.getZoom());
        float f5 = -currentXOffset;
        float f6 = -currentYOffset;
        float width = pDFView.getWidth();
        float height = pDFView.getHeight();
        if (this.f88574OooOOOO) {
            f = (f5 - fOoooOoO) * fOooOo0O;
            f2 = (f6 - fOoooOo0) * fOooOo0O;
            f3 = ((f5 + width) - fOoooOoO) * fOooOo0O;
            f4 = (f6 + height) - fOoooOo0;
        } else {
            f = (f5 - fOoooOo0) * fOooOo0O;
            f2 = (f6 - fOoooOoO) * fOooOo0O;
            f3 = ((f5 + width) - fOoooOo0) * fOooOo0O;
            f4 = (f6 + height) - fOoooOoO;
        }
        return new RectF(f, f2, f3, f4 * fOooOo0O);
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final Pair<Float, Float> OooOOoo(int i) {
        float f;
        float fOoooOo0;
        float zoom = this.f69108OooO00o.getZoom();
        if (this.f88574OooOOOO) {
            f = ((OooOO0().f89149OooO00o - OooOOo0(i).f89149OooO00o) * zoom) / 2.0f;
            fOoooOo0 = OoooOo0(i, zoom);
        } else {
            float f2 = OooOO0().f89150OooO0O0;
            C26112OooO0oo c26112OooO0ooOooOOo0 = OooOOo0(i);
            float fOoooOo02 = OoooOo0(i, zoom);
            float f3 = ((f2 - c26112OooO0ooOooOOo0.f89150OooO0O0) * zoom) / 2.0f;
            f = fOoooOo02;
            fOoooOo0 = f3;
        }
        return new Pair<>(Float.valueOf(f), Float.valueOf(fOoooOo0));
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final Pair<Integer, Integer> OooOo() {
        PDFView pDFView = this.f69108OooO00o;
        float currentXOffset = pDFView.getCurrentXOffset();
        if (currentXOffset > 0.0f) {
            currentXOffset = 0.0f;
        }
        float f = -currentXOffset;
        float currentYOffset = pDFView.getCurrentYOffset();
        if (currentYOffset > 0.0f) {
            currentYOffset = 0.0f;
        }
        float fOooO0O0 = C20857Oooooo.OooO0O0(pDFView.getContext(), 20);
        float f2 = -f;
        float f3 = f2 + fOooO0O0;
        float width = (f2 - pDFView.getWidth()) - fOooO0O0;
        float f4 = -(-currentYOffset);
        float f5 = f4 + fOooO0O0;
        float height = (f4 - pDFView.getHeight()) - fOooO0O0;
        if (f3 > 0.0f) {
            f3 = 0.0f;
        }
        float f6 = -f3;
        if (f5 > 0.0f) {
            f5 = 0.0f;
        }
        float f7 = -f5;
        if (width > 0.0f) {
            width = 0.0f;
        }
        float f8 = -width;
        float f9 = -(height <= 0.0f ? height : 0.0f);
        boolean z = this.f88574OooOOOO;
        if (z) {
            f6 = f7;
        }
        if (z) {
            f8 = f9;
        }
        return new Pair<>(Integer.valueOf(OoooOOO(f6, pDFView.getZoom())), Integer.valueOf(OoooOOO(f8, pDFView.getZoom())));
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final float OooOo0(float f) {
        return this.f88574OooOOOO ? this.f88576OooOOo * f : f * OooOO0().f89150OooO0O0;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final float OooOo0O(float f) {
        return this.f88574OooOOOO ? f * OooOO0().f89149OooO00o : this.f88576OooOOo * f;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final List<PagePart> OooOoO(final int i) {
        return (List) this.f69108OooO00o.f69165OooOoO.OooO().stream().filter(new Predicate() { // from class: o0O0o00.OooOoO
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((PagePart) obj).f69347OooO0O0 == i;
            }
        }).collect(Collectors.toList());
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final float OooOoO0(float f) {
        float f2;
        float f3;
        int width;
        boolean z = this.f88574OooOOOO;
        PDFView pDFView = this.f69108OooO00o;
        if (z) {
            f2 = -pDFView.getCurrentYOffset();
            f3 = this.f88576OooOOo * f;
            width = pDFView.getHeight();
        } else {
            f2 = -pDFView.getCurrentXOffset();
            f3 = this.f88576OooOOo * f;
            width = pDFView.getWidth();
        }
        float f4 = f2 / (f3 - width);
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        return f4;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final List OooOoOO(RectF rectF, final int i) {
        return (List) this.f69108OooO00o.f69165OooOoO.OooO().stream().filter(new Predicate() { // from class: o0O0o00.OooOoOO
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((PagePart) obj).f69347OooO0O0 == i;
            }
        }).collect(Collectors.toList());
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void OooOoo0() {
        synchronized (f88570OooOo00) {
            try {
                C26395Oooo0o0 c26395Oooo0o0 = this.f69109OooO0O0;
                if (c26395Oooo0o0 != null) {
                    c26395Oooo0o0.OooOoo();
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
        if (iOooO0oo < 0) {
            return false;
        }
        try {
            return this.f69109OooO0O0.Oooo000(iOooO0oo, z).booleanValue();
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("LinearNoteFile");
            c20358OooO00o.OooO0Oo(e, "LinearNoteFile open page err.", new Object[0]);
            throw new o0O0o00O.OooO00o(e);
        }
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final boolean OooOooo(int i) {
        PDFView pDFView = this.f69108OooO00o;
        float currentXOffset = pDFView.getCurrentXOffset();
        float currentYOffset = pDFView.getCurrentYOffset();
        float zoom = pDFView.getZoom();
        float f = -OoooOo0(i, zoom);
        float fOoooOOo = f - OoooOOo(i, zoom);
        return this.f88574OooOOOO ? f > currentYOffset && fOoooOOo < currentYOffset - ((float) pDFView.getHeight()) : f > currentXOffset && fOoooOOo < currentXOffset - ((float) pDFView.getWidth());
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void Oooo(int i, Point point, boolean z, boolean z2) {
        float width;
        float height;
        PDFView pDFView = this.f69108OooO00o;
        float fOooOo0O = pDFView.OooOo0O(1, i);
        float f = 1.0f / fOooOo0O;
        C26112OooO0oo c26112OooO0ooOooOo0o = OooOo0o(i, pDFView.getZoom());
        PointF pointF = z ? new PointF(point.x - ((pDFView.getWidth() / 2.0f) * f), point.y - ((pDFView.getHeight() / 2.0f) * f)) : new PointF(point);
        float f2 = pointF.x * fOooOo0O;
        float f3 = pointF.y * fOooOo0O;
        float f4 = i == 0 ? 0.0f : -OoooOo0(i, pDFView.getZoom());
        float fOoooOoO = OoooOoO(i, pDFView.getZoom());
        boolean z3 = this.f88574OooOOOO;
        if (z2) {
            if (z3) {
                float f5 = c26112OooO0ooOooOo0o.f89149OooO00o;
                width = z ? (pDFView.getWidth() - f5) / 2.0f : ((pDFView.getWidth() - f5) / 2.0f) - f2;
                height = f4 - f3;
            } else {
                float f6 = c26112OooO0ooOooOo0o.f89150OooO0O0;
                width = f4 - f2;
                height = z ? (pDFView.getHeight() - f6) / 2.0f : ((pDFView.getHeight() - f6) / 2.0f) - f3;
            }
        } else if (z3) {
            width = (-f2) - fOoooOoO;
            height = f4 - f3;
        } else {
            width = f4 - f2;
            height = (-f3) - fOoooOoO;
        }
        PointF pointF2 = new PointF(width, height);
        this.f69108OooO00o.Oooo(pointF2.x, pointF2.y, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x006b  */
    @Override // com.orion.editor.AbstractC22830OooO0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo000(float f, float f2) {
        int iO000oOoO;
        int i;
        int iMax;
        if (this.f69111OooO0Oo <= 1) {
            return;
        }
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        boolean z = this.f88574OooOOOO;
        if (z) {
            if (fAbs2 <= fAbs) {
                return;
            }
        } else if (fAbs <= fAbs2) {
            return;
        }
        int i2 = -1;
        if (!z ? f <= 0.0f : f2 <= 0.0f) {
            i2 = 1;
        }
        PDFView pDFView = this.f69108OooO00o;
        boolean z2 = false;
        if (pDFView.f69254o000OOo0) {
            Pair<Float, Float> pairOooOOO = OooOOO(this.f88578OooOOoo);
            float fFloatValue = (z ? pairOooOOO.second : pairOooOOO.first).floatValue();
            iMax = this.f88578OooOOoo;
            boolean z3 = iMax == 0 && fFloatValue < 0.0f;
            if (i2 <= 0 || !z3) {
                boolean z4 = iMax == pDFView.getPageCount() - 1 && fFloatValue > 0.0f;
                if (i2 >= 0 || !z4) {
                    if (i2 > 0) {
                        iO000oOoO = this.f88578OooOOoo;
                    } else {
                        iO000oOoO = o000oOoO(true);
                        int i3 = this.f88578OooOOoo;
                        if (iO000oOoO == i3) {
                            i = i3 + i2;
                        }
                        iMax = Math.max(0, Math.min(pDFView.getPageCount() - 1, i));
                    }
                    i = iO000oOoO + i2;
                    iMax = Math.max(0, Math.min(pDFView.getPageCount() - 1, i));
                } else {
                    iMax = this.f88578OooOOoo;
                }
            }
        }
        if (pDFView.f69254o000OOo0) {
            float fOoooOo0 = OoooOo0(iMax, pDFView.getZoom());
            int i4 = this.f88578OooOOoo;
            boolean z5 = i4 == 0 && fOoooOo0 < 0.0f;
            if (i2 < 0 && z5) {
                return;
            }
            if (i4 == this.f69111OooO0Oo - 1 && fOoooOo0 > 0.0f) {
                z2 = true;
            }
            if (i2 > 0 && z2) {
                return;
            }
        }
        float fOoooO = OoooO(iMax, OoooOO0(iMax));
        C25909OooO00o c25909OooO00o = pDFView.f69167OooOoOO;
        float f3 = -fOoooO;
        PDFView pDFView2 = c25909OooO00o.f88443OooO00o;
        if (z) {
            c25909OooO00o.OooO0o0(pDFView2.getCurrentYOffset(), f3);
        } else {
            c25909OooO00o.OooO0Oo(pDFView2.getCurrentXOffset(), f3);
        }
        c25909OooO00o.f88448OooO0o0 = true;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final boolean Oooo00O(RectF rectF, int i) {
        int iOooO0oo;
        C26395Oooo0o0 c26395Oooo0o0 = this.f69109OooO0O0;
        if (c26395Oooo0o0 != null && (iOooO0oo = OooO0oo(i)) >= 0) {
            return Boolean.FALSE.equals(Boolean.valueOf(c26395Oooo0o0.f90577OooOoOO.contains(Integer.valueOf(iOooO0oo))));
        }
        return true;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void Oooo00o() {
        int i;
        PDFView pDFView = this.f69108OooO00o;
        if (!pDFView.f69270o000oOoO || this.f69111OooO0Oo == 0) {
            return;
        }
        float currentXOffset = pDFView.getCurrentXOffset();
        float currentYOffset = pDFView.getCurrentYOffset();
        float zoom = pDFView.getZoom();
        int iOoooOOO = 0;
        boolean z = this.f88574OooOOOO;
        if (z) {
            float height = pDFView.getHeight();
            if (currentYOffset <= -1.0f) {
                if (currentYOffset < (-(this.f88576OooOOo * zoom)) + height + 1.0f) {
                    i = this.f69111OooO0Oo;
                    iOoooOOO = i - 1;
                } else {
                    iOoooOOO = OoooOOO(-(currentYOffset - (height / 2.0f)), pDFView.getZoom());
                }
            }
        } else {
            float width = pDFView.getWidth();
            if (currentXOffset <= -1.0f) {
                if (currentXOffset < (-(this.f88576OooOOo * zoom)) + width + 1.0f) {
                    i = this.f69111OooO0Oo;
                    iOoooOOO = i - 1;
                } else {
                    iOoooOOO = OoooOOO(-(currentXOffset - (width / 2.0f)), pDFView.getZoom());
                }
            }
        }
        EnumC26104OooO enumC26104OooOOoooOO0 = OoooOO0(iOoooOOO);
        if (enumC26104OooOOoooOO0 == EnumC26104OooO.f89122OooOoO) {
            return;
        }
        float fOoooO = OoooO(iOoooOOO, enumC26104OooOOoooOO0);
        if (z) {
            pDFView.f69167OooOoOO.OooO0o0(currentYOffset, -fOoooO);
        } else {
            pDFView.f69167OooOoOO.OooO0Oo(currentXOffset, -fOoooO);
        }
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void Oooo0O0(C26111OooO0oO c26111OooO0oO) {
        synchronized (this) {
            try {
                this.f69112OooO0o.clear();
                EnumC26107OooO0OO enumC26107OooO0OO = this.f88575OooOOOo;
                C26111OooO0oO c26111OooO0oO2 = this.f69114OooO0oO;
                C26111OooO0oO c26111OooO0oO3 = new C26111OooO0oO(c26111OooO0oO2.f89147OooO00o, c26111OooO0oO2.f89148OooO0O0);
                C26111OooO0oO c26111OooO0oO4 = this.f69115OooO0oo;
                C26109OooO0o c26109OooO0o = new C26109OooO0o(enumC26107OooO0OO, c26111OooO0oO3, new C26111OooO0oO(c26111OooO0oO4.f89147OooO00o, c26111OooO0oO4.f89148OooO0O0), c26111OooO0oO, this.f88577OooOOo0);
                this.f69116OooOO0 = c26109OooO0o.f89136OooO0OO;
                this.f69107OooO = c26109OooO0o.f89137OooO0Oo;
                int i = this.f69111OooO0Oo;
                for (int i2 = 0; i2 < i; i2++) {
                    C26112OooO0oo c26112OooO0ooOooOO0O = OooOO0O(i2);
                    this.f69112OooO0o.add(c26109OooO0o.OooO00o(new C26111OooO0oO((int) c26112OooO0ooOooOO0O.f89149OooO00o, (int) c26112OooO0ooOooOO0O.f89150OooO0O0)));
                }
                if (this.f88571OooOO0o) {
                    OoooOoo(c26111OooO0oO);
                }
                Ooooo00();
                Ooooo0o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final float OoooO(int i, EnumC26104OooO enumC26104OooO) {
        PDFView pDFView = this.f69108OooO00o;
        float zoom = pDFView.getZoom();
        float fOoooOo0 = OoooOo0(i, zoom);
        float height = this.f88574OooOOOO ? pDFView.getHeight() : pDFView.getWidth();
        float fOoooOOo = OoooOOo(i, zoom);
        if (enumC26104OooO == EnumC26104OooO.f89120OooOo) {
            return (fOoooOOo / 2.0f) + (fOoooOo0 - (height / 2.0f));
        }
        return enumC26104OooO == EnumC26104OooO.f89123OooOoO0 ? (fOoooOo0 - height) + fOoooOOo : fOoooOo0;
    }

    @Override // com.orion.editor.AbstractC22830OooO0Oo
    public final void OoooO0O() {
        this.f88578OooOOoo = o000oOoO(false);
    }

    public final EnumC26104OooO OoooOO0(int i) {
        PDFView pDFView = this.f69108OooO00o;
        boolean z = pDFView.f69270o000oOoO;
        EnumC26104OooO enumC26104OooO = EnumC26104OooO.f89122OooOoO;
        if (z && i >= 0) {
            float zoom = pDFView.getZoom();
            boolean z2 = this.f88574OooOOOO;
            float currentYOffset = z2 ? pDFView.getCurrentYOffset() : pDFView.getCurrentXOffset();
            float f = -OoooOo0(i, zoom);
            int height = z2 ? pDFView.getHeight() : pDFView.getWidth();
            float fOoooOOo = OoooOOo(i, zoom);
            float f2 = height;
            if (f2 >= fOoooOOo) {
                return EnumC26104OooO.f89120OooOo;
            }
            if (currentYOffset >= f) {
                return EnumC26104OooO.f89121OooOo0o;
            }
            if (f - fOoooOOo > currentYOffset - f2) {
                return EnumC26104OooO.f89123OooOoO0;
            }
        }
        return enumC26104OooO;
    }

    public final int OoooOOO(float f, float f2) {
        int i;
        synchronized (this) {
            int size = this.f69117OooOO0O.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                if (C20424OooO0Oo.OooO0O0(this.f88571OooOO0o ? ((Float) this.f88572OooOOO.get(i3)).floatValue() : this.f88573OooOOO0, f2, 2.0f, ((Float) this.f69117OooOO0O.get(i3)).floatValue() * f2) >= f) {
                    break;
                }
                i2++;
            }
            int i4 = i2 - 1;
            i = i4 >= 0 ? i4 : 0;
        }
        return i;
    }

    public final float OoooOOo(int i, float f) {
        C26112OooO0oo c26112OooO0ooOooOOo0 = OooOOo0(i);
        return (this.f88574OooOOOO ? c26112OooO0ooOooOOo0.f89150OooO0O0 : c26112OooO0ooOooOOo0.f89149OooO00o) * f;
    }

    public final float OoooOo0(int i, float f) {
        float fFloatValue;
        if (OooO0oo(i) < 0) {
            return 0.0f;
        }
        synchronized (this) {
            fFloatValue = ((Float) this.f69117OooOO0O.get(i)).floatValue() * f;
        }
        return fFloatValue;
    }

    public final float OoooOoO(int i, float f) {
        float f2;
        float f3;
        C26112OooO0oo c26112OooO0ooOooOOo0 = OooOOo0(i);
        if (this.f88574OooOOOO) {
            f2 = OooOO0().f89149OooO00o;
            f3 = c26112OooO0ooOooOOo0.f89149OooO00o;
        } else {
            f2 = OooOO0().f89150OooO0O0;
            f3 = c26112OooO0ooOooOOo0.f89150OooO0O0;
        }
        return ((f2 - f3) * f) / 2.0f;
    }

    public final void OoooOoo(C26111OooO0oO c26111OooO0oO) {
        float f;
        float f2;
        ArrayList arrayList = this.f88572OooOOO;
        arrayList.clear();
        for (int i = 0; i < this.f69111OooO0Oo; i++) {
            C26112OooO0oo c26112OooO0oo = (C26112OooO0oo) this.f69112OooO0o.get(i);
            if (this.f88574OooOOOO) {
                f = c26111OooO0oO.f89148OooO0O0;
                f2 = c26112OooO0oo.f89150OooO0O0;
            } else {
                f = c26111OooO0oO.f89147OooO00o;
                f2 = c26112OooO0oo.f89149OooO00o;
            }
            float fMax = Math.max(0.0f, f - f2);
            if (i < this.f69111OooO0Oo - 1) {
                fMax += this.f88573OooOOO0;
            }
            arrayList.add(Float.valueOf(fMax));
        }
    }

    public final void Ooooo00() {
        float fFloatValue = 0.0f;
        for (int i = 0; i < this.f69111OooO0Oo; i++) {
            C26112OooO0oo c26112OooO0oo = (C26112OooO0oo) this.f69112OooO0o.get(i);
            fFloatValue += this.f88574OooOOOO ? c26112OooO0oo.f89150OooO0O0 : c26112OooO0oo.f89149OooO00o;
            if (this.f88571OooOO0o) {
                fFloatValue = ((Float) this.f88572OooOOO.get(i)).floatValue() + fFloatValue;
            } else if (i < this.f69111OooO0Oo - 1) {
                fFloatValue += this.f88573OooOOO0;
            }
        }
        this.f88576OooOOo = fFloatValue;
    }

    public final void Ooooo0o() {
        ArrayList arrayList = this.f69117OooOO0O;
        arrayList.clear();
        float fFloatValue = 0.0f;
        for (int i = 0; i < this.f69111OooO0Oo; i++) {
            C26112OooO0oo c26112OooO0oo = (C26112OooO0oo) this.f69112OooO0o.get(i);
            float f = this.f88574OooOOOO ? c26112OooO0oo.f89150OooO0O0 : c26112OooO0oo.f89149OooO00o;
            boolean z = this.f88571OooOO0o;
            int i2 = this.f88573OooOOO0;
            if (z) {
                ArrayList arrayList2 = this.f88572OooOOO;
                float fFloatValue2 = (((Float) arrayList2.get(i)).floatValue() / 2.0f) + fFloatValue;
                if (i == 0) {
                    fFloatValue2 -= i2 / 2.0f;
                } else if (i == this.f69111OooO0Oo - 1) {
                    fFloatValue2 += i2 / 2.0f;
                }
                arrayList.add(Float.valueOf(fFloatValue2));
                fFloatValue = (((Float) arrayList2.get(i)).floatValue() / 2.0f) + f + fFloatValue2;
            } else {
                arrayList.add(Float.valueOf(fFloatValue));
                fFloatValue = f + i2 + fFloatValue;
            }
        }
    }

    public final int o000oOoO(boolean z) {
        Pair<Integer, Integer> pairOooOo = OooOo();
        PDFView pDFView = this.f69108OooO00o;
        float zoom = pDFView.getZoom();
        if (this.f88574OooOOOO) {
            for (int iIntValue = pairOooOo.first.intValue(); iIntValue <= pairOooOo.second.intValue(); iIntValue++) {
                float fOoooOo0 = OoooOo0(iIntValue, zoom);
                float f = -pDFView.getCurrentYOffset();
                boolean z2 = fOoooOo0 > f;
                boolean z3 = OoooOOo(pairOooOo.first.intValue(), zoom) + fOoooOo0 > f;
                if (z) {
                    if (z2) {
                        return iIntValue;
                    }
                } else {
                    if (z3 || z2) {
                        return iIntValue;
                    }
                }
            }
        } else {
            for (int iIntValue2 = pairOooOo.first.intValue(); iIntValue2 <= pairOooOo.second.intValue(); iIntValue2++) {
                float fOoooOo02 = OoooOo0(iIntValue2, zoom);
                float f2 = -pDFView.getCurrentXOffset();
                boolean z4 = fOoooOo02 > f2;
                boolean z5 = OoooOOo(pairOooOo.first.intValue(), zoom) + fOoooOo02 > f2;
                if (z) {
                    if (z4) {
                        return iIntValue2;
                    }
                } else {
                    if (z5 || z4) {
                        return iIntValue2;
                    }
                }
            }
        }
        return pairOooOo.first.intValue();
    }
}
