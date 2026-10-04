package com.aspose.slides.internal.p243l6;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.Specialized.StringDictionary;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14112xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.l6.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C6003h4 {

    /* JADX INFO: renamed from: ne */
    private static final String[] f16949ne = new String[0];

    /* JADX INFO: renamed from: h4 */
    private C6007m9 f16955h4;

    /* JADX INFO: renamed from: ks */
    private AbstractC6747ar f16959ks;

    /* JADX INFO: renamed from: rv */
    private String f16961rv;

    /* JADX INFO: renamed from: yj */
    private AbstractC6747ar f16966yj;

    /* JADX INFO: renamed from: k4 */
    private String f16957k4 = "";

    /* JADX INFO: renamed from: x1 */
    private C14112xw f16964x1 = C14112xw.f47372k4;

    /* JADX INFO: renamed from: kk */
    private String f16958kk = "";

    /* JADX INFO: renamed from: to */
    private String f16962to = "";

    /* JADX INFO: renamed from: du */
    private String f16952du = "";

    /* JADX INFO: renamed from: m9 */
    private boolean f16960m9 = false;

    /* JADX INFO: renamed from: dy */
    private boolean f16953dy = false;

    /* JADX INFO: renamed from: c5 */
    private boolean f16950c5 = false;

    /* JADX INFO: renamed from: jd */
    private boolean f16956jd = false;

    /* JADX INFO: renamed from: ck */
    private boolean f16951ck = false;

    /* JADX INFO: renamed from: fa */
    private boolean f16954fa = true;

    /* JADX INFO: renamed from: up */
    private EnumC6002dy f16963up = EnumC6002dy.Normal;

    /* JADX INFO: renamed from: x6 */
    private boolean f16965x6 = false;

    /* JADX INFO: renamed from: c5 */
    public boolean m24239c5() {
        return this.f16954fa;
    }

    /* JADX INFO: renamed from: ck */
    public String m24240ck() {
        return this.f16961rv;
    }

    /* JADX INFO: renamed from: du */
    public boolean m24241du() {
        return this.f16950c5;
    }

    /* JADX INFO: renamed from: dy */
    public AbstractC6747ar m24242dy() {
        return this.f16959ks;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m24243h4() {
        return this.f16951ck;
    }

    /* JADX INFO: renamed from: jd */
    public String m24244jd() {
        return this.f16952du;
    }

    /* JADX INFO: renamed from: k4 */
    public String m24245k4() {
        return this.f16957k4;
    }

    /* JADX INFO: renamed from: kk */
    public void m24249kk(String str) {
        if (str == null) {
            str = "";
        }
        this.f16952du = str;
    }

    /* JADX INFO: renamed from: m9 */
    public AbstractC6747ar m24252m9() {
        return this.f16966yj;
    }

    /* JADX INFO: renamed from: to */
    public String m24253to() {
        return this.f16958kk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public StringDictionary m24255x1() {
        if (this.f16955h4 == null) {
            this.f16955h4 = new C6007m9();
            IDictionaryEnumerator it = C14052dq.m66561dy().iterator();
            while (it.hasNext()) {
                DictionaryEntry dictionaryEntry = (DictionaryEntry) it.next();
                this.f16955h4.add((String) dictionaryEntry.getKey(), (String) dictionaryEntry.getValue());
            }
        }
        return this.f16955h4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m24246k4(EnumC6002dy enumC6002dy) {
        this.f16963up = enumC6002dy;
    }

    /* JADX INFO: renamed from: kk */
    public void m24250kk(boolean z) {
        this.f16951ck = z;
    }

    /* JADX INFO: renamed from: to */
    public void m24254to(boolean z) {
        this.f16954fa = z;
    }

    /* JADX INFO: renamed from: x1 */
    public void m24256x1(String str) {
        this.f16958kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m24247k4(String str) {
        this.f16957k4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m24251kk() {
        return this.f16955h4 != null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m24257x1(boolean z) {
        this.f16950c5 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m24248k4(boolean z) {
        this.f16960m9 = z;
    }
}
