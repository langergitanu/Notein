package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8062k8;
import com.aspose.slides.internal.p332p7.C9099w9;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.cf */
/* JADX INFO: loaded from: classes3.dex */
class C0852cf {

    /* JADX INFO: renamed from: c5 */
    private C12013m9 f4313c5;

    /* JADX INFO: renamed from: du */
    private C12013m9 f4315du;

    /* JADX INFO: renamed from: dy */
    private DataLabel f4316dy;

    /* JADX INFO: renamed from: kk */
    C1189h8 f4320kk;

    /* JADX INFO: renamed from: m9 */
    private float f4321m9;

    /* JADX INFO: renamed from: to */
    C14365qy f4322to;

    /* JADX INFO: renamed from: k4 */
    C12025x6 f4319k4 = C12025x6.f40591k4.Clone();

    /* JADX INFO: renamed from: x1 */
    C12025x6 f4323x1 = C12025x6.f40591k4.Clone();

    /* JADX INFO: renamed from: h4 */
    private C12003du f4317h4 = new C12003du();

    /* JADX INFO: renamed from: jd */
    private C12003du f4318jd = new C12003du();

    /* JADX INFO: renamed from: ck */
    private boolean f4314ck = true;

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0852cf(DataLabel dataLabel, C14365qy c14365qy) {
        float f;
        C12003du c12003du;
        boolean zM27469x1;
        C12003du c12003duM581du;
        IColorFormat solidFillColor;
        byte textVerticalType;
        Chart chartM69834fa = c14365qy.m69834fa();
        this.f4316dy = dataLabel;
        this.f4322to = c14365qy;
        TextFrame textFrame = (TextFrame) dataLabel.getTextFrameForOverriding();
        DataLabelFormat dataLabelFormat = (DataLabelFormat) dataLabel.m1294dy().getLabels().getDefaultDataLabelFormat();
        DataLabelFormat dataLabelFormat2 = (DataLabelFormat) dataLabel.getDataLabelFormat();
        this.f4315du = chartM69834fa.m509k4(dataLabelFormat2.getTextFormat());
        if (textFrame != null) {
            this.f4313c5 = chartM69834fa.m510k4(dataLabelFormat2.getTextFormat(), textFrame);
        }
        float rotationAngle = dataLabelFormat.getTextFormat().getTextBlockFormat().getRotationAngle();
        byte textVerticalType2 = dataLabelFormat.getTextFormat().getTextBlockFormat().getTextVerticalType();
        if (textVerticalType2 == 1) {
            rotationAngle = C14064he.m66715kk(rotationAngle) ? 90.0f : rotationAngle + 90.0f;
        } else if (textVerticalType2 == 2) {
            rotationAngle = C14064he.m66715kk(rotationAngle) ? 270.0f : rotationAngle + 270.0f;
        }
        this.f4321m9 = ((TextFrameFormat) dataLabel.getTextFormat().getTextBlockFormat()).getRotationAngle();
        byte textVerticalType3 = ((TextFrameFormat) dataLabel.getTextFormat().getTextBlockFormat()).getTextVerticalType();
        if (textVerticalType3 != 1) {
            f = textVerticalType3 == 2 ? C14064he.m66715kk(this.f4321m9) ? 270.0f : this.f4321m9 + 270.0f : f;
            if (C14064he.m66715kk(this.f4321m9) && textFrame != null) {
                this.f4321m9 = ((TextFrameFormat) textFrame.getTextFrameFormat()).getRotationAngle();
                textVerticalType = ((TextFrameFormat) textFrame.getTextFrameFormat()).getTextVerticalType();
                if (textVerticalType != 1) {
                    this.f4321m9 = C14064he.m66715kk(this.f4321m9) ? 90.0f : 90.0f + this.f4321m9;
                } else if (textVerticalType == 2) {
                    this.f4321m9 = C14064he.m66715kk(this.f4321m9) ? 270.0f : 270.0f + this.f4321m9;
                }
            }
            if (C14064he.m66715kk(this.f4321m9) && !C14064he.m66715kk(rotationAngle)) {
                this.f4321m9 = rotationAngle;
            }
            this.f4321m9 = !C14064he.m66715kk(this.f4321m9) ? 0.0f : this.f4321m9 * (-1.0f);
            chartM69834fa.m506k4(chartM69834fa.getStyle() + 1 <= 40 ? (byte) 1 : (byte) 0).CloneTo(this.f4317h4);
            if ((dataLabel.m1294dy().getType() != 80 || dataLabel.m1294dy().getType() == 75) && (dataLabel.getDataLabelFormat().getPosition() == 2 || dataLabel.getDataLabelFormat().getPosition() == 3 || dataLabel.getDataLabelFormat().getPosition() == 4 || dataLabel.getDataLabelFormat().getPosition() == -1)) {
                c12003du = new C12003du();
                zM27469x1 = C7019kk.m27469x1(((InterfaceC14397rj) C7019kk.m27452k4((Object) dataLabel, InterfaceC14397rj.class)).getParent_Immediate(), ChartDataPointLevel.class);
                InterfaceC14397rj parent_Immediate = ((InterfaceC14397rj) C7019kk.m27452k4((Object) dataLabel, InterfaceC14397rj.class)).getParent_Immediate();
                if (zM27469x1) {
                    solidFillColor = ((ChartDataPointLevel) C7019kk.m27452k4((Object) parent_Immediate, ChartDataPointLevel.class)).m651kk().getSolidFillColor();
                } else {
                    ChartDataPoint chartDataPoint = (ChartDataPoint) C7019kk.m27452k4((Object) parent_Immediate, ChartDataPoint.class);
                    if (chartDataPoint.getFormat().getFill().getFillType() == 1) {
                        solidFillColor = chartDataPoint.getFormat().getFill().getSolidFillColor();
                    } else {
                        c12003duM581du = chartDataPoint.m581du();
                        c12003duM581du.CloneTo(c12003du);
                        if ((((c12003du.m56505fa() & 255) * 114) + (((c12003du.m56502ck() & 255) * 587) + ((c12003du.m56507jd() & 255) * StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3))) / 1000.0f < 190.0f) {
                            chartM69834fa.m506k4((byte) 1).CloneTo(this.f4317h4);
                        }
                        if (((DataLabelFormat) dataLabel.getDataLabelFormat()).getTextFormat().getPortionFormat().getFillFormat().getFillType() != -1) {
                            chartM69834fa.m507k4(((DataLabelFormat) dataLabel.getDataLabelFormat()).getTextFormat(), this.f4317h4.Clone()).CloneTo(this.f4317h4);
                        }
                    }
                }
                c12003duM581du = ((ColorFormat) solidFillColor).m1084to();
                c12003duM581du.CloneTo(c12003du);
                if ((((c12003du.m56505fa() & 255) * 114) + (((c12003du.m56502ck() & 255) * 587) + ((c12003du.m56507jd() & 255) * StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3))) / 1000.0f < 190.0f) {
                }
                if (((DataLabelFormat) dataLabel.getDataLabelFormat()).getTextFormat().getPortionFormat().getFillFormat().getFillType() != -1) {
                }
            } else {
                if (chartM69834fa.getType() == 74) {
                    chartM69834fa.m506k4((byte) 1).CloneTo(this.f4317h4);
                    if (((DataLabelFormat) dataLabel.getDataLabelFormat()).getTextFormat().getPortionFormat().getFillFormat().getFillType() != -1) {
                    }
                } else {
                    chartM69834fa.m507k4(((DataLabelFormat) dataLabel.m1294dy().getLabels().getDefaultDataLabelFormat()).getTextFormat(), this.f4317h4.Clone()).CloneTo(this.f4317h4);
                }
                chartM69834fa.m507k4(((DataLabelFormat) dataLabel.getDataLabelFormat()).getTextFormat(), this.f4317h4.Clone()).CloneTo(this.f4317h4);
            }
            this.f4320kk = new C1189h8((Format) dataLabel.getDataLabelFormat().getFormat(), c14365qy, dataLabel);
            chartM69834fa.m508k4(this.f4317h4.Clone(), dataLabel.getTextFrameForOverriding()).CloneTo(this.f4318jd);
        }
        f = C14064he.m66715kk(this.f4321m9) ? 90.0f : this.f4321m9 + 90.0f;
        this.f4321m9 = f;
        if (C14064he.m66715kk(this.f4321m9)) {
            this.f4321m9 = ((TextFrameFormat) textFrame.getTextFrameFormat()).getRotationAngle();
            textVerticalType = ((TextFrameFormat) textFrame.getTextFrameFormat()).getTextVerticalType();
            if (textVerticalType != 1) {
            }
        }
        if (C14064he.m66715kk(this.f4321m9)) {
            this.f4321m9 = rotationAngle;
        }
        this.f4321m9 = !C14064he.m66715kk(this.f4321m9) ? 0.0f : this.f4321m9 * (-1.0f);
        chartM69834fa.m506k4(chartM69834fa.getStyle() + 1 <= 40 ? (byte) 1 : (byte) 0).CloneTo(this.f4317h4);
        if (dataLabel.m1294dy().getType() != 80) {
            c12003du = new C12003du();
            zM27469x1 = C7019kk.m27469x1(((InterfaceC14397rj) C7019kk.m27452k4((Object) dataLabel, InterfaceC14397rj.class)).getParent_Immediate(), ChartDataPointLevel.class);
            InterfaceC14397rj parent_Immediate2 = ((InterfaceC14397rj) C7019kk.m27452k4((Object) dataLabel, InterfaceC14397rj.class)).getParent_Immediate();
            if (zM27469x1) {
            }
            c12003duM581du = ((ColorFormat) solidFillColor).m1084to();
            c12003duM581du.CloneTo(c12003du);
            if ((((c12003du.m56505fa() & 255) * 114) + (((c12003du.m56502ck() & 255) * 587) + ((c12003du.m56507jd() & 255) * StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3))) / 1000.0f < 190.0f) {
            }
            if (((DataLabelFormat) dataLabel.getDataLabelFormat()).getTextFormat().getPortionFormat().getFillFormat().getFillType() != -1) {
            }
        } else {
            c12003du = new C12003du();
            zM27469x1 = C7019kk.m27469x1(((InterfaceC14397rj) C7019kk.m27452k4((Object) dataLabel, InterfaceC14397rj.class)).getParent_Immediate(), ChartDataPointLevel.class);
            InterfaceC14397rj parent_Immediate22 = ((InterfaceC14397rj) C7019kk.m27452k4((Object) dataLabel, InterfaceC14397rj.class)).getParent_Immediate();
            if (zM27469x1) {
            }
            c12003duM581du = ((ColorFormat) solidFillColor).m1084to();
            c12003duM581du.CloneTo(c12003du);
            if ((((c12003du.m56505fa() & 255) * 114) + (((c12003du.m56502ck() & 255) * 587) + ((c12003du.m56507jd() & 255) * StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3))) / 1000.0f < 190.0f) {
            }
            if (((DataLabelFormat) dataLabel.getDataLabelFormat()).getTextFormat().getPortionFormat().getFillFormat().getFillType() != -1) {
            }
        }
        this.f4320kk = new C1189h8((Format) dataLabel.getDataLabelFormat().getFormat(), c14365qy, dataLabel);
        chartM69834fa.m508k4(this.f4317h4.Clone(), dataLabel.getTextFrameForOverriding()).CloneTo(this.f4318jd);
    }

