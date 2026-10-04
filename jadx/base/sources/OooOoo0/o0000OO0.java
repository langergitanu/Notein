package OooOoo0;

import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0Ooo.C33822OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<Float, Float, Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C20709o0000Oo f59466OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33822OooO0OO f59467OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(C20709o0000Oo c20709o0000Oo, C33822OooO0OO c33822OooO0OO) {
        super(2);
        this.f59467OooOo0o = c33822OooO0OO;
        this.f59466OooOo = c20709o0000Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Boolean invoke(Float f, Float f2) {
        float fFloatValue = f.floatValue();
        C33609OooO0oo.OooO0OO(this.f59467OooOo0o, null, null, new o0000O(this.f59466OooOo, f2.floatValue(), fFloatValue, null), 3);
        return Boolean.TRUE;
    }
}
