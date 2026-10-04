package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10675uz;
import com.aspose.slides.internal.p407st.C10678v6;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class f8s {
    /* JADX INFO: renamed from: k4 */
    public static void m6048k4(m4c m4cVar) {
        MasterSlide masterSlide;
        C10678v6 c10678v6 = (C10678v6) C7019kk.m27452k4((Object) m4cVar.m64717jd(), C10678v6.class);
        if (c10678v6 == null || (masterSlide = (MasterSlide) C7019kk.m27452k4((Object) m4cVar.m64735up(), MasterSlide.class)) == null) {
            return;
        }
        MasterThemeManager masterThemeManager = (MasterThemeManager) C7019kk.m27452k4((Object) masterSlide.getThemeManager(), MasterThemeManager.class);
        ExtraColorSchemeCollection extraColorSchemeCollection = (ExtraColorSchemeCollection) C7019kk.m27452k4((Object) masterThemeManager.getOverrideTheme().getExtraColorSchemes(), ExtraColorSchemeCollection.class);
        extraColorSchemeCollection.m1436k4();
        ExtraColorScheme extraColorScheme = null;
        int i = -1;
        int i2 = 0;
        for (C10675uz c10675uz : c10678v6.m51842jd()) {
            ExtraColorScheme extraColorScheme2 = new ExtraColorScheme(extraColorSchemeCollection);
            extraColorScheme2.m1427k4().m63293k4(true);
            if (i >= 0 || !m6050k4(c10675uz.m51835x1(), m4cVar.m64705ak())) {
                C14546td.m71102x1(c10675uz.m51835x1(), extraColorScheme2);
            } else {
                i = i2;
                extraColorScheme = extraColorScheme2;
            }
            C14546td.m71100k4(c10675uz.m51835x1(), extraColorScheme2);
            i2++;
            ((ColorScheme) extraColorScheme2.getColorScheme()).m1130k4(C14113y2.m67408k4(c10678v6.m51840c5(), " ", C14057f9.m66591x1(i2)));
            extraColorSchemeCollection.m1437k4(extraColorScheme2);
        }
        if (i < 0) {
            extraColorScheme = new ExtraColorScheme(null, true);
            C14546td.m71100k4(m4cVar.m64705ak(), extraColorScheme);
            ((ColorScheme) extraColorScheme.getColorScheme()).m1130k4(C14113y2.m67408k4(c10678v6.m51840c5(), " ", C14057f9.m66591x1(i2 + 1)));
        }
        IMasterTheme overrideTheme = masterThemeManager.getOverrideTheme();
        masterThemeManager.applyColorScheme(extraColorScheme);
        masterThemeManager.setOverrideThemeEnabled(true);
        masterThemeManager.m423to().m63293k4(true);
        if (masterThemeManager.getOverrideTheme().getFormatScheme() != null) {
            ((FormatScheme) overrideTheme.getFormatScheme()).m1566kk();
        }
        overrideTheme.setName(c10678v6.m51840c5());
        overrideTheme.getFontScheme().setName(c10678v6.m51840c5());
    }

    /* JADX INFO: renamed from: kk */
    public static void m6051kk(m4c m4cVar) {
        qxw qxwVarM64739wy = m4cVar.m64739wy();
        int i = 0;
        qxwVarM64739wy.m69806k4(false);
        if (m4cVar.m64705ak() == null || m4cVar.m64710ck() == null) {
            return;
        }
        int i2 = (!m4cVar.m64710ck().m51115kk() || m4cVar.m64714fa() == 2) ? 1 : 0;
        if (i2 == 0) {
            return;
        }
        ExtraColorScheme extraColorScheme = new ExtraColorScheme(null, true);
        C14546td.m71100k4(m4cVar.m64705ak(), extraColorScheme);
        m4c m4cVarM64713dy = m4cVar.m64713dy();
        if (m4cVarM64713dy == null) {
            i = i2;
        } else if (!m6050k4(m4cVar.m64705ak(), m4cVarM64713dy.m64705ak())) {
            C10678v6 c10678v6 = (C10678v6) C7019kk.m27452k4((Object) m4cVarM64713dy.m64717jd(), C10678v6.class);
            if (c10678v6 != null) {
                C10675uz[] c10675uzArrM51842jd = c10678v6.m51842jd();
                int length = c10675uzArrM51842jd.length;
                int i3 = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    i3++;
                    if (m6050k4(c10675uzArrM51842jd[i].m51835x1(), m4cVar.m64705ak())) {
                        ((ColorScheme) extraColorScheme.getColorScheme()).m1130k4(C14113y2.m67408k4(c10678v6.m51840c5(), " ", C14057f9.m66591x1(i3)));
                        break;
                    }
                    i++;
                }
            }
            i = i2;
        }
        if (i != 0) {
            qxwVarM64739wy.m69805k4().applyColorScheme(extraColorScheme);
            qxwVarM64739wy.m69806k4(true);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m6052x1(m4c m4cVar) {
        qxw qxwVarM64739wy = m4cVar.m64739wy();
        if (m4cVar.m64705ak() == null) {
            return;
        }
        ExtraColorScheme extraColorScheme = new ExtraColorScheme(null, true);
        C14546td.m71100k4(m4cVar.m64705ak(), extraColorScheme);
        qxwVarM64739wy.m69805k4().applyColorScheme(extraColorScheme);
        qxwVarM64739wy.m69806k4(true);
        if (qxwVarM64739wy.m69803du() != null) {
            qxwVarM64739wy.m69803du().m1514x1();
        }
        if (qxwVarM64739wy.m69809to() != null) {
            qxwVarM64739wy.m69809to().m1566kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6049k4(rpo rpoVar) {
        C10678v6 c10678v6 = (C10678v6) C7019kk.m27452k4((Object) rpoVar.m70228to(), C10678v6.class);
        if (c10678v6 == null) {
            return;
        }
        MasterSlide masterSlide = (MasterSlide) C7019kk.m27452k4((Object) rpoVar.m70235x1(), MasterSlide.class);
        if (masterSlide == null) {
            LayoutSlide layoutSlide = (LayoutSlide) C7019kk.m27452k4((Object) rpoVar.m70235x1(), LayoutSlide.class);
            if (layoutSlide == null) {
                return;
            } else {
                masterSlide = (MasterSlide) layoutSlide.getMasterSlide();
            }
        }
        ExtraColorSchemeCollection extraColorSchemeCollection = (ExtraColorSchemeCollection) masterSlide.getThemeManager().getOverrideTheme().getExtraColorSchemes();
        for (int i = 0; i < extraColorSchemeCollection.size(); i++) {
            C14546td.m71101k4((ExtraColorScheme) extraColorSchemeCollection.get_Item(i), c10678v6, true);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m6053x1(rpo rpoVar) {
        ColorScheme colorScheme;
        C13682je c13682jeM423to;
        ExtraColorScheme extraColorScheme = new ExtraColorScheme(null);
        BaseSlide baseSlideM70235x1 = rpoVar.m70235x1();
        boolean z = true;
        boolean z2 = true;
        while (true) {
            if (!z && !z2) {
                C14546td.m71101k4(extraColorScheme, rpoVar.m70228to(), false);
                return;
            }
            if (baseSlideM70235x1 == null) {
                if (z2) {
                    colorScheme = (ColorScheme) C7019kk.m27452k4((Object) rpoVar.m70215k4().m71946k4().getMasterTheme().getColorScheme(), ColorScheme.class);
                    if (colorScheme == null) {
                        throw new NullReferenceException("Master color scheme not found!");
                    }
                } else {
                    colorScheme = null;
                }
                if (z) {
                    c13682jeM423to = BaseThemeManager.f1088k4;
                    c13682jeM423to.m63293k4(true);
                } else {
                    c13682jeM423to = null;
                }
            } else {
                colorScheme = null;
                c13682jeM423to = null;
            }
            MasterSlide masterSlide = (MasterSlide) C7019kk.m27452k4((Object) baseSlideM70235x1, MasterSlide.class);
            if (masterSlide != null) {
                colorScheme = (ColorScheme) C7019kk.m27452k4((Object) masterSlide.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
                c13682jeM423to = ((MasterThemeManager) masterSlide.getThemeManager()).mo348kk();
                baseSlideM70235x1 = null;
            }
            MasterNotesSlide masterNotesSlide = (MasterNotesSlide) C7019kk.m27452k4((Object) baseSlideM70235x1, MasterNotesSlide.class);
            if (masterNotesSlide != null) {
                if (masterNotesSlide.getThemeManager().isOverrideThemeEnabled()) {
                    colorScheme = (ColorScheme) C7019kk.m27452k4((Object) masterNotesSlide.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
                }
                c13682jeM423to = ((MasterThemeManager) masterNotesSlide.getThemeManager()).mo348kk();
                baseSlideM70235x1 = null;
            }
            MasterHandoutSlide masterHandoutSlide = (MasterHandoutSlide) C7019kk.m27452k4((Object) baseSlideM70235x1, MasterHandoutSlide.class);
            if (masterHandoutSlide != null) {
                if (masterHandoutSlide.getThemeManager().isOverrideThemeEnabled()) {
                    colorScheme = (ColorScheme) C7019kk.m27452k4((Object) masterHandoutSlide.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
                }
                c13682jeM423to = ((MasterThemeManager) masterHandoutSlide.getThemeManager()).mo348kk();
                baseSlideM70235x1 = null;
            }
            LayoutSlide layoutSlide = (LayoutSlide) C7019kk.m27452k4((Object) baseSlideM70235x1, LayoutSlide.class);
            if (layoutSlide != null) {
                colorScheme = (ColorScheme) C7019kk.m27452k4((Object) layoutSlide.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
                c13682jeM423to = ((BaseOverrideThemeManager) layoutSlide.getThemeManager()).m423to();
                baseSlideM70235x1 = (BaseSlide) C7019kk.m27452k4((Object) layoutSlide.getMasterSlide(), MasterSlide.class);
            }
            Slide slide = (Slide) C7019kk.m27452k4((Object) baseSlideM70235x1, Slide.class);
            if (slide != null) {
                colorScheme = (ColorScheme) C7019kk.m27452k4((Object) slide.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
                c13682jeM423to = ((BaseOverrideThemeManager) slide.getThemeManager()).m423to();
                baseSlideM70235x1 = slide.m2687bv();
            }
            NotesSlide notesSlide = (NotesSlide) C7019kk.m27452k4((Object) baseSlideM70235x1, NotesSlide.class);
            if (notesSlide != null) {
                colorScheme = (ColorScheme) C7019kk.m27452k4((Object) notesSlide.getThemeManager().getOverrideTheme().getColorScheme(), ColorScheme.class);
                c13682jeM423to = ((BaseOverrideThemeManager) notesSlide.getThemeManager()).m423to();
                baseSlideM70235x1 = rpoVar.m70215k4().m73696g8().m70235x1();
            }
            if (z2 && colorScheme != null) {
                ((ColorScheme) extraColorScheme.getColorScheme()).m1128k4(colorScheme);
                z2 = false;
            }
            if (z && c13682jeM423to != null && c13682jeM423to.m63294k4()) {
                extraColorScheme.m1427k4().m63292k4(c13682jeM423to);
                z = false;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6050k4(List<Long> list, List<Long> list2) {
        for (int i = 0; i < 8; i++) {
            if ((list.get_Item(i).longValue() & 4294967295L) != (4294967295L & list2.get_Item(i).longValue())) {
                return false;
            }
        }
        return true;
    }
}
