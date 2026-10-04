package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.ControlChar;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18293o1;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.pt */
/* JADX INFO: loaded from: classes5.dex */
public class C13955pt extends AbstractC13958qb {

    /* JADX INFO: renamed from: wy */
    private static final C7017h4 f46706wy;

    /* JADX INFO: renamed from: ar */
    private boolean f46709ar;

    /* JADX INFO: renamed from: c5 */
    private boolean f46711c5;

    /* JADX INFO: renamed from: ck */
    private int f46712ck;

    /* JADX INFO: renamed from: du */
    private InterfaceC13980t6 f46713du;

    /* JADX INFO: renamed from: dy */
    private Dictionary<String, Integer> f46714dy;

    /* JADX INFO: renamed from: fa */
    private k4[] f46715fa;

    /* JADX INFO: renamed from: h4 */
    private to[] f46716h4;

    /* JADX INFO: renamed from: ix */
    private int f46717ix;

    /* JADX INFO: renamed from: jd */
    private kk[] f46718jd;

    /* JADX INFO: renamed from: kk */
    private AbstractC13958qb f46719kk;

    /* JADX INFO: renamed from: m9 */
    private int f46721m9;

    /* JADX INFO: renamed from: ne */
    private int[] f46722ne;

    /* JADX INFO: renamed from: qq */
    private int f46723qq;

    /* JADX INFO: renamed from: to */
    private AbstractC13965r5 f46725to;

    /* JADX INFO: renamed from: u4 */
    private boolean f46726u4;

    /* JADX INFO: renamed from: um */
    private boolean f46727um;

    /* JADX INFO: renamed from: up */
    private int f46728up;

    /* JADX INFO: renamed from: uz */
    private boolean f46729uz;

    /* JADX INFO: renamed from: v4 */
    private C13910he f46730v4;

    /* JADX INFO: renamed from: wl */
    private boolean f46731wl;

    /* JADX INFO: renamed from: x6 */
    private String f46732x6;

    /* JADX INFO: renamed from: yj */
    private Dictionary<String, Integer> f46733yj;

    /* JADX INFO: renamed from: k4 */
    public static final String[] f46704k4 = {"Start", "TopLevel", "Document", "Element Start Tag", "Element Content", "Element Content", "Attribute", "EndRootElement", "Attribute", "Special Attribute", "End Document", "Root Level Attribute Value", "Root Level Special Attribute Value", "Root Level Base64 Attribute Value", "After Root Level Attribute", "Closed", "Error"};

    /* JADX INFO: renamed from: x1 */
    public static final String[] f46707x1 = {"StartDocument", "EndDocument", "PI", "Comment", "DTD", "StartElement", "EndElement", "StartAttribute", "EndAttribute", "Text", "CDATA", "Atomic value", "Base64", "RawData", "Whitespace"};

    /* JADX INFO: renamed from: lr */
    private static int[] f46705lr = {0, 1, 1, 2, 4, 4, 3, 4, 3, 3, 4, 3, 3, 3, 3, 5, 6};

    /* JADX INFO: renamed from: yd */
    private static final int[] f46708yd = {2, 16, 16, 16, 16, 112, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 112, 16, 10, 16, 16, 16, 16, 16, 16, 16, 16, 104, 1, 2, 101, 4, 112, 113, 7, 109, 109, 16, 16, 16, 16, 16, 16, 104, 1, 2, 101, 4, 112, 113, 7, 109, 109, 16, 16, 16, 16, 16, 16, 104, 1, 2, 16, 16, 112, 113, 16, 16, 16, 16, 16, 16, 16, 16, 16, 106, 3, 3, 102, 3, 112, 113, 16, 107, 107, 16, 16, 16, 16, 16, 16, 16, 16, 16, 101, 4, 112, 113, 16, 108, 108, 16, 16, 16, 16, 16, 16, 16, 16, 16, 8, 16, 112, 113, 16, 111, 111, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 112, 113, 16, 3, 3, 16, 16, 16, 16, 16, 16, 16, 16, 16, 101, 4, 112, 113, 16, 8, 9, 16, 16, 16, 16, 16, 16, 16, 16, 16, 101, 4, 112, 113, 16, 109, 109, 16, 16, 16, 16, 16, 16, 16, 16, 16, 101, 4, 112, 113, 16, 8, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 103, 5, 5, 6, 16, 6, 16, 16, 16, 16, 16, 16, 16, 104, 16, 2, 101, 4, 112, 113, 7, 8, 9, 16, 16, 16, 16, 16, 16, 104, 1, 2, 101, 4, 112, 113, 7, 8, 9, 16, 16, 16, 16, 16, 16};

    /* JADX INFO: renamed from: b3 */
    private static final int[] f46703b3 = {2, 16, 16, 16, 16, 112, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 112, 16, 10, 16, 16, 16, 16, 16, 16, 16, 16, 1, 1, 16, 101, 4, 112, 113, 7, 109, 109, 16, 16, 16, 16, 16, 16, 1, 1, 16, 101, 4, 112, 113, 7, 109, 109, 16, 16, 16, 16, 16, 16, 104, 1, 16, 16, 16, 112, 113, 16, 16, 16, 16, 16, 16, 16, 16, 16, 115, 3, 16, 102, 3, 112, 113, 3, 107, 107, 16, 16, 16, 16, 16, 16, 16, 16, 16, 101, 4, 112, 113, 16, 108, 108, 16, 16, 16, 16, 16, 16, 11, 16, 16, 8, 16, 112, 113, 16, 111, 111, 16, 118, 118, 114, 11, 16, 16, 16, 16, 16, 16, 112, 113, 16, 3, 3, 16, 14, 14, 114, 16, 16, 116, 116, 16, 101, 4, 112, 113, 4, 8, 9, 16, 11, 12, 114, 16, 16, 116, 116, 16, 101, 4, 112, 113, 4, 109, 109, 16, 16, 16, 16, 16, 16, 116, 116, 16, 101, 4, 112, 113, 4, 8, 16, 16, 11, 16, 114, 16, 16, 117, 117, 16, 103, 5, 5, 6, 5, 6, 16, 16, 13, 16, 13, 16, 16, 116, 1, 16, 101, 4, 112, 113, 4, 8, 9, 16, 11, 12, 114, 14, 16, 1, 1, 16, 101, 4, 112, 113, 7, 8, 9, 16, 11, 12, 114, 14, 16};

    /* JADX INFO: renamed from: ks */
    private int f46720ks = 0;

    /* JADX INFO: renamed from: rv */
    private x1 f46724rv = new x1(null);

    /* JADX INFO: renamed from: bv */
    private C14022y4 f46710bv = C14022y4.m66318k4().Clone();

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.pt$du */
    public static class du implements InterfaceC13980t6 {

        /* JADX INFO: renamed from: k4 */
        private C13955pt f46734k4;

        public du(C13955pt c13955pt) {
            this.f46734k4 = c13955pt;
        }

        @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
        /* JADX INFO: renamed from: k4 */
        public final IGenericDictionary<String, String> mo52690k4(int i) {
            throw new NotImplementedException();
        }

        /* JADX INFO: renamed from: kk */
        public String m65748kk(String str) {
            return this.f46734k4.m65746to(str);
        }

        @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
        /* JADX INFO: renamed from: x1 */
        public final String mo52700x1(String str) {
            return this.f46734k4.m65745k4(str);
        }

