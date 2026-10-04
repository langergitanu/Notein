package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p532yu.AbstractC13319z7;
import com.aspose.slides.internal.p532yu.C13061k5;
import com.aspose.slides.internal.p532yu.C13125nk;
import com.aspose.slides.internal.p532yu.C13129ny;
import com.aspose.slides.internal.p532yu.C13322zd;
import com.aspose.slides.internal.p532yu.C13329zn;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14095u1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class XmlDocument extends AbstractC13901ga {
    public final AbstractC7018k4<AbstractC13974sc> NodeChanged;
    public AbstractC13974sc NodeChangedDelegate;
    public final AbstractC7018k4<AbstractC13974sc> NodeChanging;
    public AbstractC13974sc NodeChangingDelegate;
    public final AbstractC7018k4<AbstractC13974sc> NodeInserted;
    public AbstractC13974sc NodeInsertedDelegate;
    public final AbstractC7018k4<AbstractC13974sc> NodeInserting;
    public AbstractC13974sc NodeInsertingDelegate;
    public final AbstractC7018k4<AbstractC13974sc> NodeRemoved;
    public AbstractC13974sc NodeRemovedDelegate;
    public final AbstractC7018k4<AbstractC13974sc> NodeRemoving;
    public AbstractC13974sc NodeRemovingDelegate;
    public boolean bSetResolver;
    public String baseURI;

    /* JADX INFO: renamed from: c5 */
    private boolean f46306c5;

    /* JADX INFO: renamed from: ck */
    private boolean f46307ck;

    /* JADX INFO: renamed from: du */
    private Hashtable f46308du;

    /* JADX INFO: renamed from: dy */
    private C13129ny f46309dy;
    public boolean fCDataNodesPresent;
    public boolean fEntRefNodesPresent;

    /* JADX INFO: renamed from: fa */
    private boolean f46310fa;

    /* JADX INFO: renamed from: h4 */
    private Hashtable f46311h4;

    /* JADX INFO: renamed from: jd */
    private boolean f46312jd;

    /* JADX INFO: renamed from: k4 */
    private C13922k1 f46313k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC14007wt f46314kk;

    /* JADX INFO: renamed from: m9 */
    private C13322zd f46315m9;
    public Object objLock;
    public String strCDataSectionName;
    public String strCommentName;
    public String strDocumentFragmentName;
    public String strDocumentName;
    public String strEmpty;
    public String strEntityName;
    public String strID;
    public String strLang;
    public String strNonSignificantWhitespaceName;
    public String strReservedXml;
    public String strReservedXmlns;
    public String strSignificantWhitespaceName;
    public String strSpace;
    public String strTextName;
    public String strXml;
    public String strXmlns;

    /* JADX INFO: renamed from: to */
    private C13941n0 f46316to;

    /* JADX INFO: renamed from: up */
    private AbstractC13943n5 f46317up;

    /* JADX INFO: renamed from: x1 */
    private C13998v4 f46318x1;

    /* JADX INFO: renamed from: yj */
    private C13940my f46319yj;
    public static C14025yd EmptyEnumerator = new C14025yd();
    public static InterfaceC13298y4 NotKnownSchemaInfo = new C13329zn(0);
    public static InterfaceC13298y4 ValidSchemaInfo = new C13329zn(1);
    public static InterfaceC13298y4 InvalidSchemaInfo = new C13329zn(2);

    public XmlDocument() {
        this(new C13922k1());
    }

    public static void checkName(String str) {
        int iM66222k4 = C13988u1.m66222k4(str, 0);
        if (iM66222k4 < str.length()) {
            throw new XmlException("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(str, iM66222k4));
        }
    }

    public static boolean isTextNode(int i) {
        return i == 3 || i == 4 || i == 13 || i == 14;
    }

    /* JADX INFO: renamed from: k4 */
    private C13125nk m64995k4(C13981tl c13981tl) {
        C13322zd dtdSchemaInfo = getDtdSchemaInfo();
        if (dtdSchemaInfo != null) {
            C13890ei c13890ei = new C13890ei(c13981tl.getLocalName(), dtdSchemaInfo.m61869ck() == 1 ? c13981tl.getPrefix() : c13981tl.getNamespaceURI());
            C13125nk[] c13125nkArr = {null};
            boolean zTryGetValue = dtdSchemaInfo.m61888m9().tryGetValue(c13890ei, c13125nkArr);
            C13125nk c13125nk = c13125nkArr[0];
            if (zTryGetValue) {
                return c13125nk;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m65005x1(int i, AbstractC13901ga abstractC13901ga) {
        while (abstractC13901ga != null) {
            if (abstractC13901ga.getNodeType() == i) {
                return true;
            }
            abstractC13901ga = abstractC13901ga.getNextSibling();
        }
        return false;
    }

    public final C14023y6 addAttrXmlName(String str, String str2, String str3, InterfaceC13298y4 interfaceC13298y4) {
        C14023y6 c14023y6AddXmlName = addXmlName(str, str2, str3, interfaceC13298y4);
        if (!isLoading()) {
            String strM66349jd = c14023y6AddXmlName.m66349jd();
            String strM66345c5 = c14023y6AddXmlName.m66345c5();
            String strM66347dy = c14023y6AddXmlName.m66347dy();
            String str4 = this.strXmlns;
            if ((strM66349jd == str4 || (strM66349jd == this.strEmpty && strM66347dy == str4)) ^ (strM66345c5 == this.strReservedXmlns)) {
                throw new ArgumentException(C13968ri.m65819k4("The namespace declaration attribute has an incorrect 'namespaceURI': '{0}'.", str3));
            }
        }
        return c14023y6AddXmlName;
    }

    public final void addDefaultAttributes(C13981tl c13981tl) {
        String strM61428ar;
        C13322zd dtdSchemaInfo = getDtdSchemaInfo();
        C13125nk c13125nkM64995k4 = m64995k4(c13981tl);
        if (c13125nkM64995k4 == null || c13125nkM64995k4.m61281uz() == null) {
            return;
        }
        Dictionary.Enumerator<C13890ei, C13061k5> it = c13125nkM64995k4.m61281uz().iterator();
        while (it.hasNext()) {
            C13061k5 c13061k5 = (C13061k5) it.getValue();
            if (c13061k5.m61430bv() == 0 || c13061k5.m61430bv() == 3) {
                String str = C14113y2.f47374k4;
                String strM65289x1 = c13061k5.m61443qq().m65289x1();
                String strM65284k4 = C14113y2.f47374k4;
                if (dtdSchemaInfo.m61869ck() == 1) {
                    strM61428ar = c13061k5.m61443qq().m65284k4();
                } else {
                    strM61428ar = c13061k5.m61428ar();
                    strM65284k4 = c13061k5.m61443qq().m65284k4();
                }
                c13981tl.m65905k4(m64999k4(c13061k5, strM61428ar, strM65289x1, strM65284k4));
            }
        }
    }

    public final void addElementWithId(String str, C13981tl c13981tl) {
        Hashtable hashtable = this.f46308du;
        if (hashtable != null && hashtable.contains(str)) {
            ArrayList arrayList = (ArrayList) this.f46308du.get_Item(str);
            if (m65001k4(arrayList, c13981tl) == null) {
                arrayList.addItem(new C14095u1(c13981tl));
                return;
            }
            return;
        }
        if (this.f46308du == null) {
            this.f46308du = new Hashtable();
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addItem(new C14095u1(c13981tl));
        this.f46308du.addItem(str, arrayList2);
    }

    public final boolean addIdInfo(C14023y6 c14023y6, C14023y6 c14023y62) {
        Hashtable hashtable = this.f46311h4;
        if (hashtable != null && hashtable.get_Item(c14023y6) != null) {
            return false;
        }
        if (this.f46311h4 == null) {
            this.f46311h4 = new Hashtable();
        }
        this.f46311h4.addItem(c14023y6, c14023y62);
        return true;
    }

    public final C14023y6 addXmlName(String str, String str2, String str3, InterfaceC13298y4 interfaceC13298y4) {
        return this.f46318x1.m66276x1(str, str2, str3, interfaceC13298y4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void afterEvent(C13979sz c13979sz) {
        AbstractC13974sc abstractC13974sc;
        if (c13979sz != null) {
            int iM65893k4 = c13979sz.m65893k4();
            if (iM65893k4 == 0) {
                AbstractC13974sc abstractC13974sc2 = this.NodeInsertedDelegate;
                if (abstractC13974sc2 != null) {
                    abstractC13974sc2.mo65207k4(this, c13979sz);
                    return;
                }
                return;
            }
            if (iM65893k4 != 1) {
                if (iM65893k4 == 2 && (abstractC13974sc = this.NodeChangedDelegate) != null) {
                    abstractC13974sc.mo65207k4(this, c13979sz);
                    return;
                }
                return;
            }
            AbstractC13974sc abstractC13974sc3 = this.NodeRemovedDelegate;
            if (abstractC13974sc3 != null) {
                abstractC13974sc3.mo65207k4(this, c13979sz);
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga appendChildForLoad(AbstractC13901ga abstractC13901ga, XmlDocument xmlDocument) {
        if (!isValidChildType(abstractC13901ga.getNodeType())) {
            throw new InvalidOperationException(C13968ri.m65818k4("The specified node cannot be inserted as the valid child of this node, because the specified node is the wrong type."));
        }
        if (!canInsertAfter(abstractC13901ga, getLastChild())) {
            throw new InvalidOperationException(C13968ri.m65818k4("Cannot insert the node in the specified location."));
        }
        C13979sz insertEventArgsForLoad = getInsertEventArgsForLoad(abstractC13901ga, this);
        if (insertEventArgsForLoad != null) {
            beforeEvent(insertEventArgsForLoad);
        }
        AbstractC14007wt abstractC14007wt = (AbstractC14007wt) abstractC13901ga;
        AbstractC14007wt abstractC14007wt2 = this.f46314kk;
        if (abstractC14007wt2 == null) {
            abstractC14007wt.f47053x1 = abstractC14007wt;
        } else {
            abstractC14007wt.f47053x1 = abstractC14007wt2.f47053x1;
            abstractC14007wt2.f47053x1 = abstractC14007wt;
        }
        this.f46314kk = abstractC14007wt;
        abstractC14007wt.setParentForLoad(this);
        if (insertEventArgsForLoad != null) {
            afterEvent(insertEventArgsForLoad);
        }
        return abstractC14007wt;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void beforeEvent(C13979sz c13979sz) {
        AbstractC13974sc abstractC13974sc;
        if (c13979sz != null) {
            int iM65893k4 = c13979sz.m65893k4();
            if (iM65893k4 == 0) {
                AbstractC13974sc abstractC13974sc2 = this.NodeInsertingDelegate;
                if (abstractC13974sc2 != null) {
                    abstractC13974sc2.mo65207k4(this, c13979sz);
                    return;
                }
                return;
            }
            if (iM65893k4 != 1) {
                if (iM65893k4 == 2 && (abstractC13974sc = this.NodeChangingDelegate) != null) {
                    abstractC13974sc.mo65207k4(this, c13979sz);
                    return;
                }
                return;
            }
            AbstractC13974sc abstractC13974sc3 = this.NodeRemovingDelegate;
            if (abstractC13974sc3 != null) {
                abstractC13974sc3.mo65207k4(this, c13979sz);
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean canInsertAfter(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (abstractC13901ga2 == null) {
            abstractC13901ga2 = getLastChild();
        }
        if (abstractC13901ga2 == null) {
            return true;
        }
        int nodeType = abstractC13901ga.getNodeType();
        return nodeType != 1 ? nodeType != 10 ? nodeType == 7 || nodeType == 8 || nodeType == 13 || nodeType == 14 : !m65004k4(1, abstractC13901ga2) : !m65005x1(10, abstractC13901ga2.getNextSibling());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean canInsertBefore(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (abstractC13901ga2 == null) {
            abstractC13901ga2 = getFirstChild();
        }
        if (abstractC13901ga2 == null) {
            return true;
        }
        int nodeType = abstractC13901ga.getNodeType();
        if (nodeType != 1) {
            if (nodeType != 10) {
                return nodeType != 17 ? (nodeType == 7 || nodeType == 8) && abstractC13901ga2.getNodeType() != 17 : abstractC13901ga2 == getFirstChild();
            }
            if (abstractC13901ga2.getNodeType() != 17) {
                return !m65004k4(1, abstractC13901ga2.getPreviousSibling());
            }
        } else if (abstractC13901ga2.getNodeType() != 17) {
            return !m65005x1(10, abstractC13901ga2);
        }
        return false;
    }

    public final boolean canReportValidity() {
        return this.f46306c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        XmlDocument xmlDocumentM65497k4 = getImplementation().m65497k4();
        xmlDocumentM65497k4.setBaseURI(this.baseURI);
        if (z) {
            xmlDocumentM65497k4.m65003k4(this, xmlDocumentM65497k4, z);
        }
        return xmlDocumentM65497k4;
    }

    public final int convertToNodeType(String str) {
        if ("element".equals(str)) {
            return 1;
        }
        if ("attribute".equals(str)) {
            return 2;
        }
        if ("text".equals(str)) {
            return 3;
        }
        if ("cdatasection".equals(str)) {
            return 4;
        }
        if ("entityreference".equals(str)) {
            return 5;
        }
        if ("entity".equals(str)) {
            return 6;
        }
        if ("processinginstruction".equals(str)) {
            return 7;
        }
        if ("comment".equals(str)) {
            return 8;
        }
        if ("document".equals(str)) {
            return 9;
        }
        if ("documenttype".equals(str)) {
            return 10;
        }
        if ("documentfragment".equals(str)) {
            return 11;
        }
        if ("notation".equals(str)) {
            return 12;
        }
        if ("significantwhitespace".equals(str)) {
            return 14;
        }
        if ("whitespace".equals(str)) {
            return 13;
        }
        throw new ArgumentException(C13968ri.m65819k4("'{0}' does not represent any 'XmlNodeType'.", str));
    }

    public final C13940my createAttribute(String str) {
        String str2 = C14113y2.f47374k4;
        String[] strArr = {str2};
        String[] strArr2 = {str2};
        AbstractC13901ga.splitName(str, strArr, strArr2);
        String str3 = strArr[0];
        String str4 = strArr2[0];
        String[] strArr3 = {str2};
        setDefaultNamespace(str3, str4, strArr3);
        return createAttribute(str3, str4, strArr3[0]);
    }

    public C14040zm createCDataSection(String str) {
        this.fCDataNodesPresent = true;
        return new C14040zm(str, this);
    }

    public C13959qk createComment(String str) {
        return new C13959qk(str, this);
    }

    public C13940my createDefaultAttribute(String str, String str2, String str3) {
        return new C13967r9(str, str2, str3, this);
    }

    public C13932ly createDocumentFragment() {
        return new C13932ly(this);
    }

    public C13957q6 createDocumentType(String str, String str2, String str3, String str4) {
        return new C13957q6(str, str2, str3, str4, this);
    }

    public final C13981tl createElement(String str) {
        String str2 = C14113y2.f47374k4;
        String[] strArr = {str2};
        String[] strArr2 = {str2};
        AbstractC13901ga.splitName(str, strArr, strArr2);
        return createElement(strArr[0], strArr2[0], C14113y2.f47374k4);
    }

    public C13947nk createEntityReference(String str) {
        return new C13947nk(str, this);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga, com.aspose.slides.internal.p418tf.InterfaceC10927k4
    public AbstractC10925du createNavigator() {
        return createNavigator(this);
    }

    public AbstractC13901ga createNode(int i, String str, String str2) {
        return createNode(i, null, str, str2);
    }

    public C13954ph createProcessingInstruction(String str, String str2) {
        return new C13954ph(str, str2, this);
    }

    public C13862bp createSignificantWhitespace(String str) {
        return new C13862bp(str, this);
    }

    public C13854aq createTextNode(String str) {
        return new C13854aq(str, this);
    }

    public C13939mt createWhitespace(String str) {
        return new C13939mt(str, this);
    }

    public C13976sq createXmlDeclaration(String str, String str2, String str3) {
        return new C13976sq(str, str2, str3, this);
    }

    public final boolean getActualLoadingStatus() {
        return this.f46312jd;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getBaseURI() {
        return this.baseURI;
    }

    public C13976sq getDeclaration() {
        if (hasChildNodes()) {
            return (C13976sq) C7019kk.m27452k4((Object) getFirstChild(), C13976sq.class);
        }
        return null;
    }

    public final C13940my getDefaultAttribute(C13981tl c13981tl, String str, String str2, String str3) {
        C13322zd dtdSchemaInfo = getDtdSchemaInfo();
        C13125nk c13125nkM64995k4 = m64995k4(c13981tl);
        if (c13125nkM64995k4 == null || c13125nkM64995k4.m61281uz() == null) {
            return null;
        }
        Dictionary.Enumerator<C13890ei, C13061k5> it = c13125nkM64995k4.m61281uz().iterator();
        while (it.hasNext()) {
            C13061k5 c13061k5 = (C13061k5) it.getValue();
            if (c13061k5.m61430bv() == 0 || c13061k5.m61430bv() == 3) {
                if (C14113y2.m67363du(c13061k5.m61443qq().m65289x1(), str2) && ((dtdSchemaInfo.m61869ck() == 1 && C14113y2.m67363du(c13061k5.m61443qq().m65284k4(), str)) || (dtdSchemaInfo.m61869ck() != 1 && C14113y2.m67363du(c13061k5.m61443qq().m65284k4(), str3)))) {
                    return m64999k4(c13061k5, str, str2, str3);
                }
            }
        }
        return null;
    }

    public C13981tl getDocumentElement() {
        return (C13981tl) findChild(1);
    }

    public C13957q6 getDocumentType() {
        return (C13957q6) findChild(10);
    }

    public final C13322zd getDtdSchemaInfo() {
        return this.f46315m9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13981tl getElementById(String str) {
        ArrayList arrayList;
        Hashtable hashtable = this.f46308du;
        if (hashtable == null || (arrayList = (ArrayList) hashtable.get_Item(str)) == null) {
            return null;
        }
        IEnumerator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                C13981tl c13981tl = (C13981tl) ((C14095u1) it.next()).m67304k4();
                if (c13981tl != null && c13981tl.isConnected()) {
                    return c13981tl;
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

    public AbstractC13911hq getElementsByTagName(String str) {
        return new C13956q3(this, str);
    }

    public final String getEncoding() {
        C13976sq declaration = getDeclaration();
        if (declaration != null) {
            return declaration.m65888x1();
        }
        return null;
    }

    public final C13941n0 getEntities() {
        if (this.f46316to == null) {
            this.f46316to = new C13941n0(this);
        }
        return this.f46316to;
    }

    public final C13966r7 getEntityNode(String str) {
        C13941n0 c13941n0M65792k4;
        if (getDocumentType() == null || (c13941n0M65792k4 = getDocumentType().m65792k4()) == null) {
            return null;
        }
        return (C13966r7) c13941n0M65792k4.m65636x1(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public C13979sz getEventArgs(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2, AbstractC13901ga abstractC13901ga3, String str, String str2, int i) {
        this.f46306c5 = false;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && this.NodeChangingDelegate == null && this.NodeChangedDelegate == null) {
                    return null;
                }
            } else if (this.NodeRemovingDelegate == null && this.NodeRemovedDelegate == null) {
                return null;
            }
        } else if (this.NodeInsertingDelegate == null && this.NodeInsertedDelegate == null) {
            return null;
        }
        return new C13979sz(abstractC13901ga, abstractC13901ga2, abstractC13901ga3, str, str2, i);
    }

    public final C14023y6 getIDInfoByElement(C14023y6 c14023y6) {
        if (this.f46311h4 == null) {
            return null;
        }
        return m65000k4(c14023y6);
    }

    public final C13922k1 getImplementation() {
        return this.f46313k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerXml() {
        return super.getInnerXml();
    }

    public final C13979sz getInsertEventArgsForLoad(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (this.NodeInsertingDelegate == null && this.NodeInsertedDelegate == null) {
            return null;
        }
        String value = abstractC13901ga.getValue();
        return new C13979sz(abstractC13901ga, null, abstractC13901ga2, value, value, 0);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC14007wt getLastNode() {
        return this.f46314kk;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return this.strDocumentName;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return this.strDocumentName;
    }

    public final AbstractC13883dt getNameTable() {
        return this.f46313k4.m65498x1();
    }

    public final C13940my getNamespaceXml() {
        if (this.f46319yj == null) {
            C13940my c13940my = new C13940my(addAttrXmlName(this.strXmlns, this.strXml, this.strReservedXmlns, null), this);
            this.f46319yj = c13940my;
            c13940my.setValue(this.strReservedXml);
        }
        return this.f46319yj;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 9;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public XmlDocument getOwnerDocument() {
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getParentNode() {
        return null;
    }

    public final boolean getPreserveWhitespace() {
        return this.f46307ck;
    }

    public final AbstractC13943n5 getResolver() {
        return this.f46317up;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public InterfaceC13298y4 getSchemaInfo() {
        C13981tl documentElement;
        if (this.f46306c5 && (documentElement = getDocumentElement()) != null) {
            int iAk_ = documentElement.getSchemaInfo().ak_();
            if (iAk_ == 1) {
                return ValidSchemaInfo;
            }
            if (iAk_ == 2) {
                return InvalidSchemaInfo;
            }
        }
        return NotKnownSchemaInfo;
    }

    public final C13129ny getSchemas() {
        if (this.f46309dy == null) {
            this.f46309dy = new C13129ny(getNameTable());
        }
        return this.f46309dy;
    }

    public final String getStandalone() {
        C13976sq declaration = getDeclaration();
        if (declaration != null) {
            return declaration.m65886kk();
        }
        return null;
    }

    public final AbstractC6747ar getTextEncoding() {
        if (getDeclaration() == null) {
            return null;
        }
        String strM65888x1 = getDeclaration().m65888x1();
        if (strM65888x1.length() > 0) {
            return AbstractC6747ar.m26640kk(strM65888x1);
        }
        return null;
    }

    public final String getVersion() {
        C13976sq declaration = getDeclaration();
        if (declaration != null) {
            return declaration.m65884k4();
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXPNodeType() {
        return 0;
    }

    public final C14023y6 getXmlName(String str, String str2, String str3, InterfaceC13298y4 interfaceC13298y4) {
        return this.f46318x1.m66275k4(str, str2, str3, interfaceC13298y4);
    }

    public final boolean hasEntityReferences() {
        return this.fEntRefNodesPresent;
    }

    public final boolean hasSetResolver() {
        return this.bSetResolver;
    }

    public AbstractC13901ga importNode(AbstractC13901ga abstractC13901ga, boolean z) {
        return m64997k4(abstractC13901ga, z);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isContainer() {
        return true;
    }

    public final boolean isLoading() {
        return this.f46310fa;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isReadOnly() {
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isValidChildType(int i) {
        if (i == 1) {
            if (getDocumentElement() == null) {
                return true;
            }
            throw new InvalidOperationException(C13968ri.m65818k4("This document already has a 'DocumentElement' node."));
        }
        if (i == 10) {
            if (getDocumentType() == null) {
                return true;
            }
            throw new InvalidOperationException(C13968ri.m65818k4("This document already has a 'DocumentType' node."));
        }
        if (i != 17) {
            return i == 7 || i == 8 || i == 13 || i == 14;
        }
        if (getDeclaration() == null) {
            return true;
        }
        throw new InvalidOperationException(C13968ri.m65818k4("This document already has an 'XmlDeclaration' node."));
    }

    public void load(AbstractC3150x6 abstractC3150x6) {
        C13938ms c13938msM64998k4 = m64998k4(new C13938ms(abstractC3150x6, getNameTable()));
        try {
            load(c13938msM64998k4);
        } finally {
            c13938msM64998k4.m65620wp().m66120to(false);
        }
    }

    public void loadXml(String str) {
        C13938ms c13938msM64998k4 = m64998k4(new C13938ms(new C3144um(str), getNameTable()));
        try {
            load(c13938msM64998k4);
        } finally {
            c13938msM64998k4.mo65049um();
        }
    }

    public AbstractC13901ga readNode(AbstractC13912i5 abstractC13912i5) {
        try {
            setLoading(true);
            return new C13987tw().m66214k4(this, abstractC13912i5);
        } finally {
            setLoading(false);
        }
    }

    public final void removeElementWithId(String str, C13981tl c13981tl) {
        ArrayList arrayList;
        C14095u1 c14095u1M65001k4;
        Hashtable hashtable = this.f46308du;
        if (hashtable == null || !hashtable.contains(str) || (c14095u1M65001k4 = m65001k4((arrayList = (ArrayList) this.f46308du.get_Item(str)), c13981tl)) == null) {
            return;
        }
        arrayList.removeItem(c14095u1M65001k4);
        if (arrayList.size() == 0) {
            this.f46308du.removeItem(str);
        }
    }

    public void save(AbstractC3124b3 abstractC3124b3) {
        C14012x3 c14012x3 = new C14012x3(abstractC3124b3);
        if (!this.f46307ck) {
            c14012x3.m66258k4(1);
        }
        save(c14012x3);
    }

    public final void setActualLoadingStatus(boolean z) {
        this.f46312jd = z;
    }

    public final void setBaseURI(String str) {
        this.baseURI = str;
    }

    public final void setDefaultNamespace(String str, String str2, String[] strArr) {
        if (C14113y2.m67363du(str, this.strXmlns) || (str.length() == 0 && C14113y2.m67363du(str2, this.strXmlns))) {
            strArr[0] = this.strReservedXmlns;
        } else if (C14113y2.m67363du(str, this.strXml)) {
            strArr[0] = this.strReservedXml;
        }
    }

    public final void setDtdSchemaInfo(C13322zd c13322zd) {
        this.f46315m9 = c13322zd;
    }

    public final void setEntities(C13941n0 c13941n0) {
        this.f46316to = c13941n0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerText(String str) {
        throw new InvalidOperationException(C13968ri.m65818k4("The 'InnerText' of a 'Document' node is read-only and cannot be set."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerXml(String str) {
        loadXml(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setLastNode(AbstractC14007wt abstractC14007wt) {
        this.f46314kk = abstractC14007wt;
    }

    public final void setLoading(boolean z) {
        this.f46310fa = z;
    }

    public final void setPreserveWhitespace(boolean z) {
        this.f46307ck = z;
    }

    public final void setSchemas(C13129ny c13129ny) {
        this.f46309dy = c13129ny;
    }

    public void setXmlResolver(AbstractC13943n5 abstractC13943n5) {
        this.f46317up = abstractC13943n5;
        if (!this.bSetResolver) {
            this.bSetResolver = true;
        }
        C13957q6 documentType = getDocumentType();
        if (documentType != null) {
            documentType.m65793k4((C13322zd) null);
        }
    }

    public final void validate(AbstractC13319z7 abstractC13319z7) {
        validate(abstractC13319z7, this);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((AbstractC13901ga) it.next()).writeTo(abstractC13958qb);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        writeContentTo(abstractC13958qb);
    }

    public XmlDocument(AbstractC13883dt abstractC13883dt) {
        this(new C13922k1(abstractC13883dt));
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC13901ga m64996k4(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga abstractC13901ga2 = null;
        while (isTextNode(abstractC13901ga.getNodeType())) {
            AbstractC13901ga previousSibling = abstractC13901ga.getPreviousSibling();
            if (previousSibling == null) {
                AbstractC13901ga parentNode = abstractC13901ga;
                while (true) {
                    if (parentNode.getParentNode() == null || parentNode.getParentNode().getNodeType() != 5) {
                        break;
                    }
                    if (parentNode.getParentNode().getPreviousSibling() != null) {
                        previousSibling = parentNode.getParentNode().getPreviousSibling();
                        break;
                    }
                    parentNode = parentNode.getParentNode();
                    if (parentNode == null) {
                        break;
                    }
                }
            }
            if (previousSibling == null) {
                return abstractC13901ga;
            }
            while (previousSibling.getNodeType() == 5) {
                previousSibling = previousSibling.getLastChild();
            }
            AbstractC13901ga abstractC13901ga3 = previousSibling;
            abstractC13901ga2 = abstractC13901ga;
            abstractC13901ga = abstractC13901ga3;
        }
        return abstractC13901ga2;
    }

    public final C13940my createAttribute(String str, String str2) {
        String str3 = C14113y2.f47374k4;
        String[] strArr = {str3};
        String[] strArr2 = {str3};
        AbstractC13901ga.splitName(str, strArr, strArr2);
        return createAttribute(strArr[0], strArr2[0], str2);
    }

    public final C13981tl createElement(String str, String str2) {
        String str3 = C14113y2.f47374k4;
        String[] strArr = {str3};
        String[] strArr2 = {str3};
        AbstractC13901ga.splitName(str, strArr, strArr2);
        return createElement(strArr[0], strArr2[0], str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC10925du createNavigator(AbstractC13901ga abstractC13901ga) {
        int nodeType = abstractC13901ga.getNodeType();
        if (nodeType != 3 && nodeType != 4) {
            if (nodeType != 5 && nodeType != 6 && nodeType != 10 && nodeType != 17) {
                switch (nodeType) {
                    case 13:
                        AbstractC13901ga parentNode = abstractC13901ga.getParentNode();
                        if (parentNode != null) {
                            do {
                                int nodeType2 = parentNode.getNodeType();
                                if (nodeType2 == 9 || nodeType2 == 2) {
                                    return null;
                                }
                                if (nodeType2 == 5) {
                                    parentNode = parentNode.getParentNode();
                                }
                            } while (parentNode != null);
                        }
                        break;
                }
                abstractC13901ga = m64996k4(abstractC13901ga);
            }
            return null;
        }
        AbstractC13901ga parentNode2 = abstractC13901ga.getParentNode();
        if (parentNode2 != null) {
            do {
                int nodeType3 = parentNode2.getNodeType();
                if (nodeType3 == 2) {
                    return null;
                }
                if (nodeType3 == 5) {
                    parentNode2 = parentNode2.getParentNode();
                }
            } while (parentNode2 != null);
        }
        abstractC13901ga = m64996k4(abstractC13901ga);
        return new C13945ne(this, abstractC13901ga);
    }

    public AbstractC13901ga createNode(int i, String str, String str2, String str3) {
        switch (i) {
            case 1:
                return str != null ? createElement(str, str2, str3) : createElement(str2, str3);
            case 2:
                return str != null ? createAttribute(str, str2, str3) : createAttribute(str2, str3);
            case 3:
                return createTextNode(C14113y2.f47374k4);
            case 4:
                return createCDataSection(C14113y2.f47374k4);
            case 5:
                return createEntityReference(str2);
            case 6:
            case 12:
            case 15:
            case 16:
            default:
                throw new ArgumentException(C13968ri.m65819k4("Cannot create node of type {0}.", Integer.valueOf(i)));
            case 7:
                return createProcessingInstruction(str2, C14113y2.f47374k4);
            case 8:
                return createComment(C14113y2.f47374k4);
            case 9:
                return new XmlDocument();
            case 10:
                String str4 = C14113y2.f47374k4;
                return createDocumentType(str2, str4, str4, str4);
            case 11:
                return createDocumentFragment();
            case 13:
                return createWhitespace(C14113y2.f47374k4);
            case 14:
                return createSignificantWhitespace(C14113y2.f47374k4);
            case 17:
                return createXmlDeclaration("1.0", null, null);
        }
    }

    public AbstractC13911hq getElementsByTagName(String str, String str2) {
        return new C13956q3(this, str, str2);
    }

    public void load(AbstractC3151yd abstractC3151yd) {
        C13938ms c13938msM64998k4 = m64998k4(new C13938ms(abstractC3151yd, getNameTable()));
        try {
            load(c13938msM64998k4);
        } finally {
            c13938msM64998k4.m65620wp().m66120to(false);
        }
    }

    public void save(AbstractC3150x6 abstractC3150x6) {
        C14012x3 c14012x3 = new C14012x3(abstractC3150x6, getTextEncoding());
        if (!this.f46307ck) {
            c14012x3.m66258k4(1);
        }
        writeTo(c14012x3);
        c14012x3.mo21896h4();
    }

    public final void validate(AbstractC13319z7 abstractC13319z7, AbstractC13901ga abstractC13901ga) {
        C13129ny c13129ny = this.f46309dy;
        if (c13129ny == null || c13129ny.m61337to() == 0) {
            throw new InvalidOperationException(C13968ri.m65818k4("The XmlSchemaSet on the document is either null or has no schemas in it. Provide Schema information before calling Validate."));
        }
        if (abstractC13901ga.getDocument() != this) {
            throw new ArgumentException(C13968ri.m65819k4("Cannot validate '{0}' because its owner document is not the current document.", "nodeToValidate"));
        }
        if (abstractC13901ga == this) {
            this.f46306c5 = false;
        }
        new C14027yj(this, this.f46309dy, abstractC13319z7).m66374k4(abstractC13901ga);
        if (abstractC13901ga == this) {
            this.f46306c5 = true;
        }
    }

    public XmlDocument(C13922k1 c13922k1) {
        this.NodeInserting = new C13990u5(this);
        this.NodeInserted = new C13868c4(this);
        this.NodeRemoving = new C13856av(this);
        this.NodeRemoved = new C14016xi(this);
        this.NodeChanging = new C13946nh(this);
        this.NodeChanged = new C13881dl(this);
        this.f46313k4 = c13922k1;
        this.f46318x1 = new C13998v4(this);
        AbstractC13883dt nameTable = getNameTable();
        nameTable.mo65266k4(C14113y2.f47374k4);
        this.strDocumentName = nameTable.mo65266k4("#document");
        this.strDocumentFragmentName = nameTable.mo65266k4("#document-fragment");
        this.strCommentName = nameTable.mo65266k4("#comment");
        this.strTextName = nameTable.mo65266k4("#text");
        this.strCDataSectionName = nameTable.mo65266k4("#cdata-section");
        this.strEntityName = nameTable.mo65266k4("#entity");
        this.strID = nameTable.mo65266k4("id");
        this.strNonSignificantWhitespaceName = nameTable.mo65266k4("#whitespace");
        this.strSignificantWhitespaceName = nameTable.mo65266k4("#significant-whitespace");
        this.strXmlns = nameTable.mo65266k4("xmlns");
        this.strXml = nameTable.mo65266k4("xml");
        this.strSpace = nameTable.mo65266k4("space");
        this.strLang = nameTable.mo65266k4(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL);
        this.strReservedXmlns = nameTable.mo65266k4("http://www.w3.org/2000/xmlns/");
        this.strReservedXml = nameTable.mo65266k4("http://www.w3.org/XML/1998/namespace");
        this.strEmpty = nameTable.mo65266k4(C14113y2.f47374k4);
        this.baseURI = C14113y2.f47374k4;
        this.objLock = new Object();
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC13901ga m64997k4(AbstractC13901ga abstractC13901ga, boolean z) {
        if (abstractC13901ga == null) {
            throw new InvalidOperationException(C13968ri.m65818k4("Cannot import a null node."));
        }
        switch (abstractC13901ga.getNodeType()) {
            case 1:
                C13981tl c13981tlCreateElement = createElement(abstractC13901ga.getPrefix(), abstractC13901ga.getLocalName(), abstractC13901ga.getNamespaceURI());
                m65002k4(abstractC13901ga, (AbstractC13901ga) c13981tlCreateElement);
                if (z) {
                    m65003k4(abstractC13901ga, c13981tlCreateElement, z);
                }
                return c13981tlCreateElement;
            case 2:
                C13940my c13940myCreateAttribute = createAttribute(abstractC13901ga.getPrefix(), abstractC13901ga.getLocalName(), abstractC13901ga.getNamespaceURI());
                m65003k4(abstractC13901ga, c13940myCreateAttribute, true);
                return c13940myCreateAttribute;
            case 3:
                return createTextNode(abstractC13901ga.getValue());
            case 4:
                return createCDataSection(abstractC13901ga.getValue());
            case 5:
                return createEntityReference(abstractC13901ga.getName());
            case 6:
            case 9:
            case 12:
            case 15:
            case 16:
            default:
                throw new InvalidOperationException(C14113y2.m67391k4(C11697x1.m55250kk(), C13968ri.m65818k4("Cannot import nodes of type '{0}'."), C14042ak.m66410k4(C13929li.class, abstractC13901ga.getNodeType())));
            case 7:
                return createProcessingInstruction(abstractC13901ga.getName(), abstractC13901ga.getValue());
            case 8:
                return createComment(abstractC13901ga.getValue());
            case 10:
                C13957q6 c13957q6 = (C13957q6) abstractC13901ga;
                return createDocumentType(c13957q6.getName(), c13957q6.m65794kk(), c13957q6.m65796to(), c13957q6.m65790du());
            case 11:
                C13932ly c13932lyCreateDocumentFragment = createDocumentFragment();
                if (z) {
                    m65003k4(abstractC13901ga, c13932lyCreateDocumentFragment, z);
                }
                return c13932lyCreateDocumentFragment;
            case 13:
                return createWhitespace(abstractC13901ga.getValue());
            case 14:
                return createSignificantWhitespace(abstractC13901ga.getValue());
            case 17:
                C13976sq c13976sq = (C13976sq) abstractC13901ga;
                return createXmlDeclaration(c13976sq.m65884k4(), c13976sq.m65888x1(), c13976sq.m65886kk());
        }
    }

    public C13940my createAttribute(String str, String str2, String str3) {
        return new C13940my(addAttrXmlName(str, str2, str3, null), this);
    }

    public C13981tl createElement(String str, String str2, String str3) {
        C13981tl c13981tl = new C13981tl(addXmlName(str, str2, str3, null), true, this);
        if (!isLoading()) {
            addDefaultAttributes(c13981tl);
        }
        return c13981tl;
    }

    public AbstractC13901ga createNode(String str, String str2, String str3) {
        return createNode(convertToNodeType(str), str2, str3);
    }

    public void load(AbstractC13912i5 abstractC13912i5) {
        try {
            setLoading(true);
            this.f46312jd = true;
            removeAll();
            this.fEntRefNodesPresent = false;
            this.fCDataNodesPresent = false;
            this.f46306c5 = true;
            new C13987tw().m66216k4(this, abstractC13912i5, this.f46307ck);
        } finally {
            setLoading(false);
            this.f46312jd = false;
            this.f46306c5 = true;
        }
    }

    public void save(AbstractC13958qb abstractC13958qb) {
        boolean z;
        AbstractC13901ga firstChild = getFirstChild();
        if (firstChild == null) {
            return;
        }
        if (abstractC13958qb.mo65743fa() == 0) {
            if (C7019kk.m27469x1(firstChild, C13976sq.class)) {
                if (getStandalone().length() == 0) {
                    abstractC13958qb.mo65742c5();
                } else {
                    if (!"yes".equals(getStandalone())) {
                        z = TranslateLanguage.NORWEGIAN.equals(getStandalone()) ? false : true;
                    }
                    abstractC13958qb.mo65747x1(z);
                }
                firstChild = firstChild.getNextSibling();
            } else {
                abstractC13958qb.mo65742c5();
            }
        }
        while (firstChild != null) {
            firstChild.writeTo(abstractC13958qb);
            firstChild = firstChild.getNextSibling();
        }
        abstractC13958qb.mo21896h4();
    }

    /* JADX INFO: renamed from: k4 */
    private C13938ms m64998k4(C13938ms c13938ms) {
        c13938ms.m65619to(true);
        c13938ms.m65617m9(2);
        if (hasSetResolver()) {
            c13938ms.m65615k4(getResolver());
        }
        return c13938ms;
    }

    public void load(String str) {
        C13938ms c13938msM64998k4 = m64998k4(new C13938ms(str, getNameTable()));
        try {
            load(c13938msM64998k4);
        } finally {
            c13938msM64998k4.mo65049um();
        }
    }

    public void save(String str) {
        if (getDocumentElement() == null) {
            throw new XmlException("Invalid XML document. {0}", C13968ri.m65818k4("The document does not have a root element."));
        }
        C14012x3 c14012x3 = new C14012x3(str, getTextEncoding());
        try {
            if (!this.f46307ck) {
                c14012x3.m66258k4(1);
            }
            writeTo(c14012x3);
            c14012x3.mo21896h4();
            c14012x3.mo21893du();
        } catch (Throwable th) {
            c14012x3.mo21893du();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C13940my m64999k4(C13061k5 c13061k5, String str, String str2, String str3) {
        String[] strArr = {str3};
        setDefaultNamespace(str, str2, strArr);
        C13940my c13940myCreateDefaultAttribute = createDefaultAttribute(str, str2, strArr[0]);
        c13940myCreateDefaultAttribute.setInnerXml(c13061k5.m61427ak());
        C13967r9 c13967r9 = (C13967r9) C7019kk.m27452k4((Object) c13940myCreateDefaultAttribute, C13967r9.class);
        if (c13967r9 != null) {
            c13967r9.m65817k4(false);
        }
        return c13940myCreateDefaultAttribute;
    }

    /* JADX INFO: renamed from: k4 */
    private C14023y6 m65000k4(C14023y6 c14023y6) {
        C14023y6 xmlName = getXmlName(c14023y6.m66349jd(), c14023y6.m66347dy(), C14113y2.f47374k4, null);
        if (xmlName != null) {
            return (C14023y6) this.f46311h4.get_Item(xmlName);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private C14095u1 m65001k4(ArrayList arrayList, C13981tl c13981tl) {
        ArrayList arrayList2 = new ArrayList();
        IEnumerator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                C14095u1 c14095u1 = (C14095u1) it.next();
                if (!c14095u1.m67305x1()) {
                    arrayList2.addItem(c14095u1);
                } else if (((C13981tl) c14095u1.m67304k4()) == c13981tl) {
                    return c14095u1;
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
        it = arrayList2.iterator();
        while (it.hasNext()) {
            try {
                arrayList.removeItem((C14095u1) it.next());
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
    private void m65002k4(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        int iM65634x1 = abstractC13901ga.getAttributes().m65634x1();
        for (int i = 0; i < iM65634x1; i++) {
            if (abstractC13901ga.getAttributes().m65164k4(i).mo65622du()) {
                abstractC13901ga2.getAttributes().mo65163k4(m64997k4((AbstractC13901ga) abstractC13901ga.getAttributes().m65164k4(i), true));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65003k4(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2, boolean z) {
        for (AbstractC13901ga firstChild = abstractC13901ga.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            abstractC13901ga2.appendChild(m64997k4(firstChild, z));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m65004k4(int i, AbstractC13901ga abstractC13901ga) {
        if (abstractC13901ga == null) {
            return false;
        }
        for (AbstractC13901ga firstChild = abstractC13901ga.getParentNode() != null ? abstractC13901ga.getParentNode().getFirstChild() : null; firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (firstChild.getNodeType() == i) {
                return true;
            }
            if (firstChild == abstractC13901ga) {
                break;
            }
        }
        return false;
    }
}
