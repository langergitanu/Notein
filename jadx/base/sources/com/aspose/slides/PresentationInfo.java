package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p077d8.C3088tq;
import com.aspose.slides.internal.p077d8.C3091u4;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3126c5;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.C3171dy;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.internal.p407st.C10646tb;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11707b3;
import com.aspose.slides.internal.p464vq.C11724d4;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p466vu.AbstractC11874k4;
import com.aspose.slides.internal.p466vu.C11875x1;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class PresentationInfo implements IPresentationInfo {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f3147jd = new C7017h4(".ppsx", ".potx", ".pptm", ".ppsm", ".potm", ".pps", ".pot");

    /* JADX INFO: renamed from: c5 */
    private DocumentProperties f3148c5;

    /* JADX INFO: renamed from: du */
    private final C3126c5 f3149du;

    /* JADX INFO: renamed from: dy */
    private C9816ck f3150dy;

    /* JADX INFO: renamed from: h4 */
    private AbstractC3150x6 f3151h4;

    /* JADX INFO: renamed from: k4 */
    private int f3152k4;

    /* JADX INFO: renamed from: kk */
    private boolean f3153kk;

    /* JADX INFO: renamed from: m9 */
    private AbstractC11760jd f3154m9;

    /* JADX INFO: renamed from: to */
    private byte f3155to;

    /* JADX INFO: renamed from: x1 */
    private boolean f3156x1;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082 A[Catch: all -> 0x005a, RuntimeException -> 0x005d, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x005d, blocks: (B:3:0x001a, B:5:0x0029, B:7:0x0033, B:9:0x003f, B:11:0x004c, B:40:0x0106, B:19:0x007e, B:20:0x0082, B:24:0x0097, B:26:0x00a6, B:27:0x00b7, B:32:0x00d3, B:35:0x00da, B:36:0x00e9, B:38:0x00ff, B:39:0x0102), top: B:59:0x001a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PresentationInfo(AbstractC3150x6 abstractC3150x6, C3126c5 c3126c5) {
        this.f3149du = c3126c5;
        this.f3156x1 = false;
        this.f3153kk = false;
        this.f3155to = (byte) -1;
        AbstractC3150x6 abstractC3150x6M13133k4 = C3091u4.m13133k4(abstractC3150x6);
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                int i = abstractC3150x6M13133k4.readByte();
                try {
                    if (i > 0) {
                        abstractC3150x6M13133k4.seek(-1L, 1);
                        if (((byte) i) == 80) {
                            int[] iArr = {0};
                            boolean zM71641k4 = ubs.m71641k4(abstractC3150x6, iArr);
                            int i2 = iArr[0];
                            if (zM71641k4) {
                                m2442m9(abstractC3150x6M13133k4);
                                boolean zM71643kk = ubs.m71643kk(abstractC3150x6M13133k4);
                                this.f3156x1 = zM71643kk;
                                this.f3152k4 = i2;
                                if (!zM71643kk) {
                                    m2442m9(abstractC3150x6M13133k4);
                                    this.f3154m9 = new C11724d4(abstractC3150x6M13133k4, C3171dy.f9427k4);
                                }
                            } else {
                                m2442m9(abstractC3150x6M13133k4);
                                this.f3154m9 = new C11785nh(abstractC3150x6M13133k4, C3171dy.f9427k4);
                                this.f3152k4 = m2437k4();
                                this.f3155to = kjx.m63938k4((C11785nh) this.f3154m9) ? (byte) 1 : (byte) 0;
                            }
                        } else if (Presentation.m2343x1(abstractC3150x6M13133k4)) {
                            m2442m9(abstractC3150x6M13133k4);
                            this.f3154m9 = ubs.m71634k4(abstractC3150x6M13133k4);
                            this.f3152k4 = 13;
                        } else {
                            m2442m9(abstractC3150x6M13133k4);
                            C9816ck c9816ckM6834x1 = gni.m6834x1(abstractC3150x6M13133k4);
                            this.f3150dy = c9816ckM6834x1;
                            if (gni.m6822k4(c9816ckM6834x1)) {
                                this.f3156x1 = true;
                                this.f3153kk = gni.m6836x1(this.f3150dy);
                                this.f3152k4 = m2440kk(abstractC3150x6);
                            } else {
                                boolean[] zArr = {false};
                                boolean[] zArr2 = {false};
                                boolean[] zArr3 = {false};
                                gni.m6818k4(abstractC3150x6, zArr, zArr2, zArr3);
                                boolean z = zArr[0];
                                boolean z2 = zArr2[0];
                                boolean z3 = zArr3[0];
                                if (z || z2) {
                                    this.f3152k4 = 11;
                                } else if (z3 || gni.m6821k4(abstractC3150x6)) {
                                    this.f3156x1 = true;
                                    this.f3152k4 = m2433du();
                                    boolean zM51738k4 = C10646tb.m51738k4(this.f3150dy, "/01Hannes Ruescher/01");
                                    this.f3153kk = !zM51738k4;
                                    if (zM51738k4) {
                                        this.f3155to = (byte) 1;
                                    }
                                } else {
                                    this.f3152k4 = m2433du();
                                    this.f3155to = C10646tb.m51737k4(this.f3150dy) ? (byte) 1 : (byte) 0;
                                }
                            }
                        }
                    }
                } catch (PptReadException | PptxReadException | RuntimeException unused) {
                    this.f3152k4 = 255;
                }
                v7f.m72084k4(c14047bzClone.Clone(), abstractC3150x6M13133k4);
                if (!isEncrypted()) {
                    if (abstractC3150x6M13133k4 != abstractC3150x6) {
                        abstractC3150x6M13133k4.dispose();
                    }
                } else if (abstractC3150x6M13133k4 != abstractC3150x6) {
                    this.f3151h4 = abstractC3150x6M13133k4;
                } else {
                    m2442m9(abstractC3150x6);
                    this.f3151h4 = C3091u4.m13134x1(abstractC3150x6);
                }
            } catch (RuntimeException e) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw e;
            }
        } catch (Throwable th) {
            if (isEncrypted()) {
                if (abstractC3150x6M13133k4 != abstractC3150x6) {
                    this.f3151h4 = abstractC3150x6M13133k4;
                } else {
                    m2442m9(abstractC3150x6);
                    this.f3151h4 = C3091u4.m13134x1(abstractC3150x6);
                }
            } else if (abstractC3150x6M13133k4 != abstractC3150x6) {
                abstractC3150x6M13133k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: du */
    private int m2433du() {
        C3126c5 c3126c5 = this.f3149du;
        if (c3126c5 == null) {
            return 1;
        }
        int iM27428k4 = f3147jd.m27428k4(c3126c5.m13432m9());
        if (iM27428k4 != 5) {
            return iM27428k4 != 6 ? 1 : 12;
        }
        return 2;
    }

    /* JADX INFO: renamed from: h4 */
    private C14670va m2435h4() {
        C3088tq c3088tq;
        C9820h4 c9820h4 = (C9820h4) this.f3150dy.m48360k4().m48344to("\u0005SummaryInformation");
        C9820h4 c9820h42 = (C9820h4) this.f3150dy.m48360k4().m48344to("\u0005DocumentSummaryInformation");
        C3088tq c3088tq2 = null;
        if (c9820h4 != null) {
            C3152yj c3152yj = new C3152yj(c9820h4.m48410k4());
            try {
                c3088tq = new C3088tq(c3152yj);
                c3152yj.dispose();
            } finally {
            }
        } else {
            c3088tq = null;
        }
        if (c9820h4 != null) {
            try {
                c3088tq2 = new C3088tq(new C3152yj(c9820h42.m48410k4()));
            } finally {
            }
        }
        return new C14670va(c3088tq2, c3088tq);
    }

    /* JADX INFO: renamed from: k4 */
    private int m2437k4() {
        int iM64612k4 = lxj.m64612k4(((C11785nh) this.f3154m9).m55354ar().m55372fa().mo55273k4(), 0);
        if (iM64612k4 == 0) {
            return 3;
        }
        if (iM64612k4 == 1) {
            return 7;
        }
        if (iM64612k4 == 2) {
            return 4;
        }
        if (iM64612k4 == 3) {
            return 8;
        }
        if (iM64612k4 != 4) {
            return iM64612k4 != 5 ? 255 : 9;
        }
        return 6;
    }

    /* JADX INFO: renamed from: kk */
    private int m2440kk(AbstractC3150x6 abstractC3150x6) {
        C3130fa c3130fa = (C3130fa) C7019kk.m27452k4((Object) abstractC3150x6, C3130fa.class);
        if (c3130fa == null) {
            return 3;
        }
        int iM27428k4 = f3147jd.m27428k4(C3141rv.m13397du(c3130fa.m13345k4()));
        if (iM27428k4 == 0) {
            return 4;
        }
        if (iM27428k4 == 1) {
            return 6;
        }
        if (iM27428k4 == 2) {
            return 7;
        }
        if (iM27428k4 != 3) {
            return iM27428k4 != 4 ? 3 : 9;
        }
        return 8;
    }

    /* JADX INFO: renamed from: m9 */
    private void m2442m9(AbstractC3150x6 abstractC3150x6) {
        abstractC3150x6.seek(0L, 0);
    }

    /* JADX INFO: renamed from: to */
    private DocumentProperties m2443to() {
        DocumentProperties documentProperties = new DocumentProperties();
        gni.m6816k4(documentProperties, m2435h4());
        return documentProperties;
    }

    /* JADX INFO: renamed from: x1 */
    private DocumentProperties m2445x1() {
        DocumentProperties documentProperties = new DocumentProperties();
        C11785nh c11785nh = (C11785nh) this.f3154m9;
        u6u u6uVar = new u6u();
        kjx.m63933k4(c11785nh, documentProperties, u6uVar);
        kjx.m63945x1(c11785nh, documentProperties, u6uVar);
        return documentProperties;
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final boolean checkPassword(String str) {
        if (!isPasswordProtected() || C14113y2.m67411k4(str)) {
            return false;
        }
        switch (getLoadFormat()) {
            case 1:
            case 2:
            case 12:
                m2442m9(this.f3151h4);
                C9816ck c9816ckM6834x1 = gni.m6834x1(this.f3151h4);
                this.f3150dy = c9816ckM6834x1;
                return C10646tb.m51738k4(c9816ckM6834x1, str);
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                m2442m9(this.f3151h4);
                return ng8.m68021x1(this.f3151h4, str);
            case 5:
            case 10:
                throw new NotSupportedException("ODF format is not supported to check passwords.");
            case 11:
            default:
                throw new InvalidOperationException("An unknown presentation format is encountered.");
        }
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final boolean checkWriteProtection(String str) {
        if (C14113y2.m67411k4(str)) {
            return false;
        }
        switch (getLoadFormat()) {
            case 1:
            case 2:
            case 12:
                if (isPasswordProtected()) {
                    throw new InvalidOperationException("A presentation is protected by a password to open.");
                }
                if (isEncrypted()) {
                    m2442m9(this.f3151h4);
                    this.f3150dy = gni.m6834x1(this.f3151h4);
                }
                return C10646tb.m51741x1(this.f3150dy, str);
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                if (isEncrypted() && this.f3154m9 == null) {
                    throw new InvalidOperationException("A presentation is protected by a password to open.");
                }
                return kjx.m63939k4((C11785nh) this.f3154m9, str);
            case 5:
            case 10:
                throw new InvalidOperationException("ODF format does not support write protection.");
            case 11:
            default:
                throw new InvalidOperationException("An unknown presentation format is encountered.");
            case 13:
                throw new InvalidOperationException("FODP format does not support write protection.");
        }
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final int getLoadFormat() {
        return this.f3152k4;
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final boolean isEncrypted() {
        return this.f3156x1;
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final boolean isPasswordProtected() {
        return this.f3153kk;
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final byte isWriteProtected() {
        return this.f3155to;
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final IDocumentProperties readDocumentProperties() {
        DocumentProperties documentPropertiesM2443to;
        if (getLoadFormat() == 255) {
            throw new NotImplementedException("The document format is unknown");
        }
        if (isEncrypted()) {
            throw new NotImplementedException("Can't read properties of encrypted document");
        }
        if (this.f3148c5 == null) {
            switch (getLoadFormat()) {
                case 1:
                case 2:
                case 12:
                    documentPropertiesM2443to = m2443to();
                    break;
                case 3:
                case 4:
                case 6:
                case 7:
                case 8:
                case 9:
                    documentPropertiesM2443to = m2445x1();
                    break;
                case 5:
                case 10:
                case 13:
                    documentPropertiesM2443to = m2441kk();
                    break;
                case 11:
                default:
                    throw new NotImplementedException();
            }
            this.f3148c5 = documentPropertiesM2443to;
        }
        return this.f3148c5.cloneT();
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final void updateDocumentProperties(IDocumentProperties iDocumentProperties) {
        if (iDocumentProperties == null) {
            throw new ArgumentNullException("documentProperties");
        }
        if (getLoadFormat() == 255) {
            throw new NotImplementedException("The document format is unknown");
        }
        if (isEncrypted()) {
            throw new NotImplementedException("Can't update properties of encrypted document");
        }
        this.f3148c5 = (DocumentProperties) ((DocumentProperties) iDocumentProperties).cloneT();
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final void writeBindedPresentation(OutputStream outputStream) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.PresentationInfo.1
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                PresentationInfo.this.m2447k4(abstractC3150x6);
            }
        });
    }

    /* JADX INFO: renamed from: du */
    private void m2434du(AbstractC3150x6 abstractC3150x6) {
        byte[][] bArr = {null};
        byte[][] bArr2 = {null};
        gij.m6710k4(this.f3148c5, m2435h4(), bArr, bArr2);
        byte[] bArr3 = bArr[0];
        byte[] bArr4 = bArr2[0];
        if (this.f3150dy.m48360k4().m48345x1("\u0005SummaryInformation")) {
            this.f3150dy.m48360k4().m48343kk("\u0005SummaryInformation");
        }
        if (this.f3150dy.m48360k4().m48345x1("\u0005DocumentSummaryInformation")) {
            this.f3150dy.m48360k4().m48343kk("\u0005DocumentSummaryInformation");
        }
        if (bArr3 != null) {
            C9820h4 c9820h4 = new C9820h4("\u0005SummaryInformation");
            c9820h4.m48409k4(bArr3);
            this.f3150dy.m48360k4().m48340du(c9820h4);
        }
        if (bArr4 != null) {
            C9820h4 c9820h42 = new C9820h4("\u0005DocumentSummaryInformation");
            c9820h42.m48409k4(bArr4);
            this.f3150dy.m48360k4().m48340du(c9820h42);
        }
        abstractC3150x6.setLength(0L);
        this.f3150dy.m48362x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: h4 */
    private void m2436h4(AbstractC3150x6 abstractC3150x6) {
        C11724d4 c11724d4 = (C11724d4) this.f3154m9;
        new coj(c11724d4.m55318jd(), new u6u()).m4697kk(this.f3148c5);
        m2439k4(c11724d4.m55347kk(), c11724d4.m55318jd().m55424kk(), c11724d4.m55318jd().m55426to());
        abstractC3150x6.setLength(0L);
        c11724d4.m55347kk().m57507x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: kk */
    private DocumentProperties m2441kk() {
        DocumentProperties documentProperties = new DocumentProperties();
        C11724d4 c11724d4 = (C11724d4) this.f3154m9;
        new coj(c11724d4.m55318jd(), new u6u()).m4696k4(documentProperties);
        return documentProperties;
    }

    /* JADX INFO: renamed from: to */
    private void m2444to(AbstractC3150x6 abstractC3150x6) {
        C11785nh c11785nh = (C11785nh) this.f3154m9;
        ljn ljnVar = new ljn(c11785nh);
        new C14565tk(c11785nh.m55368wl(), ljnVar).m71239kk(this.f3148c5);
        m2439k4(c11785nh.m55347kk(), c11785nh.m55368wl().m55424kk(), c11785nh.m55368wl().m55426to());
        new C14668v9(c11785nh.m55361qq(), ljnVar).m72099x1(this.f3148c5, null);
        m2439k4(c11785nh.m55347kk(), c11785nh.m55361qq().m55424kk(), c11785nh.m55361qq().m55426to());
        m2438k4(abstractC3150x6, ljnVar);
        abstractC3150x6.setLength(0L);
        c11785nh.m55347kk().m57507x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: x1 */
    private void m2446x1(AbstractC3150x6 abstractC3150x6) {
        switch (getLoadFormat()) {
            case 1:
            case 2:
            case 12:
                m2434du(abstractC3150x6);
                return;
            case 3:
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                m2444to(abstractC3150x6);
                return;
            case 5:
            case 10:
            case 13:
                m2436h4(abstractC3150x6);
                return;
            case 11:
            default:
                throw new InvalidOperationException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2447k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        if (!abstractC3150x6.canSeek()) {
            throw new InvalidOperationException("The stream must be seekable to write the presentation");
        }
        if (!abstractC3150x6.canWrite()) {
            throw new InvalidOperationException("The stream must be writable to write the presentation");
        }
        if (getLoadFormat() == 255) {
            throw new NotImplementedException("The current document format is unknown");
        }
        if (isEncrypted()) {
            throw new NotImplementedException("The current document is encrypted and can't be written");
        }
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            v7f.m72086k4(c14047bzClone.Clone());
            m2446x1(abstractC3150x6);
            v7f.m72084k4(c14047bzClone.Clone(), abstractC3150x6);
        } catch (RuntimeException e) {
            v7f.m72090x1(c14047bzClone.Clone());
            throw e;
        }
    }

    @Override // com.aspose.slides.IPresentationInfo
    public final void writeBindedPresentation(String str) {
        C3130fa c3130fa = new C3130fa(str, 3, 3);
        try {
            m2447k4(c3130fa);
        } finally {
            c3130fa.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m2438k4(AbstractC3150x6 abstractC3150x6, ljn ljnVar) {
        C11785nh c11785nh = (C11785nh) ljnVar.mo4812qm();
        boolean z = c11785nh.m55366uz() != null;
        if (!z) {
            c11785nh.m55390dy().m55311x1(c11785nh.m55394k4("/docProps/custom.xml", (AbstractC11760jd.k4) null, new C11707b3()));
            C11791os c11791osM55392h4 = c11785nh.m55392h4("/_rels/.rels");
            c11785nh.m55403kk(c11791osM55392h4);
            m2439k4(c11785nh.m55347kk(), c11791osM55392h4.m55424kk(), c11791osM55392h4.m55426to());
            c11785nh.m55391fa();
            C11791os c11791osM55392h42 = c11785nh.m55392h4("/[Content_Types].xml");
            m2439k4(c11785nh.m55347kk(), c11791osM55392h42.m55424kk(), c11791osM55392h42.m55426to());
        }
        new C13708k0(c11785nh.m55366uz(), ljnVar).m63591kk(this.f3148c5);
        if (z) {
            c11785nh.m55347kk().m57489kk(c11785nh.m55366uz().m55424kk());
        }
        c11785nh.m55347kk().m57473k4(c11785nh.m55366uz().m55424kk(), (String) null, c11785nh.m55366uz().m55426to());
    }

    /* JADX INFO: renamed from: k4 */
    private void m2439k4(C12275wy c12275wy, String str, byte[] bArr) {
        c12275wy.m57489kk(str);
        c12275wy.m57473k4(str, (String) null, bArr);
    }
}
