package com.aspose.slides;

import android.graphics.PointF;
import android.graphics.RectF;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class Portion implements IPortion, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private PortionCollection f3046du;

    /* JADX INFO: renamed from: h4 */
    private IPresentationComponent f3047h4;

    /* JADX INFO: renamed from: k4 */
    final InterfaceC14217o7 f3048k4;

    /* JADX INFO: renamed from: kk */
    private String f3049kk;

    /* JADX INFO: renamed from: m9 */
    private ISlideComponent f3050m9;

    /* JADX INFO: renamed from: to */
    private Field f3051to;

    /* JADX INFO: renamed from: x1 */
    PortionFormat f3052x1;

    public Portion() {
        this(C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.IPortion
    public final void addField(IFieldType iFieldType) {
        this.f3051to = new Field(this, (FieldType) iFieldType);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m2278c5() {
        PortionCollection portionCollection = this.f3046du;
        if (portionCollection != null) {
            portionCollection.m2300to().m2158h4();
        }
    }

    /* JADX INFO: renamed from: ck */
    public final ISlideComponent m2279ck() {
        ISlideComponent iSlideComponent = this.f3050m9;
        if (iSlideComponent == null) {
            ISlideComponent[] iSlideComponentArr = {iSlideComponent};
            kke.m63959k4(ISlideComponent.class, this.f3046du, iSlideComponentArr);
            this.f3050m9 = iSlideComponentArr[0];
        }
        return this.f3050m9;
    }

    /* JADX INFO: renamed from: du */
    public C12025x6 m2280du() {
        C12007ix c12007ixClone = this.f3048k4.mo7668k4(true).Clone();
        return new C12025x6(c12007ixClone.m56557jd(), c12007ixClone.m56551ck());
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m2281dy() {
        if (m2295x1().m358fa()) {
            return true;
        }
        for (int i = 0; i < m2283h4().length(); i++) {
            char cCharAt = m2283h4().charAt(i);
            if ((cCharAt > 128 && cCharAt < 1424) || (cCharAt > 1535 && cCharAt < 12255)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: fa */
    public final Paragraph m2282fa() {
        PortionCollection portionCollection = this.f3046du;
        if (portionCollection != null) {
            return portionCollection.m2300to();
        }
        return null;
    }

    @Override // com.aspose.slides.IPortion
    public final PointF getCoordinates() {
        return (PointF) C12025x6.m56887x1(m2280du());
    }

    @Override // com.aspose.slides.IPortion
    public final IField getField() {
        return this.f3051to;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3046du;
    }

    @Override // com.aspose.slides.IPortion
    public final IPortionFormat getPortionFormat() {
        return this.f3052x1;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (m2279ck() != null) {
            return m2279ck().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.IPortion
    public final RectF getRect() {
        return (RectF) C12007ix.m56540h4(m2293to());
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (m2279ck() != null) {
            return m2279ck().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.IPortion
    public final String getText() {
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((m2284jd() == null || m2284jd().getPresentation() == null) ? null : (ctm) ((Presentation) m2284jd().getPresentation()).m2399x6(), bArr);
        byte[] bArr2 = bArr[0];
        strArr[0] = C3038bv.m12798to();
        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
            strArr[0] = C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
        }
        int[] iArrM12821x1 = C3052g8.f9069k4;
        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
            try {
                C3041c6.m12809k4().m12825to();
                iArrM12821x1 = C3041c6.m12821x1();
            } catch (IllegalStateException e) {
                int[] iArr = C3052g8.f9069k4;
                C3085sv.m13082k4(e);
                iArrM12821x1 = iArr;
            }
        }
        C14113y2.m67403k4(" ", strArr[0]);
        return ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1) || Arrays.equals(iArrM2334k4, r1s.f48531x1)) ? m2283h4() : C3038bv.m12790k4(m2283h4());
    }

    /* JADX INFO: renamed from: h4 */
    public final String m2283h4() {
        int slideNumber;
        if (m2291kk()) {
            IBaseSlide slide = m2279ck().getSlide();
            if (C7019kk.m27469x1(slide, Slide.class)) {
                slideNumber = ((Slide) slide).m2686ar();
            } else {
                if (!C7019kk.m27469x1(slide, NotesSlide.class)) {
                    return m2276k4();
                }
                slideNumber = ((NotesSlide) slide).getParentSlide().getSlideNumber();
            }
            String[] strArr = {null};
            boolean zM2290k4 = m2290k4(slideNumber, strArr);
            String str = strArr[0];
            if (zM2290k4) {
                m2277x1(str);
                return str;
            }
        }
        return m2276k4();
    }

    /* JADX INFO: renamed from: jd */
    public final IPresentationComponent m2284jd() {
        IPresentationComponent iPresentationComponent = this.f3047h4;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f3046du, iPresentationComponentArr);
            this.f3047h4 = iPresentationComponentArr[0];
        }
        return this.f3047h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final Portion m2285k4(PortionFormat portionFormat) {
        Portion portion = new Portion(portionFormat);
        m2295x1().m363k4(portion.m2295x1());
        portion.f3049kk = this.f3049kk;
        Field field = this.f3051to;
        if (field != null) {
            portion.f3051to = new Field(this, field);
        }
        return portion;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m2291kk() {
        return this.f3051to != null;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m2292m9() {
        if (this.f3051to == null) {
            return (m2276k4() == null || C14113y2.m67363du(m2276k4(), C14113y2.f47374k4)) ? false : true;
        }
        return true;
    }

    @Override // com.aspose.slides.IPortion
    public final void removeField() {
        this.f3051to = null;
    }

    @Override // com.aspose.slides.IPortion
    public final void setText(String str) {
        m2289k4(str);
    }

    /* JADX INFO: renamed from: to */
    public C12007ix m2293to() {
        return this.f3048k4.mo7668k4(false);
    }

    /* JADX INFO: renamed from: up */
    public final void m2294up() {
        m2295x1().m2314v4();
    }

    /* JADX INFO: renamed from: x1 */
    public final PortionFormat m2295x1() {
        return this.f3052x1;
    }

    public Portion(Portion portion) {
        this(C14113y2.f47374k4);
        this.f3052x1.m361k4((BasePortionFormat) portion.f3052x1);
        this.f3049kk = portion.m2276k4();
        if (portion.m2291kk()) {
            this.f3051to = new Field(this, portion.f3051to);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m2276k4() {
        return this.f3049kk;
    }

    /* JADX INFO: renamed from: x1 */
    private void m2277x1(String str) {
        this.f3049kk = str;
    }

    @Override // com.aspose.slides.IPortion
    public final void addField(String str) {
        this.f3051to = new Field(this, new FieldType(str));
    }

    public Portion(PortionFormat portionFormat) {
        this(C14113y2.f47374k4);
        this.f3052x1.m361k4((BasePortionFormat) portionFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m2286k4(int i) {
        String[] strArr = {null};
        boolean zM2290k4 = m2290k4(i, strArr);
        String str = strArr[0];
        if (!zM2290k4) {
            return m2276k4();
        }
        m2277x1(str);
        return str;
    }

    public Portion(PortionFormat portionFormat, PortionCollection portionCollection) {
        this.f3049kk = "";
        if (portionCollection == null) {
            throw new ArgumentNullException("container");
        }
        this.f3049kk = C14113y2.f47374k4;
        this.f3046du = portionCollection;
        PortionFormat portionFormat2 = new PortionFormat(this);
        this.f3052x1 = portionFormat2;
        portionFormat2.m361k4((BasePortionFormat) portionFormat);
        this.f3048k4 = new ikt(this);
        portionCollection.m2298k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2287k4(Portion portion) {
        m2295x1().m361k4((BasePortionFormat) portion.m2295x1());
        if (portion.m2291kk()) {
            this.f3051to = new Field(this, portion.f3051to);
        }
    }

    public Portion(String str) {
        this.f3049kk = "";
        this.f3052x1 = new PortionFormat(this);
        this.f3049kk = str;
        this.f3048k4 = new ikt(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2288k4(PortionCollection portionCollection) {
        this.f3046du = portionCollection;
        this.f3047h4 = null;
        this.f3050m9 = null;
        if (portionCollection == null || this.f3052x1.getLanguageId() != null || m2284jd() == null || m2284jd().getPresentation() == null) {
            return;
        }
        this.f3052x1.setLanguageId(((Presentation) m2284jd().getPresentation()).m2350dy());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2289k4(String str) {
        if (C14113y2.m67384k4(str, ParagraphCollection.f2953k4) != -1) {
            throw new PptxException("Can't assign string which contains paragraph break character");
        }
        String strM2276k4 = m2276k4();
        m2277x1(str);
        if (C14113y2.m67363du(m2276k4(), strM2276k4)) {
            return;
        }
        m2278c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2290k4(int i, String[] strArr) {
        IField field = getField();
        if (field != null) {
            if ("slidenum".equals(field.getType().getInternalString())) {
                strArr[0] = i != -1 ? C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()) : C14113y2.f47374k4;
                return true;
            }
            if (FieldType.m1448k4().containsItem((FieldType) field.getType())) {
                strArr[0] = PresentationHeaderFooterManager.m2415k4(field.getType().getInternalString(), getPortionFormat() != null ? getPortionFormat().getLanguageId() : null);
                return true;
            }
        }
        strArr[0] = null;
        return false;
    }
}
