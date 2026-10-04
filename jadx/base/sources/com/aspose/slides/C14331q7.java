package com.aspose.slides;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p118ex.C3823m9;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4718gk;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.AbstractC4765wz;
import com.aspose.slides.internal.p174hz.AbstractC4777yo;
import com.aspose.slides.internal.p238kt.C5937j2;
import com.aspose.slides.internal.p238kt.C5946m2;
import com.aspose.slides.internal.p238kt.C5984zj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p307nz.C6964k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7408ci;
import com.aspose.slides.internal.p332p7.C7712fy;
import com.aspose.slides.internal.p332p7.C7761gh;
import com.aspose.slides.internal.p332p7.C8276mo;
import com.aspose.slides.internal.p332p7.C8399o0;
import com.aspose.slides.internal.p332p7.C8771sh;
import com.aspose.slides.internal.p332p7.C8870ti;
import com.aspose.slides.internal.p332p7.C8941uc;
import com.aspose.slides.internal.p332p7.C9354za;
import com.aspose.slides.internal.p332p7.afk;
import com.aspose.slides.internal.p332p7.eg4;
import com.aspose.slides.internal.p332p7.gql;
import com.aspose.slides.internal.p332p7.hgq;
import com.aspose.slides.internal.p332p7.kwh;
import com.aspose.slides.internal.p463vm.C11691kk;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11738ew;
import com.aspose.slides.internal.p464vq.C11767k5;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.microsoft.identity.client.internal.MsalUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.q7 */
/* JADX INFO: loaded from: classes3.dex */
class C14331q7 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48264k4 = new C7017h4("http://www.w3.org/2000/09/xmldsig#sha1", "http://www.w3.org/2001/04/xmlenc#sha256", "http://www.w3.org/2001/04/xmldsig-more#sha384", "http://www.w3.org/2001/04/xmlenc#sha512");

    /* JADX INFO: renamed from: k4 */
    private static AbstractC4705c6 m69441k4(String str) {
        int iM27428k4 = f48264k4.m27428k4(str);
        if (iM27428k4 == 0) {
            return AbstractC4739nv.m19710du();
        }
        if (iM27428k4 == 1) {
            return AbstractC4718gk.m19620du();
        }
        if (iM27428k4 == 2) {
            return AbstractC4777yo.m19835du();
        }
        if (iM27428k4 == 3) {
            return AbstractC4765wz.m19796du();
        }
        throw new NotImplementedException("Unknown hashing algorithm");
    }

    /* JADX INFO: renamed from: kk */
    private static void m69451kk(C7712fy c7712fy, String str) {
        C7408ci c7408ciM44903k4 = c7712fy.m32172kk().m44903k4();
        c7408ciM44903k4.m29627x1("#idSignedProperties");
        c7408ciM44903k4.m29622k4("http://uri.etsi.org/01903#SignedProperties");
        c7408ciM44903k4.m29625to().m32048k4("http://www.w3.org/2000/09/xmldsig#sha1");
        c7408ciM44903k4.m29624kk(str);
        c7408ciM44903k4.m29621k4().m41020k4().m37020k4("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
    }

    /* JADX INFO: renamed from: x1 */
    private static String m69452x1(String str) {
        List list = new List();
        list.addItem(0);
        for (int i = 0; i < str.length(); i++) {
            int iM67044x1 = C14080ne.m67044x1(C14117yj.m67537ne(str.charAt(i)), 16);
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = (((Integer) list.get_Item(i2)).intValue() * 16) + iM67044x1;
                list.set_Item(i2, Integer.valueOf(iIntValue % 10));
                iM67044x1 = iIntValue / 10;
            }
            while (iM67044x1 > 0) {
                list.addItem(Integer.valueOf(iM67044x1 % 10));
                iM67044x1 /= 10;
            }
        }
        list.reverse();
        List.Enumerator it = list.iterator();
        String strM67400k4 = "";
        while (it.hasNext()) {
            try {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14057f9.m66591x1(((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return strM67400k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C5984zj m69442k4(DigitalSignature digitalSignature, C7712fy c7712fy) {
        XmlDocument xmlDocument = new XmlDocument();
        C3152yj c3152yj = new C3152yj();
        try {
            C3059ii c3059ii = new C3059ii(c3152yj, AbstractC6747ar.m26635ix());
            c7712fy.mo6846k4("", c3059ii, RequestParameters.SIGNATURE);
            c3059ii.mo21896h4();
            c3152yj.setPosition(0L);
            xmlDocument.load(c3152yj);
            c3152yj.dispose();
            AbstractC13901ga abstractC13901gaM65457kk = xmlDocument.getDocumentElement().m65909kk("SignedInfo").m65457kk(0);
            AbstractC13901ga abstractC13901gaM65457kk2 = xmlDocument.getDocumentElement().m65909kk("SignatureValue").m65457kk(0);
            AbstractC13901ga abstractC13901gaM65457kk3 = xmlDocument.getDocumentElement().m65909kk("KeyInfo").m65457kk(0);
            if (abstractC13901gaM65457kk != null) {
                xmlDocument.getDocumentElement().removeChild(abstractC13901gaM65457kk);
            }
            if (abstractC13901gaM65457kk2 != null) {
                xmlDocument.getDocumentElement().removeChild(abstractC13901gaM65457kk2);
            }
            if (abstractC13901gaM65457kk3 != null) {
                xmlDocument.getDocumentElement().removeChild(abstractC13901gaM65457kk3);
            }
            C5984zj c5984zj = new C5984zj(xmlDocument);
            c5984zj.m24196k4(digitalSignature.m1326k4().m15327x6());
            C5937j2 c5937j2 = new C5937j2();
            c5937j2.m24021k4("#idPackageObject");
            c5937j2.m24028x1("http://www.w3.org/2000/09/xmldsig#Object");
            c5937j2.m24024kk("http://www.w3.org/2000/09/xmldsig#sha1");
            c5984zj.m24197k4(c5937j2);
            C5937j2 c5937j22 = new C5937j2();
            c5937j22.m24021k4("#idOfficeObject");
            c5937j22.m24028x1("http://www.w3.org/2000/09/xmldsig#Object");
            c5937j22.m24024kk("http://www.w3.org/2000/09/xmldsig#sha1");
            c5984zj.m24197k4(c5937j22);
            C5937j2 c5937j23 = new C5937j2();
            c5937j23.m24021k4("#idSignedProperties");
            c5937j23.m24028x1("http://uri.etsi.org/01903#SignedProperties");
            c5937j23.m24024kk("http://www.w3.org/2000/09/xmldsig#sha1");
            c5937j23.m24011du().m23892k4(new C5946m2());
            c5984zj.m24197k4(c5937j23);
            c5984zj.m24191c5();
            return c5984zj;
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69453x1(IDigitalSignature iDigitalSignature, C7712fy c7712fy) {
        afk afkVarM32527kk = c7712fy.m32174x1().m32527kk();
        afkVarM32527kk.m28206k4("#idPackageSignature");
        kwh kwhVarM28205k4 = afkVarM32527kk.m28205k4();
        kwhVarM28205k4.m35767k4("idSignedProperties");
        gql gqlVarM35766k4 = kwhVarM28205k4.m35766k4();
        DigitalSignature digitalSignature = (DigitalSignature) iDigitalSignature;
        gqlVarM35766k4.m32836k4(digitalSignature.m1330x1().m67151uz().m67140k4("yyyy-MM-ddTHH:mm:ssZ"));
        hgq hgqVarM32980k4 = gqlVarM35766k4.m32835k4().m32980k4();
        hgqVarM32980k4.m33341k4().m29756k4().m32048k4("http://www.w3.org/2000/09/xmldsig#sha1");
        hgqVarM32980k4.m33341k4().m29757k4(C14080ne.m66952k4(m69441k4(hgqVarM32980k4.m33341k4().m29756k4().m32047k4()).m19588x1(digitalSignature.m1326k4().m15315ix())));
        hgqVarM32980k4.m33342x1().m39637k4(digitalSignature.m1326k4().m15328yj().m15345kk());
        hgqVarM32980k4.m33342x1().m39638x1(m69452x1(digitalSignature.m1326k4().m15322u4()));
        gqlVarM35766k4.m32837x1().m34349k4("");
        eg4 eg4VarM42089k4 = kwhVarM28205k4.m35768x1().m42089k4();
        eg4VarM42089k4.m31071k4().m43631k4("http://uri.etsi.org/01903/v1.2.2#ProofOfOrigin");
        eg4VarM42089k4.m31071k4().m43632x1("");
        eg4VarM42089k4.m31072k4("");
    }

    /* JADX INFO: renamed from: k4 */
    private static String m69443k4(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < str2.length() && str.charAt(i) == str2.charAt(i)) {
            i++;
        }
        String strM67401k4 = C14113y2.m67401k4(C14113y2.m67396k4(str2, 0, C14113y2.m67430to(C14113y2.m67443x1(str, 0, i), "/") + 1), "_rels/", "");
        String strM67396k4 = C14113y2.m67396k4(str, 0, C14113y2.m67430to(C14113y2.m67443x1(str, 0, i), "/") + 1);
        for (int iM67364dy = C14113y2.m67364dy(strM67401k4, "/"); iM67364dy != -1; iM67364dy = C14113y2.m67378k4(strM67401k4, "/", iM67364dy + 1)) {
            strM67396k4 = C14113y2.m67408k4("../", strM67396k4);
        }
        return strM67396k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69454x1(C7712fy c7712fy, String str) {
        C7408ci c7408ciM44903k4 = c7712fy.m32172kk().m44903k4();
        c7408ciM44903k4.m29627x1("#idOfficeObject");
        c7408ciM44903k4.m29622k4("http://www.w3.org/2000/09/xmldsig#Object");
        c7408ciM44903k4.m29625to().m32048k4("http://www.w3.org/2000/09/xmldsig#sha1");
        c7408ciM44903k4.m29624kk(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69444k4(DigitalSignature digitalSignature, C7712fy c7712fy, C11785nh c11785nh) {
        digitalSignature.m1328k4(C14084qq.m67081jd().Clone());
        c7712fy.m32171k4("idPackageSignature");
        c7712fy.m32172kk().m44905x1().m40740k4("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
        c7712fy.m32172kk().m44904kk().m27890k4("http://www.w3.org/2000/09/xmldsig#rsa-sha1");
        C7761gh c7761ghM32174x1 = c7712fy.m32174x1();
        c7761ghM32174x1.m32526k4("idPackageObject");
        C8870ti c8870tiM40531k4 = c7761ghM32174x1.m32529x1().m40531k4();
        c8870tiM40531k4.m41733k4("idSignatureTime");
        c8870tiM40531k4.m41737x1("#idPackageSignature");
        c8870tiM40531k4.m41732k4();
        c8870tiM40531k4.m41735to().m46015k4("YYYY-MM-DDThh:mm:ssTZD");
        c8870tiM40531k4.m41735to().m46017x1(digitalSignature.m1330x1().m67151uz().m67140k4("yyyy-MM-ddTHH:mm:ssZ"));
        if (c11785nh != null) {
            m69449k4(c11785nh, c7761ghM32174x1.m32525k4());
        }
        m69447k4((IDigitalSignature) digitalSignature, c7712fy);
        m69453x1(digitalSignature, c7712fy);
        C13981tl c13981tlM24193dy = m69442k4(digitalSignature, c7712fy).m24193dy();
        C13950o3 c13950o3 = new C13950o3(c13981tlM24193dy.getOwnerDocument().getNameTable());
        c13950o3.mo65707k4("dsig", "http://www.w3.org/2000/09/xmldsig#");
        String innerText = c13981tlM24193dy.selectSingleNode("dsig:SignedInfo//dsig:Reference[@URI='#idPackageObject']//dsig:DigestValue", c13950o3).getInnerText();
        String innerText2 = c13981tlM24193dy.selectSingleNode("dsig:SignedInfo//dsig:Reference[@URI='#idOfficeObject']//dsig:DigestValue", c13950o3).getInnerText();
        String innerText3 = c13981tlM24193dy.selectSingleNode("dsig:SignedInfo//dsig:Reference[@URI='#idSignedProperties']//dsig:DigestValue", c13950o3).getInnerText();
        String innerText4 = c13981tlM24193dy.selectSingleNode("dsig:SignatureValue", c13950o3).getInnerText();
        m69448k4(c7712fy, innerText);
        m69454x1(c7712fy, innerText2);
        m69451kk(c7712fy, innerText3);
        c7712fy.m32173to().m30005k4(innerText4);
        c7712fy.m32170k4().m30713k4().m35094k4(C14080ne.m66952k4(digitalSignature.m1326k4().m15315ix()));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m69455x1(DigitalSignature digitalSignature, C7712fy c7712fy, C11791os c11791os) {
        digitalSignature.m1327k4(new C3823m9(C14080ne.m66934jd(c7712fy.m32168du().m30714x1().m35093k4())));
        digitalSignature.m1329k4(false);
        for (C7761gh c7761gh : c7712fy.m32169h4()) {
            if ("idPackageObject".equals(c7761gh.m32528to())) {
                C8870ti[] c8870tiArrM40532x1 = c7761gh.m32524h4().m40532x1();
                int length = c8870tiArrM40532x1.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C8870ti c8870ti = c8870tiArrM40532x1[i];
                    if ("idSignatureTime".equals(c8870ti.m41734kk())) {
                        C14084qq c14084qq = new C14084qq();
                        C14084qq[] c14084qqArr = {c14084qq};
                        boolean zM67101k4 = C14084qq.m67101k4(c8870ti.m41735to().m46016x1(), "yyyy-MM-ddTHH:mm:ssZ", C11691kk.m55145um(), 64, c14084qqArr);
                        c14084qqArr[0].CloneTo(c14084qq);
                        if (zM67101k4) {
                            digitalSignature.m1328k4(c14084qq.Clone());
                        } else {
                            c14084qqArr[0] = c14084qq;
                            boolean zM67101k42 = C14084qq.m67101k4(c8870ti.m41735to().m46016x1(), c8870ti.m41735to().m46014k4(), C11691kk.m55145um(), 64, c14084qqArr);
                            c14084qqArr[0].CloneTo(c14084qq);
                            if (zM67101k42) {
                            }
                        }
                    } else {
                        i++;
                    }
                }
                if (c11791os != null && !m69450k4(c7761gh.m32523du().m37951x1(), (C11785nh) C7019kk.m27452k4((Object) c11791os.m55379yj(), C11785nh.class))) {
                    return false;
                }
            } else if ("idOfficeObject".equals(c7761gh.m32528to())) {
                C8870ti[] c8870tiArrM40532x12 = c7761gh.m32524h4().m40532x1();
                int length2 = c8870tiArrM40532x12.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length2) {
                        C8870ti c8870ti2 = c8870tiArrM40532x12[i2];
                        if ("idOfficeV1Details".equals(c8870ti2.m41734kk())) {
                            digitalSignature.setComments(c8870ti2.m41731du().m42298k4());
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69445k4(DigitalSignature digitalSignature, C7712fy c7712fy, C11791os c11791os) {
        if (!m69455x1(digitalSignature, c7712fy, c11791os) || c11791os == null) {
            return;
        }
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.load(c11791os.m55417h4());
        m69446k4(digitalSignature, (C13981tl) xmlDocument.getElementsByTagName(RequestParameters.SIGNATURE).m65457kk(0));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69446k4(DigitalSignature digitalSignature, C13981tl c13981tl) {
        C5984zj c5984zj = new C5984zj();
        c5984zj.m24198k4(c13981tl);
        if (c5984zj.m24200k4(digitalSignature.m1326k4(), true)) {
            digitalSignature.m1329k4(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69447k4(IDigitalSignature iDigitalSignature, C7712fy c7712fy) {
        C7761gh c7761ghM32174x1 = c7712fy.m32174x1();
        c7761ghM32174x1.m32526k4("idOfficeObject");
        C8870ti c8870tiM40531k4 = c7761ghM32174x1.m32529x1().m40531k4();
        c8870tiM40531k4.m41733k4("idOfficeV1Details");
        c8870tiM40531k4.m41737x1("#idPackageSignature");
        C8941uc c8941ucM41736x1 = c8870tiM40531k4.m41736x1();
        c8941ucM41736x1.m42299k4("http://schemas.microsoft.com/office/2006/digsig");
        c8941ucM41736x1.m42292du(iDigitalSignature.getComments());
        c8941ucM41736x1.m42306wl("http://www.w3.org/2000/09/xmldsig#sha1");
        c8941ucM41736x1.m42307x1("");
        c8941ucM41736x1.m42300kk("");
        c8941ucM41736x1.m42302to("");
        c8941ucM41736x1.m42295h4("5.1");
        c8941ucM41736x1.m42301m9("12.0");
        c8941ucM41736x1.m42293dy("12.0");
        c8941ucM41736x1.m42290c5("1");
        c8941ucM41736x1.m42297jd("1280");
        c8941ucM41736x1.m42291ck("800");
        c8941ucM41736x1.m42294fa("32");
        c8941ucM41736x1.m42304up("{00000000-0000-0000-0000-000000000000}");
        c8941ucM41736x1.m42296ix("");
        c8941ucM41736x1.m42303u4("9");
        c8941ucM41736x1.m42305uz("1");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69448k4(C7712fy c7712fy, String str) {
        C7408ci c7408ciM44903k4 = c7712fy.m32172kk().m44903k4();
        c7408ciM44903k4.m29627x1("#idPackageObject");
        c7408ciM44903k4.m29622k4("http://www.w3.org/2000/09/xmldsig#Object");
        c7408ciM44903k4.m29625to().m32048k4("http://www.w3.org/2000/09/xmldsig#sha1");
        c7408ciM44903k4.m29624kk(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static void m69449k4(C11785nh c11785nh, C8399o0 c8399o0) {
        C11791os[] c11791osArr;
        int i;
        int i2;
        C11791os[] c11791osArr2;
        int i3;
        int i4;
        String strM66410k4;
        C11791os[] c11791osArrM55388c5 = c11785nh.m55388c5();
        int length = c11791osArrM55388c5.length;
        int i5 = 0;
        while (i5 < length) {
            C11791os c11791os = c11791osArrM55388c5[i5];
            if (C14113y2.m67448x1(c11791os.m55427x1(), "/_xmlsignatures") || C14113y2.m67448x1(c11791os.m55427x1(), "/docProps") || ((C14113y2.m67448x1(c11791os.m55427x1(), "/ppt/_rels/") && !"/ppt/_rels/presentation.xml.rels".equals(c11791os.m55427x1())) || (C7019kk.m27469x1(c11791os.m55372fa(), C11738ew.class) && c11791os.m55377up().m55301k4() == 0))) {
                c11791osArr = c11791osArrM55388c5;
                i = length;
                i2 = i5;
            } else {
                C7408ci c7408ciM37950k4 = c8399o0.m37950k4();
                c7408ciM37950k4.m29627x1(C14113y2.m67408k4(c11791os.m55427x1(), "?ContentType=", c11791os.m55372fa().mo55273k4()));
                c7408ciM37950k4.m29625to().m32048k4("http://www.w3.org/2000/09/xmldsig#sha1");
                byte[] bArrM55426to = c11791os.m55426to();
                if (C7019kk.m27469x1(c11791os.m55372fa(), C11738ew.class)) {
                    C8771sh c8771shM29621k4 = c7408ciM37950k4.m29621k4();
                    C8276mo c8276moM41020k4 = c8771shM29621k4.m41020k4();
                    c8276moM41020k4.m37020k4("http://schemas.openxmlformats.org/package/2006/RelationshipTransform");
                    List list = new List();
                    IGenericEnumerator<C11709bg> it = c11791os.m55377up().iterator();
                    while (it.hasNext()) {
                        try {
                            C11709bg next = it.next();
                            if (!"/_rels/.rels".equals(c11791os.m55427x1()) || "/ppt/presentation.xml".equals(next.m55292k4())) {
                                c8276moM41020k4.m37019k4().m45529k4(next.m55289du());
                                list.addItem(next.m55289du());
                            }
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
                    list.sort();
                    List.Enumerator it2 = list.iterator();
                    String strM67400k4 = "";
                    while (it2.hasNext()) {
                        try {
                            C11709bg c11709bgM55303k4 = c11791os.m55377up().m55303k4((String) it2.next());
                            if (c11709bgM55303k4 != null) {
                                String strM27222x1 = c11709bgM55303k4.m55294m9() == 1 ? C6964k4.m27222x1(c11709bgM55303k4.m55292k4()) : m69443k4(c11709bgM55303k4.m55292k4(), c11791os.m55427x1());
                                String strM55289du = c11709bgM55303k4.m55289du();
                                c11791osArr2 = c11791osArrM55388c5;
                                if (c11709bgM55303k4.m55294m9() != -1) {
                                    i3 = length;
                                    i4 = i5;
                                    strM66410k4 = C14042ak.m66410k4(C11767k5.class, c11709bgM55303k4.m55294m9());
                                } else {
                                    i3 = length;
                                    i4 = i5;
                                    strM66410k4 = "Internal";
                                }
                                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4("<Relationship Id=\"", strM55289du, "\" ", "Target=\"", strM27222x1, "\" ", "TargetMode=\"", strM66410k4, "\" ", "Type=\"", c11709bgM55303k4.m55291h4(), "\"></Relationship>"));
                            } else {
                                c11791osArr2 = c11791osArrM55388c5;
                                i3 = length;
                                i4 = i5;
                            }
                            c11791osArrM55388c5 = c11791osArr2;
                            length = i3;
                            i5 = i4;
                        } catch (Throwable th2) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            throw th2;
                        }
                    }
                    c11791osArr = c11791osArrM55388c5;
                    i = length;
                    i2 = i5;
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    bArrM55426to = AbstractC6747ar.m26635ix().mo26677to(C14113y2.m67408k4("<Relationships xmlns=\"http://schemas.openxmlformats.org/package/2006/relationships\">", strM67400k4, "</Relationships>"));
                    c8771shM29621k4.m41020k4().m37020k4("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
                } else {
                    c11791osArr = c11791osArrM55388c5;
                    i = length;
                    i2 = i5;
                }
                c7408ciM37950k4.m29624kk(C14080ne.m66952k4(m69441k4(c7408ciM37950k4.m29625to().m32047k4()).m19588x1(bArrM55426to)));
            }
            i5 = i2 + 1;
            c11791osArrM55388c5 = c11791osArr;
            length = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static boolean m69450k4(C7408ci[] c7408ciArr, C11785nh c11785nh) {
        boolean z;
        int i;
        char c;
        int i2;
        String str;
        String strM67408k4;
        String strM66410k4;
        int length = c7408ciArr.length;
        boolean z2 = false;
        int i3 = 0;
        while (i3 < length) {
            C7408ci c7408ci = c7408ciArr[i3];
            AbstractC4705c6 abstractC4705c6M69441k4 = m69441k4(c7408ci.m29625to().m32047k4());
            C11791os c11791osM55392h4 = c11785nh.m55392h4(C14113y2.m67443x1(c7408ci.m29626x1(), z2 ? 1 : 0, C14113y2.m67364dy(c7408ci.m29626x1(), MsalUtils.QUERY_STRING_SYMBOL)));
            byte[] bArrM55426to = c11791osM55392h4.m55426to();
            if (c7408ci.m29623kk() != null) {
                C8276mo[] c8276moArrM41021x1 = c7408ci.m29623kk().m41021x1();
                int length2 = c8276moArrM41021x1.length;
                int i4 = z2 ? 1 : 0;
                while (true) {
                    if (i4 >= length2) {
                        c = z2 ? 1 : 0;
                        break;
                    }
                    if ("http://www.w3.org/TR/2001/REC-xml-c14n-20010315".equals(c8276moArrM41021x1[i4].m37022x1())) {
                        c = 1;
                        break;
                    }
                    i4++;
                }
                C8276mo[] c8276moArrM41021x12 = c7408ci.m29623kk().m41021x1();
                int length3 = c8276moArrM41021x12.length;
                int i5 = z2 ? 1 : 0;
                while (i5 < length3) {
                    C8276mo c8276mo = c8276moArrM41021x12[i5];
                    z = z2 ? 1 : 0;
                    if ("http://schemas.openxmlformats.org/package/2006/RelationshipTransform".equals(c8276mo.m37022x1())) {
                        List list = new List();
                        C9354za[] c9354zaArrM37021kk = c8276mo.m37021kk();
                        int length4 = c9354zaArrM37021kk.length;
                        for (int i6 = z ? 1 : 0; i6 < length4; i6++) {
                            list.addItem(c9354zaArrM37021kk[i6].m45528k4());
                        }
                        list.sort();
                        List.Enumerator it = list.iterator();
                        String str2 = "";
                        String strM67400k4 = "";
                        while (it.hasNext()) {
                            try {
                                C11709bg c11709bgM55303k4 = c11791osM55392h4.m55377up().m55303k4((String) it.next());
                                if (c11709bgM55303k4 != null) {
                                    String strM27222x1 = c11709bgM55303k4.m55294m9() == 1 ? C6964k4.m27222x1(c11709bgM55303k4.m55292k4()) : m69443k4(c11709bgM55303k4.m55292k4(), c11791osM55392h4.m55427x1());
                                    String strM55289du = c11709bgM55303k4.m55289du();
                                    if (c != 0) {
                                        if (c11709bgM55303k4.m55294m9() != -1) {
                                            i2 = i3;
                                            str = str2;
                                            strM66410k4 = C14042ak.m66410k4(C11767k5.class, c11709bgM55303k4.m55294m9());
                                        } else {
                                            i2 = i3;
                                            str = str2;
                                            strM66410k4 = "Internal";
                                        }
                                        strM67408k4 = C14113y2.m67408k4("TargetMode=\"", strM66410k4, "\" ");
                                    } else {
                                        i2 = i3;
                                        str = str2;
                                        strM67408k4 = str;
                                    }
                                    strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4("<Relationship Id=\"", strM55289du, "\" ", "Target=\"", strM27222x1, "\" ", strM67408k4, "Type=\"", c11709bgM55303k4.m55291h4(), "\"></Relationship>"));
                                } else {
                                    i2 = i3;
                                    str = str2;
                                }
                                i3 = i2;
                                str2 = str;
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                throw th;
                            }
                        }
                        i = i3;
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        bArrM55426to = AbstractC6747ar.m26635ix().mo26677to(C14113y2.m67408k4("<Relationships xmlns=\"http://schemas.openxmlformats.org/package/2006/relationships\">", strM67400k4, "</Relationships>"));
                    } else {
                        i5++;
                        z2 = z ? 1 : 0;
                    }
                }
                z = z2;
                i = i3;
            } else {
                z = z2;
                i = i3;
            }
            if (!C14113y2.m67363du(C14080ne.m66952k4(abstractC4705c6M69441k4.m19588x1(bArrM55426to)), c7408ci.m29620du())) {
                return z;
            }
            i3 = i + 1;
            z2 = z;
        }
        return true;
    }
}
