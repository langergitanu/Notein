package o00OooOO;

import android.graphics.Bitmap;
import android.util.Log;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00OooOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25160OooO0oo implements InterfaceC25155OooO0O0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Bitmap.Config f85635OooOO0 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f85636OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f85637OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Set<Bitmap.Config> f85638OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f85639OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f85640OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f85641OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f85642OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f85643OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f85644OooO0oo;

    /* JADX INFO: renamed from: o00OooOO.OooO0oo$OooO00o */
    public static final class OooO00o {
    }

    public C25160OooO0oo(long j) {
        OooOO0 oooOO02 = new OooOO0();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f85640OooO0Oo = j;
        this.f85637OooO00o = oooOO02;
        this.f85638OooO0O0 = setUnmodifiableSet;
        this.f85639OooO0OO = new OooO00o();
    }

    @Override // o00OooOO.InterfaceC25155OooO0O0
    public final synchronized void OooO00o(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f85637OooO00o.getClass();
                if (C25316OooOO0o.OooO0OO(bitmap) <= this.f85640OooO0Oo && this.f85638OooO0O0.contains(bitmap.getConfig())) {
                    this.f85637OooO00o.getClass();
                    int iOooO0OO = C25316OooOO0o.OooO0OO(bitmap);
                    this.f85637OooO00o.OooO0o0(bitmap);
                    this.f85639OooO0OO.getClass();
                    this.f85644OooO0oo++;
                    this.f85642OooO0o0 += (long) iOooO0OO;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                        this.f85637OooO00o.getClass();
                        sb.append(OooOO0.OooO0OO(C25316OooOO0o.OooO0OO(bitmap), bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb.toString());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        OooO0o();
                    }
                    OooO0oo(this.f85640OooO0Oo);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f85637OooO00o.getClass();
                sb2.append(OooOO0.OooO0OO(C25316OooOO0o.OooO0OO(bitmap), bitmap.getConfig()));
                sb2.append(", is mutable: ");
                sb2.append(bitmap.isMutable());
                sb2.append(", is allowed config: ");
                sb2.append(this.f85638OooO0O0.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb2.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o00OooOO.InterfaceC25155OooO0O0
    public final Bitmap OooO0O0(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0oO = OooO0oO(i, i2, config);
        if (bitmapOooO0oO != null) {
            return bitmapOooO0oO;
        }
        if (config == null) {
            config = f85635OooOO0;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // o00OooOO.InterfaceC25155OooO0O0
    public final void OooO0OO(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            C22236OooO0Oo.OooO00o(i, "trimMemory, level=", "LruBitmapPool");
        }
        if (i >= 40 || i >= 20) {
            OooO0Oo();
        } else if (i >= 20 || i == 15) {
            OooO0oo(this.f85640OooO0Oo / 2);
        }
    }

    @Override // o00OooOO.InterfaceC25155OooO0O0
    public final void OooO0Oo() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        OooO0oo(0L);
    }

    public final void OooO0o() {
        Log.v("LruBitmapPool", "Hits=" + this.f85641OooO0o + ", misses=" + this.f85643OooO0oO + ", puts=" + this.f85644OooO0oo + ", evictions=" + this.f85636OooO + ", currentSize=" + this.f85642OooO0o0 + ", maxSize=" + this.f85640OooO0Oo + "\nStrategy=" + this.f85637OooO00o);
    }

    @Override // o00OooOO.InterfaceC25155OooO0O0
    public final Bitmap OooO0o0(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0oO = OooO0oO(i, i2, config);
        if (bitmapOooO0oO != null) {
            bitmapOooO0oO.eraseColor(0);
            return bitmapOooO0oO;
        }
        if (config == null) {
            config = f85635OooOO0;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized Bitmap OooO0oO(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0O0;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapOooO0O0 = this.f85637OooO00o.OooO0O0(i, i2, config != null ? config : f85635OooOO0);
            if (bitmapOooO0O0 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f85637OooO00o.getClass();
                    sb.append(OooOO0.OooO0OO(C25316OooOO0o.OooO0Oo(config) * i * i2, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f85643OooO0oO++;
            } else {
                this.f85641OooO0o++;
                long j = this.f85642OooO0o0;
                this.f85637OooO00o.getClass();
                this.f85642OooO0o0 = j - ((long) C25316OooOO0o.OooO0OO(bitmapOooO0O0));
                this.f85639OooO0OO.getClass();
                bitmapOooO0O0.setHasAlpha(true);
                bitmapOooO0O0.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f85637OooO00o.getClass();
                sb2.append(OooOO0.OooO0OO(C25316OooOO0o.OooO0Oo(config) * i * i2, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                OooO0o();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapOooO0O0;
    }

    public final synchronized void OooO0oo(long j) {
        while (this.f85642OooO0o0 > j) {
            try {
                OooOO0 oooOO02 = this.f85637OooO00o;
                Bitmap bitmapOooO0OO = oooOO02.f85651OooO0O0.OooO0OO();
                if (bitmapOooO0OO != null) {
                    oooOO02.OooO00o(Integer.valueOf(C25316OooOO0o.OooO0OO(bitmapOooO0OO)), bitmapOooO0OO);
                }
                if (bitmapOooO0OO == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        OooO0o();
                    }
                    this.f85642OooO0o0 = 0L;
                    return;
                }
                this.f85639OooO0OO.getClass();
                long j2 = this.f85642OooO0o0;
                this.f85637OooO00o.getClass();
                this.f85642OooO0o0 = j2 - ((long) C25316OooOO0o.OooO0OO(bitmapOooO0OO));
                this.f85636OooO++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f85637OooO00o.getClass();
                    sb.append(OooOO0.OooO0OO(C25316OooOO0o.OooO0OO(bitmapOooO0OO), bitmapOooO0OO.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    OooO0o();
                }
                bitmapOooO0OO.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
