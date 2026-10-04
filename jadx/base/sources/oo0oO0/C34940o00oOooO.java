package oo0oO0;

import com.orion.notein.data.p602db.NoteContentDatabase_Impl;
import kotlin.coroutines.Continuation;
import o000ooOO.C24734OooO0O0;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0O0oooo.C26389Oooo000;
import o0OOO0OO.C27009OooO0oO;
import o0Oo0oOo.C28320OooOOOo;
import oO0O000o.InterfaceC32507OooOO0o;
import oo0oO0.AbstractC34924o00oOOO0;

/* JADX INFO: renamed from: oo0oO0.o00oOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C34940o00oOooO extends AbstractC34924o00oOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteContentDatabase_Impl f125539OooO00o;

    public C34940o00oOooO(NoteContentDatabase_Impl noteContentDatabase_Impl) {
        this.f125539OooO00o = noteContentDatabase_Impl;
    }

    @Override // oo0oO0.AbstractC34924o00oOOO0
    public final Object OooO00o(final String str, C27009OooO0oO c27009OooO0oO) {
        return C24734OooO0O0.OooO0oO(this.f125539OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oOOoO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                C34940o00oOooO c34940o00oOooO = this.f125523OooOo0o;
                c34940o00oOooO.getClass();
                return AbstractC34924o00oOOO0.OooO0O0(c34940o00oOooO, str, (Continuation) obj);
            }
        }, c27009OooO0oO);
    }

    @Override // oo0oO0.AbstractC34924o00oOOO0
    public final Object OooO0OO(final String str, AbstractC34924o00oOOO0.OooO0O0 oooO0O0) {
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125539OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oOOOo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT MIN(DualLinkRefEntity.'left') AS 'left', MAX(DualLinkRefEntity.'right') AS 'right', MIN(DualLinkRefEntity.'top') AS 'top', MAX(DualLinkRefEntity.'bottom') AS 'bottom' FROM DualLinkRefEntity where page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    AbstractC34924o00oOOO0.OooO00o oooO00o = null;
                    Float fValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf2 = interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(0));
                        Float fValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(1) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(1));
                        Float fValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(2) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(2));
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(3)) {
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(3));
                        }
                        oooO00o = new AbstractC34924o00oOOO0.OooO00o(fValueOf2, fValueOf4, fValueOf3, fValueOf);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return oooO00o;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34924o00oOOO0
    public final Object OooO0Oo(final String str, AbstractC34924o00oOOO0.OooO0O0 oooO0O0) {
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125539OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oOOOO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT MIN(DualLinkSourceEntity.'left') AS 'left', MAX(DualLinkSourceEntity.'right') AS 'right', MIN(DualLinkSourceEntity.'top') AS 'top', MAX(DualLinkSourceEntity.'bottom') AS 'bottom' FROM DualLinkSourceEntity where page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    AbstractC34924o00oOOO0.OooO00o oooO00o = null;
                    Float fValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf2 = interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(0));
                        Float fValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(1) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(1));
                        Float fValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(2) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(2));
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(3)) {
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(3));
                        }
                        oooO00o = new AbstractC34924o00oOOO0.OooO00o(fValueOf2, fValueOf4, fValueOf3, fValueOf);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return oooO00o;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34924o00oOOO0
    public final Object OooO0o(final String str, AbstractC34924o00oOOO0.OooO0O0 oooO0O0) {
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125539OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oOo00
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT MIN(ShapeEntity.'left') AS 'left', MAX(ShapeEntity.'right') AS 'right', MIN(ShapeEntity.'top') AS 'top', MAX(ShapeEntity.'bottom') AS 'bottom' FROM ShapeEntity where page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    AbstractC34924o00oOOO0.OooO00o oooO00o = null;
                    Float fValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf2 = interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(0));
                        Float fValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(1) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(1));
                        Float fValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(2) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(2));
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(3)) {
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(3));
                        }
                        oooO00o = new AbstractC34924o00oOOO0.OooO00o(fValueOf2, fValueOf4, fValueOf3, fValueOf);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return oooO00o;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34924o00oOOO0
    public final Object OooO0o0(String str, AbstractC34924o00oOOO0.OooO0O0 oooO0O0) {
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125539OooO00o, new C26389Oooo000(str, 2), true, false);
    }

    @Override // oo0oO0.AbstractC34924o00oOOO0
    public final Object OooO0oO(final String str, AbstractC34924o00oOOO0.OooO0O0 oooO0O0) {
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125539OooO00o, new InterfaceC32507OooOO0o() { // from class: oo0oO0.o00oOOo0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) throws Exception {
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("SELECT MIN(StrokeEntity.'left') AS 'left', MAX(StrokeEntity.'right') AS 'right', MIN(StrokeEntity.'top') AS 'top', MAX(StrokeEntity.'bottom') AS 'bottom' FROM StrokeEntity where page_id = ?");
                String str2 = str;
                try {
                    if (str2 == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str2);
                    }
                    AbstractC34924o00oOOO0.OooO00o oooO00o = null;
                    Float fValueOf = null;
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        Float fValueOf2 = interfaceC24749OooO0OoO0ooOOo.isNull(0) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(0));
                        Float fValueOf3 = interfaceC24749OooO0OoO0ooOOo.isNull(1) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(1));
                        Float fValueOf4 = interfaceC24749OooO0OoO0ooOOo.isNull(2) ? null : Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(2));
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(3)) {
                            fValueOf = Float.valueOf((float) interfaceC24749OooO0OoO0ooOOo.getDouble(3));
                        }
                        oooO00o = new AbstractC34924o00oOOO0.OooO00o(fValueOf2, fValueOf4, fValueOf3, fValueOf);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return oooO00o;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // oo0oO0.AbstractC34924o00oOOO0
    public final Object OooO0oo(String str, AbstractC34924o00oOOO0.OooO0O0 oooO0O0) {
        return C24734OooO0O0.OooO0oo(oooO0O0, this.f125539OooO00o, new C28320OooOOOo(str, 1), true, false);
    }
}
