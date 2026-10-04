package com.aspose.slides.internal.p077d8;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.BuildVersionInfo;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18340r9;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.bv */
/* JADX INFO: loaded from: classes3.dex */
public final class C3038bv {

    /* JADX INFO: renamed from: h4 */
    private static C3038bv f8908h4;

    /* JADX INFO: renamed from: m9 */
    private static ArrayList f8909m9;

    /* JADX INFO: renamed from: du */
    private Date f8910du;

    /* JADX INFO: renamed from: dy */
    private byte[] f8911dy = C3095v4.f9210k4;

    /* JADX INFO: renamed from: k4 */
    private String[] f8912k4;

    /* JADX INFO: renamed from: kk */
    private String f8913kk;

    /* JADX INFO: renamed from: to */
    private Date f8914to;

    /* JADX INFO: renamed from: x1 */
    private int[] f8915x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.d8.bv$k4 */
    public interface k4 {

        /* JADX INFO: renamed from: k4 */
        public static final int[] f8928k4 = C3049em.f9034m9;

        /* JADX INFO: renamed from: x1 */
        public static final int[] f8929x1 = C3049em.f9016dy;
    }

    /* JADX INFO: renamed from: du */
    public static final String m12789du() {
        return "24.6";
    }

    /* JADX INFO: renamed from: k4 */
    public static final String m12790k4(String str) {
        return (str == null || 5 >= str.length()) ? str : C14113y2.m67408k4(C14113y2.m67443x1(str, 0, 5), C3076nv.m13017k4(C3049em.f9060x1));
    }

