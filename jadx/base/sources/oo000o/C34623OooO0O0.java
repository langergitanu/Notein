package oo000o;

import kotlin.jvm.internal.C24019OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oo000o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34623OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34629OooO0oo f124801OooO00o = new C34629OooO0oo(OooO00o.f124803OooOo0o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C34629OooO0oo f124802OooO0O0 = new C34629OooO0oo(C20367OooO0O0.f124804OooOo0o);

    /* JADX INFO: renamed from: oo000o.OooO0O0$OooO00o */
    public /* synthetic */ class OooO00o extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f124803OooOo0o = new OooO00o(2, oO0O00O.OooO00o.class, "min", "min(II)I", 1);

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* JADX INFO: renamed from: oo000o.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public /* synthetic */ class C20367OooO0O0 extends C24019OooOO0o implements InterfaceC32508OooOOOo<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C20367OooO0O0 f124804OooOo0o = new C20367OooO0O0(2, oO0O00O.OooO00o.class, "max", "max(II)I", 1);

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }
}
