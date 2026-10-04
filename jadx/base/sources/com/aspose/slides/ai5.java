package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10382c3;
import com.aspose.slides.internal.p407st.C10475i3;
import com.aspose.slides.internal.p407st.C10512ko;
import com.aspose.slides.internal.p407st.C10536m5;
import com.aspose.slides.internal.p407st.C10546mr;
import com.aspose.slides.internal.p407st.C10597pu;
import com.aspose.slides.internal.p407st.C10630s4;
import com.aspose.slides.internal.p407st.C10751zg;
import com.aspose.slides.internal.p407st.C10752zi;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ai5 {

    /* JADX INFO: renamed from: k4 */
    private static final SortedList<Integer, String> f3907k4;

    /* JADX INFO: renamed from: com.aspose.slides.ai5$k4 */
    public static class C0751k4 {

        /* JADX INFO: renamed from: kk */
        float f3909kk;

        /* JADX INFO: renamed from: to */
        float f3910to;

        /* JADX INFO: renamed from: k4 */
        C14093tq<Short> f3908k4 = new C14093tq<>();

        /* JADX INFO: renamed from: x1 */
        C14093tq<Short> f3911x1 = new C14093tq<>();
    }

    static {
        SortedList<Integer, String> sortedList = new SortedList<>();
        f3907k4 = sortedList;
        sortedList.addItem(30724, TranslateLanguage.CHINESE);
    }

    /* JADX INFO: renamed from: du */
    public static int m3596du(int i) {
        if ((((long) i) & 4294967295L) > 3) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: h4 */
    private static int m3597h4(int i) {
        switch (i) {
            case -1:
                return -1;
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 5;
            case 5:
                return 3;
            case 6:
                return 4;
            default:
                throw new ArgumentOutOfRangeException(C14113y2.m67402k4("alignment: {0}", C14042ak.m66410k4(C10512ko.class, i)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static float m3598k4(short s) {
        return s < 0 ? s / 8.0f : s;
    }

    /* JADX INFO: renamed from: kk */
    public static int m3615kk(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 0;
                    }
                    throw new ArgumentOutOfRangeException();
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: m9 */
    private static int m3616m9(int i) {
        switch (i) {
            case -1:
                return -1;
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 4;
            default:
                throw new ArgumentOutOfRangeException(C14113y2.m67402k4("alignment: {0}", C14042ak.m66410k4(TextAlignment.class, i)));
        }
    }

    /* JADX INFO: renamed from: to */
    public static int m3617to(int i) {
        if ((((long) i) & 4294967295L) > 3) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    public static float m3618x1(short s) {
        return s / 8.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static ParagraphFormat m3599k4(TextStyle textStyle, C10546mr c10546mr, C10630s4 c10630s4, C10597pu c10597pu, a3u a3uVar) {
        ParagraphFormat paragraphFormat = new ParagraphFormat(textStyle);
        PortionFormat portionFormat = (PortionFormat) paragraphFormat.getDefaultPortionFormat();
        m3612k4(c10546mr, c10630s4, paragraphFormat, a3uVar);
        m3613k4(c10597pu, portionFormat, a3uVar.m71946k4().m2389rv().m6639k4(), (klp) null);
        return paragraphFormat;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m3619x1(int i) {
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10536m5 m3600k4(ITextStyle iTextStyle, y2n y2nVar) {
        IParagraphFormat level;
        if (iTextStyle == null) {
            return null;
        }
        C10536m5 c10536m5 = new C10536m5();
        TextStyle textStyle = (TextStyle) iTextStyle;
        if (textStyle.m2979du().m67302x1()) {
            c10536m5.m51409um().m51920k4((short) textStyle.m2979du().m67297k4().intValue());
        }
        for (int i = 0; i < 5 && (level = iTextStyle.getLevel(i)) != null; i++) {
            C10752zi c10752zi = new C10752zi(65535 & i);
            c10536m5.m51276to().addItem(c10752zi);
            m3604k4(level, c10752zi.m52146k4(), y2nVar);
            m3605k4(level.getDefaultPortionFormat(), c10752zi.m52151x1(), y2nVar);
        }
        if (c10536m5.m51276to().size() < 1) {
            return null;
        }
        return c10536m5;
    }

    /* JADX INFO: renamed from: x1 */
    public static short m3620x1(float f) {
        return C7019kk.m27468x1(Float.valueOf(f * 8.0f), 13);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14093tq<Integer> m3601k4(String str) {
        if (str == null) {
            return new C14093tq<>();
        }
        try {
            C11697x1 c11697x1 = new C11697x1(str);
            return c11697x1.m55262dy() < 1024 ? new C14093tq<>() : new C14093tq<>(Integer.valueOf(c11697x1.m55262dy()));
        } catch (RuntimeException unused) {
            SortedList<Integer, String> sortedList = f3907k4;
            return sortedList.containsValue(str) ? new C14093tq<>(sortedList.getKeys().get_Item(sortedList.indexOfValue(str))) : new C14093tq<>();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m3621x1(IPortionFormat iPortionFormat, C10597pu c10597pu, y2n y2nVar) {
        C13827mb c13827mbM6639k4 = y2nVar.m71946k4().m2389rv().m6639k4();
        if (iPortionFormat.getComplexScriptFont() == null || !C14093tq.m67295k4(c10597pu.m51520jd(), null)) {
            return;
        }
        c10597pu.m51528kk(new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64808kk(c13827mbM6639k4.m64799k4(2, y2nVar.m73699k4(iPortionFormat.getComplexScriptFont(), iPortionFormat.getLanguageId()))))));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m3602k4(int i) {
        int i2 = 65535 & i;
        if (i2 == 0) {
            return "en-US";
        }
        try {
            return new C11697x1(i2).m55259c5();
        } catch (RuntimeException unused) {
            SortedList<Integer, String> sortedList = f3907k4;
            return sortedList.containsKey(Integer.valueOf(i)) ? sortedList.get_Item(Integer.valueOf(i)) : "en-US";
        }
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: renamed from: x1 */
    public static void m3622x1(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: k4 */
    public static short m3603k4(float f) {
        if (f < 0.0f) {
            f *= 8.0f;
        }
        return C7019kk.m27468x1(Float.valueOf(f), 13);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3604k4(IParagraphFormat iParagraphFormat, C10546mr c10546mr, y2n y2nVar) {
        C14093tq<Short> c14093tq;
        C14093tq<Integer> c14093tq2;
        if (iParagraphFormat == null) {
            return;
        }
        IBulletFormat bullet = iParagraphFormat.getBullet();
        if (bullet.getType() != -1) {
            c10546mr.m51315k4(bullet.getType() != 0 ? (byte) 1 : (byte) 0);
        } else {
            c10546mr.m51315k4((byte) -1);
        }
        c10546mr.m51339x1(iParagraphFormat.getBullet().isBulletHardFont());
        c10546mr.m51321kk(iParagraphFormat.getBullet().isBulletHardColor());
        if (C14064he.m66715kk(iParagraphFormat.getBullet().getHeight())) {
            c10546mr.m51331to((byte) -1);
            c14093tq = new C14093tq<>();
        } else {
            c10546mr.m51331to((byte) 1);
            c14093tq = new C14093tq<>(Short.valueOf((short) iParagraphFormat.getBullet().getHeight()));
        }
        c10546mr.m51322kk(c14093tq);
        c10546mr.m51318k4(((short) iParagraphFormat.getBullet().getChar()) != -1 ? new C14093tq<>(Short.valueOf((short) iParagraphFormat.getBullet().getChar())) : new C14093tq<>());
        C13827mb c13827mbM6639k4 = y2nVar.m71946k4().m2389rv().m6639k4();
        if (iParagraphFormat.getBullet().getFont() != null) {
            c10546mr.m51340x1(new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64808kk(c13827mbM6639k4.m64799k4(0, y2nVar.m73699k4(iParagraphFormat.getBullet().getFont(), (String) null))))));
        } else if (iParagraphFormat.getBullet().isBulletHardFont() == 0) {
            c10546mr.m51340x1(new C14093tq<>(65535));
        }
        if (iParagraphFormat.getBullet().isBulletHardColor() == 1) {
            c10546mr.m51317k4(C14294pm.m69137k4(iParagraphFormat.getBullet().getColor()));
        }
        c10546mr.m51332to(iParagraphFormat.getAlignment() != -1 ? new C14093tq<>(Integer.valueOf(m3616m9(iParagraphFormat.getAlignment()))) : new C14093tq<>());
        c10546mr.m51303du(!C14064he.m66715kk(iParagraphFormat.getSpaceWithin()) ? new C14093tq<>(Short.valueOf(m3603k4(iParagraphFormat.getSpaceWithin()))) : new C14093tq<>());
        c10546mr.m51310h4(!C14064he.m66715kk(iParagraphFormat.getSpaceBefore()) ? new C14093tq<>(Short.valueOf(m3603k4(iParagraphFormat.getSpaceBefore()))) : new C14093tq<>());
        c10546mr.m51327m9(!C14064he.m66715kk(iParagraphFormat.getSpaceAfter()) ? new C14093tq<>(Short.valueOf(m3603k4(iParagraphFormat.getSpaceAfter()))) : new C14093tq<>());
        C0751k4 c0751k4 = new C0751k4();
        c0751k4.f3909kk = iParagraphFormat.getMarginLeft();
        c0751k4.f3910to = iParagraphFormat.getIndent();
        m3622x1(c0751k4);
        c10546mr.m51305dy(c0751k4.f3908k4.Clone());
        c10546mr.m51298c5(c0751k4.f3911x1.Clone());
        c10546mr.m51313jd(!C14044b3.m66437kk((double) iParagraphFormat.getDefaultTabSize()) ? new C14093tq<>(Short.valueOf(m3620x1(iParagraphFormat.getDefaultTabSize()))) : new C14093tq<>());
        ParagraphFormat paragraphFormat = (ParagraphFormat) iParagraphFormat;
        if (paragraphFormat.m2188ck() > 0) {
            c10546mr.m51316k4(new C10475i3());
            IGenericEnumerator<ITab> it = iParagraphFormat.getTabs().iterator();
            while (it.hasNext()) {
                try {
                    ITab next = it.next();
                    c10546mr.m51329rv().m50903k4(new C10751zg(C7019kk.m27468x1(Double.valueOf(next.getPosition() * 8.0d), 14), m3596du(next.getAlignment())));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        } else {
            c10546mr.m51316k4((C10475i3) null);
        }
        c10546mr.m51300ck(iParagraphFormat.getFontAlignment() != -1 ? new C14093tq<>(Integer.valueOf(m3615kk(iParagraphFormat.getFontAlignment()))) : new C14093tq<>());
        if (iParagraphFormat.getRightToLeft() != -1) {
            c14093tq2 = new C14093tq<>(Integer.valueOf(iParagraphFormat.getRightToLeft() == 1 ? 1 : 0));
        } else {
            c14093tq2 = new C14093tq<>();
        }
        c10546mr.m51307fa(c14093tq2);
        c10546mr.m51302du(iParagraphFormat.getEastAsianLineBreak());
        c10546mr.m51326m9(iParagraphFormat.getHangingPunctuation());
        if (paragraphFormat.m2190dy().m70453k4()) {
            c10546mr.m51309h4(paragraphFormat.m2190dy().m70455x1() ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3605k4(IPortionFormat iPortionFormat, C10597pu c10597pu, y2n y2nVar) {
        C14093tq<Integer> c14093tq;
        if (iPortionFormat == null) {
            return;
        }
        c10597pu.m51522k4(iPortionFormat.getFontBold());
        c10597pu.m51539x1(iPortionFormat.getFontItalic());
        if (iPortionFormat.getFontUnderline() != -1) {
            c10597pu.m51527kk(iPortionFormat.getFontUnderline() != 0 ? (byte) 1 : (byte) 0);
        } else {
            c10597pu.m51527kk((byte) -1);
        }
        if (!((EffectFormat) iPortionFormat.getEffectFormat()).m1390to() || !iPortionFormat.getEffectFormat().isNoEffects()) {
            c10597pu.m51535to((iPortionFormat.getEffectFormat().getInnerShadowEffect() == null && iPortionFormat.getEffectFormat().getOuterShadowEffect() == null && iPortionFormat.getEffectFormat().getPresetShadowEffect() == null) ? (byte) -1 : (byte) 1);
            if (iPortionFormat.getEffectFormat().getOuterShadowEffect() != null && iPortionFormat.getEffectFormat().getOuterShadowEffect().getShadowColor().getColorType() == -1) {
                c10597pu.m51535to((byte) 0);
            }
        }
        c10597pu.m51518h4(iPortionFormat.getKumimoji());
        C13827mb c13827mbM6639k4 = y2nVar.m71946k4().m2389rv().m6639k4();
        if (iPortionFormat.getLatinFont() != null) {
            c10597pu.m51540x1(new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64808kk(c13827mbM6639k4.m64799k4(0, y2nVar.m73699k4(iPortionFormat.getLatinFont(), (String) null))))));
        }
        if (iPortionFormat.getEastAsianFont() != null) {
            c10597pu.m51528kk(new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64808kk(c13827mbM6639k4.m64799k4(1, y2nVar.m73699k4(iPortionFormat.getEastAsianFont(), iPortionFormat.getLanguageId()))))));
        }
        if (iPortionFormat.getSymbolFont() != null) {
            c10597pu.m51514du(new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64808kk(c13827mbM6639k4.m64799k4(0, y2nVar.m73699k4(iPortionFormat.getSymbolFont(), (String) null))))));
        }
        PortionFormat portionFormat = (PortionFormat) iPortionFormat;
        if (portionFormat.m2311ne().m4586x1() == null) {
            if (iPortionFormat.getLatinFont() != null) {
                c14093tq = new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64808kk(c13827mbM6639k4.m64799k4(0, y2nVar.m73699k4(iPortionFormat.getLatinFont(), (String) null)))));
            }
            c10597pu.m51519h4(C14064he.m66715kk(iPortionFormat.getFontHeight()) ? new C14093tq<>(Short.valueOf((short) iPortionFormat.getFontHeight())) : new C14093tq<>());
            if (iPortionFormat.getFillFormat().getFillType() == 1) {
                c10597pu.m51523k4(C14294pm.m69137k4(iPortionFormat.getFillFormat().getSolidFillColor()));
            }
            if (C14064he.m66715kk(iPortionFormat.getEscapement())) {
                c10597pu.m51532m9(new C14093tq<>(Short.valueOf((short) iPortionFormat.getEscapement())));
                return;
            }
            return;
        }
        c14093tq = new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64808kk(c13827mbM6639k4.m64799k4(0, y2nVar.m73699k4(portionFormat.m2311ne().m4586x1(), (String) null)))));
        c10597pu.m51536to(c14093tq);
        c10597pu.m51519h4(C14064he.m66715kk(iPortionFormat.getFontHeight()) ? new C14093tq<>(Short.valueOf((short) iPortionFormat.getFontHeight())) : new C14093tq<>());
        if (iPortionFormat.getFillFormat().getFillType() == 1) {
        }
        if (C14064he.m66715kk(iPortionFormat.getEscapement())) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3606k4(PortionFormat portionFormat, klp klpVar) {
        if (klpVar.m63995ks() && portionFormat.getEastAsianFont() != null) {
            portionFormat.setComplexScriptFont(portionFormat.getEastAsianFont());
            portionFormat.setEastAsianFont(null);
        }
        if (klpVar.m63999x1() == null || klpVar.m63999x1().m70150uz() < 0 || portionFormat.getEffectFormat() == null || portionFormat.getEffectFormat().getOuterShadowEffect() == null || portionFormat.getFillFormat().getFillType() != 1 || C14116yg.m67477k4(((ColorFormat) portionFormat.getFillFormat().getSolidFillColor()).m1084to().m56512m9(), 2) > 0.5d) {
            return;
        }
        ((ColorFormat) portionFormat.getEffectFormat().getOuterShadowEffect().getShadowColor()).m1080k4(C12003du.m56385i5().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3607k4(C0751k4 c0751k4) {
        float fM3618x1;
        float fM3618x12;
        boolean zM67302x1 = c0751k4.f3908k4.m67302x1();
        boolean zM67302x12 = c0751k4.f3911x1.m67302x1();
        if (zM67302x1) {
            fM3618x12 = m3618x1(c0751k4.f3908k4.m67297k4().shortValue());
            c0751k4.f3909kk = fM3618x12;
            fM3618x1 = zM67302x12 ? m3618x1(c0751k4.f3911x1.m67297k4().shortValue()) - c0751k4.f3909kk : -fM3618x12;
        } else if (zM67302x12) {
            c0751k4.f3909kk = 0.0f;
            fM3618x12 = m3618x1(c0751k4.f3911x1.m67297k4().shortValue());
        } else {
            fM3618x1 = Float.NaN;
            c0751k4.f3909kk = Float.NaN;
        }
        c0751k4.f3910to = fM3618x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3608k4(C10382c3 c10382c3, IParagraphFormat iParagraphFormat, IPortionFormat iPortionFormat) {
        if (!"".equals(iPortionFormat.getLanguageId())) {
            c10382c3.m50525k4(m3601k4(iPortionFormat.getLanguageId()).Clone());
        }
        if ("".equals(iPortionFormat.getAlternativeLanguageId())) {
            return;
        }
        c10382c3.m50530x1(m3601k4(iPortionFormat.getAlternativeLanguageId()).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3609k4(C10382c3 c10382c3, ParagraphFormat paragraphFormat, PortionFormat portionFormat) {
        if (portionFormat != null) {
            if (c10382c3.m50522k4().m67302x1()) {
                portionFormat.setLanguageId(m3602k4(c10382c3.m50522k4().m67297k4().intValue()));
            }
            if (c10382c3.m50529x1().m67302x1()) {
                portionFormat.setAlternativeLanguageId(m3602k4(c10382c3.m50529x1().m67297k4().intValue()));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3610k4(C10536m5 c10536m5) {
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3611k4(C10536m5 c10536m5, ITextStyle iTextStyle, y2n y2nVar) {
        if (c10536m5 != null && c10536m5.m51275kk()) {
            C10536m5 c10536m5M3600k4 = m3600k4(iTextStyle, y2nVar);
            if (c10536m5M3600k4 != null) {
                c10536m5.m51276to().clear();
                c10536m5.m51276to().addRange(c10536m5M3600k4.m51276to());
                c10536m5.m51274k4(false);
            }
            if (c10536m5.m51276to().size() <= 0 || c10536m5.m51408lr() >= 5) {
                return;
            }
            c10536m5.m51276to().get_Item(0).m52151x1().m51525k4(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3612k4(C10546mr c10546mr, C10630s4 c10630s4, ParagraphFormat paragraphFormat, a3u a3uVar) {
        C0790b2 c0790b2M440m9;
        short sShortValue;
        if (c10546mr == null || paragraphFormat == null) {
            return;
        }
        C13827mb c13827mbM6639k4 = a3uVar.m71946k4().m2389rv().m6639k4();
        BulletFormat bulletFormatM2206x1 = paragraphFormat.m2206x1();
        byte bM51314k4 = c10546mr.m51314k4();
        if (bM51314k4 == -1) {
            bulletFormatM2206x1.setType((byte) -1);
        } else {
            bulletFormatM2206x1.setType(bM51314k4 == 1 ? (byte) 1 : (byte) 0);
        }
        bulletFormatM2206x1.setBulletHardColor(c10546mr.m51320kk());
        bulletFormatM2206x1.setBulletHardFont(c10546mr.m51338x1());
        if (c10546mr.m51301du().m67302x1()) {
            if (c10546mr.m51301du().m67297k4().shortValue() == 0) {
                c0790b2M440m9 = bulletFormatM2206x1.m440m9();
                sShortValue = 32;
            } else {
                c0790b2M440m9 = bulletFormatM2206x1.m440m9();
                sShortValue = c10546mr.m51301du().m67297k4().shortValue();
            }
            c0790b2M440m9.m3940k4(sShortValue);
        }
        if (c10546mr.m51308h4().m67302x1() && (c10546mr.m51308h4().m67297k4().intValue() & 65535) != 65535) {
            bulletFormatM2206x1.setFont((FontData) c13827mbM6639k4.m64812x1(c10546mr.m51308h4().m67297k4().intValue() & 65535).m70073x1());
        }
        if (c10546mr.m51325m9().m67302x1() && c10546mr.m51325m9().m67297k4().shortValue() > 24 && c10546mr.m51325m9().m67297k4().shortValue() < 401) {
            bulletFormatM2206x1.setHeight(c10546mr.m51325m9().m67297k4().shortValue());
        }
        if (c10546mr.m51304dy() != null) {
            C14294pm.m69145k4(bulletFormatM2206x1.getColor(), c10546mr.m51304dy());
        }
        if (c10630s4 != null) {
            if (c10630s4.m51671x1() == 1) {
                paragraphFormat.m2206x1().setType((byte) 2);
                paragraphFormat.m2206x1().setNumberedBulletStyle((byte) 3);
                paragraphFormat.m2206x1().setNumberedBulletStartWith((short) 1);
            }
            if (c10630s4.m51670kk() != null) {
                paragraphFormat.m2206x1().setNumberedBulletStyle((byte) c10630s4.m51670kk().m50690k4());
                paragraphFormat.m2206x1().setNumberedBulletStartWith(c10630s4.m51670kk().m50695x1());
                paragraphFormat.m2206x1().setType((byte) 2);
            }
            if (c10630s4.m51671x1() == 0 && c10630s4.m51666k4().m67302x1() && (c10630s4.m51666k4().m67297k4().shortValue() & 65535) != 65535) {
                paragraphFormat.m2206x1().setType((byte) 3);
                paragraphFormat.m2206x1().getPicture().setImage(a3uVar.m71945jd().get_Item(Integer.valueOf(c10630s4.m51666k4().m67297k4().intValue())).m71722kk());
            }
        }
        if (c10546mr.m51297c5().m67302x1()) {
            paragraphFormat.setAlignment(m3597h4(c10546mr.m51297c5().m67297k4().intValue()));
        } else {
            paragraphFormat.setAlignment(-1);
        }
        if (c10546mr.m51312jd().m67302x1()) {
            paragraphFormat.setSpaceWithin(m3598k4(c10546mr.m51312jd().m67297k4().shortValue()));
        }
        if (c10546mr.m51299ck().m67302x1()) {
            paragraphFormat.setSpaceBefore(m3598k4(c10546mr.m51299ck().m67297k4().shortValue()));
        }
        if (c10546mr.m51306fa().m67302x1()) {
            paragraphFormat.setSpaceAfter(m3598k4(c10546mr.m51306fa().m67297k4().shortValue()));
        }
        if (c10546mr.m51343yj().m67302x1() || c10546mr.m51335up().m67302x1()) {
            C0751k4 c0751k4 = new C0751k4();
            c10546mr.m51335up().CloneTo(c0751k4.f3908k4);
            c10546mr.m51343yj().CloneTo(c0751k4.f3911x1);
            m3607k4(c0751k4);
            paragraphFormat.setMarginLeft(c0751k4.f3909kk);
            paragraphFormat.setIndent(c0751k4.f3910to);
        }
        if (c10546mr.m51324ks().m67302x1()) {
            paragraphFormat.setDefaultTabSize(m3618x1(c10546mr.m51324ks().m67297k4().shortValue()));
        }
        paragraphFormat.getTabs().clear();
        if (c10546mr.m51329rv() != null) {
            IGenericEnumerator<C10751zg> it = c10546mr.m51329rv().iterator();
            while (it.hasNext()) {
                try {
                    C10751zg next = it.next();
                    paragraphFormat.getTabs().add(((double) next.m52139k4()) / 8.0d, m3617to(next.m52143kk()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (c10546mr.m51342x6().m67302x1()) {
            paragraphFormat.setFontAlignment(m3619x1(c10546mr.m51342x6().m67297k4().intValue()));
        }
        if (c10546mr.m51336uz().m67302x1()) {
            paragraphFormat.setRightToLeft(c10546mr.m51336uz().m67297k4().intValue() == 1 ? (byte) 1 : (byte) 0);
        }
        paragraphFormat.setEastAsianLineBreak(c10546mr.m51328ne());
        paragraphFormat.setHangingPunctuation(c10546mr.m51334u4());
        paragraphFormat.m2190dy().m70452k4(c10546mr.m51311ix() != -1);
        paragraphFormat.m2190dy().m70454x1(c10546mr.m51311ix() == 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3613k4(C10597pu c10597pu, PortionFormat portionFormat, C13827mb c13827mb, klp klpVar) {
        portionFormat.setFontBold(c10597pu.m51521k4());
        portionFormat.setFontItalic(c10597pu.m51538x1());
        if (c10597pu.m51526kk() != -1) {
            portionFormat.setFontUnderline(c10597pu.m51526kk() == 1 ? (byte) 2 : (byte) 0);
        } else {
            portionFormat.setFontUnderline((byte) -1);
        }
        portionFormat.setKumimoji(c10597pu.m51517h4());
        if (c10597pu.m51510c5().m67302x1() && C14093tq.m67296x1(c10597pu.m51510c5(), new C14093tq(65535)) && c13827mb.m64807kk() > (c10597pu.m51510c5().m67297k4().intValue() & 65535)) {
            portionFormat.setLatinFont(c13827mb.m64812x1(c10597pu.m51510c5().m67297k4().intValue() & 65535).m70073x1());
        }
        if (c10597pu.m51515dy().m67302x1()) {
            portionFormat.m2317x6().m2206x1().m433h4().m70669k4(c10597pu.m51515dy().Clone());
        }
        if (c10597pu.m51520jd().m67302x1() && C14093tq.m67296x1(c10597pu.m51520jd(), new C14093tq(65535))) {
            portionFormat.setEastAsianFont(c13827mb.m64812x1(c10597pu.m51520jd().m67297k4().intValue() & 65535).m70073x1());
        }
        if (c10597pu.m51511ck().m67302x1() && C14093tq.m67296x1(c10597pu.m51511ck(), new C14093tq(65535))) {
            portionFormat.m2311ne().m4583k4(c13827mb.m64812x1(c10597pu.m51511ck().m67297k4().intValue() & 65535).m70073x1());
        }
        if (c10597pu.m51516fa().m67302x1() && C14093tq.m67296x1(c10597pu.m51516fa(), new C14093tq(65535))) {
            portionFormat.setSymbolFont(c13827mb.m64812x1(c10597pu.m51516fa().m67297k4().intValue() & 65535).m70073x1());
        }
        if (c10597pu.m51537up().m67302x1() && c10597pu.m51537up().m67297k4().shortValue() != 0) {
            portionFormat.setFontHeight(c10597pu.m51537up().m67297k4().shortValue());
        }
        if (c10597pu.m51542yj() != null && c10597pu.m51542yj().m51794x1() != 255) {
            portionFormat.getFillFormat().setFillType((byte) 1);
            C14294pm.m69145k4(portionFormat.getFillFormat().getSolidFillColor(), c10597pu.m51542yj());
        }
        if (c10597pu.m51529ks().m67302x1()) {
            portionFormat.setEscapement(c10597pu.m51529ks().m67297k4().shortValue());
        }
        boolean z = c10597pu.m51530m9() == 1;
        if (c10597pu.m51534to() != 1 && !z) {
            if (c10597pu.m51534to() == 0) {
                ((EffectFormat) portionFormat.getEffectFormat()).m1385du();
                return;
            }
            return;
        }
        if (z) {
            portionFormat.m356du().getSolidFillColor().setSchemeColor(f6b.m5959to(0));
        }
        OuterShadow outerShadow = new OuterShadow(null);
        outerShadow.setDistance(3.0d);
        outerShadow.setBlurRadius(3.0d);
        outerShadow.setDirection(45.0f);
        outerShadow.setRectangleAlign((byte) 0);
        ((ColorFormat) outerShadow.getShadowColor()).setSchemeColor(f6b.m5959to(2));
        if (!z && portionFormat.getFillFormat().getFillType() == 1 && (klpVar == null || klpVar.m63999x1() == null || klpVar.m63999x1().m70151wl() != 5)) {
            ((ColorFormat) outerShadow.getShadowColor()).m1080k4((C14116yg.m67477k4((double) ((ColorFormat) portionFormat.getFillFormat().getSolidFillColor()).m1084to().m56512m9(), 2) >= 0.5d ? C12003du.m56460uz() : C12003du.m56398k4(110, 0, 0, 0)).Clone());
        }
        portionFormat.getEffectFormat().setOuterShadowEffect(outerShadow);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3614k4(C10752zi c10752zi, ParagraphFormat paragraphFormat) {
        if (c10752zi == null || paragraphFormat == null) {
            return;
        }
        c10752zi.m52146k4();
        PortionFormat portionFormatM2204to = paragraphFormat.m2204to();
        if (portionFormatM2204to != null && c10752zi.m52151x1().m51534to() == 0) {
            portionFormatM2204to.getEffectFormat().disableOuterShadowEffect();
        }
    }
}
