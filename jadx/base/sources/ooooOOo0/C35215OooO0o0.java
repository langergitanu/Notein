package ooooOOo0;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import ooooOOo0.InterfaceC35212OooO0OO;

/* JADX INFO: renamed from: ooooOOo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35215OooO0o0 extends InterfaceC35212OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C35215OooO0o0 f126431OooO00o = new C35215OooO0o0();

    /* JADX INFO: renamed from: ooooOOo0.OooO0o0$OooO00o */
    public static final class OooO00o<R> implements InterfaceC35212OooO0OO<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Type f126432OooO00o;

        /* JADX INFO: renamed from: ooooOOo0.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C20391OooO00o implements InterfaceC35213OooO0Oo<R> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final OooO0O0 f126433OooO00o;

            public C20391OooO00o(OooO0O0 oooO0O0) {
                this.f126433OooO00o = oooO0O0;
            }

            @Override // ooooOOo0.InterfaceC35213OooO0Oo
            public final void OooO00o(InterfaceC35211OooO0O0<R> interfaceC35211OooO0O0, Throwable th) {
                this.f126433OooO00o.completeExceptionally(th);
            }

            @Override // ooooOOo0.InterfaceC35213OooO0Oo
            public final void OooO0O0(InterfaceC35211OooO0O0<R> interfaceC35211OooO0O0, C35238OooOoO<R> c35238OooOoO) {
                boolean zOooO0OO = c35238OooOoO.f126541OooO00o.OooO0OO();
                OooO0O0 oooO0O0 = this.f126433OooO00o;
                if (zOooO0OO) {
                    oooO0O0.complete(c35238OooOoO.f126542OooO0O0);
                } else {
                    oooO0O0.completeExceptionally(new C35219OooOO0O(c35238OooOoO));
                }
            }
        }

        public OooO00o(Type type) {
            this.f126432OooO00o = type;
        }

        @Override // ooooOOo0.InterfaceC35212OooO0OO
        public final Type OooO00o() {
            return this.f126432OooO00o;
        }

        @Override // ooooOOo0.InterfaceC35212OooO0OO
        public final Object OooO0O0(C35225OooOOo c35225OooOOo) {
            OooO0O0 oooO0O0 = new OooO0O0(c35225OooOOo);
            c35225OooOOo.OooOOo0(new C20391OooO00o(oooO0O0));
            return oooO0O0;
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooO0o0$OooO0O0 */
    public static final class OooO0O0<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C35225OooOOo f126434OooOo0o;

        public OooO0O0(C35225OooOOo c35225OooOOo) {
            this.f126434OooOo0o = c35225OooOOo;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            if (z) {
                this.f126434OooOo0o.cancel();
            }
            return super.cancel(z);
        }
    }

    /* JADX INFO: renamed from: ooooOOo0.OooO0o0$OooO0OO */
    public static final class OooO0OO<R> implements InterfaceC35212OooO0OO<R, CompletableFuture<C35238OooOoO<R>>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Type f126435OooO00o;

        /* JADX INFO: renamed from: ooooOOo0.OooO0o0$OooO0OO$OooO00o */
        public class OooO00o implements InterfaceC35213OooO0Oo<R> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final OooO0O0 f126436OooO00o;

            public OooO00o(OooO0O0 oooO0O0) {
                this.f126436OooO00o = oooO0O0;
            }

            @Override // ooooOOo0.InterfaceC35213OooO0Oo
            public final void OooO00o(InterfaceC35211OooO0O0<R> interfaceC35211OooO0O0, Throwable th) {
                this.f126436OooO00o.completeExceptionally(th);
            }

            @Override // ooooOOo0.InterfaceC35213OooO0Oo
            public final void OooO0O0(InterfaceC35211OooO0O0<R> interfaceC35211OooO0O0, C35238OooOoO<R> c35238OooOoO) {
                this.f126436OooO00o.complete(c35238OooOoO);
            }
        }

        public OooO0OO(Type type) {
            this.f126435OooO00o = type;
        }

        @Override // ooooOOo0.InterfaceC35212OooO0OO
        public final Type OooO00o() {
            return this.f126435OooO00o;
        }

        @Override // ooooOOo0.InterfaceC35212OooO0OO
        public final Object OooO0O0(C35225OooOOo c35225OooOOo) {
            OooO0O0 oooO0O0 = new OooO0O0(c35225OooOOo);
            c35225OooOOo.OooOOo0(new OooO00o(oooO0O0));
            return oooO0O0;
        }
    }

    @Override // ooooOOo0.InterfaceC35212OooO0OO.OooO00o
    public final InterfaceC35212OooO0OO OooO00o(Type type, Annotation[] annotationArr) {
        if (C35244OooOooo.OooO0o0(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeOooO0Oo = C35244OooOooo.OooO0Oo(0, (ParameterizedType) type);
        if (C35244OooOooo.OooO0o0(typeOooO0Oo) != C35238OooOoO.class) {
            return new OooO00o(typeOooO0Oo);
        }
        if (typeOooO0Oo instanceof ParameterizedType) {
            return new OooO0OO(C35244OooOooo.OooO0Oo(0, (ParameterizedType) typeOooO0Oo));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
