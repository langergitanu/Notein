package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p289n2.C6692k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.em */
/* JADX INFO: loaded from: classes5.dex */
public class C11933em {

    /* JADX INFO: renamed from: k4 */
    private byte[] f40211k4;

    public C11933em(int i, int i2) {
        if (i2 < 2) {
            throw new ArgumentOutOfRangeException("size is too small");
        }
        byte[] bArr = new byte[i2];
        this.f40211k4 = bArr;
        bArr[0] = (byte) i;
        bArr[1] = C7019kk.m27442k4(Integer.valueOf(i >> 8), 9);
    }

    public boolean equals(Object obj) {
        C11933em c11933em = (C11933em) C7019kk.m27452k4(obj, C11933em.class);
        if (c11933em == null || AbstractC14092to.m67208k4((Object) c11933em.f40211k4).m67265du() != AbstractC14092to.m67208k4((Object) this.f40211k4).m67265du()) {
            return false;
        }
        byte[] bArr = c11933em.f40211k4;
        for (int i = 0; i < AbstractC14092to.m67208k4((Object) this.f40211k4).m67265du(); i++) {
            if (C7019kk.m27462to(Byte.valueOf(bArr[i]), 6) != C7019kk.m27462to(Byte.valueOf(this.f40211k4[i]), 6)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iM27462to = 0;
        for (int i = 0; i < AbstractC14092to.m67208k4((Object) this.f40211k4).m67265du(); i++) {
            iM27462to += C7019kk.m27462to(Byte.valueOf(this.f40211k4[i]), 6) + i;
        }
        return iM27462to;
    }

    /* JADX INFO: renamed from: k4 */
    public byte m55935k4(int i) {
        return this.f40211k4[i];
    }

    public String toString() {
        String strM66410k4 = C14042ak.m66410k4(C6692k4.class, C7019kk.m27462to(Byte.valueOf(this.f40211k4[0]), 6));
        int iM67265du = AbstractC14092to.m67208k4((Object) this.f40211k4).m67265du();
        String strM67408k4 = C14113y2.m67408k4(strM66410k4, C18241k5.f55433h, C14057f9.m66591x1(iM67265du), ":{");
        for (int i = 2; i < iM67265du; i++) {
            strM67408k4 = C14113y2.m67408k4(strM67408k4, C14057f9.m66591x1(C7019kk.m27462to(Byte.valueOf(this.f40211k4[i]), 6)));
            if (i < iM67265du - 1) {
                strM67408k4 = C14113y2.m67408k4(strM67408k4, ",");
            }
        }
        return C14113y2.m67408k4(strM67408k4, "}");
    }

    /* JADX INFO: renamed from: x1 */
    public int m55938x1() {
        return AbstractC14092to.m67208k4((Object) this.f40211k4).m67265du();
    }

    /* JADX INFO: renamed from: k4 */
    public int m55936k4() {
        return C7019kk.m27462to(Byte.valueOf(this.f40211k4[0]), 6) + (C7019kk.m27462to(Byte.valueOf(this.f40211k4[1]), 6) << 8);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55937k4(int i, byte b) {
        this.f40211k4[i] = b;
    }
}
