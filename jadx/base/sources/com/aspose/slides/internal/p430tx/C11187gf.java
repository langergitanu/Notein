package com.aspose.slides.internal.p430tx;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p196j0.C5139k4;
import com.aspose.slides.internal.p229ki.AbstractC5728qw;
import com.aspose.slides.internal.p229ki.C5709jw;
import com.aspose.slides.internal.p229ki.C5720na;
import com.aspose.slides.internal.p229ki.C5722nv;
import com.aspose.slides.internal.p229ki.C5764y9;
import com.aspose.slides.internal.p267m6.C6322kk;
import com.aspose.slides.internal.p267m6.C6324x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p331p6.InterfaceC7199k4;
import com.aspose.slides.internal.p331p6.InterfaceC7203x1;
import com.aspose.slides.internal.p358qe.AbstractC9839c5;
import com.aspose.slides.internal.p358qe.C9845jd;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.internal.p418tf.InterfaceC10927k4;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.huawei.hms.network.embedded.C18293o1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf */
/* JADX INFO: loaded from: classes4.dex */
public class C11187gf extends AbstractC7201m9 {

    /* JADX INFO: renamed from: kk */
    private static Hashtable f38517kk = m53771m9();

    /* JADX INFO: renamed from: to */
    private static InterfaceC7199k4 f38518to = new c5();

    /* JADX INFO: renamed from: k4 */
    private C11233xk f38519k4;

