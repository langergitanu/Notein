package Oooo0;

import Ooooo0o.InterfaceC21253OooO;
import OooooO0.C21292OooO0oo;
import android.view.InputDevice;
import android.view.KeyEvent;
import o00000.C24073OoooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<o00O0O.OooO0O0, Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o000O0 f60160OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21253OooO f60161OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(InterfaceC21253OooO interfaceC21253OooO, o000O0 o000o0) {
        super(1);
        this.f60161OooOo0o = interfaceC21253OooO;
        this.f60160OooOo = o000o0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Boolean invoke(o00O0O.OooO0O0 oooO0O0) {
        boolean zOooOO0;
        KeyEvent keyEvent = oooO0O0.f84203OooO00o;
        InputDevice device = keyEvent.getDevice();
        if (device == null) {
            return Boolean.FALSE;
        }
        if ((device.getKeyboardType() != 2 || !device.isVirtual()) && o00O0O.OooO0OO.OooO00o(keyEvent) == 2) {
            int iOooO0OO = (int) (C21292OooO0oo.OooO0OO(keyEvent.getKeyCode()) >> 32);
            InterfaceC21253OooO interfaceC21253OooO = this.f60161OooOo0o;
            switch (iOooO0OO) {
                case 19:
                    zOooOO0 = interfaceC21253OooO.OooOO0(5);
                    break;
                case 20:
                    zOooOO0 = interfaceC21253OooO.OooOO0(6);
                    break;
                case 21:
                    zOooOO0 = interfaceC21253OooO.OooOO0(3);
                    break;
                case 22:
                    zOooOO0 = interfaceC21253OooO.OooOO0(4);
                    break;
                case 23:
                    C24073OoooO c24073OoooO = this.f60160OooOo.f60104OooO0Oo;
                    if (c24073OoooO != null && c24073OoooO.OooO00o()) {
                        c24073OoooO.f81119OooO0O0.OooO0o();
                    }
                    zOooOO0 = true;
                    break;
                default:
                    zOooOO0 = false;
                    break;
            }
            return Boolean.valueOf(zOooOO0);
        }
        return Boolean.FALSE;
    }
}
