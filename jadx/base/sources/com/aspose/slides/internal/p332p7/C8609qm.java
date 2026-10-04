package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.qm */
/* JADX INFO: loaded from: classes4.dex */
public class C8609qm extends AbstractC7361bz {

    /* JADX INFO: renamed from: u4 */
    private static final C7017h4 f28909u4 = new C7017h4("Template", "Manager", "Company", "Pages", "Words", "Characters", "PresentationFormat", "Lines", "Paragraphs", "Slides", "Notes", "TotalTime", "HiddenSlides", "MMClips", "ScaleCrop", "HeadingPairs", "TitlesOfParts", "LinksUpToDate", "CharactersWithSpaces", "SharedDoc", "HyperlinkBase", "HLinks", "HyperlinksChanged", "DigSig", "Application", "AppVersion", "DocSecurity");

    /* JADX INFO: renamed from: c5 */
    private int f28910c5;

    /* JADX INFO: renamed from: ck */
    private byte f28911ck;

    /* JADX INFO: renamed from: du */
    private int f28912du;

    /* JADX INFO: renamed from: dy */
    private long f28913dy;

    /* JADX INFO: renamed from: fa */
    private ktk f28914fa;

    /* JADX INFO: renamed from: h4 */
    private int f28915h4;

    /* JADX INFO: renamed from: ix */
    private String f28916ix;

    /* JADX INFO: renamed from: jd */
    private int f28917jd;

    /* JADX INFO: renamed from: k4 */
    private String f28918k4;

    /* JADX INFO: renamed from: kk */
    private String f28919kk;

    /* JADX INFO: renamed from: ks */
    private byte f28920ks;

    /* JADX INFO: renamed from: m9 */
    private int f28921m9;

    /* JADX INFO: renamed from: ne */
    private String f28922ne;

    /* JADX INFO: renamed from: rv */
    private String f28923rv;

    /* JADX INFO: renamed from: to */
    private String f28924to;

    /* JADX INFO: renamed from: up */
    private i5k f28925up;

    /* JADX INFO: renamed from: x1 */
    private String f28926x1;

    /* JADX INFO: renamed from: x6 */
    private byte f28927x6;

    /* JADX INFO: renamed from: yj */
    private byte f28928yj;

    public C8609qm() {
        m39534yj();
    }

    /* JADX INFO: renamed from: yj */
    private void m39534yj() {
        this.f28918k4 = "";
        this.f28926x1 = "";
        this.f28919kk = "";
        this.f28924to = "";
        this.f28913dy = 4294967295L;
        this.f28911ck = (byte) -1;
        this.f28928yj = (byte) -1;
        this.f28920ks = (byte) -1;
        this.f28923rv = "";
        this.f28927x6 = (byte) -1;
        this.f28922ne = "";
        this.f28916ix = "";
    }

    /* JADX INFO: renamed from: c5 */
    public final byte m39535c5() {
        return this.f28928yj;
    }

    /* JADX INFO: renamed from: ck */
    public final String m39536ck() {
        return this.f28923rv;
    }

