package com.aspose.slides.internal.p136fr;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3184h4;
import com.aspose.slides.internal.p087dm.C3185jd;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p400sk.C10229k4;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: com.aspose.slides.internal.fr.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4116x1 {

    /* JADX INFO: renamed from: k4 */
    public static final C12380dy f11285k4 = new C12380dy("\\s*(normal|italic|oblique)?\\s*(normal|small\\-caps)?\\s*(normal|bold|100|200|300|400|500|600|700|800|900)?\\s*(\\d+(px|%|pt|em|mm|in|cm)?)?\\s*(/+normal|\\d+(px|%|pt|em|mm|in|cm)?)?\\s*(([^,]*(\\s|,)*)*);?", 74);

    /* JADX INFO: renamed from: k4 */
    public static C3185jd m16477k4(String str) {
        C3185jd c3185jd = new C3185jd();
        String strM67401k4 = C14113y2.m67401k4(str, "xlink:href", "xlinkhref");
        try {
            C3181c5 c3181c5 = new C3181c5("root", new C3187kk(), null);
            c3185jd.f9466h4 = c3181c5;
            C13938ms c13938ms = new C13938ms(new C3144um(C14113y2.m67440x1(C14113y2.m67443x1(strM67401k4, C14113y2.m67364dy(strM67401k4, "<svg"), strM67401k4.length() - C14113y2.m67364dy(strM67401k4, "<svg")))));
            Stack stack = new Stack();
            stack.push(c3181c5);
            while (c13938ms.mo65026h4()) {
                Dictionary dictionary = new Dictionary();
                if (c13938ms.mo65209lr()) {
                    String strMo65046to = C14113y2.f47374k4;
                    while (c13938ms.mo65047to()) {
                        if ("xlinkhref".equals(c13938ms.mo65019ck())) {
                            dictionary.addItem("xlink:href", c13938ms.mo65042rv());
                        } else if ("style".equals(c13938ms.mo65019ck())) {
                            strMo65046to = c13938ms.mo65046to("style");
                        } else {
                            dictionary.addItem(c13938ms.mo65019ck(), c13938ms.mo65042rv());
                        }
                    }
                    if (!C14113y2.m67411k4(strMo65046to)) {
                        m16478k4(dictionary, strMo65046to);
                    }
                    c13938ms.mo65020du();
                }
                if (c13938ms.mo65028jd() == 3 || c13938ms.mo65028jd() == 4 || c13938ms.mo65028jd() == 13) {
                    C10229k4 c10229k4 = new C10229k4();
                    c10229k4.f9461x1 = new C3187kk(dictionary);
                    c10229k4.f9457k4 = (C3181c5) stack.peek();
                    c10229k4.f36669dy = c13938ms.mo65042rv();
                    if (c13938ms.mo65019ck() != null && !C14113y2.m67363du(c13938ms.mo65019ck(), "svg") && stack.peek() != null) {
                        ((C3181c5) stack.peek()).m13628ar().m13699k4(((C3181c5) stack.peek()).m13628ar().m13697k4(), c10229k4);
                    }
                }
                if (c13938ms.mo65028jd() == 1) {
                    C3181c5 c3181c5M13677k4 = C3184h4.m13677k4(c13938ms.mo65023fa());
                    c3181c5M13677k4.f9461x1 = new C3187kk(dictionary);
                    c3181c5M13677k4.f9457k4 = (C3181c5) stack.peek();
                    ((C3181c5) stack.peek()).m13628ar().m13699k4(((C3181c5) stack.peek()).m13628ar().m13697k4(), c3181c5M13677k4);
                    if (!c13938ms.mo65048u4()) {
                        stack.push(c3181c5M13677k4);
                    }
                } else if (c13938ms.mo65028jd() == 15 && C14113y2.m67363du(c13938ms.mo65023fa(), ((C3181c5) stack.peek()).f9456h4)) {
                    stack.pop();
                }
            }
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
        return c3185jd;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16478k4(Dictionary<String, String> dictionary, String str) {
        String strM67440x1 = C14113y2.f47374k4;
        for (String str2 : C14113y2.m67417k4(str, new String[]{";", "\r", IOUtils.LINE_SEPARATOR_UNIX, "\t"}, 1)) {
            String[] strArrM67417k4 = C14113y2.m67417k4(str2, new String[]{C18241k5.f55433h}, 1);
            if (strArrM67417k4.length >= 2) {
                if ("font".equals(C14113y2.m67368h4(strArrM67417k4[0]))) {
                    Matcher matcher = C12380dy.m57975k4(f11285k4).matcher(strArrM67417k4[1]);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null && ("italic".equals(strGroup) || "oblique".equals(strGroup))) {
                            if (dictionary.containsKey("font-style")) {
                                dictionary.removeItemByKey(strM67440x1);
                            }
                            dictionary.addItem("font-style", strGroup);
                        }
                        String strGroup2 = matcher.group(3);
                        if (strGroup2 != null) {
                            if (dictionary.containsKey("font-weight")) {
                                dictionary.removeItemByKey(strM67440x1);
                            }
                            dictionary.addItem("font-weight", strGroup2);
                        }
                        String strGroup3 = matcher.group(4);
                        if (strGroup3 != null) {
                            if (dictionary.containsKey("font-size")) {
                                dictionary.removeItemByKey(strM67440x1);
                            }
                            dictionary.addItem("font-size", strGroup3);
                        }
                        String strGroup4 = matcher.group(8);
                        if (strGroup4 != null) {
                            if (dictionary.containsKey("font-family")) {
                                dictionary.removeItemByKey(strM67440x1);
                            }
                            dictionary.addItem("font-family", strGroup4);
                        }
                    }
                } else {
                    strM67440x1 = C14113y2.m67440x1(strArrM67417k4[0]);
                    String strM67440x12 = C14113y2.m67440x1(strArrM67417k4[1]);
                    if (dictionary.containsKey(strM67440x1)) {
                        dictionary.removeItemByKey(strM67440x1);
                    }
                    dictionary.addItem(strM67440x1, strM67440x12);
                }
            }
        }
    }
}
