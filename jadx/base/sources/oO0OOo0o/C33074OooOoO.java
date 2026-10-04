package oO0OOo0o;

import OooOoo.C20601OooOO0o;
import OooOoo.C20605OooOOo0;
import OooOoo.C20623Oooo0o0;
import Oooo0.C20892o0ooOO0;
import Oooo0.C20893o0ooOoO;
import Oooo0.InterfaceC20865o00000oO;
import Oooo0.o0ooOOo;
import android.content.Context;
import androidx.appcompat.widget.C21532OooOOo;
import com.google.gson.Gson;
import java.io.File;
import o00Ooo.InterfaceC25088OooOoO;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooO.C25129OooO0oO;
import o00OooOo.InterfaceC25161OooO00o;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00Ooo.C34366OooO0OO;
import oOO00o0.C34370OooO0o0;
import oOO00oo.C34406OooO00o;
import okhttp3.ResponseBody;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: oO0OOo0o.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33074OooOoO implements InterfaceC25161OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f119590OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f119591OooO0O0 = 0;

    public static boolean OooO0OO(Context context) {
        if (!C34366OooO0OO.OooO0O0(context, 50120345)) {
            if (context == null) {
                C34370OooO0o0.OooO0Oo("SDKUtil", "context is null");
            } else if (C34366OooO0OO.OooO0OO(context) < 60100316 || !C34366OooO0OO.OooO0Oo(context, 60100318)) {
            }
            if (context == null) {
                C34370OooO0o0.OooO0Oo("SDKUtil", "context is null");
            } else if (C34366OooO0OO.OooO0OO(context) < 60100301 || !C34366OooO0OO.OooO0Oo(context, 60100303)) {
            }
            if (C34366OooO0OO.OooO0OO(context) != 60130300) {
                return true;
            }
        }
        C34370OooO0o0.OooO0Oo("AccountAuthUtil", "HonorAPK version is too low");
        return false;
    }

    public static final Object OooO0Oo(InterfaceC25088OooOoO interfaceC25088OooOoO, InterfaceC20865o00000oO interfaceC20865o00000oO, AbstractC32476OooO abstractC32476OooO) {
        Oooo0.o00oO0O o00oo0o = new Oooo0.o00oO0O(interfaceC20865o00000oO);
        C20892o0ooOO0 c20892o0ooOO0 = new C20892o0ooOO0(interfaceC20865o00000oO, 0);
        o0ooOOo o0ooooo2 = new o0ooOOo(interfaceC20865o00000oO);
        C20893o0ooOoO c20893o0ooOoO = new C20893o0ooOoO(interfaceC20865o00000oO);
        C20601OooOO0o.OooO00o oooO00o = C20601OooOO0o.f58918OooO00o;
        Object objOooO0O0 = C20623Oooo0o0.OooO0O0(interfaceC25088OooOoO, new C20605OooOOo0(o00oo0o, c20892o0ooOO0, o0ooooo2, c20893o0ooOoO, null), abstractC32476OooO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object OooO0o(C35238OooOoO c35238OooOoO, String str) throws o0OO000.OooOO0 {
        C27174OooO0O0 c27174OooO0O0;
        String strOooO0OO;
        String errorMsg;
        Gson gson = o0OO000.OooO.f90815OooO00o;
        if (c35238OooOoO.f126541OooO00o.OooO0OO()) {
            C27174OooO0O0 c27174OooO0O02 = (C27174OooO0O0) c35238OooOoO.f126542OooO0O0;
            if (c27174OooO0O02 == null) {
                throw new o0OO000.OooOO0("INTERNAL", str.concat(": Empty response body"), null);
            }
            if (c27174OooO0O02.f94862OooO00o) {
                Object objOooO0O0 = c27174OooO0O02.OooO0O0();
                if (objOooO0O0 != null) {
                    return objOooO0O0;
                }
                throw new o0OO000.OooOO0("INTERNAL", str.concat(": Response success but data is null"), null);
            }
            String errorCode = c27174OooO0O02.getErrorCode();
            String str2 = errorCode != null ? errorCode : "INTERNAL";
            String errorMsg2 = c27174OooO0O02.getErrorMsg();
            if (errorMsg2 == null) {
                errorMsg2 = str.concat(" failed");
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("CloudMetaServiceHelper");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" API error: ");
            sb.append(str2);
            c20358OooO00o.OooO0OO(androidx.concurrent.futures.OooO00o.OooO0OO(sb, " - ", errorMsg2), new Object[0]);
            throw new o0OO000.OooOO0(str2, errorMsg2, null);
        }
        ResponseBody responseBody = c35238OooOoO.f126543OooO0OO;
        String strString = responseBody != null ? responseBody.string() : null;
        if (strString != null) {
            try {
                c27174OooO0O0 = (C27174OooO0O0) o0OO000.OooO.f90815OooO00o.fromJson(strString, C27174OooO0O0.class);
            } catch (Exception unused) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("CloudMetaServiceHelper");
                c20358OooO00o2.OooOO0O("Failed to parse error body as NoteInResponse. ".concat(strString), new Object[0]);
                c27174OooO0O0 = null;
            }
        } else {
            c27174OooO0O0 = null;
        }
        int i = c35238OooOoO.f126541OooO00o.f124259OooOoO;
        if (c27174OooO0O0 == null || (strOooO0OO = c27174OooO0O0.getErrorCode()) == null) {
            strOooO0OO = C21532OooOOo.OooO0OO(i, "HTTP_");
        }
        if (c27174OooO0O0 != null && (errorMsg = c27174OooO0O0.getErrorMsg()) != null) {
            strString = errorMsg;
        } else if (strString == null) {
            strString = str + " failed with HTTP " + i;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("CloudMetaServiceHelper");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" HTTP error: ");
        sb2.append(strOooO0OO);
        c20358OooO00o3.OooO0OO(androidx.concurrent.futures.OooO00o.OooO0OO(sb2, " - ", strString), new Object[0]);
        throw new o0OO000.OooOO0(strOooO0OO, strString, null);
    }

    public static final void OooO0o0(long j, String str) {
        throw new IllegalArgumentException("Long value " + j + " of " + str + " doesn't fit into 32-bit integer");
    }

    @Override // o00OooOo.InterfaceC25161OooO00o
    public void OooO00o(InterfaceC25116OooO0o interfaceC25116OooO0o, C25129OooO0oO c25129OooO0oO) {
    }

    @Override // o00OooOo.InterfaceC25161OooO00o
    public File OooO0O0(InterfaceC25116OooO0o interfaceC25116OooO0o) {
        return null;
    }
}
