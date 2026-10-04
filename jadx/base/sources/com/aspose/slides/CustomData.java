package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class CustomData implements ICustomData, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC14397rj f2072k4;

    /* JADX INFO: renamed from: kk */
    private CustomXmlPartCollection f2073kk;

    /* JADX INFO: renamed from: x1 */
    private final TagCollection f2075x1 = new TagCollection();

    /* JADX INFO: renamed from: to */
    private final C14145mv f2074to = new C14145mv();

    public CustomData(InterfaceC14397rj interfaceC14397rj) {
        this.f2072k4 = interfaceC14397rj;
    }

    @Override // com.aspose.slides.ICustomData
    public final ICustomXmlPartCollection getCustomXmlParts() {
        if (this.f2073kk == null) {
            this.f2073kk = new CustomXmlPartCollection(this);
        }
        return this.f2073kk;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2072k4;
    }

    @Override // com.aspose.slides.ICustomData
    public final ITagCollection getTags() {
        return this.f2075x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14145mv m1276k4() {
        return this.f2074to;
    }

    /* JADX INFO: renamed from: x1 */
    public void m1277x1() {
        this.f2075x1.clear();
        CustomXmlPartCollection customXmlPartCollection = this.f2073kk;
        if (customXmlPartCollection != null) {
            customXmlPartCollection.clear();
        }
    }
}
