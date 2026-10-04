package oO0Ooo0O;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import oO000oo.C32133OooO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Oo0Oo.C33205OooO0oo;
import oO0o0O0o.C33580OooO00o;
import oOo000Oo.C34447Oooo0o0;
import oOo00Oo0.C34502OooO00o;

/* JADX INFO: renamed from: oO0Ooo0O.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33399OooOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO0O0 f120749OooO0Oo = new OooO0O0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C34502OooO00o<C33399OooOoO> f120750OooO0o0 = new C34502OooO00o<>("HttpPlainText");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f120751OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Charset f120752OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f120753OooO0OO;

    /* JADX INFO: renamed from: oO0Ooo0O.OooOoO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final LinkedHashSet f120754OooO00o = new LinkedHashSet();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final LinkedHashMap f120755OooO0O0 = new LinkedHashMap();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Charset f120756OooO0OO = C33580OooO00o.f121231OooO0O0;
    }

    /* JADX INFO: renamed from: oO0Ooo0O.OooOoO$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC33394OooOo<OooO00o, C33399OooOoO> {
        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C33399OooOoO OooO00o(InterfaceC32507OooOO0o<? super OooO00o, C32460OooOooO> interfaceC32507OooOO0o) {
            OooO00o oooO00o = new OooO00o();
            interfaceC32507OooOO0o.invoke(oooO00o);
            return new C33399OooOoO(oooO00o.f120754OooO00o, oooO00o.f120755OooO0O0, oooO00o.f120756OooO0OO);
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final void OooO0O0(C33399OooOoO c33399OooOoO, oO000o0.OooO0o scope) {
            C33399OooOoO plugin = c33399OooOoO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(plugin, "plugin");
            kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
            scope.f114954OooOoOO.OooO0o(C32133OooO0o.f115209OooO, new C33401OooOoOO(plugin, null));
            scope.f114956OooOoo0.OooO0o(C33205OooO0oo.f120161OooO0oo, new C33403OooOoo0(plugin, null));
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C34502OooO00o<C33399OooOoO> getKey() {
            return C33399OooOoO.f120750OooO0o0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33399OooOoO(LinkedHashSet charsets, LinkedHashMap charsetQuality, Charset responseCharsetFallback) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charsets, "charsets");
        kotlin.jvm.internal.OooOOO0.OooO0oO(charsetQuality, "charsetQuality");
        kotlin.jvm.internal.OooOOO0.OooO0oO(responseCharsetFallback, "responseCharsetFallback");
        this.f120751OooO00o = responseCharsetFallback;
        List<C32443OooOOO> listO00O0O = oOo000Oo.OooOo.o00O0O(C34447Oooo0o0.OooOOo0(charsetQuality), new C33404OooOooO());
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets) {
            if (!charsetQuality.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listO00O0O2 = oOo000Oo.OooOo.o00O0O(arrayList, new C33402OooOoo());
        StringBuilder sb = new StringBuilder();
        for (Charset charset : listO00O0O2) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(oO00Oo00.OooO00o.OooO0Oo(charset));
        }
        for (C32443OooOOO c32443OooOOO : listO00O0O) {
            Charset charset2 = (Charset) c32443OooOOO.f116638OooOo0o;
            float fFloatValue = ((Number) c32443OooOOO.f116637OooOo).floatValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            double d = fFloatValue;
            if (0.0d > d || d > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb.append(oO00Oo00.OooO00o.OooO0Oo(charset2) + ";q=" + (((double) oO0O00O.OooO00o.OooO0O0(100 * fFloatValue)) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(oO00Oo00.OooO00o.OooO0Oo(this.f120751OooO00o));
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        this.f120753OooO0OO = string;
        Charset charset3 = (Charset) oOo000Oo.OooOo.Oooo(listO00O0O2);
        if (charset3 == null) {
            C32443OooOOO c32443OooOOO2 = (C32443OooOOO) oOo000Oo.OooOo.Oooo(listO00O0O);
            charset3 = c32443OooOOO2 != null ? (Charset) c32443OooOOO2.f116638OooOo0o : null;
            if (charset3 == null) {
                charset3 = C33580OooO00o.f121231OooO0O0;
            }
        }
        this.f120752OooO0O0 = charset3;
    }
}