        @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
        /* JADX INFO: renamed from: k4 */
        public String mo13292k4(String str) {
            return m65748kk(str);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.pt$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: du */
        private static final C7017h4 f46735du = new C7017h4("space", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);

        /* JADX INFO: renamed from: k4 */
        public String f46736k4;

        /* JADX INFO: renamed from: kk */
        public String f46737kk;

        /* JADX INFO: renamed from: to */
        public int f46738to;

        /* JADX INFO: renamed from: x1 */
        public String f46739x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m65749x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f46736k4, this.f46736k4) && C14067j2.m66728k4(k4Var.f46739x1, this.f46739x1) && C14067j2.m66728k4(k4Var.f46737kk, this.f46737kk) && k4Var.f46738to == this.f46738to;
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
            if (obj instanceof k4) {
                return m65749x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f46736k4 = this.f46736k4;
            k4Var.f46739x1 = this.f46739x1;
            k4Var.f46737kk = this.f46737kk;
            k4Var.f46738to = this.f46738to;
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m65753x1(String str, String str2, String str3) {
            if (C14113y2.m67363du(this.f46737kk, str2)) {
                return C14113y2.m67363du(this.f46736k4, str) || C14113y2.m67363du(this.f46739x1, str3);
            }
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65752k4(String str, String str2, String str3) {
            this.f46736k4 = str;
            this.f46739x1 = str3;
            this.f46737kk = str2;
            this.f46738to = 0;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.pt$kk */
    public static class kk extends AbstractC7020m9<kk> {

        /* JADX INFO: renamed from: m9 */
        private static final C7017h4 f46740m9 = new C7017h4("space", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);

        /* JADX INFO: renamed from: du */
        public int f46741du;

        /* JADX INFO: renamed from: h4 */
        public String f46742h4;

        /* JADX INFO: renamed from: k4 */
        public int f46743k4;

        /* JADX INFO: renamed from: kk */
        public String f46744kk;

        /* JADX INFO: renamed from: to */
        public String f46745to;

        /* JADX INFO: renamed from: x1 */
        public String f46746x1;

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
            if (obj instanceof kk) {
                return m65754x1((kk) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public kk Clone() {
            kk kkVar = new kk();
            CloneTo(kkVar);
            return kkVar;
        }

        /* JADX INFO: renamed from: x1 */
        public final void m65759x1(AbstractC13965r5 abstractC13965r5) {
            abstractC13965r5.mo21911kk(this.f46746x1, this.f46744kk, this.f46745to);
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m65754x1(kk kkVar) {
            return kkVar.f46743k4 == this.f46743k4 && C14067j2.m66728k4(kkVar.f46746x1, this.f46746x1) && C14067j2.m66728k4(kkVar.f46744kk, this.f46744kk) && C14067j2.m66728k4(kkVar.f46745to, this.f46745to) && kkVar.f46741du == this.f46741du && C14067j2.m66728k4(kkVar.f46742h4, this.f46742h4);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(kk kkVar) {
            if (kkVar == null) {
                kkVar = new kk();
            }
            kkVar.f46743k4 = this.f46743k4;
            kkVar.f46746x1 = this.f46746x1;
            kkVar.f46744kk = this.f46744kk;
            kkVar.f46745to = this.f46745to;
            kkVar.f46741du = this.f46741du;
            kkVar.f46742h4 = this.f46742h4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65757k4(AbstractC13965r5 abstractC13965r5) {
            abstractC13965r5.mo21920x1(this.f46746x1, this.f46744kk, this.f46745to);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65758k4(String str, String str2, String str3, int i) {
            this.f46743k4 = i;
            this.f46746x1 = str;
            this.f46745to = str3;
            this.f46744kk = str2;
            this.f46741du = -1;
            this.f46742h4 = null;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.pt$to */
    public static class to extends AbstractC7020m9<to> {

        /* JADX INFO: renamed from: du */
        private static final C7017h4 f46747du = new C7017h4("space", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);

        /* JADX INFO: renamed from: k4 */
        public String f46748k4;

        /* JADX INFO: renamed from: kk */
        public int f46749kk;

        /* JADX INFO: renamed from: to */
        public int f46750to;

        /* JADX INFO: renamed from: x1 */
        public String f46751x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m65760x1(to toVar) {
            return C14067j2.m66728k4(toVar.f46748k4, this.f46748k4) && C14067j2.m66728k4(toVar.f46751x1, this.f46751x1) && toVar.f46749kk == this.f46749kk && toVar.f46750to == this.f46750to;
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
            if (obj instanceof to) {
                return m65760x1((to) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public to Clone() {
            to toVar = new to();
            CloneTo(toVar);
            return toVar;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(to toVar) {
            if (toVar == null) {
                toVar = new to();
            }
            toVar.f46748k4 = this.f46748k4;
            toVar.f46751x1 = this.f46751x1;
            toVar.f46749kk = this.f46749kk;
            toVar.f46750to = this.f46750to;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65763k4(AbstractC13958qb abstractC13958qb, AbstractC13965r5 abstractC13965r5) {
            if (abstractC13965r5 != null) {
                abstractC13965r5.mo21919x1(this.f46748k4, this.f46751x1);
                return;
            }
            if (this.f46748k4.length() == 0) {
                abstractC13958qb.mo21915to(C14113y2.f47374k4, "xmlns", "http://www.w3.org/2000/xmlns/");
            } else {
                abstractC13958qb.mo21915to("xmlns", this.f46748k4, "http://www.w3.org/2000/xmlns/");
            }
            abstractC13958qb.mo21918x1(this.f46751x1);
            abstractC13958qb.mo21917x1();
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65764k4(String str, String str2, int i) {
            this.f46748k4 = str;
            this.f46751x1 = str2;
            this.f46749kk = i;
            this.f46750to = -1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.pt$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: du */
        private int f46752du;

        /* JADX INFO: renamed from: k4 */
        private C6765kp f46753k4;

        /* JADX INFO: renamed from: kk */
        private C19074x1[] f46754kk;

        /* JADX INFO: renamed from: to */
        private int f46755to;

        /* JADX INFO: renamed from: x1 */
        private String f46756x1;

        /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.pt$x1$k4 */
        public static class k4 {

            /* JADX INFO: renamed from: k4 */
            public char[] f46757k4;

            /* JADX INFO: renamed from: kk */
            public int f46758kk;

            /* JADX INFO: renamed from: x1 */
            public int f46759x1;

            public k4(char[] cArr, int i, int i2) {
                this.f46757k4 = cArr;
                this.f46759x1 = i;
                this.f46758kk = i2;
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.pt$x1$x1, reason: collision with other inner class name */
        public static class C19074x1 {

            /* JADX INFO: renamed from: k4 */
            public int f46760k4;

            /* JADX INFO: renamed from: x1 */
            public Object f46761x1;

            /* JADX INFO: renamed from: k4 */
            public final void m65780k4(int i, Object obj) {
                this.f46760k4 = i;
                this.f46761x1 = obj;
            }
        }

        private x1() {
            this.f46753k4 = new C6765kp();
            this.f46752du = -1;
        }

        /* JADX INFO: renamed from: to */
        private void m65766to() {
            this.f46753k4.m26792k4(this.f46756x1);
            m65765k4(4, this.f46756x1);
            this.f46756x1 = null;
        }

        /* JADX INFO: renamed from: du */
        public final void m65767du(String str) {
            if (this.f46756x1 != null) {
                m65766to();
            }
            this.f46753k4.m26792k4(str);
            m65765k4(8, str);
        }

        /* JADX INFO: renamed from: k4 */
        public final String m65768k4() {
            String str = this.f46756x1;
            return str != null ? str : this.f46753k4.toString();
        }

        /* JADX INFO: renamed from: kk */
        public final void m65774kk() {
            this.f46756x1 = null;
            this.f46752du = -1;
            this.f46755to = 0;
            this.f46753k4.m26801k4(0);
        }

        /* JADX INFO: renamed from: x1 */
        public final void m65777x1() {
            String str = this.f46756x1;
            if (str != null) {
                this.f46756x1 = C13850af.m65066ar(str);
                return;
            }
            String string = this.f46753k4.toString();
            String strM65066ar = C13850af.m65066ar(string);
            if (!C14113y2.m67363du(string, strM65066ar)) {
                this.f46753k4 = new C6765kp(strM65066ar);
            }
            C14022y4 c14022y4Clone = C14022y4.m66318k4().Clone();
            int i = this.f46755to;
            while (true) {
                int i2 = this.f46755to;
                if (i == i2 && i <= this.f46752du) {
                    C19074x1 c19074x1 = this.f46754kk[i];
                    switch (c19074x1.f46760k4) {
                        case 3:
                            this.f46755to = i2 + 1;
                            continue;
                            i++;
                            break;
                        case 4:
                        case 6:
                        case 8:
                            String strM65130um = C13850af.m65130um((String) c19074x1.f46761x1);
                            c19074x1.f46761x1 = strM65130um;
                            if (strM65130um.length() != 0) {
                                i++;
                            }
                            break;
                        case 5:
                        case 7:
                            k4 k4Var = (k4) c19074x1.f46761x1;
                            int i3 = k4Var.f46759x1 + k4Var.f46758kk;
                            while (true) {
                                int i4 = k4Var.f46759x1;
                                if (i4 < i3 && c14022y4Clone.m66333k4(k4Var.f46757k4[i4])) {
                                    k4Var.f46759x1++;
                                    k4Var.f46758kk--;
                                }
                            }
                            if (k4Var.f46759x1 != i3) {
                                i++;
                            }
                            break;
                        default:
                            i++;
                            break;
                    }
                    i2 = this.f46755to;
                    this.f46755to = i2 + 1;
                    continue;
                    i++;
                }
            }
            int i5 = this.f46752du;
            while (true) {
                int i6 = this.f46752du;
                if (i5 != i6 || i5 < this.f46755to) {
                    return;
                }
                C19074x1 c19074x12 = this.f46754kk[i5];
                switch (c19074x12.f46760k4) {
                    case 3:
                        this.f46752du = i6 - 1;
                        continue;
                        i5--;
                        break;
                    case 4:
                    case 6:
                    case 8:
                        String strM65067bv = C13850af.m65067bv((String) c19074x12.f46761x1);
                        c19074x12.f46761x1 = strM65067bv;
                        if (strM65067bv.length() != 0) {
                            i5--;
                        }
                        break;
                    case 5:
                    case 7:
                        k4 k4Var2 = (k4) c19074x12.f46761x1;
                        while (true) {
                            if (k4Var2.f46758kk > 0 && c14022y4Clone.m66333k4(k4Var2.f46757k4[(k4Var2.f46759x1 + r3) - 1])) {
                                k4Var2.f46758kk--;
                            }
                        }
                        if (k4Var2.f46758kk != 0) {
                            i5--;
                        }
                        break;
                    default:
                        i5--;
                        break;
                }
                i6 = this.f46752du;
                this.f46752du = i6 - 1;
                continue;
                i5--;
            }
        }

        public /* synthetic */ x1(C14018xl c14018xl) {
            this();
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65769k4(char c) {
            if (this.f46756x1 != null) {
                m65766to();
            }
            this.f46753k4.m26780k4(c);
            m65765k4(1, Character.valueOf(c));
        }

        /* JADX INFO: renamed from: kk */
        public final void m65775kk(String str) {
            if (this.f46756x1 != null) {
                m65766to();
            } else if (this.f46752du == -1) {
                this.f46756x1 = str;
                return;
            }
            this.f46753k4.m26792k4(str);
            m65765k4(4, str);
        }

        /* JADX INFO: renamed from: to */
        public final void m65776to(String str) {
            if (this.f46756x1 != null) {
                m65766to();
            }
            this.f46753k4.m26792k4(str);
            m65765k4(6, str);
        }

        /* JADX INFO: renamed from: x1 */
        public final void m65778x1(String str) {
            if (this.f46756x1 != null) {
                m65766to();
            }
            this.f46753k4.m26792k4(str);
            m65765k4(3, str);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65770k4(char c, char c2) {
            if (this.f46756x1 != null) {
                m65766to();
            }
            this.f46753k4.m26780k4(c2);
            this.f46753k4.m26780k4(c);
            m65765k4(2, new char[]{c, c2});
        }

        /* JADX INFO: renamed from: x1 */
        public final void m65779x1(char[] cArr, int i, int i2) {
            if (this.f46756x1 != null) {
                m65766to();
            }
            this.f46753k4.m26799k4(cArr, i, i2);
            m65765k4(7, new k4(cArr, i, i2));
        }

        /* JADX INFO: renamed from: k4 */
        private void m65765k4(int i, Object obj) {
            int i2 = this.f46752du + 1;
            C19074x1[] c19074x1Arr = this.f46754kk;
            if (c19074x1Arr == null) {
                this.f46754kk = new C19074x1[4];
            } else if (c19074x1Arr.length == i2) {
                C19074x1[] c19074x1Arr2 = new C19074x1[i2 * 2];
                AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) c19074x1Arr), AbstractC14092to.m67208k4((Object) c19074x1Arr2), i2);
                this.f46754kk = c19074x1Arr2;
            }
            C19074x1[] c19074x1Arr3 = this.f46754kk;
            if (c19074x1Arr3[i2] == null) {
                c19074x1Arr3[i2] = new C19074x1();
            }
            this.f46754kk[i2].m65780k4(i, obj);
            this.f46752du = i2;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65771k4(AbstractC13958qb abstractC13958qb) {
            String str = this.f46756x1;
            if (str != null) {
                abstractC13958qb.mo21918x1(str);
                return;
            }
            for (int i = this.f46755to; i <= this.f46752du; i++) {
                C19074x1 c19074x1 = this.f46754kk[i];
                switch (c19074x1.f46760k4) {
                    case 0:
                        abstractC13958qb.mo21910kk((String) c19074x1.f46761x1);
                        break;
                    case 1:
                        abstractC13958qb.mo21900k4(((Character) C7019kk.m27464to(c19074x1.f46761x1, Character.TYPE)).charValue());
                        break;
                    case 2:
                        char[] cArr = (char[]) C7019kk.m27458kk(c19074x1.f46761x1, char[].class);
                        abstractC13958qb.mo21901k4(cArr[0], cArr[1]);
                        break;
                    case 3:
                        abstractC13958qb.mo21913m9((String) c19074x1.f46761x1);
                        break;
                    case 4:
                        abstractC13958qb.mo21918x1((String) c19074x1.f46761x1);
                        break;
                    case 5:
                        k4 k4Var = (k4) c19074x1.f46761x1;
                        abstractC13958qb.mo21909k4(k4Var.f46757k4, k4Var.f46759x1, k4Var.f46758kk);
                        break;
                    case 6:
                        abstractC13958qb.mo21895dy((String) c19074x1.f46761x1);
                        break;
                    case 7:
                        k4 k4Var2 = (k4) c19074x1.f46761x1;
                        abstractC13958qb.mo21909k4(k4Var2.f46757k4, k4Var2.f46759x1, k4Var2.f46758kk);
                        break;
                    case 8:
                        abstractC13958qb.mo65655c5((String) c19074x1.f46761x1);
                        break;
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65772k4(String str) {
            C6765kp c6765kp;
            char c;
            if (this.f46756x1 != null) {
                m65766to();
            }
            int iM27428k4 = C13955pt.f46706wy.m27428k4(str);
            if (iM27428k4 == 2) {
                c6765kp = this.f46753k4;
                c = '<';
            } else if (iM27428k4 == 3) {
                c6765kp = this.f46753k4;
                c = '>';
            } else if (iM27428k4 == 4) {
                c6765kp = this.f46753k4;
                c = '\"';
            } else if (iM27428k4 == 5) {
                c6765kp = this.f46753k4;
                c = '\'';
            } else if (iM27428k4 == 6) {
                this.f46753k4.m26780k4('&');
                m65765k4(0, str);
            } else {
                this.f46753k4.m26780k4('&');
                this.f46753k4.m26792k4(str);
                c6765kp = this.f46753k4;
                c = ';';
            }
            c6765kp.m26780k4(c);
            m65765k4(0, str);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65773k4(char[] cArr, int i, int i2) {
            if (this.f46756x1 != null) {
                m65766to();
            }
            this.f46753k4.m26799k4(cArr, i, i2);
            m65765k4(5, new k4(cArr, i, i2));
        }
    }

    static {
        C7019kk.m27454k4(to.class, (InterfaceC7014c5) new C14018xl());
        C7019kk.m27454k4(kk.class, (InterfaceC7014c5) new C13871c9());
        C7019kk.m27454k4(k4.class, (InterfaceC7014c5) new C13853am());
        f46706wy = new C7017h4("space", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, TranslateLanguage.LITHUANIAN, "gt", "quot", "apos", "amp");
    }

    public C13955pt(AbstractC13958qb abstractC13958qb, C13907h0 c13907h0) {
        this.f46719kk = abstractC13958qb;
        this.f46725to = (AbstractC13965r5) C7019kk.m27452k4((Object) abstractC13958qb, AbstractC13965r5.class);
        this.f46713du = (InterfaceC13980t6) C7019kk.m27452k4((Object) abstractC13958qb, InterfaceC13980t6.class);
        AbstractC13965r5 abstractC13965r5 = this.f46725to;
        if (abstractC13965r5 != null) {
            abstractC13965r5.mo65716k4(new du(this));
        }
        this.f46726u4 = c13907h0.m65423jd();
        this.f46729uz = (c13907h0.m65417ck() & 1) != 0;
        this.f46731wl = c13907h0.m65420fa();
        int iM65416c5 = c13907h0.m65416c5();
        this.f46723qq = iM65416c5;
        this.f46722ne = iM65416c5 == 2 ? f46708yd : f46703b3;
        this.f46717ix = 0;
        to[] toVarArr = (to[]) C22200OooO0o0.OooO00o(to.class, 8);
        this.f46716h4 = toVarArr;
        toVarArr[0].m65764k4("xmlns", "http://www.w3.org/2000/xmlns/", 3);
        this.f46716h4[1].m65764k4("xml", "http://www.w3.org/XML/1998/namespace", 3);
        InterfaceC13980t6 interfaceC13980t6 = this.f46713du;
        if (interfaceC13980t6 == null) {
            to toVar = this.f46716h4[2];
            String str = C14113y2.f47374k4;
            toVar.m65764k4(str, str, 2);
        } else {
            String strMo13292k4 = interfaceC13980t6.mo13292k4(C14113y2.f47374k4);
            to toVar2 = this.f46716h4[2];
            String str2 = C14113y2.f47374k4;
            toVar2.m65764k4(str2, strMo13292k4 == null ? str2 : strMo13292k4, 2);
        }
        this.f46721m9 = 2;
        kk[] kkVarArr = (kk[]) C22200OooO0o0.OooO00o(kk.class, 8);
        this.f46718jd = kkVarArr;
        kk kkVar = kkVarArr[0];
        String str3 = C14113y2.f47374k4;
        kkVar.m65758k4(str3, str3, str3, this.f46721m9);
        kk kkVar2 = this.f46718jd[0];
        kkVar2.f46741du = 0;
        kkVar2.f46742h4 = null;
        this.f46712ck = 0;
        this.f46715fa = (k4[]) C22200OooO0o0.OooO00o(k4.class, 8);
        this.f46730v4 = new C13910he();
    }

    /* JADX INFO: renamed from: ck */
    private String m65718ck(String str) {
        for (int i = this.f46721m9; i > this.f46718jd[this.f46712ck].f46743k4; i--) {
            if (C14113y2.m67363du(this.f46716h4[i].f46748k4, str)) {
                return this.f46716h4[i].f46751x1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    private static String m65719du(int i) {
        return i >= 16 ? "Error" : f46704k4[i];
    }

    /* JADX INFO: renamed from: dy */
    private void m65720dy() {
        this.f46723qq = 1;
    }

    /* JADX INFO: renamed from: jd */
    private int m65724jd(String str) {
        if (this.f46711c5) {
            Integer[] numArr = {0};
            boolean zTryGetValue = this.f46714dy.tryGetValue(str, numArr);
            int iIntValue = numArr[0].intValue();
            if (zTryGetValue) {
                return iIntValue;
            }
            return -1;
        }
        for (int i = this.f46721m9; i >= 0; i--) {
            if (C14113y2.m67363du(this.f46716h4[i].f46748k4, str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    private static Exception m65725k4(String str, int i) {
        String[] strArrBuildCharExceptionArgs = XmlException.buildCharExceptionArgs(str, i);
        return new ArgumentException(C13968ri.m65819k4("Invalid name character in '{0}'. The '{1}' character, hexadecimal value {2}, cannot be included in a name.", str, strArrBuildCharExceptionArgs[0], strArrBuildCharExceptionArgs[1]));
    }

    /* JADX INFO: renamed from: ks */
    private boolean m65731ks() {
        return this.f46717ix >= 15;
    }

    /* JADX INFO: renamed from: m9 */
    private static XmlException m65732m9(String str, String str2) {
        C6765kp c6765kp = new C6765kp();
        if (str.length() > 0) {
            c6765kp.m26792k4(str);
            c6765kp.m26780k4(':');
        }
        c6765kp.m26792k4(str2);
        return new XmlException("'{0}' is a duplicate attribute name.", c6765kp.toString());
    }

    /* JADX INFO: renamed from: up */
    private void m65736up() {
        int i = this.f46718jd[this.f46712ck].f46743k4;
        for (int i2 = this.f46721m9; i2 > i; i2--) {
            to toVar = this.f46716h4[i2];
            if (toVar.f46749kk == 1) {
                toVar.m65763k4(this.f46719kk, this.f46725to);
            }
        }
        AbstractC13965r5 abstractC13965r5 = this.f46725to;
        if (abstractC13965r5 != null) {
            abstractC13965r5.mo21899k4();
        }
    }

    /* JADX INFO: renamed from: yj */
    private String m65741yj() {
        String strM67408k4;
        String strM67408k42 = C14113y2.m67408k4(ContextChain.TAG_PRODUCT, C14057f9.m66588k4(this.f46721m9 - 2, "d", C11697x1.m55250kk()));
        if (m65746to(strM67408k42) == null) {
            return strM67408k42;
        }
        int i = 0;
        do {
            strM67408k4 = C14113y2.m67408k4(strM67408k42, C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()));
            i++;
        } while (m65746to(strM67408k4) != null);
        return strM67408k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        try {
            if (cArr == null) {
                throw new ArgumentNullException("buffer");
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f);
            }
            if (i2 > cArr.length - i) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f);
            }
            m65734to(13);
            if (m65735to()) {
                this.f46724rv.m65779x1(cArr, i, i2);
            } else {
                this.f46719kk.mo21891a_(cArr, i, i2);
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: c5 */
    public void mo65742c5() {
        m65737x1(0);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: fa */
    public int mo65743fa() {
        int i = this.f46717ix;
        if (i <= 16) {
            return f46705lr[i];
        }
        return 6;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21896h4() {
        try {
            this.f46719kk.mo21896h4();
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    /* JADX INFO: renamed from: to */
    public final String m65746to(String str) {
        for (int i = this.f46721m9; i >= 0; i--) {
            if (C14113y2.m67363du(this.f46716h4[i].f46748k4, str)) {
                return this.f46716h4[i].f46751x1;
            }
        }
        InterfaceC13980t6 interfaceC13980t6 = this.f46713du;
        if (interfaceC13980t6 != null) {
            return interfaceC13980t6.mo13292k4(str);
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        AbstractC13958qb abstractC13958qb;
        try {
            m65734to(8);
            int i = this.f46720ks;
            if (i == 0) {
                this.f46719kk.mo21917x1();
                return;
            }
            if (i == 1) {
                String strM65768k4 = this.f46724rv.m65768k4();
                if (m65723h4(C14113y2.f47374k4, strM65768k4)) {
                    AbstractC13965r5 abstractC13965r5 = this.f46725to;
                    if (abstractC13965r5 == null) {
                        this.f46719kk.mo21915to(C14113y2.f47374k4, "xmlns", "http://www.w3.org/2000/xmlns/");
                        this.f46724rv.m65771k4(this.f46719kk);
                        this.f46719kk.mo21917x1();
                    } else if (abstractC13965r5.aa_()) {
                        this.f46725to.mo65317to(C14113y2.f47374k4);
                        this.f46724rv.m65771k4(this.f46725to);
                        this.f46725to.mo65316to();
                    } else {
                        this.f46725to.mo21919x1(C14113y2.f47374k4, strM65768k4);
                    }
                }
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.f46718jd[this.f46712ck].f46742h4 = this.f46724rv.m65768k4();
                            this.f46719kk.mo21915to("xml", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "http://www.w3.org/XML/1998/namespace");
                            this.f46724rv.m65771k4(this.f46719kk);
                            abstractC13958qb = this.f46719kk;
                        }
                        this.f46720ks = 0;
                        this.f46724rv.m65774kk();
                    }
                    this.f46724rv.m65777x1();
                    String strM65768k42 = this.f46724rv.m65768k4();
                    if ("default".equals(strM65768k42)) {
                        this.f46718jd[this.f46712ck].f46741du = 1;
                    } else {
                        if (!"preserve".equals(strM65768k42)) {
                            throw new ArgumentException(C13968ri.m65819k4("'{0}' is an invalid xml:space value.", strM65768k42));
                        }
                        this.f46718jd[this.f46712ck].f46741du = 2;
                    }
                    this.f46719kk.mo21915to("xml", "space", "http://www.w3.org/XML/1998/namespace");
                    this.f46724rv.m65771k4(this.f46719kk);
                    abstractC13958qb = this.f46719kk;
                    abstractC13958qb.mo21917x1();
                    this.f46720ks = 0;
                    this.f46724rv.m65774kk();
                }
                String strM65768k43 = this.f46724rv.m65768k4();
                if (strM65768k43.length() == 0) {
                    throw new ArgumentException(C13968ri.m65818k4("Cannot use a prefix with an empty namespace."));
                }
                if ("http://www.w3.org/2000/xmlns/".equals(strM65768k43) || ("http://www.w3.org/XML/1998/namespace".equals(strM65768k43) && !"xml".equals(this.f46732x6))) {
                    throw new ArgumentException(C13968ri.m65818k4("Cannot bind to the reserved namespace."));
                }
                if (m65723h4(this.f46732x6, strM65768k43)) {
                    AbstractC13965r5 abstractC13965r52 = this.f46725to;
                    if (abstractC13965r52 == null) {
                        this.f46719kk.mo21915to("xmlns", this.f46732x6, "http://www.w3.org/2000/xmlns/");
                        this.f46724rv.m65771k4(this.f46719kk);
                        this.f46719kk.mo21917x1();
                    } else if (abstractC13965r52.aa_()) {
                        this.f46725to.mo65317to(this.f46732x6);
                        this.f46724rv.m65771k4(this.f46725to);
                        this.f46725to.mo65316to();
                    } else {
                        this.f46725to.mo21919x1(this.f46732x6, strM65768k43);
                    }
                }
            }
            this.f46732x6 = null;
            this.f46720ks = 0;
            this.f46724rv.m65774kk();
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    /* JADX INFO: renamed from: fa */
    private void m65721fa(String str) {
        int length = str.length();
        if ((this.f46710bv.f47099k4[str.charAt(0)] & 4) == 0) {
            throw m65725k4(str, 0);
        }
        for (int i = 1; i < length; i++) {
            if ((this.f46710bv.f47099k4[str.charAt(i)] & 8) == 0) {
                throw m65725k4(str, i);
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m65722h4(int i) {
        String str = this.f46715fa[i].f46737kk;
        int size = this.f46733yj.size();
        this.f46733yj.set_Item(str, 0);
        if (size != this.f46733yj.size()) {
            return;
        }
        int i2 = i - 1;
        while (i2 >= 0 && !C14113y2.m67363du(this.f46715fa[i2].f46737kk, str)) {
            i2--;
        }
        this.f46715fa[i].f46738to = i2 + 1;
    }

    /* JADX INFO: renamed from: kk */
    private void m65730kk(int i) {
        String str = this.f46716h4[i].f46748k4;
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f46714dy.tryGetValue(str, numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            this.f46716h4[i].f46750to = iIntValue;
        }
        this.f46714dy.set_Item(str, Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        r0 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        m65736up();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        m65736up();
     */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m65734to(int i) {
        int i2;
        int i3 = this.f46717ix;
        if (i3 >= 15) {
            if (i3 != 15 && i3 != 16) {
                throw new InvalidOperationException(C13968ri.m65819k4("Token {0} in state {1} would result in an invalid XML document.", f46707x1[i], m65719du(this.f46717ix)));
            }
            throw new InvalidOperationException(C13968ri.m65818k4("The Writer is closed or in error state."));
        }
        while (true) {
            int[] iArr = this.f46722ne;
            int i4 = this.f46717ix;
            i2 = iArr[(i << 4) + i4];
            if (i2 >= 16) {
                if (i2 != 16) {
                    switch (i2) {
                        case 101:
                            break;
                        case 102:
                            break;
                        case 103:
                            m65736up();
                            break;
                        case 104:
                            mo65742c5();
                            i2 = 2;
                            break;
                        default:
                            switch (i2) {
                                case 106:
                                    mo65742c5();
                                    break;
                                case 107:
                                    mo21917x1();
                                    break;
                                case 108:
                                case 109:
                                    mo21917x1();
                                    break;
                                default:
                                    switch (i2) {
                                        case 111:
                                            mo21917x1();
                                            i2 = 8;
                                            break;
                                        case 112:
                                            AbstractC13965r5 abstractC13965r5 = this.f46725to;
                                            if (abstractC13965r5 != null) {
                                                abstractC13965r5.mo65656dy();
                                            }
                                            this.f46717ix = 4;
                                            break;
                                        case 113:
                                            AbstractC13965r5 abstractC13965r52 = this.f46725to;
                                            if (abstractC13965r52 != null) {
                                                abstractC13965r52.mo65656dy();
                                            }
                                            this.f46717ix = 8;
                                            break;
                                        case 114:
                                            AbstractC13965r5 abstractC13965r53 = this.f46725to;
                                            if (abstractC13965r53 != null) {
                                                abstractC13965r53.mo65656dy();
                                            }
                                            this.f46717ix = 11;
                                            break;
                                        case 115:
                                            m65720dy();
                                            break;
                                        case 116:
                                            m65720dy();
                                            break;
                                        case 117:
                                            m65720dy();
                                            break;
                                        case 118:
                                            mo21917x1();
                                            i2 = 11;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    m65738x1(i, i4);
                }
            }
        }
        this.f46717ix = i2;
    }

    /* JADX INFO: renamed from: x1 */
    private void m65737x1(int i) {
        try {
            m65734to(0);
            int i2 = this.f46723qq;
            if (i2 == 0) {
                this.f46723qq = 2;
                this.f46722ne = f46708yd;
            } else if (i2 == 1) {
                throw new InvalidOperationException(C13968ri.m65818k4("WriteStartDocument cannot be called on writers created with ConformanceLevel.Fragment."));
            }
            AbstractC13965r5 abstractC13965r5 = this.f46725to;
            if (abstractC13965r5 == null) {
                this.f46719kk.mo65742c5();
            } else {
                if (this.f46727um) {
                    return;
                }
                abstractC13965r5.mo21902k4(i);
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: c5 */
    public void mo65655c5(String str) {
        if (str == null) {
            return;
        }
        try {
            if (m65735to()) {
                m65734to(9);
                this.f46724rv.m65767du(str);
            } else {
                m65734to(11);
                this.f46719kk.mo65655c5(str);
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: ck */
    public void mo21892ck() {
        int i;
        try {
            m65734to(6);
            int i2 = this.f46712ck;
            if (i2 == 0) {
                throw new XmlException("There was no XML start tag open.", C14113y2.f47374k4);
            }
            AbstractC13965r5 abstractC13965r5 = this.f46725to;
            if (abstractC13965r5 != null) {
                this.f46718jd[i2].m65759x1(abstractC13965r5);
            } else {
                this.f46719kk.mo21892ck();
            }
            int i3 = this.f46718jd[i2].f46743k4;
            if (this.f46711c5 && i3 < (i = this.f46721m9)) {
                m65727k4(i3 + 1, i);
            }
            this.f46721m9 = i3;
            int i4 = i2 - 1;
            this.f46712ck = i4;
            if (i4 == 0) {
                if (this.f46723qq == 2) {
                    this.f46717ix = 7;
                } else {
                    this.f46717ix = 1;
                }
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21893du() {
        AbstractC13965r5 abstractC13965r5;
        int i = this.f46717ix;
        if (i != 15) {
            try {
                if (this.f46731wl) {
                    while (this.f46717ix != 16 && this.f46712ck > 0) {
                        mo21898jd();
                    }
                } else if (i != 16 && this.f46712ck > 0) {
                    try {
                        m65734to(6);
                    } catch (RuntimeException e) {
                        this.f46717ix = 16;
                        throw e;
                    }
                }
                if (m65733m9() && (abstractC13965r5 = this.f46725to) != null) {
                    abstractC13965r5.mo65656dy();
                }
                this.f46719kk.mo21896h4();
                try {
                    AbstractC13965r5 abstractC13965r52 = this.f46725to;
                    if (abstractC13965r52 != null) {
                        abstractC13965r52.m65814to(mo65743fa());
                    } else {
                        this.f46719kk.mo21893du();
                    }
                } finally {
                    this.f46717ix = 15;
                }
            } catch (Throwable th) {
                try {
                    AbstractC13965r5 abstractC13965r53 = this.f46725to;
                    if (abstractC13965r53 != null) {
                        abstractC13965r53.m65814to(mo65743fa());
                    } else {
                        this.f46719kk.mo21893du();
                    }
                    throw th;
                } finally {
                    this.f46717ix = 15;
                }
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        if (str == null) {
            return;
        }
        try {
            m65734to(13);
            if (m65735to()) {
                this.f46724rv.m65776to(str);
            } else {
                this.f46719kk.mo21895dy(str);
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: jd */
    public void mo21898jd() {
        int i;
        try {
            m65734to(6);
            int i2 = this.f46712ck;
            if (i2 == 0) {
                throw new XmlException("There was no XML start tag open.", C14113y2.f47374k4);
            }
            AbstractC13965r5 abstractC13965r5 = this.f46725to;
            if (abstractC13965r5 != null) {
                this.f46718jd[i2].m65757k4(abstractC13965r5);
            } else {
                this.f46719kk.mo21898jd();
            }
            int i3 = this.f46718jd[i2].f46743k4;
            if (this.f46711c5 && i3 < (i = this.f46721m9)) {
                m65727k4(i3 + 1, i);
            }
            this.f46721m9 = i3;
            int i4 = i2 - 1;
            this.f46712ck = i4;
            if (i4 == 0) {
                if (this.f46723qq == 2) {
                    this.f46717ix = 7;
                } else {
                    this.f46717ix = 1;
                }
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13965r5 m65744k4() {
        return this.f46725to;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        if (str == null) {
            try {
                str = C14113y2.f47374k4;
            } catch (RuntimeException e) {
                this.f46717ix = 16;
                throw e;
            }
        }
        if (!C14022y4.m66318k4().m66334k4(str)) {
            throw new ArgumentException(C13968ri.m65818k4("Only white space characters should be used."));
        }
        m65734to(14);
        if (m65735to()) {
            this.f46724rv.m65778x1(str);
        } else {
            this.f46719kk.mo21913m9(str);
        }
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m65733m9() {
        int i = this.f46717ix;
        return i == 5 || i == 6 || i == 13;
    }

    /* JADX INFO: renamed from: x1 */
    private void m65738x1(int i, int i2) {
        String strM65819k4 = C13968ri.m65819k4("Token {0} in state {1} would result in an invalid XML document.", f46707x1[i], m65719du(i2));
        if ((i2 != 0 && i2 != 7) || this.f46723qq != 2) {
            throw new InvalidOperationException(strM65819k4);
        }
        throw new InvalidOperationException(C14113y2.m67407k4(strM65819k4, Character.valueOf(ControlChar.SPACE_CHAR), C13968ri.m65818k4("Make sure that the ConformanceLevel setting is set to ConformanceLevel.Fragment or ConformanceLevel.Auto if you want to write an XML fragment.")));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        if (str == null) {
            try {
                str = C14113y2.f47374k4;
            } catch (RuntimeException e) {
                this.f46717ix = 16;
                throw e;
            }
        }
        m65734to(10);
        this.f46719kk.mo21894du(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        if (str == null) {
            try {
                str = C14113y2.f47374k4;
            } catch (RuntimeException e) {
                this.f46717ix = 16;
                throw e;
            }
        }
        m65734to(3);
        this.f46719kk.mo21897h4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public String m65745k4(String str) {
        try {
            if (str == null) {
                throw new ArgumentNullException("ns");
            }
            int i = this.f46721m9;
            while (i >= 0) {
                if (C14113y2.m67363du(this.f46716h4[i].f46751x1, str)) {
                    String str2 = this.f46716h4[i].f46748k4;
                    do {
                        i++;
                        if (i > this.f46721m9) {
                            return str2;
                        }
                    } while (!C14113y2.m67363du(this.f46716h4[i].f46748k4, str2));
                    return null;
                }
                i--;
            }
            InterfaceC13980t6 interfaceC13980t6 = this.f46713du;
            if (interfaceC13980t6 != null) {
                return interfaceC13980t6.mo52700x1(str);
            }
            return null;
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    m65721fa(str);
                    m65734to(9);
                    if (m65735to()) {
                        this.f46724rv.m65772k4(str);
                        return;
                    } else {
                        this.f46719kk.mo21910kk(str);
                        return;
                    }
                }
            } catch (RuntimeException e) {
                this.f46717ix = 16;
                throw e;
            }
        }
        throw new ArgumentException(C13968ri.m65818k4("The empty string '' is not a valid name."));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014 A[Catch: RuntimeException -> 0x000b, TryCatch #0 {RuntimeException -> 0x000b, blocks: (B:4:0x0004, B:12:0x0017, B:16:0x0024, B:18:0x002a, B:20:0x0030, B:22:0x0036, B:25:0x003c, B:27:0x0042, B:29:0x0048, B:30:0x004a, B:33:0x0056, B:35:0x005c, B:37:0x0062, B:39:0x0068, B:42:0x006f, B:43:0x0078, B:44:0x0079, B:90:0x011f, B:92:0x0126, B:45:0x0082, B:47:0x0088, B:49:0x008e, B:51:0x0094, B:87:0x0116, B:89:0x011c, B:52:0x009a, B:54:0x00a0, B:56:0x00a6, B:58:0x00ac, B:61:0x00b3, B:62:0x00bc, B:63:0x00bd, B:64:0x00c4, B:66:0x00cc, B:68:0x00d2, B:71:0x00db, B:72:0x00e6, B:73:0x00e7, B:77:0x00f2, B:78:0x00f7, B:79:0x00fc, B:81:0x0105, B:82:0x0108, B:84:0x010e, B:9:0x000e, B:11:0x0014, B:94:0x012c, B:95:0x0137), top: B:98:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c A[Catch: RuntimeException -> 0x000b, TryCatch #0 {RuntimeException -> 0x000b, blocks: (B:4:0x0004, B:12:0x0017, B:16:0x0024, B:18:0x002a, B:20:0x0030, B:22:0x0036, B:25:0x003c, B:27:0x0042, B:29:0x0048, B:30:0x004a, B:33:0x0056, B:35:0x005c, B:37:0x0062, B:39:0x0068, B:42:0x006f, B:43:0x0078, B:44:0x0079, B:90:0x011f, B:92:0x0126, B:45:0x0082, B:47:0x0088, B:49:0x008e, B:51:0x0094, B:87:0x0116, B:89:0x011c, B:52:0x009a, B:54:0x00a0, B:56:0x00a6, B:58:0x00ac, B:61:0x00b3, B:62:0x00bc, B:63:0x00bd, B:64:0x00c4, B:66:0x00cc, B:68:0x00d2, B:71:0x00db, B:72:0x00e6, B:73:0x00e7, B:77:0x00f2, B:78:0x00f7, B:79:0x00fc, B:81:0x0105, B:82:0x0108, B:84:0x010e, B:9:0x000e, B:11:0x0014, B:94:0x012c, B:95:0x0137), top: B:98:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012c A[Catch: RuntimeException -> 0x000b, TryCatch #0 {RuntimeException -> 0x000b, blocks: (B:4:0x0004, B:12:0x0017, B:16:0x0024, B:18:0x002a, B:20:0x0030, B:22:0x0036, B:25:0x003c, B:27:0x0042, B:29:0x0048, B:30:0x004a, B:33:0x0056, B:35:0x005c, B:37:0x0062, B:39:0x0068, B:42:0x006f, B:43:0x0078, B:44:0x0079, B:90:0x011f, B:92:0x0126, B:45:0x0082, B:47:0x0088, B:49:0x008e, B:51:0x0094, B:87:0x0116, B:89:0x011c, B:52:0x009a, B:54:0x00a0, B:56:0x00a6, B:58:0x00ac, B:61:0x00b3, B:62:0x00bc, B:63:0x00bd, B:64:0x00c4, B:66:0x00cc, B:68:0x00d2, B:71:0x00db, B:72:0x00e6, B:73:0x00e7, B:77:0x00f2, B:78:0x00f7, B:79:0x00fc, B:81:0x0105, B:82:0x0108, B:84:0x010e, B:9:0x000e, B:11:0x0014, B:94:0x012c, B:95:0x0137), top: B:98:0x0004 }] */
    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo21915to(String str, String str2, String str3) {
        if (str2 != null) {
            try {
                if (str2.length() == 0) {
                    if ("xmlns".equals(str)) {
                        throw new ArgumentException(C13968ri.m65818k4("The empty string '' is not a valid local name."));
                    }
                    str = C14113y2.f47374k4;
                    str2 = "xmlns";
                }
            } catch (RuntimeException e) {
                this.f46717ix = 16;
                throw e;
            }
        } else if ("xmlns".equals(str)) {
        }
        m65721fa(str2);
        m65734to(7);
        if (str == null) {
            if (str3 != null && (!"xmlns".equals(str2) || !"http://www.w3.org/2000/xmlns/".equals(str3))) {
                str = m65745k4(str3);
            }
            if (str == null) {
                str = C14113y2.f47374k4;
            }
        }
        if (str3 == null) {
            if (str != null && str.length() > 0) {
                str3 = m65746to(str);
            }
            if (str3 == null) {
                str3 = C14113y2.f47374k4;
            }
        }
        if (str.length() != 0) {
            if (str.charAt(0) == 'x') {
                if ("xmlns".equals(str)) {
                    if (str3.length() > 0 && !"http://www.w3.org/2000/xmlns/".equals(str3)) {
                        throw new ArgumentException(C13968ri.m65818k4("Prefix \"xmlns\" is reserved for use by XML."));
                    }
                    this.f46732x6 = str2;
                    m65726k4(2);
                } else if ("xml".equals(str)) {
                    if (str3.length() > 0 && !"http://www.w3.org/XML/1998/namespace".equals(str3)) {
                        throw new ArgumentException(C13968ri.m65818k4("Prefix \"xml\" is reserved for use by XML and can be mapped only to namespace name \"http://www.w3.org/XML/1998/namespace\"."));
                    }
                    int iM27428k4 = f46706wy.m27428k4(str2);
                    if (iM27428k4 == 0) {
                        m65726k4(3);
                    } else if (iM27428k4 == 1) {
                        m65726k4(4);
                    }
                }
            }
            m65721fa(str);
            if (str3.length() == 0) {
                str = C14113y2.f47374k4;
            } else {
                String strM65718ck = m65718ck(str);
                if (strM65718ck != null && !C14113y2.m67363du(strM65718ck, str3)) {
                    str = m65741yj();
                }
            }
            if (str.length() != 0) {
            }
        } else if (str2.charAt(0) == 'x' && "xmlns".equals(str2)) {
            if (str3.length() > 0 && !"http://www.w3.org/2000/xmlns/".equals(str3)) {
                throw new ArgumentException(C13968ri.m65818k4("Prefix \"xmlns\" is reserved for use by XML."));
            }
            this.f46732x6 = C14113y2.f47374k4;
            m65726k4(1);
        } else {
            if (str3.length() > 0 && ((str = m65745k4(str3)) == null || str.length() == 0)) {
                str = m65741yj();
            }
            if (str.length() != 0) {
                m65739x1(str, str3);
            }
        }
        m65740x1(str, str2, str3);
        if (this.f46720ks == 0) {
            this.f46719kk.mo21915to(str, str2, str3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX INFO: renamed from: h4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m65723h4(String str, String str2) {
        int iM65724jd = m65724jd(str);
        boolean z = true;
        if (iM65724jd == -1) {
            InterfaceC13980t6 interfaceC13980t6 = this.f46713du;
            if (interfaceC13980t6 != null && C14113y2.m67363du(interfaceC13980t6.mo13292k4(str), str2) && this.f46729uz) {
            }
        } else {
            if (iM65724jd > this.f46718jd[this.f46712ck].f46743k4) {
                if (!C14113y2.m67363du(this.f46716h4[iM65724jd].f46751x1, str2)) {
                    throw new XmlException("The prefix '{0}' cannot be redefined from '{1}' to '{2}' within the same start element tag.", new String[]{str, this.f46716h4[iM65724jd].f46751x1, str2});
                }
                to toVar = this.f46716h4[iM65724jd];
                int i = toVar.f46749kk;
                if (i == 0) {
                    String str3 = str.length() == 0 ? C14113y2.f47374k4 : "xmlns";
                    if (str.length() == 0) {
                        str = "xmlns";
                    }
                    throw m65732m9(str3, str);
                }
                if (this.f46729uz && i != 1) {
                    z = false;
                }
                toVar.f46749kk = 0;
                return z;
            }
            if (C14113y2.m67363du(this.f46716h4[iM65724jd].f46751x1, str2) && this.f46729uz) {
                z = false;
            }
        }
        if (("http://www.w3.org/XML/1998/namespace".equals(str2) && !"xml".equals(str)) || ("http://www.w3.org/2000/xmlns/".equals(str2) && !"xmlns".equals(str))) {
            throw new ArgumentException(C13968ri.m65819k4("Prefix '{0}' cannot be mapped to namespace name reserved for \"xml\" or \"xmlns\".", str));
        }
        if (str.length() > 0 && str.charAt(0) == 'x') {
            if ("xml".equals(str)) {
                if (!"http://www.w3.org/XML/1998/namespace".equals(str2)) {
                    throw new ArgumentException(C13968ri.m65818k4("Prefix \"xml\" is reserved for use by XML and can be mapped only to namespace name \"http://www.w3.org/XML/1998/namespace\"."));
                }
            } else if ("xmlns".equals(str)) {
                throw new ArgumentException(C13968ri.m65818k4("Prefix \"xmlns\" is reserved for use by XML."));
            }
        }
        m65728k4(str, str2, 0);
        return z;
    }

    /* JADX INFO: renamed from: to */
    private boolean m65735to() {
        return this.f46720ks != 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        try {
            if (C14117yj.m67542up(c)) {
                throw new ArgumentException(C13968ri.m65818k4("The surrogate pair is invalid. Missing a low surrogate character."));
            }
            m65734to(9);
            if (m65735to()) {
                this.f46724rv.m65769k4(c);
            } else {
                this.f46719kk.mo21900k4(c);
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        if (str == null) {
            return;
        }
        try {
            m65734to(9);
            if (m65735to()) {
                this.f46724rv.m65775kk(str);
            } else {
                this.f46719kk.mo21918x1(str);
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m65739x1(String str, String str2) {
        int iM65724jd = m65724jd(str);
        int i = 1;
        if (iM65724jd != -1) {
            if (iM65724jd > this.f46718jd[this.f46712ck].f46743k4) {
                if (!C14113y2.m67363du(this.f46716h4[iM65724jd].f46751x1, str2)) {
                    throw new XmlException("The prefix '{0}' cannot be redefined from '{1}' to '{2}' within the same start element tag.", new String[]{str, this.f46716h4[iM65724jd].f46751x1, str2});
                }
                return;
            }
            to toVar = this.f46716h4[iM65724jd];
            if (toVar.f46749kk == 3) {
                if (!"xml".equals(str)) {
                    throw new ArgumentException(C13968ri.m65818k4("Prefix \"xmlns\" is reserved for use by XML."));
                }
                if (!C14113y2.m67363du(str2, this.f46716h4[iM65724jd].f46751x1)) {
                    throw new ArgumentException(C13968ri.m65818k4("Prefix \"xml\" is reserved for use by XML and can be mapped only to namespace name \"http://www.w3.org/XML/1998/namespace\"."));
                }
            } else if (C14113y2.m67363du(toVar.f46751x1, str2)) {
            }
            i = 2;
        } else {
            if (("http://www.w3.org/XML/1998/namespace".equals(str2) && !"xml".equals(str)) || ("http://www.w3.org/2000/xmlns/".equals(str2) && !"xmlns".equals(str))) {
                throw new ArgumentException(C13968ri.m65819k4("Prefix '{0}' cannot be mapped to namespace name reserved for \"xml\" or \"xmlns\".", str));
            }
            InterfaceC13980t6 interfaceC13980t6 = this.f46713du;
            if (interfaceC13980t6 != null && C14113y2.m67363du(interfaceC13980t6.mo13292k4(str), str2)) {
                i = 2;
            }
        }
        m65728k4(str, str2, i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        try {
            if (!C14117yj.m67532kk(c2, c)) {
                throw C13850af.m65078k4(c, c2);
            }
            m65734to(9);
            if (m65735to()) {
                this.f46724rv.m65770k4(c, c2);
            } else {
                this.f46719kk.mo21901k4(c, c2);
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65726k4(int i) {
        this.f46720ks = i;
        int i2 = this.f46717ix;
        if (8 == i2) {
            this.f46717ix = 9;
        } else if (11 == i2) {
            this.f46717ix = 12;
        } else if (this.f46724rv == null) {
            this.f46724rv = new x1(null);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m65740x1(String str, String str2, String str3) {
        int i = this.f46728up;
        this.f46728up = i + 1;
        if (i == this.f46715fa.length) {
            k4[] k4VarArr = (k4[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) k4.class), i * 2));
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) this.f46715fa), AbstractC14092to.m67208k4((Object) k4VarArr), i);
            this.f46715fa = k4VarArr;
        }
        this.f46715fa[i].m65752k4(str, str2, str3);
        int i2 = this.f46728up;
        int i3 = 0;
        if (i2 < 14) {
            while (i3 < i) {
                if (this.f46715fa[i3].m65753x1(str, str2, str3)) {
                    throw m65732m9(str, str2);
                }
                i3++;
            }
            return;
        }
        if (i2 == 14) {
            if (this.f46733yj == null) {
                this.f46733yj = new Dictionary<>(this.f46730v4);
            }
            while (i3 < i) {
                m65722h4(i3);
                i3++;
            }
        }
        m65722h4(i);
        k4 k4Var = this.f46715fa[i];
        while (true) {
            int i4 = k4Var.f46738to;
            if (i4 <= 0) {
                return;
            }
            int i5 = i4 - 1;
            if (this.f46715fa[i5].m65753x1(str, str2, str3)) {
                throw m65732m9(str, str2);
            }
            k4Var = this.f46715fa[i5];
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65727k4(int i, int i2) {
        while (i2 >= i) {
            to toVar = this.f46716h4[i2];
            int i3 = toVar.f46750to;
            if (i3 == -1) {
                this.f46714dy.removeItemByKey(toVar.f46748k4);
            } else {
                this.f46714dy.set_Item(toVar.f46748k4, Integer.valueOf(i3));
            }
            i2--;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo65747x1(boolean z) {
        m65737x1(z ? 1 : 2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        AbstractC13958qb abstractC13958qb;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    m65721fa(str);
                    if (str2 == null) {
                        str2 = C14113y2.f47374k4;
                    }
                    if (str.length() != 3 || C14113y2.m67360du(str, "xml", (short) 5) != 0) {
                        m65734to(2);
                        abstractC13958qb = this.f46719kk;
                    } else {
                        if (this.f46717ix != 0) {
                            throw new ArgumentException(C13968ri.m65818k4(this.f46723qq == 2 ? "Cannot write XML declaration. WriteStartDocument method has already written it." : "Cannot write XML declaration. XML declaration can be only at the beginning of the document."));
                        }
                        this.f46727um = true;
                        m65734to(2);
                        AbstractC13965r5 abstractC13965r5 = this.f46725to;
                        if (abstractC13965r5 != null) {
                            abstractC13965r5.mo21905k4(str2);
                            return;
                        }
                        abstractC13958qb = this.f46719kk;
                    }
                    abstractC13958qb.mo21907k4(str, str2);
                    return;
                }
            } catch (RuntimeException e) {
                this.f46717ix = 16;
                throw e;
            }
        }
        throw new ArgumentException(C13968ri.m65818k4("The empty string '' is not a valid name."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo65659x1(byte[] bArr, int i, int i2) {
        if (m65731ks()) {
            throw new InvalidOperationException(C13968ri.m65818k4("The Writer is closed or in error state."));
        }
        try {
            m65734to(9);
            super.mo65659x1(bArr, i, i2);
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65728k4(String str, String str2, int i) {
        int i2 = this.f46721m9 + 1;
        this.f46721m9 = i2;
        if (i2 == this.f46716h4.length) {
            to[] toVarArr = (to[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) to.class), i2 * 2));
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) this.f46716h4), AbstractC14092to.m67208k4((Object) toVarArr), i2);
            this.f46716h4 = toVarArr;
        }
        this.f46716h4[i2].m65764k4(str, str2, i);
        if (this.f46711c5) {
            m65730kk(this.f46721m9);
            return;
        }
        if (this.f46721m9 == 16) {
            this.f46714dy = new Dictionary<>(this.f46730v4);
            for (int i3 = 0; i3 <= this.f46721m9; i3++) {
                m65730kk(i3);
            }
            this.f46711c5 = true;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        AbstractC13965r5 abstractC13965r5;
        if (str2 != null) {
            try {
                if (str2.length() != 0) {
                    m65721fa(str2);
                    m65734to(5);
                    if (str == null) {
                        if (str3 != null) {
                            str = m65745k4(str3);
                        }
                        if (str == null) {
                            str = C14113y2.f47374k4;
                        }
                    } else if (str.length() > 0) {
                        m65721fa(str);
                        if (str3 == null) {
                            str3 = m65746to(str);
                        }
                        if (str3 == null || str3.length() == 0) {
                            throw new ArgumentException(C13968ri.m65818k4("Cannot use a prefix with an empty namespace."));
                        }
                    }
                    if (str3 == null && (str3 = m65746to(str)) == null) {
                        str3 = C14113y2.f47374k4;
                    }
                    if (this.f46712ck == 0 && (abstractC13965r5 = this.f46725to) != null) {
                        abstractC13965r5.mo65187kk(this.f46723qq);
                    }
                    this.f46719kk.mo12953k4(str, str2, str3);
                    int i = this.f46712ck + 1;
                    this.f46712ck = i;
                    if (i == this.f46718jd.length) {
                        kk[] kkVarArr = (kk[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) kk.class), i * 2));
                        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) this.f46718jd), AbstractC14092to.m67208k4((Object) kkVarArr), i);
                        this.f46718jd = kkVarArr;
                    }
                    this.f46718jd[i].m65758k4(str, str2, str3, this.f46721m9);
                    m65739x1(str, str3);
                    if (this.f46728up >= 14) {
                        this.f46733yj.clear();
                    }
                    this.f46728up = 0;
                    return;
                }
            } catch (RuntimeException e) {
                this.f46717ix = 16;
                throw e;
            }
        }
        throw new ArgumentException(C13968ri.m65818k4("The empty string '' is not a valid local name."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        int iM66335kk;
        int iM66335kk2;
        int iM66338to;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    C13850af.m65110k4(str, 1);
                    if (this.f46723qq == 1) {
                        throw new InvalidOperationException(C13968ri.m65818k4("DTD is not allowed in XML fragments."));
                    }
                    m65734to(4);
                    if (this.f46709ar) {
                        this.f46717ix = 16;
                        throw new InvalidOperationException(C13968ri.m65818k4("The DTD has already been written out."));
                    }
                    if (this.f46723qq == 0) {
                        this.f46723qq = 2;
                        this.f46722ne = f46708yd;
                    }
                    if (this.f46726u4) {
                        if (str2 != null && (iM66338to = this.f46710bv.m66338to(str2)) >= 0) {
                            throw new ArgumentException(C13968ri.m65819k4("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(str2, iM66338to)), "pubid");
                        }
                        if (str3 != null && (iM66335kk2 = this.f46710bv.m66335kk(str3)) >= 0) {
                            throw new ArgumentException(C13968ri.m65819k4("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(str3, iM66335kk2)), "sysid");
                        }
                        if (str4 != null && (iM66335kk = this.f46710bv.m66335kk(str4)) >= 0) {
                            throw new ArgumentException(C13968ri.m65819k4("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(str4, iM66335kk)), "subset");
                        }
                    }
                    this.f46719kk.mo21908k4(str, str2, str3, str4);
                    this.f46709ar = true;
                    return;
                }
            } catch (RuntimeException e) {
                this.f46717ix = 16;
                throw e;
            }
        }
        throw new ArgumentException(C13968ri.m65818k4("The empty string '' is not a valid name."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo65186k4(byte[] bArr, int i, int i2) {
        try {
            if (bArr == null) {
                throw new ArgumentNullException("buffer");
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f);
            }
            if (i2 > bArr.length - i) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f);
            }
            m65734to(12);
            this.f46719kk.mo65186k4(bArr, i, i2);
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        try {
            if (cArr == null) {
                throw new ArgumentNullException("buffer");
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
            }
            if (i2 < 0) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f);
            }
            if (i2 > cArr.length - i) {
                throw new ArgumentOutOfRangeException(C18293o1.f55803f);
            }
            m65734to(9);
            if (m65735to()) {
                this.f46724rv.m65773k4(cArr, i, i2);
            } else {
                this.f46719kk.mo21909k4(cArr, i, i2);
            }
        } catch (RuntimeException e) {
            this.f46717ix = 16;
            throw e;
        }
    }
}
