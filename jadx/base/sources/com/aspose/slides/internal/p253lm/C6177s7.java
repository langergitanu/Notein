package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p055c4.AbstractC1946kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.s7 */
/* JADX INFO: loaded from: classes4.dex */
public class C6177s7 extends C6116bs implements InterfaceC6173qw {

    /* JADX INFO: renamed from: ar */
    private Dictionary<AbstractC14068j5, AbstractC1946kk> f17422ar;

    /* JADX INFO: renamed from: c5 */
    private C6213yj f17423c5;

    /* JADX INFO: renamed from: ck */
    private C6206xk f17424ck;

    /* JADX INFO: renamed from: du */
    private C6134f9 f17425du;

    /* JADX INFO: renamed from: dy */
    private C6129du f17426dy;

    /* JADX INFO: renamed from: fa */
    private C6206xk f17427fa;

    /* JADX INFO: renamed from: h4 */
    private C6114b1 f17428h4;

    /* JADX INFO: renamed from: ix */
    private C6212yg f17429ix;

    /* JADX INFO: renamed from: jd */
    private C6118bv f17430jd;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC6132em f17431k4;

    /* JADX INFO: renamed from: ks */
    private C6206xk f17432ks;

    /* JADX INFO: renamed from: m9 */
    private C6179ss f17433m9;

    /* JADX INFO: renamed from: ne */
    private C6142ig f17434ne;

    /* JADX INFO: renamed from: qq */
    private C6198wp f17435qq;

    /* JADX INFO: renamed from: rv */
    private C6206xk f17436rv;

    /* JADX INFO: renamed from: to */
    private int f17437to;

    /* JADX INFO: renamed from: u4 */
    private C6194vt f17438u4;

    /* JADX INFO: renamed from: up */
    private C6206xk f17439up;

    /* JADX INFO: renamed from: uz */
    private C6187u5 f17440uz;

    /* JADX INFO: renamed from: wl */
    private C6116bs f17441wl;

    /* JADX INFO: renamed from: x6 */
    private C6206xk f17442x6;

