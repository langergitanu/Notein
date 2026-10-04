package o0OOoO0O;

import com.orion.notein.domain.models.cloudsync.SyncContext;
import com.orion.notein.domain.models.cloudsync.SyncState;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: o0OOoO0O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27747OooOo0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f97945OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f97946OooOo0o;

    public /* synthetic */ C27747OooOo0O(Object obj, int i) {
        this.f97946OooOo0o = i;
        this.f97945OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        SyncContext syncContext;
        switch (this.f97946OooOo0o) {
            case 0:
                SyncState state = (SyncState) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                C27750OooOoO0 c27750OooOoO0 = (C27750OooOoO0) this.f97945OooOo;
                c27750OooOoO0.getClass();
                String sessionId = state.getSessionId();
                if (C33599OooOo0O.Oooo0o0(sessionId) || (syncContext = c27750OooOoO0.f97968OooOOO.get(sessionId)) == null) {
                    return null;
                }
                return syncContext.getDirtyCloudMeta();
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("delete from HyperLinkEntity where page_id = ?");
                String str = (String) this.f97945OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
