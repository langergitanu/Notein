package o0ooOO0;

import Oooo0oO.C21110o0ooOO0;
import OoooOOo.InterfaceC21208OooOo00;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import oO00ooO.InterfaceC32437OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Class<? extends Object>[] f112902OooO00o = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean OooO00o(Object obj) {
        if (obj instanceof InterfaceC21208OooOo00) {
            InterfaceC21208OooOo00 interfaceC21208OooOo00 = (InterfaceC21208OooOo00) obj;
            if (interfaceC21208OooOo00.OooO00o() == C21110o0ooOO0.f61264OooO00o || interfaceC21208OooOo00.OooO00o() == Oooo0oO.o000O0O0.f61218OooO00o || interfaceC21208OooOo00.OooO00o() == Oooo0oO.o000OO.f61221OooO00o) {
                T value = interfaceC21208OooOo00.getValue();
                if (value == 0) {
                    return true;
                }
                return OooO00o(value);
            }
        } else if (!(obj instanceof InterfaceC32437OooO0o0) || !(obj instanceof Serializable)) {
            Class<? extends Object>[] clsArr = f112902OooO00o;
            for (int i = 0; i < 7; i++) {
                if (clsArr[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
