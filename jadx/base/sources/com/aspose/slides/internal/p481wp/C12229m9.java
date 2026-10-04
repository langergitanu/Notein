package com.aspose.slides.internal.p481wp;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p097e0.C3507ak;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12229m9 extends AbstractC12244yj {

    /* JADX INFO: renamed from: du */
    private List<List<C12220dy>> f40673du;

    /* JADX INFO: renamed from: dy */
    private InterfaceC12217c5 f40674dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f40675h4;

    /* JADX INFO: renamed from: kk */
    private C12243yd f40676kk;

    /* JADX INFO: renamed from: m9 */
    private List<C12220dy> f40677m9;

    /* JADX INFO: renamed from: to */
    private int f40678to;

    /* JADX INFO: renamed from: x1 */
    private int f40679x1;

    public C12229m9(C12232rv c12232rv) {
        super(c12232rv);
        this.f40676kk = null;
        this.f40675h4 = true;
        this.f40679x1 = c12232rv.m57097sv();
        if (c12232rv.m57102zj()) {
            this.f40674dy = new C12227ks();
        } else {
            this.f40674dy = new C12241x1(c12232rv);
        }
        m57070to();
    }

    /* JADX INFO: renamed from: to */
    private void m57070to() {
        this.f40673du = new List<>();
        this.f40678to = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: k4 */
    public void mo57071k4() {
        if (this.f40678to > 0 && this.f40676kk.mo17279ss() != 9) {
            C12214ar.m56996k4(this.f40676kk.m14111q_().m59580u4()).mo57006k4((Object) this, this.f40676kk.m14105ks(), true, this.f40676kk.m14106m_());
        }
        if (this.f40678to < this.f40673du.size() - 1 && this.f40676kk.mo17280wp() != 9) {
            C12214ar.m56996k4(this.f40676kk.m14111q_().m59580u4()).mo57006k4((Object) this, this.f40676kk.m14105ks(), false, this.f40676kk.m14106m_());
        }
        if (this.f40673du.size() != 0) {
            C1869to c1869to = new C1869to(this.f40673du.get_Item(this.f40678to));
            while (c1869to.mo9764x1()) {
                C12220dy c12220dy = (C12220dy) c1869to.mo9760kk();
                if (c12220dy != null) {
                    c12220dy.m57044k4(this.f40676kk);
                }
            }
            m57069k4((AbstractC12237uz) this.f40676kk);
        }
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: kk */
    public void mo57075kk() {
        this.f40674dy.mo57001x1();
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: x1 */
    public void mo57076x1() {
        if (this.f40673du.size() > 0) {
            throw new C3507ak("A table-cell is spanning more rows than available in its parent element.");
        }
        m57068k4(1, this.f40677m9);
        this.f40674dy.mo56998k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m57068k4(int i, List<C12220dy> list) {
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            ((C12220dy) c1869to.mo9760kk()).m57048to(i);
        }
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: x1 */
    public void mo57077x1(AbstractC12228lr abstractC12228lr) {
        this.f40675h4 = true;
        this.f40674dy.mo57000k4(abstractC12228lr);
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: k4 */
    public void mo57072k4(AbstractC12228lr abstractC12228lr) {
        m57069k4((AbstractC12237uz) abstractC12228lr);
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: k4 */
    public void mo57073k4(C12234u4 c12234u4) {
        int size = this.f40673du.size();
        while (true) {
            if (size >= c12234u4.m57117sv() + this.f40678to) {
                break;
            }
            List<C12220dy> list = new List<>(this.f40679x1);
            for (int i = 0; i < this.f40679x1; i++) {
                list.addItem(null);
            }
            this.f40673du.addItem(list);
            size++;
        }
        int iM57108bz = c12234u4.m57108bz() - 1;
        C12236up c12236up = new C12236up(c12234u4, iM57108bz);
        List<C12220dy> list2 = this.f40673du.get_Item(this.f40678to);
        if (list2.size() > iM57108bz) {
            list2.set_Item(iM57108bz, c12236up);
        }
        if (c12234u4.m57111g8() + iM57108bz > list2.size()) {
            c12234u4.m57109du(list2.size() - iM57108bz);
        }
        C12220dy[] c12220dyArr = new C12220dy[c12234u4.m57111g8()];
        c12220dyArr[0] = c12236up;
        for (int i2 = 1; i2 < c12234u4.m57111g8(); i2++) {
            C12220dy c12220dy = new C12220dy(c12236up, i2, 0);
            list2.set_Item(iM57108bz + i2, c12220dy);
            c12220dyArr[i2] = c12220dy;
        }
        c12236up.m57130k4(c12220dyArr);
        for (int i3 = 1; i3 < c12234u4.m57117sv(); i3++) {
            List<C12220dy> list3 = this.f40673du.get_Item(this.f40678to + i3);
            C12220dy[] c12220dyArr2 = new C12220dy[c12234u4.m57111g8()];
            for (int i4 = 0; i4 < c12234u4.m57111g8(); i4++) {
                C12220dy c12220dy2 = new C12220dy(c12236up, i4, i3);
                list3.set_Item(iM57108bz + i4, c12220dy2);
                c12220dyArr2[i4] = c12220dy2;
            }
            c12236up.m57130k4(c12220dyArr2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m57069k4(AbstractC12237uz abstractC12237uz) {
        List<C12220dy> list = this.f40673du.get_Item(this.f40678to);
        this.f40677m9 = list;
        for (int i = 0; i < this.f40679x1; i++) {
            if (list.get_Item(i) == null) {
                list.set_Item(i, new C12222h4(this.f40800k4, this.f40676kk, i));
            }
        }
        this.f40674dy.mo56999k4(list, abstractC12237uz);
        if (this.f40675h4) {
            m57068k4(0, list);
            this.f40675h4 = false;
        }
        if (this.f40678to == this.f40673du.size() - 1) {
            abstractC12237uz.mo57061bz().m57063k4(this.f40673du);
            m57070to();
        } else {
            this.f40678to++;
        }
        this.f40676kk = null;
    }

    @Override // com.aspose.slides.internal.p481wp.AbstractC12244yj
    /* JADX INFO: renamed from: k4 */
    public void mo57074k4(C12243yd c12243yd) {
        this.f40676kk = c12243yd;
    }
}
