package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p314oc.InterfaceC7014c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class s8c implements InterfaceC13762l4 {

    /* JADX INFO: renamed from: du */
    private final Dictionary<IParagraph, Object> f48774du = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    private ay6 f48775k4;

    /* JADX INFO: renamed from: kk */
    private final ghm f48776kk;

    /* JADX INFO: renamed from: to */
    private nrw[] f48777to;

    /* JADX INFO: renamed from: x1 */
    private final TextFrame f48778x1;

    static {
        C7019kk.m27454k4(in8.class, (InterfaceC7014c5) new InterfaceC7014c5<in8>() { // from class: com.aspose.slides.s8c.1
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public in8 mo838x1() {
                return new in8();
            }
        });
        C7019kk.m27454k4(ypz.class, (InterfaceC7014c5) new InterfaceC7014c5<ypz>() { // from class: com.aspose.slides.s8c.2
            @Override // com.aspose.slides.internal.p314oc.InterfaceC7014c5
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public ypz mo838x1() {
                return new ypz();
            }
        });
    }

    public s8c(TextFrame textFrame) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        this.f48778x1 = textFrame;
        this.f48776kk = new ghm((Presentation) textFrame.getSlide().getPresentation());
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: du */
    public final void mo64286du() {
        this.f48775k4 = null;
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: dy */
    public final oju mo64287dy() {
        if (this.f48775k4 == null) {
            return oju.f47834kk;
        }
        oju ojuVarClone = oju.f47834kk.Clone();
        oju ojuVarClone2 = mo64296kk().Clone();
        ay6 ay6Var = this.f48775k4;
        float fM3848jd = (ay6Var == null || !ay6Var.m3842c5()) ? ojuVarClone2.f47836k4 : this.f48775k4.m3848jd();
        byte bM2958lr = mo64289k4().f3519k4.m2958lr();
        if (bM2958lr == 1 || bM2958lr == 2 || bM2958lr == 4 || bM2958lr == 5 || bM2958lr == 3 || bM2958lr == 6) {
            ojuVarClone.f47836k4 += ojuVarClone2.f47837x1;
            ojuVarClone.f47837x1 += fM3848jd;
            return ojuVarClone;
        }
        ojuVarClone.f47836k4 += fM3848jd;
        ojuVarClone.f47837x1 += ojuVarClone2.f47837x1;
        return ojuVarClone;
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: h4 */
    public final in8[] mo64288h4() {
        vyd[] vydVarArrM3866up = this.f48775k4.m3866up();
        if (vydVarArrM3866up == null) {
            return (in8[]) C22200OooO0o0.OooO00o(in8.class, 0);
        }
        in8[] in8VarArr = (in8[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) in8.class), vydVarArrM3866up.length));
        for (int i = 0; i < in8VarArr.length; i++) {
            vyd vydVar = vydVarArrM3866up[i];
            in8VarArr[i] = new in8();
            vydVar.m72586c5().CloneTo(in8VarArr[i].f5737k4);
            vydVar.f49716du.CloneTo(in8VarArr[i].f5740x1);
            in8VarArr[i].f5738kk = vydVar.m72590fa();
            in8VarArr[i].f5739to = vydVar.m72600up();
            in8VarArr[i].f5736du = !vydVar.f49722kk.mo6447k4(vydVar.f49725to);
        }
        return in8VarArr;
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: k4 */
    public final TextFrame mo64289k4() {
        return this.f48778x1;
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: kk */
    public final oju mo64296kk() {
        return this.f48775k4 != null ? new oju(this.f48775k4.m3845dy(), this.f48775k4.m3844du()) : oju.f47834kk;
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: m9 */
    public final ypz[] mo64297m9() {
        int[] iArrM3847h4 = this.f48775k4.m3847h4();
        ypz[] ypzVarArr = (ypz[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) ypz.class), iArrM3847h4.length));
        for (int i = 0; i < iArrM3847h4.length; i++) {
            ypzVarArr[i].f50390k4 = iArrM3847h4[i];
        }
        return ypzVarArr;
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: to */
    public final boolean mo64298to() {
        return this.f48775k4.m3846fa();
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: x1 */
    public final int mo64299x1(Paragraph paragraph) {
        return this.f48775k4.m3849k4(paragraph);
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: k4 */
    public final ohe mo64290k4(Paragraph paragraph) {
        return this.f48775k4.m3868x1(paragraph);
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: x1 */
    public final oju mo64300x1() {
        ay6 ay6Var = this.f48775k4;
        if (ay6Var == null) {
            return oju.f47834kk;
        }
        float fM67504x1 = Float.MAX_VALUE;
        for (vyd vydVar : ay6Var.m3866up()) {
            fM67504x1 = C14116yg.m67504x1(fM67504x1, vydVar.m72587ck());
        }
        return new oju(fM67504x1, this.f48775k4.m3843ck().f47837x1);
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: k4 */
    public final ohe mo64291k4(Portion portion, boolean z) {
        return this.f48775k4.m3851k4(portion, z);
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: k4 */
    public final String mo64292k4(float f, float f2, boolean z) {
        return this.f48775k4.m3856k4(f, f2, z);
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: k4 */
    public final void mo64293k4(int i, int i2, boolean z) {
        while (i <= i2) {
            IParagraph iParagraph = mo64289k4().getParagraphs().get_Item(i);
            Dictionary<IParagraph, Object> dictionary = this.f48774du;
            if (z) {
                dictionary.set_Item(iParagraph, null);
            } else {
                dictionary.removeItemByKey(iParagraph);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70474k4(ay6 ay6Var, float f, IPlaceholder iPlaceholder) {
        TextFrameFormat textFrameFormat = mo64289k4().f3519k4;
        w0l w0lVarM2937b3 = textFrameFormat.m2937b3();
        float fM72618m9 = w0lVarM2937b3.m72618m9();
        float fM72611dy = w0lVarM2937b3.m72611dy();
        double d = fM72618m9;
        float f2 = 1.0f;
        if (d < 1.0d || fM72611dy > 0.0f) {
            float fM3864m9 = ay6Var.m3864m9();
            if (d < 1.0d) {
                fM72618m9 += 0.025f;
            }
            ay6Var.m3869x1(fM72618m9, 0.0f);
            if (ay6Var.m3864m9() > f && fM3864m9 < f) {
                ay6Var.m3869x1(textFrameFormat.m2940ck(), textFrameFormat.m2946fa());
                return;
            } else {
                fM72618m9 = 1.0f;
                fM72611dy = 0.0f;
            }
        }
        textFrameFormat.m2950k4((byte) 1);
        if (ay6Var.m3864m9() > f) {
            if (iPlaceholder == null || TextFrame.f3512du.m13012x1(Byte.valueOf(iPlaceholder.getType())).intValue() != 1) {
                float f3 = 0.25f;
                while (true) {
                    if (f2 - f3 <= 0.02510000037252903d) {
                        break;
                    }
                    float fM67497to = (float) ((C14116yg.m67497to((r9 / 0.025f) / 2.0f) * 0.02500000037252903d) + ((double) f3));
                    ay6Var.m3869x1(fM67497to, 0.2f);
                    if (ay6Var.m3864m9() > f) {
                        f2 = fM67497to;
                    } else {
                        f3 = fM67497to;
                    }
                }
                ay6Var.m3869x1(f2, 0.0f);
                while (f2 >= f3) {
                    while (fM72611dy <= 0.2f) {
                        ay6Var.m3860k4(f, fM72611dy);
                        float fM3864m92 = f / ay6Var.m3864m9();
                        if (fM3864m92 > 1.05f) {
                            if (fM72611dy == 0.2f) {
                                float f4 = f2;
                                while (true) {
                                    if (f4 < f2 - 0.075f) {
                                        break;
                                    }
                                    f4 -= 0.025f;
                                    ay6Var.m3869x1(f4, 0.1f);
                                    float fM3864m93 = f / ay6Var.m3864m9();
                                    if (fM3864m93 < fM3864m92) {
                                        if (fM3864m93 > 1.05f) {
                                            textFrameFormat.m2951k4(f4);
                                            textFrameFormat.m2971x1(0.1f);
                                            return;
                                        }
                                    }
                                }
                            }
                            textFrameFormat.m2951k4(f2);
                            textFrameFormat.m2971x1(fM72611dy);
                            vyd[] vydVarArrM3866up = ay6Var.m3866up();
                            if (vydVarArrM3866up == null || vydVarArrM3866up.length != 1) {
                                return;
                            }
                            textFrameFormat.m2971x1(0.2f);
                            return;
                        }
                        fM72611dy += 0.1f;
                    }
                    f2 -= 0.025f;
                    ay6Var.m3869x1(f2, 0.0f);
                    fM72611dy = 0.0f;
                }
                fM72618m9 = f2;
                fM72611dy = 0.2f;
            } else {
                fM72618m9 = 0.9f;
                ay6Var.m3869x1(0.9f, fM72611dy);
            }
        }
        textFrameFormat.m2951k4(fM72618m9);
        textFrameFormat.m2971x1(fM72611dy);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo64294k4(oju ojuVar, kg7 kg7Var) {
        int slideNumber;
        if (kg7Var == null) {
            slideNumber = 0;
        } else {
            Slide slide = (Slide) C7019kk.m27452k4((Object) kg7Var.m63845kk(), Slide.class);
            if (slide != null) {
                slideNumber = slide.m2686ar();
            } else {
                NotesSlide notesSlide = (NotesSlide) C7019kk.m27452k4((Object) kg7Var.m63845kk(), NotesSlide.class);
                if (notesSlide != null) {
                    slideNumber = notesSlide.getParentSlide().getSlideNumber();
                } else if (kg7Var.m63845kk() != null) {
                    slideNumber = -1;
                }
            }
        }
        this.f48777to = nrw.m68188k4(mo64289k4(), slideNumber);
        this.f48775k4 = new ay6(mo64289k4(), ojuVar.Clone(), mo64289k4().getSlide(), this.f48776kk, this.f48777to);
        ITextFrameFormatEffectiveData effective = mo64289k4().getTextFrameFormat().getEffective();
        InterfaceC14397rj parent_Immediate = mo64289k4().getParent_Immediate();
        if (C7019kk.m27469x1(parent_Immediate, Shape.class)) {
            Shape shape = (Shape) parent_Immediate;
            if (effective.getAutofitType() != 1 || (shape.mo275c5() & 4294967295L) == (4294967295L & shape.f3301ck)) {
                return;
            }
            m70474k4(this.f48775k4, ojuVar.f47837x1, shape.getPlaceholder());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m70476k4(IParagraph iParagraph) {
        return !this.f48774du.containsKey(iParagraph);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m70475k4(TextFrame textFrame) {
        IGenericEnumerator<IParagraph> it = textFrame.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IPortion> it2 = it.next().getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        MathPortion mathPortion = (MathPortion) C7019kk.m27452k4((Object) it2.next(), MathPortion.class);
                        if (mathPortion != null && !q1h.m69381k4(mathPortion.getMathParagraph())) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return false;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return true;
        }
        it.dispose();
        return true;
    }

    @Override // com.aspose.slides.InterfaceC13762l4
    /* JADX INFO: renamed from: k4 */
    public final boolean mo64295k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var) throws Throwable {
        if (this.f48775k4 == null || !jq6.m63488k4(mo64289k4())) {
            return false;
        }
        this.f48775k4.m3861k4(abstractC14897zn, kg7Var, this);
        return true;
    }
}
