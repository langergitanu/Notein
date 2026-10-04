package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ub */
/* JADX INFO: loaded from: classes5.dex */
public class C13991ub extends AbstractC13958qb {

    /* JADX INFO: renamed from: ar */
    private C14022y4 f46989ar;

    /* JADX INFO: renamed from: c5 */
    private int f46990c5;

    /* JADX INFO: renamed from: ck */
    private int f46991ck;

    /* JADX INFO: renamed from: du */
    private boolean f46992du;

    /* JADX INFO: renamed from: dy */
    private x1[] f46993dy;

    /* JADX INFO: renamed from: fa */
    private int f46994fa;

    /* JADX INFO: renamed from: h4 */
    private int f46995h4;

    /* JADX INFO: renamed from: ix */
    private boolean f46996ix;

    /* JADX INFO: renamed from: jd */
    private int[] f46997jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3124b3 f46998k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC6747ar f46999kk;

    /* JADX INFO: renamed from: ks */
    private char f47000ks;

    /* JADX INFO: renamed from: m9 */
    private char f47001m9;

    /* JADX INFO: renamed from: ne */
    private String f47002ne;

    /* JADX INFO: renamed from: qq */
    private boolean f47003qq;

    /* JADX INFO: renamed from: rv */
    private boolean f47004rv;

    /* JADX INFO: renamed from: to */
    private int f47005to;

    /* JADX INFO: renamed from: u4 */
    private k4[] f47006u4;

    /* JADX INFO: renamed from: up */
    private C13997v0 f47007up;

    /* JADX INFO: renamed from: uz */
    private int f47008uz;

    /* JADX INFO: renamed from: wl */
    private Dictionary<String, Integer> f47009wl;

    /* JADX INFO: renamed from: x1 */
    private C13861bm f47010x1;

    /* JADX INFO: renamed from: x6 */
    private int f47011x6;

    /* JADX INFO: renamed from: yj */
    private char f47012yj;

    /* JADX INFO: renamed from: um */
    private static String[] f46987um = {"Start", "Prolog", "PostDTD", "Element", "Attribute", "Content", "AttrOnly", "Epilog", "Error", "Closed"};

    /* JADX INFO: renamed from: bv */
    private static String[] f46985bv = {"PI", "Doctype", "Comment", "CData", "StartElement", "EndElement", "LongEndElement", "StartAttribute", "EndAttribute", "Content", "Base64", "RawData", "Whitespace", "Empty"};

    /* JADX INFO: renamed from: v4 */
    private static final int[] f46988v4 = {1, 1, 2, 5, 5, 5, 8, 7, 2, 2, 8, 8, 8, 8, 8, 8, 1, 1, 2, 5, 5, 5, 8, 7, 5, 5, 8, 5, 5, 5, 8, 7, 3, 3, 3, 3, 3, 3, 8, 3, 8, 8, 8, 5, 5, 5, 8, 8, 8, 8, 8, 5, 5, 5, 8, 8, 6, 8, 8, 4, 4, 8, 8, 8, 8, 8, 8, 8, 3, 8, 7, 8, 5, 5, 8, 5, 4, 5, 4, 7, 5, 5, 8, 5, 4, 5, 4, 7, 1, 1, 2, 5, 4, 5, 4, 7, 1, 1, 2, 5, 4, 5, 4, 7};

    /* JADX INFO: renamed from: lr */
    private static final int[] f46986lr = {8, 1, 2, 5, 5, 5, 8, 7, 8, 2, 8, 8, 8, 8, 8, 8, 8, 1, 2, 5, 5, 5, 8, 7, 8, 8, 8, 5, 5, 5, 8, 8, 8, 3, 3, 3, 3, 3, 8, 8, 8, 8, 8, 5, 5, 5, 8, 8, 8, 8, 8, 5, 5, 5, 8, 8, 8, 8, 8, 4, 4, 8, 8, 8, 8, 8, 8, 8, 3, 8, 8, 8, 8, 8, 8, 5, 4, 5, 8, 8, 8, 8, 8, 5, 4, 5, 8, 8, 8, 1, 2, 5, 4, 5, 8, 7, 8, 1, 2, 5, 4, 5, 8, 7};

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ub$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        public String f47013k4;

        /* JADX INFO: renamed from: kk */
        public boolean f47014kk;

        /* JADX INFO: renamed from: to */
        public int f47015to;

