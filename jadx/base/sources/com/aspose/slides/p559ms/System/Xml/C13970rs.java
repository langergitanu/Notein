package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.rs */
/* JADX INFO: loaded from: classes5.dex */
public class C13970rs extends AbstractC13912i5 implements InterfaceC13980t6 {

    /* JADX INFO: renamed from: c5 */
    private C13892em f46803c5;

    /* JADX INFO: renamed from: du */
    private boolean f46804du;

    /* JADX INFO: renamed from: dy */
    private boolean f46805dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f46806h4;

    /* JADX INFO: renamed from: k4 */
    private C13975so f46807k4;

    /* JADX INFO: renamed from: kk */
    private int f46808kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f46809m9;

    /* JADX INFO: renamed from: to */
    private int f46810to;

    /* JADX INFO: renamed from: x1 */
    private int f46811x1;

    public C13970rs(AbstractC13901ga abstractC13901ga) {
        if (abstractC13901ga == null) {
            throw new ArgumentNullException("node");
        }
        this.f46807k4 = new C13975so(abstractC13901ga);
        this.f46808kk = 0;
        this.f46810to = 0;
        this.f46804du = false;
        this.f46811x1 = 0;
        this.f46806h4 = false;
        this.f46809m9 = false;
    }

    /* JADX INFO: renamed from: g8 */
    private void m65824g8() {
        this.f46804du = true;
        this.f46810to = 3;
        this.f46811x1 = 0;
    }

    /* JADX INFO: renamed from: sv */
    private void m65826sv() {
        int[] iArr = {this.f46808kk};
        int[] iArr2 = {this.f46811x1};
        this.f46807k4.m65858k4(iArr, iArr2);
        this.f46808kk = iArr[0];
        this.f46811x1 = iArr2[0];
    }

