package OoooooO;

import Oooo0oO.AbstractC21020OooO00o;
import java.util.ArrayList;

/* JADX INFO: renamed from: OoooooO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21423OooOO0 extends AbstractC21020OooO00o {
    public static C21407OooO0O0 OooOOO0(AbstractC21405OooO abstractC21405OooO) {
        if (abstractC21405OooO instanceof C21407OooO0O0) {
            return (C21407OooO0O0) abstractC21405OooO;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO00o(int i, int i2) {
        OooOOO0((AbstractC21405OooO) this.f60879OooO0O0).OooO0o0(i, i2);
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0OO(int i, int i2, int i3) {
        C21407OooO0O0 c21407OooO0O0OooOOO0 = OooOOO0((AbstractC21405OooO) this.f60879OooO0O0);
        ArrayList arrayList = c21407OooO0O0OooOOO0.f61936OooO0OO;
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                AbstractC21405OooO abstractC21405OooO = (AbstractC21405OooO) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2, abstractC21405OooO);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                AbstractC21405OooO abstractC21405OooO2 = (AbstractC21405OooO) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2 - 1, abstractC21405OooO2);
                i4++;
            }
        }
        c21407OooO0O0OooOOO0.OooO0OO();
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0Oo(int i, Object obj) {
        AbstractC21405OooO instance = (AbstractC21405OooO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(instance, "instance");
        C21407OooO0O0 c21407OooO0O0OooOOO0 = OooOOO0((AbstractC21405OooO) this.f60879OooO0O0);
        c21407OooO0O0OooOOO0.getClass();
        ArrayList arrayList = c21407OooO0O0OooOOO0.f61936OooO0OO;
        if (i < arrayList.size()) {
            arrayList.set(i, instance);
        } else {
            arrayList.add(instance);
        }
        instance.OooO0Oo(c21407OooO0O0OooOOO0.f61941OooO0oo);
        c21407OooO0O0OooOOO0.OooO0OO();
    }

    @Override // Oooo0oO.InterfaceC21026OooO0oO
    public final void OooO0o(int i, Object obj) {
        AbstractC21405OooO instance = (AbstractC21405OooO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(instance, "instance");
    }

    @Override // Oooo0oO.AbstractC21020OooO00o
    public final void OooOO0O() {
        C21407OooO0O0 c21407OooO0O0OooOOO0 = OooOOO0((AbstractC21405OooO) this.f60878OooO00o);
        c21407OooO0O0OooOOO0.OooO0o0(0, c21407OooO0O0OooOOO0.f61936OooO0OO.size());
    }
}
