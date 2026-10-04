package oO0Ooo0o;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.C22220Oooo00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o000ooo.C24746OooO00o;
import o00OooO0.C25150OooO00o;
import oO00O0o0.C32183OooO0Oo;
import oO00Oo0.AbstractC32268OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0Oo0Oo.AbstractC33200OooO0OO;
import oO0o0O0o.C33580OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0Ooo0o.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33444OooOOo {
    public static final void OooO00o(StringBuilder sb, String key, String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        Appendable appendableAppend = sb.append((CharSequence) ("-> " + key + ": " + value));
        kotlin.jvm.internal.OooOOO0.OooO0o(appendableAppend, "append(value)");
        kotlin.jvm.internal.OooOOO0.OooO0o(appendableAppend.append('\n'), "append('\\n')");
    }

    public static final void OooO0O0(StringBuilder sb, Set headers, ArrayList sanitizedHeaders) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(headers, "headers");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sanitizedHeaders, "sanitizedHeaders");
        for (Map.Entry entry : OooOo.o00O0O(OooOo.o0ooOO0(headers), new C33443OooOOOo())) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Iterator it = sanitizedHeaders.iterator();
            if (it.hasNext()) {
                ((C33449OooOo0O) it.next()).getClass();
                throw null;
            }
            OooO00o(sb, str, OooOo.o000oOoO(list, "; ", null, null, null, 62));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(StringBuilder sb, C32183OooO0Oo c32183OooO0Oo, InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33445OooOOo0 c33445OooOOo0;
        Charset charsetOooO0Oo;
        StringBuilder sb2;
        Charset charset;
        String strOooO0oo;
        if (abstractC32479OooO0OO instanceof C33445OooOOo0) {
            c33445OooOOo0 = (C33445OooOOo0) abstractC32479OooO0OO;
            int i = c33445OooOOo0.f120897OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33445OooOOo0.f120897OooOoO = i - Integer.MIN_VALUE;
            } else {
                c33445OooOOo0 = new C33445OooOOo0(abstractC32479OooO0OO);
            }
        }
        Object objOooOo0O = c33445OooOOo0.f120898OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33445OooOOo0.f120897OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0O);
            sb.append("BODY Content-Type: " + c32183OooO0Oo);
            sb.append('\n');
            sb.append("BODY START");
            sb.append('\n');
            if (c32183OooO0Oo == null || (charsetOooO0Oo = C24746OooO00o.OooO0Oo(c32183OooO0Oo)) == null) {
                charsetOooO0Oo = C33580OooO00o.f121231OooO0O0;
            }
            try {
                c33445OooOOo0.f120896OooOo0o = sb;
                c33445OooOOo0.f120895OooOo = charsetOooO0Oo;
                c33445OooOOo0.f120897OooOoO = 1;
                objOooOo0O = interfaceC23986Ooooo0o.OooOo0O(LocationRequestCompat.PASSIVE_INTERVAL, c33445OooOOo0);
                if (objOooOo0O == obj) {
                    return obj;
                }
                Charset charset2 = charsetOooO0Oo;
                sb2 = sb;
                charset = charset2;
            } catch (Throwable unused) {
                sb2 = sb;
                strOooO0oo = null;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            charset = c33445OooOOo0.f120895OooOo;
            sb2 = c33445OooOOo0.f120896OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooOo0O);
            } catch (Throwable unused2) {
                sb = sb2;
                sb2 = sb;
                strOooO0oo = null;
            }
        }
        strOooO0oo = C25150OooO00o.OooO0oo((AbstractC32268OooO0oO) objOooOo0O, charset);
        if (strOooO0oo == null) {
            strOooO0oo = "[response body omitted]";
        }
        sb2.append(strOooO0oo);
        sb2.append("\nBODY END");
        return C32460OooOooO.f116667OooO00o;
    }

    public static final void OooO0Oo(StringBuilder sb, AbstractC33200OooO0OO abstractC33200OooO0OO, int i, ArrayList sanitizedHeaders) {
        C22220Oooo00o.OooO0OO(i, FirebaseAnalytics.Param.LEVEL);
        kotlin.jvm.internal.OooOOO0.OooO0oO(sanitizedHeaders, "sanitizedHeaders");
        if (C33434OooO0o0.OooO0OO(i)) {
            sb.append("RESPONSE: " + abstractC33200OooO0OO.OooO0o());
            sb.append('\n');
            sb.append("METHOD: " + abstractC33200OooO0OO.OooO00o().OooO0Oo().getMethod());
            sb.append('\n');
            sb.append("FROM: " + abstractC33200OooO0OO.OooO00o().OooO0Oo().getUrl());
            sb.append('\n');
        }
        if (C33434OooO0o0.OooO0O0(i)) {
            sb.append("COMMON HEADERS");
            sb.append('\n');
            OooO0O0(sb, abstractC33200OooO0OO.getHeaders().entries(), sanitizedHeaders);
        }
    }
}
