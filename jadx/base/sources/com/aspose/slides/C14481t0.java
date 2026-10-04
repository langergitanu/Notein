package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8251mb;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.t0 */
/* JADX INFO: loaded from: classes3.dex */
class C14481t0 extends C13719ka {

    /* JADX INFO: renamed from: to */
    private static final C3068ks f49001to = new C3068ks("none", "animLvl", "animOne", "bulEnabled", "chMax", "chPref", "dir", "hierBranch", "orgChart", "resizeHandles");

    /* JADX INFO: renamed from: k4 */
    private C8251mb f49002k4;

    /* JADX INFO: renamed from: kk */
    private fp3 f49003kk;

    /* JADX INFO: renamed from: x1 */
    private int f49004x1;

    public C14481t0(C8251mb c8251mb, fp3 fp3Var) {
        super(c8251mb);
        this.f49002k4 = c8251mb;
        this.f49004x1 = f49001to.m12963k4(c8251mb.m36768dy());
        this.f49003kk = fp3Var;
    }

    /* JADX INFO: renamed from: x1 */
    private String m70915x1(C14244on c14244on, bay bayVar) {
        List<C14244on> listM68725k4 = c14244on.m68725k4(this, bayVar.m4077jd() != null ? bayVar.m4077jd().mo3654x1() : false);
        switch (this.f49002k4.m36773m9()) {
            case 1:
                return C14057f9.m66586k4(listM68725k4.size(), (InterfaceC14073kp) C11697x1.m55250kk());
            case 2:
                return C14057f9.m66586k4(c14244on.m68731to(), (InterfaceC14073kp) C11697x1.m55250kk());
            case 3:
                int iM68721du = c14244on.m68721du();
                if (c14244on.m5149yj() == 6) {
                    iM68721du--;
                }
                return C14057f9.m66586k4(iM68721du, (InterfaceC14073kp) C11697x1.m55250kk());
            case 4:
                return (c14244on.m68731to() % 2 == 0 && listM68725k4.containsItem(c14244on)) ? "1" : "0";
            case 5:
                return (c14244on.m68731to() % 2 == 0 || !listM68725k4.containsItem(c14244on)) ? "0" : "1";
            case 6:
                return ((m6r) this.f49003kk.m72918k4(m6r.class)).m64782k4(this.f49004x1, bayVar);
            case 7:
                return C14057f9.m66586k4(c14244on.m5146rv(), (InterfaceC14073kp) C11697x1.m55250kk());
            case 8:
                List.Enumerator<C14244on> it = c14244on.m68725k4((C13719ka) this, false).iterator();
                int iM5146rv = 0;
                while (it.hasNext()) {
                    try {
                        C14244on next = it.next();
                        if (next.m5146rv() > iM5146rv) {
                            iM5146rv = next.m5146rv();
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                    break;
                }
                if (m63730k4().size() > 1) {
                    List<C14244on> listM68726k4 = c14244on.m68726k4(this, false, 0, false);
                    if (listM68726k4.size() > 0) {
                        c14244on = listM68726k4.get_Item(0);
                    }
                }
                return C14057f9.m66586k4(iM5146rv - c14244on.m5146rv(), (InterfaceC14073kp) C11697x1.m55250kk());
            default:
                return C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m70916k4(C14244on c14244on, bay bayVar) {
        int i;
        String strM70915x1 = m70915x1(c14244on, bayVar);
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(strM70915x1, iArr);
        int i2 = iArr[0];
        if (zM66590k4) {
            int[] iArr2 = {0};
            C14057f9.m66590k4(this.f49002k4.m36770jd(), iArr2);
            i = iArr2[0];
        } else {
            i = 0;
        }
        switch (this.f49002k4.m36765c5()) {
            case 1:
                return zM66590k4 ? i2 == i : C14113y2.m67363du(strM70915x1, this.f49002k4.m36770jd());
            case 2:
                return zM66590k4 ? i2 != i : !C14113y2.m67363du(strM70915x1, this.f49002k4.m36770jd());
            case 3:
                if (zM66590k4) {
                    return i2 > i;
                }
                throw new PptxException("operator \"if\" expression is invalid");
            case 4:
                if (zM66590k4) {
                    return i2 < i;
                }
                throw new PptxException("operator \"if\" expression is invalid");
            case 5:
                if (zM66590k4) {
                    return i2 >= i;
                }
                throw new PptxException("operator \"if\" expression is invalid");
            case 6:
                if (zM66590k4) {
                    return i2 <= i;
                }
                throw new PptxException("operator \"if\" expression is invalid");
            default:
                return false;
        }
    }
}
