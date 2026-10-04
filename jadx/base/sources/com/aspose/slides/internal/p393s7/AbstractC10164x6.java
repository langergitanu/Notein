package com.aspose.slides.internal.p393s7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.s7.x6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10164x6 implements InterfaceC10158ks {

    /* JADX INFO: renamed from: k4 */
    protected InterfaceC10162up f36588k4;

    /* JADX INFO: renamed from: kk */
    private List<Character> f36589kk;

    /* JADX INFO: renamed from: x1 */
    private long f36590x1 = 0;

    /* JADX INFO: renamed from: h4 */
    public final void m49988h4() {
        this.f36590x1++;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo15566k4(int i);

    /* JADX INFO: renamed from: k4 */
    public abstract String mo15568k4();

    /* JADX INFO: renamed from: k4 */
    public final void m49990k4(InterfaceC10162up interfaceC10162up) {
        this.f36588k4 = interfaceC10162up;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo15569k4(char c);

    /* JADX INFO: renamed from: kk */
    public abstract String mo15571kk();

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26780k4('{');
        c6765kp.m26792k4(mo15571kk());
        c6765kp.m26780k4('}');
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: x1 */
    public abstract String mo15575x1();

    /* JADX INFO: renamed from: h4 */
    public final void m49989h4(int i) {
        if (this.f36589kk == null) {
            this.f36589kk = new List<>();
        }
        if (this.f36589kk.size() < 8) {
            char c = (char) i;
            if (this.f36589kk.containsItem(Character.valueOf(c))) {
                return;
            }
            this.f36589kk.addItem(Character.valueOf(c));
            InterfaceC10162up interfaceC10162up = this.f36588k4;
            if (interfaceC10162up != null) {
                interfaceC10162up.mo49928k4(this, c, mo15575x1());
            }
        }
    }
}
