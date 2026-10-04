package com.aspose.slides.p559ms.backend.android.System.Drawing;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.core.view.ViewCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p222k9.C5655x1;
import com.aspose.slides.internal.p226kf.InterfaceC5669k4;
import com.aspose.slides.internal.p282mu.C6541k4;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p490x2.C12372k4;
import com.aspose.slides.internal.p499xh.C12527kk;
import com.aspose.slides.internal.p555zp.C13629k4;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4;

/* JADX INFO: renamed from: com.aspose.slides.ms.backend.android.System.Drawing.to */
/* JADX INFO: loaded from: classes5.dex */
public class C14137to implements InterfaceC14122k4<Canvas, Bitmap> {

    /* JADX INFO: renamed from: h4 */
    private InterfaceC1565x1 f47409h4;

    /* JADX INFO: renamed from: k4 */
    private Canvas f47410k4;

    /* JADX INFO: renamed from: to */
    private boolean f47413to = false;

    /* JADX INFO: renamed from: du */
    private boolean f47407du = false;

    /* JADX INFO: renamed from: m9 */
    private AbstractC14071k4<C12003du> f47412m9 = new AbstractC14071k4<C12003du>() { // from class: com.aspose.slides.ms.backend.android.System.Drawing.to.4
        @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void invoke(C12003du c12003du) {
            C14137to.this.f47410k4.drawColor(c12003du.m56506h4());
        }
    };

    /* JADX INFO: renamed from: dy */
    private AbstractC14071k4<InterfaceC1565x1> f47408dy = new AbstractC14071k4<InterfaceC1565x1>() { // from class: com.aspose.slides.ms.backend.android.System.Drawing.to.5
        @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void invoke(InterfaceC1565x1 interfaceC1565x1) {
            C14137to.this.f47410k4.drawPath(C13629k4.m62888kk(interfaceC1565x1), C14137to.this.f47414x1);
        }
    };

    /* JADX INFO: renamed from: x1 */
    private Paint f47414x1 = new Paint();

    /* JADX INFO: renamed from: kk */
    private Paint f47411kk = new Paint();

    public C14137to(Canvas canvas) {
        this.f47410k4 = canvas;
    }

    /* JADX INFO: renamed from: du */
    private InterfaceC1565x1 m67673du(InterfaceC1565x1 interfaceC1565x1) {
        if (interfaceC1565x1 == null) {
            return null;
        }
        C11913yj c11913yjMo67596kk = mo67596kk();
        if (c11913yjMo67596kk.m55778kk()) {
            c11913yjMo67596kk.m55780m9();
        } else {
            c11913yjMo67596kk = new C11913yj();
        }
        return C6541k4.m26346k4(c11913yjMo67596kk, interfaceC1565x1);
    }

