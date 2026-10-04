package com.aspose.slides.internal.p217k4;

import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C5580c5 implements InterfaceC5591lr, Serializable {

    /* JADX INFO: renamed from: c5 */
    protected int f15366c5;

    /* JADX INFO: renamed from: du */
    protected transient InterfaceC5585h4 f15367du;

    /* JADX INFO: renamed from: dy */
    protected int f15368dy;

    /* JADX INFO: renamed from: h4 */
    protected String f15369h4;

    /* JADX INFO: renamed from: k4 */
    protected int f15370k4;

    /* JADX INFO: renamed from: kk */
    protected int f15371kk;

    /* JADX INFO: renamed from: m9 */
    protected int f15372m9;

    /* JADX INFO: renamed from: to */
    protected int f15373to;

    /* JADX INFO: renamed from: x1 */
    protected int f15374x1;

    public C5580c5(int i) {
        this.f15371kk = -1;
        this.f15373to = 0;
        this.f15372m9 = -1;
        this.f15370k4 = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: du */
    public int mo22912du() {
        return this.f15373to;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: h4 */
    public int mo22914h4() {
        return this.f15372m9;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: k4 */
    public int mo22915k4() {
        return this.f15370k4;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: kk */
    public int mo22919kk() {
        return this.f15374x1;
    }

    /* JADX INFO: renamed from: m9 */
    public int m22921m9() {
        return this.f15368dy;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: to */
    public int mo22922to() {
        return this.f15371kk;
    }

    public String toString() {
        String string;
        if (this.f15373to > 0) {
            StringBuffer stringBuffer = new StringBuffer(",channel=");
            stringBuffer.append(this.f15373to);
            string = stringBuffer.toString();
        } else {
            string = "";
        }
        String strMo22924x1 = mo22924x1();
        String strReplaceAll = strMo22924x1 != null ? strMo22924x1.replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t") : "<no text>";
        StringBuffer stringBuffer2 = new StringBuffer("[@");
        stringBuffer2.append(mo22914h4());
        stringBuffer2.append(",");
        stringBuffer2.append(this.f15368dy);
        stringBuffer2.append(C18241k5.f55433h);
        stringBuffer2.append(this.f15366c5);
        stringBuffer2.append("='");
        stringBuffer2.append(strReplaceAll);
        stringBuffer2.append("',<");
        stringBuffer2.append(this.f15370k4);
        stringBuffer2.append(">");
        stringBuffer2.append(string);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f15374x1);
        stringBuffer2.append(C18241k5.f55433h);
        stringBuffer2.append(mo22922to());
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: x1 */
    public String mo22924x1() {
        String str = this.f15369h4;
        if (str != null) {
            return str;
        }
        InterfaceC5585h4 interfaceC5585h4 = this.f15367du;
        if (interfaceC5585h4 == null) {
            return null;
        }
        String strMo22946k4 = interfaceC5585h4.mo22946k4(this.f15368dy, this.f15366c5);
        this.f15369h4 = strMo22946k4;
        return strMo22946k4;
    }

    public C5580c5(int i, String str) {
        this.f15371kk = -1;
        this.f15372m9 = -1;
        this.f15370k4 = i;
        this.f15373to = 0;
        this.f15369h4 = str;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: du */
    public void mo22913du(int i) {
        this.f15372m9 = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: k4 */
    public void mo22916k4(int i) {
        this.f15374x1 = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: kk */
    public void mo22920kk(int i) {
        this.f15373to = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: to */
    public void mo22923to(int i) {
        this.f15370k4 = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: x1 */
    public void mo22925x1(int i) {
        this.f15371kk = i;
    }

    public C5580c5(InterfaceC5585h4 interfaceC5585h4, int i, int i2, int i3, int i4) {
        this.f15371kk = -1;
        this.f15372m9 = -1;
        this.f15367du = interfaceC5585h4;
        this.f15370k4 = i;
        this.f15373to = i2;
        this.f15368dy = i3;
        this.f15366c5 = i4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m22917k4(InterfaceC5585h4 interfaceC5585h4) {
        this.f15367du = interfaceC5585h4;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: k4 */
    public void mo22918k4(String str) {
        this.f15369h4 = str;
    }
}
