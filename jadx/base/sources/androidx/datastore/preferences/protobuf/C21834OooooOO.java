package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21834OooooOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C21834OooooOO f64546OooO0OO = new C21834OooooOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f64548OooO0O0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21815Oooo0O0 f64547OooO00o = new C21815Oooo0O0();

    public final <T> InterfaceC21836Oooooo<T> OooO00o(Class<T> cls) {
        AbstractC21798OooOOo0<?> abstractC21798OooOOo0;
        InterfaceC21836Oooooo<T> interfaceC21836OoooooOooOo0;
        Class<?> cls2;
        C21805OooOoO.OooO00o(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f64548OooO0O0;
        InterfaceC21836Oooooo<T> interfaceC21836Oooooo = (InterfaceC21836Oooooo) concurrentHashMap.get(cls);
        if (interfaceC21836Oooooo != null) {
            return interfaceC21836Oooooo;
        }
        C21815Oooo0O0 c21815Oooo0O0 = this.f64547OooO00o;
        c21815Oooo0O0.getClass();
        Class<?> cls3 = C21838OoooooO.f64556OooO00o;
        if (!OooOo.class.isAssignableFrom(cls) && (cls2 = C21838OoooooO.f64556OooO00o) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        InterfaceC21812Oooo interfaceC21812OoooMessageInfoFor = c21815Oooo0O0.f64508OooO00o.messageInfoFor(cls);
        if (interfaceC21812OoooMessageInfoFor.isMessageSetWireFormat()) {
            if (OooOo.class.isAssignableFrom(cls)) {
                interfaceC21836OoooooOooOo0 = new C21827OoooOOo<>(C21838OoooooO.f64558OooO0OO, C21799OooOOoo.f64459OooO00o, interfaceC21812OoooMessageInfoFor.getDefaultInstance());
            } else {
                o00Oo0<?, ?> o00oo02 = C21838OoooooO.f64557OooO0O0;
                AbstractC21798OooOOo0<?> abstractC21798OooOOo02 = C21799OooOOoo.f64460OooO0O0;
                if (abstractC21798OooOOo02 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC21836OoooooOooOo0 = new C21827OoooOOo<>(o00oo02, abstractC21798OooOOo02, interfaceC21812OoooMessageInfoFor.getDefaultInstance());
            }
        } else if (OooOo.class.isAssignableFrom(cls)) {
            C21829OoooOoO c21829OoooOoO = C21830OoooOoo.f64541OooO0O0;
            C21813Oooo00O c21813Oooo00O = C21814Oooo00o.f64506OooO0O0;
            C21840o00o0O c21840o00o0O = C21838OoooooO.f64558OooO0OO;
            C21797OooOOo c21797OooOOo = interfaceC21812OoooMessageInfoFor.getSyntax().ordinal() != 1 ? C21799OooOOoo.f64459OooO00o : null;
            C21819Oooo0oO c21819Oooo0oO = C21820Oooo0oo.f64517OooO0O0;
            int[] iArr = C21826OoooOOO.f64519OooOOOo;
            if (!(interfaceC21812OoooMessageInfoFor instanceof C21837Oooooo0)) {
                throw null;
            }
            interfaceC21836OoooooOooOo0 = C21826OoooOOO.OooOo0((C21837Oooooo0) interfaceC21812OoooMessageInfoFor, c21829OoooOoO, c21813Oooo00O, c21840o00o0O, c21797OooOOo, c21819Oooo0oO);
        } else {
            InterfaceC21828OoooOo0 interfaceC21828OoooOo0 = C21830OoooOoo.f64540OooO00o;
            Oooo000 oooo000 = C21814Oooo00o.f64505OooO00o;
            o00Oo0<?, ?> o00oo03 = C21838OoooooO.f64557OooO0O0;
            if (interfaceC21812OoooMessageInfoFor.getSyntax().ordinal() != 1) {
                AbstractC21798OooOOo0<?> abstractC21798OooOOo03 = C21799OooOOoo.f64460OooO0O0;
                if (abstractC21798OooOOo03 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                abstractC21798OooOOo0 = abstractC21798OooOOo03;
            } else {
                abstractC21798OooOOo0 = null;
            }
            InterfaceC21817Oooo0o interfaceC21817Oooo0o = C21820Oooo0oo.f64516OooO00o;
            int[] iArr2 = C21826OoooOOO.f64519OooOOOo;
            if (!(interfaceC21812OoooMessageInfoFor instanceof C21837Oooooo0)) {
                throw null;
            }
            interfaceC21836OoooooOooOo0 = C21826OoooOOO.OooOo0((C21837Oooooo0) interfaceC21812OoooMessageInfoFor, interfaceC21828OoooOo0, oooo000, o00oo03, abstractC21798OooOOo0, interfaceC21817Oooo0o);
        }
        InterfaceC21836Oooooo<T> interfaceC21836Oooooo2 = (InterfaceC21836Oooooo) concurrentHashMap.putIfAbsent(cls, interfaceC21836OoooooOooOo0);
        return interfaceC21836Oooooo2 != null ? interfaceC21836Oooooo2 : interfaceC21836OoooooOooOo0;
    }
}
