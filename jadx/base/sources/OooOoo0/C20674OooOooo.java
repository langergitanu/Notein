package OooOoo0;

import OooOooO.C20738OooOOOo;
import OooOooO.InterfaceC20736OooOOO0;
import OooooO0.C21290OooO0o0;
import OooooO0.C21292OooO0oo;
import android.view.KeyEvent;
import java.util.Map;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0Ooo.C33822OooO0OO;

/* JADX INFO: renamed from: OooOoo0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20674OooOooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<o00O0O.OooO0O0, Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Map<o00O0O.OooO00o, C20738OooOOOo> f59335OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f59336OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C33822OooO0OO f59337OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59338OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f59339OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59340OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20674OooOooo(boolean z, Map map, Oooo0oO.o00oO0O o00oo0o, C33822OooO0OO c33822OooO0OO, oO0O000o.OooO00o oooO00o, InterfaceC20736OooOOO0 interfaceC20736OooOOO0) {
        super(1);
        this.f59336OooOo0o = z;
        this.f59335OooOo = map;
        this.f59338OooOoO0 = o00oo0o;
        this.f59337OooOoO = c33822OooO0OO;
        this.f59339OooOoOO = oooO00o;
        this.f59340OooOoo0 = interfaceC20736OooOOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(o00O0O.OooO0O0 oooO0O0) {
        int iOooO0OO;
        int iOooO0OO2;
        KeyEvent keyEvent = oooO0O0.f84203OooO00o;
        Map<o00O0O.OooO00o, C20738OooOOOo> map = this.f59335OooOo;
        C33822OooO0OO c33822OooO0OO = this.f59337OooOoO;
        boolean z = false;
        InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f59340OooOoo0;
        boolean z2 = this.f59336OooOo0o;
        if (z2) {
            int i = C20677Oooo00o.f59363OooO0O0;
            if (o00O0O.OooO0OO.OooO00o(keyEvent) == 2 && ((iOooO0OO2 = (int) (C21292OooO0oo.OooO0OO(keyEvent.getKeyCode()) >> 32)) == 23 || iOooO0OO2 == 66 || iOooO0OO2 == 160)) {
                if (!map.containsKey(new o00O0O.OooO00o(C21292OooO0oo.OooO0OO(keyEvent.getKeyCode())))) {
                    C20738OooOOOo c20738OooOOOo = new C20738OooOOOo(((C21290OooO0o0) this.f59338OooOoO0.getValue()).f61722OooO00o);
                    map.put(new o00O0O.OooO00o(C21292OooO0oo.OooO0OO(keyEvent.getKeyCode())), c20738OooOOOo);
                    C33609OooO0oo.OooO0OO(c33822OooO0OO, null, null, new C20671OooOoo(interfaceC20736OooOOO0, c20738OooOOOo, null), 3);
                    z = true;
                }
            } else if (z2) {
                int i2 = C20677Oooo00o.f59363OooO0O0;
                if (o00O0O.OooO0OO.OooO00o(keyEvent) == 1 && ((iOooO0OO = (int) (C21292OooO0oo.OooO0OO(keyEvent.getKeyCode()) >> 32)) == 23 || iOooO0OO == 66 || iOooO0OO == 160)) {
                    C20738OooOOOo c20738OooOOOoRemove = map.remove(new o00O0O.OooO00o(C21292OooO0oo.OooO0OO(keyEvent.getKeyCode())));
                    if (c20738OooOOOoRemove != null) {
                        C33609OooO0oo.OooO0OO(c33822OooO0OO, null, null, new C20673OooOooO(interfaceC20736OooOOO0, c20738OooOOOoRemove, null), 3);
                    }
                    this.f59339OooOoOO.invoke();
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
