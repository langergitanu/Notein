package OooOoo0;

import OooooO0.C21290OooO0o0;
import android.os.CancellationSignal;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f59529OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f59530OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0OOO0o(Object obj, int i) {
        super(1);
        this.f59530OooOo0o = i;
        this.f59529OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f59530OooOo0o) {
            case 0:
                InterfaceC34635OooOOOO it = (InterfaceC34635OooOOOO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                ((Oooo0oO.o00oO0O) this.f59529OooOo).setValue(new C21290OooO0o0(o00000.OooOO0.OooO0oo(it)));
                break;
            default:
                ((CancellationSignal) this.f59529OooOo).cancel();
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
