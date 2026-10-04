package com.aspose.slides.internal.p131fi;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9793up;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p505xn.C12576x6;
import com.aspose.slides.internal.p505xn.InterfaceC12559fa;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.fi.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C3997k4 implements InterfaceC12559fa {

    /* JADX INFO: renamed from: kk */
    private static InterfaceC12559fa f10918kk;

    /* JADX INFO: renamed from: k4 */
    protected static final String[] f10917k4 = {"/system/fonts", "/usr/share/fonts", C3141rv.m13412x1(C14052dq.m66566k4(5), ".fonts"), "/usr/local/share/fonts", "/usr/X11R6/lib/X11/fonts", "/usr/openwin/lib/X11/fonts", "/opt/kde3/share/fonts", "/usr/share/X11/fonts", "/run/current-system/sw/share/X11-fonts"};

    /* JADX INFO: renamed from: x1 */
    protected static final String[] f10919x1 = {C3141rv.m13412x1(C14052dq.m66566k4(5), "Library/Fonts/"), "/Library/Fonts/", "/Network/Library/Fonts/", "/System/Library/Fonts/", "/System Folder/Fonts/"};

    private C3997k4() {
    }

    /* JADX INFO: renamed from: kk */
    private String[] m15791kk() {
        String[] strArr = {"/etc/fonts/fonts.conf", C3141rv.m13412x1(C14052dq.m66566k4(5), ".fonts.conf"), C3141rv.m13412x1(C14052dq.m66566k4(5), ".config/fontconfig/fonts.conf")};
        List list = new List();
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            try {
                if (C3131h4.m13361kk(str)) {
                    list.addRange(AbstractC14092to.m67204k4((Object[]) m15790k4(str)));
                }
            } catch (RuntimeException e) {
                C6005k4.m24264to(C14113y2.m67402k4("Error occurs on reading file: '{0}'.{1}", str, e.getMessage()));
            }
            if (list.size() == 0) {
                for (String str2 : f10917k4) {
                    try {
                        if (C3142to.m13421kk(str2)) {
                            list.addItem(str2);
                        }
                    } catch (RuntimeException e2) {
                        C6005k4.m24264to(C14113y2.m67402k4("Error occurs in FontsSubsystem.readFontConfigurationFiles.\r\nDirectory: {0}\r\nMessage: {1}", str2, e2.getMessage()));
                    }
                }
            }
            if (list.size() == 0) {
                for (String str3 : f10919x1) {
                    try {
                        if (C3142to.m13421kk(str3)) {
                            list.addItem(str3);
                        }
                    } catch (RuntimeException e3) {
                        C6005k4.m24264to(C14113y2.m67402k4("Error occurs in FontsSubsystem.readFontConfigurationFiles.\r\nDirectory: {0}\r\nMessage: {1}", str3, e3.getMessage()));
                    }
                }
            }
        }
        return (String[]) list.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: to */
    private String m15792to() {
        try {
            try {
                return C3141rv.m13412x1(C14052dq.m66567k4("WINDIR"), "Fonts");
            } catch (Exception unused) {
                return C14113y2.f47374k4;
            }
        } catch (Exception unused2) {
            return new File("C:\\Windows\\Fonts").exists() ? "C:\\Windows\\Fonts" : C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC12559fa m15793x1() {
        if (f10918kk == null) {
            f10918kk = new C3997k4();
        }
        return f10918kk;
    }

    @Override // com.aspose.slides.internal.p505xn.InterfaceC12559fa
    /* JADX INFO: renamed from: k4 */
    public final void mo15794k4(IGenericDictionary<String, String> iGenericDictionary) {
    }

    @Override // com.aspose.slides.internal.p505xn.InterfaceC12559fa
    /* JADX INFO: renamed from: k4 */
    public final boolean mo15795k4(Object obj) {
        C5659x1 c5659x1 = (C5659x1) C7019kk.m27452k4(obj, C5659x1.class);
        if (c5659x1 != null && C7019kk.m27469x1(c5659x1.m23120k4().m48233um(), C9793up.class)) {
            String strM48254k4 = ((C9793up) c5659x1.m23120k4().m48233um()).m48254k4();
            String strM13400h4 = C12565ks.m58630x1(strM48254k4) ? C3141rv.m13400h4(strM48254k4) : null;
            if (C12565ks.m58630x1(strM13400h4)) {
                for (String str : mo15796k4()) {
                    if (C12565ks.m58631x1(strM13400h4, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p505xn.InterfaceC12559fa
    /* JADX INFO: renamed from: k4 */
    public final String[] mo15796k4() {
        int iM58708k4 = C12576x6.m58708k4();
        if (iM58708k4 == 0) {
            return new String[]{m15792to()};
        }
        if (iM58708k4 == 1) {
            return m15791kk();
        }
        if (iM58708k4 == 2) {
            return f10919x1;
        }
        throw new InvalidOperationException("Unknown operating system.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private String[] m15790k4(String str) {
        List list = new List();
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setXmlResolver(null);
        xmlDocument.load(str);
        IEnumerator it = xmlDocument.getElementsByTagName("dir").iterator();
        while (it.hasNext()) {
            try {
                String innerText = ((AbstractC13901ga) it.next()).getInnerText();
                if (C14113y2.m67448x1(innerText, "~")) {
                    innerText = C3141rv.m13412x1(C14052dq.m66566k4(5), C14113y2.m67396k4(innerText, 0, 2));
                }
                list.addItem(innerText);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        return (String[]) list.toArray(new String[0]);
    }
}
