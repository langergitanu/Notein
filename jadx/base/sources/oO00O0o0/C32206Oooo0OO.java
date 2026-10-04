package oO00O0o0;

import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.List;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo00Oo0.C34518OooOoO;

/* JADX INFO: renamed from: oO00O0o0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32206Oooo0OO {
    public static final C32211OoooO0 OooO00o(C32200OooOooO builder) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
        C32200OooOooO c32200OooOooO = new C32200OooOooO(0);
        OooO0Oo(c32200OooOooO, builder);
        return c32200OooOooO.OooO0O0();
    }

    public static final String OooO0O0(C32211OoooO0 c32211OoooO0) {
        StringBuilder sb = new StringBuilder();
        String encodedPath = (String) c32211OoooO0.f115602OooOO0.getValue();
        String encodedQuery = (String) c32211OoooO0.f115603OooOO0O.getValue();
        kotlin.jvm.internal.OooOOO0.OooO0oO(encodedPath, "encodedPath");
        kotlin.jvm.internal.OooOOO0.OooO0oO(encodedQuery, "encodedQuery");
        if (!C33599OooOo0O.Oooo0o0(encodedPath) && !C33595OooOOo.OooOoO0(encodedPath, "/", false)) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        }
        sb.append((CharSequence) encodedPath);
        if (encodedQuery.length() > 0 || c32211OoooO0.f115601OooO0oo) {
            sb.append((CharSequence) MsalUtils.QUERY_STRING_SYMBOL);
        }
        sb.append((CharSequence) encodedQuery);
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String OooO0OO(C32211OoooO0 c32211OoooO0) {
        return c32211OoooO0.f115595OooO0O0 + ':' + c32211OoooO0.OooO00o();
    }

    public static final void OooO0Oo(C32200OooOooO c32200OooOooO, C32200OooOooO url) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32200OooOooO, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(url, "url");
        Oooo0 oooo0 = url.f115571OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooo0, "<set-?>");
        c32200OooOooO.f115571OooO00o = oooo0;
        String str = url.f115572OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<set-?>");
        c32200OooOooO.f115572OooO0O0 = str;
        c32200OooOooO.f115573OooO0OO = url.f115573OooO0OO;
        List<String> list = url.f115578OooO0oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "<set-?>");
        c32200OooOooO.f115578OooO0oo = list;
        c32200OooOooO.f115576OooO0o0 = url.f115576OooO0o0;
        c32200OooOooO.f115575OooO0o = url.f115575OooO0o;
        C32197OooOoOO c32197OooOoOO = new C32197OooOoOO();
        C34518OooOoO.OooO00o(c32197OooOoOO, url.f115570OooO);
        c32200OooOooO.f115570OooO = c32197OooOoOO;
        c32200OooOooO.f115579OooOO0 = new C32213OoooO0O(c32197OooOoOO);
        String str2 = url.f115577OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str2, "<set-?>");
        c32200OooOooO.f115577OooO0oO = str2;
        c32200OooOooO.f115574OooO0Oo = url.f115574OooO0Oo;
    }

    public static final void OooO0o0(C32200OooOooO c32200OooOooO, C32211OoooO0 c32211OoooO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32200OooOooO, "<this>");
        Oooo0 oooo0 = c32211OoooO0.f115594OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooo0, "<set-?>");
        c32200OooOooO.f115571OooO00o = oooo0;
        String str = c32211OoooO0.f115595OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<set-?>");
        c32200OooOooO.f115572OooO0O0 = str;
        c32200OooOooO.f115573OooO0OO = c32211OoooO0.OooO00o();
        OoooO0O.OooOo.OooOOOo(c32200OooOooO, (String) c32211OoooO0.f115602OooOO0.getValue());
        c32200OooOooO.f115576OooO0o0 = (String) c32211OoooO0.f115604OooOO0o.getValue();
        c32200OooOooO.f115575OooO0o = (String) c32211OoooO0.f115606OooOOO0.getValue();
        C32197OooOoOO c32197OooOoOO = new C32197OooOoOO();
        c32197OooOoOO.OooO0OO(C32198OooOoo.OooO0O0((String) c32211OoooO0.f115603OooOO0O.getValue()));
        c32200OooOooO.f115570OooO = c32197OooOoOO;
        c32200OooOooO.f115579OooOO0 = new C32213OoooO0O(c32197OooOoOO);
        String str2 = (String) c32211OoooO0.f115605OooOOO.getValue();
        kotlin.jvm.internal.OooOOO0.OooO0oO(str2, "<set-?>");
        c32200OooOooO.f115577OooO0oO = str2;
        c32200OooOooO.f115574OooO0Oo = c32211OoooO0.f115601OooO0oo;
    }
}
