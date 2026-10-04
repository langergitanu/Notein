package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13958qb;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
class bz7 extends fx0 {

    /* JADX INFO: renamed from: kk */
    private static final C12380dy f4262kk = new C12380dy("\\d+([.|,]\\d+)?");

    /* JADX INFO: renamed from: to */
    private static final jb7 f4263to = jb7.m63273k4();

    /* JADX INFO: renamed from: k4 */
    private final AbstractC13958qb f4264k4;

    /* JADX INFO: renamed from: x1 */
    private final aa8 f4265x1;

    public bz7(AbstractC13958qb abstractC13958qb, aa8 aa8Var) {
        this.f4264k4 = abstractC13958qb;
        this.f4265x1 = aa8Var;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m4369k4(String str, int i) {
        return f4263to.m63275k4(str, i);
    }

    /* JADX INFO: renamed from: x1 */
    private static int m4374x1(String str, int i) {
        Matcher matcher = Pattern.compile("\r\n|\n|\r").matcher(str);
        if (!matcher.find(i)) {
            return 0;
        }
        String strGroup = matcher.group();
        if (strGroup.length() > 0) {
            return strGroup.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    private void m4370k4() {
        this.f4264k4.m65807up("mrow");
        this.f4264k4.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public void m4375k4(IMathElement iMathElement) {
        MathElementBase mathElementBase = (MathElementBase) iMathElement;
        if (mathElementBase == null) {
            m4370k4();
        } else {
            mathElementBase.mo1966k4(this);
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4376k4(MathAccent mathAccent) {
        this.f4265x1.m3460k4(true);
        try {
            this.f4264k4.m65807up("mover");
            m4375k4(mathAccent.getBase());
            m4373k4("mo", C14113y2.m67389k4(mathAccent.getCharacter(), 1), new KeyValuePair("accent", TelemetryEventStrings.Value.TRUE));
            this.f4264k4.mo21898jd();
        } finally {
            this.f4265x1.m3461kk();
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4377k4(MathArray mathArray) {
        this.f4265x1.m3460k4(false);
        try {
            this.f4264k4.m65807up("mtable");
            int baseJustification = mathArray.getBaseJustification();
            String str = baseJustification != 1 ? baseJustification != 2 ? baseJustification != 3 ? null : "bottom" : "center" : "top";
            if (str != null) {
                this.f4264k4.m65806to("align", str);
            }
            IGenericEnumerator<IMathElement> it = mathArray.getArguments().iterator();
            while (it.hasNext()) {
                try {
                    IMathElement next = it.next();
                    this.f4264k4.m65807up("mtr");
                    this.f4264k4.m65807up("mtd");
                    m4375k4(next);
                    this.f4264k4.mo21898jd();
                    this.f4264k4.mo21898jd();
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            this.f4264k4.mo21898jd();
            this.f4265x1.m3461kk();
        } catch (Throwable th) {
            this.f4265x1.m3461kk();
            throw th;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4378k4(MathBar mathBar) {
        boolean z = mathBar.getPosition() == 2;
        this.f4265x1.m3460k4(true);
        try {
            this.f4264k4.m65807up(z ? "munder" : "mover");
            this.f4264k4.m65806to(z ? "accentunder" : "accent", TelemetryEventStrings.Value.TRUE);
            m4375k4(mathBar.getBase());
            m4373k4("mo", z ? C18115b5.CONNECTOR : "¯", new KeyValuePair("stretchy", TelemetryEventStrings.Value.TRUE));
            this.f4264k4.mo21898jd();
            this.f4265x1.m3461kk();
        } catch (Throwable th) {
            this.f4265x1.m3461kk();
            throw th;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4379k4(MathBlock mathBlock) {
        boolean zM3464x1 = this.f4265x1.m3464x1();
        if (zM3464x1) {
            this.f4264k4.m65807up("mrow");
        }
        this.f4265x1.m3460k4(false);
        try {
            IGenericEnumerator<IMathElement> it = mathBlock.iterator();
            while (it.hasNext()) {
                try {
                    m4375k4(it.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM3464x1) {
                this.f4264k4.mo21898jd();
            }
        } finally {
            this.f4265x1.m3461kk();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0006, B:5:0x0011, B:7:0x0017, B:9:0x001d, B:12:0x0025, B:27:0x0056, B:29:0x005c, B:30:0x0061, B:32:0x0067, B:33:0x006c, B:35:0x0072, B:36:0x0077, B:38:0x007d, B:39:0x0082, B:15:0x002c, B:17:0x0032, B:18:0x0037, B:20:0x003d, B:21:0x0042, B:23:0x0048, B:24:0x004d), top: B:44:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0006, B:5:0x0011, B:7:0x0017, B:9:0x001d, B:12:0x0025, B:27:0x0056, B:29:0x005c, B:30:0x0061, B:32:0x0067, B:33:0x006c, B:35:0x0072, B:36:0x0077, B:38:0x007d, B:39:0x0082, B:15:0x002c, B:17:0x0032, B:18:0x0037, B:20:0x003d, B:21:0x0042, B:23:0x0048, B:24:0x004d), top: B:44:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0006, B:5:0x0011, B:7:0x0017, B:9:0x001d, B:12:0x0025, B:27:0x0056, B:29:0x005c, B:30:0x0061, B:32:0x0067, B:33:0x006c, B:35:0x0072, B:36:0x0077, B:38:0x007d, B:39:0x0082, B:15:0x002c, B:17:0x0032, B:18:0x0037, B:20:0x003d, B:21:0x0042, B:23:0x0048, B:24:0x004d), top: B:44:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0006, B:5:0x0011, B:7:0x0017, B:9:0x001d, B:12:0x0025, B:27:0x0056, B:29:0x005c, B:30:0x0061, B:32:0x0067, B:33:0x006c, B:35:0x0072, B:36:0x0077, B:38:0x007d, B:39:0x0082, B:15:0x002c, B:17:0x0032, B:18:0x0037, B:20:0x003d, B:21:0x0042, B:23:0x0048, B:24:0x004d), top: B:44:0x0006 }] */
    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4380k4(MathBorderBox mathBorderBox) {
        String str;
        this.f4265x1.m3460k4(false);
        try {
            C6765kp c6765kp = new C6765kp();
            if (mathBorderBox.getHideBottom() || mathBorderBox.getHideTop() || mathBorderBox.getHideLeft() || mathBorderBox.getHideRight()) {
                if (!mathBorderBox.getHideBottom()) {
                    c6765kp.m26792k4(" bottom");
                }
                if (!mathBorderBox.getHideTop()) {
                    c6765kp.m26792k4(" top");
                }
                if (!mathBorderBox.getHideLeft()) {
                    c6765kp.m26792k4(" left");
                }
                str = mathBorderBox.getHideRight() ? " box" : " right";
                if (mathBorderBox.getStrikethroughHorizontal()) {
                    c6765kp.m26792k4(" horizontalstrike");
                }
                if (mathBorderBox.getStrikethroughVertical()) {
                    c6765kp.m26792k4(" verticalstrike");
                }
                if (mathBorderBox.getStrikethroughTopLeftToBottomRight()) {
                    c6765kp.m26792k4(" downdiagonalstrike");
                }
                if (mathBorderBox.getStrikethroughBottomLeftToTopRight()) {
                    c6765kp.m26792k4(" updiagonalstrike");
                }
                this.f4264k4.m65807up("menclose");
                this.f4264k4.m65806to("notation", c6765kp.toString());
                m4375k4(mathBorderBox.getBase());
                this.f4264k4.mo21898jd();
                this.f4265x1.m3461kk();
            }
            c6765kp.m26792k4(str);
            if (mathBorderBox.getStrikethroughHorizontal()) {
            }
            if (mathBorderBox.getStrikethroughVertical()) {
            }
            if (mathBorderBox.getStrikethroughTopLeftToBottomRight()) {
            }
            if (mathBorderBox.getStrikethroughBottomLeftToTopRight()) {
            }
            this.f4264k4.m65807up("menclose");
            this.f4264k4.m65806to("notation", c6765kp.toString());
            m4375k4(mathBorderBox.getBase());
            this.f4264k4.mo21898jd();
            this.f4265x1.m3461kk();
        } catch (Throwable th) {
            this.f4265x1.m3461kk();
            throw th;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4381k4(MathBox mathBox) {
        this.f4265x1.m3460k4(true);
        if (mathBox.getNoBreak()) {
            this.f4265x1.m3463x1(true);
        }
        try {
            m4375k4(mathBox.getBase());
        } finally {
            this.f4265x1.m3461kk();
            this.f4265x1.m3463x1(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4382k4(MathDelimiter mathDelimiter) {
        this.f4265x1.m3460k4(true);
        try {
            this.f4264k4.m65807up("mfenced");
            this.f4264k4.m65806to("open", C14113y2.m67389k4(mathDelimiter.getBeginningCharacter(), 1));
            this.f4264k4.m65806to("close", C14113y2.m67389k4(mathDelimiter.getEndingCharacter(), 1));
            this.f4264k4.m65806to("separators", C14113y2.m67389k4(mathDelimiter.getSeparatorCharacter(), 1));
            IGenericEnumerator<IMathElement> it = mathDelimiter.getArguments().iterator();
            while (it.hasNext()) {
                try {
                    m4375k4(it.next());
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            this.f4264k4.mo21898jd();
            this.f4265x1.m3461kk();
        } catch (Throwable th2) {
            this.f4265x1.m3461kk();
            throw th2;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4383k4(MathFraction mathFraction) {
        AbstractC13958qb abstractC13958qb;
        String str;
        String str2;
        this.f4265x1.m3460k4(true);
        try {
            if (mathFraction.getFractionType() == 3) {
                m4375k4(mathFraction.getNumerator());
                m4372k4("mo", "/");
                m4375k4(mathFraction.getDenominator());
            } else {
                this.f4264k4.m65807up("mfrac");
                int fractionType = mathFraction.getFractionType();
                if (fractionType != 1) {
                    if (fractionType == 2) {
                        abstractC13958qb = this.f4264k4;
                        str = "bevelled";
                        str2 = TelemetryEventStrings.Value.TRUE;
                    } else {
                        if (fractionType != 4) {
                            throw new NotImplementedException();
                        }
                        abstractC13958qb = this.f4264k4;
                        str = "linethickness";
                        str2 = "0";
                    }
                    abstractC13958qb.m65806to(str, str2);
                }
                m4375k4(mathFraction.getNumerator());
                m4375k4(mathFraction.getDenominator());
                this.f4264k4.mo21898jd();
            }
            this.f4265x1.m3461kk();
        } catch (Throwable th) {
            this.f4265x1.m3461kk();
            throw th;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4384k4(MathFunction mathFunction) {
        boolean zM3464x1 = this.f4265x1.m3464x1();
        this.f4265x1.m3460k4(true);
        if (zM3464x1) {
            try {
                this.f4264k4.m65807up("mrow");
            } catch (Throwable th) {
                this.f4265x1.m3461kk();
                throw th;
            }
        }
        m4375k4(mathFunction.getName());
        m4372k4("mo", "\u2061");
        m4375k4(mathFunction.getBase());
        if (zM3464x1) {
            this.f4264k4.mo21898jd();
        }
        this.f4265x1.m3461kk();
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4385k4(MathGroupingCharacter mathGroupingCharacter) {
        this.f4265x1.m3460k4(true);
        try {
            this.f4264k4.m65807up(mathGroupingCharacter.getPosition() == 1 ? "mover" : "munder");
            m4375k4(mathGroupingCharacter.getBase());
            m4373k4("mo", C14113y2.m67389k4(mathGroupingCharacter.getCharacter(), 1), new KeyValuePair("stretchy", TelemetryEventStrings.Value.TRUE));
            this.f4264k4.mo21898jd();
            this.f4265x1.m3461kk();
        } catch (Throwable th) {
            this.f4265x1.m3461kk();
            throw th;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4386k4(MathLeftSubSuperscriptElement mathLeftSubSuperscriptElement) {
        this.f4265x1.m3460k4(true);
        try {
            this.f4264k4.m65807up("mmultiscripts");
            m4375k4(mathLeftSubSuperscriptElement.getBase());
            this.f4264k4.m65807up("mprescripts");
            this.f4264k4.mo21898jd();
            m4375k4(mathLeftSubSuperscriptElement.getSubscript());
            m4375k4(mathLeftSubSuperscriptElement.getSuperscript());
            this.f4264k4.mo21898jd();
        } finally {
            this.f4265x1.m3461kk();
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4387k4(MathLimit mathLimit) {
        this.f4265x1.m3460k4(true);
        try {
            this.f4264k4.m65807up(mathLimit.getUpperLimit() ? "mover" : "munder");
            m4375k4(mathLimit.getBase());
            m4375k4(mathLimit.getLimit());
            this.f4264k4.mo21898jd();
            this.f4265x1.m3461kk();
        } catch (Throwable th) {
            this.f4265x1.m3461kk();
            throw th;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4388k4(MathMatrix mathMatrix) {
        this.f4265x1.m3460k4(false);
        try {
            this.f4264k4.m65807up("mtable");
            int baseJustification = mathMatrix.getBaseJustification();
            String str = baseJustification != 1 ? baseJustification != 2 ? baseJustification != 3 ? null : "bottom" : "center" : "top";
            if (str != null) {
                this.f4264k4.m65806to("align", str);
            }
            for (int i = 0; i < mathMatrix.getRowCount(); i++) {
                this.f4264k4.m65807up("mtr");
                for (int i2 = 0; i2 < mathMatrix.getColumnCount(); i2++) {
                    this.f4264k4.m65807up("mtd");
                    m4375k4(mathMatrix.get_Item(i, i2));
                    this.f4264k4.mo21898jd();
                }
                this.f4264k4.mo21898jd();
            }
            this.f4264k4.mo21898jd();
            this.f4265x1.m3461kk();
        } catch (Throwable th) {
            this.f4265x1.m3461kk();
            throw th;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4389k4(MathNaryOperator mathNaryOperator) {
        this.f4265x1.m3460k4(true);
        try {
            boolean z = mathNaryOperator.getLimitLocation() == 1 || mathNaryOperator.getLimitLocation() == 0;
            this.f4264k4.m65807up("mrow");
            this.f4264k4.m65807up(z ? "munderover" : "msubsup");
            m4372k4("mo", C14113y2.m67389k4(mathNaryOperator.getOperator(), 1));
            m4375k4(mathNaryOperator.getSubscript());
            m4375k4(mathNaryOperator.getSuperscript());
            this.f4264k4.mo21898jd();
            this.f4265x1.m3460k4(false);
            try {
                m4375k4(mathNaryOperator.getBase());
                this.f4265x1.m3461kk();
                this.f4264k4.mo21898jd();
            } finally {
                this.f4265x1.m3461kk();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4390k4(MathRadical mathRadical) {
        AbstractC13958qb abstractC13958qb;
        boolean z = mathRadical.getDegree() == null && mathRadical.getHideDegree();
        this.f4265x1.m3460k4(!z);
        try {
            if (z) {
                this.f4264k4.m65807up("msqrt");
                m4375k4(mathRadical.getBase());
                abstractC13958qb = this.f4264k4;
            } else {
                this.f4264k4.m65807up("mroot");
                m4375k4(mathRadical.getBase());
                m4375k4(mathRadical.getDegree());
                abstractC13958qb = this.f4264k4;
            }
            abstractC13958qb.mo21898jd();
            this.f4265x1.m3461kk();
        } catch (Throwable th) {
            this.f4265x1.m3461kk();
            throw th;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4391k4(MathRightSubSuperscriptElement mathRightSubSuperscriptElement) {
        this.f4265x1.m3460k4(true);
        try {
            this.f4264k4.m65807up("msubsup");
            m4375k4(mathRightSubSuperscriptElement.getBase());
            m4375k4(mathRightSubSuperscriptElement.getSubscript());
            m4375k4(mathRightSubSuperscriptElement.getSuperscript());
            this.f4264k4.mo21898jd();
        } finally {
            this.f4265x1.m3461kk();
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4392k4(MathSubscriptElement mathSubscriptElement) {
        this.f4265x1.m3460k4(true);
        try {
            this.f4264k4.m65807up("msub");
            m4375k4(mathSubscriptElement.getBase());
            m4375k4(mathSubscriptElement.getSubscript());
            this.f4264k4.mo21898jd();
        } finally {
            this.f4265x1.m3461kk();
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4393k4(MathSuperscriptElement mathSuperscriptElement) {
        this.f4265x1.m3460k4(true);
        try {
            this.f4264k4.m65807up("msup");
            m4375k4(mathSuperscriptElement.getBase());
            m4375k4(mathSuperscriptElement.getSuperscript());
            this.f4264k4.mo21898jd();
        } finally {
            this.f4265x1.m3461kk();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4394k4(MathematicalText mathematicalText) {
        o9e o9eVar;
        int iMo57996x1;
        boolean zM3464x1 = this.f4265x1.m3464x1();
        String value = mathematicalText.getValue();
        List list = new List();
        int i = 0;
        while (i < value.length()) {
            int iM4369k4 = m4369k4(value, i);
            if (iM4369k4 > 0) {
                o9eVar = new o9e("mo", C14113y2.m67443x1(value, i, iM4369k4));
            } else {
                if (C14117yj.m67514du(value.charAt(i))) {
                    list.addItem(new o9e("mi", C14113y2.m67443x1(value, i, 2)));
                    i++;
                } else if (C14117yj.m67539to(value.charAt(i))) {
                    C12385to c12385toM57990x1 = f4262kk.m57990x1(value, i);
                    list.addItem(new o9e("mn", c12385toM57990x1.mo57995kk()));
                    iMo57996x1 = c12385toM57990x1.mo57996x1() - 1;
                    i += iMo57996x1;
                } else {
                    iM4369k4 = m4374x1(value, i);
                    if (iM4369k4 > 0) {
                        o9eVar = new o9e("mspace", (String) null, 1);
                        o9eVar.m68411k4("linebreak", "newline");
                    } else {
                        list.addItem(new o9e("mi", C14113y2.m67389k4(value.charAt(i), 1)));
                    }
                }
                i++;
            }
            list.addItem(o9eVar);
            iMo57996x1 = iM4369k4 - 1;
            i += iMo57996x1;
            i++;
        }
        if (zM3464x1 && list.size() != 1) {
            this.f4264k4.m65807up("mrow");
        }
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                m4371k4((o9e) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!zM3464x1 || list.size() == 1) {
            return;
        }
        this.f4264k4.mo21898jd();
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4395k4(lv5 lv5Var) {
    }

    /* JADX INFO: renamed from: k4 */
    private void m4371k4(o9e o9eVar) {
        this.f4264k4.m65807up(o9eVar.m68408k4());
        if (this.f4265x1.m3462to() && (C14113y2.m67363du(o9eVar.m68408k4(), "mo") || C14113y2.m67363du(o9eVar.m68408k4(), "mspace"))) {
            this.f4264k4.m65806to("linebreak", "nobreak");
        }
        if (o9eVar.m68412kk() != null) {
            List.Enumerator<KeyValuePair<String, String>> it = o9eVar.m68412kk().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair<String, String> next = it.next();
                    this.f4264k4.m65806to(next.getKey(), next.getValue());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        this.f4264k4.mo21918x1(o9eVar.m68413x1());
        this.f4264k4.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    private void m4372k4(String str, String str2) {
        m4371k4(new o9e(str, str2));
    }

    /* JADX INFO: renamed from: k4 */
    private void m4373k4(String str, String str2, KeyValuePair<String, String>... keyValuePairArr) {
        m4371k4(new o9e(str, str2, AbstractC14092to.m67204k4((Object[]) keyValuePairArr)));
    }
}
