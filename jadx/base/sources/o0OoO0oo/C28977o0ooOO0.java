package o0OoO0oo;

import Oooo0.C20860Ooooooo;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import com.hihonor.cloudservice.support.account.result.SignInAccountInfo;
import com.hihonor.cloudservice.support.api.clients.Status;
import com.hihonor.honorid.core.data.HonorAccount;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import o00o00.C25206OooO0Oo;
import o0O0000o.C25830OooO00o;
import o0oOoO0.C30998OooO0o0;
import o0ooOoOO.C31667OooO0Oo;
import oO0o0OO.C33609OooO0oo;
import oOO00o0.C34370OooO0o0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28977o0ooOO0 implements OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f102675OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102676OooOo0o;

    public /* synthetic */ C28977o0ooOO0(Fragment fragment, int i) {
        this.f102676OooOo0o = i;
        this.f102675OooOo = fragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[PHI: r5
      0x0075: PHI (r5v5 java.lang.String) = (r5v1 java.lang.String), (r5v10 java.lang.String) binds: [B:43:0x00ed, B:21:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // OooO0o.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        switch (this.f102676OooOo0o) {
            case 0:
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f102675OooOo;
                int i = result.f62240OooOo0o;
                if (i == 0 || i == -1) {
                    Intent intent = result.f62239OooOo;
                    Uri data = intent != null ? intent.getData() : null;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteEditorFragment");
                    c20358OooO00o.OooO00o("Captured content URI: " + data, new Object[0]);
                    if (data == null) {
                        Context context = noteEditorContainerFragment.getContext();
                        if (context != null) {
                            String string = noteEditorContainerFragment.getString(R.string.content_capture_failed, Integer.valueOf(i));
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context, string);
                        }
                    } else {
                        noteEditorContainerFragment.Oooo0OO(4, data);
                    }
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOO0O(C20860Ooooooo.OooO0OO(c20358OooO00o2, "NoteEditorFragment", "Content capture failed. Result code: ", i), new Object[0]);
                    if (i == 2) {
                        Context context2 = noteEditorContainerFragment.getContext();
                        if (context2 != null) {
                            String string2 = noteEditorContainerFragment.getString(R.string.content_capture_cancelled_by_user);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context2, string2);
                        }
                    } else if (i == 3) {
                        Context context3 = noteEditorContainerFragment.getContext();
                        if (context3 != null) {
                            String string3 = noteEditorContainerFragment.getString(R.string.content_capture_cancelled_by_window_mode);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context3, string3);
                        }
                    } else {
                        Context context4 = noteEditorContainerFragment.getContext();
                        if (context4 != null) {
                            String string4 = noteEditorContainerFragment.getString(R.string.content_capture_failed, Integer.valueOf(i));
                            kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context4, string4);
                        }
                    }
                }
                break;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "it");
                StringBuilder sb = new StringBuilder("getSignInResultFromIntent : resultCode");
                int i2 = result.f62240OooOo0o;
                sb.append(i2);
                C34370OooO0o0.OooO0Oo("AccountAuthUtil", sb.toString());
                o0O000o.OooO0O0 oooO0O0 = new o0O000o.OooO0O0();
                Intent intent2 = result.f62239OooOo;
                String string5 = "intent is null";
                if (intent2 == null) {
                    if (i2 == 2) {
                        i2 = 30;
                        string5 = "serviceToken invalid!";
                    } else if (i2 == 0) {
                        i2 = 3002;
                        string5 = "user cancel login!";
                    } else if (2012 == i2) {
                        i2 = 70;
                        string5 = "user cancel auth!";
                    }
                    oooO0O0.OooO0O0(new C25830OooO00o(new Status(i2, string5, null)));
                } else if (-2 == i2 || -1 == i2) {
                    Bundle extras = intent2.getExtras();
                    HonorAccount honorAccount = new HonorAccount();
                    honorAccount.OooO00o(extras);
                    o0O000oo.OooO00o OooO00o2 = o0O000oo.OooO00o.OooO00o();
                    WeakReference<Context> weakReference = OooO00o2.f88136OooO00o;
                    o0O00O.OooO00o.OooO00o((weakReference == null || weakReference.get() == null) ? null : OooO00o2.f88136OooO00o.get()).OooO0O0(honorAccount);
                    String str = honorAccount.f68874OoooO0;
                    String str2 = honorAccount.f68875OoooO00;
                    String str3 = honorAccount.f68879o000oOoO;
                    String str4 = honorAccount.f68878OoooOOO;
                    SignInAccountInfo signInAccountInfo = new SignInAccountInfo();
                    signInAccountInfo.f68834OooOoo = new HashSet();
                    signInAccountInfo.f68830OooOo0o = str;
                    signInAccountInfo.f68829OooOo = "";
                    signInAccountInfo.f68832OooOoO0 = null;
                    signInAccountInfo.f68831OooOoO = str2;
                    signInAccountInfo.f68833OooOoOO = str3;
                    signInAccountInfo.f68836OooOooO = str4;
                    oooO0O0.OooO0OO(signInAccountInfo);
                } else {
                    if (57 == i2) {
                        string5 = "mcp check fail";
                    } else if (56 == i2) {
                        Bundle extras2 = intent2.getExtras();
                        if (extras2 != null) {
                            i2 = extras2.getInt("err_code", 56);
                            string5 = extras2.getString("server_err_desc", "access server return error");
                        } else {
                            i2 = 56;
                        }
                        C34370OooO0o0.OooO0Oo("AccountAuthUtil", "loginResult : errCode = " + i2 + " errMsg = " + string5);
                        if (1101 == i2) {
                            i2 = 67;
                        } else if (1202 == i2) {
                            i2 = 68;
                        }
                    } else if (2005 == i2) {
                        i2 = 5;
                        string5 = "network unaviable!";
                    } else {
                        string5 = "other error!";
                    }
                    oooO0O0.OooO0O0(new C25830OooO00o(new Status(i2, string5, null)));
                }
                C31667OooO0Oo c31667OooO0Oo = (C31667OooO0Oo) oooO0O0.f88129OooO00o;
                if (c31667OooO0Oo.OooO0Oo()) {
                    String str5 = ((SignInAccountInfo) c31667OooO0Oo.OooO0OO()).f68831OooOoO;
                    kotlin.jvm.internal.OooOOO0.OooO0o(str5, "getAuthorizationCode(...)");
                    UserSettingFragment userSettingFragment = (UserSettingFragment) this.f102675OooOo;
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(userSettingFragment), null, null, new C30998OooO0o0(userSettingFragment, str5, null), 3);
                }
                break;
        }
    }
}
