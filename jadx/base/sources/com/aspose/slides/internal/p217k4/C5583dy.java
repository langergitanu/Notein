package com.aspose.slides.internal.p217k4;

import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.dy */
/* JADX INFO: loaded from: classes.dex */
public class C5583dy implements InterfaceC5591lr {

    /* JADX INFO: renamed from: du */
    protected int f15385du = 0;

    /* JADX INFO: renamed from: h4 */
    protected int f15386h4;

    /* JADX INFO: renamed from: k4 */
    protected String f15387k4;

    /* JADX INFO: renamed from: kk */
    protected int f15388kk;

    /* JADX INFO: renamed from: to */
    protected int f15389to;

    /* JADX INFO: renamed from: x1 */
    protected int f15390x1;

    public C5583dy(int i) {
        this.f15390x1 = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: du */
    public int mo22912du() {
        return this.f15385du;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: h4 */
    public int mo22914h4() {
        return this.f15386h4;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: k4 */
    public int mo22915k4() {
        return this.f15390x1;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: kk */
    public int mo22919kk() {
        return this.f15388kk;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: to */
    public int mo22922to() {
        return this.f15389to;
    }

    public String toString() {
        String string;
        if (this.f15385du > 0) {
            StringBuffer stringBuffer = new StringBuffer(",channel=");
            stringBuffer.append(this.f15385du);
            string = stringBuffer.toString();
        } else {
            string = "";
        }
        String strMo22924x1 = mo22924x1();
        String strReplaceAll = strMo22924x1 != null ? strMo22924x1.replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t") : "<no text>";
        StringBuffer stringBuffer2 = new StringBuffer("[@");
        stringBuffer2.append(mo22914h4());
        stringBuffer2.append(",'");
        stringBuffer2.append(strReplaceAll);
        stringBuffer2.append("',<");
        stringBuffer2.append(this.f15390x1);
        stringBuffer2.append(">");
        stringBuffer2.append(string);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f15388kk);
        stringBuffer2.append(C18241k5.f55433h);
        stringBuffer2.append(mo22922to());
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: x1 */
    public String mo22924x1() {
        return this.f15387k4;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: du */
    public void mo22913du(int i) {
        this.f15386h4 = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: k4 */
    public void mo22916k4(int i) {
        this.f15388kk = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: kk */
    public void mo22920kk(int i) {
        this.f15385du = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: to */
    public void mo22923to(int i) {
        this.f15390x1 = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: x1 */
    public void mo22925x1(int i) {
        this.f15389to = i;
    }

    @Override // com.aspose.slides.internal.p217k4.InterfaceC5591lr
    /* JADX INFO: renamed from: k4 */
    public void mo22918k4(String str) {
        this.f15387k4 = str;
    }
}
