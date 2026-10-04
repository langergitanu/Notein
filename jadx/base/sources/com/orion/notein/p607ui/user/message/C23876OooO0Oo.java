package com.orion.notein.p607ui.user.message;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.URLUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.p607ui.user.message.OooO00o;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.C26320o0000OoO;
import o0oOo0.C30921OooOO0o;
import o0oOoOo.C31057OooOoo0;

/* JADX INFO: renamed from: com.orion.notein.ui.user.message.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23876OooO0Oo implements OooO00o.InterfaceC23874OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserMessagesDialogFragment f79795OooO00o;

    public C23876OooO0Oo(UserMessagesDialogFragment userMessagesDialogFragment) {
        this.f79795OooO00o = userMessagesDialogFragment;
    }

    @Override // com.orion.notein.p607ui.user.message.OooO00o.InterfaceC23874OooO0Oo
    public final void OooO00o(C31057OooOoo0 c31057OooOoo0, String str) {
        int i = UserMessagesDialogFragment.f79810Oooo0O0;
        UserMessagesDialogFragment userMessagesDialogFragment = this.f79795OooO00o;
        Uri uri = Uri.parse(str);
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            userMessagesDialogFragment.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri));
        } else if (OooOOO0.OooO0O0(uri.getScheme(), "app")) {
            C30921OooOO0o.OooO00o(userMessagesDialogFragment, uri, (C26320o0000OoO) userMessagesDialogFragment.f79813Oooo00O.getValue());
        }
    }

    @Override // com.orion.notein.p607ui.user.message.OooO00o.InterfaceC23874OooO0Oo
    public final void OooO0O0(View view) {
    }
}
