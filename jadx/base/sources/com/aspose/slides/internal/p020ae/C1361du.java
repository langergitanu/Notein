package com.aspose.slides.internal.p020ae;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p128fc.C3958u4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7184h4;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.C7188ks;
import com.aspose.slides.internal.p329p4.C7192x1;
import com.aspose.slides.internal.p333p8.C9422ck;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: renamed from: com.aspose.slides.internal.ae.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1361du implements IGenericEnumerator<Object> {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f5916k4 = new byte[10];

    /* JADX INFO: renamed from: kk */
    private Object f5917kk;

    /* JADX INFO: renamed from: x1 */
    private final C1365to f5918x1;

    public C1361du(C1365to c1365to) {
        this.f5918x1 = c1365to;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c5 */
    private C7179c5 m8062c5() {
        char cM46114du;
        C6765kp c6765kp = new C6765kp();
        while (true) {
            cM46114du = (char) this.f5918x1.m8081k4().m46114du();
            if (!C14117yj.m67539to(cM46114du) && cM46114du != 45 && cM46114du != 43 && cM46114du != 46 && cM46114du != 69 && cM46114du != 101) {
                break;
            }
            c6765kp.m26780k4(cM46114du);
        }
        if (cM46114du != -1) {
            this.f5918x1.m8081k4().m46124kk();
        }
        return C7179c5.m27751x1(c6765kp.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r0 != (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        r6.f5918x1.m8081k4().m46124kk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m8063du() {
        while (true) {
            int iM46114du = this.f5918x1.m8081k4().m46114du();
            boolean z = false;
            if (iM46114du == -1 || iM46114du == 47 || iM46114du == 62) {
                break;
            }
            if (iM46114du == 101 && this.f5918x1.m8081k4().m46114du() == 110 && this.f5918x1.m8081k4().m46114du() == 100) {
                int iM46114du2 = this.f5918x1.m8081k4().m46114du();
                boolean z2 = iM46114du2 == 115 && this.f5918x1.m8081k4().m46114du() == 116 && this.f5918x1.m8081k4().m46114du() == 114 && this.f5918x1.m8081k4().m46114du() == 101 && this.f5918x1.m8081k4().m46114du() == 97 && this.f5918x1.m8081k4().m46114du() == 109;
                if (!z2 && iM46114du2 == 111 && this.f5918x1.m8081k4().m46114du() == 98 && this.f5918x1.m8081k4().m46114du() == 106) {
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
    
        r7.f5918x1.m8081k4().m46114du();
        r7.f5918x1.m8081k4().m46130up();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX INFO: renamed from: dy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C7186k4 m8064dy() {
        char cM46114du = (char) this.f5918x1.m8081k4().m46114du();
        C6005k4.m24262k4(cM46114du == '[', C14113y2.m67402k4("expected='[' actual='{0}'", Character.valueOf(cM46114du)));
        C7186k4 c7186k4 = new C7186k4();
        while (true) {
            this.f5918x1.m8081k4().m46130up();
            char cM46126m9 = this.f5918x1.m8081k4().m46126m9();
            if (cM46126m9 <= 0 || cM46126m9 == ']') {
                break;
            }
            C7185jd c7185jdM8073m9 = m8073m9();
            if (C7019kk.m27469x1(c7185jdM8073m9, C7184h4.class)) {
                C7185jd c7185jdM27787x1 = c7186k4.m27787x1(c7186k4.m27778k4() - 1);
                if (C7019kk.m27469x1(c7185jdM27787x1, C7179c5.class)) {
                    C7179c5 c7179c5 = (C7179c5) C7019kk.m27452k4((Object) c7185jdM27787x1, C7179c5.class);
                    c7186k4.m27782k4(c7186k4.m27778k4() - 1);
                    C7185jd c7185jdM27787x12 = c7186k4.m27787x1(c7186k4.m27778k4() - 1);
                    if (C7019kk.m27469x1(c7185jdM27787x12, C7179c5.class)) {
                        C7179c5 c7179c52 = (C7179c5) C7019kk.m27452k4((Object) c7185jdM27787x12, C7179c5.class);
                        c7186k4.m27782k4(c7186k4.m27778k4() - 1);
                        c7185jdM8073m9 = m8066k4(c7179c52.m27752kk(), c7179c5.m27752kk());
                    } else {
                        c7185jdM8073m9 = null;
                    }
                }
            }
            if (c7185jdM8073m9 != null) {
                c7186k4.m27783k4(c7185jdM8073m9);
            } else {
                String strM46115dy = this.f5918x1.m8081k4().m46115dy();
                if ("endobj".equals(strM46115dy) || "endstream".equals(strM46115dy)) {
                    break;
                }
            }
        }
        return c7186k4;
    }

    /* JADX INFO: renamed from: h4 */
    private C7185jd m8065h4() {
        C7185jd c7185jdM8073m9 = m8073m9();
        this.f5918x1.m8081k4().m46130up();
        char cM46126m9 = this.f5918x1.m8081k4().m46126m9();
        if (cM46126m9 < '0' || cM46126m9 > '9') {
            return c7185jdM8073m9;
        }
        C7185jd c7185jdM8073m92 = m8073m9();
        this.f5918x1.m8081k4().m46130up();
        C6005k4.m24261k4(((char) this.f5918x1.m8081k4().m46114du()) == 'R');
        return m8066k4(((C7179c5) c7185jdM8073m9).m27752kk(), ((C7179c5) c7185jdM8073m92).m27752kk());
    }

    /* JADX INFO: renamed from: k4 */
    private C7184h4 m8066k4(long j, int i) {
        long j2 = i;
        C7188ks c7188ks = new C7188ks(j, j2);
        if (this.f5918x1.m8082x1().containsKey(c7188ks)) {
            return this.f5918x1.m8082x1().get_Item(c7188ks);
        }
        C7184h4 c7184h4 = new C7184h4(j, j2);
        this.f5918x1.m8082x1().addItem(c7188ks, c7184h4);
        return c7184h4;
    }

    /* JADX INFO: renamed from: kk */
    private String m8072kk() {
        this.f5918x1.m8081k4().m46130up();
        C6765kp c6765kp = new C6765kp(4);
        int iM46117h4 = this.f5918x1.m8081k4().m46117h4();
        while (iM46117h4 != -1 && !C9422ck.m46110to(iM46117h4) && !C9422ck.m46104du(iM46117h4) && iM46117h4 != 91 && iM46117h4 != 60 && iM46117h4 != 40 && iM46117h4 != 47 && (iM46117h4 < 48 || iM46117h4 > 57)) {
            char cM46114du = (char) this.f5918x1.m8081k4().m46114du();
            int iM46117h42 = this.f5918x1.m8081k4().m46117h4();
            c6765kp.m26780k4(cM46114du);
            if (cM46114du == 'd' && (iM46117h42 == 48 || iM46117h42 == 49)) {
                c6765kp.m26780k4((char) this.f5918x1.m8081k4().m46114du());
                iM46117h4 = this.f5918x1.m8081k4().m46114du();
            } else {
                iM46117h4 = iM46117h42;
            }
        }
        return c6765kp.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m9 */
    private C7185jd m8073m9() {
        C7192x1 c7192x1M27851x1;
        this.f5918x1.m8081k4().m46130up();
        char cM46126m9 = this.f5918x1.m8081k4().m46126m9();
        if (cM46126m9 == -1) {
            return null;
        }
        if (cM46126m9 == 40) {
            return this.f5918x1.m8081k4().m46127ne();
        }
        if (cM46126m9 == 47) {
            return this.f5918x1.m8081k4().m46125ks();
        }
        if (cM46126m9 == 60) {
            this.f5918x1.m8081k4().m46114du();
            char cM46126m92 = this.f5918x1.m8081k4().m46126m9();
            this.f5918x1.m8081k4().m46124kk();
            if (cM46126m92 != '<') {
                return this.f5918x1.m8081k4().m46127ne();
            }
            C7187kk c7187kkM8074to = m8074to();
            this.f5918x1.m8081k4().m46130up();
            return c7187kkM8074to;
        }
        if (cM46126m9 == 82) {
            this.f5918x1.m8081k4().m46114du();
            return new C7184h4(null);
        }
        if (cM46126m9 == 91) {
            return m8064dy();
        }
        if (cM46126m9 == 102) {
            String strM46122k4 = this.f5918x1.m8081k4().m46122k4(5);
            c7192x1M27851x1 = TelemetryEventStrings.Value.FALSE.equals(strM46122k4) ? C7192x1.m27851x1() : null;
            C6005k4.m24261k4(TelemetryEventStrings.Value.FALSE.equals(strM46122k4));
            return c7192x1M27851x1;
        }
        if (cM46126m9 == 110) {
            C6005k4.m24262k4(CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(this.f5918x1.m8081k4().m46134yj()), "'nul' string is expected");
            return C7185jd.m27775dy();
        }
        if (cM46126m9 == 116) {
            String strM46122k42 = this.f5918x1.m8081k4().m46122k4(4);
            c7192x1M27851x1 = TelemetryEventStrings.Value.TRUE.equals(strM46122k42) ? C7192x1.m27848k4() : null;
            C6005k4.m24261k4(TelemetryEventStrings.Value.TRUE.equals(strM46122k42));
            return c7192x1M27851x1;
        }
        if (cM46126m9 == 65535) {
            return null;
        }
        if (C14117yj.m67539to(cM46126m9) || cM46126m9 == 45 || cM46126m9 == 43 || cM46126m9 == 46) {
            return m8062c5();
        }
        long jM46121k4 = this.f5918x1.m8081k4().m46121k4();
        String strM46134yj = this.f5918x1.m8081k4().m46134yj();
        C6005k4.m24262k4(!C14113y2.m67411k4(strM46134yj), "Unknown dir object ");
        if (!"endobj".equals(strM46134yj) && !"endstream".equals(strM46134yj)) {
            return null;
        }
        this.f5918x1.m8081k4().m46123k4(jM46121k4);
        return null;
    }

    /* JADX INFO: renamed from: to */
    private C7187kk m8074to() {
        C6005k4.m24262k4(((char) this.f5918x1.m8081k4().m46114du()) == '<', "Dictionary should start from <<");
        C6005k4.m24262k4(((char) this.f5918x1.m8081k4().m46114du()) == '<', "Dictionary should start from <<");
        this.f5918x1.m8081k4().m46130up();
        C7187kk c7187kk = new C7187kk();
        boolean z = false;
        while (!z) {
            this.f5918x1.m8081k4().m46130up();
            char cM46126m9 = this.f5918x1.m8081k4().m46126m9();
            if (cM46126m9 == '>') {
                z = true;
            } else if (cM46126m9 == '/') {
                m8069k4(c7187kk);
            } else if (m8063du()) {
                return c7187kk;
            }
        }
        C6005k4.m24261k4(((char) this.f5918x1.m8081k4().m46114du()) == '>');
        C6005k4.m24261k4(((char) this.f5918x1.m8081k4().m46114du()) == '>');
        return c7187kk;
    }

    /* JADX INFO: renamed from: x1 */
    private Object m8075x1() {
        String strM67407k4 = C14113y2.m67407k4(C14117yj.m67537ne((char) this.f5918x1.m8081k4().m46114du()), Character.valueOf((char) this.f5918x1.m8081k4().m46114du()));
        if (!"ID".equals(strM67407k4)) {
            throw new IOException(C14113y2.m67402k4("Expected operator is 'ID', but actual='{0}' at stream position {1}", strM67407k4, Long.valueOf(this.f5918x1.m8081k4().m46121k4())));
        }
        C3152yj c3152yj = new C3152yj();
        if (C9422ck.m46110to(this.f5918x1.m8081k4().m46126m9())) {
            this.f5918x1.m8081k4().m46114du();
        }
        int iM46114du = this.f5918x1.m8081k4().m46114du();
        int iM46114du2 = this.f5918x1.m8081k4().m46114du();
        char cM46126m9 = this.f5918x1.m8081k4().m46126m9();
        while (true) {
            if ((iM46114du == 69 && iM46114du2 == 73 && C9422ck.m46105h4(cM46126m9) && m8071k4(this.f5918x1.m8081k4())) || this.f5918x1.m8081k4().m46132x1()) {
                break;
            }
            c3152yj.writeByte((byte) iM46114du);
            int i = iM46114du2;
            iM46114du2 = this.f5918x1.m8081k4().m46114du();
            iM46114du = i;
        }
        C3958u4 c3958u4M15658k4 = C3958u4.m15658k4("ID");
        c3958u4M15658k4.m15660k4(c3152yj.toArray());
        return c3958u4M15658k4;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (com.aspose.slides.p559ms.System.C14113y2.m67440x1(r0).length() > 0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[PHI: r0
      0x0039: PHI (r0v42 java.lang.String) = 
      (r0v22 java.lang.String)
      (r0v29 java.lang.String)
      (r0v34 java.lang.String)
      (r0v37 java.lang.String)
      (r0v47 java.lang.String)
     binds: [B:26:0x00b3, B:21:0x008d, B:18:0x0075, B:15:0x005e, B:10:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hasNext() {
        Object objM8068k4;
        String strM46134yj;
        this.f5918x1.m8081k4().m46130up();
        if (this.f5918x1.m8081k4().m46132x1()) {
            m8070k4((Object) null);
            return false;
        }
        char cM46126m9 = this.f5918x1.m8081k4().m46126m9();
        switch (cM46126m9) {
            case '(':
                objM8068k4 = this.f5918x1.m8081k4().m46127ne();
                m8070k4(objM8068k4);
                break;
            case '+':
                objM8068k4 = m8068k4(cM46126m9);
                m8070k4(objM8068k4);
                break;
            case '<':
                this.f5918x1.m8081k4().m46114du();
                char cM46126m92 = this.f5918x1.m8081k4().m46126m9();
                this.f5918x1.m8081k4().m46124kk();
                if (cM46126m92 == '<') {
                    objM8068k4 = m8074to();
                }
                m8070k4(objM8068k4);
                break;
            case 'B':
                objM8068k4 = m8067k4();
                m8070k4(objM8068k4);
                break;
            case 'I':
                objM8068k4 = m8075x1();
                m8070k4(objM8068k4);
                break;
            case 'R':
                strM46134yj = this.f5918x1.m8081k4().m46134yj();
                objM8068k4 = "R".equals(strM46134yj) ? new C7184h4(null) : C3958u4.m15658k4(strM46134yj);
                m8070k4(objM8068k4);
                break;
            case '[':
                objM8068k4 = m8064dy();
                m8070k4(objM8068k4);
                break;
            case ']':
                this.f5918x1.m8081k4().m46114du();
                objM8068k4 = C7185jd.m27775dy();
                m8070k4(objM8068k4);
                break;
            case 'f':
                strM46134yj = this.f5918x1.m8081k4().m46122k4(5);
                if (TelemetryEventStrings.Value.FALSE.equals(strM46134yj)) {
                    objM8068k4 = C7192x1.m27851x1();
                }
                m8070k4(objM8068k4);
                break;
            case 'n':
                strM46134yj = this.f5918x1.m8081k4().m46134yj();
                if (CloudMetaExtra.DEFINE_NON_PARENT_ID.equals(strM46134yj)) {
                    objM8068k4 = C7185jd.m27775dy();
                }
                m8070k4(objM8068k4);
                break;
            case 't':
                strM46134yj = this.f5918x1.m8081k4().m46122k4(4);
                if (TelemetryEventStrings.Value.TRUE.equals(strM46134yj)) {
                    objM8068k4 = C7192x1.m27848k4();
                }
                m8070k4(objM8068k4);
                break;
            default:
                switch (cM46126m9) {
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                    case '/':
                        objM8068k4 = this.f5918x1.m8081k4().m46125ks();
                        m8070k4(objM8068k4);
                        break;
                    default:
                        strM46134yj = m8072kk();
                        break;
                }
                break;
        }
        return next() != null;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final Object next() {
        return this.f5917kk;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: k4 */
    private Object m8067k4() {
        Object objValueOf;
        String strM46134yj = this.f5918x1.m8081k4().m46134yj();
        C3958u4 c3958u4M15658k4 = C3958u4.m15658k4(strM46134yj);
        if ("BI".equals(strM46134yj)) {
            C7187kk c7187kk = new C7187kk();
            c3958u4M15658k4.m15659k4(c7187kk);
            while (true) {
                objValueOf = Boolean.valueOf(hasNext());
                if (!C7019kk.m27469x1(objValueOf, C7182dy.class)) {
                    break;
                }
                c7187kk.m27815x1((C7182dy) objValueOf, (C7185jd) Boolean.valueOf(hasNext()));
            }
            if (C7019kk.m27469x1(objValueOf, C3958u4.class)) {
                c3958u4M15658k4.m15660k4(((C3958u4) objValueOf).m15661k4());
            }
        }
        return c3958u4M15658k4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        r7 = false;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object m8068k4(char c) {
        boolean z;
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26780k4(c);
        this.f5918x1.m8081k4().m46114du();
        if (c == '-' && this.f5918x1.m8081k4().m46126m9() == c) {
            this.f5918x1.m8081k4().m46114du();
        }
        if (c != '.') {
            z = true;
            while (true) {
                char cM46126m9 = this.f5918x1.m8081k4().m46126m9();
                if (!C14117yj.m67539to(cM46126m9) && ((!z || cM46126m9 != '.') && cM46126m9 != '-')) {
                    return C7179c5.m27751x1(c6765kp.toString());
                }
                if (cM46126m9 != '-') {
                    c6765kp.m26780k4(cM46126m9);
                }
                this.f5918x1.m8081k4().m46114du();
                if (!z || cM46126m9 != '.') {
                }
            }
        }
        z = false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m8069k4(C7187kk c7187kk) {
        C7182dy c7182dyM46125ks = this.f5918x1.m8081k4().m46125ks();
        C7185jd c7185jdM8065h4 = m8065h4();
        this.f5918x1.m8081k4().m46130up();
        if (this.f5918x1.m8081k4().m46126m9() == 'd') {
            String strM46134yj = this.f5918x1.m8081k4().m46134yj();
            if (strM46134yj == null || "def".equals(strM46134yj)) {
                this.f5918x1.m8081k4().m46130up();
            } else {
                this.f5918x1.m8081k4().m46123k4(this.f5918x1.m8081k4().m46121k4() - ((long) strM46134yj.length()));
            }
        }
        if (c7185jdM8065h4 != null) {
            c7187kk.m27800k4(c7182dyM46125ks, c7185jdM8065h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8070k4(Object obj) {
        this.f5917kk = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m8071k4(C9422ck c9422ck) {
        int iM46119k4 = c9422ck.m46119k4(this.f5916k4);
        boolean z = true;
        if (iM46119k4 <= 0) {
            return true;
        }
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < iM46119k4; i3++) {
            int i4 = this.f5916k4[i3] & 255;
            if ((i4 != 0 && i4 < 9) || (i4 > 10 && i4 < 32 && i4 != 13)) {
                z = false;
                break;
            }
            if (i == -1 && i4 != 0 && i4 != 9 && i4 != 32 && i4 != 10 && i4 != 13) {
                i = i3;
            } else if (i != -1 && i2 == -1 && (i4 == 0 || i4 == 9 || i4 == 32 || i4 == 10 || i4 == 13)) {
                i2 = i3;
            }
        }
        if (i2 != -1 && i != -1) {
            String strM67406k4 = C14113y2.m67406k4(AbstractC6747ar.m26650yj().m26671k4(this.f5916k4), i, i2 - i);
            if (!"Q".equals(strM67406k4) && !"EMC".equals(strM67406k4) && !"S".equals(strM67406k4)) {
                z = false;
            }
        }
        if (iM46119k4 != 10) {
            z2 = z;
        } else {
            if (i != -1 && i2 == -1) {
                i2 = 10;
            }
            if (i2 == -1 || i == -1 || i2 - i <= 3) {
            }
        }
        c9422ck.m46131x1(iM46119k4);
        return z2;
    }
}
