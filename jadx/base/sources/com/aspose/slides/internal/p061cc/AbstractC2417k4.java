package com.aspose.slides.internal.p061cc;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p166hg.C4540gi;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.cc.k4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2417k4 extends C4540gi {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4523ai f8370k4;

    /* JADX INFO: renamed from: kk */
    private byte f8371kk;

    /* JADX INFO: renamed from: to */
    private byte[] f8372to;

    /* JADX INFO: renamed from: x1 */
    private byte f8373x1;

    public AbstractC2417k4(AbstractC4523ai abstractC4523ai, byte b) {
        this(abstractC4523ai, b, (byte) 22);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m11832k4(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (C7019kk.m27462to(Byte.valueOf(bArr[i]), 6) != C7019kk.m27462to(Byte.valueOf(bArr2[i]), 6)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public abstract void mo11833c5();

    /* JADX INFO: renamed from: ck */
    public AbstractC4523ai m11834ck() {
        return this.f8370k4;
    }

    /* JADX INFO: renamed from: dy */
    public void mo11835dy() {
        if (canWrite()) {
            if (this.f8372to == null) {
                this.f8372to = m11838ks();
            }
            this.f8370k4.m18663ne().m18742k4(this.f8372to);
            m18738du();
            this.f8372to = null;
        }
    }

    /* JADX INFO: renamed from: fa */
    public byte m11836fa() {
        return this.f8373x1;
    }

    /* JADX INFO: renamed from: jd */
    public abstract void mo11837jd();

    /* JADX INFO: renamed from: ks */
    public byte[] m11838ks() {
        this.f8372to = null;
        if (canWrite()) {
            byte[] bArrM18739h4 = m18739h4();
            int length = bArrM18739h4.length;
            byte[] bArr = new byte[length + 4];
            this.f8372to = bArr;
            bArr[0] = m11836fa();
            this.f8372to[1] = C7019kk.m27442k4(Integer.valueOf(length >> 16), 9);
            this.f8372to[2] = C7019kk.m27442k4(Integer.valueOf(length >> 8), 9);
            this.f8372to[3] = C7019kk.m27442k4(Integer.valueOf(length), 9);
            C14058fa.m66596k4(bArrM18739h4, 0, this.f8372to, 4, length);
        }
        return this.f8372to;
    }

    /* JADX INFO: renamed from: up */
    public byte m11839up() {
        return this.f8371kk;
    }

    /* JADX INFO: renamed from: yj */
    public void m11840yj() {
        int iM18640h4 = m11834ck().m18640h4();
        if (iM18640h4 != -1073741824) {
            if (iM18640h4 == 48) {
                mo11833c5();
                return;
            } else if (iM18640h4 != 192) {
                throw new NotSupportedException("Unsupported security protocol type");
            }
        }
        mo11837jd();
    }

    public AbstractC2417k4(AbstractC4523ai abstractC4523ai, byte b, byte b2) {
        this.f8370k4 = abstractC4523ai;
        this.f8373x1 = b;
        this.f8371kk = b2;
    }

    public AbstractC2417k4(AbstractC4523ai abstractC4523ai, byte b, byte[] bArr) {
        super(bArr);
        this.f8370k4 = abstractC4523ai;
        this.f8373x1 = b;
    }
}
