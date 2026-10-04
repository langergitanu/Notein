package o000oo0;

import java.util.Set;
import o000oo0.C24696OoooO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;

/* JADX INFO: renamed from: o000oo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24666OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33781o00o0O f83559OooO00o;

    public C24666OooOOO(int i) {
        this.f83559OooO00o = C33784o00ooo.OooO00o(new int[i]);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(C24696OoooO0O.OooO0O0 oooO0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24667OooOOO0 c24667OooOOO0;
        if (abstractC32479OooO0OO instanceof C24667OooOOO0) {
            c24667OooOOO0 = (C24667OooOOO0) abstractC32479OooO0OO;
            int i = c24667OooOOO0.f83562OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24667OooOOO0.f83562OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c24667OooOOO0 = new C24667OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c24667OooOOO0.f83561OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c24667OooOOO0.f83562OooOoO0;
        if (i2 != 0) {
            if (i2 == 1) {
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        c24667OooOOO0.f83562OooOoO0 = 1;
        this.f83559OooO00o.collect(oooO0O0, c24667OooOOO0);
    }

    public final void OooO0O0(Set<Integer> tableIds) {
        C33781o00o0O c33781o00o0O;
        Object value;
        int[] iArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        do {
            c33781o00o0O = this.f83559OooO00o;
            value = c33781o00o0O.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = tableIds.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
        } while (!c33781o00o0O.OooO(value, iArr));
    }
}
