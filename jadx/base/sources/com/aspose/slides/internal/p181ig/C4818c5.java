package com.aspose.slides.internal.p181ig;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p213jw.C5546kk;
import com.aspose.slides.internal.p263m2.InterfaceC6311x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.ig.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4818c5 {

    /* JADX INFO: renamed from: k4 */
    private C4879y2 f13417k4;

    /* JADX INFO: renamed from: x1 */
    private C5546kk f13418x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ig.c5$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public String f13419k4;

        /* JADX INFO: renamed from: x1 */
        public String f13420x1;

        public k4(String str, String str2) {
            this.f13419k4 = str;
            this.f13420x1 = str2;
        }
    }

    public C4818c5(C4879y2 c4879y2, C5546kk c5546kk) {
        this.f13417k4 = c4879y2;
        this.f13418x1 = c5546kk;
    }

    /* JADX INFO: renamed from: k4 */
    private k4 m19922k4(C6765kp c6765kp, C6765kp c6765kp2) {
        m19924kk();
        if (this.f13417k4.m20181kk() || this.f13417k4.m20190x1() != '=') {
            return new k4(c6765kp.toString(), C14113y2.f47374k4);
        }
        this.f13417k4.m20173jd();
        return m19926x1(c6765kp, c6765kp2);
    }

    /* JADX INFO: renamed from: kk */
    private void m19924kk() {
        while (!this.f13417k4.m20181kk()) {
            if ('\t' != this.f13417k4.m20190x1() && '\n' != this.f13417k4.m20190x1() && '\r' != this.f13417k4.m20190x1() && '\f' != this.f13417k4.m20190x1() && ' ' != this.f13417k4.m20190x1()) {
                return;
            } else {
                this.f13417k4.m20173jd();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private k4 m19925x1() {
        m19924kk();
        if (this.f13417k4.m20181kk() || '>' == this.f13417k4.m20190x1()) {
            return null;
        }
        C6765kp c6765kp = new C6765kp();
        C6765kp c6765kp2 = new C6765kp();
        while (!this.f13417k4.m20181kk()) {
            char cM20190x1 = this.f13417k4.m20190x1();
            if (cM20190x1 == '\t' || cM20190x1 == '\n' || cM20190x1 == '\f' || cM20190x1 == '\r' || cM20190x1 == ' ') {
                return m19922k4(c6765kp, c6765kp2);
            }
            if (cM20190x1 != '/') {
                if (cM20190x1 == '=') {
                    this.f13417k4.m20173jd();
                    return m19926x1(c6765kp, c6765kp2);
                }
                if (cM20190x1 != '>') {
                    char cM20190x12 = this.f13417k4.m20190x1();
                    if (cM20190x12 >= 'A' && cM20190x12 <= 'Z') {
                        cM20190x12 = C14117yj.m67538rv(cM20190x12);
                    }
                    c6765kp.m26780k4(cM20190x12);
                    this.f13417k4.m20173jd();
                }
            }
            return null;
        }
        return m19922k4(c6765kp, c6765kp2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x003d, code lost:
    
        r0 = r5.f13417k4.m20190x1();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00c9 -> B:16:0x003d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private k4 m19926x1(C6765kp c6765kp, C6765kp c6765kp2) {
        char cM20190x1;
        m19924kk();
        if (this.f13417k4.m20181kk()) {
            return null;
        }
        char cM20190x12 = this.f13417k4.m20190x1();
        if (cM20190x12 == '\"' || cM20190x12 == '\'') {
            char cM20190x13 = this.f13417k4.m20190x1();
            while (!this.f13417k4.m20181kk()) {
                this.f13417k4.m20173jd();
                if (this.f13417k4.m20190x1() == cM20190x13) {
                    return new k4(c6765kp.toString(), c6765kp2.toString());
                }
                char cM20190x14 = this.f13417k4.m20190x1();
                if (cM20190x14 >= 'A' && cM20190x14 <= 'Z') {
                    cM20190x14 = C14117yj.m67538rv(cM20190x14);
                }
                c6765kp2.m26780k4(cM20190x14);
            }
            if (this.f13417k4.m20181kk()) {
                return new k4(c6765kp.toString(), c6765kp2.toString());
            }
            char cM20190x15 = this.f13417k4.m20190x1();
            if (cM20190x15 == '\t' || cM20190x15 == '\n' || cM20190x15 == '\f' || cM20190x15 == '\r' || cM20190x15 == ' ' || cM20190x15 == '>') {
                return new k4(c6765kp.toString(), c6765kp2.toString());
            }
            cM20190x1 = (this.f13417k4.m20190x1() < 'A' || this.f13417k4.m20190x1() > 'Z') ? this.f13417k4.m20190x1() : C14117yj.m67538rv(this.f13417k4.m20190x1());
            c6765kp2.m26780k4(cM20190x1);
            this.f13417k4.m20173jd();
            if (this.f13417k4.m20181kk()) {
            }
        } else {
            if (cM20190x12 == '>') {
                return new k4(c6765kp.toString(), C14113y2.f47374k4);
            }
            cM20190x1 = (this.f13417k4.m20190x1() < 'A' || this.f13417k4.m20190x1() > 'Z') ? this.f13417k4.m20190x1() : C14117yj.m67538rv(this.f13417k4.m20190x1());
            c6765kp2.m26780k4(cM20190x1);
            this.f13417k4.m20173jd();
            if (this.f13417k4.m20181kk()) {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6747ar m19927k4() {
        if (this.f13417k4.m20187to() == 0) {
            return null;
        }
        this.f13417k4.m20173jd();
        while (!this.f13417k4.m20181kk()) {
            if (this.f13417k4.m20185m9() == '<') {
                if (this.f13417k4.m20181kk()) {
                    return null;
                }
                char cM20185m9 = this.f13417k4.m20185m9();
                if (cM20185m9 != '!') {
                    if (cM20185m9 == 'M' || cM20185m9 == 'm') {
                        if (this.f13417k4.m20181kk()) {
                            return null;
                        }
                        char cM20185m92 = this.f13417k4.m20185m9();
                        if (cM20185m92 == 'E' || cM20185m92 == 'e') {
                            if (this.f13417k4.m20181kk()) {
                                return null;
                            }
                            char cM20185m93 = this.f13417k4.m20185m9();
                            if (cM20185m93 == 'T' || cM20185m93 == 't') {
                                if (this.f13417k4.m20181kk()) {
                                    return null;
                                }
                                char cM20185m94 = this.f13417k4.m20185m9();
                                if (cM20185m94 == 'A' || cM20185m94 == 'a') {
                                    if (this.f13417k4.m20181kk()) {
                                        return null;
                                    }
                                    char cM20185m95 = this.f13417k4.m20185m9();
                                    if (cM20185m95 == '\t' || cM20185m95 == '\n' || cM20185m95 == '\f' || cM20185m95 == '\r' || cM20185m95 == ' ' || cM20185m95 == '/') {
                                        Dictionary dictionary = new Dictionary();
                                        C14093tq c14093tq = new C14093tq();
                                        boolean z = false;
                                        String strM19923k4 = null;
                                        while (true) {
                                            k4 k4VarM19925x1 = m19925x1();
                                            if (k4VarM19925x1 == null) {
                                                break;
                                            }
                                            if (!dictionary.containsKey(k4VarM19925x1.f13419k4)) {
                                                dictionary.addItem(k4VarM19925x1.f13419k4, k4VarM19925x1.f13420x1);
                                                if (C14113y2.m67363du("http-equiv", k4VarM19925x1.f13419k4)) {
                                                    z = true;
                                                }
                                                if (C14113y2.m67363du(FirebaseAnalytics.Param.CONTENT, k4VarM19925x1.f13419k4)) {
                                                    strM19923k4 = m19923k4(k4VarM19925x1.f13420x1);
                                                    c14093tq = new C14093tq(Boolean.TRUE);
                                                }
                                                if (C14113y2.m67363du("charset", k4VarM19925x1.f13419k4)) {
                                                    c14093tq = new C14093tq(Boolean.FALSE);
                                                    strM19923k4 = k4VarM19925x1.f13420x1;
                                                }
                                            }
                                        }
                                        if (!C14093tq.m67295k4(c14093tq, null) && (!C14093tq.m67295k4(new C14093tq(Boolean.TRUE), c14093tq) || z)) {
                                            if (C14113y2.m67432to("UTF-16", strM19923k4, (short) 5)) {
                                                strM19923k4 = "UTF-8";
                                            }
                                            try {
                                                if (!C14113y2.m67411k4(strM19923k4)) {
                                                    return C12555c5.m58553k4(strM19923k4);
                                                }
                                            } catch (ArgumentException unused) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (this.f13417k4.m20181kk()) {
                        return null;
                    }
                    if (this.f13417k4.m20185m9() != '-') {
                        continue;
                    } else {
                        if (this.f13417k4.m20181kk()) {
                            return null;
                        }
                        if (this.f13417k4.m20185m9() == '-') {
                            this.f13417k4.m20191x1("-->");
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private String m19923k4(String str) {
        InterfaceC6311x1 interfaceC6311x1Mo22731kk = this.f13418x1.m22756x1().mo22731kk();
        try {
            interfaceC6311x1Mo22731kk.mo17113k4(str);
            C4879y2 c4879y2 = new C4879y2(interfaceC6311x1Mo22731kk);
            try {
                c4879y2.m20173jd();
                do {
                    if (c4879y2.m20175k4("charset", false) == null) {
                        interfaceC6311x1Mo22731kk.dispose();
                        return null;
                    }
                    c4879y2.m20177k4(c4879y2.m20174k4() + 7);
                    c4879y2.m20176k4('\t', '\n', ControlChar.PARAGRAPH_BREAK_CHAR, '\f', ControlChar.SPACE_CHAR);
                    if (c4879y2.m20181kk()) {
                        interfaceC6311x1Mo22731kk.dispose();
                        return null;
                    }
                } while (c4879y2.m20190x1() != '=');
                c4879y2.m20173jd();
                c4879y2.m20176k4('\t', '\n', ControlChar.PARAGRAPH_BREAK_CHAR, '\f', ControlChar.SPACE_CHAR);
                if (c4879y2.m20181kk()) {
                    interfaceC6311x1Mo22731kk.dispose();
                    return null;
                }
                char cM20190x1 = c4879y2.m20190x1();
                if (cM20190x1 != '\"' && cM20190x1 != '\'') {
                    String strM20192x1 = c4879y2.m20192x1(';', ControlChar.SPACE_CHAR);
                    interfaceC6311x1Mo22731kk.dispose();
                    return strM20192x1;
                }
                String strM67537ne = C14117yj.m67537ne(c4879y2.m20190x1());
                c4879y2.m20173jd();
                String strM20175k4 = c4879y2.m20175k4(strM67537ne, false);
                interfaceC6311x1Mo22731kk.dispose();
                return strM20175k4;
            } finally {
                c4879y2.dispose();
            }
        } catch (Throwable th) {
            if (interfaceC6311x1Mo22731kk != null) {
                interfaceC6311x1Mo22731kk.dispose();
            }
            throw th;
        }
    }
}
