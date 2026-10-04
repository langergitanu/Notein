package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10930to;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.C13988u1;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.eg */
/* JADX INFO: loaded from: classes5.dex */
public final class C12965eg extends AbstractC10930to implements InterfaceC14059g8 {

    /* JADX INFO: renamed from: du */
    private k4 f43610du;

    /* JADX INFO: renamed from: k4 */
    private C12943dd f43611k4;

    /* JADX INFO: renamed from: kk */
    private int f43612kk;

    /* JADX INFO: renamed from: to */
    private x1 f43613to;

    /* JADX INFO: renamed from: x1 */
    private Object f43614x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.eg$k4 */
    public static class k4 implements InterfaceC13980t6 {

        /* JADX INFO: renamed from: k4 */
        public String f43615k4;

        /* JADX INFO: renamed from: x1 */
        public String f43616x1;

        public k4(String str, String str2) {
            this.f43616x1 = str2;
            this.f43615k4 = str;
        }

        @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
        /* JADX INFO: renamed from: k4 */
        public final IGenericDictionary<String, String> mo52690k4(int i) {
            Dictionary dictionary = new Dictionary(1);
            dictionary.set_Item(this.f43615k4, this.f43616x1);
            return dictionary;
        }

        @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
        /* JADX INFO: renamed from: x1 */
        public final String mo52700x1(String str) {
            if (C14113y2.m67363du(this.f43616x1, str)) {
                return this.f43615k4;
            }
            return null;
        }

