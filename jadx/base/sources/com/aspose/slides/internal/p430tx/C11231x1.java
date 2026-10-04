package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.p229ki.C5694em;
import com.aspose.slides.internal.p229ki.C5709jw;
import com.aspose.slides.internal.p229ki.C5716m2;
import com.aspose.slides.internal.p229ki.C5755wz;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11231x1 {

    /* JADX INFO: renamed from: c5 */
    private AbstractC10929m9 f38745c5;

    /* JADX INFO: renamed from: ck */
    private String f38746ck;

    /* JADX INFO: renamed from: du */
    private AbstractC11197k4 f38747du;

    /* JADX INFO: renamed from: dy */
    private AbstractC10929m9 f38748dy;

    /* JADX INFO: renamed from: h4 */
    private C11231x1 f38749h4;

    /* JADX INFO: renamed from: jd */
    private C11184f9 f38750jd;

    /* JADX INFO: renamed from: k4 */
    private int f38751k4;

    /* JADX INFO: renamed from: kk */
    private Object[] f38752kk;

    /* JADX INFO: renamed from: m9 */
    private int f38753m9;

    /* JADX INFO: renamed from: to */
    private Hashtable f38754to;

    /* JADX INFO: renamed from: x1 */
    private int f38755x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.x1$k4 */
    public static class k4 extends C5709jw {
        public k4(ArrayList arrayList) {
            super(arrayList);
        }

        @Override // com.aspose.slides.internal.p229ki.C5709jw, com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
        /* JADX INFO: renamed from: k4 */
        public AbstractC10929m9 deepClone() {
            return new k4(this);
        }

        @Override // com.aspose.slides.internal.p229ki.C5709jw, com.aspose.slides.internal.p418tf.AbstractC10929m9
        /* JADX INFO: renamed from: kk */
        public AbstractC10925du mo21834kk() {
            return ((C5694em) this.f15745k4.get_Item(this.f15746x1 - 1)).m23236kk();
        }

        public k4(k4 k4Var) {
            super((C5709jw) k4Var);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m54086c5() {
        Hashtable hashtable = this.f38754to;
        if (hashtable != null) {
            hashtable.clear();
        }
    }

    /* JADX INFO: renamed from: ck */
    public final void m54087ck() {
        m54091jd();
        this.f38749h4 = null;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC10925du m54088du() {
        AbstractC10929m9 abstractC10929m9 = this.f38748dy;
        if (abstractC10929m9 != null) {
            return abstractC10929m9.mo21834kk();
        }
        return null;
    }

    /* JADX INFO: renamed from: dy */
    public final int m54089dy() {
        int i = this.f38755x1 + 1;
        this.f38755x1 = i;
        return i;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC10929m9 m54090h4() {
        return this.f38748dy;
    }

    /* JADX INFO: renamed from: jd */
    public final void m54091jd() {
        m54094k4(-1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11184f9 m54092k4() {
        return this.f38750jd;
    }

    /* JADX INFO: renamed from: kk */
    public final int m54107kk() {
        return this.f38751k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC10929m9 m54110m9() {
        return this.f38745c5;
    }

    /* JADX INFO: renamed from: to */
    public final int m54111to() {
        return this.f38755x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m54113x1() {
        return this.f38746ck;
    }

    /* JADX INFO: renamed from: du */
    private AbstractC11197k4 m54084du(int i) {
        return ((C11232x6) this.f38747du).m54131k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m54093k4(C13890ei c13890ei) {
        Hashtable hashtable = this.f38754to;
        if (hashtable != null) {
            return hashtable.get_Item(c13890ei);
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final void m54108kk(int i) {
        if (i > 0) {
            this.f38752kk = new Object[i];
        } else {
            this.f38752kk = null;
        }
    }

    /* JADX INFO: renamed from: to */
    public final Object m54112to(int i) {
        return this.f38752kk[i];
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54114x1(int i) {
        this.f38755x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54094k4(int i) {
        this.f38751k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m54109kk(C11234xw c11234xw) {
        int iMo21857kk;
        boolean zMo21770x1 = this.f38745c5.mo21770x1();
        if (zMo21770x1 && c11234xw.m54205x1().m53869k4() && this.f38745c5.mo21834kk().mo21857kk() == 6) {
            AbstractC10925du abstractC10925duDeepClone = this.f38745c5.mo21834kk().deepClone();
            do {
                abstractC10925duDeepClone.mo21855k4(this.f38745c5.mo21834kk());
                abstractC10925duDeepClone.mo21864ne();
                boolean z = !c11234xw.m54205x1().m53870k4(c11234xw, abstractC10925duDeepClone) && (zMo21770x1 = this.f38745c5.mo21770x1());
                iMo21857kk = this.f38745c5.mo21834kk().mo21857kk();
                if (!z) {
                    break;
                }
            } while (iMo21857kk == 6);
        }
        return zMo21770x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54115x1(AbstractC10929m9 abstractC10929m9) {
        this.f38745c5 = abstractC10929m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54095k4(int i, Object obj) {
        this.f38752kk[i] = obj;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m54116x1(C11234xw c11234xw) {
        int iMo21857kk;
        boolean zMo21770x1 = this.f38748dy.mo21770x1();
        if (zMo21770x1 && c11234xw.m54205x1().m53869k4() && this.f38748dy.mo21834kk().mo21857kk() == 6) {
            AbstractC10925du abstractC10925duDeepClone = this.f38748dy.mo21834kk().deepClone();
            do {
                abstractC10925duDeepClone.mo21855k4(this.f38748dy.mo21834kk());
                abstractC10925duDeepClone.mo21864ne();
                boolean z = !c11234xw.m54205x1().m53870k4(c11234xw, abstractC10925duDeepClone) && (zMo21770x1 = this.f38748dy.mo21770x1());
                iMo21857kk = this.f38748dy.mo21834kk().mo21857kk();
                if (!z) {
                    break;
                }
            } while (iMo21857kk == 6);
        }
        return zMo21770x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54096k4(AbstractC10929m9 abstractC10929m9) {
        this.f38748dy = abstractC10929m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54097k4(C11184f9 c11184f9) {
        this.f38750jd = c11184f9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54098k4(AbstractC11197k4 abstractC11197k4) {
        m54099k4(abstractC11197k4, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54099k4(AbstractC11197k4 abstractC11197k4, int i) {
        this.f38747du = abstractC11197k4;
        this.f38751k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54100k4(AbstractC11197k4 abstractC11197k4, AbstractC10929m9 abstractC10929m9) {
        m54085k4(abstractC11197k4, null, abstractC10929m9);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54085k4(AbstractC11197k4 abstractC11197k4, C11231x1 c11231x1, AbstractC10929m9 abstractC10929m9) {
        this.f38751k4 = 0;
        this.f38747du = abstractC11197k4;
        this.f38749h4 = c11231x1;
        this.f38753m9 = 0;
        this.f38748dy = abstractC10929m9;
        this.f38745c5 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54101k4(C11231x1 c11231x1) {
        this.f38752kk = c11231x1.f38752kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54102k4(C11231x1 c11231x1, AbstractC10929m9 abstractC10929m9) {
        m54085k4(c11231x1.m54084du(0), c11231x1, abstractC10929m9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54103k4(C11234xw c11234xw, ArrayList arrayList) {
        int size = arrayList.size();
        C5755wz c5755wz = new C5755wz(size);
        for (int i = 0; i < size; i++) {
            C11218tq c11218tq = (C11218tq) arrayList.get_Item(i);
            c5755wz.m23358k4(c11234xw.m54193kk(c11218tq.f38705k4), new C5716m2(c11218tq.f38707to, c11218tq.f38704du, c11218tq.f38708x1, c11218tq.f38706kk));
        }
        ArrayList arrayList2 = new ArrayList();
        while (m54109kk(c11234xw)) {
            AbstractC10929m9 abstractC10929m9 = this.f38748dy;
            this.f38748dy = this.f38745c5;
            C5694em c5694em = new C5694em(size, arrayList2.size(), this.f38745c5.mo21834kk().deepClone());
            for (int i2 = 0; i2 < size; i2++) {
                c5694em.m23235k4(i2, c5755wz.m23357k4(i2).mo23148k4(this.f38745c5));
            }
            arrayList2.addItem(c5694em);
            this.f38748dy = abstractC10929m9;
        }
        arrayList2.sort(c5755wz);
        this.f38745c5 = new k4(arrayList2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54104k4(C13890ei c13890ei, Object obj) {
        if (this.f38754to == null) {
            this.f38754to = new Hashtable();
        }
        this.f38754to.set_Item(c13890ei, obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54105k4(String str) {
        this.f38746ck = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m54106k4(C11234xw c11234xw) {
        AbstractC11197k4 abstractC11197k4 = this.f38747du;
        if (abstractC11197k4 == null) {
            return true;
        }
        abstractC11197k4.mo53668k4(c11234xw, this);
        if (m54107kk() == -1) {
            C11231x1 c11231x1 = this.f38749h4;
            if (c11231x1 != null) {
                int i = this.f38753m9 + 1;
                this.f38753m9 = i;
                this.f38747du = c11231x1.m54084du(i);
                m54094k4(0);
            } else {
                this.f38747du = null;
            }
            if (this.f38747du == null) {
                return true;
            }
        }
        return false;
    }
}
