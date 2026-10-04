package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11805rq;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class OleObjectFrame extends GraphicalObject implements IOleObjectFrame {

    /* JADX INFO: renamed from: ar */
    private boolean f2870ar;

    /* JADX INFO: renamed from: du */
    String f2871du;

    /* JADX INFO: renamed from: h4 */
    boolean f2872h4;

    /* JADX INFO: renamed from: ix */
    private boolean f2873ix;

    /* JADX INFO: renamed from: k4 */
    String f2874k4;

    /* JADX INFO: renamed from: kk */
    PictureFillFormat f2875kk;

    /* JADX INFO: renamed from: ks */
    private String f2876ks;

    /* JADX INFO: renamed from: m9 */
    private String f2877m9;

    /* JADX INFO: renamed from: ne */
    private OleEmbeddedDataInfo f2878ne;

    /* JADX INFO: renamed from: qq */
    private C12015qq f2879qq;

    /* JADX INFO: renamed from: rv */
    private String f2880rv;

    /* JADX INFO: renamed from: to */
    long f2881to;

    /* JADX INFO: renamed from: u4 */
    private boolean f2882u4;

    /* JADX INFO: renamed from: uz */
    private byte[] f2883uz;

    /* JADX INFO: renamed from: wl */
    private String f2884wl;

    /* JADX INFO: renamed from: x1 */
    PictureFillFormat f2885x1;

    /* JADX INFO: renamed from: x6 */
    private String f2886x6;

    /* JADX INFO: renamed from: yj */
    private String f2887yj;

    public OleObjectFrame(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new uur(), new exs());
        this.f2877m9 = "";
        this.f2887yj = "";
        this.f2874k4 = "";
        this.f2876ks = "";
        this.f2872h4 = true;
        this.f2879qq = new C12015qq();
        PictureFillFormat pictureFillFormat = new PictureFillFormat(this);
        this.f2885x1 = pictureFillFormat;
        pictureFillFormat.setPictureFillMode(1);
        this.f2878ne = new OleEmbeddedDataInfo();
        this.f3300c5 = new LineFormat(this);
        m2560k4(new dnd(this));
    }

    /* JADX INFO: renamed from: qw */
    private int m2071qw() {
        if (!m2085to()) {
            return 1252;
        }
        for (int i = 0; i < this.f2871du.length(); i++) {
            char cCharAt = this.f2871du.charAt(i);
            if (cCharAt >= 128 && !C3047dy.m12884um(cCharAt)) {
                byte bM12881to = C3047dy.m12881to((int) cCharAt);
                if (bM12881to != 0) {
                    if (bM12881to == 1) {
                        return C3047dy.m12876lr(cCharAt) ? 949 : 936;
                    }
                    if (bM12881to != 2) {
                        return 1252;
                    }
                    if (C3047dy.m12856jd(cCharAt) == 4) {
                        return 1256;
                    }
                    if (C3047dy.m12895yd(cCharAt)) {
                        return 1255;
                    }
                } else {
                    if (C3047dy.m12847bv(cCharAt)) {
                        return 1251;
                    }
                    if (C3047dy.m12887v4(cCharAt)) {
                        return 1254;
                    }
                }
            }
        }
        return 1252;
    }

    /* JADX INFO: renamed from: vh */
    private void m2072vh() {
        String strM67361du = C14113y2.m67361du(this.f2878ne.getEmbeddedFileExtension());
        String strM67408k4 = C14113y2.m67359c5(strM67361du, ".") ? strM67361du : C14113y2.m67408k4(".", strM67361du);
        if (!gbd.m6466k4().containsKey(strM67361du)) {
            String str = C14113y2.f47374k4;
            IGenericEnumerator<String> it = gbd.m6466k4().getKeys().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (C14113y2.m67363du(gbd.m6466k4().get_Item(next).m69541k4(), strM67408k4)) {
                        str = next;
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C14113y2.m67411k4(str)) {
                gbd.m6466k4().addItem(strM67361du, new qdi(strM67408k4, new C11805rq(), "0", "package"));
                strM67361du = strM67408k4;
            } else {
                strM67361du = str;
            }
        }
        m2080k4(gbd.m6477k4(strM67361du, this.f2878ne, ((Presentation) getPresentation()).m2388qq()));
    }

    /* JADX INFO: renamed from: ar */
    public final String m2073ar() {
        return this.f2884wl;
    }

    @Override // com.aspose.slides.GraphicalObject
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public final uur mo272to() {
        return (uur) super.mo272to();
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final IOleEmbeddedDataInfo getEmbeddedData() {
        return this.f2878ne;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final String getEmbeddedFileLabel() {
        return this.f2886x6;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final String getEmbeddedFileName() {
        return this.f2880rv;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final String getLinkFileName() {
        return isObjectLink() ? this.f2876ks : "";
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final String getLinkPathLong() {
        return !isObjectLink() ? "" : !C14113y2.m67411k4(this.f2874k4) ? this.f2874k4 : !C14113y2.m67411k4(m2073ar()) ? m2073ar() : "";
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final String getLinkPathRelative() {
        return !m2087wl() ? "" : mo1638uz().m5766m9();
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final String getObjectName() {
        return this.f2877m9;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final String getObjectProgId() {
        return this.f2887yj;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final IPictureFillFormat getSubstitutePictureFormat() {
        return this.f2885x1;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final String getSubstitutePictureTitle() {
        return this.f2871du;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final boolean getUpdateAutomatic() {
        return this.f2872h4;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final boolean isObjectIcon() {
        return this.f2873ix;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final boolean isObjectLink() {
        return m2087wl();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m2075k4() {
        return this.f2879qq.Clone();
    }

    /* JADX INFO: renamed from: kk */
    public final void m2081kk(String str) {
        this.f2884wl = str;
    }

    /* JADX INFO: renamed from: qq */
    public final PictureFillFormat m2083qq() {
        if (this.f2875kk == null) {
            PictureFillFormat pictureFillFormat = new PictureFillFormat(this);
            this.f2875kk = pictureFillFormat;
            pictureFillFormat.m2252k4(this.f2885x1);
        }
        if (m2082kk() || m2085to()) {
            this.f2875kk.getPicture().setImage(new PPImage(this.f2875kk.getPresentation(), C3099wl.m13191k4(((PPImage) this.f2885x1.getPicture().getImage()).getBinaryData(), getSubstitutePictureTitle(), m2082kk(), C5133k4.m21997k4("OleIconTemplate.wmf"), m2071qw())));
            this.f2881to = ((PPImage) this.f2885x1.getPicture().getImage()).m2128h4();
            m2079k4(false);
        }
        return this.f2875kk;
    }

    /* JADX INFO: renamed from: rv */
    public final OleEmbeddedDataInfo m2084rv() {
        return this.f2878ne;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final void setEmbeddedData(IOleEmbeddedDataInfo iOleEmbeddedDataInfo) {
        if (iOleEmbeddedDataInfo == null) {
            throw new ArgumentNullException("embeddedData");
        }
        this.f2878ne = (OleEmbeddedDataInfo) iOleEmbeddedDataInfo;
        m2089x1(false);
        m2088x1("");
        if (iOleEmbeddedDataInfo.getEmbeddedFileData() != null) {
            m2072vh();
        }
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final void setLinkPathLong(String str) {
        if (C14113y2.m67411k4(str)) {
            this.f2876ks = "";
            this.f2874k4 = "";
            this.f2878ne.m2069k4("");
        } else {
            m2089x1(true);
            this.f2874k4 = str;
            this.f2872h4 = true;
            try {
                this.f2876ks = C3141rv.m13403k4(str);
                this.f2878ne.m2069k4(C14113y2.m67422kk(C3141rv.m13397du(this.f2874k4), 1));
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
                this.f2876ks = null;
            }
        }
        this.f2884wl = "";
        mo1638uz().m5765kk("");
        mo1638uz().m5770x1("");
        mo1638uz().m5760k4(C14047bz.f47172k4.Clone());
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final void setObjectIcon(boolean z) {
        this.f2873ix = z;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final void setObjectName(String str) {
        this.f2877m9 = str;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final void setObjectProgId(String str) {
        this.f2887yj = str;
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final void setSubstitutePictureTitle(String str) {
        this.f2871du = str;
        m2079k4(true);
    }

    @Override // com.aspose.slides.IOleObjectFrame
    public final void setUpdateAutomatic(boolean z) {
        this.f2872h4 = z;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m2085to() {
        return this.f2870ar;
    }

    @Override // com.aspose.slides.GraphicalObject, com.aspose.slides.Shape
    /* JADX INFO: renamed from: up, reason: merged with bridge method [inline-methods] */
    public final exs mo1638uz() {
        return (exs) super.mo1638uz();
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m2087wl() {
        return this.f2882u4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2088x1(String str) {
        this.f2880rv = str;
    }

    /* JADX INFO: renamed from: yj */
    public final byte[] m2090yj() {
        return this.f2883uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2076k4(IOleEmbeddedDataInfo iOleEmbeddedDataInfo) {
        this.f2878ne = (OleEmbeddedDataInfo) iOleEmbeddedDataInfo;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m2082kk() {
        return (this.f2881to & 4294967295L) != (4294967295L & ((PPImage) this.f2885x1.getPicture().getImage()).m2128h4());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2089x1(boolean z) {
        this.f2882u4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2077k4(C12015qq c12015qq) {
        this.f2879qq = c12015qq.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2078k4(String str) {
        this.f2886x6 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2079k4(boolean z) {
        this.f2870ar = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2080k4(byte[] bArr) {
        this.f2883uz = null;
        if (bArr != null) {
            m2089x1(false);
            this.f2883uz = new byte[bArr.length];
            AbstractC14092to.m67208k4((Object) bArr).copyTo(AbstractC14092to.m67208k4((Object) this.f2883uz), 0);
        }
    }
}