        @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
        /* JADX INFO: renamed from: k4 */
        public final String mo13292k4(String str) {
            if (C14113y2.m67363du(str, this.f43615k4)) {
                return this.f43616x1;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.eg$x1 */
    public static class x1 extends AbstractC7020m9<x1> {

        /* JADX INFO: renamed from: du */
        public C14084qq f43617du = new C14084qq();

        /* JADX INFO: renamed from: k4 */
        public boolean f43618k4;

        /* JADX INFO: renamed from: kk */
        public long f43619kk;

        /* JADX INFO: renamed from: to */
        public int f43620to;

        /* JADX INFO: renamed from: x1 */
        public double f43621x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m60391x1(x1 x1Var) {
            return x1Var.f43618k4 == this.f43618k4 && x1Var.f43621x1 == this.f43621x1 && x1Var.f43619kk == this.f43619kk && x1Var.f43620to == this.f43620to && C14067j2.m66728k4(x1Var.f43617du, this.f43617du);
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof x1) {
                return m60391x1((x1) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public x1 Clone() {
            x1 x1Var = new x1();
            CloneTo(x1Var);
            return x1Var;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(x1 x1Var) {
            if (x1Var == null) {
                x1Var = new x1();
            }
            x1Var.f43618k4 = this.f43618k4;
            x1Var.f43621x1 = this.f43621x1;
            x1Var.f43619kk = this.f43619kk;
            x1Var.f43620to = this.f43620to;
            this.f43617du.CloneTo(x1Var.f43617du);
        }
    }

    public C12965eg(C12943dd c12943dd, double d) {
        x1 x1Var = new x1();
        this.f43613to = x1Var;
        if (c12943dd == null) {
            throw new ArgumentNullException("xmlType");
        }
        this.f43611k4 = c12943dd;
        this.f43612kk = 14;
        x1Var.f43621x1 = d;
    }

    /* JADX INFO: renamed from: c5 */
    public int m60382c5() {
        AbstractC12974ex abstractC12974exM60215g8 = this.f43611k4.m60215g8();
        Object obj = this.f43614x1;
        if (obj == null) {
            int i = this.f43612kk;
            if (i == 3) {
                return abstractC12974exM60215g8.mo60524kk(Boolean.valueOf(this.f43613to.f43618k4));
            }
            if (i == 9) {
                return this.f43613to.f43620to;
            }
            if (i == 11) {
                return abstractC12974exM60215g8.mo60533to(Long.valueOf(this.f43613to.f43619kk));
            }
            if (i == 14) {
                return abstractC12974exM60215g8.mo60525kk(Double.valueOf(this.f43613to.f43621x1));
            }
            if (i == 16) {
                return abstractC12974exM60215g8.mo60532to(this.f43613to.f43617du.Clone());
            }
        }
        return abstractC12974exM60215g8.mo60499h4(obj);
    }

    /* JADX INFO: renamed from: du */
    public boolean m60383du() {
        AbstractC12974ex abstractC12974exM60215g8 = this.f43611k4.m60215g8();
        Object obj = this.f43614x1;
        if (obj == null) {
            int i = this.f43612kk;
            if (i == 3) {
                return this.f43613to.f43618k4;
            }
            if (i == 9) {
                return abstractC12974exM60215g8.mo60518k4(Integer.valueOf(this.f43613to.f43620to));
            }
            if (i == 11) {
                return abstractC12974exM60215g8.mo60519k4(Long.valueOf(this.f43613to.f43619kk));
            }
            if (i == 14) {
                return abstractC12974exM60215g8.mo60517k4(Double.valueOf(this.f43613to.f43621x1));
            }
            if (i == 16) {
                return abstractC12974exM60215g8.mo60516k4(this.f43613to.f43617du.Clone());
            }
        }
        return abstractC12974exM60215g8.mo60520k4(obj);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10930to
    /* JADX INFO: renamed from: dy */
    public String mo21843dy() {
        AbstractC12974ex abstractC12974exM60215g8 = this.f43611k4.m60215g8();
        Object obj = this.f43614x1;
        if (obj == null) {
            int i = this.f43612kk;
            if (i == 3) {
                return abstractC12974exM60215g8.mo60495du(Boolean.valueOf(this.f43613to.f43618k4));
            }
            if (i == 9) {
                return abstractC12974exM60215g8.mo60496du(Integer.valueOf(this.f43613to.f43620to));
            }
            if (i == 11) {
                return abstractC12974exM60215g8.mo60497du(Long.valueOf(this.f43613to.f43619kk));
            }
            if (i == 14) {
                return abstractC12974exM60215g8.mo60502h4(Double.valueOf(this.f43613to.f43621x1));
            }
            if (i == 16) {
                return abstractC12974exM60215g8.mo60501h4(this.f43613to.f43617du.Clone());
            }
        }
        return abstractC12974exM60215g8.mo60123k4(obj, this.f43610du);
    }

    /* JADX INFO: renamed from: h4 */
    public C14084qq m60384h4() {
        AbstractC12974ex abstractC12974exM60215g8 = this.f43611k4.m60215g8();
        Object obj = this.f43614x1;
        if (obj == null) {
            int i = this.f43612kk;
            if (i == 3) {
                return abstractC12974exM60215g8.mo60505k4(Boolean.valueOf(this.f43613to.f43618k4));
            }
            if (i == 9) {
                return abstractC12974exM60215g8.mo60544x1(Integer.valueOf(this.f43613to.f43620to));
            }
            if (i == 11) {
                return abstractC12974exM60215g8.mo60545x1(Long.valueOf(this.f43613to.f43619kk));
            }
            if (i == 14) {
                return abstractC12974exM60215g8.mo60543x1(Double.valueOf(this.f43613to.f43621x1));
            }
            if (i == 16) {
                return this.f43613to.f43617du;
            }
        }
        return abstractC12974exM60215g8.mo60546x1(obj);
    }

    /* JADX INFO: renamed from: jd */
    public long m60385jd() {
        AbstractC12974ex abstractC12974exM60215g8 = this.f43611k4.m60215g8();
        Object obj = this.f43614x1;
        if (obj == null) {
            int i = this.f43612kk;
            if (i == 3) {
                return abstractC12974exM60215g8.mo60534to(Boolean.valueOf(this.f43613to.f43618k4));
            }
            if (i == 9) {
                return abstractC12974exM60215g8.mo60536to(Integer.valueOf(this.f43613to.f43620to));
            }
            if (i == 11) {
                return this.f43613to.f43619kk;
            }
            if (i == 14) {
                return abstractC12974exM60215g8.mo60535to(Double.valueOf(this.f43613to.f43621x1));
            }
            if (i == 16) {
                return abstractC12974exM60215g8.mo60494du(this.f43613to.f43617du.Clone());
            }
        }
        return abstractC12974exM60215g8.mo60530m9(obj);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final C12965eg deepClone() {
        return this;
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 m60387kk() {
        return this.f43611k4.m60211bz().mo60022jd();
    }

    /* JADX INFO: renamed from: m9 */
    public double m60388m9() {
        AbstractC12974ex abstractC12974exM60215g8 = this.f43611k4.m60215g8();
        Object obj = this.f43614x1;
        if (obj == null) {
            int i = this.f43612kk;
            if (i == 3) {
                return abstractC12974exM60215g8.mo60539x1(Boolean.valueOf(this.f43613to.f43618k4));
            }
            if (i == 9) {
                return abstractC12974exM60215g8.mo60522kk(Integer.valueOf(this.f43613to.f43620to));
            }
            if (i == 11) {
                return abstractC12974exM60215g8.mo60523kk(Long.valueOf(this.f43613to.f43619kk));
            }
            if (i == 14) {
                return this.f43613to.f43621x1;
            }
            if (i == 16) {
                return abstractC12974exM60215g8.mo60521kk(this.f43613to.f43617du.Clone());
            }
        }
        return abstractC12974exM60215g8.mo60491du(obj);
    }

    /* JADX INFO: renamed from: to */
    public Object m60389to() {
        AbstractC12974ex abstractC12974exM60215g8 = this.f43611k4.m60215g8();
        Object obj = this.f43614x1;
        if (obj == null) {
            int i = this.f43612kk;
            if (i == 3) {
                return abstractC12974exM60215g8.mo60509k4(Boolean.valueOf(this.f43613to.f43618k4), m60387kk());
            }
            if (i == 9) {
                return abstractC12974exM60215g8.mo60511k4(Integer.valueOf(this.f43613to.f43620to), m60387kk());
            }
            if (i == 11) {
                return abstractC12974exM60215g8.mo60512k4(Long.valueOf(this.f43613to.f43619kk), m60387kk());
            }
            if (i == 14) {
                return abstractC12974exM60215g8.mo60510k4(Double.valueOf(this.f43613to.f43621x1), m60387kk());
            }
            if (i == 16) {
                return abstractC12974exM60215g8.mo60508k4(this.f43613to.f43617du.Clone(), m60387kk());
            }
        }
        return abstractC12974exM60215g8.mo60121k4(obj, m60387kk(), this.f43610du);
    }

    public String toString() {
        return mo21843dy();
    }

    /* JADX INFO: renamed from: x1 */
    public C12943dd m60390x1() {
        return this.f43611k4;
    }

    public C12965eg(C12943dd c12943dd, int i) {
        x1 x1Var = new x1();
        this.f43613to = x1Var;
        if (c12943dd == null) {
            throw new ArgumentNullException("xmlType");
        }
        this.f43611k4 = c12943dd;
        this.f43612kk = 9;
        x1Var.f43620to = i;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10930to
    /* JADX INFO: renamed from: k4 */
    public Object mo52693k4(AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        AbstractC12974ex abstractC12974exM60215g8 = this.f43611k4.m60215g8();
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) AbstractC10930to.class) || abstractC14068j5 == C7019kk.m27443k4((Class<?>) C12965eg.class)) {
            return this;
        }
        Object obj = this.f43614x1;
        if (obj == null) {
            int i = this.f43612kk;
            if (i == 3) {
                return abstractC12974exM60215g8.mo60509k4(Boolean.valueOf(this.f43613to.f43618k4), abstractC14068j5);
            }
            if (i == 9) {
                return abstractC12974exM60215g8.mo60511k4(Integer.valueOf(this.f43613to.f43620to), abstractC14068j5);
            }
            if (i == 11) {
                return abstractC12974exM60215g8.mo60512k4(Long.valueOf(this.f43613to.f43619kk), abstractC14068j5);
            }
            if (i == 14) {
                return abstractC12974exM60215g8.mo60510k4(Double.valueOf(this.f43613to.f43621x1), abstractC14068j5);
            }
            if (i == 16) {
                return abstractC12974exM60215g8.mo60508k4(this.f43613to.f43617du.Clone(), abstractC14068j5);
            }
        }
        return abstractC12974exM60215g8.mo60121k4(obj, abstractC14068j5, interfaceC13980t6);
    }

    public C12965eg(C12943dd c12943dd, long j) {
        x1 x1Var = new x1();
        this.f43613to = x1Var;
        if (c12943dd == null) {
            throw new ArgumentNullException("xmlType");
        }
        this.f43611k4 = c12943dd;
        this.f43612kk = 11;
        x1Var.f43619kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    private String m60381k4(String str) {
        int[] iArr = {0};
        int iM66223k4 = C13988u1.m66223k4(str, 0, iArr);
        int i = iArr[0];
        if (iM66223k4 == 0 || iM66223k4 != str.length()) {
            return null;
        }
        return i != 0 ? C14113y2.m67443x1(str, 0, i) : C14113y2.f47374k4;
    }

    public C12965eg(C12943dd c12943dd, C14084qq c14084qq) {
        x1 x1Var = new x1();
        this.f43613to = x1Var;
        if (c12943dd == null) {
            throw new ArgumentNullException("xmlType");
        }
        this.f43611k4 = c12943dd;
        this.f43612kk = 16;
        c14084qq.CloneTo(x1Var.f43617du);
    }

    public C12965eg(C12943dd c12943dd, Object obj) {
        this.f43613to = new x1();
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        if (c12943dd == null) {
            throw new ArgumentNullException("xmlType");
        }
        this.f43611k4 = c12943dd;
        this.f43614x1 = obj;
    }

    public C12965eg(C12943dd c12943dd, Object obj, InterfaceC13980t6 interfaceC13980t6) {
        this.f43613to = new x1();
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        if (c12943dd == null) {
            throw new ArgumentNullException("xmlType");
        }
        this.f43611k4 = c12943dd;
        this.f43614x1 = obj;
        if (interfaceC13980t6 != null) {
            if (c12943dd.m60220qm() == 29 || this.f43611k4.m60220qm() == 30) {
                String strM65284k4 = ((C13890ei) C7019kk.m27452k4(this.f43614x1, C13890ei.class)).m65284k4();
                this.f43610du = new k4(interfaceC13980t6.mo52700x1(strM65284k4), strM65284k4);
            }
        }
    }

    public C12965eg(C12943dd c12943dd, String str) {
        this.f43613to = new x1();
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (c12943dd == null) {
            throw new ArgumentNullException("xmlType");
        }
        this.f43611k4 = c12943dd;
        this.f43614x1 = str;
    }

    public C12965eg(C12943dd c12943dd, String str, InterfaceC13980t6 interfaceC13980t6) {
        this.f43613to = new x1();
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (c12943dd == null) {
            throw new ArgumentNullException("xmlType");
        }
        this.f43611k4 = c12943dd;
        this.f43614x1 = str;
        if (interfaceC13980t6 != null) {
            if (c12943dd.m60220qm() == 29 || this.f43611k4.m60220qm() == 30) {
                String strM60381k4 = m60381k4(str);
                this.f43610du = new k4(strM60381k4, interfaceC13980t6.mo13292k4(strM60381k4));
            }
        }
    }

    public C12965eg(C12943dd c12943dd, boolean z) {
        x1 x1Var = new x1();
        this.f43613to = x1Var;
        if (c12943dd == null) {
            throw new ArgumentNullException("xmlType");
        }
        this.f43611k4 = c12943dd;
        this.f43612kk = 3;
        x1Var.f43618k4 = z;
    }
}
