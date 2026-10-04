package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class xlu extends fx0 {

    /* JADX INFO: renamed from: k4 */
    private C6765kp f50155k4 = new C6765kp();

    /* JADX INFO: renamed from: k4 */
    private int m73490k4(String str, int i) {
        if (i <= str.length() - 1 || str.charAt(i + 1) != '=') {
            return 0;
        }
        if (str.charAt(i) == '+') {
            this.f50155k4.m26792k4("\\mathrel{+}=");
        }
        if (str.charAt(i) == '-' || str.charAt(i) == 8722) {
            this.f50155k4.m26792k4("\\mathrel{-}=");
        }
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m73491k4(IMathParagraph iMathParagraph) {
        C6765kp c6765kp;
        String str;
        if (iMathParagraph.getCount() <= 0) {
            return C14113y2.f47374k4;
        }
        if (iMathParagraph.getCount() > 1) {
            IGenericEnumerator<IMathBlock> it = iMathParagraph.iterator();
            while (it.hasNext()) {
                try {
                    IMathBlock next = it.next();
                    this.f50155k4.m26792k4("&");
                    m73492k4(next);
                    this.f50155k4.m26792k4("\\\\\n");
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            this.f50155k4.m26786k4(0, "\\begin{align*}\n");
            C6765kp c6765kp2 = this.f50155k4;
            if (c6765kp2.m26806x1(c6765kp2.m26807x1() - 1) != '\n') {
                this.f50155k4.m26792k4(IOUtils.LINE_SEPARATOR_UNIX);
            }
            c6765kp = this.f50155k4;
            str = "\\end{align*}\n";
        } else {
            m73492k4(iMathParagraph.get_Item(0));
            this.f50155k4.m26786k4(0, "\\[\n");
            C6765kp c6765kp3 = this.f50155k4;
            if (c6765kp3.m26806x1(c6765kp3.m26807x1() - 1) != '\n') {
                this.f50155k4.m26792k4(IOUtils.LINE_SEPARATOR_UNIX);
            }
            c6765kp = this.f50155k4;
            str = "\\]\n";
        }
        c6765kp.m26792k4(str);
        return this.f50155k4.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public void m73492k4(IMathElement iMathElement) {
        MathElementBase mathElementBase = (MathElementBase) iMathElement;
        if (iMathElement == null) {
            this.f50155k4.m26792k4("{}");
        } else {
            mathElementBase.mo1966k4(this);
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4376k4(MathAccent mathAccent) {
        if (!suk.m70797x1(mathAccent.getCharacter())) {
            this.f50155k4.m26792k4(C14113y2.m67402k4("\\text{{(Unknown char code 0x{0:X}) }}", Character.valueOf(mathAccent.getCharacter())));
            return;
        }
        String strM70796k4 = suk.m70796k4(mathAccent.getCharacter());
        int iM67429to = C14113y2.m67429to(strM70796k4, '0');
        if (iM67429to <= 0) {
            this.f50155k4.m26792k4(C14113y2.m67402k4("\\text{{(Unknown char code 0x{0:X}) }}", Character.valueOf(mathAccent.getCharacter())));
            return;
        }
        this.f50155k4.m26792k4(C14113y2.m67443x1(strM70796k4, 0, iM67429to));
        m73492k4(mathAccent.getBase());
        this.f50155k4.m26792k4(C14113y2.m67422kk(strM70796k4, iM67429to + 1));
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4377k4(MathArray mathArray) {
        C6765kp c6765kp;
        String str;
        InterfaceC14397rj parent_Immediate = mathArray.getParent_Immediate();
        if (C7019kk.m27469x1(parent_Immediate, MathNaryOperator.class)) {
            c6765kp = this.f50155k4;
            str = "\\substack{";
        } else {
            c6765kp = this.f50155k4;
            str = "\\begin{matrix}";
        }
        c6765kp.m26792k4(str);
        for (int i = 0; i < mathArray.getArguments().getCount(); i++) {
            m73492k4(mathArray.getArguments().get_Item(i));
            if (i < mathArray.getArguments().getCount() - 1) {
                this.f50155k4.m26792k4("\\\\");
            }
        }
        if (C7019kk.m27469x1(parent_Immediate, MathNaryOperator.class)) {
            this.f50155k4.m26780k4('}');
        } else {
            this.f50155k4.m26792k4("\\end{matrix}");
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4378k4(MathBar mathBar) {
        this.f50155k4.m26792k4(mathBar.getPosition() == 2 ? "\\underline{" : "\\overline{");
        m73492k4(mathBar.getBase());
        this.f50155k4.m26780k4('}');
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4379k4(MathBlock mathBlock) {
        IGenericEnumerator<IMathElement> it = mathBlock.iterator();
        while (it.hasNext()) {
            try {
                m73492k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4380k4(MathBorderBox mathBorderBox) {
        this.f50155k4.m26792k4("\\boxed{");
        m73492k4(mathBorderBox.getBase());
        this.f50155k4.m26780k4('}');
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4381k4(MathBox mathBox) {
        m73492k4(mathBox.getBase());
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4382k4(MathDelimiter mathDelimiter) {
        C6765kp c6765kp;
        String strM67407k4;
        if (mathDelimiter.getBeginningCharacter() == '{') {
            c6765kp = this.f50155k4;
            strM67407k4 = C14113y2.m67407k4("\\left\\", Character.valueOf(mathDelimiter.getBeginningCharacter()));
        } else if (mathDelimiter.getBeginningCharacter() == 10216) {
            c6765kp = this.f50155k4;
            strM67407k4 = "\\left\\langle ";
        } else if (mathDelimiter.getBeginningCharacter() == 8970) {
            c6765kp = this.f50155k4;
            strM67407k4 = "\\left\\lfloor ";
        } else if (mathDelimiter.getBeginningCharacter() == 8968) {
            c6765kp = this.f50155k4;
            strM67407k4 = "\\left\\lceil ";
        } else if (mathDelimiter.getBeginningCharacter() == 8214) {
            c6765kp = this.f50155k4;
            strM67407k4 = "\\left\\| ";
        } else if (mathDelimiter.getBeginningCharacter() == 10214) {
            c6765kp = this.f50155k4;
            strM67407k4 = "\\left\\lBrack ";
        } else if (mathDelimiter.getBeginningCharacter() == 0) {
            c6765kp = this.f50155k4;
            strM67407k4 = "\\left. ";
        } else {
            c6765kp = this.f50155k4;
            strM67407k4 = C14113y2.m67407k4("\\left", Character.valueOf(mathDelimiter.getBeginningCharacter()));
        }
        c6765kp.m26792k4(strM67407k4);
        for (int i = 0; i < mathDelimiter.getArguments().getCount(); i++) {
            m73492k4(mathDelimiter.getArguments().get_Item(i));
            if (i < mathDelimiter.getArguments().getCount() - 1) {
                this.f50155k4.m26780k4(mathDelimiter.getSeparatorCharacter());
            }
        }
        if (mathDelimiter.getEndingCharacter() == '}') {
            this.f50155k4.m26792k4(C14113y2.m67407k4("\\right\\", Character.valueOf(mathDelimiter.getEndingCharacter())));
            return;
        }
        if (mathDelimiter.getEndingCharacter() == 10217) {
            this.f50155k4.m26792k4("\\right\\rangle ");
            return;
        }
        if (mathDelimiter.getEndingCharacter() == 8971) {
            this.f50155k4.m26792k4("\\right\\rfloor ");
            return;
        }
        if (mathDelimiter.getEndingCharacter() == 8969) {
            this.f50155k4.m26792k4("\\right\\rceil ");
            return;
        }
        if (mathDelimiter.getEndingCharacter() == 8214) {
            this.f50155k4.m26792k4("\\right\\| ");
            return;
        }
        if (mathDelimiter.getEndingCharacter() == 10215) {
            this.f50155k4.m26792k4("\\right\\rBrack ");
        } else if (mathDelimiter.getEndingCharacter() == 0) {
            this.f50155k4.m26792k4("\\right. ");
        } else {
            this.f50155k4.m26792k4(C14113y2.m67407k4("\\right", Character.valueOf(mathDelimiter.getEndingCharacter())));
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4383k4(MathFraction mathFraction) {
        int fractionType = mathFraction.getFractionType();
        if (fractionType == 1) {
            this.f50155k4.m26792k4("\\frac");
            this.f50155k4.m26780k4('{');
            m73492k4(mathFraction.getNumerator());
            this.f50155k4.m26780k4('}');
            this.f50155k4.m26780k4('{');
            m73492k4(mathFraction.getDenominator());
            this.f50155k4.m26780k4('}');
            return;
        }
        if (fractionType == 2 || fractionType == 3) {
            this.f50155k4.m26792k4("\\nicefrac{");
            m73492k4(mathFraction.getNumerator());
            this.f50155k4.m26780k4('}');
            this.f50155k4.m26780k4('{');
            m73492k4(mathFraction.getDenominator());
            this.f50155k4.m26780k4('}');
            return;
        }
        if (fractionType != 4) {
            throw new NotImplementedException();
        }
        this.f50155k4.m26792k4("\\begin{matrix}");
        m73492k4(mathFraction.getNumerator());
        this.f50155k4.m26792k4("\\\\");
        m73492k4(mathFraction.getDenominator());
        this.f50155k4.m26792k4("\\end{matrix}");
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4384k4(MathFunction mathFunction) {
        this.f50155k4.m26792k4("\\");
        m73492k4(mathFunction.getName());
        this.f50155k4.m26780k4(ControlChar.SPACE_CHAR);
        m73492k4(mathFunction.getBase());
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4385k4(MathGroupingCharacter mathGroupingCharacter) {
        C6765kp c6765kp;
        String str;
        char character = mathGroupingCharacter.getCharacter();
        if (character != 8592) {
            if (character != 8594) {
                if (character != 8596) {
                    if (character != 8656) {
                        if (character != 8658) {
                            if (character != 8660) {
                                if (character != 9182) {
                                    if (character == 9183) {
                                        c6765kp = this.f50155k4;
                                        str = "\\underbrace{";
                                    }
                                    m73492k4(mathGroupingCharacter.getBase());
                                    this.f50155k4.m26780k4('}');
                                }
                                c6765kp = this.f50155k4;
                                str = "\\overbrace{";
                            } else if (mathGroupingCharacter.getPosition() == 2) {
                                c6765kp = this.f50155k4;
                                str = "\\underset{\\Leftrightarrow}{";
                            } else {
                                c6765kp = this.f50155k4;
                                str = "\\overset{\\Leftrightarrow}{";
                            }
                        } else if (mathGroupingCharacter.getPosition() == 2) {
                            c6765kp = this.f50155k4;
                            str = "\\underset{\\Rightarrow}{";
                        } else {
                            c6765kp = this.f50155k4;
                            str = "\\overset{\\Rightarrow}{";
                        }
                    } else if (mathGroupingCharacter.getPosition() == 2) {
                        c6765kp = this.f50155k4;
                        str = "\\underset{\\Leftarrow}{";
                    } else {
                        c6765kp = this.f50155k4;
                        str = "\\overset{\\Leftarrow}{";
                    }
                } else if (mathGroupingCharacter.getPosition() == 2) {
                    c6765kp = this.f50155k4;
                    str = "\\underleftrightarrow{";
                } else {
                    c6765kp = this.f50155k4;
                    str = "\\overleftrightarrow{";
                }
            } else if (mathGroupingCharacter.getPosition() == 2) {
                c6765kp = this.f50155k4;
                str = "\\underrightarrow{";
            } else {
                c6765kp = this.f50155k4;
                str = "\\overrightarrow{";
            }
        } else if (mathGroupingCharacter.getPosition() == 2) {
            c6765kp = this.f50155k4;
            str = "\\underleftarrow{";
        } else {
            c6765kp = this.f50155k4;
            str = "\\overleftarrow{";
        }
        c6765kp.m26792k4(str);
        m73492k4(mathGroupingCharacter.getBase());
        this.f50155k4.m26780k4('}');
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4386k4(MathLeftSubSuperscriptElement mathLeftSubSuperscriptElement) {
        this.f50155k4.m26792k4("_{");
        m73492k4(mathLeftSubSuperscriptElement.getSubscript());
        this.f50155k4.m26780k4('}');
        this.f50155k4.m26792k4("^{");
        m73492k4(mathLeftSubSuperscriptElement.getSuperscript());
        this.f50155k4.m26780k4('}');
        m73492k4(mathLeftSubSuperscriptElement.getBase());
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4387k4(MathLimit mathLimit) {
        C6765kp c6765kp;
        String str;
        m73492k4(mathLimit.getBase());
        if (mathLimit.getUpperLimit()) {
            c6765kp = this.f50155k4;
            str = "^{";
        } else {
            c6765kp = this.f50155k4;
            str = "_{";
        }
        c6765kp.m26792k4(str);
        m73492k4(mathLimit.getLimit());
        this.f50155k4.m26780k4('}');
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4388k4(MathMatrix mathMatrix) {
        if (this.f50155k4.m26807x1() > 0) {
            if (this.f50155k4.m26806x1(r0.m26807x1() - 1) != '\n') {
                this.f50155k4.m26792k4(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        this.f50155k4.m26792k4("\\begin{matrix}\n");
        for (int i = 0; i < mathMatrix.getRowCount(); i++) {
            for (int i2 = 0; i2 < mathMatrix.getColumnCount(); i2++) {
                if (i2 > 0) {
                    this.f50155k4.m26792k4("&");
                }
                m73492k4(mathMatrix.get_Item(i, i2));
            }
            if (i < mathMatrix.getRowCount() - 1) {
                this.f50155k4.m26792k4("\\\\\n");
            }
        }
        this.f50155k4.m26792k4("\n\\end{matrix}\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4389k4(MathNaryOperator mathNaryOperator) {
        C6765kp c6765kp;
        String strM67402k4;
        boolean z = mathNaryOperator.getLimitLocation() == 1;
        boolean z2 = mathNaryOperator.getLimitLocation() == 2;
        String strM67389k4 = C14113y2.m67389k4(mathNaryOperator.getOperator(), 1);
        char cCharAt = strM67389k4.charAt(0);
        if (cCharAt == 0) {
            this.f50155k4.m26792k4("\\int");
            if (z) {
            }
        } else if (cCharAt != 8719) {
            if (cCharAt != 8721) {
                switch (cCharAt) {
                    case 8748:
                        this.f50155k4.m26792k4("\\iint");
                        if (z) {
                            this.f50155k4.m26792k4("\\limits");
                        }
                        break;
                    case 8749:
                        this.f50155k4.m26792k4("\\iiint");
                        if (z) {
                        }
                        break;
                    case 8750:
                        this.f50155k4.m26792k4("\\oint");
                        if (z) {
                        }
                        break;
                    case 8751:
                        this.f50155k4.m26792k4("\\oiint");
                        if (z) {
                        }
                        break;
                    case 8752:
                        this.f50155k4.m26792k4("\\oiiint ");
                        if (z) {
                        }
                        break;
                    default:
                        c6765kp = this.f50155k4;
                        switch (cCharAt) {
                            case 8896:
                                c6765kp.m26792k4("\\bigwedge");
                                if (z2) {
                                    this.f50155k4.m26792k4("\\nolimits");
                                }
                                break;
                            case 8897:
                                c6765kp.m26792k4("\\bigvee");
                                if (z2) {
                                }
                                break;
                            case 8898:
                                c6765kp.m26792k4("\\bigcap");
                                if (z2) {
                                }
                                break;
                            case 8899:
                                c6765kp.m26792k4("\\bigcup");
                                if (z2) {
                                }
                                break;
                            default:
                                strM67402k4 = C14113y2.m67402k4("\\text{{(Unknown operator code 0x{0:X}) }}", Integer.valueOf(strM67389k4.charAt(0)));
                                break;
                        }
                        break;
                }
            } else {
                c6765kp = this.f50155k4;
                strM67402k4 = "\\sum";
            }
            c6765kp.m26792k4(strM67402k4);
        } else {
            this.f50155k4.m26792k4("\\prod");
            if (z2) {
            }
        }
        this.f50155k4.m26792k4("_{");
        m73492k4(mathNaryOperator.getSubscript());
        this.f50155k4.m26792k4("}^{");
        m73492k4(mathNaryOperator.getSuperscript());
        this.f50155k4.m26780k4('}');
        m73492k4(mathNaryOperator.getBase());
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4390k4(MathRadical mathRadical) {
        boolean z = mathRadical.getDegree() == null && mathRadical.getHideDegree();
        this.f50155k4.m26792k4("\\sqrt");
        if (!z) {
            this.f50155k4.m26780k4('[');
            m73492k4(mathRadical.getDegree());
            this.f50155k4.m26780k4(']');
        }
        this.f50155k4.m26780k4('{');
        m73492k4(mathRadical.getBase());
        this.f50155k4.m26780k4('}');
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4391k4(MathRightSubSuperscriptElement mathRightSubSuperscriptElement) {
        m73492k4(mathRightSubSuperscriptElement.getBase());
        this.f50155k4.m26792k4("_{");
        m73492k4(mathRightSubSuperscriptElement.getSubscript());
        this.f50155k4.m26780k4('}');
        this.f50155k4.m26792k4("^{");
        m73492k4(mathRightSubSuperscriptElement.getSuperscript());
        this.f50155k4.m26780k4('}');
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4392k4(MathSubscriptElement mathSubscriptElement) {
        m73492k4(mathSubscriptElement.getBase());
        this.f50155k4.m26792k4("_{");
        m73492k4(mathSubscriptElement.getSubscript());
        this.f50155k4.m26780k4('}');
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4393k4(MathSuperscriptElement mathSuperscriptElement) {
        m73492k4(mathSuperscriptElement.getBase());
        this.f50155k4.m26792k4("^{");
        m73492k4(mathSuperscriptElement.getSuperscript());
        this.f50155k4.m26780k4('}');
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4394k4(MathematicalText mathematicalText) {
        String value = mathematicalText.getValue();
        int i = 0;
        while (i < value.length()) {
            if (m73490k4(value, i) > 0) {
                i++;
            } else if (C14117yj.m67514du(value.charAt(i))) {
                char cCharAt = value.charAt(i);
                i++;
                this.f50155k4.m26792k4(suk.m70796k4(C14117yj.m67525k4(cCharAt, value.charAt(i))));
            } else {
                this.f50155k4.m26792k4(suk.m70796k4(value.charAt(i)));
            }
            i++;
        }
    }

    @Override // com.aspose.slides.fx0
    /* JADX INFO: renamed from: k4 */
    public void mo4395k4(lv5 lv5Var) {
    }
}
