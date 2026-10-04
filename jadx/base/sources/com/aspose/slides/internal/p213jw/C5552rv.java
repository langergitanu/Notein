package com.aspose.slides.internal.p213jw;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p199j5.InterfaceC5192du;
import com.aspose.slides.internal.p199j5.InterfaceC5195kk;
import com.aspose.slides.internal.p199j5.InterfaceC5196to;
import com.aspose.slides.internal.p295na.C6791h4;
import com.aspose.slides.internal.p295na.C6794m9;
import com.aspose.slides.internal.p295na.C6795to;
import com.aspose.slides.internal.p295na.C6796x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12771k4;
import com.aspose.slides.internal.p517y2.InterfaceC12760ar;
import com.aspose.slides.internal.p517y2.InterfaceC12762bv;
import com.aspose.slides.internal.p517y2.InterfaceC12764ck;
import com.aspose.slides.internal.p517y2.InterfaceC12765du;
import com.aspose.slides.internal.p517y2.InterfaceC12766dy;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12772kk;
import com.aspose.slides.internal.p517y2.InterfaceC12775m9;
import com.aspose.slides.internal.p517y2.InterfaceC12776ne;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12778rv;
import com.aspose.slides.internal.p517y2.InterfaceC12783uz;
import com.aspose.slides.internal.p517y2.InterfaceC12784v4;
import com.aspose.slides.internal.p517y2.InterfaceC12787x6;
import com.aspose.slides.internal.p517y2.InterfaceC12789yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.rv */
/* JADX INFO: loaded from: classes.dex */
public class C5552rv extends AbstractC5535bv implements InterfaceC12778rv {

    /* JADX INFO: renamed from: c5 */
    public String f15266c5;

    /* JADX INFO: renamed from: fa */
    private C5546kk f15270fa;

    /* JADX INFO: renamed from: ix */
    private AbstractC5535bv f15272ix;

    /* JADX INFO: renamed from: rv */
    private boolean f15279rv;

    /* JADX INFO: renamed from: up */
    private C5544jd f15282up;

    /* JADX INFO: renamed from: x6 */
    private String f15284x6;

    /* JADX INFO: renamed from: u4 */
    private byte f15281u4 = 0;

    /* JADX INFO: renamed from: ne */
    private InterfaceC12766dy f15278ne = new C12771k4();

    /* JADX INFO: renamed from: yj */
    private AbstractC13883dt f15285yj = new C13963qw();

    /* JADX INFO: renamed from: ks */
    private C13950o3 f15276ks = new C13950o3(this.f15285yj);

    /* JADX INFO: renamed from: to */
    public final String f15280to = this.f15285yj.mo65266k4("#document");

    /* JADX INFO: renamed from: kk */
    public final String f15275kk = this.f15285yj.mo65266k4("#document-fragment");

    /* JADX INFO: renamed from: x1 */
    public final String f15283x1 = this.f15285yj.mo65266k4("#comment");

    /* JADX INFO: renamed from: h4 */
    public final String f15271h4 = this.f15285yj.mo65266k4("#text");

    /* JADX INFO: renamed from: k4 */
    public final String f15274k4 = this.f15285yj.mo65266k4("#cdata-section");

    /* JADX INFO: renamed from: du */
    public final String f15268du = this.f15285yj.mo65266k4("#entity");

    /* JADX INFO: renamed from: ck */
    public String f15267ck = this.f15285yj.mo65266k4("xmlns");

    /* JADX INFO: renamed from: jd */
    public String f15273jd = this.f15285yj.mo65266k4("xml");

    /* JADX INFO: renamed from: dy */
    public String f15269dy = this.f15285yj.mo65266k4(" http://www.w3.org/2000/xmlns/");

    /* JADX INFO: renamed from: m9 */
    public String f15277m9 = this.f15285yj.mo65266k4("http://www.w3.org/XML/1998/namespace");

