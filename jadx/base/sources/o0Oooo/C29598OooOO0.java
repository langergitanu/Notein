package o0Oooo;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Oooo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29598OooOO0<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<String> f104956OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o f104957OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f104958OooOoO0;

    public C29598OooOO0(com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o, C24034Oooo00O<String> c24034Oooo00O, String str) {
        this.f104957OooOo0o = oooO00o;
        this.f104956OooOo = c24034Oooo00O;
        this.f104958OooOoO0 = str;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.String] */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0");
        com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00o = this.f104957OooOo0o;
        if (!zOooO0O0) {
            String errorCode = c27174OooO0O0.getErrorCode();
            String errorMsg = c27174OooO0O0.getErrorMsg();
            if (errorMsg == null) {
                errorMsg = "";
            }
            Object objEmit = oooO00o.f75617OooOooO.emit(new C27174OooO0O0(false, null, errorCode, errorMsg, 2), continuation);
            return objEmit == EnumC32485OooO00o.f116726OooOo0o ? objEmit : C32460OooOooO.f116667OooO00o;
        }
        if (c27174OooO0O0.OooO0O0() == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C24034Oooo00O<String> c24034Oooo00O = this.f104956OooOo;
        String str = c24034Oooo00O.f80942OooOo0o;
        Object objOooO0O0 = c27174OooO0O0.OooO0O0();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) str);
        sb.append(objOooO0O0);
        ?? r9 = (T) sb.toString();
        c24034Oooo00O.f80942OooOo0o = r9;
        com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o.OooO0oO(oooO00o, this.f104958OooOoO0, r9);
        return C32460OooOooO.f116667OooO00o;
    }
}
