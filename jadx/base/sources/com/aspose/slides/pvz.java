package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
final class pvz {

    /* JADX INFO: renamed from: ar */
    private long f48170ar;

    /* JADX INFO: renamed from: c5 */
    private byte f48171c5;

    /* JADX INFO: renamed from: ck */
    private float f48172ck;

    /* JADX INFO: renamed from: du */
    private float f48173du;

    /* JADX INFO: renamed from: dy */
    private byte f48174dy;

    /* JADX INFO: renamed from: fa */
    private float f48175fa;

    /* JADX INFO: renamed from: h4 */
    private byte f48176h4;

    /* JADX INFO: renamed from: ix */
    private PortionFormat f48177ix;

    /* JADX INFO: renamed from: jd */
    private float f48178jd;

    /* JADX INFO: renamed from: k4 */
    private short f48179k4;

    /* JADX INFO: renamed from: kk */
    private float f48180kk;

    /* JADX INFO: renamed from: ks */
    private boolean f48181ks;

    /* JADX INFO: renamed from: m9 */
    private byte f48182m9;

    /* JADX INFO: renamed from: ne */
    private BulletFormat f48183ne;

    /* JADX INFO: renamed from: qq */
    private InterfaceC14397rj f48184qq;

    /* JADX INFO: renamed from: rv */
    private Cell f48185rv;

    /* JADX INFO: renamed from: to */
    private float f48186to;

    /* JADX INFO: renamed from: u4 */
    private TabCollection f48187u4;

    /* JADX INFO: renamed from: up */
    private float f48188up;

    /* JADX INFO: renamed from: uz */
    private s6u f48189uz;

    /* JADX INFO: renamed from: wl */
    private kml f48190wl;

    /* JADX INFO: renamed from: x1 */
    private int f48191x1;

    /* JADX INFO: renamed from: x6 */
    private C14093tq<Boolean> f48192x6;

    /* JADX INFO: renamed from: yj */
    private int f48193yj;

    public pvz(ParagraphFormat paragraphFormat, InterfaceC14397rj interfaceC14397rj, BulletFormat bulletFormat, PortionFormat portionFormat, TabCollection tabCollection, s6u s6uVar, kml kmlVar) {
        this(interfaceC14397rj, bulletFormat, portionFormat, tabCollection, s6uVar, kmlVar);
        m69290k4(paragraphFormat);
    }

    /* JADX INFO: renamed from: um */
    private void m69273um() {
        this.f48170ar++;
    }

