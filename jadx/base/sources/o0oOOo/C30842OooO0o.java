package o0oOOo;

import OooOOO0.AbstractC20449OooO0Oo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import kotlin.jvm.internal.OooOOO0;
import o00o0o00.C25438OooO00o;
import o00oO0O0.C25556OooO0oo;
import o00oO0O0.C25557OooOO0o;
import o00oO0O0.C25558OooOOOo;
import o00oO0O0.C25560OooOOo0;
import o00oO0O0.InterfaceC25553OooO0Oo;
import o00oO0O0.OooOO0O;
import o00ooO.C25732OooO0O0;
import o0oOOo.C30843OooO0o0;

/* JADX INFO: renamed from: o0oOOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C30842OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ColorDrawable f110231OooO00o = new ColorDrawable(0);

    public static Drawable OooO00o(Drawable drawable, C30843OooO0o0 c30843OooO0o0, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            c30843OooO0o0.getClass();
            C25557OooOO0o c25557OooOO0o = new C25557OooOO0o(resources, bitmap, paint);
            OooO0O0(c25557OooOO0o, c30843OooO0o0);
            return c25557OooOO0o;
        }
        if (drawable instanceof NinePatchDrawable) {
            NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) drawable;
            OooOOO0.OooO0oO(ninePatchDrawable, "ninePatchDrawable");
            C25558OooOOOo c25558OooOOOo = new C25558OooOOOo(ninePatchDrawable);
            OooO0O0(c25558OooOOOo, c30843OooO0o0);
            return c25558OooOOOo;
        }
        if (!(drawable instanceof ColorDrawable)) {
            C25438OooO00o.OooOO0("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        o00oO0O0.OooOOO0 oooOOO0 = new o00oO0O0.OooOOO0(((ColorDrawable) drawable).getColor());
        OooO0O0(oooOOO0, c30843OooO0o0);
        return oooOOO0;
    }

    public static void OooO0O0(OooOO0O oooOO0O, C30843OooO0o0 c30843OooO0o0) {
        oooOO0O.OooO0O0(c30843OooO0o0.f110233OooO0O0);
        oooOO0O.OooOO0o(c30843OooO0o0.f110234OooO0OO);
        oooOO0O.OooO00o(c30843OooO0o0.f110236OooO0o, c30843OooO0o0.f110237OooO0o0);
        oooOO0O.OooO0OO(c30843OooO0o0.f110238OooO0oO);
        oooOO0O.OooOO0O();
        oooOO0O.OooO0oO();
        oooOO0O.OooO0Oo();
    }

    public static Drawable OooO0OO(Drawable drawable, C30843OooO0o0 c30843OooO0o0, Resources resources) {
        try {
            C25732OooO0O0.OooO00o();
            if (drawable != null && c30843OooO0o0 != null && c30843OooO0o0.f110232OooO00o == C30843OooO0o0.OooO00o.f110239OooOo) {
                if (!(drawable instanceof C25556OooO0oo)) {
                    return OooO00o(drawable, c30843OooO0o0, resources);
                }
                InterfaceC25553OooO0Oo interfaceC25553OooO0Oo = (C25556OooO0oo) drawable;
                while (true) {
                    Object objOooO0oo = interfaceC25553OooO0Oo.OooO0oo();
                    if (objOooO0oo == interfaceC25553OooO0Oo || !(objOooO0oo instanceof InterfaceC25553OooO0Oo)) {
                        break;
                    }
                    interfaceC25553OooO0Oo = (InterfaceC25553OooO0Oo) objOooO0oo;
                }
                interfaceC25553OooO0Oo.OooOO0(OooO00o(interfaceC25553OooO0Oo.OooOO0(f110231OooO00o), c30843OooO0o0, resources));
                return drawable;
            }
            return drawable;
        } finally {
            C25732OooO0O0.OooO00o();
        }
    }

    public static Drawable OooO0Oo(Drawable drawable, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        C25732OooO0O0.OooO00o();
        if (drawable == null || abstractC20449OooO0Oo == null) {
            C25732OooO0O0.OooO00o();
            return drawable;
        }
        C25560OooOOo0 c25560OooOOo0 = new C25560OooOOo0(drawable, abstractC20449OooO0Oo);
        C25732OooO0O0.OooO00o();
        return c25560OooOOo0;
    }
}
