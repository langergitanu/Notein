package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p267m6.C6320du;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.n3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13942n3 extends AbstractC13965r5 {

    /* JADX INFO: renamed from: du */
    private C6320du f46656du = new C6320du();

    /* JADX INFO: renamed from: h4 */
    private String f46657h4;

    /* JADX INFO: renamed from: k4 */
    private List<k4[]> f46658k4;

    /* JADX INFO: renamed from: kk */
    private int f46659kk;

    /* JADX INFO: renamed from: to */
    private boolean f46660to;

    /* JADX INFO: renamed from: x1 */
    private k4[] f46661x1;

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.n3$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: du */
        private Object f46662du;

        /* JADX INFO: renamed from: k4 */
        private int f46663k4;

        /* JADX INFO: renamed from: kk */
        private String f46664kk;

        /* JADX INFO: renamed from: to */
        private String f46665to;

        /* JADX INFO: renamed from: x1 */
        private String f46666x1;

        public Object clone() {
            return Clone();
        }

        /* JADX INFO: renamed from: du */
        public final Object m65661du() {
            return this.f46662du;
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof k4) {
                return m65660x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: h4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m65663k4() {
            return this.f46663k4;
        }

        /* JADX INFO: renamed from: kk */
        public final String m65671kk() {
            return this.f46664kk;
        }

        /* JADX INFO: renamed from: to */
        public final String m65672to() {
            return this.f46665to;
        }

        /* JADX INFO: renamed from: x1 */
        public final String m65673x1() {
            return this.f46666x1;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m65660x1(k4 k4Var) {
            return k4Var.f46663k4 == this.f46663k4 && C14067j2.m66728k4(k4Var.f46666x1, this.f46666x1) && C14067j2.m66728k4(k4Var.f46664kk, this.f46664kk) && C14067j2.m66728k4(k4Var.f46665to, this.f46665to) && C14067j2.m66728k4(k4Var.f46662du, this.f46662du);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65664k4(int i) {
            this.f46663k4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65665k4(int i, Object obj) {
            this.f46663k4 = i;
            this.f46662du = obj;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65666k4(int i, String str) {
            this.f46663k4 = i;
            this.f46666x1 = str;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65667k4(int i, String str, String str2) {
            this.f46663k4 = i;
            this.f46666x1 = str;
            this.f46664kk = str2;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65668k4(int i, String str, String str2, String str3) {
            this.f46663k4 = i;
            this.f46666x1 = str;
            this.f46664kk = str2;
            this.f46665to = str3;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m65669k4(int i, String str, String str2, String str3, Object obj) {
            this.f46663k4 = i;
            this.f46666x1 = str;
            this.f46664kk = str2;
            this.f46665to = str3;
            this.f46662du = obj;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f46663k4 = this.f46663k4;
            k4Var.f46666x1 = this.f46666x1;
            k4Var.f46664kk = this.f46664kk;
            k4Var.f46665to = this.f46665to;
            k4Var.f46662du = this.f46662du;
        }
    }

    static {
        C7019kk.m27454k4(k4.class, (InterfaceC7014c5) new C14036zd());
    }

    public C13942n3(String str, boolean z) {
        this.f46657h4 = str;
        this.f46660to = z;
    }

    /* JADX INFO: renamed from: up */
    private int m65652up() {
        if (this.f46658k4 == null) {
            this.f46658k4 = new List<>();
            k4[] k4VarArr = (k4[]) C22200OooO0o0.OooO00o(k4.class, 32);
            this.f46661x1 = k4VarArr;
            this.f46658k4.addItem(k4VarArr);
            if (this.f46656du.m25884x1() != 0) {
                this.f46661x1[0].m65666k4(9, this.f46656du.m25882kk());
                this.f46659kk++;
                this.f46656du.m25879k4();
            }
        } else if (this.f46659kk >= this.f46661x1.length) {
            k4[] k4VarArr2 = (k4[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) k4.class), this.f46659kk * 2));
            this.f46661x1 = k4VarArr2;
            this.f46658k4.addItem(k4VarArr2);
            this.f46659kk = 0;
        }
        int i = this.f46659kk;
        this.f46659kk = i + 1;
        return i;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        mo21895dy(C14113y2.m67406k4(cArr, i, i2));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: b_ */
    public void mo65654b_(boolean z) {
        if (z) {
            try {
                m65653x1(25);
            } finally {
                super.mo65654b_(z);
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: c5 */
    public void mo65655c5(String str) {
        mo21918x1(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21893du() {
        m65653x1(23);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: dy */
    public void mo65656dy() {
        m65653x1(22);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21896h4() {
        m65653x1(24);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        m65653x1(18);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        m65647k4(11, str);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m65658m9() {
        if (this.f46656du.m25884x1() == 0) {
            m65653x1(0);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        m65649k4(3, str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        m65653x1(4);
    }

    /* JADX INFO: renamed from: x1 */
    private void m65653x1(int i) {
        this.f46661x1[m65652up()].m65664k4(i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        m65647k4(5, str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        m65647k4(10, str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        m65647k4(6, str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        m65646k4(12, Character.valueOf(c));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        m65649k4(20, str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        m65647k4(8, str);
    }

    /* JADX INFO: renamed from: kk */
    private static byte[] m65651kk(byte[] bArr, int i, int i2) {
        if (i == 0 && i2 == bArr.length) {
            return bArr;
        }
        if (bArr.length - i > i2) {
            i2 = bArr.length - i;
        }
        byte[] bArr2 = new byte[i2];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i, AbstractC14092to.m67208k4((Object) bArr2), 0, i2);
        return bArr2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        m65646k4(13, new char[]{c, c2});
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        if (this.f46658k4 == null) {
            this.f46656du.m25881k4(str);
        } else {
            m65647k4(9, str);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21902k4(int i) {
        m65646k4(16, Integer.valueOf(i));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21919x1(String str, String str2) {
        m65648k4(21, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65646k4(int i, Object obj) {
        this.f46661x1[m65652up()].m65665k4(i, obj);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        m65649k4(19, str, str2, str3);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65647k4(int i, String str) {
        this.f46661x1[m65652up()].m65666k4(i, str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo65659x1(byte[] bArr, int i, int i2) {
        m65646k4(15, m65651kk(bArr, i, i2));
    }

    /* JADX INFO: renamed from: k4 */
    private void m65648k4(int i, String str, String str2) {
        this.f46661x1[m65652up()].m65667k4(i, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65649k4(int i, String str, String str2, String str3) {
        this.f46661x1[m65652up()].m65668k4(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65650k4(int i, String str, String str2, String str3, Object obj) {
        this.f46661x1[m65652up()].m65669k4(i, str, str2, str3, obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65657k4(AbstractC13958qb abstractC13958qb) {
        if (this.f46656du.m25884x1() != 0) {
            abstractC13958qb.mo21918x1(this.f46656du.m25882kk());
            return;
        }
        AbstractC13965r5 abstractC13965r5 = (AbstractC13965r5) C7019kk.m27452k4((Object) abstractC13958qb, AbstractC13965r5.class);
        for (int i = 0; i < this.f46658k4.size(); i++) {
            k4[] k4VarArr = this.f46658k4.get_Item(i);
            for (int i2 = 0; i2 < k4VarArr.length; i2++) {
                switch (k4VarArr[i2].m65663k4()) {
                    case 0:
                        return;
                    case 1:
                        abstractC13958qb.mo21908k4(k4VarArr[i2].m65673x1(), k4VarArr[i2].m65671kk(), k4VarArr[i2].m65672to(), (String) k4VarArr[i2].m65661du());
                        break;
                    case 2:
                        abstractC13958qb.mo12953k4(k4VarArr[i2].m65673x1(), k4VarArr[i2].m65671kk(), k4VarArr[i2].m65672to());
                        break;
                    case 3:
                        abstractC13958qb.mo21915to(k4VarArr[i2].m65673x1(), k4VarArr[i2].m65671kk(), k4VarArr[i2].m65672to());
                        break;
                    case 4:
                        abstractC13958qb.mo21917x1();
                        break;
                    case 5:
                        abstractC13958qb.mo21894du(k4VarArr[i2].m65673x1());
                        break;
                    case 6:
                        abstractC13958qb.mo21897h4(k4VarArr[i2].m65673x1());
                        break;
                    case 7:
                        abstractC13958qb.mo21907k4(k4VarArr[i2].m65673x1(), k4VarArr[i2].m65671kk());
                        break;
                    case 8:
                        abstractC13958qb.mo21913m9(k4VarArr[i2].m65673x1());
                        break;
                    case 9:
                        abstractC13958qb.mo21918x1(k4VarArr[i2].m65673x1());
                        break;
                    case 10:
                        abstractC13958qb.mo21895dy(k4VarArr[i2].m65673x1());
                        break;
                    case 11:
                        abstractC13958qb.mo21910kk(k4VarArr[i2].m65673x1());
                        break;
                    case 12:
                        abstractC13958qb.mo21900k4(((Character) C7019kk.m27464to(k4VarArr[i2].m65661du(), Character.TYPE)).charValue());
                        break;
                    case 13:
                        char[] cArr = (char[]) C7019kk.m27458kk(k4VarArr[i2].m65661du(), char[].class);
                        abstractC13958qb.mo21901k4(cArr[0], cArr[1]);
                        break;
                    case 14:
                        byte[] bArr = (byte[]) C7019kk.m27458kk(k4VarArr[i2].m65661du(), byte[].class);
                        abstractC13958qb.mo65186k4(bArr, 0, bArr.length);
                        break;
                    case 15:
                        byte[] bArr2 = (byte[]) C7019kk.m27458kk(k4VarArr[i2].m65661du(), byte[].class);
                        abstractC13958qb.mo65659x1(bArr2, 0, bArr2.length);
                        break;
                    case 16:
                        if (abstractC13965r5 != null) {
                            abstractC13965r5.mo21902k4(((Integer) k4VarArr[i2].m65661du()).intValue());
                        }
                        break;
                    case 17:
                        if (abstractC13965r5 != null) {
                            abstractC13965r5.mo21905k4(k4VarArr[i2].m65673x1());
                        }
                        break;
                    case 18:
                        if (abstractC13965r5 != null) {
                            abstractC13965r5.mo21899k4();
                        }
                        break;
                    case 19:
                        if (abstractC13965r5 != null) {
                            abstractC13965r5.mo21920x1(k4VarArr[i2].m65673x1(), k4VarArr[i2].m65671kk(), k4VarArr[i2].m65672to());
                        } else {
                            abstractC13958qb.mo21898jd();
                        }
                        break;
                    case 20:
                        if (abstractC13965r5 != null) {
                            abstractC13965r5.mo21911kk(k4VarArr[i2].m65673x1(), k4VarArr[i2].m65671kk(), k4VarArr[i2].m65672to());
                        } else {
                            abstractC13958qb.mo21892ck();
                        }
                        break;
                    case 21:
                        if (abstractC13965r5 != null) {
                            abstractC13965r5.mo21919x1(k4VarArr[i2].m65673x1(), k4VarArr[i2].m65671kk());
                        } else {
                            abstractC13958qb.m65809x1("xmlns", k4VarArr[i2].m65673x1(), "http://www.w3.org/2000/xmlns/", k4VarArr[i2].m65671kk());
                        }
                        break;
                    case 22:
                        if (abstractC13965r5 != null) {
                            abstractC13965r5.mo65656dy();
                        }
                        break;
                    case 23:
                        abstractC13958qb.mo21893du();
                        break;
                    case 24:
                        abstractC13958qb.mo21896h4();
                        break;
                    case 25:
                        abstractC13958qb.dispose();
                        break;
                }
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21905k4(String str) {
        m65647k4(17, str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        m65648k4(7, str, str2);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        m65649k4(2, str, str2, str3);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        m65650k4(1, str, str2, str3, str4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo65186k4(byte[] bArr, int i, int i2) {
        m65646k4(14, m65651kk(bArr, i, i2));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        mo21918x1(C14113y2.m67406k4(cArr, i, i2));
    }
}
