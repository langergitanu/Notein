package com.aspose.slides.internal.p489x1;

import com.aspose.slides.internal.p217k4.C5586ix;
import com.aspose.slides.internal.p217k4.C5598um;
import com.aspose.slides.internal.p217k4.C5600uz;
import com.aspose.slides.internal.p217k4.C5602wl;
import com.aspose.slides.internal.p217k4.C5603wy;
import com.aspose.slides.internal.p217k4.InterfaceC5578b3;
import com.aspose.slides.internal.p217k4.InterfaceC5591lr;
import com.aspose.slides.internal.p217k4.InterfaceC5607yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.x1.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12363kk extends C12365to {

    /* JADX INFO: renamed from: du */
    public C5598um f41337du;

    /* JADX INFO: renamed from: kk */
    public InterfaceC5591lr f41338kk;

    /* JADX INFO: renamed from: to */
    public InterfaceC5591lr f41339to;

    /* JADX INFO: renamed from: x1 */
    public InterfaceC5607yj f41340x1;

    public C12363kk(InterfaceC5578b3 interfaceC5578b3, InterfaceC5591lr interfaceC5591lr, InterfaceC5591lr interfaceC5591lr2, C5598um c5598um) {
        if (interfaceC5591lr2 == null || (interfaceC5591lr2.mo22914h4() < interfaceC5591lr.mo22914h4() && interfaceC5591lr2.mo22915k4() != -1)) {
            interfaceC5591lr2 = interfaceC5591lr;
        }
        this.f41340x1 = interfaceC5578b3;
        this.f41338kk = interfaceC5591lr;
        this.f41339to = interfaceC5591lr2;
        this.f41337du = c5598um;
    }

    @Override // com.aspose.slides.internal.p489x1.C12365to, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: ck */
    public String mo57918ck() {
        if (this.f41338kk == null) {
            InterfaceC5591lr interfaceC5591lr = this.f41338kk;
            return interfaceC5591lr instanceof InterfaceC12359fa ? ((InterfaceC12368yj) this.f41340x1).m57949k4(interfaceC5591lr, this.f41339to) : "<unknown>";
        }
        int iMo22914h4 = this.f41338kk.mo22914h4();
        int iMo22914h42 = this.f41339to.mo22914h4();
        if (this.f41339to.mo22915k4() == -1) {
            iMo22914h42 = ((InterfaceC5578b3) this.f41340x1).mo22953kk();
        }
        return ((InterfaceC5578b3) this.f41340x1).mo22910k4(iMo22914h4, iMo22914h42);
    }

    @Override // com.aspose.slides.internal.p489x1.C12365to, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: jd */
    public int mo57924jd() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p489x1.C12365to, com.aspose.slides.internal.p489x1.AbstractC12362k4, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: kk */
    public boolean mo57928kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p489x1.C12365to, com.aspose.slides.internal.p489x1.AbstractC12362k4
    public String toString() {
        StringBuffer stringBuffer;
        InterfaceC5591lr interfaceC5591lrM22993k4;
        C5598um c5598um = this.f41337du;
        if (c5598um instanceof C5600uz) {
            stringBuffer = new StringBuffer("<missing type: ");
            stringBuffer.append(((C5600uz) this.f41337du).m22992k4());
        } else {
            if (c5598um instanceof C5603wy) {
                stringBuffer = new StringBuffer("<extraneous: ");
                interfaceC5591lrM22993k4 = ((C5603wy) this.f41337du).m22993k4();
            } else {
                if (c5598um instanceof C5586ix) {
                    stringBuffer = new StringBuffer("<mismatched token: ");
                } else if (c5598um instanceof C5602wl) {
                    stringBuffer = new StringBuffer("<unexpected: ");
                } else {
                    stringBuffer = new StringBuffer("<error: ");
                    stringBuffer.append(mo57918ck());
                }
                interfaceC5591lrM22993k4 = this.f41337du.f15424h4;
            }
            stringBuffer.append(interfaceC5591lrM22993k4);
            stringBuffer.append(", resync=");
            stringBuffer.append(mo57918ck());
        }
        stringBuffer.append(">");
        return stringBuffer.toString();
    }
}
