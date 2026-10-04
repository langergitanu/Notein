package o0OO00o0;

import java.util.Iterator;
import java.util.List;
import o0OO000o.C26454OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.o00o0o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26676o00o0o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26454OooO0Oo f92060OooO00o;

    public C26676o00o0o00(C26454OooO0Oo provider) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(provider, "provider");
        this.f92060OooO00o = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26668o00o0OO0 c26668o00o0OO0;
        String str2;
        Iterator it;
        C26676o00o0o00 c26676o00o0o00;
        if (abstractC32479OooO0OO instanceof C26668o00o0OO0) {
            c26668o00o0OO0 = (C26668o00o0OO0) abstractC32479OooO0OO;
            int i = c26668o00o0OO0.f92039OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26668o00o0OO0.f92039OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26668o00o0OO0 = new C26668o00o0OO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26668o00o0OO0.f92036OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26668o00o0OO0.f92039OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Iterator it2 = oOo000Oo.OooOo.Oooo00O(list, 100).iterator();
            str2 = str;
            it = it2;
            c26676o00o0o00 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c26668o00o0OO0.f92037OooOoO0;
            str2 = c26668o00o0OO0.f92034OooOo;
            c26676o00o0o00 = c26668o00o0OO0.f92035OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            C26667o00o0OO c26667o00o0OO = new C26667o00o0OO((List) it.next(), null);
            c26668o00o0OO0.f92035OooOo0o = c26676o00o0o00;
            c26668o00o0OO0.f92034OooOo = str2;
            c26668o00o0OO0.f92037OooOoO0 = it;
            c26668o00o0OO0.f92039OooOoo0 = 1;
            if (c26676o00o0o00.OooO0O0(str2, c26667o00o0OO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final Object OooO0O0(String str, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        return this.f92060OooO00o.OooO0oO(str, new C26674o00o0Ooo(interfaceC32508OooOOOo, null));
    }
}
