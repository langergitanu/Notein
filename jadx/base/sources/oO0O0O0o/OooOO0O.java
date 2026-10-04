package oO0O0O0o;

import OooOoOO.C20519OooO0Oo;
import java.util.Set;
import oO00ooO.EnumC32441OooOO0O;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public enum OooOO0O {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33479OooO0o f117122OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33479OooO0o f117123OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Object f117124OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Object f117125OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final Set<OooOO0O> f117112OooOoOO = oOo000Oo.OooOOO.OoooOo0(new OooOO0O[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C33477OooO0OO> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C33477OooO0OO invoke() {
            return OooOOO.f117143OooOO0O.OooO0OO(OooOO0O.this.f117122OooOo);
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C33477OooO0OO> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C33477OooO0OO invoke() {
            return OooOOO.f117143OooOO0O.OooO0OO(OooOO0O.this.f117123OooOo0o);
        }
    }

    OooOO0O(String str) {
        this.f117123OooOo0o = C33479OooO0o.OooO0o0(str);
        this.f117122OooOo = C33479OooO0o.OooO0o0(str.concat("Array"));
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116633OooOo;
        this.f117125OooOoO0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0O0());
        this.f117124OooOoO = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO00o());
    }
}
