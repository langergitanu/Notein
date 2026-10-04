package o000ooo0;

import OooOoo.C20593OooO0Oo;
import android.os.Bundle;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.OooOOO0;
import o000ooo0.OooO0OO;

/* JADX INFO: renamed from: o000ooo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24750OooO00o implements InterfaceC21986OooOoOO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC24753OooO0o0 f83947OooOo0o;

    /* JADX INFO: renamed from: o000ooo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19650OooO00o implements OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final LinkedHashSet f83948OooO00o;

        public C19650OooO00o(OooO0OO registry) {
            OooOOO0.OooO0oO(registry, "registry");
            this.f83948OooO00o = new LinkedHashSet();
            registry.OooO0OO("androidx.savedstate.Restarter", this);
        }

        @Override // o000ooo0.OooO0OO.OooO0O0
        public final Bundle OooO00o() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f83948OooO00o));
            return bundle;
        }
    }

    public C24750OooO00o(InterfaceC24753OooO0o0 interfaceC24753OooO0o0) {
        this.f83947OooOo0o = interfaceC24753OooO0o0;
    }

    @Override // androidx.lifecycle.InterfaceC21986OooOoOO
    public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        if (oooO00o != AbstractC21979OooOOo0.OooO00o.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC21987OooOoo.getLifecycle().OooO0OO(this);
        InterfaceC24753OooO0o0 interfaceC24753OooO0o0 = this.f83947OooOo0o;
        Bundle bundleOooO00o = interfaceC24753OooO0o0.getSavedStateRegistry().OooO00o("androidx.savedstate.Restarter");
        if (bundleOooO00o == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleOooO00o.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, C24750OooO00o.class.getClassLoader()).asSubclass(OooO0OO.OooO00o.class);
                OooOOO0.OooO0o(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        OooOOO0.OooO0o(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((OooO0OO.OooO00o) objNewInstance).OooO00o(interfaceC24753OooO0o0);
                    } catch (Exception e) {
                        throw new RuntimeException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(C20593OooO0Oo.OooO0O0("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
