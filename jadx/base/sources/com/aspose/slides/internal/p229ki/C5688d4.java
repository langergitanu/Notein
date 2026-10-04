package com.aspose.slides.internal.p229ki;

import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p331p6.InterfaceC7199k4;
import com.aspose.slides.internal.p331p6.InterfaceC7203x1;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10928kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.d4 */
/* JADX INFO: loaded from: classes.dex */
public class C5688d4 extends AbstractC10928kk {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw f15698k4;

    /* JADX INFO: renamed from: kk */
    private boolean f15699kk;

    /* JADX INFO: renamed from: x1 */
    private String f15700x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ki.d4$k4 */
    public static class k4 extends AbstractC7201m9 {

        /* JADX INFO: renamed from: k4 */
        private InterfaceC13980t6 f15701k4;

        public k4(InterfaceC13980t6 interfaceC13980t6) {
            super(false);
            this.f15701k4 = interfaceC13980t6;
        }

        @Override // com.aspose.slides.internal.p331p6.AbstractC7201m9
        /* JADX INFO: renamed from: du */
        public boolean mo23223du() {
            return false;
        }

        @Override // com.aspose.slides.internal.p331p6.AbstractC7201m9
        /* JADX INFO: renamed from: k4 */
        public InterfaceC7199k4 mo23224k4(String str, String str2, int[] iArr) {
            throw XPathException.create("XsltContext is needed for this query because of an unknown function.");
        }

        @Override // com.aspose.slides.internal.p331p6.AbstractC7201m9
        /* JADX INFO: renamed from: x1 */
        public InterfaceC7203x1 mo23226x1(String str, String str2) {
            throw XPathException.create("XsltContext is needed for this query because of an unknown function.");
        }

        @Override // com.aspose.slides.p559ms.System.Xml.C13950o3, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
        /* JADX INFO: renamed from: k4 */
        public String mo13292k4(String str) {
            if (str.length() == 0) {
                return C14113y2.f47374k4;
            }
            String strMo13292k4 = this.f15701k4.mo13292k4(str);
            if (strMo13292k4 != null) {
                return strMo13292k4;
            }
            throw XPathException.create("Namespace prefix '{0}' is not defined.", str);
        }

        @Override // com.aspose.slides.p559ms.System.Xml.C13950o3
        /* JADX INFO: renamed from: x1 */
        public String mo23227x1() {
            return C14113y2.f47374k4;
        }

        @Override // com.aspose.slides.internal.p331p6.AbstractC7201m9
        /* JADX INFO: renamed from: k4 */
        public boolean mo23225k4(AbstractC10925du abstractC10925du) {
            return false;
        }
    }

    public C5688d4(AbstractC5728qw abstractC5728qw, String str, boolean z) {
        this.f15698k4 = abstractC5728qw;
        this.f15700x1 = str;
        this.f15699kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo23218k4() {
    }

    /* JADX INFO: renamed from: kk */
    public String m23221kk() {
        return this.f15700x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC5728qw m23222x1() {
        if (this.f15699kk) {
            throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
        }
        return this.f15698k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10928kk
    /* JADX INFO: renamed from: k4 */
    public void mo23219k4(C13950o3 c13950o3) {
        m23220k4((InterfaceC13980t6) c13950o3);
    }

    /* JADX INFO: renamed from: k4 */
    public void m23220k4(InterfaceC13980t6 interfaceC13980t6) {
        AbstractC7201m9 k4Var = (AbstractC7201m9) C7019kk.m27452k4((Object) interfaceC13980t6, AbstractC7201m9.class);
        if (k4Var == null) {
            if (interfaceC13980t6 == null) {
                interfaceC13980t6 = new C13950o3(new C13963qw());
            }
            k4Var = new k4(interfaceC13980t6);
        }
        this.f15698k4.mo23149k4(k4Var);
        this.f15699kk = false;
    }
}
