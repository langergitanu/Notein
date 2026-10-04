package o000o00O;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import o000o00o.C24561OooO0O0;

/* JADX INFO: renamed from: o000o00O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24558OooO00o {

    /* JADX INFO: renamed from: o000o00O.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19631OooO00o<D> {
        C24561OooO0O0<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(C24561OooO0O0<D> c24561OooO0O0, D d);

        void onLoaderReset(C24561OooO0O0<D> c24561OooO0O0);
    }

    public static C24559OooO0O0 OooO00o(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        return new C24559OooO0O0(interfaceC21987OooOoo, ((InterfaceC22023o00ooo) interfaceC21987OooOoo).getViewModelStore());
    }
}
