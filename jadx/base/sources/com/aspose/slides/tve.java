package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class tve {
    /* JADX INFO: renamed from: k4 */
    private static int m71335k4(int i) {
        if (i != 1) {
            return i != 2 ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m71337x1(int i) {
        if (i != 0) {
            return i != 1 ? 3 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71336k4(INormalViewProperties iNormalViewProperties, com.aspose.slides.internal.p332p7.ecy ecyVar) {
        iNormalViewProperties.setShowOutlineIcons(ecyVar.m30899k4());
        iNormalViewProperties.setSnapVerticalSplitter(ecyVar.m30906x1());
        iNormalViewProperties.setVerticalBarState(m71335k4(ecyVar.m30900kk()));
        iNormalViewProperties.setHorizontalBarState(m71335k4(ecyVar.m30903to()));
        iNormalViewProperties.setPreferSingleView(ecyVar.m30895du());
        iNormalViewProperties.getRestoredLeft().setDimensionSize(ecyVar.m30896h4().m34076k4());
        iNormalViewProperties.getRestoredLeft().setAutoAdjust(ecyVar.m30896h4().m34079x1());
        iNormalViewProperties.getRestoredTop().setDimensionSize(ecyVar.m30902m9().m34076k4());
        iNormalViewProperties.getRestoredTop().setAutoAdjust(ecyVar.m30902m9().m34079x1());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m71338x1(INormalViewProperties iNormalViewProperties, com.aspose.slides.internal.p332p7.ecy ecyVar) {
        ecyVar.m30898k4(iNormalViewProperties.getShowOutlineIcons());
        ecyVar.m30905x1(iNormalViewProperties.getSnapVerticalSplitter());
        ecyVar.m30897k4(m71337x1(iNormalViewProperties.getVerticalBarState()));
        ecyVar.m30904x1(m71337x1(iNormalViewProperties.getHorizontalBarState()));
        ecyVar.m30901kk(iNormalViewProperties.getPreferSingleView());
        ecyVar.m30896h4().m34077k4(iNormalViewProperties.getRestoredLeft().getDimensionSize());
        ecyVar.m30896h4().m34078k4(iNormalViewProperties.getRestoredLeft().getAutoAdjust());
        ecyVar.m30902m9().m34077k4(iNormalViewProperties.getRestoredTop().getDimensionSize());
        ecyVar.m30902m9().m34078k4(iNormalViewProperties.getRestoredTop().getAutoAdjust());
    }
}
