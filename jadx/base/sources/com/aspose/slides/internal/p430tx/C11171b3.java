package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.b3 */
/* JADX INFO: loaded from: classes4.dex */
public class C11171b3 {

    /* JADX INFO: renamed from: to */
    private static Hashtable f38459to = m53677k4();

    /* JADX INFO: renamed from: k4 */
    private boolean f38460k4;

    /* JADX INFO: renamed from: kk */
    private boolean f38461kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f38462x1;

    /* JADX INFO: renamed from: k4 */
    private static Hashtable m53677k4() {
        Hashtable hashtable = new Hashtable(26, AbstractC14070jw.m66789to());
        hashtable.addItem("action", m53679k4(false, true, false));
        hashtable.addItem("checked", m53679k4(true, false, false));
        hashtable.addItem("cite", m53679k4(false, true, false));
        hashtable.addItem("classid", m53679k4(false, true, false));
        hashtable.addItem("codebase", m53679k4(false, true, false));
        hashtable.addItem("compact", m53679k4(true, false, false));
        hashtable.addItem(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, m53679k4(false, true, false));
        hashtable.addItem("datasrc", m53679k4(false, true, false));
        hashtable.addItem("declare", m53679k4(true, false, false));
        hashtable.addItem("defer", m53679k4(true, false, false));
        hashtable.addItem("disabled", m53679k4(true, false, false));
        hashtable.addItem("for", m53679k4(false, true, false));
        hashtable.addItem("href", m53679k4(false, true, false));
        hashtable.addItem("ismap", m53679k4(true, false, false));
        hashtable.addItem("longdesc", m53679k4(false, true, false));
        hashtable.addItem("multiple", m53679k4(true, false, false));
        hashtable.addItem("name", m53679k4(false, false, true));
        hashtable.addItem("nohref", m53679k4(true, false, false));
        hashtable.addItem("noresize", m53679k4(true, false, false));
        hashtable.addItem("noshade", m53679k4(true, false, false));
        hashtable.addItem("nowrap", m53679k4(true, false, false));
        hashtable.addItem("profile", m53679k4(false, true, false));
        hashtable.addItem("readonly", m53679k4(true, false, false));
        hashtable.addItem("selected", m53679k4(true, false, false));
        hashtable.addItem("src", m53679k4(false, true, false));
        hashtable.addItem("usemap", m53679k4(false, true, false));
        return hashtable;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11171b3 m53678k4(String str) {
        return (C11171b3) f38459to.get_Item(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static C11171b3 m53679k4(boolean z, boolean z2, boolean z3) {
        C11171b3 c11171b3 = new C11171b3();
        c11171b3.f38460k4 = z;
        c11171b3.f38462x1 = z2;
        c11171b3.f38461kk = z3;
        return c11171b3;
    }
}
