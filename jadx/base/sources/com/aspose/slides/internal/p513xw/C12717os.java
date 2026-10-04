package com.aspose.slides.internal.p513xw;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.os */
/* JADX INFO: loaded from: classes5.dex */
public class C12717os {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12711lr f42301k4;

    /* JADX INFO: renamed from: x1 */
    private int f42302x1;

    public C12717os(InterfaceC12711lr interfaceC12711lr) {
        this.f42302x1 = -1;
        this.f42301k4 = interfaceC12711lr;
    }

    /* JADX INFO: renamed from: du */
    public final int m59073du() {
        return this.f42302x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m59074h4() {
        if (m59077to() == null) {
            return CloudMetaExtra.DEFINE_NON_PARENT_ID;
        }
        String string = m59077to().toString();
        int iM67418kk = C14113y2.m67418kk(string, FilenameUtils.EXTENSION_SEPARATOR);
        return (iM67418kk < 0 || C14113y2.m67429to(string, '@') <= 0) ? string : C14113y2.m67422kk(string, iM67418kk + 1);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12711lr m59075k4(int i) {
        C12717os c12717osM59078x1 = m59078x1(i);
        if (c12717osM59078x1 == null) {
            return null;
        }
        return c12717osM59078x1.m59077to();
    }

    /* JADX INFO: renamed from: kk */
    public C12717os mo58860kk() {
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final InterfaceC12711lr m59077to() {
        return this.f42301k4;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4("Position:").m26805kk(m59073du()).m26792k4("(");
        c6765kp.m26792k4(m59074h4());
        c6765kp.m26792k4(")");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: w_ */
    public boolean mo48915w_() {
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12717os m59078x1(int i) {
        int i2 = 0;
        C12717os c12717osMo58860kk = this;
        while (i2 < i && c12717osMo58860kk != null) {
            i2++;
            c12717osMo58860kk = c12717osMo58860kk.mo58860kk();
        }
        return c12717osMo58860kk;
    }

    public C12717os(InterfaceC12711lr interfaceC12711lr, int i) {
        this(interfaceC12711lr);
        m59076kk(i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m59076kk(int i) {
        this.f42302x1 = i;
    }
}
