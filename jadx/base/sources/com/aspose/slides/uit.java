package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class uit extends AbstractC13848ms<TableFormat, uit> implements ITableFormatEffectiveData {

    /* JADX INFO: renamed from: fa */
    private static final uit f49335fa = m71704ks();

    public uit(TableFormat tableFormat) {
        super(tableFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static uit m71703k4(TableFormat tableFormat) {
        return f49335fa;
    }

    /* JADX INFO: renamed from: ks */
    private static uit m71704ks() {
        uit uitVar = new uit(null);
        AbstractC13848ms.m64974k4(uitVar);
        return uitVar;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m71705x1(TableFormat tableFormat) {
        x5o x5oVarM2875to = tableFormat.m2881k4().m2875to();
        if (x5oVarM2875to == null) {
            return false;
        }
        boolean zM64976k4 = AbstractC13848ms.m64976k4(tableFormat, x5oVarM2875to.m73128kk());
        if (!zM64976k4) {
            zM64976k4 = AbstractC13848ms.m64979x1(tableFormat, x5oVarM2875to.m73142x1().m4496k4());
        }
        return zM64976k4 || AbstractC13848ms.m64980x1(tableFormat, x5oVarM2875to.m73128kk());
    }

    @Override // com.aspose.slides.ITableFormatEffectiveData
    public final float getTransparency() {
        if (C14064he.m66715kk(m4601W_().getTransparency())) {
            return 0.0f;
        }
        return m4601W_().getTransparency();
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, TableFormat tableFormat) {
        m64987k4(interfaceC14672vc);
        m64985h4().m67936kk((FillFormat) tableFormat.m2881k4().getTableFormat().getFillFormat());
        x5o x5oVarM2875to = tableFormat.m2881k4().m2875to();
        if (x5oVarM2875to != null) {
            if (!m64988k4(x5oVarM2875to.m73128kk())) {
                AbstractC13848ms.m64977k4(m4601W_(), m64985h4(), x5oVarM2875to.m73142x1().m4496k4());
            }
            m64992x1(x5oVarM2875to.m73128kk());
        }
    }
}
