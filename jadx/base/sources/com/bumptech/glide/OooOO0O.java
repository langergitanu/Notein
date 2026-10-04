package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.OooOO0O;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o00Ooo0.InterfaceC25097OooO00o;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooOO.C25159OooO0oO;
import o00OooOO.InterfaceC25155OooO0O0;
import o00OoooO.C25169OooO;
import o00OoooO.C25170OooO00o;
import o00OoooO.C25171OooO0O0;
import o00OoooO.C25173OooO0OO;
import o00OoooO.C25174OooO0Oo;
import o00OoooO.C25175OooO0o;
import o00OoooO.C25178OooO0o0;
import o00OoooO.C25179OooO0oO;
import o00OoooO.C25182OooO0oo;
import o00OoooO.C25183OooOO0;
import o00OoooO.C25191OooOo0o;
import o00OoooO.C25192OooOoO;
import o00OoooO.C25193OooOoO0;
import o00OoooO.C25194OooOoOO;
import o00OoooO.C25195OooOoo;
import o00OoooO.C25196OooOoo0;
import o00OoooO.InterfaceC25188OooOOoo;
import o00OoooO.OooOOO;
import o00OoooO.OooOo;
import o00Ooooo.C25198OooO00o;
import o00Ooooo.C25199OooO0O0;
import o00Ooooo.C25200OooO0OO;
import o00Ooooo.C25201OooO0Oo;
import o00Ooooo.C25202OooO0o0;
import o00o00.C25206OooO0Oo;
import o00o00.C25209OooO0oo;
import o00o000.C25210OooO00o;
import o00o000.C25211OooO0O0;
import o00o000.C25214OooO0oO;
import o00o000.C25215OooO0oo;
import o00o000.C25216OooOO0o;
import o00o000.C25222OooOOo0;
import o00o000.C25224OooOo0;
import o00o000.C25226OooOo0o;
import o00o000.C25228OooOoO0;
import o00o000.C25229OooOoOO;
import o00o000.C25230OooOoo;
import o00o000.C25233OooOooo;
import o00o000O.C25241OooO00o;
import o00o000o.C25246OooO0Oo;
import o00o000o.C25249OooO0oo;
import o00o00O0.C25250OooO00o;
import o00o00O0.C25251OooO0O0;
import o00o00O0.C25252OooO0Oo;
import o00o00o.C25275OooO0O0;
import o00o00o0.AbstractC25280OooO00o;
import o00o00o0.InterfaceC25281OooO0O0;
import oo00oO.C34661OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O {
    public static OooO OooO00o(OooO0OO oooO0OO, List<InterfaceC25281OooO0O0> list, AbstractC25280OooO00o abstractC25280OooO00o) {
        InterfaceC25121OooOO0O c25214OooO0oO;
        InterfaceC25121OooOO0O c25229OooOoOO;
        int i;
        String str;
        InterfaceC25155OooO0O0 interfaceC25155OooO0O0 = oooO0OO.f67114OooOo0o;
        OooO0o oooO0o = oooO0OO.f67116OooOoO0;
        Context applicationContext = oooO0o.getApplicationContext();
        C22251OooO0oO c22251OooO0oO = oooO0o.f67129OooO0oo;
        OooO oooO = new OooO();
        C25216OooOO0o c25216OooOO0o = new C25216OooOO0o();
        C25275OooO0O0 c25275OooO0O0 = oooO.f67108OooO0oO;
        synchronized (c25275OooO0O0) {
            ((ArrayList) c25275OooO0O0.f86025OooO00o).add(c25216OooOO0o);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            C25222OooOOo0 c25222OooOOo0 = new C25222OooOOo0();
            C25275OooO0O0 c25275OooO0O02 = oooO.f67108OooO0oO;
            synchronized (c25275OooO0O02) {
                ((ArrayList) c25275OooO0O02.f86025OooO00o).add(c25222OooOOo0);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListOooO0o0 = oooO.OooO0o0();
        C25159OooO0oO c25159OooO0oO = oooO0OO.f67115OooOoO;
        o00o00.OooO00o oooO00o = new o00o00.OooO00o(applicationContext, arrayListOooO0o0, interfaceC25155OooO0O0, c25159OooO0oO);
        InterfaceC25121OooOO0O c25233OooOooo = new C25233OooOooo(interfaceC25155OooO0O0, new C25233OooOooo.C25236OooO0oO());
        o00o000.OooOOO oooOOO = new o00o000.OooOOO(oooO.OooO0o0(), resources.getDisplayMetrics(), interfaceC25155OooO0O0, c25159OooO0oO);
        if (i2 < 28 || !c22251OooO0oO.f67131OooO00o.containsKey(C22249OooO0Oo.class)) {
            c25214OooO0oO = new C25214OooO0oO(oooOOO);
            c25229OooOoOO = new C25229OooOoOO(oooOOO, c25159OooO0oO);
        } else {
            c25229OooOoOO = new C25224OooOo0();
            c25214OooO0oO = new C25215OooO0oo();
        }
        if (i2 >= 28) {
            i = i2;
            oooO.OooO0Oo("Animation", InputStream.class, Drawable.class, new C25246OooO0Oo.OooO0OO(new C25246OooO0Oo(arrayListOooO0o0, c25159OooO0oO)));
            oooO.OooO0Oo("Animation", ByteBuffer.class, Drawable.class, new C25246OooO0Oo.OooO0O0(new C25246OooO0Oo(arrayListOooO0o0, c25159OooO0oO)));
        } else {
            i = i2;
        }
        C25249OooO0oo c25249OooO0oo = new C25249OooO0oo(applicationContext);
        o00o000.OooO0OO oooO0OO2 = new o00o000.OooO0OO(c25159OooO0oO);
        C25250OooO00o c25250OooO00o = new C25250OooO00o();
        C25252OooO0Oo c25252OooO0Oo = new C25252OooO0Oo();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        oooO.OooO0O0(ByteBuffer.class, new C25173OooO0OO());
        oooO.OooO0O0(InputStream.class, new C25193OooOoO0(c25159OooO0oO));
        oooO.OooO0Oo("Bitmap", ByteBuffer.class, Bitmap.class, c25214OooO0oO);
        oooO.OooO0Oo("Bitmap", InputStream.class, Bitmap.class, c25229OooOoOO);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = str2;
        } else {
            str = str2;
            oooO.OooO0Oo("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C25226OooOo0o(oooOOO));
        }
        oooO.OooO0Oo("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C25233OooOooo(interfaceC25155OooO0O0, new C25233OooOooo.OooO0OO()));
        oooO.OooO0Oo("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c25233OooOooo);
        InterfaceC25188OooOOoo interfaceC25188OooOOoo = C25194OooOoOO.OooO00o.f85769OooO00o;
        oooO.OooO00o(Bitmap.class, Bitmap.class, interfaceC25188OooOOoo);
        oooO.OooO0Oo("Bitmap", Bitmap.class, Bitmap.class, new C25230OooOoo());
        oooO.OooO0OO(Bitmap.class, oooO0OO2);
        oooO.OooO0Oo("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C25210OooO00o(resources, c25214OooO0oO));
        oooO.OooO0Oo("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C25210OooO00o(resources, c25229OooOoOO));
        oooO.OooO0Oo("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C25210OooO00o(resources, c25233OooOooo));
        oooO.OooO0OO(BitmapDrawable.class, new C25211OooO0O0(interfaceC25155OooO0O0, oooO0OO2));
        oooO.OooO0Oo("Animation", InputStream.class, o00o00.OooO0OO.class, new o00o00.OooOO0(arrayListOooO0o0, oooO00o, c25159OooO0oO));
        oooO.OooO0Oo("Animation", ByteBuffer.class, o00o00.OooO0OO.class, oooO00o);
        oooO.OooO0OO(o00o00.OooO0OO.class, new C25206OooO0Oo());
        oooO.OooO00o(InterfaceC25097OooO00o.class, InterfaceC25097OooO00o.class, interfaceC25188OooOOoo);
        oooO.OooO0Oo("Bitmap", InterfaceC25097OooO00o.class, Bitmap.class, new C25209OooO0oo(interfaceC25155OooO0O0));
        oooO.OooO0Oo("legacy_append", Uri.class, Drawable.class, c25249OooO0oo);
        oooO.OooO0Oo("legacy_append", Uri.class, Bitmap.class, new C25228OooOoO0(c25249OooO0oo, interfaceC25155OooO0O0));
        oooO.OooOO0(new C25241OooO00o.C19690OooO00o());
        oooO.OooO00o(File.class, ByteBuffer.class, new C25174OooO0Oo.OooO0O0());
        oooO.OooO00o(File.class, InputStream.class, new C25179OooO0oO.C25181OooO0o0(new C25169OooO()));
        oooO.OooO0Oo("legacy_append", File.class, File.class, new C34661OooO00o());
        oooO.OooO00o(File.class, ParcelFileDescriptor.class, new C25179OooO0oO.OooO0O0(new C25182OooO0oo()));
        oooO.OooO00o(File.class, File.class, interfaceC25188OooOOoo);
        oooO.OooOO0(new OooOO0O.OooO00o(c25159OooO0oO));
        if (!"robolectric".equals(str)) {
            oooO.OooOO0(new ParcelFileDescriptorRewinder.OooO00o());
        }
        InterfaceC25188OooOOoo oooO0OO3 = new C25175OooO0o.OooO0OO(applicationContext);
        InterfaceC25188OooOOoo oooO00o2 = new C25175OooO0o.OooO00o(applicationContext);
        InterfaceC25188OooOOoo oooO0O0 = new C25175OooO0o.OooO0O0(applicationContext);
        Class cls = Integer.TYPE;
        oooO.OooO00o(cls, InputStream.class, oooO0OO3);
        oooO.OooO00o(Integer.class, InputStream.class, oooO0OO3);
        oooO.OooO00o(cls, AssetFileDescriptor.class, oooO00o2);
        oooO.OooO00o(Integer.class, AssetFileDescriptor.class, oooO00o2);
        oooO.OooO00o(cls, Drawable.class, oooO0O0);
        oooO.OooO00o(Integer.class, Drawable.class, oooO0O0);
        oooO.OooO00o(Uri.class, InputStream.class, new OooOo.OooO0O0(applicationContext));
        oooO.OooO00o(Uri.class, AssetFileDescriptor.class, new OooOo.OooO00o(applicationContext));
        InterfaceC25188OooOOoo oooO0OO4 = new C25191OooOo0o.OooO0OO(resources);
        InterfaceC25188OooOOoo oooO00o3 = new C25191OooOo0o.OooO00o(resources);
        InterfaceC25188OooOOoo oooO0O02 = new C25191OooOo0o.OooO0O0(resources);
        oooO.OooO00o(Integer.class, Uri.class, oooO0OO4);
        oooO.OooO00o(cls, Uri.class, oooO0OO4);
        oooO.OooO00o(Integer.class, AssetFileDescriptor.class, oooO00o3);
        oooO.OooO00o(cls, AssetFileDescriptor.class, oooO00o3);
        oooO.OooO00o(Integer.class, InputStream.class, oooO0O02);
        oooO.OooO00o(cls, InputStream.class, oooO0O02);
        oooO.OooO00o(String.class, InputStream.class, new C25178OooO0o0.OooO0O0());
        oooO.OooO00o(Uri.class, InputStream.class, new C25178OooO0o0.OooO0O0());
        oooO.OooO00o(String.class, InputStream.class, new C25192OooOoO.OooO0OO());
        oooO.OooO00o(String.class, ParcelFileDescriptor.class, new C25192OooOoO.OooO0O0());
        oooO.OooO00o(String.class, AssetFileDescriptor.class, new C25192OooOoO.OooO00o());
        oooO.OooO00o(Uri.class, InputStream.class, new C25170OooO00o.OooO0OO(applicationContext.getAssets()));
        oooO.OooO00o(Uri.class, AssetFileDescriptor.class, new C25170OooO00o.OooO0O0(applicationContext.getAssets()));
        oooO.OooO00o(Uri.class, InputStream.class, new C25199OooO0O0.OooO00o(applicationContext));
        oooO.OooO00o(Uri.class, InputStream.class, new C25200OooO0OO.OooO00o(applicationContext));
        if (i >= 29) {
            oooO.OooO00o(Uri.class, InputStream.class, new C25201OooO0Oo.OooO0OO(applicationContext, InputStream.class));
            oooO.OooO00o(Uri.class, ParcelFileDescriptor.class, new C25201OooO0Oo.OooO0O0(applicationContext, ParcelFileDescriptor.class));
        }
        oooO.OooO00o(Uri.class, InputStream.class, new C25196OooOoo0.C25197OooO0Oo(contentResolver));
        oooO.OooO00o(Uri.class, ParcelFileDescriptor.class, new C25196OooOoo0.OooO0O0(contentResolver));
        oooO.OooO00o(Uri.class, AssetFileDescriptor.class, new C25196OooOoo0.OooO00o(contentResolver));
        oooO.OooO00o(Uri.class, InputStream.class, new C25195OooOoo.OooO00o());
        oooO.OooO00o(URL.class, InputStream.class, new C25202OooO0o0.OooO00o());
        oooO.OooO00o(Uri.class, File.class, new OooOOO.OooO00o(applicationContext));
        oooO.OooO00o(C25183OooOO0.class, InputStream.class, new C25198OooO00o.C19685OooO00o());
        oooO.OooO00o(byte[].class, ByteBuffer.class, new C25171OooO0O0.OooO00o());
        oooO.OooO00o(byte[].class, InputStream.class, new C25171OooO0O0.C25172OooO0Oo());
        oooO.OooO00o(Uri.class, Uri.class, interfaceC25188OooOOoo);
        oooO.OooO00o(Drawable.class, Drawable.class, interfaceC25188OooOOoo);
        oooO.OooO0Oo("legacy_append", Drawable.class, Drawable.class, new o00o000o.OooO());
        oooO.OooOO0O(Bitmap.class, BitmapDrawable.class, new C25251OooO0O0(resources));
        oooO.OooOO0O(Bitmap.class, byte[].class, c25250OooO00o);
        oooO.OooOO0O(Drawable.class, byte[].class, new o00o00O0.OooO0OO(interfaceC25155OooO0O0, c25250OooO00o, c25252OooO0Oo));
        oooO.OooOO0O(o00o00.OooO0OO.class, byte[].class, c25252OooO0Oo);
        InterfaceC25121OooOO0O c25233OooOooo2 = new C25233OooOooo(interfaceC25155OooO0O0, new C25233OooOooo.C25234OooO0Oo());
        oooO.OooO0Oo("legacy_append", ByteBuffer.class, Bitmap.class, c25233OooOooo2);
        oooO.OooO0Oo("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C25210OooO00o(resources, c25233OooOooo2));
        for (InterfaceC25281OooO0O0 interfaceC25281OooO0O0 : list) {
            try {
                interfaceC25281OooO0O0.OooO00o(applicationContext, oooO0OO, oooO);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(interfaceC25281OooO0O0.getClass().getName()), e);
            }
        }
        if (abstractC25280OooO00o != null) {
            abstractC25280OooO00o.OooO00o(applicationContext, oooO0OO, oooO);
        }
        return oooO;
    }
}
