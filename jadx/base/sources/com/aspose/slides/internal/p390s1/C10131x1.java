package com.aspose.slides.internal.p390s1;

import com.aspose.slides.internal.p475wh.C12013m9;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.s1.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10131x1 {

    /* JADX INFO: renamed from: k4 */
    private final String f36325k4;

    /* JADX INFO: renamed from: kk */
    private final C12013m9 f36326kk;

    /* JADX INFO: renamed from: x1 */
    private final C12013m9 f36327x1;

    public C10131x1(String str, C12013m9 c12013m9, C12013m9 c12013m92) {
        this.f36325k4 = str;
        this.f36327x1 = c12013m9;
        this.f36326kk = c12013m92;
    }

    /* JADX INFO: renamed from: k4 */
    private int m49773k4(String str, int i, C12013m9 c12013m9) {
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (!c12013m9.m56647ks().mo18933k4(cCharAt)) {
                if (!Character.isHighSurrogate(cCharAt) || !c12013m9.m56647ks().mo18938x1(str.codePointAt(i))) {
                    return i;
                }
                i++;
            }
            i++;
        }
        return length;
    }

    /* JADX INFO: renamed from: x1 */
    private int m49775x1(String str, int i, C12013m9 c12013m9) {
        int length = str.length();
        while (i < length) {
            if (c12013m9.m56647ks().mo18933k4(str.charAt(i))) {
                return i;
            }
            i++;
        }
        return length;
    }

    /* JADX INFO: renamed from: k4 */
    public AttributedString m49776k4(boolean z) {
        AttributedString attributedString = new AttributedString(this.f36325k4);
        if (this.f36325k4.length() != 0) {
            if (this.f36326kk == null) {
                attributedString.addAttributes(m49774k4(this.f36327x1), 0, this.f36325k4.length());
                return attributedString;
            }
            int i = 0;
            boolean z2 = false;
            int i2 = 0;
            while (i < this.f36325k4.length()) {
                String str = this.f36325k4;
                C12013m9 c12013m9 = this.f36326kk;
                int iM49775x1 = z2 ? m49775x1(str, i, c12013m9) : m49773k4(str, i, c12013m9);
                if (i2 > 2) {
                    throw new IllegalStateException();
                }
                boolean z3 = !z2;
                if (iM49775x1 == i) {
                    i2++;
                } else {
                    attributedString.addAttributes(m49774k4(!z2 ? this.f36326kk : this.f36327x1), i, iM49775x1);
                    i2 = 0;
                }
                i = iM49775x1;
                z2 = z3;
            }
        }
        return attributedString;
    }

    /* JADX INFO: renamed from: k4 */
    private Map<TextAttribute, Object> m49774k4(C12013m9 c12013m9) {
        TextAttribute textAttribute;
        Float fValueOf;
        HashMap map = new HashMap();
        map.put(TextAttribute.FONT, c12013m9);
        if ((c12013m9.m56642jd() & 4) != 0) {
            map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        }
        if ((c12013m9.m56642jd() & 8) != 0) {
            map.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
        }
        if (c12013m9.m56647ks().m18926h4()) {
            textAttribute = TextAttribute.POSTURE;
            fValueOf = Float.valueOf(c12013m9.m56647ks().mo18923c5());
        } else {
            textAttribute = TextAttribute.POSTURE;
            fValueOf = TextAttribute.POSTURE_REGULAR;
        }
        map.put(textAttribute, fValueOf);
        if ((c12013m9.m56642jd() & 1) != 0) {
            map.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
        }
        map.put(TextAttribute.CHAR_REPLACEMENT, null);
        map.put(TextAttribute.FAMILY, c12013m9.m56647ks().m18932k4());
        map.put(TextAttribute.JUSTIFICATION, TextAttribute.JUSTIFICATION_FULL);
        map.put(TextAttribute.SIZE, Float.valueOf(c12013m9.m56647ks().m18934kk()));
        map.put(TextAttribute.WIDTH, TextAttribute.WIDTH_REGULAR);
        map.put(TextAttribute.RUN_DIRECTION, TextAttribute.RUN_DIRECTION_LTR);
        map.put(TextAttribute.LIGATURES, TextAttribute.LIGATURES_ON);
        map.put(TextAttribute.KERNING, TextAttribute.KERNING_ON);
        return map;
    }
}
