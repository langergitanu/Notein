package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.aspose.slides.hp */
/* JADX INFO: loaded from: classes3.dex */
class C1219hp {

    /* JADX INFO: renamed from: du */
    private final String f5560du;

    /* JADX INFO: renamed from: h4 */
    private int f5561h4;

    /* JADX INFO: renamed from: k4 */
    private int f5562k4;

    /* JADX INFO: renamed from: kk */
    private int f5563kk;

    /* JADX INFO: renamed from: to */
    private final IGenericList<cc3> f5564to;

    /* JADX INFO: renamed from: x1 */
    private String f5565x1;

    public C1219hp(IGenericList<cc3> iGenericList, String str) {
        this.f5564to = iGenericList;
        this.f5560du = C14113y2.m67362du(str, ControlChar.SPACE_CHAR, '\t');
        m7273k4(1);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m7276k4() {
        return this.f5562k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m7277kk() {
        return this.f5563kk;
    }

    /* JADX INFO: renamed from: to */
    public final void m7278to() {
        String strSubstring = null;
        int i = 0;
        if (this.f5561h4 == this.f5560du.length()) {
            m7273k4(0);
            m7274k4((String) null);
            m7275x1(this.f5561h4);
            return;
        }
        IGenericEnumerator<cc3> it = this.f5564to.iterator();
        int i2 = 1;
        int i3 = 0;
        int length = 0;
        while (it.hasNext()) {
            try {
                cc3 next = it.next();
                Pattern patternCompile = Pattern.compile(C14113y2.m67402k4("\\G[\\s\\t]*({0})", next.m4538x1()));
                String strSubstring2 = this.f5560du.substring(this.f5561h4);
                Matcher matcher = patternCompile.matcher(strSubstring2);
                if (matcher.find()) {
                    String strSubstring3 = strSubstring2.substring(matcher.start(), matcher.end());
                    if (!C14113y2.m67411k4(strSubstring3) && strSubstring3.length() > length) {
                        int iM4535k4 = next.m4535k4();
                        int i4 = this.f5561h4;
                        int length2 = strSubstring3.length();
                        while (strSubstring3.startsWith(" ")) {
                            strSubstring3 = strSubstring3.substring(1);
                        }
                        length = length2;
                        i3 = i4;
                        i2 = iM4535k4;
                        strSubstring = strSubstring3;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (i2 == 1) {
            Pattern patternCompile2 = Pattern.compile("\\G[\\s\\t]*(\\S+)");
            strSubstring = this.f5560du.substring(this.f5561h4);
            Matcher matcher2 = patternCompile2.matcher(strSubstring);
            if (matcher2.find()) {
                length = strSubstring.length();
            } else {
                String strSubstring4 = strSubstring.substring(matcher2.start(), matcher2.end());
                i = this.f5561h4;
                length = strSubstring4.length();
                strSubstring = strSubstring4;
                while (strSubstring.startsWith(" ")) {
                    strSubstring = strSubstring.substring(1);
                }
            }
        } else {
            i = i3;
        }
        m7273k4(i2);
        m7274k4(strSubstring);
        m7275x1(i);
        if (m7276k4() == 1) {
            this.f5561h4 = this.f5560du.length();
        } else {
            this.f5561h4 += length;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final String m7279x1() {
        return this.f5565x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m7273k4(int i) {
        this.f5562k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m7275x1(int i) {
        this.f5563kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m7274k4(String str) {
        this.f5565x1 = str;
    }
}
