package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p437u9.C11294h4;
import com.aspose.slides.internal.p437u9.InterfaceC11299to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.um */
/* JADX INFO: loaded from: classes3.dex */
public class C1651um implements InterfaceC11299to {

    /* JADX INFO: renamed from: kk */
    private static InterfaceC11299to f6358kk;

    /* JADX INFO: renamed from: k4 */
    protected static String[] f6357k4 = {"/system/fonts", "/usr/share/fonts", C3141rv.m13412x1(C14052dq.m66566k4(5), ".fonts"), "/usr/local/share/fonts", "/usr/X11R6/lib/X11/fonts", "/usr/openwin/lib/X11/fonts", "/opt/kde3/share/fonts", "/usr/share/X11/fonts", "/run/current-system/sw/share/X11-fonts"};

    /* JADX INFO: renamed from: x1 */
    protected static String[] f6359x1 = {C3141rv.m13412x1(C14052dq.m66566k4(5), "Library/Fonts/"), "/Library/Fonts/", "/Network/Library/Fonts/", "/System/Library/Fonts/", "/System Folder/Fonts/"};

    private C1651um() {
    }

    /* JADX INFO: renamed from: kk */
    private String[] m8965kk() {
        String[] strArr = {"/etc/fonts/fonts.conf", C3141rv.m13412x1(C14052dq.m66566k4(5), ".fonts.conf"), C3141rv.m13412x1(C14052dq.m66566k4(5), ".config/fontconfig/fonts.conf")};
        List list = new List();
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            try {
                if (C3131h4.m13361kk(str)) {
                    list.addRange(AbstractC14092to.m67204k4((Object[]) m8964k4(str)));
                }
            } catch (RuntimeException e) {
                C6005k4.m24264to(C14113y2.m67402k4("Error occurs on reading file: '{0}'.{1}", str, e.getMessage()));
            }
            if (list.size() == 0) {
                for (String str2 : f6357k4) {
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
                for (String str3 : f6359x1) {
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
    private String m8966to() {
        try {
            return C3141rv.m13412x1(C14052dq.m66567k4("WINDIR"), "Fonts");
        } catch (SecurityException unused) {
            return C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC11299to m8967x1() {
        if (f6358kk == null) {
            f6358kk = new C1651um();
        }
        return f6358kk;
    }

    @Override // com.aspose.slides.internal.p437u9.InterfaceC11299to
    /* JADX INFO: renamed from: k4 */
    public final void mo8968k4(Dictionary<String, String> dictionary) {
    }

    @Override // com.aspose.slides.internal.p437u9.InterfaceC11299to
    /* JADX INFO: renamed from: k4 */
    public final String[] mo8969k4() {
        int iM54272k4 = C11294h4.m54272k4();
        if (iM54272k4 == 0) {
            return new String[]{m8966to()};
        }
        if (iM54272k4 == 1) {
            return m8965kk();
        }
        if (iM54272k4 == 2) {
            return f6359x1;
        }
        throw new InvalidOperationException("Unknown operating system.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private String[] m8964k4(String str) {
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
