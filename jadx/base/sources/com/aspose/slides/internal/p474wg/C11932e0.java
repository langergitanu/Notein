package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p289n2.C6692k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.e0 */
/* JADX INFO: loaded from: classes5.dex */
public class C11932e0 extends AbstractC11958ne {

    /* JADX INFO: renamed from: k4 */
    private C11972ts f40209k4;

    /* JADX INFO: renamed from: x1 */
    private int f40210x1;

    public C11932e0(long j, int i) {
        m55932k4(new C11972ts(j));
        m55931k4(i);
    }

    /* JADX INFO: renamed from: du */
    public int m55928du() {
        return this.f40210x1;
    }

    public boolean equals(Object obj) {
        C11932e0 c11932e0 = (C11932e0) C7019kk.m27452k4(obj, C11932e0.class);
        return c11932e0 != null && c11932e0.f40210x1 == this.f40210x1 && c11932e0.f40209k4.equals(this.f40209k4);
    }

    public int hashCode() {
        return this.f40209k4.hashCode() + this.f40210x1;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11958ne
    /* JADX INFO: renamed from: k4 */
    public int mo55929k4() {
        return this.f40209k4.m56141du();
    }

    /* JADX INFO: renamed from: to */
    public C11972ts m55933to() {
        return this.f40209k4;
    }

    public String toString() {
        return C14113y2.m67408k4(this.f40209k4.toString(), C18241k5.f55433h, C14057f9.m66591x1(this.f40210x1));
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11958ne
    /* JADX INFO: renamed from: x1 */
    public C11933em mo55934x1() {
        C11933em c11933em;
        byte bM27442k4;
        int i;
        int iM56141du = this.f40209k4.m56141du();
        if (iM56141du == 2) {
            c11933em = new C11933em(2, 16);
            c11933em.m55937k4(2, C7019kk.m27442k4(Integer.valueOf((this.f40210x1 >> 8) & 255), 9));
            c11933em.m55937k4(3, C7019kk.m27442k4(Integer.valueOf(this.f40210x1 & 255), 9));
            long jM56142k4 = this.f40209k4.m56142k4();
            c11933em.m55937k4(4, C7019kk.m27442k4(Long.valueOf(C7019kk.m27438h4((Object) 255, 9) & jM56142k4), 11));
            c11933em.m55937k4(5, C7019kk.m27442k4(Long.valueOf((jM56142k4 >> 8) & C7019kk.m27438h4((Object) 255, 9)), 11));
            c11933em.m55937k4(6, C7019kk.m27442k4(Long.valueOf((jM56142k4 >> 16) & C7019kk.m27438h4((Object) 255, 9)), 11));
            bM27442k4 = C7019kk.m27442k4(Long.valueOf((jM56142k4 >> 24) & C7019kk.m27438h4((Object) 255, 9)), 11);
            i = 7;
        } else {
            if (iM56141du != 23) {
                return null;
            }
            c11933em = new C11933em(23, 28);
            c11933em.m55937k4(2, C7019kk.m27442k4(Integer.valueOf((this.f40210x1 >> 8) & 255), 9));
            c11933em.m55937k4(3, C7019kk.m27442k4(Integer.valueOf(this.f40210x1 & 255), 9));
            byte[] bArrM56144to = this.f40209k4.m56144to();
            for (int i2 = 0; i2 < 16; i2++) {
                c11933em.m55937k4(i2 + 8, bArrM56144to[i2]);
            }
            c11933em.m55937k4(24, C7019kk.m27442k4(Long.valueOf(this.f40209k4.m56143kk() & C7019kk.m27438h4((Object) 255, 9)), 11));
            c11933em.m55937k4(25, C7019kk.m27442k4(Long.valueOf((this.f40209k4.m56143kk() >> 8) & C7019kk.m27438h4((Object) 255, 9)), 11));
            c11933em.m55937k4(26, C7019kk.m27442k4(Long.valueOf((this.f40209k4.m56143kk() >> 16) & C7019kk.m27438h4((Object) 255, 9)), 11));
            bM27442k4 = C7019kk.m27442k4(Long.valueOf((this.f40209k4.m56143kk() >> 24) & C7019kk.m27438h4((Object) 255, 9)), 11);
            i = 27;
        }
        c11933em.m55937k4(i, bM27442k4);
        return c11933em;
    }

    public C11932e0(C11972ts c11972ts, int i) {
        if (c11972ts == null) {
            throw new ArgumentNullException("address");
        }
        m55932k4(c11972ts);
        m55931k4(i);
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11958ne
    /* JADX INFO: renamed from: k4 */
    public AbstractC11958ne mo55930k4(C11933em c11933em) {
        if (c11933em == null) {
            throw new ArgumentNullException("socketAddress");
        }
        if (c11933em.m55936k4() != mo55929k4()) {
            throw new ArgumentException(C14113y2.m67408k4("The IPEndPoint was created using ", AbstractC14106wy.getName((Class<?>) C6692k4.class, mo55929k4()), " AddressFamily but SocketAddress contains ", AbstractC14106wy.getName((Class<?>) C6692k4.class, c11933em.m55936k4()), " instead, please use the same type."));
        }
        int iM55938x1 = c11933em.m55938x1();
        int iM55936k4 = c11933em.m55936k4();
        if (iM55936k4 == 2) {
            if (iM55938x1 < 8) {
                return null;
            }
            return new C11932e0(C7019kk.m27438h4(Byte.valueOf(c11933em.m55935k4(4)), 6) + (C7019kk.m27438h4(Byte.valueOf(c11933em.m55935k4(7)), 6) << 24) + (C7019kk.m27438h4(Byte.valueOf(c11933em.m55935k4(6)), 6) << 16) + (C7019kk.m27438h4(Byte.valueOf(c11933em.m55935k4(5)), 6) << 8), C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(3)), 6) + (C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(2)), 6) << 8));
        }
        if (iM55936k4 != 23 || iM55938x1 < 28) {
            return null;
        }
        int iM27462to = C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(3)), 6) + (C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(2)), 6) << 8);
        int iM27462to2 = C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(24)), 6) + (C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(25)), 6) << 8) + (C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(26)), 6) << 16) + (C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(27)), 6) << 24);
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            int i2 = i * 2;
            iArr[i] = C7019kk.m27457kk(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(i2 + 9)), 6) + (C7019kk.m27462to(Byte.valueOf(c11933em.m55935k4(i2 + 8)), 6) << 8)), 9);
        }
        return new C11932e0(new C11972ts(iArr, C7019kk.m27438h4(Integer.valueOf(iM27462to2), 9)), iM27462to);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55931k4(int i) {
        if (i < 0 || i > 65535) {
            throw new ArgumentOutOfRangeException("Invalid port");
        }
        this.f40210x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55932k4(C11972ts c11972ts) {
        this.f40209k4 = c11972ts;
    }
}
