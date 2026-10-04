package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ChartDataCell implements IChartDataCell {

    /* JADX INFO: renamed from: du */
    private String f1344du;

    /* JADX INFO: renamed from: h4 */
    private xry f1345h4;

    /* JADX INFO: renamed from: k4 */
    boolean f1346k4;

    /* JADX INFO: renamed from: kk */
    private C13646iq f1347kk;

    /* JADX INFO: renamed from: to */
    private String f1348to;

    /* JADX INFO: renamed from: x1 */
    private wdt f1349x1;

    public ChartDataCell(C13646iq c13646iq) {
        this(c13646iq, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: up */
    private void m557up() {
        if (m577x1() == null || this.f1346k4) {
            return;
        }
        m577x1().m703x1().m63046k4(this);
        this.f1346k4 = true;
    }

    /* JADX INFO: renamed from: c5 */
    public final wdt m559c5() {
        return this.f1349x1;
    }

    @Override // com.aspose.slides.IChartDataCell
    public final void calculate(boolean z) {
        m559c5().m72688k4(z);
    }

    /* JADX INFO: renamed from: ck */
    public final wuq m560ck() {
        long jM73593to = this.f1345h4.m73593to();
        IGenericEnumerator<wuq> it = m572kk().f1424kk.iterator();
        while (it.hasNext()) {
            try {
                wuq next = it.next();
                if (next.m72938x1() == jM73593to) {
                    return next;
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

    /* JADX INFO: renamed from: du */
    public final String m561du() {
        return this.f1348to;
    }

    /* JADX INFO: renamed from: dy */
    public final xry m562dy() {
        return this.f1345h4;
    }

    /* JADX INFO: renamed from: fa */
    public final wuq m563fa() {
        String str = this.f1344du;
        djf djfVar = m572kk().f1424kk;
        IGenericEnumerator<wuq> it = djfVar.iterator();
        long jM72938x1 = 164;
        while (it.hasNext()) {
            try {
                wuq next = it.next();
                if (C14113y2.m67363du(next.m72935k4(), str)) {
                    return next;
                }
                if ((next.m72938x1() & 4294967295L) >= (jM72938x1 & 4294967295L)) {
                    jM72938x1 = ((next.m72938x1() & 4294967295L) + 1) & 4294967295L;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        wuq wuqVar = new wuq();
        wuqVar.m72936k4(jM72938x1);
        wuqVar.m72937k4(str);
        djfVar.m5119k4(wuqVar);
        return wuqVar;
    }

    @Override // com.aspose.slides.IChartDataCell
    public final IChartDataWorksheet getChartDataWorksheet() {
        return m577x1();
    }

    @Override // com.aspose.slides.IChartDataCell
    public final int getColumn() {
        return m559c5().mo3443kk() - 1;
    }

    @Override // com.aspose.slides.IChartDataCell
    public final String getCustomNumberFormat() {
        return this.f1344du;
    }

    @Override // com.aspose.slides.IChartDataCell
    public final String getFormula() {
        return m559c5().mo3437k4(0);
    }

    @Override // com.aspose.slides.IChartDataCell
    public final byte getPresetNumberFormat() {
        if ((this.f1345h4.m73593to() & 4294967295L) < 164) {
            return (byte) this.f1345h4.m73593to();
        }
        return (byte) 0;
    }

    @Override // com.aspose.slides.IChartDataCell
    public final String getR1C1Formula() {
        return m559c5().mo3437k4(1);
    }

    @Override // com.aspose.slides.IChartDataCell
    public final int getRow() {
        return m559c5().mo3452x1() - 1;
    }

    @Override // com.aspose.slides.IChartDataCell
    public final Object getValue() {
        return m559c5().mo3449to();
    }

    /* JADX INFO: renamed from: h4 */
    public final int m564h4() {
        if (C7019kk.m27469x1(m559c5().mo3449to(), Integer.class)) {
            return ((Integer) C7019kk.m27464to(m559c5().mo3449to(), Integer.TYPE)).intValue();
        }
        return 0;
    }

    @Override // com.aspose.slides.IChartDataCell
    public final boolean isHidden() {
        return C14080ne.m66958k4(Boolean.valueOf((m577x1().m703x1().f45338to.containsKey(Long.valueOf(((long) m559c5().mo3443kk()) & 4294967295L)) && C14080ne.m66958k4(m577x1().m703x1().f45338to.get_Item(Long.valueOf(((long) m559c5().mo3443kk()) & 4294967295L)))) || (m577x1().m703x1().f45336kk.containsKey(Long.valueOf(((long) m559c5().mo3452x1()) & 4294967295L)) && C14080ne.m66958k4(m577x1().m703x1().f45336kk.get_Item(Long.valueOf(4294967295L & ((long) m559c5().mo3452x1())))))));
    }

    /* JADX INFO: renamed from: jd */
    public final int m565jd() {
        zt8 zt8Var = m572kk().f1427to;
        for (int iM74812k4 = zt8Var.m74812k4() - 1; iM74812k4 >= 0; iM74812k4--) {
            if (this.f1345h4.m73580k4() == zt8Var.m74814k4(iM74812k4).m73580k4() && this.f1345h4.m73600x1() == zt8Var.m74814k4(iM74812k4).m73600x1() && this.f1345h4.m73589kk() == zt8Var.m74814k4(iM74812k4).m73589kk() && this.f1345h4.m73593to() == zt8Var.m74814k4(iM74812k4).m73593to() && this.f1345h4.m73572du() == zt8Var.m74814k4(iM74812k4).m73572du() && this.f1345h4.m73577h4() == zt8Var.m74814k4(iM74812k4).m73577h4() && this.f1345h4.m73591m9() == zt8Var.m74814k4(iM74812k4).m73591m9() && this.f1345h4.m73575dy() == zt8Var.m74814k4(iM74812k4).m73575dy() && this.f1345h4.m73570c5() == zt8Var.m74814k4(iM74812k4).m73570c5() && this.f1345h4.m73579jd() == zt8Var.m74814k4(iM74812k4).m73579jd() && this.f1345h4.m73571ck() == zt8Var.m74814k4(iM74812k4).m73571ck() && this.f1345h4.m73576fa() == zt8Var.m74814k4(iM74812k4).m73576fa() && this.f1345h4.m73596up() == zt8Var.m74814k4(iM74812k4).m73596up()) {
                return iM74812k4;
            }
        }
        return zt8Var.m74813k4(this.f1345h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m566k4() {
        return m559c5().mo3431dy();
    }

    /* JADX INFO: renamed from: kk */
    public final ChartDataWorkbook m572kk() {
        return this.f1347kk.f45339x1.m702to();
    }

    /* JADX INFO: renamed from: m9 */
    public final String m574m9() {
        return C14080ne.m66987ks(m559c5().mo3449to(), C11697x1.m55250kk());
    }

    @Override // com.aspose.slides.IChartDataCell
    public final void setCustomNumberFormat(String str) {
        if (str == null) {
            throw new ArgumentNullException("Can't be null. To reset format use empty string.");
        }
        this.f1344du = str;
    }

    @Override // com.aspose.slides.IChartDataCell
    public final void setFormula(String str) {
        m578x1(str);
    }

    @Override // com.aspose.slides.IChartDataCell
    public final void setPresetNumberFormat(byte b) {
        this.f1345h4.m73598x1(b & 255);
    }

    @Override // com.aspose.slides.IChartDataCell
    public final void setR1C1Formula(String str) {
        m573kk(str);
    }

    @Override // com.aspose.slides.IChartDataCell
    public final void setValue(Object obj) {
        m570k4(obj);
    }

    /* JADX INFO: renamed from: to */
    public final void m575to(String str) {
        this.f1348to = str;
        int[] iArr = {0};
        int[] iArr2 = {0};
        ChartDataWorkbook.m660k4(str, iArr, iArr2);
        m559c5().m72685k4(iArr[0], iArr2[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final ChartDataWorksheet m577x1() {
        return this.f1347kk.f45339x1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099 A[PHI: r5
      0x0099: PHI (r5v14 java.lang.Object) = (r5v13 java.lang.Object), (r5v17 java.lang.Object), (r5v22 java.lang.Object) binds: [B:29:0x00d6, B:26:0x00c9, B:22:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChartDataCell(C13646iq c13646iq, C0900dg c0900dg) {
        Object objM70973x1;
        a9h a9hVarM72689ks;
        Object objM64841k4;
        wuq wuqVarM560ck;
        this.f1344du = "";
        this.f1345h4 = new xry();
        this.f1347kk = c13646iq;
        m556k4(new wdt(this));
        m559c5().m72689ks().f3866x1 = c0900dg.m5097x1();
        m569k4(m572kk().f1427to.m74814k4((int) c0900dg.m5094du()));
        if ((this.f1345h4.m73593to() & 4294967295L) >= 164 && this.f1345h4.m73570c5() != 0 && (wuqVarM560ck = m560ck()) != null) {
            this.f1344du = wuqVarM560ck.m72935k4();
        }
        if (c0900dg.m5095kk() != null) {
            byte bM5097x1 = c0900dg.m5097x1();
            if (bM5097x1 == 0) {
                objM70973x1 = t5p.m70973x1((String) c0900dg.m5095kk());
                if (objM70973x1 != null) {
                }
            } else if (bM5097x1 == 1) {
                objM70973x1 = t5p.m70971k4((String) c0900dg.m5095kk());
                if (objM70973x1 != null) {
                }
            } else if (bM5097x1 == 3) {
                a9hVarM72689ks = m559c5().m72689ks();
                objM64841k4 = m572kk().f1429x1.m64841k4(C14080ne.m66998m9(c0900dg.m5095kk()));
            } else if (bM5097x1 != 6) {
                a9hVarM72689ks = m559c5().m72689ks();
                objM64841k4 = c0900dg.m5095kk();
            } else {
                objM70973x1 = t5p.m70972k4((String) c0900dg.m5095kk(), 0);
                if (objM70973x1 != null) {
                    m559c5().m72689ks().f3861k4 = objM70973x1;
                }
            }
            m575to(c0900dg.m5096to());
            this.f1346k4 = true;
        }
        a9hVarM72689ks = m559c5().m72689ks();
        objM64841k4 = null;
        a9hVarM72689ks.f3861k4 = objM64841k4;
        m575to(c0900dg.m5096to());
        this.f1346k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m554k4(int i, boolean z) {
        if (z) {
            if (i == 14) {
                return C14113y2.m67368h4(C11697x1.m55252to().m55261du().m55193ne());
            }
            if (i == 15) {
                return C14113y2.m67402k4("d{0}mmm{0}yy", C14113y2.m67401k4(C11697x1.m55252to().m55261du().m55187ks(), "/", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR));
            }
            if (i == 16) {
                return C14113y2.m67402k4("d{0}mmm", C14113y2.m67401k4(C11697x1.m55252to().m55261du().m55187ks(), "/", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR));
            }
            if (i == 17) {
                return C14113y2.m67402k4("mmm{0}yy", C14113y2.m67401k4(C11697x1.m55252to().m55261du().m55187ks(), "/", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR));
            }
            if (i == 18) {
                return C14113y2.m67402k4("h:mm {0}", "tt");
            }
            if (i == 19) {
                return C14113y2.m67402k4("h:mm:ss {0}", "tt");
            }
            if (i == 22) {
                return C14113y2.m67402k4("{0} h:mm", C14113y2.m67368h4(C11697x1.m55252to().m55261du().m55193ne()));
            }
        }
        return m558x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m558x1(int i) {
        switch (i) {
            case 0:
                return "General";
            case 1:
                return "0";
            case 2:
                return "0.00";
            case 3:
                return "#,##0";
            case 4:
                return "#,##0.00";
            case 5:
                return "$#,##0;$-#,##0";
            case 6:
                return "$#,##0;[Red]$-#,##0";
            case 7:
                return "$#,##0.00;$-#,##0.00";
            case 8:
                return "$#,##0.00;[Red]$-#,##0.00";
            case 9:
                return "0%";
            case 10:
                return "0.00%";
            case 11:
                return "0.00E+00";
            case 12:
                return "# ?/?";
            case 13:
                return "# /";
            case 14:
                return "m/d/yyyy";
            case 15:
                return "d\\-mmm\\-yy";
            case 16:
                return "d\\-mmm";
            case 17:
                return "mmm\\-yy";
            case 18:
                return "h:mm\\ AM/PM";
            case 19:
                return "h:mm:ss\\ AM/PM";
            case 20:
                return "h:mm";
            case 21:
                return "h:mm:ss";
            case 22:
                return "m/d/yyyy\\ h:mm";
            default:
                switch (i) {
                    case 37:
                        return "#,##0;-#,##0";
                    case 38:
                        return "#,##0;[Red]-#,##0";
                    case 39:
                        return "#,##0.00;-#,##0.00";
                    case 40:
                        return "#,##0.00;[Red]-#,##0.00";
                    case 41:
                        return "_ * #,##0_ ;_ * \"_ ;_ @_";
                    case 42:
                        return "_ $* #,##0_ ;_ $* \"_ ;_ @_";
                    case 43:
                        return "_ * #,##0.00_ ;_ * \"??_ ;_ @_";
                    case 44:
                        return "_(\"$\"* # ##0,00_);_(\"$\"* (# ##0,00);_(\"$\"* \"-\"??_);_(@_)";
                    case 45:
                        return "mm:ss";
                    case 46:
                        return "h :mm:ss";
                    case 47:
                        return "mm:ss.0";
                    case 48:
                        return "##0.0E+00";
                    case 49:
                        return "@";
                    default:
                        return C14113y2.f47374k4;
                }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m573kk(String str) {
        m559c5().m72687k4(str, 1);
        m557up();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m576to() {
        return C14113y2.m67363du(C14113y2.m67440x1(this.f1344du), C14113y2.f47374k4) && (getPresetNumberFormat() & 255) == 0;
    }

    public ChartDataCell(C13646iq c13646iq, String str) {
        this.f1344du = "";
        this.f1345h4 = new xry();
        m555k4(c13646iq, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m567k4(boolean z) {
        String strM67440x1 = C14113y2.m67440x1(this.f1344du);
        return C14113y2.m67363du(strM67440x1, C14113y2.f47374k4) ? m554k4(getPresetNumberFormat() & 255, z) : strM67440x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m578x1(String str) {
        m559c5().m72687k4(str, 0);
        m557up();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m568k4(int i) {
        m559c5().m72686k4(Integer.valueOf(i));
        m557up();
    }

    /* JADX INFO: renamed from: k4 */
    private void m555k4(C13646iq c13646iq, String str) {
        this.f1347kk = c13646iq;
        m556k4(new wdt(this));
        this.f1346k4 = false;
        if (C14113y2.m67411k4(str)) {
            return;
        }
        m575to(str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m556k4(wdt wdtVar) {
        this.f1349x1 = wdtVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m569k4(xry xryVar) {
        xry xryVar2 = new xry();
        xryVar2.m73582k4(xryVar.m73580k4());
        xryVar2.m73586k4(xryVar.m73600x1());
        xryVar2.m73599x1(xryVar.m73589kk());
        xryVar2.m73598x1(xryVar.m73593to());
        xryVar2.m73588kk(xryVar.m73572du());
        xryVar2.m73595to(xryVar.m73577h4());
        xryVar2.m73574du(xryVar.m73591m9());
        xryVar2.m73581k4(xryVar.m73575dy());
        xryVar2.m73597x1(xryVar.m73570c5());
        xryVar2.m73587kk(xryVar.m73579jd());
        xryVar2.m73594to(xryVar.m73571ck());
        xryVar2.m73573du(xryVar.m73576fa());
        xryVar2.m73578h4(xryVar.m73596up());
        this.f1345h4 = xryVar2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m570k4(Object obj) {
        m559c5().m72686k4(obj);
        m557up();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m571k4(String str) {
        m559c5().m72686k4(str);
        m557up();
    }
}
