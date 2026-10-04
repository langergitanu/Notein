package com.aspose.slides.internal.p388rv;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p237ks.C5906k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.rv.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10112k4 extends AbstractC10113kk {
    public C10112k4(C5906k4 c5906k4) {
        super(c5906k4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static int m49691x1(C5906k4.k4 k4Var, C5906k4.k4 k4Var2) {
        return C14057f9.m66580k4(k4Var.m23794k4(), k4Var2.m23794k4()) * (-1);
    }

    @Override // com.aspose.slides.internal.p388rv.AbstractC10113kk
    /* JADX INFO: renamed from: k4 */
    public String mo49689k4(int i) {
        C5906k4 c5906k4M49693k4 = m49693k4();
        if (i < 0) {
            return c5906k4M49693k4.m23789m9().mo49689k4(i);
        }
        c5906k4M49693k4.m23778du().sort(new AbstractC14074ks<C5906k4.k4>() { // from class: com.aspose.slides.internal.rv.k4.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Css.Model.CounterStyleConverters.AdditiveCounterStyleConverter.AdditiveGlyphsInvertSort(Aspose.Css.Model.CounterStyle.AdditiveTuple,Aspose.Css.Model.CounterStyle.AdditiveTuple)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1193k4(C5906k4.k4 k4Var, C5906k4.k4 k4Var2) {
                return C10112k4.m49691x1(k4Var, k4Var2);
            }
        });
        if (i == 0) {
            return m49693k4().m23778du().get_Item(m49693k4().m23778du().size() + (-1)).m23794k4() == 0 ? m49693k4().m23778du().get_Item(m49693k4().m23778du().size() - 1).m23795x1() : m49693k4().m23789m9().mo49689k4(i);
        }
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<C5906k4.k4> it = m49693k4().m23778du().iterator();
        int iM23794k4 = i;
        while (iM23794k4 > 0 && it.hasNext()) {
            int iM23794k42 = iM23794k4 / it.next().m23794k4();
            if (iM23794k42 > 3) {
                return m49693k4().m23789m9().mo49689k4(i);
            }
            while (iM23794k42 > 0) {
                c6765kp.m26792k4(it.next().m23795x1());
                iM23794k4 -= it.next().m23794k4();
                iM23794k42--;
            }
        }
        return c6765kp.toString();
    }
}
