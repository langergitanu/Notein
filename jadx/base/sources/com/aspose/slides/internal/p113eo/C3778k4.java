package com.aspose.slides.internal.p113eo;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p474wg.AbstractC11994yg;
import com.aspose.slides.internal.p474wg.C11975um;
import com.aspose.slides.internal.p474wg.C11986x1;
import com.aspose.slides.internal.p474wg.InterfaceC11918ak;
import com.aspose.slides.internal.p474wg.InterfaceC11926c6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.eo.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3778k4 implements InterfaceC11918ak {

    /* JADX INFO: renamed from: k4 */
    static final Hashtable f10289k4 = new Hashtable();

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11918ak
    /* JADX INFO: renamed from: k4 */
    public C11986x1 mo15100k4(String str, AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        C11986x1 c11986x1M15103k4;
        if (interfaceC11926c6 == null || str == null) {
            return null;
        }
        String strM67440x1 = C14113y2.m67440x1(str);
        if (C14113y2.m67364dy(C14113y2.m67368h4(strM67440x1), "ntlm") == -1) {
            return null;
        }
        int iM67384k4 = C14113y2.m67384k4(strM67440x1, new char[]{ControlChar.SPACE_CHAR, '\t'});
        String strM67440x12 = iM67384k4 != -1 ? C14113y2.m67440x1(C14113y2.m67422kk(strM67440x1, iM67384k4)) : null;
        C11975um c11975um = (C11975um) C7019kk.m27452k4((Object) abstractC11994yg, C11975um.class);
        if (c11975um == null) {
            return null;
        }
        Hashtable hashtable = f10289k4;
        synchronized (hashtable) {
            try {
                C3779x1 c3779x1 = (C3779x1) hashtable.get_Item(c11975um);
                if (c3779x1 == null) {
                    c3779x1 = new C3779x1();
                    hashtable.addItem(c11975um, c3779x1);
                }
                c11986x1M15103k4 = c3779x1.m15103k4(strM67440x12, abstractC11994yg, interfaceC11926c6);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11986x1M15103k4;
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11918ak
    /* JADX INFO: renamed from: x1 */
    public C11986x1 mo15102x1(AbstractC11994yg abstractC11994yg, InterfaceC11926c6 interfaceC11926c6) {
        return null;
    }

    @Override // com.aspose.slides.internal.p474wg.InterfaceC11918ak
    /* JADX INFO: renamed from: k4 */
    public String mo15101k4() {
        return "NTLM";
    }
}