    /* JADX INFO: renamed from: k4 */
    private Bitmap m67674k4(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapM57956k4 = C12372k4.m57956k4(width + 2, height + 2, bitmap.getConfig());
        bitmapM57956k4.eraseColor(0);
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        bitmapM57956k4.setPixels(iArr, 0, width, 1, 1, width, height);
        return bitmapM57956k4;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m67686c5() {
        return this.f47413to;
    }

    /* JADX INFO: renamed from: dy */
    public Paint m67687dy() {
        return this.f47414x1;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: h4 */
    public InterfaceC1565x1 mo67586h4() {
        return m67673du(this.f47409h4);
    }

    /* JADX INFO: renamed from: jd */
    public boolean m67688jd() {
        return this.f47407du;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public Canvas mo67588k4() {
        return this.f47410k4;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: to */
    public int mo67599to() {
        return this.f47410k4.getDensity();
    }

    /* JADX INFO: renamed from: m9 */
    private Shader.TileMode[] m67683m9(int i) {
        if (i == 0) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            return new Shader.TileMode[]{tileMode, tileMode};
        }
        if (i == 1) {
            return new Shader.TileMode[]{Shader.TileMode.MIRROR, Shader.TileMode.REPEAT};
        }
        if (i == 2) {
            return new Shader.TileMode[]{Shader.TileMode.REPEAT, Shader.TileMode.MIRROR};
        }
        if (i != 3) {
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            return new Shader.TileMode[]{tileMode2, tileMode2};
        }
        Shader.TileMode tileMode3 = Shader.TileMode.MIRROR;
        return new Shader.TileMode[]{tileMode3, tileMode3};
    }

    /* JADX INFO: renamed from: to */
    private InterfaceC1565x1 m67684to(InterfaceC1565x1 interfaceC1565x1) {
        if (interfaceC1565x1 == null) {
            return null;
        }
        return C6541k4.m26346k4(mo67596kk(), interfaceC1565x1);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: du */
    public void mo67584du() {
        this.f47410k4 = null;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: h4 */
    public void mo67587h4(int i) {
        if (i == 0) {
            this.f47413to = true;
            this.f47407du = false;
            return;
        }
        if (i == 1) {
            this.f47413to = false;
            this.f47407du = false;
            return;
        }
        if (i == 2) {
            this.f47413to = false;
            this.f47407du = true;
            return;
        }
        if (i == 3) {
            this.f47413to = true;
            this.f47407du = false;
        } else if (i == 4) {
            this.f47413to = true;
            this.f47407du = true;
        } else {
            if (i != 5) {
                return;
            }
            this.f47413to = true;
            this.f47407du = true;
        }
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: kk */
    public C11913yj mo67596kk() {
        return C11913yj.m55750k4(this.f47410k4.getMatrix());
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: x1 */
    public InterfaceC5669k4 mo67601x1() {
        return new C5655x1(this);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: du */
    public void mo67585du(int i) {
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: kk */
    public void mo67597kk(int i) {
        Paint paint;
        boolean z = true;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
                paint = this.f47411kk;
                break;
            case 5:
                paint = this.f47411kk;
                z = false;
                break;
            default:
                throw new ArgumentException("interpolationMode");
        }
        paint.setFilterBitmap(z);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: to */
    public void mo67600to(int i) {
        this.f47414x1.setAntiAlias(i == 2 || i == 4);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: x1 */
    public void mo67602x1(int i) {
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: k4 */
    public void mo67589k4(int i) {
        this.f47414x1.setXfermode(new PorterDuffXfermode(i == 1 ? PorterDuff.Mode.SRC : PorterDuff.Mode.SRC_OVER));
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: kk */
    public void mo67598kk(InterfaceC1565x1 interfaceC1565x1) {
        this.f47414x1.setStyle(Paint.Style.FILL);
        m67681k4(this.f47408dy, interfaceC1565x1);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: x1 */
    public void mo67603x1(InterfaceC1565x1 interfaceC1565x1) {
        this.f47414x1.setStyle(Paint.Style.STROKE);
        m67681k4(this.f47408dy, interfaceC1565x1);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: k4 */
    public void mo67590k4(InterfaceC1565x1 interfaceC1565x1) {
        this.f47409h4 = m67684to(interfaceC1565x1);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: x1 */
    public void mo67604x1(C11913yj c11913yj) {
        C11913yj c11913yjMo67596kk = mo67596kk();
        c11913yjMo67596kk.m55787x1(c11913yj);
        mo67593k4(c11913yjMo67596kk);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: k4 */
    public void mo67591k4(InterfaceC2624k4<Bitmap> interfaceC2624k4, final int i, final int i2, final int i3, final int i4) {
        m67681k4(new AbstractC14071k4<Bitmap>() { // from class: com.aspose.slides.ms.backend.android.System.Drawing.to.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void invoke(Bitmap bitmap) {
                Canvas canvas = C14137to.this.f47410k4;
                Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                int i5 = i;
                int i6 = i2;
                canvas.drawBitmap(bitmap, rect, new Rect(i5, i6, i3 + i5, i4 + i6), C14137to.this.f47411kk);
            }
        }, interfaceC2624k4.mo11984k4());
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: k4 */
    public void mo67592k4(InterfaceC2624k4<Bitmap> interfaceC2624k4, final C11913yj c11913yj) {
        m67681k4(new AbstractC14071k4<Bitmap>() { // from class: com.aspose.slides.ms.backend.android.System.Drawing.to.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public void invoke(Bitmap bitmap) {
                C14137to.this.f47410k4.drawBitmap(bitmap, (Matrix) c11913yj.m55781ne(), C14137to.this.f47411kk);
            }
        }, interfaceC2624k4.mo11984k4());
    }

    /* JADX INFO: renamed from: k4 */
    private void m67676k4(C11900jd c11900jd) {
        m67680k4(c11900jd.m55649c5());
    }

    /* JADX INFO: renamed from: k4 */
    private void m67677k4(C11906rv c11906rv) {
        m67680k4(c11906rv.m55683du(mo67596kk()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m67678k4(C11909up c11909up) {
        if (c11909up.m55732m9()) {
            m67680k4(c11909up.m55720du(mo67596kk()));
            return;
        }
        C12527kk c12527kkM55739x6 = c11909up.m55739x6();
        Shader.TileMode tileMode = c11909up.m55722fa() == 0 ? Shader.TileMode.REPEAT : Shader.TileMode.MIRROR;
        Matrix matrix = (Matrix) c11909up.m55719ck().m55781ne();
        C12003du[] c12003duArrM58307to = c12527kkM55739x6.m58307to();
        int[] iArr = new int[c12003duArrM58307to.length];
        for (int i = 0; i < c12003duArrM58307to.length; i++) {
            iArr[i] = c12003duArrM58307to[i].m56506h4();
        }
        LinearGradient linearGradient = new LinearGradient(c12527kkM55739x6.m58305k4().m56897x1(), c12527kkM55739x6.m58305k4().m56895kk(), c12527kkM55739x6.m58308x1().m56897x1(), c12527kkM55739x6.m58308x1().m56895kk(), iArr, c12527kkM55739x6.m58306kk(), tileMode);
        linearGradient.setLocalMatrix(matrix);
        this.f47414x1.setShader(linearGradient);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: k4 */
    public void mo67593k4(C11913yj c11913yj) {
        this.f47410k4.setMatrix((Matrix) c11913yj.m55781ne());
    }

    /* JADX INFO: renamed from: k4 */
    private void m67679k4(C11999ar c11999ar) {
        this.f47414x1.setColor(c11999ar.m56305h4().m56506h4());
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: k4 */
    public void mo67594k4(C12003du c12003du) {
        m67681k4(this.f47412m9, c12003du);
    }

    /* JADX INFO: renamed from: k4 */
    private void m67680k4(C12012lr c12012lr) {
        AbstractC12002ck abstractC12002ckM56619h4 = c12012lr.m56619h4();
        if (abstractC12002ckM56619h4 instanceof C3989up) {
            abstractC12002ckM56619h4 = ((C3989up) abstractC12002ckM56619h4).m15759x1();
        }
        Bitmap bitmapM67674k4 = (Bitmap) ((C12009k4) abstractC12002ckM56619h4).m56607kk();
        Matrix matrix = (Matrix) c12012lr.m56624m9().m55781ne();
        if (c12012lr.m56618dy() == 4) {
            bitmapM67674k4 = m67674k4(bitmapM67674k4);
            matrix.preTranslate(-1.0f, -1.0f);
        }
        Shader.TileMode[] tileModeArrM67683m9 = m67683m9(c12012lr.m56618dy());
        BitmapShader bitmapShader = new BitmapShader(bitmapM67674k4, tileModeArrM67683m9[0], tileModeArrM67683m9[1]);
        bitmapShader.setLocalMatrix(matrix);
        this.f47414x1.setShader(bitmapShader);
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14122k4
    /* JADX INFO: renamed from: k4 */
    public void mo67595k4(AbstractC12024x1 abstractC12024x1) {
        this.f47414x1.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f47414x1.setShader(null);
        if (abstractC12024x1 instanceof C11999ar) {
            m67679k4((C11999ar) abstractC12024x1);
            return;
        }
        if (abstractC12024x1 instanceof C11909up) {
            m67678k4((C11909up) abstractC12024x1);
            return;
        }
        if (abstractC12024x1 instanceof C11906rv) {
            m67677k4((C11906rv) abstractC12024x1);
        } else if (abstractC12024x1 instanceof C11900jd) {
            m67676k4((C11900jd) abstractC12024x1);
        } else if (abstractC12024x1 instanceof C12012lr) {
            m67680k4((C12012lr) abstractC12024x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private <T> void m67681k4(AbstractC14071k4<T> abstractC14071k4, T t) {
        if (this.f47409h4 == null) {
            abstractC14071k4.invoke(t);
            return;
        }
        try {
            this.f47410k4.save();
            this.f47410k4.clipPath(C13629k4.m62888kk(mo67586h4()));
            abstractC14071k4.invoke(t);
        } finally {
            this.f47410k4.restore();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m67689k4(final String str, final int i, final int i2, final float f, final float f2, final TextPaint textPaint) {
        m67681k4(new AbstractC14071k4<Object>() { // from class: com.aspose.slides.ms.backend.android.System.Drawing.to.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
            public void invoke(Object obj) {
                C14137to.this.f47410k4.drawText(str, i, i2, f, f2, (Paint) textPaint);
            }
        }, (Object) null);
    }
}
