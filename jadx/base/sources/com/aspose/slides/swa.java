package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class swa extends AbstractC13848ms<RowFormat, swa> implements IRowFormatEffectiveData {

    /* JADX INFO: renamed from: fa */
    private static final swa f48938fa = m70810ks();

    public swa(RowFormat rowFormat) {
        super(rowFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static swa m70809k4(RowFormat rowFormat) {
        return f48938fa;
    }

    /* JADX INFO: renamed from: ks */
    private static swa m70810ks() {
        swa swaVar = new swa(null);
        AbstractC13848ms.m64974k4(swaVar);
        return swaVar;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m70811x1(RowFormat rowFormat) {
        boolean zM64980x1;
        boolean zM64976k4;
        int iM2483m9 = rowFormat.m2502k4().m2483m9();
        x5o x5oVarM2875to = rowFormat.m2504x1().m2875to();
        if (x5oVarM2875to == null) {
            return false;
        }
        if (rowFormat.m2504x1().getHorizontalBanding()) {
            fdb fdbVarM73135to = ((rowFormat.m2504x1().getFirstRow() ? 1 : 0) + iM2483m9) % 2 == 0 ? x5oVarM2875to.m73135to() : x5oVarM2875to.m73121du();
            zM64976k4 = ((iM2483m9 == 0 && rowFormat.m2504x1().getFirstRow()) || (iM2483m9 == rowFormat.m2504x1().getRows().size() - 1 && rowFormat.m2504x1().getLastRow())) ? false : AbstractC13848ms.m64976k4(rowFormat, fdbVarM73135to);
            zM64980x1 = AbstractC13848ms.m64980x1(rowFormat, fdbVarM73135to);
        } else {
            zM64980x1 = false;
            zM64976k4 = false;
        }
        if (rowFormat.m2504x1().getFirstCol()) {
            zM64980x1 |= AbstractC13848ms.m64978k4(rowFormat, x5oVarM2875to.m73119c5().m6126k4());
        }
        if (rowFormat.m2504x1().getLastCol()) {
            zM64980x1 |= AbstractC13848ms.m64978k4(rowFormat, x5oVarM2875to.m73122dy().m6130x1());
        }
        if (iM2483m9 == rowFormat.m2504x1().getRows().size() - 1 && rowFormat.m2504x1().getLastRow()) {
            zM64976k4 |= AbstractC13848ms.m64976k4(rowFormat, x5oVarM2875to.m73126jd());
            zM64980x1 |= AbstractC13848ms.m64980x1(rowFormat, x5oVarM2875to.m73126jd());
        }
        if (iM2483m9 == 0 && rowFormat.m2504x1().getFirstRow()) {
            zM64976k4 |= AbstractC13848ms.m64976k4(rowFormat, x5oVarM2875to.m73138up());
            zM64980x1 |= AbstractC13848ms.m64980x1(rowFormat, x5oVarM2875to.m73138up());
        }
        return zM64976k4 || zM64980x1;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, RowFormat rowFormat) {
        skr skrVarM64983dy;
        skr skrVarM64991up;
        skr skrVarM64986jd;
        skr skrVarM64991up2;
        m64987k4(interfaceC14672vc);
        uit uitVarM2882x1 = m4601W_().m2504x1().m2876up().m2882x1();
        m64985h4().m67934k4((InterfaceC14672vc) uitVarM2882x1.m64985h4());
        m64990m9().m70663k4((InterfaceC14672vc) uitVarM2882x1.m64990m9());
        m64981c5().m70663k4((InterfaceC14672vc) uitVarM2882x1.m64981c5());
        if (m4601W_().m2502k4().m2483m9() == 0) {
            skrVarM64983dy = m64983dy();
            skrVarM64991up = uitVarM2882x1.m64983dy();
        } else {
            skrVarM64983dy = m64983dy();
            skrVarM64991up = uitVarM2882x1.m64991up();
        }
        skrVarM64983dy.m70663k4((InterfaceC14672vc) skrVarM64991up);
        if (m4601W_().m2502k4().m2483m9() == m4601W_().m2504x1().getRows().size() - 1) {
            skrVarM64986jd = m64986jd();
            skrVarM64991up2 = uitVarM2882x1.m64986jd();
        } else {
            skrVarM64986jd = m64986jd();
            skrVarM64991up2 = uitVarM2882x1.m64991up();
        }
        skrVarM64986jd.m70663k4((InterfaceC14672vc) skrVarM64991up2);
        m64991up().m70663k4((InterfaceC14672vc) uitVarM2882x1.m64991up());
        m64994yj().m70663k4((InterfaceC14672vc) uitVarM2882x1.m64994yj());
        int iM2483m9 = rowFormat.m2502k4().m2483m9();
        x5o x5oVarM2875to = rowFormat.m2504x1().m2875to();
        if (x5oVarM2875to != null) {
            if (rowFormat.m2504x1().getHorizontalBanding()) {
                fdb fdbVarM73135to = ((rowFormat.m2504x1().getFirstRow() ? 1 : 0) + iM2483m9) % 2 == 0 ? x5oVarM2875to.m73135to() : x5oVarM2875to.m73121du();
                if ((iM2483m9 != 0 || !rowFormat.m2504x1().getFirstRow()) && (iM2483m9 != rowFormat.m2504x1().getRows().size() - 1 || !rowFormat.m2504x1().getLastRow())) {
                    m64988k4(fdbVarM73135to);
                }
                m64992x1(fdbVarM73135to);
            }
            if (rowFormat.m2504x1().getFirstCol()) {
                m64989k4(m64990m9(), x5oVarM2875to.m73119c5().m6126k4());
            }
            if (rowFormat.m2504x1().getLastCol()) {
                m64989k4(m64981c5(), x5oVarM2875to.m73122dy().m6130x1());
            }
            if (iM2483m9 == rowFormat.m2504x1().getRows().size() - 1 && rowFormat.m2504x1().getLastRow()) {
                m64988k4(x5oVarM2875to.m73126jd());
                m64992x1(x5oVarM2875to.m73126jd());
            }
            if (iM2483m9 == 0 && rowFormat.m2504x1().getFirstRow()) {
                m64988k4(x5oVarM2875to.m73138up());
                m64992x1(x5oVarM2875to.m73138up());
            }
        }
    }
}
