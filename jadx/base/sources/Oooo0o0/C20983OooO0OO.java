package Oooo0o0;

import Oooo0oO.o00oO0O;
import OooooOO.o0OO00O;
import o0000Ooo.C24236OooOO0O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: Oooo0o0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20983OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<C24236OooOO0O, C24236OooOO0O, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00oO0O<o0OO00O> f60735OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20983OooO0OO(o00oO0O<o0OO00O> o00oo0o) {
        super(2);
        this.f60735OooOo0o = o00oo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    @Override // oO0O000o.InterfaceC32508OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32460OooOooO invoke(C24236OooOO0O c24236OooOO0O, C24236OooOO0O c24236OooOO0O2) {
        float fMin;
        C24236OooOO0O parentBounds = c24236OooOO0O;
        C24236OooOO0O menuBounds = c24236OooOO0O2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(parentBounds, "parentBounds");
        kotlin.jvm.internal.OooOOO0.OooO0oO(menuBounds, "menuBounds");
        float f = C21005OooOoO0.f60811OooO00o;
        int i = menuBounds.f81488OooO00o;
        float fMin2 = 1.0f;
        if (i < parentBounds.f81490OooO0OO) {
            int i2 = menuBounds.f81490OooO0OO;
            if (i2 <= parentBounds.f81488OooO00o) {
                fMin = 1.0f;
            } else if (i2 - i == 0) {
                fMin = 0.0f;
            } else {
                fMin = (((Math.min(r3, i2) + Math.max(r5, i)) / 2) - i) / (i2 - i);
            }
        }
        int i3 = menuBounds.f81489OooO0O0;
        if (i3 < parentBounds.f81491OooO0Oo) {
            int i4 = menuBounds.f81491OooO0Oo;
            if (i4 > parentBounds.f81489OooO0O0) {
                if (i4 - i3 == 0) {
                    fMin2 = 0.0f;
                } else {
                    fMin2 = (((Math.min(r4, i4) + Math.max(r8, i3)) / 2) - i3) / (i4 - i3);
                }
            }
        }
        this.f60735OooOo0o.setValue(new o0OO00O((((long) Float.floatToIntBits(fMin)) << 32) | (((long) Float.floatToIntBits(fMin2)) & 4294967295L)));
        return C32460OooOooO.f116667OooO00o;
    }
}
