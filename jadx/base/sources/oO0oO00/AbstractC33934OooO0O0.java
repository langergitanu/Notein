package oO0oO00;

import kotlin.jvm.internal.C24034Oooo00O;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33934OooO0O0<T> implements InterfaceC33911OooO0OO<T> {
    public abstract InterfaceC34595OooO0Oo<T> OooO00o();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final T deserialize(oO0oO000.OooO0OO oooO0OO) {
        InterfaceC33531OooO0o0 descriptor = getDescriptor();
        oO0oO000.OooO00o OooO00o2 = oooO0OO.OooO00o(descriptor);
        C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
        T t = null;
        while (true) {
            int iOooOo0o = OooO00o2.OooOo0o(getDescriptor());
            if (iOooOo0o == -1) {
                if (t != null) {
                    OooO00o2.OooO0O0(descriptor);
                    return t;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) c24034Oooo00O.f80942OooOo0o)).toString());
            }
            if (iOooOo0o == 0) {
                c24034Oooo00O.f80942OooOo0o = (T) OooO00o2.Oooo0(getDescriptor(), iOooOo0o);
            } else {
                if (iOooOo0o != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) c24034Oooo00O.f80942OooOo0o;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iOooOo0o);
                    throw new C33917OooOO0(sb.toString());
                }
                T t2 = c24034Oooo00O.f80942OooOo0o;
                if (t2 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                c24034Oooo00O.f80942OooOo0o = t2;
                t = (T) OooO00o2.OooOOO0(getDescriptor(), iOooOo0o, o00OOOo.OooO0OO.OooO0o0(this, OooO00o2, (String) t2), null);
            }
        }
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, T value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0o = o00OOOo.OooO0OO.OooO0o(this, encoder, value);
        InterfaceC33531OooO0o0 descriptor = getDescriptor();
        oO0oO000.OooO0O0 oooO0O0OooO00o = encoder.OooO00o(descriptor);
        oooO0O0OooO00o.OooOO0o(getDescriptor(), 0, interfaceC33911OooO0OOOooO0o.getDescriptor().OooO0oo());
        oooO0O0OooO00o.OooOoo0(getDescriptor(), 1, interfaceC33911OooO0OOOooO0o, value);
        oooO0O0OooO00o.OooO0O0(descriptor);
    }
}
