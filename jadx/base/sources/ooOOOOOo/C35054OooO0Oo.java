package ooOOOOOo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00O0o0.OooOO0O;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0o0O0o.C33591OooOOO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.OooOo;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: ooOOOOOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35054OooO0Oo extends UnsupportedOperationException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f125915OooOo0o;

    /* JADX INFO: renamed from: ooOOOOOo.OooO0Oo$OooO00o */
    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<C32443OooOOO<? extends String, ? extends String>, CharSequence> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f125916OooOo0o = new OooO00o(1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final CharSequence invoke(C32443OooOOO<? extends String, ? extends String> c32443OooOOO) {
            C32443OooOOO<? extends String, ? extends String> c32443OooOOO2 = c32443OooOOO;
            OooOOO0.OooO0oO(c32443OooOOO2, "<name for destructuring parameter 0>");
            return ((String) c32443OooOOO2.f116638OooOo0o) + ": " + ((String) c32443OooOOO2.f116637OooOo) + '\n';
        }
    }

    public C35054OooO0Oo(AbstractC33200OooO0OO abstractC33200OooO0OO, InterfaceC34595OooO0Oo<?> from, InterfaceC34595OooO0Oo<?> to) {
        OooOOO0.OooO0oO(from, "from");
        OooOOO0.OooO0oO(to, "to");
        StringBuilder sb = new StringBuilder("No transformation found: ");
        sb.append(from);
        sb.append(" -> ");
        sb.append(to);
        sb.append("\n        |with response from ");
        sb.append(abstractC33200OooO0OO.OooO00o().OooO0Oo().getUrl());
        sb.append(":\n        |status: ");
        sb.append(abstractC33200OooO0OO.OooO0o());
        sb.append("\n        |response headers: \n        |");
        OooOO0O headers = abstractC33200OooO0OO.getHeaders();
        OooOOO0.OooO0oO(headers, "<this>");
        Set<Map.Entry<String, List<String>>> setEntries = headers.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C32443OooOOO(entry.getKey(), (String) it2.next()));
            }
            C34431OooOo0.OooOo0o(arrayList, arrayList2);
        }
        sb.append(OooOo.o000oOoO(arrayList, null, null, null, OooO00o.f125916OooOo0o, 31));
        sb.append("\n    ");
        this.f125915OooOo0o = C33591OooOOO.OooO(sb.toString());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f125915OooOo0o;
    }
}
