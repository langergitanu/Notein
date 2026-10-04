package com.aspose.slides.internal.p237ks;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p388rv.AbstractC10113kk;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ks.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5906k4 {

    /* JADX INFO: renamed from: fa */
    private static final C12380dy f16693fa = new C12380dy("\\\\([\\n\\r\\f0-9a-fA-F]{2,6})", 0);

    /* JADX INFO: renamed from: ck */
    private InterfaceC5903dy f16695ck;

    /* JADX INFO: renamed from: du */
    private String f16696du;

    /* JADX INFO: renamed from: h4 */
    private String f16698h4;

    /* JADX INFO: renamed from: jd */
    private String f16699jd;

    /* JADX INFO: renamed from: k4 */
    private final String f16700k4;

    /* JADX INFO: renamed from: x1 */
    private int f16704x1;

    /* JADX INFO: renamed from: kk */
    private int f16701kk = 1;

    /* JADX INFO: renamed from: to */
    private final List<String> f16703to = new List<>();

    /* JADX INFO: renamed from: m9 */
    private float f16702m9 = Float.NEGATIVE_INFINITY;

    /* JADX INFO: renamed from: dy */
    private float f16697dy = Float.POSITIVE_INFINITY;

    /* JADX INFO: renamed from: c5 */
    private final List<k4> f16694c5 = new List<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.ks.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f16705k4;

        /* JADX INFO: renamed from: x1 */
        private String f16706x1;

        public k4(int i, String str) {
            this.f16705k4 = i;
            this.f16706x1 = str;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m23794k4() {
            return this.f16705k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final String m23795x1() {
            return this.f16706x1;
        }
    }

    public C5906k4(String str) {
        this.f16700k4 = str;
    }

    /* JADX INFO: renamed from: du */
    public final List<k4> m23778du() {
        return this.f16694c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC10113kk m23779h4() {
        return AbstractC10113kk.m49692k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m23780k4() {
        return this.f16700k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m23787kk() {
        return this.f16701kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC10113kk m23789m9() {
        InterfaceC5903dy interfaceC5903dy;
        String str;
        if (C14113y2.m67411k4(this.f16699jd)) {
            interfaceC5903dy = this.f16695ck;
            str = "decimal";
        } else {
            interfaceC5903dy = this.f16695ck;
            str = this.f16699jd;
        }
        return interfaceC5903dy.mo23772k4(str).m23779h4();
    }

    /* JADX INFO: renamed from: to */
    public final List<String> m23790to() {
        return this.f16703to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m23791x1() {
        return this.f16704x1;
    }

    /* JADX INFO: renamed from: to */
    private String m23777to(String str) {
        C6765kp c6765kp = new C6765kp();
        Iterator<C12385to> it = f16693fa.m57986kk(str).iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26780k4((char) C14057f9.m66583k4(C14113y2.m67422kk(it.next().mo57995kk(), 1), 515));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23781k4(float f) {
        this.f16702m9 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m23788kk(String str) {
        this.f16699jd = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m23792x1(int i) {
        this.f16701kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23782k4(int i) {
        this.f16704x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m23793x1(String str) {
        this.f16698h4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23783k4(InterfaceC5903dy interfaceC5903dy) {
        this.f16695ck = interfaceC5903dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23784k4(String str) {
        this.f16696du = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23785k4(Object... objArr) {
        IEnumerator it = AbstractC14092to.m67208k4((Object) objArr).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue();
            it.hasNext();
            this.f16694c5.addItem(new k4(iIntValue, m23777to((String) it.next())));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23786k4(String... strArr) {
        for (String str : strArr) {
            this.f16703to.addItem(m23777to(str));
        }
    }
}
