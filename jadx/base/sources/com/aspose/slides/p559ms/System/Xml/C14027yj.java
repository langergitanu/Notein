package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.XmlSchemaValidationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.AbstractC13018hl;
import com.aspose.slides.internal.p532yu.AbstractC13074kt;
import com.aspose.slides.internal.p532yu.AbstractC13319z7;
import com.aspose.slides.internal.p532yu.C12943dd;
import com.aspose.slides.internal.p532yu.C12962eb;
import com.aspose.slides.internal.p532yu.C12969en;
import com.aspose.slides.internal.p532yu.C13020hq;
import com.aspose.slides.internal.p532yu.C13021hu;
import com.aspose.slides.internal.p532yu.C13061k5;
import com.aspose.slides.internal.p532yu.C13106mq;
import com.aspose.slides.internal.p532yu.C13129ny;
import com.aspose.slides.internal.p532yu.C13146p4;
import com.aspose.slides.internal.p532yu.C13165qa;
import com.aspose.slides.internal.p532yu.C13329zn;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.yj */
/* JADX INFO: loaded from: classes5.dex */
public final class C14027yj implements InterfaceC13980t6 {

    /* JADX INFO: renamed from: c5 */
    private AbstractC13319z7 f47111c5;

    /* JADX INFO: renamed from: ck */
    private AbstractC13901ga f47112ck;

    /* JADX INFO: renamed from: du */
    private ArrayList f47113du;

    /* JADX INFO: renamed from: dy */
    private C13329zn f47114dy;

    /* JADX INFO: renamed from: fa */
    private AbstractC13901ga f47115fa;

    /* JADX INFO: renamed from: ix */
    private String f47117ix;

    /* JADX INFO: renamed from: k4 */
    private C12962eb f47119k4;

    /* JADX INFO: renamed from: kk */
    private C13950o3 f47120kk;

    /* JADX INFO: renamed from: ks */
    private boolean f47121ks;

    /* JADX INFO: renamed from: m9 */
    private C13329zn f47122m9;

    /* JADX INFO: renamed from: ne */
    private String f47123ne;

    /* JADX INFO: renamed from: to */
    private AbstractC13883dt f47125to;

    /* JADX INFO: renamed from: u4 */
    private String f47126u4;

    /* JADX INFO: renamed from: up */
    private XmlDocument f47127up;

    /* JADX INFO: renamed from: uz */
    private String f47128uz;

    /* JADX INFO: renamed from: x1 */
    private C13129ny f47129x1;

    /* JADX INFO: renamed from: x6 */
    private boolean f47130x6;

    /* JADX INFO: renamed from: yj */
    private AbstractC13901ga[] f47131yj;

    /* JADX INFO: renamed from: jd */
    private AbstractC13319z7 f47118jd = new C13928ks(this);

    /* JADX INFO: renamed from: h4 */
    private AbstractC13074kt f47116h4 = new C13971rv(this);

    /* JADX INFO: renamed from: rv */
    private boolean f47124rv = true;

    public C14027yj(XmlDocument xmlDocument, C13129ny c13129ny, AbstractC13319z7 abstractC13319z7) {
        this.f47129x1 = c13129ny;
        this.f47111c5 = abstractC13319z7;
        this.f47127up = xmlDocument;
        this.f47125to = this.f47127up.getNameTable();
        this.f47120kk = new C13950o3(this.f47125to);
        this.f47123ne = this.f47125to.mo65266k4("http://www.w3.org/2000/xmlns/");
        this.f47117ix = this.f47125to.mo65266k4("http://www.w3.org/2001/XMLSchema-instance");
        this.f47126u4 = this.f47125to.mo65266k4(C18437z2.f56754h);
        this.f47128uz = this.f47125to.mo65266k4("nil");
    }

    /* JADX INFO: renamed from: kk */
    private C12962eb m66364kk(AbstractC13018hl abstractC13018hl) {
        C12962eb c12962eb = new C12962eb(this.f47127up.getNameTable(), this.f47127up.getSchemas(), this.f47120kk, 0);
        c12962eb.f43605x1.mo27432x1(new C14014x6(this));
        if (abstractC13018hl != null) {
            c12962eb.m60360k4(abstractC13018hl);
            return c12962eb;
        }
        c12962eb.m60357k4();
        return c12962eb;
    }