    /* JADX INFO: renamed from: x1 */
    private C11234xw f38520x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$c5 */
    public static class c5 extends fa {
        public c5() {
            super(1, 1, 3, new int[]{1});
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            return new C5720na(fa.m53786x1(objArr[0]));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$ck */
    public static class ck extends fa {
        public ck() {
            super(1, 1, 1, new int[]{1});
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            throw XsltException.create("'{0}()' is an unsupported XSLT function.", "unparsed-entity-uri");
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$du */
    public static class du extends fa {
        public du() {
            super(2, 3, 1, new int[]{0, 1, 1});
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            return C6322kk.m25887k4(fa.m53779du(objArr[0]), fa.m53784kk(objArr[1]), ((C11187gf) abstractC7201m9).m53768kk(objArr.length == 3 ? fa.m53784kk(objArr[2]) : null));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$dy */
    public static class dy extends fa {
        public dy() {
            super(2, 2, 3, new int[]{1, 5});
        }

        /* JADX INFO: renamed from: k4 */
        private static ArrayList m53778k4(ArrayList arrayList, ArrayList arrayList2) {
            if (arrayList2 == null) {
                return arrayList;
            }
            if (arrayList == null) {
                return arrayList2;
            }
            if (!C7019kk.m27469x1(arrayList.get_Item(0), ArrayList.class)) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addItem(arrayList);
                arrayList = arrayList3;
            }
            arrayList.addItem(arrayList2);
            return arrayList;
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            C11187gf c11187gf = (C11187gf) abstractC7201m9;
            ArrayList arrayListM53778k4 = null;
            String[] strArr = {null};
            String[] strArr2 = {null};
            C11184f9.m53724k4(fa.m53784kk(objArr[0]), strArr, strArr2);
            C13890ei c13890ei = new C13890ei(strArr2[0], abstractC7201m9.mo13292k4(strArr[0]));
            AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
            abstractC10925duDeepClone.mo21848ix();
            for (C11176c6 c11176c6 : c11187gf.f38520x1.m54165du()) {
                if (C13890ei.m65278k4(c11176c6.m53686k4(), c13890ei)) {
                    Hashtable hashtableM53685k4 = c11176c6.m53685k4(abstractC10925duDeepClone);
                    if (hashtableM53685k4 == null) {
                        hashtableM53685k4 = c11187gf.m53758k4(c11176c6, abstractC10925duDeepClone);
                        c11176c6.m53687k4(abstractC10925duDeepClone, hashtableM53685k4);
                    }
                    AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(objArr[1], AbstractC10929m9.class);
                    if (abstractC10929m9 != null) {
                        AbstractC10929m9 abstractC10929m9DeepClone = abstractC10929m9.deepClone();
                        while (abstractC10929m9DeepClone.mo21770x1()) {
                            arrayListM53778k4 = m53778k4(arrayListM53778k4, (ArrayList) hashtableM53685k4.get_Item(abstractC10929m9DeepClone.mo21834kk().mo21843dy()));
                        }
                    } else {
                        arrayListM53778k4 = m53778k4(arrayListM53778k4, (ArrayList) hashtableM53685k4.get_Item(fa.m53784kk(objArr[1])));
                    }
                }
            }
            return arrayListM53778k4 == null ? C5722nv.f15764k4 : C7019kk.m27469x1(arrayListM53778k4.get_Item(0), AbstractC10925du.class) ? new C5709jw(arrayListM53778k4) : new C5764y9(arrayListM53778k4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$fa */
    public static abstract class fa implements InterfaceC7199k4 {

        /* JADX INFO: renamed from: k4 */
        private int f38521k4;

        /* JADX INFO: renamed from: kk */
        private int f38522kk;

        /* JADX INFO: renamed from: to */
        private int[] f38523to;

        /* JADX INFO: renamed from: x1 */
        private int f38524x1;

        public fa() {
        }

        /* JADX INFO: renamed from: du */
        public static double m53779du(Object obj) {
            String string;
            AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(obj, AbstractC10929m9.class);
            if (abstractC10929m9 != null) {
                string = m53783k4(abstractC10929m9);
            } else {
                AbstractC10925du abstractC10925du = (AbstractC10925du) C7019kk.m27452k4(obj, AbstractC10925du.class);
                if (abstractC10925du == null) {
                    return C13850af.m65076k4(obj);
                }
                string = abstractC10925du.toString();
            }
            return C13850af.m65076k4((Object) string);
        }

        /* JADX INFO: renamed from: to */
        public static boolean m53785to(Object obj) {
            AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(obj, AbstractC10929m9.class);
            if (abstractC10929m9 != null) {
                return C14080ne.m66969k4(m53783k4(abstractC10929m9), (InterfaceC14073kp) C11697x1.m55250kk());
            }
            AbstractC10925du abstractC10925du = (AbstractC10925du) C7019kk.m27452k4(obj, AbstractC10925du.class);
            return abstractC10925du != null ? C14080ne.m66969k4(abstractC10925du.toString(), (InterfaceC14073kp) C11697x1.m55250kk()) : C14080ne.m66966k4(obj, C11697x1.m55250kk());
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public final int mo27857k4() {
            return this.f38521k4;
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: kk */
        public final int mo27859kk() {
            return this.f38522kk;
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: x1 */
        public final int mo27860x1() {
            return this.f38524x1;
        }

        public fa(int i, int i2, int i3, int[] iArr) {
            m53787k4(i, i2, i3, iArr);
        }

        /* JADX INFO: renamed from: k4 */
        public static AbstractC10929m9 m53780k4(Object obj) {
            AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(obj, AbstractC10929m9.class);
            if (abstractC10929m9 != null) {
                return abstractC10929m9;
            }
            throw XsltException.create("Cannot convert the operand to a node-set.", new String[0]);
        }

        /* JADX INFO: renamed from: kk */
        public static String m53784kk(Object obj) {
            AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(obj, AbstractC10929m9.class);
            return abstractC10929m9 != null ? m53783k4(abstractC10929m9) : C13850af.m65148x1(obj);
        }

        /* JADX INFO: renamed from: x1 */
        public static AbstractC10925du m53786x1(Object obj) {
            AbstractC10925du abstractC10925du = (AbstractC10925du) C7019kk.m27452k4(obj, AbstractC10925du.class);
            if (abstractC10925du != null) {
                return abstractC10925du;
            }
            throw XsltException.create("Cannot convert the operand to 'Result tree fragment'.", new String[0]);
        }

        /* JADX INFO: renamed from: to */
        public final int[] m53788to() {
            return this.f38523to;
        }

        /* JADX INFO: renamed from: k4 */
        private static Object m53781k4(Object obj, int i) {
            return C14080ne.m66938k4(Double.valueOf(m53779du(obj)), i, C11697x1.m55250kk());
        }

        /* JADX INFO: renamed from: k4 */
        public static Object m53782k4(Object obj, int i, int i2) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? obj : m53780k4(obj) : Boolean.valueOf(m53785to(obj)) : i2 == 18 ? m53784kk(obj) : m53786x1(obj) : m53781k4(obj, i2);
        }

        /* JADX INFO: renamed from: k4 */
        private static String m53783k4(AbstractC10929m9 abstractC10929m9) {
            return abstractC10929m9.mo21770x1() ? abstractC10929m9.mo21834kk().mo21843dy() : C14113y2.f47374k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m53787k4(int i, int i2, int i3, int[] iArr) {
            this.f38521k4 = i;
            this.f38524x1 = i2;
            this.f38522kk = i3;
            this.f38523to = iArr;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$h4 */
    public static class h4 extends fa {
        public h4() {
            super(1, 1, 2, new int[]{1});
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            return Boolean.valueOf(((C11187gf) abstractC7201m9).m53754du(fa.m53784kk(objArr[0])));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$jd */
    public static class jd extends fa {
        public jd() {
            super(1, 1, 1, new int[]{1});
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            return ((C11187gf) abstractC7201m9).m53756h4(fa.m53784kk(objArr[0]));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$k4 */
    public static class k4 extends fa {
        public k4() {
            super(0, 0, 3, new int[0]);
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            return ((C11187gf) abstractC7201m9).m53755h4();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$kk */
    public static class kk extends fa {
        public kk() {
            super(1, 1, 2, new int[]{1});
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            return Boolean.valueOf(((C11187gf) abstractC7201m9).m53773to(fa.m53784kk(objArr[0])));
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$m9 */
    public static class m9 extends fa {
        public m9() {
            super(0, 1, 1, new int[]{3});
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            if (objArr.length <= 0) {
                return abstractC10925du.mo21873v4();
            }
            AbstractC10929m9 abstractC10929m9M53780k4 = fa.m53780k4(objArr[0]);
            return abstractC10929m9M53780k4.mo21770x1() ? abstractC10929m9M53780k4.mo21834kk().mo21873v4() : C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$to */
    public static class to extends fa {

        /* JADX INFO: renamed from: k4 */
        private Object f38525k4;

        /* JADX INFO: renamed from: kk */
        private int[] f38526kk;

        /* JADX INFO: renamed from: x1 */
        private AbstractC9839c5 f38527x1;

        public to(Object obj, AbstractC9839c5 abstractC9839c5, C5139k4 c5139k4) {
            this.f38525k4 = obj;
            this.f38527x1 = abstractC9839c5;
            int iM53757k4 = C11187gf.m53757k4(abstractC9839c5.mo48520ne());
            C9845jd[] c9845jdArrMo48533m9 = abstractC9839c5.mo48533m9();
            int length = c9845jdArrMo48533m9.length;
            int length2 = c9845jdArrMo48533m9.length;
            this.f38526kk = new int[c9845jdArrMo48533m9.length];
            int[] iArr = new int[c9845jdArrMo48533m9.length];
            boolean z = true;
            for (int length3 = c9845jdArrMo48533m9.length - 1; length3 >= 0; length3--) {
                this.f38526kk[length3] = AbstractC14068j5.m66733to(c9845jdArrMo48533m9[length3].m48561k4());
                iArr[length3] = C11187gf.m53757k4(c9845jdArrMo48533m9[length3].m48561k4());
                if (z) {
                    if (c9845jdArrMo48533m9[length3].m48563kk()) {
                        length--;
                    } else {
                        z = false;
                    }
                }
            }
            m53787k4(length, length2, iM53757k4, iArr);
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            for (int length = objArr.length - 1; length >= 0; length--) {
                objArr[length] = fa.m53782k4(objArr[length], m53788to()[length], this.f38526kk[length]);
            }
            return this.f38527x1.m48531k4(this.f38525k4, objArr);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.tx.gf$x1 */
    public static class x1 extends fa {
        public x1() {
            super(1, 2, 3, new int[]{5, 3});
        }

        @Override // com.aspose.slides.internal.p331p6.InterfaceC7199k4
        /* JADX INFO: renamed from: k4 */
        public Object mo27858k4(AbstractC7201m9 abstractC7201m9, Object[] objArr, AbstractC10925du abstractC10925du) {
            String strMo21839c5;
            if (objArr.length == 2) {
                AbstractC10929m9 abstractC10929m9M53780k4 = fa.m53780k4(objArr[1]);
                strMo21839c5 = abstractC10929m9M53780k4.mo21770x1() ? abstractC10929m9M53780k4.mo21834kk().mo21839c5() : C14113y2.f47374k4;
            } else {
                strMo21839c5 = null;
            }
            try {
                return ((C11187gf) abstractC7201m9).m53764k4(objArr[0], strMo21839c5);
            } catch (RuntimeException e) {
                if (XmlException.isCatchableException(e)) {
                    return C5722nv.f15764k4;
                }
                throw e;
            }
        }
    }

    public C11187gf() {
        super(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public AbstractC10929m9 m53755h4() {
        AbstractC10925du abstractC10925duM54171k4 = this.f38520x1.m54171k4();
        return abstractC10925duM54171k4 != null ? new C5720na(abstractC10925duM54171k4.deepClone()) : C5722nv.f15764k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m53757k4(AbstractC14068j5 abstractC14068j5) {
        int iM66733to = AbstractC14068j5.m66733to(abstractC14068j5);
        if (iM66733to == 1) {
            if (C7019kk.m27443k4((Class<?>) AbstractC10925du.class).m66761x1(abstractC14068j5) || C7019kk.m27443k4((Class<?>) InterfaceC10927k4.class).m66761x1(abstractC14068j5)) {
                return 1;
            }
            return C7019kk.m27443k4((Class<?>) AbstractC10929m9.class).m66761x1(abstractC14068j5) ? 3 : 5;
        }
        if (iM66733to == 3) {
            return 2;
        }
        if (iM66733to != 16) {
            return iM66733to != 18 ? 0 : 1;
        }
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public C6324x1 m53768kk(String str) {
        String strMo13292k4;
        String str2 = C14113y2.f47374k4;
        if (str != null) {
            String[] strArr = {null};
            String[] strArr2 = {str2};
            C11184f9.m53724k4(str, strArr, strArr2);
            String str3 = strArr[0];
            str2 = strArr2[0];
            strMo13292k4 = mo13292k4(str3);
        } else {
            strMo13292k4 = str2;
        }
        C6324x1 c6324x1M53890kk = this.f38520x1.m54199m9().m53890kk(new C13890ei(str2, strMo13292k4));
        if (c6324x1M53890kk != null) {
            return c6324x1M53890kk;
        }
        if (str == null) {
            return new C6324x1(new C11683c5(), '#', '0', ';');
        }
        throw XsltException.create("Decimal format '{0}' is not defined.", str);
    }

    /* JADX INFO: renamed from: m9 */
    private static Hashtable m53771m9() {
        Hashtable hashtable = new Hashtable(10);
        hashtable.set_Item("current", new k4());
        hashtable.set_Item("unparsed-entity-uri", new ck());
        hashtable.set_Item("generate-id", new m9());
        hashtable.set_Item("system-property", new jd());
        hashtable.set_Item("element-available", new kk());
        hashtable.set_Item("function-available", new h4());
        hashtable.set_Item("document", new x1());
        hashtable.set_Item("key", new dy());
        hashtable.set_Item("format-number", new du());
        return hashtable;
    }

    @Override // com.aspose.slides.internal.p331p6.AbstractC7201m9
    /* JADX INFO: renamed from: du */
    public boolean mo23223du() {
        return this.f38520x1.m54205x1().m53869k4();
    }

    @Override // com.aspose.slides.internal.p331p6.AbstractC7201m9
    /* JADX INFO: renamed from: x1 */
    public InterfaceC7203x1 mo23226x1(String str, String str2) {
        C13890ei c13890ei = new C13890ei(str2, mo13292k4(str));
        C11194j5 c11194j5M53695k4 = this.f38519k4.m54154x1().m53695k4(c13890ei);
        if (c11194j5M53695k4 != null) {
            return c11194j5M53695k4;
        }
        throw XsltException.create("The variable or parameter '{0}' is either not defined or it is out of scope.", c13890ei.toString());
    }

    public C11187gf(C11233xk c11233xk, C11234xw c11234xw) {
        super(false);
        this.f38519k4 = c11233xk;
        this.f38520x1 = c11234xw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: du */
    public boolean m53754du(String str) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        C11184f9.m53724k4(str, strArr, strArr2);
        String str2 = strArr[0];
        String str3 = strArr2[0];
        String strMo13292k4 = mo13292k4(str2);
        return "urn:schemas-microsoft-com:Xslt".equals(strMo13292k4) ? "node-set".equals(str3) : strMo13292k4.length() == 0 ? "last".equals(str3) || RequestParameters.POSITION.equals(str3) || "name".equals(str3) || "namespace-uri".equals(str3) || "local-name".equals(str3) || C18293o1.f55803f.equals(str3) || "id".equals(str3) || "string".equals(str3) || "concat".equals(str3) || "starts-with".equals(str3) || "contains".equals(str3) || "substring-before".equals(str3) || "substring-after".equals(str3) || "substring".equals(str3) || "string-length".equals(str3) || "normalize-space".equals(str3) || "translate".equals(str3) || "boolean".equals(str3) || "not".equals(str3) || TelemetryEventStrings.Value.TRUE.equals(str3) || TelemetryEventStrings.Value.FALSE.equals(str3) || CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL.equals(str3) || "number".equals(str3) || "sum".equals(str3) || "floor".equals(str3) || "ceiling".equals(str3) || "round".equals(str3) || !(f38517kk.get_Item(str3) == null || "unparsed-entity-uri".equals(str3)) : m53760k4(strMo13292k4, str3, (int[]) null, new Object[]{null}) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public String m53756h4(String str) {
        String str2 = C14113y2.f47374k4;
        String[] strArr = {null};
        String[] strArr2 = {null};
        C11184f9.m53724k4(str, strArr, strArr2);
        String str3 = strArr[0];
        String str4 = strArr2[0];
        String strMo13292k4 = mo13292k4(str3);
        if ("http://www.w3.org/1999/XSL/Transform".equals(strMo13292k4)) {
            return "version".equals(str4) ? "1" : "vendor".equals(str4) ? "Microsoft" : "vendor-url".equals(str4) ? "http://www.microsoft.com" : str2;
        }
        if (strMo13292k4 != null || str3 == null) {
            return C14113y2.f47374k4;
        }
        throw XsltException.create("Prefix '{0}' is not defined.", str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public Hashtable m53758k4(C11176c6 c11176c6, AbstractC10925du abstractC10925du) {
        Hashtable hashtable = new Hashtable();
        String strM54209x1 = this.f38520x1.m54209x1(c11176c6.m53690x1());
        AbstractC5728qw abstractC5728qwM54193kk = this.f38520x1.m54193kk(c11176c6.m53690x1());
        AbstractC5728qw abstractC5728qwM54193kk2 = this.f38520x1.m54193kk(c11176c6.m53688kk());
        AbstractC10929m9 abstractC10929m9Mo21852k4 = abstractC10925du.mo21852k4(9, false);
        while (abstractC10929m9Mo21852k4.mo21770x1()) {
            AbstractC10925du abstractC10925duMo21834kk = abstractC10929m9Mo21852k4.mo21834kk();
            m53767k4(abstractC10925duMo21834kk, abstractC5728qwM54193kk, strM54209x1, abstractC5728qwM54193kk2, hashtable);
            if (abstractC10925duMo21834kk.mo21879yj()) {
                do {
                    m53767k4(abstractC10925duMo21834kk, abstractC5728qwM54193kk, strM54209x1, abstractC5728qwM54193kk2, hashtable);
                } while (abstractC10925duMo21834kk.mo21861ks());
                abstractC10925duMo21834kk.mo21864ne();
            }
        }
        return hashtable;
    }

    /* JADX INFO: renamed from: kk */
    private C14062gk m53769kk(String str, String str2) {
        AbstractC13943n5 abstractC13943n5M54194kk = this.f38520x1.m54194kk();
        return abstractC13943n5M54194kk.mo65674k4(str2.length() != 0 ? abstractC13943n5M54194kk.mo65674k4((C14062gk) null, str2) : null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public boolean m53773to(String str) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        C11184f9.m53724k4(str, strArr, strArr2);
        String str2 = strArr[0];
        String str3 = strArr2[0];
        if ("http://www.w3.org/1999/XSL/Transform".equals(this.f38519k4.m54146k4(str2))) {
            return "apply-imports".equals(str3) || "apply-templates".equals(str3) || "attribute".equals(str3) || "call-template".equals(str3) || "choose".equals(str3) || "comment".equals(str3) || "copy".equals(str3) || "copy-of".equals(str3) || "element".equals(str3) || "fallback".equals(str3) || "for-each".equals(str3) || "if".equals(str3) || "message".equals(str3) || "number".equals(str3) || "processing-instruction".equals(str3) || "text".equals(str3) || "value-of".equals(str3) || "variable".equals(str3);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13950o3
    /* JADX INFO: renamed from: x1 */
    public String mo23227x1() {
        return C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.internal.p331p6.AbstractC7201m9
    /* JADX INFO: renamed from: k4 */
    public InterfaceC7199k4 mo23224k4(String str, String str2, int[] iArr) {
        InterfaceC7199k4 interfaceC7199k4;
        if (str.length() == 0) {
            interfaceC7199k4 = (InterfaceC7199k4) C7019kk.m27452k4(f38517kk.get_Item(str2), InterfaceC7199k4.class);
        } else {
            String strMo13292k4 = mo13292k4(str);
            if ("urn:schemas-microsoft-com:Xslt".equals(strMo13292k4) && "node-set".equals(str2)) {
                interfaceC7199k4 = f38518to;
            } else {
                Object[] objArr = {null};
                InterfaceC7199k4 interfaceC7199k4M53760k4 = m53760k4(strMo13292k4, str2, iArr, objArr);
                if (objArr[0] == null) {
                    throw XsltException.create("Cannot find the script or external object that implements prefix '{0}'.", str);
                }
                interfaceC7199k4 = interfaceC7199k4M53760k4;
            }
        }
        if (interfaceC7199k4 == null) {
            throw XsltException.create("'{0}()' is an unknown XSLT function.", str2);
        }
        if (iArr.length < interfaceC7199k4.mo27857k4() || interfaceC7199k4.mo27860x1() < iArr.length) {
            throw XsltException.create("XSLT function '{0}()' has the wrong number of arguments.", str2, C14057f9.m66586k4(iArr.length, (InterfaceC14073kp) C11697x1.m55250kk()));
        }
        return interfaceC7199k4;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC7199k4 m53760k4(String str, String str2, int[] iArr, Object[] objArr) {
        AbstractC9839c5 abstractC9839c5M53761k4;
        Object objM54208x1 = this.f38520x1.m54208x1(str);
        objArr[0] = objM54208x1;
        if (objM54208x1 != null) {
            AbstractC9839c5 abstractC9839c5M53761k42 = m53761k4(C14067j2.m66727k4(objM54208x1).mo48623k4(60), true, false, str2, iArr);
            if (abstractC9839c5M53761k42 != null) {
                return new to(objArr[0], abstractC9839c5M53761k42, null);
            }
        } else {
            Object objM54176k4 = this.f38520x1.m54176k4(str);
            objArr[0] = objM54176k4;
            if (objM54176k4 != null && (abstractC9839c5M53761k4 = m53761k4(C14067j2.m66727k4(objM54176k4).mo48623k4(60), false, true, str2, iArr)) != null) {
                return new to(objArr[0], abstractC9839c5M53761k4, null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC9839c5 m53761k4(AbstractC9839c5[] abstractC9839c5Arr, boolean z, boolean z2, String str, int[] iArr) {
        int iM53757k4;
        int length = abstractC9839c5Arr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (C14113y2.m67360du(str, abstractC9839c5Arr[i].mo48540du(), z ? (short) 5 : (short) 4) == 0 && (!z2 || abstractC9839c5Arr[i].mo48519k4().m48527fa())) {
                abstractC9839c5Arr[i2] = abstractC9839c5Arr[i];
                i2++;
            }
            i++;
        }
        if (i2 == 0) {
            return null;
        }
        if (iArr == null) {
            return abstractC9839c5Arr[0];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (abstractC9839c5Arr[i4].mo48533m9().length == iArr.length) {
                abstractC9839c5Arr[i3] = abstractC9839c5Arr[i4];
                i3++;
            }
        }
        if (i3 <= 1) {
            return abstractC9839c5Arr[0];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            C9845jd[] c9845jdArrMo48533m9 = abstractC9839c5Arr[i6].mo48533m9();
            int i7 = 0;
            while (true) {
                if (i7 >= c9845jdArrMo48533m9.length) {
                    abstractC9839c5Arr[i5] = abstractC9839c5Arr[i6];
                    i5++;
                    break;
                }
                int i8 = iArr[i7];
                if (i8 != 5 && (iM53757k4 = m53757k4(c9845jdArrMo48533m9[i7].m48561k4())) != i8 && iM53757k4 != 5) {
                    break;
                }
                i7++;
            }
        }
        return abstractC9839c5Arr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 m53764k4(Object obj, String str) {
        AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(obj, AbstractC10929m9.class);
        if (abstractC10929m9 == null) {
            if (str == null) {
                str = this.f38519k4.m54152to().mo21839c5();
            }
            return new C5720na(this.f38520x1.m54172k4(m53769kk(C13850af.m65148x1(obj), str)));
        }
        ArrayList arrayList = new ArrayList();
        Hashtable hashtable = new Hashtable();
        while (abstractC10929m9.mo21770x1()) {
            C14062gk c14062gkM53769kk = m53769kk(abstractC10929m9.mo21834kk().mo21843dy(), str == null ? abstractC10929m9.mo21834kk().mo21839c5() : str);
            if (!hashtable.containsKey(c14062gkM53769kk)) {
                hashtable.addItem(c14062gkM53769kk, null);
                arrayList.addItem(this.f38520x1.m54172k4(c14062gkM53769kk));
            }
        }
        return new C5709jw(arrayList);
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m53776k4(C11194j5 c11194j5) {
        C11194j5 c11194j5M53704x1;
        Object objM54174k4 = this.f38520x1.m54174k4(c11194j5);
        if (objM54174k4 == null && !c11194j5.m53815h4() && (c11194j5M53704x1 = this.f38519k4.m54154x1().m53704x1(c11194j5.m53816kk())) != null) {
            objM54174k4 = this.f38520x1.m54174k4(c11194j5M53704x1);
        }
        if (objM54174k4 != null) {
            return objM54174k4;
        }
        throw XsltException.create("The variable or parameter '{0}' is either not defined or it is out of scope.", c11194j5.m53816kk().toString());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13950o3, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        return this.f38519k4.m54155x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m53766k4(Hashtable hashtable, String str, AbstractC10925du abstractC10925du, boolean z) {
        ArrayList arrayList = (ArrayList) hashtable.get_Item(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashtable.addItem(str, arrayList);
        } else if (z && abstractC10925du.mo21866to((AbstractC10925du) arrayList.get_Item(arrayList.size() - 1)) == 2) {
            return;
        }
        arrayList.addItem(abstractC10925du.deepClone());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m53767k4(AbstractC10925du abstractC10925du, AbstractC5728qw abstractC5728qw, String str, AbstractC5728qw abstractC5728qw2, Hashtable hashtable) {
        try {
            if (abstractC5728qw.mo23147k4(abstractC10925du) == null) {
                return;
            }
            Object objMo23148k4 = abstractC5728qw2.mo23148k4((AbstractC10929m9) new C5720na(abstractC10925du, true));
            AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(objMo23148k4, AbstractC10929m9.class);
            boolean z = false;
            if (abstractC10929m9 == null) {
                m53766k4(hashtable, C13850af.m65148x1(objMo23148k4), abstractC10925du, false);
                return;
            }
            while (abstractC10929m9.mo21770x1()) {
                m53766k4(hashtable, abstractC10929m9.mo21834kk().mo21843dy(), abstractC10925du, z);
                z = true;
            }
        } catch (XPathException unused) {
            throw XsltException.create("'{0}' is an invalid XSLT pattern.", str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53777k4(C11233xk c11233xk, C11234xw c11234xw) {
        this.f38519k4 = c11233xk;
        this.f38520x1 = c11234xw;
    }

    @Override // com.aspose.slides.internal.p331p6.AbstractC7201m9
    /* JADX INFO: renamed from: k4 */
    public boolean mo23225k4(AbstractC10925du abstractC10925du) {
        AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
        abstractC10925duDeepClone.mo21864ne();
        return this.f38520x1.m54205x1().m53870k4(this.f38520x1, abstractC10925duDeepClone);
    }
}
