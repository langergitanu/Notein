package Oooo0o0;

import java.util.Iterator;
import o00000oo.InterfaceC24138OooOoO0;
import o0000Ooo.C24233OooO0oO;
import o0000Ooo.C24235OooOO0;
import o0000Ooo.C24236OooOO0O;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: renamed from: Oooo0o0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20991OooOO0o implements InterfaceC24138OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f60773OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC24229OooO0OO f60774OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32508OooOOOo<C24236OooOO0O, C24236OooOO0O, C32460OooOooO> f60775OooO0OO;

    public C20991OooOO0o() {
        throw null;
    }

    public C20991OooOO0o(long j, InterfaceC24229OooO0OO density, InterfaceC32508OooOOOo onPositionCalculated) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
        kotlin.jvm.internal.OooOOO0.OooO0oO(onPositionCalculated, "onPositionCalculated");
        this.f60773OooO00o = j;
        this.f60774OooO0O0 = density;
        this.f60775OooO0OO = onPositionCalculated;
    }

    @Override // o00000oo.InterfaceC24138OooOoO0
    public final long OooO00o(C24236OooOO0O anchorBounds, long j, EnumC24238OooOOO layoutDirection, long j2) {
        InterfaceC33569OooO0oo interfaceC33569OooO0ooOooOo;
        Object obj;
        Object next;
        kotlin.jvm.internal.OooOOO0.OooO0oO(anchorBounds, "anchorBounds");
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        float f = C21005OooOoO0.f60811OooO00o;
        InterfaceC24229OooO0OO interfaceC24229OooO0OO = this.f60774OooO0O0;
        int iO0OoOo0 = interfaceC24229OooO0OO.o0OoOo0(f);
        long j3 = this.f60773OooO00o;
        int iO0OoOo02 = interfaceC24229OooO0OO.o0OoOo0(C24233OooO0oO.OooO00o(j3));
        int iO0OoOo03 = interfaceC24229OooO0OO.o0OoOo0(C24233OooO0oO.OooO0O0(j3));
        int i = anchorBounds.f81488OooO00o;
        int i2 = i + iO0OoOo02;
        int i3 = anchorBounds.f81490OooO0OO;
        int i4 = (int) (j2 >> 32);
        int iIntValue = (i3 - iO0OoOo02) - i4;
        int i5 = (int) (j >> 32);
        int i6 = i5 - i4;
        if (layoutDirection == EnumC24238OooOOO.f81494OooOo0o) {
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            if (i < 0) {
                i6 = 0;
            }
            interfaceC33569OooO0ooOooOo = oOo000Oo.OooOOO.OooOo(new Integer[]{numValueOf, numValueOf2, Integer.valueOf(i6)});
        } else {
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            Integer numValueOf4 = Integer.valueOf(i2);
            if (i3 <= i5) {
                i6 = 0;
            }
            interfaceC33569OooO0ooOooOo = oOo000Oo.OooOOO.OooOo(new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(i6)});
        }
        Iterator it = interfaceC33569OooO0ooOooOo.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 + i4 <= i5) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int iMax = Math.max(anchorBounds.f81491OooO0Oo + iO0OoOo03, iO0OoOo0);
        int i7 = anchorBounds.f81489OooO0O0;
        int i8 = (int) (j2 & 4294967295L);
        int iIntValue3 = (i7 - iO0OoOo03) - i8;
        int i9 = (int) (4294967295L & j);
        Iterator it2 = oOo000Oo.OooOOO.OooOo(new Integer[]{Integer.valueOf(iMax), Integer.valueOf(iIntValue3), Integer.valueOf(i7 - (i8 / 2)), Integer.valueOf((i9 - i8) - iO0OoOo0)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int iIntValue4 = ((Number) next2).intValue();
            if (iIntValue4 >= iO0OoOo0 && iIntValue4 + i8 <= i9 - iO0OoOo0) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        this.f60775OooO0OO.invoke(anchorBounds, new C24236OooOO0O(iIntValue, iIntValue3, i4 + iIntValue, i8 + iIntValue3));
        return C24235OooOO0.OooO00o(iIntValue, iIntValue3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20991OooOO0o)) {
            return false;
        }
        C20991OooOO0o c20991OooOO0o = (C20991OooOO0o) obj;
        long j = c20991OooOO0o.f60773OooO00o;
        int i = C24233OooO0oO.f81481OooO0OO;
        return this.f60773OooO00o == j && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f60774OooO0O0, c20991OooOO0o.f60774OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f60775OooO0OO, c20991OooOO0o.f60775OooO0OO);
    }

    public final int hashCode() {
        int i = C24233OooO0oO.f81481OooO0OO;
        return this.f60775OooO0OO.hashCode() + ((this.f60774OooO0O0.hashCode() + (Long.hashCode(this.f60773OooO00o) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) C24233OooO0oO.OooO0OO(this.f60773OooO00o)) + ", density=" + this.f60774OooO0O0 + ", onPositionCalculated=" + this.f60775OooO0OO + ')';
    }
}
