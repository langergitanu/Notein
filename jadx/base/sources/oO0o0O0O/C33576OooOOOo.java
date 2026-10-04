package oO0o0O0O;

import Oooo0oO.o0Oo0oo;
import com.facebook.soloader.OooOo;
import io.ktor.utils.p616io.C23988OooooOO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import o0OoO0oo.C28819o000oOoo;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: oO0o0O0O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33576OooOOOo extends C33574OooOOO0 {
    public static <T> int OooOO0O(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo) {
        Iterator<? extends T> it = interfaceC33569OooO0oo.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C34429OooOOo0.OooOOo0();
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> InterfaceC33569OooO0oo<T> OooOO0o(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo, int i) {
        if (i >= 0) {
            return i == 0 ? interfaceC33569OooO0oo : interfaceC33569OooO0oo instanceof InterfaceC33564OooO0OO ? ((InterfaceC33564OooO0OO) interfaceC33569OooO0oo).OooO00o(i) : new C33563OooO0O0(interfaceC33569OooO0oo, i);
        }
        throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Requested element count ", " is less than zero.").toString());
    }

    public static C33567OooO0o0 OooOOO(InterfaceC33569OooO0oo interfaceC33569OooO0oo, InterfaceC32507OooOO0o predicate) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(predicate, "predicate");
        return new C33567OooO0o0(interfaceC33569OooO0oo, false, predicate);
    }

    public static C33567OooO0o0 OooOOO0(InterfaceC33569OooO0oo interfaceC33569OooO0oo, InterfaceC32507OooOO0o predicate) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33569OooO0oo, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(predicate, "predicate");
        return new C33567OooO0o0(interfaceC33569OooO0oo, true, predicate);
    }

    public static <T> T OooOOOO(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo) {
        Iterator<? extends T> it = interfaceC33569OooO0oo.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static C33566OooO0o OooOOOo(InterfaceC33569OooO0oo interfaceC33569OooO0oo, InterfaceC32507OooOO0o transform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        return new C33566OooO0o(interfaceC33569OooO0oo, transform, C33575OooOOOO.f121217OooOo0o);
    }

    public static <T> T OooOOo(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo) {
        Iterator<? extends T> it = interfaceC33569OooO0oo.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static String OooOOo0(InterfaceC33569OooO0oo interfaceC33569OooO0oo, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33569OooO0oo, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : interfaceC33569OooO0oo) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            C23988OooooOO.OooO00o(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static C33577OooOOo OooOOoo(InterfaceC33569OooO0oo interfaceC33569OooO0oo, InterfaceC32507OooOO0o transform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        return new C33577OooOOo(interfaceC33569OooO0oo, transform);
    }

    public static <T> List<T> OooOo0(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33569OooO0oo, "<this>");
        Iterator<? extends T> it = interfaceC33569OooO0oo.iterator();
        if (!it.hasNext()) {
            return C34434OooOoO.f123453OooOo0o;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return OooOo.OooO0oO(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static C33567OooO0o0 OooOo00(InterfaceC33569OooO0oo interfaceC33569OooO0oo, InterfaceC32507OooOO0o transform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        return OooOOO(new C33577OooOOo(interfaceC33569OooO0oo, transform), new C28819o000oOoo(1));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static Set OooOo0O(C33577OooOOo c33577OooOOo) {
        Iterator it = c33577OooOOo.f121218OooO00o.iterator();
        if (!it.hasNext()) {
            return C34438OooOoo0.f123458OooOo0o;
        }
        Object next = it.next();
        InterfaceC32507OooOO0o<T, R> interfaceC32507OooOO0o = c33577OooOOo.f121219OooO0O0;
        Object objInvoke = interfaceC32507OooOO0o.invoke((T) next);
        if (!it.hasNext()) {
            return C34449Oooo0oo.OooOO0(objInvoke);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(objInvoke);
        while (it.hasNext()) {
            linkedHashSet.add(interfaceC32507OooOO0o.invoke((T) it.next()));
        }
        return linkedHashSet;
    }
}
