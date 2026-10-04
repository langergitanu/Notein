package o000ooo0;

import OooOOO.OooO0O0;
import android.os.Bundle;
import androidx.lifecycle.C21977OooOOOo;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o000ooo0.C24750OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f83951OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Bundle f83952OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f83953OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C24750OooO00o.C19650OooO00o f83955OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO.OooO0O0<String, OooO0O0> f83950OooO00o = new OooOOO.OooO0O0<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f83954OooO0o = true;

    public interface OooO00o {
        void OooO00o(InterfaceC24753OooO0o0 interfaceC24753OooO0o0);
    }

    public interface OooO0O0 {
        Bundle OooO00o();
    }

    public final Bundle OooO00o(String key) {
        OooOOO0.OooO0oO(key, "key");
        if (!this.f83953OooO0Oo) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f83952OooO0OO;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.f83952OooO0OO;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f83952OooO0OO;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f83952OooO0OO = null;
        return bundle2;
    }

    public final OooO0O0 OooO0O0() {
        String str;
        OooO0O0 oooO0O0;
        Iterator<Map.Entry<String, OooO0O0>> it = this.f83950OooO00o.iterator();
        do {
            OooO0O0.OooO0o0 oooO0o0 = (OooO0O0.OooO0o0) it;
            if (!oooO0o0.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) oooO0o0.next();
            OooOOO0.OooO0o(components, "components");
            str = (String) components.getKey();
            oooO0O0 = (OooO0O0) components.getValue();
        } while (!OooOOO0.OooO0O0(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return oooO0O0;
    }

    public final void OooO0OO(String str, OooO0O0 provider) {
        OooO0O0 oooO0O0;
        OooOOO0.OooO0oO(provider, "provider");
        OooOOO.OooO0O0<String, OooO0O0> oooO0O02 = this.f83950OooO00o;
        OooO0O0.OooO0OO<String, OooO0O0> oooO0OOOooO0O0 = oooO0O02.OooO0O0(str);
        if (oooO0OOOooO0O0 != null) {
            oooO0O0 = oooO0OOOooO0O0.f58395OooOo;
        } else {
            OooO0O0.OooO0OO<K, V> oooO0OO = new OooO0O0.OooO0OO<>(str, provider);
            oooO0O02.f58393OooOoO++;
            OooO0O0.OooO0OO oooO0OO2 = oooO0O02.f58391OooOo;
            if (oooO0OO2 == null) {
                oooO0O02.f58392OooOo0o = oooO0OO;
                oooO0O02.f58391OooOo = oooO0OO;
            } else {
                oooO0OO2.f58398OooOoO0 = oooO0OO;
                oooO0OO.f58397OooOoO = oooO0OO2;
                oooO0O02.f58391OooOo = oooO0OO;
            }
            oooO0O0 = null;
        }
        if (oooO0O0 != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void OooO0Oo() {
        if (!this.f83954OooO0o) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C24750OooO00o.C19650OooO00o c19650OooO00o = this.f83955OooO0o0;
        if (c19650OooO00o == null) {
            c19650OooO00o = new C24750OooO00o.C19650OooO00o(this);
        }
        this.f83955OooO0o0 = c19650OooO00o;
        try {
            C21977OooOOOo.OooO00o.class.getDeclaredConstructor(new Class[0]);
            C24750OooO00o.C19650OooO00o c19650OooO00o2 = this.f83955OooO0o0;
            if (c19650OooO00o2 != null) {
                c19650OooO00o2.f83948OooO00o.add(C21977OooOOOo.OooO00o.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + C21977OooOOOo.OooO00o.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
