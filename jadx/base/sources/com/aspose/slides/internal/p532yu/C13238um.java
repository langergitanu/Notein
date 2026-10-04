package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.um */
/* JADX INFO: loaded from: classes5.dex */
public class C13238um extends C12904b3 {

    /* JADX INFO: renamed from: yj */
    private static final AbstractC14068j5 f44415yj = C7019kk.m27443k4((Class<?>) C13890ei.class);

    /* JADX INFO: renamed from: ks */
    private static final AbstractC14068j5 f44414ks = C7019kk.m27443k4((Class<?>) C13890ei[].class);

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: c5 */
    public int mo60016c5() {
        return 8;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: fa */
    public int mo60020fa() {
        return 30;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: ix */
    public int mo60021ix() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: jd */
    public AbstractC14068j5 mo60022jd() {
        return f44415yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public RuntimeException mo60028k4(String str, AbstractC13883dt abstractC13883dt, InterfaceC13980t6 interfaceC13980t6, Object[] objArr) {
        objArr[0] = null;
        if (str == null || str.length() == 0) {
            return new XmlSchemaException("The attribute value cannot be empty.", C14113y2.f47374k4);
        }
        String[] strArr = {str};
        RuntimeException runtimeExceptionM60173k4 = AbstractC13279x6.f44491jd.m60173k4(strArr, this);
        String str2 = strArr[0];
        if (runtimeExceptionM60173k4 != null) {
            return runtimeExceptionM60173k4;
        }
        try {
            C13890ei c13890eiM65276k4 = C13890ei.m65276k4(str2, interfaceC13980t6, new String[]{null});
            Exception exceptionMo60163k4 = AbstractC13279x6.f44491jd.mo60163k4(c13890eiM65276k4, this);
            if (exceptionMo60163k4 != null) {
                return exceptionMo60163k4;
            }
            objArr[0] = c13890eiM65276k4;
            return null;
        } catch (ArgumentException | XmlException e) {
            return e;
        }
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: m9 */
    public AbstractC12942dc mo60043m9() {
        return AbstractC13279x6.f44491jd;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: ne */
    public int mo60044ne() {
        return 63;
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x1 */
    public AbstractC12974ex mo60045x1(C12943dd c12943dd) {
        return C13069kn.m61061k4(c12943dd);
    }

    @Override // com.aspose.slides.internal.p532yu.C12904b3, com.aspose.slides.internal.p532yu.AbstractC13279x6
    /* JADX INFO: renamed from: x6 */
    public AbstractC14068j5 mo60046x6() {
        return f44414ks;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13279x6, com.aspose.slides.internal.p532yu.AbstractC12892ae
    /* JADX INFO: renamed from: k4 */
    public void mo60029k4(C13005gv c13005gv, AbstractC13018hl abstractC13018hl) {
        for (C13238um c13238um = this; c13238um != null; c13238um = (C13238um) c13238um.m61685rv()) {
            if (c13238um.mo60033up() != null && (c13238um.mo60033up().f43449up & 16) != 0) {
                for (int i = 0; i < c13238um.mo60033up().f43440du.size(); i++) {
                    if (!c13005gv.m60653x1((C13890ei) c13238um.mo60033up().f43440du.get_Item(i))) {
                        throw new XmlSchemaException("NOTATION cannot be used directly in a Schema; only data types derived from NOTATION by specifying an enumeration value can be used in a Schema. All enumeration facet values must match the name of a notation declared in the current Schema.", abstractC13018hl);
                    }
                }
                return;
            }
        }
        throw new XmlSchemaException("NOTATION cannot be used directly in a Schema; only data types derived from NOTATION by specifying an enumeration value can be used in a Schema. All enumeration facet values must match the name of a notation declared in the current Schema.", abstractC13018hl);
    }
}
