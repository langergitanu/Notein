package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.C10931x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13965r5;
import com.aspose.slides.p559ms.System.Xml.C13929li;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C11215sv implements InterfaceC11225vh {

    /* JADX INFO: renamed from: k4 */
    private C10931x1 f38696k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13965r5 f38697kk;

    /* JADX INFO: renamed from: x1 */
    private int f38698x1;

    public C11215sv(String str) {
        C10931x1 c10931x1 = new C10931x1();
        this.f38696k4 = c10931x1;
        this.f38697kk = c10931x1.m52708k4(1, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    @Override // com.aspose.slides.internal.p430tx.InterfaceC11225vh
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo53837k4(C11226vj c11226vj) {
        AbstractC13965r5 abstractC13965r5;
        String strM53822k4;
        C11195jd c11195jdM54067to = c11226vj.m54067to();
        this.f38698x1++;
        int iM53820du = c11195jdM54067to.m53820du();
        if (iM53820du != 1) {
            if (iM53820du != 3) {
                if (iM53820du != 7) {
                    if (iM53820du != 8) {
                        if (iM53820du != 9) {
                            switch (iM53820du) {
                                case 13:
                                    break;
                                case 14:
                                    break;
                                case 15:
                                    this.f38697kk.mo21920x1(c11195jdM54067to.m53829kk(), c11195jdM54067to.m53822k4(), c11195jdM54067to.m53834x1());
                                    break;
                                default:
                                    C6005k4.m24259k4(C14113y2.m67408k4("Invalid NodeType on output: ", C14042ak.m66410k4(C13929li.class, c11195jdM54067to.m53820du())));
                                    break;
                            }
                        }
                    } else {
                        this.f38697kk.mo21897h4(c11195jdM54067to.m53832to());
                    }
                } else {
                    this.f38697kk.mo21907k4(c11195jdM54067to.m53822k4(), c11195jdM54067to.m53832to());
                }
            } else {
                this.f38697kk.mo21918x1(c11195jdM54067to.m53832to());
            }
        } else {
            this.f38697kk.mo12953k4(c11195jdM54067to.m53829kk(), c11195jdM54067to.m53822k4(), c11195jdM54067to.m53834x1());
            for (int i = 0; i < c11226vj.m54057h4(); i++) {
                this.f38698x1++;
                C11195jd c11195jd = (C11195jd) c11226vj.m54055du().get_Item(i);
                if ("http://www.w3.org/2000/xmlns/".equals(c11195jd.m53834x1())) {
                    if (c11195jd.m53829kk().length() == 0) {
                        abstractC13965r5 = this.f38697kk;
                        strM53822k4 = C14113y2.f47374k4;
                    } else {
                        abstractC13965r5 = this.f38697kk;
                        strM53822k4 = c11195jd.m53822k4();
                    }
                    abstractC13965r5.mo21919x1(strM53822k4, c11195jd.m53832to());
                } else {
                    this.f38697kk.m65809x1(c11195jd.m53829kk(), c11195jd.m53822k4(), c11195jd.m53834x1(), c11195jd.m53832to());
                }
            }
            this.f38697kk.mo21899k4();
            if (c11195jdM54067to.m53831m9()) {
            }
        }
        c11226vj.m54066m9();
        return 0;
    }

    @Override // com.aspose.slides.internal.p430tx.InterfaceC11225vh
    /* JADX INFO: renamed from: x1 */
    public final void mo53839x1() {
        this.f38697kk.mo21893du();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10925du m54015k4() {
        return this.f38696k4.createNavigator();
    }
}