        /* JADX INFO: renamed from: x1 */
        public String f47016x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m66263x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f47013k4, this.f47013k4) && C14067j2.m66728k4(k4Var.f47016x1, this.f47016x1) && k4Var.f47014kk == this.f47014kk && k4Var.f47015to == this.f47015to;
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
                return m66263x1((k4) obj);
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
            k4Var.f47013k4 = this.f47013k4;
            k4Var.f47016x1 = this.f47016x1;
            k4Var.f47014kk = this.f47014kk;
            k4Var.f47015to = this.f47015to;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m66266k4(String str, String str2, boolean z) {
            this.f47013k4 = str;
            this.f47016x1 = str2;
            this.f47014kk = z;
            this.f47015to = -1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ub$x1 */
    public static class x1 extends AbstractC7020m9<x1> {

        /* JADX INFO: renamed from: c5 */
        public boolean f47017c5;

        /* JADX INFO: renamed from: du */
        public int f47018du;

        /* JADX INFO: renamed from: dy */
        public int f47019dy;

        /* JADX INFO: renamed from: h4 */
        public String f47020h4;

        /* JADX INFO: renamed from: k4 */
        public String f47021k4;

        /* JADX INFO: renamed from: kk */
        public String f47022kk;

        /* JADX INFO: renamed from: m9 */
        public int f47023m9;

        /* JADX INFO: renamed from: to */
        public int f47024to;

        /* JADX INFO: renamed from: x1 */
        public String f47025x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m66267x1(x1 x1Var) {
            return C14067j2.m66728k4(x1Var.f47021k4, this.f47021k4) && C14067j2.m66728k4(x1Var.f47025x1, this.f47025x1) && C14067j2.m66728k4(x1Var.f47022kk, this.f47022kk) && x1Var.f47024to == this.f47024to && x1Var.f47018du == this.f47018du && C14067j2.m66728k4(x1Var.f47020h4, this.f47020h4) && x1Var.f47023m9 == this.f47023m9 && x1Var.f47019dy == this.f47019dy && x1Var.f47017c5 == this.f47017c5;
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
                return m66267x1((x1) obj);
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

        /* JADX INFO: renamed from: k4 */
        public final void m66269k4(int i) {
            this.f47021k4 = null;
            this.f47022kk = C14113y2.f47374k4;
            this.f47024to = 0;
            this.f47018du = 0;
            this.f47020h4 = null;
            this.f47023m9 = i;
            this.f47019dy = 0;
            this.f47017c5 = false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(x1 x1Var) {
            if (x1Var == null) {
                x1Var = new x1();
            }
            x1Var.f47021k4 = this.f47021k4;
            x1Var.f47025x1 = this.f47025x1;
            x1Var.f47022kk = this.f47022kk;
            x1Var.f47024to = this.f47024to;
            x1Var.f47018du = this.f47018du;
            x1Var.f47020h4 = this.f47020h4;
            x1Var.f47023m9 = this.f47023m9;
            x1Var.f47019dy = this.f47019dy;
            x1Var.f47017c5 = this.f47017c5;
        }
    }

    static {
        C7019kk.m27454k4(k4.class, (InterfaceC7014c5) new C13923k2());
        C7019kk.m27454k4(x1.class, (InterfaceC7014c5) new C13900g9());
    }

    public C13991ub() {
        this.f46989ar = C14022y4.m66318k4().Clone();
        this.f47004rv = true;
        this.f47005to = 0;
        this.f46995h4 = 2;
        this.f47001m9 = ControlChar.SPACE_CHAR;
        this.f47006u4 = (k4[]) C22200OooO0o0.OooO00o(k4.class, 8);
        this.f47008uz = -1;
        x1[] x1VarArr = (x1[]) C22200OooO0o0.OooO00o(x1.class, 10);
        this.f46993dy = x1VarArr;
        this.f46990c5 = 0;
        x1VarArr[0].m66269k4(-1);
        this.f47012yj = '\"';
        this.f46997jd = f46988v4;
        this.f46991ck = 0;
        this.f46994fa = 13;
    }

    /* JADX INFO: renamed from: ck */
    private String m66236ck(String str) {
        for (int i = this.f47008uz; i >= 0; i--) {
            if (C14113y2.m67363du(this.f47006u4[i].f47016x1, str) && m66249to(this.f47006u4[i].f47013k4) == i) {
                return this.f47006u4[i].f47013k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: dy */
    private void m66239dy() {
        String strM65202x1 = this.f47010x1.m65202x1();
        int i = this.f47011x6;
        if (i != 1) {
            if (i == 2) {
                this.f46993dy[this.f46990c5].f47020h4 = strM65202x1;
                return;
            } else {
                if (i != 3) {
                    return;
                }
                m66240h4(this.f47002ne, strM65202x1);
                m66244k4(this.f47002ne, strM65202x1, true);
                return;
            }
        }
        String strM65066ar = C13850af.m65066ar(strM65202x1);
        if ("default".equals(strM65066ar)) {
            this.f46993dy[this.f46990c5].f47018du = 1;
        } else {
            if (!"preserve".equals(strM65066ar)) {
                throw new ArgumentException(C13968ri.m65819k4("'{0}' is an invalid xml:space value.", strM65066ar));
            }
            this.f46993dy[this.f46990c5].f47018du = 2;
        }
    }

    /* JADX INFO: renamed from: jd */
    private int m66242jd(String str) {
        if (!this.f47003qq) {
            for (int i = this.f47008uz; i > this.f46993dy[this.f46990c5].f47023m9; i--) {
                if (C14113y2.m67363du(this.f47006u4[i].f47013k4, str)) {
                    return i;
                }
            }
            return -1;
        }
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f47009wl.tryGetValue(str, numArr);
        int iIntValue = numArr[0].intValue();
        if (!zTryGetValue || iIntValue <= this.f46993dy[this.f46990c5].f47023m9) {
            return -1;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: kk */
    private void m66246kk() {
        if (this.f46996ix) {
            m66256yj();
        }
        while (this.f46990c5 > 0) {
            mo21898jd();
        }
    }

    /* JADX INFO: renamed from: m9 */
    private String m66248m9() {
        x1[] x1VarArr = this.f46993dy;
        int i = this.f46990c5;
        x1 x1Var = x1VarArr[i];
        int i2 = x1Var.f47019dy + 1;
        x1Var.f47019dy = i2;
        return C14113y2.m67408k4("d", C14057f9.m66588k4(i, "d", C11697x1.m55250kk()), ContextChain.TAG_PRODUCT, C14057f9.m66588k4(i2, "d", C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: to */
    private int m66249to(String str) {
        if (this.f47003qq) {
            Integer[] numArr = {0};
            boolean zTryGetValue = this.f47009wl.tryGetValue(str, numArr);
            int iIntValue = numArr[0].intValue();
            if (zTryGetValue) {
                return iIntValue;
            }
            return -1;
        }
        for (int i = this.f47008uz; i >= 0; i--) {
            if (C14113y2.m67363du(this.f47006u4[i].f47013k4, str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: up */
    private void m66253up() {
        if (this.f46990c5 == this.f46993dy.length - 1) {
            x1[] x1VarArr = (x1[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) x1.class), this.f46993dy.length + 10));
            if (this.f46990c5 > 0) {
                AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) this.f46993dy), AbstractC14092to.m67208k4((Object) x1VarArr), this.f46990c5 + 1);
            }
            this.f46993dy = x1VarArr;
        }
        int i = this.f46990c5 + 1;
        this.f46990c5 = i;
        this.f46993dy[i].m66269k4(this.f47008uz);
    }

    /* JADX INFO: renamed from: yj */
    private void m66256yj() {
        C13997v0 c13997v0 = this.f47007up;
        if (c13997v0 != null) {
            c13997v0.m66294k4();
        }
        this.f46996ix = false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        try {
            m66251to(11);
            this.f47010x1.m65206x1(cArr, i, i2);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: c5 */
    public void mo65742c5() {
        m66247kk(-1);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21893du() {
        try {
            m66246kk();
        } catch (RuntimeException unused) {
        } finally {
            this.f46991ck = 9;
            this.f46998k4.mo13309to();
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: fa */
    public int mo65743fa() {
        switch (this.f46991ck) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
            case 6:
                return 3;
            case 5:
            case 7:
                return 4;
            case 8:
            default:
                return 6;
            case 9:
                return 5;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21896h4() {
        this.f46998k4.mo13308kk();
    }

    /* JADX INFO: renamed from: k4 */
    public String mo12952k4(String str) {
        if (str == null || str.length() == 0) {
            throw new ArgumentException(C13968ri.m65818k4("The empty string '' is not a valid name."));
        }
        String strM66236ck = m66236ck(str);
        return (strM66236ck == null && C14113y2.m67363du(str, this.f46993dy[this.f46990c5].f47022kk)) ? C14113y2.f47374k4 : strM66236ck;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        try {
            m66251to(8);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    /* JADX INFO: renamed from: du */
    private void m66237du(int i) {
        String str = this.f47006u4[i].f47013k4;
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f47009wl.tryGetValue(str, numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            this.f47006u4[i].f47015to = iIntValue;
        }
        this.f47009wl.set_Item(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: to */
    private void m66250to() {
        if (this.f47011x6 != 0) {
            m66239dy();
        }
        this.f47010x1.m65195k4();
        this.f46998k4.mo13302k4(this.f47000ks);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: ck */
    public void mo21892ck() {
        m66252to(true);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        try {
            m66251to(11);
            this.f47010x1.m65205x1(str);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        if (str != null) {
            try {
                if (C14113y2.m67367h4(str, "--", (short) 4) >= 0 || (str.length() != 0 && str.charAt(str.length() - 1) == '-')) {
                    throw new ArgumentException(C13968ri.m65818k4("An XML comment cannot contain '--', and '-' cannot be the last character."));
                }
            } catch (RuntimeException e) {
                this.f46991ck = 8;
                throw e;
            }
        }
        m66251to(2);
        this.f46998k4.mo13304k4("<!--");
        if (str != null) {
            this.f47010x1.m65205x1(str);
        }
        this.f46998k4.mo13304k4("-->");
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: jd */
    public void mo21898jd() {
        m66252to(false);
    }

    /* JADX INFO: renamed from: k4 */
    public void m66257k4() {
        try {
            m66246kk();
            int i = this.f46991ck;
            if (i != 7) {
                if (i != 9) {
                    throw new ArgumentException(C13968ri.m65818k4("Document does not have a root element."));
                }
                throw new ArgumentException(C13968ri.m65818k4("The Writer is closed or in error state."));
            }
            this.f46997jd = f46988v4;
            this.f46991ck = 0;
            this.f46994fa = 13;
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m66259kk(char c) {
        if (c != '\"' && c != '\'') {
            throw new ArgumentException(C13968ri.m65818k4("Invalid XML attribute quote character. Valid attribute quote characters are ' and \"."));
        }
        this.f47012yj = c;
        this.f47010x1.m65196k4(c);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        if (str == null) {
            try {
                str = C14113y2.f47374k4;
            } catch (RuntimeException e) {
                this.f46991ck = 8;
                throw e;
            }
        }
        if (!this.f46989ar.m66334k4(str)) {
            throw new ArgumentException(C13968ri.m65818k4("Only white space characters should be used."));
        }
        m66251to(12);
        this.f47010x1.m65198k4(str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m66261x1(char c) {
        this.f47001m9 = c;
    }

    /* JADX INFO: renamed from: h4 */
    private void m66240h4(String str, String str2) {
        if (str == null || str.length() != 3) {
            return;
        }
        if (str.charAt(0) == 'x' || str.charAt(0) == 'X') {
            if (str.charAt(1) == 'm' || str.charAt(1) == 'M') {
                if ((str.charAt(2) == 'l' || str.charAt(2) == 'L') && !"http://www.w3.org/XML/1998/namespace".equals(str2)) {
                    throw new ArgumentException(C13968ri.m65818k4("Prefixes beginning with \"xml\" (regardless of whether the characters are uppercase, lowercase, or some combination thereof) are reserved for use by XML."));
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m66247kk(int i) {
        try {
            if (this.f46991ck != 0) {
                throw new InvalidOperationException(C13968ri.m65818k4("WriteStartDocument needs to be the first call."));
            }
            this.f46997jd = f46986lr;
            this.f46991ck = 1;
            C6765kp c6765kp = new C6765kp(128);
            c6765kp.m26792k4(C14113y2.m67407k4("version=", Character.valueOf(this.f47012yj), "1.0", Character.valueOf(this.f47012yj)));
            if (this.f46999kk != null) {
                c6765kp.m26792k4(" encoding=");
                c6765kp.m26780k4(this.f47012yj);
                c6765kp.m26792k4(this.f46999kk.mo26657jd());
                c6765kp.m26780k4(this.f47012yj);
            }
            if (i >= 0) {
                c6765kp.m26792k4(" standalone=");
                c6765kp.m26780k4(this.f47012yj);
                c6765kp.m26792k4(i == 0 ? TranslateLanguage.NORWEGIAN : "yes");
                c6765kp.m26780k4(this.f47012yj);
            }
            m66254x1("xml", c6765kp.toString());
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m66251to(int i) {
        x1 x1Var;
        int i2 = this.f46991ck;
        if (i2 == 9) {
            throw new InvalidOperationException(C13968ri.m65818k4("The Writer is closed."));
        }
        if (i2 == 8) {
            throw new InvalidOperationException(C13968ri.m65819k4("Token {0} in state {1} would result in an invalid XML document.", f46985bv[i], f46987um[8]));
        }
        int i3 = this.f46997jd[(i * 8) + i2];
        if (i3 == 8) {
            throw new InvalidOperationException(C13968ri.m65819k4("Token {0} in state {1} would result in an invalid XML document.", f46985bv[i], f46987um[this.f46991ck]));
        }
        switch (i) {
            case 0:
            case 2:
            case 3:
            case 4:
                if (i2 != 4) {
                    if (i2 == 3) {
                    }
                    if (i != 3) {
                        x1Var = this.f46993dy[this.f46990c5];
                        x1Var.f47017c5 = true;
                        this.f46991ck = i3;
                        this.f46994fa = i;
                        return;
                    }
                    if (this.f46992du && this.f46991ck != 0) {
                        m66241h4(false);
                    }
                    this.f46991ck = i3;
                    this.f46994fa = i;
                    return;
                }
                m66250to();
                m66238du(false);
                if (i != 3) {
                }
                break;
            case 1:
                if (this.f46992du && i2 != 0) {
                }
                this.f46991ck = i3;
                this.f46994fa = i;
                return;
            case 5:
            case 6:
                if (this.f46996ix) {
                    m66256yj();
                }
                if (this.f46991ck == 4) {
                    m66250to();
                }
                if (this.f46991ck == 5) {
                    i = 6;
                } else {
                    m66238du(i == 5);
                }
                if (f46986lr == this.f46997jd && this.f46990c5 == 1) {
                    i3 = 7;
                }
                this.f46991ck = i3;
                this.f46994fa = i;
                return;
            case 7:
                if (this.f46996ix) {
                    m66256yj();
                }
                int i4 = this.f46991ck;
                if (i4 != 4) {
                    if (i4 == 3) {
                    }
                    this.f46991ck = i3;
                    this.f46994fa = i;
                    return;
                }
                m66250to();
                this.f46998k4.mo13302k4(ControlChar.SPACE_CHAR);
                this.f46991ck = i3;
                this.f46994fa = i;
                return;
            case 8:
                if (this.f46996ix) {
                    m66256yj();
                }
                m66250to();
                this.f46991ck = i3;
                this.f46994fa = i;
                return;
            case 9:
            case 10:
            case 11:
            case 12:
                if (i != 10 && this.f46996ix) {
                    m66256yj();
                }
                if (this.f46991ck == 3 && this.f46994fa != 9) {
                    m66238du(false);
                }
                if (i3 == 5) {
                    x1Var = this.f46993dy[this.f46990c5];
                    x1Var.f47017c5 = true;
                }
                this.f46991ck = i3;
                this.f46994fa = i;
                return;
            default:
                throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        try {
            m66251to(3);
            if (str != null && C14113y2.m67367h4(str, "]]>", (short) 4) >= 0) {
                throw new ArgumentException(C13968ri.m65818k4("Cannot have ']]>' inside an XML CDATA block."));
            }
            this.f46998k4.mo13304k4("<![CDATA[");
            if (str != null) {
                this.f47010x1.m65205x1(str);
            }
            this.f46998k4.mo13304k4("]]>");
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        try {
            m66251to(9);
            this.f47010x1.m65203x1(c);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m66262x1(int i) {
        if (i < 0) {
            throw new ArgumentException(C13968ri.m65818k4("Indentation value must be greater than 0."));
        }
        this.f46995h4 = i;
    }

    /* JADX INFO: renamed from: du */
    private void m66238du(boolean z) {
        x1[] x1VarArr;
        int i;
        x1 x1Var;
        this.f47010x1.m65199k4(false);
        int i2 = this.f47008uz;
        while (true) {
            x1VarArr = this.f46993dy;
            i = this.f46990c5;
            x1Var = x1VarArr[i];
            if (i2 <= x1Var.f47023m9) {
                break;
            }
            if (!this.f47006u4[i2].f47014kk) {
                this.f46998k4.mo13304k4(" xmlns");
                this.f46998k4.mo13302k4(':');
                this.f46998k4.mo13304k4(this.f47006u4[i2].f47013k4);
                this.f46998k4.mo13302k4('=');
                this.f46998k4.mo13302k4(this.f47012yj);
                this.f47010x1.m65198k4(this.f47006u4[i2].f47016x1);
                this.f46998k4.mo13302k4(this.f47012yj);
            }
            i2--;
        }
        if (!C14113y2.m67363du(x1Var.f47022kk, x1VarArr[i - 1].f47022kk) && this.f46993dy[this.f46990c5].f47024to == 2) {
            this.f46998k4.mo13304k4(" xmlns");
            this.f46998k4.mo13302k4('=');
            this.f46998k4.mo13302k4(this.f47012yj);
            this.f47010x1.m65198k4(this.f46993dy[this.f46990c5].f47022kk);
            this.f46998k4.mo13302k4(this.f47012yj);
            this.f46993dy[this.f46990c5].f47024to = 3;
        }
        this.f47010x1.m65195k4();
        if (z) {
            this.f46998k4.mo13304k4(" /");
        }
        this.f46998k4.mo13302k4('>');
    }

    /* JADX INFO: renamed from: h4 */
    private void m66241h4(boolean z) {
        int i = this.f46990c5;
        if (i == 0) {
            this.f46998k4.mo13314Z_();
            return;
        }
        if (this.f46993dy[i].f47017c5) {
            return;
        }
        this.f46998k4.mo13314Z_();
        for (int i2 = (z ? this.f46990c5 - 1 : this.f46990c5) * this.f46995h4; i2 > 0; i2--) {
            this.f46998k4.mo13302k4(this.f47001m9);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        try {
            m66251to(9);
            this.f47010x1.m65204x1(c, c2);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        try {
            m66245k4(str, false);
            m66251to(9);
            this.f47010x1.m65201kk(str);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        try {
            m66251to(7);
            this.f47011x6 = 0;
            if (this.f47004rv) {
                String str4 = null;
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if ("http://www.w3.org/2000/xmlns/".equals(str3) && str == null && !"xmlns".equals(str2)) {
                    str = "xmlns";
                }
                if ("xml".equals(str)) {
                    if (CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL.equals(str2)) {
                        this.f47011x6 = 2;
                    } else if ("space".equals(str2)) {
                        this.f47011x6 = 1;
                    }
                } else if ("xmlns".equals(str)) {
                    if (!"http://www.w3.org/2000/xmlns/".equals(str3) && str3 != null) {
                        throw new ArgumentException(C13968ri.m65818k4("The 'xmlns' attribute is bound to the reserved namespace 'http://www.w3.org/2000/xmlns/'."));
                    }
                    if (str2 == null || str2.length() == 0) {
                        this.f47002ne = null;
                        str2 = str;
                    } else {
                        this.f47002ne = str2;
                        str4 = str;
                    }
                    this.f47011x6 = 3;
                    str = str4;
                } else if (str == null && "xmlns".equals(str2)) {
                    if (!"http://www.w3.org/2000/xmlns/".equals(str3) && str3 != null) {
                        throw new ArgumentException(C13968ri.m65818k4("The 'xmlns' attribute is bound to the reserved namespace 'http://www.w3.org/2000/xmlns/'."));
                    }
                    this.f47011x6 = 3;
                    this.f47002ne = null;
                } else if (str3 == null) {
                    if (str != null && m66249to(str) == -1) {
                        throw new ArgumentException(C13968ri.m65818k4("An undefined prefix is in use."));
                    }
                } else if (str3.length() == 0) {
                    str = C14113y2.f47374k4;
                } else {
                    m66240h4(str, str3);
                    if (str == null || m66242jd(str) == -1) {
                        str4 = str;
                    }
                    str = m66236ck(str3);
                    if (str == null || (str4 != null && !C14113y2.m67363du(str4, str))) {
                        str = str4 == null ? m66248m9() : str4;
                        m66244k4(str, str3, false);
                    }
                }
                if (str != null && str.length() != 0) {
                    this.f46998k4.mo13304k4(str);
                    this.f46998k4.mo13302k4(':');
                }
            } else {
                if ((str3 != null && str3.length() != 0) || (str != null && str.length() != 0)) {
                    throw new ArgumentException(C13968ri.m65818k4("Cannot set the namespace if Namespaces is 'false'."));
                }
                if ("xml:lang".equals(str2)) {
                    this.f47011x6 = 2;
                } else if ("xml:space".equals(str2)) {
                    this.f47011x6 = 1;
                }
            }
            this.f47010x1.m65199k4(this.f47011x6 != 0);
            this.f46998k4.mo13304k4(str2);
            this.f46998k4.mo13302k4('=');
            char c = this.f47000ks;
            char c2 = this.f47012yj;
            if (c != c2) {
                this.f47000ks = c2;
                this.f47010x1.m65196k4(c2);
            }
            this.f46998k4.mo13302k4(this.f47000ks);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    m66251to(9);
                    this.f47010x1.m65198k4(str);
                }
            } catch (RuntimeException e) {
                this.f46991ck = 8;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m66252to(boolean z) {
        int i;
        String str;
        try {
            if (this.f46990c5 <= 0) {
                throw new InvalidOperationException(C13968ri.m65818k4("There was no XML start tag open."));
            }
            m66251to(z ? 6 : 5);
            if (this.f46994fa == 6) {
                if (this.f46992du) {
                    m66241h4(true);
                }
                this.f46998k4.mo13302k4('<');
                this.f46998k4.mo13302k4(IOUtils.DIR_SEPARATOR_UNIX);
                if (this.f47004rv && (str = this.f46993dy[this.f46990c5].f47025x1) != null) {
                    this.f46998k4.mo13304k4(str);
                    this.f46998k4.mo13302k4(':');
                }
                this.f46998k4.mo13304k4(this.f46993dy[this.f46990c5].f47021k4);
                this.f46998k4.mo13302k4('>');
            }
            int i2 = this.f46993dy[this.f46990c5].f47023m9;
            if (this.f47003qq && i2 < (i = this.f47008uz)) {
                m66243k4(i2 + 1, i);
            }
            this.f47008uz = i2;
            this.f46990c5--;
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m66254x1(String str, String str2) {
        this.f46998k4.mo13304k4("<?");
        m66245k4(str, false);
        this.f46998k4.mo13304k4(str);
        this.f46998k4.mo13302k4(ControlChar.SPACE_CHAR);
        if (str2 != null) {
            this.f47010x1.m65205x1(str2);
        }
        this.f46998k4.mo13304k4("?>");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m66258k4(int i) {
        this.f47005to = i;
        this.f46992du = i == 1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m66260kk(boolean z) {
        if (this.f46991ck != 0) {
            throw new InvalidOperationException(C13968ri.m65818k4("NotInWriteState."));
        }
        this.f47004rv = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m66243k4(int i, int i2) {
        while (i2 >= i) {
            k4 k4Var = this.f47006u4[i2];
            int i3 = k4Var.f47015to;
            if (i3 == -1) {
                this.f47009wl.removeItemByKey(k4Var.f47013k4);
            } else {
                this.f47009wl.set_Item(k4Var.f47013k4, Integer.valueOf(i3));
            }
            i2--;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m66255x1(String str, String str2, boolean z) {
        int i = this.f47008uz + 1;
        this.f47008uz = i;
        if (i == this.f47006u4.length) {
            k4[] k4VarArr = (k4[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) k4.class), i * 2));
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) this.f47006u4), AbstractC14092to.m67208k4((Object) k4VarArr), i);
            this.f47006u4 = k4VarArr;
        }
        this.f47006u4[i].m66266k4(str, str2, z);
        if (this.f47003qq) {
            m66237du(i);
            return;
        }
        if (i == 16) {
            this.f47009wl = new Dictionary<>(new C13910he());
            for (int i2 = 0; i2 <= i; i2++) {
                m66237du(i2);
            }
            this.f47003qq = true;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        if (str2 != null) {
            try {
                if (C14113y2.m67367h4(str2, "?>", (short) 4) >= 0) {
                    throw new ArgumentException(C13968ri.m65818k4("Cannot have '?>' inside an XML processing instruction."));
                }
            } catch (RuntimeException e) {
                this.f46991ck = 8;
                throw e;
            }
        }
        if (C14113y2.m67360du(str, "xml", (short) 5) == 0 && this.f46997jd == f46986lr) {
            throw new ArgumentException(C13968ri.m65818k4("Cannot write XML declaration. WriteStartDocument method has already written it."));
        }
        m66251to(0);
        m66254x1(str, str2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo65747x1(boolean z) {
        m66247kk(z ? 1 : 0);
    }

    public C13991ub(AbstractC3124b3 abstractC3124b3) {
        this();
        this.f46998k4 = abstractC3124b3;
        this.f46999kk = abstractC3124b3.mo13310x1();
        C13861bm c13861bm = new C13861bm(abstractC3124b3);
        this.f47010x1 = c13861bm;
        c13861bm.m65196k4(this.f47012yj);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        try {
            m66251to(4);
            m66253up();
            this.f46998k4.mo13302k4('<');
            if (this.f47004rv) {
                x1[] x1VarArr = this.f46993dy;
                int i = this.f46990c5;
                x1 x1Var = x1VarArr[i];
                x1Var.f47022kk = x1VarArr[i - 1].f47022kk;
                if (x1VarArr[i - 1].f47024to != 0) {
                    x1Var.f47024to = 1;
                }
                x1Var.f47017c5 = x1VarArr[i - 1].f47017c5;
                if (str3 == null) {
                    if (str != null && str.length() != 0 && m66249to(str) == -1) {
                        throw new ArgumentException(C13968ri.m65818k4("An undefined prefix is in use."));
                    }
                } else if (str == null) {
                    String strM66236ck = m66236ck(str3);
                    if (strM66236ck != null) {
                        str = strM66236ck;
                    } else {
                        m66244k4((String) null, str3, false);
                    }
                } else if (str.length() == 0) {
                    m66244k4((String) null, str3, false);
                } else {
                    if (str3.length() == 0) {
                        str = null;
                    }
                    m66240h4(str, str3);
                    m66244k4(str, str3, false);
                }
                this.f46993dy[this.f46990c5].f47025x1 = null;
                if (str != null && str.length() != 0) {
                    this.f46993dy[this.f46990c5].f47025x1 = str;
                    this.f46998k4.mo13304k4(str);
                    this.f46998k4.mo13302k4(':');
                }
            } else if ((str3 != null && str3.length() != 0) || (str != null && str.length() != 0)) {
                throw new ArgumentException(C13968ri.m65818k4("Cannot set the namespace if Namespaces is 'false'."));
            }
            this.f46993dy[this.f46990c5].f47021k4 = str2;
            this.f46998k4.mo13304k4(str2);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo65659x1(byte[] bArr, int i, int i2) {
        try {
            m66251to(9);
            C13982to.m65918k4(bArr, i, i2, this);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    public C13991ub(AbstractC3150x6 abstractC3150x6, AbstractC6747ar abstractC6747ar) {
        this();
        this.f46999kk = abstractC6747ar;
        if (abstractC6747ar != null) {
            this.f46998k4 = new C3123ar(abstractC3150x6, abstractC6747ar);
        } else {
            this.f46998k4 = new C3123ar(abstractC3150x6);
        }
        C13861bm c13861bm = new C13861bm(this.f46998k4);
        this.f47010x1 = c13861bm;
        c13861bm.m65196k4(this.f47012yj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d A[Catch: RuntimeException -> 0x0058, TryCatch #0 {RuntimeException -> 0x0058, blocks: (B:3:0x0001, B:5:0x0016, B:6:0x0054, B:12:0x007d, B:13:0x0090, B:10:0x005c), top: B:17:0x0001 }] */
    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        AbstractC3124b3 abstractC3124b3;
        char c;
        try {
            m66245k4(str, false);
            m66251to(1);
            this.f46998k4.mo13304k4("<!DOCTYPE ");
            this.f46998k4.mo13304k4(str);
            if (str2 == null) {
                if (str3 != null) {
                    this.f46998k4.mo13304k4(C14113y2.m67407k4(" SYSTEM ", Character.valueOf(this.f47012yj)));
                    this.f46998k4.mo13304k4(str3);
                    abstractC3124b3 = this.f46998k4;
                    c = this.f47012yj;
                }
                if (str4 != null) {
                    this.f46998k4.mo13304k4("[");
                    this.f46998k4.mo13304k4(str4);
                    this.f46998k4.mo13304k4("]");
                }
                this.f46998k4.mo13302k4('>');
            }
            this.f46998k4.mo13304k4(C14113y2.m67407k4(" PUBLIC ", Character.valueOf(this.f47012yj)));
            this.f46998k4.mo13304k4(str2);
            this.f46998k4.mo13304k4(C14113y2.m67407k4(Character.valueOf(this.f47012yj), " ", Character.valueOf(this.f47012yj)));
            this.f46998k4.mo13304k4(str3);
            abstractC3124b3 = this.f46998k4;
            c = this.f47012yj;
            abstractC3124b3.mo13302k4(c);
            if (str4 != null) {
            }
            this.f46998k4.mo13302k4('>');
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    public C13991ub(String str, AbstractC6747ar abstractC6747ar) {
        this(new C3130fa(str, 2, 2, 1), abstractC6747ar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m66244k4(String str, String str2, boolean z) {
        if ("http://www.w3.org/2000/xmlns/".equals(str2)) {
            throw new ArgumentException(C13968ri.m65818k4("Cannot bind to the reserved namespace."));
        }
        if (str == null) {
            x1 x1Var = this.f46993dy[this.f46990c5];
            int i = x1Var.f47024to;
            if (i == 0 || i == 1) {
                x1Var.f47022kk = str2;
            } else if (i != 2) {
                return;
            }
            x1Var.f47024to = z ? 3 : 2;
            return;
        }
        if (str.length() != 0 && str2.length() == 0) {
            throw new ArgumentException(C13968ri.m65818k4("Cannot use a prefix with an empty namespace."));
        }
        int iM66249to = m66249to(str);
        if (iM66249to != -1 && C14113y2.m67363du(this.f47006u4[iM66249to].f47016x1, str2)) {
            if (z) {
                this.f47006u4[iM66249to].f47014kk = true;
            }
        } else {
            if (z && iM66249to != -1 && iM66249to > this.f46993dy[this.f46990c5].f47023m9) {
                this.f47006u4[iM66249to].f47014kk = true;
            }
            m66255x1(str, str2, z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66245k4(String str, boolean z) {
        int i;
        if (str == null || str.length() == 0) {
            throw new ArgumentException(C13968ri.m65818k4("The empty string '' is not a valid name."));
        }
        int length = str.length();
        if (this.f47004rv) {
            int iM66231x1 = C13988u1.m66231x1(str);
            int i2 = -1;
            while (iM66231x1 != length) {
                if (str.charAt(iM66231x1) == ':' && !z && i2 == -1 && iM66231x1 > 0 && (i = iM66231x1 + 1) < length) {
                    int iM66222k4 = i + C13988u1.m66222k4(str, i);
                    i2 = iM66231x1;
                    iM66231x1 = iM66222k4;
                }
            }
            return;
        }
        if (C13988u1.m66226k4(str)) {
            return;
        }
        throw new ArgumentException(C13968ri.m65819k4("Invalid name character in '{0}'.", str));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo65186k4(byte[] bArr, int i, int i2) {
        try {
            if (!this.f46996ix) {
                m66251to(10);
            }
            this.f46996ix = true;
            if (this.f47007up == null) {
                this.f47007up = new C13997v0(this.f47010x1);
            }
            this.f47007up.m66295k4(bArr, i, i2);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        try {
            m66251to(9);
            this.f47010x1.m65200k4(cArr, i, i2);
        } catch (RuntimeException e) {
            this.f46991ck = 8;
            throw e;
        }
    }
}
