package o00ooOO;

import OooOoOO.C20519OooO0Oo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.util.Pools;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;
import o00o0o0o.C25444OooO0O0;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: o00ooOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25767OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C32447OooOOo f87939OooO00o = C20519OooO0Oo.OooO0OO(new C25765OooO00o(0));

    /* JADX INFO: renamed from: o00ooOO.OooO0OO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f87940OooO00o;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f87940OooO00o = iArr;
        }
    }

    public static final C25768OooO0Oo OooO00o(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C32447OooOOo c32447OooOOo = f87939OooO00o;
        ByteBuffer byteBufferAllocate = (ByteBuffer) ((Pools.SynchronizedPool) c32447OooOOo.getValue()).acquire();
        if (byteBufferAllocate == null) {
            C25444OooO0O0.OooO00o oooO00o = C25444OooO0O0.f86726OooO00o;
            byteBufferAllocate = ByteBuffer.allocate(16384);
            OooOOO0.OooO0o(byteBufferAllocate, "allocate(...)");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferAllocate.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            return new C25768OooO0Oo(options.outWidth, options.outHeight, options.outColorSpace);
        } finally {
            ((Pools.SynchronizedPool) c32447OooOOo.getValue()).release(byteBufferAllocate);
        }
    }

    public static final int OooO0O0(Bitmap.Config config) {
        switch (config == null ? -1 : OooO00o.f87940OooO00o[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [byte[], java.lang.StringBuilder] */
    public static final int OooO0OO(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "width must be > 0, width is: ").toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "height must be > 0, height is: ").toString());
        }
        int iOooO0O0 = OooO0O0(config);
        int i3 = i * i2 * iOooO0O0;
        if (i3 > 0) {
            return i3;
        }
        ?? byteArray = ByteArrayOutputStream.toByteArray();
        byteArray.append(i2);
        byteArray.append(", pixelSize: ");
        byteArray.append(iOooO0O0);
        throw new IllegalStateException(byteArray.toString().toString());
    }

    public static final int OooO0Oo(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
