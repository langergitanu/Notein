package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.l7 */
/* JADX INFO: loaded from: classes3.dex */
class C13765l7 extends AbstractC13848ms<ColumnFormat, C13765l7> implements IColumnFormatEffectiveData {

    /* JADX INFO: renamed from: fa */
    private static final C13765l7 f45951fa = m64320ks();

    public C13765l7(ColumnFormat columnFormat) {
        super(columnFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public static C13765l7 m64319k4(ColumnFormat columnFormat) {
        return f45951fa;
    }

    /* JADX INFO: renamed from: ks */
    private static C13765l7 m64320ks() {
        C13765l7 c13765l7 = new C13765l7(null);
        AbstractC13848ms.m64974k4(c13765l7);
        return c13765l7;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m64321x1(ColumnFormat columnFormat) {
        boolean zM64980x1;
        boolean zM64976k4;
        int iM1139m9 = columnFormat.m1159k4().m1139m9();
        x5o x5oVarM2875to = columnFormat.m1161x1().m2875to();
        if (x5oVarM2875to == null) {
            return false;
        }
        if (columnFormat.m1161x1().getVerticalBanding()) {
            fdb fdbVarM73124h4 = ((columnFormat.m1161x1().getFirstCol() ? 1 : 0) + iM1139m9) % 2 == 0 ? x5oVarM2875to.m73124h4() : x5oVarM2875to.m73131m9();
            zM64976k4 = ((iM1139m9 == 0 && columnFormat.m1161x1().getFirstCol()) || (iM1139m9 == columnFormat.m1161x1().getColumns().size() - 1 && columnFormat.m1161x1().getLastCol())) ? false : AbstractC13848ms.m64976k4(columnFormat, fdbVarM73124h4);
            zM64980x1 = AbstractC13848ms.m64980x1(columnFormat, fdbVarM73124h4);
        } else {
            zM64980x1 = false;
            zM64976k4 = false;
        }
        if (columnFormat.m1161x1().getFirstRow()) {
            zM64980x1 |= AbstractC13848ms.m64978k4(columnFormat, x5oVarM2875to.m73119c5().m6127kk());
        }
        if (columnFormat.m1161x1().getLastRow()) {
            zM64980x1 |= AbstractC13848ms.m64978k4(columnFormat, x5oVarM2875to.m73122dy().m6129to());
        }
        if (iM1139m9 == columnFormat.m1161x1().getColumns().size() - 1 && columnFormat.m1161x1().getLastCol()) {
            zM64976k4 |= AbstractC13848ms.m64976k4(columnFormat, x5oVarM2875to.m73122dy());
            zM64980x1 |= AbstractC13848ms.m64980x1(columnFormat, x5oVarM2875to.m73122dy());
        }
        if (iM1139m9 == 0 && columnFormat.m1161x1().getFirstCol()) {
            zM64976k4 |= AbstractC13848ms.m64976k4(columnFormat, x5oVarM2875to.m73119c5());
            zM64980x1 |= AbstractC13848ms.m64980x1(columnFormat, x5oVarM2875to.m73119c5());
        }
        return zM64976k4 || zM64980x1;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, ColumnFormat columnFormat) {
        skr skrVarM64990m9;
        skr skrVarM64994yj;
        skr skrVarM64981c5;
        skr skrVarM64994yj2;
        m64987k4(interfaceC14672vc);
        uit uitVarM2882x1 = m4601W_().m1161x1().m2876up().m2882x1();
        m64985h4().m67934k4((InterfaceC14672vc) uitVarM2882x1.m64985h4());
        m64983dy().m70663k4((InterfaceC14672vc) uitVarM2882x1.m64983dy());
        m64986jd().m70663k4((InterfaceC14672vc) uitVarM2882x1.m64986jd());
        if (m4601W_().m1159k4().m1139m9() == 0) {
            skrVarM64990m9 = m64990m9();
            skrVarM64994yj = uitVarM2882x1.m64990m9();
        } else {
            skrVarM64990m9 = m64990m9();
            skrVarM64994yj = uitVarM2882x1.m64994yj();
        }
        skrVarM64990m9.m70663k4((InterfaceC14672vc) skrVarM64994yj);
        if (m4601W_().m1159k4().m1139m9() == m4601W_().m1161x1().getColumns().size() - 1) {
            skrVarM64981c5 = m64981c5();
            skrVarM64994yj2 = uitVarM2882x1.m64981c5();
        } else {
            skrVarM64981c5 = m64981c5();
            skrVarM64994yj2 = uitVarM2882x1.m64994yj();
        }
        skrVarM64981c5.m70663k4((InterfaceC14672vc) skrVarM64994yj2);
        m64991up().m70663k4((InterfaceC14672vc) uitVarM2882x1.m64991up());
        m64994yj().m70663k4((InterfaceC14672vc) uitVarM2882x1.m64994yj());
        int iM1139m9 = columnFormat.m1159k4().m1139m9();
        x5o x5oVarM2875to = columnFormat.m1161x1().m2875to();
        if (x5oVarM2875to != null) {
            if (columnFormat.m1161x1().getVerticalBanding()) {
                fdb fdbVarM73124h4 = ((columnFormat.m1161x1().getFirstCol() ? 1 : 0) + iM1139m9) % 2 == 0 ? x5oVarM2875to.m73124h4() : x5oVarM2875to.m73131m9();
                if ((iM1139m9 != 0 || !columnFormat.m1161x1().getFirstCol()) && (iM1139m9 != columnFormat.m1161x1().getColumns().size() - 1 || !columnFormat.m1161x1().getLastCol())) {
                    m64988k4(fdbVarM73124h4);
                }
                m64992x1(fdbVarM73124h4);
            }
            if (columnFormat.m1161x1().getFirstRow()) {
                m64989k4(m64983dy(), x5oVarM2875to.m73119c5().m6127kk());
            }
            if (columnFormat.m1161x1().getLastRow()) {
                m64989k4(m64986jd(), x5oVarM2875to.m73122dy().m6129to());
            }
            if (iM1139m9 == columnFormat.m1161x1().getColumns().size() - 1 && columnFormat.m1161x1().getLastCol()) {
                m64988k4(x5oVarM2875to.m73122dy());
                m64992x1(x5oVarM2875to.m73122dy());
            }
            if (iM1139m9 == 0 && columnFormat.m1161x1().getFirstCol()) {
                m64988k4(x5oVarM2875to.m73119c5());
                m64992x1(x5oVarM2875to.m73119c5());
            }
        }
    }
}
