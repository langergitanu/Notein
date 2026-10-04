package o000oo0;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C24019OooOO0o;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32463OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o000oo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24662OooO0oo extends C24019OooOO0o implements InterfaceC32507OooOO0o<Set<? extends Integer>, C32460OooOooO> {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Set<? extends Integer> set) {
        Set<? extends Integer> p0 = set;
        kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
        androidx.room.OooO0OO oooO0OO = (androidx.room.OooO0OO) this.receiver;
        ReentrantLock reentrantLock = oooO0OO.f66187OooO0o0;
        reentrantLock.lock();
        try {
            List<androidx.room.OooO0o> listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(oooO0OO.f66185OooO0Oo.values());
            reentrantLock.unlock();
            for (androidx.room.OooO0o oooO0o : listO0ooOO0) {
                oooO0o.getClass();
                int[] iArr = oooO0o.f66198OooO0O0;
                int length = iArr.length;
                Set<String> setOooO0Oo = C34438OooOoo0.f123458OooOo0o;
                if (length != 0) {
                    int i = 0;
                    if (length != 1) {
                        C32463OooO c32463OooO = new C32463OooO();
                        int length2 = iArr.length;
                        int i2 = 0;
                        while (i < length2) {
                            int i3 = i2 + 1;
                            if (p0.contains(Integer.valueOf(iArr[i]))) {
                                c32463OooO.add(oooO0o.f66199OooO0OO[i2]);
                            }
                            i++;
                            i2 = i3;
                        }
                        setOooO0Oo = C34449Oooo0oo.OooO0Oo(c32463OooO);
                    } else if (p0.contains(Integer.valueOf(iArr[0]))) {
                        setOooO0Oo = oooO0o.f66200OooO0Oo;
                    }
                }
                if (!setOooO0Oo.isEmpty()) {
                    oooO0o.f66197OooO00o.OooO00o(setOooO0Oo);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
