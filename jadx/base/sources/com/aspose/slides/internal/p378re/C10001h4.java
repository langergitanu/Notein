package com.aspose.slides.internal.p378re;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13938ms;

/* JADX INFO: renamed from: com.aspose.slides.internal.re.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10001h4 {

    /* JADX INFO: renamed from: k4 */
    private final String f36008k4;

    /* JADX INFO: renamed from: kk */
    private final k4 f36009kk;

    /* JADX INFO: renamed from: x1 */
    private final Object f36010x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.re.h4$1, reason: invalid class name */
    public class AnonymousClass1 extends k4 {
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Shared.TestUtils.XmlUnit.XmlInput.TranslateString(System.Object,System.String)";
        }

        @Override // com.aspose.slides.internal.p378re.C10001h4.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC13912i5 mo49118k4(Object obj, String str) {
            return C10001h4.m49114kk(obj, str);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.re.h4$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract AbstractC13912i5 mo49118k4(Object obj, String str);

        public /* synthetic */ k4(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public C10001h4(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public static AbstractC13912i5 m49114kk(Object obj, String str) {
        return new C13938ms(str, new C3144um((String) obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public static AbstractC13912i5 m49115to(Object obj, String str) {
        return new C13938ms(str, new C3148wl((AbstractC3150x6) obj));
    }

    public boolean equals(Object obj) {
        C10001h4 c10001h4 = (C10001h4) C7019kk.m27452k4(obj, C10001h4.class);
        if (c10001h4 != null) {
            return this.f36010x1.equals(c10001h4.f36010x1);
        }
        return false;
    }

    public int hashCode() {
        return this.f36010x1.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13912i5 m49117k4() {
        return this.f36009kk.mo49118k4(this.f36010x1, this.f36008k4);
    }

    public C10001h4(AbstractC3150x6 abstractC3150x6, String str) {
        this(str, abstractC3150x6, new k4() { // from class: com.aspose.slides.internal.re.h4.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Shared.TestUtils.XmlUnit.XmlInput.TranslateStream(System.Object,System.String)";
            }

            @Override // com.aspose.slides.internal.p378re.C10001h4.k4
            /* JADX INFO: renamed from: k4 */
            public AbstractC13912i5 mo49118k4(Object obj, String str2) {
                return C10001h4.m49115to(obj, str2);
            }
        });
    }

    private C10001h4(String str, Object obj, k4 k4Var) {
        this.f36008k4 = str;
        this.f36010x1 = obj;
        this.f36009kk = k4Var;
    }
}
