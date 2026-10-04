package oOo0000O;

import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oOo0000O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC34415OooO0oo {

    /* JADX INFO: renamed from: oOo0000O.OooO0oo$OooO00o */
    public static final class OooO00o {
        public static InterfaceC34415OooO0oo OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, InterfaceC34415OooO0oo context) {
            OooOOO0.OooO0oO(context, "context");
            return context == OooO.f123416OooOo0o ? interfaceC34415OooO0oo : (InterfaceC34415OooO0oo) context.fold(interfaceC34415OooO0oo, new C34414OooO0oO());
        }
    }

    /* JADX INFO: renamed from: oOo0000O.OooO0oo$OooO0O0 */
    public interface OooO0O0 extends InterfaceC34415OooO0oo {

        /* JADX INFO: renamed from: oOo0000O.OooO0oo$OooO0O0$OooO00o */
        public static final class OooO00o {
            public static <R> R OooO00o(OooO0O0 oooO0O0, R r, InterfaceC32508OooOOOo<? super R, ? super OooO0O0, ? extends R> operation) {
                OooOOO0.OooO0oO(operation, "operation");
                return operation.invoke(r, oooO0O0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends OooO0O0> E OooO0O0(OooO0O0 oooO0O0, OooO0OO<E> key) {
                OooOOO0.OooO0oO(key, "key");
                if (OooOOO0.OooO0O0(oooO0O0.getKey(), key)) {
                    return oooO0O0;
                }
                return null;
            }

            public static InterfaceC34415OooO0oo OooO0OO(OooO0O0 oooO0O0, OooO0OO<?> key) {
                OooOOO0.OooO0oO(key, "key");
                return OooOOO0.OooO0O0(oooO0O0.getKey(), key) ? OooO.f123416OooOo0o : oooO0O0;
            }

            public static InterfaceC34415OooO0oo OooO0Oo(OooO0O0 oooO0O0, InterfaceC34415OooO0oo context) {
                OooOOO0.OooO0oO(context, "context");
                return OooO00o.OooO00o(oooO0O0, context);
            }
        }

        OooO0OO<?> getKey();
    }

    /* JADX INFO: renamed from: oOo0000O.OooO0oo$OooO0OO */
    public interface OooO0OO<E extends OooO0O0> {
    }

    <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super OooO0O0, ? extends R> interfaceC32508OooOOOo);

    <E extends OooO0O0> E get(OooO0OO<E> oooO0OO);

    InterfaceC34415OooO0oo minusKey(OooO0OO<?> oooO0OO);

    InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo);
}
