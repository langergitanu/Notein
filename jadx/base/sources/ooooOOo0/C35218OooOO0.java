package ooooOOo0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import ooooOOo0.C35218OooOO0;
import ooooOOo0.InterfaceC35212OooO0OO;

/* JADX INFO: renamed from: ooooOOo0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35218OooOO0 extends InterfaceC35212OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f126442OooO00o;

    /* JADX INFO: renamed from: ooooOOo0.OooOO0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC35211OooO0O0<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final InterfaceC35211OooO0O0<T> f126443OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Executor f126444OooOo0o;

        /* JADX INFO: renamed from: ooooOOo0.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C20392OooO00o implements InterfaceC35213OooO0Oo<T> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC35213OooO0Oo f126445OooO00o;

            public C20392OooO00o(InterfaceC35213OooO0Oo interfaceC35213OooO0Oo) {
                this.f126445OooO00o = interfaceC35213OooO0Oo;
            }

            @Override // ooooOOo0.InterfaceC35213OooO0Oo
            public final void OooO00o(InterfaceC35211OooO0O0<T> interfaceC35211OooO0O0, final Throwable th) {
                Executor executor = OooO00o.this.f126444OooOo0o;
                final InterfaceC35213OooO0Oo interfaceC35213OooO0Oo = this.f126445OooO00o;
                executor.execute(new Runnable() { // from class: ooooOOo0.OooO
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC35213OooO0Oo.OooO00o(C35218OooOO0.OooO00o.this, th);
                    }
                });
            }

            @Override // ooooOOo0.InterfaceC35213OooO0Oo
            public final void OooO0O0(InterfaceC35211OooO0O0<T> interfaceC35211OooO0O0, final C35238OooOoO<T> c35238OooOoO) {
                Executor executor = OooO00o.this.f126444OooOo0o;
                final InterfaceC35213OooO0Oo interfaceC35213OooO0Oo = this.f126445OooO00o;
                executor.execute(new Runnable() { // from class: ooooOOo0.OooO0oo
                    @Override // java.lang.Runnable
                    public final void run() {
                        C35218OooOO0.OooO00o oooO00o = C35218OooOO0.OooO00o.this;
                        boolean zIsCanceled = oooO00o.f126443OooOo.isCanceled();
                        InterfaceC35213OooO0Oo interfaceC35213OooO0Oo2 = interfaceC35213OooO0Oo;
                        if (zIsCanceled) {
                            interfaceC35213OooO0Oo2.OooO00o(oooO00o, new IOException("Canceled"));
                        } else {
                            interfaceC35213OooO0Oo2.OooO0O0(oooO00o, c35238OooOoO);
                        }
                    }
                });
            }
        }

        public OooO00o(Executor executor, InterfaceC35211OooO0O0<T> interfaceC35211OooO0O0) {
            this.f126444OooOo0o = executor;
            this.f126443OooOo = interfaceC35211OooO0O0;
        }

        @Override // ooooOOo0.InterfaceC35211OooO0O0
        public final void OooOOo0(InterfaceC35213OooO0Oo<T> interfaceC35213OooO0Oo) {
            this.f126443OooOo.OooOOo0(new C20392OooO00o(interfaceC35213OooO0Oo));
        }

        @Override // ooooOOo0.InterfaceC35211OooO0O0
        public final void cancel() {
            this.f126443OooOo.cancel();
        }

        @Override // ooooOOo0.InterfaceC35211OooO0O0
        public final C35238OooOoO<T> execute() throws IOException {
            return this.f126443OooOo.execute();
        }

        @Override // ooooOOo0.InterfaceC35211OooO0O0
        public final boolean isCanceled() {
            return this.f126443OooOo.isCanceled();
        }

        @Override // ooooOOo0.InterfaceC35211OooO0O0
        public final Request request() {
            return this.f126443OooOo.request();
        }

        @Override // ooooOOo0.InterfaceC35211OooO0O0
        public final InterfaceC35211OooO0O0<T> clone() {
            return new OooO00o(this.f126444OooOo0o, this.f126443OooOo.clone());
        }
    }

    public C35218OooOO0(Executor executor) {
        this.f126442OooO00o = executor;
    }

    @Override // ooooOOo0.InterfaceC35212OooO0OO.OooO00o
    public final InterfaceC35212OooO0OO OooO00o(Type type, Annotation[] annotationArr) {
        if (C35244OooOooo.OooO0o0(type) != InterfaceC35211OooO0O0.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C35216OooO0oO(C35244OooOooo.OooO0Oo(0, (ParameterizedType) type), C35244OooOooo.OooO0oo(annotationArr, InterfaceC35241OooOoo.class) ? null : this.f126442OooO00o);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
