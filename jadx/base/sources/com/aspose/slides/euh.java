package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7204a0;
import com.aspose.slides.internal.p332p7.C7371c1;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7903i3;
import com.aspose.slides.internal.p332p7.C8305n2;
import com.aspose.slides.internal.p332p7.C8883tp;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class euh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4878k4 = new C7017h4("prstDash", "custDash", "round", "bevel", "miter");

    /* JADX INFO: renamed from: k4 */
    public static void m5726k4(ILineFormat iLineFormat, AbstractC4685kk<C8985uy> abstractC4685kk) {
        m5727k4(iLineFormat, abstractC4685kk, false);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m5730x1(ILineFormat iLineFormat, C8985uy c8985uy) {
        m5729k4(iLineFormat, c8985uy, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5727k4(ILineFormat iLineFormat, AbstractC4685kk<C8985uy> abstractC4685kk, boolean z) {
        if (iLineFormat != null) {
            if (z || !iLineFormat.isFormatNotDefined()) {
                m5730x1(iLineFormat, abstractC4685kk.invoke());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5728k4(ILineFormat iLineFormat, C8985uy c8985uy) {
        if (c8985uy == null) {
            return;
        }
        ikd.m7666k4(iLineFormat.getFillFormat(), c8985uy.m42635m9());
        C7394ca c7394caM42623dy = c8985uy.m42623dy();
        if (c7394caM42623dy != null) {
            int iM27428k4 = f4878k4.m27428k4(c7394caM42623dy.m29539k4());
            if (iM27428k4 == 0) {
                iLineFormat.setDashStyle(((C7903i3) c7394caM42623dy.m29542x1()).m33840k4());
            } else {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM42623dy.m29539k4(), "\""));
                }
                C8883tp c8883tp = (C8883tp) c7394caM42623dy.m29542x1();
                iLineFormat.setDashStyle((byte) 11);
                List list = new List();
                for (C7204a0 c7204a0 : c8883tp.m41837x1()) {
                    if (c7204a0.m27878k4() != 0.0f && c7204a0.m27880x1() != 0.0f) {
                        list.addItem(Float.valueOf(c7204a0.m27878k4() / 100.0f));
                        list.addItem(Float.valueOf(c7204a0.m27880x1() / 100.0f));
                    }
                }
                iLineFormat.setCustomDashPattern(C3085sv.m13067du((List<Float>) list));
            }
        } else {
            iLineFormat.setDashStyle((byte) -1);
        }
        iLineFormat.setWidth(c8985uy.m42632kk());
        iLineFormat.setCapStyle(c8985uy.m42636to());
        iLineFormat.setStyle(c8985uy.m42622du());
        iLineFormat.setAlignment(c8985uy.m42625h4());
        C7394ca c7394caM42620c5 = c8985uy.m42620c5();
        if (c7394caM42620c5 != null) {
            int iM27428k42 = f4878k4.m27428k4(c7394caM42620c5.m29539k4());
            if (iM27428k42 == 2) {
                iLineFormat.setJoinStyle((byte) 0);
            } else if (iM27428k42 == 3) {
                iLineFormat.setJoinStyle((byte) 1);
            } else {
                if (iM27428k42 != 4) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM42620c5.m29539k4(), "\""));
                }
                C7371c1 c7371c1 = (C7371c1) c7394caM42620c5.m29542x1();
                iLineFormat.setJoinStyle((byte) 2);
                iLineFormat.setMiterLimit(c7371c1.m29390k4() / 100.0f);
            }
        } else {
            iLineFormat.setJoinStyle((byte) -1);
        }
        if (c8985uy.m42626jd() != null) {
            iLineFormat.setBeginArrowheadStyle(c8985uy.m42626jd().m37206k4());
            iLineFormat.setBeginArrowheadWidth(c8985uy.m42626jd().m37210x1());
            iLineFormat.setBeginArrowheadLength(c8985uy.m42626jd().m37208kk());
        }
        if (c8985uy.m42621ck() != null) {
            iLineFormat.setEndArrowheadStyle(c8985uy.m42621ck().m37206k4());
            iLineFormat.setEndArrowheadWidth(c8985uy.m42621ck().m37210x1());
            iLineFormat.setEndArrowheadLength(c8985uy.m42621ck().m37208kk());
        }
        sws.m70814k4(iLineFormat.getSketchFormat(), c8985uy.m42624fa());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5729k4(ILineFormat iLineFormat, final C8985uy c8985uy, boolean z) {
        String str;
        if (iLineFormat != null) {
            if (z || !iLineFormat.isFormatNotDefined()) {
                ikd.m7665k4(iLineFormat.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.euh.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8985uy) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_LinePropertiesElementData.AddLineFillProperties(System.String)";
                    }

                    @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                    /* JADX INFO: renamed from: k4 */
                    public C7394ca mo2788k4(String str2) {
                        return c8985uy.m42637x1(str2);
                    }
                });
                if (iLineFormat.getDashStyle() != -1) {
                    if (iLineFormat.getDashStyle() != 11) {
                        ((C7903i3) c8985uy.m42627k4("prstDash").m29542x1()).m33841k4(iLineFormat.getDashStyle());
                    } else {
                        C8883tp c8883tp = (C8883tp) c8985uy.m42627k4("custDash").m29542x1();
                        float[] customDashPattern = iLineFormat.getCustomDashPattern();
                        if (customDashPattern != null) {
                            int i = 0;
                            if ((customDashPattern.length & 1) == 1) {
                                while (i < customDashPattern.length * 2) {
                                    C7204a0 c7204a0M41836k4 = c8883tp.m41836k4();
                                    c7204a0M41836k4.m27879k4(customDashPattern[i % customDashPattern.length] * 100.0f);
                                    c7204a0M41836k4.m27881x1(customDashPattern[(i + 1) % customDashPattern.length] * 100.0f);
                                    i += 2;
                                }
                            } else {
                                while (i < customDashPattern.length) {
                                    C7204a0 c7204a0M41836k42 = c8883tp.m41836k4();
                                    c7204a0M41836k42.m27879k4(customDashPattern[i] * 100.0f);
                                    c7204a0M41836k42.m27881x1(customDashPattern[i + 1] * 100.0f);
                                    i += 2;
                                }
                            }
                        }
                    }
                }
                c8985uy.m42630k4(iLineFormat.getWidth());
                c8985uy.m42629k4(iLineFormat.getCapStyle());
                c8985uy.m42639x1(iLineFormat.getStyle());
                c8985uy.m42634kk(iLineFormat.getAlignment());
                byte joinStyle = iLineFormat.getJoinStyle();
                if (joinStyle == 0) {
                    str = "round";
                } else {
                    if (joinStyle != 1) {
                        if (joinStyle == 2) {
                            ((C7371c1) c8985uy.m42633kk("miter").m29542x1()).m29391k4(iLineFormat.getMiterLimit() * 100.0f);
                        }
                        if (iLineFormat.getBeginArrowheadStyle() != -1) {
                            C8305n2 c8305n2M42628k4 = c8985uy.m42628k4();
                            c8305n2M42628k4.m37207k4(iLineFormat.getBeginArrowheadStyle());
                            c8305n2M42628k4.m37211x1(iLineFormat.getBeginArrowheadWidth());
                            c8305n2M42628k4.m37209kk(iLineFormat.getBeginArrowheadLength());
                        }
                        if (iLineFormat.getEndArrowheadStyle() != -1) {
                            C8305n2 c8305n2M42638x1 = c8985uy.m42638x1();
                            c8305n2M42638x1.m37207k4(iLineFormat.getEndArrowheadStyle());
                            c8305n2M42638x1.m37211x1(iLineFormat.getEndArrowheadWidth());
                            c8305n2M42638x1.m37209kk(iLineFormat.getEndArrowheadLength());
                        }
                        sws.m70815k4(iLineFormat.getSketchFormat(), c8985uy);
                    }
                    str = "bevel";
                }
                c8985uy.m42633kk(str);
                if (iLineFormat.getBeginArrowheadStyle() != -1) {
                }
                if (iLineFormat.getEndArrowheadStyle() != -1) {
                }
                sws.m70815k4(iLineFormat.getSketchFormat(), c8985uy);
            }
        }
    }
}
