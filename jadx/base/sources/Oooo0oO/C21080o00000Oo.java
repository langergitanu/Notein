package Oooo0oO;

import OooOo.C20483OooOo0O;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0oO.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21080o00000Oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC21044OooOoO0, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f61068OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00000OO f61069OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C20483OooOo0O<Object> f61070OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21080o00000Oo(o00000OO o00000oo2, int i, C20483OooOo0O<Object> c20483OooOo0O) {
        super(1);
        this.f61069OooOo0o = o00000oo2;
        this.f61068OooOo = i;
        this.f61070OooOoO0 = c20483OooOo0O;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC21044OooOoO0 interfaceC21044OooOoO0) {
        InterfaceC21044OooOoO0 interfaceC21044OooOoO02;
        InterfaceC21044OooOoO0 interfaceC21044OooOoO03;
        int i;
        InterfaceC21044OooOoO0 interfaceC21044OooOoO04 = interfaceC21044OooOoO0;
        o00000OO o00000oo2 = this.f61069OooOo0o;
        int i2 = o00000oo2.f61066OooO0o0;
        int i3 = this.f61068OooOo;
        if (i2 == i3) {
            C20483OooOo0O<Object> c20483OooOo0O = o00000oo2.f61065OooO0o;
            C20483OooOo0O<Object> c20483OooOo0O2 = this.f61070OooOoO0;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c20483OooOo0O2, c20483OooOo0O) && (interfaceC21044OooOoO04 instanceof C21047OooOoo0)) {
                long[] jArr = c20483OooOo0O2.f58520OooO00o;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = c20483OooOo0O2.f58521OooO0O0[i8];
                                    boolean z = c20483OooOo0O2.f58522OooO0OO[i8] != i3;
                                    if (z) {
                                        i = i5;
                                        C21047OooOoo0 c21047OooOoo0 = (C21047OooOoo0) interfaceC21044OooOoO04;
                                        c21047OooOoo0.f60967OooOoo.OooO0O0(obj, o00000oo2);
                                        if (obj instanceof InterfaceC21050Oooo) {
                                            InterfaceC21050Oooo interfaceC21050Oooo = (InterfaceC21050Oooo) obj;
                                            interfaceC21044OooOoO03 = interfaceC21044OooOoO04;
                                            if (!((OooOo.OooOo) c21047OooOoo0.f60967OooOoo.f59765OooO00o).OooO00o(interfaceC21050Oooo)) {
                                                c21047OooOoo0.f60973Oooo000.OooO0OO(interfaceC21050Oooo);
                                            }
                                            OooOo.OooOo<InterfaceC21050Oooo<?>, Object> oooOo = o00000oo2.f61067OooO0oO;
                                            if (oooOo != null) {
                                                oooOo.OooO0oO(obj);
                                            }
                                        } else {
                                            interfaceC21044OooOoO03 = interfaceC21044OooOoO04;
                                        }
                                    } else {
                                        interfaceC21044OooOoO03 = interfaceC21044OooOoO04;
                                        i = i5;
                                    }
                                    if (z) {
                                        c20483OooOo0O2.OooO0o(i8);
                                    }
                                } else {
                                    interfaceC21044OooOoO03 = interfaceC21044OooOoO04;
                                    i = i5;
                                }
                                j >>= i;
                                i7++;
                                i5 = i;
                                interfaceC21044OooOoO04 = interfaceC21044OooOoO03;
                            }
                            interfaceC21044OooOoO02 = interfaceC21044OooOoO04;
                            if (i6 != i5) {
                                break;
                            }
                        } else {
                            interfaceC21044OooOoO02 = interfaceC21044OooOoO04;
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                        interfaceC21044OooOoO04 = interfaceC21044OooOoO02;
                    }
                }
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
