package oOo00Oo0;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: oOo00Oo0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34518OooOoO {
    public static final void OooO00o(InterfaceC34517OooOo0o interfaceC34517OooOo0o, InterfaceC34517OooOo0o builder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34517OooOo0o, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        Iterator<T> it = builder.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            interfaceC34517OooOo0o.OooO00o((String) entry.getKey(), (List) entry.getValue());
        }
    }
}
