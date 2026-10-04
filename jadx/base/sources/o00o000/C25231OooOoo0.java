package o00o000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: renamed from: o00o000.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25231OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Paint f85940OooO00o = new Paint(6);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Paint f85941OooO0O0 = new Paint(7);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Paint f85942OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Lock f85943OooO0Oo;

    /* JADX INFO: renamed from: o00o000.OooOoo0$OooO00o */
    public static final class OooO00o implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        f85943OooO0Oo = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new OooO00o();
        Paint paint = new Paint(7);
        f85942OooO0OO = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void OooO00o(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f85943OooO0Oo;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f85940OooO00o);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap OooO0O0(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapOooO0o0 = interfaceC25155OooO0O0.OooO0o0((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                bitmapOooO0o0.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    Log.v("TransformationUtils", "request: " + i + "x" + i2);
                    Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v("TransformationUtils", "toReuse: " + bitmapOooO0o0.getWidth() + "x" + bitmapOooO0o0.getHeight());
                    StringBuilder sb = new StringBuilder("minPct:   ");
                    sb.append(fMin);
                    Log.v("TransformationUtils", sb.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                OooO00o(bitmap, bitmapOooO0o0, matrix);
                return bitmapOooO0o0;
            }
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static Bitmap OooO0OO(Bitmap bitmap, InterfaceC25155OooO0O0 interfaceC25155OooO0O0) {
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (config.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapOooO0o0 = interfaceC25155OooO0O0.OooO0o0(bitmap.getWidth(), bitmap.getHeight(), config);
        new Canvas(bitmapOooO0o0).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapOooO0o0;
    }

    public static Bitmap OooO0Oo(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, Bitmap bitmap, int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                switch (i) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                matrix.mapRect(rectF);
                Bitmap bitmapOooO0o0 = interfaceC25155OooO0O0.OooO0o0(Math.round(rectF.width()), Math.round(rectF.height()), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                matrix.postTranslate(-rectF.left, -rectF.top);
                bitmapOooO0o0.setHasAlpha(bitmap.hasAlpha());
                OooO00o(bitmap, bitmapOooO0o0, matrix);
                return bitmapOooO0o0;
            default:
                return bitmap;
        }
    }
}