    /* JADX INFO: renamed from: c5 */
    public final C12013m9 m4556c5() {
        C12013m9 c12013m9 = this.f4313c5;
        return c12013m9 == null ? m4568to() : c12013m9;
    }

    /* JADX INFO: renamed from: ck */
    public final float m4557ck() {
        return m4556c5().m56638du();
    }

    /* JADX INFO: renamed from: du */
    public final C12013m9 m4558du() {
        C12013m9 c12013m9M4556c5 = m4556c5();
        return C12013m9.m56630k4(c12013m9M4556c5.m56651x1(), (c12013m9M4556c5.m56639dy() * 0.75f) / im9.m7679k4(), c12013m9M4556c5.m56642jd());
    }

    /* JADX INFO: renamed from: dy */
    public final int m4559dy() {
        return (this.f4316dy.getDataLabelFormat().getPosition() != -1 || ChartTypeCharacterizer.is3DChart(m4563k4().m69834fa().getType())) ? this.f4316dy.getDataLabelFormat().getPosition() : C13729ki.m63875k4(this.f4316dy.m1294dy().getType());
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m4560fa() {
        return C14064he.m66715kk(m4570x1().getX()) && C14064he.m66715kk(m4570x1().getY());
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m4561h4() {
        return this.f4317h4;
    }

    /* JADX INFO: renamed from: jd */
    public final C12003du m4562jd() {
        return this.f4318jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14365qy m4563k4() {
        return this.f4322to;
    }

    /* JADX INFO: renamed from: kk */
    public final TextFrame m4564kk() {
        boolean z;
        boolean z2 = ((ChartData) this.f4316dy.m1294dy().getChart().getChartData()).m553x1().mo5710kk() != 2;
        TextFrame textFrame = new TextFrame(m4570x1());
        TextFrame textFrame2 = (TextFrame) this.f4316dy.getTextFrameForOverriding();
        if (textFrame2 != null && !"".equals(textFrame2.getText())) {
            textFrame.m2930x1(this.f4316dy.getTextFrameForOverriding());
            for (int i = 0; i < textFrame.getParagraphs().getCount(); i++) {
                int i2 = 0;
                while (i2 < textFrame.getParagraphs().get_Item(i).getPortions().getCount()) {
                    IPortion iPortion = textFrame.getParagraphs().get_Item(i).getPortions().get_Item(i2);
                    if (iPortion.getField() != null) {
                        String internalString = iPortion.getField().getType().getInternalString();
                        if ("SERIESNAME".equals(internalString)) {
                            ChartSeries chartSeriesM1294dy = this.f4316dy.m1294dy();
                            iPortion.setText(z2 ? chartSeriesM1294dy.m725jd() : chartSeriesM1294dy.getName().toString());
                        }
                        if ("CATEGORYNAME".equals(internalString)) {
                            List<C1210hn> listM69848kk = this.f4316dy.m1294dy().getPlotOnSecondAxis() ? this.f4322to.m69848kk() : this.f4322to.m69871x1();
                            int iIndexOf = this.f4316dy.m1294dy().getLabels().indexOf(this.f4316dy);
                            iPortion.setText(this.f4316dy.m1294dy().getLabels().indexOf(this.f4316dy) < listM69848kk.size() ? listM69848kk.get_Item(iIndexOf).m7238x1().toString() : C14057f9.m66591x1(iIndexOf + 1));
                        }
                        if ("PERCENTAGE".equals(internalString)) {
                            iPortion.setText(this.f4316dy.m1295h4());
                        }
                        if ("[CELLRANGE]".equals(iPortion.getText())) {
                            iPortion.setText(!C14113y2.m67411k4(this.f4316dy.m1296k4()) ? this.f4316dy.m1296k4() : "");
                        }
                        if ("[BUBBLE SIZE]".equals(iPortion.getText())) {
                            String strM1303to = this.f4316dy.m1303to();
                            if (C14113y2.m67411k4(strM1303to)) {
                                strM1303to = "";
                            }
                            iPortion.setText(strM1303to);
                        }
                        if ("[CELLREF]".equals(iPortion.getText()) && this.f4316dy.m1305x1().m4028kk() != null) {
                            iPortion.setText("");
                            Field field = (Field) this.f4316dy.getTextFrameForOverriding().getParagraphs().get_Item(i).getPortions().get_Item(i2).getField();
                            C8062k8[] c8062k8ArrM45715k4 = this.f4316dy.m1305x1().m4028kk().m45715k4();
                            int length = c8062k8ArrM45715k4.length;
                            int i3 = 0;
                            while (i3 < length) {
                                C8062k8 c8062k8 = c8062k8ArrM45715k4[i3];
                                if (!C14047bz.m66537x1(new C14047bz(c8062k8.m35187k4()), field.m1447x1())) {
                                    C9099w9[] c9099w9ArrM39373to = c8062k8.m35188x1().m39373to();
                                    int length2 = c9099w9ArrM39373to.length;
                                    int i4 = 0;
                                    while (i4 < length2) {
                                        iPortion.setText(C14113y2.m67408k4(iPortion.getText(), c9099w9ArrM39373to[i4].m43592x1()));
                                        i4++;
                                        z2 = z2;
                                    }
                                }
                                i3++;
                                z2 = z2;
                            }
                        }
                        z = z2;
                        if ("VALUE".equals(internalString) || "YVALUE".equals(internalString)) {
                            iPortion.setText(this.f4316dy.m1293du());
                        }
                    } else {
                        z = z2;
                    }
                    i2++;
                    z2 = z;
                }
            }
        }
        return textFrame;
    }

    /* JADX INFO: renamed from: ks */
    public final LineFormat m4565ks() {
        IDataLabelFormat dataLabelFormat = this.f4316dy.getDataLabelFormat();
        return (LineFormat) (dataLabelFormat.getFormat().getLine().isFormatNotDefined() ? this.f4316dy.m1294dy().getLabels().getDefaultDataLabelFormat().getFormat() : dataLabelFormat.getFormat()).getLine();
    }

    /* JADX INFO: renamed from: m9 */
    public final float m4566m9() {
        return this.f4321m9;
    }

    /* JADX INFO: renamed from: rv */
    public final IEffectFormat m4567rv() {
        IDataLabelFormat dataLabelFormat = this.f4316dy.getDataLabelFormat();
        return (dataLabelFormat.getFormat().getEffect().isNoEffects() ? this.f4316dy.m1294dy().getLabels().getDefaultDataLabelFormat().getFormat() : dataLabelFormat.getFormat()).getEffect();
    }

    /* JADX INFO: renamed from: to */
    public final C12013m9 m4568to() {
        return this.f4315du;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m4569up() {
        return m4570x1().isVisible() || !C14113y2.m67411k4(m4564kk().getText());
    }

    /* JADX INFO: renamed from: x1 */
    public final DataLabel m4570x1() {
        return this.f4316dy;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m4571x6() {
        byte wrapText = m4570x1().m1294dy().getLabels().getDefaultDataLabelFormat().getTextFormat().getTextBlockFormat().getWrapText();
        byte wrapText2 = m4570x1().getDataLabelFormat().getTextFormat().getTextBlockFormat().getWrapText();
        return wrapText2 == -1 ? wrapText != 0 : wrapText2 != 0;
    }

    /* JADX INFO: renamed from: yj */
    public final FillFormat m4572yj() {
        IDataLabelFormat dataLabelFormat = this.f4316dy.getDataLabelFormat();
        return (FillFormat) (dataLabelFormat.getFormat().getFill().getFillType() == -1 ? this.f4316dy.m1294dy().getLabels().getDefaultDataLabelFormat().getFormat() : dataLabelFormat.getFormat()).getFill();
    }
}
