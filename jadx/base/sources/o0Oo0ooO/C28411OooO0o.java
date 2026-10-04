package o0Oo0ooO;

import com.orion.notein.p607ui.label.OooO0OO;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0Oo0ooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28411OooO0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100712OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100713OooOo0o;

    public /* synthetic */ C28411OooO0o(Object obj, int i) {
        this.f100713OooOo0o = i;
        this.f100712OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f100713OooOo0o) {
            case 0:
                String text = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
                OooO0OO.InterfaceC19211OooO0OO interfaceC19211OooO0OO = ((com.orion.notein.p607ui.label.OooO0OO) this.f100712OooOo).f71972OooO0O0;
                if (interfaceC19211OooO0OO != null) {
                    interfaceC19211OooO0OO.OooO0OO(text);
                }
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("delete from AiOcrSessionEntity where id= ?");
                String str = (String) this.f100712OooOo;
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
