package o0ooOO0;

import java.util.Comparator;
import o000OoO.C24536OooO0Oo;
import o00oO0O.C25501OooOoO;
import o0Oo0oo.C28393OooOOOo;
import oO00ooOo.C32473OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0ooOO0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31519OooOo0O<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25501OooOoO f112709OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32473OooO00o f112710OooOo0o;

    public C31519OooOo0O(C32473OooO00o c32473OooO00o, C25501OooOoO c25501OooOoO) {
        this.f112710OooOo0o = c32473OooO00o;
        this.f112709OooOo = c25501OooOoO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        InterfaceC32507OooOO0o[] interfaceC32507OooOO0oArr = this.f112710OooOo0o.f116716OooOo0o;
        int length = interfaceC32507OooOO0oArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = interfaceC32507OooOO0oArr[i2];
            int iOooO0O0 = C24536OooO0Oo.OooO0O0((Comparable) interfaceC32507OooOO0o.invoke(t), (Comparable) interfaceC32507OooOO0o.invoke(t2));
            if (iOooO0O0 != 0) {
                i = iOooO0O0;
                break;
            }
            i2++;
        }
        if (i != 0) {
            return i;
        }
        return this.f112709OooOo.compare(((C28393OooOOOo) t).f100652OooO0OO, ((C28393OooOOOo) t2).f100652OooO0OO);
    }
}
