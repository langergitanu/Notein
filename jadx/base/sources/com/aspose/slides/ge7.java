package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class ge7 {

    /* JADX INFO: renamed from: c5 */
    private static final Dictionary<Integer, Integer> f5201c5 = new Dictionary<>(128);

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f5202yj;

    /* JADX INFO: renamed from: ck */
    private jkd f5203ck;

    /* JADX INFO: renamed from: du */
    private int f5204du;

    /* JADX INFO: renamed from: dy */
    private int f5205dy;

    /* JADX INFO: renamed from: fa */
    private char[] f5206fa = new char[128];

    /* JADX INFO: renamed from: h4 */
    private int f5207h4;

    /* JADX INFO: renamed from: jd */
    private jkd f5208jd;

    /* JADX INFO: renamed from: k4 */
    C14270p8 f5209k4;

    /* JADX INFO: renamed from: kk */
    private int f5210kk;

    /* JADX INFO: renamed from: m9 */
    private int f5211m9;

    /* JADX INFO: renamed from: to */
    private int f5212to;

    /* JADX INFO: renamed from: up */
    private int f5213up;

    /* JADX INFO: renamed from: x1 */
    private jkd f5214x1;

    static {
        for (int i = 48; i <= 57; i++) {
            f5201c5.set_Item(Integer.valueOf(i), 5);
        }
        Dictionary<Integer, Integer> dictionary = f5201c5;
        dictionary.set_Item(45, 2);
        dictionary.set_Item(114, 7);
        dictionary.set_Item(115, 31);
        dictionary.set_Item(116, 19);
        dictionary.set_Item(40, 28);
        dictionary.set_Item(41, 29);
        dictionary.set_Item(44, 30);
        dictionary.set_Item(65536, -1);
        f5202yj = new C7017h4("");
    }

    public ge7(String str) {
        this.f5209k4 = new C14270p8(new C3152yj(AbstractC6747ar.m26635ix().mo26677to(str)), false);
        m6554x1();
    }

    /* JADX INFO: renamed from: ak */
    private void m6519ak(int i, int i2, jkd jkdVar) {
        int i3 = this.f5210kk;
        if (i3 == 99) {
            m6545to();
            m6559yj(i, i2, jkdVar);
        } else if (i3 != 107) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6526dq(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: ar */
    private void m6520ar(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 108) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6548um(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: b3 */
    private void m6521b3(int i, int i2, jkd jkdVar) {
        jkdVar.f45515k4 = 8;
    }

    /* JADX INFO: renamed from: bv */
    private void m6522bv(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 116) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6551v4(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m6523c5(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 116) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6534jd(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: c6 */
    private void m6524c6(int i, int i2, jkd jkdVar) {
        int i3 = this.f5210kk;
        if (i3 == 88) {
            m6545to();
            m6542ne(i, i2, jkdVar);
        } else if (i3 != 89) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6533ix(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: ck */
    private void m6525ck(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 116) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6530fa(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: dq */
    private void m6526dq(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 101) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6557xk(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: du */
    private void m6527du(int i, int i2, jkd jkdVar) {
        int i3 = this.f5212to;
        int i4 = this.f5210kk;
        if ((i4 >= 65 && i4 <= 90) || (i4 >= 97 && i4 <= 122)) {
            m6545to();
            m6555x1(1, i3, jkdVar);
        } else if (i4 < 48 || i4 > 57) {
            jkdVar.f45515k4 = 1;
        } else {
            m6545to();
            m6541m9(1, i3, jkdVar);
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m6529dy(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 111) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6523c5(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: fa */
    private void m6530fa(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 101) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6549up(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: h4 */
    private jkd m6531h4() {
        int i;
        while (true) {
            i = this.f5210kk;
            if (i != 32 && ((i < 9 || i > 10) && i != 13)) {
                break;
            }
            m6536kk();
        }
        if (i == 59 && m6528du()) {
            return m6531h4();
        }
        int i2 = this.f5212to;
        jkd jkdVar = new jkd();
        this.f5214x1 = jkdVar;
        jkdVar.f45519x1 = this.f5212to;
        jkdVar.f45518to = this.f5207h4;
        jkdVar.f45513du = this.f5211m9;
        jkdVar.f45516kk = this.f5204du;
        Dictionary<Integer, Integer> dictionary = f5201c5;
        int iIntValue = dictionary.containsKey(Integer.valueOf(this.f5210kk)) ? dictionary.get_Item(Integer.valueOf(this.f5210kk)).intValue() : 0;
        this.f5213up = 0;
        m6545to();
        switch (iIntValue) {
            case -1:
                this.f5214x1.f45515k4 = 0;
                break;
            case 0:
                m6535k4(10, i2, this.f5214x1);
                break;
            case 1:
                m6555x1(10, i2, this.f5214x1);
                break;
            case 2:
                m6537kk(10, i2, this.f5214x1);
                break;
            case 3:
                m6546to(10, i2, this.f5214x1);
                break;
            case 4:
                m6527du(10, i2, this.f5214x1);
                break;
            case 5:
                m6532h4(10, i2, this.f5214x1);
                break;
            case 6:
                m6541m9(10, i2, this.f5214x1);
                break;
            case 7:
                m6529dy(10, i2, this.f5214x1);
                break;
            case 8:
                m6523c5(10, i2, this.f5214x1);
                break;
            case 9:
                m6534jd(10, i2, this.f5214x1);
                break;
            case 10:
                m6525ck(10, i2, this.f5214x1);
                break;
            case 11:
                m6530fa(10, i2, this.f5214x1);
                break;
            case 12:
                m6549up(10, i2, this.f5214x1);
                break;
            case 13:
                m6559yj(10, i2, this.f5214x1);
                break;
            case 14:
                m6538ks(10, i2, this.f5214x1);
                break;
            case 15:
                m6544rv(10, i2, this.f5214x1);
                break;
            case 16:
                m6556x6(10, i2, this.f5214x1);
                break;
            case 17:
                m6542ne(10, i2, this.f5214x1);
                break;
            case 18:
                m6533ix(10, i2, this.f5214x1);
                break;
            case 19:
                m6547u4(10, i2, this.f5214x1);
                break;
            case 20:
                m6550uz(10, i2, this.f5214x1);
                break;
            case 21:
                m6552wl(10, i2, this.f5214x1);
                break;
            case 22:
                m6543qq(10, i2, this.f5214x1);
                break;
            case 23:
                m6520ar(10, i2, this.f5214x1);
                break;
            case 24:
                m6548um(10, i2, this.f5214x1);
                break;
            case 25:
                m6522bv(10, i2, this.f5214x1);
                break;
            case 26:
                m6551v4(10, i2, this.f5214x1);
                break;
            case 27:
                m6539lr(10, i2, this.f5214x1);
                break;
            case 28:
                m6558yd(10, i2, this.f5214x1);
                break;
            case 29:
                m6521b3(10, i2, this.f5214x1);
                break;
            case 30:
                m6553wy(10, i2, this.f5214x1);
                break;
            case 31:
                m6519ak(10, i2, this.f5214x1);
                break;
            case 32:
                m6526dq(10, i2, this.f5214x1);
                break;
            case 33:
                m6557xk(10, i2, this.f5214x1);
                break;
            case 34:
                m6524c6(10, i2, this.f5214x1);
                break;
        }
        this.f5214x1.f45514h4 = C14113y2.m67406k4(this.f5206fa, 0, this.f5213up);
        return this.f5214x1;
    }

    /* JADX INFO: renamed from: ix */
    private void m6533ix(int i, int i2, jkd jkdVar) {
        jkdVar.f45515k4 = 5;
    }

    /* JADX INFO: renamed from: jd */
    private void m6534jd(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 97) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6525ck(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m6536kk() {
        int i = this.f5205dy;
        if (i > 0) {
            this.f5210kk = 10;
            this.f5205dy = i - 1;
            return;
        }
        this.f5212to = this.f5209k4.m68972to();
        int iMo68973x1 = this.f5209k4.mo68973x1();
        this.f5210kk = iMo68973x1;
        this.f5207h4++;
        this.f5204du++;
        if (iMo68973x1 == 13 && this.f5209k4.m68971kk() != 10) {
            this.f5210kk = 10;
        }
        if (this.f5210kk == 10) {
            this.f5211m9++;
            this.f5207h4 = 0;
        }
    }

    /* JADX INFO: renamed from: ks */
    private void m6538ks(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 108) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6544rv(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m6539lr(int i, int i2, jkd jkdVar) {
        jkdVar.f45515k4 = 6;
    }

    /* JADX INFO: renamed from: m9 */
    private void m6540m9() {
        this.f5209k4.m68970k4(this.f5214x1.f45519x1);
        m6536kk();
        jkd jkdVar = this.f5214x1;
        this.f5211m9 = jkdVar.f45513du;
        this.f5207h4 = jkdVar.f45518to;
        this.f5204du = jkdVar.f45516kk;
        for (int i = 0; i < this.f5213up; i++) {
            m6536kk();
        }
    }

    /* JADX INFO: renamed from: ne */
    private void m6542ne(int i, int i2, jkd jkdVar) {
        jkdVar.f45515k4 = 4;
    }

    /* JADX INFO: renamed from: qq */
    private void m6543qq(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 115) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6520ar(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m6544rv(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 101) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6556x6(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m6545to() {
        int i = this.f5213up;
        char[] cArr = this.f5206fa;
        if (i >= cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) cArr), 0, AbstractC14092to.m67208k4((Object) cArr2), 0, this.f5206fa.length);
            this.f5206fa = cArr2;
        }
        int i2 = this.f5210kk;
        if (i2 != 65536) {
            char[] cArr3 = this.f5206fa;
            int i3 = this.f5213up;
            this.f5213up = i3 + 1;
            cArr3[i3] = (char) i2;
            m6536kk();
        }
    }

    /* JADX INFO: renamed from: u4 */
    private void m6547u4(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 114) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6550uz(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: um */
    private void m6548um(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 97) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6522bv(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: up */
    private void m6549up(int i, int i2, jkd jkdVar) {
        jkdVar.f45515k4 = 2;
    }

    /* JADX INFO: renamed from: uz */
    private void m6550uz(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 97) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6552wl(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: v4 */
    private void m6551v4(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 101) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6539lr(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: wl */
    private void m6552wl(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 110) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6543qq(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: wy */
    private void m6553wy(int i, int i2, jkd jkdVar) {
        jkdVar.f45515k4 = 9;
    }

    /* JADX INFO: renamed from: x1 */
    private void m6554x1() {
        this.f5212to = -1;
        this.f5211m9 = 1;
        this.f5207h4 = 0;
        this.f5204du = -1;
        this.f5205dy = 0;
        m6536kk();
        if (this.f5210kk == 239) {
            m6536kk();
            int i = this.f5210kk;
            m6536kk();
            int i2 = this.f5210kk;
            if (i != 187 || i2 != 191) {
                throw new C1166gy(C14113y2.m67402k4("illegal byte order mark: EF {0,2:X} {1,2:X}", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f5209k4 = new qtr(this.f5209k4);
            this.f5207h4 = 0;
            this.f5204du = -1;
            m6536kk();
        }
        jkd jkdVar = new jkd();
        this.f5208jd = jkdVar;
        this.f5203ck = jkdVar;
    }

    /* JADX INFO: renamed from: x6 */
    private void m6556x6(int i, int i2, jkd jkdVar) {
        jkdVar.f45515k4 = 3;
    }

    /* JADX INFO: renamed from: xk */
    private void m6557xk(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 119) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6524c6(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: yd */
    private void m6558yd(int i, int i2, jkd jkdVar) {
        jkdVar.f45515k4 = 7;
    }

    /* JADX INFO: renamed from: yj */
    private void m6559yj(int i, int i2, jkd jkdVar) {
        if (this.f5210kk != 97) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6538ks(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final jkd m6560k4() {
        jkd jkdVar = this.f5208jd.f45517m9;
        if (jkdVar == null) {
            return m6531h4();
        }
        this.f5208jd = jkdVar;
        this.f5203ck = jkdVar;
        return jkdVar;
    }

    /* JADX INFO: renamed from: du */
    private boolean m6528du() {
        int i;
        int i2 = this.f5211m9;
        do {
            m6536kk();
            i = this.f5210kk;
            if (i == 10) {
                this.f5205dy = this.f5211m9 - i2;
                m6536kk();
                return true;
            }
        } while (i != 65536);
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    private void m6532h4(int i, int i2, jkd jkdVar) {
        int i3 = this.f5212to;
        int i4 = this.f5210kk;
        if ((i4 >= 65 && i4 <= 90) || (i4 >= 97 && i4 <= 122)) {
            m6545to();
            m6555x1(1, i3, jkdVar);
        } else if (i4 >= 48 && i4 <= 57) {
            m6545to();
            m6532h4(1, i3, jkdVar);
        } else if (i4 != 46) {
            jkdVar.f45515k4 = 1;
        } else {
            m6545to();
            m6527du(1, i3, jkdVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6535k4(int i, int i2, jkd jkdVar) {
        if (i != 10) {
            this.f5213up = i2 - jkdVar.f45519x1;
            m6540m9();
        }
        jkdVar.f45515k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    private void m6537kk(int i, int i2, jkd jkdVar) {
        int i3 = this.f5210kk;
        if (i3 >= 48 && i3 <= 57) {
            m6545to();
            m6546to(i, i2, jkdVar);
        } else if (i3 != 45) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6537kk(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m6541m9(int i, int i2, jkd jkdVar) {
        int i3 = this.f5212to;
        int i4 = this.f5210kk;
        if ((i4 >= 65 && i4 <= 90) || (i4 >= 97 && i4 <= 122)) {
            m6545to();
            m6555x1(1, i3, jkdVar);
        } else if (i4 < 48 || i4 > 57) {
            jkdVar.f45515k4 = 1;
        } else {
            m6545to();
            m6541m9(1, i3, jkdVar);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m6546to(int i, int i2, jkd jkdVar) {
        int i3 = this.f5210kk;
        if (i3 >= 48 && i3 <= 57) {
            m6545to();
            m6546to(i, i2, jkdVar);
        } else if (i3 != 46) {
            m6535k4(i, i2, jkdVar);
        } else {
            m6545to();
            m6527du(i, i2, jkdVar);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m6555x1(int i, int i2, jkd jkdVar) {
        int i3 = this.f5212to;
        int i4 = this.f5210kk;
        if ((i4 < 48 || i4 > 57) && ((i4 < 65 || i4 > 90) && ((i4 < 97 || i4 > 122) && i4 != 45))) {
            jkdVar.f45515k4 = 1;
        } else {
            m6545to();
            m6555x1(1, i3, jkdVar);
        }
    }
}
