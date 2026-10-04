package OooOoOO;

import OooOoOO.AbstractC20531OooOOo;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import oO00ooo.AbstractC32476OooO;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: OooOoOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20518OooO0OO<T, V extends AbstractC20531OooOOo> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final V f58599OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC20574Ooooooo<T, V> f58600OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final T f58601OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C20527OooOOO<T, V> f58602OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f58603OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C20548Oooo0O0 f58604OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f58605OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final V f58606OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final V f58607OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final V f58608OooOO0;

    public C20518OooO0OO(T t, InterfaceC20574Ooooooo<T, V> typeConverter, T t2, String label) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeConverter, "typeConverter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(label, "label");
        this.f58600OooO00o = typeConverter;
        this.f58601OooO0O0 = t2;
        this.f58602OooO0OO = new C20527OooOOO<>(typeConverter, t, null, 60);
        Boolean bool = Boolean.FALSE;
        o000O0O0 o000o0o02 = o000O0O0.f61218OooO00o;
        this.f58603OooO0Oo = C21105o000OoO.OooO0OO(bool, o000o0o02);
        this.f58605OooO0o0 = C21105o000OoO.OooO0OO(t, o000o0o02);
        this.f58604OooO0o = new C20548Oooo0O0();
        new C20555OoooO0(t2, 3);
        V vInvoke = typeConverter.OooO00o().invoke(t);
        int iOooO0O0 = vInvoke.OooO0O0();
        for (int i = 0; i < iOooO0O0; i++) {
            vInvoke.OooO0o0(i, Float.NEGATIVE_INFINITY);
        }
        this.f58606OooO0oO = vInvoke;
        V vInvoke2 = this.f58600OooO00o.OooO00o().invoke(t);
        int iOooO0O02 = vInvoke2.OooO0O0();
        for (int i2 = 0; i2 < iOooO0O02; i2++) {
            vInvoke2.OooO0o0(i2, Float.POSITIVE_INFINITY);
        }
        this.f58607OooO0oo = vInvoke2;
        this.f58599OooO = vInvoke;
        this.f58608OooOO0 = vInvoke2;
    }

    public static final Object OooO00o(C20518OooO0OO c20518OooO0OO, Object obj) {
        V v = c20518OooO0OO.f58606OooO0oO;
        V v2 = c20518OooO0OO.f58599OooO;
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(v2, v);
        V v3 = c20518OooO0OO.f58608OooOO0;
        if (!zOooO0O0 || !kotlin.jvm.internal.OooOOO0.OooO0O0(v3, c20518OooO0OO.f58607OooO0oo)) {
            InterfaceC20574Ooooooo<T, V> interfaceC20574Ooooooo = c20518OooO0OO.f58600OooO00o;
            V vInvoke = interfaceC20574Ooooooo.OooO00o().invoke(obj);
            int iOooO0O0 = vInvoke.OooO0O0();
            boolean z = false;
            for (int i = 0; i < iOooO0O0; i++) {
                if (vInvoke.OooO00o(i) < v2.OooO00o(i) || vInvoke.OooO00o(i) > v3.OooO00o(i)) {
                    vInvoke.OooO0o0(i, oO0O00oo.OooOO0.OooO0o0(vInvoke.OooO00o(i), v2.OooO00o(i), v3.OooO00o(i)));
                    z = true;
                }
            }
            if (z) {
                return interfaceC20574Ooooooo.OooO0O0().invoke(vInvoke);
            }
        }
        return obj;
    }

    public static Object OooO0O0(C20518OooO0OO c20518OooO0OO, Object obj, InterfaceC20526OooOO0o animationSpec, AbstractC32476OooO abstractC32476OooO) {
        T tInvoke = c20518OooO0OO.f58600OooO00o.OooO0O0().invoke(c20518OooO0OO.f58602OooO0OO.f58640OooOoO0);
        Object objOooO0OO = c20518OooO0OO.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0oO(animationSpec, "animationSpec");
        InterfaceC20574Ooooooo<T, V> typeConverter = c20518OooO0OO.f58600OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeConverter, "typeConverter");
        C20516OooO00o c20516OooO00o = new C20516OooO00o(c20518OooO0OO, tInvoke, new C20563OoooOoo(animationSpec, typeConverter, objOooO0OO, obj, typeConverter.OooO00o().invoke(tInvoke)), c20518OooO0OO.f58602OooO0OO.f58639OooOoO, null);
        C20548Oooo0O0 c20548Oooo0O0 = c20518OooO0OO.f58604OooO0o;
        c20548Oooo0O0.getClass();
        return C33633Oooo0.OooO0o0(new C20549Oooo0OO(c20548Oooo0O0, c20516OooO00o, null), abstractC32476OooO);
    }

    public final T OooO0OO() {
        return this.f58602OooO0OO.f58637OooOo.getValue();
    }
}
