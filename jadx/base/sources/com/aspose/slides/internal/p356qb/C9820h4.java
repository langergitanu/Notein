package com.aspose.slides.internal.p356qb;

import androidx.datastore.preferences.protobuf.C21791OooO0o0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9820h4 extends AbstractC9818dy {

    /* JADX INFO: renamed from: ck */
    private byte[] f35583ck;

    /* JADX INFO: renamed from: fa */
    private boolean f35584fa;

    /* JADX INFO: renamed from: up */
    private boolean f35585up;

    public C9820h4() {
        this.f35584fa = false;
        this.f35585up = false;
        this.f35583ck = new byte[10];
        this.f35579x1 = (short) 2;
    }

    /* JADX INFO: renamed from: du */
    private void m48403du(int i) {
        byte[] bArr = this.f35583ck;
        int length = bArr.length;
        if (i > length) {
            int iOooO00o = C21791OooO0o0.OooO00o(length, 3, 2, 1);
            if (iOooO00o >= i) {
                i = iOooO00o;
            }
            byte[] bArr2 = new byte[i];
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) bArr), AbstractC14092to.m67208k4((Object) bArr2), this.f35583ck.length);
            this.f35583ck = bArr2;
        }
    }

    /* JADX INFO: renamed from: up */
    private void m48405up() {
        if (this.f35584fa) {
            throw new InvalidOperationException("The stream data is corrupted");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C9827up> m48406k4(int i) {
        m48405up();
        List<C9827up> list = new List<>();
        int i2 = 0;
        while (true) {
            byte[] bArr = new byte[i];
            C3085sv.m13084k4(bArr, (byte) -1);
            int i3 = i2 + i;
            int i4 = this.f35567c5;
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f35583ck), i2, AbstractC14092to.m67208k4((Object) bArr), 0, i3 < i4 ? i : i4 - i2);
            list.addItem(new C9827up(bArr));
            if (i3 >= this.f35567c5) {
                return list;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m48411kk() {
        return this.f35585up;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m48412x1(int i) {
        return C7019kk.m27462to(Double.valueOf(C14116yg.m67501x1(((double) this.f35567c5) / ((double) i))), 14);
    }

    public C9820h4(int i) {
        this.f35583ck = null;
        this.f35584fa = false;
        this.f35585up = false;
        this.f35583ck = new byte[i];
        this.f35579x1 = (short) 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48407k4(long j, AbstractC9822k4 abstractC9822k4, List<C9827up> list) {
        if ((4294967295L & j) >= 4294967290L) {
            return;
        }
        long[][] jArr = {null};
        boolean zM48404k4 = m48404k4(j, abstractC9822k4, jArr);
        long[] jArr2 = jArr[0];
        if (!zM48404k4) {
            this.f35584fa = true;
            return;
        }
        int length = list.get_Item(0).m48445k4().length;
        int iM48375fa = m48375fa();
        if (jArr2.length * length < iM48375fa) {
            throw new Exception("Size of entry less that it is declared!");
        }
        if (iM48375fa == 0) {
            iM48375fa = jArr2.length * length;
        }
        this.f35583ck = new byte[iM48375fa];
        for (int i = 0; i < jArr2.length; i++) {
            C9827up c9827up = list.get_Item((int) jArr2[i]);
            if (iM48375fa <= length) {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c9827up.m48445k4()), 0, AbstractC14092to.m67208k4((Object) this.f35583ck), i * length, iM48375fa);
                return;
            } else {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c9827up.m48445k4()), 0, AbstractC14092to.m67208k4((Object) this.f35583ck), i * length, length);
                iM48375fa -= length;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m48413x1() {
        m48405up();
        byte[] bArr = new byte[this.f35567c5];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) this.f35583ck), AbstractC14092to.m67208k4((Object) bArr), this.f35567c5);
        return bArr;
    }

    public C9820h4(long j, AbstractC9822k4 abstractC9822k4, InterfaceC9821jd interfaceC9821jd) {
        this.f35583ck = null;
        this.f35584fa = false;
        this.f35585up = false;
        m48408k4(j, abstractC9822k4, interfaceC9821jd);
        this.f35579x1 = (short) 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48408k4(long j, AbstractC9822k4 abstractC9822k4, InterfaceC9821jd interfaceC9821jd) {
        long[] jArrM48416k4 = abstractC9822k4.m48416k4(j);
        int length = interfaceC9821jd.mo48368k4(0).m48445k4().length;
        int iM48375fa = m48375fa();
        if (jArrM48416k4.length * length < iM48375fa) {
            iM48375fa = jArrM48416k4.length * length;
            this.f35584fa = true;
        }
        if (iM48375fa == 0) {
            iM48375fa = jArrM48416k4.length * length;
        }
        this.f35583ck = new byte[iM48375fa];
        for (int i = 0; i < jArrM48416k4.length; i++) {
            C9827up c9827upMo48368k4 = interfaceC9821jd.mo48368k4((int) jArrM48416k4[i]);
            if (c9827upMo48368k4 == null) {
                this.f35585up = true;
                return;
            } else if (iM48375fa <= length) {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c9827upMo48368k4.m48445k4()), 0, AbstractC14092to.m67208k4((Object) this.f35583ck), i * length, iM48375fa);
                return;
            } else {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c9827upMo48368k4.m48445k4()), 0, AbstractC14092to.m67208k4((Object) this.f35583ck), i * length, length);
                iM48375fa -= length;
            }
        }
    }

    public C9820h4(String str) {
        this.f35584fa = false;
        this.f35585up = false;
        this.f35583ck = new byte[10];
        this.f35579x1 = (short) 2;
        m48380k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m48404k4(long j, AbstractC9822k4 abstractC9822k4, long[][] jArr) {
        jArr[0] = null;
        try {
            jArr[0] = abstractC9822k4.m48416k4(j);
            return true;
        } catch (RuntimeException unused) {
            this.f35584fa = true;
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m48409k4(byte[] bArr) {
        int length = bArr.length;
        m48405up();
        m48403du(this.f35567c5 + length);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) this.f35583ck), this.f35567c5, length);
        this.f35567c5 += length;
        return length != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m48410k4() {
        m48405up();
        return this.f35583ck;
    }
}
