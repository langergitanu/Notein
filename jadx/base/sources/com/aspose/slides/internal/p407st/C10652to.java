package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10652to extends AbstractC10376bv implements InterfaceC10673uw {

    /* JADX INFO: renamed from: k4 */
    private long f37403k4;

    /* JADX INFO: renamed from: x1 */
    private C10510kk f37406x1;

    /* JADX INFO: renamed from: kk */
    private C10451gi f37404kk = null;

    /* JADX INFO: renamed from: to */
    private C10675uz f37405to = null;

    /* JADX INFO: renamed from: du */
    private C10567nz f37401du = null;

    /* JADX INFO: renamed from: h4 */
    private C10484iv f37402h4 = null;

    /* JADX INFO: renamed from: du */
    public C10567nz m51756du() {
        C10567nz c10567nz = this.f37401du;
        if (c10567nz != null) {
            return c10567nz;
        }
        C10567nz c10567nz2 = (C10567nz) C7019kk.m27452k4((Object) m50508kk(C7019kk.m27457kk((Object) 5000, 9)), C10567nz.class);
        this.f37401du = c10567nz2;
        return c10567nz2;
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10673uw
    /* JADX INFO: renamed from: dy */
    public long mo51092dy() {
        return this.f37403k4;
    }

    /* JADX INFO: renamed from: h4 */
    public C10381c1 m51757h4() {
        return (C10381c1) m50508kk(C7019kk.m27457kk(Integer.valueOf(EditingLanguage.HUNGARIAN), 9));
    }

    /* JADX INFO: renamed from: k4 */
    public C10510kk m51758k4(boolean z) {
        AbstractC10571o4 abstractC10571o4M50508kk;
        Class cls;
        C10510kk c10510kk = this.f37406x1;
        if (c10510kk != null) {
            return c10510kk;
        }
        if (z) {
            abstractC10571o4M50508kk = m50508kk(C7019kk.m27457kk((Object) 1009, 9));
            cls = C10676v0.class;
        } else {
            abstractC10571o4M50508kk = m50508kk(C7019kk.m27457kk((Object) 1007, 9));
            cls = C10487j0.class;
        }
        this.f37406x1 = (C10510kk) C7019kk.m27452k4((Object) abstractC10571o4M50508kk, cls);
        if (this.f37406x1 == null && m50505fa()) {
            this.f37406x1 = !z ? new C10487j0() : new C10676v0();
            m50513yj().insertItem(0, this.f37406x1);
        }
        return this.f37406x1;
    }

    /* JADX INFO: renamed from: m9 */
    public C10484iv m51761m9() {
        C10484iv c10484iv = this.f37402h4;
        if (c10484iv != null) {
            return c10484iv;
        }
        C10484iv c10484iv2 = (C10484iv) m50508kk(C7019kk.m27457kk(Integer.valueOf(EditingLanguage.ICELANDIC), 9));
        this.f37402h4 = c10484iv2;
        return c10484iv2;
    }

    /* JADX INFO: renamed from: to */
    public C10675uz m51762to() {
        C10675uz c10675uz = this.f37405to;
        if (c10675uz != null) {
            return c10675uz;
        }
        C10675uz c10675uz2 = (C10675uz) m50506k4(C7019kk.m27457kk((Object) 2032, 9), (short) 1);
        this.f37405to = c10675uz2;
        if (c10675uz2 == null && m50505fa()) {
            C10675uz c10675uz3 = new C10675uz();
            this.f37405to = c10675uz3;
            m50507k4(c10675uz3);
        }
        return this.f37405to;
    }

    /* JADX INFO: renamed from: x1 */
    public C10451gi m51763x1() {
        C10451gi c10451gi = this.f37404kk;
        if (c10451gi != null) {
            return c10451gi;
        }
        C10451gi c10451gi2 = (C10451gi) m50508kk(C7019kk.m27457kk(Integer.valueOf(EditingLanguage.FRENCH_FRANCE), 9));
        this.f37404kk = c10451gi2;
        return c10451gi2;
    }

    /* JADX INFO: renamed from: k4 */
    public C10626rv m51759k4(short s) {
        for (int i = 0; i < m50513yj().size(); i++) {
            if (C7019kk.m27469x1(m50513yj().get_Item(i), C10626rv.class) && m50513yj().get_Item(i).m51409um().m51922kk() == s) {
                return (C10626rv) m50513yj().get_Item(i);
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10673uw
    /* JADX INFO: renamed from: k4 */
    public void mo51093k4(long j) {
        this.f37403k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m51760k4(short s, String str) {
        C10626rv c10626rvM51759k4 = m51759k4(s);
        if (c10626rvM51759k4 == null) {
            m50507k4(new C10626rv(str, (short) 3));
        } else if (str != null) {
            c10626rvM51759k4.m51658k4(str);
        } else {
            m50513yj().removeItem(c10626rvM51759k4);
        }
    }
}
