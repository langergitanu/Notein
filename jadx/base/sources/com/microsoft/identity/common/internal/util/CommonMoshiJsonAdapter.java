package com.microsoft.identity.common.internal.util;

import com.microsoft.identity.common.java.exception.ErrorStrings;
import com.microsoft.identity.common.java.exception.TerminalException;
import java.io.IOException;
import o0oo0o0.C31286OooO0O0;
import o0oo0o00.AbstractC31298OooOO0o;
import o0oo0o00.AbstractC31304OooOOo0;
import o0oo0o00.C31299OooOOO;
import o0oo0o00.C31303OooOOo;
import o0oo0o00.C31305OooOOoo;
import o0oo0o00.C31306OooOo;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public class CommonMoshiJsonAdapter {
    private final C31306OooOo mMoshi = new C31306OooOo(new C31306OooOo.OooO00o());

    public <T> T fromJson(String str, Class<T> cls) throws TerminalException {
        if (str == null) {
            throw new NullPointerException("json is marked non-null but is null");
        }
        if (cls == null) {
            throw new NullPointerException("classOfT is marked non-null but is null");
        }
        AbstractC31298OooOO0o<T> abstractC31298OooOO0oOooO00o = this.mMoshi.OooO00o(cls);
        try {
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            c34524OooO0Oo.o000Oo0o(str);
            C31303OooOOo c31303OooOOo = new C31303OooOOo(c34524OooO0Oo);
            T t = (T) abstractC31298OooOO0oOooO00o.OooO00o(c31303OooOOo);
            if (c31303OooOOo.o000O00O() == AbstractC31304OooOOo0.OooO0O0.f111762Oooo000) {
                return t;
            }
            throw new C31299OooOOO("JSON document was not fully consumed.");
        } catch (IOException e) {
            throw new TerminalException(e.getMessage(), e, ErrorStrings.JSON_DESERIALIZATION_FAILURE);
        }
    }

    public <T> String toJson(T t) {
        if (t == null) {
            throw new NullPointerException("obj is marked non-null but is null");
        }
        Class<?> cls = t.getClass();
        C31306OooOo c31306OooOo = this.mMoshi;
        c31306OooOo.getClass();
        AbstractC31298OooOO0o<T> abstractC31298OooOO0oOooO0O0 = c31306OooOo.OooO0O0(cls, C31286OooO0O0.f111706OooO00o, null);
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        try {
            abstractC31298OooOO0oOooO0O0.OooO0OO(new C31305OooOOoo(c34524OooO0Oo), t);
            return c34524OooO0Oo.o00000OO();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
