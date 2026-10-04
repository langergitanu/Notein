package com.aspose.slides.internal.p213jw;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p046bs.InterfaceC1849kk;
import com.aspose.slides.internal.p046bs.InterfaceC1851x1;
import com.aspose.slides.internal.p055c4.C1942du;
import com.aspose.slides.internal.p149gf.C4258to;
import com.aspose.slides.internal.p181ig.C4818c5;
import com.aspose.slides.internal.p181ig.C4879y2;
import com.aspose.slides.internal.p182ii.C4913ks;
import com.aspose.slides.internal.p231kk.InterfaceC5805u4;
import com.aspose.slides.internal.p253lm.C6149jw;
import com.aspose.slides.internal.p263m2.InterfaceC6307k4;
import com.aspose.slides.internal.p263m2.InterfaceC6310to;
import com.aspose.slides.internal.p263m2.InterfaceC6311x1;
import com.aspose.slides.internal.p270m9.C6335dy;
import com.aspose.slides.internal.p270m9.C6348to;
import com.aspose.slides.internal.p270m9.InterfaceC6346qq;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p365qn.C9901x1;
import com.aspose.slides.internal.p423to.C11072m9;
import com.aspose.slides.internal.p433u1.C11265ne;
import com.aspose.slides.internal.p467vw.C11876k4;
import com.aspose.slides.internal.p467vw.C11877x1;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.internal.p517y2.InterfaceC12764ck;
import com.aspose.slides.internal.p517y2.InterfaceC12778rv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5546kk {

    /* JADX INFO: renamed from: k4 */
    private static final C6335dy f15241k4 = new C6335dy();

    /* JADX INFO: renamed from: c5 */
    private AbstractC6747ar f15242c5;

    /* JADX INFO: renamed from: ck */
    private C9901x1 f15243ck;

    /* JADX INFO: renamed from: du */
    private InterfaceC6346qq f15244du;

    /* JADX INFO: renamed from: dy */
    private AbstractC6747ar f15245dy;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC6310to f15246h4;

    /* JADX INFO: renamed from: jd */
    private InterfaceC1851x1 f15247jd;

    /* JADX INFO: renamed from: kk */
    private final C5541fa f15248kk;

    /* JADX INFO: renamed from: m9 */
    private final InterfaceC1849kk f15249m9;

    /* JADX INFO: renamed from: to */
    private C6149jw f15250to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC12778rv f15251x1;

    public C5546kk(InterfaceC1849kk interfaceC1849kk, InterfaceC1851x1 interfaceC1851x1, C9901x1 c9901x1) {
        this.f15242c5 = C5540dy.f15211k4;
        this.f15249m9 = interfaceC1849kk;
        C5541fa c5541fa = new C5541fa(this);
        this.f15248kk = c5541fa;
        c5541fa.m22696k4(new C5544jd(this));
        this.f15250to = new C6149jw();
        this.f15247jd = interfaceC1851x1;
        this.f15243ck = c9901x1;
        if (!C14113y2.m67411k4(interfaceC1851x1.mo9642kk())) {
            try {
                this.f15242c5 = C12555c5.m58553k4(interfaceC1851x1.mo9642kk());
            } catch (ArgumentException unused) {
            }
        }
        this.f15245dy = this.f15242c5;
    }

    /* JADX INFO: renamed from: c5 */
    public final C9901x1 m22745c5() {
        return this.f15243ck;
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC6346qq m22746du() {
        return this.f15244du;
    }

    /* JADX INFO: renamed from: dy */
    public final InterfaceC1851x1 m22747dy() {
        return this.f15247jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final InterfaceC1849kk m22748h4() {
        return this.f15249m9;
    }

    /* JADX INFO: renamed from: jd */
    public final InterfaceC12778rv m22749jd() {
        this.f15251x1 = m22753kk().mo22730k4("http://www.w3.org/1999/xhtml", C14113y2.f47374k4, null);
        C6149jw c6149jw = new C6149jw();
        this.f15250to = c6149jw;
        c6149jw.m24873k4(new C11265ne());
        this.f15250to.m24873k4(new C1942du("document", this.f15251x1));
        C11072m9 c11072m9 = new C11072m9();
        c11072m9.m53507kk().m53515k4(this.f15247jd.mo9643to().m53522x1());
        c11072m9.m53507kk().m53523x1(this.f15247jd.mo9643to().m53521to());
        c11072m9.m53507kk().m53516k4(this.f15247jd.mo9643to().m53520m9());
        c11072m9.m53507kk().m53517k4(this.f15247jd.mo9643to().m53518kk().Clone());
        c11072m9.m53507kk().m53519kk(this.f15247jd.mo9643to().m53513dy());
        c11072m9.m53507kk().m53524x1(this.f15247jd.mo9643to().m53512du().Clone());
        c11072m9.m53506k4(C14113y2.m67432to(C14113y2.m67411k4(this.f15247jd.mo9644x1()) ? "html" : this.f15247jd.mo9644x1(), "XHTML", (short) 5));
        InterfaceC6346qq interfaceC6346qqM25937k4 = f15241k4.m25937k4((InterfaceC5805u4) C7019kk.m27452k4((Object) this.f15251x1, InterfaceC5805u4.class), new C6348to(new C11876k4(this.f15249m9), c11072m9));
        this.f15244du = interfaceC6346qqM25937k4;
        ((C4913ks) this.f15251x1).m20435k4(interfaceC6346qqM25937k4);
        return this.f15251x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12778rv m22750k4() {
        return this.f15251x1;
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC12764ck m22753kk() {
        return this.f15248kk.m22695k4("CORE");
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC6747ar m22754m9() {
        return this.f15245dy;
    }

    /* JADX INFO: renamed from: to */
    public final C6149jw m22755to() {
        return this.f15250to;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC6307k4 m22756x1() {
        return (InterfaceC6307k4) this.f15248kk.m22695k4("LS");
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12778rv m22744k4(InterfaceC6311x1 interfaceC6311x1) {
        InterfaceC6346qq interfaceC6346qq;
        String str;
        if (this.f15251x1 == null) {
            m22749jd();
        }
        long position = interfaceC6311x1.mo17114kk() == null ? interfaceC6311x1.mo17115x1().getPosition() : -1L;
        AbstractC6747ar abstractC6747arM19927k4 = new C4818c5(new C4879y2(interfaceC6311x1), this).m19927k4();
        if (position != -1) {
            interfaceC6311x1.mo17115x1().setPosition(position);
        }
        if (abstractC6747arM19927k4 != null && abstractC6747arM19927k4 != this.f15245dy) {
            this.f15245dy = abstractC6747arM19927k4;
        }
        interfaceC6311x1.mo17116x1(this.f15245dy.mo26657jd());
        InterfaceC6310to interfaceC6310toMo22728k4 = m22756x1().mo22728k4(1, "");
        this.f15246h4 = interfaceC6310toMo22728k4;
        interfaceC6310toMo22728k4.mo17109k4(interfaceC6311x1);
        if (m22750k4().mo22776du() == null) {
            interfaceC6346qq = this.f15244du;
            str = C11877x1.f39995k4;
        } else {
            interfaceC6346qq = this.f15244du;
            str = "a\r\n{\r\n\tdisplay:inline;\r\n}\r\n:Link\r\n{\r\n    text-decoration:underline; \r\n\tcolor:Blue;\r\n}\r\naside\r\n{\r\n    display:block;\r\n}\r\naddress\r\n{\r\n    font-style: italic;\r\n\tdisplay: block;\r\n}\r\nabbr\r\n{\r\n    display:inline;\r\n}\r\nacronym\r\n{\r\n    display:inline;\r\n}\r\napplet\r\n{\r\n    display:inline;\r\n}\r\nbdo\r\n{\r\n    display:inline;\r\n}\r\nsection\r\n{\r\n    margin: 1.5em 0;\r\n    display: block;\r\n}\r\nblockquote\r\n{\r\n\tdisplay: block;\r\n\tmargin: 1.12em 40px;\r\n}\r\nmeter\r\n{\r\n    display:inline;\r\n}\r\nnav\r\n{\r\n    display:inline;\r\n}\r\nruby\r\n{\r\n    display:inline;\r\n}\r\nprogress\r\n{\r\n    display:inline;\r\n}\r\nfooter\r\n{\r\n    display:inline;\r\n}\r\nheader\r\n{\r\n    display:inline;\r\n}\r\nmark\r\n{\r\n    display:inline;\r\n    background-color:yellow;\r\n}\r\nbody\r\n{\r\n\tdisplay: block; \r\n    margin: 8px;\r\n\t/*color: black;*/\r\n\t/*background: white;*/\r\n}\r\ndd\r\n{\r\n\tmargin-left: 40px;\r\n\tdisplay: block;\r\n}\r\ndiv\r\n{\r\n\tdisplay: block;\r\n}\r\ndl\r\n{\r\n\tmargin: 1.12em 0;\r\n\tdisplay: block;\r\n}\r\ndt\r\n{\r\n\tdisplay: block;\r\n}\r\ndfn\r\n{\r\n    font-style: italic;\r\n    display:inline;\r\n}\r\nfieldset\r\n{\r\n    margin: 1.12em 0;\r\n\tdisplay: block;\r\n    border: solid 1px gray;\r\n    padding-bottom: 10px;\r\n}\r\nfigure\r\n{\r\n    margin-top: 1.12em;\r\n    margin-bottom: 1.12em;\r\n    margin-left: 2.12em;\r\n    margin-right: 2.12em;\r\n\tdisplay: block;\r\n}\r\nform\r\n{\r\n    margin: 1.12em 0;\r\n\tdisplay: block;\r\n}\r\nframe\r\n{\r\n\tdisplay: block;\r\n}\r\narticle\r\n{\r\n\tdisplay: block;\r\n}\r\nframeset\r\n{\r\n\tdisplay: block;\r\n}\r\ntime\r\n{\r\n    display:inline;\r\n}\r\nh1\r\n{\r\n    font-weight: bolder;\r\n    font-size: 2em;\r\n\tmargin: 0.67em 0;\t\r\n\tdisplay: block;\r\n}\r\nh2\r\n{\r\n    font-size: 1.5em;\r\n\tmargin: 0.75em 0;\r\n\tfont-weight: bolder;\r\n\tdisplay: block;\r\n}\r\nh3\r\n{\r\n    font-size: 1.17em;\r\n\tmargin: 0.83em 0;\r\n\tfont-weight: bolder;\r\n\tdisplay: block;\r\n}\r\nh4\r\n{\r\n    font-weight: bolder;\r\n\tdisplay: block;\r\n\tmargin: 1.12em 0;\r\n}\r\nh5\r\n{\r\n    font-weight: bolder;\r\n\tdisplay: block;\r\n\tfont-size: 0.83em;\r\n\tmargin: 1.5em 0;\r\n}\r\nh6\r\n{\r\n    font-weight: bolder;\r\n\tdisplay: block;\r\n\tfont-size:0.75em;\r\n\tmargin: 1.67em 0;\r\n}\r\nnoframes\r\n{\r\n\tdisplay: block;\r\n}\r\nol\r\n{\r\n    padding-left: 40px;\r\n\tdisplay: block;\r\n\tmargin: 1.12em 0;\r\n\tlist-style-type: decimal;\r\n}\r\np\r\n{\r\n\tdisplay: block;\r\n\tmargin: 1.12em 0;\r\n}\r\nul\r\n{\r\n    padding-left: 40px;\r\n\tdisplay: block;\r\n\tmargin: 1.12em 0;\r\n}\r\ncenter\r\n{\r\n\tdisplay: block;\r\n\ttext-align: center;\r\n}\r\ndir\r\n{\r\n    padding-left: 40px;\r\n    margin: 1.12em 0;\r\n\tdisplay: block;\r\n}\r\nhr\r\n{\r\n    /*border: 1px inset;*/\r\n    border: solid 1px gray;\r\n\tdisplay: block;\r\n\tmargin: 10px 0px;\r\n}\r\nmenu\r\n{\r\n    padding-left: 40px;\r\n    margin: 1.12em 0;\r\n\tdisplay: block;\r\n}\r\npre\r\n{\r\n    font-family: Courier New;\r\n    font-size: 0.87em;\r\n\twhite-space: pre;\r\n\tdisplay: block;\r\n}\r\nxmp\r\n{\r\n\tfont-family: Courier New;\r\n    font-size: 0.87em;\r\n\twhite-space: pre;\r\n\tdisplay: block;\r\n}\r\nplaintext\r\n{\r\n\tfont-family: Courier New;\r\n    font-size: 0.87em;\r\n\twhite-space: pre;\r\n\tdisplay: block;\r\n}\r\nspan\r\n{\r\n\tdisplay: inline;\r\n}\r\nli\r\n{\r\n\tdisplay: list-item;\r\n}\r\nhead\r\n{\r\n\tdisplay: none;\r\n}\r\ntable\r\n{\r\n    text-align: left;\r\n    font-weight: normal;\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n    border-collapse: separate;\r\n\twidth: auto;\r\n\theight: auto;\r\n    border-spacing: 2px;\r\n    border-style:none;\r\n\tdisplay: table;\r\n}\r\ntd, th\r\n{\r\n\tdisplay: table-cell;\r\n\tborder-style: none;\r\n    vertical-align: middle;\r\n\tvertical-align: inherit;\r\n}\r\nth\r\n{\r\n\tfont-weight: bolder;\r\n\ttext-align: center;\r\n}\r\ntr\r\n{\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n\twidth: auto;\r\n\theight: auto;\r\n    vertical-align: inherit;\r\n    border-style:none;\r\n\tdisplay: table-row;\r\n}\r\nthead\r\n{\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n\twidth: auto;\r\n\theight: auto;\r\n    vertical-align: middle;\r\n    border-style:solid;\r\n\tdisplay: table-header-group;\r\n}\r\ntbody\r\n{\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n\twidth: auto;\r\n\theight: auto;\r\n\tborder-style:solid;\r\n    vertical-align: middle;\r\n\tdisplay: table-row-group;\r\n}\r\ntfoot\r\n{\r\n    /*display: block;*/\r\n\tbackground-position: top left;\r\n\twidth: auto;\r\n\theight: auto;\r\n    vertical-align: middle;\r\n    border-style:solid;\r\n\tdisplay: table-footer-group;\r\n}\r\ncol\r\n{\r\n\tdisplay: table-column;\r\n}\r\ncolgroup\r\n{\r\n\tdisplay: table-column-group;\r\n}\r\ncaption\r\n{\r\n\tdisplay: table-caption;\r\n\ttext-align: center;\r\n}\r\nb\r\n{\r\n\tfont-weight: bolder;\r\n\tdisplay:inline;\r\n}\r\nstrong\r\n{\r\n\tfont-weight: bolder;\r\n\tdisplay: inline;\r\n}\r\ni\r\n{\r\n\tfont-style: italic;\r\n\tdisplay:inline;\r\n}\r\ncite\r\n{\r\n\tfont-style: italic;\r\n\tdisplay:inline;\r\n}\r\nimg\r\n{\r\n    display:inline;\r\n}\r\nem\r\n{\r\n\tfont-style: italic;\r\n\tdisplay: inline;\r\n}\r\niframe\r\n{\r\n    display:inline;\r\n}\r\nvar\r\n{\r\n\tfont-style: italic;\r\n\tdisplay: inline;\r\n}\r\ntt\r\n{\r\n    font-family: monospace;\r\n    font-size: 0.87em;\r\n\tdisplay:inline;\r\n}\r\ncode\r\n{\r\n    font-family: monospace;\r\n    font-size: 0.87em;\r\n    display:inline;\r\n}\r\nq\r\n{\r\n    display:inline;\r\n    quotes: '\"' '\"';\r\n}\r\nq::before \r\n{\r\n    content: open-quote;\r\n}\r\nq::after \r\n{\r\n    content: close-quote;\r\n}\r\nlabel\r\n{\r\n    display:inline;\r\n}\r\nobject\r\n{\r\n    display:inline;\r\n}\r\nkbd\r\n{\r\n    font-family: monospace;\r\n    display:inline;\r\n    font-size: 0.87em;\r\n}\r\nsamp\r\n{\r\n    font-family: monospace;\r\n    font-size: 0.87em;\r\n    display:inline;\r\n}\r\nbutton\r\n{\r\n    display:inline;\r\n\tfont-style: italic;\r\n}\r\ntextarea\r\n{\r\n\tfont-style: italic;\r\n}\r\ninput\r\n{\r\n\tdisplay: inline-block;\r\n}\r\nselect\r\n{\r\n\tdisplay: inline-block;\r\n}\r\nbig\r\n{\r\n    font-size: larger;\r\n\t/*font-size: 1.333333em;*/\r\n\tdisplay:inline;\r\n}\r\nsmall\r\n{\r\n\tfont-size: smaller;\r\n\tdisplay:inline;\r\n}\r\ns\r\n{\r\n\ttext-decoration: line-through;\r\n\tdisplay: inline;\r\n}\r\nstrike\r\n{\r\n\ttext-decoration: line-through;\r\n\tdisplay:inline;\r\n}\r\ndel\r\n{\r\n    display:inline;\r\n\ttext-decoration: line-through;\r\n}\r\nol ul\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 0;\r\n}\r\nul ol\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 0;\r\n}\r\nul ul\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 0;\r\n}\r\nol ol\r\n{\r\n\tmargin-top: 0;\r\n\tmargin-bottom: 0;\r\n}\r\ntable, td, th \r\n{ \r\n    border-color: black;\r\n}\r\nu\r\n{\r\n\ttext-decoration: underline;\r\n\tdisplay: inline;\r\n}\r\nins\r\n{\r\n    display:inline;\r\n\ttext-decoration: underline;\r\n}\r\nfont\r\n{\r\n\tdisplay:inline;\r\n}\r\nsub\r\n{\r\n\tfont-size: 0.5em;\r\n\tvertical-align: sub;\r\n\tdisplay:inline;\r\n}\r\nsup\r\n{\r\n\tfont-size: 0.5em;\r\n\tvertical-align: super;\r\n\tdisplay:inline;\r\n}\r\noption\r\n{\r\n\tdisplay:inline;\r\n}\r\nselect\r\n{\r\n\tdisplay:inline;\r\n}\r\ncheckbox\r\n{\r\n\tdisplay:inline;\r\n}\r\n:root\r\n{\r\n    quotes: '\\201c' '\\201d' '\\2018' '\\2019';\r\n}\r\ntextarea\r\n{\r\n  \tdisplay:inline;\r\n}";
        }
        interfaceC6346qq.mo26000kk(str);
        C9901x1 c9901x1 = this.f15243ck;
        if (c9901x1 != null && c9901x1.m48763m9() != null && !C14113y2.m67411k4(this.f15243ck.m48763m9().m48723dy())) {
            this.f15244du.mo26005to(this.f15243ck.m48763m9().m48723dy());
        }
        m22746du().mo25996k4((InterfaceC5805u4) C7019kk.m27452k4((Object) m22750k4(), InterfaceC5805u4.class));
        return m22750k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m22757x1(String... strArr) {
        InterfaceC6310to interfaceC6310to = this.f15246h4;
        if (interfaceC6310to != null) {
            ((C4258to) interfaceC6310to).m17111x1(strArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12778rv m22751k4(String str) {
        this.f15245dy = this.f15242c5;
        InterfaceC6311x1 interfaceC6311x1Mo22731kk = m22756x1().mo22731kk();
        interfaceC6311x1Mo22731kk.mo17113k4(str);
        return m22744k4(interfaceC6311x1Mo22731kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22752k4(String... strArr) {
        InterfaceC6310to interfaceC6310to = this.f15246h4;
        if (interfaceC6310to != null) {
            ((C4258to) interfaceC6310to).m17110k4(strArr);
        }
    }
}
