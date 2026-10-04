package com.aspose.slides.internal.p356qb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.m9 */
/* JADX INFO: loaded from: classes4.dex */
class C9825m9 {

    /* JADX INFO: renamed from: k4 */
    private C9815c5 f35591k4 = null;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC9821jd f35592x1 = null;

    /* JADX INFO: renamed from: c5 */
    private int m48422c5(byte[] bArr) {
        return C3110yd.m13249kk(bArr, 120);
    }

    /* JADX INFO: renamed from: du */
    private int m48423du(byte[] bArr) {
        return C3110yd.m13249kk(bArr, 72);
    }

    /* JADX INFO: renamed from: dy */
    private long m48424dy(byte[] bArr) {
        return C3110yd.m13253to(bArr, 116) & 4294967295L;
    }

    /* JADX INFO: renamed from: h4 */
    private int m48425h4(byte[] bArr) {
        return C3110yd.m13249kk(bArr, 76);
    }

    /* JADX INFO: renamed from: jd */
    private String m48426jd(byte[] bArr) {
        return new C6773ss().mo26682x1(bArr, 0, (bArr[64] & 255) - 2);
    }

    /* JADX INFO: renamed from: kk */
    private byte m48433kk(byte[] bArr) {
        return bArr[66];
    }

    /* JADX INFO: renamed from: m9 */
    private byte[] m48434m9(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 80, bArr2, 0, 16);
        return bArr2;
    }

    /* JADX INFO: renamed from: to */
    private int m48435to(byte[] bArr) {
        return C3110yd.m13249kk(bArr, 68);
    }

    /* JADX INFO: renamed from: k4 */
    public final List<AbstractC9818dy> m48439k4() {
        return m48436x1(this.f35591k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m48443x1(InterfaceC9821jd interfaceC9821jd) {
        interfaceC9821jd.mo48369k4();
        return m48428k4(m48438x1(0, new C9820h4(interfaceC9821jd.mo48369k4().m48462to() & 4294967295L, interfaceC9821jd.mo48370x1(), interfaceC9821jd))).m48386to();
    }

    /* JADX INFO: renamed from: k4 */
    private List<byte[]> m48427k4(int i, C9820h4 c9820h4) {
        List<byte[]> list = new List<>(1);
        if (i >= 0) {
            byte[] bArrM48438x1 = m48438x1(i, c9820h4);
            byte bM48433kk = m48433kk(bArrM48438x1);
            list.addItem(bArrM48438x1);
            if (bM48433kk == 0) {
                return list;
            }
            int iM48435to = m48435to(bArrM48438x1);
            int iM48423du = m48423du(bArrM48438x1);
            if (iM48435to > -1) {
                list.addRange(m48427k4(iM48435to, c9820h4));
            }
            if (iM48423du > -1) {
                list.addRange(m48427k4(iM48423du, c9820h4));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private List<AbstractC9818dy> m48436x1(C9815c5 c9815c5) {
        List<AbstractC9818dy> list = new List<>();
        List<AbstractC9818dy> listM48342k4 = c9815c5.m48342k4();
        c9815c5.m48379k4(m48429k4(listM48342k4));
        list.addItem(c9815c5);
        for (int i = 0; i < listM48342k4.size(); i++) {
            AbstractC9818dy abstractC9818dy = listM48342k4.get_Item(i);
            if (C7019kk.m27469x1(abstractC9818dy, C9815c5.class)) {
                list.addRange(m48436x1((C9815c5) abstractC9818dy));
            } else {
                list.addItem(abstractC9818dy);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public final C9815c5 m48442kk() {
        return this.f35591k4;
    }

    /* JADX INFO: renamed from: k4 */
    private C9815c5 m48428k4(byte[] bArr) {
        C9815c5 c9815c5 = new C9815c5();
        c9815c5.m48380k4(m48426jd(bArr));
        c9815c5.m48378k4(m48424dy(bArr));
        c9815c5.m48387to(m48422c5(bArr));
        c9815c5.m48389x1(m48434m9(bArr));
        return c9815c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9820h4 m48444x1() {
        this.f35591k4.m48381k4((short) 5);
        List<AbstractC9818dy> listM48436x1 = m48436x1(this.f35591k4);
        for (int i = 0; i < listM48436x1.size(); i++) {
            listM48436x1.get_Item(i).m48382kk(i);
        }
        C9820h4 c9820h4 = new C9820h4();
        for (int i2 = 0; i2 < listM48436x1.size(); i2++) {
            c9820h4.m48409k4(m48432k4(listM48436x1.get_Item(i2)));
        }
        return c9820h4;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC9818dy m48429k4(List<AbstractC9818dy> list) {
        if (list.size() == 0) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            AbstractC9818dy abstractC9818dy = list.get_Item(i);
            abstractC9818dy.m48379k4((AbstractC9818dy) null);
            abstractC9818dy.m48388x1((AbstractC9818dy) null);
            abstractC9818dy.m48383kk((AbstractC9818dy) null);
        }
        AbstractC9818dy abstractC9818dy2 = list.get_Item(0);
        for (int i2 = 1; i2 < list.size(); i2++) {
            m48431k4(abstractC9818dy2, list.get_Item(i2));
        }
        return abstractC9818dy2;
    }

    /* JADX INFO: renamed from: x1 */
    private C9820h4 m48437x1(byte[] bArr) {
        this.f35592x1.mo48369k4();
        C9820h4 c9820h4 = new C9820h4(m48422c5(bArr));
        c9820h4.m48378k4(m48424dy(bArr));
        c9820h4.m48380k4(m48426jd(bArr));
        c9820h4.m48387to(m48422c5(bArr));
        c9820h4.m48389x1(m48434m9(bArr));
        return c9820h4;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC9818dy m48430k4(byte[] bArr, C9820h4 c9820h4) {
        AbstractC9818dy abstractC9818dyM48430k4;
        C9815c5 c9815c5M48428k4 = m48428k4(bArr);
        List<byte[]> listM48427k4 = m48427k4(m48425h4(bArr), c9820h4);
        for (int i = 0; i < listM48427k4.size(); i++) {
            byte[] bArr2 = (byte[]) C7019kk.m27458kk(listM48427k4.get_Item(i), byte[].class);
            byte bM48433kk = m48433kk(bArr2);
            if (bM48433kk == 1 || bM48433kk == 5) {
                abstractC9818dyM48430k4 = m48430k4(bArr2, c9820h4);
            } else if ((bM48433kk & 255) != 0) {
                abstractC9818dyM48430k4 = m48437x1(bArr2);
            }
            c9815c5M48428k4.m48340du(abstractC9818dyM48430k4);
        }
        return c9815c5M48428k4;
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m48438x1(int i, C9820h4 c9820h4) {
        byte[] bArr = new byte[128];
        System.arraycopy(c9820h4.m48410k4(), i * 128, bArr, 0, 128);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48440k4(C9815c5 c9815c5) {
        this.f35591k4 = c9815c5;
    }

    /* JADX INFO: renamed from: k4 */
    private void m48431k4(AbstractC9818dy abstractC9818dy, AbstractC9818dy abstractC9818dy2) {
        AbstractC9818dy abstractC9818dyM48371c5;
        if (abstractC9818dy.m48385to(abstractC9818dy2) > 0) {
            if (abstractC9818dy.m48374dy() == null) {
                abstractC9818dy.m48388x1(abstractC9818dy2);
                return;
            }
            abstractC9818dyM48371c5 = abstractC9818dy.m48374dy();
        } else {
            if (abstractC9818dy.m48371c5() == null) {
                abstractC9818dy.m48383kk(abstractC9818dy2);
                return;
            }
            abstractC9818dyM48371c5 = abstractC9818dy.m48371c5();
        }
        m48431k4(abstractC9818dyM48371c5, abstractC9818dy2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48441k4(InterfaceC9821jd interfaceC9821jd) {
        this.f35592x1 = interfaceC9821jd;
        C9828x1 c9828x1Mo48369k4 = interfaceC9821jd.mo48369k4();
        C9820h4 c9820h4 = new C9820h4(c9828x1Mo48369k4.m48462to() & 4294967295L, interfaceC9821jd.mo48370x1(), interfaceC9821jd);
        this.f35591k4 = (C9815c5) m48430k4(m48438x1(0, c9820h4), c9820h4);
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m48432k4(AbstractC9818dy abstractC9818dy) {
        byte[] bArr = new byte[128];
        byte[] bArrMo26677to = new C6773ss().mo26677to(abstractC9818dy.m48372ck().length() > 31 ? C14113y2.m67443x1(abstractC9818dy.m48372ck(), 0, 31) : abstractC9818dy.m48372ck());
        System.arraycopy(bArrMo26677to, 0, bArr, 0, bArrMo26677to.length);
        bArr[64] = (byte) (bArrMo26677to.length + 2);
        bArr[65] = 0;
        bArr[66] = (byte) abstractC9818dy.m48377jd();
        if (abstractC9818dy.m48374dy() != null) {
            bArr[68] = (byte) (abstractC9818dy.m48374dy().m48373du() & 255);
            bArr[69] = (byte) ((abstractC9818dy.m48374dy().m48373du() >> 8) & 255);
            bArr[70] = (byte) ((abstractC9818dy.m48374dy().m48373du() >> 16) & 255);
            bArr[71] = (byte) ((abstractC9818dy.m48374dy().m48373du() >> 24) & 255);
        } else {
            bArr[68] = -1;
            bArr[69] = -1;
            bArr[70] = -1;
            bArr[71] = -1;
        }
        if (abstractC9818dy.m48371c5() != null) {
            bArr[72] = (byte) (abstractC9818dy.m48371c5().m48373du() & 255);
            bArr[73] = (byte) ((abstractC9818dy.m48371c5().m48373du() >> 8) & 255);
            bArr[74] = (byte) ((abstractC9818dy.m48371c5().m48373du() >> 16) & 255);
            bArr[75] = (byte) ((abstractC9818dy.m48371c5().m48373du() >> 24) & 255);
        } else {
            bArr[72] = -1;
            bArr[73] = -1;
            bArr[74] = -1;
            bArr[75] = -1;
        }
        if (abstractC9818dy.m48384m9() != null) {
            bArr[76] = (byte) (abstractC9818dy.m48384m9().m48373du() & 255);
            bArr[77] = (byte) ((abstractC9818dy.m48384m9().m48373du() >> 8) & 255);
            bArr[78] = (byte) ((abstractC9818dy.m48384m9().m48373du() >> 16) & 255);
            bArr[79] = (byte) ((abstractC9818dy.m48384m9().m48373du() >> 24) & 255);
        } else {
            bArr[76] = -1;
            bArr[77] = -1;
            bArr[78] = -1;
            bArr[79] = -1;
        }
        byte[] bArrM48376h4 = abstractC9818dy.m48376h4();
        if (bArrM48376h4 != null) {
            System.arraycopy(bArrM48376h4, 0, bArr, 80, 16);
        }
        bArr[116] = (byte) (abstractC9818dy.m48386to() & 255);
        bArr[117] = (byte) (((abstractC9818dy.m48386to() & 4294967295L) >> 8) & 255);
        bArr[118] = (byte) (((abstractC9818dy.m48386to() & 4294967295L) >> 16) & 255);
        bArr[119] = (byte) (((abstractC9818dy.m48386to() & 4294967295L) >> 24) & 255);
        bArr[120] = (byte) (abstractC9818dy.m48375fa() & 255);
        bArr[121] = (byte) ((abstractC9818dy.m48375fa() >> 8) & 255);
        bArr[122] = (byte) ((abstractC9818dy.m48375fa() >> 16) & 255);
        bArr[123] = (byte) ((abstractC9818dy.m48375fa() >> 24) & 255);
        return bArr;
    }
}
