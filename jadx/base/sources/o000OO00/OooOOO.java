package o000OO00;

import android.content.Context;
import androidx.ink.brush.BrushFamilyNative;
import com.orion.notein.domain.models.cloudsync.SyncContext;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserPasswordFragment;
import java.util.concurrent.ConcurrentHashMap;
import o0OOo0oo.o0OOO0o;
import o0OOoO0O.C27740OooOOOo;
import o0OOoO0O.C27747OooOo0O;
import o0OOoO0O.C27750OooOoO0;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82658OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82659OooOo0o;

    public /* synthetic */ OooOOO(Object obj, int i) {
        this.f82659OooOo0o = i;
        this.f82658OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f82659OooOo0o) {
            case 0:
                return Long.valueOf(BrushFamilyNative.f65347OooO00o.newCopyOfInputModel(((C24457OooOOo) this.f82658OooOo).OooO0O0()));
            case 1:
                C27750OooOoO0 c27750OooOoO0 = (C27750OooOoO0) this.f82658OooOo;
                o0OOO0o o0ooo0o2 = c27750OooOoO0.f97958OooO0O0;
                ConcurrentHashMap<String, SyncContext> concurrentHashMap = c27750OooOoO0.f97968OooOOO;
                OooOOOO oooOOOO = new OooOOOO(c27750OooOoO0, 1);
                C27747OooOo0O c27747OooOo0O = new C27747OooOo0O(c27750OooOoO0, 0);
                return new C27740OooOOOo(o0ooo0o2, c27750OooOoO0.f97959OooO0OO, c27750OooOoO0.f97960OooO0Oo, c27750OooOoO0.f97962OooO0o0, c27750OooOoO0.f97961OooO0o, c27750OooOoO0.f97963OooO0oO, c27750OooOoO0.f97964OooO0oo, c27750OooOoO0.f97956OooO, c27750OooOoO0.f97965OooOO0, concurrentHashMap, oooOOOO, c27747OooOo0O);
            default:
                Context contextRequireContext = ((FirebaseCreateUserPasswordFragment) this.f82658OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
