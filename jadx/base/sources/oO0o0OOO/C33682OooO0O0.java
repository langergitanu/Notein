package oO0o0OOO;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import oO0o0OO.InterfaceC33631OooOooo;
import oOo0000O.AbstractC34408OooO00o;

/* JADX INFO: renamed from: oO0o0OOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33682OooO0O0 extends AbstractC34408OooO00o implements InterfaceC33631OooOooo {
    private volatile Object _preHandler;

    public C33682OooO0O0() {
        super(InterfaceC33631OooOooo.OooO00o.f121313OooOo0o);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @Override // oO0o0OO.InterfaceC33631OooOooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o000O00O(Throwable th) {
        Method declaredMethod;
        if (Build.VERSION.SDK_INT < 28) {
            Object obj = this._preHandler;
            if (obj != this) {
                declaredMethod = (Method) obj;
            } else {
                try {
                    declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
                } catch (Throwable unused) {
                }
                if (Modifier.isPublic(declaredMethod.getModifiers())) {
                    if (!Modifier.isStatic(declaredMethod.getModifiers())) {
                        declaredMethod = null;
                    }
                    this._preHandler = declaredMethod;
                }
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
