package Oooo000;

import OooooO0.C21291OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: Oooo000.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20897OooO0oO implements InterfaceC20896OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo.OooO0O0<C20899OooOO0o> f60264OooO00o = new Oooo.OooO0O0<>(new C20899OooOO0o[16]);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r12 < r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r5 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Oooo000.InterfaceC20896OooO0o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(C21291OooO0oO c21291OooO0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0o oooO0o;
        int i;
        C21291OooO0oO c21291OooO0oO2;
        int i2;
        Object[] objArr;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i3 = oooO0o.f60262OooOoo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO0o.f60262OooOoo = i3 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO0o.f60261OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = oooO0o.f60262OooOoo;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Oooo.OooO0O0<C20899OooOO0o> oooO0O0 = this.f60264OooO00o;
            i = oooO0O0.f59746OooOoO0;
            if (i > 0) {
                C20899OooOO0o[] c20899OooOO0oArr = oooO0O0.f59745OooOo0o;
                c21291OooO0oO2 = c21291OooO0oO;
                i2 = 0;
                objArr = c20899OooOO0oArr;
                C20899OooOO0o c20899OooOO0o = (C20899OooOO0o) objArr[i2];
                oooO0o.f60258OooOo0o = c21291OooO0oO2;
                oooO0o.f60257OooOo = objArr;
                oooO0o.f60260OooOoO0 = i;
                oooO0o.f60259OooOoO = i2;
                oooO0o.f60262OooOoo = 1;
                InterfaceC20895OooO0Oo interfaceC20895OooO0Oo = c20899OooOO0o.f60252OooOo;
                if (interfaceC20895OooO0Oo == null) {
                    interfaceC20895OooO0Oo = c20899OooOO0o.f60253OooOo0o;
                }
                InterfaceC34635OooOOOO interfaceC34635OooOOOO = c20899OooOO0o.f60254OooOoO0;
                if (interfaceC34635OooOOOO == null || !interfaceC34635OooOOOO.OooOo()) {
                    interfaceC34635OooOOOO = null;
                }
                if (interfaceC34635OooOOOO != null && (r5 = interfaceC20895OooO0Oo.OooO00o(interfaceC34635OooOOOO, new OooOO0O(c21291OooO0oO2, c20899OooOO0o), oooO0o)) == EnumC32485OooO00o.f116726OooOo0o) {
                    if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                }
                i2++;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = oooO0o.f60259OooOoO;
        i = oooO0o.f60260OooOoO0;
        objArr = oooO0o.f60257OooOo;
        C21291OooO0oO c21291OooO0oO3 = oooO0o.f60258OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c21291OooO0oO2 = c21291OooO0oO3;
        i2++;
    }
}
