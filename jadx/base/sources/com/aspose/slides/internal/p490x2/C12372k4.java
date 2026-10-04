package com.aspose.slides.internal.p490x2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import androidx.core.view.ViewCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p066cl.InterfaceC2623jd;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p066cl.InterfaceC2626m9;
import com.aspose.slides.internal.p066cl.InterfaceC2628x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import java.util.Hashtable;

/* JADX INFO: renamed from: com.aspose.slides.internal.x2.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12372k4 implements InterfaceC2624k4<Bitmap> {

    /* JADX INFO: renamed from: k4 */
    private Bitmap f41353k4 = null;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC2626m9 f41356x1 = null;

    /* JADX INFO: renamed from: kk */
    private C12369du f41354kk = null;

    /* JADX INFO: renamed from: to */
    private C12376x1 f41355to = null;

    /* JADX INFO: renamed from: du */
    private int f41352du = 0;

    /* JADX INFO: renamed from: com.aspose.slides.internal.x2.k4$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ int[] f41357k4;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f41357k4 = iArr;
            try {
                iArr[Bitmap.Config.RGB_565.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41357k4[Bitmap.Config.ARGB_8888.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41357k4[Bitmap.Config.ALPHA_8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41357k4[Bitmap.Config.ARGB_4444.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41357k4[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41357k4[Bitmap.Config.HARDWARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: c5 */
    public void mo11973c5() {
        C12369du c12369du = this.f41354kk;
        if (c12369du != null) {
            c12369du.mo11972x1().mo11997x1();
        }
        this.f41354kk = null;
        this.f41355to = null;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: ck */
    public void mo11974ck() {
        C12369du c12369du = this.f41354kk;
        if (c12369du != null) {
            c12369du.mo11972x1().mo11995k4();
            this.f41354kk.mo11972x1().mo11997x1();
        }
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: du */
    public int mo11975du() {
        return mo57952yj().getWidth();
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: dy */
    public boolean mo11976dy() {
        return true;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: fa */
    public InterfaceC2623jd mo11977fa() {
        return this.f41354kk;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: h4 */
    public int mo11978h4() {
        return mo57952yj().getHeight();
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: jd */
    public void mo11979jd() {
        this.f41354kk = new C12369du(mo57952yj());
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: k4 */
    public int mo11980k4(int i, int i2) {
        int pixel = mo57952yj().getPixel(i, i2);
        return this.f41352du == 139273 ? pixel | ViewCompat.MEASURED_STATE_MASK : pixel;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: kk */
    public float mo11988kk() {
        return mo57952yj().getDensity();
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: ks, reason: merged with bridge method [inline-methods] */
    public Bitmap mo11984k4() {
        return mo57952yj();
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: m9 */
    public InterfaceC2626m9 mo11989m9() {
        return this.f41356x1;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: to */
    public int mo11990to() {
        int i = this.f41352du;
        return i != 0 ? i : m57954h4(mo57952yj());
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: up */
    public InterfaceC2628x1 mo11991up() {
        return this.f41355to;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: x1 */
    public float mo11992x1() {
        return mo57952yj().getDensity();
    }

    /* JADX INFO: renamed from: yj */
    public Bitmap mo57952yj() {
        return this.f41353k4;
    }

    /* JADX INFO: renamed from: du */
    private boolean m57953du(Bitmap bitmap) {
        if (bitmap.isMutable()) {
            return (bitmap.getConfig() == Bitmap.Config.ARGB_8888 || bitmap.getConfig() == Bitmap.Config.RGB_565) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    private static int m57954h4(Bitmap bitmap) {
        int i = AnonymousClass1.f41357k4[bitmap.getConfig().ordinal()];
        if (i == 1) {
            return 135174;
        }
        if (i != 2) {
            return 0;
        }
        return bitmap.isPremultiplied() ? 925707 : 2498570;
    }

    /* JADX INFO: renamed from: k4 */
    private static Bitmap.Config m57955k4(int i) {
        return i != 135174 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
    }

    /* JADX INFO: renamed from: kk */
    private static Bitmap m57959kk(Bitmap bitmap) {
        Bitmap bitmapM57956k4 = m57956k4(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        bitmapM57956k4.setDensity(bitmap.getDensity());
        return bitmapM57956k4;
    }

    /* JADX INFO: renamed from: to */
    private Bitmap m57961to(Bitmap bitmap) {
        if (!m57953du(bitmap)) {
            return bitmap;
        }
        if (bitmap.getConfig() != Bitmap.Config.RGB_565) {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int[] iArr = new int[width * height];
                bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                Bitmap bitmapM57956k4 = m57956k4(width, height, config2);
                bitmapM57956k4.setPixels(iArr, 0, width, 0, 0, width, height);
                return bitmapM57956k4;
            }
        }
        return bitmap.copy(bitmap.getConfig(), true);
    }

    /* JADX INFO: renamed from: x1 */
    public static Bitmap m57962x1(int i, int i2, int i3) {
        return m57956k4(i, i2, m57955k4(i3));
    }

    /* JADX INFO: renamed from: k4 */
    public static Bitmap m57956k4(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        bitmapCreateBitmap.setDensity(C4375kk.m17634x1());
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: kk */
    public static C12372k4 m57960kk(int i, int i2, int i3) {
        C12372k4 c12372k4 = new C12372k4();
        c12372k4.m57964x1(m57956k4(i, i2, m57955k4(i3)));
        c12372k4.f41352du = i3;
        return c12372k4;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: x1 */
    public InterfaceC2624k4 mo11993x1(int i, int i2) {
        Bitmap bitmapMo57952yj = mo57952yj();
        return m57957k4(bitmapMo57952yj.getWidth() != i || bitmapMo57952yj.getHeight() != i2 ? Bitmap.createScaledBitmap(bitmapMo57952yj, i, i2, true) : bitmapMo57952yj.copy(bitmapMo57952yj.getConfig(), true));
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC2624k4 mo11981k4(int i, int i2, int i3, int i4) {
        Bitmap bitmapMo57952yj = mo57952yj();
        if (i == 0 && i2 == 0 && bitmapMo57952yj.getWidth() == i3 && bitmapMo57952yj.getHeight() == i4) {
            return mo11983k4((Hashtable) null);
        }
        Bitmap bitmapM57956k4 = m57956k4(i3, i4, bitmapMo57952yj.getConfig());
        new Paint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Canvas(bitmapM57956k4).drawBitmap(bitmapMo57952yj, new Rect(i, i2, i3, i4), new Rect(0, 0, i3, i4), (Paint) null);
        return m57957k4(bitmapM57956k4);
    }

    /* JADX INFO: renamed from: x1 */
    public void m57964x1(Bitmap bitmap) {
        Bitmap bitmapM57961to = m57961to(bitmap);
        this.f41353k4 = bitmapM57961to;
        bitmapM57961to.setDensity(C4375kk.m17634x1());
        this.f41355to = new C12376x1(this.f41353k4);
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC2624k4 mo11982k4(C11913yj c11913yj) {
        if (c11913yj.m55789x1()) {
            return mo11983k4((Hashtable) null);
        }
        Bitmap bitmapMo57952yj = mo57952yj();
        Bitmap bitmapM57959kk = m57959kk(bitmapMo57952yj);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Canvas(bitmapM57959kk).drawBitmap(bitmapMo57952yj, (Matrix) c11913yj.m55781ne(), paint);
        return m57957k4(bitmapM57959kk);
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC2624k4 mo11983k4(Hashtable hashtable) {
        Bitmap bitmapMo57952yj = mo57952yj();
        return m57957k4(bitmapMo57952yj.copy(bitmapMo57952yj.getConfig(), true));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12372k4 m57957k4(Bitmap bitmap) {
        C12372k4 c12372k4 = new C12372k4();
        c12372k4.m57964x1(bitmap);
        c12372k4.f41352du = m57954h4(c12372k4.f41353k4);
        return c12372k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12372k4 m57958k4(AbstractC3150x6 abstractC3150x6) {
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(abstractC3150x6.toInputStream());
        if (bitmapDecodeStream == null) {
            throw new ArgumentException("Error loading file: Unsupported file format", "input");
        }
        C12372k4 c12372k4 = new C12372k4();
        c12372k4.m57964x1(bitmapDecodeStream);
        c12372k4.f41352du = m57954h4(c12372k4.f41353k4);
        return c12372k4;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: k4 */
    public void mo11985k4(int i, int i2, int i3) {
        mo57952yj().setPixel(i, i2, i3);
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: k4 */
    public void mo11986k4(InterfaceC2626m9 interfaceC2626m9) {
        this.f41356x1 = interfaceC2626m9;
    }

    @Override // com.aspose.slides.internal.p066cl.InterfaceC2624k4
    /* JADX INFO: renamed from: k4 */
    public void mo11987k4(int[] iArr, int i, int i2, int i3, int i4) {
        mo57952yj().setPixels(iArr, 0, i3, i, i2, i3, i4);
    }
}