    /* JADX INFO: renamed from: wp */
    private void m65828wp() {
        this.f46805dy = false;
        this.f46803c5.m65321k4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ar */
    public boolean mo65015ar() {
        return this.f46810to != 4 && this.f46804du;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: b3 */
    public void mo65016b3() {
        if (!m65830c5() || this.f46811x1 != 5) {
            throw new InvalidOperationException(C13968ri.m65818k4("The node is not an expandable 'EntityReference' node."));
        }
        this.f46806h4 = true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: bv */
    public void mo65208bv() {
        m65829x1(true);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m65830c5() {
        return this.f46810to == 1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ck */
    public String mo65019ck() {
        return !m65830c5() ? C14113y2.f47374k4 : this.f46807k4.m65861kk();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: du */
    public boolean mo65020du() {
        if (!m65830c5()) {
            return false;
        }
        this.f46807k4.m65870to(this.f46808kk);
        int[] iArr = {this.f46808kk};
        this.f46807k4.m65877x1(iArr);
        this.f46808kk = iArr[0];
        if (!this.f46807k4.m65850ix()) {
            iArr[0] = this.f46808kk;
            this.f46807k4.m65857k4(iArr);
            this.f46808kk = iArr[0];
            return false;
        }
        this.f46808kk--;
        this.f46811x1 = this.f46807k4.m65852k4();
        if (this.f46805dy) {
            m65828wp();
        }
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: dy */
    public boolean mo65021dy() {
        if (!m65830c5()) {
            return false;
        }
        int[] iArr = {this.f46808kk};
        boolean[] zArr = {this.f46806h4};
        int[] iArr2 = {this.f46811x1};
        boolean zM65860k4 = this.f46807k4.m65860k4(iArr, zArr, iArr2);
        this.f46808kk = iArr[0];
        this.f46806h4 = zArr[0];
        this.f46811x1 = iArr2[0];
        if (!zM65860k4) {
            return false;
        }
        this.f46805dy = false;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: fa */
    public String mo65023fa() {
        return !m65830c5() ? C14113y2.f47374k4 : this.f46807k4.m65869to();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: h4 */
    public boolean mo65026h4() {
        return m65829x1(false);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ix */
    public boolean mo65027ix() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: jd */
    public int mo65028jd() {
        if (m65830c5()) {
            return this.f46811x1;
        }
        return 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public final IGenericDictionary<String, String> mo52690k4(int i) {
        return this.f46807k4.m65847h4(i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public String mo65034kk(int i) {
        if (m65830c5()) {
            return this.f46807k4.m65862kk(i);
        }
        throw new ArgumentOutOfRangeException("attributeIndex");
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ks */
    public boolean mo65038ks() {
        if (m65830c5()) {
            return this.f46807k4.m65866m9();
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: lr */
    public boolean mo65209lr() {
        return mo65041qq() > 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: m9 */
    public int mo65039m9() {
        return this.f46810to;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: ne */
    public String mo65040ne() {
        return this.f46807k4.m65840c5();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: qq */
    public int mo65041qq() {
        if (!m65830c5() || this.f46811x1 == 15) {
            return 0;
        }
        return this.f46807k4.m65865ks();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: rv */
    public String mo65042rv() {
        return !m65830c5() ? C14113y2.f47374k4 : this.f46807k4.m65845dy();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: to */
    public String mo65046to(String str) {
        if (m65830c5()) {
            return this.f46807k4.m65863kk(str);
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: u4 */
    public boolean mo65048u4() {
        if (m65830c5()) {
            return this.f46807k4.m65841ck();
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: um */
    public void mo65049um() {
        this.f46810to = 4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: up */
    public String mo65050up() {
        return !m65830c5() ? C14113y2.f47374k4 : this.f46807k4.m65875x1();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: uz */
    public int mo65051uz() {
        if (m65830c5()) {
            return this.f46807k4.m65851jd();
        }
        return 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: v4 */
    public String mo65052v4() {
        if (mo65028jd() == 5 && this.f46806h4 && !mo65026h4()) {
            throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
        }
        return super.mo65052v4();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: wl */
    public InterfaceC13298y4 mo65210wl() {
        if (m65830c5()) {
            return this.f46807k4.m65873up();
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: wy */
    public InterfaceC13899g8 mo65054wy() {
        return this.f46807k4.m65872u4().getDtdSchemaInfo();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: x1 */
    public final String mo52700x1(String str) {
        return this.f46807k4.m65849h4(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x6 */
    public int mo65058x6() {
        return this.f46808kk;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: yd */
    public AbstractC13883dt mo65059yd() {
        return this.f46807k4.m65879yj();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: yj */
    public String mo65060yj() {
        return !m65830c5() ? C14113y2.f47374k4 : this.f46807k4.m65848h4();
    }

    /* JADX INFO: renamed from: du */
    private boolean m65823du(boolean z) {
        int iM65852k4;
        if (this.f46810to == 2) {
            return false;
        }
        if (!this.f46809m9 && this.f46808kk == 0) {
            return m65827to(z);
        }
        if (this.f46807k4.m65867ne()) {
            iM65852k4 = this.f46807k4.m65852k4();
        } else {
            if (this.f46808kk == 0) {
                return m65827to(z);
            }
            if (!this.f46807k4.m65868rv()) {
                return false;
            }
            if (this.f46807k4.m65852k4() == 1) {
                this.f46808kk--;
                iM65852k4 = 15;
            } else {
                if (this.f46807k4.m65852k4() != 5) {
                    return true;
                }
                this.f46808kk--;
                iM65852k4 = 16;
            }
        }
        this.f46811x1 = iM65852k4;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        if (!m65830c5()) {
            return null;
        }
        String strM65842du = this.f46807k4.m65842du(str);
        if (strM65842du == null || strM65842du.length() != 0) {
            return strM65842du;
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65035kk() {
        if (!m65830c5()) {
            return false;
        }
        int[] iArr = {this.f46808kk};
        int[] iArr2 = {this.f46811x1};
        this.f46807k4.m65858k4(iArr, iArr2);
        this.f46808kk = iArr[0];
        this.f46811x1 = iArr2[0];
        if (mo65041qq() <= 0) {
            iArr[0] = this.f46808kk;
            this.f46807k4.m65857k4(iArr);
            this.f46808kk = iArr[0];
            return false;
        }
        this.f46807k4.m65843du(0);
        this.f46808kk++;
        this.f46811x1 = this.f46807k4.m65852k4();
        if (this.f46805dy) {
            m65828wp();
        }
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: to */
    public boolean mo65047to() {
        if (m65830c5() && this.f46811x1 != 15) {
            this.f46807k4.m65870to(this.f46808kk);
            int[] iArr = {this.f46808kk};
            this.f46807k4.m65877x1(iArr);
            int i = iArr[0];
            this.f46808kk = i;
            iArr[0] = i;
            boolean zM65864kk = this.f46807k4.m65864kk(iArr);
            int i2 = iArr[0];
            this.f46808kk = i2;
            if (zM65864kk) {
                this.f46811x1 = this.f46807k4.m65852k4();
                if (this.f46805dy) {
                    m65828wp();
                }
                return true;
            }
            iArr[0] = i2;
            this.f46807k4.m65857k4(iArr);
            this.f46808kk = iArr[0];
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x1 */
    public void mo65055x1(int i) {
        if (!m65830c5()) {
            throw new ArgumentOutOfRangeException("attributeIndex");
        }
        int[] iArr = {this.f46808kk};
        int[] iArr2 = {this.f46811x1};
        this.f46807k4.m65858k4(iArr, iArr2);
        this.f46808kk = iArr[0];
        this.f46811x1 = iArr2[0];
        try {
            if (mo65041qq() <= 0) {
                throw new ArgumentOutOfRangeException("attributeIndex");
            }
            this.f46807k4.m65843du(i);
            if (this.f46805dy) {
                m65828wp();
            }
            this.f46808kk++;
            this.f46811x1 = this.f46807k4.m65852k4();
        } catch (RuntimeException e) {
            iArr[0] = this.f46808kk;
            this.f46807k4.m65857k4(iArr);
            this.f46808kk = iArr[0];
            throw e;
        }
    }

    /* JADX INFO: renamed from: to */
    private boolean m65827to(boolean z) {
        if (z || this.f46811x1 == 15 || this.f46807k4.m65852k4() != 1 || this.f46807k4.m65841ck()) {
            m65824g8();
            return false;
        }
        this.f46811x1 = 15;
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65036kk(String str) {
        if (!m65830c5()) {
            return false;
        }
        int[] iArr = {this.f46808kk};
        int[] iArr2 = {this.f46811x1};
        this.f46807k4.m65858k4(iArr, iArr2);
        this.f46808kk = iArr[0];
        this.f46811x1 = iArr2[0];
        if (!this.f46807k4.m65871to(str)) {
            iArr[0] = this.f46808kk;
            this.f46807k4.m65857k4(iArr);
            this.f46808kk = iArr[0];
            return false;
        }
        this.f46808kk++;
        this.f46811x1 = this.f46807k4.m65852k4();
        if (this.f46805dy) {
            m65828wp();
        }
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x1 */
    public boolean mo65057x1() {
        if (m65830c5()) {
            return this.f46807k4.m65846fa();
        }
        return false;
    }

    /* JADX INFO: renamed from: kk */
    private boolean m65825kk(boolean z) {
        int i;
        int i2 = this.f46810to;
        if (i2 != 1 && i2 != 0) {
            this.f46811x1 = 0;
            return false;
        }
        int iM65852k4 = this.f46807k4.m65852k4();
        if (z || (i = this.f46811x1) == 15 || i == 16 || !(iM65852k4 == 1 || ((iM65852k4 == 5 && this.f46806h4) || ((this.f46807k4.m65852k4() == 9 || this.f46807k4.m65852k4() == 11) && this.f46810to == 0)))) {
            if (this.f46807k4.m65852k4() != 5 || !this.f46806h4) {
                return m65823du(z);
            }
            if (this.f46807k4.m65878x6()) {
                this.f46811x1 = this.f46807k4.m65852k4();
                this.f46808kk++;
            } else {
                this.f46811x1 = 16;
            }
            this.f46806h4 = false;
            return true;
        }
        if (this.f46807k4.m65878x6()) {
            this.f46811x1 = this.f46807k4.m65852k4();
            this.f46808kk++;
            if (this.f46806h4) {
                this.f46806h4 = false;
            }
            return true;
        }
        if (this.f46807k4.m65852k4() == 1 && !this.f46807k4.m65841ck()) {
            this.f46811x1 = 15;
            return true;
        }
        if (this.f46807k4.m65852k4() != 5 || !this.f46806h4) {
            return m65823du(z);
        }
        this.f46806h4 = false;
        this.f46811x1 = 16;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m65829x1(boolean z) {
        if (this.f46804du) {
            return false;
        }
        if (this.f46810to == 0) {
            if (this.f46807k4.m65852k4() == 9 || this.f46807k4.m65852k4() == 11) {
                this.f46809m9 = true;
                if (!m65825kk(z)) {
                    this.f46810to = 2;
                    return false;
                }
            }
            m65826sv();
            this.f46810to = 1;
            this.f46811x1 = this.f46807k4.m65852k4();
            this.f46808kk = 0;
            return true;
        }
        if (this.f46805dy) {
            m65828wp();
        }
        if (this.f46807k4.m65844du()) {
            return false;
        }
        m65826sv();
        if (m65825kk(z)) {
            return true;
        }
        int i = this.f46810to;
        if (i == 0 || i == 1) {
            this.f46810to = 2;
        }
        if (this.f46810to == 3) {
            this.f46811x1 = 0;
        }
        return false;
    }
}
