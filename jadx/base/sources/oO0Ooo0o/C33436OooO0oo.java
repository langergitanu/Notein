package oO0Ooo0o;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o000ooo.C24746OooO00o;
import oO000oOo.C32126OooO0Oo;
import oO000oOo.C32127OooO0o0;
import oO000oo.C32132OooO0Oo;
import oO000oo.C32136OooO0oo;
import oO000oo.InterfaceC32130OooO0O0;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32190OooOOo0;
import oO00O0o0.C32206Oooo0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Oo0Oo.C33199OooO0O0;
import oO0Oo0Oo.C33205OooO0oo;
import oO0Ooo0O.InterfaceC33394OooOo;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33662Ooooooo;
import oOo00Oo0.C34502OooO00o;

/* JADX INFO: renamed from: oO0Ooo0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33436OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33435OooO0oO f120868OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f120869OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList f120870OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f120871OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f120867OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C34502OooO00o<C33436OooO0oo> f120866OooO0o = new C34502OooO00o<>("ClientLogging");

    /* JADX INFO: renamed from: oO0Ooo0o.OooO0oo$OooO00o */
    public static final class OooO00o implements InterfaceC33394OooOo<OooO0O0, C33436OooO0oo> {
        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C33436OooO0oo OooO00o(InterfaceC32507OooOO0o<? super OooO0O0, C32460OooOooO> interfaceC32507OooOO0o) {
            OooO0O0 oooO0O0 = new OooO0O0();
            interfaceC32507OooOO0o.invoke(oooO0O0);
            return new C33436OooO0oo(new C33435OooO0oO(), oooO0O0.f120874OooO0OO, oooO0O0.f120872OooO00o, oooO0O0.f120873OooO0O0);
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final void OooO0O0(C33436OooO0oo c33436OooO0oo, oO000o0.OooO0o scope) {
            C33436OooO0oo plugin = c33436OooO0oo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(plugin, "plugin");
            kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
            scope.f114955OooOoo.OooO0o(C32136OooO0oo.f115232OooO0oo, new C33438OooOO0O(plugin, null));
            C33439OooOO0o c33439OooOO0o = new C33439OooOO0o(plugin, null);
            C33199OooO0O0 c33199OooO0O0 = scope.f114957OooOooO;
            c33199OooO0O0.OooO0o(C33199OooO0O0.f120148OooO0oO, c33439OooOO0o);
            scope.f114956OooOoo0.OooO0o(C33205OooO0oo.f120159OooO0o, new C33441OooOOO0(plugin, null));
            if (C33434OooO0o0.OooO00o(plugin.f120869OooO0O0)) {
                c33199OooO0O0.OooO0o(C33199OooO0O0.f120149OooO0oo, new C32126OooO0Oo(new C32127OooO0o0(new C33440OooOOO(plugin, null)), scope, null));
            }
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C34502OooO00o<C33436OooO0oo> getKey() {
            return C33436OooO0oo.f120866OooO0o;
        }
    }

    /* JADX INFO: renamed from: oO0Ooo0o.OooO0oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f120872OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f120873OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f120874OooO0OO = 2;
    }

    public C33436OooO0oo() {
        throw null;
    }

    public C33436OooO0oo(C33435OooO0oO c33435OooO0oO, int i, ArrayList arrayList, ArrayList arrayList2) {
        this.f120868OooO00o = c33435OooO0oO;
        this.f120869OooO0O0 = i;
        this.f120870OooO0OO = arrayList;
        this.f120871OooO0Oo = arrayList2;
    }

    public static final Object OooO00o(C33436OooO0oo c33436OooO0oo, C32132OooO0Oo c32132OooO0Oo, C33438OooOO0O c33438OooOO0O) {
        Charset charsetOooO0Oo;
        c33436OooO0oo.getClass();
        Object obj = c32132OooO0Oo.f115206OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        oO00O0oO.OooO0OO oooO0OO = (oO00O0oO.OooO0OO) obj;
        C33432OooO0Oo c33432OooO0Oo = new C33432OooO0Oo(c33436OooO0oo.f120868OooO00o);
        c32132OooO0Oo.f115207OooO0o.OooO0o0(C33442OooOOOO.f120893OooO00o, c33432OooO0Oo);
        StringBuilder sb = new StringBuilder();
        int i = c33436OooO0oo.f120869OooO0O0;
        if (C33434OooO0o0.OooO0OO(i)) {
            sb.append("REQUEST: " + C32206Oooo0OO.OooO00o(c32132OooO0Oo.f115203OooO00o));
            sb.append('\n');
            sb.append("METHOD: " + c32132OooO0Oo.f115204OooO0O0);
            sb.append('\n');
        }
        if (C33434OooO0o0.OooO0O0(i)) {
            sb.append("COMMON HEADERS\n");
            Set<Map.Entry<String, List<String>>> setEntries = c32132OooO0Oo.f115205OooO0OO.entries();
            ArrayList arrayList = c33436OooO0oo.f120871OooO0Oo;
            C33444OooOOo.OooO0O0(sb, setEntries, arrayList);
            sb.append("CONTENT HEADERS");
            sb.append('\n');
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                ((C33449OooOo0O) it.next()).getClass();
                List<String> list = C32190OooOOo0.f115537OooO00o;
                throw null;
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                ((C33449OooOo0O) it2.next()).getClass();
                List<String> list2 = C32190OooOOo0.f115537OooO00o;
                throw null;
            }
            Long lOooO00o = oooO0OO.OooO00o();
            if (lOooO00o != null) {
                long jLongValue = lOooO00o.longValue();
                List<String> list3 = C32190OooOOo0.f115537OooO00o;
                C33444OooOOo.OooO00o(sb, "Content-Length", String.valueOf(jLongValue));
            }
            C32183OooO0Oo c32183OooO0OoOooO0O0 = oooO0OO.OooO0O0();
            if (c32183OooO0OoOooO0O0 != null) {
                List<String> list4 = C32190OooOOo0.f115537OooO00o;
                C33444OooOOo.OooO00o(sb, "Content-Type", c32183OooO0OoOooO0O0.toString());
            }
            C33444OooOOo.OooO0O0(sb, oooO0OO.OooO0OO().entries(), arrayList);
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        if (string.length() > 0) {
            String string2 = C33599OooOo0O.Oooooo0(string).toString();
            StringBuilder sb2 = c33432OooO0Oo.f120856OooO0O0;
            sb2.append(string2);
            sb2.append('\n');
        }
        if (string.length() == 0 || !C33434OooO0o0.OooO00o(i)) {
            c33432OooO0Oo.OooO00o();
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("BODY Content-Type: " + oooO0OO.OooO0O0());
        sb3.append('\n');
        C32183OooO0Oo c32183OooO0OoOooO0O02 = oooO0OO.OooO0O0();
        if (c32183OooO0OoOooO0O02 == null || (charsetOooO0Oo = C24746OooO00o.OooO0Oo(c32183OooO0OoOooO0O02)) == null) {
            charsetOooO0Oo = C33580OooO00o.f121231OooO0O0;
        }
        io.ktor.utils.p616io.OooO00o OooO00o2 = Ooooo00.OooOOO.OooO00o();
        C33609OooO0oo.OooO0OO(C33662Ooooooo.f121350OooOo0o, C33649OoooOOo.f121329OooO0O0, null, new C33428OooO(OooO00o2, charsetOooO0Oo, sb3, null), 2).invokeOnCompletion(new C33437OooOO0(c33432OooO0Oo, sb3));
        return C33447OooOo0.OooO00o(oooO0OO, OooO00o2, c33438OooOO0O);
    }

    public static final void OooO0O0(C33436OooO0oo c33436OooO0oo, StringBuilder sb, InterfaceC32130OooO0O0 interfaceC32130OooO0O0, Throwable th) {
        if (C33434OooO0o0.OooO0OO(c33436OooO0oo.f120869OooO0O0)) {
            sb.append("RESPONSE " + interfaceC32130OooO0O0.getUrl() + " failed with exception: " + th);
        }
    }
}
