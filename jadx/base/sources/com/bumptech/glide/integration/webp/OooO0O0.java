package com.bumptech.glide.integration.webp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import com.bumptech.glide.OooO;
import io.ktor.utils.p616io.internal.OooOO0O;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import o00Ooo0O.C25104OooO00o;
import o00Ooo0O.C25105OooO0Oo;
import o00Ooo0O.C25106OooO0o0;
import o00Ooo0O.C25107OooO0oO;
import o00Ooo0O.OooO0o;
import o00Ooo0O.OooOO0;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooOO.C25159OooO0oO;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o000.C25210OooO00o;
import o00o00o0.AbstractC25282OooO0OO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0O0 extends AbstractC25282OooO0OO {
    @Override // o00o00o0.AbstractC25282OooO0OO
    public final void OooO00o(Context context, com.bumptech.glide.OooO0OO oooO0OO, OooO oooO) {
        Resources resources = context.getResources();
        InterfaceC25155OooO0O0 interfaceC25155OooO0O0 = oooO0OO.f67114OooOo0o;
        ArrayList arrayListOooO0o0 = oooO.OooO0o0();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        C25159OooO0oO c25159OooO0oO = oooO0OO.f67115OooOoO;
        o00Ooo0O.OooO oooO2 = new o00Ooo0O.OooO(arrayListOooO0o0, displayMetrics, interfaceC25155OooO0O0, c25159OooO0oO);
        C25104OooO00o c25104OooO00o = new C25104OooO00o(interfaceC25155OooO0O0, c25159OooO0oO);
        InterfaceC25121OooOO0O oooO0OO2 = new o00Ooo0O.OooO0OO(oooO2);
        InterfaceC25121OooOO0O oooO0o = new OooO0o(oooO2, c25159OooO0oO);
        C25105OooO0Oo c25105OooO0Oo = new C25105OooO0Oo(context, c25159OooO0oO, interfaceC25155OooO0O0);
        oooO.OooO("Bitmap", ByteBuffer.class, Bitmap.class, oooO0OO2);
        oooO.OooO("Bitmap", InputStream.class, Bitmap.class, oooO0o);
        oooO.OooO("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C25210OooO00o(resources, oooO0OO2));
        oooO.OooO("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C25210OooO00o(resources, oooO0o));
        oooO.OooO("Bitmap", ByteBuffer.class, Bitmap.class, new o00Ooo0O.OooO0O0(c25104OooO00o));
        oooO.OooO("Bitmap", InputStream.class, Bitmap.class, new C25106OooO0o0(c25104OooO00o));
        oooO.OooO("legacy_prepend_all", ByteBuffer.class, OooOO0.class, c25105OooO0Oo);
        oooO.OooO("legacy_prepend_all", InputStream.class, OooOO0.class, new C25107OooO0oO(c25105OooO0Oo, c25159OooO0oO));
        oooO.OooO0oo(new OooOO0O());
    }
}
