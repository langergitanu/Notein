package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p532yu.C13061k5;
import com.aspose.slides.internal.p532yu.C13116n3;
import com.aspose.slides.internal.p532yu.C13125nk;
import com.aspose.slides.internal.p532yu.C13226tw;
import com.aspose.slides.internal.p532yu.C13322zd;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13985tt;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.tw */
/* JADX INFO: loaded from: classes5.dex */
public class C13987tw {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f46979to = new C7017h4("version", "encoding", HTMLWriter.STANDALONE, "PUBLIC", "SYSTEM", TranslateLanguage.LITHUANIAN, "gt", "amp", "apos", "quot");

    /* JADX INFO: renamed from: k4 */
    private XmlDocument f46980k4;

    /* JADX INFO: renamed from: kk */
    private boolean f46981kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13912i5 f46982x1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC13901ga m66196du() {
        AbstractC13901ga abstractC13901gaM66197h4;
        AbstractC13912i5 abstractC13912i5 = this.f46982x1;
        AbstractC13901ga parentNode = null;
        do {
            int iMo65028jd = abstractC13912i5.mo65028jd();
            if (iMo65028jd != 1) {
                if (iMo65028jd == 2) {
                    abstractC13901gaM66197h4 = m66197h4();
                } else if (iMo65028jd == 3) {
                    abstractC13901gaM66197h4 = new C13854aq(this.f46982x1.mo65042rv(), this.f46980k4);
                } else if (iMo65028jd == 4) {
                    abstractC13901gaM66197h4 = new C14040zm(this.f46982x1.mo65042rv(), this.f46980k4);
                } else if (iMo65028jd == 5) {
                    abstractC13901gaM66197h4 = m66213x1(true);
                } else if (iMo65028jd == 7) {
                    abstractC13901gaM66197h4 = new C13954ph(this.f46982x1.mo65019ck(), this.f46982x1.mo65042rv(), this.f46980k4);
                } else if (iMo65028jd != 8) {
                    switch (iMo65028jd) {
                        case 13:
                            if (this.f46981kk) {
                                abstractC13901gaM66197h4 = new C13939mt(this.f46982x1.mo65042rv(), this.f46980k4);
                            }
                            break;
                        case 14:
                            abstractC13901gaM66197h4 = new C13862bp(this.f46982x1.mo65042rv(), this.f46980k4);
                            break;
                        case 15:
                            if (parentNode.getParentNode() == null) {
                                return parentNode;
                            }
                            parentNode = parentNode.getParentNode();
                            break;
                        case 16:
                            break;
                        default:
                            throw m66198k4(this.f46982x1.mo65028jd());
                    }
                } else {
                    abstractC13901gaM66197h4 = new C13959qk(this.f46982x1.mo65042rv(), this.f46980k4);
                }
                if (parentNode != null) {
                    return abstractC13901gaM66197h4;
                }
                parentNode.appendChildForLoad(abstractC13901gaM66197h4, this.f46980k4);
            } else {
                boolean zMo65048u4 = this.f46982x1.mo65048u4();
                C13981tl c13981tl = new C13981tl(this.f46982x1.mo65060yj(), this.f46982x1.mo65023fa(), this.f46982x1.mo65050up(), this.f46980k4);
                c13981tl.m65915x1(zMo65048u4);
                if (this.f46982x1.mo65035kk()) {
                    C13857b1 attributes = c13981tl.getAttributes();
                    do {
                        attributes.m65175x1(m66197h4());
                    } while (abstractC13912i5.mo65047to());
                }
                if (zMo65048u4) {
                    abstractC13901gaM66197h4 = c13981tl;
                    if (parentNode != null) {
                    }
                } else {
                    parentNode.appendChildForLoad(c13981tl, this.f46980k4);
                    parentNode = c13981tl;
                }
            }
        } while (abstractC13912i5.mo65026h4());
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    private C13940my m66197h4() {
        AbstractC13912i5 abstractC13912i5 = this.f46982x1;
        if (!abstractC13912i5.mo65057x1()) {
            C13940my c13940my = new C13940my(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up(), this.f46980k4);
            m66206k4((AbstractC13901ga) c13940my, true);
            return c13940my;
        }
        C13967r9 c13967r9 = new C13967r9(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up(), this.f46980k4);
        m66206k4((AbstractC13901ga) c13967r9, true);
        c13967r9.m65817k4(false);
        return c13967r9;
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m66198k4(int i) {
        return new InvalidOperationException(C14113y2.m67391k4(C11697x1.m55250kk(), C13968ri.m65818k4("Unexpected XmlNodeType: '{0}'."), C14042ak.m66410k4(C13929li.class, i)));
    }

    /* JADX INFO: renamed from: kk */
    private C13976sq m66210kk() {
        String strMo65042rv = null;
        String strMo65042rv2 = null;
        String strMo65042rv3 = null;
        while (this.f46982x1.mo65047to()) {
            int iM27428k4 = f46979to.m27428k4(this.f46982x1.mo65019ck());
            if (iM27428k4 == 0) {
                strMo65042rv = this.f46982x1.mo65042rv();
            } else if (iM27428k4 == 1) {
                strMo65042rv2 = this.f46982x1.mo65042rv();
            } else if (iM27428k4 == 2) {
                strMo65042rv3 = this.f46982x1.mo65042rv();
            }
        }
        if (strMo65042rv == null) {
            String[] strArr = {strMo65042rv};
            String[] strArr2 = {strMo65042rv2};
            String[] strArr3 = {strMo65042rv3};
            m66209k4(this.f46982x1.mo65042rv(), strArr, strArr2, strArr3);
            strMo65042rv = strArr[0];
            strMo65042rv2 = strArr2[0];
            strMo65042rv3 = strArr3[0];
        }
        return this.f46980k4.createXmlDeclaration(strMo65042rv, strMo65042rv2, strMo65042rv3);
    }

    /* JADX INFO: renamed from: to */
    private C13957q6 m66211to() {
        String strMo65042rv = this.f46982x1.mo65042rv();
        String strMo65023fa = this.f46982x1.mo65023fa();
        String strMo65042rv2 = null;
        String strMo65042rv3 = null;
        while (this.f46982x1.mo65047to()) {
            int iM27428k4 = f46979to.m27428k4(this.f46982x1.mo65019ck());
            if (iM27428k4 == 3) {
                strMo65042rv2 = this.f46982x1.mo65042rv();
            } else if (iM27428k4 == 4) {
                strMo65042rv3 = this.f46982x1.mo65042rv();
            }
        }
        C13957q6 c13957q6CreateDocumentType = this.f46980k4.createDocumentType(strMo65023fa, strMo65042rv2, strMo65042rv3, strMo65042rv);
        InterfaceC13899g8 interfaceC13899g8Mo65054wy = this.f46982x1.mo65054wy();
        if (interfaceC13899g8Mo65054wy != null) {
            m66205k4(interfaceC13899g8Mo65054wy, c13957q6CreateDocumentType);
            return c13957q6CreateDocumentType;
        }
        m66219k4(c13957q6CreateDocumentType);
        return c13957q6CreateDocumentType;
    }

    /* JADX INFO: renamed from: x1 */
    private C13940my m66212x1() {
        AbstractC13912i5 abstractC13912i5 = this.f46982x1;
        C13940my c13940myCreateDefaultAttribute = this.f46980k4.createDefaultAttribute(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up());
        InterfaceC13298y4 interfaceC13298y4Mo65210wl = abstractC13912i5.mo65210wl();
        if (interfaceC13298y4Mo65210wl != null) {
            c13940myCreateDefaultAttribute.m65624k4(this.f46980k4.addAttrXmlName(c13940myCreateDefaultAttribute.getPrefix(), c13940myCreateDefaultAttribute.getLocalName(), c13940myCreateDefaultAttribute.getNamespaceURI(), interfaceC13298y4Mo65210wl));
        }
        m66206k4((AbstractC13901ga) c13940myCreateDefaultAttribute, false);
        C13967r9 c13967r9 = (C13967r9) C7019kk.m27452k4((Object) c13940myCreateDefaultAttribute, C13967r9.class);
        if (c13967r9 != null) {
            c13967r9.m65817k4(false);
        }
        return c13940myCreateDefaultAttribute;
    }

    /* JADX INFO: renamed from: x1 */
    private C13947nk m66213x1(boolean z) {
        C13947nk c13947nk = z ? new C13947nk(this.f46982x1.mo65019ck(), this.f46980k4) : this.f46980k4.createEntityReference(this.f46982x1.mo65019ck());
        if (this.f46982x1.mo65027ix()) {
            this.f46982x1.mo65016b3();
            while (this.f46982x1.mo65026h4() && this.f46982x1.mo65028jd() != 16) {
                AbstractC13901ga abstractC13901gaM66196du = z ? m66196du() : m66199k4(false);
                if (abstractC13901gaM66196du != null) {
                    c13947nk.appendChildForLoad(abstractC13901gaM66196du, this.f46980k4);
                }
            }
            if (c13947nk.getLastChild() == null) {
                c13947nk.appendChildForLoad(this.f46980k4.createTextNode(C14113y2.f47374k4), this.f46980k4);
            }
        }
        return c13947nk;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13901ga m66214k4(XmlDocument xmlDocument, AbstractC13912i5 abstractC13912i5) {
        this.f46980k4 = xmlDocument;
        this.f46982x1 = abstractC13912i5;
        this.f46981kk = true;
        if (xmlDocument == null) {
            throw new ArgumentException(C13968ri.m65818k4("The document to be loaded could not be found."));
        }
        if (abstractC13912i5 == null) {
            throw new ArgumentException(C13968ri.m65818k4("There is no reader from which to load the document."));
        }
        if (abstractC13912i5.mo65039m9() == 0) {
            abstractC13912i5.mo65026h4();
        }
        if (abstractC13912i5.mo65039m9() != 1) {
            return null;
        }
        AbstractC13901ga abstractC13901gaM66199k4 = m66199k4(true);
        if (abstractC13901gaM66199k4.getNodeType() != 2) {
            abstractC13912i5.mo65026h4();
        }
        return abstractC13901gaM66199k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC13901ga m66199k4(boolean z) {
        AbstractC13901ga abstractC13901gaM66201k4;
        C13981tl c13981tl;
        AbstractC13912i5 abstractC13912i5 = this.f46982x1;
        AbstractC13901ga parentNode = null;
        do {
            switch (abstractC13912i5.mo65028jd()) {
                case 1:
                    boolean zMo65048u4 = abstractC13912i5.mo65048u4();
                    C13981tl c13981tlCreateElement = this.f46980k4.createElement(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up());
                    c13981tlCreateElement.m65915x1(zMo65048u4);
                    if (abstractC13912i5.mo65035kk()) {
                        C13857b1 attributes = c13981tlCreateElement.getAttributes();
                        do {
                            attributes.m65175x1(m66201k4());
                        } while (abstractC13912i5.mo65047to());
                        abstractC13912i5.mo65020du();
                    }
                    if (!zMo65048u4) {
                        if (parentNode != null) {
                            parentNode.appendChildForLoad(c13981tlCreateElement, this.f46980k4);
                        }
                        parentNode = c13981tlCreateElement;
                    } else {
                        InterfaceC13298y4 interfaceC13298y4Mo65210wl = abstractC13912i5.mo65210wl();
                        if (interfaceC13298y4Mo65210wl != null) {
                            c13981tlCreateElement.m65908k4(this.f46980k4.addXmlName(c13981tlCreateElement.getPrefix(), c13981tlCreateElement.getLocalName(), c13981tlCreateElement.getNamespaceURI(), interfaceC13298y4Mo65210wl));
                        }
                        abstractC13901gaM66201k4 = c13981tlCreateElement;
                        if (parentNode == null) {
                            return abstractC13901gaM66201k4;
                        }
                        parentNode.appendChildForLoad(abstractC13901gaM66201k4, this.f46980k4);
                    }
                    break;
                case 2:
                    abstractC13901gaM66201k4 = m66201k4();
                    if (parentNode == null) {
                    }
                    break;
                case 3:
                    abstractC13901gaM66201k4 = this.f46980k4.createTextNode(abstractC13912i5.mo65042rv());
                    if (parentNode == null) {
                    }
                    break;
                case 4:
                    abstractC13901gaM66201k4 = this.f46980k4.createCDataSection(abstractC13912i5.mo65042rv());
                    if (parentNode == null) {
                    }
                    break;
                case 5:
                    abstractC13901gaM66201k4 = m66213x1(false);
                    if (parentNode == null) {
                    }
                    break;
                case 6:
                case 9:
                case 11:
                case 12:
                default:
                    throw m66198k4(abstractC13912i5.mo65028jd());
                case 7:
                    abstractC13901gaM66201k4 = this.f46980k4.createProcessingInstruction(abstractC13912i5.mo65019ck(), abstractC13912i5.mo65042rv());
                    if (parentNode == null) {
                    }
                    break;
                case 8:
                    abstractC13901gaM66201k4 = this.f46980k4.createComment(abstractC13912i5.mo65042rv());
                    if (parentNode == null) {
                    }
                    break;
                case 10:
                    abstractC13901gaM66201k4 = m66211to();
                    if (parentNode == null) {
                    }
                    break;
                case 13:
                    if (!this.f46981kk) {
                        if (parentNode == null && !z) {
                            return null;
                        }
                        break;
                    } else {
                        abstractC13901gaM66201k4 = this.f46980k4.createWhitespace(abstractC13912i5.mo65042rv());
                        if (parentNode == null) {
                        }
                    }
                    break;
                case 14:
                    abstractC13901gaM66201k4 = this.f46980k4.createSignificantWhitespace(abstractC13912i5.mo65042rv());
                    if (parentNode == null) {
                    }
                    break;
                case 15:
                    if (parentNode == null) {
                        return null;
                    }
                    InterfaceC13298y4 interfaceC13298y4Mo65210wl2 = abstractC13912i5.mo65210wl();
                    if (interfaceC13298y4Mo65210wl2 != null && (c13981tl = (C13981tl) C7019kk.m27452k4((Object) parentNode, C13981tl.class)) != null) {
                        c13981tl.m65908k4(this.f46980k4.addXmlName(c13981tl.getPrefix(), c13981tl.getLocalName(), c13981tl.getNamespaceURI(), interfaceC13298y4Mo65210wl2));
                    }
                    if (parentNode.getParentNode() == null) {
                        return parentNode;
                    }
                    parentNode = parentNode.getParentNode();
                    break;
                case 16:
                    return null;
                case 17:
                    abstractC13901gaM66201k4 = m66210kk();
                    if (parentNode == null) {
                    }
                    break;
            }
        } while (abstractC13912i5.mo65026h4());
        if (parentNode != null) {
            while (parentNode.getParentNode() != null) {
                parentNode = parentNode.getParentNode();
            }
        }
        return parentNode;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC13912i5 m66200k4(String str, int i, C14015xb c14015xb, XmlDocument xmlDocument) {
        C13985tt c13985tt = new C13985tt(str, (i == 6 || i == 5) ? 1 : i, c14015xb);
        c13985tt.m66083du(true);
        if (xmlDocument.hasSetResolver()) {
            c13985tt.m66099k4(xmlDocument.getResolver());
        }
        if (!xmlDocument.getActualLoadingStatus()) {
            c13985tt.m66090h4(true);
        }
        C13957q6 documentType = xmlDocument.getDocumentType();
        if (documentType != null) {
            c13985tt.m66130x1(documentType.m65791h4());
            if (documentType.m65795m9() != null) {
                c13985tt.m66098k4((InterfaceC13899g8) documentType.m65795m9());
            } else {
                InterfaceC13899g8 interfaceC13899g8Mo65609k4 = C13931lr.m65536k4().mo65609k4(c14015xb.m66300h4(), c14015xb.m66303kk(), c14015xb.m66305to(), c14015xb.m66298du(), c14015xb.m66304m9(), new C13985tt.x1(c13985tt));
                documentType.m65793k4((C13322zd) C7019kk.m27452k4((Object) interfaceC13899g8Mo65609k4, C13322zd.class));
                c13985tt.m66098k4(interfaceC13899g8Mo65609k4);
            }
        }
        if (i != 6 && i != 5) {
            return c13985tt;
        }
        c13985tt.mo65026h4();
        c13985tt.mo65016b3();
        return c13985tt;
    }

    /* JADX INFO: renamed from: k4 */
    private C13940my m66201k4() {
        AbstractC13901ga abstractC13901gaCreateTextNode;
        AbstractC13912i5 abstractC13912i5 = this.f46982x1;
        if (abstractC13912i5.mo65057x1()) {
            return m66212x1();
        }
        C13940my c13940myCreateAttribute = this.f46980k4.createAttribute(abstractC13912i5.mo65060yj(), abstractC13912i5.mo65023fa(), abstractC13912i5.mo65050up());
        InterfaceC13298y4 interfaceC13298y4Mo65210wl = abstractC13912i5.mo65210wl();
        if (interfaceC13298y4Mo65210wl != null) {
            c13940myCreateAttribute.m65624k4(this.f46980k4.addAttrXmlName(c13940myCreateAttribute.getPrefix(), c13940myCreateAttribute.getLocalName(), c13940myCreateAttribute.getNamespaceURI(), interfaceC13298y4Mo65210wl));
        }
        while (abstractC13912i5.mo65021dy()) {
            int iMo65028jd = abstractC13912i5.mo65028jd();
            if (iMo65028jd == 3) {
                abstractC13901gaCreateTextNode = this.f46980k4.createTextNode(abstractC13912i5.mo65042rv());
            } else {
                if (iMo65028jd != 5) {
                    throw m66198k4(abstractC13912i5.mo65028jd());
                }
                abstractC13901gaCreateTextNode = this.f46980k4.createEntityReference(abstractC13912i5.mo65023fa());
                if (abstractC13912i5.mo65027ix()) {
                    abstractC13912i5.mo65016b3();
                    m66206k4(abstractC13901gaCreateTextNode, false);
                    if (abstractC13901gaCreateTextNode.getFirstChild() == null) {
                        abstractC13901gaCreateTextNode.appendChildForLoad(this.f46980k4.createTextNode(C14113y2.f47374k4), this.f46980k4);
                    }
                }
            }
            c13940myCreateAttribute.appendChildForLoad(abstractC13901gaCreateTextNode, this.f46980k4);
        }
        return c13940myCreateAttribute;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13950o3 m66215k4(AbstractC13901ga abstractC13901ga, String str, int i) {
        AbstractC13901ga abstractC13901gaM66199k4;
        AbstractC13901ga abstractC13901gaM66196du;
        this.f46980k4 = abstractC13901ga.getOwnerDocument();
        C14015xb c14015xbM66202k4 = m66202k4(abstractC13901ga);
        this.f46982x1 = m66200k4(str, i, c14015xbM66202k4, this.f46980k4);
        try {
            this.f46981kk = true;
            boolean zIsLoading = this.f46980k4.isLoading();
            this.f46980k4.setLoading(true);
            if (i == 6) {
                while (this.f46982x1.mo65026h4() && (abstractC13901gaM66196du = m66196du()) != null) {
                    abstractC13901ga.appendChildForLoad(abstractC13901gaM66196du, this.f46980k4);
                }
            } else {
                while (this.f46982x1.mo65026h4() && (abstractC13901gaM66199k4 = m66199k4(true)) != null) {
                    abstractC13901ga.appendChildForLoad(abstractC13901gaM66199k4, this.f46980k4);
                }
            }
            this.f46980k4.setLoading(zIsLoading);
            this.f46982x1.mo65049um();
            return c14015xbM66202k4.m66306x1();
        } catch (Throwable th) {
            this.f46982x1.mo65049um();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private C14015xb m66202k4(AbstractC13901ga abstractC13901ga) {
        C13957q6 documentType = this.f46980k4.getDocumentType();
        String baseURI = this.f46980k4.getBaseURI();
        Hashtable hashtable = new Hashtable();
        AbstractC13883dt nameTable = this.f46980k4.getNameTable();
        C13950o3 c13950o3 = new C13950o3(nameTable);
        boolean z = false;
        int i = 0;
        String value = null;
        for (AbstractC13901ga parentNode = abstractC13901ga; parentNode != null && parentNode != this.f46980k4; parentNode = parentNode.getParentNode()) {
            if (C7019kk.m27469x1(parentNode, C13981tl.class)) {
                C13981tl c13981tl = (C13981tl) parentNode;
                if (c13981tl.m65904jd()) {
                    c13950o3.mo65708kk();
                    IEnumerator it = c13981tl.getAttributes().iterator();
                    while (it.hasNext()) {
                        try {
                            C13940my c13940my = (C13940my) it.next();
                            if (C14113y2.m67363du(c13940my.getPrefix(), this.f46980k4.strXmlns) && !hashtable.contains(c13940my.getLocalName())) {
                                hashtable.addItem(c13940my.getLocalName(), c13940my.getLocalName());
                                c13950o3.mo65707k4(c13940my.getLocalName(), c13940my.getValue());
                            } else if (!z && c13940my.getPrefix().length() == 0 && C14113y2.m67363du(c13940my.getLocalName(), this.f46980k4.strXmlns)) {
                                c13950o3.mo65707k4(C14113y2.f47374k4, c13940my.getValue());
                                z = true;
                            } else if (i == 0 && C14113y2.m67363du(c13940my.getPrefix(), this.f46980k4.strXml) && C14113y2.m67363du(c13940my.getLocalName(), this.f46980k4.strSpace)) {
                                if ("default".equals(c13940my.getValue())) {
                                    i = 1;
                                } else if ("preserve".equals(c13940my.getValue())) {
                                    i = 2;
                                }
                            } else if (value == null && C14113y2.m67363du(c13940my.getPrefix(), this.f46980k4.strXml) && C14113y2.m67363du(c13940my.getLocalName(), this.f46980k4.strLang)) {
                                value = c13940my.getValue();
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
        return new C14015xb(nameTable, c13950o3, documentType == null ? null : documentType.getName(), documentType == null ? null : documentType.m65794kk(), documentType == null ? null : documentType.m65796to(), documentType == null ? null : documentType.m65790du(), baseURI, value, i);
    }

    /* JADX INFO: renamed from: k4 */
    private String m66203k4(String str) {
        return C14113y2.m67408k4("&", str, ";");
    }

    /* JADX INFO: renamed from: k4 */
    private void m66204k4(XmlDocument xmlDocument) {
        do {
            AbstractC13901ga abstractC13901gaM66199k4 = m66199k4(true);
            if (abstractC13901gaM66199k4 == null) {
                return;
            } else {
                xmlDocument.appendChildForLoad(abstractC13901gaM66199k4, xmlDocument);
            }
        } while (this.f46982x1.mo65026h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m66216k4(XmlDocument xmlDocument, AbstractC13912i5 abstractC13912i5, boolean z) {
        this.f46980k4 = xmlDocument;
        if (C14067j2.m66727k4(abstractC13912i5) == C7019kk.m27443k4((Class<?>) C13938ms.class)) {
            this.f46982x1 = ((C13938ms) abstractC13912i5).m65620wp();
        } else {
            this.f46982x1 = abstractC13912i5;
        }
        this.f46981kk = z;
        if (xmlDocument == null) {
            throw new ArgumentException(C13968ri.m65818k4("The document to be loaded could not be found."));
        }
        if (abstractC13912i5 == null) {
            throw new ArgumentException(C13968ri.m65818k4("There is no reader from which to load the document."));
        }
        xmlDocument.setBaseURI(abstractC13912i5.mo65040ne());
        if (abstractC13912i5.mo65029k4() != null && abstractC13912i5.mo65029k4().m65399rv() == 4) {
            xmlDocument.setSchemas(abstractC13912i5.mo65029k4().m65398ne());
        }
        if (this.f46982x1.mo65039m9() == 1 || this.f46982x1.mo65026h4()) {
            m66204k4(xmlDocument);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66205k4(InterfaceC13899g8 interfaceC13899g8, C13957q6 c13957q6) {
        Dictionary.ValueCollection.Enumerator<String, C13226tw> it;
        C13322zd c13322zd = (C13322zd) C7019kk.m27452k4((Object) interfaceC13899g8, C13322zd.class);
        if (c13322zd == null) {
            throw new XmlException("An internal error has occurred.", C14113y2.f47374k4);
        }
        c13957q6.m65793k4(c13322zd);
        this.f46980k4.setDtdSchemaInfo(c13322zd);
        if (c13322zd.m61887ks() != null) {
            it = c13322zd.m61887ks().getValues().iterator();
            while (it.hasNext()) {
                try {
                    C13226tw next = it.next();
                    c13957q6.m65797x1().mo65163k4(new C14037ze(next.m61623k4().m65289x1(), next.m61625kk(), next.m61626x1(), this.f46980k4));
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (c13322zd.m61868c5() != null) {
            Dictionary.ValueCollection.Enumerator<C13890ei, C13116n3> it2 = c13322zd.m61868c5().getValues().iterator();
            while (it2.hasNext()) {
                try {
                    C13116n3 next2 = it2.next();
                    C13966r7 c13966r7 = new C13966r7(next2.m61222up().m65289x1(), next2.m61205ix(), next2.m61214ks(), next2.m61230yj(), next2.m61216ne().m65287kk() ? null : next2.m61216ne().m65289x1(), this.f46980k4);
                    c13966r7.m65816k4(next2.m61196ar());
                    c13957q6.m65792k4().mo65163k4(c13966r7);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        if (c13322zd.m61874jd() != null) {
            it = c13322zd.m61874jd().getValues().iterator();
            while (it.hasNext()) {
                try {
                    C13116n3 next3 = it.next();
                    C13966r7 c13966r72 = new C13966r7(next3.m61222up().m65289x1(), next3.m61205ix(), next3.m61214ks(), next3.m61230yj(), next3.m61216ne().m65287kk() ? null : next3.m61216ne().m65289x1(), this.f46980k4);
                    c13966r72.m65816k4(next3.m61196ar());
                    c13957q6.m65792k4().mo65163k4(c13966r72);
                } finally {
                    if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        throw th;
                    }
                    it.dispose();
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        this.f46980k4.setEntities(c13957q6.m65792k4());
        Dictionary.Enumerator<C13890ei, C13125nk> it3 = c13322zd.m61888m9().iterator();
        if (it3 != null) {
            it3.reset();
            while (it3.hasNext()) {
                C13125nk c13125nk = (C13125nk) it3.getValue();
                if (c13125nk.m61281uz() != null) {
                    Dictionary.Enumerator<C13890ei, C13061k5> it4 = c13125nk.m61281uz().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            C13061k5 c13061k5 = (C13061k5) it4.getValue();
                            if (c13061k5.m61429b3().mo60016c5() == 1) {
                                XmlDocument xmlDocument = this.f46980k4;
                                xmlDocument.addIdInfo(xmlDocument.addXmlName(c13125nk.m61428ar(), c13125nk.m61443qq().m65289x1(), C14113y2.f47374k4, null), this.f46980k4.addAttrXmlName(c13061k5.m61428ar(), c13061k5.m61443qq().m65289x1(), C14113y2.f47374k4, null));
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66206k4(AbstractC13901ga abstractC13901ga, boolean z) {
        AbstractC13901ga c13854aq;
        AbstractC13912i5 abstractC13912i5 = this.f46982x1;
        while (abstractC13912i5.mo65021dy()) {
            int iMo65028jd = abstractC13912i5.mo65028jd();
            if (iMo65028jd == 3) {
                c13854aq = z ? new C13854aq(abstractC13912i5.mo65042rv(), this.f46980k4) : this.f46980k4.createTextNode(abstractC13912i5.mo65042rv());
            } else {
                if (iMo65028jd != 5) {
                    if (iMo65028jd != 16) {
                        throw m66198k4(abstractC13912i5.mo65028jd());
                    }
                    return;
                }
                c13854aq = z ? new C13947nk(this.f46982x1.mo65023fa(), this.f46980k4) : this.f46980k4.createEntityReference(this.f46982x1.mo65023fa());
                if (abstractC13912i5.mo65027ix()) {
                    abstractC13912i5.mo65016b3();
                    m66206k4(c13854aq, z);
                    if (c13854aq.getFirstChild() == null) {
                        c13854aq.appendChildForLoad(z ? new C13854aq(C14113y2.f47374k4) : this.f46980k4.createTextNode(C14113y2.f47374k4), this.f46980k4);
                    }
                }
            }
            abstractC13901ga.appendChildForLoad(c13854aq, this.f46980k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m66217k4(C13940my c13940my, String str) {
        m66215k4(c13940my, str, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m66218k4(C13947nk c13947nk) {
        boolean zM27456k4;
        XmlDocument ownerDocument = c13947nk.getOwnerDocument();
        this.f46980k4 = ownerDocument;
        boolean zIsLoading = ownerDocument.isLoading();
        this.f46980k4.setLoading(true);
        switch (f46979to.m27428k4(c13947nk.getName())) {
            case 5:
                c13947nk.appendChildForLoad(this.f46980k4.createTextNode("<"), this.f46980k4);
                this.f46980k4.setLoading(zIsLoading);
                return;
            case 6:
                c13947nk.appendChildForLoad(this.f46980k4.createTextNode(">"), this.f46980k4);
                this.f46980k4.setLoading(zIsLoading);
                return;
            case 7:
                c13947nk.appendChildForLoad(this.f46980k4.createTextNode("&"), this.f46980k4);
                this.f46980k4.setLoading(zIsLoading);
                return;
            case 8:
                c13947nk.appendChildForLoad(this.f46980k4.createTextNode("'"), this.f46980k4);
                this.f46980k4.setLoading(zIsLoading);
                return;
            case 9:
                c13947nk.appendChildForLoad(this.f46980k4.createTextNode("\""), this.f46980k4);
                this.f46980k4.setLoading(zIsLoading);
                return;
            default:
                IEnumerator it = this.f46980k4.getEntities().iterator();
                while (it.hasNext()) {
                    try {
                        if (C13851ai.m65152k4(((C13966r7) it.next()).getName(), c13947nk.getName())) {
                            m66215k4(c13947nk, m66203k4(c13947nk.getName()), 5);
                            if (zM27456k4) {
                                return;
                            } else {
                                return;
                            }
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            ((IDisposable) it).dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                if (this.f46980k4.getActualLoadingStatus()) {
                    this.f46980k4.setLoading(zIsLoading);
                    throw new XmlException("Reference to undeclared parameter entity '{0}'.", c13947nk.getName());
                }
                c13947nk.appendChildForLoad(this.f46980k4.createTextNode(""), this.f46980k4);
                this.f46980k4.setLoading(zIsLoading);
                return;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m66219k4(C13957q6 c13957q6) {
        XmlDocument ownerDocument = c13957q6.getOwnerDocument();
        if (ownerDocument.hasSetResolver()) {
            m66207k4(c13957q6, true, ownerDocument.getResolver());
        } else {
            m66207k4(c13957q6, false, (AbstractC13943n5) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66207k4(C13957q6 c13957q6, boolean z, AbstractC13943n5 abstractC13943n5) {
        this.f46980k4 = c13957q6.getOwnerDocument();
        C13985tt c13985tt = new C13985tt("", 1, new C14015xb(null, new C13950o3(this.f46980k4.getNameTable()), null, null, null, null, this.f46980k4.getBaseURI(), C14113y2.f47374k4, 0));
        c13985tt.m66130x1(c13957q6.m65791h4());
        if (z) {
            c13985tt.m66099k4(abstractC13943n5);
        }
        m66205k4(C13931lr.m65536k4().mo65609k4(this.f46980k4.getBaseURI(), c13957q6.getName(), c13957q6.m65794kk(), c13957q6.m65796to(), c13957q6.m65790du(), new C13985tt.x1(c13985tt)), c13957q6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m66220k4(C13966r7 c13966r7) {
        m66215k4(c13966r7, m66203k4(c13966r7.getName()), 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m66208k4(C13981tl c13981tl, C13950o3 c13950o3, boolean z) {
        c13950o3.mo65708kk();
        C13857b1 attributes = c13981tl.getAttributes();
        int iM65634x1 = attributes.m65634x1();
        if (z && iM65634x1 > 0) {
            for (int i = iM65634x1 - 1; i >= 0; i--) {
                C13940my c13940myM65164k4 = attributes.m65164k4(i);
                if (C14113y2.m67363du(c13940myM65164k4.getPrefix(), this.f46980k4.strXmlns)) {
                    String strMo13292k4 = c13950o3.mo13292k4(c13940myM65164k4.getLocalName());
                    if (strMo13292k4 == null) {
                        c13950o3.mo65707k4(c13940myM65164k4.getLocalName(), c13940myM65164k4.getValue());
                    } else if (C14113y2.m67363du(c13940myM65164k4.getValue(), strMo13292k4)) {
                        c13981tl.getAttributes().mo65168kk(i);
                    }
                } else if (c13940myM65164k4.getPrefix().length() == 0 && C14113y2.m67363du(c13940myM65164k4.getLocalName(), this.f46980k4.strXmlns)) {
                    String strMo23227x1 = c13950o3.mo23227x1();
                    if (strMo23227x1 != null) {
                        if (C14113y2.m67363du(c13940myM65164k4.getValue(), strMo23227x1)) {
                        }
                    }
                }
            }
        }
        for (AbstractC13901ga firstChild = c13981tl.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) firstChild, C13981tl.class);
            if (c13981tl2 != null) {
                m66208k4(c13981tl2, c13950o3, true);
            }
        }
        c13950o3.mo65709to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m66221k4(C13981tl c13981tl, String str) {
        C13950o3 c13950o3M66215k4 = m66215k4(c13981tl, str, 1);
        if (c13981tl.getChildNodes().mo23932k4() > 0) {
            m66208k4(c13981tl, c13950o3M66215k4, false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66209k4(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        strArr[0] = null;
        strArr2[0] = null;
        strArr3[0] = null;
        C13985tt c13985tt = new C13985tt(str, (C14015xb) null);
        try {
            c13985tt.mo65026h4();
            if (c13985tt.mo65036kk("version")) {
                strArr[0] = c13985tt.mo65042rv();
            }
            if (c13985tt.mo65036kk("encoding")) {
                strArr2[0] = c13985tt.mo65042rv();
            }
            if (c13985tt.mo65036kk(HTMLWriter.STANDALONE)) {
                strArr3[0] = c13985tt.mo65042rv();
            }
            c13985tt.mo65049um();
        } catch (Throwable th) {
            c13985tt.mo65049um();
            throw th;
        }
    }
}