    /* JADX INFO: renamed from: du */
    public final String m39537du() {
        return this.f28919kk;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m39540dy() {
        return this.f28911ck;
    }

    /* JADX INFO: renamed from: fa */
    public final String m39541fa() {
        return this.f28922ne;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m39542h4() {
        return this.f28924to;
    }

    /* JADX INFO: renamed from: jd */
    public final byte m39544jd() {
        return this.f28920ks;
    }

    /* JADX INFO: renamed from: k4 */
    public final ktk m39545k4() {
        if (this.f28914fa != null) {
            throw new Exception("Only one <headingPairs> element can be added.");
        }
        ktk ktkVar = new ktk();
        this.f28914fa = ktkVar;
        return ktkVar;
    }

    /* JADX INFO: renamed from: kk */
    public final String m39550kk() {
        return this.f28918k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m39554m9() {
        return this.f28913dy;
    }

    /* JADX INFO: renamed from: to */
    public final String m39556to() {
        return this.f28926x1;
    }

    /* JADX INFO: renamed from: up */
    public final String m39560up() {
        return this.f28916ix;
    }

    /* JADX INFO: renamed from: x1 */
    public final i5k m39561x1() {
        if (this.f28925up != null) {
            throw new Exception("Only one <titlesOfParts> element can be added.");
        }
        i5k i5kVar = new i5k();
        this.f28925up = i5kVar;
        return i5kVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:282)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:65)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public C8609qm(com.aspose.slides.p559ms.System.Xml.AbstractC13912i5 r5) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.slides.internal.p332p7.C8609qm.<init>(com.aspose.slides.ms.System.Xml.i5):void");
    }

    /* JADX INFO: renamed from: du */
    public final void m39538du(int i) {
        this.f28917jd = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m39543h4(String str) {
        this.f28922ne = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39546k4(byte b) {
        this.f28911ck = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m39551kk(byte b) {
        this.f28920ks = b;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m39555m9(String str) {
        this.f28916ix = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m39557to(byte b) {
        this.f28927x6 = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39562x1(byte b) {
        this.f28928yj = b;
    }

    /* JADX INFO: renamed from: du */
    public final void m39539du(String str) {
        this.f28923rv = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39547k4(int i) {
        this.f28912du = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m39552kk(int i) {
        this.f28921m9 = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m39558to(int i) {
        this.f28910c5 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39563x1(int i) {
        this.f28915h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39548k4(long j) {
        this.f28913dy = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m39553kk(String str) {
        this.f28919kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m39559to(String str) {
        this.f28924to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39564x1(String str) {
        this.f28926x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39549k4(String str) {
        this.f28918k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("", str2, "http://schemas.openxmlformats.org/officeDocument/2006/extended-properties");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes") == null) {
            c3059ii.m12954to("xmlns", "vt", null, "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
        }
        if (!"".equals(this.f28918k4)) {
            m29301k4("", c3059ii, "Template", this.f28918k4, false);
        }
        if (!"".equals(this.f28926x1)) {
            m29301k4("", c3059ii, "Manager", this.f28926x1, false);
        }
        m29301k4("", c3059ii, "Company", this.f28919kk, false);
        if (!"".equals(this.f28924to)) {
            m29301k4("", c3059ii, "PresentationFormat", this.f28924to, false);
        }
        m29301k4("", c3059ii, "Paragraphs", C13850af.m65103k4(this.f28912du), false);
        m29301k4("", c3059ii, "Slides", C13850af.m65103k4(this.f28915h4), false);
        m29301k4("", c3059ii, "Notes", C13850af.m65103k4(this.f28921m9), false);
        long j = this.f28913dy;
        if ((j & 4294967295L) != 4294967295L) {
            m29301k4("", c3059ii, "TotalTime", C13850af.m65147x1(j), false);
        }
        m29301k4("", c3059ii, "HiddenSlides", C13850af.m65103k4(this.f28910c5), false);
        m29301k4("", c3059ii, "MMClips", C13850af.m65103k4(this.f28917jd), false);
        byte b = this.f28911ck;
        if (b != -1) {
            m29301k4("", c3059ii, "ScaleCrop", b == 1 ? "1" : "0", false);
        }
        ktk ktkVar = this.f28914fa;
        if (ktkVar != null) {
            ktkVar.mo6846k4("", c3059ii, "HeadingPairs");
        }
        i5k i5kVar = this.f28925up;
        if (i5kVar != null) {
            i5kVar.mo6846k4("", c3059ii, "TitlesOfParts");
        }
        byte b2 = this.f28928yj;
        if (b2 != -1) {
            m29301k4("", c3059ii, "LinksUpToDate", b2 == 1 ? "1" : "0", false);
        }
        byte b3 = this.f28920ks;
        if (b3 != -1) {
            m29301k4("", c3059ii, "SharedDoc", b3 == 1 ? "1" : "0", false);
        }
        if (!"".equals(this.f28923rv)) {
            m29301k4("", c3059ii, "HyperlinkBase", this.f28923rv, false);
        }
        byte b4 = this.f28927x6;
        if (b4 != -1) {
            m29301k4("", c3059ii, "HyperlinksChanged", b4 == 1 ? "1" : "0", false);
        }
        if (!"".equals(this.f28922ne)) {
            m29301k4("", c3059ii, "Application", this.f28922ne, false);
        }
        if (!"".equals(this.f28916ix)) {
            m29301k4("", c3059ii, "AppVersion", this.f28916ix, false);
        }
        c3059ii.mo21898jd();
    }
}
