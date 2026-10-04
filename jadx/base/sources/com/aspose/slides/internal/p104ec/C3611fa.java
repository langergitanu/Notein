package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14050ca;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C3611fa {

    /* JADX INFO: renamed from: c5 */
    private byte f10031c5;

    /* JADX INFO: renamed from: ck */
    private C14047bz f10032ck;

    /* JADX INFO: renamed from: du */
    private byte[] f10033du;

    /* JADX INFO: renamed from: dy */
    private byte f10034dy;

    /* JADX INFO: renamed from: h4 */
    private byte[] f10035h4;

    /* JADX INFO: renamed from: jd */
    private final byte[] f10036jd;

    /* JADX INFO: renamed from: k4 */
    private byte f10037k4;

    /* JADX INFO: renamed from: kk */
    private byte f10038kk;

    /* JADX INFO: renamed from: m9 */
    private byte f10039m9;

    /* JADX INFO: renamed from: to */
    private byte[] f10040to;

    /* JADX INFO: renamed from: x1 */
    private byte f10041x1;

    public C3611fa(C14047bz c14047bz, long j, byte[] bArr) {
        C14047bz c14047bz2 = new C14047bz();
        this.f10032ck = c14047bz2;
        if (bArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        c14047bz.CloneTo(c14047bz2);
        this.f10036jd = bArr;
        m14733x1(j);
    }

    /* JADX INFO: renamed from: k4 */
    private byte m14727k4() {
        String strM67358c5 = C14113y2.m67358c5(this.f10032ck.m66538k4("B"));
        byte bCharAt = 0;
        for (int i = 0; i < strM67358c5.length(); i++) {
            bCharAt = (byte) ((bCharAt & 255) + (((byte) (strM67358c5.charAt(i) & 255)) & 255));
        }
        return bCharAt;
    }

    /* JADX INFO: renamed from: kk */
    private void m14730kk() {
        int i = ((byte) ((this.f10037k4 & 6) / 2)) & 255;
        List list = new List(i);
        C14050ca c14050ca = new C14050ca(this.f10037k4 & 255);
        for (int i2 = 1; i2 <= i; i2++) {
            byte bM66548k4 = (byte) (c14050ca.m66548k4(0, 255) & 255);
            byte b = (byte) ((bM66548k4 & 255) ^ ((this.f10031c5 & 255) + (this.f10039m9 & 255)));
            list.addItem(Byte.valueOf(b));
            this.f10031c5 = this.f10034dy;
            this.f10034dy = b;
            this.f10039m9 = bM66548k4;
        }
        this.f10040to = C3085sv.m13110x1((List<Byte>) list);
    }

    /* JADX INFO: renamed from: to */
    private void m14731to() {
        List list = new List(4);
        for (byte b : this.f10036jd) {
            byte b2 = (byte) ((b & 255) ^ ((this.f10031c5 & 255) + (this.f10039m9 & 255)));
            list.addItem(Byte.valueOf(b2));
            this.f10031c5 = this.f10034dy;
            this.f10034dy = b2;
            this.f10039m9 = b;
        }
        this.f10035h4 = C3085sv.m13110x1((List<Byte>) list);
    }

    /* JADX INFO: renamed from: x1 */
    private static byte m14732x1() {
        return (byte) (C14091t6.m67182k4(C14084qq.m67081jd().m67130fa()) & 255);
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("{0:x2}", Byte.valueOf(this.f10037k4));
        c6765kp.m26796k4("{0:x2}", Byte.valueOf(this.f10041x1));
        c6765kp.m26796k4("{0:x2}", Byte.valueOf(this.f10038kk));
        for (byte b : this.f10040to) {
            c6765kp.m26796k4("{0:x2}", Byte.valueOf(b));
        }
        for (byte b2 : this.f10033du) {
            c6765kp.m26796k4("{0:x2}", Byte.valueOf(b2));
        }
        for (byte b3 : this.f10035h4) {
            c6765kp.m26796k4("{0:x2}", Byte.valueOf(b3));
        }
        return C14113y2.m67358c5(c6765kp.toString());
    }

    /* JADX INFO: renamed from: k4 */
    private void m14728k4(byte b) {
        this.f10039m9 = b;
        this.f10034dy = this.f10038kk;
        this.f10031c5 = this.f10041x1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m14733x1(long j) {
        byte bM14727k4 = m14727k4();
        byte bM14732x1 = m14732x1();
        this.f10037k4 = bM14732x1;
        this.f10041x1 = (byte) ((bM14732x1 & 255) ^ 2);
        this.f10038kk = (byte) ((bM14732x1 & 255) ^ (bM14727k4 & 255));
        m14728k4(bM14727k4);
        m14730kk();
        m14729k4(j);
        m14731to();
    }

    /* JADX INFO: renamed from: k4 */
    private void m14729k4(long j) {
        byte b = (byte) j;
        long j2 = j & 4294967295L;
        byte[] bArr = {b, (byte) ((j2 >> 8) & 255), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 24) & 255)};
        List list = new List(4);
        for (int i = 0; i < 4; i++) {
            byte b2 = bArr[i];
            byte b3 = (byte) ((b2 & 255) ^ ((this.f10031c5 & 255) + (this.f10039m9 & 255)));
            list.addItem(Byte.valueOf(b3));
            this.f10031c5 = this.f10034dy;
            this.f10034dy = b3;
            this.f10039m9 = b2;
        }
        this.f10033du = C3085sv.m13110x1((List<Byte>) list);
    }
}
