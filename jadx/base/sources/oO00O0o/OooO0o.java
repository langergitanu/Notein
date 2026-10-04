package oO00O0o;

import OooOoo0.o00000;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18190ga;
import java.util.ArrayList;
import java.util.List;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;
import oOo00OO0.C34479OooO0OO;
import oOo00OO0.C34480OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C34479OooO0OO<C32443OooOOO<String, OooO0o>> f115469OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0o f115470OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f115471OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f115472OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f115473OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<String> f115474OooO0Oo;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C32443OooOOO<? extends String, ? extends OooO0o>, Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f115475OooOo0o = new OooO00o(1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Integer invoke(C32443OooOOO<? extends String, ? extends OooO0o> c32443OooOOO) {
            C32443OooOOO<? extends String, ? extends OooO0o> it = c32443OooOOO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return Integer.valueOf(((String) it.f116638OooOo0o).length());
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends String, ? extends OooO0o>, Integer, Character> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f115476OooOo0o = new OooO0O0(2);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Character invoke(C32443OooOOO<? extends String, ? extends OooO0o> c32443OooOOO, Integer num) {
            C32443OooOOO<? extends String, ? extends OooO0o> t = c32443OooOOO;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.OooOOO0.OooO0oO(t, "t");
            return Character.valueOf(((String) t.f116638OooOo0o).charAt(iIntValue));
        }
    }

    public static final class OooO0OO {
        /* JADX WARN: Multi-variable type inference failed */
        public static OooO0o OooO00o(C34480OooO0Oo.OooO00o oooO00o) {
            int i;
            OooO0o oooO0o = null;
            if (oooO00o == null) {
                return null;
            }
            List listOooO0O0 = C34479OooO0OO.OooO0O0(OooO0o.f115469OooO0o, oooO00o, 0, 0, C32178OooO0oO.f115484OooOo0o, 6);
            if (listOooO0O0.size() == 1) {
                return (OooO0o) ((C32443OooOOO) listOooO0O0.get(0)).f116637OooOo;
            }
            int length = oooO00o.length();
            ArrayList arrayList = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                while (true) {
                    char cCharAt = oooO00o.charAt(i2);
                    if (cCharAt != ' ' && cCharAt != ',') {
                        i3 = i2;
                        i = i3;
                        break;
                    }
                    i2++;
                    if (i2 >= length) {
                        i = i2;
                        break;
                    }
                }
                while (i < length) {
                    char cCharAt2 = oooO00o.charAt(i);
                    if (cCharAt2 == ' ' || cCharAt2 == ',') {
                        break;
                    }
                    i++;
                }
                C32443OooOOO c32443OooOOO = (C32443OooOOO) OooOo.o0OoOo0(OooO0o.f115469OooO0o.OooO00o(oooO00o, i3, i, true, C32179OooO0oo.f115485OooOo0o));
                if (c32443OooOOO == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(oooO00o.subSequence(i3, i).toString());
                } else {
                    B b = c32443OooOOO.f116637OooOo;
                    if (oooO0o == null) {
                        oooO0o = (OooO0o) b;
                    } else {
                        i2 = i;
                        oooO0o = new OooO0o(oooO0o.f115471OooO00o || ((OooO0o) b).f115471OooO00o, oooO0o.f115472OooO0O0 || ((OooO0o) b).f115472OooO0O0, oooO0o.f115473OooO0OO || ((OooO0o) b).f115473OooO0OO, C34434OooOoO.f123453OooOo0o);
                    }
                }
                i2 = i;
            }
            if (oooO0o == null) {
                oooO0o = OooO0o.f115470OooO0o0;
            }
            return arrayList == null ? oooO0o : new OooO0o(oooO0o.f115471OooO00o, oooO0o.f115472OooO0O0, oooO0o.f115473OooO0OO, arrayList);
        }
    }

    static {
        OooO0o oooO0o = new OooO0o(14);
        OooO0o oooO0o2 = new OooO0o(13);
        f115470OooO0o0 = oooO0o2;
        f115469OooO0o = C34479OooO0OO.OooO00o.OooO00o(C34429OooOOo0.OooOO0o(new C32443OooOOO("close", oooO0o), new C32443OooOOO(C18190ga.f54965j, oooO0o2), new C32443OooOOO(C18190ga.f54970o, new OooO0o(11))), OooO00o.f115475OooOo0o, OooO0O0.f115476OooOo0o);
    }

    public OooO0o() {
        this(15);
    }

    public final String OooO00o() {
        StringBuilder sb = new StringBuilder();
        List<String> list = this.f115474OooO0Oo;
        ArrayList arrayList = new ArrayList(list.size() + 3);
        if (this.f115471OooO00o) {
            arrayList.add("close");
        }
        if (this.f115472OooO0O0) {
            arrayList.add(C18190ga.f54965j);
        }
        if (this.f115473OooO0OO) {
            arrayList.add(HttpHeaders.UPGRADE);
        }
        List<String> list2 = list;
        if (!list2.isEmpty()) {
            arrayList.addAll(list2);
        }
        OooOo.OoooOO0(arrayList, sb, null, null, null, null, 126);
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO0o.class != obj.getClass()) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return this.f115471OooO00o == oooO0o.f115471OooO00o && this.f115472OooO0O0 == oooO0o.f115472OooO0O0 && this.f115473OooO0OO == oooO0o.f115473OooO0OO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115474OooO0Oo, oooO0o.f115474OooO0Oo);
    }

    public final int hashCode() {
        return this.f115474OooO0Oo.hashCode() + o00000.OooO0O0(o00000.OooO0O0(Boolean.hashCode(this.f115471OooO00o) * 31, 31, this.f115472OooO0O0), 31, this.f115473OooO0OO);
    }

    public final String toString() {
        if (!this.f115474OooO0Oo.isEmpty()) {
            return OooO00o();
        }
        boolean z = this.f115473OooO0OO;
        boolean z2 = this.f115472OooO0O0;
        boolean z3 = this.f115471OooO00o;
        return (!z3 || z2 || z) ? (z3 || !z2 || z) ? (!z3 && z2 && z) ? "keep-alive, Upgrade" : OooO00o() : C18190ga.f54965j : "close";
    }

    public OooO0o(boolean z, boolean z2, boolean z3, List<String> list) {
        this.f115471OooO00o = z;
        this.f115472OooO0O0 = z2;
        this.f115473OooO0OO = z3;
        this.f115474OooO0Oo = list;
    }

    public /* synthetic */ OooO0o(int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, C34434OooOoO.f123453OooOo0o);
    }
}