    /* JADX INFO: renamed from: kk */
    private static Date m12794kk(String str) {
        if (str.equals("")) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(4, 6)) - 1, Integer.parseInt(str.substring(6, 8)));
        return calendar.getTime();
    }

    /* JADX INFO: renamed from: to */
    private static int[] m12797to(String str) {
        if (C3076nv.m13017k4(C3049em.f9010c5).equals(str)) {
            return k4.f8928k4;
        }
        if (C3076nv.m13017k4(C3049em.f9027jd).equals(str)) {
            return k4.f8929x1;
        }
        new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.13
        }.m13060k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.11
        }.f8889dy);
        return new int[0];
    }

    /* JADX INFO: renamed from: x1 */
    private static String m12799x1(String str) {
        return (str.equals(C3076nv.m13017k4(C3049em.f9047tq)) || str.equals(C3076nv.m13017k4(C3049em.f9026j2))) ? C3076nv.m13017k4(C3049em.f9054vh) : str.equals(C3076nv.m13017k4(C3049em.f9039qw)) ? C3076nv.m13017k4(C3049em.f9054vh) : str.equals(C3076nv.m13017k4(C3049em.f9058wp)) ? C3076nv.m13017k4(C3049em.f9043ss) : str;
    }

    /* JADX INFO: renamed from: kk */
    public static final void m12795kk() {
        new C3038bv().m12801k4((InputStream) null);
    }

    /* JADX INFO: renamed from: to */
    public static final String[] m12798to() {
        return new String[]{AbstractC6747ar.m26635ix().m26681x1(new byte[]{69, 118, 97, 108, 117, 97, 116, 105, 111, 110, 32, 111, 110, 108, 121, PatternStyle.Divot}), C14113y2.m67408k4(AbstractC6747ar.m26635ix().m26681x1(new byte[]{67, 114, 101, 97, 116, 101, 100, 32, 119, 105, 116, 104, 32}), BuildVersionInfo.Product, " ", "24.6", "."), C14113y2.m67408k4(AbstractC6747ar.m26635ix().m26681x1(new byte[]{67, 111, 112, 121, 114, 105, 103, 104, 116, 32, PatternStyle.Vertical, PatternStyle.Wave, PatternStyle.Wave, PatternStyle.DownwardDiagonal, PatternStyle.DottedGrid}), C14113y2.m67408k4(C14113y2.m67443x1("2024.06.30", 0, 4), " "), AbstractC6747ar.m26635ix().m26681x1(new byte[]{65, 115, 112, 111, 115, 101, 32, 80, 116, 121, 32, 76, 116, 100, PatternStyle.Divot}))};
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12801k4(InputStream inputStream) {
        if (inputStream == null) {
            this.f8911dy = C3095v4.f9210k4;
            f8908h4 = null;
            C3092um.m13136k4(null);
            return;
        }
        m12802x1(inputStream);
        if (f8909m9 == null) {
            m12792k4(m12803x1());
        }
        for (int i = 0; i < f8909m9.size(); i++) {
            if (f8909m9.get(i).equals(this.f8913kk)) {
                new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.12
                }.m13060k4(C14113y2.m67402k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.1
                }.f8892jd, m12800x1(m12803x1()) ? C3076nv.m13017k4(C3049em.f9030kk) : C3076nv.m13017k4(C3049em.f9046to)));
            }
        }
        m12796kk(this.f8912k4);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt("2024"), Integer.parseInt("06") - 1, Integer.parseInt(PublicApiId.MULTIPLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_WITH_PARAMETERS));
        Date time = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = this.f8914to;
        if (date != null && time.after(date)) {
            new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.15
            }.m13060k4(C14113y2.m67402k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.14
            }.f8891h4, simpleDateFormat.format(this.f8914to), simpleDateFormat.format(time)));
        }
        if (this.f8910du != null && new Date().after(this.f8910du)) {
            if (this.f8910du.getTime() != C18340r9.f56029a && this.f8910du.getYear() >= 2099) {
                return;
            } else {
                new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.17
                }.m13060k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.16
                }.f8894m9);
            }
        }
        this.f8911dy = C3095v4.f9211x1;
        f8908h4 = this;
        C3092um.m13136k4(this);
    }

    /* JADX INFO: renamed from: x1 */
    public void m12802x1(InputStream inputStream) {
        try {
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement();
            Element elementM12967k4 = C3069lr.m12967k4(documentElement, "Data");
            Element elementM12967k42 = C3069lr.m12967k4(documentElement, RequestParameters.SIGNATURE);
            NodeList elementsByTagName = C3069lr.m12967k4(elementM12967k4, "Products").getElementsByTagName("Product");
            this.f8912k4 = new String[elementsByTagName.getLength()];
            int i = 0;
            while (true) {
                String[] strArr = this.f8912k4;
                if (i >= strArr.length) {
                    m12791k4(elementM12967k4, elementM12967k42, strArr);
                    this.f8915x1 = m12797to(C3069lr.m12968x1(elementM12967k4, "EditionType"));
                    this.f8913kk = C3069lr.m12968x1(elementM12967k4, "SerialNumber");
                    this.f8914to = m12794kk(C3069lr.m12968x1(elementM12967k4, "SubscriptionExpiry"));
                    this.f8910du = m12794kk(C3069lr.m12968x1(elementM12967k4, "LicenseExpiry"));
                    return;
                }
                strArr[i] = m12799x1(elementsByTagName.item(i).getFirstChild().getNodeValue());
                i++;
            }
        } catch (Exception e) {
            new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.19
            }.m13061k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.18
            }.f8886c5, e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m12791k4(Node node, Node node2, String[] strArr) {
        String strM12966k4;
        if (node != null) {
            try {
                strM12966k4 = C3069lr.m12966k4(node);
            } catch (Exception e) {
                new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.4
                }.m13061k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.3
                }.f8895to, e);
                return;
            }
        } else {
            strM12966k4 = "";
        }
        byte[] bytes = strM12966k4.getBytes("UTF-16LE");
        byte[] bArrM12942k4 = C3056h4.m12942k4(node2 != null ? node2.getFirstChild().getNodeValue() : "");
        if (C3077os.m13018k4(C3056h4.m12942k4(m12800x1(strArr) ? C3043ck.m12832x1(bArrM12942k4) : C3043ck.m12831k4(bArrM12942k4)), C3056h4.m12942k4(C3076nv.m13017k4(C3049em.f9053v4)), bytes, bArrM12942k4)) {
            return;
        }
        new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.2
        }.m13060k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.20
        }.f8895to);
    }

    /* JADX INFO: renamed from: kk */
    private static void m12796kk(String[] strArr) {
        String str = C3103x1.f9223k4;
        if (str != null) {
            for (int i = 0; i < strArr.length; i++) {
                if (str.equals(strArr[i]) || C3076nv.m13017k4(C3049em.f9015du).equals(strArr[i]) || C3076nv.m13017k4(C3049em.f9023h4).equals(strArr[i])) {
                    return;
                }
            }
        }
        String strM13017k4 = C3076nv.m13017k4(C3049em.f9008bv);
        if (strM13017k4 != null) {
            for (String str2 : strArr) {
                if (strM13017k4.equals(str2)) {
                    return;
                }
            }
        }
        new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.10
        }.m13060k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.9
        }.f8888du);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m12800x1(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(C3076nv.m13017k4(C3049em.f9023h4)) || strArr[i].equals(C3076nv.m13017k4(C3049em.f9015du))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m12792k4(String[] strArr) {
        try {
            f8909m9 = new ArrayList();
            InputStream inputStream = (m12800x1(strArr) ? C5133k4.m21998k4("resources", C3076nv.m13017k4(C3049em.f9063xw) + ".xml") : C5133k4.m21998k4("resources", C3076nv.m13017k4(C3049em.f9055vj) + ".xml")).toInputStream();
            if (inputStream == null) {
                new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.6
                }.m13060k4(C14113y2.m67402k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.5
                }.f8890fa, m12800x1(strArr) ? C3076nv.m13017k4(C3049em.f9030kk) : C3076nv.m13017k4(C3049em.f9046to)));
            }
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement();
            Element elementM12967k4 = C3069lr.m12967k4(documentElement, "Data");
            m12791k4(elementM12967k4, C3069lr.m12967k4(documentElement, RequestParameters.SIGNATURE), strArr);
            NodeList elementsByTagName = elementM12967k4.getElementsByTagName("SN");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                f8909m9.add(elementsByTagName.item(i).getFirstChild().getNodeValue());
            }
        } catch (Exception e) {
            new C3082rv() { // from class: com.aspose.slides.internal.d8.bv.8
            }.m13061k4(C14113y2.m67402k4(new C3033ak() { // from class: com.aspose.slides.internal.d8.bv.7
            }.f8887ck, m12800x1(strArr) ? C3076nv.m13017k4(C3049em.f9030kk) : C3076nv.m13017k4(C3049em.f9046to)), e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public String[] m12803x1() {
        return this.f8912k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static final byte[] m12793k4() {
        C3038bv c3038bv = f8908h4;
        boolean z = c3038bv == null || c3038bv.f8911dy == C3095v4.f9210k4 || C3102wz.m13206x1() == 4096;
        if (C3041c6.m12809k4() != null) {
            return (z && (C3041c6.m12821x1() == C3052g8.f9069k4)) ? C3095v4.f9210k4 : C3095v4.f9211x1;
        }
        return null;
    }
}
