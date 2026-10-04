package com.aspose.slides.internal.p470w5;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p245la.AbstractC6016k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.w5.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11884du extends AbstractC6016k4 {

    /* JADX INFO: renamed from: k4 */
    public static final byte f40014k4 = (byte) (C7019kk.m27462to((Object) (byte) 12, 6) + 3);

    /* JADX INFO: renamed from: c5 */
    private byte f40015c5;

    /* JADX INFO: renamed from: du */
    private int f40016du;

    /* JADX INFO: renamed from: dy */
    private byte f40017dy;

    /* JADX INFO: renamed from: h4 */
    private byte f40018h4;

    /* JADX INFO: renamed from: jd */
    private byte[] f40019jd;

    /* JADX INFO: renamed from: kk */
    private int f40020kk;

    /* JADX INFO: renamed from: m9 */
    private byte f40021m9;

    /* JADX INFO: renamed from: to */
    private int f40022to;

    /* JADX INFO: renamed from: x1 */
    private int f40023x1;

    public C11884du() {
        this.f40019jd = new byte[]{32};
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6018m9
    /* JADX INFO: renamed from: k4 */
    public void mo24316k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        abstractC3150x6.writeByte((byte) 33);
        abstractC3150x6.writeByte((byte) 1);
        abstractC3150x6.writeByte((byte) 12);
        abstractC3150x6.write(C14069jd.m66775k4(this.f40023x1), 0, 2);
        abstractC3150x6.write(C14069jd.m66775k4(this.f40020kk), 0, 2);
        abstractC3150x6.write(C14069jd.m66775k4(this.f40022to), 0, 2);
        abstractC3150x6.write(C14069jd.m66775k4(this.f40016du), 0, 2);
        abstractC3150x6.writeByte(this.f40018h4);
        abstractC3150x6.writeByte(this.f40021m9);
        abstractC3150x6.writeByte(this.f40017dy);
        abstractC3150x6.writeByte(this.f40015c5);
        C6013du.m24296k4(this.f40019jd, abstractC3150x6);
    }

    public C11884du(int i, int i2, int i3, int i4, byte b, byte b2, byte b3, byte b4, byte[] bArr) {
        this.f40023x1 = i;
        this.f40020kk = i2;
        this.f40022to = i3;
        this.f40016du = i4;
        this.f40018h4 = b;
        this.f40021m9 = b2;
        this.f40017dy = b3;
        this.f40015c5 = b4;
        this.f40019jd = bArr;
    }
}
