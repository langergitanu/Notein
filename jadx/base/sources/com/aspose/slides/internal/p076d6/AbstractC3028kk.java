package com.aspose.slides.internal.p076d6;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.d6.kk */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3028kk {

    /* JADX INFO: renamed from: k4 */
    private static byte[] f8867k4 = {78, 84, 76, 77, 83, 83, 80, 0};

    /* JADX INFO: renamed from: kk */
    private int f8868kk;

    /* JADX INFO: renamed from: x1 */
    private int f8869x1;

    public AbstractC3028kk(int i) {
        this.f8869x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public int m12749k4() {
        return this.f8868kk;
    }

    /* JADX INFO: renamed from: kk */
    public abstract byte[] mo12736kk();

    /* JADX INFO: renamed from: x1 */
    public int m12751x1() {
        return this.f8869x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12750k4(int i) {
        this.f8868kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m12752x1(byte[] bArr) {
        for (int i = 0; i < f8867k4.length; i++) {
            if (C7019kk.m27462to(Byte.valueOf(bArr[i]), 6) != C7019kk.m27462to(Byte.valueOf(f8867k4[i]), 6)) {
                return false;
            }
        }
        return C7019kk.m27435du(Long.valueOf(C14069jd.m66784x1(bArr, 8)), 10) == ((long) this.f8869x1);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo12735k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("message");
        }
        if (bArr.length < 12) {
            throw new ArgumentOutOfRangeException("message", C7019kk.m27466x1(bArr.length), "Minimum message length is 12 bytes.");
        }
        if (!m12752x1(bArr)) {
            throw new ArgumentException("Invalid Type{0} message.", "message");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m12753x1(int i) {
        byte[] bArr = new byte[i];
        C14058fa.m66596k4(f8867k4, 0, bArr, 0, 8);
        bArr[8] = C7019kk.m27442k4(Integer.valueOf(this.f8869x1), 9);
        bArr[9] = C7019kk.m27442k4(Integer.valueOf(this.f8869x1 >> 8), 9);
        bArr[10] = C7019kk.m27442k4(Integer.valueOf(this.f8869x1 >> 16), 9);
        bArr[11] = C7019kk.m27442k4(Integer.valueOf(this.f8869x1 >> 24), 9);
        return bArr;
    }
}
