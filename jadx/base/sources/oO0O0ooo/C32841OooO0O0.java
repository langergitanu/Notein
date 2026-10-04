package oO0O0ooo;

import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0O0ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32841OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Integer, C32847OooO0oo> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C32847OooO0oo[] f117892OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32873OooOo f117893OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32841OooO0O0(C32873OooOo c32873OooOo, C32847OooO0oo[] c32847OooO0ooArr) {
        super(1);
        this.f117893OooOo0o = c32873OooOo;
        this.f117892OooOo = c32847OooO0ooArr;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32847OooO0oo invoke(Integer num) {
        C32847OooO0oo c32847OooO0oo;
        int iIntValue = num.intValue();
        C32873OooOo c32873OooOo = this.f117893OooOo0o;
        if (c32873OooOo != null && (c32847OooO0oo = (C32847OooO0oo) c32873OooOo.f117960OooO00o.get(Integer.valueOf(iIntValue))) != null) {
            return c32847OooO0oo;
        }
        if (iIntValue >= 0) {
            C32847OooO0oo[] c32847OooO0ooArr = this.f117892OooOo;
            if (iIntValue <= c32847OooO0ooArr.length - 1) {
                return c32847OooO0ooArr[iIntValue];
            }
        }
        return C32847OooO0oo.f117904OooO0o0;
    }
}
