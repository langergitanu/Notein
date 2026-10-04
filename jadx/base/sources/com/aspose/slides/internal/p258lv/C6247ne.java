package com.aspose.slides.internal.p258lv;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p302nm.C6922h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p420th.C10959ix;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C6247ne extends C6257wy {

    /* JADX INFO: renamed from: c5 */
    private int f17705c5;

    /* JADX INFO: renamed from: du */
    private Dictionary<Short, byte[]> f17706du;

    /* JADX INFO: renamed from: dy */
    private int f17707dy;

    /* JADX INFO: renamed from: h4 */
    private Dictionary<Short, C10959ix> f17708h4;

    /* JADX INFO: renamed from: k4 */
    private Dictionary<Short, C10963ks> f17709k4;

    /* JADX INFO: renamed from: kk */
    private Dictionary<Short, C6245lr> f17710kk;

    /* JADX INFO: renamed from: m9 */
    private short f17711m9;

    /* JADX INFO: renamed from: to */
    private List<C9790ts> f17712to;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<Short, C10971um> f17713x1;

    public C6247ne(C6258x1 c6258x1, short s, C12015qq c12015qq) {
        super(c6258x1);
        this.f17709k4 = new Dictionary<>();
        this.f17713x1 = new Dictionary<>();
        this.f17710kk = new Dictionary<>();
        this.f17712to = new List<>();
        this.f17706du = new Dictionary<>();
        this.f17708h4 = new Dictionary<>();
        this.f17711m9 = s;
        this.f17707dy = C12566m9.m58636c5(c12015qq.m56699x1());
        this.f17705c5 = C12566m9.m58636c5(c12015qq.m56697kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final int m25351k4() {
        return this.f17707dy;
    }

    /* JADX INFO: renamed from: kk */
    public final Dictionary<Short, C10959ix> m25358kk() {
        return this.f17708h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m25359x1() {
        return this.f17705c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final short m25352k4(C10963ks c10963ks) {
        C9790ts c9790tsM23120k4 = c10963ks.m53005x1().m23120k4();
        if (!m25385m9().m25398k4(c9790tsM23120k4)) {
            this.f17712to.addItem(c9790tsM23120k4);
        }
        m25385m9().m25400kk(c9790tsM23120k4).m25265k4(c10963ks.m52977ck());
        short sM25404x1 = m25385m9().m25404x1();
        this.f17709k4.addItem(Short.valueOf(sM25404x1), c10963ks);
        return sM25404x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final short m25353k4(C10971um c10971um) {
        short sM25404x1 = m25385m9().m25404x1();
        this.f17713x1.addItem(Short.valueOf(sM25404x1), c10971um);
        if (c10971um.m53107x1() != null) {
            m25349k4(c10971um.m53107x1());
        }
        if (c10971um.m53098k4() != null && c10971um.m53098k4().m17362h4() != null) {
            m25349k4(c10971um.m53098k4().m17362h4());
        }
        return sM25404x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25354k4(int i, boolean z) {
        C6246m9 c6246m9 = new C6246m9(m25385m9());
        List.Enumerator<C9790ts> it = this.f17712to.iterator();
        while (it.hasNext()) {
            try {
                c6246m9.m25348k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C6238fa c6238fa = new C6238fa(m25385m9());
        Dictionary.Enumerator<Short, byte[]> it2 = this.f17706du.iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair next = it2.next();
                c6238fa.m25260k4((byte[]) C7019kk.m27458kk(next.getValue(), byte[].class), ((Short) next.getKey()).shortValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        C6232b3 c6232b3 = new C6232b3(m25385m9());
        Dictionary.Enumerator<Short, C6245lr> it3 = this.f17709k4.iterator();
        while (it3.hasNext()) {
            try {
                KeyValuePair next2 = it3.next();
                c6232b3.m25237k4((C10963ks) next2.getValue(), ((Short) next2.getKey()).shortValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        C6255v4 c6255v4 = new C6255v4(m25385m9());
        Dictionary.Enumerator<Short, C10971um> it4 = this.f17713x1.iterator();
        while (it4.hasNext()) {
            try {
                KeyValuePair next3 = it4.next();
                c6255v4.m25378k4((C10971um) next3.getValue(), ((Short) next3.getKey()).shortValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
            it4.dispose();
        }
        it3 = this.f17710kk.iterator();
        while (it3.hasNext()) {
            try {
                ((C6245lr) it3.next().getValue()).m25343k4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        String strM67402k4 = C14113y2.m67402k4("page{0:D9}", Integer.valueOf(i));
        if (z) {
            m25350k4(strM67402k4, this.f17711m9);
        } else {
            new C6248qq(m25385m9()).m25360k4(new C6256wl(this.f17711m9, null, (short) (i + 1), strM67402k4));
        }
        m25384h4().m25283k4(1, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25349k4(C4328x1 c4328x1) {
        int iM17417k4 = c4328x1.m17417k4();
        if (iM17417k4 == 1) {
            m25357k4(C6922h4.m27133k4((C4316du) c4328x1));
        } else {
            if (iM17417k4 != 2) {
                return;
            }
            m25357k4(((C4327up) c4328x1).m17416x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25355k4(C6245lr c6245lr) {
        this.f17710kk.addItem(Short.valueOf(c6245lr.m25346x1()), c6245lr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25350k4(String str, short s) {
        C6260yd c6260yd = new C6260yd(m25385m9());
        c6260yd.m25413k4();
        m25384h4().m25291kk(1);
        m25384h4().m25288k4(str);
        String strM66952k4 = C14080ne.m66952k4(C6252um.m25367x1());
        String strM66952k42 = C14080ne.m66952k4(AbstractC6747ar.m26635ix().mo26677to("TemplatePages"));
        String strM66952k43 = C14080ne.m66952k4(AbstractC6747ar.m26635ix().mo26677to(str));
        m25384h4().m25290k4(C14080ne.m66934jd(C14113y2.m67401k4(strM66952k4, OooO0OO.OooO00o(2, 0, strM66952k42, strM66952k42), OooO0OO.OooO00o(2, 0, strM66952k43, strM66952k43))));
        c6260yd.m25414k4(82);
        c6260yd.m25413k4();
        m25384h4().m25293x1(1);
        m25384h4().m25293x1(s);
        m25384h4().m25288k4(str);
        c6260yd.m25414k4(76);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25356k4(short s, C10959ix c10959ix) {
        this.f17708h4.set_Item(Short.valueOf(s), c10959ix);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25357k4(byte[] bArr) {
        if (m25385m9().m25399k4(bArr)) {
            return;
        }
        short sM25406x1 = m25385m9().m25406x1(bArr);
        this.f17706du.set_Item(Short.valueOf(sM25406x1), C6235ck.m25250k4(bArr, m25385m9().m25401kk().m25303bv()));
    }
}
