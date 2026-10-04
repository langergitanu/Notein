package com.aspose.slides.internal.p270m9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.C9926m9;
import com.aspose.slides.internal.p368qq.C9930to;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.huawei.hms.network.embedded.C18385v2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C6343lr {

    /* JADX INFO: renamed from: du */
    private final List<String> f18034du;

    /* JADX INFO: renamed from: k4 */
    private final C6344m9 f18035k4;

    /* JADX INFO: renamed from: kk */
    private int f18036kk;

    /* JADX INFO: renamed from: to */
    private int f18037to;

    /* JADX INFO: renamed from: x1 */
    private static final C12380dy f18033x1 = new C12380dy("([0-9A-Fa-f]{6})|([0-9A-Fa-f]{3})\\s*", 0);

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f18032h4 = new C7017h4(C18385v2.f56336h, "FONT", "BASEFONT", "IMG", "TABLE", "TD", "TH", "TR", "P", "DIV", "H1", "rows", "cols", "none", "all");

    public C6343lr(C6344m9 c6344m9) {
        List<String> list = new List<>(5);
        this.f18034du = list;
        list.addItem("all");
        list.addItem("none");
        list.addItem("cols");
        list.addItem("rows");
        list.addItem("groups");
        this.f18035k4 = c6344m9;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m25957du(InterfaceC12769ix interfaceC12769ix, C6349u4 c6349u4) {
        String str;
        C6343lr c6343lr;
        String str2;
        int i;
        String str3;
        C6349u4 c6349u42 = c6349u4;
        InterfaceC12769ix interfaceC12769ixM25960k4 = m25960k4(interfaceC12769ix, "TABLE", 3);
        if (interfaceC12769ixM25960k4 != null) {
            String str4 = "inset";
            String str5 = "none";
            String str6 = "0";
            if (interfaceC12769ixM25960k4.mo22698c5("border")) {
                String strMo22721to = interfaceC12769ixM25960k4.mo22721to("border");
                if (!C14113y2.m67411k4(strMo22721to)) {
                    int[] iArr = {0};
                    boolean zM66590k4 = C14057f9.m66590k4(strMo22721to, iArr);
                    int i2 = iArr[0];
                    if (!zM66590k4) {
                        i2 = 1;
                    }
                    if (i2 == 0) {
                        c6349u42.mo23669k4("border-width", "0", (String) null);
                        c6349u42.mo23669k4("border-style", "none", (String) null);
                    } else {
                        c6349u42.mo23669k4("border-width", "1px", (String) null);
                        c6349u42.mo23669k4("border-style", "inset", (String) null);
                    }
                }
            } else {
                InterfaceC5808uz interfaceC5808uz = (InterfaceC5808uz) C7019kk.m27452k4((Object) interfaceC12769ixM25960k4, InterfaceC5808uz.class);
                if (interfaceC5808uz != null) {
                    c6343lr = this;
                    c6343lr.m25962k4(interfaceC5808uz.mo8443kk(), "border-left-style", "border-left-color", "border-left-width", c6349u42);
                    c6349u42 = c6349u4;
                    c6343lr.m25962k4(interfaceC5808uz.mo8443kk(), "border-top-style", "border-top-color", "border-top-width", c6349u42);
                    c6343lr.m25962k4(interfaceC5808uz.mo8443kk(), "border-right-style", "border-right-color", "border-right-width", c6349u42);
                    c6343lr.m25962k4(interfaceC5808uz.mo8443kk(), "border-bottom-style", "border-bottom-color", "border-bottom-width", c6349u42);
                }
                if (interfaceC12769ixM25960k4.mo22698c5("rules")) {
                    String strMo22721to2 = interfaceC12769ixM25960k4.mo22721to("rules");
                    if (!C14113y2.m67411k4(strMo22721to2)) {
                        String str7 = "1";
                        switch (f18032h4.m27428k4(strMo22721to2)) {
                            case 11:
                                str5 = "inset";
                                str4 = "none";
                                break;
                            case 12:
                                str6 = "1";
                                str7 = "0";
                                break;
                            case 13:
                            default:
                                str4 = "none";
                                str7 = "0";
                                break;
                            case 14:
                                str6 = "1";
                                str5 = "inset";
                                break;
                        }
                        int i3 = c6343lr.f18037to;
                        if (i3 != 0) {
                            if (i3 == 1) {
                                c6349u42.mo23669k4("border-left-width", str6, (String) null);
                                c6349u42.mo23669k4("border-left-style", str4, (String) null);
                            } else if (i3 == 2) {
                                str2 = null;
                                c6349u42.mo23669k4("border-left-width", str6, (String) null);
                                c6349u42.mo23669k4("border-left-style", str4, (String) null);
                            }
                            i = c6343lr.f18036kk;
                            if (i == 0) {
                                if (i == 1) {
                                    str3 = null;
                                } else if (i == 2) {
                                    str3 = null;
                                    c6349u42.mo23669k4("border-bottom-width", str7, (String) null);
                                    c6349u42.mo23669k4("border-bottom-style", str5, (String) null);
                                }
                                c6349u42.mo23669k4("border-top-width", str7, str3);
                                c6349u42.mo23669k4("border-top-style", str5, str3);
                            } else {
                                c6349u42.mo23669k4("border-bottom-width", str7, (String) null);
                                c6349u42.mo23669k4("border-bottom-style", str5, (String) null);
                            }
                        } else {
                            str2 = null;
                        }
                        c6349u42.mo23669k4("border-right-width", str6, str2);
                        c6349u42.mo23669k4("border-right-style", str4, str2);
                        i = c6343lr.f18036kk;
                        if (i == 0) {
                        }
                    }
                }
                if (interfaceC12769ixM25960k4.mo22698c5("bordercolor")) {
                    String strMo22721to3 = interfaceC12769ixM25960k4.mo22721to("bordercolor");
                    if (!C14113y2.m67411k4(strMo22721to3)) {
                        C12385to c12385toM57989x1 = f18033x1.m57989x1(strMo22721to3);
                        if (c12385toM57989x1.mo58006to()) {
                            strMo22721to3 = C14113y2.m67408k4("#", c12385toM57989x1.mo57995kk());
                        }
                        c6349u42.mo23669k4("border-color", strMo22721to3, (String) null);
                        c6349u42.mo23669k4("border-style", "solid", (String) null);
                    }
                }
                if (interfaceC12769ixM25960k4.mo22698c5("cellpadding")) {
                    String strMo22721to4 = interfaceC12769ixM25960k4.mo22721to("cellpadding");
                    if (!C14113y2.m67411k4(strMo22721to4)) {
                        c6349u42.mo23669k4("padding", strMo22721to4, (String) null);
                    }
                }
            }
            c6343lr = this;
            if (interfaceC12769ixM25960k4.mo22698c5("rules")) {
            }
            if (interfaceC12769ixM25960k4.mo22698c5("bordercolor")) {
            }
            if (interfaceC12769ixM25960k4.mo22698c5("cellpadding")) {
            }
        }
        if (interfaceC12769ix.mo22698c5("align")) {
            String strMo22721to5 = interfaceC12769ix.mo22721to("align");
            if (!C14113y2.m67411k4(strMo22721to5)) {
                c6349u42.mo23669k4("text-align", strMo22721to5, (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5("valign")) {
            String strMo22721to6 = interfaceC12769ix.mo22721to("valign");
            if (C14113y2.m67411k4(strMo22721to6)) {
                str = null;
            } else {
                str = null;
                c6349u42.mo23669k4("vertical-align", strMo22721to6, (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5("width")) {
            String strMo22721to7 = interfaceC12769ix.mo22721to("width");
            if (!C14113y2.m67411k4(strMo22721to7)) {
                c6349u42.mo23669k4("width", strMo22721to7, str);
            }
        }
        if (interfaceC12769ix.mo22698c5("height")) {
            String strMo22721to8 = interfaceC12769ix.mo22721to("height");
            if (!C14113y2.m67411k4(strMo22721to8)) {
                c6349u42.mo23669k4("height", strMo22721to8, str);
            }
        }
        if (interfaceC12769ix.mo22698c5("bgcolor")) {
            String strMo22721to9 = interfaceC12769ix.mo22721to("bgcolor");
            if (C14113y2.m67411k4(strMo22721to9)) {
                return;
            }
            C12385to c12385toM57989x12 = f18033x1.m57989x1(strMo22721to9);
            if (c12385toM57989x12.mo58006to()) {
                strMo22721to9 = C14113y2.m67408k4("#", c12385toM57989x12.mo57995kk());
            }
            c6349u42.mo23669k4("background-color", strMo22721to9, (String) null);
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m25958dy(InterfaceC12769ix interfaceC12769ix, C6349u4 c6349u4) {
        if (interfaceC12769ix.mo22698c5("align")) {
            String strMo22721to = interfaceC12769ix.mo22721to("align");
            if (C14113y2.m67411k4(strMo22721to)) {
                return;
            }
            c6349u4.mo23669k4("float", strMo22721to, (String) null);
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m25959h4(InterfaceC12769ix interfaceC12769ix, C6349u4 c6349u4) {
        if (interfaceC12769ix.mo22698c5("bgcolor")) {
            String strMo22721to = interfaceC12769ix.mo22721to("bgcolor");
            if (C14113y2.m67411k4(strMo22721to)) {
                return;
            }
            C12385to c12385toM57989x1 = f18033x1.m57989x1(strMo22721to);
            if (c12385toM57989x1.mo58006to()) {
                strMo22721to = C14113y2.m67408k4("#", c12385toM57989x1.mo57995kk());
            }
            c6349u4.mo23669k4("background-color", strMo22721to, (String) null);
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m25964kk(InterfaceC12769ix interfaceC12769ix, C6349u4 c6349u4) {
        if (interfaceC12769ix.mo22698c5("color")) {
            String strMo22721to = interfaceC12769ix.mo22721to("color");
            if (!C14113y2.m67411k4(strMo22721to)) {
                C12385to c12385toM57989x1 = f18033x1.m57989x1(strMo22721to);
                if (c12385toM57989x1.mo58006to()) {
                    strMo22721to = C14113y2.m67408k4("#", c12385toM57989x1.mo57995kk());
                }
                c6349u4.mo23669k4("color", strMo22721to, (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5("size")) {
            String strMo22721to2 = interfaceC12769ix.mo22721to("size");
            if (!C14113y2.m67411k4(strMo22721to2)) {
                try {
                    AbstractC5803to abstractC5803to = (AbstractC5803to) new C9926m9().m48872k4(strMo22721to2);
                    strMo22721to2 = m25961k4((strMo22721to2.charAt(0) == '-' || strMo22721to2.charAt(0) == '+') ? C7019kk.m27462to(Float.valueOf(abstractC5803to.mo23699k4((short) 1)), 13) + 3 : C7019kk.m27462to(Float.valueOf(abstractC5803to.mo23699k4((short) 1)), 13));
                } catch (C9930to unused) {
                }
                c6349u4.mo23669k4("font-size", strMo22721to2, (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5(OptionalModuleUtils.FACE)) {
            String strMo22721to3 = interfaceC12769ix.mo22721to(OptionalModuleUtils.FACE);
            if (C14113y2.m67411k4(strMo22721to3)) {
                return;
            }
            c6349u4.mo23669k4("font-family", strMo22721to3, (String) null);
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m25965m9(InterfaceC12769ix interfaceC12769ix, C6349u4 c6349u4) {
        if (interfaceC12769ix.mo22698c5("align")) {
            String strMo22721to = interfaceC12769ix.mo22721to("align");
            if (C14113y2.m67411k4(strMo22721to)) {
                return;
            }
            c6349u4.mo23669k4("text-align", strMo22721to, (String) null);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m25966to(InterfaceC12769ix interfaceC12769ix, C6349u4 c6349u4) {
        if (interfaceC12769ix.mo22698c5("width")) {
            String strMo22721to = interfaceC12769ix.mo22721to("width");
            if (!C14113y2.m67411k4(strMo22721to)) {
                c6349u4.mo23669k4("width", strMo22721to, (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5("border")) {
            String strMo22721to2 = interfaceC12769ix.mo22721to("border");
            if (!C14113y2.m67411k4(strMo22721to2)) {
                int[] iArr = {0};
                boolean zM66590k4 = C14057f9.m66590k4(strMo22721to2, iArr);
                int i = iArr[0];
                if (!zM66590k4) {
                    i = 1;
                }
                c6349u4.mo23669k4("border-width", C14113y2.m67408k4(C14057f9.m66591x1(i), "px"), (String) null);
                c6349u4.mo23669k4("border-style", "outset", (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5("rules")) {
            String strMo22721to3 = interfaceC12769ix.mo22721to("rules");
            if (!C14113y2.m67411k4(strMo22721to3) && this.f18034du.containsItem(strMo22721to3)) {
                c6349u4.mo23669k4("border-collapse", "collapse", (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5("bgcolor")) {
            String strMo22721to4 = interfaceC12769ix.mo22721to("bgcolor");
            if (!C14113y2.m67411k4(strMo22721to4)) {
                C12385to c12385toM57989x1 = f18033x1.m57989x1(strMo22721to4);
                if (c12385toM57989x1.mo58006to()) {
                    strMo22721to4 = C14113y2.m67408k4("#", c12385toM57989x1.mo57995kk());
                }
                c6349u4.mo23669k4("background-color", strMo22721to4, (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5("bordercolor")) {
            String strMo22721to5 = interfaceC12769ix.mo22721to("bordercolor");
            if (!C14113y2.m67411k4(strMo22721to5)) {
                C12385to c12385toM57989x12 = f18033x1.m57989x1(strMo22721to5);
                if (c12385toM57989x12.mo58006to()) {
                    strMo22721to5 = C14113y2.m67408k4("#", c12385toM57989x12.mo57995kk());
                }
                c6349u4.mo23669k4("border-color", strMo22721to5, (String) null);
                c6349u4.mo23669k4("border-style", "solid", (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5("align")) {
            String strMo22721to6 = interfaceC12769ix.mo22721to("align");
            if (!C14113y2.m67411k4(strMo22721to6) && "center".equals(C14113y2.m67368h4(strMo22721to6))) {
                c6349u4.mo23669k4("margin", "0px auto", (String) null);
            }
        }
        if (interfaceC12769ix.mo22698c5("cellspacing")) {
            String strMo22721to7 = interfaceC12769ix.mo22721to("cellspacing");
            if (!C14113y2.m67411k4(strMo22721to7)) {
                c6349u4.mo23669k4("border-spacing", strMo22721to7, (String) null);
            }
        }
        if (interfaceC12769ix.mo22646kp() != null && interfaceC12769ix.mo22646kp().mo22608fa() == 1) {
            InterfaceC12769ix interfaceC12769ix2 = (InterfaceC12769ix) interfaceC12769ix.mo22646kp();
            if (("DIV".equals(interfaceC12769ix2.mo22700du()) || "TD".equals(interfaceC12769ix2.mo22700du())) && interfaceC12769ix2.mo22698c5("align")) {
                String strMo22721to8 = interfaceC12769ix2.mo22721to("align");
                if (!C14113y2.m67411k4(strMo22721to8) && "center".equals(C14113y2.m67368h4(strMo22721to8))) {
                    c6349u4.mo23669k4("margin-left", "auto", (String) null);
                    c6349u4.mo23669k4("margin-right", "auto", (String) null);
                }
            }
        }
        if (interfaceC12769ix.mo22698c5("dir")) {
            String strMo22721to9 = interfaceC12769ix.mo22721to("dir");
            if (C14113y2.m67411k4(strMo22721to9)) {
                return;
            }
            if ("rtl".equals(strMo22721to9) || "ltr".equals(strMo22721to9)) {
                c6349u4.mo23669k4(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, strMo22721to9, (String) null);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m25967x1(InterfaceC12769ix interfaceC12769ix, C6349u4 c6349u4) {
        if (interfaceC12769ix.mo22698c5("href")) {
            c6349u4.mo23669k4("color", "blue", (String) null);
            c6349u4.mo23669k4("text-decoration", "underline", (String) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C6349u4 m25968k4(InterfaceC12769ix interfaceC12769ix) {
        C6349u4 c6349u4 = new C6349u4(this.f18035k4);
        switch (f18032h4.m27428k4(interfaceC12769ix.mo22700du())) {
            case 0:
                m25967x1(interfaceC12769ix, c6349u4);
                break;
            case 1:
            case 2:
                m25964kk(interfaceC12769ix, c6349u4);
                break;
            case 3:
                m25958dy(interfaceC12769ix, c6349u4);
                break;
            case 4:
                m25966to(interfaceC12769ix, c6349u4);
                break;
            case 5:
            case 6:
                if (interfaceC12769ix.mo22195u4() != null && interfaceC12769ix.mo22194ix() == null) {
                    this.f18037to = 0;
                } else if (interfaceC12769ix.mo22195u4() == null && interfaceC12769ix.mo22194ix() == null) {
                    this.f18037to = 3;
                } else if (interfaceC12769ix.mo22195u4() != null || interfaceC12769ix.mo22194ix() == null) {
                    this.f18037to = 2;
                } else {
                    this.f18037to = 1;
                }
                m25957du(interfaceC12769ix, c6349u4);
                break;
            case 7:
                if (interfaceC12769ix.mo22195u4() != null && interfaceC12769ix.mo22194ix() == null) {
                    this.f18036kk = 0;
                } else if (interfaceC12769ix.mo22195u4() == null && interfaceC12769ix.mo22194ix() == null) {
                    this.f18036kk = 3;
                } else if (interfaceC12769ix.mo22195u4() != null || interfaceC12769ix.mo22194ix() == null) {
                    this.f18036kk = 2;
                } else {
                    this.f18036kk = 1;
                }
                m25959h4(interfaceC12769ix, c6349u4);
                break;
            case 8:
            case 9:
            case 10:
                m25965m9(interfaceC12769ix, c6349u4);
                break;
            default:
                m25963k4(interfaceC12769ix, c6349u4);
                break;
        }
        return c6349u4;
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC12769ix m25960k4(InterfaceC12769ix interfaceC12769ix, String str, int i) {
        while (i > 0 && interfaceC12769ix.mo22646kp() != null && interfaceC12769ix.mo22646kp().mo22608fa() == 1) {
            interfaceC12769ix = (InterfaceC12769ix) interfaceC12769ix.mo22646kp();
            if (C14113y2.m67363du(interfaceC12769ix.mo22700du(), str)) {
                return interfaceC12769ix;
            }
            i--;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m25961k4(int i) {
        switch (i) {
            case 1:
                return "xx-small";
            case 2:
                return "small";
            case 3:
                return "medium";
            case 4:
                return "large";
            case 5:
                return "x-large";
            case 6:
                return "xx-large";
            default:
                if (i < 1) {
                    return "small";
                }
            case 7:
                return "xxx-large";
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25962k4(InterfaceC5810wl interfaceC5810wl, String str, String str2, String str3, C6349u4 c6349u4) {
        AbstractC5788h4 abstractC5788h4Mo23672wt = interfaceC5810wl.mo23672wt(str);
        if (abstractC5788h4Mo23672wt != null) {
            c6349u4.m26036k4(str, abstractC5788h4Mo23672wt, false);
            AbstractC5788h4 abstractC5788h4Mo23672wt2 = interfaceC5810wl.mo23672wt(str2);
            if (abstractC5788h4Mo23672wt2 != null) {
                c6349u4.m26036k4(str2, abstractC5788h4Mo23672wt2, false);
            }
            AbstractC5788h4 abstractC5788h4Mo23672wt3 = interfaceC5810wl.mo23672wt(str3);
            if (abstractC5788h4Mo23672wt3 != null) {
                c6349u4.m26036k4(str3, abstractC5788h4Mo23672wt3, false);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25963k4(InterfaceC12769ix interfaceC12769ix, C6349u4 c6349u4) {
        if (interfaceC12769ix.mo22698c5("dir")) {
            String strMo22721to = interfaceC12769ix.mo22721to("dir");
            if (C14113y2.m67411k4(strMo22721to)) {
                return;
            }
            c6349u4.mo23669k4(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, strMo22721to, (String) null);
        }
    }
}
