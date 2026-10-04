package com.orion.notein.p607ui.widget.webview.jsbridge;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import o0oOoooO.C31175OooO0o0;
import o0oOoooO.InterfaceC31171OooO00o;
import o0oOoooO.InterfaceC31173OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements InterfaceC31173OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BridgeWebView f80179OooO00o;

    /* JADX INFO: renamed from: com.orion.notein.ui.widget.webview.jsbridge.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19583OooO00o implements InterfaceC31173OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f80180OooO00o;

        public C19583OooO00o(String str) {
            this.f80180OooO00o = str;
        }

        @Override // o0oOoooO.InterfaceC31173OooO0OO
        public final void OooO00o(String str) {
            C31175OooO0o0 c31175OooO0o0 = new C31175OooO0o0();
            c31175OooO0o0.f111196OooO0O0 = this.f80180OooO00o;
            c31175OooO0o0.f111197OooO0OO = str;
            BridgeWebView bridgeWebView = OooO00o.this.f80179OooO00o;
            List<C31175OooO0o0> list = bridgeWebView.f80177OooOoO;
            if (list != null) {
                list.add(c31175OooO0o0);
            } else {
                bridgeWebView.OooO00o(c31175OooO0o0);
            }
        }
    }

    public class OooO0O0 implements InterfaceC31173OooO0OO {
        @Override // o0oOoooO.InterfaceC31173OooO0OO
        public final void OooO00o(String str) {
        }
    }

    public OooO00o(BridgeWebView bridgeWebView) {
        this.f80179OooO00o = bridgeWebView;
    }

    @Override // o0oOoooO.InterfaceC31173OooO0OO
    public final void OooO00o(String str) {
        try {
            ArrayList arrayListOooO00o = C31175OooO0o0.OooO00o(str);
            if (arrayListOooO00o.size() == 0) {
                return;
            }
            for (int i = 0; i < arrayListOooO00o.size(); i++) {
                C31175OooO0o0 c31175OooO0o0 = (C31175OooO0o0) arrayListOooO00o.get(i);
                String str2 = c31175OooO0o0.f111196OooO0O0;
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                BridgeWebView bridgeWebView = this.f80179OooO00o;
                if (zIsEmpty) {
                    String str3 = c31175OooO0o0.f111195OooO00o;
                    InterfaceC31173OooO0OO c19583OooO00o = !TextUtils.isEmpty(str3) ? new C19583OooO00o(str3) : new OooO0O0();
                    InterfaceC31171OooO00o interfaceC31171OooO00o = !TextUtils.isEmpty(c31175OooO0o0.f111199OooO0o0) ? (InterfaceC31171OooO00o) bridgeWebView.f80175OooOo.get(c31175OooO0o0.f111199OooO0o0) : bridgeWebView.f80178OooOoO0;
                    if (interfaceC31171OooO00o != null) {
                        interfaceC31171OooO00o.OooO00o(c19583OooO00o);
                    }
                } else {
                    ((InterfaceC31173OooO0OO) bridgeWebView.f80176OooOo0o.get(str2)).OooO00o(c31175OooO0o0.f111197OooO0OO);
                    bridgeWebView.f80176OooOo0o.remove(str2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