    /* JADX INFO: renamed from: yj */
    private C6206xk f17443yj;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6177s7(C6184ts c6184ts, int i) {
        C6185u1 c6185u1 = C6185u1.f17479k4;
        super(c6185u1);
        this.f17422ar = new Dictionary<>();
        m25009x1(i);
        m24997k4((InterfaceC6132em) c6184ts);
        this.f17425du = new C6134f9(this, c6184ts, null, c6185u1);
        mo25037k4(CloudMetaExtra.DEFINE_NON_PARENT_ID, c6185u1);
        C6116bs c6116bs = new C6116bs(c6185u1);
        this.f17441wl = c6116bs;
        C6134f9 c6134f9 = new C6134f9(this, null, "prototype", c6116bs);
        this.f17435qq = c6134f9;
        m24999k4(new C6179ss(this, c6134f9));
        m24994k4(new C6114b1(this, this.f17435qq, this.f17441wl));
        mo25037k4("Function", mo24978up());
        mo25037k4("Object", mo24967fa());
        mo24967fa().mo10093k4((InterfaceC6173qw) this);
        m24996k4(new C6129du(this));
        m25004k4(new C6213yj(this));
        m24995k4(new C6118bv(this));
        mo25037k4("Array", mo24983yj());
        mo25037k4("Boolean", mo24972ks());
        mo25037k4("Date", mo24975rv());
        m25002k4(new C6206xk(this, "Error"));
        m25010x1(new C6206xk(this, "EvalError"));
        m25005kk(new C6206xk(this, "RangeError"));
        m25008to(new C6206xk(this, "ReferenceError"));
        m24991du(new C6206xk(this, "SyntaxError"));
        m24992h4(new C6206xk(this, "TypeError"));
        m25006m9(new C6206xk(this, "URIError"));
        mo25037k4("Error", mo24982x6());
        mo25037k4("EvalError", mo24974ne());
        mo25037k4("RangeError", mo24968ix());
        mo25037k4("ReferenceError", mo24976u4());
        mo25037k4("SyntaxError", mo24979uz());
        mo25037k4("TypeError", mo24981wl());
        mo25037k4("URIError", m25007qq());
        m25003k4(new C6212yg(this));
        m25001k4(new C6194vt(this));
        m25000k4(new C6187u5(this));
        m24998k4(new C6142ig(this));
        mo25037k4("Number", mo24977um());
        mo25037k4("RegExp", mo24966bv());
        mo25037k4("String", mo24980v4());
        mo25037k4("Math", m24989ar());
        IGenericEnumerator<AbstractC6123ca> it = mo25029h4().iterator();
        while (it.hasNext()) {
            try {
                AbstractC6172qq abstractC6172qq = (AbstractC6172qq) C7019kk.m27452k4((Object) it.next(), AbstractC6172qq.class);
                if (abstractC6172qq != null) {
                    abstractC6172qq.mo10093k4((InterfaceC6173qw) this);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        mo25037k4("NaN", mo24977um().mo25032k4("NaN"));
        mo25037k4("Infinity", mo24977um().mo25032k4("POSITIVE_INFINITY"));
        mo25037k4("undefined", C6163nh.f17403k4);
        mo25037k4("this", this);
        mo25037k4("eval", new C6134f9(this, c6184ts, "eval", mo24978up().m25138rv()));
        mo25037k4("parseInt", new C6134f9(this, c6184ts, "parseInt", mo24978up().m25138rv()));
        mo25037k4("parseFloat", new C6134f9(this, c6184ts, "parseFloat", mo24978up().m25138rv()));
        mo25037k4("isNaN", new C6134f9(this, c6184ts, "isNaN", mo24978up().m25138rv()));
        mo25037k4("isFinite", new C6134f9(this, c6184ts, "isFinite", mo24978up().m25138rv()));
        mo25037k4("decodeURI", new C6134f9(this, c6184ts, "decodeURI", mo24978up().m25138rv()));
        mo25037k4("encodeURI", new C6134f9(this, c6184ts, "encodeURI", mo24978up().m25138rv()));
        mo25037k4("decodeURIComponent", new C6134f9(this, c6184ts, "decodeURIComponent", mo24978up().m25138rv()));
        mo25037k4("encodeURIComponent", new C6134f9(this, c6184ts, "encodeURIComponent", mo24978up().m25138rv()));
    }

    /* JADX INFO: renamed from: ar */
    public final C6142ig m24989ar() {
        return this.f17434ne;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: bv */
    public final C6194vt mo24966bv() {
        return this.f17438u4;
    }

    /* JADX INFO: renamed from: ck */
    public final int m24990ck() {
        return this.f17437to;
    }

    /* JADX INFO: renamed from: du */
    public final void m24991du(C6206xk c6206xk) {
        this.f17432ks = c6206xk;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: fa */
    public final C6114b1 mo24967fa() {
        return this.f17428h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m24992h4(C6206xk c6206xk) {
        this.f17436rv = c6206xk;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: ix */
    public final C6206xk mo24968ix() {
        return this.f17439up;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: jd */
    public final InterfaceC6132em mo24969jd() {
        return this.f17431k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC1943dy m24993k4(AbstractC14068j5 abstractC14068j5) {
        if (this.f17422ar.containsKey(abstractC14068j5)) {
            return (AbstractC1943dy) this.f17422ar.get_Item(abstractC14068j5);
        }
        throw new ArgumentException(C14113y2.m67402k4("Extension for type '{0}' is not found.", abstractC14068j5.mo48540du()));
    }

    /* JADX INFO: renamed from: kk */
    public final void m25005kk(C6206xk c6206xk) {
        this.f17439up = c6206xk;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: ks */
    public final C6213yj mo24972ks() {
        return this.f17423c5;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: lr */
    public final AbstractC6123ca mo24973lr() {
        return mo25032k4("NaN");
    }

    /* JADX INFO: renamed from: m9 */
    public final void m25006m9(C6206xk c6206xk) {
        this.f17442x6 = c6206xk;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: ne */
    public final C6206xk mo24974ne() {
        return this.f17427fa;
    }

    /* JADX INFO: renamed from: qq */
    public final C6206xk m25007qq() {
        return this.f17442x6;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: rv */
    public final C6118bv mo24975rv() {
        return this.f17430jd;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "Global";
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: u4 */
    public final C6206xk mo24976u4() {
        return this.f17443yj;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: um */
    public final C6212yg mo24977um() {
        return this.f17429ix;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: up */
    public final C6179ss mo24978up() {
        return this.f17433m9;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: uz */
    public final C6206xk mo24979uz() {
        return this.f17432ks;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: v4 */
    public final C6187u5 mo24980v4() {
        return this.f17440uz;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: wl */
    public final C6206xk mo24981wl() {
        return this.f17436rv;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25009x1(int i) {
        this.f17437to = i;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: x6 */
    public final C6206xk mo24982x6() {
        return this.f17424ck;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: yj */
    public final C6129du mo24983yj() {
        return this.f17426dy;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: k4 */
    public final void mo24970k4(AbstractC1946kk abstractC1946kk) {
        AbstractC1943dy abstractC1943dy = (AbstractC1943dy) C7019kk.m27452k4((Object) abstractC1946kk, AbstractC1943dy.class);
        if (abstractC1943dy != null) {
            this.f17422ar.addItem(abstractC1943dy.mo10030k4(), abstractC1946kk);
        }
        abstractC1946kk.m10088k4(this);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6173qw
    /* JADX INFO: renamed from: kk */
    public final boolean mo24971kk(int i) {
        return (m24990ck() & i) == i;
    }

    /* JADX INFO: renamed from: to */
    public final void m25008to(C6206xk c6206xk) {
        this.f17443yj = c6206xk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25010x1(C6206xk c6206xk) {
        this.f17427fa = c6206xk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24994k4(C6114b1 c6114b1) {
        this.f17428h4 = c6114b1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24995k4(C6118bv c6118bv) {
        this.f17430jd = c6118bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24996k4(C6129du c6129du) {
        this.f17426dy = c6129du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24997k4(InterfaceC6132em interfaceC6132em) {
        this.f17431k4 = interfaceC6132em;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24998k4(C6142ig c6142ig) {
        this.f17434ne = c6142ig;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24999k4(C6179ss c6179ss) {
        this.f17433m9 = c6179ss;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25000k4(C6187u5 c6187u5) {
        this.f17440uz = c6187u5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25001k4(C6194vt c6194vt) {
        this.f17438u4 = c6194vt;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25002k4(C6206xk c6206xk) {
        this.f17424ck = c6206xk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25003k4(C6212yg c6212yg) {
        this.f17429ix = c6212yg;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25004k4(C6213yj c6213yj) {
        this.f17423c5 = c6213yj;
    }
}
