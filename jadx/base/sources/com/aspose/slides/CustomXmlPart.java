package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.internal.p464vq.C11844wy;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class CustomXmlPart implements ICustomXmlPart {

    /* JADX INFO: renamed from: du */
    private List<CustomXmlPartCollection> f2076du;

    /* JADX INFO: renamed from: k4 */
    private Presentation f2077k4;

    /* JADX INFO: renamed from: kk */
    private C14047bz f2078kk;

    /* JADX INFO: renamed from: to */
    private String[] f2079to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC13443dy f2080x1;

    public CustomXmlPart(Presentation presentation, byte[] bArr) {
        this(presentation, bArr, C14047bz.m66536x1().Clone(), m1278k4(presentation, bArr));
    }

    @Override // com.aspose.slides.ICustomXmlPart
    public final UUID getItemId() {
        return C14047bz.m66534k4(m1279k4());
    }

    @Override // com.aspose.slides.ICustomXmlPart
    public final String[] getNamespaceSchemas() {
        return this.f2079to;
    }

    @Override // com.aspose.slides.ICustomXmlPart
    public final String getXmlAsString() {
        return AbstractC6747ar.m26635ix().m26681x1(this.f2080x1.mo18611k4());
    }

    @Override // com.aspose.slides.ICustomXmlPart
    public final byte[] getXmlData() {
        return this.f2080x1.mo18611k4();
    }

    /* JADX INFO: renamed from: k4 */
    public C14047bz m1279k4() {
        return this.f2078kk;
    }

    @Override // com.aspose.slides.ICustomXmlPart
    public final void remove() {
        if (this.f2077k4 == null) {
            throw new PptxEditException("Custom xml part is already removed from parent collection");
        }
        this.f2077k4 = null;
        for (CustomXmlPartCollection customXmlPartCollection : this.f2076du.toArray(new CustomXmlPartCollection[0])) {
            m1283x1(customXmlPartCollection);
        }
    }

    @Override // com.aspose.slides.ICustomXmlPart
    public final void setItemId(UUID uuid) {
        m1281k4(C14047bz.m66533k4(uuid));
    }

    @Override // com.aspose.slides.ICustomXmlPart
    public final void setXmlAsString(String str) {
        if (str == null) {
            throw new ArgumentNullException("Xml string can't be null");
        }
        if (C14113y2.m67363du(str, C14113y2.f47374k4)) {
            throw new ArgumentException("Xml string can't be empty");
        }
        setXmlData(AbstractC6747ar.m26635ix().mo26677to(str));
    }

    @Override // com.aspose.slides.ICustomXmlPart
    public final void setXmlData(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("Xml data can't be null");
        }
        this.f2079to = m1278k4(this.f2077k4, bArr);
        this.f2080x1 = this.f2077k4.m2388qq().m62581k4(bArr);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1283x1(CustomXmlPartCollection customXmlPartCollection) {
        customXmlPartCollection.m1285k4().removeItem(this);
        boolean zRemoveItem = this.f2076du.removeItem(customXmlPartCollection);
        if (this.f2076du.size() == 1) {
            CustomXmlPartCollection customXmlPartCollection2 = this.f2076du.get_Item(0);
            if (C7019kk.m27469x1(customXmlPartCollection2.getParent_Immediate(), Presentation.class)) {
                customXmlPartCollection2.m1285k4().removeItem(this);
                this.f2076du.removeItem(customXmlPartCollection2);
            }
        }
        return zRemoveItem;
    }

    public CustomXmlPart(Presentation presentation, byte[] bArr, C14047bz c14047bz, String[] strArr) {
        this.f2078kk = new C14047bz();
        this.f2077k4 = presentation;
        this.f2080x1 = presentation.m2388qq().m62581k4(bArr);
        C14047bz.m66536x1().CloneTo(this.f2078kk);
        this.f2079to = strArr;
        this.f2076du = new List<>();
        m1280k4(presentation.m2387ne());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1280k4(CustomXmlPartCollection customXmlPartCollection) {
        customXmlPartCollection.m1285k4().addItem(this);
        this.f2076du.addItem(customXmlPartCollection);
    }

    /* JADX INFO: renamed from: k4 */
    public void m1281k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f2078kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1282k4(String[] strArr) {
        this.f2079to = strArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static String[] m1278k4(IPresentation iPresentation, byte[] bArr) {
        C0926e4 c0926e4 = new C0926e4(new C11785nh().m55395k4("/customXml/item1.xml", null, new C11844wy(), bArr), new gnb(iPresentation, InterruptionToken.getNone()));
        List<String> list = new List<>();
        try {
            c0926e4.m5341k4(list);
            return list.toArray(new String[0]);
        } catch (XmlException e) {
            throw new ArgumentException("Xml data is not valid", e);
        }
    }
}
