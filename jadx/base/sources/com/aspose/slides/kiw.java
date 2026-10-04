package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class kiw {
    /* JADX INFO: renamed from: k4 */
    public static InterfaceC14691vk m63913k4(XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return new hib();
        }
        if (iM3092c5 == 1) {
            return new ts3();
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: kk */
    public static iln m63914kk(XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return new oin(new mwm("<AbsoluteLayout{0}>", "</AbsoluteLayout>"));
        }
        if (iM3092c5 == 1) {
            return new mj7(new mwm("<Canvas{0}>", "</Canvas>"));
        }
        throw new yii("Unknown xaml type.");
    }

    /* JADX INFO: renamed from: x1 */
    public static oow m63915x1(XamlOptions xamlOptions) {
        int iM3092c5 = xamlOptions.m3092c5();
        if (iM3092c5 == 0) {
            return new e6q();
        }
        if (iM3092c5 == 1) {
            return new bqj();
        }
        throw new yii("Unknown xaml type.");
    }
}
