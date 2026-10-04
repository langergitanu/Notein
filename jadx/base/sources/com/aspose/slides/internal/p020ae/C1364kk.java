package com.aspose.slides.internal.p020ae;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7184h4;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.C7188ks;
import com.aspose.slides.internal.p329p4.C7190to;
import com.aspose.slides.internal.p329p4.C7192x1;
import com.aspose.slides.internal.p333p8.C9422ck;
import com.aspose.slides.internal.p333p8.C9432up;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ae.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1364kk extends AbstractC1363k4 {

    /* JADX INFO: renamed from: k4 */
    private final C9432up f5925k4;

    /* JADX INFO: renamed from: kk */
    private long f5926kk;

    /* JADX INFO: renamed from: to */
    private C7190to f5927to;

    /* JADX INFO: renamed from: x1 */
    private final List<C7180ck> f5928x1;

    public C1364kk(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
        this.f5925k4 = new C9432up();
        this.f5928x1 = new List<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r0 == (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        m8081k4().m46124kk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: c5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m8083c5() {
        while (true) {
            int iM46114du = m8081k4().m46114du();
            boolean z = false;
            if (iM46114du == -1 || iM46114du == 47 || iM46114du == 62) {
                break;
            }
            if (iM46114du == 101 && m8081k4().m46114du() == 110 && m8081k4().m46114du() == 100) {
                int iM46114du2 = m8081k4().m46114du();
                boolean z2 = iM46114du2 == 115 && m8081k4().m46114du() == 116 && m8081k4().m46114du() == 114 && m8081k4().m46114du() == 101 && m8081k4().m46114du() == 97 && m8081k4().m46114du() == 109;
                if (!z2 && iM46114du2 == 111 && m8081k4().m46114du() == 98 && m8081k4().m46114du() == 106) {
                    z = true;
                }
                if (z2 || z) {
                    break;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        m8081k4().m46114du();
        m8081k4().m46130up();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX INFO: renamed from: ck */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C7186k4 m8084ck() {
        char cM46114du = (char) m8081k4().m46114du();
        C6005k4.m24262k4(cM46114du == '[', C14113y2.m67402k4("expected='[' actual='{0}'", Character.valueOf(cM46114du)));
        C7186k4 c7186k4 = new C7186k4();
        while (true) {
            m8081k4().m46130up();
            char cM46126m9 = m8081k4().m46126m9();
            if (cM46126m9 <= 0 || cM46126m9 == ']') {
                break;
            }
            C7185jd c7185jdM8103m9 = m8103m9();
            if (C7019kk.m27469x1(c7185jdM8103m9, C7184h4.class)) {
                C7185jd c7185jdM27787x1 = c7186k4.m27787x1(c7186k4.m27778k4() - 1);
                if (C7019kk.m27469x1(c7185jdM27787x1, C7179c5.class)) {
                    C7179c5 c7179c5 = (C7179c5) C7019kk.m27452k4((Object) c7185jdM27787x1, C7179c5.class);
                    c7186k4.m27782k4(c7186k4.m27778k4() - 1);
                    C7185jd c7185jdM27787x12 = c7186k4.m27787x1(c7186k4.m27778k4() - 1);
                    if (C7019kk.m27469x1(c7185jdM27787x12, C7179c5.class)) {
                        C7179c5 c7179c52 = (C7179c5) C7019kk.m27452k4((Object) c7185jdM27787x12, C7179c5.class);
                        c7186k4.m27782k4(c7186k4.m27778k4() - 1);
                        c7185jdM8103m9 = this.f5927to.m27832k4(new C7188ks(c7179c52.m27752kk(), c7179c5.m27752kk()));
                    } else {
                        c7185jdM8103m9 = null;
                    }
                }
            }
            if (c7185jdM8103m9 != null) {
                c7186k4.m27783k4(c7185jdM8103m9);
            } else {
                String strM46115dy = m8081k4().m46115dy();
                if ("endobj".equals(strM46115dy) || "endstream".equals(strM46115dy)) {
                    break;
                }
            }
        }
        return c7186k4;
    }

    /* JADX INFO: renamed from: dy */
    private C7187kk m8085dy() {
        C6005k4.m24262k4(((char) m8081k4().m46114du()) == '<', "Dictionary should start from <<");
        C6005k4.m24262k4(((char) m8081k4().m46114du()) == '<', "Dictionary should start from <<");
        m8081k4().m46130up();
        C7187kk c7187kk = new C7187kk();
        boolean z = false;
        while (!z) {
            m8081k4().m46130up();
            char cM46126m9 = m8081k4().m46126m9();
            if (cM46126m9 == '>') {
                z = true;
            } else if (cM46126m9 == '/') {
                c7187kk.m27816x1(m8087jd());
            } else if (m8083c5()) {
                return c7187kk;
            }
        }
        C6005k4.m24261k4(((char) m8081k4().m46114du()) == '>');
        C6005k4.m24261k4(((char) m8081k4().m46114du()) == '>');
        return c7187kk;
    }

    /* JADX INFO: renamed from: fa */
    private boolean m8086fa() {
        char cM46126m9;
        C9422ck c9422ckM8081k4;
        int length;
        long jM46121k4 = m8081k4().m46121k4();
        m8081k4().m46130up();
        while (true) {
            cM46126m9 = m8081k4().m46126m9();
            if (cM46126m9 != 'e') {
                break;
            }
            m8081k4().m46134yj();
            m8081k4().m46130up();
            jM46121k4 = m8081k4().m46121k4();
        }
        if (!m8081k4().m46132x1()) {
            if (cM46126m9 == 'x') {
                m8099x1(jM46121k4);
                return false;
            }
            if (cM46126m9 != 't' && cM46126m9 != 's') {
                m8089k4(jM46121k4);
                return false;
            }
            if (cM46126m9 == 't') {
                m8100yj();
                cM46126m9 = m8081k4().m46126m9();
            }
            if (cM46126m9 == 's') {
                m8097up();
                while (C9422ck.m46110to(m8081k4().m46126m9()) && !m8081k4().m46132x1()) {
                    m8081k4().m46114du();
                }
                String strM46129to = !m8081k4().m46132x1() ? m8081k4().m46129to() : "";
                if ("%%EOF".equals(strM46129to)) {
                    return true;
                }
                AbstractC6747ar abstractC6747arM26640kk = AbstractC6747ar.m26640kk("ISO-8859-1");
                if (C14113y2.m67448x1(strM46129to, "%%EOF")) {
                    m8081k4().m46124kk();
                    byte[] bArrMo26677to = abstractC6747arM26640kk.mo26677to(C14113y2.m67422kk(strM46129to, 5));
                    c9422ckM8081k4 = m8081k4();
                    length = bArrMo26677to.length;
                } else {
                    m8081k4().m46124kk();
                    byte[] bArrMo26677to2 = abstractC6747arM26640kk.mo26677to(strM46129to);
                    c9422ckM8081k4 = m8081k4();
                    length = bArrMo26677to2.length;
                }
                c9422ckM8081k4.m46131x1(length);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: jd */
    private C7187kk m8087jd() {
        C7187kk c7187kk = new C7187kk();
        C7182dy c7182dyM46125ks = m8081k4().m46125ks();
        C7185jd c7185jdM8096to = m8096to();
        m8081k4().m46130up();
        if (m8081k4().m46126m9() == 'd') {
            String strM46134yj = m8081k4().m46134yj();
            if (strM46134yj == null || "def".equals(strM46134yj)) {
                m8081k4().m46130up();
            } else {
                m8081k4().m46123k4(m8081k4().m46121k4() - ((long) strM46134yj.length()));
            }
        }
        if (c7182dyM46125ks != null && c7185jdM8096to != null) {
            c7187kk.m27800k4(c7182dyM46125ks, c7185jdM8096to);
        }
        return c7187kk;
    }

    /* JADX INFO: renamed from: k4 */
    private C7180ck m8088k4(C7187kk c7187kk) {
        int iM46114du;
        C9422ck c9422ckM8081k4;
        C6005k4.m24261k4("stream".equals(m8081k4().m46134yj()));
        do {
            iM46114du = m8081k4().m46114du();
        } while (iM46114du == 32);
        if (iM46114du != 13 ? iM46114du != 10 : m8081k4().m46114du() != 10) {
            m8081k4().m46124kk();
        }
        C7185jd c7185jdM27809kk = c7187kk.m27809kk(C7182dy.f19699xc);
        C3152yj c3152yj = new C3152yj();
        int iM27752kk = C7019kk.m27469x1(c7185jdM27809kk, C7179c5.class) ? ((C7179c5) C7019kk.m27452k4((Object) c7185jdM27809kk, C7179c5.class)).m27752kk() : -1;
        if (iM27752kk == -1) {
            byte[] bArrM58622k4 = C12565ks.m58622k4(m8081k4().m46133x6());
            c3152yj.write(bArrM58622k4, 0, bArrM58622k4.length);
        } else {
            byte[] bArr = new byte[iM27752kk];
            m8081k4().m46119k4(bArr);
            c3152yj.write(bArr, 0, iM27752kk);
        }
        m8081k4().m46130up();
        long jM46121k4 = m8081k4().m46121k4();
        String strM46134yj = m8081k4().m46134yj();
        if (!"endstream".equals(strM46134yj)) {
            if (C14113y2.m67448x1(strM46134yj, "endobj")) {
                c9422ckM8081k4 = m8081k4();
            } else if (C14113y2.m67448x1(strM46134yj, "endstream")) {
                c9422ckM8081k4 = m8081k4();
                jM46121k4 += 9;
            } else {
                byte[] bArrM58622k42 = C12565ks.m58622k4(m8081k4().m46133x6());
                c3152yj.write(bArrM58622k42, 0, bArrM58622k42.length);
                C6005k4.m24262k4("endstream".equals(m8081k4().m46134yj()), "endstream is expected");
            }
            c9422ckM8081k4.m46123k4(jM46121k4);
        }
        return new C7180ck(c7187kk, c3152yj);
    }

    /* JADX INFO: renamed from: kk */
    private void m8093kk() {
        int iM46119k4;
        C12380dy c12380dy = new C12380dy("^\\d+\\s+\\d+\\s+obj.*", 0);
        long jM46121k4 = m8081k4().m46121k4();
        byte[] bArr = new byte[16];
        while (!m8081k4().m46132x1() && (iM46119k4 = m8081k4().m46119k4(bArr)) >= 1) {
            String strM26681x1 = AbstractC6747ar.m26640kk("US-ASCII").m26681x1(bArr);
            if (C14113y2.m67448x1(strM26681x1, "trailer") || C14113y2.m67448x1(strM26681x1, "xref") || C14113y2.m67448x1(strM26681x1, "startxref") || C14113y2.m67448x1(strM26681x1, "stream") || c12380dy.m57988to(strM26681x1)) {
                m8081k4().m46123k4(jM46121k4);
                return;
            } else {
                m8081k4().m46131x1(iM46119k4 - 1);
                jM46121k4++;
            }
        }
    }

    /* JADX INFO: renamed from: ks */
    private void m8094ks() {
        char cM46126m9;
        do {
            m8081k4().m46112c5();
            long jM46113ck = m8081k4().m46113ck();
            m8081k4().m46130up();
            for (int i = 0; i < jM46113ck; i++) {
                boolean zM46107k4 = C9422ck.m46107k4(m8081k4().m46126m9());
                if (m8081k4().m46132x1() || zM46107k4 || m8081k4().m46126m9() == 't') {
                    break;
                }
                String[] strArrM67414k4 = C14113y2.m67414k4(m8081k4().m46129to(), ControlChar.SPACE_CHAR);
                if (strArrM67414k4.length < 3) {
                    break;
                }
                BackupFile.PREFIX_NOTE_DIR.equals(strArrM67414k4[strArrM67414k4.length - 1]);
                m8081k4().m46130up();
            }
            m8081k4().m46130up();
            cM46126m9 = m8081k4().m46126m9();
            if (cM46126m9 < '0') {
                return;
            }
        } while (cM46126m9 <= '9');
    }

    /* JADX INFO: renamed from: rv */
    private String m8095rv() {
        String strM46129to = m8081k4().m46129to();
        if (C14113y2.m67411k4(strM46129to)) {
            return null;
        }
        if (!C14113y2.m67359c5(strM46129to, "%PDF-") && !C14113y2.m67359c5(strM46129to, "%FDF-")) {
            strM46129to = m8081k4().m46129to();
            if (C14113y2.m67411k4(strM46129to)) {
                return null;
            }
            while (!C14113y2.m67359c5(strM46129to, "%PDF-") && !C14113y2.m67359c5(strM46129to, "%FDF-") && (strM46129to.length() <= 0 || !C14117yj.m67539to(strM46129to.charAt(0)))) {
                strM46129to = m8081k4().m46129to();
            }
        }
        if (C14113y2.m67364dy(strM46129to, "%PDF-") == -1 && C14113y2.m67364dy(strM46129to, "%FDF-") == -1) {
            return null;
        }
        int iM67364dy = C14113y2.m67364dy(strM46129to, "%PDF-");
        if (iM67364dy == -1) {
            iM67364dy = C14113y2.m67364dy(strM46129to, "%FDF-");
        }
        if (iM67364dy > 0) {
            strM46129to = OooO0OO.OooO00o(iM67364dy, iM67364dy, strM46129to, strM46129to);
        }
        return C14113y2.m67448x1(strM46129to, "%PDF-") ? !C12380dy.m57978to(strM46129to, C14113y2.m67408k4("%PDF-", "\\d.\\d")) ? strM46129to.length() < 8 ? C14113y2.m67408k4("%PDF-", "1.4") : C14113y2.m67443x1(strM46129to, 0, 8) : strM46129to : !C12380dy.m57978to(strM46129to, C14113y2.m67408k4("%FDF-", "\\d.\\d")) ? strM46129to.length() < 8 ? C14113y2.m67408k4("%FDF-", "1.0") : C14113y2.m67443x1(strM46129to, 0, 8) : strM46129to;
    }

    /* JADX INFO: renamed from: to */
    private C7185jd m8096to() {
        C7185jd c7185jdM8103m9 = m8103m9();
        m8081k4().m46130up();
        char cM46126m9 = m8081k4().m46126m9();
        if (cM46126m9 < '0' || cM46126m9 > '9') {
            return c7185jdM8103m9;
        }
        C7185jd c7185jdM8103m92 = m8103m9();
        m8081k4().m46130up();
        C6005k4.m24261k4(((char) m8081k4().m46114du()) == 'R');
        return this.f5927to.m27832k4(new C7188ks(((C7179c5) c7185jdM8103m9).m27752kk(), ((C7179c5) c7185jdM8103m92).m27752kk()));
    }

    /* JADX INFO: renamed from: up */
    private boolean m8097up() {
        if (m8081k4().m46126m9() != 's' || !"startxref".equals(C14113y2.m67440x1(m8081k4().m46134yj()))) {
            return false;
        }
        m8081k4().m46130up();
        this.f5926kk = m8081k4().m46113ck();
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    private void m8098x1(C7190to c7190to) {
        List.Enumerator<C7185jd> it = c7190to.m27838m9().iterator();
        while (it.hasNext()) {
            try {
                C7185jd c7185jdMo8461c5 = it.next().mo8461c5();
                if (C7019kk.m27469x1(c7185jdMo8461c5, C7180ck.class)) {
                    this.f5928x1.containsItem((C7180ck) C7019kk.m27452k4((Object) c7185jdMo8461c5, C7180ck.class));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: yj */
    private boolean m8100yj() {
        if (m8081k4().m46126m9() != 't') {
            return false;
        }
        String strM46115dy = m8081k4().m46115dy();
        if (!"trailer".equals(C14113y2.m67440x1(strM46115dy)) && !C14113y2.m67448x1(strM46115dy, "trailer")) {
            return false;
        }
        m8081k4().m46129to();
        m8081k4().m46130up();
        this.f5925k4.m46191k4(m8085dy());
        m8081k4().m46130up();
        return true;
    }

    /* JADX INFO: renamed from: du */
    public final C7190to m8101du() {
        return this.f5927to;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX INFO: renamed from: h4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7190to mo8078h4() {
        this.f5927to = new C7190to();
        String strM8095rv = m8095rv();
        if (strM8095rv == null) {
            return null;
        }
        this.f5927to.m27835k4(strM8095rv);
        m8093kk();
        boolean zM8086fa = false;
        while (!m8081k4().m46132x1()) {
            try {
                zM8086fa |= m8086fa();
            } catch (RuntimeException unused) {
                if (zM8086fa) {
                    this.f5925k4.m46190k4(this.f5926kk);
                    this.f5927to.m27834k4(this.f5925k4.m46189k4(), this.f5925k4.m46193x1());
                    m8098x1(this.f5927to);
                    if (!this.f5927to.m27829du()) {
                    }
                    return this.f5927to;
                }
            }
            m8081k4().m46130up();
        }
        this.f5925k4.m46190k4(this.f5926kk);
        this.f5927to.m27834k4(this.f5925k4.m46189k4(), this.f5925k4.m46193x1());
        m8098x1(this.f5927to);
        if (!this.f5927to.m27829du()) {
            this.f5927to.m27830h4();
        }
        return this.f5927to;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m9 */
    public final C7185jd m8103m9() {
        C7192x1 c7192x1M27851x1;
        char cM46114du;
        m8081k4().m46130up();
        char cM46126m9 = m8081k4().m46126m9();
        if (cM46126m9 == -1) {
            return null;
        }
        if (cM46126m9 == 40) {
            return m8081k4().m46127ne();
        }
        if (cM46126m9 == 47) {
            return m8081k4().m46125ks();
        }
        if (cM46126m9 == 60) {
            m8081k4().m46114du();
            char cM46126m92 = m8081k4().m46126m9();
            m8081k4().m46124kk();
            if (cM46126m92 != '<') {
                return m8081k4().m46127ne();
            }
            C7187kk c7187kkM8085dy = m8085dy();
            m8081k4().m46130up();
            return c7187kkM8085dy;
        }
        if (cM46126m9 == 82) {
            m8081k4().m46114du();
            return new C7184h4(null);
        }
        if (cM46126m9 == 91) {
            return m8084ck();
        }
        if (cM46126m9 == 102) {
            String strM46122k4 = m8081k4().m46122k4(5);
            c7192x1M27851x1 = TelemetryEventStrings.Value.FALSE.equals(strM46122k4) ? C7192x1.m27851x1() : null;
            C6005k4.m24261k4(TelemetryEventStrings.Value.FALSE.equals(strM46122k4));
            return c7192x1M27851x1;
        }
        if (cM46126m9 == 110) {
            C6005k4.m24262k4(CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(m8081k4().m46134yj()), "'nul' string is expected");
            return C7185jd.m27775dy();
        }
        if (cM46126m9 == 116) {
            String strM46122k42 = m8081k4().m46122k4(4);
            c7192x1M27851x1 = TelemetryEventStrings.Value.TRUE.equals(strM46122k42) ? C7192x1.m27848k4() : null;
            C6005k4.m24261k4(TelemetryEventStrings.Value.TRUE.equals(strM46122k42));
            return c7192x1M27851x1;
        }
        if (cM46126m9 == 65535) {
            return null;
        }
        if (!C14117yj.m67539to(cM46126m9) && cM46126m9 != 45 && cM46126m9 != 43 && cM46126m9 != 46) {
            long jM46121k4 = m8081k4().m46121k4();
            String strM46134yj = m8081k4().m46134yj();
            C6005k4.m24262k4(!C14113y2.m67411k4(strM46134yj), "Unknown dir object ");
            if (!"endobj".equals(strM46134yj) && !"endstream".equals(strM46134yj)) {
                return null;
            }
            m8081k4().m46123k4(jM46121k4);
            return null;
        }
        C6765kp c6765kp = new C6765kp();
        while (true) {
            cM46114du = (char) m8081k4().m46114du();
            if (!C14117yj.m67539to(cM46114du) && cM46114du != 45 && cM46114du != 43 && cM46114du != 46 && cM46114du != 69 && cM46114du != 101) {
                break;
            }
            c6765kp.m26780k4(cM46114du);
        }
        if (cM46114du != -1) {
            m8081k4().m46124kk();
        }
        return C7179c5.m27751x1(c6765kp.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m8089k4(long j) {
        long jM46112c5;
        boolean z;
        long j2;
        int i;
        String strM46134yj;
        String str;
        C7184h4 c7184h4M27832k4;
        C9422ck c9422ckM8081k4;
        long jM46121k4;
        int length;
        boolean z2 = true;
        try {
        } catch (IOException unused) {
            jM46112c5 = m8081k4().m46112c5();
        }
        if (m8081k4().m46126m9() == '<') {
            z = true;
            jM46112c5 = -1;
            if (z) {
                m8081k4().m46130up();
                int iM46118jd = m8081k4().m46118jd();
                String strM46122k4 = m8081k4().m46122k4(3);
                if (!"obj".equals(strM46122k4) && !"o".equals(strM46122k4)) {
                    z2 = false;
                }
                C6005k4.m24261k4(z2);
                j2 = jM46112c5;
                i = iM46118jd;
            } else {
                j2 = -1;
                i = -1;
            }
            m8081k4().m46130up();
            C7185jd c7185jdM8103m9 = m8103m9();
            long jM46121k42 = m8081k4().m46121k4();
            strM46134yj = m8081k4().m46134yj();
            C7180ck c7180ck = c7185jdM8103m9;
            if ("stream".equals(strM46134yj)) {
                m8081k4().m46123k4(jM46121k42);
                if (!C7019kk.m27469x1(c7185jdM8103m9, C7187kk.class)) {
                    throw new IOException("Stream not preceded by dictionary");
                }
                C7180ck c7180ckM8088k4 = m8088k4((C7187kk) C7019kk.m27452k4((Object) c7185jdM8103m9, C7187kk.class));
                C7185jd c7185jdM27809kk = c7180ckM8088k4.m27809kk(C7182dy.f19699xc);
                if (((c7185jdM27809kk == null || !C7019kk.m27469x1(c7185jdM27809kk, C7179c5.class)) ? -1 : ((C7179c5) C7019kk.m27452k4((Object) c7185jdM27809kk, C7179c5.class)).m27752kk()) == -1) {
                    this.f5928x1.addItem(c7180ckM8088k4);
                }
                C7182dy c7182dyM27792du = c7180ckM8088k4.m27792du(C7182dy.f19711xz);
                if (c7182dyM27792du != null && c7182dyM27792du == C7182dy.f19438gm) {
                    m8091k4(c7180ckM8088k4, j);
                }
                m8081k4().m46130up();
                strM46134yj = m8081k4().m46129to();
                c7180ck = c7180ckM8088k4;
            }
            str = strM46134yj;
            c7184h4M27832k4 = this.f5927to.m27832k4(new C7188ks(j2, i));
            if (c7184h4M27832k4.m27772kk() != null) {
                c7184h4M27832k4.m27771k4(c7180ck);
            } else {
                m8090k4(j, j2, i, c7180ck);
            }
            if (!"endobj".equals(str)) {
                if (C14113y2.m67448x1(str, "endobj")) {
                    c9422ckM8081k4 = m8081k4();
                    jM46121k4 = m8081k4().m46121k4();
                    length = str.length() - 6;
                } else if (!C14113y2.m67424kk(C14113y2.m67440x1(str), "endobj") && !m8081k4().m46132x1()) {
                    c9422ckM8081k4 = m8081k4();
                    jM46121k4 = m8081k4().m46121k4();
                    length = str.length();
                }
                c9422ckM8081k4.m46123k4(jM46121k4 - ((long) length));
                m8081k4().m46124kk();
            }
            m8081k4().m46130up();
        }
        jM46112c5 = m8081k4().m46112c5();
        z = false;
        if (z) {
        }
        m8081k4().m46130up();
        C7185jd c7185jdM8103m92 = m8103m9();
        long jM46121k422 = m8081k4().m46121k4();
        strM46134yj = m8081k4().m46134yj();
        C7180ck c7180ck2 = c7185jdM8103m92;
        if ("stream".equals(strM46134yj)) {
        }
        str = strM46134yj;
        c7184h4M27832k4 = this.f5927to.m27832k4(new C7188ks(j2, i));
        if (c7184h4M27832k4.m27772kk() != null) {
        }
        if (!"endobj".equals(str)) {
        }
        m8081k4().m46130up();
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m8099x1(long j) {
        if (m8081k4().m46126m9() != 'x' || !"xref".equals(C14113y2.m67440x1(m8081k4().m46134yj()))) {
            return false;
        }
        String strM46115dy = m8081k4().m46115dy();
        this.f5925k4.m46194x1(j);
        if (C14113y2.m67448x1(strM46115dy, "trailer")) {
            return false;
        }
        m8094ks();
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m8090k4(long j, long j2, int i, C7185jd c7185jd) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    private void m8091k4(C7180ck c7180ck, long j) {
        m8092k4(c7180ck, j, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m8092k4(C7180ck c7180ck, long j, boolean z) {
        if (z) {
            this.f5925k4.m46194x1(j);
            this.f5925k4.m46191k4(c7180ck);
        }
        new C1362h4(c7180ck, this.f5927to, this.f5925k4).mo8078h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8102k4(C7190to c7190to) {
        this.f5927to = c7190to;
    }
}
