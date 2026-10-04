package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OdpSerializationContext;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11724d4;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.internal.p482wr.C12251ck;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class lzc {

    /* JADX INFO: renamed from: k4 */
    private OdpSerializationContext f46118k4;

    /* JADX INFO: renamed from: kk */
    private psc f46119kk;

    /* JADX INFO: renamed from: to */
    private IGenericList<com.aspose.slides.internal.p332p7.w6f> f46120to;

    /* JADX INFO: renamed from: x1 */
    private boolean f46121x1 = false;

    /* JADX INFO: renamed from: du */
    private void m64631du(C11724d4 c11724d4, IPresentation iPresentation) {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f46118k4.m2046du().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                this.f46118k4.m2044c5().throwIfInterruptionRequested();
                C11839vw c11839vwM55319k4 = c11724d4.m55319k4(C14113y2.m67402k4("/{0}", OdpSerializationContext.m2042x1(((Integer) keyValuePair.getValue()).intValue())), "application/vnd.sun.star.oleobject");
                c11839vwM55319k4.m55423k4((byte[]) keyValuePair.getKey());
                m64636k4(c11839vwM55319k4, iPresentation);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m64632h4(C11724d4 c11724d4, IPresentation iPresentation) {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f46118k4.m2049h4().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                this.f46118k4.m2044c5().throwIfInterruptionRequested();
                C11839vw c11839vwM55319k4 = c11724d4.m55319k4(C14113y2.m67402k4("/{0}", keyValuePair.getValue()), "application/vnd.sun.star.media");
                c11839vwM55319k4.m55423k4(((IAudio) keyValuePair.getKey()).getBinaryData());
                m64636k4(c11839vwM55319k4, iPresentation);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f46118k4.m2064m9().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair2 = (KeyValuePair) it.next();
                this.f46118k4.m2044c5().throwIfInterruptionRequested();
                C11839vw c11839vwM55319k42 = c11724d4.m55319k4(C14113y2.m67402k4("/{0}", keyValuePair2.getValue()), "application/vnd.sun.star.media");
                c11839vwM55319k42.m55423k4(((IVideo) keyValuePair2.getKey()).getBinaryData());
                m64636k4(c11839vwM55319k42, iPresentation);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m64638kk(C11724d4 c11724d4, IPresentation iPresentation) {
        C11839vw c11839vwM55319k4 = c11724d4.m55319k4(C14113y2.m67402k4("/{0}", "styles.xml"), "text/xml");
        hj7 hj7Var = new hj7(c11839vwM55319k4, this.f46118k4);
        C11839vw c11839vwM55319k42 = c11724d4.m55319k4(C14113y2.m67402k4("/{0}", "content.xml"), "text/xml");
        hj7Var.m7214k4((Presentation) iPresentation, new C14354qo(c11839vwM55319k42, this.f46118k4));
        m64636k4(c11839vwM55319k4, iPresentation);
        m64636k4(c11839vwM55319k42, iPresentation);
    }

    /* JADX INFO: renamed from: to */
    private void m64639to(C11724d4 c11724d4, IPresentation iPresentation) {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f46118k4.m2063kk().iterator();
        while (it.hasNext()) {
            try {
                OdpSerializationContext.ImageData next = it.next();
                this.f46118k4.m2044c5().throwIfInterruptionRequested();
                C11839vw c11839vwM55319k4 = c11724d4.m55319k4(C14113y2.m67402k4("/{0}", OdpSerializationContext.m2039k4(next.Index, next.ContentType)), next.ContentType);
                byte[] bArrInvoke = next.BinaryData;
                if (bArrInvoke == null) {
                    bArrInvoke = next.GetBinaryData.invoke();
                }
                c11839vwM55319k4.m55423k4(bArrInvoke);
                m64636k4(c11839vwM55319k4, iPresentation);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = this.f46118k4.m2065to().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                this.f46118k4.m2044c5().throwIfInterruptionRequested();
                IPPImage iPPImage = (IPPImage) keyValuePair.getValue();
                String strM2038k4 = OdpSerializationContext.m2038k4(((Integer) keyValuePair.getKey()).intValue());
                C11839vw c11839vwM55319k42 = c11724d4.m55319k4(C14113y2.m67402k4("/{0}", strM2038k4), iPPImage.getContentType());
                c11839vwM55319k42.m55423k4(iPPImage.getBinaryData());
                com.aspose.slides.internal.p332p7.w6f w6fVar = new com.aspose.slides.internal.p332p7.w6f();
                w6fVar.m43520k4(strM2038k4);
                w6fVar.m43524x1(C14113y2.f47374k4);
                if (iPresentation.getProtectionManager().isEncrypted()) {
                    m64637k4(c11839vwM55319k42, w6fVar);
                }
                this.f46120to.addItem(w6fVar);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m64640x1(C11724d4 c11724d4, IPresentation iPresentation) {
        C11839vw c11839vwM55319k4 = c11724d4.m55319k4(C14113y2.m67402k4("/{0}", "settings.xml"), "text/xml");
        new fzv(c11839vwM55319k4, this.f46118k4).m6400x1((Presentation) iPresentation);
        m64636k4(c11839vwM55319k4, iPresentation);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64641k4(IPresentation iPresentation, AbstractC3150x6 abstractC3150x6, InterruptionToken interruptionToken) {
        if (this.f46121x1) {
            throw new InvalidOperationException("OdpSerializator instance can call WritePresentationToFlatXml() method only once.");
        }
        this.f46121x1 = true;
        C11724d4 c11724d4 = new C11724d4();
        OdpSerializationContext odpSerializationContext = new OdpSerializationContext(iPresentation, interruptionToken);
        this.f46118k4 = odpSerializationContext;
        odpSerializationContext.m2062k4(true);
        this.f46120to = new List();
        m64633k4(c11724d4, iPresentation);
        m64640x1(c11724d4, iPresentation);
        m64638kk(c11724d4, iPresentation);
        c11724d4.m55322k4(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64642k4(IPresentation iPresentation, C12275wy c12275wy, boolean z, InterruptionToken interruptionToken) {
        if (this.f46121x1) {
            throw new InvalidOperationException("OdpSerializator instance can call WritePresentationToZipFile() method only once.");
        }
        this.f46121x1 = true;
        C11724d4 c11724d4 = new C11724d4();
        this.f46118k4 = new OdpSerializationContext(iPresentation, interruptionToken);
        this.f46120to = new List();
        if (iPresentation.getProtectionManager().isEncrypted()) {
            this.f46119kk = new psc(iPresentation.getProtectionManager().getEncryptionPassword());
        }
        m64633k4(c11724d4, iPresentation);
        m64640x1(c11724d4, iPresentation);
        m64638kk(c11724d4, iPresentation);
        m64639to(c11724d4, iPresentation);
        m64631du(c11724d4, iPresentation);
        m64632h4(c11724d4, iPresentation);
        m64635k4(c11724d4, z);
        m64634k4(c11724d4, iPresentation, z);
        c11724d4.m55325k4(c12275wy);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64633k4(C11724d4 c11724d4, IPresentation iPresentation) {
        C11839vw c11839vwM55319k4 = c11724d4.m55319k4(C14113y2.m67402k4("/{0}", "meta.xml"), "text/xml");
        new coj(c11839vwM55319k4, this.f46118k4).m4698x1(iPresentation.getDocumentProperties());
        m64636k4(c11839vwM55319k4, iPresentation);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64634k4(C11724d4 c11724d4, IPresentation iPresentation, boolean z) {
        new bvr(c11724d4.m55319k4("/META-INF/manifest.xml", "text/xml"), this.f46118k4, this.f46120to).m4325k4((Presentation) iPresentation, z);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64635k4(C11724d4 c11724d4, boolean z) {
        String str = z ? "application/vnd.oasis.opendocument.presentation-template" : "application/vnd.oasis.opendocument.presentation";
        c11724d4.m55319k4("/mimetype", str).m55423k4(AbstractC6747ar.m26650yj().mo26677to(str));
    }

    /* JADX INFO: renamed from: k4 */
    private void m64636k4(C11839vw c11839vw, IPresentation iPresentation) {
        com.aspose.slides.internal.p332p7.w6f w6fVar = new com.aspose.slides.internal.p332p7.w6f();
        w6fVar.m43520k4(c11839vw.m55424kk());
        w6fVar.m43524x1(c11839vw.m55429fa());
        if (iPresentation.getProtectionManager().isEncrypted()) {
            m64637k4(c11839vw, w6fVar);
        }
        this.f46120to.addItem(w6fVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64637k4(C11839vw c11839vw, com.aspose.slides.internal.p332p7.w6f w6fVar) {
        w6fVar.m43519k4(((long) c11839vw.m55426to().length) & 4294967295L);
        C3152yj c3152yj = new C3152yj();
        try {
            C12251ck c12251ck = new C12251ck(c3152yj, 0, true);
            try {
                c12251ck.write(c11839vw.m55426to(), 0, c11839vw.m55426to().length);
                c12251ck.dispose();
                c3152yj.seek(0L, 0);
                byte[] bArrM69225k4 = this.f46119kk.m69225k4(c3152yj, "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha256-1k");
                byte[] bArrM69219du = this.f46119kk.m69219du();
                byte[] bArrM69220h4 = this.f46119kk.m69220h4();
                this.f46119kk.m69224k4("http://www.w3.org/2000/09/xmldsig#sha256");
                c11839vw.m55423k4(this.f46119kk.m69226k4(c3152yj, bArrM69219du, bArrM69220h4));
                c3152yj.dispose();
                com.aspose.slides.internal.p332p7.ks6 ks6VarM43518k4 = w6fVar.m43518k4();
                ks6VarM43518k4.m35675k4("urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha256-1k");
                ks6VarM43518k4.m35679x1(C14080ne.m66952k4(bArrM69225k4));
                ks6VarM43518k4.m35677to().m45008k4("http://www.w3.org/2001/04/xmlenc#aes256-cbc");
                ks6VarM43518k4.m35677to().m45010x1(C14080ne.m66952k4(bArrM69220h4));
                ks6VarM43518k4.m35673h4().m29679k4("PBKDF2");
                ks6VarM43518k4.m35673h4().m29683x1(((long) this.f46119kk.m69229x1()) & 4294967295L);
                ks6VarM43518k4.m35673h4().m29678k4(((long) this.f46119kk.m69221k4()) & 4294967295L);
                ks6VarM43518k4.m35673h4().m29684x1(C14080ne.m66952k4(bArrM69219du));
                com.aspose.slides.internal.p332p7.ls9 ls9VarM35674k4 = ks6VarM43518k4.m35674k4();
                ls9VarM35674k4.m36420k4("http://www.w3.org/2000/09/xmldsig#sha256");
                ls9VarM35674k4.m36419k4(((long) this.f46119kk.m69228to()) & 4294967295L);
                c11839vw.m55432x1(true);
            } catch (Throwable th) {
                c12251ck.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }
}
