package oO0OoOO0;

import OooO0Oo.OooOO0O;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.C22008OoooOo0;
import androidx.lifecycle.C22011Ooooo00;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.o00Oo0;
import com.google.common.collect.ImmutableMap;
import java.io.Closeable;
import java.util.LinkedHashSet;
import java.util.Map;
import o000o00.C24556OooO0O0;
import o0O0oooO.C26271OooOo0;
import o0O0oooO.C26272OooOo00;
import o0OoOO00.C29024Oooo0o0;
import oO00ooO0.InterfaceC32462OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OO0oo.C32930OooO0O0;

/* JADX INFO: renamed from: oO0OoOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33283OooO0O0 implements o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f120501OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f120502OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo0.OooO0O0 f120503OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C20310OooO0O0 f120504OooO0OO;

    /* JADX INFO: renamed from: oO0OoOO0.OooO0O0$OooO00o */
    public class OooO00o {
    }

    /* JADX INFO: renamed from: oO0OoOO0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class C20310OooO0O0 implements o00Oo0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C26272OooOo00 f120505OooO00o;

        public C20310OooO0O0(C26272OooOo00 c26272OooOo00) {
            this.f120505OooO00o = c26272OooOo00;
        }

        @Override // androidx.lifecycle.o00Oo0.OooO0O0
        public final AbstractC22019Ooooooo OooO0O0(Class cls, C24556OooO0O0 c24556OooO0O0) {
            AbstractC22019Ooooooo abstractC22019Ooooooo;
            final C33287OooO0o0 c33287OooO0o0 = new C33287OooO0o0();
            C26272OooOo00 c26272OooOo00 = this.f120505OooO00o;
            C22008OoooOo0 c22008OoooOo0OooO00o = C22011Ooooo00.OooO00o(c24556OooO0O0);
            c26272OooOo00.getClass();
            C26271OooOo0 c26271OooOo0 = new C26271OooOo0(c26272OooOo00.f90100OooO00o, c26272OooOo00.f90101OooO0O0, c22008OoooOo0OooO00o);
            InterfaceC32462OooO00o interfaceC32462OooO00o = (InterfaceC32462OooO00o) ((InterfaceC33284OooO0Oo) C29024Oooo0o0.OooO00o(InterfaceC33284OooO0Oo.class, c26271OooOo0)).OooO00o().get(cls);
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) c24556OooO0O0.f83135OooO00o.get(C33283OooO0O0.f120501OooO0Oo);
            V v = ((InterfaceC33284OooO0Oo) C29024Oooo0o0.OooO00o(InterfaceC33284OooO0Oo.class, c26271OooOo0)).OooO0O0().get(cls);
            if (v == 0) {
                if (interfaceC32507OooOO0o != null) {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
                if (interfaceC32462OooO00o == null) {
                    throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                }
                abstractC22019Ooooooo = (AbstractC22019Ooooooo) interfaceC32462OooO00o.get();
            } else {
                if (interfaceC32462OooO00o != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (interfaceC32507OooOO0o == null) {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
                abstractC22019Ooooooo = (AbstractC22019Ooooooo) interfaceC32507OooOO0o.invoke(v);
            }
            Closeable closeable = new Closeable() { // from class: oO0OoOO0.OooO0OO
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    c33287OooO0o0.OooO00o();
                }
            };
            if (abstractC22019Ooooooo.f65679OooO0OO) {
                AbstractC22019Ooooooo.OooO0O0(closeable);
                return abstractC22019Ooooooo;
            }
            LinkedHashSet linkedHashSet = abstractC22019Ooooooo.f65678OooO0O0;
            if (linkedHashSet == null) {
                return abstractC22019Ooooooo;
            }
            synchronized (linkedHashSet) {
                abstractC22019Ooooooo.f65678OooO0O0.add(closeable);
            }
            return abstractC22019Ooooooo;
        }
    }

    /* JADX INFO: renamed from: oO0OoOO0.OooO0O0$OooO0OO */
    public interface OooO0OO {
        C32930OooO0O0 OooO0OO();

        C26272OooOo00 OooO0o();
    }

    /* JADX INFO: renamed from: oO0OoOO0.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC33284OooO0Oo {
        C32930OooO0O0 OooO00o();

        ImmutableMap OooO0O0();
    }

    public C33283OooO0O0(Map<Class<?>, Boolean> map, o00Oo0.OooO0O0 oooO0O0, C26272OooOo00 c26272OooOo00) {
        this.f120502OooO00o = map;
        this.f120503OooO0O0 = oooO0O0;
        this.f120504OooO0OO = new C20310OooO0O0(c26272OooOo00);
    }

    public static C33283OooO0O0 OooO0OO(OooOO0O oooOO0O, C22015OooooOo c22015OooooOo) {
        OooO0OO oooO0OO = (OooO0OO) C29024Oooo0o0.OooO00o(OooO0OO.class, oooOO0O);
        return new C33283OooO0O0(oooO0OO.OooO0OO(), c22015OooooOo, oooO0OO.OooO0o());
    }

    @Override // androidx.lifecycle.o00Oo0.OooO0O0
    public final <T extends AbstractC22019Ooooooo> T OooO00o(Class<T> cls) {
        if (this.f120502OooO00o.containsKey(cls)) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
        return (T) this.f120503OooO0O0.OooO00o(cls);
    }

    @Override // androidx.lifecycle.o00Oo0.OooO0O0
    public final AbstractC22019Ooooooo OooO0O0(Class cls, C24556OooO0O0 c24556OooO0O0) {
        return this.f120502OooO00o.containsKey(cls) ? this.f120504OooO0OO.OooO0O0(cls, c24556OooO0O0) : this.f120503OooO0O0.OooO0O0(cls, c24556OooO0O0);
    }
}
