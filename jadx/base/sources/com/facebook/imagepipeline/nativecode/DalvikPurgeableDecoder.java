package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o00O0oo0.C24969OooOO0;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00oo.C25638OooO0oO;
import o00oo0O.C25655OooO0o0;
import o00ooO0.C25739OooO0oo;
import o00ooO0.OooO;
import o00ooO0O.InterfaceC25762OooO0OO;
import o00ooOO.C25767OooO0OO;
import o00ooOo0.C25787OooO00o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DalvikPurgeableDecoder implements InterfaceC25762OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f67262OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25739OooO0oo f67263OooO00o;

    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        List<String> list = OooO00o.f67269OooO00o;
        C25787OooO00o.OooO0O0("imagepipeline");
        f67262OooO0O0 = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (OooO.f87827OooO0OO == null) {
            synchronized (OooO.class) {
                try {
                    if (OooO.f87827OooO0OO == null) {
                        OooO.f87827OooO0OO = new C25739OooO0oo(OooO.f87826OooO0O0, OooO.f87825OooO00o);
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C25739OooO0oo c25739OooO0oo = OooO.f87827OooO0OO;
        OooOOO0.OooO0Oo(c25739OooO0oo);
        this.f67263OooO00o = c25739OooO0oo;
    }

    public static boolean OooO0o0(int i, AbstractC25434OooO00o abstractC25434OooO00o) {
        InterfaceC25449OooO0oO interfaceC25449OooO0oO = (InterfaceC25449OooO0oO) abstractC25434OooO00o.Oooo000();
        return i >= 2 && interfaceC25449OooO0oO.OooOOO(i + (-2)) == -1 && interfaceC25449OooO0oO.OooOOO(i - 1) == -39;
    }

    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // o00ooO0O.InterfaceC25762OooO0OO
    public final AbstractC25434OooO00o OooO00o(C25638OooO0oO c25638OooO0oO, Bitmap.Config config, int i, ColorSpace colorSpace) {
        int i2 = c25638OooO0oO.f87506OooOoo;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(c25638OooO0oO.f87502OooOo0o);
        abstractC25434OooO00oOooOOO0.getClass();
        try {
            return OooO0o(OooO0Oo(abstractC25434OooO00oOooOOO0, i, options));
        } finally {
            abstractC25434OooO00oOooOOO0.close();
        }
    }

    @Override // o00ooO0O.InterfaceC25762OooO0OO
    public final AbstractC25434OooO00o OooO0O0(C25638OooO0oO c25638OooO0oO, Bitmap.Config config) {
        int i = c25638OooO0oO.f87506OooOoo;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00oOooOOO0 = AbstractC25434OooO00o.OooOOO0(c25638OooO0oO.f87502OooOo0o);
        abstractC25434OooO00oOooOOO0.getClass();
        try {
            return OooO0o(OooO0OO(abstractC25434OooO00oOooOOO0, options));
        } finally {
            abstractC25434OooO00oOooOOO0.close();
        }
    }

    public abstract Bitmap OooO0OO(AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o, BitmapFactory.Options options);

    public abstract Bitmap OooO0Oo(AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o, int i, BitmapFactory.Options options);

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.lang.StringBuilder] */
    public final C25435OooO0O0 OooO0o(Bitmap bitmap) {
        long j;
        int i;
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            C25739OooO0oo c25739OooO0oo = this.f67263OooO00o;
            synchronized (c25739OooO0oo) {
                int iOooO0Oo = C25767OooO0OO.OooO0Oo(bitmap);
                int i2 = c25739OooO0oo.f87842OooO00o;
                if (i2 < c25739OooO0oo.f87844OooO0OO) {
                    long j2 = c25739OooO0oo.f87843OooO0O0 + ((long) iOooO0Oo);
                    if (j2 <= c25739OooO0oo.f87845OooO0Oo) {
                        c25739OooO0oo.f87842OooO00o = i2 + 1;
                        c25739OooO0oo.f87843OooO0O0 = j2;
                        return AbstractC25434OooO00o.o0Oo0oo(bitmap, this.f67263OooO00o.f87846OooO0o0, AbstractC25434OooO00o.f86711OooOoo0);
                    }
                }
                C25767OooO0OO.OooO0Oo(bitmap);
                bitmap.recycle();
                Locale locale = Locale.US;
                C25739OooO0oo c25739OooO0oo2 = this.f67263OooO00o;
                synchronized (c25739OooO0oo2) {
                    int i3 = c25739OooO0oo2.f87842OooO00o;
                }
                C25739OooO0oo c25739OooO0oo3 = this.f67263OooO00o;
                synchronized (c25739OooO0oo3) {
                    j = c25739OooO0oo3.f87843OooO0O0;
                }
                C25739OooO0oo c25739OooO0oo4 = this.f67263OooO00o;
                synchronized (c25739OooO0oo4) {
                    i = c25739OooO0oo4.f87844OooO0OO;
                }
                int iOooO0O0 = this.f67263OooO00o.OooO0O0();
                ?? byteArray = ByteArrayOutputStream.toByteArray();
                byteArray.append(j);
                byteArray.append(" bytes. The current pool max count is ");
                byteArray.append(i);
                byteArray.append(", the current pool max size is ");
                byteArray.append(iOooO0O0);
                byteArray.append(" bytes.");
                throw new C25655OooO0o0(byteArray.toString());
            }
        } catch (Exception e) {
            bitmap.recycle();
            C24969OooOO0.OooO0o(e);
            throw null;
        }
    }
}
