package oO0o0O0O;

import java.util.Iterator;
import o000OO00.C24471OooOoOO;
import o0OoO0oo.C28816o000o0oO;
import o0OoO0oo.C28817o000o0oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0o0O0O.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33574OooOOO0 extends OooO0O0.OooO0O0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: oO0o0O0O.OooOOO0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33569OooO0oo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Iterator f121216OooO00o;

        public OooO00o(Iterator it) {
            this.f121216OooO00o = it;
        }

        @Override // oO0o0O0O.InterfaceC33569OooO0oo
        public final Iterator<T> iterator() {
            return this.f121216OooO00o;
        }
    }

    public static <T> InterfaceC33569OooO0oo<T> OooO(T t, InterfaceC32507OooOO0o<? super T, ? extends T> nextFunction) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(nextFunction, "nextFunction");
        return t == null ? C33565OooO0Oo.f121193OooO00o : new C33568OooO0oO(new C24471OooOoOO(t, 1), nextFunction);
    }

    public static <T> InterfaceC33569OooO0oo<T> OooO0o(Iterator<? extends T> it) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "<this>");
        return OooO0oO(new OooO00o(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> InterfaceC33569OooO0oo<T> OooO0oO(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo) {
        return interfaceC33569OooO0oo instanceof C33562OooO00o ? interfaceC33569OooO0oo : new C33562OooO00o(interfaceC33569OooO0oo);
    }

    public static final C33566OooO0o OooO0oo(InterfaceC33569OooO0oo interfaceC33569OooO0oo) {
        C28816o000o0oO c28816o000o0oO = new C28816o000o0oO(1);
        if (!(interfaceC33569OooO0oo instanceof C33577OooOOo)) {
            return new C33566OooO0o(interfaceC33569OooO0oo, new C28817o000o0oo(1), c28816o000o0oO);
        }
        C33577OooOOo c33577OooOOo = (C33577OooOOo) interfaceC33569OooO0oo;
        return new C33566OooO0o(c33577OooOOo.f121218OooO00o, c33577OooOOo.f121219OooO0O0, c28816o000o0oO);
    }

    public static <T> InterfaceC33569OooO0oo<T> OooOO0(final oO0O000o.OooO00o<? extends T> nextFunction) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(nextFunction, "nextFunction");
        return OooO0oO(new C33568OooO0oO(nextFunction, new InterfaceC32507OooOO0o(nextFunction) { // from class: oO0o0O0O.OooOO0o

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.OooOOOO f121214OooOo0o;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f121214OooOo0o = (kotlin.jvm.internal.OooOOOO) nextFunction;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooO00o] */
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object it) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return this.f121214OooOo0o.invoke();
            }
        }));
    }
}
