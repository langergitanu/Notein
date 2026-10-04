package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p332p7.C7318bf;
import com.aspose.slides.internal.p332p7.C7855hi;
import com.aspose.slides.internal.p332p7.C8251mb;
import com.aspose.slides.internal.p332p7.C8404o5;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: renamed from: com.aspose.slides.ka */
/* JADX INFO: loaded from: classes3.dex */
class C13719ka {

    /* JADX INFO: renamed from: m9 */
    private static final C3068ks f45653m9 = new C3068ks("none", "ancst", "ancstOrSelf", "ch", "des", "desOrSelf", "follow", "followSib", "par", "preced", "precedSib", "root", "self");

    /* JADX INFO: renamed from: du */
    private List<Integer> f45654du;

    /* JADX INFO: renamed from: h4 */
    private List<Boolean> f45655h4;

    /* JADX INFO: renamed from: k4 */
    private List<Integer> f45656k4;

    /* JADX INFO: renamed from: kk */
    private List<Integer> f45657kk;

    /* JADX INFO: renamed from: to */
    private List<Integer> f45658to;

    /* JADX INFO: renamed from: x1 */
    private List<Integer> f45659x1;

    public C13719ka(C7855hi c7855hi) {
        this.f45657kk = m63727x1(c7855hi.m33441x1());
        this.f45656k4 = m63724k4(c7855hi.m33437k4());
        this.f45659x1 = m63725kk(c7855hi.m33435du());
        this.f45658to = m63725kk(c7855hi.m33440to());
        this.f45654du = m63725kk(c7855hi.m33436h4());
        this.f45655h4 = m63726to(c7855hi.m33439kk());
    }

    /* JADX INFO: renamed from: du */
    public final List<Integer> m63728du() {
        return this.f45654du;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<Boolean> m63729h4() {
        return this.f45655h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<Integer> m63730k4() {
        return this.f45656k4;
    }

    /* JADX INFO: renamed from: kk */
    public final List<Integer> m63731kk() {
        return this.f45657kk;
    }

    /* JADX INFO: renamed from: to */
    public final List<Integer> m63732to() {
        return this.f45658to;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<Integer> m63733x1() {
        return this.f45659x1;
    }

    public C13719ka(C8251mb c8251mb) {
        this.f45657kk = m63727x1(c8251mb.m36775x1());
        this.f45656k4 = m63724k4(c8251mb.m36771k4());
        this.f45659x1 = m63725kk(c8251mb.m36767du());
        this.f45658to = m63725kk(c8251mb.m36774to());
        this.f45654du = m63725kk(c8251mb.m36769h4());
        this.f45655h4 = m63726to(c8251mb.m36772kk());
    }

    /* JADX INFO: renamed from: k4 */
    private static List<Integer> m63724k4(String str) {
        List<Integer> list = new List<>();
        list.clear();
        for (String str2 : C14113y2.m67369h4(str, ControlChar.SPACE_CHAR)) {
            if (str2.length() != 0) {
                list.addItem(Integer.valueOf(f45653m9.m12963k4(str2)));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: kk */
    private static List<Integer> m63725kk(String str) {
        List<Integer> list = new List<>();
        for (String str2 : C14113y2.m67414k4(str, ControlChar.SPACE_CHAR)) {
            if (str2.length() != 0) {
                list.addItem(Integer.valueOf(C14057f9.m66582k4(str2)));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: to */
    private static List<Boolean> m63726to(String str) {
        List<Boolean> list = new List<>();
        for (String str2 : C14113y2.m67414k4(str, ControlChar.SPACE_CHAR)) {
            if (str2.length() != 0) {
                list.addItem(Boolean.valueOf((TelemetryEventStrings.Value.FALSE.equals(str2) || "0".equals(str2) || "False".equals(str2) || "f".equals(str2)) ? false : true));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private static List<Integer> m63727x1(String str) {
        List<Integer> list = new List<>();
        for (String str2 : C14113y2.m67414k4(str, ControlChar.SPACE_CHAR)) {
            if (str2.length() != 0) {
                list.addItem(Integer.valueOf(C7318bf.m28867k4(str2)));
            }
        }
        return list;
    }

    public C13719ka(C8404o5 c8404o5) {
        this.f45657kk = m63727x1(c8404o5.m38010to());
        this.f45656k4 = m63724k4(c8404o5.m38008kk());
        this.f45659x1 = m63725kk(c8404o5.m38009m9());
        this.f45658to = m63725kk(c8404o5.m38006h4());
        this.f45654du = m63725kk(c8404o5.m38005dy());
        this.f45655h4 = m63726to(c8404o5.m38004du());
    }
}
