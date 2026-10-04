package oOo00O0O;

import Ooooo00.C21246OooO0OO;
import java.lang.annotation.Annotation;
import java.util.List;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33976OoooOOO;
import oO0oO00.o00000OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oOo00O0O.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34473OooOoo implements InterfaceC33911OooO0OO<C34474OooOoo0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34473OooOoo f123533OooO00o = new C34473OooOoo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f123534OooO0O0 = OooO00o.f123535OooO0O0;

    /* JADX INFO: renamed from: oOo00O0O.OooOoo$OooO00o */
    public static final class OooO00o implements InterfaceC33531OooO0o0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f123535OooO0O0 = new OooO00o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final String f123536OooO0OO = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C33976OoooOOO f123537OooO00o = C33928OooO00o.OooO0O0(o00000OO.f122230OooO00o, C34465OooOOo0.f123523OooO00o).f122200OooO0OO;

        @Override // oO0o.InterfaceC33531OooO0o0
        public final boolean OooO(int i) {
            this.f123537OooO00o.OooO(i);
            return false;
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final boolean OooO0O0() {
            this.f123537OooO00o.getClass();
            return false;
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final int OooO0OO(String name) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            return this.f123537OooO00o.OooO0OO(name);
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final InterfaceC33531OooO0o0 OooO0Oo(int i) {
            return this.f123537OooO00o.OooO0Oo(i);
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final String OooO0o(int i) {
            this.f123537OooO00o.getClass();
            return String.valueOf(i);
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final int OooO0o0() {
            this.f123537OooO00o.getClass();
            return 2;
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final List<Annotation> OooO0oO(int i) {
            this.f123537OooO00o.OooO0oO(i);
            return C34434OooOoO.f123453OooOo0o;
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final String OooO0oo() {
            return f123536OooO0OO;
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final List<Annotation> getAnnotations() {
            this.f123537OooO00o.getClass();
            return C34434OooOoO.f123453OooOo0o;
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final AbstractC33534OooOO0o getKind() {
            this.f123537OooO00o.getClass();
            return OooOOO0.OooO0OO.f121134OooO00o;
        }

        @Override // oO0o.InterfaceC33531OooO0o0
        public final boolean isInline() {
            this.f123537OooO00o.getClass();
            return false;
        }
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        C21246OooO0OO.OooO0OO(oooO0OO);
        return new C34474OooOoo0(C33928OooO00o.OooO0O0(o00000OO.f122230OooO00o, C34465OooOOo0.f123523OooO00o).deserialize(oooO0OO));
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f123534OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        C34474OooOoo0 value = (C34474OooOoo0) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        C21246OooO0OO.OooO00o(encoder);
        C33928OooO00o.OooO0O0(o00000OO.f122230OooO00o, C34465OooOOo0.f123523OooO00o).serialize(encoder, value);
    }
}
