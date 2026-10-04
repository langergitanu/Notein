package o000o0O0;

import OooOoOO.C20519OooO0Oo;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.C21990OooOooo;
import androidx.lifecycle.C22008OoooOo0;
import androidx.lifecycle.C22011Ooooo00;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00O0O;
import androidx.lifecycle.o00Oo0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import o000o00.AbstractC24555OooO00o;
import o000o00.C24556OooO0O0;
import o000ooo0.C24752OooO0Oo;
import o000ooo0.InterfaceC24753OooO0o0;
import oO00ooO.C32447OooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements InterfaceC21987OooOoo, InterfaceC22023o00ooo, androidx.lifecycle.OooOOOO, InterfaceC24753OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C24583OooOo0o f83189OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f83190OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public AbstractC21979OooOOo0.OooO0O0 f83191OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Bundle f83192OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Oooo000 f83193OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Bundle f83194OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final String f83195OooOoo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f83199Oooo000;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C21990OooOooo f83196OooOooO = new C21990OooOooo(this);

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C24752OooO0Oo f83197OooOooo = new C24752OooO0Oo(this);

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C32447OooOOo f83200Oooo00O = C20519OooO0Oo.OooO0OO(new C24570OooO0Oo());

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C32447OooOOo f83201Oooo00o = C20519OooO0Oo.OooO0OO(new C24571OooO0o0());

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public AbstractC21979OooOOo0.OooO0O0 f83198Oooo0 = AbstractC21979OooOOo0.OooO0O0.f65537OooOo;

    public static final class OooO00o {
        public static OooOO0 OooO00o(Context context, C24583OooOo0o destination, Bundle bundle, AbstractC21979OooOOo0.OooO0O0 hostLifecycleState, Oooo000 oooo000) {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "randomUUID().toString()");
            kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
            kotlin.jvm.internal.OooOOO0.OooO0oO(hostLifecycleState, "hostLifecycleState");
            return new OooOO0(context, destination, bundle, hostLifecycleState, oooo000, string, null);
        }
    }

    public static final class OooO0O0 extends androidx.lifecycle.OooO00o {
    }

    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m80612d2 = {"Lo000o0O0/OooOO0$OooO0OO;", "Landroidx/lifecycle/Ooooooo;", "Landroidx/lifecycle/OoooOo0;", "handle", "<init>", "(Landroidx/lifecycle/OoooOo0;)V", "navigation-common_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class OooO0OO extends AbstractC22019Ooooooo {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C22008OoooOo0 f83202OooO0Oo;

        public OooO0OO(C22008OoooOo0 handle) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(handle, "handle");
            this.f83202OooO0Oo = handle;
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOO0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C24570OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22015OooooOo> {
        public C24570OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22015OooooOo invoke() {
            OooOO0 oooOO02 = OooOO0.this;
            Context context = oooOO02.f83190OooOo0o;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            return new C22015OooooOo(applicationContext instanceof Application ? (Application) applicationContext : null, oooOO02, oooOO02.f83192OooOoO0);
        }
    }

    /* JADX INFO: renamed from: o000o0O0.OooOO0$OooO0o0, reason: case insensitive filesystem */
    public static final class C24571OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22008OoooOo0> {
        public C24571OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22008OoooOo0 invoke() {
            OooOO0 oooOO02 = OooOO0.this;
            if (!oooOO02.f83199Oooo000) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (oooOO02.f83196OooOooO.f65563OooO0Oo == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            oooO0O0.f65504OooO00o = oooOO02.f83197OooOooo.f83957OooO0O0;
            oooO0O0.f65505OooO0O0 = oooOO02.f83196OooOooO;
            return ((OooO0OO) new o00Oo0(oooOO02, oooO0O0).OooO00o(OooO0OO.class)).f83202OooO0Oo;
        }
    }

    public OooOO0(Context context, C24583OooOo0o c24583OooOo0o, Bundle bundle, AbstractC21979OooOOo0.OooO0O0 oooO0O0, Oooo000 oooo000, String str, Bundle bundle2) {
        this.f83190OooOo0o = context;
        this.f83189OooOo = c24583OooOo0o;
        this.f83192OooOoO0 = bundle;
        this.f83191OooOoO = oooO0O0;
        this.f83193OooOoOO = oooo000;
        this.f83195OooOoo0 = str;
        this.f83194OooOoo = bundle2;
    }

    public final void OooO00o(AbstractC21979OooOOo0.OooO0O0 maxState) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(maxState, "maxState");
        this.f83198Oooo0 = maxState;
        OooO0O0();
    }

    public final void OooO0O0() {
        if (!this.f83199Oooo000) {
            C24752OooO0Oo c24752OooO0Oo = this.f83197OooOooo;
            c24752OooO0Oo.OooO00o();
            this.f83199Oooo000 = true;
            if (this.f83193OooOoOO != null) {
                C22011Ooooo00.OooO0O0(this);
            }
            c24752OooO0Oo.OooO0O0(this.f83194OooOoo);
        }
        int iOrdinal = this.f83191OooOoO.ordinal();
        int iOrdinal2 = this.f83198Oooo0.ordinal();
        C21990OooOooo c21990OooOooo = this.f83196OooOooO;
        if (iOrdinal < iOrdinal2) {
            c21990OooOooo.OooO0oo(this.f83191OooOoO);
        } else {
            c21990OooOooo.OooO0oo(this.f83198Oooo0);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof OooOO0)) {
            OooOO0 oooOO02 = (OooOO0) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83195OooOoo0, oooOO02.f83195OooOoo0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83189OooOo, oooOO02.f83189OooOo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83196OooOooO, oooOO02.f83196OooOooO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83197OooOooo.f83957OooO0O0, oooOO02.f83197OooOooo.f83957OooO0O0)) {
                Bundle bundle = this.f83192OooOoO0;
                Bundle bundle2 = oooOO02.f83192OooOoO0;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.OooOOOO
    public final AbstractC24555OooO00o getDefaultViewModelCreationExtras() {
        C24556OooO0O0 c24556OooO0O0 = new C24556OooO0O0(0);
        Context applicationContext = this.f83190OooOo0o.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = c24556OooO0O0.f83135OooO00o;
        if (application != null) {
            linkedHashMap.put(o00O0O.f65682OooO00o, application);
        }
        linkedHashMap.put(C22011Ooooo00.f65654OooO00o, this);
        linkedHashMap.put(C22011Ooooo00.f65655OooO0O0, this);
        Bundle bundle = this.f83192OooOoO0;
        if (bundle != null) {
            linkedHashMap.put(C22011Ooooo00.f65656OooO0OO, bundle);
        }
        return c24556OooO0O0;
    }

    @Override // androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return (C22015OooooOo) this.f83200Oooo00O.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC21987OooOoo
    public final AbstractC21979OooOOo0 getLifecycle() {
        return this.f83196OooOooO;
    }

    @Override // o000ooo0.InterfaceC24753OooO0o0
    public final o000ooo0.OooO0OO getSavedStateRegistry() {
        return this.f83197OooOooo.f83957OooO0O0;
    }

    @Override // androidx.lifecycle.InterfaceC22023o00ooo
    public final C22021o00o0O getViewModelStore() {
        if (!this.f83199Oooo000) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f83196OooOooO.f65563OooO0Oo == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        Oooo000 oooo000 = this.f83193OooOoOO;
        if (oooo000 != null) {
            return oooo000.OooO00o(this.f83195OooOoo0);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f83189OooOo.hashCode() + (this.f83195OooOoo0.hashCode() * 31);
        Bundle bundle = this.f83192OooOoO0;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f83197OooOooo.f83957OooO0O0.hashCode() + ((this.f83196OooOooO.hashCode() + (iHashCode * 31)) * 31);
    }
}
