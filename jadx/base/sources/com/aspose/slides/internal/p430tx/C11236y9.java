package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13958qb;
import com.aspose.slides.p559ms.System.Xml.C13929li;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.y9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11236y9 implements InterfaceC11225vh {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13958qb f38787k4;

    /* JADX INFO: renamed from: x1 */
    private C11234xw f38788x1;

    public C11236y9(C11234xw c11234xw, AbstractC13958qb abstractC13958qb) {
        if (abstractC13958qb == null) {
            throw new ArgumentNullException("writer");
        }
        this.f38787k4 = abstractC13958qb;
        this.f38788x1 = c11234xw;
    }

    @Override // com.aspose.slides.internal.p430tx.InterfaceC11225vh
    /* JADX INFO: renamed from: k4 */
    public final int mo53837k4(C11226vj c11226vj) {
        C11195jd c11195jdM54067to = c11226vj.m54067to();
        switch (c11195jdM54067to.m53820du()) {
            case 0:
            case 2:
            case 6:
            case 9:
            case 11:
            case 12:
            case 16:
                break;
            case 1:
                this.f38787k4.mo12953k4(c11195jdM54067to.m53829kk(), c11195jdM54067to.m53822k4(), c11195jdM54067to.m53834x1());
                m54213k4(c11226vj.m54055du(), c11226vj.m54057h4());
                if (c11195jdM54067to.m53831m9()) {
                    this.f38787k4.mo21898jd();
                }
                break;
            case 3:
            case 13:
            case 14:
                this.f38787k4.mo21918x1(c11195jdM54067to.m53832to());
                break;
            case 4:
                this.f38787k4.mo21894du(c11195jdM54067to.m53832to());
                break;
            case 5:
                this.f38787k4.mo21910kk(c11195jdM54067to.m53822k4());
                break;
            case 7:
                this.f38787k4.mo21907k4(c11195jdM54067to.m53822k4(), c11195jdM54067to.m53832to());
                break;
            case 8:
                this.f38787k4.mo21897h4(c11195jdM54067to.m53832to());
                break;
            case 10:
                this.f38787k4.mo21895dy(c11195jdM54067to.m53832to());
                break;
            case 15:
                this.f38787k4.mo21892ck();
                break;
            default:
                C6005k4.m24259k4(C14113y2.m67408k4("Invalid NodeType on output: ", C14042ak.m66410k4(C13929li.class, c11195jdM54067to.m53820du())));
                break;
        }
        c11226vj.m54066m9();
        return 0;
    }

    @Override // com.aspose.slides.internal.p430tx.InterfaceC11225vh
    /* JADX INFO: renamed from: x1 */
    public final void mo53839x1() {
        this.f38787k4.mo21896h4();
        this.f38787k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m54213k4(ArrayList arrayList, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            C11195jd c11195jd = (C11195jd) arrayList.get_Item(i2);
            this.f38787k4.m65809x1(c11195jd.m53829kk(), c11195jd.m53822k4(), c11195jd.m53834x1(), c11195jd.m53832to());
        }
    }
}
