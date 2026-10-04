package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p389s0.C10118du;
import com.aspose.slides.internal.p389s0.C10124m9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: loaded from: classes3.dex */
class ng8 {
    /* JADX INFO: renamed from: k4 */
    public static C3152yj m68017k4(AbstractC3150x6 abstractC3150x6, String str) {
        try {
            C10118du c10118du = new C10118du(abstractC3150x6);
            if (!c10118du.m49708k4().containsKey("EncryptedPackage") || !c10118du.m49708k4().containsKey("EncryptionInfo")) {
                throw new PptxUnsupportedFormatException("Unknown file format.");
            }
            return m68018k4(c10118du.m49708k4().m49728x1("EncryptedPackage"), c10118du.m49708k4().m49728x1("EncryptionInfo"), str);
        } catch (InvalidOperationException unused) {
            throw new OOXMLCorruptFileException("This file is not correctly encrypted or malformed");
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m68021x1(AbstractC3150x6 abstractC3150x6, String str) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("packageStream");
        }
        try {
            C10118du c10118du = new C10118du(abstractC3150x6);
            if (!c10118du.m49708k4().containsKey("EncryptedPackage") || !c10118du.m49708k4().containsKey("EncryptionInfo")) {
                throw new PptxUnsupportedFormatException("An unknown file format is encountered.");
            }
            C3152yj c3152yjM49728x1 = c10118du.m49708k4().m49728x1("EncryptionInfo");
            int length = (int) c3152yjM49728x1.getLength();
            byte[] bArr = new byte[length];
            c3152yjM49728x1.read(bArr, 0, length);
            if ((bArr[0] & 255) == 4 && (bArr[2] & 255) == 4) {
                String[] strArr = {null};
                AbstractC13901ga abstractC13901gaM68019k4 = m68019k4(bArr, strArr);
                String str2 = strArr[0];
                return "SHA512".equals(str2) ? new C14358qs(str2, abstractC13901gaM68019k4, AbstractC6747ar.m26643rv().mo26677to(str)).m69747k4() : new C14694vn(abstractC13901gaM68019k4, AbstractC6747ar.m26643rv().mo26677to(str)).m72371k4();
            }
            C14651uv c14651uv = new C14651uv(bArr, str);
            try {
                return c14651uv.m71937k4();
            } finally {
                c14651uv.dispose();
            }
        } catch (InvalidOperationException unused) {
            throw new OOXMLCorruptFileException("This file is not correctly encrypted or malformed.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C3152yj m68018k4(C3152yj c3152yj, C3152yj c3152yj2, String str) {
        int length = (int) c3152yj2.getLength();
        byte[] bArr = new byte[length];
        c3152yj2.read(bArr, 0, length);
        if ((bArr[0] & 255) != 4 || (bArr[2] & 255) != 4) {
            if (C14113y2.m67411k4(str)) {
                str = "VelvetSweatshop";
            }
            C14651uv c14651uv = new C14651uv(bArr, str);
            try {
                if (c14651uv.m71937k4()) {
                    return c14651uv.m71935k4(c3152yj);
                }
                throw new InvalidPasswordException("Invalid password.");
            } finally {
                c14651uv.dispose();
            }
        }
        String[] strArr = {null};
        AbstractC13901ga abstractC13901gaM68019k4 = m68019k4(bArr, strArr);
        String str2 = strArr[0];
        if ("SHA512".equals(str2)) {
            C14358qs c14358qs = new C14358qs(str2, abstractC13901gaM68019k4, AbstractC6747ar.m26643rv().mo26677to(str));
            if (c14358qs.m69747k4()) {
                return c14358qs.m69746k4(c3152yj);
            }
            throw new InvalidPasswordException("Invalid password.");
        }
        C14694vn c14694vn = new C14694vn(abstractC13901gaM68019k4, AbstractC6747ar.m26643rv().mo26677to(str));
        if (c14694vn.m72371k4()) {
            return c14694vn.m72370k4(c3152yj);
        }
        throw new InvalidPasswordException("Invalid password.");
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC13901ga m68019k4(byte[] bArr, String[] strArr) {
        C13981tl c13981tl;
        C13981tl c13981tl2;
        strArr[0] = null;
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setXmlResolver(null);
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            c3152yj.setPosition(8L);
            xmlDocument.load(c3152yj);
            c3152yj.dispose();
            C13981tl c13981tl3 = xmlDocument.getDocumentElement().get_Item("keyEncryptors");
            if (c13981tl3 != null && (c13981tl2 = c13981tl3.get_Item("keyEncryptor")) != null) {
                strArr[0] = c13981tl2.get_Item("p:encryptedKey").getAttributes().m65165k4("hashAlgorithm").getValue();
            }
            if (strArr[0] == null && (c13981tl = xmlDocument.getDocumentElement().get_Item("keyData")) != null) {
                strArr[0] = c13981tl.getAttributes().m65165k4("hashAlgorithm").getValue();
            }
            return xmlDocument.getDocumentElement();
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68020k4(AbstractC3150x6 abstractC3150x6, String str, AbstractC3150x6 abstractC3150x62, C14670va c14670va) {
        C10124m9 c10124m9 = new C10124m9();
        C14651uv c14651uv = new C14651uv(str, 128);
        try {
            c10124m9.m49726k4("EncryptionInfo", c14651uv.m71938x1());
            c10124m9.m49726k4("EncryptedPackage", c14651uv.m71934k4(abstractC3150x6));
            if (c14670va != null) {
                c10124m9.m49726k4("\u0005SummaryInformation", new C3152yj(c14670va.m72147qq().m13123k4()));
                c10124m9.m49726k4("\u0005DocumentSummaryInformation", new C3152yj(c14670va.m72155wl().m13123k4()));
            }
            new C10118du(c10124m9).m49709k4(abstractC3150x62);
        } finally {
            c14651uv.dispose();
        }
    }
}
