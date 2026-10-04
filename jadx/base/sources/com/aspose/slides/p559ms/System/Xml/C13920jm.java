package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.C12943dd;
import com.aspose.slides.internal.p532yu.C13021hu;
import com.aspose.slides.internal.p532yu.C13146p4;
import com.aspose.slides.internal.p532yu.C13164q9;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.jm */
/* JADX INFO: loaded from: classes5.dex */
public final class C13920jm extends C14023y6 {

    /* JADX INFO: renamed from: du */
    private C12943dd f46586du;

    /* JADX INFO: renamed from: h4 */
    private Object f46587h4;

    /* JADX INFO: renamed from: kk */
    private byte f46588kk;

    /* JADX INFO: renamed from: to */
    private C13164q9 f46589to;

    public C13920jm(String str, String str2, String str3, int i, XmlDocument xmlDocument, C14023y6 c14023y6, InterfaceC13298y4 interfaceC13298y4) {
        super(str, str2, str3, i, xmlDocument, c14023y6);
        m65492k4(interfaceC13298y4.ak_());
        m65493k4(interfaceC13298y4.mo61763x1());
        m65495x1(interfaceC13298y4.aj_());
        this.f46589to = interfaceC13298y4.al_();
        this.f46586du = interfaceC13298y4.am_();
        this.f46587h4 = interfaceC13298y4.an_() != null ? interfaceC13298y4.an_() : interfaceC13298y4.ao_();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14023y6, com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public boolean aj_() {
        return (this.f46588kk & 8) != 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14023y6, com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public int ak_() {
        if (this.f47102k4.canReportValidity()) {
            return this.f46588kk & 3;
        }
        return 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14023y6, com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public C13164q9 al_() {
        return this.f46589to;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14023y6, com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public C12943dd am_() {
        return this.f46586du;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14023y6, com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public C13021hu an_() {
        return (C13021hu) C7019kk.m27452k4(this.f46587h4, C13021hu.class);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14023y6, com.aspose.slides.internal.p532yu.InterfaceC13298y4
    public C13146p4 ao_() {
        return (C13146p4) C7019kk.m27452k4(this.f46587h4, C13146p4.class);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65492k4(int i) {
        this.f46588kk = (byte) ((((byte) i) & 255) | (this.f46588kk & 252));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65495x1(boolean z) {
        this.f46588kk = (byte) (z ? (this.f46588kk & 255) | 8 : this.f46588kk & 247);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65493k4(boolean z) {
        this.f46588kk = (byte) (z ? (this.f46588kk & 255) | 4 : this.f46588kk & 251);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14023y6, com.aspose.slides.internal.p532yu.InterfaceC13298y4
    /* JADX INFO: renamed from: x1 */
    public boolean mo61763x1() {
        return (this.f46588kk & 4) != 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C14023y6
    /* JADX INFO: renamed from: k4 */
    public boolean mo65494k4(InterfaceC13298y4 interfaceC13298y4) {
        if (interfaceC13298y4 != null && interfaceC13298y4.ak_() == (this.f46588kk & 3)) {
            if (interfaceC13298y4.mo61763x1() == ((this.f46588kk & 4) != 0)) {
                if (interfaceC13298y4.aj_() == ((this.f46588kk & 8) != 0) && interfaceC13298y4.al_() == this.f46589to && interfaceC13298y4.am_() == this.f46586du && interfaceC13298y4.an_() == C7019kk.m27452k4(this.f46587h4, C13021hu.class) && interfaceC13298y4.ao_() == C7019kk.m27452k4(this.f46587h4, C13146p4.class)) {
                    return true;
                }
            }
        }
        return false;
    }
}