    /* JADX INFO: renamed from: x1 */
    private C12969en m66367x1(AbstractC13018hl abstractC13018hl) {
        if (abstractC13018hl == null) {
            return null;
        }
        C13021hu c13021hu = (C13021hu) C7019kk.m27452k4((Object) abstractC13018hl, C13021hu.class);
        if (c13021hu != null) {
            abstractC13018hl = c13021hu.m60696ar();
        }
        return (C12969en) C7019kk.m27452k4((Object) abstractC13018hl, C12969en.class);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public final IGenericDictionary<String, String> mo52690k4(int i) {
        String localName;
        IGenericDictionary<String, String> iGenericDictionaryMo52690k4 = this.f47120kk.mo52690k4(i);
        if (i != 2) {
            AbstractC13901ga parentNode = this.f47112ck;
            while (parentNode != null) {
                int nodeType = parentNode.getNodeType();
                if (nodeType == 1) {
                    C13981tl c13981tl = (C13981tl) parentNode;
                    if (c13981tl.m65904jd()) {
                        C13857b1 attributes = c13981tl.getAttributes();
                        for (int i2 = 0; i2 < attributes.m65634x1(); i2++) {
                            C13940my c13940myM65164k4 = attributes.m65164k4(i2);
                            if (C13851ai.m65152k4(c13940myM65164k4.getNamespaceURI(), this.f47127up.strReservedXmlns)) {
                                if (c13940myM65164k4.getPrefix().length() == 0) {
                                    if (!iGenericDictionaryMo52690k4.containsKey(C14113y2.f47374k4)) {
                                        localName = C14113y2.f47374k4;
                                        iGenericDictionaryMo52690k4.addItem(localName, c13940myM65164k4.getValue());
                                    }
                                } else if (!iGenericDictionaryMo52690k4.containsKey(c13940myM65164k4.getLocalName())) {
                                    localName = c13940myM65164k4.getLocalName();
                                    iGenericDictionaryMo52690k4.addItem(localName, c13940myM65164k4.getValue());
                                }
                            }
                        }
                    }
                } else if (nodeType == 2) {
                    parentNode = ((C13940my) parentNode).m65623h4();
                }
                parentNode = parentNode.getParentNode();
            }
        }
        return iGenericDictionaryMo52690k4;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC13018hl m66352k4(C13981tl c13981tl, AbstractC13018hl abstractC13018hl, int i) {
        this.f47119k4 = m66364kk(abstractC13018hl);
        this.f47114dy = new C13329zn();
        boolean zM66363k4 = m66363k4(abstractC13018hl);
        for (int i2 = i - 1; i2 >= 0; i2--) {
            AbstractC13901ga abstractC13901ga = this.f47131yj[i2];
            C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) abstractC13901ga, C13981tl.class);
            m66360k4(c13981tl2, false, this.f47114dy);
            if (!zM66363k4) {
                c13981tl2.m65908k4(this.f47127up.addXmlName(c13981tl2.getPrefix(), c13981tl2.getLocalName(), c13981tl2.getNamespaceURI(), this.f47114dy));
                zM66363k4 = m66363k4(this.f47114dy.an_());
            }
            this.f47119k4.m60363k4((C13329zn) null);
            if (i2 > 0) {
                m66358k4(abstractC13901ga, this.f47131yj[i2 - 1]);
            } else {
                m66358k4(abstractC13901ga, c13981tl);
            }
        }
        m66360k4(c13981tl, false, this.f47114dy);
        AbstractC13018hl abstractC13018hlAn_ = this.f47114dy.an_() != null ? this.f47114dy.an_() : this.f47114dy.am_();
        return abstractC13018hlAn_ == null ? this.f47119k4.m60354h4() == 1 ? this.f47121ks ? C12969en.m60394h4() : abstractC13018hlAn_ : this.f47119k4.m60354h4() == 2 ? C12969en.m60399k4() : abstractC13018hlAn_ : abstractC13018hlAn_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public Object m66365kk() {
        return this.f47115fa.getValue();
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC13018hl m66368x1(C13981tl c13981tl) {
        InterfaceC13298y4 schemaInfo;
        this.f47121ks = true;
        AbstractC13901ga parentNode = c13981tl.getParentNode();
        int i = 0;
        do {
            schemaInfo = parentNode.getSchemaInfo();
            if (schemaInfo.an_() != null || schemaInfo.am_() != null) {
                break;
            }
            m66370x1(i);
            this.f47131yj[i] = parentNode;
            parentNode = parentNode.getParentNode();
            i++;
        } while (parentNode != null);
        if (parentNode == null) {
            int i2 = i - 1;
            this.f47131yj[i2] = null;
            return m66352k4(c13981tl, (AbstractC13018hl) null, i2);
        }
        m66370x1(i);
        int i3 = i + 1;
        this.f47131yj[i] = parentNode;
        AbstractC13018hl abstractC13018hlAn_ = schemaInfo.an_();
        if (abstractC13018hlAn_ == null) {
            abstractC13018hlAn_ = schemaInfo.am_();
        }
        return m66352k4(c13981tl, abstractC13018hlAn_, i3);
    }

    /* JADX INFO: renamed from: k4 */
    private C13146p4 m66353k4(C13940my c13940my) {
        C13106mq c13106mqM60425uz;
        C12969en c12969enM66367x1 = m66367x1(m66368x1(c13940my.m65623h4()));
        if (c12969enM66367x1 == null) {
            return null;
        }
        C13890ei c13890ei = new C13890ei(c13940my.getLocalName(), c13940my.getNamespaceURI());
        C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4((Object) c12969enM66367x1.m60423u4().m60649kk(c13890ei), C13146p4.class);
        return (c13146p4 == null && (c13106mqM60425uz = c12969enM66367x1.m60425uz()) != null && c13106mqM60425uz.m61190x1().m61107k4(c13890ei)) ? (C13146p4) C7019kk.m27452k4((Object) this.f47129x1.m61316h4().m60649kk(c13890ei), C13146p4.class) : c13146p4;
    }

    /* JADX INFO: renamed from: kk */
    private String m66366kk(String str) {
        IGenericDictionary<String, String> iGenericDictionaryMo52690k4 = m66354k4().mo52690k4(0);
        String strMo65266k4 = this.f47125to.mo65266k4(str);
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = iGenericDictionaryMo52690k4.iterator();
        String str2 = null;
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                if (C14067j2.m66729x1(this.f47125to.mo65266k4((String) keyValuePair.getValue()), strMo65266k4)) {
                    str2 = (String) keyValuePair.getKey();
                    if (str2.length() != 0) {
                        return str2;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return str2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: x1 */
    public final String mo52700x1(String str) {
        String strMo52700x1 = this.f47120kk.mo52700x1(str);
        return strMo52700x1 == null ? this.f47112ck.getPrefixOfNamespaceStrict(str) : strMo52700x1;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC13980t6 m66354k4() {
        return this.f47112ck == this.f47127up ? this.f47120kk : this;
    }

    /* JADX INFO: renamed from: x1 */
    private void m66369x1() {
        this.f47120kk.mo65708kk();
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f47115fa, C13981tl.class);
        C13857b1 attributes = c13981tl.getAttributes();
        String value = null;
        String value2 = null;
        for (int i = 0; i < attributes.m65634x1(); i++) {
            C13940my c13940myM65164k4 = attributes.m65164k4(i);
            String namespaceURI = c13940myM65164k4.getNamespaceURI();
            String localName = c13940myM65164k4.getLocalName();
            if (C13851ai.m65152k4(namespaceURI, this.f47117ix)) {
                if (C13851ai.m65152k4(localName, this.f47126u4)) {
                    value = c13940myM65164k4.getValue();
                } else if (C13851ai.m65152k4(localName, this.f47128uz)) {
                    value2 = c13940myM65164k4.getValue();
                }
            } else if (C13851ai.m65152k4(namespaceURI, this.f47123ne)) {
                this.f47120kk.mo65707k4(c13940myM65164k4.getPrefix().length() == 0 ? C14113y2.f47374k4 : c13940myM65164k4.getLocalName(), c13940myM65164k4.getValue());
            }
        }
        this.f47119k4.m60370k4(c13981tl.getLocalName(), c13981tl.getNamespaceURI(), this.f47114dy, value, value2, (String) null, (String) null);
        m66359k4(c13981tl);
        this.f47119k4.m60363k4(this.f47114dy);
        for (AbstractC13901ga firstChild = c13981tl.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            m66371x1(firstChild);
        }
        this.f47115fa = c13981tl;
        this.f47119k4.m60377x1(this.f47114dy);
        if (this.f47124rv) {
            c13981tl.m65908k4(this.f47127up.addXmlName(c13981tl.getPrefix(), c13981tl.getLocalName(), c13981tl.getNamespaceURI(), this.f47114dy));
            if (this.f47114dy.mo61763x1()) {
                c13981tl.appendChild(this.f47127up.createTextNode(this.f47114dy.an_().m60697b3().m61427ak()));
            }
        }
        this.f47120kk.mo65709to();
    }

    /* JADX INFO: renamed from: x1 */
    private void m66370x1(int i) {
        AbstractC13901ga[] abstractC13901gaArr = this.f47131yj;
        if (abstractC13901gaArr == null) {
            this.f47131yj = new AbstractC13901ga[4];
        } else if (i >= abstractC13901gaArr.length - 1) {
            AbstractC13901ga[] abstractC13901gaArr2 = new AbstractC13901ga[abstractC13901gaArr.length * 2];
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC13901gaArr), 0, AbstractC14092to.m67208k4((Object) abstractC13901gaArr2), 0, this.f47131yj.length);
            this.f47131yj = abstractC13901gaArr2;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m66371x1(AbstractC13901ga abstractC13901ga) {
        this.f47115fa = abstractC13901ga;
        switch (abstractC13901ga.getNodeType()) {
            case 1:
                m66369x1();
                return;
            case 2:
                C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) this.f47115fa, C13940my.class);
                this.f47119k4.m60356k4(c13940my.getLocalName(), c13940my.getNamespaceURI(), this.f47116h4, this.f47122m9);
                if (this.f47124rv) {
                    c13940my.m65624k4(this.f47127up.addAttrXmlName(c13940my.getPrefix(), c13940my.getLocalName(), c13940my.getNamespaceURI(), this.f47122m9));
                    return;
                }
                return;
            case 3:
                this.f47119k4.m60361k4(this.f47116h4);
                return;
            case 4:
                this.f47119k4.m60361k4(this.f47116h4);
                return;
            case 5:
            case 11:
                for (AbstractC13901ga firstChild = abstractC13901ga.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                    m66371x1(firstChild);
                }
                return;
            case 6:
            case 10:
            case 12:
            default:
                throw new InvalidOperationException(C13968ri.m65819k4("Unexpected XmlNodeType: '{0}'.", C14042ak.m66410k4(C13929li.class, this.f47115fa.getNodeType())));
            case 7:
            case 8:
                return;
            case 9:
                C13981tl documentElement = ((XmlDocument) abstractC13901ga).getDocumentElement();
                if (documentElement == null) {
                    throw new InvalidOperationException(C13968ri.m65819k4("Invalid XML document. {0}", C13968ri.m65818k4("The document does not have a root element.")));
                }
                m66371x1((AbstractC13901ga) documentElement);
                return;
            case 13:
            case 14:
                this.f47119k4.m60379x1(this.f47116h4);
                return;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public final String mo13292k4(String str) {
        String strMo13292k4 = this.f47120kk.mo13292k4(str);
        return strMo13292k4 == null ? this.f47112ck.getNamespaceOfPrefixStrict(str) : strMo13292k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m66356k4(AbstractC13018hl abstractC13018hl, int i) {
        C12962eb c12962eb = new C12962eb(this.f47125to, this.f47129x1, m66354k4(), i);
        this.f47119k4 = c12962eb;
        c12962eb.m60367k4(C13850af.m65125qq(this.f47127up.getBaseURI()));
        this.f47119k4.m60366k4((AbstractC13943n5) null);
        this.f47119k4.f43605x1.mo27432x1(this.f47118jd);
        this.f47119k4.m60368k4(this);
        if (abstractC13018hl != null) {
            this.f47119k4.m60360k4(abstractC13018hl);
        } else {
            this.f47119k4.m60357k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66357k4(C13146p4 c13146p4) {
        this.f47122m9.m61902jd();
        this.f47122m9.m61908k4(true);
        this.f47122m9.m61909x1(false);
        this.f47122m9.m61904k4((C12943dd) c13146p4.m61371up());
        this.f47122m9.m61906k4(c13146p4);
        C13061k5 c13061k5M61369ks = c13146p4.m61369ks();
        if (c13061k5M61369ks.m61429b3().mo60017ck() == 2) {
            this.f47122m9.m61907k4(((C13165qa) C7019kk.m27452k4(c13061k5M61369ks.m61431dq(), C13165qa.class)).m61418k4());
        }
        this.f47122m9.m61903k4(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m66373x1(Object obj, C13020hq c13020hq) {
        if (c13020hq.m60694k4() == 0) {
            this.f47130x6 = false;
        }
        XmlSchemaValidationException xmlSchemaValidationException = (XmlSchemaValidationException) C7019kk.m27452k4((Object) c13020hq.m60695x1(), XmlSchemaValidationException.class);
        xmlSchemaValidationException.setSourceObject(this.f47115fa);
        AbstractC13319z7 abstractC13319z7 = this.f47111c5;
        if (abstractC13319z7 != null) {
            abstractC13319z7.mo12838k4(obj, c13020hq);
        } else if (c13020hq.m60694k4() == 0) {
            throw xmlSchemaValidationException;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66358k4(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        for (AbstractC13901ga firstChild = abstractC13901ga.getFirstChild(); firstChild != null && firstChild != abstractC13901ga2; firstChild = firstChild.getNextSibling()) {
            int nodeType = firstChild.getNodeType();
            if (nodeType == 1) {
                m66360k4((C13981tl) C7019kk.m27452k4((Object) firstChild, C13981tl.class), true, (C13329zn) null);
            } else if (nodeType == 3 || nodeType == 4) {
                this.f47119k4.m60369k4(firstChild.getValue());
            } else if (nodeType == 5) {
                m66358k4(firstChild, abstractC13901ga2);
            } else if (nodeType != 7 && nodeType != 8) {
                if (nodeType != 13 && nodeType != 14) {
                    throw new InvalidOperationException(C13968ri.m65819k4("Unexpected XmlNodeType: '{0}'.", C14042ak.m66410k4(C13929li.class, this.f47115fa.getNodeType())));
                }
                this.f47119k4.m60380x1(firstChild.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66359k4(C13981tl c13981tl) {
        C13857b1 attributes = c13981tl.getAttributes();
        for (int i = 0; i < attributes.m65634x1(); i++) {
            C13940my c13940myM65164k4 = attributes.m65164k4(i);
            this.f47115fa = c13940myM65164k4;
            if (!C13851ai.m65152k4(c13940myM65164k4.getNamespaceURI(), this.f47123ne)) {
                this.f47119k4.m60356k4(c13940myM65164k4.getLocalName(), c13940myM65164k4.getNamespaceURI(), this.f47116h4, this.f47122m9);
                if (this.f47124rv) {
                    c13940myM65164k4.m65624k4(this.f47127up.addAttrXmlName(c13940myM65164k4.getPrefix(), c13940myM65164k4.getLocalName(), c13940myM65164k4.getNamespaceURI(), this.f47122m9));
                }
            }
        }
        if (this.f47124rv) {
            ArrayList arrayList = this.f47113du;
            if (arrayList == null) {
                this.f47113du = new ArrayList();
            } else {
                arrayList.clear();
            }
            this.f47119k4.m60358k4(this.f47113du);
            for (int i2 = 0; i2 < this.f47113du.size(); i2++) {
                C13146p4 c13146p4 = (C13146p4) C7019kk.m27452k4(this.f47113du.get_Item(i2), C13146p4.class);
                C13890ei c13890eiM61359fa = c13146p4.m61359fa();
                C13940my c13940myCreateDefaultAttribute = this.f47127up.createDefaultAttribute(m66366kk(c13890eiM61359fa.m65284k4()), c13890eiM61359fa.m65289x1(), c13890eiM61359fa.m65284k4());
                m66357k4(c13146p4);
                c13940myCreateDefaultAttribute.m65624k4(this.f47127up.addAttrXmlName(c13940myCreateDefaultAttribute.getPrefix(), c13940myCreateDefaultAttribute.getLocalName(), c13940myCreateDefaultAttribute.getNamespaceURI(), this.f47122m9));
                c13940myCreateDefaultAttribute.appendChild(this.f47127up.createTextNode(c13146p4.m61369ks().m61427ak()));
                attributes.m65175x1(c13940myCreateDefaultAttribute);
                C13967r9 c13967r9 = (C13967r9) C7019kk.m27452k4((Object) c13940myCreateDefaultAttribute, C13967r9.class);
                if (c13967r9 != null) {
                    c13967r9.m65817k4(false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m66360k4(C13981tl c13981tl, boolean z, C13329zn c13329zn) {
        this.f47120kk.mo65708kk();
        C13857b1 attributes = c13981tl.getAttributes();
        String value = null;
        String value2 = null;
        for (int i = 0; i < attributes.m65634x1(); i++) {
            C13940my c13940myM65164k4 = attributes.m65164k4(i);
            String namespaceURI = c13940myM65164k4.getNamespaceURI();
            String localName = c13940myM65164k4.getLocalName();
            if (C13851ai.m65152k4(namespaceURI, this.f47117ix)) {
                if (C13851ai.m65152k4(localName, this.f47126u4)) {
                    value = c13940myM65164k4.getValue();
                } else if (C13851ai.m65152k4(localName, this.f47128uz)) {
                    value2 = c13940myM65164k4.getValue();
                }
            } else if (C13851ai.m65152k4(namespaceURI, this.f47123ne)) {
                this.f47120kk.mo65707k4(c13940myM65164k4.getPrefix().length() == 0 ? C14113y2.f47374k4 : c13940myM65164k4.getLocalName(), c13940myM65164k4.getValue());
            }
        }
        this.f47119k4.m60370k4(c13981tl.getLocalName(), c13981tl.getNamespaceURI(), c13329zn, value, value2, (String) null, (String) null);
        if (z) {
            this.f47119k4.m60363k4(c13329zn);
            this.f47119k4.m60373kk(c13329zn);
            this.f47120kk.mo65709to();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m66362k4(Object obj, C13020hq c13020hq) {
        if (c13020hq.m60694k4() == 0) {
            this.f47121ks = false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m66363k4(AbstractC13018hl abstractC13018hl) {
        C12969en c12969enM66367x1 = m66367x1(abstractC13018hl);
        if (abstractC13018hl != null) {
            return c12969enM66367x1.m60421qq();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m66374k4(AbstractC13901ga abstractC13901ga) {
        AbstractC13018hl abstractC13018hlAm_;
        this.f47112ck = abstractC13901ga;
        int nodeType = abstractC13901ga.getNodeType();
        AbstractC13018hl abstractC13018hlM60649kk = null;
        int i = 16;
        if (nodeType == 1) {
            InterfaceC13298y4 schemaInfo = abstractC13901ga.getSchemaInfo();
            C13021hu c13021huAn_ = schemaInfo.an_();
            if (c13021huAn_ != null) {
                abstractC13018hlM60649kk = !c13021huAn_.m60720ne().m65287kk() ? this.f47129x1.m61313du().m60649kk(c13021huAn_.m60721qq()) : c13021huAn_;
            } else {
                abstractC13018hlAm_ = schemaInfo.am_();
                if (abstractC13018hlAm_ == null) {
                    if (abstractC13901ga.getParentNode().getNodeType() == 9) {
                        abstractC13901ga = abstractC13901ga.getParentNode();
                    } else {
                        abstractC13018hlAm_ = m66368x1((C13981tl) C7019kk.m27452k4((Object) abstractC13901ga, C13981tl.class));
                        if (abstractC13018hlAm_ == null) {
                            throw new XmlSchemaValidationException("Schema information could not be found for the node passed into Validate. The node may be invalid in its current position. Navigate to the ancestor that has Schema information, then call Validate again.", null, abstractC13901ga);
                        }
                    }
                }
                abstractC13018hlM60649kk = abstractC13018hlAm_;
            }
        } else if (nodeType != 2) {
            if (nodeType == 9) {
                i = 24;
            } else if (nodeType != 11) {
                throw new InvalidOperationException(C13968ri.m65819k4("Validate method can be called only on nodes of type Document, DocumentFragment, Element, or Attribute.", null));
            }
        } else {
            if (abstractC13901ga.getXPNodeType() == 3) {
                throw new InvalidOperationException(C13968ri.m65819k4("Validate method can be called only on nodes of type Document, DocumentFragment, Element, or Attribute.", null));
            }
            abstractC13018hlAm_ = abstractC13901ga.getSchemaInfo().ao_();
            if (abstractC13018hlAm_ == null && (abstractC13018hlAm_ = m66353k4((C13940my) C7019kk.m27452k4((Object) abstractC13901ga, C13940my.class))) == null) {
                throw new XmlSchemaValidationException("Schema information could not be found for the node passed into Validate. The node may be invalid in its current position. Navigate to the ancestor that has Schema information, then call Validate again.", null, abstractC13901ga);
            }
            abstractC13018hlM60649kk = abstractC13018hlAm_;
        }
        this.f47130x6 = true;
        m66356k4(abstractC13018hlM60649kk, i);
        if (this.f47124rv) {
            if (this.f47114dy == null) {
                this.f47114dy = new C13329zn();
            }
            this.f47122m9 = new C13329zn();
        }
        m66371x1(abstractC13901ga);
        this.f47119k4.m60378x1();
        return this.f47130x6;
    }
}
