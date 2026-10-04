package Oooo00o;

import OooOoO.C20509OooO0oo;
import OooooO0.C21293OooOO0;
import OooooOO.AbstractC21365o0OoOo0;
import OooooOO.InterfaceC21361o00oO0O;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;

/* JADX INFO: renamed from: Oooo00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20903OooO00o implements InterfaceC21361o00oO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC20904OooO0O0 f60293OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC20904OooO0O0 f60294OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC20904OooO0O0 f60295OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC20904OooO0O0 f60296OooO0Oo;

    public AbstractC20903OooO00o(InterfaceC20904OooO0O0 topStart, InterfaceC20904OooO0O0 interfaceC20904OooO0O0, InterfaceC20904OooO0O0 bottomEnd, InterfaceC20904OooO0O0 interfaceC20904OooO0O02) {
        OooOOO0.OooO0oO(topStart, "topStart");
        OooOOO0.OooO0oO(bottomEnd, "bottomEnd");
        this.f60293OooO00o = topStart;
        this.f60294OooO0O0 = interfaceC20904OooO0O0;
        this.f60295OooO0OO = bottomEnd;
        this.f60296OooO0Oo = interfaceC20904OooO0O02;
    }

    @Override // OooooOO.InterfaceC21361o00oO0O
    public final AbstractC21365o0OoOo0 OooO00o(long j, EnumC24238OooOOO layoutDirection, InterfaceC24229OooO0OO density) {
        OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        OooOOO0.OooO0oO(density, "density");
        float fOooO00o = this.f60293OooO00o.OooO00o(j, density);
        float fOooO00o2 = this.f60294OooO0O0.OooO00o(j, density);
        float fOooO00o3 = this.f60295OooO0OO.OooO00o(j, density);
        float fOooO00o4 = this.f60296OooO0Oo.OooO00o(j, density);
        float fOooO0OO = C21293OooOO0.OooO0OO(j);
        float f = fOooO00o + fOooO00o4;
        if (f > fOooO0OO) {
            float f2 = fOooO0OO / f;
            fOooO00o *= f2;
            fOooO00o4 *= f2;
        }
        float f3 = fOooO00o2 + fOooO00o3;
        if (f3 > fOooO0OO) {
            float f4 = fOooO0OO / f3;
            fOooO00o2 *= f4;
            fOooO00o3 *= f4;
        }
        if (fOooO00o >= 0.0f && fOooO00o2 >= 0.0f && fOooO00o3 >= 0.0f && fOooO00o4 >= 0.0f) {
            return OooO0O0(j, fOooO00o, fOooO00o2, fOooO00o3, fOooO00o4, layoutDirection);
        }
        float f5 = fOooO00o3;
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("Corner size in Px can't be negative(topStart = ", fOooO00o, ", topEnd = ", fOooO00o2, ", bottomEnd = ");
        sbOooO0Oo.append(f5);
        sbOooO0Oo.append(", bottomStart = ");
        sbOooO0Oo.append(fOooO00o4);
        sbOooO0Oo.append(")!");
        throw new IllegalArgumentException(sbOooO0Oo.toString().toString());
    }

    public abstract AbstractC21365o0OoOo0 OooO0O0(long j, float f, float f2, float f3, float f4, EnumC24238OooOOO enumC24238OooOOO);
}
