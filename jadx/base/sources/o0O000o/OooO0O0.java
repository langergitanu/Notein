package o0O000o;

import Oooo0oO.C21030OooOO0o;
import com.hihonor.cloudservice.support.account.result.SignInAccountInfo;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import kotlin.jvm.internal.OooOOO0;
import o0O0000o.C25830OooO00o;
import o0OOOOO0.OooOO0O;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.o000O0;
import o0ooOoOO.C31667OooO0Oo;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f88129OooO00o;

    public /* synthetic */ OooO0O0(Object obj) {
        this.f88129OooO00o = obj;
    }

    public void OooO00o() {
        BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) this.f88129OooO00o;
        String str = (String) baseToolbarChildFragment.Oooo0oO().f110437OooO0oo.getValue();
        if (str.length() > 0) {
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(baseToolbarChildFragment), new o000O0(str));
        }
    }

    public void OooO0O0(C25830OooO00o c25830OooO00o) {
        C31667OooO0Oo c31667OooO0Oo = (C31667OooO0Oo) this.f88129OooO00o;
        synchronized (c31667OooO0Oo.f113197OooO00o) {
            try {
                if (!c31667OooO0Oo.f113198OooO0O0) {
                    c31667OooO0Oo.f113198OooO0O0 = true;
                    c31667OooO0Oo.f113200OooO0Oo = c25830OooO00o;
                    c31667OooO0Oo.f113197OooO00o.notifyAll();
                    c31667OooO0Oo.OooO0O0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void OooO0OO(SignInAccountInfo signInAccountInfo) {
        C31667OooO0Oo c31667OooO0Oo = (C31667OooO0Oo) this.f88129OooO00o;
        synchronized (c31667OooO0Oo.f113197OooO00o) {
            try {
                if (!c31667OooO0Oo.f113198OooO0O0) {
                    c31667OooO0Oo.f113198OooO0O0 = true;
                    c31667OooO0Oo.f113199OooO0OO = signInAccountInfo;
                    c31667OooO0Oo.f113197OooO00o.notifyAll();
                    c31667OooO0Oo.OooO0O0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public OooO0O0() {
        this.f88129OooO00o = new C31667OooO0Oo();
    }

    public OooO0O0(OooOO0O transactionsService) {
        OooOOO0.OooO0oO(transactionsService, "transactionsService");
        this.f88129OooO00o = transactionsService;
    }
}
