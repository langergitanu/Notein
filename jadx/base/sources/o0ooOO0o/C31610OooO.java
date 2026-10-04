package o0ooOO0o;

import android.util.Log;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import o00o0Ooo.C25432OooOO0;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31445OooOOO0;
import o0ooOoo.InterfaceC31671OooO0OO;
import o0ooo0.AbstractC31720OooOOOo;
import o0ooo0.C31723OooOOoo;
import o0ooo0.C31727OooOo0o;
import o0ooo0.C31728OooOoO;
import o0ooo0.C31729OooOoO0;
import o0ooo0.C31732OooOoo0;
import o0ooo0.OooOo;

/* JADX INFO: renamed from: o0ooOO0o.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31610OooO implements InterfaceC31671OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25432OooOO0 f113004OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113005OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final HashMap f113006OooOoO0;

    public C31610OooO() {
        this.f113006OooOoO0 = new HashMap();
        this.f113005OooOo0o = new C31436OooO0Oo();
        this.f113004OooOo = null;
    }

    public final C31441OooOO0 OooO00o(C31441OooOO0 c31441OooOO0, String str, InterfaceC31671OooO0OO interfaceC31671OooO0OO) {
        String str2;
        C31441OooOO0 c31441OooOO0OooOooo;
        C31436OooO0Oo c31436OooO0Oo = this.f113005OooOo0o;
        C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO0);
        if (c31436OooO0Oo2 != null) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0OooOOo0 = interfaceC31671OooO0OO.OooOOo0();
            boolean zContainsValue = c31436OooO0Oo2.f112222OooOoO0.containsValue(abstractC31434OooO0O0OooOOo0);
            if (!zContainsValue && (abstractC31434OooO0O0OooOOo0 instanceof C31445OooOOO0)) {
                zContainsValue = c31436OooO0Oo2.f112222OooOoO0.containsValue(((C31445OooOOO0) abstractC31434OooO0O0OooOOo0).f112467OooOo);
            }
            if (zContainsValue) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0OooOOo02 = interfaceC31671OooO0OO.OooOOo0();
                for (Map.Entry entry : c31436OooO0Oo2.f112222OooOoO0.entrySet()) {
                    Object value = entry.getValue();
                    if (value.equals(abstractC31434OooO0O0OooOOo02) || ((value instanceof C31445OooOOO0) && ((C31445OooOOO0) value).f112467OooOo.equals(abstractC31434OooO0O0OooOOo02))) {
                        return (C31441OooOO0) entry.getKey();
                    }
                }
                return null;
            }
        }
        if (c31436OooO0Oo2 != null && C31441OooOO0.f112300o0000o.equals(c31441OooOO0)) {
            for (Map.Entry entry2 : c31436OooO0Oo2.f112222OooOoO0.entrySet()) {
                if ((entry2.getValue() instanceof C31445OooOOO0) && interfaceC31671OooO0OO.OooOOo0() == ((C31445OooOOO0) entry2.getValue()).f112467OooOo) {
                    return (C31441OooOO0) entry2.getKey();
                }
            }
        }
        C31436OooO0Oo c31436OooO0Oo3 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO0);
        if (c31436OooO0Oo3 == null) {
            c31441OooOO0OooOooo = C31441OooOO0.OooOooo(str.concat("1"));
        } else {
            int size = c31436OooO0Oo3.f112222OooOoO0.keySet().size();
            do {
                size++;
                str2 = str + size;
            } while (c31436OooO0Oo3.f112222OooOoO0.containsKey(C31441OooOO0.OooOooo(str2)));
            c31441OooOO0OooOooo = C31441OooOO0.OooOooo(str2);
        }
        C31436OooO0Oo c31436OooO0Oo4 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO0);
        if (c31436OooO0Oo4 == null) {
            c31436OooO0Oo4 = new C31436OooO0Oo();
            c31436OooO0Oo.o000OoOO(c31441OooOO0, c31436OooO0Oo4);
        }
        c31436OooO0Oo4.o000OoOo(c31441OooOO0OooOooo, interfaceC31671OooO0OO);
        return c31441OooOO0OooOooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC31720OooOOOo OooO0O0(C31441OooOO0 c31441OooOO0) throws IOException {
        C31445OooOOO0 c31445OooOOO0;
        SoftReference softReference;
        AbstractC31720OooOOOo abstractC31720OooOOOo;
        AbstractC31720OooOOOo c31728OooOoO;
        C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112300o0000o;
        C31436OooO0Oo c31436OooO0Oo = this.f113005OooOo0o;
        C31436OooO0Oo c31436OooO0Oo2 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO02);
        AbstractC31720OooOOOo abstractC31720OooOOOo2 = null;
        if (c31436OooO0Oo2 == null) {
            c31445OooOOO0 = null;
        } else {
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0OoO0o = c31436OooO0Oo2.o0OoO0o(c31441OooOO0);
            if (abstractC31434OooO0O0O0OoO0o instanceof C31445OooOOO0) {
                c31445OooOOO0 = (C31445OooOOO0) abstractC31434OooO0O0O0OoO0o;
            }
        }
        HashMap map = this.f113006OooOoO0;
        C25432OooOO0 c25432OooOO0 = this.f113004OooOo;
        if (c25432OooOO0 != null && c31445OooOOO0 != null) {
            SoftReference softReference2 = (SoftReference) ((HashMap) c25432OooOO0.f86707OooO00o).get(c31445OooOOO0);
            AbstractC31720OooOOOo abstractC31720OooOOOo3 = softReference2 != null ? (AbstractC31720OooOOOo) softReference2.get() : null;
            if (abstractC31720OooOOOo3 != null) {
                return abstractC31720OooOOOo3;
            }
        } else if (c31445OooOOO0 == null && (softReference = (SoftReference) map.get(c31441OooOO0)) != null && (abstractC31720OooOOOo = (AbstractC31720OooOOOo) softReference.get()) != null) {
            return abstractC31720OooOOOo;
        }
        C31436OooO0Oo c31436OooO0Oo3 = (C31436OooO0Oo) c31436OooO0Oo.o0000O0O(c31441OooOO02);
        AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31436OooO0Oo3 == null ? null : c31436OooO0Oo3.o0000O0O(c31441OooOO0);
        if (abstractC31434OooO0O0O0000O0O instanceof C31436OooO0Oo) {
            C31436OooO0Oo c31436OooO0Oo4 = (C31436OooO0Oo) abstractC31434OooO0O0O0000O0O;
            AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O2 = c31436OooO0Oo4.o0000O0O(C31441OooOO0.f112403o00OO);
            C31441OooOO0 c31441OooOO03 = abstractC31434OooO0O0O0000O0O2 instanceof C31441OooOO0 ? (C31441OooOO0) abstractC31434OooO0O0O0000O0O2 : c31441OooOO02;
            if (!c31441OooOO02.equals(c31441OooOO03)) {
                Log.e("PdfBox-Android", "Expected 'Font' dictionary but found '" + c31441OooOO03.f112461OooOo + "'");
            }
            C31441OooOO0 c31441OooOO0O0Oo0oo = c31436OooO0Oo4.o0Oo0oo(C31441OooOO0.f112404o00OO0);
            if (C31441OooOO0.f112416o00OOO0.equals(c31441OooOO0O0Oo0oo)) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O3 = c31436OooO0Oo4.o0000O0O(C31441OooOO0.f112305o0000oOO);
                if (abstractC31434OooO0O0O0000O0O3 instanceof C31436OooO0Oo) {
                    c31728OooOoO = ((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O3).f112222OooOoO0.containsKey(C31441OooOO0.f112276o000) ? new C31729OooOoO0(c31436OooO0Oo4) : new C31728OooOoO(c31436OooO0Oo4);
                }
            } else if (C31441OooOO0.f112355o000oOoo.equals(c31441OooOO0O0Oo0oo)) {
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O4 = c31436OooO0Oo4.o0000O0O(C31441OooOO0.f112305o0000oOO);
                if (abstractC31434OooO0O0O0000O0O4 instanceof C31436OooO0Oo) {
                    c31728OooOoO = ((C31436OooO0Oo) abstractC31434OooO0O0O0000O0O4).f112222OooOoO0.containsKey(C31441OooOO0.f112276o000) ? new C31729OooOoO0(c31436OooO0Oo4) : new C31723OooOOoo(c31436OooO0Oo4);
                }
            } else if (C31441OooOO0.f112414o00OO0oo.equals(c31441OooOO0O0Oo0oo)) {
                c31728OooOoO = new C31727OooOo0o(c31436OooO0Oo4);
            } else if (C31441OooOO0.f112418o00OOO0O.equals(c31441OooOO0O0Oo0oo)) {
                C31732OooOoo0 c31732OooOoo0 = new C31732OooOoo0(c31436OooO0Oo4);
                c31732OooOoo0.OooOo0();
                c31728OooOoO = c31732OooOoo0;
            } else if (C31441OooOO0.f112417o00OOO00.equals(c31441OooOO0O0Oo0oo)) {
                c31728OooOoO = new OooOo(c31436OooO0Oo4);
            } else {
                if (C31441OooOO0.f112274Ooooooo.equals(c31441OooOO0O0Oo0oo)) {
                    throw new IllegalArgumentException("Type 0 descendant font not allowed");
                }
                if (C31441OooOO0.f112446o0OoOo0.equals(c31441OooOO0O0Oo0oo)) {
                    throw new IllegalArgumentException("Type 2 descendant font not allowed");
                }
                Log.w("PdfBox-Android", "Invalid font subtype '" + c31441OooOO0O0Oo0oo + "'");
                c31728OooOoO = new C31728OooOoO(c31436OooO0Oo4);
            }
            abstractC31720OooOOOo2 = c31728OooOoO;
        }
        if (c25432OooOO0 != null && c31445OooOOO0 != null) {
            ((HashMap) c25432OooOO0.f86707OooO00o).put(c31445OooOOO0, new SoftReference(abstractC31720OooOOOo2));
            return abstractC31720OooOOOo2;
        }
        if (c31445OooOOO0 == null) {
            map.put(c31441OooOO0, new SoftReference(abstractC31720OooOOOo2));
        }
        return abstractC31720OooOOOo2;
    }

    @Override // o0ooOoo.InterfaceC31671OooO0OO
    public final AbstractC31434OooO0O0 OooOOo0() {
        return this.f113005OooOo0o;
    }

    public C31610OooO(C31436OooO0Oo c31436OooO0Oo) {
        this.f113006OooOoO0 = new HashMap();
        if (c31436OooO0Oo != null) {
            this.f113005OooOo0o = c31436OooO0Oo;
            this.f113004OooOo = null;
            return;
        }
        throw new IllegalArgumentException("resourceDictionary is null");
    }

    public C31610OooO(C31436OooO0Oo c31436OooO0Oo, C25432OooOO0 c25432OooOO0) {
        this.f113006OooOoO0 = new HashMap();
        if (c31436OooO0Oo != null) {
            this.f113005OooOo0o = c31436OooO0Oo;
            this.f113004OooOo = c25432OooOO0;
            return;
        }
        throw new IllegalArgumentException("resourceDictionary is null");
    }
}
