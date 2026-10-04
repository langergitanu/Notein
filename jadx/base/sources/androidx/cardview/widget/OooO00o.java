package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooO0OO {
    public static C21597OooO0Oo OooOOOO(OooO0O0 oooO0O0) {
        return (C21597OooO0Oo) ((CardView.OooO00o) oooO0O0).f63298OooO00o;
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final void OooO(OooO0O0 oooO0O0, float f) {
        CardView.this.setElevation(f);
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final float OooO00o(OooO0O0 oooO0O0) {
        return OooOOOO(oooO0O0).f63301OooO00o;
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final float OooO0O0(OooO0O0 oooO0O0) {
        return OooOOOO(oooO0O0).f63306OooO0o0;
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final float OooO0OO(OooO0O0 oooO0O0) {
        return OooOOOO(oooO0O0).f63301OooO00o * 2.0f;
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final float OooO0Oo(OooO0O0 oooO0O0) {
        return CardView.this.getElevation();
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final float OooO0o(OooO0O0 oooO0O0) {
        return OooOOOO(oooO0O0).f63301OooO00o * 2.0f;
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final void OooO0o0(OooO0O0 oooO0O0) {
        CardView.OooO00o oooO00o = (CardView.OooO00o) oooO0O0;
        if (!CardView.this.getUseCompatPadding()) {
            oooO00o.OooO00o(0, 0, 0, 0);
            return;
        }
        float f = OooOOOO(oooO0O0).f63306OooO0o0;
        float f2 = OooOOOO(oooO0O0).f63301OooO00o;
        CardView cardView = CardView.this;
        int iCeil = (int) Math.ceil(C21598OooO0o0.OooO00o(f, f2, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(C21598OooO0o0.OooO0O0(f, f2, cardView.getPreventCornerOverlap()));
        oooO00o.OooO00o(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final void OooO0oO(OooO0O0 oooO0O0, float f) {
        C21597OooO0Oo c21597OooO0OoOooOOOO = OooOOOO(oooO0O0);
        CardView.OooO00o oooO00o = (CardView.OooO00o) oooO0O0;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f != c21597OooO0OoOooOOOO.f63306OooO0o0 || c21597OooO0OoOooOOOO.f63305OooO0o != useCompatPadding || c21597OooO0OoOooOOOO.f63307OooO0oO != preventCornerOverlap) {
            c21597OooO0OoOooOOOO.f63306OooO0o0 = f;
            c21597OooO0OoOooOOOO.f63305OooO0o = useCompatPadding;
            c21597OooO0OoOooOOOO.f63307OooO0oO = preventCornerOverlap;
            c21597OooO0OoOooOOOO.OooO0O0(null);
            c21597OooO0OoOooOOOO.invalidateSelf();
        }
        OooO0o0(oooO0O0);
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final void OooO0oo(OooO0O0 oooO0O0, float f) {
        C21597OooO0Oo c21597OooO0OoOooOOOO = OooOOOO(oooO0O0);
        if (f == c21597OooO0OoOooOOOO.f63301OooO00o) {
            return;
        }
        c21597OooO0OoOooOOOO.f63301OooO00o = f;
        c21597OooO0OoOooOOOO.OooO0O0(null);
        c21597OooO0OoOooOOOO.invalidateSelf();
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final ColorStateList OooOO0(OooO0O0 oooO0O0) {
        return OooOOOO(oooO0O0).f63308OooO0oo;
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final void OooOO0O(CardView.OooO00o oooO00o, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C21597OooO0Oo c21597OooO0Oo = new C21597OooO0Oo(f, colorStateList);
        oooO00o.f63298OooO00o = c21597OooO0Oo;
        CardView cardView = CardView.this;
        cardView.setBackgroundDrawable(c21597OooO0Oo);
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        OooO0oO(oooO00o, f3);
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final void OooOO0o(OooO0O0 oooO0O0) {
        OooO0oO(oooO0O0, OooOOOO(oooO0O0).f63306OooO0o0);
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final void OooOOO(OooO0O0 oooO0O0, ColorStateList colorStateList) {
        C21597OooO0Oo c21597OooO0OoOooOOOO = OooOOOO(oooO0O0);
        if (colorStateList == null) {
            c21597OooO0OoOooOOOO.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c21597OooO0OoOooOOOO.f63308OooO0oo = colorStateList;
        c21597OooO0OoOooOOOO.f63302OooO0O0.setColor(colorStateList.getColorForState(c21597OooO0OoOooOOOO.getState(), c21597OooO0OoOooOOOO.f63308OooO0oo.getDefaultColor()));
        c21597OooO0OoOooOOOO.invalidateSelf();
    }

    @Override // androidx.cardview.widget.OooO0OO
    public final void OooOOO0(OooO0O0 oooO0O0) {
        OooO0oO(oooO0O0, OooOOOO(oooO0O0).f63306OooO0o0);
    }
}
