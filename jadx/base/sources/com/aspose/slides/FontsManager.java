package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p060ca.C2012bg;
import com.aspose.slides.internal.p060ca.C2033cj;
import com.aspose.slides.internal.p060ca.C2064eb;
import com.aspose.slides.internal.p060ca.C2078f3;
import com.aspose.slides.internal.p060ca.C2085fe;
import com.aspose.slides.internal.p060ca.C2132iq;
import com.aspose.slides.internal.p060ca.C2155k5;
import com.aspose.slides.internal.p060ca.C2188m5;
import com.aspose.slides.internal.p060ca.C2284s2;
import com.aspose.slides.internal.p060ca.C2334v6;
import com.aspose.slides.internal.p060ca.C2350wl;
import com.aspose.slides.internal.p060ca.C2409zi;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p284mx.C6620to;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9758b3;
import com.aspose.slides.internal.p353q7.C9760bz;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p397sd.C10224to;
import com.aspose.slides.internal.p475wh.C12001c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class FontsManager implements IFontsManager {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f2347m9 = new C7017h4("regular", "italic", "bold");

    /* JADX INFO: renamed from: du */
    private final IPresentation f2348du;

    /* JADX INFO: renamed from: k4 */
    private final C13827mb f2350k4;

    /* JADX INFO: renamed from: kk */
    private IFontSubstRuleCollection f2351kk;

    /* JADX INFO: renamed from: x1 */
    private final C1197hf f2353x1;

    /* JADX INFO: renamed from: to */
    private boolean f2352to = false;

    /* JADX INFO: renamed from: h4 */
    private final char[] f2349h4 = {0, ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.SPACE_CHAR, '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Y', '[', ']', '^', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', ControlChar.NON_BREAKING_SPACE_CHAR, 173, 8208, 8260};

    public FontsManager(C1197hf c1197hf, C13827mb c13827mb, IPresentation iPresentation) {
        this.f2348du = iPresentation;
        if (c13827mb == null) {
            throw new ArgumentNullException("fontsList");
        }
        if (c1197hf == null) {
            throw new ArgumentNullException("fontsManagerInternal");
        }
        this.f2353x1 = c1197hf;
        this.f2350k4 = c13827mb;
        c13827mb.m64803k4(this);
    }

    /* JADX INFO: renamed from: du */
    private void m1536du() {
        for (ITextFrame iTextFrame : SlideUtil.getAllTextFrames(this.f2348du, true)) {
            TextFrame textFrame = (TextFrame) iTextFrame;
            IGenericEnumerator<IParagraph> it = textFrame.getParagraphs().iterator();
            while (it.hasNext()) {
                try {
                    ((Paragraph) it.next()).m2172yj();
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            textFrame.f3523to.mo64286du();
        }
        ((MasterTheme) this.f2348du.getMasterTheme()).m2996kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m1537k4(String str) {
        int iM27428k4 = f2347m9.m27428k4(C14113y2.m67368h4(str));
        if (iM27428k4 != 1) {
            return iM27428k4 != 2 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: kk */
    private void m1545kk() {
        IFontSubstRuleCollection iFontSubstRuleCollection = this.f2351kk;
        if (iFontSubstRuleCollection == null || iFontSubstRuleCollection.size() == 0) {
            return;
        }
        IGenericEnumerator<IFontSubstRule> it = this.f2351kk.iterator();
        while (it.hasNext()) {
            try {
                IFontSubstRule next = it.next();
                this.f2350k4.m64806k4(next.getSourceFont(), next.getDestFont(), next.getReplaceFontCondition());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m1536du();
    }

    /* JADX INFO: renamed from: to */
    private void m1546to() {
        this.f2350k4.m64813x1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IFontsManager
    public final void addEmbeddedFont(IFontData iFontData, int i) {
        C9790ts c9790tsMo48031k4;
        if (C7019kk.m27469x1(iFontData, C1141ge.class)) {
            if (!this.f2353x1.m7119du() || this.f2353x1.m7122k4().m3689k4(iFontData.getFontName()) == null) {
                C1141ge c1141ge = (C1141ge) C7019kk.m27452k4((Object) iFontData, C1141ge.class);
                IGenericEnumerator<KeyValuePair<TKey, TValue>> it = c1141ge.m6502h4().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair keyValuePair = (KeyValuePair) it.next();
                        this.f2353x1.m7127k4((byte[]) keyValuePair.getValue(), (byte[]) c1141ge.m6508m9().get_Item(keyValuePair.getKey()), c1141ge.getFontName(), c1141ge.m6503k4(), c1141ge.m6509to(), (byte) c1141ge.m6500du(), ((Integer) keyValuePair.getKey()).intValue(), i == 0);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                    return;
                }
                return;
            }
            return;
        }
        FontData fontData = (FontData) C7019kk.m27452k4((Object) iFontData, FontData.class);
        if (fontData == null) {
            throw new ArgumentException("Unsupported font data type", "fontData");
        }
        IEnumerator it2 = AbstractC14106wy.getValues(C7019kk.m27443k4((Class<?>) C12001c5.class)).iterator();
        C9790ts c9790ts = null;
        while (it2.hasNext()) {
            try {
                int iIntValue = ((Long) it2.next()).intValue();
                FontData fontData2 = new FontData(fontData, iIntValue);
                synchronized (C9763ck.m48030to()) {
                    c9790tsMo48031k4 = C9763ck.m48030to().mo48031k4(fontData2.getFontName(), iIntValue);
                }
                if (c9790tsMo48031k4 != null && c9790tsMo48031k4.m48183dy() == iIntValue) {
                    m1540k4(C3131h4.m13362m9(c9790tsMo48031k4.m48187h4()), fontData2, i);
                }
                fontData = fontData2;
                c9790ts = c9790tsMo48031k4;
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it2).dispose();
        }
        if (c9790ts == null) {
            throw new InvalidOperationException("Font not found");
        }
    }

    @Override // com.aspose.slides.IFontsManager
    public final IFontData[] getEmbeddedFonts() {
        if (!this.f2353x1.m7119du()) {
            return new IFontData[0];
        }
        C0758ap c0758apM7122k4 = this.f2353x1.m7122k4();
        List list = new List(c0758apM7122k4.m3688k4());
        IGenericEnumerator<KeyValuePair<String, C1141ge>> it = c0758apM7122k4.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next().getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return (IFontData[]) list.toArray(new IFontData[0]);
    }

    @Override // com.aspose.slides.IFontsManager
    public final IFontFallBackRulesCollection getFontFallBackRulesCollection() {
        return this.f2353x1.m7133x1();
    }

    @Override // com.aspose.slides.IFontsManager
    public final IFontSubstRuleCollection getFontSubstRuleList() {
        if (this.f2351kk == null) {
            this.f2351kk = new FontSubstRuleCollection();
        }
        return this.f2351kk;
    }

    @Override // com.aspose.slides.IFontsManager
    public final IFontData[] getFonts() {
        List list = new List();
        IGenericEnumerator<C14382rc> it = this.f2350k4.m64798h4().iterator();
        while (it.hasNext()) {
            try {
                C14382rc next = it.next();
                if (!next.m70071m9() && !list.containsItem(next.m70073x1()) && next.m70064dy()) {
                    list.addItem(next.m70073x1());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = C1143gg.m6638x1().m64798h4().iterator();
        while (it.hasNext()) {
            try {
                C14382rc next2 = it.next();
                if (!next2.m70071m9() && !list.containsItem(next2.m70073x1()) && next2.m70064dy()) {
                    list.addItem(next2.m70073x1());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return (IFontData[]) list.toArray(new IFontData[0]);
    }

    @Override // com.aspose.slides.IFontsManager
    public final IGenericEnumerable<FontSubstitutionInfo> getSubstitutions() {
        int size = this.f2348du.getSlides().size();
        int[] iArr = new int[size];
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        omk omkVar = new omk((Presentation) this.f2348du);
        try {
            return AbstractC14092to.m67204k4((Object[]) omkVar.m68694x1(iArr));
        } finally {
            omkVar.dispose();
        }
    }

    @Override // com.aspose.slides.IFontsManager
    public final void removeEmbeddedFont(IFontData iFontData) {
        if (iFontData == null) {
            throw new ArgumentNullException("fontData");
        }
        C1141ge c1141ge = (C1141ge) C7019kk.m27452k4((Object) iFontData, C1141ge.class);
        if (c1141ge == null) {
            throw new ArgumentException("fontData is not correct embedded font value", "fontData");
        }
        this.f2353x1.m7122k4().m3695k4(c1141ge);
        this.f2353x1.m7131m9();
        m1536du();
    }

    @Override // com.aspose.slides.IFontsManager
    public final void replaceFont(IFontData iFontData, IFontData iFontData2) {
        if (this.f2351kk == null) {
            this.f2351kk = new FontSubstRuleCollection();
        }
        this.f2351kk.add(new FontSubstRule(iFontData, iFontData2));
        this.f2350k4.m64805k4(iFontData, iFontData2);
        m1536du();
    }

    @Override // com.aspose.slides.IFontsManager
    public final void setFontFallBackRulesCollection(IFontFallBackRulesCollection iFontFallBackRulesCollection) {
        this.f2353x1.m7125k4(iFontFallBackRulesCollection);
    }

    @Override // com.aspose.slides.IFontsManager
    public final void setFontSubstRuleList(IFontSubstRuleCollection iFontSubstRuleCollection) {
        this.f2351kk = iFontSubstRuleCollection;
    }

    /* JADX INFO: renamed from: x1 */
    public final C1197hf m1554x1() {
        return this.f2353x1;
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m1547x1(byte[] bArr) {
        C2012bg c2012bg = new C2012bg(new C3152yj(bArr));
        C3152yj c3152yj = new C3152yj();
        try {
            c2012bg.m10253k4(c3152yj);
            return m1543k4(c3152yj);
        } finally {
            c3152yj.dispose();
        }
    }

    @Override // com.aspose.slides.IFontsManager
    public final void addEmbeddedFont(byte[] bArr, int i) {
        if (bArr == null) {
            throw new ArgumentNullException("fontData");
        }
        if (i == 0) {
            m1542k4(bArr, true);
        } else {
            if (i != 1) {
                throw new ArgumentOutOfRangeException("embedFontRule", C14042ak.m66410k4(EmbedFontCharacters.class, i), null);
            }
            m1542k4(bArr, false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final IGenericDictionary<Integer, byte[]> m1548k4(C1141ge c1141ge, int[] iArr) {
        if (c1141ge == null) {
            throw new ArgumentNullException("embeddedFont");
        }
        if (!c1141ge.m6501dy()) {
            throw new ArgumentException("embeddedFont");
        }
        IGenericDictionary<Integer, byte[]> iGenericDictionaryM6502h4 = c1141ge.m6502h4();
        Dictionary dictionary = new Dictionary(iGenericDictionaryM6502h4.size());
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = iGenericDictionaryM6502h4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                dictionary.addItem(keyValuePair.getKey(), m1553k4((byte[]) keyValuePair.getValue(), iArr));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dictionary;
    }

    @Override // com.aspose.slides.IFontsManager
    public final void replaceFont(IFontSubstRule iFontSubstRule) {
        if (this.f2351kk == null) {
            this.f2351kk = new FontSubstRuleCollection();
        }
        this.f2351kk.add(iFontSubstRule);
        C14251ot c14251otM1550k4 = m1550k4((FontData) iFontSubstRule.getSourceFont());
        if (iFontSubstRule.getReplaceFontCondition() == 1 || !c14251otM1550k4.m68818to()) {
            this.f2350k4.m64805k4(iFontSubstRule.getSourceFont(), iFontSubstRule.getDestFont());
            m1536du();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C2132iq m1538k4(byte[] bArr) {
        return (C2132iq) new C2284s2().mo11021k4(new C2033cj(0, new C2350wl(bArr)));
    }

    @Override // com.aspose.slides.IFontsManager
    public final void replaceFont(IFontSubstRuleCollection iFontSubstRuleCollection) {
        if (this.f2351kk == null) {
            this.f2351kk = new FontSubstRuleCollection();
        }
        IGenericEnumerator<IFontSubstRule> it = iFontSubstRuleCollection.iterator();
        while (it.hasNext()) {
            try {
                IFontSubstRule next = it.next();
                this.f2351kk.add(next);
                C14251ot c14251otM1550k4 = m1550k4((FontData) next.getSourceFont());
                if (next.getReplaceFontCondition() == 1 || !c14251otM1550k4.m68818to()) {
                    this.f2350k4.m64805k4(next.getSourceFont(), next.getDestFont());
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m1536du();
    }

    /* JADX INFO: renamed from: k4 */
    public static C9790ts m1539k4(byte[] bArr, String str) {
        if (C2155k5.m10869k4(bArr)) {
            bArr = m1547x1(bArr);
        }
        return new C9760bz().m48011k4(new C9758b3(bArr), str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13827mb m1549k4() {
        return this.f2350k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14251ot m1550k4(FontData fontData) {
        return this.f2353x1.m7124k4(fontData.getFontName(), fontData.m1485k4(), fontData.m1490x1() & 255, Presentation.f3062h4.m2204to().getFontHeight(), 0, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1551k4(FontsManager fontsManager) {
        if (fontsManager == null) {
            throw new ArgumentNullException("fontsManager");
        }
        if (fontsManager.m1554x1().m7119du()) {
            this.f2353x1.m7122k4().m3694k4(fontsManager.m1554x1().m7122k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1552k4(boolean z) {
        this.f2352to = z;
        if (z) {
            m1545kk();
        } else {
            m1546to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m1540k4(byte[] bArr, FontData fontData, int i) {
        if (i != 0) {
            if (i != 1) {
                throw new ArgumentOutOfRangeException("embedFontRule", C14042ak.m66410k4(EmbedFontCharacters.class, i), null);
            }
            m1541k4(bArr, fontData, false);
            return;
        }
        m1541k4(bArr, fontData, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1541k4(byte[] bArr, FontData fontData, boolean z) {
        FontData[] fontDataArr = {null};
        byte[] bArrM1544k4 = m1544k4(bArr, fontDataArr);
        FontData fontData2 = fontDataArr[0];
        if ("ttcf".equals(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, 4)) && z) {
            bArr = m1547x1(bArrM1544k4);
        }
        byte[] bArr2 = bArr;
        byte[] bArrM1488kk = fontData.m1488kk();
        if (bArrM1488kk == null) {
            bArrM1488kk = fontData2.m1488kk();
        }
        this.f2353x1.m7127k4(bArr2, bArrM1544k4, fontData.getFontName(), fontData.m1485k4(), bArrM1488kk, fontData.m1490x1(), fontData.m1489to(), z);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1542k4(byte[] bArr, boolean z) {
        FontData[] fontDataArr = {null};
        byte[] bArrM1544k4 = m1544k4(bArr, fontDataArr);
        FontData fontData = fontDataArr[0];
        this.f2353x1.m7127k4(bArr, bArrM1544k4, fontData.getFontName(), fontData.m1485k4(), fontData.m1488kk(), fontData.m1490x1(), fontData.m1489to(), z);
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m1543k4(C3152yj c3152yj) {
        int iM11550kk;
        try {
            C2132iq c2132iqM1538k4 = m1538k4(c3152yj.toArray());
            C2078f3 c2078f3M10798k4 = c2132iqM1538k4.m10758x1().m10551ix().m10956x1().m10798k4("smcp");
            if (c2078f3M10798k4 == null) {
                return c3152yj.toArray();
            }
            C2064eb c2064ebM10548dy = c2132iqM1538k4.m10758x1().m10548dy();
            C2085fe c2085fe = (C2085fe) c2064ebM10548dy.m10453k4();
            C2188m5 c2188m5 = (C2188m5) ((C2409zi) c2132iqM1538k4.m10758x1().m10551ix().m11132kk().m10461k4(c2078f3M10798k4.m10511kk()[0].intValue() & 65535)).m11485to().get_Item(0);
            for (long j : c2085fe.m10528k4()) {
                int i = (int) j;
                char c = (char) i;
                if (C14117yj.m67517dy(c)) {
                    char cM67521ix = C14117yj.m67521ix(c);
                    int iMo10360k4 = c2085fe.mo10360k4(i);
                    if (iMo10360k4 != 0 && (iM11550kk = c2188m5.m11108x1().m11550kk(new C2334v6(iMo10360k4))) >= 0) {
                        c2064ebM10548dy.m10456x1(cM67521ix, c2188m5.m11107to()[iM11550kk].intValue() & 65535);
                        c2064ebM10548dy.m11220k4(true);
                    }
                }
            }
            C3152yj c3152yj2 = new C3152yj();
            try {
                c2132iqM1538k4.mo11257k4(c3152yj2);
                return c3152yj2.toArray();
            } finally {
                c3152yj2.dispose();
            }
        } catch (RuntimeException unused) {
            return c3152yj.toArray();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m1553k4(byte[] bArr, int[] iArr) {
        return m1538k4(bArr).m10739h4(C14113y2.m67408k4(C14113y2.m67405k4(this.f2349h4), SlideUtil.m2760k4(this.f2348du, iArr)));
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m1544k4(byte[] bArr, FontData[] fontDataArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3152yj c3152yj2 = new C3152yj();
            try {
                C10224to[] c10224toArr = {null};
                C6620to.m26416k4(c3152yj, c3152yj2, true, c10224toArr);
                C10224to c10224to = c10224toArr[0];
                fontDataArr[0] = new FontData(AbstractC6747ar.m26643rv().m26681x1(c10224to.f36652ks), c10224to.f36647h4, (byte) 0, m1537k4(AbstractC6747ar.m26643rv().m26681x1(c10224to.f36654ne)), c10224to.f36644du);
                byte[] array = c3152yj2.toArray();
                c3152yj2.dispose();
                c3152yj.dispose();
                return array;
            } catch (Throwable th) {
                c3152yj2.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }
}
