package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.InterfaceC14090sv;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.bs */
/* JADX INFO: loaded from: classes4.dex */
public class C6116bs extends AbstractC6211yd {

    /* JADX INFO: renamed from: k4 */
    private Object f17255k4;

    public C6116bs() {
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: C_ */
    public Object mo24769C_() {
        return this.f17255k4;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: dy */
    public String mo24770dy() {
        return "object";
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6211yd
    /* JADX INFO: renamed from: k4 */
    public void mo24771k4(Object obj) {
        this.f17255k4 = obj;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public AbstractC6123ca mo24773to(AbstractC6123ca abstractC6123ca) {
        return mo25031k4(abstractC6123ca);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        if (this.f17255k4 == null) {
            return null;
        }
        return m24768x1(mo24769C_()) ? C14080ne.m67029up(mo24769C_()) : this.f17255k4.toString();
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: x1 */
    public double mo24775x1() {
        if (mo24769C_() == null) {
            return 0.0d;
        }
        if (!m24768x1(mo24769C_())) {
            return Double.NaN;
        }
        int iM67046yj = C14080ne.m67046yj(mo24769C_());
        if (iM67046yj == 3) {
            return C6189up.m25071k4(((Boolean) C7019kk.m27464to(mo24769C_(), Boolean.TYPE)).booleanValue());
        }
        if (iM67046yj != 4) {
            if (iM67046yj == 16) {
                return C6188um.m25070k4(((C14084qq) C7019kk.m27464to(mo24769C_(), C14084qq.class)).Clone());
            }
            if (iM67046yj != 18) {
                return C14080ne.m66903fa(mo24769C_());
            }
        }
        return C6141he.m24845m9((String) mo24769C_());
    }

    public C6116bs(C6116bs c6116bs) {
        super(c6116bs);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: k4 */
    public boolean mo24772k4() {
        if ((mo24769C_() != null && !C7019kk.m27469x1(mo24769C_(), InterfaceC14090sv.class)) || mo24769C_() == null) {
            return true;
        }
        switch (C14080ne.m67046yj(mo24769C_())) {
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "Object";
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: x1 */
    public AbstractC6123ca mo24776x1(InterfaceC6173qw interfaceC6173qw) {
        if (mo24769C_() != null && !C7019kk.m27469x1(mo24769C_(), Comparable.class)) {
            return interfaceC6173qw.mo24980v4().m25068h4(mo24769C_().toString());
        }
        switch (C14080ne.m67046yj(mo24769C_())) {
            case 1:
            case 4:
            case 18:
                return interfaceC6173qw.mo24980v4().m25068h4(mo24769C_().toString());
            case 2:
            case 17:
            default:
                return C6163nh.f17403k4;
            case 3:
                return interfaceC6173qw.mo24972ks().m25189k4(((Boolean) C7019kk.m27464to(mo24769C_(), Boolean.TYPE)).booleanValue());
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return interfaceC6173qw.mo24977um().m25186k4(C14080ne.m66903fa(mo24769C_()));
            case 16:
                return interfaceC6173qw.mo24975rv().m24780k4(((C14084qq) C7019kk.m27464to(mo24769C_(), C14084qq.class)).Clone());
        }
    }

    public C6116bs(Object obj, C6116bs c6116bs) {
        super(c6116bs);
        this.f17255k4 = obj;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m24768x1(Object obj) {
        return (obj instanceof InterfaceC14090sv) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof String) || (obj instanceof C14084qq);
    }
}
