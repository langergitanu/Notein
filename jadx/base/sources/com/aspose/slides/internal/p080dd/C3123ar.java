package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14058fa;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C3123ar extends AbstractC3124b3 {

    /* JADX INFO: renamed from: k4 */
    public static C3123ar f9257k4 = new C3123ar(AbstractC3150x6.Null, AbstractC6747ar.m26646u4(), 1);

    /* JADX INFO: renamed from: c5 */
    private int f9258c5;

    /* JADX INFO: renamed from: ck */
    private boolean f9259ck;

    /* JADX INFO: renamed from: du */
    private AbstractC6747ar f9260du;

    /* JADX INFO: renamed from: dy */
    private char[] f9261dy;

    /* JADX INFO: renamed from: fa */
    private boolean f9262fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC3150x6 f9263h4;

    /* JADX INFO: renamed from: jd */
    private int f9264jd;

    /* JADX INFO: renamed from: m9 */
    private byte[] f9265m9;

    /* JADX INFO: renamed from: up */
    private boolean f9266up;

    public C3123ar(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, AbstractC6747ar.m26646u4(), 1024);
    }

    /* JADX INFO: renamed from: du */
    private void m13296du() {
        if (!this.f9266up && this.f9258c5 > 0) {
            byte[] bArrMo26655dy = this.f9260du.mo26655dy();
            if (bArrMo26655dy.length > 0) {
                this.f9263h4.write(bArrMo26655dy, 0, bArrMo26655dy.length);
            }
            this.f9266up = true;
        }
        this.f9263h4.write(this.f9265m9, 0, this.f9258c5);
        this.f9258c5 = 0;
    }

    /* JADX INFO: renamed from: h4 */
    private void m13297h4() {
        if (this.f9258c5 > 0) {
            m13296du();
        }
        int i = this.f9264jd;
        if (i > 0) {
            this.f9258c5 += this.f9260du.mo26664k4(this.f9261dy, 0, i, this.f9265m9, this.f9258c5);
            this.f9264jd = 0;
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m13298m9() {
        if (this.f9262fa) {
            throw new ObjectDisposedException("StreamWriter");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3150x6 m13301k4() {
        return this.f9263h4;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: kk */
    public void mo13308kk() {
        m13298m9();
        m13297h4();
        if (this.f9258c5 > 0) {
            m13296du();
            this.f9263h4.flush();
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: to */
    public void mo13309to() {
        mo13311x1(true);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: x1 */
    public AbstractC6747ar mo13310x1() {
        return this.f9260du;
    }

    public C3123ar(AbstractC3150x6 abstractC3150x6, AbstractC6747ar abstractC6747ar) {
        this(abstractC3150x6, abstractC6747ar, 1024);
    }

    /* JADX INFO: renamed from: to */
    private void m13299to(String str) {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            int length2 = this.f9261dy.length - this.f9264jd;
            if (length2 == 0) {
                m13297h4();
                length2 = this.f9261dy.length;
            }
            if (length2 > length) {
                length2 = length;
            }
            for (int i2 = 0; i2 < length2; i2++) {
                this.f9261dy[this.f9264jd + i2] = str.charAt(i2 + i);
            }
            length -= length2;
            i += length2;
            this.f9264jd += length2;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: k4 */
    public void mo13302k4(char c) {
        m13298m9();
        if (this.f9264jd >= this.f9261dy.length) {
            m13297h4();
        }
        char[] cArr = this.f9261dy;
        int i = this.f9264jd;
        this.f9264jd = i + 1;
        cArr[i] = c;
        if (this.f9259ck) {
            mo13308kk();
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: x1 */
    public void mo13311x1(boolean z) {
        RuntimeException e;
        if (this.f9262fa || !z || this.f9263h4 == null) {
            e = null;
        } else {
            try {
                mo13308kk();
                e = null;
            } catch (RuntimeException e2) {
                e = e2;
            }
            this.f9262fa = true;
            try {
                this.f9263h4.close();
            } catch (RuntimeException e3) {
                if (e == null) {
                    e = e3;
                }
            }
        }
        this.f9263h4 = null;
        this.f9265m9 = null;
        this.f9260du = null;
        this.f9261dy = null;
        if (e != null) {
            throw e;
        }
    }

    public C3123ar(AbstractC3150x6 abstractC3150x6, AbstractC6747ar abstractC6747ar, int i) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        if (abstractC6747ar == null) {
            throw new ArgumentNullException("encoding");
        }
        if (i <= 0) {
            throw new ArgumentOutOfRangeException("bufferSize");
        }
        if (!abstractC3150x6.canWrite()) {
            throw new ArgumentException("Can not write to stream");
        }
        this.f9263h4 = abstractC3150x6;
        m13303k4(abstractC6747ar, i);
    }

    /* JADX INFO: renamed from: x1 */
    private void m13300x1(char[] cArr, int i, int i2) {
        while (i2 > 0) {
            int length = this.f9261dy.length - this.f9264jd;
            if (length == 0) {
                m13297h4();
                length = this.f9261dy.length;
            }
            if (length > i2) {
                length = i2;
            }
            C14058fa.m66598k4(cArr, i * 2, this.f9261dy, this.f9264jd * 2, length * 2);
            i2 -= length;
            i += length;
            this.f9264jd += length;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m13303k4(AbstractC6747ar abstractC6747ar, int i) {
        this.f9260du = abstractC6747ar;
        this.f9258c5 = 0;
        this.f9264jd = 0;
        int iMax = Math.max(i, 256);
        this.f9261dy = new char[iMax];
        this.f9265m9 = new byte[abstractC6747ar.mo26620k4(iMax)];
        if (!this.f9263h4.canSeek() || this.f9263h4.getPosition() <= 0) {
            return;
        }
        this.f9266up = true;
    }

    public C3123ar(String str) {
        this(str, false, AbstractC6747ar.m26646u4(), 4096);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: k4 */
    public void mo13304k4(String str) {
        m13298m9();
        if (str != null) {
            m13299to(str);
        }
        if (this.f9259ck) {
            mo13308kk();
        }
    }

    public C3123ar(String str, boolean z) {
        this(str, z, AbstractC6747ar.m26646u4(), 4096);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13305k4(boolean z) {
        this.f9259ck = z;
        if (z) {
            mo13308kk();
        }
    }

    public C3123ar(String str, boolean z, AbstractC6747ar abstractC6747ar) {
        this(str, z, abstractC6747ar, 4096);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: k4 */
    public void mo13306k4(char[] cArr) {
        m13298m9();
        if (cArr != null) {
            m13300x1(cArr, 0, cArr.length);
        }
        if (this.f9259ck) {
            mo13308kk();
        }
    }

    public C3123ar(String str, boolean z, AbstractC6747ar abstractC6747ar, int i) {
        if (str == null) {
            throw new ArgumentNullException("path");
        }
        if (abstractC6747ar == null) {
            throw new ArgumentNullException("encoding");
        }
        if (i <= 0) {
            throw new ArgumentOutOfRangeException("bufferSize");
        }
        C3130fa c3130fa = new C3130fa(str, z ? 6 : 2, 2, 1);
        this.f9263h4 = c3130fa;
        if (z) {
            c3130fa.setPosition(c3130fa.getLength());
        } else {
            c3130fa.setLength(0L);
        }
        m13303k4(abstractC6747ar, i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: k4 */
    public void mo13307k4(char[] cArr, int i, int i2) {
        if (cArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "< 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "< 0");
        }
        if (i > cArr.length - i2) {
            throw new ArgumentException("index + count > buffer.Length");
        }
        m13298m9();
        m13300x1(cArr, i, i2);
        if (this.f9259ck) {
            mo13308kk();
        }
    }
}