    /* JADX INFO: renamed from: ar */
    public final long m69274ar() {
        return ((((((((((this.f48170ar & 4294967295L) + (this.f48187u4.m2865x1() & 4294967295L)) & 4294967295L) + (this.f48177ix.getVersion() & 4294967295L)) & 4294967295L) + (this.f48183ne.getVersion() & 4294967295L)) & 4294967295L) + (this.f48190wl.m64014kk() & 4294967295L)) & 4294967295L) + ((m69308uz() != null ? m69308uz().m473kk().m2868ck().getVersion() : 0L) & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: c5 */
    public final byte m69275c5() {
        return this.f48174dy;
    }

    /* JADX INFO: renamed from: ck */
    public final float m69276ck() {
        return this.f48178jd;
    }

    /* JADX INFO: renamed from: du */
    public final float m69277du() {
        return this.f48186to;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m69279dy() {
        return this.f48182m9;
    }

    public boolean equals(Object obj) {
        ParagraphFormat paragraphFormat = (ParagraphFormat) C7019kk.m27452k4(obj, ParagraphFormat.class);
        return paragraphFormat != null && this.f48189uz.m70453k4() == paragraphFormat.m2190dy().m70453k4() && this.f48189uz.m70455x1() == paragraphFormat.m2190dy().m70455x1() && this.f48190wl.m64013k4() == paragraphFormat.m2187c5().m64013k4() && C3085sv.m13089k4((float) m69310x1(), (float) paragraphFormat.m2192h4()) && C3085sv.m13089k4((float) m69293kk(), (float) paragraphFormat.getAlignment()) && C3085sv.m13089k4(m69281h4(), paragraphFormat.getSpaceAfter()) && C3085sv.m13089k4(m69277du(), paragraphFormat.getSpaceBefore()) && C3085sv.m13089k4(m69303to(), paragraphFormat.getSpaceWithin()) && C3085sv.m13089k4((float) m69298m9(), (float) paragraphFormat.getEastAsianLineBreak()) && C3085sv.m13089k4((float) m69279dy(), (float) paragraphFormat.getRightToLeft()) && C3085sv.m13089k4((float) m69275c5(), (float) paragraphFormat.getLatinLineBreak()) && C3085sv.m13089k4((float) m69284jd(), (float) paragraphFormat.getHangingPunctuation()) && C3085sv.m13089k4(m69276ck(), paragraphFormat.getMarginLeft()) && C3085sv.m13089k4(m69280fa(), paragraphFormat.getMarginRight()) && C3085sv.m13089k4(m69307up(), paragraphFormat.getIndent()) && C3085sv.m13089k4(m69318yj(), paragraphFormat.getDefaultTabSize()) && C3085sv.m13089k4((float) m69302rv(), (float) paragraphFormat.getFontAlignment()) && C3085sv.m13089k4((float) m69297ks().size(), (float) paragraphFormat.getTabs().size()) && C3085sv.m13090k4(m69285k4(), paragraphFormat.m2206x1()) && C3085sv.m13090k4(m69317x6(), paragraphFormat.m2204to());
    }

    /* JADX INFO: renamed from: fa */
    public final float m69280fa() {
        return this.f48172ck;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m69281h4() {
        return this.f48173du;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: ix */
    public final PortionFormat m69283ix() {
        return this.f48177ix;
    }

    /* JADX INFO: renamed from: jd */
    public final byte m69284jd() {
        return this.f48171c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final IBulletFormat m69285k4() {
        return this.f48183ne;
    }

    /* JADX INFO: renamed from: kk */
    public final int m69293kk() {
        return this.f48191x1;
    }

    /* JADX INFO: renamed from: ks */
    public final ITabCollection m69297ks() {
        return this.f48187u4;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m69298m9() {
        return this.f48176h4;
    }

    /* JADX INFO: renamed from: ne */
    public final TabCollection m69300ne() {
        return this.f48187u4;
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m69301qq() {
        return this.f48191x1 == -1 && C3085sv.m13089k4(this.f48180kk, Float.NaN) && C3085sv.m13089k4(this.f48186to, Float.NaN) && C3085sv.m13089k4(this.f48173du, Float.NaN) && this.f48176h4 == -1 && this.f48182m9 == -1 && this.f48174dy == -1 && this.f48171c5 == -1 && C3085sv.m13089k4(this.f48178jd, Float.NaN) && C3085sv.m13089k4(this.f48172ck, Float.NaN) && C3085sv.m13089k4(this.f48175fa, Float.NaN) && C3085sv.m13089k4(this.f48188up, Float.NaN) && this.f48187u4.size() == 0 && this.f48193yj == -1;
    }

    /* JADX INFO: renamed from: rv */
    public final int m69302rv() {
        return this.f48193yj;
    }

    /* JADX INFO: renamed from: to */
    public final float m69303to() {
        return this.f48180kk;
    }

    /* JADX INFO: renamed from: u4 */
    public final short m69306u4() {
        return this.f48179k4;
    }

    /* JADX INFO: renamed from: up */
    public final float m69307up() {
        return this.f48175fa;
    }

    /* JADX INFO: renamed from: uz */
    public final Cell m69308uz() {
        if (!this.f48181ks) {
            Cell[] cellArr = {this.f48185rv};
            kke.m63959k4(Cell.class, this.f48184qq, cellArr);
            this.f48185rv = cellArr[0];
            this.f48181ks = true;
        }
        return this.f48185rv;
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m69309wl() {
        if (m69283ix().m358fa()) {
            return true;
        }
        if (!this.f48192x6.m67302x1()) {
            this.f48192x6 = new C14093tq<>(Boolean.FALSE);
        }
        return this.f48192x6.m67297k4().booleanValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final short m69310x1() {
        short s = this.f48179k4;
        if (s < 0) {
            return (short) 0;
        }
        return s;
    }

    /* JADX INFO: renamed from: x6 */
    public final IPortionFormat m69317x6() {
        return this.f48177ix;
    }

    /* JADX INFO: renamed from: yj */
    public final float m69318yj() {
        return this.f48188up;
    }

    public pvz(InterfaceC14397rj interfaceC14397rj, BulletFormat bulletFormat, PortionFormat portionFormat, TabCollection tabCollection, s6u s6uVar, kml kmlVar) {
        this.f48192x6 = new C14093tq<>();
        this.f48179k4 = (short) -1;
        this.f48191x1 = -1;
        this.f48180kk = Float.NaN;
        this.f48186to = Float.NaN;
        this.f48173du = Float.NaN;
        this.f48176h4 = (byte) -1;
        this.f48182m9 = (byte) -1;
        this.f48174dy = (byte) -1;
        this.f48171c5 = (byte) -1;
        this.f48178jd = Float.NaN;
        this.f48172ck = Float.NaN;
        this.f48175fa = Float.NaN;
        this.f48188up = Float.NaN;
        this.f48193yj = -1;
        this.f48184qq = interfaceC14397rj;
        this.f48183ne = bulletFormat;
        this.f48177ix = portionFormat;
        this.f48192x6 = new C14093tq<>(Boolean.FALSE);
        this.f48187u4 = tabCollection;
        this.f48189uz = s6uVar;
        this.f48190wl = kmlVar;
    }

    /* JADX INFO: renamed from: du */
    public final void m69278du(float f) {
        if (this.f48172ck != f) {
            this.f48172ck = f;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m69282h4(float f) {
        if (this.f48175fa != f) {
            this.f48175fa = f;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69286k4(byte b) {
        if (this.f48176h4 != b) {
            this.f48176h4 = b;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m69294kk(byte b) {
        if (this.f48174dy != b) {
            this.f48174dy = b;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m69299m9(float f) {
        if (this.f48188up != f) {
            this.f48188up = f;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m69304to(byte b) {
        if (this.f48171c5 != b) {
            this.f48171c5 = b;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69311x1(byte b) {
        if (this.f48182m9 != b) {
            this.f48182m9 = b;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69287k4(float f) {
        if (this.f48180kk != f) {
            this.f48180kk = f;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m69295kk(float f) {
        if (this.f48173du != f) {
            this.f48173du = f;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m69305to(float f) {
        if (this.f48178jd != f) {
            this.f48178jd = f;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69312x1(float f) {
        if (this.f48186to != f) {
            this.f48186to = f;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69288k4(int i) {
        if (this.f48191x1 != i) {
            this.f48191x1 = i;
            m69273um();
            this.f48192x6 = new C14093tq<>();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m69296kk(ParagraphFormat paragraphFormat) {
        this.f48183ne.m439kk(paragraphFormat.m2206x1());
        if (this.f48179k4 == -1) {
            this.f48179k4 = paragraphFormat.m2192h4();
        }
        if (this.f48191x1 == -1) {
            this.f48191x1 = paragraphFormat.getAlignment();
        }
        if (C14064he.m66715kk(this.f48180kk)) {
            this.f48180kk = paragraphFormat.getSpaceWithin();
        }
        if (C14064he.m66715kk(this.f48186to)) {
            this.f48186to = paragraphFormat.getSpaceBefore();
        }
        if (C14064he.m66715kk(this.f48173du)) {
            this.f48173du = paragraphFormat.getSpaceAfter();
        }
        if (this.f48176h4 == -1) {
            this.f48176h4 = paragraphFormat.getEastAsianLineBreak();
        }
        if (this.f48182m9 == -1) {
            this.f48182m9 = paragraphFormat.getRightToLeft();
        }
        if (this.f48174dy == -1) {
            this.f48174dy = paragraphFormat.getLatinLineBreak();
        }
        if (this.f48171c5 == -1) {
            this.f48171c5 = paragraphFormat.getHangingPunctuation();
        }
        if (C14064he.m66715kk(this.f48178jd)) {
            this.f48178jd = paragraphFormat.getMarginLeft();
        }
        if (C14064he.m66715kk(this.f48172ck)) {
            this.f48172ck = paragraphFormat.getMarginRight();
        }
        if (C14064he.m66715kk(this.f48175fa)) {
            this.f48175fa = paragraphFormat.getIndent();
        }
        if (C14064he.m66715kk(this.f48188up)) {
            this.f48188up = paragraphFormat.getDefaultTabSize();
        }
        for (int i = 0; i < paragraphFormat.m2188ck(); i++) {
            this.f48187u4.add(new Tab(paragraphFormat.getTabs().get_Item(i).getPosition(), paragraphFormat.getTabs().get_Item(i).getAlignment()));
        }
        if (this.f48193yj == -1) {
            this.f48193yj = paragraphFormat.getFontAlignment();
        }
        this.f48177ix.m370x1(paragraphFormat.m2204to());
        this.f48190wl.m64012k4(paragraphFormat.m2187c5().m64013k4());
        this.f48190wl.m64011k4(paragraphFormat.m2187c5().m64015x1());
        this.f48189uz.m70452k4(paragraphFormat.m2190dy().m70453k4());
        this.f48189uz.m70454x1(paragraphFormat.m2190dy().m70455x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69313x1(int i) {
        if (this.f48193yj != i) {
            this.f48193yj = i;
            m69273um();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69289k4(IParagraphFormat iParagraphFormat) {
        this.f48183ne.m443x1((BulletFormat) iParagraphFormat.getBullet());
        this.f48177ix.m369x1((BasePortionFormat) iParagraphFormat.getDefaultPortionFormat());
        ParagraphFormat paragraphFormat = (ParagraphFormat) iParagraphFormat;
        if (paragraphFormat.m2192h4() != 0) {
            this.f48179k4 = paragraphFormat.m2192h4();
        }
        if (iParagraphFormat.getAlignment() != -1) {
            this.f48191x1 = iParagraphFormat.getAlignment();
        }
        if (iParagraphFormat.getFontAlignment() != -1) {
            this.f48193yj = iParagraphFormat.getFontAlignment();
        }
        if (!C3085sv.m13089k4(iParagraphFormat.getSpaceWithin(), Float.NaN)) {
            this.f48180kk = iParagraphFormat.getSpaceWithin();
        }
        if (!C3085sv.m13089k4(iParagraphFormat.getSpaceBefore(), Float.NaN)) {
            this.f48186to = iParagraphFormat.getSpaceBefore();
        }
        if (!C3085sv.m13089k4(iParagraphFormat.getSpaceAfter(), Float.NaN)) {
            this.f48173du = iParagraphFormat.getSpaceAfter();
        }
        if (iParagraphFormat.getEastAsianLineBreak() != -1) {
            this.f48176h4 = iParagraphFormat.getEastAsianLineBreak();
        }
        if (iParagraphFormat.getRightToLeft() != -1) {
            this.f48182m9 = iParagraphFormat.getRightToLeft();
        }
        if (iParagraphFormat.getLatinLineBreak() != -1) {
            this.f48174dy = iParagraphFormat.getLatinLineBreak();
        }
        if (iParagraphFormat.getHangingPunctuation() != -1) {
            this.f48171c5 = iParagraphFormat.getHangingPunctuation();
        }
        if (!C3085sv.m13089k4(iParagraphFormat.getMarginLeft(), Float.NaN)) {
            this.f48178jd = iParagraphFormat.getMarginLeft();
        }
        if (!C3085sv.m13089k4(iParagraphFormat.getMarginRight(), Float.NaN)) {
            this.f48172ck = iParagraphFormat.getMarginRight();
        }
        if (!C3085sv.m13089k4(iParagraphFormat.getIndent(), Float.NaN)) {
            this.f48175fa = iParagraphFormat.getIndent();
        }
        if (!C3085sv.m13089k4(iParagraphFormat.getDefaultTabSize(), Float.NaN)) {
            this.f48188up = iParagraphFormat.getDefaultTabSize();
        }
        if (((TabCollection) iParagraphFormat.getTabs()).size() != 0) {
            this.f48187u4.m2864k4((TabCollection) iParagraphFormat.getTabs());
        }
        if (paragraphFormat.m2187c5().m64013k4()) {
            this.f48190wl.m64012k4(paragraphFormat.m2187c5().m64013k4());
        }
        if (paragraphFormat.m2187c5().m64015x1() != null) {
            this.f48190wl.m64011k4(paragraphFormat.m2187c5().m64015x1());
        }
        if (paragraphFormat.m2190dy().m70453k4()) {
            this.f48189uz.m70452k4(paragraphFormat.m2190dy().m70453k4());
        }
        if (paragraphFormat.m2190dy().m70455x1()) {
            this.f48189uz.m70454x1(paragraphFormat.m2190dy().m70455x1());
        }
        m69273um();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69314x1(ParagraphFormat paragraphFormat) {
        this.f48183ne.m444x1((IBulletFormat) paragraphFormat.m2206x1());
        short s = this.f48179k4;
        if (s != -1) {
            paragraphFormat.m2198k4(s);
        }
        int i = this.f48191x1;
        if (i != -1) {
            paragraphFormat.setAlignment(i);
        }
        if (!C14064he.m66715kk(this.f48180kk)) {
            paragraphFormat.setSpaceWithin(this.f48180kk);
        }
        if (!C14064he.m66715kk(this.f48186to)) {
            paragraphFormat.setSpaceBefore(this.f48186to);
        }
        if (!C14064he.m66715kk(this.f48173du)) {
            paragraphFormat.setSpaceAfter(this.f48173du);
        }
        byte b = this.f48176h4;
        if (b != -1) {
            paragraphFormat.setEastAsianLineBreak(b);
        }
        byte b2 = this.f48182m9;
        if (b2 != -1) {
            paragraphFormat.setRightToLeft(b2);
        }
        byte b3 = this.f48174dy;
        if (b3 != -1) {
            paragraphFormat.setLatinLineBreak(b3);
        }
        byte b4 = this.f48171c5;
        if (b4 != -1) {
            paragraphFormat.setHangingPunctuation(b4);
        }
        if (!C14064he.m66715kk(this.f48178jd)) {
            paragraphFormat.setMarginLeft(this.f48178jd);
        }
        if (!C14064he.m66715kk(this.f48172ck)) {
            paragraphFormat.setMarginRight(this.f48172ck);
        }
        if (!C14064he.m66715kk(this.f48175fa)) {
            paragraphFormat.setIndent(this.f48175fa);
        }
        if (!C14064he.m66715kk(this.f48188up)) {
            paragraphFormat.setDefaultTabSize(this.f48188up);
        }
        for (int i2 = 0; i2 < this.f48187u4.size(); i2++) {
            paragraphFormat.getTabs().add(new Tab(this.f48187u4.get_Item(i2).getPosition(), this.f48187u4.get_Item(i2).getAlignment()));
        }
        int i3 = this.f48193yj;
        if (i3 != -1) {
            paragraphFormat.setFontAlignment(i3);
        }
        this.f48177ix.m363k4(paragraphFormat.m2204to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69290k4(ParagraphFormat paragraphFormat) {
        this.f48183ne.m435k4(paragraphFormat.m2206x1());
        this.f48179k4 = paragraphFormat.m2192h4();
        this.f48191x1 = paragraphFormat.getAlignment();
        this.f48180kk = paragraphFormat.getSpaceWithin();
        this.f48186to = paragraphFormat.getSpaceBefore();
        this.f48173du = paragraphFormat.getSpaceAfter();
        this.f48176h4 = paragraphFormat.getEastAsianLineBreak();
        this.f48182m9 = paragraphFormat.getRightToLeft();
        this.f48174dy = paragraphFormat.getLatinLineBreak();
        this.f48171c5 = paragraphFormat.getHangingPunctuation();
        this.f48178jd = paragraphFormat.getMarginLeft();
        this.f48172ck = paragraphFormat.getMarginRight();
        this.f48175fa = paragraphFormat.getIndent();
        this.f48188up = paragraphFormat.getDefaultTabSize();
        this.f48187u4.m2864k4((TabCollection) paragraphFormat.getTabs());
        this.f48193yj = paragraphFormat.getFontAlignment();
        this.f48177ix.m361k4((BasePortionFormat) paragraphFormat.m2204to());
        this.f48190wl.m64012k4(paragraphFormat.m2187c5().m64013k4());
        this.f48190wl.m64011k4(paragraphFormat.m2187c5().m64015x1());
        this.f48189uz.m70452k4(paragraphFormat.m2190dy().m70453k4());
        this.f48189uz.m70454x1(paragraphFormat.m2190dy().m70455x1());
        m69273um();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69315x1(short s) {
        this.f48179k4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69291k4(fqc fqcVar) {
        this.f48183ne.m436k4(fqcVar.f5106kk);
        this.f48179k4 = fqcVar.getDepth();
        this.f48191x1 = fqcVar.f5100du;
        this.f48180kk = fqcVar.f5103h4;
        this.f48186to = fqcVar.f5108m9;
        this.f48173du = fqcVar.f5101dy;
        this.f48176h4 = fqcVar.f5098c5;
        this.f48182m9 = fqcVar.f5105jd;
        this.f48174dy = fqcVar.f5099ck;
        this.f48171c5 = fqcVar.f5102fa;
        this.f48178jd = fqcVar.f5112up;
        this.f48172ck = fqcVar.f5114yj;
        this.f48175fa = fqcVar.f5107ks;
        this.f48188up = fqcVar.f5110rv;
        this.f48187u4.clear();
        for (int i = 0; i < fqcVar.f5113x6.size(); i++) {
            eza ezaVar = fqcVar.f5113x6.getValues().get_Item(i);
            this.f48187u4.add(new Tab(ezaVar.getPosition(), ezaVar.getAlignment()));
        }
        this.f48193yj = fqcVar.f5109ne;
        this.f48177ix.m2308k4(fqcVar.f5104ix);
        m69273um();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m69316x1(IParagraphFormat iParagraphFormat) {
        return this.f48183ne.m438k4(iParagraphFormat.getBullet()) && this.f48179k4 == ((ParagraphFormat) iParagraphFormat).m2192h4() && this.f48191x1 == iParagraphFormat.getAlignment() && C3085sv.m13089k4(this.f48180kk, iParagraphFormat.getSpaceWithin()) && C3085sv.m13089k4(this.f48186to, iParagraphFormat.getSpaceBefore()) && C3085sv.m13089k4(this.f48173du, iParagraphFormat.getSpaceAfter()) && this.f48176h4 == iParagraphFormat.getEastAsianLineBreak() && this.f48182m9 == iParagraphFormat.getRightToLeft() && this.f48174dy == iParagraphFormat.getLatinLineBreak() && this.f48171c5 == iParagraphFormat.getHangingPunctuation() && C3085sv.m13089k4(this.f48178jd, iParagraphFormat.getMarginLeft()) && C3085sv.m13089k4(this.f48172ck, iParagraphFormat.getMarginRight()) && C3085sv.m13089k4(this.f48175fa, iParagraphFormat.getIndent()) && C3085sv.m13089k4(this.f48188up, iParagraphFormat.getDefaultTabSize()) && this.f48187u4.equals(iParagraphFormat.getTabs()) && this.f48193yj == iParagraphFormat.getFontAlignment() && this.f48177ix.equals(iParagraphFormat.getDefaultPortionFormat());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69292k4(short s) {
        if (s < 0) {
            s = 0;
        } else if (s > 9) {
            s = 9;
        }
        if (this.f48179k4 != s) {
            this.f48179k4 = s;
            m69273um();
        }
    }
}
