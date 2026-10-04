package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p118ex.C3811ar;
import com.aspose.slides.internal.p118ex.C3815dy;
import com.aspose.slides.internal.p118ex.C3823m9;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.AbstractC13943n5;
import com.aspose.slides.p559ms.System.Xml.C13906gx;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13959qk;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.he */
/* JADX INFO: loaded from: classes.dex */
public class C5934he {

    /* JADX INFO: renamed from: k4 */
    public static final long f16772k4 = C7019kk.m27438h4(Double.valueOf(1.0E7d), 14);

    /* JADX INFO: renamed from: x1 */
    private static final char[] f16773x1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: du */
    public static String m23961du(String str) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(str);
        c6765kp.m26794k4("&", "&amp;");
        c6765kp.m26794k4("<", "&lt;");
        c6765kp.m26794k4(">", "&gt;");
        m23982k4(c6765kp, ControlChar.PARAGRAPH_BREAK_CHAR, "&#xD;");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: h4 */
    public static String m23963h4(String str) {
        return m23961du(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m23964k4(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i = (i * 256) + (b & 255);
        }
        return i;
    }

    /* JADX INFO: renamed from: kk */
    public static Hashtable m23993kk(String str) {
        Hashtable hashtable = new Hashtable();
        if (str != null) {
            for (String str2 : C14113y2.m67369h4(str, (char[]) null)) {
                if (C14113y2.m67363du(str2, "#default")) {
                    str2 = C14113y2.f47374k4;
                } else {
                    if (str2.length() > 0) {
                    }
                }
                hashtable.addItem(str2, Boolean.TRUE);
            }
        }
        return hashtable;
    }

    /* JADX INFO: renamed from: m9 */
    public static String m23996m9(String str) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(str);
        c6765kp.m26794k4("&", "&amp;");
        c6765kp.m26794k4("<", "&lt;");
        c6765kp.m26794k4("\"", "&quot;");
        m23982k4(c6765kp, '\t', "&#x9;");
        m23982k4(c6765kp, '\n', "&#xA;");
        m23982k4(c6765kp, ControlChar.PARAGRAPH_BREAK_CHAR, "&#xD;");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: to */
    public static String m23997to(String str) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(str);
        m23982k4(c6765kp, ControlChar.PARAGRAPH_BREAK_CHAR, "&#xD;");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public static String m24000x1(String str) {
        int i;
        String strM67422kk = C14113y2.m67422kk(str, 1);
        if (!C14113y2.m67412k4(strM67422kk, "xpointer(id(", (short) 4)) {
            return strM67422kk;
        }
        int iM67367h4 = C14113y2.m67367h4(strM67422kk, "id(", (short) 4);
        int iM67367h42 = C14113y2.m67367h4(strM67422kk, ")", (short) 4);
        if (iM67367h42 < 0 || iM67367h42 < (i = iM67367h4 + 3)) {
            throw new CryptographicException("Malformed reference element.");
        }
        return C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67443x1(strM67422kk, i, (iM67367h42 - iM67367h4) - 3), "'", ""), "\"", "");
    }

    /* JADX INFO: renamed from: du */
    private static boolean m23962du(C13981tl c13981tl, String str, String str2) {
        if (m23990k4(c13981tl, str, str2)) {
            return true;
        }
        return C14113y2.m67363du(c13981tl.getPrefix(), str) && C14113y2.m67363du(c13981tl.getNamespaceURI(), str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static long m23965k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        C3152yj c3152yj = (C3152yj) C7019kk.m27452k4((Object) abstractC3150x6, C3152yj.class);
        long j = 0;
        if (c3152yj != null && c3152yj.getPosition() == 0) {
            c3152yj.writeTo(abstractC3150x62);
            return c3152yj.getLength();
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int i = abstractC3150x6.read(bArr, 0, 4096);
            if (i <= 0) {
                return j;
            }
            abstractC3150x62.write(bArr, 0, i);
            j += (long) i;
        }
    }

    /* JADX INFO: renamed from: kk */
    public static String m23994kk(C13981tl c13981tl, String str, String str2) {
        String strM65906k4 = c13981tl.m65913to(str) ? c13981tl.m65906k4(str) : null;
        return (strM65906k4 == null && c13981tl.m65901dy(str, str2)) ? c13981tl.m65912to(str, str2) : strM65906k4;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m23998to(AbstractC13901ga abstractC13901ga) {
        return m23995kk(abstractC13901ga) && abstractC13901ga.getValue().length() == 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m24001x1(byte[] bArr) {
        return m23981k4(bArr, 0L, ((long) bArr.length) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static C3815dy m23966k4(C5958ss c5958ss, int i) {
        C3815dy c3815dyM15219k4;
        IEnumerator it;
        C3815dy c3815dy = new C3815dy();
        ArrayList arrayList = i == 1 ? new ArrayList() : null;
        if (c5958ss.m24108k4() != null) {
            it = c5958ss.m24108k4().iterator();
            while (it.hasNext()) {
                try {
                    C3823m9 c3823m9 = (C3823m9) it.next();
                    if (i == 0) {
                        c3815dy.m15262k4(c3823m9);
                    } else if (i == 1) {
                        arrayList.addItem(m23969k4(c3823m9.m15280dy(), c3823m9.m15322u4()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
        }
        if (c5958ss.m24114to() != null || c5958ss.m24107du() != null || c5958ss.m24113kk() != null || arrayList != null) {
            String str = i == 0 ? "AddressBook" : "My";
            C3811ar[] c3811arArr = {new C3811ar(str, 1), new C3811ar(str, 2)};
            for (int i2 = 0; i2 < 2; i2++) {
                C3811ar c3811ar = c3811arArr[i2];
                if (c3811ar != null) {
                    try {
                        c3811ar.m15220k4(4);
                        c3815dyM15219k4 = c3811arArr[i2].m15219k4();
                        try {
                            c3811arArr[i2].m15221kk();
                            if (c5958ss.m24114to() != null) {
                                IEnumerator it2 = c5958ss.m24114to().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        c3815dyM15219k4 = c3815dyM15219k4.m15263k4(2, (String) it2.next(), false);
                                    } finally {
                                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                            ((IDisposable) it2).dispose();
                                        }
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    ((IDisposable) it2).dispose();
                                }
                            }
                            if (c5958ss.m24107du() != null) {
                                it = c5958ss.m24107du().iterator();
                                while (it.hasNext()) {
                                    try {
                                        C5940jw c5940jw = (C5940jw) it.next();
                                        c3815dyM15219k4 = c3815dyM15219k4.m15263k4(4, c5940jw.m24032k4(), false).m15263k4(5, c5940jw.m24036x1(), false);
                                    } finally {
                                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                            ((IDisposable) it).dispose();
                                        }
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    ((IDisposable) it).dispose();
                                }
                            }
                            if (c5958ss.m24113kk() != null) {
                                IEnumerator it3 = c5958ss.m24113kk().iterator();
                                while (it3.hasNext()) {
                                    try {
                                        c3815dyM15219k4 = c3815dyM15219k4.m15263k4(14, m24001x1((byte[]) it3.next()), false);
                                    } finally {
                                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                            ((IDisposable) it3).dispose();
                                        }
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    ((IDisposable) it3).dispose();
                                }
                            }
                            if (arrayList != null) {
                                IEnumerator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    try {
                                        C5940jw c5940jw2 = (C5940jw) it4.next();
                                        c3815dyM15219k4 = c3815dyM15219k4.m15263k4(4, c5940jw2.m24032k4(), false).m15263k4(5, c5940jw2.m24036x1(), false);
                                    } finally {
                                        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                            ((IDisposable) it4).dispose();
                                        }
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                                    ((IDisposable) it4).dispose();
                                }
                            }
                        } catch (CryptographicException unused) {
                        }
                    } catch (CryptographicException unused2) {
                        c3815dyM15219k4 = null;
                    }
                    if (c3815dyM15219k4 != null) {
                        c3815dy.m15265k4(c3815dyM15219k4);
                    }
                }
            }
        }
        return c3815dy;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m23995kk(AbstractC13901ga abstractC13901ga) {
        return (abstractC13901ga.getNodeType() == 2 && abstractC13901ga.getPrefix().length() == 0 && C14113y2.m67363du(abstractC13901ga.getLocalName(), "xmlns")) || m24002x1(abstractC13901ga);
    }

    /* JADX INFO: renamed from: to */
    public static boolean m23999to(C13981tl c13981tl, String str, String str2) {
        return c13981tl.m65913to(str) || c13981tl.m65901dy(str, str2);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m24002x1(AbstractC13901ga abstractC13901ga) {
        return abstractC13901ga.getNodeType() == 2 && C14113y2.m67363du(abstractC13901ga.getPrefix(), "xml");
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4709du m23967k4(C3823m9 c3823m9) {
        return c3823m9.m15319ne().m15300kk();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m24003x1(C13940my c13940my) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static C5921ck m23968k4(C13981tl c13981tl) {
        if (c13981tl == null) {
            return null;
        }
        C5921ck c5921ck = new C5921ck();
        boolean z = true;
        for (AbstractC13901ga parentNode = c13981tl; parentNode != null; parentNode = parentNode.getParentNode()) {
            C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) parentNode, C13981tl.class);
            if (c13981tl2 != null) {
                if (!m23990k4(c13981tl2, c13981tl2.getPrefix(), c13981tl2.getNamespaceURI()) && !m24004x1(c13981tl2, c13981tl2.getPrefix(), c13981tl2.getNamespaceURI())) {
                    C13940my c13940myCreateAttribute = c13981tl.getOwnerDocument().createAttribute(c13981tl2.getPrefix().length() > 0 ? C14113y2.m67408k4("xmlns:", c13981tl2.getPrefix()) : "xmlns");
                    c13940myCreateAttribute.setValue(c13981tl2.getNamespaceURI());
                    c5921ck.addItem(c13940myCreateAttribute);
                }
                if (c13981tl2.m65904jd()) {
                    IEnumerator it = c13981tl2.getAttributes().iterator();
                    while (it.hasNext()) {
                        try {
                            C13940my c13940my = (C13940my) it.next();
                            if (z && "xmlns".equals(c13940my.getLocalName())) {
                                C13940my c13940myCreateAttribute2 = c13981tl.getOwnerDocument().createAttribute("xmlns");
                                c13940myCreateAttribute2.setValue(c13940my.getValue());
                                c5921ck.addItem(c13940myCreateAttribute2);
                                z = false;
                            } else if ("xmlns".equals(c13940my.getPrefix()) || "xml".equals(c13940my.getPrefix())) {
                                c5921ck.addItem(c13940my);
                            } else if (c13940my.getNamespaceURI().length() > 0 && !m23990k4(c13981tl2, c13940my.getPrefix(), c13940my.getNamespaceURI()) && !m24004x1(c13981tl2, c13940my.getPrefix(), c13940my.getNamespaceURI())) {
                                C13940my c13940myCreateAttribute3 = c13981tl.getOwnerDocument().createAttribute(c13940my.getPrefix().length() > 0 ? C14113y2.m67408k4("xmlns:", c13940my.getPrefix()) : "xmlns");
                                c13940myCreateAttribute3.setValue(c13940my.getNamespaceURI());
                                c5921ck.addItem(c13940myCreateAttribute3);
                            }
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                ((IDisposable) it).dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                } else {
                    continue;
                }
            }
        }
        return c5921ck;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m24004x1(C13981tl c13981tl, String str, String str2) {
        if (c13981tl == null) {
            throw new ArgumentNullException("element");
        }
        for (AbstractC13901ga parentNode = c13981tl.getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) parentNode, C13981tl.class);
            if (c13981tl2 != null && m23962du(c13981tl2, str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5940jw m23969k4(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new ArgumentException("String cannot be empty or null.");
        }
        if (str2 == null || str2.length() == 0) {
            throw new ArgumentException("String cannot be empty or null.");
        }
        C5940jw c5940jw = new C5940jw();
        c5940jw.m24034k4(str);
        c5940jw.m24037x1(str2);
        return c5940jw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static XmlDocument m23970k4(XmlDocument xmlDocument) {
        boolean zM27456k4;
        AbstractC13911hq abstractC13911hqSelectNodes = xmlDocument.selectNodes("//comment()");
        if (abstractC13911hqSelectNodes != null) {
            IEnumerator it = abstractC13911hqSelectNodes.iterator();
            while (it.hasNext()) {
                try {
                    AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                    abstractC13901ga.getParentNode().removeChild(abstractC13901ga);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
            if (zM27456k4) {
                return xmlDocument;
            }
        }
        return xmlDocument;
    }

    /* JADX INFO: renamed from: k4 */
    public static XmlDocument m23971k4(XmlDocument xmlDocument, AbstractC13943n5 abstractC13943n5, String str) {
        if (xmlDocument == null) {
            throw new ArgumentNullException("document");
        }
        C5931gi c5931gi = new C5931gi();
        c5931gi.setPreserveWhitespace(xmlDocument.getPreserveWhitespace());
        C3144um c3144um = new C3144um(xmlDocument.getOuterXml());
        try {
            C13906gx c13906gx = new C13906gx();
            c13906gx.m65389k4(abstractC13943n5);
            c13906gx.m65408x1(f16772k4);
            c13906gx.m65386k4(0L);
            c5931gi.load(AbstractC13912i5.m65468k4(c3144um, c13906gx, str));
            return c5931gi;
        } finally {
            c3144um.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static XmlDocument m23972k4(AbstractC13911hq abstractC13911hq) {
        IEnumerator it = abstractC13911hq.iterator();
        while (it.hasNext()) {
            try {
                AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                if (abstractC13901ga.getOwnerDocument() != null) {
                    return abstractC13901ga.getOwnerDocument();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        ((IDisposable) it).dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static XmlDocument m23973k4(C13981tl c13981tl, AbstractC13943n5 abstractC13943n5, String str) {
        if (c13981tl == null) {
            throw new ArgumentNullException("elem");
        }
        C5931gi c5931gi = new C5931gi();
        c5931gi.setPreserveWhitespace(true);
        C3144um c3144um = new C3144um(c13981tl.getOuterXml());
        try {
            C13906gx c13906gx = new C13906gx();
            c13906gx.m65389k4(abstractC13943n5);
            c13906gx.m65408x1(f16772k4);
            c13906gx.m65386k4(0L);
            c5931gi.load(AbstractC13912i5.m65468k4(c3144um, c13906gx, str));
            return c5931gi;
        } finally {
            c3144um.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C13906gx m23974k4(AbstractC13943n5 abstractC13943n5) {
        C13906gx c13906gx = new C13906gx();
        c13906gx.m65389k4(abstractC13943n5);
        c13906gx.m65408x1(f16772k4);
        c13906gx.m65386k4(0L);
        return c13906gx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static AbstractC13911hq m23975k4(AbstractC13901ga abstractC13901ga, boolean z) {
        C5921ck c5921ck = new C5921ck();
        C5921ck c5921ck2 = new C5921ck();
        C5921ck c5921ck3 = new C5921ck();
        C5921ck c5921ck4 = new C5921ck();
        c5921ck2.addItem(abstractC13901ga);
        int i = 0;
        do {
            AbstractC13901ga abstractC13901gaMo23933k4 = c5921ck2.mo23933k4(i);
            AbstractC13911hq childNodes = abstractC13901gaMo23933k4.getChildNodes();
            if (childNodes != null) {
                IEnumerator it = childNodes.iterator();
                while (it.hasNext()) {
                    try {
                        AbstractC13901ga abstractC13901ga2 = (AbstractC13901ga) it.next();
                        if (z || !C7019kk.m27469x1(abstractC13901ga2, C13959qk.class)) {
                            c5921ck2.addItem(abstractC13901ga2);
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
            if (abstractC13901gaMo23933k4.getAttributes() != null) {
                IEnumerator it2 = abstractC13901gaMo23933k4.getAttributes().iterator();
                while (it2.hasNext()) {
                    try {
                        AbstractC13901ga abstractC13901ga3 = (AbstractC13901ga) it2.next();
                        if ("xmlns".equals(abstractC13901ga3.getLocalName()) || "xmlns".equals(abstractC13901ga3.getPrefix())) {
                            c5921ck4.addItem(abstractC13901ga3);
                        } else {
                            c5921ck3.addItem(abstractC13901ga3);
                        }
                    } catch (Throwable th2) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it2).dispose();
                        }
                        throw th2;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it2).dispose();
                }
            }
            i++;
        } while (i < c5921ck2.mo23932k4());
        IEnumerator it3 = c5921ck2.iterator();
        while (it3.hasNext()) {
            try {
                c5921ck.addItem((AbstractC13901ga) it3.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it3).dispose();
        }
        IEnumerator it4 = c5921ck3.iterator();
        while (it4.hasNext()) {
            try {
                c5921ck.addItem((AbstractC13901ga) it4.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it4).dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it4).dispose();
        }
        it4 = c5921ck4.iterator();
        while (it4.hasNext()) {
            try {
                c5921ck.addItem((AbstractC13901ga) it4.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it4).dispose();
                }
            }
        }
        return c5921ck;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m23976k4(AbstractC3150x6 abstractC3150x6, AbstractC13943n5 abstractC13943n5, String str) {
        return AbstractC13912i5.m65464k4(abstractC3150x6, m23974k4(abstractC13943n5), str);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m23977k4(C13940my c13940my) {
        C6005k4.m24261k4(m23985k4((AbstractC13901ga) c13940my) || m24002x1((AbstractC13901ga) c13940my));
        return c13940my.getPrefix().length() == 0 ? C14113y2.f47374k4 : c13940my.getLocalName();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m23978k4(String str) {
        return m23979k4(str, 0, str.length());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m23979k4(String str, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (C14117yj.m67534ks(str.charAt(i + i4))) {
                i3++;
            }
        }
        char[] cArr = new char[i2 - i3];
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = i + i6;
            if (!C14117yj.m67534ks(str.charAt(i7))) {
                cArr[i5] = str.charAt(i7);
                i5++;
            }
        }
        return C14113y2.m67405k4(cArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m23980k4(String str, boolean[] zArr) {
        int i;
        String strM67422kk = C14113y2.m67422kk(str, 1);
        zArr[0] = true;
        if (!C14113y2.m67412k4(strM67422kk, "xpointer(id(", (short) 4)) {
            return strM67422kk;
        }
        int iM67367h4 = C14113y2.m67367h4(strM67422kk, "id(", (short) 4);
        int iM67367h42 = C14113y2.m67367h4(strM67422kk, ")", (short) 4);
        if (iM67367h42 < 0 || iM67367h42 < (i = iM67367h4 + 3)) {
            throw new CryptographicException("Malformed reference element.");
        }
        String strM67401k4 = C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67443x1(strM67422kk, i, (iM67367h42 - iM67367h4) - 3), "'", ""), "\"", "");
        zArr[0] = false;
        return strM67401k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m23981k4(byte[] bArr, long j, long j2) {
        if (bArr == null) {
            return null;
        }
        long j3 = 4294967295L;
        long j4 = j2 & 4294967295L;
        long j5 = 2;
        char[] cArr = new char[(int) ((((j4 - (j & 4294967295L)) & 4294967295L) * 2) & 4294967295L)];
        long j6 = 0;
        long j7 = j;
        while ((j7 & j3) < j4) {
            byte b = bArr[(int) j7];
            long j8 = ((long) ((b & 240) >> 4)) & j3;
            long j9 = j3;
            long j10 = j6 + 1;
            long j11 = j5;
            char[] cArr2 = f16773x1;
            cArr[(int) j6] = cArr2[(int) j8];
            j6 += j11;
            cArr[(int) j10] = cArr2[(int) (((long) (b & 15)) & j9)];
            j7++;
            j5 = j11;
            j3 = j9;
        }
        return C14113y2.m67405k4(cArr);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m23982k4(C6765kp c6765kp, char c, String str) {
        int length = str.length();
        int i = 0;
        while (i < c6765kp.m26807x1()) {
            if (c6765kp.m26806x1(i) == c) {
                c6765kp.m26809x1(i, 1);
                c6765kp.m26786k4(i, str);
                i += length;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m23983k4(C13981tl c13981tl, Hashtable hashtable) {
        if (hashtable != null) {
            Iterator it = hashtable.getKeys().iterator();
            while (it.hasNext()) {
                try {
                    String str = (String) it.next();
                    if (!c13981tl.m65913to(str)) {
                        C13940my c13940myCreateAttribute = c13981tl.getOwnerDocument().createAttribute(str);
                        c13940myCreateAttribute.setValue((String) C7019kk.m27452k4(hashtable.get_Item(str), String.class));
                        c13981tl.m65905k4(c13940myCreateAttribute);
                    }
                } finally {
                    if (C7019kk.m27456k4(it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m23984k4(C13981tl c13981tl, C5921ck c5921ck) {
        if (c5921ck != null) {
            IEnumerator it = c5921ck.iterator();
            while (it.hasNext()) {
                try {
                    AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                    String strM67408k4 = abstractC13901ga.getPrefix().length() > 0 ? C14113y2.m67408k4(abstractC13901ga.getPrefix(), C18241k5.f55433h, abstractC13901ga.getLocalName()) : abstractC13901ga.getLocalName();
                    if (!c13981tl.m65913to(strM67408k4) && (!C14113y2.m67363du(strM67408k4, "xmlns") || c13981tl.getPrefix().length() != 0)) {
                        C13940my c13940myCreateAttribute = c13981tl.getOwnerDocument().createAttribute(strM67408k4);
                        c13940myCreateAttribute.setValue(abstractC13901ga.getValue());
                        c13981tl.m65905k4(c13940myCreateAttribute);
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23985k4(AbstractC13901ga abstractC13901ga) {
        if (abstractC13901ga.getNodeType() != 2) {
            return false;
        }
        if (C14113y2.m67363du(abstractC13901ga.getPrefix(), "xmlns")) {
            return true;
        }
        return abstractC13901ga.getPrefix().length() == 0 && C14113y2.m67363du(abstractC13901ga.getLocalName(), "xmlns");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static boolean m23986k4(AbstractC13901ga abstractC13901ga, AbstractC13911hq abstractC13911hq) {
        IEnumerator it = abstractC13911hq.iterator();
        while (it.hasNext()) {
            try {
                if (((AbstractC13901ga) it.next()) == abstractC13901ga) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23987k4(C13940my c13940my, C13940my c13940my2) {
        return c13940my2 == null ? !m23998to(c13940my) : !C14113y2.m67363du(c13940my2.getValue(), c13940my.getValue());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23988k4(C13940my c13940my, String str) {
        return C14113y2.m67363du(m23977k4(c13940my), str);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23989k4(C13981tl c13981tl, String str) {
        return m23991k4(c13981tl, str == null ? null : new String[]{str});
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23990k4(C13981tl c13981tl, String str, String str2) {
        if (c13981tl == null) {
            throw new ArgumentNullException("element");
        }
        String strM67408k4 = str.length() > 0 ? C14113y2.m67408k4("xmlns:", str) : "xmlns";
        return c13981tl.m65913to(strM67408k4) && C14113y2.m67363du(c13981tl.m65906k4(strM67408k4), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static boolean m23991k4(C13981tl c13981tl, String[] strArr) {
        boolean zM67363du;
        IEnumerator it = c13981tl.getAttributes().iterator();
        do {
            try {
                zM67363du = true;
                if (!it.hasNext()) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    return true;
                }
                C13940my c13940my = (C13940my) it.next();
                if (!"xmlns".equals(c13940my.getName()) && !C14113y2.m67448x1(c13940my.getName(), "xmlns:") && !"xml:space".equals(c13940my.getName()) && !"xml:lang".equals(c13940my.getName()) && !"xml:base".equals(c13940my.getName())) {
                    zM67363du = false;
                }
                for (int i = 0; !zM67363du && strArr != null && i < strArr.length; i++) {
                    zM67363du = C14113y2.m67363du(c13940my.getName(), strArr[i]);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        } while (zM67363du);
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m23992k4(int i) {
        byte[] bArr = new byte[8];
        if (i == 0) {
            return new byte[1];
        }
        int i2 = 0;
        while (i > 0) {
            int i3 = i % 256;
            bArr[i2] = (byte) i3;
            i = (i - i3) / 256;
            i2++;
        }
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[(i2 - i4) - 1];
        }
        return bArr2;
    }
}
