package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.k7 */
/* JADX INFO: loaded from: classes3.dex */
class C13716k7 implements InterfaceC14573tr {
    @Override // com.aspose.slides.InterfaceC14573tr
    /* JADX INFO: renamed from: k4 */
    public final String mo63707k4(String str, String str2) {
        if (C14113y2.m67411k4(str)) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "CsProject", "projectXml"));
        }
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setXmlResolver(null);
        xmlDocument.loadXml(str);
        C13981tl c13981tlCreateElement = xmlDocument.createElement("ItemGroup", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        C13981tl c13981tlCreateElement2 = xmlDocument.createElement("Page", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        C13940my c13940myCreateAttribute = xmlDocument.createAttribute("Include");
        c13940myCreateAttribute.appendChild(xmlDocument.createTextNode(str2));
        c13981tlCreateElement2.getAttributes().m65175x1(c13940myCreateAttribute);
        C13981tl c13981tlCreateElement3 = xmlDocument.createElement("Generator", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        c13981tlCreateElement3.setInnerText("MSBuild:Compile");
        c13981tlCreateElement2.appendChild(c13981tlCreateElement3);
        C13981tl c13981tlCreateElement4 = xmlDocument.createElement("SubType", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        c13981tlCreateElement4.setInnerText("Designer");
        c13981tlCreateElement2.appendChild(c13981tlCreateElement4);
        c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        xmlDocument.get_Item("Project").appendChild(c13981tlCreateElement);
        C13981tl c13981tlCreateElement5 = xmlDocument.createElement("Compile", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        C13940my c13940myCreateAttribute2 = xmlDocument.createAttribute("Include");
        c13940myCreateAttribute2.appendChild(xmlDocument.createTextNode(C14113y2.m67408k4(str2, ".cs")));
        c13981tlCreateElement5.getAttributes().m65175x1(c13940myCreateAttribute2);
        C13981tl c13981tlCreateElement6 = xmlDocument.createElement("DependentUpon", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        c13981tlCreateElement6.setInnerText(str2);
        c13981tlCreateElement5.appendChild(c13981tlCreateElement6);
        C13981tl c13981tlCreateElement7 = xmlDocument.createElement("SubType", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        c13981tlCreateElement7.setInnerText("Code");
        c13981tlCreateElement5.appendChild(c13981tlCreateElement7);
        c13981tlCreateElement.appendChild(c13981tlCreateElement5);
        xmlDocument.get_Item("Project").appendChild(c13981tlCreateElement);
        return xmlDocument.getOuterXml();
    }

    @Override // com.aspose.slides.InterfaceC14573tr
    /* JADX INFO: renamed from: kk */
    public final String mo63708kk(String str, String str2) {
        if (C14113y2.m67411k4(str)) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "CsProject", "projectXml"));
        }
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setXmlResolver(null);
        xmlDocument.loadXml(str);
        C13981tl c13981tlCreateElement = xmlDocument.createElement("ItemGroup", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        C13981tl c13981tlCreateElement2 = xmlDocument.createElement("Resource", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        C13940my c13940myCreateAttribute = xmlDocument.createAttribute("Include");
        c13940myCreateAttribute.appendChild(xmlDocument.createTextNode(str2));
        c13981tlCreateElement2.getAttributes().m65175x1(c13940myCreateAttribute);
        c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        xmlDocument.get_Item("Project").appendChild(c13981tlCreateElement);
        return xmlDocument.getOuterXml();
    }

    @Override // com.aspose.slides.InterfaceC14573tr
    /* JADX INFO: renamed from: x1 */
    public final String mo63709x1(String str, String str2) {
        if (C14113y2.m67411k4(str)) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "CsProject", "projectXml"));
        }
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setXmlResolver(null);
        xmlDocument.loadXml(str);
        C13981tl c13981tlCreateElement = xmlDocument.createElement("ItemGroup", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        C13981tl c13981tlCreateElement2 = xmlDocument.createElement("AndroidResource", xmlDocument.get_Item("Project").m65906k4("xmlns"));
        C13940my c13940myCreateAttribute = xmlDocument.createAttribute("Include");
        c13940myCreateAttribute.appendChild(xmlDocument.createTextNode(str2));
        c13981tlCreateElement2.getAttributes().m65175x1(c13940myCreateAttribute);
        c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        xmlDocument.get_Item("Project").appendChild(c13981tlCreateElement);
        return xmlDocument.getOuterXml();
    }
}