    public C5552rv(C5546kk c5546kk) {
        this.f15270fa = c5546kk;
        this.f15282up = (C5544jd) c5546kk.m22753kk();
        String strMo65266k4 = this.f15285yj.mo65266k4("http://www.w3.org/1999/xhtml");
        this.f15266c5 = strMo65266k4;
        this.f15276ks.mo65707k4(C14113y2.f47374k4, strMo65266k4);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ar */
    public String mo22622ar() {
        return this.f15284x6;
    }

    /* JADX INFO: renamed from: bv */
    public final C5546kk m22771bv() {
        return this.f15270fa;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: c5 */
    public final InterfaceC12772kk mo22772c5(String str) {
        String str2 = C14113y2.f47374k4;
        String[] strArr = {str2};
        String[] strArr2 = {str2};
        AbstractC5535bv.m22619k4(str, strArr, strArr2);
        return m22811x1(strArr[0], strArr2[0], str2);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: ck */
    public final InterfaceC12760ar mo22773ck(String str) {
        return C5557uz.m22839k4(this, str);
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC12760ar m22774du(String str, String str2) {
        return C5557uz.m22840k4(this, str, str2);
    }

    /* JADX INFO: renamed from: dy */
    public final InterfaceC12765du m22777dy(String str) {
        return new C5553to(str, this);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: fa */
    public byte mo22608fa() {
        return (byte) 9;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: h4 */
    public final InterfaceC12764ck mo22779h4() {
        return this.f15282up;
    }

    /* JADX INFO: renamed from: ix */
    public final boolean m22781ix() {
        C5563xk c5563xkM22802rv = m22802rv();
        if (c5563xkM22802rv != null) {
            return "yes".equals(c5563xkM22802rv.m22868x1());
        }
        return false;
    }

    /* JADX INFO: renamed from: jd */
    public final InterfaceC12783uz m22782jd(String str) {
        return new C5551qq(str, this);
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5194k4
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5196to mo22189k4(InterfaceC12777qq interfaceC12777qq, int i, InterfaceC5195kk interfaceC5195kk, boolean z) {
        return new C6791h4(interfaceC12777qq, i, interfaceC5195kk, z);
    }

    /* JADX INFO: renamed from: kk */
    public final C5563xk m22794kk(String str, String str2, String str3) {
        return new C5563xk(str, str2, str3, this);
    }

    /* JADX INFO: renamed from: ks */
    public final InterfaceC12787x6 m22798ks() {
        return new C5562x6(this);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: m9 */
    public final InterfaceC12775m9 mo22799m9(String str) {
        return new C5533ar(str, this);
    }

    /* JADX INFO: renamed from: ne */
    public final String m22800ne() {
        C5563xk c5563xkM22802rv = m22802rv();
        if (c5563xkM22802rv != null) {
            return c5563xkM22802rv.m22864k4();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: qq */
    public final InterfaceC12766dy mo22801qq() {
        return this.f15278ne;
    }

    /* JADX INFO: renamed from: rv */
    public final C5563xk m22802rv() {
        return (C5563xk) C7019kk.m27452k4((Object) mo22653ss(), C5563xk.class);
    }

    /* JADX INFO: renamed from: to */
    public C5543ix m22803to(String str) {
        return (C5543ix) C7019kk.m27452k4((Object) mo22189k4((InterfaceC12777qq) mo22653ss(), 1, (InterfaceC5195kk) new C6795to(str), false).mo22192k4(), C5543ix.class);
    }

    /* JADX INFO: renamed from: u4 */
    public final String m22806u4() {
        C5563xk c5563xkM22802rv = m22802rv();
        if (c5563xkM22802rv != null) {
            return c5563xkM22802rv.m22866kk();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv
    /* JADX INFO: renamed from: um */
    public AbstractC5535bv mo22658um() {
        return this.f15272ix;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: up */
    public C5552rv mo22660v4() {
        return this;
    }

    /* JADX INFO: renamed from: uz */
    public final boolean m22808uz() {
        return this.f15279rv;
    }

    /* JADX INFO: renamed from: wl */
    public final String m22809wl() {
        return this.f15284x6;
    }

    @Override // com.aspose.slides.internal.p199j5.InterfaceC5194k4
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC5192du mo22190x1(InterfaceC12777qq interfaceC12777qq, int i, InterfaceC5195kk interfaceC5195kk, boolean z) {
        return new C6794m9(interfaceC12777qq, i, interfaceC5195kk, z);
    }

    /* JADX INFO: renamed from: x6 */
    public final String m22814x6() {
        return this.f15270fa.m22754m9().mo26657jd();
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: yj */
    public final InterfaceC12769ix mo22815yj() {
        C5543ix c5543ixM22803to = m22803to("HTML");
        return c5543ixM22803to != null ? c5543ixM22803to : (InterfaceC12769ix) C7019kk.m27452k4((Object) m22783k4((byte) 1), C5543ix.class);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: du */
    public final InterfaceC12769ix mo22775du(String str) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        AbstractC5535bv.m22619k4(str, strArr, strArr2);
        return m22787k4(strArr[0], strArr2[0], (String) null);
    }

    /* JADX INFO: renamed from: fa */
    public final InterfaceC12769ix m22778fa(String str) {
        InterfaceC5192du interfaceC5192duMo22190x1 = mo22660v4().mo22190x1(this, 1, new C6796x1(str), false);
        try {
            InterfaceC12769ix interfaceC12769ix = (InterfaceC12769ix) C7019kk.m27452k4((Object) interfaceC5192duMo22190x1.mo22183du(), C5543ix.class);
            interfaceC5192duMo22190x1.dispose();
            return interfaceC12769ix;
        } catch (Throwable th) {
            if (interfaceC5192duMo22190x1 != null) {
                interfaceC5192duMo22190x1.dispose();
            }
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: h4 */
    public final InterfaceC12784v4 mo22780h4(String str) {
        return new C5532ak(str, this);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC5535bv m22783k4(byte b) {
        for (AbstractC5535bv abstractC5535bvMo22653ss = mo22653ss(); abstractC5535bvMo22653ss != null; abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22631g8()) {
            if (abstractC5535bvMo22653ss.mo22608fa() == b) {
                return abstractC5535bvMo22653ss;
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: kk */
    public final InterfaceC12769ix mo22795kk(String str, String str2) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        AbstractC5535bv.m22619k4(str2, strArr, strArr2);
        String str3 = strArr[0];
        String str4 = strArr2[0];
        m22805to().mo65708kk();
        m22805to().mo65707k4(str3, str);
        InterfaceC12769ix interfaceC12769ixM22787k4 = m22787k4(str3, str4, str);
        m22805to().mo65709to();
        return interfaceC12769ixM22787k4;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public String mo22612m9() {
        return this.f15280to;
    }

    /* JADX INFO: renamed from: to */
    public final InterfaceC12772kk m22804to(String str, String str2) {
        String[] strArr = {null};
        String[] strArr2 = {null};
        AbstractC5535bv.m22619k4(str2, strArr, strArr2);
        return m22811x1(strArr[0], strArr2[0], str);
    }

    /* JADX INFO: renamed from: up */
    public final void m22807up(String str) {
        C5563xk c5563xkM22802rv = m22802rv();
        if (c5563xkM22802rv != null) {
            c5563xkM22802rv.m22863du(str);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C5545k4 m22810x1(String str, String str2) {
        String str3 = C14113y2.f47374k4;
        String[] strArr = {str3};
        String[] strArr2 = {str3};
        AbstractC5535bv.m22619k4(str2, strArr, strArr2);
        return m22811x1(strArr[0], strArr2[0], str);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: yj */
    public final void mo22816yj(String str) {
        this.f15284x6 = str;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: du */
    public final InterfaceC12776ne mo22776du() {
        return (InterfaceC12776ne) C7019kk.m27452k4((Object) m22783k4((byte) 10), C5550ne.class);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5558v4 m22784k4(IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> iGenericDictionary) {
        return C5557uz.m22837k4(this, iGenericDictionary, 0);
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC13883dt m22796kk() {
        return this.f15285yj;
    }

    /* JADX INFO: renamed from: to */
    public final C13950o3 m22805to() {
        return this.f15276ks;
    }

    /* JADX INFO: renamed from: x1 */
    public final C5545k4 m22811x1(String str, String str2, String str3) {
        C5565yj c5565yj = new C5565yj(str, str2, str3, this);
        C5545k4 c5545k4 = new C5545k4(c5565yj, this);
        if (this.f15282up.m22726k4() != null) {
            c5545k4.m22740k4(this.f15282up.m22726k4().m8437k4(c5565yj));
        }
        return c5545k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5558v4 m22785k4(IGenericEnumerable<String> iGenericEnumerable) {
        return C5557uz.m22838k4(this, iGenericEnumerable);
    }

    /* JADX INFO: renamed from: kk */
    public final void m22797kk(boolean z) {
        this.f15279rv = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC5558v4 m22812x1(IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> iGenericDictionary) {
        return C5557uz.m22837k4(this, iGenericDictionary, 1);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12762bv m22786k4(String str, String str2) {
        return new C5534b3(str, str2, this);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public InterfaceC12777qq mo22614x1(boolean z) {
        InterfaceC12778rv interfaceC12778rvMo22730k4 = mo22779h4().mo22730k4(mo22634jd(), mo22612m9(), mo22776du());
        interfaceC12778rvMo22730k4.mo22816yj(m22809wl());
        return interfaceC12778rvMo22730k4;
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC12769ix m22787k4(String str, String str2, String str3) {
        return this.f15282up.m22726k4() != null ? this.f15282up.m22726k4().m8436k4((InterfaceC12789yj) new C5565yj(str, str2, str3, this), (InterfaceC12778rv) this) : new C5543ix(new C5565yj(str, str2, str3, this), this);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m22813x1(String... strArr) {
        this.f15270fa.m22757x1(strArr);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12778rv
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12776ne mo22788k4(String str, String str2, String str3, String str4) {
        return new C5550ne(str, str2, str3, str4, this);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12777qq m22789k4(InterfaceC12777qq interfaceC12777qq) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12777qq m22790k4(InterfaceC12777qq interfaceC12777qq, String str, String str2) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12777qq m22791k4(InterfaceC12777qq interfaceC12777qq, boolean z) {
        interfaceC12777qq.mo22614x1(z);
        ((AbstractC5535bv) interfaceC12777qq).m22629du((AbstractC5535bv) this);
        return interfaceC12777qq;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv
    /* JADX INFO: renamed from: k4 */
    public void mo22639k4(AbstractC5535bv abstractC5535bv) {
        this.f15272ix = abstractC5535bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22792k4(boolean z) {
        C5563xk c5563xkM22802rv = m22802rv();
        if (c5563xkM22802rv != null) {
            c5563xkM22802rv.m22867to(z ? "yes" : TranslateLanguage.NORWEGIAN);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22793k4(String... strArr) {
        this.f15270fa.m22752k4(strArr);
    }
}
