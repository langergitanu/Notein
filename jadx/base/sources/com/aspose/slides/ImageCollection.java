package com.aspose.slides;

import android.graphics.Bitmap;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p081de.C3154kk;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p456v5.C11610to;
import com.aspose.slides.internal.p468vz.C11878k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p482wr.C12271up;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageCollection extends DomObject<Presentation> implements IImageCollection {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f2482m9 = new C7017h4("image/bmp", "image/x-emf", "image/jpeg", "image/png", "image/x-wmf", "image/pict", "image/gif", "image/tiff", "image/webp");

    /* JADX INFO: renamed from: du */
    private final List<PPImage> f2483du;

    /* JADX INFO: renamed from: k4 */
    private final List<IPPImage> f2484k4;

    /* JADX INFO: renamed from: kk */
    private PPImage f2485kk;

    /* JADX INFO: renamed from: to */
    private PPImage f2486to;

    /* JADX INFO: renamed from: x1 */
    private PPImage f2487x1;

    public ImageCollection(Presentation presentation) {
        super(presentation);
        this.f2483du = new List<>();
        this.f2484k4 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public static String m1707du(String str) {
        int length = str.length();
        while (true) {
            int i = length - 1;
            if (i < 0) {
                return str;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\' || cCharAt == '/' || cCharAt == ':') {
                break;
            }
            length = i;
        }
        return C14113y2.m67422kk(str, length);
    }

    @Override // com.aspose.slides.IImageCollection
    @Deprecated
    public final IPPImage addImage(Bitmap bitmap) {
        return m1724k4(C12009k4.m56586k4(bitmap));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2484k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IImageCollection
    public final IPPImage get_Item(int i) {
        return this.f2484k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IPPImage> iterator() {
        return this.f2484k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IPPImage> iteratorJava() {
        return this.f2484k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final IPPImage m1717k4() {
        if (this.f2487x1 == null) {
            this.f2487x1 = m1710kk(C5133k4.m21997k4("NoImage.emf"));
        }
        return this.f2487x1;
    }

    /* JADX INFO: renamed from: kk */
    public final PPImage m1735kk() {
        if (this.f2486to == null) {
            this.f2486to = (PPImage) m1721k4(C5133k4.m21997k4("EmbeddedOLE_template.png"));
        }
        return this.f2486to;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2484k4.size();
    }

    /* JADX INFO: renamed from: to */
    public final List<PPImage> m1737to() {
        return this.f2483du;
    }

    /* JADX INFO: renamed from: x1 */
    public final IPPImage m1738x1(ISvgImage iSvgImage) {
        return m1740x1(C13447k4.m62559k4(m1731k4(iSvgImage, Float.NaN, Float.NaN, 1.0f, new boolean[]{false})));
    }

    /* JADX INFO: renamed from: kk */
    private PPImage m1710kk(AbstractC3150x6 abstractC3150x6) {
        return m1709k4(C13447k4.m62559k4(m1715x1(m1714x1(abstractC3150x6))), null, false);
    }

    /* JADX INFO: renamed from: to */
    public static String m1712to(String str) {
        switch (f2482m9.m27428k4(str)) {
            case 0:
                return "bmp";
            case 1:
                return "emf";
            case 2:
                return "jpeg";
            case 3:
                return "png";
            case 4:
                return "wmf";
            case 5:
                return "pict";
            case 6:
                return "gif";
            case 7:
                return "tiff";
            case 8:
                return "webp";
            default:
                return "image";
        }
    }

    /* JADX INFO: renamed from: x1 */
    private IPPImage m1713x1(String str, Dictionary<String, IPPImage> dictionary) {
        try {
            byte[] bArrM13362m9 = C3131h4.m13362m9(str);
            int iM58515x1 = C12549du.m58515x1(bArrM13362m9);
            if (iM58515x1 == 0 || iM58515x1 == 3) {
                m1736kk(str);
                return null;
            }
            try {
                PPImage pPImageM1709k4 = m1709k4(bArrM13362m9, null, false);
                if (dictionary == null) {
                    return pPImageM1709k4;
                }
                dictionary.addItem(str, pPImageM1709k4);
                return pPImageM1709k4;
            } catch (Exception e) {
                C3085sv.m13082k4(e);
                m1741x1(str);
                return null;
            }
        } catch (RuntimeException e2) {
            m1734k4(C14113y2.m67402k4("Error occured loading image: {0}", e2.getMessage()), 1);
            return null;
        }
    }

    @Override // com.aspose.slides.IImageCollection
    public final IPPImage addImage(IImage iImage) {
        return m1724k4(((yyn) iImage).m74148k4());
    }

    /* JADX INFO: renamed from: du */
    public void m1716du() {
        this.f2484k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final IPPImage m1718k4(ISvgImage iSvgImage) {
        PPImage pPImage = new PPImage((IPresentation) this.f2127h4, (InterfaceC13443dy) null, C12014ne.f40546k4.Clone(), 0L);
        pPImage.setSvgImage(iSvgImage);
        return pPImage;
    }

    @Override // com.aspose.slides.IImageCollection
    public final IPPImage addImage(IPPImage iPPImage) {
        PPImage pPImage = (PPImage) iPPImage;
        return this.f2484k4.containsItem(pPImage) ? pPImage : m1727k4(pPImage.m2134m9());
    }

    /* JADX INFO: renamed from: k4 */
    public final IPPImage m1719k4(ISvgImage iSvgImage, float f) {
        return m1720k4(iSvgImage, Float.NaN, Float.NaN, f);
    }

    /* JADX INFO: renamed from: kk */
    public final void m1736kk(String str) {
        m1734k4(C14113y2.m67402k4("Image format is not supported: {0}", str), 1);
    }

    /* JADX INFO: renamed from: x1 */
    public final PPImage m1739x1() {
        if (this.f2485kk == null) {
            this.f2485kk = m1710kk(C5133k4.m21997k4("AudioFrame.png"));
        }
        return this.f2485kk;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m1711kk(C3152yj c3152yj) {
        if (c3152yj.getLength() >= 2) {
            int i = c3152yj.readByte();
            int i2 = c3152yj.readByte();
            c3152yj.seek(-2L, 1);
            if (i == 31 && i2 == 139) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.IImageCollection
    public final IPPImage addImage(ISvgImage iSvgImage) {
        IPPImage iPPImageM1723k4 = m1723k4(m1731k4(iSvgImage, Float.NaN, Float.NaN, 1.0f, new boolean[]{false}));
        iPPImageM1723k4.setSvgImage(iSvgImage);
        return iPPImageM1723k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final IPPImage m1720k4(ISvgImage iSvgImage, float f, float f2, float f3) {
        C12009k4 c12009k4M13178k4;
        boolean[] zArr = {false};
        C3152yj c3152yjM1731k4 = m1731k4(iSvgImage, f, f2, f3, zArr);
        if (zArr[0]) {
            c12009k4M13178k4 = C3099wl.m13178k4(c3152yjM1731k4.toArray(), C14064he.m66715kk(f) ? Integer.MIN_VALUE : C7019kk.m27462to(Double.valueOf(C12566m9.m58644k4(f)), 14), C14064he.m66715kk(f2) ? Integer.MIN_VALUE : C7019kk.m27462to(Double.valueOf(C12566m9.m58644k4(f2)), 14));
            c3152yjM1731k4.close();
        } else {
            c12009k4M13178k4 = (C12009k4) AbstractC12002ck.m56312k4(c3152yjM1731k4);
        }
        IPPImage iPPImageM1724k4 = m1724k4(c12009k4M13178k4);
        iPPImageM1724k4.setSvgImage(iSvgImage);
        return iPPImageM1724k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final PPImage m1740x1(byte[] bArr) {
        return m1709k4(bArr, null, false);
    }

    /* JADX INFO: renamed from: x1 */
    public static C3152yj m1714x1(AbstractC3150x6 abstractC3150x6) {
        C3152yj c3152yj = new C3152yj();
        C13447k4.m62557k4(abstractC3150x6, c3152yj, C13447k4.f45030k4);
        c3152yj.setPosition(0L);
        return c3152yj;
    }

    @Override // com.aspose.slides.IImageCollection
    public final IPPImage addImage(InputStream inputStream) {
        return m1721k4(AbstractC3150x6.fromJava(inputStream));
    }

    /* JADX INFO: renamed from: k4 */
    public IPPImage m1721k4(AbstractC3150x6 abstractC3150x6) {
        return m1723k4(m1714x1(abstractC3150x6));
    }

    /* JADX INFO: renamed from: x1 */
    private static C3152yj m1715x1(C3152yj c3152yj) {
        if (!m1711kk(c3152yj)) {
            return c3152yj;
        }
        C12271up c12271up = new C12271up(c3152yj, 1);
        try {
            return m1714x1(c12271up);
        } finally {
            c12271up.dispose();
        }
    }

    @Override // com.aspose.slides.IImageCollection
    public final IPPImage addImage(InputStream inputStream, int i) {
        return m1722k4(AbstractC3150x6.fromJava(inputStream), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public IPPImage m1722k4(AbstractC3150x6 abstractC3150x6, int i) {
        InterfaceC13443dy interfaceC13443dyM62578k4;
        if (i != 0) {
            if (i != 1) {
                throw new ArgumentOutOfRangeException("loadingStreamBehavior", C14042ak.m66410k4(LoadingStreamBehavior.class, i), null);
            }
            interfaceC13443dyM62578k4 = ((Presentation) this.f2127h4).m2388qq().m62576k4(abstractC3150x6);
        } else {
            interfaceC13443dyM62578k4 = ((Presentation) this.f2127h4).m2388qq().m62578k4((AbstractC3150x6) C13447k4.m62561x1(abstractC3150x6), false, true);
        }
        return new PPImage((IPresentation) this.f2127h4, interfaceC13443dyM62578k4);
    }

    @Override // com.aspose.slides.IImageCollection
    public final IPPImage addImage(byte[] bArr) {
        return m1727k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public IPPImage m1723k4(C3152yj c3152yj) {
        return m1727k4(C13447k4.m62559k4(m1715x1(c3152yj)));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1741x1(String str) {
        m1734k4(C14113y2.m67402k4("GDI+ error occured loading image: {0}", str), 1);
    }

    /* JADX INFO: renamed from: k4 */
    public IPPImage m1724k4(AbstractC12002ck abstractC12002ck) {
        return m1708k4((byte[]) null, abstractC12002ck);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final IPPImage m1725k4(C12262lr c12262lr) {
        return new PPImage((IPresentation) this.f2127h4, ((Presentation) this.f2127h4).m2388qq().m62580k4(c12262lr, ((Presentation) this.f2127h4).m2349du().getBlobManagementOptions().getPresentationLockingBehavior() == 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final IPPImage m1726k4(String str, Dictionary<String, IPPImage> dictionary) {
        String strM13403k4;
        if (C14113y2.m67411k4(str)) {
            return null;
        }
        ny0 ny0Var = new ny0(str);
        int iResourceLoading = (((Presentation) this.f2127h4).m2349du() == null || ((Presentation) this.f2127h4).m2349du().getResourceLoadingCallback() == null) ? 0 : ((Presentation) this.f2127h4).m2349du().getResourceLoadingCallback().resourceLoading(ny0Var);
        if (iResourceLoading == 0) {
            str = ny0Var.getUri();
            try {
                strM13403k4 = C3141rv.m13403k4(str);
            } catch (RuntimeException unused) {
                strM13403k4 = "";
            }
            if (!C14113y2.m67411k4(((Presentation) this.f2127h4).f3114x1) && C14113y2.m67363du(str, strM13403k4)) {
                str = C3141rv.m13412x1(C3141rv.m13400h4(((Presentation) this.f2127h4).f3114x1), str);
            }
            if (C14113y2.m67411k4(strM13403k4) || !C3131h4.m13361kk(str)) {
                if (C14113y2.m67429to(str, ':') <= 1) {
                    m1734k4(C14113y2.m67402k4("Error occured loading image file: {0}", str), 1);
                    return null;
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(60000);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200 && (responseCode == 302 || responseCode == 301 || responseCode == 303)) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        String headerField2 = httpURLConnection.getHeaderField(HttpHeaders.SET_COOKIE);
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                        httpURLConnection2.setRequestProperty(HttpHeaders.COOKIE, headerField2);
                        httpURLConnection = httpURLConnection2;
                    }
                    try {
                        AbstractC3150x6 abstractC3150x6FromJava = AbstractC3150x6.fromJava(httpURLConnection.getInputStream());
                        try {
                            byte[] array = (abstractC3150x6FromJava instanceof C11878k4 ? (C11878k4) abstractC3150x6FromJava : m1714x1(abstractC3150x6FromJava)).toArray();
                            int iM58515x1 = C12549du.m58515x1(array);
                            if (iM58515x1 != 0 && iM58515x1 != 3) {
                                PPImage pPImageM1709k4 = m1709k4(array, null, false);
                                if (abstractC3150x6FromJava != null) {
                                    abstractC3150x6FromJava.dispose();
                                }
                                return pPImageM1709k4;
                            }
                            m1736kk(str);
                            if (abstractC3150x6FromJava != null) {
                                abstractC3150x6FromJava.dispose();
                            }
                            if (httpURLConnection.getInputStream() != null) {
                                httpURLConnection.getInputStream().close();
                            }
                            httpURLConnection.disconnect();
                            return null;
                        } catch (Throwable th) {
                            if (abstractC3150x6FromJava != null) {
                                abstractC3150x6FromJava.dispose();
                            }
                            throw th;
                        }
                    } finally {
                        if (httpURLConnection.getInputStream() != null) {
                            httpURLConnection.getInputStream().close();
                        }
                        httpURLConnection.disconnect();
                    }
                } catch (IOException e) {
                    m1734k4(C14113y2.m67402k4("Error occured loading online image: {0}", str), 1);
                    C3085sv.m13082k4(e);
                    return null;
                } catch (RuntimeException e2) {
                    m1734k4(C14113y2.m67402k4("Error occured loading online image: {0}", str), 1);
                    C3085sv.m13082k4(e2);
                    return null;
                } catch (MalformedURLException e3) {
                    m1734k4(C14113y2.m67402k4("Error occured loading online image: {0}", str), 1);
                    C3085sv.m13082k4(e3);
                    return null;
                }
            }
            if (C14113y2.m67424kk(C14113y2.m67368h4(str), ".pdf") || C14113y2.m67424kk(C14113y2.m67368h4(str), ".pict")) {
                m1736kk(str);
                return null;
            }
            if (dictionary == null || !dictionary.containsKey(str)) {
                return m1713x1(str, dictionary);
            }
        } else {
            if (iResourceLoading == 1) {
                return m1717k4();
            }
            if (iResourceLoading == 2) {
                try {
                    if (ny0Var.m68286k4() == null || ny0Var.m68286k4().length <= 0) {
                        return null;
                    }
                    return addImage(ny0Var.m68286k4());
                } catch (RuntimeException e4) {
                    m1734k4(C14113y2.m67402k4("Error occured loading user provided image data. The path of replaced image: {0}", str), 1);
                    C3085sv.m13082k4(e4);
                    return null;
                }
            }
        }
        if (dictionary != null) {
            return dictionary.get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final IPPImage m1727k4(byte[] bArr) {
        return m1708k4(bArr, (AbstractC12002ck) null);
    }

    /* JADX INFO: renamed from: k4 */
    private IPPImage m1708k4(byte[] bArr, AbstractC12002ck abstractC12002ck) {
        return m1709k4(bArr, abstractC12002ck, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final PPImage m1728k4(C14047bz c14047bz) {
        List.Enumerator<IPPImage> it = this.f2484k4.iterator();
        while (it.hasNext()) {
            try {
                PPImage pPImage = (PPImage) it.next();
                if (pPImage.m2127fa().equals(c14047bz.Clone())) {
                    return pPImage;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final PPImage m1729k4(byte[] bArr, long j) {
        List.Enumerator<IPPImage> it = this.f2484k4.iterator();
        while (it.hasNext()) {
            try {
                PPImage pPImage = (PPImage) it.next();
                if (pPImage.m2128h4() == j) {
                    byte[] bArrM2134m9 = pPImage.m2134m9();
                    if (bArrM2134m9.length == bArr.length) {
                        for (int i = 0; i < bArr.length; i++) {
                            byte b = bArr[i];
                            byte b2 = bArrM2134m9[i];
                        }
                        return pPImage;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private PPImage m1709k4(byte[] bArr, AbstractC12002ck abstractC12002ck, boolean z) {
        if (bArr == null && abstractC12002ck == null) {
            throw new PptxEditException("Null image adding");
        }
        if (bArr != null) {
            int[] iArr = {0};
            boolean zM58502k4 = C12549du.m58502k4(bArr, iArr);
            int i = iArr[0];
            if (zM58502k4) {
                int length = bArr.length - i;
                byte[] bArr2 = new byte[length];
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), i, AbstractC14092to.m67208k4((Object) bArr2), 0, length);
                bArr = bArr2;
            }
        }
        if (bArr == null) {
            C3977ck c3977ckMo15750ck = abstractC12002ck.mo15750ck();
            if (C7019kk.m27469x1(abstractC12002ck, C12009k4.class) && C14047bz.m66537x1(c3977ckMo15750ck.m15685k4(), C3977ck.m15680h4().m15685k4()) && (C14047bz.m66535k4(c3977ckMo15750ck.m15685k4(), C3977ck.m15675c5().m15685k4()) || C14047bz.m66535k4(c3977ckMo15750ck.m15685k4(), C3977ck.m15681jd().m15685k4()) || (abstractC12002ck.mo15753jd() & 262144) == 262144 || (abstractC12002ck.mo15753jd() & 65536) == 65536 || abstractC12002ck.mo15760yj() < 16 || abstractC12002ck.mo15757m9() < 16)) {
                c3977ckMo15750ck = C3977ck.m15681jd();
            }
            C3152yj c3152yj = new C3152yj();
            try {
                abstractC12002ck.m56333k4(c3152yj, c3977ckMo15750ck);
                bArr = c3152yj.toArray();
            } finally {
                c3152yj.dispose();
            }
        }
        long jM54691k4 = C11610to.m54691k4(bArr);
        PPImage pPImageM1729k4 = m1729k4(bArr, jM54691k4);
        if (pPImageM1729k4 != null && pPImageM1729k4.getSvgImage() == null) {
            return pPImageM1729k4;
        }
        C12014ne c12014ne = new C12014ne(0, 0, 0, 0);
        if (abstractC12002ck != null) {
            c12014ne = new C12014ne(0, 0, abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9());
        }
        PPImage pPImage = new PPImage((IPresentation) this.f2127h4, ((Presentation) this.f2127h4).m2388qq().m62581k4(bArr), jM54691k4, c12014ne.Clone());
        if (z) {
            m1733k4(pPImage);
        }
        return pPImage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final SvgImage m1730k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return null;
        }
        if (((((Presentation) this.f2127h4).m2349du() == null || ((Presentation) this.f2127h4).m2349du().getResourceLoadingCallback() == null) ? 0 : ((Presentation) this.f2127h4).m2349du().getResourceLoadingCallback().resourceLoading(new ny0(str))) != 0) {
            return null;
        }
        try {
            String strM1707du = m1707du(str);
            byte[] bArrM13362m9 = (C3131h4.m13361kk(str) && C14113y2.m67424kk(C14113y2.m67368h4(str), ".svg")) ? C3131h4.m13362m9(strM1707du) : (C14113y2.m67411k4(strM1707du) || !C14113y2.m67424kk(C14113y2.m67368h4(strM1707du), ".svg") || C14113y2.m67411k4(((Presentation) this.f2127h4).f3114x1)) ? null : C3131h4.m13362m9(C3141rv.m13412x1(C3141rv.m13400h4(((Presentation) this.f2127h4).f3114x1), strM1707du));
            if (bArrM13362m9 != null && bArrM13362m9.length > 0) {
                return new SvgImage(bArrM13362m9);
            }
        } catch (RuntimeException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3152yj m1731k4(ISvgImage iSvgImage, float f, float f2, float f3, boolean[] zArr) {
        if (iSvgImage == null) {
            throw new ArgumentNullException("svgImage");
        }
        zArr[0] = true;
        int i = C12566m9.f42082x1;
        String strM2853k4 = SvgImage.m2853k4(iSvgImage.getSvgContent());
        C3154kk c3154kk = new C3154kk(((SvgImage) iSvgImage).m2856x1());
        if (f3 > 1.0f) {
            f3 *= 1.3333334f;
        }
        return c3154kk.m13475k4(strM2853k4, f3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1732k4(IPPImage iPPImage) {
        this.f2484k4.removeItem(iPPImage);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1733k4(PPImage pPImage) {
        this.f2484k4.addItem(pPImage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m1734k4(String str, int i) {
        if (((Presentation) this.f2127h4).m2349du() == null || ((Presentation) this.f2127h4).m2349du().getWarningCallback() == null) {
            return;
        }
        new C3100wp(str, i).sendWarning(((Presentation) this.f2127h4).m2349du().getWarningCallback());
    }
}
