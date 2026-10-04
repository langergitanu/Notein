package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ai5;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10496jl;
import com.aspose.slides.internal.p407st.C10522la;
import com.aspose.slides.internal.p407st.C10546mr;
import com.aspose.slides.internal.p407st.C10575of;
import com.aspose.slides.internal.p407st.C10597pu;
import com.aspose.slides.internal.p407st.C10630s4;
import com.aspose.slides.internal.p407st.C10678v6;
import com.aspose.slides.internal.p407st.C10751zg;
import com.aspose.slides.internal.p407st.C10752zi;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jha {
    /* JADX INFO: renamed from: k4 */
    public static void m63316k4(int i, C10546mr c10546mr, C10630s4 c10630s4, C10597pu c10597pu, jio jioVar) {
        TextStyle textStyleM63335m9 = jioVar.m63335m9();
        textStyleM63335m9.m2990to()[i] = ai5.m3599k4(textStyleM63335m9, c10546mr, c10630s4, c10597pu, jioVar.m63336to());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m63319x1(jio jioVar) {
        TextStyle textStyleM63335m9 = jioVar.m63335m9();
        C10752zi[] c10752ziArrM63327du = jioVar.m63327du();
        int i = 0;
        while (i < 5) {
            C10752zi c10752zi = c10752ziArrM63327du[i];
            i++;
            ai5.m3614k4(c10752zi, textStyleM63335m9.m2990to()[i]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63317k4(TextStyle textStyle, C10522la c10522la) {
        if (c10522la == null) {
            return;
        }
        if (c10522la.m51181x1() != null) {
            IGenericEnumerator<C10751zg> it = c10522la.m51181x1().iterator();
            while (it.hasNext()) {
                try {
                    C10751zg next = it.next();
                    textStyle.m2990to()[0].getTabs().add(((double) next.m52139k4()) / 8.0d, ai5.m3617to(next.m52143kk()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (C14093tq.m67296x1(c10522la.m51170k4(), null)) {
            textStyle.m2990to()[0].setDefaultTabSize(ai5.m3618x1(c10522la.m51170k4().m67297k4().shortValue()));
        }
        textStyle.m2990to()[0].setDefaultTabSize(Float.NaN);
        int i = 0;
        while (i < 5) {
            C10496jl c10496jlM51169k4 = c10522la.m51169k4(i);
            i++;
            if (textStyle.m2990to()[i] == null) {
                textStyle.m2984k4(i);
            }
            ai5.C0751k4 c0751k4 = new ai5.C0751k4();
            c10496jlM51169k4.m51015k4().CloneTo(c0751k4.f3908k4);
            c10496jlM51169k4.m51017x1().CloneTo(c0751k4.f3911x1);
            if (textStyle.m2990to()[i] != null && (!c0751k4.f3908k4.m67302x1() || !c0751k4.f3911x1.m67302x1())) {
                ai5.C0751k4 c0751k42 = new ai5.C0751k4();
                c0751k42.f3909kk = textStyle.m2990to()[i].getMarginLeft();
                c0751k42.f3910to = textStyle.m2990to()[i].getIndent();
                ai5.m3622x1(c0751k42);
                if (!c10496jlM51169k4.m51015k4().m67302x1()) {
                    c0751k42.f3908k4.CloneTo(c0751k4.f3908k4);
                }
                if (!c10496jlM51169k4.m51017x1().m67302x1()) {
                    c0751k42.f3911x1.CloneTo(c0751k4.f3911x1);
                }
            }
            ai5.m3607k4(c0751k4);
            textStyle.m2990to()[i].setMarginLeft(c0751k4.f3909kk);
            textStyle.m2990to()[i].setIndent(c0751k4.f3910to);
            if (c10496jlM51169k4.m51015k4().m67302x1() || c10496jlM51169k4.m51017x1().m67302x1()) {
                textStyle.m2990to()[i].m2189du().m2864k4((TabCollection) textStyle.m2990to()[0].getTabs());
                textStyle.m2990to()[i].setDefaultTabSize(textStyle.m2990to()[0].getDefaultTabSize());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63318k4(jio jioVar) {
        TextStyle textStyleM63335m9 = jioVar.m63335m9();
        C10752zi[] c10752ziArrM63327du = jioVar.m63327du();
        if (c10752ziArrM63327du.length < 1 || textStyleM63335m9 == null) {
            return;
        }
        textStyleM63335m9.m2987k4(new C14093tq<>(Integer.valueOf(jioVar.m63329h4())));
        C10678v6 c10678v6 = jioVar.m63334kk() != null ? (C10678v6) C7019kk.m27452k4((Object) jioVar.m63334kk().m64717jd(), C10678v6.class) : null;
        C10575of c10575ofM51847to = c10678v6 != null ? c10678v6.m51847to(jioVar.m63329h4()) : null;
        int i = 0;
        while (i < 5) {
            C10752zi c10752zi = c10752ziArrM63327du[i];
            C10630s4 c10630s4M51281k4 = (c10575ofM51847to == null || c10575ofM51847to.m51428kk().size() <= i) ? null : c10575ofM51847to.m51428kk().get_Item(i).m51281k4();
            if (c10752zi == null) {
                return;
            }
            i++;
            m63316k4(i, c10752zi.m52146k4(), c10630s4M51281k4, c10752zi.m52151x1(), jioVar);
        }
    }
}
