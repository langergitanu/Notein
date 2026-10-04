package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.lh */
/* JADX INFO: loaded from: classes3.dex */
final class C13776lh {

    /* JADX INFO: renamed from: kk */
    private int f45992kk;

    /* JADX INFO: renamed from: k4 */
    private List<sxo> f45991k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private boolean f45994x1 = false;

    /* JADX INFO: renamed from: to */
    private int f45993to = -1;

    /* JADX INFO: renamed from: k4 */
    public final void m64391k4(sxo sxoVar) {
        int i;
        if (sxoVar == null) {
            return;
        }
        if (this.f45991k4.size() < 1) {
            this.f45994x1 = true;
        }
        if (this.f45991k4.size() > 0 && sxoVar.m70852h4()) {
            boolean z = false;
            boolean z2 = this.f45991k4.get_Item(this.f45992kk).f48961k4 == sxoVar.f48961k4;
            if (!z2 && this.f45991k4.get_Item(this.f45992kk).m70863m9() == sxoVar.m70863m9() && C14113y2.m67363du(this.f45991k4.get_Item(this.f45992kk).f48961k4.f48541k4.getLanguageId(), sxoVar.f48961k4.f48541k4.getLanguageId()) && ((i = this.f45993to) < 0 || C14113y2.m67363du(this.f45991k4.get_Item(i).f48961k4.f48541k4.getLanguageId(), sxoVar.f48961k4.f48541k4.getLanguageId()))) {
                z = true;
            }
            if (z2 || z) {
                this.f45991k4.insertItem(this.f45992kk, sxoVar);
                if (z) {
                    this.f45993to = this.f45991k4.size() - 1;
                    return;
                }
                return;
            }
        }
        if (this.f45991k4.size() > 0 && this.f45993to < 0) {
            this.f45993to = this.f45991k4.size() - 1;
        }
        this.f45991k4.addItem(sxoVar);
        this.f45992kk = this.f45991k4.size() - 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64392k4(AbstractC14897zn abstractC14897zn, ay6 ay6Var, boolean z, kg7 kg7Var) {
        if (ay6Var == null || abstractC14897zn == null || this.f45991k4.size() < 1) {
            return;
        }
        if (this.f45993to < 0) {
            this.f45993to = 0;
        }
        float fM56557jd = this.f45991k4.get_Item(this.f45993to).m70875x1().m56557jd();
        if (z) {
            fM56557jd = this.f45991k4.get_Item(this.f45993to).m70875x1().m56557jd() + this.f45991k4.get_Item(this.f45993to).m70875x1().m56550c5();
        }
        if (z) {
            for (int i = 0; i < this.f45991k4.size(); i++) {
                sxo sxoVar = this.f45991k4.get_Item(i);
                fM56557jd -= sxoVar.m70875x1().m56550c5();
                C12007ix c12007ix = new C12007ix(new C12025x6(fM56557jd, sxoVar.m70875x1().m56551ck()), sxoVar.m70875x1().m56570m9().Clone());
                ay6Var.m3857k4(abstractC14897zn, sxoVar.m70847du().Clone(), c12007ix.Clone(), sxoVar.m70860kk(), kg7Var);
                ay6Var.m3862k4(abstractC14897zn, sxoVar, c12007ix.Clone(), false, kg7Var);
            }
        } else {
            int size = this.f45991k4.size();
            while (size > 0) {
                size--;
                sxo sxoVar2 = this.f45991k4.get_Item(size);
                C12007ix c12007ix2 = new C12007ix(new C12025x6(fM56557jd, sxoVar2.m70875x1().m56551ck()), sxoVar2.m70875x1().m56570m9().Clone());
                ay6Var.m3857k4(abstractC14897zn, sxoVar2.m70847du().Clone(), c12007ix2.Clone(), sxoVar2.m70860kk(), kg7Var);
                ay6Var.m3862k4(abstractC14897zn, sxoVar2, c12007ix2.Clone(), false, kg7Var);
                fM56557jd += sxoVar2.m70875x1().m56550c5();
            }
        }
        this.f45991k4.clear();
        this.f45994x1 = false;
        this.f45992kk = 0;
        this.f45993to = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64393k4() {
        return this.f45994x1;
    }
}
