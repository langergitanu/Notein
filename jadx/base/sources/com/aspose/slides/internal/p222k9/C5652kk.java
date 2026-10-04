package com.aspose.slides.internal.p222k9;

import android.text.TextPaint;
import com.aspose.slides.internal.p226kf.InterfaceC5671to;
import com.aspose.slides.internal.p226kf.InterfaceC5672x1;
import com.aspose.slides.internal.p373qy.InterfaceC9964k4;
import com.aspose.slides.internal.p390s1.C10131x1;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p549zg.C13589k4;
import java.awt.font.TextAttribute;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.aspose.slides.internal.k9.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5652kk implements InterfaceC5672x1 {

    /* JADX INFO: renamed from: k4 */
    private final String f15476k4;

    /* JADX INFO: renamed from: kk */
    private final C5655x1 f15477kk;

    /* JADX INFO: renamed from: x1 */
    private final C10131x1 f15478x1;

    public C5652kk(String str, C10131x1 c10131x1, C5655x1 c5655x1) {
        this.f15476k4 = str;
        this.f15478x1 = c10131x1;
        this.f15477kk = c5655x1;
    }

    /* JADX INFO: renamed from: k4 */
    private TextPaint m23083k4(C12013m9 c12013m9, C5655x1 c5655x1) {
        return ((C13589k4) c12013m9.m56647ks()).m62702k4(c5655x1.m23091k4());
    }

    @Override // com.aspose.slides.internal.p226kf.InterfaceC5672x1
    /* JADX INFO: renamed from: x1 */
    public InterfaceC9964k4 mo23087x1() {
        return new C5651k4(this.f15476k4, m23083k4(m23084k4(this.f15478x1.m49776k4(true)).iterator().next(), new C5655x1(this.f15477kk, true, true)));
    }

    @Override // com.aspose.slides.internal.p226kf.InterfaceC5672x1
    /* JADX INFO: renamed from: k4 */
    public InterfaceC5671to mo23086k4() {
        AttributedString attributedStringM49776k4 = this.f15478x1.m49776k4(false);
        Set<C12013m9> setM23084k4 = m23084k4(attributedStringM49776k4);
        if (setM23084k4.size() == 1) {
            return C5653m9.m23088k4(this.f15476k4, m23083k4(setM23084k4.iterator().next(), this.f15477kk));
        }
        m23085k4(attributedStringM49776k4, this.f15477kk);
        return C5653m9.m23089k4(this.f15476k4, attributedStringM49776k4);
    }

    /* JADX INFO: renamed from: k4 */
    private Set<C12013m9> m23084k4(AttributedString attributedString) {
        AttributedCharacterIterator iterator = attributedString.getIterator();
        HashSet hashSet = new HashSet();
        for (char cFirst = iterator.first(); cFirst != 65535; cFirst = iterator.next()) {
            hashSet.add((C12013m9) iterator.getAttribute(TextAttribute.FONT));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: k4 */
    private void m23085k4(AttributedString attributedString, C5655x1 c5655x1) {
        HashMap map = new HashMap();
        AttributedCharacterIterator iterator = attributedString.getIterator();
        char cFirst = iterator.first();
        int i = 0;
        while (cFirst != 65535) {
            C12013m9 c12013m9 = (C12013m9) iterator.getAttribute(TextAttribute.FONT);
            TextPaint textPaintM23083k4 = (TextPaint) map.get(c12013m9);
            if (textPaintM23083k4 == null) {
                textPaintM23083k4 = m23083k4(c12013m9, c5655x1);
                map.put(c12013m9, textPaintM23083k4);
            }
            int i2 = i + 1;
            attributedString.addAttribute(C5649du.f15469k4, textPaintM23083k4, i, i2);
            cFirst = iterator.next();
            i = i2;
        }
    }
}
