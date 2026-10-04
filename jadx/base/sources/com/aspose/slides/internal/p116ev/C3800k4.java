package com.aspose.slides.internal.p116ev;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p558zz.C13641m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ev.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3800k4 extends AbstractC3803to {

    /* JADX INFO: renamed from: du */
    private int f10349du;

    /* JADX INFO: renamed from: h4 */
    private int f10350h4;

    /* JADX INFO: renamed from: to */
    private final List<Integer> f10351to;

    public C3800k4(C13641m9 c13641m9, int i, int i2) {
        super(c13641m9, i, i2, 1);
        this.f10351to = new List<>();
        mo15178kk();
    }

    @Override // com.aspose.slides.internal.p116ev.AbstractC3803to
    /* JADX INFO: renamed from: du */
    public int mo15174du() {
        return this.f10350h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m15185h4(int i) {
        int iM15190x1 = m15190x1(i);
        if ((iM15190x1 & 8) == 8) {
            return 2;
        }
        if ((iM15190x1 & 64) == 64) {
            return 4;
        }
        return (iM15190x1 & 128) == 128 ? 8 : 0;
    }

    /* JADX INFO: renamed from: kk */
    public final int m15186kk(int i) {
        return this.f18176k4.m62997du(this.f10351to.get_Item(i).intValue() + 2);
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m15187m9(int i) {
        int iM15190x1 = m15190x1(i);
        int iIntValue = this.f10351to.get_Item(i).intValue();
        int i2 = (iM15190x1 & 1) == 1 ? iIntValue + 8 : iIntValue + 6;
        int iM15185h4 = m15185h4(i);
        byte[] bArr = new byte[iM15185h4];
        this.f18176k4.m63001k4(i2, bArr, 0, iM15185h4);
        return bArr;
    }

    /* JADX INFO: renamed from: to */
    public final int m15188to() {
        return this.f10351to.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m15190x1(int i) {
        return this.f18176k4.m62997du(this.f10351to.get_Item(i).intValue());
    }

    /* JADX INFO: renamed from: du */
    public final int m15184du(int i) {
        int iIntValue = this.f10351to.get_Item(i).intValue();
        return (m15190x1(i) & 1) == 1 ? this.f18176k4.m62997du(iIntValue + 6) : this.f18176k4.m63008to(iIntValue + 5);
    }

    @Override // com.aspose.slides.internal.p116ev.AbstractC3803to
    /* JADX INFO: renamed from: h4 */
    public C13641m9 mo15175h4() {
        return (C13641m9) this.f18176k4.mo62967kk(this.f10349du, mo15174du());
    }

    @Override // com.aspose.slides.internal.p116ev.AbstractC3803to
    /* JADX INFO: renamed from: kk */
    public void mo15178kk() {
        if (((AbstractC3803to) this).f10362x1 || ((AbstractC3803to) this).f10362x1) {
            return;
        }
        int i = 10;
        int iM62997du = 32;
        while ((iM62997du & 32) == 32) {
            this.f10351to.addItem(Integer.valueOf(i));
            iM62997du = this.f18176k4.m62997du(i);
            i = (iM62997du & 1) == 1 ? i + 8 : i + 6;
            if ((iM62997du & 8) == 8) {
                i += 2;
            } else if ((iM62997du & 64) == 64) {
                i += 4;
            } else if ((iM62997du & 128) == 128) {
                i += 8;
            }
        }
        if ((iM62997du & 256) == 256) {
            int iM62997du2 = this.f18176k4.m62997du(i);
            this.f10350h4 = iM62997du2;
            int i2 = i + 2;
            this.f10349du = i2;
            i = i2 + iM62997du2;
        }
        m26220k4(m26240x1() - i);
    }

    /* JADX INFO: renamed from: to */
    public final int m15189to(int i) {
        int iIntValue = this.f10351to.get_Item(i).intValue() + 4;
        return (m15190x1(i) & 1) == 1 ? this.f18176k4.m62997du(iIntValue) : this.f18176k4.m63008to(iIntValue);
    }
}
