package oo0o0Oo;

import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import android.graphics.RectF;
import android.text.Layout;
import java.text.BreakIterator;
import java.util.ArrayList;
import o00000o0.EnumC24118OooO0oO;
import o0000Ooo.C24237OooOO0o;
import o000OOo.C24506OooO00o;
import o000OOo.C24507OooO0O0;
import o00o00O0.C25252OooO0Oo;
import o00o00Oo.C25256OooO00o;
import o0O0O00.C25869Oooo00O;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oo0o0Oo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34695OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34693OooOOOo f124972OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34682OooO0Oo f124973OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f124974OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f124975OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f124976OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f124977OooO0o0;

    public C34695OooOOo0(C34693OooOOOo c34693OooOOOo, C34682OooO0Oo c34682OooO0Oo, long j) {
        this.f124972OooO00o = c34693OooOOOo;
        this.f124973OooO0O0 = c34682OooO0Oo;
        this.f124974OooO0OO = j;
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        float fOooO0OO = 0.0f;
        this.f124975OooO0Oo = arrayList.isEmpty() ? 0.0f : ((C34683OooO0o) arrayList.get(0)).f124911OooO00o.f124881OooO0Oo.OooO0OO(0);
        if (!arrayList.isEmpty()) {
            C34683OooO0o c34683OooO0o = (C34683OooO0o) OooOo.OoooOOo(arrayList);
            fOooO0OO = c34683OooO0o.f124911OooO00o.f124881OooO0Oo.OooO0OO(r4.f88260OooO0o0 - 1) + c34683OooO0o.f124915OooO0o;
        }
        this.f124977OooO0o0 = fOooO0OO;
        this.f124976OooO0o = c34682OooO0Oo.f124909OooO0oO;
    }

    public final float OooO(int i) {
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        c34682OooO0Oo.OooO0Oo(i);
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(C25252OooO0Oo.OooOOOo(i, arrayList));
        C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
        return c34679OooO00o.f124881OooO0Oo.OooO0o0(i - c34683OooO0o.f124914OooO0Oo) + c34683OooO0o.f124915OooO0o;
    }

    public final EnumC24118OooO0oO OooO00o(int i) {
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        c34682OooO0Oo.OooO0OO(i);
        int length = c34682OooO0Oo.f124903OooO00o.f124918OooO00o.f124887OooOo0o.length();
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i == length ? C34429OooOOo0.OooOO0O(arrayList) : C25252OooO0Oo.OooOOOO(i, arrayList));
        return c34683OooO0o.f124911OooO00o.OooO0O0(c34683OooO0o.OooO00o(i));
    }

    public final C21291OooO0oO OooO0O0(int i) {
        float fOooO0oO;
        float fOooO0oO2;
        float fOooO0o;
        float fOooO0o2;
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        C34680OooO0O0 c34680OooO0O0 = c34682OooO0Oo.f124903OooO00o.f124918OooO00o;
        if (i < 0 || i >= c34680OooO0O0.f124887OooOo0o.length()) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "offset(", ") is out of bounds [0, ");
            sbOooO0OO.append(c34680OooO0O0.f124887OooOo0o.length());
            sbOooO0OO.append(')');
            throw new IllegalArgumentException(sbOooO0OO.toString().toString());
        }
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(C25252OooO0Oo.OooOOOO(i, arrayList));
        C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
        int iOooO00o = c34683OooO0o.OooO00o(i);
        C25869Oooo00O c25869Oooo00O = c34679OooO00o.f124881OooO0Oo;
        Layout layout = c25869Oooo00O.f88258OooO0Oo;
        int lineForOffset = layout.getLineForOffset(iOooO00o);
        float fOooO0o0 = c25869Oooo00O.OooO0o0(lineForOffset);
        float fOooO0Oo = c25869Oooo00O.OooO0Oo(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iOooO00o);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fOooO0o = c25869Oooo00O.OooO0oO(iOooO00o, false);
                fOooO0o2 = c25869Oooo00O.OooO0oO(iOooO00o + 1, true);
            } else if (zIsRtlCharAt) {
                fOooO0o = c25869Oooo00O.OooO0o(iOooO00o, false);
                fOooO0o2 = c25869Oooo00O.OooO0o(iOooO00o + 1, true);
            } else {
                fOooO0oO = c25869Oooo00O.OooO0oO(iOooO00o, false);
                fOooO0oO2 = c25869Oooo00O.OooO0oO(iOooO00o + 1, true);
            }
            float f = fOooO0o;
            fOooO0oO = fOooO0o2;
            fOooO0oO2 = f;
        } else {
            fOooO0oO = c25869Oooo00O.OooO0o(iOooO00o, false);
            fOooO0oO2 = c25869Oooo00O.OooO0o(iOooO00o + 1, true);
        }
        RectF rectF = new RectF(fOooO0oO, fOooO0o0, fOooO0oO2, fOooO0Oo);
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        long jOooO00o = C21289OooO0o.OooO00o(0.0f, c34683OooO0o.f124915OooO0o);
        return new C21291OooO0oO(C21290OooO0o0.OooO0OO(jOooO00o) + f2, C21290OooO0o0.OooO0Oo(jOooO00o) + f3, C21290OooO0o0.OooO0OO(jOooO00o) + f4, C21290OooO0o0.OooO0Oo(jOooO00o) + f5);
    }

    public final C21291OooO0oO OooO0OO(int i) {
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        c34682OooO0Oo.OooO0OO(i);
        int length = c34682OooO0Oo.f124903OooO00o.f124918OooO00o.f124887OooOo0o.length();
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i == length ? C34429OooOOo0.OooOO0O(arrayList) : C25252OooO0Oo.OooOOOO(i, arrayList));
        C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
        int iOooO00o = c34683OooO0o.OooO00o(i);
        CharSequence charSequence = c34679OooO00o.f124883OooO0o0;
        if (iOooO00o < 0 || iOooO00o > charSequence.length()) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(iOooO00o, "offset(", ") is out of bounds (0,");
            sbOooO0OO.append(charSequence.length());
            throw new AssertionError(sbOooO0OO.toString());
        }
        C25869Oooo00O c25869Oooo00O = c34679OooO00o.f124881OooO0Oo;
        float fOooO0o = c25869Oooo00O.OooO0o(iOooO00o, false);
        int lineForOffset = c25869Oooo00O.f88258OooO0Oo.getLineForOffset(iOooO00o);
        float fOooO0o0 = c25869Oooo00O.OooO0o0(lineForOffset);
        float fOooO0Oo = c25869Oooo00O.OooO0Oo(lineForOffset);
        long jOooO00o = C21289OooO0o.OooO00o(0.0f, c34683OooO0o.f124915OooO0o);
        return new C21291OooO0oO(C21290OooO0o0.OooO0OO(jOooO00o) + fOooO0o, C21290OooO0o0.OooO0Oo(jOooO00o) + fOooO0o0, C21290OooO0o0.OooO0OO(jOooO00o) + fOooO0o, C21290OooO0o0.OooO0Oo(jOooO00o) + fOooO0Oo);
    }

    public final float OooO0Oo(int i) {
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        c34682OooO0Oo.OooO0Oo(i);
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(C25252OooO0Oo.OooOOOo(i, arrayList));
        C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
        return c34679OooO00o.f124881OooO0Oo.OooO0Oo(i - c34683OooO0o.f124914OooO0Oo) + c34683OooO0o.f124915OooO0o;
    }

    public final int OooO0o(int i) {
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        int length = c34682OooO0Oo.f124903OooO00o.f124918OooO00o.f124887OooOo0o.length();
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i >= length ? C34429OooOOo0.OooOO0O(arrayList) : i < 0 ? 0 : C25252OooO0Oo.OooOOOO(i, arrayList));
        return c34683OooO0o.f124911OooO00o.f124881OooO0Oo.f88258OooO0Oo.getLineForOffset(c34683OooO0o.OooO00o(i)) + c34683OooO0o.f124914OooO0Oo;
    }

    public final int OooO0o0(int i, boolean z) {
        int lineEnd;
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        c34682OooO0Oo.OooO0Oo(i);
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(C25252OooO0Oo.OooOOOo(i, arrayList));
        C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
        int i2 = i - c34683OooO0o.f124914OooO0Oo;
        C25869Oooo00O c25869Oooo00O = c34679OooO00o.f124881OooO0Oo;
        if (z) {
            Layout layout = c25869Oooo00O.f88258OooO0Oo;
            lineEnd = layout.getEllipsisStart(i2) == 0 ? layout.getLineVisibleEnd(i2) : layout.getEllipsisStart(i2) + layout.getLineStart(i2);
        } else {
            Layout layout2 = c25869Oooo00O.f88258OooO0Oo;
            lineEnd = layout2.getEllipsisStart(i2) == 0 ? layout2.getLineEnd(i2) : layout2.getText().length();
        }
        return lineEnd + c34683OooO0o.f124912OooO0O0;
    }

    public final int OooO0oO(float f) {
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(f <= 0.0f ? 0 : f >= c34682OooO0Oo.f124908OooO0o0 ? C34429OooOOo0.OooOO0O(arrayList) : C25252OooO0Oo.OooOOo0(arrayList, f));
        int i = c34683OooO0o.f124913OooO0OO;
        int i2 = c34683OooO0o.f124912OooO0O0;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        float f2 = f - c34683OooO0o.f124915OooO0o;
        C25869Oooo00O c25869Oooo00O = c34683OooO0o.f124911OooO00o.f124881OooO0Oo;
        return c25869Oooo00O.f88258OooO0Oo.getLineForVertical(c25869Oooo00O.f88259OooO0o + ((int) f2)) + c34683OooO0o.f124914OooO0Oo;
    }

    public final int OooO0oo(int i) {
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        c34682OooO0Oo.OooO0Oo(i);
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(C25252OooO0Oo.OooOOOo(i, arrayList));
        C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
        return c34679OooO00o.f124881OooO0Oo.f88258OooO0Oo.getLineStart(i - c34683OooO0o.f124914OooO0Oo) + c34683OooO0o.f124912OooO0O0;
    }

    public final int OooOO0(long j) {
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(j);
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(fOooO0Oo <= 0.0f ? 0 : C21290OooO0o0.OooO0Oo(j) >= c34682OooO0Oo.f124908OooO0o0 ? C34429OooOOo0.OooOO0O(arrayList) : C25252OooO0Oo.OooOOo0(arrayList, C21290OooO0o0.OooO0Oo(j)));
        int i = c34683OooO0o.f124913OooO0OO;
        int i2 = c34683OooO0o.f124912OooO0O0;
        if (i - i2 == 0) {
            return Math.max(0, i2 - 1);
        }
        long jOooO00o = C21289OooO0o.OooO00o(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j) - c34683OooO0o.f124915OooO0o);
        C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
        int iOooO0Oo = (int) C21290OooO0o0.OooO0Oo(jOooO00o);
        C25869Oooo00O c25869Oooo00O = c34679OooO00o.f124881OooO0Oo;
        int i3 = c25869Oooo00O.f88259OooO0o + iOooO0Oo;
        Layout layout = c25869Oooo00O.f88258OooO0Oo;
        int lineForVertical = layout.getLineForVertical(i3);
        return layout.getOffsetForHorizontal(lineForVertical, (c25869Oooo00O.OooO0O0(lineForVertical) * (-1)) + C21290OooO0o0.OooO0OO(jOooO00o)) + i2;
    }

    public final EnumC24118OooO0oO OooOO0O(int i) {
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        c34682OooO0Oo.OooO0OO(i);
        int length = c34682OooO0Oo.f124903OooO00o.f124918OooO00o.f124887OooOo0o.length();
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i == length ? C34429OooOOo0.OooOO0O(arrayList) : C25252OooO0Oo.OooOOOO(i, arrayList));
        C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
        int iOooO00o = c34683OooO0o.OooO00o(i);
        C25869Oooo00O c25869Oooo00O = c34679OooO00o.f124881OooO0Oo;
        return c25869Oooo00O.f88258OooO0Oo.getParagraphDirection(c25869Oooo00O.f88258OooO0Oo.getLineForOffset(iOooO00o)) == 1 ? EnumC24118OooO0oO.f81272OooOo0o : EnumC24118OooO0oO.f81271OooOo;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, oO00ooO.OooOO0] */
    public final long OooOO0o(int i) {
        int iPreceding;
        int iPreceding2;
        int iFollowing;
        int iFollowing2;
        C34682OooO0Oo c34682OooO0Oo = this.f124973OooO0O0;
        c34682OooO0Oo.OooO0OO(i);
        int length = c34682OooO0Oo.f124903OooO00o.f124918OooO00o.f124887OooOo0o.length();
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i == length ? C34429OooOOo0.OooOO0O(arrayList) : C25252OooO0Oo.OooOOOO(i, arrayList));
        C34679OooO00o c34679OooO00o = c34683OooO0o.f124911OooO00o;
        int iOooO00o = c34683OooO0o.OooO00o(i);
        ?? r1 = c34679OooO00o.f124884OooO0oO;
        C24507OooO0O0 c24507OooO0O0 = ((C24506OooO00o) r1.getValue()).f82881OooO00o;
        c24507OooO0O0.OooO00o(iOooO00o);
        BreakIterator breakIterator = c24507OooO0O0.f82885OooO0Oo;
        if (c24507OooO0O0.OooO0o0(breakIterator.preceding(iOooO00o))) {
            c24507OooO0O0.OooO00o(iOooO00o);
            iPreceding = iOooO00o;
            while (iPreceding != -1 && (!c24507OooO0O0.OooO0o0(iPreceding) || c24507OooO0O0.OooO0OO(iPreceding))) {
                c24507OooO0O0.OooO00o(iPreceding);
                iPreceding = breakIterator.preceding(iPreceding);
            }
        } else {
            c24507OooO0O0.OooO00o(iOooO00o);
            if (c24507OooO0O0.OooO0Oo(iOooO00o)) {
                if (!breakIterator.isBoundary(iOooO00o) || c24507OooO0O0.OooO0O0(iOooO00o)) {
                    iPreceding2 = breakIterator.preceding(iOooO00o);
                    iPreceding = iPreceding2;
                } else {
                    iPreceding = iOooO00o;
                }
            } else if (c24507OooO0O0.OooO0O0(iOooO00o)) {
                iPreceding2 = breakIterator.preceding(iOooO00o);
                iPreceding = iPreceding2;
            } else {
                iPreceding = -1;
            }
        }
        if (iPreceding == -1) {
            iPreceding = iOooO00o;
        }
        C24507OooO0O0 c24507OooO0O02 = ((C24506OooO00o) r1.getValue()).f82881OooO00o;
        c24507OooO0O02.OooO00o(iOooO00o);
        BreakIterator breakIterator2 = c24507OooO0O02.f82885OooO0Oo;
        if (c24507OooO0O02.OooO0OO(breakIterator2.following(iOooO00o))) {
            c24507OooO0O02.OooO00o(iOooO00o);
            iFollowing = iOooO00o;
            while (iFollowing != -1 && (c24507OooO0O02.OooO0o0(iFollowing) || !c24507OooO0O02.OooO0OO(iFollowing))) {
                c24507OooO0O02.OooO00o(iFollowing);
                iFollowing = breakIterator2.following(iFollowing);
            }
        } else {
            c24507OooO0O02.OooO00o(iOooO00o);
            if (c24507OooO0O02.OooO0O0(iOooO00o)) {
                if (!breakIterator2.isBoundary(iOooO00o) || c24507OooO0O02.OooO0Oo(iOooO00o)) {
                    iFollowing2 = breakIterator2.following(iOooO00o);
                    iFollowing = iFollowing2;
                } else {
                    iFollowing = iOooO00o;
                }
            } else if (c24507OooO0O02.OooO0Oo(iOooO00o)) {
                iFollowing2 = breakIterator2.following(iOooO00o);
                iFollowing = iFollowing2;
            } else {
                iFollowing = -1;
            }
        }
        if (iFollowing != -1) {
            iOooO00o = iFollowing;
        }
        long jOooO0OO = C25256OooO00o.OooO0OO(iPreceding, iOooO00o);
        int i2 = C34696OooOOoo.f124979OooO0OO;
        int i3 = c34683OooO0o.f124912OooO0O0;
        return C25256OooO00o.OooO0OO(((int) (jOooO0OO >> 32)) + i3, ((int) (jOooO0OO & 4294967295L)) + i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34695OooOOo0)) {
            return false;
        }
        C34695OooOOo0 c34695OooOOo0 = (C34695OooOOo0) obj;
        return this.f124972OooO00o.equals(c34695OooOOo0.f124972OooO00o) && this.f124973OooO0O0.equals(c34695OooOOo0.f124973OooO0O0) && C24237OooOO0o.OooO00o(this.f124974OooO0OO, c34695OooOOo0.f124974OooO0OO) && this.f124975OooO0Oo == c34695OooOOo0.f124975OooO0Oo && this.f124977OooO0o0 == c34695OooOOo0.f124977OooO0o0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124976OooO0o, c34695OooOOo0.f124976OooO0o);
    }

    public final int hashCode() {
        return this.f124976OooO0o.hashCode() + C20509OooO0oo.OooO0OO(this.f124977OooO0o0, C20509OooO0oo.OooO0OO(this.f124975OooO0Oo, C20703o000000o.OooO0O0((this.f124973OooO0O0.hashCode() + (this.f124972OooO00o.hashCode() * 31)) * 31, 31, this.f124974OooO0OO), 31), 31);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f124972OooO00o + ", multiParagraph=" + this.f124973OooO0O0 + ", size=" + ((Object) C24237OooOO0o.OooO0O0(this.f124974OooO0OO)) + ", firstBaseline=" + this.f124975OooO0Oo + ", lastBaseline=" + this.f124977OooO0o0 + ", placeholderRects=" + this.f124976OooO0o + ')';
    }
}
