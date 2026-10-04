package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class tii {
    /* JADX INFO: renamed from: k4 */
    public static InterfaceC13773le m71228k4(XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return xamlOptions.m3113up();
        }
        if (iM3092c5 == 1) {
            return xamlOptions.m3097fa();
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: kk */
    public static InterfaceC13773le m71234kk(XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return xamlOptions.m3108ks();
        }
        if (iM3092c5 == 1) {
            return xamlOptions.m3118yj();
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC13773le m71235x1(XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return xamlOptions.m3093ck();
        }
        if (iM3092c5 == 1) {
            return xamlOptions.m3100jd();
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC14264p2 m71229k4(IPictureFrame iPictureFrame, XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return new dv3(iPictureFrame, xamlOptions);
        }
        if (iM3092c5 == 1) {
            return new twm(iPictureFrame, xamlOptions);
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: x1 */
    public static wdc m71236x1(IShape iShape, XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return new o1a(iShape, xamlOptions);
        }
        if (iM3092c5 == 1) {
            return new x2o(iShape, xamlOptions);
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: k4 */
    public static wdc m71230k4(IAutoShape iAutoShape, XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return new su7(iAutoShape, xamlOptions);
        }
        if (iM3092c5 == 1) {
            return new edg(iAutoShape, xamlOptions);
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: k4 */
    public static wdc m71231k4(IParagraph iParagraph, XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return new x6s(iParagraph, xamlOptions);
        }
        if (iM3092c5 == 1) {
            return new qhd(iParagraph, xamlOptions);
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: k4 */
    public static wdc m71232k4(IShape iShape, XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return new ni1(iShape, xamlOptions);
        }
        if (iM3092c5 == 1) {
            return new d4f(iShape, xamlOptions);
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: k4 */
    public static wdc m71233k4(IShape iShape, XamlOptions xamlOptions, String str) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return new nfo(iShape, xamlOptions, str);
        }
        if (iM3092c5 == 1) {
            return new myp(iShape, xamlOptions, str);
        }
        throw new yii("Unknown xaml type.");
    }
}
