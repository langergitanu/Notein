package o00000O;

import OooOOO0.AbstractC20449OooO0Oo;
import OooOo.C20496Oooo0o0;
import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import OooooOO.AbstractC21341OoooOO0;
import OooooOO.AbstractC21369oo000o;
import OooooOO.C21331Oooo0O0;
import OooooOO.C21348Ooooo0o;
import OooooOO.C21362o00oO0o;
import OooooOO.C21368o0ooOoO;
import Oooooo0.C21403OooO0oO;
import Oooooo0.C21404OooO0oo;
import android.graphics.Paint;
import android.text.TextPaint;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00000O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24105OooO0o0 extends TextPaint {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21331Oooo0O0 f81228OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00000o0.OooO f81229OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C21362o00oO0o f81230OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AbstractC20449OooO0Oo f81231OooO0Oo;

    public C24105OooO0o0(float f) {
        super(1);
        ((TextPaint) this).density = f;
        C21331Oooo0O0 c21331Oooo0O0 = new C21331Oooo0O0();
        c21331Oooo0O0.f61740OooO00o = this;
        c21331Oooo0O0.f61741OooO0O0 = 3;
        this.f81228OooO00o = c21331Oooo0O0;
        this.f81229OooO0O0 = o00000o0.OooO.f81254OooO0O0;
        this.f81230OooO0OO = C21362o00oO0o.f61780OooO0Oo;
    }

    public final void OooO00o(AbstractC21341OoooOO0 abstractC21341OoooOO0, long j, float f) {
        boolean z = abstractC21341OoooOO0 instanceof C21368o0ooOoO;
        C21331Oooo0O0 c21331Oooo0O0 = this.f81228OooO00o;
        if ((z && ((C21368o0ooOoO) abstractC21341OoooOO0).f61817OooO00o != C21348Ooooo0o.f61766OooO0oO) || ((abstractC21341OoooOO0 instanceof AbstractC21369oo000o) && j != C21293OooOO0.f61729OooO0OO)) {
            abstractC21341OoooOO0.OooO00o(Float.isNaN(f) ? c21331Oooo0O0.OooO0O0() : oO0O00oo.OooOO0.OooO0o0(f, 0.0f, 1.0f), j, c21331Oooo0O0);
        } else if (abstractC21341OoooOO0 == null) {
            c21331Oooo0O0.OooOOOO(null);
        }
    }

    public final void OooO0O0(AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        if (abstractC20449OooO0Oo == null || OooOOO0.OooO0O0(this.f81231OooO0Oo, abstractC20449OooO0Oo)) {
            return;
        }
        this.f81231OooO0Oo = abstractC20449OooO0Oo;
        boolean zEquals = abstractC20449OooO0Oo.equals(C21403OooO0oO.f61923OooOo0o);
        C21331Oooo0O0 c21331Oooo0O0 = this.f81228OooO00o;
        if (zEquals) {
            c21331Oooo0O0.OooOo00(0);
            return;
        }
        if (abstractC20449OooO0Oo instanceof C21404OooO0oo) {
            c21331Oooo0O0.OooOo00(1);
            C21404OooO0oo c21404OooO0oo = (C21404OooO0oo) abstractC20449OooO0Oo;
            c21331Oooo0O0.OooOOoo(c21404OooO0oo.f61925OooOo0o);
            c21331Oooo0O0.OooOOo(c21404OooO0oo.f61924OooOo);
            c21331Oooo0O0.OooOOo0(c21404OooO0oo.f61926OooOoO);
            c21331Oooo0O0.OooOOOo(c21404OooO0oo.f61927OooOoO0);
            Paint paint = c21331Oooo0O0.f61740OooO00o;
            OooOOO0.OooO0oO(paint, "<this>");
            paint.setPathEffect(null);
        }
    }

    public final void OooO0OO(C21362o00oO0o c21362o00oO0o) {
        if (c21362o00oO0o == null || OooOOO0.OooO0O0(this.f81230OooO0OO, c21362o00oO0o)) {
            return;
        }
        this.f81230OooO0OO = c21362o00oO0o;
        if (c21362o00oO0o.equals(C21362o00oO0o.f61780OooO0Oo)) {
            clearShadowLayer();
            return;
        }
        C21362o00oO0o c21362o00oO0o2 = this.f81230OooO0OO;
        float f = c21362o00oO0o2.f61783OooO0OO;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, C21290OooO0o0.OooO0OO(c21362o00oO0o2.f61782OooO0O0), C21290OooO0o0.OooO0Oo(this.f81230OooO0OO.f61782OooO0O0), C20496Oooo0o0.OooO0oo(this.f81230OooO0OO.f61781OooO00o));
    }

    public final void OooO0Oo(o00000o0.OooO oooO) {
        if (oooO == null || OooOOO0.OooO0O0(this.f81229OooO0O0, oooO)) {
            return;
        }
        this.f81229OooO0O0 = oooO;
        int i = oooO.f81257OooO00o;
        setUnderlineText((i | 1) == i);
        int i2 = this.f81229OooO0O0.f81257OooO00o;
        setStrikeThruText((i2 | 2) == i2);
    }
}
