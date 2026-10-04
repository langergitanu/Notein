package o00ooO0O;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import androidx.core.util.Pools;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o00o00O0.C25252OooO0Oo;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25435OooO0O0;
import o00o0o0o.C25444OooO0O0;
import o00o0o0o.InterfaceC25449OooO0oO;
import o00o0oO.C25452OooO00o;
import o00o0oO.C25453OooO0O0;
import o00oOoOo.C25622OooO0O0;
import o00oOoOo.C25623OooO0OO;
import o00oo.C25638OooO0oO;
import o00oo0OO.C25683OooO0OO;
import o00ooO0.C25742OooOOo;
import o00ooO0.OooOO0;

/* JADX INFO: renamed from: o00ooO0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25760OooO00o implements InterfaceC25762OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final byte[] f87905OooO0Oo = {-1, -39};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f87906OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PreverificationHelper f87907OooO0O0 = new PreverificationHelper();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Pools.Pool<ByteBuffer> f87908OooO0OO;

    public AbstractC25760OooO00o(OooOO0 oooOO02, Pools.Pool<ByteBuffer> pool, C25252OooO0Oo c25252OooO0Oo) {
        this.f87906OooO00o = oooOO02;
        if (oooOO02 instanceof C25742OooOOo) {
            c25252OooO0Oo.getClass();
        }
        this.f87908OooO0OO = pool;
    }

    public static BitmapFactory.Options OooO0o0(C25638OooO0oO c25638OooO0oO, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = c25638OooO0oO.f87506OooOoo;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z = config == Bitmap.Config.HARDWARE;
        if (!z) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        BitmapFactory.decodeStream(c25638OooO0oO.OooOOoo(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        if (z) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // o00ooO0O.InterfaceC25762OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC25434OooO00o OooO00o(C25638OooO0oO c25638OooO0oO, Bitmap.Config config, int i, ColorSpace colorSpace) {
        boolean z;
        C25623OooO0OO c25623OooO0OO = c25638OooO0oO.f87501OooOo;
        if (c25623OooO0OO == C25622OooO0O0.f87441OooO00o || c25623OooO0OO == C25622OooO0O0.f87451OooOO0o) {
            AbstractC25434OooO00o<InterfaceC25449OooO0oO> abstractC25434OooO00o = c25638OooO0oO.f87502OooOo0o;
            abstractC25434OooO00o.getClass();
            InterfaceC25449OooO0oO interfaceC25449OooO0oOOooo000 = abstractC25434OooO00o.Oooo000();
            z = i >= 2 && interfaceC25449OooO0oOOooo000.OooOOO(i + (-2)) == -1 && interfaceC25449OooO0oOOooo000.OooOOO(i + (-1)) == -39;
        }
        BitmapFactory.Options optionsOooO0o0 = OooO0o0(c25638OooO0oO, config);
        InputStream inputStreamOooOOoo = c25638OooO0oO.OooOOoo();
        inputStreamOooOOoo.getClass();
        if (c25638OooO0oO.OooOooo() > i) {
            inputStreamOooOOoo = new C25452OooO00o(inputStreamOooOOoo, i);
        }
        if (!z) {
            inputStreamOooOOoo = new C25453OooO0O0(inputStreamOooOOoo, f87905OooO0Oo);
        }
        boolean z2 = optionsOooO0o0.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                C25435OooO0O0 c25435OooO0O0OooO0OO = OooO0OO(inputStreamOooOOoo, optionsOooO0o0, colorSpace);
                try {
                    return c25435OooO0O0OooO0OO;
                } catch (IOException e) {
                    return c25435OooO0O0OooO0OO;
                }
            } catch (RuntimeException e2) {
                if (!z2) {
                    throw e2;
                }
                AbstractC25434OooO00o abstractC25434OooO00oOooO00o = OooO00o(c25638OooO0oO, Bitmap.Config.ARGB_8888, i, colorSpace);
                try {
                    inputStreamOooOOoo.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return abstractC25434OooO00oOooO00o;
            }
        } finally {
            try {
                inputStreamOooOOoo.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }

    @Override // o00ooO0O.InterfaceC25762OooO0OO
    public final AbstractC25434OooO00o OooO0O0(C25638OooO0oO c25638OooO0oO, Bitmap.Config config) {
        BitmapFactory.Options optionsOooO0o0 = OooO0o0(c25638OooO0oO, config);
        boolean z = optionsOooO0o0.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStreamOooOOoo = c25638OooO0oO.OooOOoo();
            inputStreamOooOOoo.getClass();
            return OooO0OO(inputStreamOooOOoo, optionsOooO0o0, null);
        } catch (RuntimeException e) {
            if (z) {
                return OooO0O0(c25638OooO0oO, Bitmap.Config.ARGB_8888);
            }
            throw e;
        }
    }

    public final C25435OooO0O0 OooO0OO(InputStream inputStream, BitmapFactory.Options options, ColorSpace colorSpace) {
        Bitmap bitmap;
        AbstractC25434OooO00o.OooO0O0 oooO0O0 = AbstractC25434OooO00o.f86711OooOoo0;
        int i = options.outWidth;
        int i2 = options.outHeight;
        PreverificationHelper preverificationHelper = this.f87907OooO0O0;
        boolean z = preverificationHelper != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        OooOO0 oooOO02 = this.f87906OooO00o;
        if (z) {
            options.inMutable = false;
            bitmap = null;
        } else {
            bitmap = oooOO02.get(OooO0Oo(i, i2, options));
            if (bitmap == null) {
                throw new NullPointerException("BitmapPool.get returned null");
            }
        }
        options.inBitmap = bitmap;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        Pools.Pool<ByteBuffer> pool = this.f87908OooO0OO;
        ByteBuffer byteBufferAcquire = pool.acquire();
        if (byteBufferAcquire == null) {
            C25444OooO0O0.OooO00o oooO00o = C25444OooO0O0.f86726OooO00o;
            byteBufferAcquire = ByteBuffer.allocate(16384);
        }
        try {
            try {
                options.inTempStorage = byteBufferAcquire.array();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                pool.release(byteBufferAcquire);
                if (bitmap == null || bitmap == bitmapDecodeStream) {
                    return AbstractC25434OooO00o.o0Oo0oo(bitmapDecodeStream, oooOO02, oooO0O0);
                }
                oooOO02.release(bitmap);
                if (bitmapDecodeStream != null) {
                    bitmapDecodeStream.recycle();
                }
                throw new IllegalStateException();
            } catch (IllegalArgumentException e) {
                if (bitmap != null) {
                    oooOO02.release(bitmap);
                }
                try {
                    inputStream.reset();
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream2 == null) {
                        throw e;
                    }
                    C25435OooO0O0 c25435OooO0O0O0Oo0oo = AbstractC25434OooO00o.o0Oo0oo(bitmapDecodeStream2, C25683OooO0OO.OooO00o(), oooO0O0);
                    pool.release(byteBufferAcquire);
                    return c25435OooO0O0O0Oo0oo;
                } catch (IOException unused) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (bitmap != null) {
                    oooOO02.release(bitmap);
                }
                throw e2;
            }
        } catch (Throwable th) {
            pool.release(byteBufferAcquire);
            throw th;
        }
    }

    public abstract int OooO0Oo(int i, int i2, BitmapFactory.Options options);
}
