package o0O0oO0o;

import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import o0000oOO.C24340OooO0oo;
import o0000oo0.C24356OooO0O0;
import o0O0oOO0.C26113OooO00o;
import o0O0oOO0.C26115OooO0OO;
import oO00o.InterfaceC32321OooO0oo;
import oO00o0oo.C32394OooO00o;
import oO00oO00.InterfaceC32403OooO0OO;
import oO00oO0o.C32409OooO00o;
import oO00oO0o.C32410OooO0O0;
import oO00oO0o.C32411OooO0OO;
import oO00oO0o.C32412OooO0Oo;
import oO00oOO.C32416OooO0OO;
import oO00oOo.C32428OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0ooo.C33928OooO00o;
import oOo00O0O.C34467OooOo0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static C24356OooO0O0<AbstractC24338OooO0o0> f89107OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f89108OooO0o0 = C24340OooO0oo.OooO0o0("key_favorite_zoom_list");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oOO00OOO.OooO0OO f89109OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f89110OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O00o0.OooO0O0 f89111OooO0OO;

    public class OooO00o implements InterfaceC32321OooO0oo<AbstractC24338OooO0o0> {
        public OooO00o(C26113OooO00o c26113OooO00o) {
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void onError(Throwable th) {
            OooOOO.this.f89111OooO0OO.getClass();
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void onSuccess(AbstractC24338OooO0o0 abstractC24338OooO0o0) {
            OooOOO.this.f89111OooO0OO.getClass();
        }
    }

    public class OooO0O0 implements InterfaceC32321OooO0oo<AbstractC24338OooO0o0> {
        public OooO0O0(C26113OooO00o c26113OooO00o) {
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void OooO00o(InterfaceC32925OooO0O0 interfaceC32925OooO0O0) {
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void onError(Throwable th) {
            DefaultZoomHandle defaultZoomHandle = (DefaultZoomHandle) OooOOO.this.f89111OooO0OO.f84154OooO0O0;
            if (defaultZoomHandle.f69432OooOooo == null) {
                defaultZoomHandle.f69432OooOooo = defaultZoomHandle.OooO0Oo(defaultZoomHandle.f69426OooOoO.getString(R.string.favorite_zoom_success));
            }
            defaultZoomHandle.f69432OooOooo.show();
        }

        @Override // oO00o.InterfaceC32321OooO0oo
        public final void onSuccess(AbstractC24338OooO0o0 abstractC24338OooO0o0) {
            DefaultZoomHandle defaultZoomHandle = (DefaultZoomHandle) OooOOO.this.f89111OooO0OO.f84154OooO0O0;
            if (defaultZoomHandle.f69432OooOooo == null) {
                defaultZoomHandle.f69432OooOooo = defaultZoomHandle.OooO0Oo(defaultZoomHandle.f69426OooOoO.getString(R.string.favorite_zoom_success));
            }
            defaultZoomHandle.f69432OooOooo.show();
        }
    }

    public OooOOO(o00O00o0.OooO0O0 oooO0O0) {
        this.f89111OooO0OO = oooO0O0;
    }

    public final void OooO00o(final C26113OooO00o c26113OooO00o) {
        C32409OooO00o c32409OooO00oOooO00o = f89107OooO0Oo.OooO00o(new InterfaceC32403OooO0OO() { // from class: o0O0oO0o.OooO
            @Override // oO00oO00.InterfaceC32403OooO0OO
            public final Object apply(Object obj) {
                OooOOO oooOOO = this.f89086OooOo0o;
                final C26113OooO00o c26113OooO00o2 = c26113OooO00o;
                oooOOO.getClass();
                C24334OooO0O0 c24334OooO0O0OooO0Oo = ((AbstractC24338OooO0o0) obj).OooO0Oo();
                synchronized (oooOOO.f89110OooO0O0) {
                    try {
                        final ArrayList arrayList = new ArrayList(oooOOO.f89110OooO0O0);
                        if (!IntStream.range(0, arrayList.size()).filter(new IntPredicate() { // from class: o0O0oO0o.OooOO0O
                            @Override // java.util.function.IntPredicate
                            public final boolean test(int i) {
                                return Math.abs(c26113OooO00o2.f89152OooO0O0 - ((C26113OooO00o) arrayList.get(i)).f89152OooO0O0) < 0.001f;
                            }
                        }).findFirst().isPresent()) {
                            arrayList.add(0, c26113OooO00o2);
                            if (arrayList.size() > 12.0f) {
                                arrayList.remove(arrayList.size() - 1);
                            }
                            C26113OooO00o.OooO0O0 oooO0O0 = C26113OooO00o.Companion;
                            oooO0O0.getClass();
                            c24334OooO0O0OooO0Oo.OooO0oO(OooOOO.f89108OooO0o0, C34467OooOo0.OooO00o(new C26115OooO0OO()).OooO00o(C33928OooO00o.OooO00o(oooO0O0.serializer()), arrayList));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new C32410OooO0O0(c24334OooO0O0OooO0Oo);
            }
        });
        C32416OooO0OO c32416OooO0OO = C32428OooO00o.f116617OooO00o;
        Objects.requireNonNull(c32416OooO0OO, "scheduler is null");
        new C32411OooO0OO(new C32412OooO0Oo(c32409OooO00oOooO00o, c32416OooO0OO), C32394OooO00o.OooO00o()).OooO00o(new OooO0O0(c26113OooO00o));
    }

    public final ArrayList OooO0O0() {
        ArrayList arrayList;
        synchronized (this.f89110OooO0O0) {
            try {
                arrayList = new ArrayList();
                for (C26113OooO00o c26113OooO00o : this.f89110OooO0O0) {
                    arrayList.add(new C26113OooO00o(c26113OooO00o.f89151OooO00o, c26113OooO00o.f89152OooO0O0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final boolean OooO0OO(final float f) {
        boolean zAnyMatch;
        synchronized (this.f89110OooO0O0) {
            zAnyMatch = this.f89110OooO0O0.stream().anyMatch(new Predicate() { // from class: o0O0oO0o.OooO0oo
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Math.abs(((C26113OooO00o) obj).f89152OooO0O0 - f) < 0.001f;
                }
            });
        }
        return zAnyMatch;
    }

    public final void OooO0Oo(final C26113OooO00o c26113OooO00o) {
        C32409OooO00o c32409OooO00oOooO00o = f89107OooO0Oo.OooO00o(new InterfaceC32403OooO0OO() { // from class: o0O0oO0o.OooOO0
            @Override // oO00oO00.InterfaceC32403OooO0OO
            public final Object apply(Object obj) {
                OooOOO oooOOO = this.f89102OooOo0o;
                final C26113OooO00o c26113OooO00o2 = c26113OooO00o;
                oooOOO.getClass();
                C24334OooO0O0 c24334OooO0O0OooO0Oo = ((AbstractC24338OooO0o0) obj).OooO0Oo();
                synchronized (oooOOO.f89110OooO0O0) {
                    try {
                        final ArrayList arrayList = new ArrayList(oooOOO.f89110OooO0O0);
                        OptionalInt optionalIntFindFirst = IntStream.range(0, arrayList.size()).filter(new IntPredicate() { // from class: o0O0oO0o.OooOO0o
                            @Override // java.util.function.IntPredicate
                            public final boolean test(int i) {
                                return Math.abs(c26113OooO00o2.f89152OooO0O0 - ((C26113OooO00o) arrayList.get(i)).f89152OooO0O0) < 0.001f;
                            }
                        }).findFirst();
                        if (optionalIntFindFirst.isPresent()) {
                            arrayList.remove(optionalIntFindFirst.getAsInt());
                            C26113OooO00o.OooO0O0 oooO0O0 = C26113OooO00o.Companion;
                            oooO0O0.getClass();
                            c24334OooO0O0OooO0Oo.OooO0oO(OooOOO.f89108OooO0o0, C34467OooOo0.OooO00o(new C26115OooO0OO()).OooO00o(C33928OooO00o.OooO00o(oooO0O0.serializer()), arrayList));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new C32410OooO0O0(c24334OooO0O0OooO0Oo);
            }
        });
        C32416OooO0OO c32416OooO0OO = C32428OooO00o.f116617OooO00o;
        Objects.requireNonNull(c32416OooO0OO, "scheduler is null");
        new C32411OooO0OO(new C32412OooO0Oo(c32409OooO00oOooO00o, c32416OooO0OO), C32394OooO00o.OooO00o()).OooO00o(new OooO00o(c26113OooO00o));
    }
}
