package com.aspose.slides.internal.p217k4;

import com.aspose.slides.internal.p489x1.C12365to;
import com.aspose.slides.internal.p489x1.InterfaceC12359fa;
import com.aspose.slides.internal.p489x1.InterfaceC12366up;
import com.aspose.slides.internal.p489x1.InterfaceC12368yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.um */
/* JADX INFO: loaded from: classes.dex */
public class C5598um extends Exception {

    /* JADX INFO: renamed from: c5 */
    public int f15420c5;

    /* JADX INFO: renamed from: ck */
    public boolean f15421ck;

    /* JADX INFO: renamed from: du */
    public int f15422du;

    /* JADX INFO: renamed from: dy */
    public int f15423dy;

    /* JADX INFO: renamed from: h4 */
    public InterfaceC5591lr f15424h4;

    /* JADX INFO: renamed from: jd */
    public int f15425jd;

    /* JADX INFO: renamed from: m9 */
    public Object f15426m9;

    /* JADX INFO: renamed from: to */
    public transient InterfaceC5607yj f15427to;

    public C5598um() {
    }

    /* JADX INFO: renamed from: k4 */
    public void m22990k4(InterfaceC5607yj interfaceC5607yj) {
        InterfaceC12368yj interfaceC12368yj = (InterfaceC12368yj) interfaceC5607yj;
        this.f15426m9 = interfaceC12368yj.m57950kk(1);
        InterfaceC12366up interfaceC12366upM57948h4 = interfaceC12368yj.m57948h4();
        InterfaceC5591lr interfaceC5591lrMo57912m9 = interfaceC12366upM57948h4.mo57912m9(this.f15426m9);
        if (interfaceC5591lrMo57912m9 == null) {
            Object obj = this.f15426m9;
            if (!(obj instanceof InterfaceC12359fa)) {
                this.f15424h4 = new C5580c5(interfaceC12366upM57948h4.mo57911kk(obj), interfaceC12366upM57948h4.mo57913to(this.f15426m9));
                return;
            }
            this.f15420c5 = ((InterfaceC12359fa) obj).mo57921dy();
            this.f15425jd = ((InterfaceC12359fa) this.f15426m9).mo57917c5();
            Object obj2 = this.f15426m9;
            if (obj2 instanceof C12365to) {
                this.f15424h4 = ((C12365to) obj2).f41343h4;
                return;
            }
            return;
        }
        this.f15424h4 = interfaceC5591lrMo57912m9;
        if (interfaceC5591lrMo57912m9.mo22919kk() > 0) {
            this.f15420c5 = interfaceC5591lrMo57912m9.mo22919kk();
            this.f15425jd = interfaceC5591lrMo57912m9.mo22922to();
            return;
        }
        Object objM57950kk = interfaceC12368yj.m57950kk(-1);
        int i = -1;
        while (objM57950kk != null) {
            InterfaceC5591lr interfaceC5591lrMo57912m92 = interfaceC12366upM57948h4.mo57912m9(objM57950kk);
            if (interfaceC5591lrMo57912m92 != null && interfaceC5591lrMo57912m92.mo22919kk() > 0) {
                this.f15420c5 = interfaceC5591lrMo57912m92.mo22919kk();
                this.f15425jd = interfaceC5591lrMo57912m92.mo22922to();
                this.f15421ck = true;
                return;
            }
            i--;
            objM57950kk = interfaceC12368yj.m57950kk(i);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public int m22991x1() {
        InterfaceC5607yj interfaceC5607yj = this.f15427to;
        return interfaceC5607yj instanceof InterfaceC5578b3 ? this.f15424h4.mo22915k4() : interfaceC5607yj instanceof InterfaceC12368yj ? ((InterfaceC12368yj) interfaceC5607yj).m57948h4().mo57911kk(this.f15426m9) : this.f15423dy;
    }

    public C5598um(InterfaceC5607yj interfaceC5607yj) {
        this.f15427to = interfaceC5607yj;
        this.f15422du = interfaceC5607yj.mo22958x1();
        if (interfaceC5607yj instanceof InterfaceC5578b3) {
            InterfaceC5591lr interfaceC5591lrMo22909h4 = ((InterfaceC5578b3) interfaceC5607yj).mo22909h4(1);
            this.f15424h4 = interfaceC5591lrMo22909h4;
            this.f15420c5 = interfaceC5591lrMo22909h4.mo22919kk();
            this.f15425jd = this.f15424h4.mo22922to();
        }
        if (interfaceC5607yj instanceof InterfaceC12368yj) {
            m22990k4(interfaceC5607yj);
            return;
        }
        if (!(interfaceC5607yj instanceof InterfaceC5585h4)) {
            this.f15423dy = interfaceC5607yj.mo22951k4(1);
            return;
        }
        this.f15423dy = interfaceC5607yj.mo22951k4(1);
        InterfaceC5585h4 interfaceC5585h4 = (InterfaceC5585h4) interfaceC5607yj;
        this.f15420c5 = interfaceC5585h4.mo22945h4();
        this.f15425jd = interfaceC5585h4.mo22947m9();
    }
}
