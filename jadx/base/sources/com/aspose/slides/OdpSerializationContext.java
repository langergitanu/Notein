package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11742fa;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class OdpSerializationContext extends AbstractC11742fa {

    /* JADX INFO: renamed from: ck */
    private BaseSlide f2856ck;

    /* JADX INFO: renamed from: du */
    private final Presentation f2857du;

    /* JADX INFO: renamed from: h4 */
    private int f2859h4;

    /* JADX INFO: renamed from: jd */
    private final InterruptionToken f2860jd;

    /* JADX INFO: renamed from: k4 */
    private IGenericDictionary<IAudio, String> f2861k4;

    /* JADX INFO: renamed from: kk */
    private boolean f2862kk;

    /* JADX INFO: renamed from: to */
    private com.aspose.slides.internal.p332p7.xgo f2864to;

    /* JADX INFO: renamed from: x1 */
    private IGenericDictionary<IVideo, String> f2865x1;

    /* JADX INFO: renamed from: m9 */
    private final IGenericDictionary<Long, ImageData> f2863m9 = new Dictionary();

    /* JADX INFO: renamed from: dy */
    private final IGenericDictionary<Integer, IPPImage> f2858dy = new SortedDictionary();

    /* JADX INFO: renamed from: c5 */
    private final IGenericDictionary<byte[], Integer> f2855c5 = new Dictionary();

    public static class ImageData extends AbstractC7020m9<ImageData> {
        public byte[] BinaryData;
        public String ContentType;
        public AbstractC4685kk<byte[]> GetBinaryData;
        public int Index;

        public static boolean equals(ImageData imageData, ImageData imageData2) {
            return imageData.equals(imageData2);
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m2068k4(ImageData imageData) {
            return imageData.Index == this.Index && C14067j2.m66728k4(imageData.ContentType, this.ContentType) && C14067j2.m66728k4(imageData.BinaryData, this.BinaryData) && C14067j2.m66728k4(imageData.GetBinaryData, this.GetBinaryData);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public ImageData Clone() {
            ImageData imageData = new ImageData();
            CloneTo(imageData);
            return imageData;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(ImageData imageData) {
            imageData.Index = this.Index;
            imageData.ContentType = this.ContentType;
            imageData.BinaryData = this.BinaryData;
            imageData.GetBinaryData = this.GetBinaryData;
        }

        public Object clone() {
            return Clone();
        }

        public int hashCode() {
            return Arrays.hashCode(this.BinaryData) + (C12569rv.m58664k4(Integer.valueOf(this.Index), this.ContentType) * 31);
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof ImageData) {
                return m2068k4((ImageData) obj);
            }
            return false;
        }
    }

    public OdpSerializationContext(IPresentation iPresentation, InterruptionToken interruptionToken) {
        this.f2857du = (Presentation) iPresentation;
        this.f2860jd = interruptionToken;
        m2040k4(new Dictionary());
        m2043x1(new Dictionary());
    }

    /* JADX INFO: renamed from: x1 */
    private int m2041x1(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("oleObjectData");
        }
        if (this.f2855c5.containsKey(bArr)) {
            return this.f2855c5.get_Item(bArr).intValue();
        }
        int iM2050jd = m2050jd();
        this.f2855c5.addItem(bArr, Integer.valueOf(iM2050jd));
        return iM2050jd;
    }

    /* JADX INFO: renamed from: c5 */
    public final InterruptionToken m2044c5() {
        return this.f2860jd;
    }

    /* JADX INFO: renamed from: ck */
    public final int m2045ck() {
        return this.f2859h4;
    }

    /* JADX INFO: renamed from: du */
    public final IGenericDictionary<byte[], Integer> m2046du() {
        return this.f2855c5;
    }

    /* JADX INFO: renamed from: dy */
    public final BaseSlide m2047dy() {
        return this.f2856ck;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m2048fa() {
        return this.f2862kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final IGenericDictionary<IAudio, String> m2049h4() {
        return this.f2861k4;
    }

    /* JADX INFO: renamed from: jd */
    public final int m2050jd() {
        int i = this.f2859h4 + 1;
        this.f2859h4 = i;
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final Presentation m2051k4() {
        return this.f2857du;
    }

    /* JADX INFO: renamed from: kk */
    public final IGenericEnumerable<ImageData> m2063kk() {
        return this.f2863m9.getValues();
    }

    /* JADX INFO: renamed from: m9 */
    public final IGenericDictionary<IVideo, String> m2064m9() {
        return this.f2865x1;
    }

    /* JADX INFO: renamed from: to */
    public final IGenericDictionary<Integer, IPPImage> m2065to() {
        return this.f2858dy;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m2038k4(int i) {
        return C14113y2.m67402k4("ObjectReplacements/Object {0}", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    public final com.aspose.slides.internal.p332p7.xgo m2066x1() {
        return this.f2864to;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m2039k4(int i, String str) {
        return C14113y2.m67402k4("Pictures/image{0}.{1}", Integer.valueOf(i), ImageCollection.m1712to(str));
    }

    /* JADX INFO: renamed from: x1 */
    public static String m2042x1(int i) {
        return C14113y2.m67402k4("Object {0}", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x1 */
    private void m2043x1(IGenericDictionary<IVideo, String> iGenericDictionary) {
        this.f2865x1 = iGenericDictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m2052k4(long j, String str, byte[] bArr, AbstractC4685kk<byte[]> abstractC4685kk) {
        if (bArr == null && abstractC4685kk == null) {
            throw new ArgumentNullException("bytes");
        }
        ImageData imageData = new ImageData();
        ImageData[] imageDataArr = {imageData};
        boolean zTryGetValue = this.f2863m9.tryGetValue(Long.valueOf(j), imageDataArr);
        imageDataArr[0].CloneTo(imageData);
        if (!zTryGetValue) {
            imageData = new ImageData();
            imageData.Index = this.f2863m9.size() + 1;
            imageData.ContentType = str;
            imageData.BinaryData = bArr;
            imageData.GetBinaryData = abstractC4685kk;
            this.f2863m9.addItem(Long.valueOf(j), imageData.Clone());
        }
        return m2039k4(imageData.Index, imageData.ContentType);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m2053k4(IAudio iAudio) {
        if (iAudio == null) {
            throw new ArgumentNullException("audio");
        }
        String[] strArr = {null};
        boolean zTryGetValue = m2049h4().tryGetValue(iAudio, strArr);
        String str = strArr[0];
        if (zTryGetValue) {
            return str;
        }
        Audio audio = (Audio) iAudio;
        String strM72978k4 = audio.m255k4().m72978k4();
        if (C14113y2.m67411k4(strM72978k4) || C14113y2.m67448x1(strM72978k4, "media")) {
            strM72978k4 = C14113y2.m67408k4("media", C14057f9.m66591x1(m2049h4().size() + 1));
        } else {
            int iM67418kk = C14113y2.m67418kk(strM72978k4, FilenameUtils.EXTENSION_SEPARATOR);
            if (iM67418kk > 0) {
                strM72978k4 = C14113y2.m67408k4(C14113y2.m67443x1(strM72978k4, 0, iM67418kk), C14057f9.m66591x1(m2049h4().size() + 1));
            }
        }
        String strM67402k4 = C14113y2.m67402k4("Media/{0}.{1}", strM72978k4, audio.m254h4());
        m2049h4().addItem(iAudio, strM67402k4);
        return strM67402k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m2054k4(IPPImage iPPImage) {
        if (iPPImage == null) {
            throw new ArgumentNullException("image");
        }
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f2858dy.iterator();
        int iM2045ck = 0;
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                if (((IPPImage) keyValuePair.getValue()).equals(iPPImage)) {
                    iM2045ck = ((Integer) keyValuePair.getKey()).intValue();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (iM2045ck < m2045ck() && !this.f2858dy.containsKey(Integer.valueOf(m2045ck()))) {
            iM2045ck = m2045ck();
            this.f2858dy.addItem(Integer.valueOf(iM2045ck), iPPImage);
        }
        return m2038k4(iM2045ck);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m2055k4(IVideo iVideo) {
        if (iVideo == null) {
            throw new ArgumentNullException("video");
        }
        String[] strArr = {null};
        boolean zTryGetValue = m2064m9().tryGetValue(iVideo, strArr);
        String str = strArr[0];
        if (zTryGetValue) {
            return str;
        }
        String strM67402k4 = C14113y2.m67402k4("Media/{0}{1}.{2}", "media", Integer.valueOf(m2064m9().size() + 1), ((Video) iVideo).m3064to());
        m2064m9().addItem(iVideo, strM67402k4);
        return strM67402k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m2056k4(final PPImage pPImage) {
        if (pPImage != null) {
            return m2052k4(pPImage.m2128h4(), pPImage.getContentType(), null, new AbstractC4685kk<byte[]>() { // from class: com.aspose.slides.OdpSerializationContext.1
                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public byte[] invoke() {
                    return pPImage.getBinaryData();
                }
            });
        }
        throw new ArgumentNullException("image");
    }

    /* JADX INFO: renamed from: k4 */
    public final String m2057k4(byte[] bArr) {
        if (bArr != null) {
            return C14113y2.m67408k4("./", m2042x1(m2041x1(bArr)));
        }
        throw new ArgumentNullException("oleObjectData");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2058k4(BaseSlide baseSlide) {
        this.f2856ck = baseSlide;
    }

    /* JADX INFO: renamed from: k4 */
    private void m2040k4(IGenericDictionary<IAudio, String> iGenericDictionary) {
        this.f2861k4 = iGenericDictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2059k4(com.aspose.slides.internal.p332p7.xgo xgoVar) {
        this.f2864to = xgoVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2060k4(jlf jlfVar, PPImage pPImage) {
        m2061k4(jlfVar, m2056k4(pPImage));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2061k4(jlf jlfVar, String str) {
        String strM67402k4 = C14113y2.m67402k4("Img{0}", Integer.valueOf(m2066x1().m44347to().m36786k4().size()));
        jlfVar.m63423k4(strM67402k4);
        com.aspose.slides.internal.p332p7.ktl ktlVar = (com.aspose.slides.internal.p332p7.ktl) m2066x1().m44347to().m36787k4("fill-image").m29542x1();
        ktlVar.m35715k4(strM67402k4);
        ktlVar.m35717x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2062k4(boolean z) {
        this.f2862kk = z;
    }
}
